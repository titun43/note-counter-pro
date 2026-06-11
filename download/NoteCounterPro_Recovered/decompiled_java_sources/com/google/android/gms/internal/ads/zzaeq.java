package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaeq implements zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaep zzc = new zzaep(zzaen.zza);
    private static final zzaep zzd = new zzaep(zzaem.zza);
    private zzguf zze;
    private final zzamd zzf = new zzaly();

    private final void zzc(int i5, List list) {
        switch (i5) {
            case 0:
                list.add(new zzaoc());
                break;
            case 1:
                list.add(new zzaof());
                break;
            case 2:
                list.add(new zzaoi(0));
                break;
            case 3:
                list.add(new zzagp(0));
                break;
            case 4:
                zzaeu zza2 = zzc.zza(0);
                if (zza2 == null) {
                    list.add(new zzahg(0));
                    break;
                } else {
                    list.add(zza2);
                    break;
                }
            case 5:
                list.add(new zzahj());
                break;
            case 6:
                list.add(new zzajh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzajp(0));
                break;
            case 8:
                zzamd zzamdVar = this.zzf;
                list.add(new zzako(zzamdVar, 0, null, null, zzguf.zzi(), null));
                list.add(new zzakw(zzamdVar, 0));
                break;
            case 9:
                list.add(new zzalm());
                break;
            case 10:
                list.add(new zzapm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzguf.zzi();
                }
                list.add(new zzapx(1, 0, this.zzf, new zzfg(0L), new zzaok(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqk());
                break;
            case 14:
                list.add(new zzahq(0));
                break;
            case 15:
                zzaeu zza3 = zzd.zza(new Object[0]);
                if (zza3 != null) {
                    list.add(zza3);
                    break;
                }
                break;
            case 16:
                list.add(new zzagt(0, this.zzf));
                break;
            case 17:
                list.add(new zzalw());
                break;
            case 18:
                list.add(new zzaqp());
                break;
            case 19:
                list.add(new zzahb());
                break;
            case 20:
                list.add(new zzahp(0));
                break;
            case zzbgj.zzt.zzm /* 21 */:
                list.add(new zzaha());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x013e, code lost:
    
        if (r4.equals("application/mp4") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0169, code lost:
    
        if (r4.equals("image/heic") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x017d, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0187, code lost:
    
        if (r4.equals("video/webm") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01a6, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L113;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ab A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x036a A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.zzafa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzaeu[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i5;
        String lastPathSegment;
        int i6;
        int i7;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            }
            if (str != null) {
                String zzh = zzas.zzh(str);
                switch (zzh.hashCode()) {
                    case -2123537834:
                        break;
                    case -1662384011:
                        if (zzh.equals("video/mp2p")) {
                            i5 = 10;
                            break;
                        }
                        break;
                    case -1662384007:
                        if (zzh.equals("video/mp2t")) {
                            i5 = 11;
                            break;
                        }
                        break;
                    case -1662095187:
                        break;
                    case -1606874997:
                        break;
                    case -1487656890:
                        if (zzh.equals("image/avif")) {
                            i5 = 21;
                            break;
                        }
                        break;
                    case -1487464693:
                        break;
                    case -1487464690:
                        if (zzh.equals("image/heif")) {
                            i5 = 20;
                            break;
                        }
                        break;
                    case -1487394660:
                        if (zzh.equals("image/jpeg")) {
                            i5 = 14;
                            break;
                        }
                        break;
                    case -1487018032:
                        if (zzh.equals("image/webp")) {
                            i5 = 18;
                            break;
                        }
                        break;
                    case -1248337486:
                        break;
                    case -1079884372:
                        if (zzh.equals("video/x-msvideo")) {
                            i5 = 16;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (zzh.equals("text/vtt")) {
                            i5 = 13;
                            break;
                        }
                        break;
                    case -879272239:
                        if (zzh.equals("image/bmp")) {
                            i5 = 19;
                            break;
                        }
                        break;
                    case -879258763:
                        if (zzh.equals("image/png")) {
                            i5 = 17;
                            break;
                        }
                        break;
                    case -387023398:
                        if (zzh.equals("audio/x-matroska")) {
                            i5 = 6;
                            break;
                        }
                        break;
                    case -43467528:
                        if (zzh.equals("application/webm")) {
                            i5 = 6;
                            break;
                        }
                        break;
                    case 13915911:
                        if (zzh.equals("video/x-flv")) {
                            i5 = 5;
                            break;
                        }
                        break;
                    case 187078296:
                        if (zzh.equals("audio/ac3")) {
                            i5 = 0;
                            break;
                        }
                        break;
                    case 187078297:
                        if (zzh.equals("audio/ac4")) {
                            i5 = 1;
                            break;
                        }
                        break;
                    case 187078669:
                        if (zzh.equals("audio/amr")) {
                            i5 = 3;
                            break;
                        }
                        break;
                    case 187090232:
                        if (zzh.equals("audio/mp4")) {
                            i5 = 8;
                            break;
                        }
                        break;
                    case 187091926:
                        if (zzh.equals("audio/ogg")) {
                            i5 = 9;
                            break;
                        }
                        break;
                    case 187099443:
                        if (zzh.equals("audio/wav")) {
                            i5 = 12;
                            break;
                        }
                        break;
                    case 1331848029:
                        if (zzh.equals("video/mp4")) {
                            i5 = 8;
                            break;
                        }
                        break;
                    case 1503095341:
                        if (zzh.equals("audio/3gpp")) {
                            i5 = 3;
                            break;
                        }
                        break;
                    case 1504578661:
                        if (zzh.equals("audio/eac3")) {
                            i5 = 0;
                            break;
                        }
                        break;
                    case 1504619009:
                        if (zzh.equals("audio/flac")) {
                            i5 = 4;
                            break;
                        }
                        break;
                    case 1504824762:
                        if (zzh.equals("audio/midi")) {
                            i5 = 15;
                            break;
                        }
                        break;
                    case 1504831518:
                        if (zzh.equals("audio/mpeg")) {
                            i5 = 7;
                            break;
                        }
                        break;
                    case 1505118770:
                        if (zzh.equals("audio/webm")) {
                            i5 = 6;
                            break;
                        }
                        break;
                    case 2039520277:
                        if (zzh.equals("video/x-matroska")) {
                            i5 = 6;
                            break;
                        }
                        break;
                }
                if (i5 != -1) {
                    zzc(i5, arrayList);
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                        i6 = 0;
                    } else if (lastPathSegment.endsWith(".ac4")) {
                        i6 = 1;
                    } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i6 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i6 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i6 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i6 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i6 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i6 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i6 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i6 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i6 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i6 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i6 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i6 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i6 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i6 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i6 = 16;
                    } else if (lastPathSegment.endsWith(".png")) {
                        i6 = 17;
                    } else if (lastPathSegment.endsWith(".webp")) {
                        i6 = 18;
                    } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                        i6 = 19;
                    } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                        i6 = 20;
                    } else if (lastPathSegment.endsWith(".avif")) {
                        i6 = 21;
                    }
                    if (i6 != -1 && i6 != i5) {
                        zzc(i6, arrayList);
                    }
                    int[] iArr = zzb;
                    for (i7 = 0; i7 < 21; i7++) {
                        int i8 = iArr[i7];
                        if (i8 != i5 && i8 != i6) {
                            zzc(i8, arrayList);
                        }
                    }
                }
                i6 = -1;
                if (i6 != -1) {
                    zzc(i6, arrayList);
                }
                int[] iArr2 = zzb;
                while (i7 < 21) {
                }
            }
            i5 = -1;
            if (i5 != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i6 = -1;
            if (i6 != -1) {
            }
            int[] iArr22 = zzb;
            while (i7 < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzaeu[]) arrayList.toArray(new zzaeu[0]);
    }
}
