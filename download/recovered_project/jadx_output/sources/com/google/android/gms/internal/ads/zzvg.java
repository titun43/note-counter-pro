package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzvg {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzun zza() {
        List zzb2 = zzb("audio/raw", false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (zzun) zzb2.get(0);
    }

    public static synchronized List zzb(String str, boolean z4, boolean z5) {
        synchronized (zzvg.class) {
            try {
                zzux zzuxVar = new zzux(str, z4, z5);
                HashMap hashMap = zzb;
                List list = (List) hashMap.get(zzuxVar);
                if (list != null) {
                    return list;
                }
                ArrayList zzh = zzh(zzuxVar, new zzvb(z4, z5, str.equals("video/mv-hevc")));
                if (z4) {
                    zzh.isEmpty();
                }
                if ("audio/raw".equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzh.size() == 1 && ((zzun) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        zzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    zzj(zzh, zzvc.zza);
                }
                if (Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) zzh.get(0)).zza)) {
                    zzh.add((zzun) zzh.remove(0));
                }
                zzguf zzq = zzguf.zzq(zzh);
                hashMap.put(zzuxVar, zzq);
                return zzq;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z4, boolean z5) {
        List zza2 = zzuwVar.zza(zzvVar.zzo, z4, z5);
        List zzd = zzd(zzuwVar, zzvVar, z4, z5);
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(zza2);
        zzgucVar.zzh(zzd);
        return zzgucVar.zzi();
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z4, boolean z5) {
        String zzg = zzg(zzvVar);
        return zzg == null ? zzguf.zzi() : zzuwVar.zza(zzg, z4, z5);
    }

    public static List zze(List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvf() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // com.google.android.gms.internal.ads.zzvf
            public final /* synthetic */ int zza(Object obj) {
                int i5 = zzvg.zza;
                return ((zzun) obj).zzd(zzv.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i5, int i6) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i5;
        codecProfileLevel.level = i6;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair zzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zzd = zzdo.zzd(zzvVar)) != null) {
            int intValue = ((Integer) zzd.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:39))|40|(1:42)(2:85|(1:87)(1:88))|43|(1:45)(2:77|(1:84)(1:83))|(4:(8:(1:48)|49|50|51|52|53|54|55)|53|54|55)|(2:68|(3:71|72|73))|49|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:30:0x00f8, B:34:0x0114, B:40:0x0128, B:42:0x0130, B:43:0x0149, B:45:0x0153, B:77:0x0158, B:79:0x0168, B:81:0x0170, B:85:0x013c), top: B:29:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:30:0x00f8, B:34:0x0114, B:40:0x0128, B:42:0x0130, B:43:0x0149, B:45:0x0153, B:77:0x0158, B:79:0x0168, B:81:0x0170, B:85:0x013c), top: B:29:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:30:0x00f8, B:34:0x0114, B:40:0x0128, B:42:0x0130, B:43:0x0149, B:45:0x0153, B:77:0x0158, B:79:0x0168, B:81:0x0170, B:85:0x013c), top: B:29:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:30:0x00f8, B:34:0x0114, B:40:0x0128, B:42:0x0130, B:43:0x0149, B:45:0x0153, B:77:0x0158, B:79:0x0168, B:81:0x0170, B:85:0x013c), top: B:29:0x00f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zzux zzuxVar, zzuz zzuzVar) {
        String str;
        String str2;
        int i5;
        int i6;
        String str3;
        String str4;
        String str5;
        boolean z4;
        int i7;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        boolean z5;
        boolean zzi;
        boolean z6;
        boolean z7;
        boolean z8;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean isAlias;
        zzux zzuxVar2 = zzuxVar;
        zzuz zzuzVar2 = zzuzVar;
        String str6 = "secure-playback";
        String str7 = "tunneled-playback";
        try {
            ArrayList arrayList = new ArrayList();
            String str8 = zzuxVar2.zza;
            int zza2 = zzuzVar2.zza();
            boolean zzc = zzuzVar2.zzc();
            int i8 = 0;
            while (i8 < zza2) {
                MediaCodecInfo zzb2 = zzuzVar2.zzb(i8);
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = zzb2.isAlias();
                    if (isAlias) {
                        str = str6;
                        str2 = str7;
                        i6 = zza2;
                        i5 = i8;
                        i8 = i5 + 1;
                        zzuzVar2 = zzuzVar;
                        zza2 = i6;
                        str6 = str;
                        str7 = str2;
                        zzuxVar2 = zzuxVar;
                    }
                }
                int i9 = zza2;
                String name = zzb2.getName();
                if (!zzb2.isEncoder()) {
                    if (!zzc) {
                        if (!name.endsWith(".secure")) {
                        }
                    }
                    String[] supportedTypes = zzb2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            int i11 = i10;
                            str3 = supportedTypes[i11];
                            if (str3.equalsIgnoreCase(str8)) {
                                break;
                            }
                            i10 = i11 + 1;
                        } else {
                            if (str8.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str3 = "video/hevcdv";
                                } else {
                                    if (!"OMX.RTK.video.decoder".equals(name)) {
                                        if ("OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        }
                                        str3 = null;
                                    }
                                    str3 = "video/dv_hevc";
                                }
                            } else if (str8.equals("video/mv-hevc")) {
                                if ("c2.qti.mvhevc.decoder".equals(name) || "c2.qti.mvhevc.decoder.secure".equals(name)) {
                                    str3 = "video/x-mvhevc";
                                }
                                str3 = null;
                            } else if (str8.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str3 = "audio/x-lg-alac";
                            } else if (str8.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str3 = "audio/x-lg-flac";
                            } else {
                                if (str8.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str3 = "audio/lg-ac3";
                                }
                                str3 = null;
                            }
                            i8 = i5 + 1;
                            zzuzVar2 = zzuzVar;
                            zza2 = i6;
                            str6 = str;
                            str7 = str2;
                            zzuxVar2 = zzuxVar;
                        }
                    }
                    if (str3 != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb2.getCapabilitiesForType(str3);
                            boolean zzd = zzuzVar2.zzd(str7, str3, capabilitiesForType);
                            boolean zze = zzuzVar2.zze(str7, str3, capabilitiesForType);
                            str2 = str7;
                            if (zzuxVar2.zzc) {
                                if (!zzd) {
                                    str = str6;
                                    i5 = i8;
                                    i6 = i9;
                                }
                                boolean zzd2 = zzuzVar2.zzd(str6, str3, capabilitiesForType);
                                boolean zze2 = zzuzVar2.zze(str6, str3, capabilitiesForType);
                                z4 = zzuxVar2.zzb;
                                if (!z4) {
                                }
                                if (z4) {
                                }
                                i7 = Build.VERSION.SDK_INT;
                                str = str6;
                                if (i7 < 29) {
                                }
                                zzi = zzi(zzb2, str8);
                                z6 = z5;
                                if (i7 < 29) {
                                }
                                if (zzc) {
                                }
                                if (!zzc) {
                                }
                                z8 = z7;
                                i5 = i8;
                                i6 = i9;
                                codecCapabilities2 = codecCapabilities;
                                str4 = str3;
                                str5 = name;
                                if (!zzc) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 7);
                                    sb.append(str5);
                                    sb.append(".secure");
                                    arrayList.add(zzun.zza(sb.toString(), str8, str4, codecCapabilities2, z6, zzi, z8, false, true));
                                    return arrayList;
                                }
                                continue;
                            } else {
                                if (!zze) {
                                    boolean zzd22 = zzuzVar2.zzd(str6, str3, capabilitiesForType);
                                    boolean zze22 = zzuzVar2.zze(str6, str3, capabilitiesForType);
                                    z4 = zzuxVar2.zzb;
                                    if (!z4 || !zze22) {
                                        if (z4) {
                                            if (zzd22) {
                                                zzd22 = true;
                                            }
                                        }
                                        i7 = Build.VERSION.SDK_INT;
                                        str = str6;
                                        if (i7 < 29) {
                                            z5 = zzb2.isHardwareAccelerated();
                                            codecCapabilities = capabilitiesForType;
                                        } else {
                                            codecCapabilities = capabilitiesForType;
                                            z5 = !zzi(zzb2, str8);
                                        }
                                        zzi = zzi(zzb2, str8);
                                        z6 = z5;
                                        if (i7 < 29) {
                                            z7 = zzb2.isVendor();
                                        } else {
                                            String zza3 = zzgql.zza(zzb2.getName());
                                            z7 = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        try {
                                            if (zzc) {
                                                if (z4 != zzd22) {
                                                    zzd22 = true;
                                                }
                                                boolean z9 = z7;
                                                i5 = i8;
                                                i6 = i9;
                                                str4 = str3;
                                                str5 = name;
                                                arrayList.add(zzun.zza(name, str8, str4, codecCapabilities, z6, zzi, z9, false, false));
                                            }
                                            arrayList.add(zzun.zza(name, str8, str4, codecCapabilities, z6, zzi, z9, false, false));
                                        } catch (Exception e4) {
                                            e = e4;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 24 + str4.length() + 1);
                                            sb2.append("Failed to query codec ");
                                            sb2.append(str5);
                                            sb2.append(" (");
                                            sb2.append(str4);
                                            sb2.append(")");
                                            zzee.zze("MediaCodecUtil", sb2.toString());
                                            throw e;
                                        }
                                        if (!zzc || z4) {
                                            z8 = z7;
                                            i5 = i8;
                                            i6 = i9;
                                            codecCapabilities2 = codecCapabilities;
                                            str4 = str3;
                                            str5 = name;
                                            if (!zzc && zzd22) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 7);
                                                sb3.append(str5);
                                                sb3.append(".secure");
                                                arrayList.add(zzun.zza(sb3.toString(), str8, str4, codecCapabilities2, z6, zzi, z8, false, true));
                                                return arrayList;
                                            }
                                        }
                                        boolean z92 = z7;
                                        i5 = i8;
                                        i6 = i9;
                                        str4 = str3;
                                        str5 = name;
                                    }
                                }
                                str = str6;
                                i5 = i8;
                                i6 = i9;
                            }
                            i8 = i5 + 1;
                            zzuzVar2 = zzuzVar;
                            zza2 = i6;
                            str6 = str;
                            str7 = str2;
                            zzuxVar2 = zzuxVar;
                        } catch (Exception e5) {
                            e = e5;
                            str4 = str3;
                        }
                    }
                }
                str = str6;
                str2 = str7;
                i5 = i8;
                i6 = i9;
                i8 = i5 + 1;
                zzuzVar2 = zzuzVar;
                zza2 = i6;
                str6 = str;
                str7 = str2;
                zzuxVar2 = zzuxVar;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzuy(e6, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzas.zza(str)) {
            return true;
        }
        String zza2 = zzgql.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvf zzvfVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i5 = zzvg.zza;
                zzvf zzvfVar2 = zzvf.this;
                return zzvfVar2.zza(obj2) - zzvfVar2.zza(obj);
            }
        });
    }
}
