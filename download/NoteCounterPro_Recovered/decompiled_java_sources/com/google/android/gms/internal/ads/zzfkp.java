package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.b0;
import h3.n;

/* loaded from: classes.dex */
public final class zzfkp {
    static h3.g zza;
    public static q2.a zzb;
    private static final Object zzc = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(8:3|4|(1:6)|7|(3:9|1b|(2:(3:18|31|(1:24))|30))|36|37|30) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        r5 = r4.getMessage();
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 31);
        r3.append("Failed to get app set ID info: ");
        r3.append(r5);
        com.google.android.gms.ads.internal.util.zze.zza(r3.toString());
        r5 = new h3.n();
        r5.d(r4);
        com.google.android.gms.internal.ads.zzfkp.zza = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(Context context, boolean z4) {
        boolean z5;
        boolean z6;
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = new com.google.android.gms.internal.appset.zzr(context);
                }
                h3.g gVar = zza;
                if (gVar != null) {
                    n nVar = (n) gVar;
                    synchronized (nVar.f1727a) {
                        z5 = nVar.f1729c;
                    }
                    if (!z5 || zza.c()) {
                        if (z4) {
                            n nVar2 = (n) zza;
                            synchronized (nVar2.f1727a) {
                                z6 = nVar2.f1729c;
                            }
                            if (z6) {
                            }
                        }
                    }
                }
                q2.a aVar = zzb;
                b0.h(aVar, "the appSetIdClient shouldn't be null");
                zza = aVar.getAppSetIdInfo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h3.g zzb(Context context) {
        h3.g gVar;
        zza(context, false);
        synchronized (zzc) {
            gVar = zza;
        }
        return gVar;
    }
}
