package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3827a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.c0 f3829c;

    public c0(com.google.android.gms.common.api.internal.c0 c0Var, boolean z4) {
        this.f3829c = c0Var;
        this.f3828b = z4;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f3827a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f3828b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f3827a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Bundle bundle, e eVar, int i5) {
        a0 a0Var = (a0) this.f3829c.f961d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((androidx.emoji2.text.p) a0Var).H(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                ((androidx.emoji2.text.p) a0Var).H(z.b(23, i5, eVar));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.google.android.gms.common.api.internal.c0 c0Var = this.f3829c;
        a0 a0Var = (a0) c0Var.f961d;
        i iVar = (i) c0Var.f960c;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            e eVar = b0.f3817g;
            ((androidx.emoji2.text.p) a0Var).H(z.b(11, 1, eVar));
            if (iVar != null) {
                iVar.onPurchasesUpdated(eVar, null);
                return;
            }
            return;
        }
        e zzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i5 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List zzj = zze.zzj(extras);
            if (zzf.f3832a == 0) {
                ((androidx.emoji2.text.p) a0Var).I(z.d(i5));
            } else {
                b(extras, zzf, i5);
            }
            iVar.onPurchasesUpdated(zzf, zzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzf.f3832a != 0) {
                b(extras, zzf, i5);
                iVar.onPurchasesUpdated(zzf, zzco.zzl());
            } else {
                zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                e eVar2 = b0.f3817g;
                ((androidx.emoji2.text.p) a0Var).H(z.b(77, i5, eVar2));
                iVar.onPurchasesUpdated(eVar2, zzco.zzl());
            }
        }
    }
}
