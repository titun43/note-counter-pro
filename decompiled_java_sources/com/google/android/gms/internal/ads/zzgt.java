package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzgt implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhf zzd;

    public zzgt(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.zzc++;
    }

    public final void zzf(zzhf zzhfVar) {
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzhz) this.zzb.get(i5)).zza(this, zzhfVar, this.zza);
        }
    }

    public final void zzg(zzhf zzhfVar) {
        this.zzd = zzhfVar;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzhz) this.zzb.get(i5)).zzb(this, zzhfVar, this.zza);
        }
    }

    public final void zzh(int i5) {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            ((zzhz) this.zzb.get(i6)).zzc(this, zzhfVar, this.zza, i5);
        }
    }

    public final void zzi() {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzhz) this.zzb.get(i5)).zzd(this, zzhfVar, this.zza);
        }
        this.zzd = null;
    }
}
