package o4;

/* loaded from: classes.dex */
public class z extends a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2854j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(w3.h hVar, boolean z4, int i5) {
        super(hVar, z4);
        this.f2854j = i5;
    }

    @Override // o4.z0
    public boolean B(Throwable th) {
        switch (this.f2854j) {
            case 1:
                w.g(th, this.f2785i);
                return true;
            default:
                return super.B(th);
        }
    }
}
