package z0;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.emoji2.text.u;
import androidx.fragment.app.o;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f3901j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f3903b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f3904c;

    /* renamed from: f, reason: collision with root package name */
    public volatile e1.f f3907f;

    /* renamed from: g, reason: collision with root package name */
    public final c f3908g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3905d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f3906e = false;
    public final m.f h = new m.f();

    /* renamed from: i, reason: collision with root package name */
    public final o f3909i = new o(this, 19);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3902a = new HashMap();

    public e(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f3904c = workDatabase_Impl;
        this.f3908g = new c(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f3903b = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr[i5];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3902a.put(lowerCase, Integer.valueOf(i5));
            String str2 = (String) hashMap.get(strArr[i5]);
            if (str2 != null) {
                this.f3903b[i5] = str2.toLowerCase(locale);
            } else {
                this.f3903b[i5] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f3902a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f3902a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        e1.b bVar = this.f3904c.f3922a;
        if (bVar == null || !((SQLiteDatabase) bVar.h).isOpen()) {
            return false;
        }
        if (!this.f3906e) {
            this.f3904c.f3924c.c();
        }
        if (this.f3906e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(e1.b bVar, int i5) {
        bVar.h(u.i(i5, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f3903b[i5];
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < 3; i6++) {
            String str2 = f3901j[i6];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            s.c.e(sb, str, "_", str2, "`");
            s.c.e(sb, " AFTER ", str2, " ON `", str);
            s.c.e(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            s.c.e(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i5);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.h(sb.toString());
        }
    }

    public final void c(e1.b bVar) {
        if (((SQLiteDatabase) bVar.h).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f3904c.h.readLock();
                readLock.lock();
                try {
                    int[] a5 = this.f3908g.a();
                    if (a5 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a5.length;
                    bVar.a();
                    for (int i5 = 0; i5 < length; i5++) {
                        try {
                            int i6 = a5[i5];
                            if (i6 == 1) {
                                b(bVar, i5);
                            } else if (i6 == 2) {
                                String str = this.f3903b[i5];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f3901j;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    String str2 = strArr[i7];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.h(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.g();
                            throw th;
                        }
                    }
                    bVar.k();
                    bVar.g();
                    c cVar = this.f3908g;
                    synchronized (cVar) {
                        cVar.f3900e = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                return;
            }
        }
    }
}
