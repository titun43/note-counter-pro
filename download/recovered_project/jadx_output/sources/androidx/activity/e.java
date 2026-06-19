package androidx.activity;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38g;
    public final /* synthetic */ s h;

    public /* synthetic */ e(s sVar, int i5) {
        this.f38g = i5;
        this.h = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38g) {
            case 0:
                this.h.invalidateMenu();
                break;
            default:
                s.b(this.h);
                break;
        }
    }
}
