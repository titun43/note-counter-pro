package e1;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: j, reason: collision with root package name */
    public final SQLiteStatement f1242j;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f1242j = sQLiteStatement;
    }

    public final void l() {
        this.f1242j.executeUpdateDelete();
    }
}
