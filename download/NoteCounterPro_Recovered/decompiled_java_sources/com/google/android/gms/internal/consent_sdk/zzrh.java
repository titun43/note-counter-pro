package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzrh implements zzsb {
    private static final zzro zza = new zzrf();
    private final zzro zzb;

    public zzrh() {
        zzqi zza2 = zzqi.zza();
        int i5 = zzpc.zza;
        zzrg zzrgVar = new zzrg(zza2, zza);
        byte[] bArr = zzqs.zzb;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsb
    public final zzsa zza(Class cls) {
        int i5 = zzsc.zza;
        if (!zzqm.class.isAssignableFrom(cls)) {
            int i6 = zzpc.zza;
        }
        zzrn zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i7 = zzpc.zza;
            return zzru.zzi(zzsc.zzn(), zzqd.zza(), zzb.zza());
        }
        int i8 = zzpc.zza;
        return zzrt.zzi(cls, zzb, zzrw.zza(), zzrd.zza(), zzsc.zzn(), zzb.zzc() + (-1) != 1 ? zzqd.zza() : null, zzrm.zza());
    }
}
