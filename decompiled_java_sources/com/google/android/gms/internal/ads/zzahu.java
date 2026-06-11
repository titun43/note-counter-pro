package com.google.android.gms.internal.ads;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class zzahu {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaht zza(String str) {
        long j2;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!zzfq.zzb(newPullParser, "x:xmpmeta")) {
                throw zzat.zzb("Couldn't find xmp metadata", null);
            }
            zzguf zzi = zzguf.zzi();
            long j5 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (zzfq.zzb(newPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i5 = 0;
                    for (int i6 = 0; i6 < 4; i6++) {
                        String zzc2 = zzfq.zzc(newPullParser, strArr[i6]);
                        if (zzc2 != null) {
                            if (Integer.parseInt(zzc2) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= 4) {
                                    break;
                                }
                                String zzc3 = zzfq.zzc(newPullParser, strArr2[i7]);
                                if (zzc3 != null) {
                                    j2 = Long.parseLong(zzc3);
                                } else {
                                    i7++;
                                }
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i5 >= 2) {
                                    zzi = zzguf.zzi();
                                    break;
                                }
                                String zzc4 = zzfq.zzc(newPullParser, strArr3[i5]);
                                if (zzc4 != null) {
                                    zzi = zzguf.zzk(new zzahs("image/jpeg", "Primary", 0L, 0L), new zzahs("video/mp4", "MotionPhoto", Long.parseLong(zzc4), 0L));
                                    break;
                                }
                                i5++;
                            }
                            j5 = j2;
                        }
                    }
                    return null;
                }
                if (zzfq.zzb(newPullParser, "Container:Directory")) {
                    zzi = zzc(newPullParser, "Container", "Item");
                } else if (zzfq.zzb(newPullParser, "GContainer:Directory")) {
                    zzi = zzc(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzfq.zza(newPullParser, "x:xmpmeta"));
            if (zzi.isEmpty()) {
                return null;
            }
            return new zzaht(j5, zzi);
        } catch (zzat | NumberFormatException | XmlPullParserException unused) {
            zzee.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean zzb(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i5 = 0; i5 < 4; i5++) {
            if (str.contains(String.valueOf(strArr[i5]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzguf zzc(XmlPullParser xmlPullParser, String str, String str2) {
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfq.zzb(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zzc2 = zzfq.zzc(xmlPullParser, concat2);
                String zzc3 = zzfq.zzc(xmlPullParser, concat3);
                String zzc4 = zzfq.zzc(xmlPullParser, concat4);
                String zzc5 = zzfq.zzc(xmlPullParser, concat5);
                if (zzc2 == null || zzc3 == null) {
                    return zzguf.zzi();
                }
                zzgucVar.zzf(new zzahs(zzc2, zzc3, zzc4 != null ? Long.parseLong(zzc4) : 0L, zzc5 != null ? Long.parseLong(zzc5) : 0L));
            }
        } while (!zzfq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgucVar.zzi();
    }
}
