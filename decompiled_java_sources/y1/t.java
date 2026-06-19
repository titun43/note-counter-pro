package y1;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class t implements zzej {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f3869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f3871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3872d;

    public t(w wVar, int i5, Consumer consumer, Runnable runnable) {
        this.f3872d = i5;
        this.f3869a = consumer;
        this.f3870b = runnable;
        this.f3871c = wVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final void zza(Throwable th) {
        boolean z4 = th instanceof TimeoutException;
        w wVar = this.f3871c;
        if (z4) {
            wVar.A(114, 28, b0.f3826q);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            wVar.A(107, 28, b0.f3826q);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f3870b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            this.f3870b.run();
            return;
        }
        e a5 = b0.a(num.intValue(), "Billing override value was set by a license tester.");
        this.f3871c.A(105, this.f3872d, a5);
        this.f3869a.accept(a5);
    }
}
