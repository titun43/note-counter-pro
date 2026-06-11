package g;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1591g;
    public final /* synthetic */ Context h;

    public /* synthetic */ m(Context context, int i5) {
        this.f1591g = i5;
        this.h = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1591g) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = this.h;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (r.a().b()) {
                            String e4 = u.e.e(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                o.b(systemService, n.a(e4));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                r.f1616l = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new m(this.h, 2));
                break;
            default:
                y0.e.t(this.h, new l.a(1), y0.e.f3767a, false);
                break;
        }
    }
}
