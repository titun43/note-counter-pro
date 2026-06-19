package u1;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.q0;
import androidx.fragment.app.u0;
import androidx.fragment.app.z;
import androidx.work.impl.WorkDatabase;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import g.l0;
import g.n0;
import java.util.ArrayList;
import k.a3;
import k.h2;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public class f implements d.b, f0.c, j.l, h2.b, h2, k.o, j1.b, k1.p, r4.b, com.google.android.gms.common.api.internal.q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3503g;
    public Object h;

    public /* synthetic */ f() {
        this.f3503g = 23;
    }

    @Override // k1.p
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.h).getSupportedFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        v2.a aVar = (v2.a) ((v2.c) obj).getService();
        com.google.android.gms.common.internal.t tVar = (com.google.android.gms.common.internal.t) this.h;
        Parcel zaa = aVar.zaa();
        zac.zac(zaa, tVar);
        aVar.zad(1, zaa);
        ((h3.h) obj2).a(null);
    }

    @Override // f0.c
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.h).setLinkUri(uri);
    }

    @Override // f0.c
    public f0.f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.h).build();
        return new f0.f(new k1.j(build));
    }

    @Override // d.b
    public void c(Object obj) {
        switch (this.f3503g) {
            case 2:
                d.a aVar = (d.a) obj;
                u0 u0Var = (u0) this.h;
                q0 q0Var = (q0) u0Var.F.pollLast();
                if (q0Var != null) {
                    String str = q0Var.f418g;
                    int i5 = q0Var.h;
                    z h = u0Var.f441c.h(str);
                    if (h != null) {
                        h.k(i5, aVar.f1157g, aVar.h);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.h;
                d.a aVar2 = (d.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.h;
                int i6 = zze.zzf(intent, "ProxyBillingActivityV2").f3832a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.f836j;
                if (resultReceiver != null) {
                    resultReceiver.send(i6, intent == null ? null : intent.getExtras());
                }
                int i7 = aVar2.f1157g;
                if (i7 != -1 || i6 != 0) {
                    zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i7 + " and billing's responseCode: " + i6);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // k1.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) y4.b.f(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.h).createWebView(webView));
    }

    @Override // k.h2
    public void e(j.n nVar, j.p pVar) {
        j.h hVar = (j.h) this.h;
        Handler handler = hVar.f1915l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = hVar.f1917n;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (nVar == ((j.g) arrayList.get(i5)).f1910b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 == -1) {
            return;
        }
        int i6 = i5 + 1;
        handler.postAtTime(new j.f(this, i6 < arrayList.size() ? (j.g) arrayList.get(i6) : null, pVar, nVar, 0), nVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j.l
    public void f(j.n nVar) {
        switch (this.f3503g) {
            case 6:
                n0 n0Var = (n0) this.h;
                Window.Callback callback = n0Var.f1594b;
                if (!n0Var.f1593a.f2050a.o()) {
                    if (callback.onPreparePanel(0, null, nVar)) {
                        callback.onMenuOpened(108, nVar);
                        break;
                    }
                } else {
                    callback.onPanelClosed(108, nVar);
                    break;
                }
                break;
            default:
                j.l lVar = ((ActionMenuView) this.h).B;
                if (lVar != null) {
                    lVar.f(nVar);
                    break;
                }
                break;
        }
    }

    @Override // j.l
    public boolean g(j.n nVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        switch (this.f3503g) {
            case 6:
                return false;
            default:
                k.o oVar = ((ActionMenuView) this.h).G;
                if (oVar == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((f) oVar).h;
                if (toolbar.M.a()) {
                    onMenuItemSelected = true;
                } else {
                    a3 a3Var = toolbar.O;
                    onMenuItemSelected = a3Var != null ? ((l0) a3Var).f1590a.f1594b.onMenuItemSelected(0, menuItem) : false;
                }
                return onMenuItemSelected;
        }
    }

    @Override // s3.a
    public Object get() {
        switch (this.f3503g) {
            case 8:
                return new androidx.emoji2.text.t((Context) ((f) this.h).h, new t2.i(24), new t2.i(23), 11);
            case 9:
                return this.h;
            default:
                String packageName = ((Context) ((s3.a) this.h).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // k1.p
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) y4.b.f(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.h).getProfileStore());
    }

    @Override // k1.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) y4.b.f(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.h).getStatics());
    }

    @Override // f0.c
    public void h(int i5) {
        ((ContentInfo.Builder) this.h).setFlags(i5);
    }

    @Override // k.h2
    public void i(j.n nVar, MenuItem menuItem) {
        ((j.h) this.h).f1915l.removeCallbacksAndMessages(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v4, types: [f4.p, y3.g] */
    @Override // r4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(r4.c cVar, w3.c cVar2) {
        r4.a aVar;
        int i5;
        Throwable th;
        s4.j jVar;
        if (cVar2 instanceof r4.a) {
            aVar = (r4.a) cVar2;
            int i6 = aVar.f3219j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f3219j = i6 - Integer.MIN_VALUE;
                Object obj = aVar.h;
                x3.a aVar2 = x3.a.f3712g;
                i5 = aVar.f3219j;
                t3.h hVar = t3.h.f3400a;
                if (i5 != 0) {
                    b3.g.x(obj);
                    s4.j jVar2 = new s4.j(cVar, aVar.getContext());
                    try {
                        aVar.f3217g = jVar2;
                        aVar.f3219j = 1;
                        Object invoke = ((y3.g) this.h).invoke(jVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = hVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        jVar = jVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar = jVar2;
                        jVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = aVar.f3217g;
                    try {
                        b3.g.x(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        jVar.releaseIntercepted();
                        throw th;
                    }
                }
                jVar.releaseIntercepted();
                return hVar;
            }
        }
        aVar = new r4.a(this, (y3.c) cVar2);
        Object obj2 = aVar.h;
        x3.a aVar22 = x3.a.f3712g;
        i5 = aVar.f3219j;
        t3.h hVar2 = t3.h.f3400a;
        if (i5 != 0) {
        }
        jVar.releaseIntercepted();
        return hVar2;
    }

    public void k(String str, boolean z4) {
        switch (this.f3503g) {
            case zzbgj.zzt.zzm /* 21 */:
                JsResult jsResult = (JsResult) this.h;
                if (!z4) {
                    jsResult.cancel();
                    break;
                } else {
                    jsResult.confirm();
                    break;
                }
            default:
                JsPromptResult jsPromptResult = (JsPromptResult) this.h;
                if (!z4) {
                    jsPromptResult.cancel();
                    break;
                } else {
                    jsPromptResult.confirm(str);
                    break;
                }
        }
    }

    public void l() {
        View view = (View) this.h;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public int m(int i5) {
        WorkDatabase workDatabase;
        int i6;
        synchronized (f.class) {
            try {
                workDatabase = (WorkDatabase) this.h;
                workDatabase.c();
                Long z4 = workDatabase.j().z("next_job_scheduler_id");
                int intValue = z4 != null ? z4.intValue() : 0;
                workDatabase.j().B(new t1.c("next_job_scheduler_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
                i6 = (intValue >= 0 && intValue <= i5) ? intValue : 0;
                ((WorkDatabase) this.h).j().B(new t1.c("next_job_scheduler_id", 1));
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            } finally {
            }
        }
        return i6;
    }

    public WebResourceResponse n(Uri uri) {
        WebResourceResponse webResourceResponse;
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            webResourceResponse = null;
            r3 = null;
            r3 = null;
            r3 = null;
            x4.d dVar = null;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            j1.d dVar2 = (j1.d) obj;
            dVar2.getClass();
            String str = dVar2.f2018c;
            if ((!uri.getScheme().equals(Bridge.CAPACITOR_HTTP_SCHEME) || dVar2.f2016a) && ((uri.getScheme().equals(Bridge.CAPACITOR_HTTP_SCHEME) || uri.getScheme().equals(Bridge.CAPACITOR_HTTPS_SCHEME)) && uri.getAuthority().equals(dVar2.f2017b) && uri.getPath().startsWith(str))) {
                dVar = dVar2.f2019d;
            }
            if (dVar != null) {
                webResourceResponse = dVar.f3720a.lambda$new$0(dVar.f3721b, uri.getPath().replaceFirst(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                if (webResourceResponse != null) {
                    break;
                }
            }
        }
        return webResourceResponse;
    }

    public void o() {
        View view;
        View view2 = (View) this.h;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new androidx.activity.o(view, 5));
    }

    @Override // f0.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.h).setExtras(bundle);
    }

    public /* synthetic */ f(Object obj, int i5) {
        this.f3503g = i5;
        this.h = obj;
    }

    public /* synthetic */ f(k1.j jVar) {
        this.f3503g = 24;
        this.h = (zzco) jVar.h;
    }

    public f(TextView textView) {
        this.f3503g = 18;
        this.h = new n0.g(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(f4.p pVar) {
        this.f3503g = 19;
        this.h = (y3.g) pVar;
    }

    public f(ClipData clipData, int i5) {
        this.f3503g = 4;
        this.h = com.google.android.gms.internal.ads.g.l(clipData, i5);
    }
}
