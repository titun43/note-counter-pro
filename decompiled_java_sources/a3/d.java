package a3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.internal.b0;
import t2.h;

/* loaded from: classes.dex */
public abstract class d {
    private final String zza;
    private Object zzb;

    public d(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) {
        Context context2;
        if (this.zzb == null) {
            b0.g(context);
            int i5 = h.f3377c;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new c("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) context2.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e4) {
                throw new c("Could not load creator class.", e4);
            } catch (IllegalAccessException e5) {
                throw new c("Could not access creator.", e5);
            } catch (InstantiationException e6) {
                throw new c("Could not instantiate creator.", e6);
            }
        }
        return this.zzb;
    }
}
