package k0;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class c0 extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public d0 f2327g;
    public File h;

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f2328i;

    /* renamed from: j, reason: collision with root package name */
    public FileOutputStream f2329j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2330k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f2331l;

    /* renamed from: m, reason: collision with root package name */
    public int f2332m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, y3.c cVar) {
        super(cVar);
        this.f2331l = d0Var;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f2330k = obj;
        this.f2332m |= Integer.MIN_VALUE;
        return this.f2331l.j(null, this);
    }
}
