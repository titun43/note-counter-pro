package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzank(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i5 = bArr[25] * 20;
        this.zzg = i5;
        boolean z4 = (bArr[0] & 32) != 0;
        this.zzb = z4;
        if (z4) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i5, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i5, int i6, int i7, int i8, int i9) {
        if (i5 != i6) {
            int i10 = i9 | 33;
            int i11 = i5 & 1;
            int i12 = i5 & 2;
            boolean z4 = true;
            if (i11 == 0) {
                if (i12 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i7, i8, i10);
                }
                z4 = false;
            } else if (i12 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i7, i8, i10);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, i8, i10);
                z4 = false;
            }
            if ((i5 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, i10);
            } else {
                if (i11 != 0 || z4) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i7, i8, i10);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i5, int i6, int i7, int i8, int i9) {
        if (i5 != i6) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), i7, i8, i9 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i5, int i6, zzame zzameVar, zzdr zzdrVar) {
        String zzK;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int i13;
        int i14;
        int i15;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i5 + i6);
        zzerVar.zzh(i5);
        int i16 = 1;
        int i17 = 0;
        int i18 = 2;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int zzt = zzerVar.zzt();
        if (zzt == 0) {
            zzK = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            int zzg = zzerVar.zzg();
            Charset zzR = zzerVar.zzR();
            int zzg2 = zzerVar.zzg() - zzg;
            if (zzR == null) {
                zzR = StandardCharsets.UTF_8;
            }
            zzK = zzerVar.zzK(zzt - zzg2, zzR);
        }
        if (zzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zzK);
        int i19 = this.zzc;
        zzb(spannableStringBuilder2, i19, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i20 = i19;
        int i21 = this.zzd;
        zzc(spannableStringBuilder2, i21, -1, 0, spannableStringBuilder2.length(), 16711680);
        int i22 = i21;
        String str = this.zze;
        int length = spannableStringBuilder2.length();
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f5 = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int zzg3 = zzerVar.zzg();
            int zzB = zzerVar.zzB();
            int zzB2 = zzerVar.zzB();
            if (zzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i18 ? i16 : i17);
                int zzt2 = zzerVar.zzt();
                int i23 = i17;
                while (i23 < zzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i16 : i17);
                    int zzt3 = zzerVar.zzt();
                    int zzt4 = zzerVar.zzt();
                    zzerVar.zzk(i18);
                    int i24 = zzt2;
                    int zzs = zzerVar.zzs();
                    zzerVar.zzk(i16);
                    int zzB3 = zzerVar.zzB();
                    if (zzt4 > spannableStringBuilder2.length()) {
                        int length2 = spannableStringBuilder2.length();
                        i10 = i20;
                        i11 = i22;
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb = new StringBuilder(u.e(String.valueOf(length2), String.valueOf(zzt4).length() + 44, 2));
                        sb.append("Truncating styl end (");
                        sb.append(zzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        zzt4 = spannableStringBuilder.length();
                    } else {
                        i10 = i20;
                        i11 = i22;
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (zzt3 >= zzt4) {
                        StringBuilder sb2 = new StringBuilder(u.e(String.valueOf(zzt4), String.valueOf(zzt3).length() + 36, 2));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(zzt3);
                        sb2.append(") >= end (");
                        sb2.append(zzt4);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                        i14 = i10;
                        i13 = i23;
                        i12 = i24;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i15 = i11;
                    } else {
                        i12 = i24;
                        i13 = i23;
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i25 = i10;
                        zzb(spannableStringBuilder2, zzs, i25, zzt3, zzt4, 0);
                        i14 = i25;
                        i15 = i11;
                        zzc(spannableStringBuilder2, zzB3, i15, zzt3, zzt4, 0);
                    }
                    zzt2 = i12;
                    i20 = i14;
                    i22 = i15;
                    i16 = 1;
                    i18 = 2;
                    i23 = i13 + 1;
                    i17 = 0;
                }
                i7 = i20;
                i8 = i22;
                i9 = i18;
            } else {
                i7 = i20;
                i8 = i22;
                if (zzB2 == 1952608120 && this.zzb) {
                    i9 = 2;
                    zzgrc.zza(zzerVar.zzd() >= 2);
                    float zzt5 = zzerVar.zzt();
                    int i26 = this.zzg;
                    String str2 = zzfj.zza;
                    f5 = Math.max(0.0f, Math.min(zzt5 / i26, 0.95f));
                } else {
                    i9 = 2;
                }
            }
            zzerVar.zzh(zzg3 + zzB);
            i20 = i7;
            i18 = i9;
            i22 = i8;
            i16 = 1;
            i17 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder2);
        zzcwVar.zzf(f5, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
