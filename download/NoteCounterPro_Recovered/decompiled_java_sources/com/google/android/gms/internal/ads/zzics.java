package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    public zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.zza[i5].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzida zzidaVar = this.zza[i5];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
