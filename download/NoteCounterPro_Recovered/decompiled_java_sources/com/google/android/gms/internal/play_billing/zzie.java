package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zza2 = zzhf.zza();
        int i5 = zziu.zza;
        zzid zzidVar = new zzid(zza2, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzidVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zziy
    public final zzix zza(Class cls) {
        int i5 = zziz.zza;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i6 = zziu.zza;
        }
        zzij zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i7 = zziu.zza;
            return zziq.zzc(zziz.zzm(), zzgz.zza(), zzb.zza());
        }
        int i8 = zziu.zza;
        return zzip.zzl(cls, zzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
    }
}
