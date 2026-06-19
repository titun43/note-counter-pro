package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i5, boolean z4, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j2, boolean z5, boolean z6, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j2;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zza2 = zzmd.zza(zzaakVar);
        this.zzG = zza2;
        this.zzH = new zzlc(zza2);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z7 = false;
        for (int i6 = 0; i6 < 2; i6++) {
            zzmlVarArr[i6].zzc(i6, zzpqVar, zzdnVar);
            this.zzc[i6] = zzmlVarArr[i6].zzb();
            this.zzc[i6].zzv(zzg);
            zzml zzmlVar = zzmlVarArr2[i6];
            if (zzmlVar != null) {
                zzmlVar.zzc(i6, zzpqVar, zzdnVar);
                z7 = true;
            }
            this.zzb[i6] = new zzmp(zzmlVarArr[i6], zzmlVarArr2[i6], i6);
        }
        this.zzy = z7;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzd = zzdnVar.zzd(looper, null);
        this.zzx = zzd;
        this.zzs = new zzlq(zzmxVar, zzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper zza3 = zzmeVar2.zza();
        this.zzk = zza3;
        zzdx zzd2 = zzdnVar.zzd(zza3, this);
        this.zzi = zzd2;
        this.zzz = new zzcd(context, zza3, this);
        zzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j5, long j6, zzv zzvVar, MediaFormat mediaFormat) {
                zzlf.this.zzcS(j5, j6, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i5) {
        zzlq zzlqVar = this.zzs;
        zziw zza2 = zziw.zza(iOException, i5);
        zzln zzm = zzlqVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zza2);
    }

    private final void zzB(int i5) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i5) {
            if (i5 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i5);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f5) {
        this.zzac = f5;
        float zza2 = this.zzz.zza() * f5;
        int i5 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzmpVarArr[i5].zzL(zza2);
            i5++;
        }
    }

    private final void zzE(boolean z4, int i5, boolean z5, int i6) {
        this.zzH.zza(z5 ? 1 : 0);
        zzG(z4, i5, i6);
    }

    private final void zzF() {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z4, int i5, int i6) {
        zzH(z4, this.zzz.zzc(z4, this.zzG.zze), i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzH(boolean z4, int i5, int i6, int i7) {
        boolean z5;
        zzmd zzmdVar;
        zzln zzm;
        if (z4) {
            if (i5 != -1) {
                z5 = true;
                if (i5 != -1) {
                    i7 = 2;
                } else if (i7 == 2) {
                    i7 = 1;
                }
                boolean z6 = this.zzC;
                if (i5 != 0) {
                    i6 = 1;
                } else if (i6 == 1) {
                    i6 = z6 ? 4 : 0;
                }
                zzmdVar = this.zzG;
                if (zzmdVar.zzl != z5 && zzmdVar.zzn == i6 && zzmdVar.zzm == i7) {
                    return;
                }
                this.zzG = zzmdVar.zzi(z5, i7, i6);
                zzaC(false, false);
                zzlq zzlqVar = this.zzs;
                for (zzm = zzlqVar.zzm(); zzm != null; zzm = zzm.zzp()) {
                    for (zzaac zzaacVar : zzm.zzr().zzc) {
                    }
                }
                if (zzax()) {
                    zzK();
                    zzL();
                    boolean z7 = this.zzG.zzp;
                    zzlqVar.zzf(this.zzT);
                    return;
                }
                int i8 = this.zzG.zze;
                if (i8 == 3) {
                    this.zzo.zza();
                    zzJ();
                    this.zzi.zzh(2);
                    return;
                } else {
                    if (i8 == 2) {
                        this.zzi.zzh(2);
                        return;
                    }
                    return;
                }
            }
            i5 = -1;
        }
        z5 = false;
        if (i5 != -1) {
        }
        boolean z62 = this.zzC;
        if (i5 != 0) {
        }
        zzmdVar = this.zzG;
        if (zzmdVar.zzl != z5) {
        }
        this.zzG = zzmdVar.zzi(z5, i7, i6);
        zzaC(false, false);
        zzlq zzlqVar2 = this.zzs;
        while (zzm != null) {
        }
        if (zzax()) {
        }
    }

    private final void zzI(boolean z4) {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (zzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, zzT, zzmdVar.zzc, zzmdVar.zzd, z4, 5);
        }
    }

    private final void zzJ() {
        zzln zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        zzaak zzr = zzm.zzr();
        int i5 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            if (zzr.zza(i5)) {
                zzmpVarArr[i5].zzv();
            }
            i5++;
        }
    }

    private final void zzK() {
        this.zzo.zzb();
        int i5 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzmpVarArr[i5].zzw();
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() {
        zzlb zzlbVar;
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzh = zzm.zze ? zzm.zza.zzh() : -9223372036854775807L;
        if (zzh != -9223372036854775807L) {
            if (!zzm.zzd()) {
                zzlqVar.zzs(zzm);
                zzas(false);
                zzam();
            }
            zzU(zzh, true);
            if (zzh != this.zzG.zzs) {
                zzmd zzmdVar = this.zzG;
                long j2 = zzh;
                this.zzG = zzao(zzmdVar.zzb, j2, zzmdVar.zzc, j2, true, 5);
            }
        } else {
            zziu zziuVar = this.zzo;
            long zzf = zziuVar.zzf(zzm != zzlqVar.zzn());
            this.zzT = zzf;
            long zza2 = zzf - zzm.zza();
            long j5 = this.zzG.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzG.zzb.zzb()) {
                if (this.zzW) {
                    j5--;
                    this.zzW = false;
                }
                zzmd zzmdVar2 = this.zzG;
                int zze = zzmdVar2.zza.zze(zzmdVar2.zzb.zza);
                int min = Math.min(this.zzV, arrayList.size());
                if (min > 0) {
                    zzlbVar = (zzlb) arrayList.get(min - 1);
                    while (zzlbVar != null && (zze < 0 || (zze == 0 && j5 < 0))) {
                        int i5 = min - 1;
                        if (i5 > 0) {
                            zzlbVar = (zzlb) arrayList.get(min - 2);
                            min = i5;
                        } else {
                            min = i5;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzV = min;
                }
                zzlbVar = null;
            }
            if (zziuVar.zzh()) {
                boolean z4 = !this.zzH.zzc;
                zzmd zzmdVar3 = this.zzG;
                this.zzG = zzao(zzmdVar3.zzb, zza2, zzmdVar3.zzc, zza2, z4, 6);
            } else {
                zzmd zzmdVar4 = this.zzG;
                zzmdVar4.zzs = zza2;
                zzmdVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzG.zzq = zzlqVar.zzk().zzf();
        this.zzG.zzr = zzat();
        zzmd zzmdVar5 = this.zzG;
        if (zzmdVar5.zzl && zzmdVar5.zze == 3 && zzP(zzmdVar5.zza, zzmdVar5.zzb)) {
            zzmd zzmdVar6 = this.zzG;
            if (zzmdVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzad.zzd(zzO(zzmdVar6.zza, zzmdVar6.zzb.zza, zzmdVar6.zzs), this.zzG.zzr);
                zziu zziuVar2 = this.zzo;
                if (zziuVar2.zzj().zzb != zzd) {
                    zzM(new zzav(zzd, this.zzG.zzo.zzc));
                    zzal(this.zzG.zzo, zziuVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i5, final boolean z4) {
        boolean[] zArr = this.zzd;
        if (zArr[i5] != z4) {
            zArr[i5] = z4;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlf.this.zzu(i5, z4);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j2) {
        int i5 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i5, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j5 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j5 == -9223372036854775807L ? System.currentTimeMillis() : j5 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j2;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i5 = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i5, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j2) {
        if (zzw()) {
            r2 = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i5 = 0; i5 < 2; i5++) {
                r2 = Math.min(r2, zzfj.zzp(zzmpVarArr[i5].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(r2) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j2 + r2);
    }

    private final void zzR(zzle zzleVar) {
        long longValue;
        long j2;
        zzwk zzy;
        boolean z4;
        boolean z5;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        zzmd zzmdVar;
        int i5;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzleVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar = this.zzG.zza;
        int i6 = this.zzO;
        boolean z6 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzaD = zzaD(zzbfVar, zzleVar, true, i6, z6, zzbeVar, zzbdVar);
        long j10 = -9223372036854775807L;
        if (zzaD == null) {
            Pair zzY = zzY(this.zzG.zza);
            zzwk zzwkVar = (zzwk) zzY.first;
            longValue = ((Long) zzY.second).longValue();
            z4 = !this.zzG.zza.zzg();
            zzy = zzwkVar;
            j2 = -9223372036854775807L;
        } else {
            Object obj = zzaD.first;
            longValue = ((Long) zzaD.second).longValue();
            long j11 = zzleVar.zzc;
            if (j11 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 = -9223372036854775807L;
                j10 = longValue;
            }
            zzy = this.zzs.zzy(this.zzG.zza, obj, longValue);
            if (zzy.zzb()) {
                this.zzG.zza.zzo(zzy.zza, zzbdVar);
                int i7 = zzy.zzb;
                if (zzbdVar.zzd(i7) == zzy.zzc) {
                    zzbdVar.zzj();
                }
                long j12 = zzbdVar.zzg.zza(i7).zza;
                j10 = Math.max(j10, 0L);
                longValue = 0;
            } else if (j11 != -9223372036854775807L) {
                z4 = false;
            }
            z4 = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzleVar;
            } else if (zzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzy.equals(this.zzG.zzb)) {
                    zzln zzm = this.zzs.zzm();
                    if (zzm == null || !zzm.zze || longValue == 0) {
                        j9 = longValue;
                    } else {
                        zzwi zzwiVar = zzm.zza;
                        long j13 = zzbeVar.zzm;
                        if (this.zzC && j13 != j2) {
                            Double d5 = this.zzB.zzc;
                        }
                        j9 = zzwiVar.zzk(longValue, this.zzA);
                    }
                    long j14 = j9;
                    if (zzfj.zzp(j9) == zzfj.zzp(this.zzG.zzs) && ((i5 = (zzmdVar = this.zzG).zze) == 2 || i5 == 3)) {
                        longValue = zzmdVar.zzs;
                    } else {
                        j6 = j14;
                    }
                } else {
                    j6 = longValue;
                }
                if (this.zzC) {
                    zzmp[] zzmpVarArr = this.zzb;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 2) {
                            break;
                        }
                        zzmp zzmpVar = zzmpVarArr[i8];
                        if (zzmpVar.zzM() && zzmpVar.zze() == 2) {
                            this.zzD = true;
                            break;
                        }
                        i8++;
                    }
                }
                long zzS = zzS(zzy, j6, this.zzG.zze == 4);
                z5 = (longValue != zzS) | z4;
                try {
                    zzmd zzmdVar2 = this.zzG;
                    zzwk zzwkVar2 = zzy;
                    try {
                        zzbf zzbfVar2 = zzmdVar2.zza;
                        long j15 = j10;
                        try {
                            zzag(zzbfVar2, zzwkVar2, zzbfVar2, zzmdVar2.zzb, j15, true);
                            zzy = zzwkVar2;
                            j7 = j15;
                            j8 = zzS;
                            this.zzG = zzao(zzy, j8, j7, j8, z5, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzy = zzwkVar2;
                            j10 = j15;
                            j5 = zzS;
                            this.zzG = zzao(zzy, j5, j10, j5, z5, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzy = zzwkVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z5 = z4;
            j7 = j10;
            j8 = longValue;
            this.zzG = zzao(zzy, j8, j7, j8, z5, 2);
        } catch (Throwable th4) {
            th = th4;
            z5 = z4;
            j5 = longValue;
        }
    }

    private final long zzS(zzwk zzwkVar, long j2, boolean z4) {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j2, zzlqVar.zzm() != zzlqVar.zzn(), z4);
    }

    private final long zzT(zzwk zzwkVar, long j2, boolean z4, boolean z5) {
        zzK();
        boolean z6 = true;
        zzaC(false, true);
        if (z5 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        zzln zzlnVar = zzm;
        while (zzlnVar != null && !zzwkVar.equals(zzlnVar.zzg.zza)) {
            zzlnVar = zzlnVar.zzp();
        }
        if (z4 || zzm != zzlnVar || (zzlnVar != null && zzlnVar.zza() + j2 < 0)) {
            zzaa();
            if (zzlnVar != null) {
                while (zzlqVar.zzm() != zzlnVar) {
                    zzlqVar.zzr();
                }
                zzlqVar.zzs(zzlnVar);
                zzlnVar.zzb(1000000000000L);
                zzap();
                zzlnVar.zzh = true;
            }
        }
        zzab();
        if (zzlnVar != null) {
            zzlqVar.zzs(zzlnVar);
            if (!zzlnVar.zze) {
                zzlnVar.zzg = zzlnVar.zzg.zza(j2);
            } else if (zzlnVar.zzf) {
                if (this.zzC) {
                    boolean z7 = this.zzB.zzi;
                    if (!this.zzG.zza.zzg() && zzlnVar.zzg.zza.equals(this.zzG.zzb)) {
                        zzmp[] zzmpVarArr = this.zzb;
                        boolean z8 = true;
                        for (int i5 = 0; i5 < 2; i5++) {
                            zzmp zzmpVar = zzmpVarArr[i5];
                            if (zzmpVar.zzM()) {
                                z8 &= zzmpVar.zzF(zzlnVar, j2);
                            }
                        }
                        if (z8) {
                            zzwi zzwiVar = zzlnVar.zza;
                            long j5 = this.zzG.zzs;
                            zzmt zzmtVar = zzmt.zzb;
                            if (zzwiVar.zzk(j5, zzmtVar) == zzwiVar.zzk(j2, zzmtVar)) {
                                z6 = false;
                            }
                        }
                    }
                }
                zzwi zzwiVar2 = zzlnVar.zza;
                j2 = zzwiVar2.zzj(j2);
                zzwiVar2.zzf(j2 - this.zzn, false);
            }
            zzU(j2, z6);
            zzam();
        } else {
            zzlqVar.zzv();
            zzU(j2, true);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j2;
    }

    private final void zzU(long j2, boolean z4) {
        zzln zzm = this.zzs.zzm();
        long zza2 = j2 + (zzm == null ? 1000000000000L : zzm.zza());
        this.zzT = zza2;
        this.zzo.zzc(zza2);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i5 = 0; i5 < 2; i5++) {
            zzmpVarArr[i5].zzE(zzm, this.zzT, z4);
        }
        for (zzln zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzaac zzaacVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() {
        int i5 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzmpVarArr[i5].zzz(this.zzC ? this.zzB : null);
            i5++;
        }
    }

    private final void zzW(boolean z4, boolean z5) {
        zzX(z4 || !this.zzQ, false, true, false);
        this.zzH.zza(z5 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r2.equals(r34.zzG.zzb) == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z4, boolean z5, boolean z6, boolean z7) {
        zzwk zzwkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzD = false;
        boolean z8 = true;
        if (this.zzE != null) {
            this.zzH.zza(1);
            this.zzE = null;
        }
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zziw | RuntimeException e4) {
            zzee.zzf("ExoPlayerImplInternal", "Disable failed.", e4);
        }
        if (z4) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i5 = 0; i5 < 2; i5++) {
                try {
                    zzmpVarArr[i5].zzG();
                } catch (RuntimeException e5) {
                    zzee.zzf("ExoPlayerImplInternal", "Reset failed.", e5);
                }
            }
        }
        this.zzR = 0;
        zzmd zzmdVar = this.zzG;
        zzwk zzwkVar2 = zzmdVar.zzb;
        long j2 = zzmdVar.zzs;
        long j5 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z5) {
            this.zzS = null;
            Pair zzY = zzY(this.zzG.zza);
            zzwkVar2 = (zzwk) zzY.first;
            j2 = ((Long) zzY.second).longValue();
            j5 = -9223372036854775807L;
        }
        z8 = false;
        long j6 = j2;
        long j7 = j5;
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzv();
        this.zzN = false;
        zzbf zzbfVar2 = this.zzG.zza;
        if (z6 && (zzbfVar2 instanceof zzmj)) {
            zzbfVar2 = ((zzmj) zzbfVar2).zzx(this.zzt.zzq());
            if (zzwkVar2.zzb != -1) {
                Object obj = zzwkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVar2.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVar2;
                    zzwkVar = new zzwk(obj, zzwkVar2.zzd);
                    zzmd zzmdVar2 = this.zzG;
                    int i6 = zzmdVar2.zze;
                    zziw zziwVar = z7 ? null : zzmdVar2.zzf;
                    zzyn zzynVar = !z8 ? zzyn.zza : zzmdVar2.zzh;
                    zzaak zzaakVar = !z8 ? this.zzf : zzmdVar2.zzi;
                    List zzi = !z8 ? zzguf.zzi() : zzmdVar2.zzj;
                    zzmd zzmdVar3 = this.zzG;
                    this.zzG = new zzmd(zzbfVar, zzwkVar, j7, j6, i6, zziwVar, false, zzynVar, zzaakVar, zzi, zzwkVar, zzmdVar3.zzl, zzmdVar3.zzm, zzmdVar3.zzn, zzmdVar3.zzo, j6, 0L, j6, 0L, false);
                    if (z6) {
                        return;
                    }
                    zzlqVar.zzj();
                    this.zzt.zzg();
                    return;
                }
            }
        }
        zzwkVar = zzwkVar2;
        zzbfVar = zzbfVar2;
        zzmd zzmdVar22 = this.zzG;
        int i62 = zzmdVar22.zze;
        zziw zziwVar2 = z7 ? null : zzmdVar22.zzf;
        zzyn zzynVar2 = !z8 ? zzyn.zza : zzmdVar22.zzh;
        zzaak zzaakVar2 = !z8 ? this.zzf : zzmdVar22.zzi;
        List zzi2 = !z8 ? zzguf.zzi() : zzmdVar22.zzj;
        zzmd zzmdVar32 = this.zzG;
        this.zzG = new zzmd(zzbfVar, zzwkVar, j7, j6, i62, zziwVar2, false, zzynVar2, zzaakVar2, zzi2, zzwkVar, zzmdVar32.zzl, zzmdVar32.zzm, zzmdVar32.zzn, zzmdVar32.zzo, j6, 0L, j6, 0L, false);
        if (z6) {
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j2 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, -9223372036854775807L);
        zzwk zzy = this.zzs.zzy(zzbfVar, zzm.first, 0L);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j2 = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j2));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z4 = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z4, boolean z5) {
        this.zzL = z4;
        long j2 = -9223372036854775807L;
        if (z4 && !z5) {
            j2 = SystemClock.elapsedRealtime();
        }
        this.zzM = j2;
    }

    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z4, int i5, boolean z5, zzbe zzbeVar, zzbd zzbdVar) {
        Pair zzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar3 = zzbfVar;
        }
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
            zzbfVar2 = zzbfVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar2)) {
            return zzm;
        }
        if (zzbfVar.zze(zzm.first) != -1) {
            return (zzbfVar2.zzo(zzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(zzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzleVar.zzc) : zzm;
        }
        int zzr = zzr(zzbeVar, zzbdVar, i5, z5, zzm.first, zzbfVar2, zzbfVar);
        if (zzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzmh zzmhVar) {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i5 = 0; i5 < 2; i5++) {
                        zzyc zzycVar = zzycVarArr[i5];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() {
        int i5 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int zzd = zzmpVarArr[i5].zzd();
            zzmpVarArr[i5].zzA(this.zzo);
            zzN(i5, false);
            this.zzR -= zzd;
            i5++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i5 = 0; i5 < 2; i5++) {
                zzmp zzmpVar = zzmpVarArr[i5];
                int zzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= zzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() {
        zzad();
        zzI(true);
    }

    private final void zzad() {
        zzlf zzlfVar;
        int i5;
        boolean z4;
        zziu zziuVar = this.zzo;
        float f5 = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        zzln zzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z5 = true;
        while (zzm != null && zzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzk = zzm.zzk(f5, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzm == zzlqVar.zzm() ? zzk : zzaakVar;
            zzaak zzr = zzm.zzr();
            boolean z6 = false;
            if (zzr != null) {
                zzaac[] zzaacVarArr = zzk.zzc;
                if (zzr.zzc.length == zzaacVarArr.length) {
                    for (int i6 = 0; i6 < zzaacVarArr.length; i6++) {
                        if (zzk.zzb(zzr, i6)) {
                        }
                    }
                    if (zzm != zzn) {
                        z6 = true;
                    }
                    z5 &= z6;
                    zzm = zzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            if (z5) {
                zzln zzm2 = zzlqVar.zzm();
                int zzs = zzlqVar.zzs(zzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long zzm3 = zzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == zzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                if (zzmdVar2.zze == 4 || zzm3 == zzmdVar2.zzs) {
                    z4 = false;
                } else {
                    z4 = false;
                    z6 = true;
                }
                zzmd zzmdVar3 = this.zzG;
                boolean z7 = z4;
                i5 = 2;
                zzlfVar = this;
                zzlfVar.zzG = zzao(zzmdVar3.zzb, zzm3, zzmdVar3.zzc, zzmdVar3.zzd, z6, 5);
                if (z6) {
                    zzlfVar.zzU(zzm3, true);
                }
                zzlfVar.zzab();
                boolean[] zArr2 = new boolean[2];
                for (int i7 = z7; i7 < 2; i7++) {
                    int zzd = zzmpVarArr[i7].zzd();
                    zArr2[i7] = zzmpVarArr[i7].zzM();
                    zzmpVarArr[i7].zzD(zzm2.zzc[i7], zziuVar, zzlfVar.zzT, zArr[i7]);
                    if (zzd - zzmpVarArr[i7].zzd() > 0) {
                        zzlfVar.zzN(i7, z7);
                    }
                    zzlfVar.zzR -= zzd - zzmpVarArr[i7].zzd();
                }
                zzlfVar.zzaq(zArr2, zzlfVar.zzT);
                zzm2.zzh = true;
            } else {
                zzlfVar = this;
                i5 = 2;
                zzlqVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, zzlfVar.zzT - zzm.zza());
                    if (zzlfVar.zzy && zzlfVar.zzaz() && zzlqVar.zzo() == zzm) {
                        zzlfVar.zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzlfVar.zzas(true);
            if (zzlfVar.zzG.zze != 4) {
                zzlfVar.zzam();
                zzlfVar.zzL();
                zzlfVar.zzi.zzh(i5);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzm = this.zzs.zzm();
        long j2 = zzm.zzg.zze;
        if (zzm.zze) {
            return j2 == -9223372036854775807L || this.zzG.zzs < j2 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0418  */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbf zzbfVar, boolean z4) {
        long j2;
        boolean zzaB;
        zzwk zzwkVar;
        zzbe zzbeVar;
        zzbf zzbfVar2;
        long j5;
        int i5;
        long j6;
        Object obj;
        long j7;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        long j8;
        long j9;
        long j10;
        zzwk zzwkVar2;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        Object obj2;
        long longValue;
        int i8;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        boolean z15;
        int i10;
        zzwk zzwkVar3;
        boolean z16;
        long j12;
        zzmd zzmdVar = this.zzG;
        zzle zzleVar = this.zzS;
        int i11 = this.zzO;
        boolean z17 = this.zzP;
        if (zzbfVar.zzg()) {
            zzbfVar2 = zzbfVar;
            zzwkVar2 = zzmd.zzb();
            z9 = true;
            z11 = false;
            z10 = false;
            j11 = 0;
            j2 = -9223372036854775807L;
            j10 = 0;
            j8 = -9223372036854775807L;
        } else {
            zzbd zzbdVar = this.zzm;
            zzwk zzwkVar4 = zzmdVar.zzb;
            j2 = -9223372036854775807L;
            Object obj3 = zzwkVar4.zza;
            zzaB = zzaB(zzmdVar, zzbdVar);
            long j13 = (zzwkVar4.zzb() || zzaB) ? zzmdVar.zzc : zzmdVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzleVar != null) {
                zzwkVar = zzwkVar4;
                zzbfVar2 = zzbfVar;
                Pair zzaD = zzaD(zzbfVar2, zzleVar, true, i11, z17, zzbeVar2, zzbdVar);
                if (zzaD == null) {
                    i8 = zzbfVar2.zzk(z17);
                    obj2 = obj3;
                    longValue = j13;
                    z14 = true;
                    z13 = false;
                    z12 = false;
                } else {
                    if (zzleVar.zzc == -9223372036854775807L) {
                        i8 = zzbfVar2.zzo(zzaD.first, zzbdVar).zzc;
                        obj2 = obj3;
                        longValue = j13;
                        z12 = false;
                    } else {
                        obj2 = zzaD.first;
                        longValue = ((Long) zzaD.second).longValue();
                        i8 = -1;
                        z12 = true;
                    }
                    z13 = zzmdVar.zze == 4;
                    z14 = false;
                }
                int i12 = i8;
                obj = obj2;
                zzbeVar = zzbeVar2;
                j6 = longValue;
                i5 = i12;
                boolean z18 = z12;
                z5 = z14;
                z8 = z13;
                z6 = z18;
                j5 = j13;
            } else {
                zzwkVar = zzwkVar4;
                zzbeVar = zzbeVar2;
                zzbfVar2 = zzbfVar;
                zzbf zzbfVar3 = zzmdVar.zza;
                if (zzbfVar3.zzg()) {
                    i6 = zzbfVar2.zzk(z17);
                } else if (zzbfVar2.zze(obj3) == -1) {
                    int zzr = zzr(zzbeVar, zzbdVar, i11, z17, obj3, zzbfVar3, zzbfVar2);
                    zzbeVar = zzbeVar;
                    zzbfVar2 = zzbfVar2;
                    zzbdVar = zzbdVar;
                    obj3 = obj3;
                    if (zzr == -1) {
                        zzr = zzbfVar2.zzk(z17);
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i5 = zzr;
                    z5 = z7;
                    obj = obj3;
                    j6 = j13;
                    j5 = j6;
                    z6 = false;
                    z8 = false;
                } else if (j13 == -9223372036854775807L) {
                    i6 = zzbfVar2.zzo(obj3, zzbdVar).zzc;
                } else if (zzaB) {
                    zzbfVar3.zzo(obj3, zzbdVar);
                    if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj3)) {
                        Pair zzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj3, zzbdVar).zzc, j13);
                        j5 = j13;
                        obj = zzm.first;
                        j7 = ((Long) zzm.second).longValue();
                    } else {
                        j5 = j13;
                        if (zzbfVar2.zzo(obj3, zzbdVar).zzd != -9223372036854775807L) {
                            long j14 = zzbdVar.zzd - 1;
                            String str = zzfj.zza;
                            j7 = Math.max(0L, Math.min(j5, j14));
                        } else {
                            j7 = j5;
                        }
                        obj = obj3;
                    }
                    i5 = -1;
                    j6 = j7;
                    z5 = false;
                    z6 = true;
                    z8 = false;
                } else {
                    j5 = j13;
                    i5 = -1;
                    j6 = j5;
                    obj = obj3;
                    z5 = false;
                    z6 = false;
                    z8 = false;
                }
                i5 = i6;
                obj = obj3;
                j6 = j13;
                j5 = j6;
                z5 = false;
                z6 = false;
                z8 = false;
            }
            if (i5 != -1) {
                Pair zzm2 = zzbfVar2.zzm(zzbeVar, zzbdVar, i5, -9223372036854775807L);
                obj = zzm2.first;
                j9 = ((Long) zzm2.second).longValue();
                j8 = -9223372036854775807L;
            } else {
                j8 = j6;
                j9 = j8;
            }
            zzwk zzy = this.zzs.zzy(zzbfVar2, obj, j9);
            int i13 = zzy.zze;
            boolean z19 = i13 == -1 || ((i7 = zzwkVar.zze) != -1 && i13 >= i7);
            boolean equals = obj3.equals(obj);
            boolean z20 = equals && !zzwkVar.zzb() && !zzy.zzb() && z19;
            zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
            if (!zzaB && j5 == j8 && obj3.equals(zzy.zza)) {
                if (zzwkVar.zzb()) {
                    zzo.zzk(zzwkVar.zzb);
                }
                if (zzy.zzb()) {
                    zzo.zzk(zzy.zzb);
                }
            }
            if (true == z20) {
                zzy = zzwkVar;
            }
            if (zzy.zzb()) {
                if (zzy.equals(zzwkVar)) {
                    j9 = zzmdVar.zzs;
                } else {
                    zzbfVar2.zzo(zzy.zza, zzbdVar);
                    if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    j9 = 0;
                }
            } else if (equals && zzwkVar.zzb()) {
                zza zza2 = zzbfVar2.zzo(obj, zzbdVar).zzg.zza(zzwkVar.zzb);
                long j15 = zza2.zzi;
                long j16 = zzmdVar.zzc;
                j10 = 0;
                if (j16 == -9223372036854775807L || j16 < 0) {
                    int i14 = zza2.zzb;
                    int i15 = zzwkVar.zzc;
                    if (i14 > i15 && zza2.zze[i15] == 2) {
                        long j17 = zzbfVar2.zzo(obj, zzbdVar).zzd;
                        if (j17 != -9223372036854775807L) {
                            j9 = Math.min(j17 - 1, j9);
                        }
                        j8 = j9;
                    }
                }
                zzwkVar2 = zzy;
                j11 = j9;
                z9 = z5;
                z10 = z6;
                z11 = z8;
            }
            j10 = 0;
            zzwkVar2 = zzy;
            j11 = j9;
            z9 = z5;
            z10 = z6;
            z11 = z8;
        }
        boolean z21 = (this.zzG.zzb.equals(zzwkVar2) && j11 == this.zzG.zzs) ? false : true;
        if (z9) {
            try {
                if (this.zzG.zze != 1) {
                    i9 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        zzwkVar3 = zzwkVar2;
                        zzaB = false;
                        zzmd zzmdVar2 = this.zzG;
                        zzbf zzbfVar4 = zzmdVar2.zza;
                        zzwk zzwkVar5 = zzmdVar2.zzb;
                        zzwk zzwkVar6 = zzwkVar3;
                        zzag(zzbfVar, zzwkVar6, zzbfVar4, zzwkVar5, true != z10 ? j2 : j11, false);
                        if (!z21) {
                        }
                        zzmd zzmdVar3 = this.zzG;
                        Object obj4 = zzmdVar3.zzb.zza;
                        zzbf zzbfVar5 = zzmdVar3.zza;
                        if (z21) {
                        }
                        this.zzG = zzao(zzwkVar6, j11, j8, r9 ? j11 : this.zzG.zzd, r9, zzbfVar.zze(obj4) == -1 ? i10 : 3);
                        zzaj();
                        zzZ(zzbfVar, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                        }
                        zzas(zzaB);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i9 = 4;
                }
                z15 = false;
                try {
                    zzX(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i10 = i9;
                    zzaB = z15;
                    zzwkVar3 = zzwkVar2;
                    zzmd zzmdVar22 = this.zzG;
                    zzbf zzbfVar42 = zzmdVar22.zza;
                    zzwk zzwkVar52 = zzmdVar22.zzb;
                    zzwk zzwkVar62 = zzwkVar3;
                    zzag(zzbfVar, zzwkVar62, zzbfVar42, zzwkVar52, true != z10 ? j2 : j11, false);
                    if (!z21) {
                    }
                    zzmd zzmdVar32 = this.zzG;
                    Object obj42 = zzmdVar32.zzb.zza;
                    zzbf zzbfVar52 = zzmdVar32.zza;
                    if (z21) {
                    }
                    this.zzG = zzao(zzwkVar62, j11, j8, r9 ? j11 : this.zzG.zzd, r9, zzbfVar.zze(obj42) == -1 ? i10 : 3);
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(zzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i9 = 4;
                z15 = false;
                i10 = i9;
                zzaB = z15;
                zzwkVar3 = zzwkVar2;
                zzmd zzmdVar222 = this.zzG;
                zzbf zzbfVar422 = zzmdVar222.zza;
                zzwk zzwkVar522 = zzmdVar222.zzb;
                zzwk zzwkVar622 = zzwkVar3;
                zzag(zzbfVar, zzwkVar622, zzbfVar422, zzwkVar522, true != z10 ? j2 : j11, false);
                if (!z21) {
                }
                zzmd zzmdVar322 = this.zzG;
                Object obj422 = zzmdVar322.zzb.zza;
                zzbf zzbfVar522 = zzmdVar322.zza;
                if (z21) {
                }
                this.zzG = zzao(zzwkVar622, j11, j8, r9 ? j11 : this.zzG.zzd, r9, zzbfVar.zze(obj422) == -1 ? i10 : 3);
                zzaj();
                zzZ(zzbfVar, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzas(zzaB);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i9 = 4;
            z15 = false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (?? r5 = z15; r5 < 2; r5++) {
            zzmpVarArr[r5].zzn(zzbfVar2);
        }
        try {
            if (z21) {
                i10 = i9;
                zzaB = z15;
                if (!zzbfVar2.zzg()) {
                    zzlq zzlqVar = this.zzs;
                    for (zzln zzm3 = zzlqVar.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzwkVar2)) {
                            zzm3.zzg = zzlqVar.zzx(zzbfVar2, zzm3.zzg);
                            zzm3.zzs();
                        }
                    }
                    j11 = zzS(zzwkVar2, j11, z11);
                }
            } else {
                try {
                    zzlq zzlqVar2 = this.zzs;
                    long zzah = zzlqVar2.zzn() == null ? j10 : zzah(zzlqVar2.zzn());
                    if (!zzaz() || zzlqVar2.zzo() == null) {
                        z16 = z15;
                        j12 = j10;
                    } else {
                        j12 = zzah(zzlqVar2.zzo());
                        z16 = z15;
                    }
                    try {
                        i10 = i9;
                        zzaB = z16;
                        try {
                            int zzw = zzlqVar2.zzw(zzbfVar, this.zzT, zzah, j12);
                            zzbfVar2 = zzbfVar;
                            if ((zzw & 1) != 0) {
                                zzI(zzaB);
                            } else if ((zzw & 2) != 0) {
                                zzab();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzwkVar3 = zzwkVar2;
                            zzmd zzmdVar2222 = this.zzG;
                            zzbf zzbfVar4222 = zzmdVar2222.zza;
                            zzwk zzwkVar5222 = zzmdVar2222.zzb;
                            zzwk zzwkVar6222 = zzwkVar3;
                            zzag(zzbfVar, zzwkVar6222, zzbfVar4222, zzwkVar5222, true != z10 ? j2 : j11, false);
                            if (!z21 || j8 != this.zzG.zzc) {
                                zzmd zzmdVar3222 = this.zzG;
                                Object obj4222 = zzmdVar3222.zzb.zza;
                                zzbf zzbfVar5222 = zzmdVar3222.zza;
                                boolean z22 = (z21 || !z4 || zzbfVar5222.zzg() || zzbfVar5222.zzo(obj4222, this.zzm).zzf) ? zzaB : true;
                                this.zzG = zzao(zzwkVar6222, j11, j8, z22 ? j11 : this.zzG.zzd, z22, zzbfVar.zze(obj4222) == -1 ? i10 : 3);
                            }
                            zzaj();
                            zzZ(zzbfVar, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbfVar);
                            if (!zzbfVar.zzg()) {
                                this.zzS = null;
                            }
                            zzas(zzaB);
                            this.zzi.zzh(2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i10 = i9;
                        zzaB = z16;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    i10 = i9;
                    zzaB = z15;
                    zzwkVar3 = zzwkVar2;
                    zzmd zzmdVar22222 = this.zzG;
                    zzbf zzbfVar42222 = zzmdVar22222.zza;
                    zzwk zzwkVar52222 = zzmdVar22222.zzb;
                    zzwk zzwkVar62222 = zzwkVar3;
                    zzag(zzbfVar, zzwkVar62222, zzbfVar42222, zzwkVar52222, true != z10 ? j2 : j11, false);
                    if (!z21) {
                    }
                    zzmd zzmdVar32222 = this.zzG;
                    Object obj42222 = zzmdVar32222.zzb.zza;
                    zzbf zzbfVar52222 = zzmdVar32222.zza;
                    if (z21) {
                    }
                    this.zzG = zzao(zzwkVar62222, j11, j8, z22 ? j11 : this.zzG.zzd, z22, zzbfVar.zze(obj42222) == -1 ? i10 : 3);
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(zzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            zzmd zzmdVar4 = this.zzG;
            zzwk zzwkVar7 = zzwkVar2;
            zzag(zzbfVar2, zzwkVar7, zzmdVar4.zza, zzmdVar4.zzb, true != z10 ? j2 : j11, false);
            zzbf zzbfVar6 = zzbfVar2;
            if (z21 || j8 != this.zzG.zzc) {
                zzmd zzmdVar5 = this.zzG;
                Object obj5 = zzmdVar5.zzb.zza;
                zzbf zzbfVar7 = zzmdVar5.zza;
                boolean z23 = (!z21 || !z4 || zzbfVar7.zzg() || zzbfVar7.zzo(obj5, this.zzm).zzf) ? zzaB : true;
                this.zzG = zzao(zzwkVar7, j11, j8, z23 ? j11 : this.zzG.zzd, z23, zzbfVar6.zze(obj5) == -1 ? i10 : 3);
            }
            zzaj();
            zzZ(zzbfVar6, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar6);
            if (!zzbfVar6.zzg()) {
                this.zzS = null;
            }
            zzas(zzaB);
            this.zzi.zzh(2);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j2, boolean z4) {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i5 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i5, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j2 != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j2));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z4) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long zza2 = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i5 = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i5 >= 2) {
                    break;
                }
                if (zzmpVarArr[i5].zzp(zzlnVar)) {
                    long zzf = zzmpVarArr[i5].zzf(zzlnVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i5++;
            }
        }
        return zza2;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzl = zzlqVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzwi zzwiVar = zzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzl.zzg.zza, zzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzm = this.zzs.zzm();
        boolean z4 = false;
        if (zzm != null && zzm.zzg.zzi && this.zzJ) {
            z4 = true;
        }
        this.zzK = z4;
    }

    private final void zzak(zzav zzavVar, boolean z4) {
        zzal(zzavVar, zzavVar.zzb, true, z4);
    }

    private final void zzal(zzav zzavVar, float f5, boolean z4, boolean z5) {
        int i5;
        if (z4) {
            if (z5) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f6 = zzavVar.zzb;
        zzln zzm = this.zzs.zzm();
        while (true) {
            i5 = 0;
            if (zzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i5 < length) {
                zzaac zzaacVar = zzaacVarArr[i5];
                i5++;
            }
            zzm = zzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i5 < 2) {
            zzmpVarArr[i5].zzm(f5, f6);
            i5++;
        }
    }

    private final void zzam() {
        long zza2;
        long j2;
        zzlq zzlqVar = this.zzs;
        boolean z4 = false;
        if (zzaF(zzlqVar.zzk())) {
            zzln zzk = zzlqVar.zzk();
            long zzau = zzau(zzk.zzg());
            if (zzk == zzlqVar.zzm()) {
                zza2 = this.zzT;
                j2 = zzk.zza();
            } else {
                zza2 = this.zzT - zzk.zza();
                j2 = zzk.zzg.zzb;
            }
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzk.zzg.zza, zza2 - j2, zzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            boolean zzh = zzljVar.zzh(zzliVar);
            zzln zzm = zzlqVar.zzm();
            if (zzh || !zzm.zze || zzau >= 500000 || this.zzn <= 0) {
                z4 = zzh;
            } else {
                zzm.zza.zzf(this.zzG.zzs, false);
                z4 = zzljVar.zzh(zzliVar);
            }
        }
        this.zzN = z4;
        if (z4) {
            zzln zzk2 = zzlqVar.zzk();
            zzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzk = this.zzs.zzk();
        boolean z4 = true;
        if (!this.zzN && (zzk == null || !zzk.zza.zzn())) {
            z4 = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z4 != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[EDGE_INSN: B:51:0x00cd->B:52:0x00cd BREAK  A[LOOP:1: B:39:0x00ae->B:47:0x00ca], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzao(zzwk zzwkVar, long j2, long j5, long j6, boolean z4, int i5) {
        List list;
        zzaak zzaakVar;
        zzln zzm;
        int i6 = 0;
        this.zzW = (!this.zzW && j2 == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list2 = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzm2 = zzlqVar.zzm();
            zzyn zzq = zzm2 == null ? zzyn.zza : zzm2.zzq();
            zzaak zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzaac[] zzaacVarArr = zzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z5 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z5 = true;
                    }
                }
            }
            zzguf zzi = z5 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzm2 != null) {
                zzlo zzloVar = zzm2.zzg;
                if (zzloVar.zzc != j5) {
                    zzm2.zzg = zzloVar.zzb(j5);
                    if (zzlqVar.zzm() == zzlqVar.zzn() && (zzm = zzlqVar.zzm()) != null) {
                        zzaak zzr2 = zzm.zzr();
                        while (true) {
                            zzmp[] zzmpVarArr = this.zzb;
                            if (i6 >= 2) {
                                break;
                            }
                            if (zzr2.zza(i6)) {
                                if (zzmpVarArr[i6].zze() != 1) {
                                    break;
                                }
                                int i7 = zzr2.zzb[i6].zzb;
                            }
                            i6++;
                        }
                    }
                    list = zzi;
                    zzynVar = zzq;
                    zzaakVar = zzr;
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn()) {
                zzaak zzr22 = zzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr2 = this.zzb;
                    if (i6 >= 2) {
                    }
                    i6++;
                }
            }
            list = zzi;
            zzynVar = zzq;
            zzaakVar = zzr;
        } else {
            if (!zzwkVar.equals(this.zzG.zzb)) {
                zzaakVar2 = this.zzf;
                zzynVar = zzyn.zza;
                list2 = zzguf.zzi();
            }
            list = list2;
            zzaakVar = zzaakVar2;
        }
        if (z4) {
            this.zzH.zzc(i5);
        }
        return this.zzG.zzc(zzwkVar, j2, j5, j6, zzat(), zzynVar, zzaakVar, list);
    }

    private final void zzap() {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j2) {
        zzmp[] zzmpVarArr;
        long j5;
        zzln zzn = this.zzs.zzn();
        zzaak zzr = zzn.zzr();
        int i5 = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i5 >= 2) {
                break;
            }
            if (!zzr.zza(i5)) {
                zzmpVarArr[i5].zzG();
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < 2) {
            if (!zzr.zza(i6) || zzmpVarArr[i6].zzp(zzn)) {
                j5 = j2;
            } else {
                j5 = j2;
                zzar(zzn, i6, zArr[i6], j5);
            }
            i6++;
            j2 = j5;
        }
    }

    private final void zzar(zzln zzlnVar, int i5, boolean z4, long j2) {
        zzmp zzmpVar = this.zzb[i5];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z5 = zzlnVar == this.zzs.zzm();
        zzaak zzr = zzlnVar.zzr();
        zzmo zzmoVar = zzr.zzb[i5];
        zzaac zzaacVar = zzr.zzc[i5];
        boolean z6 = zzax() && this.zzG.zze == 3;
        boolean z7 = !z4 && z6;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i5], this.zzT, z7, z5, j2, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z6 && z5) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z4) {
        zzln zzk = this.zzs.zzk();
        zzwk zzwkVar = zzk == null ? this.zzG.zzb : zzk.zzg.zza;
        boolean equals = this.zzG.zzk.equals(zzwkVar);
        if (!equals) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzk == null ? zzmdVar.zzs : zzk.zzf();
        this.zzG.zzr = zzat();
        if ((!equals || z4) && zzk != null && zzk.zze) {
            zzaw(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j2) {
        zzln zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.zzT - zzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long zza2;
        long j2;
        zzlq zzlqVar = this.zzs;
        zzln zzk = zzlqVar.zzk();
        zzk.getClass();
        if (zzk == zzlqVar.zzm()) {
            zza2 = this.zzT;
            j2 = zzk.zza();
        } else {
            zza2 = this.zzT - zzk.zza();
            j2 = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, zza2 - j2, zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i5) {
        zzmp zzmpVar = this.zzb[i5];
        try {
            zzln zzm = this.zzs.zzm();
            if (zzm == null) {
                throw null;
            }
            zzmpVar.zzu(zzm);
        } catch (IOException e4) {
            e = e4;
            zzmpVar.zze();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzmpVarArr[i5].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i5, boolean z4, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i6 = 0; i6 < zzbfVar2.zza(); i6++) {
            if (zzbfVar2.zzb(i6, zzbeVar, 0L).zzb.equals(obj2)) {
                return i6;
            }
        }
        int zze = zzbfVar3.zze(obj);
        int zzc = zzbfVar3.zzc();
        int i7 = -1;
        int i8 = 0;
        while (true) {
            if (i8 >= zzc || i7 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int zzl = zzbfVar4.zzl(zze, zzbdVar, zzbeVar2, i5, z4);
            if (zzl == -1) {
                i7 = -1;
                break;
            }
            i7 = zzbfVar2.zze(zzbfVar4.zzf(zzl));
            i8++;
            zzbfVar3 = zzbfVar4;
            zze = zzl;
            zzbeVar2 = zzbeVar;
        }
        if (i7 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i7, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e4) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a2b, code lost:
    
        if (r6 != false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a58, code lost:
    
        if (r7 == false) goto L550;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0518 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x04e5, zziw -> 0x04e8, TRY_ENTER, TRY_LEAVE, TryCatch #4 {zziw -> 0x04e8, blocks: (B:646:0x04df, B:647:0x04fe, B:649:0x0504, B:650:0x0509, B:167:0x0518, B:651:0x04ed, B:653:0x04f3), top: B:161:0x04c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x078c A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07a6 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, LOOP:5: B:221:0x07a2->B:223:0x07a6, LOOP_END, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07f7 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0817 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0823 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0887 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, LOOP:8: B:270:0x0885->B:271:0x0887, LOOP_END, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0895 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x08a5 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0af4 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b07 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0b08 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x060f A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x05a9, zziw -> 0x05ac, TRY_LEAVE, TryCatch #36 {zziw -> 0x05ac, RuntimeException -> 0x05a9, blocks: (B:199:0x05a5, B:201:0x05c3, B:205:0x05cc, B:207:0x05dd, B:209:0x05eb, B:210:0x0604, B:213:0x0786, B:215:0x078c, B:217:0x0792, B:220:0x0797, B:221:0x07a2, B:223:0x07a6, B:228:0x07cb, B:230:0x07d1, B:232:0x07d9, B:234:0x07e1, B:238:0x07e4, B:240:0x07ed, B:294:0x08b8, B:295:0x08c4, B:300:0x08d1, B:302:0x08d9, B:303:0x08df, B:305:0x08ed, B:306:0x0907, B:308:0x090b, B:310:0x0913, B:312:0x0940, B:313:0x0919, B:315:0x0924, B:318:0x092d, B:323:0x093d, B:330:0x0954, B:332:0x095a, B:336:0x0962, B:338:0x096a, B:340:0x096e, B:341:0x0979, B:343:0x097f, B:344:0x0a8c, B:347:0x0a94, B:349:0x0a98, B:351:0x0aa0, B:353:0x0aa3, B:356:0x0aa7, B:358:0x0aad, B:360:0x0ab6, B:362:0x0ac0, B:364:0x0ac6, B:366:0x0acc, B:367:0x0aee, B:369:0x0af4, B:372:0x0afe, B:375:0x0b17, B:381:0x0b10, B:383:0x0b14, B:385:0x0ad3, B:388:0x0ae1, B:389:0x0ae9, B:390:0x0aea, B:391:0x0988, B:393:0x098f, B:395:0x0993, B:397:0x0a2d, B:399:0x0a39, B:402:0x099d, B:404:0x09a1, B:406:0x09b3, B:407:0x09be, B:409:0x09c8, B:412:0x09d1, B:414:0x09db, B:419:0x09e6, B:423:0x0a46, B:425:0x0a4d, B:427:0x0a51, B:430:0x0a5a, B:432:0x0a6a, B:434:0x0a70, B:436:0x0a7a, B:438:0x0a7f, B:440:0x0a84, B:441:0x0a89, B:443:0x094b, B:242:0x07f7, B:244:0x07fb, B:246:0x0801, B:248:0x0807, B:250:0x0811, B:253:0x0817, B:254:0x081a, B:256:0x0823, B:258:0x0835, B:260:0x083e, B:262:0x0846, B:265:0x0852, B:267:0x087c, B:269:0x0882, B:271:0x0887, B:273:0x088f, B:275:0x0895, B:276:0x0898, B:277:0x08a1, B:279:0x08a5, B:281:0x08ab, B:283:0x08b0, B:291:0x08b7, B:449:0x060f, B:483:0x062b, B:490:0x063c, B:494:0x064e, B:499:0x0664, B:504:0x06a3, B:506:0x06aa, B:508:0x06ae, B:510:0x06be, B:512:0x06c2, B:516:0x06c9, B:518:0x06cf, B:520:0x06ec, B:525:0x06f5, B:529:0x06fa, B:531:0x0701, B:533:0x0709, B:535:0x070f, B:537:0x06b4, B:541:0x071e, B:452:0x074d, B:454:0x0753, B:456:0x0757, B:458:0x075c, B:462:0x0783, B:463:0x0765, B:465:0x076b, B:469:0x0779, B:470:0x0780, B:665:0x0b1c, B:668:0x0b27), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0bea A[ADDED_TO_REGION, LOOP:19: B:579:0x0bea->B:582:0x0bf2, LOOP_START, PHI: r2
      0x0bea: PHI (r2v30 com.google.android.gms.internal.ads.zzln) = (r2v28 com.google.android.gms.internal.ads.zzln), (r2v31 com.google.android.gms.internal.ads.zzln) binds: [B:578:0x0be7, B:582:0x0bf2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0526 A[Catch: IOException -> 0x0029, zzvk -> 0x002c, zzhc -> 0x002f, zzat -> 0x0032, zztg -> 0x0035, RuntimeException -> 0x04e5, zziw -> 0x05b3, TRY_ENTER, TryCatch #7 {RuntimeException -> 0x04e5, blocks: (B:646:0x04df, B:647:0x04fe, B:649:0x0504, B:650:0x0509, B:165:0x0514, B:167:0x0518, B:168:0x0529, B:170:0x0530, B:172:0x0534, B:174:0x0538, B:176:0x053e, B:178:0x0544, B:180:0x054a, B:182:0x0550, B:184:0x0558, B:186:0x0564, B:188:0x056e, B:189:0x0574, B:191:0x0578, B:193:0x057e, B:195:0x0586, B:197:0x058e, B:636:0x0526, B:651:0x04ed, B:653:0x04f3), top: B:161:0x04c9 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        zziw zziwVar;
        boolean z4;
        int i5;
        zzwk zzwkVar;
        zzlq zzlqVar;
        zzln zzo;
        zzln zzn;
        zzd zzdVar;
        boolean z5;
        long j2;
        zziw zziwVar2;
        long j5;
        int i6;
        long j6;
        boolean z6;
        boolean z7;
        boolean zzi;
        int i7;
        long j7;
        long j8;
        zzln zzn2;
        int i8;
        zzlq zzlqVar2;
        boolean z8;
        zzln zzn3;
        boolean z9;
        zzln zzm;
        zzln zzp;
        zzln zzr;
        char c5;
        boolean z10;
        int i9;
        int i10;
        zzln zzn4;
        zzaak zzr2;
        int i11;
        int i12;
        zzmp[] zzmpVarArr;
        zzln zzo2;
        long j9;
        long j10;
        String str3;
        String str4 = "Playback error";
        String str5 = "ExoPlayerImplInternal";
        int i13 = 2;
        try {
            try {
                try {
                    zzdVar = null;
                    try {
                    } catch (zziw e4) {
                        e = e4;
                    } catch (RuntimeException e5) {
                        e = e5;
                    }
                } catch (RuntimeException e6) {
                    e = e6;
                }
            } catch (zziw e7) {
                e = e7;
            }
        } catch (zzat e8) {
            e = e8;
        } catch (zzhc e9) {
            e = e9;
        } catch (zztg e10) {
            e = e10;
        } catch (zzvk e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        }
        switch (message.what) {
            case 1:
                boolean z11 = message.arg1 != 0;
                int i14 = message.arg2;
                zzE(z11, i14 >> 4, true, i14 & 15);
                z4 = true;
                zzC();
                return z4;
            case 2:
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    zzdx zzdxVar = this.zzi;
                    zzdxVar.zzk(2);
                    if (this.zzG.zza.zzg() || !this.zzt.zzb()) {
                        j2 = uptimeMillis;
                        zziwVar2 = null;
                        j5 = -9223372036854775807L;
                    } else {
                        zzlq zzlqVar3 = this.zzs;
                        zzlqVar3.zzf(this.zzT);
                        try {
                            try {
                            } catch (zziw e13) {
                                e = e13;
                            }
                        } catch (RuntimeException e14) {
                            e = e14;
                            str2 = str5;
                            zziw zzc = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : zzbgj.zzq.zzf);
                            zzee.zzf(str2, str, zzc);
                            zzW(true, false);
                            this.zzG = this.zzG.zzf(zzc);
                            z4 = true;
                            zzC();
                            return z4;
                        }
                        try {
                            if (zzlqVar3.zzg()) {
                                try {
                                    zzlo zzh = zzlqVar3.zzh(this.zzT, this.zzG);
                                    if (zzh != null) {
                                        zzln zzi2 = zzlqVar3.zzi(zzh);
                                        if (zzi2.zzd) {
                                            str = "Playback error";
                                            if (zzi2.zze) {
                                                zzdxVar.zzd(8, zzi2.zza).zza();
                                            }
                                        } else {
                                            str = "Playback error";
                                            zzi2.zzt(this, zzh.zzb);
                                        }
                                        if (zzlqVar3.zzm() == zzi2) {
                                            zzU(zzh.zzb, true);
                                        }
                                        zzas(false);
                                        if (this.zzN) {
                                            zzam();
                                        } else {
                                            this.zzN = zzaF(zzlqVar3.zzk());
                                            zzan();
                                        }
                                        long j11 = 10000000;
                                        if (!this.zzK || !this.zzy || this.zzab || zzaz() || (zzo2 = zzlqVar3.zzo()) == null || zzo2 != zzlqVar3.zzn() || zzo2.zzp() == null || !zzo2.zzp().zze || zzav(zzo2.zzp()) > 10000000) {
                                            j2 = uptimeMillis;
                                        } else {
                                            zzlqVar3.zzq();
                                            zzln zzo3 = zzlqVar3.zzo();
                                            if (zzo3 != null) {
                                                zzaak zzr3 = zzo3.zzr();
                                                long j12 = uptimeMillis;
                                                int i15 = 0;
                                                while (true) {
                                                    zzmp[] zzmpVarArr2 = this.zzb;
                                                    if (i15 < 2) {
                                                        if (zzr3.zza(i15) && zzmpVarArr2[i15].zza() && !zzmpVarArr2[i15].zzc()) {
                                                            zzmpVarArr2[i15].zzb();
                                                            j10 = j11;
                                                            str3 = str5;
                                                            j9 = j12;
                                                            zzar(zzo3, i15, false, zzo3.zzc());
                                                        } else {
                                                            j9 = j12;
                                                            j10 = j11;
                                                            str3 = str5;
                                                        }
                                                        i15++;
                                                        str5 = str3;
                                                        j11 = j10;
                                                        j12 = j9;
                                                    } else {
                                                        j2 = j12;
                                                        j8 = j11;
                                                        str2 = str5;
                                                        j5 = -9223372036854775807L;
                                                        if (zzaz()) {
                                                            this.zzaa = zzo3.zza.zzh();
                                                            if (!zzo3.zzd()) {
                                                                zzlqVar3.zzs(zzo3);
                                                                zzas(false);
                                                                zzam();
                                                            }
                                                        }
                                                        zzn2 = zzlqVar3.zzn();
                                                        if (zzn2 != null) {
                                                            if (zzn2.zzp() != null) {
                                                                try {
                                                                    if (!this.zzK) {
                                                                        zzln zzn5 = zzlqVar3.zzn();
                                                                        if (zzn5.zze) {
                                                                            int i16 = 0;
                                                                            while (true) {
                                                                                zzmp[] zzmpVarArr3 = this.zzb;
                                                                                if (i16 < 2) {
                                                                                    if (zzmpVarArr3[i16].zzr(zzn5)) {
                                                                                        i16++;
                                                                                    }
                                                                                } else if ((!zzaz() || zzlqVar3.zzo() != zzlqVar3.zzn()) && ((zzn2.zzp().zze || this.zzT >= zzn2.zzp().zzc()) && (!zzn2.zzp().zze || zzav(zzn2.zzp()) <= j8))) {
                                                                                    zzaak zzr4 = zzn2.zzr();
                                                                                    zzln zzp2 = zzlqVar3.zzp();
                                                                                    zzaak zzr5 = zzp2.zzr();
                                                                                    zzbf zzbfVar = this.zzG.zza;
                                                                                    i8 = 1;
                                                                                    zzag(zzbfVar, zzp2.zzg.zza, zzbfVar, zzn2.zzg.zza, -9223372036854775807L, false);
                                                                                    if (zzp2.zze && (((z8 = this.zzy) && this.zzaa != j5) || zzp2.zza.zzh() != j5)) {
                                                                                        this.zzaa = j5;
                                                                                        if (z8 && !this.zzab) {
                                                                                            for (int i17 = 0; i17 < 2; i17++) {
                                                                                                if (zzr5.zza(i17)) {
                                                                                                    zzmpVarArr3[i17].zze();
                                                                                                    zzaac[] zzaacVarArr = zzr5.zzc;
                                                                                                    if (!zzas.zzd(zzaacVarArr[i17].zzc().zzo, zzaacVarArr[i17].zzc().zzk) && !zzmpVarArr3[i17].zzc()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        long zzc2 = zzp2.zzc();
                                                                                        for (int i18 = 0; i18 < 2; i18++) {
                                                                                            zzmpVarArr3[i18].zzj(zzc2);
                                                                                        }
                                                                                        if (!zzp2.zzd()) {
                                                                                            zzlqVar3.zzs(zzp2);
                                                                                            zzas(false);
                                                                                            zzam();
                                                                                        }
                                                                                        zzlqVar2 = zzlqVar3;
                                                                                    }
                                                                                    for (int i19 = 0; i19 < 2; i19++) {
                                                                                        zzmpVarArr3[i19].zzi(zzr4, zzr5, zzp2.zzc());
                                                                                    }
                                                                                    zzlqVar2 = zzlqVar3;
                                                                                }
                                                                            }
                                                                            zzn3 = zzlqVar2.zzn();
                                                                            if (zzn3 != null && zzlqVar2.zzm() != zzn3 && !zzn3.zzh) {
                                                                                zzn4 = zzlqVar2.zzn();
                                                                                zzr2 = zzn4.zzr();
                                                                                i11 = i8;
                                                                                i12 = 0;
                                                                                while (true) {
                                                                                    zzmpVarArr = this.zzb;
                                                                                    if (i12 >= 2) {
                                                                                        int zzd = zzmpVarArr[i12].zzd();
                                                                                        int zzH = zzmpVarArr[i12].zzH(zzn4, zzr2, this.zzo);
                                                                                        this.zzR -= zzd - zzmpVarArr[i12].zzd();
                                                                                        i11 &= zzH & 1;
                                                                                        i12++;
                                                                                    } else if (i11 != 0) {
                                                                                        for (int i20 = 0; i20 < 2; i20++) {
                                                                                            if (zzr2.zza(i20) && !zzmpVarArr[i20].zzp(zzn4)) {
                                                                                                zzar(zzn4, i20, false, zzn4.zzc());
                                                                                            }
                                                                                        }
                                                                                        zzlqVar2.zzn().zzh = i8;
                                                                                    }
                                                                                }
                                                                            }
                                                                            z9 = false;
                                                                            while (zzax() && !this.zzK && (zzm = zzlqVar2.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzT >= zzp.zzc() && zzp.zzh) {
                                                                                if (z9) {
                                                                                    zzC();
                                                                                }
                                                                                this.zzab = false;
                                                                                zzr = zzlqVar2.zzr();
                                                                                if (zzr != null) {
                                                                                    throw null;
                                                                                }
                                                                                if (this.zzG.zzb.zza.equals(zzr.zzg.zza.zza)) {
                                                                                    zzwk zzwkVar2 = this.zzG.zzb;
                                                                                    c5 = 65535;
                                                                                    if (zzwkVar2.zzb == -1) {
                                                                                        zzwk zzwkVar3 = zzr.zzg.zza;
                                                                                        if (zzwkVar3.zzb == -1 && zzwkVar2.zze != zzwkVar3.zze) {
                                                                                            z10 = true;
                                                                                            zzlo zzloVar = zzr.zzg;
                                                                                            boolean z12 = z10;
                                                                                            zzwk zzwkVar4 = zzloVar.zza;
                                                                                            long j13 = zzloVar.zzb;
                                                                                            this.zzG = zzao(zzwkVar4, j13, zzloVar.zzc, j13, !z12, 0);
                                                                                            zzaj();
                                                                                            zzL();
                                                                                            if (zzaz() && zzr == zzlqVar2.zzo()) {
                                                                                                zzmp[] zzmpVarArr4 = this.zzb;
                                                                                                for (i10 = 0; i10 < 2; i10++) {
                                                                                                    zzmpVarArr4[i10].zzB();
                                                                                                }
                                                                                            }
                                                                                            if (this.zzG.zze == 3) {
                                                                                                zzJ();
                                                                                            }
                                                                                            zzaak zzr6 = zzlqVar2.zzm().zzr();
                                                                                            i9 = 0;
                                                                                            while (true) {
                                                                                                zzmp[] zzmpVarArr5 = this.zzb;
                                                                                                if (i9 >= 2) {
                                                                                                    if (zzr6.zza(i9)) {
                                                                                                        zzmpVarArr5[i9].zzl();
                                                                                                    }
                                                                                                    i9++;
                                                                                                }
                                                                                            }
                                                                                            z9 = true;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c5 = 65535;
                                                                                }
                                                                                z10 = false;
                                                                                zzlo zzloVar2 = zzr.zzg;
                                                                                boolean z122 = z10;
                                                                                zzwk zzwkVar42 = zzloVar2.zza;
                                                                                long j132 = zzloVar2.zzb;
                                                                                this.zzG = zzao(zzwkVar42, j132, zzloVar2.zzc, j132, !z122, 0);
                                                                                zzaj();
                                                                                zzL();
                                                                                if (zzaz()) {
                                                                                    zzmp[] zzmpVarArr42 = this.zzb;
                                                                                    while (i10 < 2) {
                                                                                    }
                                                                                }
                                                                                if (this.zzG.zze == 3) {
                                                                                }
                                                                                zzaak zzr62 = zzlqVar2.zzm().zzr();
                                                                                i9 = 0;
                                                                                while (true) {
                                                                                    zzmp[] zzmpVarArr52 = this.zzb;
                                                                                    if (i9 >= 2) {
                                                                                        break;
                                                                                    }
                                                                                    i9++;
                                                                                }
                                                                                z9 = true;
                                                                            }
                                                                            zziwVar2 = null;
                                                                            long j14 = this.zzZ.zzb;
                                                                        }
                                                                    }
                                                                } catch (zzat e15) {
                                                                    e = e15;
                                                                    zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : 3001 : zzbgj.zzq.zzf);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                } catch (zzhc e16) {
                                                                    e = e16;
                                                                    zzA(e, e.zza);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                } catch (zziw e17) {
                                                                    e = e17;
                                                                    str4 = str;
                                                                    str5 = str2;
                                                                    if (e.zzc == 1) {
                                                                    }
                                                                    if (e.zzc == 1) {
                                                                    }
                                                                    zziwVar = this.zzX;
                                                                    if (zziwVar != null) {
                                                                    }
                                                                    if (e.zzc == 1) {
                                                                    }
                                                                    if (e.zzi) {
                                                                    }
                                                                    zzee.zzf(str5, str4, e);
                                                                    z4 = true;
                                                                    zzW(true, false);
                                                                    this.zzG = this.zzG.zzf(e);
                                                                    zzC();
                                                                    return z4;
                                                                } catch (zztg e18) {
                                                                    e = e18;
                                                                    zzA(e, e.zza);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                } catch (zzvk e19) {
                                                                    e = e19;
                                                                    zzA(e, 1002);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                } catch (IOException e20) {
                                                                    e = e20;
                                                                    zzA(e, 2000);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                } catch (RuntimeException e21) {
                                                                    e = e21;
                                                                    zziw zzc3 = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : zzbgj.zzq.zzf);
                                                                    zzee.zzf(str2, str, zzc3);
                                                                    zzW(true, false);
                                                                    this.zzG = this.zzG.zzf(zzc3);
                                                                    z4 = true;
                                                                    zzC();
                                                                    return z4;
                                                                }
                                                            }
                                                            i8 = 1;
                                                            zzlqVar2 = zzlqVar3;
                                                            if (zzn2.zzg.zzj || this.zzK) {
                                                                zzmp[] zzmpVarArr6 = this.zzb;
                                                                for (int i21 = 0; i21 < 2; i21++) {
                                                                    zzmp zzmpVar = zzmpVarArr6[i21];
                                                                    if (zzmpVar.zzp(zzn2) && zzmpVar.zzg(zzn2)) {
                                                                        long j15 = zzn2.zzg.zze;
                                                                        zzmpVar.zzh(zzn2, (j15 == j5 || j15 == Long.MIN_VALUE) ? j5 : j15 + zzn2.zza());
                                                                    }
                                                                }
                                                            }
                                                            zzn3 = zzlqVar2.zzn();
                                                            if (zzn3 != null) {
                                                                zzn4 = zzlqVar2.zzn();
                                                                zzr2 = zzn4.zzr();
                                                                i11 = i8;
                                                                i12 = 0;
                                                                while (true) {
                                                                    zzmpVarArr = this.zzb;
                                                                    if (i12 >= 2) {
                                                                    }
                                                                    int zzd2 = zzmpVarArr[i12].zzd();
                                                                    int zzH2 = zzmpVarArr[i12].zzH(zzn4, zzr2, this.zzo);
                                                                    this.zzR -= zzd2 - zzmpVarArr[i12].zzd();
                                                                    i11 &= zzH2 & 1;
                                                                    i12++;
                                                                }
                                                            }
                                                            z9 = false;
                                                            while (zzax()) {
                                                                if (z9) {
                                                                }
                                                                this.zzab = false;
                                                                zzr = zzlqVar2.zzr();
                                                                if (zzr != null) {
                                                                }
                                                            }
                                                            zziwVar2 = null;
                                                            long j142 = this.zzZ.zzb;
                                                        }
                                                        i8 = 1;
                                                        zzlqVar2 = zzlqVar3;
                                                        zzn3 = zzlqVar2.zzn();
                                                        if (zzn3 != null) {
                                                        }
                                                        z9 = false;
                                                        while (zzax()) {
                                                        }
                                                        zziwVar2 = null;
                                                        long j1422 = this.zzZ.zzb;
                                                    }
                                                }
                                            } else {
                                                j2 = uptimeMillis;
                                            }
                                        }
                                        j8 = 10000000;
                                        str2 = "ExoPlayerImplInternal";
                                        j5 = -9223372036854775807L;
                                        zzn2 = zzlqVar3.zzn();
                                        if (zzn2 != null) {
                                        }
                                        i8 = 1;
                                        zzlqVar2 = zzlqVar3;
                                        zzn3 = zzlqVar2.zzn();
                                        if (zzn3 != null) {
                                        }
                                        z9 = false;
                                        while (zzax()) {
                                        }
                                        zziwVar2 = null;
                                        long j14222 = this.zzZ.zzb;
                                    }
                                } catch (zziw e22) {
                                    e = e22;
                                    if (e.zzc == 1 && (zzn = this.zzs.zzn()) != null && e.zzh == null) {
                                        e = e.zzd(zzn.zzg.zza);
                                    }
                                    if (e.zzc == 1 && (zzwkVar = e.zzh) != null) {
                                        int i22 = e.zze;
                                        zzlqVar = this.zzs;
                                        if (zzlqVar.zzo() != null && zzlqVar.zzo().zzg.zza.equals(zzwkVar) && this.zzb[i22].zzq(zzlqVar.zzo())) {
                                            this.zzab = true;
                                            zzab();
                                            zzo = zzlqVar.zzo();
                                            zzln zzm2 = zzlqVar.zzm();
                                            if (zzlqVar.zzm() != zzo) {
                                                while (zzm2 != null && zzm2.zzp() != zzo) {
                                                    zzm2 = zzm2.zzp();
                                                }
                                            }
                                            zzlqVar.zzs(zzm2);
                                            if (this.zzG.zze != 4) {
                                                zzam();
                                                this.zzi.zzh(2);
                                            }
                                            z4 = true;
                                            zzC();
                                            return z4;
                                        }
                                    }
                                    zziwVar = this.zzX;
                                    if (zziwVar != null) {
                                        zziwVar.addSuppressed(e);
                                        e = this.zzX;
                                    }
                                    if (e.zzc == 1) {
                                        zzlq zzlqVar4 = this.zzs;
                                        if (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                            while (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                                zzlqVar4.zzr();
                                            }
                                            zzln zzm3 = zzlqVar4.zzm();
                                            zzm3.getClass();
                                            zzC();
                                            zzlo zzloVar3 = zzm3.zzg;
                                            zzwk zzwkVar5 = zzloVar3.zza;
                                            long j16 = zzloVar3.zzb;
                                            this.zzG = zzao(zzwkVar5, j16, zzloVar3.zzc, j16, true, 0);
                                        }
                                    }
                                    if (e.zzi || !(this.zzX == null || (i5 = e.zza) == 5004 || i5 == 5003)) {
                                        zzee.zzf(str5, str4, e);
                                        z4 = true;
                                        zzW(true, false);
                                        this.zzG = this.zzG.zzf(e);
                                        zzC();
                                        return z4;
                                    }
                                    zzee.zzd(str5, "Recoverable renderer error", e);
                                    if (this.zzX == null) {
                                        this.zzX = e;
                                    }
                                    zzdx zzdxVar2 = this.zzi;
                                    zzdxVar2.zzg(zzdxVar2.zzd(25, e));
                                    z4 = true;
                                    zzC();
                                    return z4;
                                }
                            }
                            if (this.zzN) {
                            }
                            long j112 = 10000000;
                            if (this.zzK) {
                            }
                            j2 = uptimeMillis;
                            j8 = 10000000;
                            str2 = "ExoPlayerImplInternal";
                            j5 = -9223372036854775807L;
                            zzn2 = zzlqVar3.zzn();
                            if (zzn2 != null) {
                            }
                            i8 = 1;
                            zzlqVar2 = zzlqVar3;
                            zzn3 = zzlqVar2.zzn();
                            if (zzn3 != null) {
                            }
                            z9 = false;
                            while (zzax()) {
                            }
                            zziwVar2 = null;
                            long j142222 = this.zzZ.zzb;
                        } catch (zziw e23) {
                            e = e23;
                            str4 = str;
                            if (e.zzc == 1) {
                                e = e.zzd(zzn.zzg.zza);
                            }
                            if (e.zzc == 1) {
                                int i222 = e.zze;
                                zzlqVar = this.zzs;
                                if (zzlqVar.zzo() != null) {
                                    this.zzab = true;
                                    zzab();
                                    zzo = zzlqVar.zzo();
                                    zzln zzm22 = zzlqVar.zzm();
                                    if (zzlqVar.zzm() != zzo) {
                                    }
                                    zzlqVar.zzs(zzm22);
                                    if (this.zzG.zze != 4) {
                                    }
                                    z4 = true;
                                    zzC();
                                    return z4;
                                }
                            }
                            zziwVar = this.zzX;
                            if (zziwVar != null) {
                            }
                            if (e.zzc == 1) {
                            }
                            if (e.zzi) {
                            }
                            zzee.zzf(str5, str4, e);
                            z4 = true;
                            zzW(true, false);
                            this.zzG = this.zzG.zzf(e);
                            zzC();
                            return z4;
                        }
                        str = "Playback error";
                    }
                    i6 = this.zzG.zze;
                    z4 = true;
                } catch (zziw e24) {
                    e = e24;
                }
                if (i6 != 1) {
                    if (i6 != 4) {
                        zzlq zzlqVar5 = this.zzs;
                        zzln zzm4 = zzlqVar5.zzm();
                        if (zzm4 == null) {
                            zzQ(j2);
                        } else {
                            long j17 = j2;
                            Trace.beginSection("doSomeWork");
                            zzL();
                            if (zzm4.zze) {
                                this.zzU = zzfj.zzq(SystemClock.elapsedRealtime());
                                boolean z13 = false;
                                zzm4.zza.zzf(this.zzG.zzs - this.zzn, false);
                                int i23 = 0;
                                z6 = true;
                                z7 = true;
                                while (true) {
                                    zzmp[] zzmpVarArr7 = this.zzb;
                                    if (i23 < i13) {
                                        zzmp zzmpVar2 = zzmpVarArr7[i23];
                                        if (zzmpVar2.zzd() == 0) {
                                            zzN(i23, z13);
                                            j7 = j5;
                                        } else {
                                            j7 = j5;
                                            zzmpVar2.zzs(this.zzT, this.zzU);
                                            z6 = z6 && zzmpVar2.zzo();
                                            boolean zzt = zzmpVar2.zzt(zzm4);
                                            zzN(i23, zzt);
                                            z7 = z7 && zzt;
                                            if (!zzt) {
                                                zzay(i23);
                                            }
                                        }
                                        i23++;
                                        j5 = j7;
                                        z13 = false;
                                        i13 = 2;
                                    } else {
                                        j6 = j5;
                                    }
                                }
                            } else {
                                j6 = j5;
                                zzm4.zza.zzc();
                                z6 = true;
                                z7 = true;
                            }
                            long j18 = zzm4.zzg.zze;
                            if (z6 && zzm4.zze && (j18 == j6 || j18 <= this.zzG.zzs)) {
                                if (this.zzK) {
                                    this.zzK = false;
                                    zzE(false, this.zzG.zzn, false, 5);
                                }
                                if (zzm4.zzg.zzj) {
                                    zzB(4);
                                    zzK();
                                    int i24 = 2;
                                    if (this.zzG.zze == 2) {
                                        int i25 = 0;
                                        while (true) {
                                            zzmp[] zzmpVarArr8 = this.zzb;
                                            if (i25 < i24) {
                                                if (zzmpVarArr8[i25].zzp(zzm4)) {
                                                    zzay(i25);
                                                }
                                                i25++;
                                                i24 = 2;
                                            } else {
                                                zzmd zzmdVar = this.zzG;
                                                if (!zzmdVar.zzg && zzmdVar.zzr < 500000 && zzaF(zzlqVar5.zzk()) && zzax()) {
                                                    if (this.zzY == j6) {
                                                        this.zzY = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - this.zzY >= 4000) {
                                                        throw new zzfb(0, 4000);
                                                    }
                                                    boolean z14 = !zzax() && this.zzG.zze == 3;
                                                    zzmd zzmdVar2 = this.zzG;
                                                    boolean z15 = zzmdVar2.zzp;
                                                    i7 = zzmdVar2.zze;
                                                    if (i7 != 4 && (z14 || i7 == 2 || (i7 == 3 && this.zzR != 0))) {
                                                        zzQ(j17);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    this.zzY = j6;
                                    if (zzax()) {
                                    }
                                    zzmd zzmdVar22 = this.zzG;
                                    boolean z152 = zzmdVar22.zzp;
                                    i7 = zzmdVar22.zze;
                                    if (i7 != 4) {
                                        zzQ(j17);
                                    }
                                    Trace.endSection();
                                }
                            }
                            zzmd zzmdVar3 = this.zzG;
                            if (zzmdVar3.zze == 2) {
                                if (this.zzR == 0) {
                                    zzi = zzae();
                                    break;
                                } else if (z7) {
                                    if (zzmdVar3.zzg) {
                                        zzln zzm5 = zzlqVar5.zzm();
                                        long zze = zzP(this.zzG.zza, zzm5.zzg.zza) ? this.zzad.zze() : j6;
                                        zzln zzk = zzlqVar5.zzk();
                                        boolean z16 = zzk.zzd() && zzk.zzg.zzj;
                                        boolean z17 = zzk.zzg.zza.zzb() && !zzk.zze;
                                        if (!z16 && !z17) {
                                            zzi = this.zzg.zzi(new zzli(this.zzv, this.zzG.zza, zzm5.zzg.zza, this.zzT - zzm5.zza(), zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zze, this.zzM));
                                            break;
                                        }
                                    }
                                    zzB(3);
                                    this.zzX = zziwVar2;
                                    if (zzax()) {
                                        zzaC(false, false);
                                        this.zzo.zza();
                                        zzJ();
                                    }
                                    int i242 = 2;
                                    if (this.zzG.zze == 2) {
                                    }
                                    this.zzY = j6;
                                    if (zzax()) {
                                    }
                                    zzmd zzmdVar222 = this.zzG;
                                    boolean z1522 = zzmdVar222.zzp;
                                    i7 = zzmdVar222.zze;
                                    if (i7 != 4) {
                                    }
                                    Trace.endSection();
                                }
                            }
                            if (this.zzG.zze == 3) {
                                if (this.zzR == 0) {
                                    if (!zzae()) {
                                        zzaC(zzax(), false);
                                        zzB(2);
                                        if (this.zzL) {
                                            for (zzln zzm6 = zzlqVar5.zzm(); zzm6 != null; zzm6 = zzm6.zzp()) {
                                                for (zzaac zzaacVar : zzm6.zzr().zzc) {
                                                }
                                            }
                                            this.zzad.zzc();
                                        }
                                        zzK();
                                    }
                                }
                            }
                            int i2422 = 2;
                            if (this.zzG.zze == 2) {
                            }
                            this.zzY = j6;
                            if (zzax()) {
                            }
                            zzmd zzmdVar2222 = this.zzG;
                            boolean z15222 = zzmdVar2222.zzp;
                            i7 = zzmdVar2222.zze;
                            if (i7 != 4) {
                            }
                            Trace.endSection();
                        }
                    }
                    z4 = true;
                }
                zzC();
                return z4;
            case 3:
                z5 = true;
                zzR((zzle) message.obj);
                z4 = z5;
                zzC();
                return z4;
            case 4:
                z5 = true;
                zzM((zzav) message.obj);
                zzak(this.zzo.zzj(), true);
                z4 = z5;
                zzC();
                return z4;
            case 5:
                z5 = true;
                this.zzA = (zzmt) message.obj;
                z4 = z5;
                zzC();
                return z4;
            case 6:
                z5 = true;
                zzW(false, true);
                z4 = z5;
                zzC();
                return z4;
            case 7:
                zzdq zzdqVar = (zzdq) message.obj;
                try {
                    zzX(true, false, true, false);
                    int i26 = 0;
                    while (true) {
                        zzmp[] zzmpVarArr9 = this.zzb;
                        if (i26 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            this.zzi.zzm(null);
                            this.zzj.zzb();
                            zzdqVar.zza();
                            return true;
                        }
                        this.zzc[i26].zzw();
                        zzmpVarArr9[i26].zzI();
                        i26++;
                    }
                } finally {
                    this.zzi.zzm(null);
                    this.zzj.zzb();
                    zzdqVar.zza();
                }
            case 8:
                try {
                    zzwi zzwiVar = (zzwi) message.obj;
                    zzlq zzlqVar6 = this.zzs;
                    if (zzlqVar6.zzd(zzwiVar)) {
                        zzln zzk2 = zzlqVar6.zzk();
                        if (zzk2 == null) {
                            throw null;
                        }
                        if (!zzk2.zze) {
                            float f5 = this.zzo.zzj().zzb;
                            zzmd zzmdVar4 = this.zzG;
                            zzk2.zzh(f5, zzmdVar4.zza, zzmdVar4.zzl);
                        }
                        zzaw(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzlqVar6.zzm()) {
                            zzU(zzk2.zzg.zzb, true);
                            zzap();
                            zzk2.zzh = true;
                            zzmd zzmdVar5 = this.zzG;
                            try {
                                zzwk zzwkVar6 = zzmdVar5.zzb;
                                long j19 = zzk2.zzg.zzb;
                                z5 = true;
                                this.zzG = zzao(zzwkVar6, j19, zzmdVar5.zzc, j19, false, 5);
                            } catch (zzat e25) {
                                e = e25;
                                zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : 3001 : zzbgj.zzq.zzf);
                                z4 = true;
                                zzC();
                                return z4;
                            } catch (zzhc e26) {
                                e = e26;
                                zzA(e, e.zza);
                                z4 = true;
                                zzC();
                                return z4;
                            } catch (zziw e27) {
                                e = e27;
                                if (e.zzc == 1) {
                                }
                                if (e.zzc == 1) {
                                }
                                zziwVar = this.zzX;
                                if (zziwVar != null) {
                                }
                                if (e.zzc == 1) {
                                }
                                if (e.zzi) {
                                }
                                zzee.zzf(str5, str4, e);
                                z4 = true;
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(e);
                                zzC();
                                return z4;
                            } catch (zztg e28) {
                                e = e28;
                                zzA(e, e.zza);
                                z4 = true;
                                zzC();
                                return z4;
                            } catch (zzvk e29) {
                                e = e29;
                                zzA(e, 1002);
                                z4 = true;
                                zzC();
                                return z4;
                            } catch (IOException e30) {
                                e = e30;
                                zzA(e, 2000);
                                z4 = true;
                                zzC();
                                return z4;
                            } catch (RuntimeException e31) {
                                e = e31;
                                str = "Playback error";
                                str2 = str5;
                                zziw zzc32 = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : zzbgj.zzq.zzf);
                                zzee.zzf(str2, str, zzc32);
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(zzc32);
                                z4 = true;
                                zzC();
                                return z4;
                            }
                        } else {
                            z5 = true;
                        }
                        zzam();
                    } else {
                        z5 = true;
                        zzln zzu = zzlqVar6.zzu(zzwiVar);
                        if (zzu != null) {
                            zzgrc.zzi(!zzu.zze);
                            float f6 = this.zzo.zzj().zzb;
                            zzmd zzmdVar6 = this.zzG;
                            zzu.zzh(f6, zzmdVar6.zza, zzmdVar6.zzl);
                            if (zzlqVar6.zze(zzwiVar)) {
                                zzai();
                            }
                        }
                    }
                    z4 = z5;
                } catch (zzat e32) {
                    e = e32;
                } catch (zzhc e33) {
                    e = e33;
                } catch (zziw e34) {
                    e = e34;
                } catch (zztg e35) {
                    e = e35;
                } catch (zzvk e36) {
                    e = e36;
                } catch (IOException e37) {
                    e = e37;
                } catch (RuntimeException e38) {
                    e = e38;
                }
                zzC();
                return z4;
            case 9:
                zzwi zzwiVar2 = (zzwi) message.obj;
                zzlq zzlqVar7 = this.zzs;
                if (zzlqVar7.zzd(zzwiVar2)) {
                    zzlqVar7.zzf(this.zzT);
                    zzam();
                } else if (zzlqVar7.zze(zzwiVar2)) {
                    zzai();
                }
                z4 = true;
                zzC();
                return z4;
            case 10:
                zzad();
                z4 = true;
                zzC();
                return z4;
            case 11:
                int i27 = message.arg1;
                this.zzO = i27;
                int zza2 = this.zzs.zza(this.zzG.zza, i27);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z4 = true;
                zzC();
                return z4;
            case 12:
                boolean z18 = message.arg1 != 0;
                this.zzP = z18;
                int zzb = this.zzs.zzb(this.zzG.zza, z18);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z4 = true;
                zzC();
                return z4;
            case 13:
                boolean z19 = message.arg1 != 0;
                zzdq zzdqVar2 = (zzdq) message.obj;
                if (this.zzQ != z19) {
                    this.zzQ = z19;
                    if (!z19) {
                        zzmp[] zzmpVarArr10 = this.zzb;
                        for (int i28 = 0; i28 < 2; i28++) {
                            zzmpVarArr10[i28].zzG();
                        }
                    }
                }
                if (zzdqVar2 != null) {
                    zzdqVar2.zza();
                }
                z4 = true;
                zzC();
                return z4;
            case 14:
                zzmh zzmhVar = (zzmh) message.obj;
                if (zzmhVar.zzf() == this.zzk) {
                    zzaE(zzmhVar);
                    int i29 = this.zzG.zze;
                    if (i29 == 3 || i29 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzmhVar).zza();
                }
                z4 = true;
                zzC();
                return z4;
            case 15:
                final zzmh zzmhVar2 = (zzmh) message.obj;
                Looper zzf = zzmhVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzq.zzd(zzf, null).zzn(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzkx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzlf.zzz(zzmhVar2);
                        }
                    });
                } else {
                    zzee.zzc("TAG", "Trying to send message on a dead thread.");
                    zzmhVar2.zzi(false);
                }
                z4 = true;
                zzC();
                return z4;
            case 16:
                zzak((zzav) message.obj, false);
                z4 = true;
                zzC();
                return z4;
            case 17:
                zzkz zzkzVar = (zzkz) message.obj;
                this.zzH.zza(1);
                if (zzkzVar.zzb() != -1) {
                    this.zzS = new zzle(new zzmj(zzkzVar.zza(), zzkzVar.zzd()), zzkzVar.zzb(), zzkzVar.zzc());
                }
                zzaf(this.zzt.zzl(zzkzVar.zza(), zzkzVar.zzd()), false);
                z4 = true;
                zzC();
                return z4;
            case 18:
                zzkz zzkzVar2 = (zzkz) message.obj;
                int i30 = message.arg1;
                this.zzH.zza(1);
                zzmc zzmcVar = this.zzt;
                if (i30 == -1) {
                    i30 = zzmcVar.zzc();
                }
                zzaf(zzmcVar.zzm(i30, zzkzVar2.zza(), zzkzVar2.zzd()), false);
                z4 = true;
                zzC();
                return z4;
            case 19:
                zzla zzlaVar = (zzla) message.obj;
                this.zzH.zza(1);
                zzmc zzmcVar2 = this.zzt;
                int i31 = zzlaVar.zza;
                zzaf(zzmcVar2.zzo(0, 0, 0, null), false);
                z4 = true;
                zzC();
                return z4;
            case 20:
                int i32 = message.arg1;
                int i33 = message.arg2;
                zzyf zzyfVar = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzn(i32, i33, zzyfVar), false);
                z4 = true;
                zzC();
                return z4;
            case zzbgj.zzt.zzm /* 21 */:
                zzyf zzyfVar2 = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzp(zzyfVar2), false);
                z4 = true;
                zzC();
                return z4;
            case 22:
                zzaf(this.zzt.zzh(), true);
                z4 = true;
                zzC();
                return z4;
            case 23:
                this.zzJ = message.arg1 != 0;
                zzaj();
                if (this.zzK) {
                    zzlq zzlqVar8 = this.zzs;
                    if (zzlqVar8.zzn() != zzlqVar8.zzm()) {
                        zzI(true);
                        zzas(false);
                    }
                }
                z4 = true;
                zzC();
                return z4;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z4 = true;
                zzC();
                return z4;
            case 26:
                zzac();
                z4 = true;
                zzC();
                return z4;
            case 27:
                int i34 = message.arg1;
                int i35 = message.arg2;
                List list = (List) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zza(i34, i35, list), false);
                z4 = true;
                zzC();
                return z4;
            case 28:
                zzjg zzjgVar = (zzjg) message.obj;
                this.zzZ = zzjgVar;
                this.zzs.zzc(this.zzG.zza, zzjgVar);
                z4 = true;
                zzC();
                return z4;
            case 29:
                this.zzH.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzG.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z4 = true;
                zzC();
                return z4;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdq zzdqVar3 = (zzdq) pair.second;
                zzmp[] zzmpVarArr11 = this.zzb;
                for (int i36 = 0; i36 < 2; i36++) {
                    zzmpVarArr11[i36].zzJ(obj);
                }
                int i37 = this.zzG.zze;
                if (i37 == 3 || i37 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdqVar3 != null) {
                    zzdqVar3.zza();
                }
                z4 = true;
                zzC();
                return z4;
            case 31:
                zzd zzdVar2 = (zzd) message.obj;
                int i38 = message.arg1;
                this.zze.zze(zzdVar2);
                zzcd zzcdVar = this.zzz;
                if (i38 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z4 = true;
                zzC();
                return z4;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z4 = true;
                zzC();
                return z4;
            case 33:
                int i39 = message.arg1;
                zzmd zzmdVar7 = this.zzG;
                zzH(zzmdVar7.zzl, i39, zzmdVar7.zzn, zzmdVar7.zzm);
                z4 = true;
                zzC();
                return z4;
            case 34:
                zzD(this.zzac);
                z4 = true;
                zzC();
                return z4;
            case 35:
                zzacp zzacpVar = (zzacp) message.obj;
                zzmp[] zzmpVarArr12 = this.zzb;
                for (int i40 = 0; i40 < 2; i40++) {
                    zzmpVarArr12[i40].zzK(zzacpVar);
                }
                z4 = true;
                zzC();
                return z4;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    if (this.zzE != null && this.zzD && !this.zzi.zzb(37)) {
                        this.zzF++;
                    }
                    final int i41 = this.zzF;
                    if (i41 > 0) {
                        this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzlf.this.zzv(i41);
                            }
                        });
                    }
                    this.zzF = 0;
                    this.zzD = false;
                    this.zzi.zzk(37);
                    zzle zzleVar = this.zzE;
                    if (zzleVar != null) {
                        zzR(zzleVar);
                        this.zzE = null;
                        this.zzD = false;
                    }
                }
                this.zzC = booleanValue;
                zzV();
                z4 = true;
                zzC();
                return z4;
            case 37:
                this.zzD = false;
                zzle zzleVar2 = this.zzE;
                if (zzleVar2 != null) {
                    zzR(zzleVar2);
                    this.zzE = null;
                }
                z4 = true;
                zzC();
                return z4;
            case 38:
                this.zzB = (zzms) message.obj;
                zzV();
                z4 = true;
                zzC();
                return z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f5) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i5) {
        this.zzi.zze(33, i5, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j2, long j5, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z4, int i5, int i6) {
        this.zzi.zze(1, z4 ? 1 : 0, (i6 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i5, long j2) {
        this.zzi.zzd(3, new zzle(zzbfVar, i5, j2)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z4) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f5) {
        this.zzi.zzd(32, Float.valueOf(f5)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j2) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j2 != -9223372036854775807L) {
            return zzdqVar.zze(j2);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    public final /* synthetic */ zzln zzt(zzlo zzloVar, long j2) {
        zzaan zze = this.zzg.zze(this.zzv);
        long j5 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j2, this.zze, zze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i5, boolean z4) {
        this.zzw.zzB(i5, this.zzb[i5].zze(), z4);
    }

    public final /* synthetic */ void zzv(int i5) {
        this.zzw.zzW(i5);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i5, long j2, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i5, j2, null)).zza();
    }
}
