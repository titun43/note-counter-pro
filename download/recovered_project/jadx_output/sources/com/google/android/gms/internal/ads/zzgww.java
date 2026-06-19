package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
final class zzgww extends zzgwz {
    final char[] zza;

    private zzgww(zzgwv zzgwvVar) {
        super(zzgwvVar, null);
        this.zza = new char[AdRequest.MAX_CONTENT_URL_LENGTH];
        zzgrc.zza(zzgwvVar.zzf().length == 16);
        for (int i5 = 0; i5 < 256; i5++) {
            this.zza[i5] = zzgwvVar.zza(i5 >>> 4);
            this.zza[i5 | 256] = zzgwvVar.zza(i5 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final void zza(Appendable appendable, byte[] bArr, int i5, int i6) {
        zzgrc.zzo(0, i6, bArr.length);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = bArr[i7] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i8]);
            appendable.append(cArr[i8 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final int zzb(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgwy(u.l(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < charSequence.length()) {
            zzgwv zzgwvVar = this.zzb;
            bArr[i6] = (byte) (zzgwvVar.zzc(charSequence.charAt(i5 + 1)) | (zzgwvVar.zzc(charSequence.charAt(i5)) << 4));
            i5 += 2;
            i6++;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgww(zzgwvVar);
    }

    public zzgww(String str, String str2) {
        this(new zzgwv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
