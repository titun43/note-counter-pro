package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class m extends z2.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2.b f271c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f272d;

    public m(z2.b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f271c = bVar;
        this.f272d = threadPoolExecutor;
    }

    @Override // z2.b
    public final void s(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f272d;
        try {
            this.f271c.s(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // z2.b
    public final void t(r1.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f272d;
        try {
            this.f271c.t(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
