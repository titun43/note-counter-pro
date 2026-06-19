package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzadt {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzads zza(byte[] bArr) {
        return zzb(new zzeq(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzads zzb(zzeq zzeqVar, boolean z4) {
        int i5;
        int zzc2 = zzc(zzeqVar);
        int zzd = zzd(zzeqVar);
        int zzj = zzeqVar.zzj(4);
        String l5 = u.l(new StringBuilder(String.valueOf(zzc2).length() + 8), "mp4a.40.", zzc2);
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzeqVar);
            zzc2 = zzc(zzeqVar);
            if (zzc2 == 22) {
                zzj = zzeqVar.zzj(4);
            }
        }
        if (z4) {
            int i6 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case zzbgj.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(zzc2).length() + 31);
                        sb.append("Unsupported audio object type: ");
                        sb.append(zzc2);
                        throw zzat.zzc(sb.toString());
                }
            }
            if (zzeqVar.zzi()) {
                zzee.zzc("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(14);
            }
            boolean zzi = zzeqVar.zzi();
            if (zzj == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzi) {
                    if (zzc2 == 22) {
                        zzeqVar.zzh(16);
                        i5 = 22;
                    } else {
                        i5 = zzc2;
                    }
                    if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                        zzeqVar.zzh(3);
                    }
                    zzeqVar.zzh(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case zzbgj.zzt.zzm /* 21 */:
                    case 22:
                    case 23:
                        int zzj2 = zzeqVar.zzj(2);
                        if (zzj2 == 2) {
                            i6 = zzj2;
                        }
                        StringBuilder sb2 = new StringBuilder(u.b(i6, 22));
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(i6);
                        throw zzat.zzc(sb2.toString());
                }
            }
            zzeqVar.zzh(3);
            if (zzi) {
            }
            switch (zzc2) {
            }
        }
        int i7 = zzc[zzj];
        if (i7 != -1) {
            return new zzads(zzd, i7, l5, null);
        }
        throw zzat.zzb(null, null);
    }

    private static int zzc(zzeq zzeqVar) {
        int zzj = zzeqVar.zzj(5);
        return zzj == 31 ? zzeqVar.zzj(6) + 32 : zzj;
    }

    private static int zzd(zzeq zzeqVar) {
        int zzj = zzeqVar.zzj(4);
        if (zzj == 15) {
            if (zzeqVar.zzc() >= 24) {
                return zzeqVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (zzj < 13) {
            return zzb[zzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
