package a2;

import android.app.Activity;
import android.content.Context;
import android.webkit.ValueCallback;
import androidx.emoji2.text.m;
import androidx.emoji2.text.v;
import androidx.emoji2.text.w;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.getcapacitor.community.admob.models.Executor;
import com.getcapacitor.community.admob.rewarded.AdRewardExecutor;
import com.getcapacitor.community.admob.rewardedinterstitial.AdRewardInterstitialExecutor;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import f0.g;
import f2.i;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import k1.j;
import m2.h;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f17j;

    public /* synthetic */ f(Executor executor, PluginCall pluginCall, x2.a aVar, int i5) {
        this.f15g = i5;
        this.h = executor;
        this.f17j = pluginCall;
        this.f16i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15g) {
            case 0:
                ((AdConsentExecutor) this.h).lambda$showConsentForm$5((Activity) this.f16i, (PluginCall) this.f17j);
                return;
            case 1:
                j jVar = (j) this.h;
                z2.b bVar = (z2.b) this.f16i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f17j;
                try {
                    w k5 = y4.b.k((Context) jVar.h);
                    if (k5 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v vVar = (v) k5.f294a;
                    synchronized (vVar.f288j) {
                        vVar.f290l = threadPoolExecutor;
                    }
                    k5.f294a.i(new m(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bVar.s(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                ((AdRewardExecutor) this.h).lambda$showRewardVideoAd$1((PluginCall) this.f17j, (x2.a) this.f16i);
                return;
            case 3:
                ((AdRewardInterstitialExecutor) this.h).lambda$showRewardInterstitialAd$1((PluginCall) this.f17j, (x2.a) this.f16i);
                return;
            case 4:
                ((MockCordovaWebViewImpl) this.h).lambda$eval$0((String) this.f16i, (ValueCallback) this.f17j);
                return;
            default:
                k2.b bVar2 = (k2.b) this.h;
                f2.j jVar2 = (f2.j) this.f16i;
                String str = jVar2.f1471a;
                i iVar = (i) this.f17j;
                bVar2.getClass();
                Logger logger = k2.b.f2429f;
                try {
                    g2.e a5 = bVar2.f2432c.a(str);
                    if (a5 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((h) bVar2.f2434e).g(new k2.a(bVar2, jVar2, ((d2.c) a5).a(iVar), 0));
                    }
                    return;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i5) {
        this.f15g = i5;
        this.h = obj;
        this.f16i = obj2;
        this.f17j = obj3;
    }

    public /* synthetic */ f(k2.b bVar, f2.j jVar, g gVar, i iVar) {
        this.f15g = 5;
        this.h = bVar;
        this.f16i = jVar;
        this.f17j = iVar;
    }
}
