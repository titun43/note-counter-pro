package k2;

import androidx.emoji2.text.t;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c implements h2.b {

    /* renamed from: g, reason: collision with root package name */
    public final s3.a f2435g;
    public final s3.a h;

    /* renamed from: i, reason: collision with root package name */
    public final t f2436i;

    /* renamed from: j, reason: collision with root package name */
    public final s3.a f2437j;

    /* renamed from: k, reason: collision with root package name */
    public final s3.a f2438k;

    public c(s3.a aVar, s3.a aVar2, t tVar, s3.a aVar3, s3.a aVar4) {
        this.f2435g = aVar;
        this.h = aVar2;
        this.f2436i = tVar;
        this.f2437j = aVar3;
        this.f2438k = aVar4;
    }

    @Override // s3.a
    public final Object get() {
        return new b((Executor) this.f2435g.get(), (g2.d) this.h.get(), (t) this.f2436i.get(), (m2.d) this.f2437j.get(), (n2.c) this.f2438k.get());
    }
}
