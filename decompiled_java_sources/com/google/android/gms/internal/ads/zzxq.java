package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;
    private zzwh zzs;
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzxq.this.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzxq.this.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, String str, int i5, boolean z4, int i6, zzv zzvVar, long j2, zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i5;
        this.zzn = zzxdVar;
        this.zzl = j2;
    }

    private final void zzR(int i5) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (zArr[i5]) {
            return;
        }
        zzv zza = zzxpVar.zza.zza(i5).zza(0);
        this.zzg.zzh(new zzwg(1, zzas.zzf(zza.zzo), zza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
        zArr[i5] = true;
    }

    private final void zzS(int i5) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i5]) && !this.zzv[i5].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (zzxoVar.equals(this.zzw[i5])) {
                return this.zzv[i5];
            }
        }
        if (this.zzx) {
            int i6 = zzxoVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i6);
            sb.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i7 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i7);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i7);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i7);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i5;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i6 = 0; i6 < length; i6++) {
            zzv zzn = this.zzv[i6].zzn();
            zzn.getClass();
            String str = zzn.zzo;
            boolean zza = zzas.zza(str);
            boolean z4 = zza || zzas.zzb(str);
            zArr[i6] = z4;
            this.zzz = z4 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zza || this.zzw[i6].zzb) {
                    zzap zzapVar = zzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zza2 = zzn.zza();
                    zza2.zzk(zzapVar2);
                    zzn = zza2.zzM();
                }
                if (zza && zzn.zzh == -1 && zzn.zzi == -1 && (i5 = zzaicVar.zza) != -1) {
                    zzt zza3 = zzn.zza();
                    zza3.zzh(i5);
                    zzn = zza3.zzM();
                }
            }
            zzv zzb2 = zzn.zzb(this.zzf.zzb(zzn));
            zzbgVarArr[i6] = new zzbg(Integer.toString(i6), zzb2);
            this.zzI = zzb2.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j2 = this.zzD;
            if (j2 != -9223372036854775807L && this.zzM > j2) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int i5 = 0;
        for (zzyb zzybVar : this.zzv) {
            i5 += zzybVar.zzi();
        }
        return i5;
    }

    private final long zzY(boolean z4) {
        int i5;
        long j2 = Long.MIN_VALUE;
        while (true) {
            zzyb[] zzybVarArr = this.zzv;
            if (i5 >= zzybVarArr.length) {
                return j2;
            }
            if (!z4) {
                zzxp zzxpVar = this.zzB;
                zzxpVar.getClass();
                i5 = zzxpVar.zzc[i5] ? 0 : i5 + 1;
            }
            j2 = Math.max(j2, zzybVarArr[i5].zzo());
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j2, long j5, boolean z4) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j2, j5, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z4) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j2, long j5) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long zzY = zzY(true);
            long j6 = zzY == Long.MIN_VALUE ? 0L : zzY + 10000;
            this.zzD = j6;
            this.zzi.zzb(j6, this.zzC, this.zzE);
        }
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j2, j5, zzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j2, long j5, int i5) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        if (i5 == 0) {
            long zze = zzxhVar.zze();
            zzhf zzh = zzxhVar.zzh();
            zzwbVar = new zzwb(zze, zzh, zzh.zza, Collections.EMPTY_MAP, j2, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j2, j5, zzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i5);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z4 = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z4 = true;
        }
        this.zzE = z4;
        this.zzF = true == z4 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z4);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzxq.this.zzG();
            }
        });
    }

    public final /* synthetic */ long zzI(boolean z4) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        zzaac zzaacVar;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i5 = this.zzJ;
        int i6 = 0;
        for (int i7 = 0; i7 < zzaacVarArr.length; i7++) {
            zzyc zzycVar = zzycVarArr[i7];
            if (zzycVar != null && (zzaacVarArr[i7] == null || !zArr[i7])) {
                int zza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[zza]);
                this.zzJ--;
                zArr3[zza] = false;
                zzycVarArr[i7] = null;
            }
        }
        boolean z4 = !this.zzG ? j2 == 0 || this.zzA : i5 != 0;
        for (int i8 = 0; i8 < zzaacVarArr.length; i8++) {
            if (zzycVarArr[i8] == null && (zzaacVar = zzaacVarArr[i8]) != null) {
                zzgrc.zzi(zzaacVar.zze() == 1);
                zzgrc.zzi(zzaacVar.zzf(0) == 0);
                int zzb2 = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[zzb2]);
                this.zzJ++;
                zArr3[zzb2] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i8] = new zzxn(this, zzb2);
                zArr2[i8] = true;
                if (!z4) {
                    zzyb zzybVar = this.zzv[zzb2];
                    z4 = (zzybVar.zzm() == 0 || zzybVar.zzt(j2, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i6 < length) {
                    zzybVarArr[i6].zzx();
                    i6++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z4) {
            j2 = zzj(j2);
            while (i6 < zzycVarArr.length) {
                if (zzycVarArr[i6] != null) {
                    zArr2[i6] = true;
                }
                i6++;
            }
        }
        this.zzG = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z4) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.zzv[i5].zzw(j2, false, zArr[i5]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long j2;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            j2 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < length; i5++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i5] && zzxpVar.zzc[i5] && !this.zzv[i5].zzp()) {
                    j2 = Math.min(j2, this.zzv[i5].zzo());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = zzY(false);
        }
        return j2 == Long.MIN_VALUE ? this.zzL : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j2 = 0;
        }
        this.zzH = false;
        long j5 = this.zzL;
        this.zzL = j2;
        if (zzZ()) {
            this.zzM = j2;
            return j2;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i5 = 0; i5 < length; i5++) {
                zzyb zzybVar = this.zzv[i5];
                if (this.zzu[i5].zzf() && (zzybVar.zzm() != 0 || j5 != j2)) {
                    if (this.zzA ? zzybVar.zzs(zzybVar.zzl()) : zzybVar.zzt(j2, this.zzP)) {
                        continue;
                    } else if (!zArr[i5] && this.zzz) {
                    }
                }
            }
            return j2;
        }
        this.zzN = false;
        this.zzM = j2;
        this.zzP = false;
        this.zzI = false;
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zze()) {
            for (zzyb zzybVar2 : this.zzv) {
                zzybVar2.zzx();
            }
            zzabfVar.zzf();
            return j2;
        }
        zzabfVar.zzc();
        for (zzyb zzybVar3 : this.zzv) {
            zzybVar3.zzg(false);
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r23 == Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j2, zzmt zzmtVar) {
        long j5;
        long j6;
        boolean z4;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzafw zzc2 = this.zzC.zzc(j2);
        zzafz zzafzVar = zzc2.zza;
        zzafz zzafzVar2 = zzc2.zzb;
        long j7 = zzmtVar.zzd;
        if (j7 == 0) {
            if (zzmtVar.zze == 0) {
                return j2;
            }
            j7 = 0;
        }
        String str = zzfj.zza;
        long j8 = j2 - j7;
        long j9 = Long.MAX_VALUE;
        long j10 = (((j7 ^ j2) > 0L ? 1 : ((j7 ^ j2) == 0L ? 0 : -1)) >= 0) | (((j2 ^ j8) > 0L ? 1 : ((j2 ^ j8) == 0L ? 0 : -1)) >= 0) ? j8 : ((j8 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j11 = Long.MIN_VALUE;
        if (j10 == Long.MIN_VALUE) {
            if (j8 == Long.MIN_VALUE) {
                j8 = Long.MIN_VALUE;
            }
            j10 = Long.MIN_VALUE;
            long j12 = zzmtVar.zze;
            long j13 = j2 + j12;
            j5 = !((((j2 ^ j13) > 0L ? 1 : ((j2 ^ j13) == 0L ? 0 : -1)) < 0) | (((j12 ^ j2) > 0L ? 1 : ((j12 ^ j2) == 0L ? 0 : -1)) >= 0)) ? j13 : ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
            if (j5 == Long.MIN_VALUE) {
                j11 = j13;
            }
            if (j5 != Long.MAX_VALUE) {
                int i5 = (j11 > Long.MAX_VALUE ? 1 : (j11 == Long.MAX_VALUE ? 0 : -1));
            } else {
                j9 = j5;
            }
            j6 = zzafzVar.zzb;
            z4 = j10 > j6 && j6 <= j9;
            long j14 = zzafzVar2.zzb;
            boolean z5 = j10 > j14 && j14 <= j9;
            if (z4 || !z5) {
                if (!z4) {
                    return z5 ? j14 : j10;
                }
                return j6;
            }
            if (Math.abs(j6 - j2) <= Math.abs(j14 - j2)) {
                return j6;
            }
        }
        if (j10 == Long.MAX_VALUE) {
            if (j8 == Long.MAX_VALUE) {
                j10 = Long.MAX_VALUE;
            }
            j10 = Long.MIN_VALUE;
        }
        long j122 = zzmtVar.zze;
        long j132 = j2 + j122;
        if (!((((j2 ^ j132) > 0L ? 1 : ((j2 ^ j132) == 0L ? 0 : -1)) < 0) | (((j122 ^ j2) > 0L ? 1 : ((j122 ^ j2) == 0L ? 0 : -1)) >= 0))) {
        }
        if (j5 == Long.MIN_VALUE) {
        }
        if (j5 != Long.MAX_VALUE) {
        }
        j6 = zzafzVar.zzb;
        if (j10 > j6) {
        }
        long j142 = zzafzVar2.zzb;
        if (j10 > j142) {
        }
        if (z4) {
        }
        if (!z4) {
        }
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    public final boolean zzp(int i5) {
        return !zzT() && this.zzv[i5].zzq(this.zzP);
    }

    public final void zzq(int i5) {
        this.zzv[i5].zzk();
        zzr();
    }

    public final void zzr() {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    public final int zzs(int i5, zzlh zzlhVar, zzih zzihVar, int i6) {
        if (zzT()) {
            return -3;
        }
        zzR(i5);
        int zzr = this.zzv[i5].zzr(zzlhVar, zzihVar, i6, this.zzP);
        if (zzr == -3) {
            zzS(i5);
        }
        return zzr;
    }

    public final int zzt(int i5, long j2) {
        if (zzT()) {
            return 0;
        }
        zzR(i5);
        zzyb zzybVar = this.zzv[i5];
        int zzu = zzybVar.zzu(j2, this.zzP);
        zzybVar.zzv(zzu);
        if (zzu != 0) {
            return zzu;
        }
        zzS(i5);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i5, int i6) {
        return zzU(new zzxo(i5, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(final zzafy zzafyVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzxq.this.zzF(zzafyVar);
            }
        });
    }

    public final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // com.google.android.gms.internal.ads.zzaax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j2, long j5, IOException iOException, int i5) {
        long j6;
        zzaaz zza;
        zzafy zzafyVar;
        boolean zza2;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzf.zzg(), zzf.zzh(), j2, j5, zzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if (!(iOException instanceof zzat) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzhp) && !(iOException instanceof zzabe)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzhc) || ((zzhc) th).zza != 2008) {
                }
            }
            j6 = Math.min((i5 - 1) * zzbgj.zzq.zzf, 5000);
            if (j6 != -9223372036854775807L) {
                zza = zzabf.zzb;
            } else {
                int zzX = zzX();
                boolean z4 = zzX > this.zzO;
                if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                    this.zzO = zzX;
                } else {
                    boolean z5 = this.zzy;
                    if (!z5 || zzT()) {
                        this.zzH = z5;
                        this.zzL = 0L;
                        this.zzO = 0;
                        for (zzyb zzybVar : this.zzv) {
                            zzybVar.zzg(false);
                        }
                        zzxhVar.zzd(0L, 0L);
                    } else {
                        this.zzN = true;
                        zza = zzabf.zza;
                    }
                }
                zza = zzabf.zza(z4, j6);
            }
            zza2 = zza.zza();
            this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, !zza2);
            if (!zza2) {
                zzxhVar.zze();
            }
            return zza;
        }
        j6 = -9223372036854775807L;
        if (j6 != -9223372036854775807L) {
        }
        zza2 = zza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, !zza2);
        if (!zza2) {
        }
        return zza;
    }
}
