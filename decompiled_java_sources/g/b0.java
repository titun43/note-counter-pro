package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import org.apache.cordova.CoreAndroid;

/* loaded from: classes.dex */
public final class b0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1497b;

    public /* synthetic */ b0(Object obj, int i5) {
        this.f1496a = i5;
        this.f1497b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1496a) {
            case 0:
                ((c0) this.f1497b).g();
                break;
            case 1:
                CoreAndroid coreAndroid = (CoreAndroid) this.f1497b;
                if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state")) {
                    String stringExtra = intent.getStringExtra("state");
                    if (!stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                        if (!stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                                coreAndroid.webView.getPluginManager().k("telephone", "idle");
                                break;
                            }
                        } else {
                            coreAndroid.webView.getPluginManager().k("telephone", "offhook");
                            break;
                        }
                    } else {
                        coreAndroid.webView.getPluginManager().k("telephone", "ringing");
                        break;
                    }
                }
                break;
            case 2:
                if (intent != null) {
                    ((r1.c) this.f1497b).g(intent);
                    break;
                }
                break;
            default:
                ((WebSettings) this.f1497b).getUserAgentString();
                break;
        }
    }
}
