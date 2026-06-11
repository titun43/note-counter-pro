package c0;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.appset.zzq;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import g.q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import k.u0;
import o4.r;
import o4.w;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.apache.cordova.g0;
import org.apache.cordova.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f736g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f737i;

    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        this.f736g = i5;
        this.h = obj;
        this.f737i = obj2;
    }

    private final void a() {
        synchronized (((ConstraintTrackingWorker) this.f737i).h) {
            if (((ConstraintTrackingWorker) this.f737i).f665i) {
                ((ConstraintTrackingWorker) this.f737i).f666j.h(new androidx.work.k());
            } else {
                ((ConstraintTrackingWorker) this.f737i).f666j.j((j3.a) this.h);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.n nVar;
        com.google.android.gms.common.internal.n q0Var;
        int i5 = 0;
        switch (this.f736g) {
            case 0:
                u1.f fVar = (u1.f) this.h;
                Typeface typeface = (Typeface) this.f737i;
                u0 u0Var = (u0) fVar.h;
                if (u0Var != null) {
                    u0Var.b(typeface);
                    return;
                }
                return;
            case 1:
                ((g) this.h).accept(this.f737i);
                return;
            case 2:
                t2.b bVar = (t2.b) this.h;
                c0 c0Var = (c0) this.f737i;
                com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) c0Var.f959b;
                a0 a0Var = (a0) ((com.google.android.gms.common.api.internal.g) c0Var.f963f).f978p.get((com.google.android.gms.common.api.internal.a) c0Var.f960c);
                if (a0Var == null) {
                    return;
                }
                if (bVar.h != 0) {
                    a0Var.n(bVar, null);
                    return;
                }
                c0Var.f958a = true;
                if (gVar.requiresSignIn()) {
                    if (!c0Var.f958a || (nVar = (com.google.android.gms.common.internal.n) c0Var.f961d) == null) {
                        return;
                    }
                    gVar.getRemoteService(nVar, (Set) c0Var.f962e);
                    return;
                }
                try {
                    gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    gVar.disconnect("Failed to get service from broker.");
                    a0Var.n(new t2.b(10, null, null), null);
                    return;
                }
            case 3:
                com.google.android.gms.common.api.internal.l lVar = (com.google.android.gms.common.api.internal.l) this.h;
                com.google.android.gms.common.api.internal.k kVar = (com.google.android.gms.common.api.internal.k) this.f737i;
                Object obj = lVar.f1005b;
                if (obj == null) {
                    kVar.onNotifyListenerFailed();
                    return;
                }
                try {
                    kVar.notifyListener(obj);
                    return;
                } catch (RuntimeException e5) {
                    kVar.onNotifyListenerFailed();
                    throw e5;
                }
            case 4:
                j0 j0Var = (j0) this.f737i;
                g3.g gVar2 = (g3.g) this.h;
                t2.b bVar2 = gVar2.h;
                if (bVar2.h == 0) {
                    y yVar = gVar2.f1687i;
                    b0.g(yVar);
                    t2.b bVar3 = yVar.f1131i;
                    if (bVar3.h != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        j0Var.f1002m.b(bVar3);
                        j0Var.f1001l.disconnect();
                        return;
                    }
                    c0 c0Var2 = j0Var.f1002m;
                    IBinder iBinder = yVar.h;
                    if (iBinder == null) {
                        q0Var = null;
                    } else {
                        int i6 = com.google.android.gms.common.internal.a.f1037g;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        q0Var = queryLocalInterface instanceof com.google.android.gms.common.internal.n ? (com.google.android.gms.common.internal.n) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    Set set = j0Var.f999j;
                    c0Var2.getClass();
                    if (q0Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0Var2.b(new t2.b(4, null, null));
                    } else {
                        c0Var2.f961d = q0Var;
                        c0Var2.f962e = set;
                        if (c0Var2.f958a) {
                            ((com.google.android.gms.common.api.g) c0Var2.f959b).getRemoteService(q0Var, set);
                        }
                    }
                } else {
                    j0Var.f1002m.b(bVar2);
                }
                j0Var.f1001l.disconnect();
                return;
            case 5:
                if (((h3.n) ((h3.g) this.h)).f1730d) {
                    ((h3.n) ((h3.j) this.f737i).f1718c).f();
                    return;
                }
                try {
                    ((h3.n) ((h3.j) this.f737i).f1718c).e(((h3.b) ((h3.j) this.f737i).f1719d).then((h3.g) this.h));
                    return;
                } catch (h3.f e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((h3.n) ((h3.j) this.f737i).f1718c).d((Exception) e6.getCause());
                        return;
                    } else {
                        ((h3.n) ((h3.j) this.f737i).f1718c).d(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((h3.n) ((h3.j) this.f737i).f1718c).d(e7);
                    return;
                }
            case 6:
                h3.j jVar = (h3.j) this.f737i;
                h3.n nVar2 = (h3.n) jVar.f1718c;
                try {
                    h3.g gVar3 = (h3.g) ((zzq) jVar.f1719d).then((h3.g) this.h);
                    if (gVar3 == null) {
                        jVar.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    q qVar = h3.i.f1715b;
                    h3.n nVar3 = (h3.n) gVar3;
                    h3.m mVar = nVar3.f1728b;
                    mVar.a(new h3.k(qVar, jVar, 1));
                    nVar3.h();
                    mVar.a(new h3.j(qVar, jVar));
                    nVar3.h();
                    mVar.a(new h3.k(qVar, jVar, 0));
                    nVar3.h();
                    return;
                } catch (h3.f e8) {
                    if (e8.getCause() instanceof Exception) {
                        nVar2.d((Exception) e8.getCause());
                        return;
                    } else {
                        nVar2.d(e8);
                        return;
                    }
                } catch (Exception e9) {
                    nVar2.d(e9);
                    return;
                }
            case 7:
                synchronized (((h3.j) this.f737i).f1719d) {
                    ((h3.d) ((h3.j) this.f737i).f1718c).onComplete((h3.g) this.h);
                }
                return;
            case 8:
                synchronized (((h3.j) this.f737i).f1719d) {
                    h3.e eVar = (h3.e) ((h3.j) this.f737i).f1718c;
                    Exception a5 = ((h3.g) this.h).a();
                    b0.g(a5);
                    eVar.onFailure(a5);
                }
                return;
            case 9:
                synchronized (((h3.k) this.f737i).f1722c) {
                    try {
                        h3.j jVar2 = ((h3.k) this.f737i).f1723d;
                        if (jVar2 != null) {
                            ((h3.n) jVar2.f1718c).e(((h3.g) this.h).b());
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                h3.n nVar4 = (h3.n) this.h;
                try {
                    nVar4.e(((Callable) this.f737i).call());
                    return;
                } catch (Exception e10) {
                    nVar4.d(e10);
                    return;
                } catch (Throwable th) {
                    nVar4.d(new RuntimeException(th));
                    return;
                }
            case 11:
                androidx.work.n e11 = androidx.work.n.e();
                String str = m1.a.f2552d;
                t1.i iVar = (t1.i) this.h;
                e11.b(str, s.c.a("Scheduling work ", iVar.f3340a), new Throwable[0]);
                ((m1.a) this.f737i).f2553a.a(iVar);
                return;
            case 12:
                CordovaWebViewImpl cordovaWebViewImpl = (CordovaWebViewImpl) this.f737i;
                cordovaWebViewImpl.stopLoading();
                Log.e(CordovaWebViewImpl.TAG, "CordovaWebView: TIMEOUT ERROR!");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorCode", -6);
                    jSONObject.put("description", "The connection to the server was unsuccessful.");
                    jSONObject.put("url", (String) this.h);
                } catch (JSONException unused) {
                }
                cordovaWebViewImpl.f2861a.k("onReceivedError", jSONObject);
                return;
            case 13:
                String e12 = ((h0) this.h).e();
                if (e12 != null) {
                    ((NativeToJsMessageQueue$EvalBridgeMode) this.f737i).f2880a.evaluateJavascript(e12, null);
                    return;
                }
                return;
            case 14:
                String e13 = ((h0) this.h).e();
                if (e13 != null) {
                    ((NativeToJsMessageQueue$LoadUrlBridgeMode) this.f737i).f2882a.loadUrl("javascript:".concat(e13), false);
                    return;
                }
                return;
            case 15:
                if (((h0) this.h).f2923b.isEmpty()) {
                    return;
                }
                NativeToJsMessageQueue$OnlineEventsBridgeMode nativeToJsMessageQueue$OnlineEventsBridgeMode = (NativeToJsMessageQueue$OnlineEventsBridgeMode) this.f737i;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2886c = false;
                g0 g0Var = nativeToJsMessageQueue$OnlineEventsBridgeMode.f2884a;
                boolean z4 = nativeToJsMessageQueue$OnlineEventsBridgeMode.f2885b;
                SystemWebView systemWebView = ((SystemWebViewEngine) ((k1.j) g0Var).h).f2902a;
                if (systemWebView != null) {
                    systemWebView.setNetworkAvailable(z4);
                    return;
                }
                return;
            case 16:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    q1.c cVar = (q1.c) obj2;
                    Object obj3 = ((r1.d) this.f737i).f3155e;
                    cVar.f3080b = obj3;
                    cVar.d(cVar.f3082d, obj3);
                }
                return;
            case 17:
                break;
            case 18:
                ((u.c) this.h).f3448g = this.f737i;
                return;
            case 19:
                ((Application) this.h).unregisterActivityLifecycleCallbacks((u.c) this.f737i);
                return;
            case 20:
                Object obj4 = this.f737i;
                Object obj5 = this.h;
                try {
                    Method method = u.d.f3456d;
                    if (method != null) {
                        method.invoke(obj5, obj4, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        u.d.f3457e.invoke(obj5, obj4, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e14) {
                    if (e14.getClass() == RuntimeException.class && e14.getMessage() != null && e14.getMessage().startsWith("Unable to stop")) {
                        throw e14;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case zzbgj.zzt.zzm /* 21 */:
                u1.i iVar2 = (u1.i) this.h;
                try {
                    ((Runnable) this.f737i).run();
                    return;
                } finally {
                    iVar2.a();
                }
            case 22:
                a();
                return;
            case 23:
                y1.b bVar4 = (y1.b) this.h;
                a2.d dVar = (a2.d) this.f737i;
                bVar4.getClass();
                y1.e eVar2 = y1.b0.f3819j;
                bVar4.t(24, 9, eVar2);
                dVar.a(eVar2, zzco.zzl());
                return;
            case 24:
                Future future = (Future) this.h;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f737i;
                future.cancel(true);
                zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                y1.b bVar5 = (y1.b) this.h;
                com.getcapacitor.plugin.c cVar2 = (com.getcapacitor.plugin.c) this.f737i;
                y1.e eVar3 = y1.b0.f3819j;
                bVar5.t(24, 7, eVar3);
                cVar2.f(eVar3, new ArrayList());
                return;
            default:
                y1.b bVar6 = (y1.b) this.h;
                y1.e eVar4 = (y1.e) this.f737i;
                if (((y1.i) bVar6.f3792e.f960c) != null) {
                    ((y1.i) bVar6.f3792e.f960c).onPurchasesUpdated(eVar4, null);
                    return;
                } else {
                    zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.h).run();
            } catch (Throwable th3) {
                w.g(th3, w3.i.f3631g);
            }
            Runnable o2 = ((t4.h) this.f737i).o();
            if (o2 == null) {
                return;
            }
            try {
                this.h = o2;
                i5++;
                if (i5 >= 16) {
                    t4.h hVar = (t4.h) this.f737i;
                    r rVar = hVar.f3420i;
                    try {
                        if (rVar.k(hVar)) {
                            t4.h hVar2 = (t4.h) this.f737i;
                            t4.b.i(hVar2.f3420i, hVar2, this);
                            return;
                        }
                    } catch (Throwable th4) {
                        throw new o4.b0(th4, rVar, hVar);
                    }
                }
            } catch (Throwable th5) {
                t4.h hVar3 = (t4.h) this.f737i;
                synchronized (hVar3.f3423l) {
                    t4.h.f3419m.decrementAndGet(hVar3);
                    throw th5;
                }
            }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i5, boolean z4) {
        this.f736g = i5;
        this.f737i = obj;
        this.h = obj2;
    }
}
