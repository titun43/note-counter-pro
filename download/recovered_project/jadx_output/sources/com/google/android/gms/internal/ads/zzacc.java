package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.emoji2.text.u;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzacc extends zzuu implements zzacr {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzms zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private int zzK;
    private int zzL;
    private zzacp zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private final Context zze;
    private final boolean zzf;
    private final zzadl zzg;
    private final boolean zzh;
    private final zzacs zzi;
    private final zzacq zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzacb zzm;
    private boolean zzn;
    private boolean zzo;
    private zzadr zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzace zzu;
    private zzes zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzacc(zzaca zzacaVar) {
        super(2, zzacaVar.zzg(), zzacaVar.zzf(), false, 30.0f);
        Context applicationContext = zzacaVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzadl(zzacaVar.zzh(), zzacaVar.zzi());
        this.zzf = this.zzp == null;
        this.zzi = new zzacs(applicationContext, this, 0L);
        this.zzj = new zzacq();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzes.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzbv.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzat(zzun zzunVar, zzv zzvVar) {
        int i5 = zzvVar.zzv;
        int i6 = zzvVar.zzw;
        if (i5 != -1 && i6 != -1) {
            String str = zzvVar.zzo;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair zzd2 = zzdo.zzd(zzvVar);
                if (zzd2 != null) {
                    int intValue = ((Integer) zzd2.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i7 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        return Math.max(2097152, ((i5 * i6) * 3) / 4);
                    }
                    break;
                case 1187890754:
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        String str2 = Build.MODEL;
                        if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzunVar.zzf)))) {
                            String str3 = zzfj.zza;
                            return ((((i6 + 15) / 16) * ((i5 + 15) / 16)) * 768) / 4;
                        }
                    }
                    break;
                case 1599127256:
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        i7 = 8;
                        return ((i5 * i6) * 3) / i7;
                    }
                    break;
            }
        }
        return -1;
    }

    public static int zzbh(zzun zzunVar, zzv zzvVar) {
        int i5 = zzvVar.zzp;
        if (i5 == -1) {
            return zzat(zzunVar, zzvVar);
        }
        List list = zzvVar.zzr;
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += ((byte[]) list.get(i7)).length;
        }
        return i5 + i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        if (r1.equals("itel_S41") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        if (r1.equals("LS-5017") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        if (r1.equals("panell_d") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ca, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d4, code lost:
    
        if (r1.equals("A7000plus") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01de, code lost:
    
        if (r1.equals("manning") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e8, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fc, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0206, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0210, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021a, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0224, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022e, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0238, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r1.equals("A7020a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024c, code lost:
    
        if (r1.equals("A7010a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0256, code lost:
    
        if (r1.equals("griffin") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0260, code lost:
    
        if (r1.equals("marino_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026a, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0274, code lost:
    
        if (r1.equals("A2016a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027e, code lost:
    
        if (r1.equals("le_x6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0288, code lost:
    
        if (r1.equals("l5460") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0292, code lost:
    
        if (r1.equals("i9031") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        if (r1.equals("X3_HK") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a6, code lost:
    
        if (r1.equals("V23GB") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b0, code lost:
    
        if (r1.equals("Q4310") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ba, code lost:
    
        if (r1.equals("Q4260") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c4, code lost:
    
        if (r1.equals("PRO7S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ce, code lost:
    
        if (r1.equals("F3311") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2.equals("machuca") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d8, code lost:
    
        if (r1.equals("F3215") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e2, code lost:
    
        if (r1.equals("F3213") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        if (r1.equals("F3211") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f6, code lost:
    
        if (r1.equals("F3116") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0300, code lost:
    
        if (r1.equals("F3113") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030a, code lost:
    
        if (r1.equals("F3111") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0314, code lost:
    
        if (r1.equals("E5643") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031e, code lost:
    
        if (r1.equals("A1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0328, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0332, code lost:
    
        if (r1.equals("602LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033c, code lost:
    
        if (r1.equals("601LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0346, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0350, code lost:
    
        if (r1.equals("p212") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035a, code lost:
    
        if (r1.equals("mido") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0364, code lost:
    
        if (r1.equals("kate") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036e, code lost:
    
        if (r1.equals("fugu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0378, code lost:
    
        if (r1.equals("XE2X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0382, code lost:
    
        if (r1.equals("Q427") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x038c, code lost:
    
        if (r1.equals("Q350") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0396, code lost:
    
        if (r1.equals("P681") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r2.equals("once") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a0, code lost:
    
        if (r1.equals("F04J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03aa, code lost:
    
        if (r1.equals("F04H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        if (r1.equals("F03H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03be, code lost:
    
        if (r1.equals("F02H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c8, code lost:
    
        if (r1.equals("F01J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d2, code lost:
    
        if (r1.equals("F01H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03dc, code lost:
    
        if (r1.equals("1714") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e6, code lost:
    
        if (r1.equals("1713") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f0, code lost:
    
        if (r1.equals("1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03fa, code lost:
    
        if (r1.equals("flo") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2.equals("magnolia") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0404, code lost:
    
        if (r1.equals("deb") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x040e, code lost:
    
        if (r1.equals("cv3") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0418, code lost:
    
        if (r1.equals("cv1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0422, code lost:
    
        if (r1.equals("Z80") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x042c, code lost:
    
        if (r1.equals("QX1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0436, code lost:
    
        if (r1.equals("PLE") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0440, code lost:
    
        if (r1.equals("P85") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x044a, code lost:
    
        if (r1.equals("MX6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0454, code lost:
    
        if (r1.equals("M5c") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x045e, code lost:
    
        if (r1.equals("M04") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r2.equals("aquaman") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0468, code lost:
    
        if (r1.equals("JGZ") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0472, code lost:
    
        if (r1.equals("mh") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x047c, code lost:
    
        if (r1.equals("b5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0486, code lost:
    
        if (r1.equals("V5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0490, code lost:
    
        if (r1.equals("V1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x049a, code lost:
    
        if (r1.equals("Q5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a4, code lost:
    
        if (r1.equals("C1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ae, code lost:
    
        if (r1.equals("woods_fn") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04b8, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c2, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r2.equals("oneday") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cc, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d6, code lost:
    
        if (r1.equals("taido_row") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e0, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04ea, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04f4, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04fe, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0508, code lost:
    
        if (r1.equals("whyred") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0512, code lost:
    
        if (r1.equals("watson") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x051c, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0526, code lost:
    
        if (r1.equals("A7000-a") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r2.equals("dangalUHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0530, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x053a, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0544, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x054e, code lost:
    
        if (r1.equals("s905x018") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0558, code lost:
    
        if (r1.equals("A10-70L") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0562, code lost:
    
        if (r1.equals("A10-70F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x056c, code lost:
    
        if (r1.equals("namath") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0576, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0580, code lost:
    
        if (r1.equals("iris60") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x058a, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r2.equals("dangalFHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0594, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x059e, code lost:
    
        if (r1.equals("panell_dt") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a8, code lost:
    
        if (r1.equals("panell_ds") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05b2, code lost:
    
        if (r1.equals("panell_dl") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05bc, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05c6, code lost:
    
        if (r1.equals("pacificrim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05d0, code lost:
    
        if (r1.equals("Phantom6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05da, code lost:
    
        if (r1.equals("ComioS1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e4, code lost:
    
        if (r1.equals("XT1663") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05ee, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r2.equals("dangal") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05f8, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0601, code lost:
    
        if (r1.equals("PGN611") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x060a, code lost:
    
        if (r1.equals("PGN610") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0613, code lost:
    
        if (r1.equals("PGN528") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x061c, code lost:
    
        if (r1.equals("NX573J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0625, code lost:
    
        if (r1.equals("NX541J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x062e, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0637, code lost:
    
        if (r1.equals("K50a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0640, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0649, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0652, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0666, code lost:
    
        if (r2.equals("JSN-L21") == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r2.equals("AFTEUFF014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r2.equals("AFTSO001") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r2.equals("AFTEU014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r2.equals("AFTEU011") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        if (r2.equals("AFTR") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (r2.equals("AFTN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (r2.equals("AFTA") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r2.equals("AFTKMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (r2.equals("AFTJMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0134, code lost:
    
        if (r1.equals("DM-01K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013e, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015c, code lost:
    
        if (r1.equals("santoni") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0170, code lost:
    
        if (r1.equals("CPH1715") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if (r1.equals("CPH1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0184, code lost:
    
        if (r1.equals("woods_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018e, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0198, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a2, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzbl(String str) {
        boolean z4 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzacc.class) {
            if (!zzc) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            break;
                        case -1220081023:
                            break;
                        case -1220066608:
                            break;
                        case -1012436106:
                            break;
                        case -760312546:
                            break;
                        case -64886864:
                            break;
                        case 3415681:
                            break;
                        case 825323514:
                            break;
                    }
                    zzd = z4;
                    zzc = true;
                }
                if (i5 > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            break;
                        case -321033677:
                            break;
                        case 2006354:
                            break;
                        case 2006367:
                            break;
                        case 2006371:
                            break;
                        case 1785421873:
                            break;
                        case 1785421876:
                            break;
                        case 1798172390:
                            break;
                        case 2119412532:
                            break;
                        default:
                            if (i5 <= 26) {
                                String str4 = Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        break;
                                    case -2144781185:
                                        break;
                                    case -2144781160:
                                        break;
                                    case -2097309513:
                                        break;
                                    case -2022874474:
                                        break;
                                    case -1978993182:
                                        break;
                                    case -1978990237:
                                        break;
                                    case -1936688988:
                                        break;
                                    case -1936688066:
                                        break;
                                    case -1936688065:
                                        break;
                                    case -1931988508:
                                        break;
                                    case -1885099851:
                                        break;
                                    case -1696512866:
                                        break;
                                    case -1680025915:
                                        break;
                                    case -1615810839:
                                        break;
                                    case -1600724499:
                                        break;
                                    case -1554255044:
                                        break;
                                    case -1481772737:
                                        break;
                                    case -1481772730:
                                        break;
                                    case -1481772729:
                                        break;
                                    case -1320080169:
                                        break;
                                    case -1217592143:
                                        break;
                                    case -1180384755:
                                        break;
                                    case -1139198265:
                                        break;
                                    case -1052835013:
                                        break;
                                    case -993250464:
                                        break;
                                    case -993250458:
                                        break;
                                    case -965403638:
                                        break;
                                    case -958336948:
                                        break;
                                    case -879245230:
                                        break;
                                    case -842500323:
                                        break;
                                    case -821392978:
                                        break;
                                    case -797483286:
                                        break;
                                    case -794946968:
                                        break;
                                    case -788334647:
                                        break;
                                    case -782144577:
                                        break;
                                    case -575125681:
                                        break;
                                    case -521118391:
                                        break;
                                    case -430914369:
                                        break;
                                    case -290434366:
                                        break;
                                    case -282781963:
                                        break;
                                    case -277133239:
                                        break;
                                    case -173639913:
                                        break;
                                    case -56598463:
                                        break;
                                    case 2126:
                                        break;
                                    case 2564:
                                        break;
                                    case 2715:
                                        break;
                                    case 2719:
                                        break;
                                    case 3091:
                                        break;
                                    case 3483:
                                        break;
                                    case 73405:
                                        break;
                                    case 75537:
                                        break;
                                    case 75739:
                                        break;
                                    case 76779:
                                        break;
                                    case 78669:
                                        break;
                                    case 79305:
                                        break;
                                    case 80618:
                                        break;
                                    case 88274:
                                        break;
                                    case 98846:
                                        break;
                                    case 98848:
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        break;
                                    case 1513190:
                                        break;
                                    case 1514184:
                                        break;
                                    case 1514185:
                                        break;
                                    case 2133089:
                                        break;
                                    case 2133091:
                                        break;
                                    case 2133120:
                                        break;
                                    case 2133151:
                                        break;
                                    case 2133182:
                                        break;
                                    case 2133184:
                                        break;
                                    case 2436959:
                                        break;
                                    case 2463773:
                                        break;
                                    case 2464648:
                                        break;
                                    case 2689555:
                                        break;
                                    case 3154429:
                                        break;
                                    case 3284551:
                                        break;
                                    case 3351335:
                                        break;
                                    case 3386211:
                                        break;
                                    case 41325051:
                                        break;
                                    case 51349633:
                                        break;
                                    case 51350594:
                                        break;
                                    case 55178625:
                                        break;
                                    case 61542055:
                                        break;
                                    case 65355429:
                                        break;
                                    case 66214468:
                                        break;
                                    case 66214470:
                                        break;
                                    case 66214473:
                                        break;
                                    case 66215429:
                                        break;
                                    case 66215431:
                                        break;
                                    case 66215433:
                                        break;
                                    case 66216390:
                                        break;
                                    case 76402249:
                                        break;
                                    case 76404105:
                                        break;
                                    case 76404911:
                                        break;
                                    case 80963634:
                                        break;
                                    case 82882791:
                                        break;
                                    case 98715550:
                                        break;
                                    case 101370885:
                                        break;
                                    case 102844228:
                                        break;
                                    case 165221241:
                                        break;
                                    case 182191441:
                                        break;
                                    case 245388979:
                                        break;
                                    case 287431619:
                                        break;
                                    case 307593612:
                                        break;
                                    case 308517133:
                                        break;
                                    case 316215098:
                                        break;
                                    case 316215116:
                                        break;
                                    case 316246811:
                                        break;
                                    case 316246818:
                                        break;
                                    case 407160593:
                                        break;
                                    case 507412548:
                                        break;
                                    case 793982701:
                                        break;
                                    case 794038622:
                                        break;
                                    case 794040393:
                                        break;
                                    case 835649806:
                                        break;
                                    case 917340916:
                                        break;
                                    case 958008161:
                                        break;
                                    case 1060579533:
                                        break;
                                    case 1150207623:
                                        break;
                                    case 1176899427:
                                        break;
                                    case 1280332038:
                                        break;
                                    case 1306947716:
                                        break;
                                    case 1349174697:
                                        break;
                                    case 1522194893:
                                        break;
                                    case 1691543273:
                                        break;
                                    case 1691544261:
                                        break;
                                    case 1709443163:
                                        break;
                                    case 1865889110:
                                        break;
                                    case 1906253259:
                                        break;
                                    case 1977196784:
                                        break;
                                    case 2006372676:
                                        break;
                                    case 2019281702:
                                        break;
                                    case 2029784656:
                                        break;
                                    case 2030379515:
                                        break;
                                    case 2033393791:
                                        break;
                                    case 2047190025:
                                        break;
                                    case 2047252157:
                                        break;
                                    case 2048319463:
                                        break;
                                    case 2048855701:
                                        break;
                                    default:
                                        if (str3.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                    zzd = z4;
                    zzc = true;
                }
                z4 = true;
                zzd = z4;
                zzc = true;
            }
        }
        return zzd;
    }

    public static final boolean zzbm(zzun zzunVar) {
        return Build.VERSION.SDK_INT >= 35 && zzunVar.zzh;
    }

    private static List zzbn(Context context, zzuw zzuwVar, zzv zzvVar, boolean z4, boolean z5) {
        String str = zzvVar.zzo;
        if (str == null) {
            return zzguf.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            List zzd2 = zzvg.zzd(zzuwVar, zzvVar, z4, z5);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return zzvg.zzc(zzuwVar, zzvVar, z4, z5);
    }

    private final void zzbo(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbw();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzd(surface);
        }
        this.zzw = false;
        int zze = zze();
        zzuk zzaE = zzaE();
        if (zzaE != null && this.zzp == null) {
            zzun zzaH = zzaH();
            zzaH.getClass();
            if (!zzbs(zzaH) || this.zzn) {
                zzaI();
                zzaA();
            } else {
                Surface zzbt = zzbt(zzaH);
                if (zzbt != null) {
                    zzaE.zzn(zzbt);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzaE.zzo();
                }
            }
        }
        if (surface != null) {
            zzbw();
        } else {
            this.zzJ = null;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzq();
            }
        }
        if (zze == 2) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbp(zzih zzihVar) {
        if (zzcW() || zzihVar.zzd() || this.zzO == -9223372036854775807L) {
            return true;
        }
        return this.zzO - (zzihVar.zze - zzbb()) <= 100000;
    }

    private final boolean zzbq(zzih zzihVar) {
        return zzihVar.zze < zzG();
    }

    private final void zzbr(long j2, long j5, zzv zzvVar) {
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            zzacpVar.zzcS(j2, j5, zzvVar, zzaG());
        }
    }

    private final boolean zzbs(zzun zzunVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbm(zzunVar) || zzbg(zzunVar);
    }

    private final Surface zzbt(zzun zzunVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzk();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbm(zzunVar)) {
            return null;
        }
        zzgrc.zzi(zzbg(zzunVar));
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            if (zzaceVar.zza != zzunVar.zzf) {
                zzbu();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzace.zzb(this.zze, zzunVar.zzf);
        }
        return this.zzu;
    }

    private final void zzbu() {
        zzace zzaceVar = this.zzu;
        if (zzaceVar != null) {
            zzaceVar.release();
            this.zzu = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzbv, reason: merged with bridge method [inline-methods] */
    public final void zzbj() {
        this.zzg.zzg(this.zzt);
        this.zzw = true;
    }

    private final void zzbw() {
        zzbv zzbvVar = this.zzJ;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzA(long j2, boolean z4, boolean z5) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null && !z4) {
            zzadrVar.zzg(true);
        }
        super.zzA(j2, z4, z5);
        if (this.zzp == null) {
            this.zzi.zzl();
        }
        if (z4) {
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzB() {
        this.zzA = 0;
        this.zzz = zzL().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzC() {
        if (this.zzA > 0) {
            long zzb2 = zzL().zzb();
            this.zzg.zzd(this.zzA, zzb2 - this.zzz);
            this.zzA = 0;
            this.zzz = zzb2;
        }
        int i5 = this.zzG;
        if (i5 != 0) {
            this.zzg.zze(this.zzF, i5);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzb();
        } else {
            this.zzi.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzD() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzD();
        } finally {
            zzadl zzadlVar = this.zzg;
            zzadlVar.zzi(((zzuu) this).zza);
            zzadlVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public final void zzF() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzf) {
            return;
        }
        zzadrVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzml, com.google.android.gms.internal.ads.zzmn
    public final String zzS() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final boolean zzU(long j2) {
        long zzaU = zzaU();
        return zzaU == -9223372036854775807L || j2 > zzaU - zzbb();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final void zzV(float f5, float f6) {
        super.zzV(f5, f6);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzm(f5);
        } else {
            this.zzi.zzn(f5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final void zzW() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            this.zzi.zzh();
            return;
        }
        int i5 = this.zzr;
        if (i5 == 0 || i5 == 1) {
            this.zzr = 0;
        } else {
            zzadrVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final void zzX(long j2, long j5) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            try {
                zzadrVar.zzv(j2, j5);
            } catch (zzadq e4) {
                throw zzN(e4, e4.zza, false, 7001);
            }
        }
        super.zzX(j2, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzY() {
        boolean zzaW = zzaW();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            return zzadrVar.zzh(zzaW);
        }
        if (zzaW && zzaE() == null) {
            return true;
        }
        return this.zzi.zzi(zzaW);
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzml
    public final boolean zzZ() {
        if (!super.zzZ()) {
            return false;
        }
        zzadr zzadrVar = this.zzp;
        return zzadrVar == null || zzadrVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaC(zzun zzunVar) {
        return zzbs(zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaK() {
        zzun zzaH = zzaH();
        if (this.zzp != null && zzaH != null) {
            String str = zzaH.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaL() {
        boolean z4;
        zzv zzaF = zzaF();
        long j2 = this.zzO;
        if (j2 != -9223372036854775807L) {
            if (zzaM() + j2 + 1 <= Long.MAX_VALUE - (zzbb() + this.zzO)) {
                z4 = false;
                return this.zzD == null || this.zzE || (zzaF != null && zzaF.zzq > 0) || z4 || zzba() != -9223372036854775807L;
            }
        }
        z4 = true;
        if (this.zzD == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaN() {
        super.zzaN();
        this.zzl.clear();
        this.zzC = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzabw(th, zzunVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaQ(zzv zzvVar) {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || zzadrVar.zze()) {
            return true;
        }
        try {
            zzadrVar.zzd(zzvVar);
            return true;
        } catch (zzadq e4) {
            throw zzN(e4, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaR(zzih zzihVar) {
        int zzaS = zzaS(zzihVar);
        if (Build.VERSION.SDK_INT < 34 || (zzaS & 32) == 0) {
            this.zzC++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final int zzaS(zzih zzihVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzD == null || !zzbq(zzihVar) || zzbp(zzihVar)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaT(zzih zzihVar) {
        boolean z4 = false;
        if (zzbp(zzihVar)) {
            return false;
        }
        if (zzbq(zzihVar)) {
            if (zzihVar.zze()) {
                return false;
            }
            if (zzihVar.zzf()) {
                zzihVar.zza();
                z4 = true;
            }
            if (z4) {
                ((zzuu) this).zza.zzd++;
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaV(long j2) {
        super.zzaV(j2);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final int zzac(zzuw zzuwVar, zzv zzvVar) {
        boolean z4;
        String str = zzvVar.zzo;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i5 = 0;
        boolean z5 = zzvVar.zzs != null;
        List zzbn = zzbn(context, zzuwVar, zzvVar, z5, false);
        if (z5 && zzbn.isEmpty()) {
            zzbn = zzbn(context, zzuwVar, zzvVar, false, false);
        }
        if (zzbn.isEmpty()) {
            return 129;
        }
        if (!zzuu.zzbd(zzvVar)) {
            return 130;
        }
        zzun zzunVar = (zzun) zzbn.get(0);
        boolean zzc2 = zzunVar.zzc(zzvVar);
        if (!zzc2) {
            for (int i6 = 1; i6 < zzbn.size(); i6++) {
                zzun zzunVar2 = (zzun) zzbn.get(i6);
                if (zzunVar2.zzc(zzvVar)) {
                    zzc2 = true;
                    z4 = false;
                    zzunVar = zzunVar2;
                    break;
                }
            }
        }
        z4 = true;
        int i7 = true != zzc2 ? 3 : 4;
        int i8 = true != zzunVar.zze(zzvVar) ? 8 : 16;
        int i9 = true != zzunVar.zzg ? 0 : 64;
        int i10 = true != z4 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzabz.zza(context)) {
            i10 = 256;
        }
        if (zzc2) {
            List zzbn2 = zzbn(context, zzuwVar, zzvVar, z5, true);
            if (!zzbn2.isEmpty()) {
                zzun zzunVar3 = (zzun) zzvg.zze(zzbn2, zzvVar).get(0);
                if (zzunVar3.zzc(zzvVar) && zzunVar3.zze(zzvVar)) {
                    i5 = 32;
                }
            }
        }
        return i7 | i8 | i5 | i9 | i10;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z4) {
        return zzvg.zze(zzbn(this.zze, zzuwVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f5) {
        zzacb zzacbVar;
        Point point;
        int i5;
        int i6;
        int i7;
        boolean z4;
        zzv[] zzvVarArr;
        char c5;
        boolean z5;
        Pair zzd2;
        int zzat;
        zzv[] zzI = zzI();
        int length = zzI.length;
        int zzbh = zzbh(zzunVar, zzvVar);
        int i8 = zzvVar.zzw;
        int i9 = zzvVar.zzv;
        if (length == 1) {
            if (zzbh != -1 && (zzat = zzat(zzunVar, zzvVar)) != -1) {
                zzbh = Math.min((int) (zzbh * 1.5f), zzat);
            }
            zzacbVar = new zzacb(i9, i8, zzbh);
        } else {
            int i10 = i8;
            int i11 = i9;
            int i12 = 0;
            boolean z6 = false;
            while (i12 < length) {
                zzv zzvVar2 = zzI[i12];
                zzi zziVar = zzvVar.zzE;
                if (zziVar != null && zzvVar2.zzE == null) {
                    zzt zza = zzvVar2.zza();
                    zza.zzC(zziVar);
                    zzvVar2 = zza.zzM();
                }
                if (zzunVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i13 = zzvVar2.zzv;
                    c5 = 65535;
                    if (i13 != -1) {
                        zzvVarArr = zzI;
                        if (zzvVar2.zzw != -1) {
                            z5 = false;
                            z6 |= z5;
                            i11 = Math.max(i11, i13);
                            i10 = Math.max(i10, zzvVar2.zzw);
                            zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                        }
                    } else {
                        zzvVarArr = zzI;
                    }
                    z5 = true;
                    z6 |= z5;
                    i11 = Math.max(i11, i13);
                    i10 = Math.max(i10, zzvVar2.zzw);
                    zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                } else {
                    zzvVarArr = zzI;
                    c5 = 65535;
                }
                i12++;
                zzI = zzvVarArr;
            }
            if (z6) {
                zzee.zzc("MediaCodecVideoRenderer", s.c.c(new StringBuilder(String.valueOf(i11).length() + 44 + String.valueOf(i10).length()), "Resolutions unknown. Codec max resolution: ", i11, "x", i10));
                boolean z7 = i8 > i9;
                int i14 = z7 ? i8 : i9;
                int i15 = true != z7 ? i8 : i9;
                int[] iArr = zzb;
                int i16 = 0;
                while (i16 < 9) {
                    float f6 = i15;
                    float f7 = i14;
                    int i17 = iArr[i16];
                    int i18 = i16;
                    float f8 = i17;
                    if (i17 <= i14 || (i5 = (int) (f8 * (f6 / f7))) <= i15) {
                        break;
                    }
                    int i19 = i14;
                    if (true != z7) {
                        i6 = i15;
                        i7 = i17;
                    } else {
                        i6 = i15;
                        i7 = i5;
                    }
                    if (true != z7) {
                        i17 = i5;
                    }
                    point = zzunVar.zzi(i7, i17);
                    float f9 = zzvVar.zzz;
                    if (point != null) {
                        z4 = z7;
                        if (zzunVar.zzg(point.x, point.y, f9)) {
                            break;
                        }
                    } else {
                        z4 = z7;
                    }
                    i16 = i18 + 1;
                    i14 = i19;
                    i15 = i6;
                    z7 = z4;
                }
                point = null;
                if (point != null) {
                    i11 = Math.max(i11, point.x);
                    i10 = Math.max(i10, point.y);
                    zzt zza2 = zzvVar.zza();
                    zza2.zzt(i11);
                    zza2.zzu(i10);
                    zzbh = Math.max(zzbh, zzat(zzunVar, zza2.zzM()));
                    zzee.zzc("MediaCodecVideoRenderer", s.c.c(new StringBuilder(u.b(i11, 35) + String.valueOf(i10).length()), "Codec max resolution adjusted to: ", i11, "x", i10));
                }
            }
            zzacbVar = new zzacb(i11, i10, zzbh);
        }
        String str = zzunVar.zzc;
        this.zzm = zzacbVar;
        boolean z8 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i9);
        mediaFormat.setInteger("height", i8);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        float f10 = zzvVar.zzz;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        zzeh.zzb(mediaFormat, "rotation-degrees", zzvVar.zzA);
        zzi zziVar2 = zzvVar.zzE;
        if (zziVar2 != null) {
            zzeh.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzeh.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzeh.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzo) && (zzd2 = zzdo.zzd(zzvVar)) != null) {
            zzeh.zzb(mediaFormat, "profile", ((Integer) zzd2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzacbVar.zza);
        mediaFormat.setInteger("max-height", zzacbVar.zzb);
        zzeh.zzb(mediaFormat, "max-input-size", zzacbVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f5);
        }
        if (z8) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface zzbt = zzbt(zzunVar);
        if (this.zzp != null && !zzfj.zzR(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzuh.zzb(zzunVar, mediaFormat, zzvVar, zzbt, null);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i5;
        int i6;
        zzio zzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i7 = zzf.zze;
        zzacb zzacbVar = this.zzm;
        zzacbVar.getClass();
        if (zzvVar2.zzv > zzacbVar.zza || zzvVar2.zzw > zzacbVar.zzb) {
            i7 |= 256;
        }
        if (zzbh(zzunVar, zzvVar2) > zzacbVar.zzc) {
            i7 |= 64;
        }
        String str = zzunVar.zza;
        if (i7 != 0) {
            i6 = 0;
            i5 = i7;
        } else {
            i5 = 0;
            i6 = zzf.zzd;
        }
        return new zzio(str, zzvVar, zzvVar2, i6, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final float zzai(float f5, zzv zzvVar, zzv[] zzvVarArr) {
        zzun zzaH;
        float f6 = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f7 = zzvVar2.zzz;
            if (f7 != -1.0f) {
                f6 = Math.max(f6, f7);
            }
        }
        float f8 = f6 == -1.0f ? -1.0f : f6 * f5;
        if (this.zzD == null || (zzaH = zzaH()) == null) {
            return f8;
        }
        float zzh = zzaH.zzh(zzvVar.zzv, zzvVar.zzw);
        return f8 != -1.0f ? Math.max(f8, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzaj(String str, zzuh zzuhVar, long j2, long j5) {
        this.zzg.zzb(str, j2, j5);
        this.zzn = zzbl(str);
        zzun zzaH = zzaH();
        zzaH.getClass();
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaH.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaH.zzb();
            int length = zzb2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (zzb2[i5].profile == 16384) {
                    z4 = true;
                    break;
                }
                i5++;
            }
        }
        this.zzo = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzak(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final zzio zzam(zzlh zzlhVar) {
        zzio zzam = super.zzam(zzlhVar);
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzam);
        return zzam;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        zzuk zzaE = zzaE();
        if (zzaE != null) {
            zzaE.zzq(this.zzx);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f5 = zzvVar.zzB;
        int i5 = zzvVar.zzA;
        if (i5 == 90 || i5 == 270) {
            f5 = 1.0f / f5;
            int i6 = integer2;
            integer2 = integer;
            integer = i6;
        }
        this.zzI = new zzbv(integer, integer2, f5);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null || !this.zzP) {
            this.zzi.zze(zzvVar.zzz);
        } else {
            zzt zza = zzvVar.zza();
            zza.zzt(integer);
            zza.zzu(integer2);
            zza.zzz(f5);
            zzv zzM = zza.zzM();
            int i7 = this.zzr;
            List list = this.zzs;
            if (list == null) {
                list = zzguf.zzi();
            }
            zzadrVar.zzs(1, zzM, zzbc(), i7, list);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    @Override // com.google.android.gms.internal.ads.zzacr
    public final boolean zzao(long j2, long j5, long j6, boolean z4, boolean z5) {
        int zzP;
        if (this.zzp != null && this.zzf) {
            j5 -= -this.zzN;
        }
        if (j2 >= -500000 || z4 || (zzP = zzP(j5)) == 0) {
            return false;
        }
        if (z5) {
            zzin zzinVar = ((zzuu) this).zza;
            int i5 = zzinVar.zzd + zzP;
            zzinVar.zzd = i5;
            zzinVar.zzf += this.zzC;
            zzinVar.zzd = this.zzl.size() + i5;
        } else {
            ((zzuu) this).zza.zzj++;
            zzaw(this.zzl.size() + zzP, this.zzC);
        }
        zzaJ();
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzap() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
            long j2 = this.zzN;
            if (j2 == -9223372036854775807L) {
                j2 = zzbc();
                this.zzN = j2;
            }
            this.zzp.zzo(-j2);
        } else {
            this.zzi.zza(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final boolean zzaq(long j2, long j5, zzuk zzukVar, ByteBuffer byteBuffer, int i5, int i6, int i7, long j6, boolean z4, boolean z5, zzv zzvVar) {
        zzacc zzaccVar;
        long j7;
        zzukVar.getClass();
        long zzbb = j6 - zzbb();
        int i8 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l5 = (Long) priorityQueue.peek();
            if (l5 == null || l5.longValue() >= j6) {
                break;
            }
            priorityQueue.poll();
            i8++;
        }
        zzaw(i8, 0);
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            if (!z4 || z5) {
                return zzadrVar.zzu(j6, new zzaby(this, zzukVar, i5, zzbb));
            }
            zzau(zzukVar, i5, zzbb);
            return true;
        }
        zzacs zzacsVar = this.zzi;
        long zzbc = zzbc();
        zzacq zzacqVar = this.zzj;
        int zzk = zzacsVar.zzk(j6, j2, j5, zzbc, z4, z5, zzacqVar);
        if (zzk == 0) {
            long zzc2 = zzL().zzc();
            zzbr(zzbb, zzc2, zzvVar);
            zzay(zzukVar, i5, zzbb, zzc2);
            zzax(zzacqVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzav(zzukVar, i5, zzbb);
                zzax(zzacqVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzau(zzukVar, i5, zzbb);
            zzax(zzacqVar.zza());
            return true;
        }
        long zzb2 = zzacqVar.zzb();
        long zza = zzacqVar.zza();
        if (zzb2 == this.zzH) {
            zzau(zzukVar, i5, zzbb);
            j7 = zzb2;
            zzaccVar = this;
        } else {
            zzbr(zzbb, zzb2, zzvVar);
            zzay(zzukVar, i5, zzbb, zzb2);
            zzaccVar = this;
            j7 = zzb2;
        }
        zzaccVar.zzax(zza);
        zzaccVar.zzH = j7;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzar() {
        zzadr zzadrVar = this.zzp;
        if (zzadrVar != null) {
            zzadrVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu
    public final void zzas(zzih zzihVar) {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s6 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s5 == 60 && s6 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzuk zzaE = zzaE();
                        zzaE.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaE.zzp(bundle);
                    }
                }
            }
        }
    }

    public final void zzau(zzuk zzukVar, int i5, long j2) {
        Trace.beginSection("skipVideoBuffer");
        zzukVar.zzc(i5, false);
        Trace.endSection();
        ((zzuu) this).zza.zzf++;
    }

    public final void zzav(zzuk zzukVar, int i5, long j2) {
        Trace.beginSection("dropVideoBuffer");
        zzukVar.zzc(i5, false);
        Trace.endSection();
        zzaw(0, 1);
    }

    public final void zzaw(int i5, int i6) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzh += i5;
        int i7 = i5 + i6;
        zzinVar.zzg += i7;
        this.zzA += i7;
        int i8 = this.zzB + i7;
        this.zzB = i8;
        zzinVar.zzi = Math.max(i8, zzinVar.zzi);
    }

    public final void zzax(long j2) {
        zzin zzinVar = ((zzuu) this).zza;
        zzinVar.zzk += j2;
        zzinVar.zzl++;
        this.zzF += j2;
        this.zzG++;
    }

    public final void zzay(zzuk zzukVar, int i5, long j2, long j5) {
        Trace.beginSection("releaseOutputBuffer");
        zzukVar.zzd(i5, j5);
        Trace.endSection();
        ((zzuu) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzbv zzbvVar = this.zzI;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzJ)) {
                this.zzJ = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzt == null) {
                return;
            }
            zzbj();
        }
    }

    public final boolean zzbg(zzun zzunVar) {
        if (zzbl(zzunVar.zza)) {
            return false;
        }
        return !zzunVar.zzf || zzace.zza(this.zze);
    }

    public final /* synthetic */ Surface zzbk() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public final void zzx(int i5, Object obj) {
        if (i5 == 1) {
            zzbo(obj);
            return;
        }
        if (i5 == 7) {
            obj.getClass();
            zzacp zzacpVar = (zzacp) obj;
            this.zzM = zzacpVar;
            zzadr zzadrVar = this.zzp;
            if (zzadrVar != null) {
                zzadrVar.zzl(zzacpVar);
                return;
            }
            return;
        }
        if (i5 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzL != intValue) {
                this.zzL = intValue;
                return;
            }
            return;
        }
        if (i5 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzx = intValue2;
            zzuk zzaE = zzaE();
            if (zzaE != null) {
                zzaE.zzq(intValue2);
                return;
            }
            return;
        }
        if (i5 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzy = intValue3;
            zzadr zzadrVar2 = this.zzp;
            if (zzadrVar2 != null) {
                zzadrVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i5 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzadr zzadrVar3 = this.zzp;
                if (zzadrVar3 == null || !zzadrVar3.zze()) {
                    return;
                }
                zzadrVar3.zzf();
                return;
            }
            this.zzs = list;
            zzadr zzadrVar4 = this.zzp;
            if (zzadrVar4 != null) {
                zzadrVar4.zzn(list);
                return;
            }
            return;
        }
        if (i5 == 14) {
            obj.getClass();
            zzes zzesVar = (zzes) obj;
            if (zzesVar.zza() == 0 || zzesVar.zzb() == 0) {
                return;
            }
            this.zzv = zzesVar;
            zzadr zzadrVar5 = this.zzp;
            if (zzadrVar5 != null) {
                Surface surface = this.zzt;
                surface.getClass();
                zzadrVar5.zzp(surface, zzesVar);
                return;
            }
            return;
        }
        switch (i5) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zzuk zzaE2 = zzaE();
                if (zzaE2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zzaE2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbo(null);
                obj.getClass();
                ((zzacc) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z4 = this.zzD != null;
                zzms zzmsVar = (zzms) obj;
                this.zzD = zzmsVar;
                if (z4 != (zzmsVar != null)) {
                    zzaZ();
                    break;
                }
                break;
            default:
                super.zzx(i5, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzy(boolean z4, boolean z5) {
        super.zzy(z4, z5);
        zzJ();
        this.zzg.zza(((zzuu) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzacg zzacgVar = new zzacg(this.zze, this.zzi);
                zzacgVar.zza(true);
                long j2 = this.zzk;
                zzacgVar.zzc(j2 != -9223372036854775807L ? -j2 : -9223372036854775807L);
                zzacgVar.zzb(zzL());
                zzaco zzd2 = zzacgVar.zzd();
                zzd2.zza(1);
                this.zzp = zzd2.zzb(0);
            }
            this.zzq = true;
        }
        int i5 = !z5 ? 1 : 0;
        zzadr zzadrVar = this.zzp;
        if (zzadrVar == null) {
            zzacs zzacsVar = this.zzi;
            zzacsVar.zzg(zzL());
            zzacsVar.zza(i5);
            return;
        }
        zzadrVar.zzc(new zzabx(this), zzhaf.zza());
        zzacp zzacpVar = this.zzM;
        if (zzacpVar != null) {
            this.zzp.zzl(zzacpVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzes.zza)) {
            this.zzp.zzp(this.zzt, this.zzv);
        }
        this.zzp.zzr(this.zzy);
        this.zzp.zzm(zzaX());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzn(list);
        }
        this.zzr = i5;
        zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzuu, com.google.android.gms.internal.ads.zzij
    public final void zzz(zzv[] zzvVarArr, long j2, long j5, zzwk zzwkVar) {
        super.zzz(zzvVarArr, j2, j5, zzwkVar);
        zzbf zzM = zzM();
        if (zzM.zzg()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzM.zzo(zzwkVar.zza, new zzbd()).zzd;
        }
    }
}
