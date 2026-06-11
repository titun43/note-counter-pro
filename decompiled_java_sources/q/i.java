package q;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f3068a;

    /* renamed from: b, reason: collision with root package name */
    public l f3069b;

    /* renamed from: c, reason: collision with root package name */
    public m f3070c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3071d;

    public final void a(Object obj) {
        this.f3071d = true;
        l lVar = this.f3069b;
        if (lVar != null) {
            k kVar = lVar.h;
            kVar.getClass();
            if (obj == null) {
                obj = h.f3065m;
            }
            if (h.f3064l.c(kVar, null, obj)) {
                h.b(kVar);
                this.f3068a = null;
                this.f3069b = null;
                this.f3070c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.f3071d = true;
        l lVar = this.f3069b;
        if (lVar == null || !lVar.h.h(th)) {
            return;
        }
        this.f3068a = null;
        this.f3069b = null;
        this.f3070c = null;
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f3069b;
        if (lVar != null) {
            k kVar = lVar.h;
            if (!kVar.isDone()) {
                kVar.h(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f3068a, 1));
            }
        }
        if (this.f3071d || (mVar = this.f3070c) == null) {
            return;
        }
        mVar.i(null);
    }
}
