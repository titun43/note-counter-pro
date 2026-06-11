package m2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements d, n2.c, c {

    /* renamed from: l, reason: collision with root package name */
    public static final c2.b f2576l = new c2.b("proto");

    /* renamed from: g, reason: collision with root package name */
    public final j f2577g;
    public final t2.i h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.i f2578i;

    /* renamed from: j, reason: collision with root package name */
    public final a f2579j;

    /* renamed from: k, reason: collision with root package name */
    public final s3.a f2580k;

    public h(t2.i iVar, t2.i iVar2, a aVar, j jVar, s3.a aVar2) {
        this.f2577g = jVar;
        this.h = iVar;
        this.f2578i = iVar2;
        this.f2579j = aVar;
        this.f2580k = aVar2;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, f2.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f1471a, String.valueOf(p2.a.a(jVar.f1473c))));
        byte[] bArr = jVar.f1472b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f2570a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f2577g;
        Objects.requireNonNull(jVar);
        t2.i iVar = this.f2578i;
        long s5 = iVar.s();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (iVar.s() >= this.f2579j.f2567c + s5) {
                    throw new n2.a("Timed out while trying to open db.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2577g.close();
    }

    public final Object d(f fVar) {
        SQLiteDatabase a5 = a();
        a5.beginTransaction();
        try {
            Object apply = fVar.apply(a5);
            a5.setTransactionSuccessful();
            return apply;
        } finally {
            a5.endTransaction();
        }
    }

    public final ArrayList e(SQLiteDatabase sQLiteDatabase, f2.j jVar, int i5) {
        ArrayList arrayList = new ArrayList();
        Long b2 = b(sQLiteDatabase, jVar);
        if (b2 == null) {
            return arrayList;
        }
        i(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b2.toString()}, null, null, null, String.valueOf(i5)), new k2.a(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }

    public final void f(long j2, i2.c cVar, String str) {
        d(new l2.i(str, cVar, j2));
    }

    public final Object g(n2.b bVar) {
        SQLiteDatabase a5 = a();
        t2.i iVar = this.f2578i;
        long s5 = iVar.s();
        while (true) {
            try {
                a5.beginTransaction();
                try {
                    Object a6 = bVar.a();
                    a5.setTransactionSuccessful();
                    return a6;
                } finally {
                    a5.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (iVar.s() >= this.f2579j.f2567c + s5) {
                    throw new n2.a("Timed out while trying to acquire the lock.", e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
