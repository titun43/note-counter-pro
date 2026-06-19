package j1;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.WeakHashMap;
import k1.j;
import k1.m;
import k1.n;
import k1.o;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2020a;

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2021b;

    static {
        Uri.parse("*");
        Uri.parse(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        f2020a = true;
        f2021b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set) {
        if (!m.f2420e.b()) {
            throw m.a();
        }
        o d5 = d(webView);
    }

    public static void b(WebView webView, String str, Set set, e eVar) {
        if (!m.f2419d.b()) {
            throw m.a();
        }
        o d5 = d(webView);
        d5.f2425a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new y4.a(new j(eVar, 0)));
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o d(WebView webView) {
        if (!m.f2423i.b() || !f2020a) {
            return new o(n.f2424a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f2021b;
        o oVar = (o) weakHashMap.get(webView);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(n.f2424a.createWebView(webView));
        weakHashMap.put(webView, oVar2);
        return oVar2;
    }

    public static String e() {
        if (m.f2421f.b()) {
            return n.f2424a.getStatics().getVariationsHeader();
        }
        throw m.a();
    }

    public static WebViewClient f(WebView webView) {
        Looper webViewLooper;
        WebViewClient webViewClient;
        k1.b bVar = m.f2417b;
        if (bVar.a()) {
            webViewClient = webView.getWebViewClient();
            return webViewClient;
        }
        if (!bVar.b()) {
            throw m.a();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        return d(webView).f2425a.getWebViewClient();
    }
}
