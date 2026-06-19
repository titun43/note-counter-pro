package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzla implements zzlh {
    private final zzlh[] zza;

    public zzla(zzlh... zzlhVarArr) {
        this.zza = zzlhVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlg zzb(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            zzlh zzlhVar = zzlhVarArr[i5];
            if (zzlhVar.zzc(cls)) {
                return zzlhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean zzc(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzlhVarArr[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
