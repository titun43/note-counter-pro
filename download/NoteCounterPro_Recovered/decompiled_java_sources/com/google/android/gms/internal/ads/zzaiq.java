package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaiq extends zzain {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzaiq(int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i5;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiq.class == obj.getClass()) {
            zzaiq zzaiqVar = (zzaiq) obj;
            if (this.zza == zzaiqVar.zza && this.zzb == zzaiqVar.zzb && this.zzc == zzaiqVar.zzc && Arrays.equals(this.zzd, zzaiqVar.zzd) && Arrays.equals(this.zze, zzaiqVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza + 527;
        int[] iArr = this.zzd;
        int hashCode = Arrays.hashCode(iArr) + (((((i5 * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (hashCode * 31);
    }
}
