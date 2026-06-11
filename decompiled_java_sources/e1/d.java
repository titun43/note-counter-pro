package e1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.emoji2.text.p;
import androidx.emoji2.text.r;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import g.m0;
import java.util.List;
import k1.j;

/* loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public final b[] f1234g;
    public final p h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1235i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, p pVar) {
        super(context, str, null, 12, new c(pVar, bVarArr));
        pVar.getClass();
        this.h = pVar;
        this.f1234g = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.h) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    public final synchronized b b() {
        this.f1235i = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f1235i) {
            return a(this.f1234g, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f1234g[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f1234g, sQLiteDatabase);
        this.h.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z4;
        List list;
        b a5 = a(this.f1234g, sQLiteDatabase);
        p pVar = this.h;
        j jVar = (j) pVar.f274i;
        Cursor j2 = a5.j("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (j2.moveToFirst()) {
                if (j2.getInt(0) == 0) {
                    z4 = true;
                    j2.close();
                    j.t(a5);
                    if (!z4) {
                        m0 A = j.A(a5);
                        if (!A.f1592g) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) A.h));
                        }
                    }
                    pVar.F(a5);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.h;
                    int i5 = WorkDatabase_Impl.f643s;
                    list = workDatabase_Impl.f3928g;
                    if (list == null) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((l1.f) workDatabase_Impl.f3928g.get(i6)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z4 = false;
            j2.close();
            j.t(a5);
            if (!z4) {
            }
            pVar.F(a5);
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) jVar.h;
            int i52 = WorkDatabase_Impl.f643s;
            list = workDatabase_Impl2.f3928g;
            if (list == null) {
            }
        } catch (Throwable th) {
            j2.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.f1235i = true;
        this.h.D(a(this.f1234g, sQLiteDatabase), i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0067  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z4;
        z0.e eVar;
        if (this.f1235i) {
            return;
        }
        p pVar = this.h;
        b a5 = a(this.f1234g, sQLiteDatabase);
        Object obj = pVar.f274i;
        Cursor j2 = a5.j("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (j2.moveToFirst()) {
                if (j2.getInt(0) != 0) {
                    z4 = true;
                    j2.close();
                    if (z4) {
                        m0 A = j.A(a5);
                        if (!A.f1592g) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) A.h));
                        }
                        pVar.F(a5);
                    } else {
                        Cursor i5 = a5.i(new r("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 1));
                        try {
                            String string = i5.moveToFirst() ? i5.getString(0) : null;
                            i5.close();
                            if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                            }
                        } catch (Throwable th) {
                            i5.close();
                            throw th;
                        }
                    }
                    j jVar = (j) pVar.f274i;
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.h;
                    int i6 = WorkDatabase_Impl.f643s;
                    workDatabase_Impl.f3922a = a5;
                    a5.h("PRAGMA foreign_keys = ON");
                    eVar = ((WorkDatabase_Impl) jVar.h).f3925d;
                    synchronized (eVar) {
                        try {
                            if (eVar.f3906e) {
                                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                            } else {
                                a5.h("PRAGMA temp_store = MEMORY;");
                                a5.h("PRAGMA recursive_triggers='ON';");
                                a5.h("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                eVar.c(a5);
                                eVar.f3907f = new f(((SQLiteDatabase) a5.h).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                                eVar.f3906e = true;
                            }
                        } finally {
                        }
                    }
                    List list = ((WorkDatabase_Impl) jVar.h).f3928g;
                    if (list != null) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((l1.f) ((WorkDatabase_Impl) jVar.h).f3928g.get(i7)).getClass();
                            a5.a();
                            try {
                                int i8 = WorkDatabase.f642k;
                                a5.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f641j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                a5.k();
                                a5.g();
                            } catch (Throwable th2) {
                                a5.g();
                                throw th2;
                            }
                        }
                    }
                    pVar.h = null;
                    return;
                }
            }
            z4 = false;
            j2.close();
            if (z4) {
            }
            j jVar2 = (j) pVar.f274i;
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) jVar2.h;
            int i62 = WorkDatabase_Impl.f643s;
            workDatabase_Impl2.f3922a = a5;
            a5.h("PRAGMA foreign_keys = ON");
            eVar = ((WorkDatabase_Impl) jVar2.h).f3925d;
            synchronized (eVar) {
            }
        } catch (Throwable th3) {
            j2.close();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.f1235i = true;
        this.h.D(a(this.f1234g, sQLiteDatabase), i5, i6);
    }
}
