package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzief {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i5, long j2);

    public abstract void zzb(Object obj, int i5, int i6);

    public abstract void zzc(Object obj, int i5, long j2);

    public abstract void zzd(Object obj, int i5, zzian zzianVar);

    public abstract void zze(Object obj, int i5, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzidp zzidpVar, int i5) {
        int zzc = zzidpVar.zzc();
        int i6 = zzc >>> 3;
        int i7 = zzc & 7;
        if (i7 == 0) {
            zza(obj, i6, zzidpVar.zzh());
            return true;
        }
        if (i7 == 1) {
            zzc(obj, i6, zzidpVar.zzj());
            return true;
        }
        if (i7 == 2) {
            zzd(obj, i6, zzidpVar.zzq());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                if (i5 != 0) {
                    return false;
                }
                throw new zzicg("Protocol message end-group tag did not match expected tag.");
            }
            if (i7 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i6, zzidpVar.zzk());
            return true;
        }
        Object zzf = zzf();
        int i8 = i6 << 3;
        int i9 = i5 + 1;
        if (i9 >= zza) {
            throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzidpVar.zzb() != Integer.MAX_VALUE && zzk(zzf, zzidpVar, i9)) {
        }
        if ((i8 | 4) != zzidpVar.zzc()) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i6, zzg(zzf));
        return true;
    }
}
