package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzid implements zzik {
    private final zzik[] zza;

    public zzid(zzik... zzikVarArr) {
        this.zza = zzikVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final zzij zzb(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzik zzikVar = this.zza[i5];
            if (zzikVar.zzc(cls)) {
                return zzikVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzik
    public final boolean zzc(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.zza[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
