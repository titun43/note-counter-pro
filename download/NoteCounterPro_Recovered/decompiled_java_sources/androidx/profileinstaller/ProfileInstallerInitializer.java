package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzbgj;
import f1.b;
import g.m;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import y0.c;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // f1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // f1.b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: y0.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(applicationContext, 1), new Random().nextInt(Math.max(zzbgj.zzq.zzf, 1)) + 5000);
            }
        });
        return new c();
    }
}
