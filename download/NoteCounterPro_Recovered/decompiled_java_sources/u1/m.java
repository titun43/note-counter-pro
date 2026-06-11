package u1;

import android.content.Context;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final String f3516m = androidx.work.n.g("WorkForegroundRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final v1.j f3517g = new v1.j();
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final t1.i f3518i;

    /* renamed from: j, reason: collision with root package name */
    public final ListenableWorker f3519j;

    /* renamed from: k, reason: collision with root package name */
    public final o f3520k;

    /* renamed from: l, reason: collision with root package name */
    public final w1.a f3521l;

    public m(Context context, t1.i iVar, ListenableWorker listenableWorker, o oVar, androidx.emoji2.text.t tVar) {
        this.h = context;
        this.f3518i = iVar;
        this.f3519j = listenableWorker;
        this.f3520k = oVar;
        this.f3521l = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f3518i.f3355q || b0.b.b()) {
            this.f3517g.h(null);
            return;
        }
        v1.j jVar = new v1.j();
        androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f3521l;
        ((f2.q) tVar.f285j).execute(new l(this, jVar, 0));
        jVar.addListener(new l(this, jVar, 1), (f2.q) tVar.f285j);
    }
}
