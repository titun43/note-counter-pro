package q;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f3072n;

    public k(l lVar) {
        this.f3072n = lVar;
    }

    @Override // q.h
    public final String f() {
        i iVar = (i) this.f3072n.f3073g.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f3068a + "]";
    }
}
