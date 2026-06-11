package z0;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3938a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final i f3939b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e1.f f3940c;

    public l(i iVar) {
        this.f3939b = iVar;
    }

    public final e1.f a() {
        this.f3939b.a();
        if (!this.f3938a.compareAndSet(false, true)) {
            String b2 = b();
            i iVar = this.f3939b;
            iVar.a();
            iVar.b();
            return new e1.f(((SQLiteDatabase) iVar.f3924c.c().h).compileStatement(b2));
        }
        if (this.f3940c == null) {
            String b5 = b();
            i iVar2 = this.f3939b;
            iVar2.a();
            iVar2.b();
            this.f3940c = new e1.f(((SQLiteDatabase) iVar2.f3924c.c().h).compileStatement(b5));
        }
        return this.f3940c;
    }

    public abstract String b();

    public final void c(e1.f fVar) {
        if (fVar == this.f3940c) {
            this.f3938a.set(false);
        }
    }
}
