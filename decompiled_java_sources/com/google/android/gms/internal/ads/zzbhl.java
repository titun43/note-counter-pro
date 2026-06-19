package com.google.android.gms.internal.ads;

import android.os.SystemClock;

@Deprecated
/* loaded from: classes.dex */
public final class zzbhl {
    public static boolean zza(zzbht zzbhtVar, zzbhq zzbhqVar, String... strArr) {
        if (zzbhqVar == null) {
            return false;
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zzbhtVar.zzb(zzbhqVar, SystemClock.elapsedRealtime(), strArr);
        return true;
    }
}
