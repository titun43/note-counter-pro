package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.s;
import androidx.fragment.app.p0;
import com.google.android.gms.internal.play_billing.zze;
import d.c;
import g4.i;
import k1.j;
import u1.f;

/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends s {

    /* renamed from: g, reason: collision with root package name */
    public c f834g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public ResultReceiver f835i;

    /* renamed from: j, reason: collision with root package name */
    public ResultReceiver f836j;

    @Override // androidx.activity.s, u.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f834g = registerForActivityResult(new p0(3), new j(this, 27));
        this.h = registerForActivityResult(new p0(3), new f(this, 25));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f835i = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f836j = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f835i = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.f834g;
            i.e(pendingIntent, com.google.android.gms.common.internal.f.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            i.d(intentSender, "getIntentSender(...)");
            cVar.a(new d.i(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f836j = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.h;
            i.e(pendingIntent2, com.google.android.gms.common.internal.f.KEY_PENDING_INTENT);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            i.d(intentSender2, "getIntentSender(...)");
            cVar2.a(new d.i(intentSender2, null, 0, 0));
        }
    }

    @Override // androidx.activity.s, u.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f835i;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f836j;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
