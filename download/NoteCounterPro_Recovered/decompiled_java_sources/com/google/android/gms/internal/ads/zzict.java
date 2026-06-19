package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzict implements zzidv {
    private static final zzida zzb = new zzicr();
    private final zzida zza;

    public zzict() {
        zzibk zza = zzibk.zza();
        int i5 = zziaa.zza;
        zzics zzicsVar = new zzics(zza, zzb);
        byte[] bArr = zzice.zzb;
        this.zza = zzicsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final zzidu zza(Class cls) {
        int i5 = zzidw.zza;
        if (!zzibr.class.isAssignableFrom(cls)) {
            int i6 = zziaa.zza;
        }
        zzicz zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i7 = zziaa.zza;
            return zzidg.zzh(zzidw.zzF(), zzibe.zza(), zzc.zzb());
        }
        int i8 = zziaa.zza;
        return zzidf.zzm(cls, zzc, zzidj.zza(), zzicp.zza(), zzidw.zzF(), zzc.zzc() + (-1) != 1 ? zzibe.zza() : null, zzicy.zza());
    }
}
