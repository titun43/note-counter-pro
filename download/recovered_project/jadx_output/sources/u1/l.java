package u1;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3514g;
    public final /* synthetic */ v1.j h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f3515i;

    public /* synthetic */ l(m mVar, v1.j jVar, int i5) {
        this.f3514g = i5;
        this.f3515i = mVar;
        this.h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3514g) {
            case 0:
                this.h.j(this.f3515i.f3519j.getForegroundInfoAsync());
                return;
            default:
                m mVar = this.f3515i;
                v1.j jVar = mVar.f3517g;
                ListenableWorker listenableWorker = mVar.f3519j;
                t1.i iVar = mVar.f3518i;
                try {
                    androidx.work.h hVar = (androidx.work.h) this.h.get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.f3342c + ") but did not provide ForegroundInfo");
                    }
                    androidx.work.n.e().b(m.f3516m, "Updating notification for " + iVar.f3342c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    o oVar = mVar.f3520k;
                    Context context = mVar.h;
                    UUID id = listenableWorker.getId();
                    oVar.getClass();
                    v1.j jVar2 = new v1.j();
                    ((androidx.emoji2.text.t) oVar.f3526a).i(new n(oVar, jVar2, id, hVar, context));
                    jVar.j(jVar2);
                    return;
                } catch (Throwable th) {
                    jVar.i(th);
                    return;
                }
        }
    }
}
