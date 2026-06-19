package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaia implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaia(int i5, String str, String str2, int i6, int i7, int i8, int i9, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i6;
        this.zze = i7;
        this.zzf = i8;
        this.zzg = i9;
        this.zzh = bArr;
    }

    public static zzaia zzb(zzer zzerVar) {
        int zzB = zzerVar.zzB();
        String zzh = zzas.zzh(zzerVar.zzK(zzerVar.zzB(), StandardCharsets.US_ASCII));
        String zzK = zzerVar.zzK(zzerVar.zzB(), StandardCharsets.UTF_8);
        int zzB2 = zzerVar.zzB();
        int zzB3 = zzerVar.zzB();
        int zzB4 = zzerVar.zzB();
        int zzB5 = zzerVar.zzB();
        int zzB6 = zzerVar.zzB();
        byte[] bArr = new byte[zzB6];
        zzerVar.zzm(bArr, 0, zzB6);
        return new zzaia(zzB, zzh, zzK, zzB2, zzB3, zzB4, zzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaia.class == obj.getClass()) {
            zzaia zzaiaVar = (zzaia) obj;
            if (this.zza == zzaiaVar.zza && this.zzb.equals(zzaiaVar.zzb) && this.zzc.equals(zzaiaVar.zzc) && this.zzd == zzaiaVar.zzd && this.zze == zzaiaVar.zze && this.zzf == zzaiaVar.zzf && this.zzg == zzaiaVar.zzg && Arrays.equals(this.zzh, zzaiaVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zza + 527;
        int hashCode = this.zzb.hashCode() + (i5 * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        return u.n(new StringBuilder(str2.length() + length + 32), "Picture: mimeType=", str, ", description=", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
