package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzicx {
    public static final boolean zza(Object obj) {
        return !((zzicw) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzicw zzicwVar = (zzicw) obj;
        zzicw zzicwVar2 = (zzicw) obj2;
        if (!zzicwVar2.isEmpty()) {
            if (!zzicwVar.zze()) {
                zzicwVar = zzicwVar.zzc();
            }
            zzicwVar.zzb(zzicwVar2);
        }
        return zzicwVar;
    }
}
