package org.apache.cordova;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CoreAndroid extends p {
    public static final String PLUGIN_NAME = "CoreAndroid";

    /* renamed from: c, reason: collision with root package name */
    public g.b0 f2875c;

    /* renamed from: d, reason: collision with root package name */
    public e f2876d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f2877e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f2878f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2879g = new Object();

    @Deprecated
    public static Object getBuildConfigValue(Context context, String str) {
        try {
            return Class.forName(context.getApplicationInfo().packageName + ".BuildConfig").getField(str).get(null);
        } catch (ClassNotFoundException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (NullPointerException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public void backHistory() {
        this.cordova.getActivity().runOnUiThread(new a0(this, 3));
    }

    public void clearCache() {
        this.cordova.getActivity().runOnUiThread(new a0(this, 1));
    }

    public void clearHistory() {
        this.cordova.getActivity().runOnUiThread(new a0(this, 2));
    }

    @Override // org.apache.cordova.p
    public boolean execute(String str, JSONArray jSONArray, e eVar) {
        try {
            if (str.equals("clearCache")) {
                clearCache();
            } else if (str.equals("show")) {
                this.cordova.getActivity().runOnUiThread(new a0(this, 0));
            } else if (str.equals("loadUrl")) {
                loadUrl(jSONArray.getString(0), jSONArray.optJSONObject(1));
            } else if (!str.equals("cancelLoadUrl")) {
                if (str.equals("clearHistory")) {
                    clearHistory();
                } else if (str.equals("backHistory")) {
                    backHistory();
                } else if (str.equals("overrideButton")) {
                    overrideButton(jSONArray.getString(0), jSONArray.getBoolean(1));
                } else if (str.equals("overrideBackbutton")) {
                    overrideBackbutton(jSONArray.getBoolean(0));
                } else if (str.equals("exitApp")) {
                    exitApp();
                } else if (str.equals("messageChannel")) {
                    synchronized (this.f2879g) {
                        try {
                            this.f2876d = eVar;
                            l0 l0Var = this.f2878f;
                            if (l0Var != null) {
                                l0Var.f2945c = true;
                                if (eVar != null) {
                                    eVar.sendPluginResult(l0Var);
                                }
                                this.f2878f = null;
                            }
                            l0 l0Var2 = this.f2877e;
                            if (l0Var2 != null) {
                                l0Var2.f2945c = true;
                                e eVar2 = this.f2876d;
                                if (eVar2 != null) {
                                    eVar2.sendPluginResult(l0Var2);
                                }
                                this.f2877e = null;
                            }
                        } finally {
                        }
                    }
                    return true;
                }
            }
            eVar.sendPluginResult(new l0(2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            return true;
        } catch (JSONException unused) {
            eVar.sendPluginResult(new l0(9));
            return false;
        }
    }

    public void exitApp() {
        this.webView.getPluginManager().k("exit", null);
    }

    public void fireJavascriptEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e4) {
            Log.e("CordovaApp", "Failed to create event message", e4);
        }
        l0 l0Var = new l0(2, jSONObject);
        e eVar = this.f2876d;
        if (eVar != null) {
            l0Var.f2945c = true;
            if (eVar != null) {
                eVar.sendPluginResult(l0Var);
                return;
            }
            return;
        }
        if ("pause".equals(str)) {
            this.f2878f = l0Var;
        } else if ("resume".equals(str)) {
            this.f2878f = null;
        }
    }

    public boolean isBackbuttonOverridden() {
        return this.webView.isButtonPlumbedToJs(4);
    }

    public void loadUrl(String str, JSONObject jSONObject) {
        boolean z4;
        boolean z5;
        Objects.toString(jSONObject);
        HashMap hashMap = new HashMap();
        int i5 = 0;
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            int i6 = 0;
            z4 = false;
            z5 = false;
            while (i5 < names.length()) {
                String string = names.getString(i5);
                if (string.equals("wait")) {
                    i6 = jSONObject.getInt(string);
                } else if (string.equalsIgnoreCase("openexternal")) {
                    z4 = jSONObject.getBoolean(string);
                } else if (string.equalsIgnoreCase("clearhistory")) {
                    z5 = jSONObject.getBoolean(string);
                } else {
                    Object obj = jSONObject.get(string);
                    if (obj != null) {
                        if (obj.getClass().equals(String.class)) {
                            hashMap.put(string, (String) obj);
                        } else if (obj.getClass().equals(Boolean.class)) {
                            hashMap.put(string, (Boolean) obj);
                        } else if (obj.getClass().equals(Integer.class)) {
                            hashMap.put(string, (Integer) obj);
                        }
                    }
                }
                i5++;
            }
            i5 = i6;
        } else {
            z4 = false;
            z5 = false;
        }
        if (i5 > 0) {
            try {
                synchronized (this) {
                    wait(i5);
                }
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }
        this.webView.showWebPage(str, z4, z5, hashMap);
    }

    @Override // org.apache.cordova.p
    public void onDestroy() {
        this.webView.getContext().unregisterReceiver(this.f2875c);
    }

    public void overrideBackbutton(boolean z4) {
        this.webView.setButtonPlumbedToJs(4, z4);
    }

    public void overrideButton(String str, boolean z4) {
        if (str.equals("volumeup")) {
            this.webView.setButtonPlumbedToJs(24, z4);
        } else if (str.equals("volumedown")) {
            this.webView.setButtonPlumbedToJs(25, z4);
        } else if (str.equals("menubutton")) {
            this.webView.setButtonPlumbedToJs(82, z4);
        }
    }

    @Override // org.apache.cordova.p
    public void pluginInitialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        this.f2875c = new g.b0(this, 1);
        this.webView.getContext().registerReceiver(this.f2875c, intentFilter);
    }

    public void sendResumeEvent(l0 l0Var) {
        synchronized (this.f2879g) {
            e eVar = this.f2876d;
            if (eVar != null) {
                l0Var.f2945c = true;
                if (eVar != null) {
                    eVar.sendPluginResult(l0Var);
                }
            } else {
                this.f2877e = l0Var;
            }
        }
    }
}
