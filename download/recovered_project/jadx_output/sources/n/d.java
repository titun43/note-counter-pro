package n;

import android.net.Uri;
import android.os.Bundle;
import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2614g = 0;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2615i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2616j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2617k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2618l;

    public d(CordovaWebViewImpl cordovaWebViewImpl, int i5, e eVar, String str, boolean z4) {
        this.f2618l = cordovaWebViewImpl;
        this.h = i5;
        this.f2616j = eVar;
        this.f2617k = str;
        this.f2615i = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2614g) {
            case 0:
                ((g) this.f2618l).h.onRelationshipValidationResult(this.h, (Uri) this.f2616j, this.f2615i, (Bundle) this.f2617k);
                break;
            default:
                CordovaWebViewImpl cordovaWebViewImpl = (CordovaWebViewImpl) this.f2618l;
                if (this.h > 0) {
                    cordovaWebViewImpl.f2863c.getThreadPool().execute((e) this.f2616j);
                }
                cordovaWebViewImpl.f2862b.loadUrl((String) this.f2617k, this.f2615i);
                break;
        }
    }

    public d(g gVar, int i5, Uri uri, boolean z4, Bundle bundle) {
        this.f2618l = gVar;
        this.h = i5;
        this.f2616j = uri;
        this.f2615i = z4;
        this.f2617k = bundle;
    }
}
