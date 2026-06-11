package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzape {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzape(int i5, int i6) {
        this.zzc = i5;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i5) {
        zzgrc.zzi(!this.zzd);
        boolean z4 = i5 == this.zzc;
        this.zzd = z4;
        if (z4) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i5, int i6) {
        if (this.zzd) {
            int i7 = i6 - i5;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i8 = this.zzb + i7;
            if (length < i8) {
                this.zza = Arrays.copyOf(bArr2, i8 + i8);
            }
            System.arraycopy(bArr, i5, this.zza, this.zzb, i7);
            this.zzb += i7;
        }
    }

    public final boolean zze(int i5) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i5;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
