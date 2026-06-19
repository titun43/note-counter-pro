package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public class zzyw implements zzaac {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzyw(zzbg zzbgVar, int[] iArr, int i5) {
        int length = iArr.length;
        zzgrc.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.zzd[i6] = zzbgVar.zza(iArr[i6]);
        }
        Arrays.sort(this.zzd, zzyv.zza);
        this.zzc = new int[this.zzb];
        for (int i7 = 0; i7 < this.zzb; i7++) {
            this.zzc[i7] = zzbgVar.zzb(this.zzd[i7]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyw zzywVar = (zzyw) obj;
            if (this.zza.equals(zzywVar.zza) && Arrays.equals(this.zzc, zzywVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zze;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final zzv zzb(int i5) {
        return this.zzd[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzf(int i5) {
        return this.zzc[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final int zzg(int i5) {
        for (int i6 = 0; i6 < this.zzb; i6++) {
            if (this.zzc[i6] == i5) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final int zzh() {
        return this.zzc[0];
    }
}
