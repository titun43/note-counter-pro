package org.apache.cordova;

import android.content.Intent;
import android.os.Debug;
import android.util.Log;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2937b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2938c;

    /* renamed from: d, reason: collision with root package name */
    public final u f2939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2940e;

    static {
        Debug.isDebuggerConnected();
    }

    public k0(u uVar, n nVar, List list) {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        this.f2936a = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        this.f2937b = synchronizedMap2;
        this.f2938c = nVar;
        this.f2939d = uVar;
        if (this.f2940e) {
            g(false);
            e();
            synchronizedMap.clear();
            synchronizedMap2.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            this.f2937b.put(i0Var.f2929a, i0Var);
        }
        if (this.f2940e) {
            o();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        p c5 = c(str);
        u uVar = this.f2939d;
        if (c5 == null) {
            uVar.sendPluginResult(new l0(3), str3);
            return;
        }
        e eVar = new e(str3, uVar);
        try {
            System.currentTimeMillis();
            boolean execute = c5.execute(str2, str4, eVar);
            System.currentTimeMillis();
            if (execute) {
                return;
            }
            eVar.sendPluginResult(new l0(8));
        } catch (JSONException unused) {
            eVar.sendPluginResult(new l0(9));
        } catch (Exception e4) {
            Log.e("PluginManager", "Uncaught exception from plugin", e4);
            eVar.error(e4.getMessage());
        }
    }

    public final String b() {
        u uVar = this.f2939d;
        if (uVar.getPreferences().a("AndroidInsecureFileModeEnabled", false)) {
            return "file://";
        }
        return uVar.getPreferences().c("scheme", Bridge.CAPACITOR_HTTPS_SCHEME).toLowerCase() + "://" + uVar.getPreferences().c("hostname", "localhost").toLowerCase() + '/';
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:24:0x001a, B:26:0x0022, B:12:0x002f, B:14:0x0038), top: B:23:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p c(String str) {
        Class<?> cls;
        Map map = this.f2936a;
        p pVar = (p) map.get(str);
        if (pVar != null) {
            return pVar;
        }
        i0 i0Var = (i0) this.f2937b.get(str);
        p pVar2 = null;
        if (i0Var == null) {
            return null;
        }
        String str2 = i0Var.f2930b;
        if (str2 != null) {
            try {
            } catch (Exception e4) {
                e4.printStackTrace();
                System.out.println("Error adding plugin " + str2 + ".");
            }
            if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2)) {
                cls = Class.forName(str2);
                if ((cls == null) & p.class.isAssignableFrom(cls)) {
                    pVar2 = (p) cls.newInstance();
                }
                u uVar = this.f2939d;
                pVar2.privateInitialize(str, this.f2938c, uVar, uVar.getPreferences());
                map.put(str, pVar2);
                return pVar2;
            }
        }
        cls = null;
        if ((cls == null) & p.class.isAssignableFrom(cls)) {
        }
        u uVar2 = this.f2939d;
        pVar2.privateInitialize(str, this.f2938c, uVar2, uVar2.getPreferences());
        map.put(str, pVar2);
        return pVar2;
    }

    public final void d() {
        this.f2940e = true;
        g(false);
        e();
        this.f2936a.clear();
        o();
    }

    public final void e() {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onDestroy();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Intent intent) {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onNewIntent(intent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(boolean z4) {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onPause(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(boolean z4) {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onResume(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onStart();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f2936a) {
            try {
                for (p pVar : this.f2936a.values()) {
                    if (pVar != null) {
                        pVar.onStop();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k(final String str, final Object obj) {
        synchronized (this.f2936a) {
            this.f2936a.forEach(new BiConsumer() { // from class: org.apache.cordova.j0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    p pVar = (p) obj3;
                    if (pVar != null) {
                        pVar.onMessage(str, obj);
                    }
                }
            });
        }
        return this.f2938c.onMessage(str, obj);
    }

    public final boolean l(String str) {
        Boolean shouldAllowNavigation;
        synchronized (this.f2937b) {
            try {
                Iterator it = this.f2937b.values().iterator();
                while (it.hasNext()) {
                    p pVar = (p) this.f2936a.get(((i0) it.next()).f2929a);
                    if (pVar != null && (shouldAllowNavigation = pVar.shouldAllowNavigation(str)) != null) {
                        return shouldAllowNavigation.booleanValue();
                    }
                }
                return str.startsWith(b()) || str.startsWith("about:blank");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(String str) {
        Boolean shouldAllowRequest;
        synchronized (this.f2937b) {
            try {
                Iterator it = this.f2937b.values().iterator();
                while (it.hasNext()) {
                    p pVar = (p) this.f2936a.get(((i0) it.next()).f2929a);
                    if (pVar != null && (shouldAllowRequest = pVar.shouldAllowRequest(str)) != null) {
                        return shouldAllowRequest.booleanValue();
                    }
                }
                if (str.startsWith("blob:") || str.startsWith("data:") || str.startsWith("about:blank") || str.startsWith("https://ssl.gstatic.com/accessibility/javascript/android/")) {
                    return true;
                }
                if (str.startsWith("file://")) {
                    return !str.contains("/app_webview/");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Boolean n(String str) {
        Boolean shouldOpenExternalUrl;
        synchronized (this.f2937b) {
            try {
                Iterator it = this.f2937b.values().iterator();
                while (it.hasNext()) {
                    p pVar = (p) this.f2936a.get(((i0) it.next()).f2929a);
                    if (pVar != null && (shouldOpenExternalUrl = pVar.shouldOpenExternalUrl(str)) != null) {
                        return shouldOpenExternalUrl;
                    }
                }
                return Boolean.FALSE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f2937b) {
            try {
                for (i0 i0Var : this.f2937b.values()) {
                    if (i0Var.f2931c) {
                        c(i0Var.f2929a);
                    } else {
                        this.f2936a.put(i0Var.f2929a, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
