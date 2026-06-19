package u1;

import android.content.Context;
import androidx.emoji2.text.u;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.j f3522g;
    public final /* synthetic */ UUID h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.work.h f3523i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f3524j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f3525k;

    public n(o oVar, v1.j jVar, UUID uuid, androidx.work.h hVar, Context context) {
        this.f3525k = oVar;
        this.f3522g = jVar;
        this.h = uuid;
        this.f3523i = hVar;
        this.f3524j = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f3522g.f3576g instanceof v1.a)) {
                String uuid = this.h.toString();
                int e4 = this.f3525k.f3528c.e(uuid);
                if (e4 == 0 || u.a(e4)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((l1.b) this.f3525k.f3527b).f(uuid, this.f3523i);
                this.f3524j.startService(s1.b.a(this.f3524j, uuid, this.f3523i));
            }
            this.f3522g.h(null);
        } catch (Throwable th) {
            this.f3522g.i(th);
        }
    }
}
