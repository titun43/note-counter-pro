package e1;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.emoji2.text.p;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b[] f1233b;

    public c(p pVar, b[] bVarArr) {
        this.f1232a = pVar;
        this.f1233b = bVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        b a5 = d.a(this.f1233b, sQLiteDatabase);
        this.f1232a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) a5.h).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) a5.h;
        if (!sQLiteDatabase2.isOpen()) {
            p.i(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                a5.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    p.i((String) it.next().second);
                }
            } else {
                p.i(sQLiteDatabase2.getPath());
            }
        }
    }
}
