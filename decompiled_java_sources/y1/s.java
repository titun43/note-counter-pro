package y1;

import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzr;

/* loaded from: classes.dex */
public final /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3868b;

    public /* synthetic */ s(w wVar, int i5) {
        this.f3867a = wVar;
        this.f3868b = i5;
    }

    public final void a(zzr zzrVar) {
        String str;
        w wVar = this.f3867a;
        int i5 = this.f3868b;
        try {
            if (wVar.B == null) {
                throw null;
            }
            zzav zzavVar = wVar.B;
            String packageName = wVar.f3875z.getPackageName();
            switch (i5) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            zzavVar.zza(packageName, str, new u(zzrVar));
        } catch (Exception e4) {
            wVar.A(107, 28, b0.f3826q);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e4);
            zzrVar.zzb(0);
        }
    }
}
