package p3;

import android.net.Uri;

/* loaded from: classes.dex */
public final class h extends y3.g implements f4.q {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Throwable f3003g;
    public final /* synthetic */ k1.j h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f3004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k1.j jVar, Uri uri, w3.c cVar) {
        super(3, cVar);
        this.h = jVar;
        this.f3004i = uri;
    }

    @Override // f4.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = new h(this.h, this.f3004i, (w3.c) obj3);
        hVar.f3003g = (Throwable) obj2;
        hVar.invokeSuspend(t3.h.f3400a);
        throw null;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        b3.g.x(obj);
        Throwable th = this.f3003g;
        this.h.getClass();
        throw k1.j.z(th, this.f3004i);
    }
}
