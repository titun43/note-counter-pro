package org.apache.cordova;

import android.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResumeCallback extends e {

    /* renamed from: d, reason: collision with root package name */
    public final String f2887d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f2888e;

    public ResumeCallback(String str, k0 k0Var) {
        super("resumecallback", null);
        this.f2887d = str;
        this.f2888e = k0Var;
    }

    @Override // org.apache.cordova.e
    public void sendPluginResult(l0 l0Var) {
        synchronized (this) {
            try {
                if (this.f2899c) {
                    l0Var.a();
                    return;
                }
                this.f2899c = true;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pluginServiceName", this.f2887d);
                    jSONObject2.put("pluginStatus", l0.f2942g[l0Var.f2943a]);
                    jSONObject.put("action", "resume");
                    jSONObject.put("pendingResult", jSONObject2);
                } catch (JSONException unused) {
                    Log.e("CordovaResumeCallback", "Unable to create resume object for Activity Result");
                }
                l0 l0Var2 = new l0(2, jSONObject);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l0Var2);
                arrayList.add(l0Var);
                ((CoreAndroid) this.f2888e.c(CoreAndroid.PLUGIN_NAME)).sendResumeEvent(new l0(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
