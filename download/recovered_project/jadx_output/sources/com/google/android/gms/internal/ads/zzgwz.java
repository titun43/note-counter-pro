package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes.dex */
class zzgwz extends zzgxa {
    private volatile zzgxa zza;
    final zzgwv zzb;
    final Character zzc;

    public zzgwz(zzgwv zzgwvVar, Character ch) {
        this.zzb = zzgwvVar;
        boolean z4 = true;
        if (ch != null && zzgwvVar.zze('=')) {
            z4 = false;
        }
        zzgrc.zzf(z4, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwz) {
            zzgwz zzgwzVar = (zzgwz) obj;
            if (this.zzb.equals(zzgwzVar.zzb) && Objects.equals(this.zzc, zzgwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgwv zzgwvVar = this.zzb;
        sb.append(zzgwvVar);
        if (8 % zzgwvVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public void zza(Appendable appendable, byte[] bArr, int i5, int i6) {
        int i7 = 0;
        zzgrc.zzo(0, i6, bArr.length);
        while (i7 < i6) {
            int i8 = this.zzb.zzd;
            zze(appendable, bArr, i7, Math.min(i8, i6 - i7));
            i7 += i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public int zzb(byte[] bArr, CharSequence charSequence) {
        int i5;
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = zzg.length();
            throw new zzgwy(u.l(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < zzg.length()) {
            long j2 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i5 = zzgwvVar.zzc;
                if (i8 >= i5) {
                    break;
                }
                j2 <<= zzgwvVar.zzb;
                if (i6 + i8 < zzg.length()) {
                    j2 |= zzgwvVar.zzc(zzg.charAt(i9 + i6));
                    i9++;
                }
                i8++;
            }
            int i10 = zzgwvVar.zzd;
            int i11 = i9 * zzgwvVar.zzb;
            int i12 = (i10 - 1) * 8;
            while (i12 >= (i10 * 8) - i11) {
                bArr[i7] = (byte) ((j2 >>> i12) & 255);
                i12 -= 8;
                i7++;
            }
            i6 += i5;
        }
        return i7;
    }

    public zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwz(zzgwvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final int zzd(int i5) {
        zzgwv zzgwvVar = this.zzb;
        return zzgwvVar.zzc * zzgxs.zzb(i5, zzgwvVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i5, int i6) {
        zzgrc.zzo(i5, i5 + i6, bArr.length);
        zzgwv zzgwvVar = this.zzb;
        int i7 = zzgwvVar.zzd;
        int i8 = 0;
        zzgrc.zza(i6 <= i7);
        long j2 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            j2 = (j2 | (bArr[i5 + i9] & 255)) << 8;
        }
        int i10 = (i6 + 1) * 8;
        int i11 = zzgwvVar.zzb;
        while (i8 < i6 * 8) {
            appendable.append(zzgwvVar.zza(zzgwvVar.zza & ((int) (j2 >>> ((i10 - i11) - i8)))));
            i8 += i11;
        }
        if (this.zzc != null) {
            while (i8 < i7 * 8) {
                appendable.append('=');
                i8 += i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final int zzf(int i5) {
        return (int) (((this.zzb.zzb * i5) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzi() {
        zzgxa zzgxaVar = this.zza;
        if (zzgxaVar == null) {
            zzgwv zzgwvVar = this.zzb;
            zzgwv zzd = zzgwvVar.zzd();
            zzgxaVar = zzd == zzgwvVar ? this : zzc(zzd, this.zzc);
            this.zza = zzgxaVar;
        }
        return zzgxaVar;
    }

    public zzgwz(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }
}
