package e1;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import androidx.emoji2.text.r;
import java.io.Closeable;

/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f1230i = new String[0];

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1231g;
    public final SQLiteClosable h;

    public /* synthetic */ b(SQLiteClosable sQLiteClosable, int i5) {
        this.f1231g = i5;
        this.h = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.h).beginTransaction();
    }

    public void b(int i5, byte[] bArr) {
        ((SQLiteProgram) this.h).bindBlob(i5, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1231g) {
            case 0:
                ((SQLiteDatabase) this.h).close();
                break;
            default:
                ((SQLiteProgram) this.h).close();
                break;
        }
    }

    public void d(int i5, long j2) {
        ((SQLiteProgram) this.h).bindLong(i5, j2);
    }

    public void e(int i5) {
        ((SQLiteProgram) this.h).bindNull(i5);
    }

    public void f(int i5, String str) {
        ((SQLiteProgram) this.h).bindString(i5, str);
    }

    public void g() {
        ((SQLiteDatabase) this.h).endTransaction();
    }

    public void h(String str) {
        ((SQLiteDatabase) this.h).execSQL(str);
    }

    public Cursor i(d1.d dVar) {
        return ((SQLiteDatabase) this.h).rawQueryWithFactory(new a(dVar), dVar.a(), f1230i, null);
    }

    public Cursor j(String str) {
        return i(new r(str, 1));
    }

    public void k() {
        ((SQLiteDatabase) this.h).setTransactionSuccessful();
    }
}
