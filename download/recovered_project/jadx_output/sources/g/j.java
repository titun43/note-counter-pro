package g;

import com.getcapacitor.BridgeActivity;

/* loaded from: classes.dex */
public final class j implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BridgeActivity f1588a;

    public j(BridgeActivity bridgeActivity) {
        this.f1588a = bridgeActivity;
    }

    @Override // c.b
    public final void a(androidx.activity.s sVar) {
        BridgeActivity bridgeActivity = this.f1588a;
        r delegate = bridgeActivity.getDelegate();
        delegate.b();
        bridgeActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.e();
    }
}
