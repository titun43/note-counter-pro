package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c0.j;
import com.google.android.gms.internal.play_billing.zze;
import y1.e;
import y1.z;

/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: g, reason: collision with root package name */
    public ResultReceiver f830g;
    public ResultReceiver h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f831i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f832j;

    /* renamed from: k, reason: collision with root package name */
    public int f833k;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i5, int i6, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a5;
        super.onActivityResult(i5, i6, intent);
        if (i5 == 100 || i5 == 110) {
            int i7 = zze.zzf(intent, "ProxyBillingActivity").f3832a;
            if (i6 == -1) {
                if (i7 != 0) {
                    i6 = -1;
                } else {
                    i7 = 0;
                    resultReceiver = this.f830g;
                    if (resultReceiver == null) {
                        resultReceiver.send(i7, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent == null) {
                            a5 = a();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                a5 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                a5.setPackage(getApplicationContext().getPackageName());
                                a5.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                a5.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                Intent a6 = a();
                                a6.putExtras(intent.getExtras());
                                a6.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                a5 = a6;
                            }
                        } else {
                            a5 = a();
                            zze.zzl("ProxyBillingActivity", "Got null bundle!");
                            a5.putExtra("RESPONSE_CODE", 6);
                            a5.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            j a7 = e.a();
                            a7.f763a = 6;
                            a7.f764b = "An internal error occurred.";
                            a5.putExtra("FAILURE_LOGGING_PAYLOAD", z.b(22, 2, a7.b()).zzh());
                            a5.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                        if (i5 == 110) {
                            a5.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a5);
                    }
                }
            }
            zze.zzl("ProxyBillingActivity", "Activity finished with resultCode " + i6 + " and billing's responseCode: " + i7);
            resultReceiver = this.f830g;
            if (resultReceiver == null) {
            }
        } else if (i5 == 101) {
            int zza = zze.zza(intent, "ProxyBillingActivity");
            ResultReceiver resultReceiver2 = this.h;
            if (resultReceiver2 != null) {
                resultReceiver2.send(zza, intent != null ? intent.getExtras() : null);
            }
        } else {
            zze.zzl("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i5 + "; skipping...");
        }
        this.f831i = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f831i = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f830g = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.h = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f832j = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f833k = bundle.getInt("activity_code", 100);
            return;
        }
        zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f833k = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f832j = true;
                this.f833k = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f830g = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.h = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f833k = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f831i = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f833k, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e4) {
            zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e4);
            ResultReceiver resultReceiver = this.f830g;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.h;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a5 = a();
                    if (this.f832j) {
                        a5.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a5.putExtra("RESPONSE_CODE", 6);
                    a5.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a5);
                }
            }
            this.f831i = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f831i) {
            Intent a5 = a();
            a5.putExtra("RESPONSE_CODE", 1);
            a5.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i5 = this.f833k;
            if (i5 == 110 || i5 == 100) {
                a5.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a5);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f830g;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.h;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f831i);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f832j);
        bundle.putInt("activity_code", this.f833k);
    }
}
