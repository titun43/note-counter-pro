package n;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.foreground.SystemForegroundService;
import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2619g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2620i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2621j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2622k;

    public /* synthetic */ e(Object obj, int i5, int i6, Object obj2, int i7) {
        this.f2619g = i7;
        this.f2622k = obj;
        this.h = i5;
        this.f2620i = i6;
        this.f2621j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2619g) {
            case 0:
                ((g) this.f2622k).h.onActivityResized(this.h, this.f2620i, (Bundle) this.f2621j);
                break;
            case 1:
                try {
                    synchronized (this) {
                        wait(this.h);
                    }
                } catch (InterruptedException e4) {
                    e4.printStackTrace();
                }
                CordovaWebViewImpl cordovaWebViewImpl = (CordovaWebViewImpl) this.f2622k;
                if (cordovaWebViewImpl.f2864d == this.f2620i && cordovaWebViewImpl.f2863c.getActivity() != null) {
                    ((CordovaWebViewImpl) this.f2622k).f2863c.getActivity().runOnUiThread((c0.a) this.f2621j);
                    break;
                } else {
                    ((CordovaWebViewImpl) this.f2622k).f2863c.getActivity();
                    break;
                }
            default:
                Notification notification = (Notification) this.f2621j;
                int i5 = this.h;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f2622k;
                if (Build.VERSION.SDK_INT < 29) {
                    systemForegroundService.startForeground(i5, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i5, notification, this.f2620i);
                    break;
                }
        }
    }

    public e(SystemForegroundService systemForegroundService, int i5, Notification notification, int i6) {
        this.f2619g = 2;
        this.f2622k = systemForegroundService;
        this.h = i5;
        this.f2621j = notification;
        this.f2620i = i6;
    }
}
