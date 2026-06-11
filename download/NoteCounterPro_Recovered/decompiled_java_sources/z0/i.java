package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public volatile e1.b f3922a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f3923b;

    /* renamed from: c, reason: collision with root package name */
    public d1.c f3924c;

    /* renamed from: d, reason: collision with root package name */
    public final e f3925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3927f;

    /* renamed from: g, reason: collision with root package name */
    public List f3928g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f3929i = new ThreadLocal();

    public i() {
        new ConcurrentHashMap();
        this.f3925d = d();
    }

    public final void a() {
        if (!this.f3926e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.f3924c.c().h).inTransaction() && this.f3929i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        e1.b c5 = this.f3924c.c();
        this.f3925d.c(c5);
        c5.a();
    }

    public abstract e d();

    public abstract d1.c e(a aVar);

    public final void f() {
        this.f3924c.c().g();
        if (((SQLiteDatabase) this.f3924c.c().h).inTransaction()) {
            return;
        }
        e eVar = this.f3925d;
        if (eVar.f3905d.compareAndSet(false, true)) {
            eVar.f3904c.f3923b.execute(eVar.f3909i);
        }
    }

    public final Cursor g(d1.d dVar) {
        a();
        b();
        return this.f3924c.c().i(dVar);
    }

    public final void h() {
        this.f3924c.c().k();
    }
}
