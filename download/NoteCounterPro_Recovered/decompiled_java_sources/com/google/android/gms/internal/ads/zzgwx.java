package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzgwx extends zzgwz {
    private zzgwx(zzgwv zzgwvVar, Character ch) {
        super(zzgwvVar, ch);
        zzgrc.zza(zzgwvVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final void zza(Appendable appendable, byte[] bArr, int i5, int i6) {
        int i7 = 0;
        zzgrc.zzo(0, i6, bArr.length);
        for (int i8 = i6; i8 >= 3; i8 -= 3) {
            int i9 = bArr[i7] & 255;
            int i10 = bArr[i7 + 1] & 255;
            int i11 = bArr[i7 + 2] & 255;
            zzgwv zzgwvVar = this.zzb;
            int i12 = (i10 << 8) | (i9 << 16) | i11;
            appendable.append(zzgwvVar.zza(i12 >>> 18));
            appendable.append(zzgwvVar.zza((i12 >>> 12) & 63));
            appendable.append(zzgwvVar.zza((i12 >>> 6) & 63));
            appendable.append(zzgwvVar.zza(i12 & 63));
            i7 += 3;
        }
        if (i7 < i6) {
            zze(appendable, bArr, i7, i6 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final int zzb(byte[] bArr, CharSequence charSequence) {
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = zzg.length();
            throw new zzgwy(u.l(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < zzg.length()) {
            int i7 = i6 + 1;
            int zzc = (zzgwvVar.zzc(zzg.charAt(i5 + 1)) << 12) | (zzgwvVar.zzc(zzg.charAt(i5)) << 18);
            bArr[i6] = (byte) (zzc >>> 16);
            int i8 = i5 + 2;
            if (i8 < zzg.length()) {
                int i9 = i5 + 3;
                int zzc2 = zzc | (zzgwvVar.zzc(zzg.charAt(i8)) << 6);
                int i10 = i6 + 2;
                bArr[i7] = (byte) ((zzc2 >>> 8) & 255);
                if (i9 < zzg.length()) {
                    i5 += 4;
                    i6 += 3;
                    bArr[i10] = (byte) ((zzc2 | zzgwvVar.zzc(zzg.charAt(i9))) & 255);
                } else {
                    i6 = i10;
                    i5 = i9;
                }
            } else {
                i5 = i8;
                i6 = i7;
            }
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwx(zzgwvVar, ch);
    }

    public zzgwx(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }
}
