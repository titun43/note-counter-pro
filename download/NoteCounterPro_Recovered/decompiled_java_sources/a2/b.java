package a2;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.view.ViewGroup;
import androidx.activity.f0;
import androidx.activity.g;
import androidx.activity.s;
import com.capacitorjs.plugins.filesystem.LegacyFilesystemImplementation;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.banner.BannerExecutor;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.getcapacitor.community.admob.interstitial.AdInterstitialExecutor;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import g.p;
import g4.i;
import k.u0;
import org.apache.cordova.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10i;

    public /* synthetic */ b(int i5, Object obj, Object obj2) {
        this.f9g = i5;
        this.h = obj;
        this.f10i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f9g;
        int i6 = 0;
        Object obj = this.f10i;
        Object obj2 = this.h;
        switch (i5) {
            case 0:
                AdConsentExecutor.lambda$showPrivacyOptionsForm$3((Activity) obj2, (PluginCall) obj);
                return;
            case 1:
                s sVar = (s) obj2;
                sVar.getLifecycle().a(new g(i6, (f0) obj, sVar));
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                i.e(viewGroup, "$container");
                viewGroup.endViewTransition(null);
                throw null;
            case 3:
                ((LegacyFilesystemImplementation.FilesystemDownloadCallback) obj2).onSuccess((JSObject) obj);
                return;
            case 4:
                ((LegacyFilesystemImplementation.FilesystemDownloadCallback) obj2).onError((Exception) obj);
                return;
            case 5:
                ((BannerExecutor) obj2).lambda$hideBanner$1((PluginCall) obj);
                return;
            case 6:
                ((AdInterstitialExecutor) obj2).lambda$showInterstitial$1((PluginCall) obj);
                return;
            case 7:
                ((MockCordovaWebViewImpl.CapacitorEvalBridgeMode) obj2).lambda$onNativeToJsMessageAvailable$0((h0) obj);
                return;
            case 8:
                p pVar = (p) obj2;
                Runnable runnable = (Runnable) obj;
                pVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    pVar.a();
                }
            case 9:
                int i7 = JobInfoSchedulerService.f905g;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            default:
                ((u0) obj2).b((Typeface) obj);
                return;
        }
    }
}
