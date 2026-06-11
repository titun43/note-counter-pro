package r4;

/* loaded from: classes.dex */
public final class i extends y3.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3234g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.p f3235i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.p f3236j;

    /* renamed from: k, reason: collision with root package name */
    public c f3237k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.emoji2.text.p pVar, y3.c cVar) {
        super(cVar);
        this.f3235i = pVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.f3234g = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f3235i.j(null, this);
    }
}
