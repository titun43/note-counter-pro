package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzuq zzC;
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;
    private zzv zzn;
    private zzv zzo;
    private zzth zzp;
    private zzth zzq;
    private zzmk zzr;
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzuk zzw;
    private zzv zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i5, zzui zzuiVar, zzuw zzuwVar, boolean z4, float f5) {
        super(i5);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f5;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = -9223372036854775807L;
        zzbo().zzf = -9223372036854775807L;
        this.zzah = -9223372036854775807L;
    }

    private final boolean zzax(int i5) {
        zzlh zzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int zzO = zzO(zzH, zzihVar, i5 | 4);
        if (zzO == -5) {
            zzam(zzH);
            return true;
        }
        if (zzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j2) {
        return this.zzt == -9223372036854775807L || zzL().zzb() - j2 < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(zzv zzvVar) {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f5 = this.zzv;
            zzvVar.getClass();
            float zzai = zzai(f5, zzvVar, zzI());
            float f6 = this.zzA;
            if (f6 != zzai) {
                if (zzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f6 != -1.0f || zzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = zzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() {
        int i5 = this.zzY;
        if (i5 == 1) {
            zzav();
            return;
        }
        if (i5 == 2) {
            zzav();
            zzbp();
        } else if (i5 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != -9223372036854775807L) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j2, long j5) {
        if (j5 >= j2) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, "audio/opus") && zzafu.zzf(j2, j5)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzA(long j2, boolean z4, boolean z5) {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z5) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public final long zzT(long j2, long j5) {
        return zzah(j2, j5, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public void zzV(float f5, float f6) {
        this.zzu = f5;
        this.zzv = f6;
        zzbj(this.zzx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f9, code lost:
    
        r5 = (byte[]) r21.zzx.zzr.get(r0);
        r6 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0407, code lost:
    
        if (r6 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x040f, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0410, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0413, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0414, code lost:
    
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0418, code lost:
    
        if (r0 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x041a, code lost:
    
        r0 = r0.position();
        r5 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0422, code lost:
    
        r4.zzi(new com.google.android.gms.internal.ads.zzur(r21, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x042a, code lost:
    
        r6 = r21.zzm.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0431, code lost:
    
        if (r6 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0444, code lost:
    
        if (r6 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0448, code lost:
    
        if (r21.zzW != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x044a, code lost:
    
        r21.zzg.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0451, code lost:
    
        zzam(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0456, code lost:
    
        r5 = r21.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x045c, code lost:
    
        if (r5.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0492, code lost:
    
        if (r21.zzZ != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0498, code lost:
    
        if (r5.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x049a, code lost:
    
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x049f, code lost:
    
        if (r21.zzW != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04a1, code lost:
    
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04a5, code lost:
    
        r6 = r5.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04ab, code lost:
    
        if (zzaT(r5) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04ad, code lost:
    
        r8 = r5.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04b1, code lost:
    
        if (r8 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04b3, code lost:
    
        r5.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04ba, code lost:
    
        if (r21.zzaf == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04bc, code lost:
    
        r0 = zzbo().zze;
        r9 = r21.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c4, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c6, code lost:
    
        r0.zza(r6, r9);
        r21.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04cc, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04cd, code lost:
    
        r21.zzac = java.lang.Math.max(r21.zzac, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04d9, code lost:
    
        if (zzcW() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04df, code lost:
    
        if (r5.zzd() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04e9, code lost:
    
        r5.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04f0, code lost:
    
        if (r5.zze() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04f2, code lost:
    
        zzas(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04f7, code lost:
    
        if (r21.zzak == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04f9, code lost:
    
        r9 = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04fd, code lost:
    
        if (r6 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04ff, code lost:
    
        r21.zzal = ((r9 - r6) + 1) + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0509, code lost:
    
        r21.zzac = r6;
        r21.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x050d, code lost:
    
        zzaR(r5);
        r10 = zzaS(r5);
        r6 = r6 + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0517, code lost:
    
        if (r8 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0519, code lost:
    
        r4.zzb(r21.zzN, 0, r5.zzb, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0534, code lost:
    
        zzbh();
        r21.zzZ = true;
        r21.zzW = 0;
        r21.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0524, code lost:
    
        r0 = r21.zzN;
        r5 = r5.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0529, code lost:
    
        if (r5 == null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x052b, code lost:
    
        r4.zza(r0, 0, r5.limit(), r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0543, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04e1, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x045e, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0468, code lost:
    
        if (r21.zzW != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046a, code lost:
    
        r5.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x046f, code lost:
    
        r21.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0473, code lost:
    
        if (r21.zzZ != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0475, code lost:
    
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x047c, code lost:
    
        if (r21.zzJ != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x047e, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0437, code lost:
    
        if (zzcW() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0439, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0544, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0545, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0556, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0584, code lost:
    
        r3 = r0.getStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0589, code lost:
    
        if (r3.length <= 0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05c7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05a7, code lost:
    
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05ac, code lost:
    
        zzaI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05bb, code lost:
    
        r3 = 4006;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05be, code lost:
    
        r3 = 4003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a1, code lost:
    
        if (r21.zzJ != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03a3, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03b7, code lost:
    
        r21.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x02d6, code lost:
    
        if (r21.zzo != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0372, code lost:
    
        r4 = r21.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0374, code lost:
    
        if (r4 == null) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0379, code lost:
    
        if (r21.zzX == 2) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x037d, code lost:
    
        if (r21.zzad == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0385, code lost:
    
        if (r21.zzN >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0387, code lost:
    
        r0 = r4.zze();
        r21.zzN = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x038d, code lost:
    
        if (r0 < 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x038f, code lost:
    
        r5 = r21.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x039d, code lost:
    
        if (r21.zzX != 1) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03be, code lost:
    
        if (r21.zzH == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03c1, code lost:
    
        r21.zzH = false;
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03c7, code lost:
    
        if (r0 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzuu.zzb);
        r4.zza(r21.zzN, 0, 38, 0, 0);
        zzbh();
        r21.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e6, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ea, code lost:
    
        if (r21.zzW != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03ed, code lost:
    
        r5 = r21.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03ef, code lost:
    
        if (r5 == null) goto L414;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0369 A[LOOP:0: B:20:0x01fa->B:58:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzX(long j2, long j5) {
        boolean z4;
        boolean z5;
        ?? r12;
        boolean z6;
        boolean z7;
        zzum zzaP;
        int i5;
        boolean z8;
        ?? r2;
        boolean z9;
        Throwable th;
        long j6;
        boolean z10;
        boolean z11;
        ByteBuffer byteBuffer;
        int i6;
        MediaCodec.BufferInfo bufferInfo;
        long j7;
        int i7;
        long j8;
        boolean z12 = true;
        try {
            try {
                if (this.zzae) {
                    zzar();
                    return;
                }
                int i8 = 2;
                if (this.zzn == null && !zzax(2)) {
                    return;
                }
                zzaA();
                ?? r5 = -5;
                char c5 = 65531;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            try {
                                if (this.zzS) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgrc.zzi(this.zzae ^ z12);
                                                zzub zzubVar = this.zzi;
                                                if (zzubVar.zzp()) {
                                                    ByteBuffer byteBuffer2 = zzubVar.zzc;
                                                    int i9 = this.zzO;
                                                    int zzo = zzubVar.zzo();
                                                    long j9 = zzubVar.zze;
                                                    boolean zzbq = zzbq(zzG(), zzubVar.zzn());
                                                    boolean zzb2 = zzubVar.zzb();
                                                    zzv zzvVar = this.zzo;
                                                    if (zzvVar == null) {
                                                        throw th2;
                                                    }
                                                    if (!zzaq(j2, j5, null, byteBuffer2, i9, 0, zzo, j9, zzbq, zzb2, zzvVar)) {
                                                        z12 = true;
                                                        break;
                                                    } else {
                                                        zzaV(zzubVar.zzn());
                                                        zzubVar.zza();
                                                        r2 = 0;
                                                    }
                                                } else {
                                                    r2 = th2;
                                                }
                                                try {
                                                    if (!this.zzad) {
                                                        z12 = true;
                                                        if (this.zzT) {
                                                            zzgrc.zzi(zzubVar.zzq(this.zzh));
                                                            z9 = false;
                                                            this.zzT = false;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        if (this.zzU) {
                                                            if (!zzubVar.zzp()) {
                                                                zzao();
                                                                this.zzU = z9;
                                                                zzaA();
                                                                if (!this.zzS) {
                                                                    break;
                                                                }
                                                            } else {
                                                                th2 = r2;
                                                            }
                                                        }
                                                        zzgrc.zzi(!this.zzad);
                                                        zzlh zzH = zzH();
                                                        zzih zzihVar = this.zzh;
                                                        zzihVar.zza();
                                                        do {
                                                            zzihVar.zza();
                                                            int zzO = zzO(zzH, zzihVar, z9 ? 1 : 0);
                                                            if (zzO == -5) {
                                                                zzam(zzH);
                                                                break;
                                                            }
                                                            if (zzO == -4) {
                                                                if (!zzihVar.zzb()) {
                                                                    this.zzac = Math.max(this.zzac, zzihVar.zze);
                                                                    if (zzcW() || this.zzg.zzd()) {
                                                                        zzbo().zzf = this.zzac;
                                                                    }
                                                                    if (this.zzaf) {
                                                                        zzv zzvVar2 = this.zzn;
                                                                        if (zzvVar2 == null) {
                                                                            throw r2;
                                                                        }
                                                                        this.zzo = zzvVar2;
                                                                        if (Objects.equals(zzvVar2.zzo, "audio/opus") && !this.zzo.zzr.isEmpty()) {
                                                                            int zze = zzafu.zze((byte[]) this.zzo.zzr.get(z9 ? 1 : 0));
                                                                            zzt zza = this.zzo.zza();
                                                                            zza.zzH(zze);
                                                                            this.zzo = zza.zzM();
                                                                        }
                                                                        zzan(this.zzo, r2);
                                                                        this.zzaf = z9;
                                                                    }
                                                                    zzihVar.zzl();
                                                                    zzv zzvVar3 = this.zzo;
                                                                    if (zzvVar3 != null && Objects.equals(zzvVar3.zzo, "audio/opus")) {
                                                                        if (zzihVar.zze()) {
                                                                            zzihVar.zza = this.zzo;
                                                                            zzas(zzihVar);
                                                                        }
                                                                        if (zzafu.zzf(zzG(), zzihVar.zze)) {
                                                                            this.zzl.zza(zzihVar, this.zzo.zzr);
                                                                        }
                                                                    }
                                                                    if (zzubVar.zzp()) {
                                                                        long zzG = zzG();
                                                                        if (zzbq(zzG, zzubVar.zzn()) != zzbq(zzG, zzihVar.zze)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    this.zzad = true;
                                                                    zzbo().zzf = this.zzac;
                                                                    break;
                                                                }
                                                            } else if (zzcW()) {
                                                                zzbo().zzf = this.zzac;
                                                            }
                                                        } while (zzubVar.zzq(zzihVar));
                                                        this.zzT = true;
                                                        if (zzubVar.zzp()) {
                                                            zzubVar.zzl();
                                                        }
                                                        if (!zzubVar.zzp() && !this.zzad && !this.zzU) {
                                                            break;
                                                        } else {
                                                            th2 = r2;
                                                        }
                                                    } else {
                                                        z12 = true;
                                                        this.zzae = true;
                                                        break;
                                                    }
                                                } catch (IllegalStateException e4) {
                                                    e = e4;
                                                    z12 = true;
                                                    c5 = 0;
                                                    z4 = z12;
                                                    r12 = c5;
                                                    z6 = e instanceof MediaCodec.CodecException;
                                                    if (!z6) {
                                                    }
                                                    zzal(e);
                                                    if (z6) {
                                                    }
                                                    z7 = r12;
                                                    if (z7) {
                                                    }
                                                    zzaP = zzaP(e, this.zzD);
                                                    if (zzaP.zza != 1101) {
                                                    }
                                                    throw zzN(zzaP, this.zzn, z7, i5);
                                                }
                                            }
                                            z9 = false;
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e5) {
                                            e = e5;
                                            r5 = 0;
                                            z5 = r5;
                                            throw zzN(e, this.zzn, z5, zzfj.zzE(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e6) {
                                        e = e6;
                                    }
                                } else {
                                    char c6 = 65531;
                                    Throwable th3 = null;
                                    boolean z13 = false;
                                    if (this.zzw != null) {
                                        long zzb3 = zzL().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j10 = zzb3;
                                        while (true) {
                                            zzuk zzukVar = this.zzw;
                                            if (zzukVar == null) {
                                                throw th3;
                                            }
                                            try {
                                                if (zzbg()) {
                                                    th = th3;
                                                } else {
                                                    try {
                                                        MediaCodec.BufferInfo bufferInfo2 = this.zzj;
                                                        int zzf = zzukVar.zzf(bufferInfo2);
                                                        if (zzf >= 0) {
                                                            th = th3;
                                                            bufferInfo2.presentationTimeUs -= this.zzal;
                                                            if (!this.zzI) {
                                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                                    zzbm();
                                                                    break;
                                                                }
                                                                this.zzO = zzf;
                                                                ByteBuffer zzj = zzukVar.zzj(zzf);
                                                                this.zzP = zzj;
                                                                if (zzj != null) {
                                                                    zzj.position(bufferInfo2.offset);
                                                                    this.zzP.limit(bufferInfo2.offset + bufferInfo2.size);
                                                                }
                                                                zzv zzvVar4 = (zzv) this.zzag.zze.zze(bufferInfo2.presentationTimeUs);
                                                                if (zzvVar4 == null && this.zzai && this.zzy != null) {
                                                                    zzvVar4 = (zzv) this.zzag.zze.zzd();
                                                                }
                                                                if (zzvVar4 != null) {
                                                                    this.zzo = zzvVar4;
                                                                } else if (this.zzz) {
                                                                }
                                                                zzv zzvVar5 = this.zzo;
                                                                if (zzvVar5 == null) {
                                                                    throw th;
                                                                }
                                                                zzan(zzvVar5, this.zzy);
                                                                this.zzz = z13;
                                                                this.zzai = z13;
                                                            } else {
                                                                this.zzI = z13;
                                                                zzukVar.zzc(zzf, z13);
                                                                j6 = j10;
                                                                if (!zzay(j6)) {
                                                                }
                                                            }
                                                        } else if (zzf == -2) {
                                                            this.zzab = z12;
                                                            zzuk zzukVar2 = this.zzw;
                                                            if (zzukVar2 == null) {
                                                                throw th3;
                                                            }
                                                            MediaFormat zzg = zzukVar2.zzg();
                                                            if (this.zzE != 0 && zzg.getInteger("width") == 32 && zzg.getInteger("height") == 32) {
                                                                this.zzI = z12;
                                                            } else {
                                                                this.zzy = zzg;
                                                                this.zzz = z12;
                                                            }
                                                            th = th3;
                                                            j6 = j10;
                                                            if (!zzay(j6)) {
                                                                break;
                                                            }
                                                            j10 = j6;
                                                            th3 = th;
                                                            z12 = true;
                                                            i8 = 2;
                                                            z13 = false;
                                                            c6 = 65531;
                                                        } else {
                                                            if (this.zzJ && (this.zzad || this.zzX == i8)) {
                                                                zzbm();
                                                            }
                                                            long j11 = this.zzK;
                                                            if (j11 != -9223372036854775807L && j11 + 100 < zzL().zza()) {
                                                                zzbm();
                                                            }
                                                            th = th3;
                                                        }
                                                    } catch (IllegalStateException e7) {
                                                        e = e7;
                                                        z8 = z13;
                                                        z4 = true;
                                                        r12 = z8;
                                                        z6 = e instanceof MediaCodec.CodecException;
                                                        if (!z6) {
                                                        }
                                                        zzal(e);
                                                        if (z6) {
                                                        }
                                                        z7 = r12;
                                                        if (z7) {
                                                        }
                                                        zzaP = zzaP(e, this.zzD);
                                                        if (zzaP.zza != 1101) {
                                                        }
                                                        throw zzN(zzaP, this.zzn, z7, i5);
                                                    }
                                                }
                                                zzv zzvVar6 = this.zzo;
                                                if (zzvVar6 == null) {
                                                    throw th;
                                                }
                                                if (!zzaq(j2, j5, zzukVar, byteBuffer, i6, i7, 1, j8, z10, z11, zzvVar6)) {
                                                    break;
                                                }
                                                zzaV(bufferInfo.presentationTimeUs);
                                                boolean z14 = (bufferInfo.flags & 4) != 0;
                                                if (!z14 && this.zzaa && this.zzR) {
                                                    this.zzK = zzL().zza();
                                                }
                                                zzbi();
                                                if (z14) {
                                                    zzbm();
                                                    break;
                                                } else {
                                                    j6 = j7;
                                                    if (!zzay(j6)) {
                                                    }
                                                }
                                            } catch (IllegalStateException e8) {
                                                e = e8;
                                                r12 = z13;
                                                z4 = true;
                                                z6 = e instanceof MediaCodec.CodecException;
                                                if (!z6) {
                                                }
                                                zzal(e);
                                                if (z6) {
                                                }
                                                z7 = r12;
                                                if (z7) {
                                                }
                                                zzaP = zzaP(e, this.zzD);
                                                if (zzaP.zza != 1101) {
                                                }
                                                throw zzN(zzaP, this.zzn, z7, i5);
                                            }
                                            z10 = (this.zzak || this.zzj.presentationTimeUs < zzG()) ? true : z13;
                                            this.zzQ = z10;
                                            long j12 = this.zzag.zzf;
                                            z11 = (j12 == -9223372036854775807L || j12 > this.zzj.presentationTimeUs) ? z13 : true;
                                            this.zzR = z11;
                                            byteBuffer = this.zzP;
                                            i6 = this.zzO;
                                            bufferInfo = this.zzj;
                                            j7 = j10;
                                            i7 = bufferInfo.flags;
                                            j8 = bufferInfo.presentationTimeUs;
                                        }
                                    } else {
                                        this.zza.zzd += zzP(j2);
                                        zzax(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e9) {
                                e = e9;
                                z8 = false;
                            }
                        } catch (IllegalStateException e10) {
                            e = e10;
                        }
                    } catch (MediaCodec.CryptoException e11) {
                        e = e11;
                    }
                } catch (MediaCodec.CryptoException e12) {
                    e = e12;
                    throw zzN(e, this.zzn, z5, zzfj.zzE(e.getErrorCode()));
                } catch (IllegalStateException e13) {
                    e = e13;
                }
                if (!zzay(j6)) {
                    Trace.endSection();
                    this.zza.zza();
                }
            } catch (MediaCodec.CryptoException e14) {
                e = e14;
                z5 = false;
            }
        } catch (IllegalStateException e15) {
            e = e15;
            z4 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0280 A[Catch: zzuq -> 0x0082, TryCatch #4 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:160:0x0060, B:162:0x0076, B:163:0x0087, B:29:0x0093, B:31:0x009b, B:33:0x009f, B:35:0x00a3, B:37:0x00ac, B:126:0x0267, B:128:0x0280, B:129:0x0289, B:134:0x0290, B:135:0x0292, B:136:0x0283, B:151:0x0294, B:153:0x0295, B:156:0x029a, B:157:0x029b, B:158:0x02a5, B:167:0x008a, B:168:0x0092, B:170:0x02a8), top: B:24:0x0055, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0283 A[Catch: zzuq -> 0x0082, TryCatch #4 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:160:0x0060, B:162:0x0076, B:163:0x0087, B:29:0x0093, B:31:0x009b, B:33:0x009f, B:35:0x00a3, B:37:0x00ac, B:126:0x0267, B:128:0x0280, B:129:0x0289, B:134:0x0290, B:135:0x0292, B:136:0x0283, B:151:0x0294, B:153:0x0295, B:156:0x029a, B:157:0x029b, B:158:0x02a5, B:167:0x008a, B:168:0x0092, B:170:0x02a8), top: B:24:0x0055, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:48:0x00db, B:50:0x00e5, B:52:0x00f6, B:55:0x0136, B:57:0x0147, B:58:0x0175, B:60:0x017e, B:62:0x0186, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:71:0x01ab, B:73:0x01b1, B:76:0x01bd, B:78:0x01c6, B:82:0x021e, B:84:0x0224, B:86:0x022a, B:87:0x0238, B:97:0x01d4, B:99:0x01dc, B:101:0x01e4, B:103:0x01ec, B:105:0x01f4, B:107:0x01fc, B:109:0x0204, B:111:0x020e, B:113:0x0218), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:48:0x00db, B:50:0x00e5, B:52:0x00f6, B:55:0x0136, B:57:0x0147, B:58:0x0175, B:60:0x017e, B:62:0x0186, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:71:0x01ab, B:73:0x01b1, B:76:0x01bd, B:78:0x01c6, B:82:0x021e, B:84:0x0224, B:86:0x022a, B:87:0x0238, B:97:0x01d4, B:99:0x01dc, B:101:0x01e4, B:103:0x01ec, B:105:0x01f4, B:107:0x01fc, B:109:0x0204, B:111:0x020e, B:113:0x0218), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:48:0x00db, B:50:0x00e5, B:52:0x00f6, B:55:0x0136, B:57:0x0147, B:58:0x0175, B:60:0x017e, B:62:0x0186, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:71:0x01ab, B:73:0x01b1, B:76:0x01bd, B:78:0x01c6, B:82:0x021e, B:84:0x0224, B:86:0x022a, B:87:0x0238, B:97:0x01d4, B:99:0x01dc, B:101:0x01e4, B:103:0x01ec, B:105:0x01f4, B:107:0x01fc, B:109:0x0204, B:111:0x020e, B:113:0x0218), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:48:0x00db, B:50:0x00e5, B:52:0x00f6, B:55:0x0136, B:57:0x0147, B:58:0x0175, B:60:0x017e, B:62:0x0186, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:71:0x01ab, B:73:0x01b1, B:76:0x01bd, B:78:0x01c6, B:82:0x021e, B:84:0x0224, B:86:0x022a, B:87:0x0238, B:97:0x01d4, B:99:0x01dc, B:101:0x01e4, B:103:0x01ec, B:105:0x01f4, B:107:0x01fc, B:109:0x0204, B:111:0x020e, B:113:0x0218), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:48:0x00db, B:50:0x00e5, B:52:0x00f6, B:55:0x0136, B:57:0x0147, B:58:0x0175, B:60:0x017e, B:62:0x0186, B:64:0x0190, B:66:0x0198, B:68:0x01a0, B:71:0x01ab, B:73:0x01b1, B:76:0x01bd, B:78:0x01c6, B:82:0x021e, B:84:0x0224, B:86:0x022a, B:87:0x0238, B:97:0x01d4, B:99:0x01dc, B:101:0x01e4, B:103:0x01ec, B:105:0x01f4, B:107:0x01fc, B:109:0x0204, B:111:0x020e, B:113:0x0218), top: B:47:0x00db }] */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzaA() {
        zzv zzvVar;
        boolean z4;
        zzun zzunVar;
        zzuq zzuqVar;
        zzv zzvVar2;
        ?? zzaf;
        int i5;
        long j2;
        long j5;
        int i6;
        boolean z5;
        String str;
        boolean equals;
        String stringId;
        LogSessionId unused;
        if (this.zzw != null || this.zzS || (zzvVar = this.zzn) == null) {
            return;
        }
        boolean z6 = true;
        if (zzaB(zzvVar)) {
            zzao();
            String str2 = zzvVar.zzo;
            if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                this.zzi.zzm(32);
            } else {
                this.zzi.zzm(1);
            }
            this.zzS = true;
            return;
        }
        zzth zzthVar = this.zzq;
        this.zzp = zzthVar;
        if (zzthVar != null) {
            zzgrc.zzi(true);
            this.zzp.zza();
        }
        try {
            zzv zzvVar3 = this.zzn;
            MediaCrypto mediaCrypto = null;
            if (zzvVar3 == null) {
                throw null;
            }
            if (this.zzB == null) {
                try {
                    List zzad = zzad(this.zzd, zzvVar3, false);
                    zzad.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!zzad.isEmpty()) {
                        this.zzB.add((zzun) zzad.get(0));
                    }
                    this.zzC = null;
                } catch (zzuy e4) {
                    throw new zzuq(zzvVar3, (Throwable) e4, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzuq(zzvVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzB;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzw == null) {
                zzun zzunVar2 = (zzun) arrayDeque.peekFirst();
                if (zzunVar2 == null) {
                    throw mediaCrypto;
                }
                zzaQ(zzvVar3);
                if (!zzaC(zzunVar2)) {
                    return;
                }
                try {
                    this.zzD = zzunVar2;
                    zzvVar2 = this.zzn;
                } catch (Exception e5) {
                    e = e5;
                    z4 = z6;
                }
                if (zzvVar2 == null) {
                    throw mediaCrypto;
                }
                String str3 = zzunVar2.zza;
                float zzai = zzai(this.zzv, zzvVar2, zzI());
                if (zzai <= this.zze) {
                    zzai = -1.0f;
                }
                long zzb2 = zzL().zzb();
                z4 = z6;
                try {
                    zzaf = zzaf(zzunVar2, zzvVar2, mediaCrypto, zzai);
                    i5 = Build.VERSION.SDK_INT;
                } catch (Exception e6) {
                    e = e6;
                    zzunVar = zzunVar2;
                    zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzunVar.zza), e);
                    arrayDeque.removeFirst();
                    zzuq zzuqVar2 = new zzuq(zzvVar3, (Throwable) e, false, zzunVar);
                    zzal(zzuqVar2);
                    zzuqVar = this.zzC;
                    if (zzuqVar != null) {
                    }
                    if (!arrayDeque.isEmpty()) {
                    }
                }
                try {
                    if (i5 >= 31) {
                        LogSessionId zza = zzK().zza();
                        unused = LogSessionId.LOG_SESSION_ID_NONE;
                        equals = zza.equals(LogSessionId.LOG_SESSION_ID_NONE);
                        if (!equals) {
                            j2 = zzb2;
                            MediaFormat mediaFormat = zzaf.zzb;
                            stringId = zza.getStringId();
                            mediaFormat.setString("log-session-id", stringId);
                            StringBuilder sb = new StringBuilder(str3.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str3);
                            Trace.beginSection(sb.toString());
                            zzuk zzb3 = this.zzc.zzb(zzaf);
                            this.zzw = zzb3;
                            this.zzL = zzb3.zzm(new zzus(this, null));
                            Trace.endSection();
                            long zzb4 = zzL().zzb();
                            if (zzunVar2.zzc(zzvVar2)) {
                                String zze = zzv.zze(zzvVar2);
                                String str4 = zzfj.zza;
                                Locale locale = Locale.US;
                                StringBuilder sb2 = new StringBuilder();
                                j5 = zzb4;
                                sb2.append("Format exceeds selected codec's capabilities [");
                                sb2.append(zze);
                                sb2.append(", ");
                                sb2.append(str3);
                                sb2.append("]");
                                zzee.zzc("MediaCodecRenderer", sb2.toString());
                            } else {
                                j5 = zzb4;
                            }
                            this.zzA = zzai;
                            this.zzx = zzvVar2;
                            if (i5 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                                str = Build.MODEL;
                                if (!str.startsWith("SM-T585") || str.startsWith("SM-A510") || str.startsWith("SM-A520") || str.startsWith("SM-J700")) {
                                    i6 = 2;
                                    this.zzE = i6;
                                    this.zzF = (i5 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z4;
                                    this.zzG = false;
                                    String str5 = zzunVar2.zza;
                                    if (i5 <= 25) {
                                        if ("OMX.rk.video_decoder.avc".equals(str5)) {
                                        }
                                        z5 = z4;
                                        this.zzJ = z5;
                                        if (this.zzw != null) {
                                            throw null;
                                        }
                                        if (zze() == 2) {
                                            this.zzM = zzL().zzb() + 1000;
                                        }
                                        this.zza.zza++;
                                        zzaf = zzunVar2;
                                        try {
                                            zzaj(str3, zzaf, j5, j5 - j2);
                                        } catch (Exception e7) {
                                            e = e7;
                                            zzunVar = zzaf;
                                            zzee.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzunVar.zza), e);
                                            arrayDeque.removeFirst();
                                            zzuq zzuqVar22 = new zzuq(zzvVar3, (Throwable) e, false, zzunVar);
                                            zzal(zzuqVar22);
                                            zzuqVar = this.zzC;
                                            if (zzuqVar != null) {
                                                this.zzC = zzuqVar22;
                                            } else {
                                                this.zzC = zzuqVar.zza(zzuqVar22);
                                            }
                                            if (!arrayDeque.isEmpty()) {
                                                throw this.zzC;
                                            }
                                            z6 = z4;
                                            mediaCrypto = null;
                                        }
                                        z6 = z4;
                                        mediaCrypto = null;
                                    }
                                    if ((i5 <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str5) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.avc.tunnel".equals(str5) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel".equals(str5) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzunVar2.zzf)) {
                                        z5 = false;
                                        this.zzJ = z5;
                                        if (this.zzw != null) {
                                        }
                                    }
                                    z5 = z4;
                                    this.zzJ = z5;
                                    if (this.zzw != null) {
                                    }
                                }
                            }
                            i6 = 0;
                            this.zzE = i6;
                            this.zzF = (i5 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z4;
                            this.zzG = false;
                            String str52 = zzunVar2.zza;
                            if (i5 <= 25) {
                            }
                            if (i5 <= 29) {
                            }
                            z5 = false;
                            this.zzJ = z5;
                            if (this.zzw != null) {
                            }
                        }
                    }
                    StringBuilder sb3 = new StringBuilder(str3.length() + 12);
                    sb3.append("createCodec:");
                    sb3.append(str3);
                    Trace.beginSection(sb3.toString());
                    zzuk zzb32 = this.zzc.zzb(zzaf);
                    this.zzw = zzb32;
                    this.zzL = zzb32.zzm(new zzus(this, null));
                    Trace.endSection();
                    long zzb42 = zzL().zzb();
                    if (zzunVar2.zzc(zzvVar2)) {
                    }
                    this.zzA = zzai;
                    this.zzx = zzvVar2;
                    if (i5 <= 25) {
                        str = Build.MODEL;
                        if (!str.startsWith("SM-T585")) {
                        }
                        i6 = 2;
                        this.zzE = i6;
                        this.zzF = (i5 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z4;
                        this.zzG = false;
                        String str522 = zzunVar2.zza;
                        if (i5 <= 25) {
                        }
                        if (i5 <= 29) {
                        }
                        z5 = false;
                        this.zzJ = z5;
                        if (this.zzw != null) {
                        }
                    }
                    i6 = 0;
                    this.zzE = i6;
                    this.zzF = (i5 == 29 || !"c2.android.aac.decoder".equals(str3)) ? false : z4;
                    this.zzG = false;
                    String str5222 = zzunVar2.zza;
                    if (i5 <= 25) {
                    }
                    if (i5 <= 29) {
                    }
                    z5 = false;
                    this.zzJ = z5;
                    if (this.zzw != null) {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                j2 = zzb2;
            }
            this.zzB = mediaCrypto;
        } catch (zzuq e8) {
            throw zzN(e8, zzvVar, false, 4001);
        }
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaC(zzun zzunVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    public final zzuk zzaE() {
        return this.zzw;
    }

    public final zzv zzaF() {
        return this.zzx;
    }

    public final MediaFormat zzaG() {
        return this.zzy;
    }

    public final zzun zzaH() {
        return this.zzD;
    }

    public final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzak(zzunVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th;
        }
    }

    public final boolean zzaJ() {
        boolean zzau = zzau();
        if (zzau) {
            zzaA();
        }
        return zzau;
    }

    public boolean zzaK() {
        int i5 = this.zzY;
        if (i5 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i5 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e4) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = -9223372036854775807L;
        this.zzaa = false;
        this.zzK = -9223372036854775807L;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzum zzaP(Throwable th, zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    public boolean zzaQ(zzv zzvVar) {
        return true;
    }

    public void zzaR(zzih zzihVar) {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    public void zzaV(long j2) {
        this.zzah = j2;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j2 < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != -9223372036854775807L && zzL().zzb() < this.zzM;
    }

    public final float zzaX() {
        return this.zzu;
    }

    public final zzmk zzaY() {
        return this.zzr;
    }

    public final boolean zzaZ() {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e4) {
            throw zzN(e4, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zzuw zzuwVar, zzv zzvVar);

    public abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z4);

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f5);

    public zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j2, long j5, boolean z4) {
        return super.zzT(j2, j5);
    }

    public float zzai(float f5, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzuh zzuhVar, long j2, long j5) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (zzbk() == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzio zzam(zzlh zzlhVar) {
        int i5;
        boolean z4 = true;
        this.zzaf = true;
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        String str = zzvVar.zzo;
        if (str == null) {
            throw zzN(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !zzvVar.zzr.isEmpty()) {
            zzt zza = zzvVar.zza();
            zza.zzp(null);
            zzvVar = zza.zzM();
        }
        zzv zzvVar2 = zzvVar;
        this.zzq = zzlhVar.zza;
        this.zzn = zzvVar2;
        if (this.zzS) {
            this.zzU = true;
            return null;
        }
        zzuk zzukVar = this.zzw;
        if (zzukVar == null) {
            this.zzB = null;
            zzaA();
            return null;
        }
        zzun zzunVar = this.zzD;
        zzunVar.getClass();
        zzv zzvVar3 = this.zzx;
        zzvVar3.getClass();
        zzth zzthVar = this.zzp;
        zzth zzthVar2 = this.zzq;
        if (zzthVar != zzthVar2) {
            zzbl();
            return new zzio(zzunVar.zza, zzvVar3, zzvVar2, 0, 128);
        }
        zzio zzag = zzag(zzunVar, zzvVar3, zzvVar2);
        int i6 = zzag.zzd;
        if (i6 != 0) {
            i5 = 2;
            if (i6 == 1) {
                if (zzbj(zzvVar2)) {
                    this.zzx = zzvVar2;
                    if (zzthVar2 == zzthVar) {
                        if (this.zzZ) {
                            this.zzX = 1;
                            if (this.zzG) {
                                this.zzY = 3;
                            } else {
                                this.zzY = 1;
                            }
                        }
                    }
                }
                i5 = 16;
            } else if (i6 != 2) {
                if (zzbj(zzvVar2)) {
                    this.zzx = zzvVar2;
                    if (zzthVar2 != zzthVar) {
                    }
                }
                i5 = 16;
            } else {
                if (zzbj(zzvVar2)) {
                    this.zzV = true;
                    this.zzW = 1;
                    int i7 = this.zzE;
                    if (i7 != 2 && (i7 != 1 || zzvVar2.zzv != zzvVar3.zzv || zzvVar2.zzw != zzvVar3.zzw)) {
                        z4 = false;
                    }
                    this.zzH = z4;
                    this.zzx = zzvVar2;
                    if (zzthVar2 != zzthVar) {
                    }
                }
                i5 = 16;
            }
            return (i6 != 0 || (this.zzw == zzukVar && this.zzY != 3)) ? zzag : new zzio(zzunVar.zza, zzvVar3, zzvVar2, 0, i5);
        }
        zzbl();
        i5 = 0;
        if (i6 != 0) {
        }
    }

    public void zzan(zzv zzvVar, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j2, long j5, zzuk zzukVar, ByteBuffer byteBuffer, int i5, int i6, int i7, long j6, boolean z4, boolean z5, zzv zzvVar);

    public void zzar() {
        throw null;
    }

    public void zzas(zzih zzihVar) {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    public final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i5, Object obj) {
        if (i5 == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzy(boolean z4, boolean z5) {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzz(zzv[] zzvVarArr, long j2, long j5, zzwk zzwkVar) {
        if (this.zzag.zzd == -9223372036854775807L) {
            zzbn(new zzut(-9223372036854775807L, j2, j5));
            if (this.zzaj) {
                zzap();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzk;
        if (arrayDeque.isEmpty()) {
            long j6 = this.zzac;
            if (j6 != -9223372036854775807L) {
                long j7 = this.zzah;
                if (j7 != -9223372036854775807L) {
                }
            }
            zzbn(new zzut(-9223372036854775807L, j2, j5));
            if (this.zzag.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        arrayDeque.add(new zzut(this.zzac, j2, j5));
    }
}
