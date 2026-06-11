package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.AdRequest;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzun {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public zzun(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z4;
        this.zze = z7;
        this.zzf = z9;
        this.zzh = z10;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    public static zzun zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str6;
        boolean z13 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z14 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z15 = z8 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z9 = z4;
                z10 = z5;
                z11 = z6;
                z12 = true;
                str4 = str;
                return new zzun(str4, str6, str5, codecCapabilities2, z9, z10, z11, z13, z14, z15, z12);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z9 = z4;
        z10 = z5;
        z11 = z6;
        z12 = false;
        str6 = str2;
        return new zzun(str4, str6, str5, codecCapabilities2, z9, z10, z11, z13, z14, z15, z12);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzo) || str.equals(zzvg.zzg(zzvVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r1.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r1.equals("video/av01") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzk(zzv zzvVar, boolean z4) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair zzd = zzdo.zzd(zzvVar);
        String str = zzvVar.zzo;
        if (str != null && str.equals("video/mv-hevc")) {
            String zzh = zzas.zzh(this.zzc);
            if (!zzh.equals("video/mv-hevc")) {
                if (zzh.equals("video/hevc")) {
                    int i5 = zzvg.zza;
                    String zzk = zzgm.zzk(zzvVar.zzr);
                    if (zzk == null) {
                        zzd = null;
                    } else {
                        String trim = zzk.trim();
                        String str2 = zzfj.zza;
                        zzd = zzdo.zze(zzk, trim.split("\\.", -1), zzvVar.zzE);
                    }
                }
            }
            return true;
        }
        if (zzd != null) {
            int intValue = ((Integer) zzd.first).intValue();
            int intValue2 = ((Integer) zzd.second).intValue();
            int i6 = 8;
            if ("video/dolby-vision".equals(str)) {
                String str3 = this.zzb;
                int hashCode = str3.hashCode();
                if (hashCode != -1662735862) {
                    if (hashCode != -1662541442) {
                        if (hashCode == 1331836730 && str3.equals("video/avc")) {
                            intValue = 8;
                            intValue2 = 0;
                        }
                    }
                }
            }
            if (!this.zzi && !this.zzb.equals("audio/ac4")) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzb = zzb();
            String str4 = this.zzb;
            if (str4.equals("audio/ac4") && zzb.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                    i6 = 16;
                }
                zzb = new MediaCodecInfo.CodecProfileLevel[]{zzvg.zzf(257, i6), zzvg.zzf(513, i6), zzvg.zzf(514, i6), zzvg.zzf(1026, i6), zzvg.zzf(1028, i6)};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzb) {
                if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z4)) {
                    if ("video/hevc".equals(str4) && intValue == 2) {
                        String str5 = Build.DEVICE;
                        if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                        }
                    }
                }
            }
            String str6 = zzvVar.zzk;
            String str7 = this.zzc;
            zzm(u.n(new StringBuilder(str7.length() + String.valueOf(str6).length() + 22), "codec.profileLevel, ", str6, ", ", str7));
            return false;
        }
        return true;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzo, "audio/flac") && zzvVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfj.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 14 + 2 + length + 3 + length2 + 1);
        s.c.e(sb, "NoSupport [", str, "] [", str4);
        s.c.e(sb, ", ", str3, "] [", str2);
        sb.append("]");
        zzee.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i6, double d5) {
        Point zzo = zzo(videoCapabilities, i5, i6);
        int i7 = zzo.x;
        int i8 = zzo.y;
        if (d5 == -1.0d || d5 < 1.0d) {
            return videoCapabilities.isSizeSupported(i7, i8);
        }
        double floor = Math.floor(d5);
        if (!videoCapabilities.areSizeAndRateSupported(i7, i8, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i7, i8);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i6) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfj.zza;
        return new Point((((i5 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i6 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(zzv zzvVar) {
        int i5;
        if (!zzj(zzvVar) || !zzk(zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i6 = zzvVar.zzv;
            if (i6 <= 0 || (i5 = zzvVar.zzw) <= 0) {
                return true;
            }
            return zzg(i6, i5, zzvVar.zzz);
        }
        int i7 = zzvVar.zzH;
        if (i7 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i7)) {
                zzm(u.l(new StringBuilder(String.valueOf(i7).length() + 20), "sampleRate.support, ", i7));
                return false;
            }
        }
        int i8 = zzvVar.zzG;
        if (i8 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i9 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb = new StringBuilder(u.e(String.valueOf(i9), String.valueOf(maxInputChannelCount).length() + str.length() + 32 + 4, 1));
                sb.append("AssumedMaxChannelAdjustment: ");
                sb.append(str);
                sb.append(", [");
                sb.append(maxInputChannelCount);
                sb.append(" to ");
                sb.append(i9);
                sb.append("]");
                zzee.zzc("MediaCodecInfo", sb.toString());
                maxInputChannelCount = i9;
            }
            if (maxInputChannelCount < i8) {
                zzm(u.l(new StringBuilder(String.valueOf(i8).length() + 22), "channelCount.support, ", i8));
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(zzv zzvVar) {
        return zzj(zzvVar) && zzk(zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair zzd = zzdo.zzd(zzvVar);
        return zzd != null && ((Integer) zzd.first).intValue() == 42;
    }

    public final zzio zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i5;
        String str = zzvVar.zzo;
        String str2 = zzvVar2.zzo;
        int i6 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzA != zzvVar2.zzA) {
                i6 |= 1024;
            }
            boolean z4 = (zzvVar.zzv == zzvVar2.zzv && zzvVar.zzw == zzvVar2.zzw) ? false : true;
            if (!this.zze && z4) {
                i6 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            zzi zziVar = zzvVar.zzE;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzE)) && !Objects.equals(zziVar, zzvVar2.zzE)) {
                i6 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i6 |= 2;
            }
            int i7 = zzvVar.zzx;
            if (i7 != -1 && (i5 = zzvVar.zzy) != -1 && i7 == zzvVar2.zzx && i5 == zzvVar2.zzy && z4) {
                i6 |= 2;
            }
            if (i6 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair zzd = zzdo.zzd(zzvVar);
                Pair zzd2 = zzdo.zzd(zzvVar2);
                if (zzd == null || zzd2 == null || !((Integer) zzd.first).equals(zzd2.first)) {
                    i6 = 2;
                }
            }
            if (i6 == 0) {
                return new zzio(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzG != zzvVar4.zzG) {
                i6 |= 4096;
            }
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i6 |= 8192;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i6 |= 16384;
            }
            if (i6 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair zzd3 = zzdo.zzd(zzvVar3);
                    Pair zzd4 = zzdo.zzd(zzvVar4);
                    if (zzd3 != null && zzd4 != null) {
                        int intValue = ((Integer) zzd3.first).intValue();
                        int intValue2 = ((Integer) zzd4.first).intValue();
                        if (intValue == 42 && intValue2 == 42) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && zzd3.equals(zzd4)) {
                            return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i6 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzio(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i6 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i6 |= 2;
            }
            if (i6 == 0) {
                return new zzio(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zzio(this.zza, zzvVar3, zzvVar4, 0, i6);
    }

    public final boolean zzg(int i5, int i6, double d5) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int zza = zzup.zza(videoCapabilities, i5, i6, d5);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder sb = new StringBuilder(u.e(String.valueOf(i6), String.valueOf(i5).length() + 20, 1) + String.valueOf(d5).length());
                    u.s(sb, "sizeAndRate.cover, ", i5, "x", i6);
                    sb.append("@");
                    sb.append(d5);
                    zzm(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzn(videoCapabilities, i5, i6, d5)) {
            if (i5 < i6) {
                String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i6, i5, d5)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + u.b(i5, 22) + 1 + String.valueOf(d5).length());
                    u.s(sb2, "sizeAndRate.rotated, ", i5, "x", i6);
                    sb2.append("@");
                    sb2.append(d5);
                    String sb3 = sb2.toString();
                    String str2 = this.zzb;
                    int length = str.length();
                    String str3 = zzfj.zza;
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    s.c.e(sb4, ", ", str2, "] [", str3);
                    sb4.append("]");
                    zzee.zza("MediaCodecInfo", sb4.toString());
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i6).length() + u.b(i5, 22) + 1 + String.valueOf(d5).length());
            u.s(sb5, "sizeAndRate.support, ", i5, "x", i6);
            sb5.append("@");
            sb5.append(d5);
            zzm(sb5.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i5, int i6) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f5 = this.zzl;
        if (f5 != -3.4028235E38f && this.zzj == i5 && this.zzk == i6) {
            return f5;
        }
        float f6 = 1024.0f;
        if (!zzg(i5, i6, 1024.0d)) {
            float f7 = 0.0f;
            while (true) {
                float f8 = f6 - f7;
                if (Math.abs(f8) <= 5.0f) {
                    break;
                }
                float f9 = (f8 / 2.0f) + f7;
                boolean zzg = zzg(i5, i6, f9);
                if (true == zzg) {
                    f7 = f9;
                }
                if (true != zzg) {
                    f6 = f9;
                }
            }
            f6 = f7;
        }
        this.zzl = f6;
        this.zzj = i5;
        this.zzk = i6;
        return f6;
    }

    public final Point zzi(int i5, int i6) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i5, i6);
    }
}
