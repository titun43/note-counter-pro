package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;
    private zzln zzi;
    private zzln zzj;
    private zzln zzk;
    private zzln zzl;
    private zzln zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j2, long j5, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j2);
        return zze == -1 ? new zzwk(obj, j5, zzbdVar.zzf(j2)) : new zzwk(obj, zze, zzbdVar.zzd(zze), j5);
    }

    private final void zzB() {
        int i5 = zzguf.zzd;
        final zzguc zzgucVar = new zzguc();
        for (zzln zzlnVar = this.zzi; zzlnVar != null; zzlnVar = zzlnVar.zzp()) {
            zzgucVar.zzf(zzlnVar.zzg.zza);
        }
        zzln zzlnVar2 = this.zzj;
        final zzwk zzwkVar = zzlnVar2 == null ? null : zzlnVar2.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzlq.this.zzz(zzgucVar, zzwkVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            zzln zzlnVar = (zzln) this.zzq.get(i5);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzlnVar.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            zze = zzbfVar2.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVar.getClass();
                if (zzlnVar.zzp() == null || zzlnVar.zzg.zzh) {
                    break;
                }
                zzlnVar = zzlnVar.zzp();
            }
            zzln zzp = zzlnVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar2.zze(zzp.zzb) != zze) {
                break;
            }
            zzlnVar = zzp;
            zzbfVar = zzbfVar2;
        }
        int zzs = zzs(zzlnVar);
        zzlnVar.zzg = zzx(zzbfVar2, zzlnVar.zzg);
        return zzs;
    }

    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j2) {
        zzbf zzbfVar2;
        long j5;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        Object obj;
        long j6;
        long j7;
        long j8;
        zzlo zzloVar = zzlnVar.zzg;
        long zza = zzlnVar.zza();
        long j9 = zzloVar.zze;
        long j10 = (zza + j9) - j2;
        if (!zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj2 = zzwkVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            if (!zzwkVar.zzb()) {
                int i5 = zzwkVar.zze;
                if (i5 != -1) {
                    zzbdVar2.zzi(i5);
                }
                int zzd = zzbdVar2.zzd(i5);
                zzbdVar2.zzk(i5);
                if (zzd != zzbdVar2.zzg(i5)) {
                    return zzG(zzbfVar, obj2, i5, zzd, j9, zzwkVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i5);
                return zzH(zzbfVar, obj2, 0L, j9, zzwkVar.zzd, false);
            }
            int i6 = zzwkVar.zzb;
            if (zzbdVar2.zzg(i6) == -1) {
                return null;
            }
            int zza2 = zzbdVar2.zzg.zza(i6).zza(zzwkVar.zzc);
            if (zza2 < 0) {
                return zzG(zzbfVar, obj2, i6, zza2, zzloVar.zzc, zzwkVar.zzd, false);
            }
            long j11 = zzloVar.zzc;
            if (j11 == -9223372036854775807L) {
                Pair zzn = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j10));
                zzbfVar2 = zzbfVar;
                if (zzn == null) {
                    return null;
                }
                j11 = ((Long) zzn.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j5 = j11;
            }
            zzK(zzbfVar2, obj2, i6);
            return zzH(zzbfVar2, obj2, Math.max(0L, j11), j5, zzwkVar.zzd, false);
        }
        zzwk zzwkVar2 = zzloVar.zza;
        Object obj3 = zzwkVar2.zza;
        int zze = zzbfVar.zze(obj3);
        int i7 = this.zzf;
        boolean z4 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        long j12 = 0;
        int zzl = zzbfVar.zzl(zze, zzbdVar3, zzbeVar2, i7, z4);
        if (zzl == -1) {
            return null;
        }
        int i8 = zzbfVar.zzd(zzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j13 = zzwkVar2.zzd;
        if (zzbfVar.zzb(i8, zzbeVar2, 0L).zzn == zzl) {
            Pair zzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar3, i8, -9223372036854775807L, Math.max(0L, j10));
            if (zzn2 == null) {
                return null;
            }
            Object obj5 = zzn2.first;
            long longValue = ((Long) zzn2.second).longValue();
            zzln zzp = zzlnVar.zzp();
            if (zzp == null || !zzp.zzb.equals(obj5)) {
                long zzC = zzC(obj5);
                if (zzC == -1) {
                    zzC = this.zze;
                    this.zze = 1 + zzC;
                }
                j8 = zzC;
            } else {
                j8 = zzp.zzg.zza.zzd;
            }
            zzbfVar3 = zzbfVar;
            zzbeVar = zzbeVar2;
            zzbdVar = zzbdVar3;
            j6 = longValue;
            obj = obj5;
            j7 = j8;
            j12 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar2;
            obj = obj4;
            j6 = 0;
            j7 = j13;
        }
        zzwk zzA = zzA(zzbfVar3, obj, j6, j7, zzbeVar, zzbdVar);
        long j14 = j6;
        zzbd zzbdVar4 = zzbdVar;
        if (j12 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i9 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzA, j12, j14);
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j2, long j5) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j2, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j5, j2, zzwkVar.zzd, false);
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i5, int i6, long j2, long j5, boolean z4) {
        zzwk zzwkVar = new zzwk(obj, i5, i6, j5);
        Object obj2 = zzwkVar.zza;
        int i7 = zzwkVar.zzb;
        int i8 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i7, i8);
        if (i6 == zzbdVar.zzd(i5)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i7);
        long j6 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j6 = Math.max(0L, (-1) + zzh);
        }
        return new zzlo(zzwkVar, j6, j2, -9223372036854775807L, zzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j2, long j5, long j6, boolean z4) {
        long j7;
        long j8;
        long j9;
        long j10 = j2;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j10);
        if (zzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(zzf);
        }
        zzwk zzwkVar = new zzwk(obj, j6, zzf);
        boolean zzL = zzL(zzwkVar);
        boolean zzI = zzI(zzbfVar, zzwkVar);
        boolean zzJ = zzJ(zzbfVar, zzwkVar, zzL);
        if (zzf != -1) {
            zzbdVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzc(zzf);
            j7 = 0;
        } else {
            j7 = -9223372036854775807L;
        }
        if (j7 != -9223372036854775807L) {
            j9 = j7;
            j8 = j9;
        } else {
            j8 = zzbdVar.zzd;
            j9 = -9223372036854775807L;
        }
        if (j8 != -9223372036854775807L && j10 >= j8) {
            j10 = Math.max(0L, j8 - 1);
        }
        return new zzlo(zzwkVar, j10, j5, j9, j8, false, false, zzL, zzI, zzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z4) {
        int zze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i5 = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i5, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z4;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i5) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i5);
        long j2 = zzbdVar.zzg.zza(i5).zzi;
        return 0L;
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i5) {
        this.zzf = i5;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z4) {
        this.zzg = z4;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j2 = zzjgVar.zzb;
        zzj();
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final void zzf(long j2) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j2);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            return !zzlnVar.zzg.zzj && zzlnVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzlo zzh(long j2, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j2);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVar;
        zzln zzlnVar2 = this.zzl;
        long zza = zzlnVar2 == null ? 1000000000000L : (zzlnVar2.zza() + zzlnVar2.zzg.zze) - zzloVar.zzb;
        int i5 = 0;
        while (true) {
            if (i5 >= this.zzq.size()) {
                zzlnVar = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i5)).zzg;
            long j2 = zzloVar2.zze;
            long j5 = zzloVar.zze;
            if ((j2 == -9223372036854775807L || j2 == j5) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVar = (zzln) this.zzq.remove(i5);
                break;
            }
            i5++;
        }
        if (zzlnVar == null) {
            zzlnVar = this.zzr.zza(zzloVar, zza);
        } else {
            zzlnVar.zzg = zzloVar;
            zzlnVar.zzb(zza);
        }
        zzln zzlnVar3 = this.zzl;
        if (zzlnVar3 != null) {
            zzlnVar3.zzo(zzlnVar);
        } else {
            this.zzi = zzlnVar;
            this.zzj = zzlnVar;
            this.zzk = zzlnVar;
        }
        this.zzo = null;
        this.zzl = zzlnVar;
        this.zzn++;
        zzB();
        return zzlnVar;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            ((zzln) this.zzq.get(i5)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzln zzk() {
        return this.zzl;
    }

    public final zzln zzl() {
        return this.zzm;
    }

    public final zzln zzm() {
        return this.zzi;
    }

    public final zzln zzn() {
        return this.zzj;
    }

    public final zzln zzo() {
        return this.zzk;
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i5 = this.zzn - 1;
        this.zzn = i5;
        if (i5 == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i5 = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i5 = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i5 |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i5;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i5 = 0; i5 < this.zzq.size(); i5++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i5);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    public final zzln zzu(zzwi zzwiVar) {
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            zzln zzlnVar = (zzln) this.zzq.get(i5);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVar = this.zzi;
        zzlnVar.getClass();
        this.zzo = zzlnVar.zzb;
        this.zzp = zzlnVar.zzg.zza.zzd;
        while (zzlnVar != null) {
            zzlnVar.zzn();
            zzlnVar = zzlnVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(zzbf zzbfVar, long j2, long j5, long j6) {
        zzlo zzloVar;
        boolean z4;
        int zzs;
        zzln zzlnVar = this.zzi;
        zzln zzlnVar2 = null;
        while (true) {
            int i5 = 0;
            if (zzlnVar == null) {
                return 0;
            }
            zzlo zzloVar2 = zzlnVar.zzg;
            if (zzlnVar2 == null) {
                zzloVar = zzx(zzbfVar, zzloVar2);
            } else {
                zzlo zzE = zzE(zzbfVar, zzlnVar2, j2);
                if (zzE == null || zzloVar2.zzb != zzE.zzb || !zzloVar2.zza.equals(zzE.zza)) {
                    break;
                }
                zzloVar = zzE;
            }
            zzlnVar.zzg = zzloVar.zzb(zzloVar2.zzc);
            long j7 = zzloVar2.zze;
            long j8 = zzloVar.zze;
            if (j7 != j8) {
                zzlnVar.zzs();
                long zza = j8 == -9223372036854775807L ? Long.MAX_VALUE : j8 + zzlnVar.zza();
                if (zzlnVar == this.zzj) {
                    boolean z5 = zzlnVar.zzg.zzg;
                    if (j5 == Long.MIN_VALUE || j5 >= zza) {
                        z4 = true;
                        boolean z6 = zzlnVar != this.zzk && (j6 == Long.MIN_VALUE || j6 >= zza);
                        zzs = zzs(zzlnVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        if (j7 == -9223372036854775807L) {
                            j7 = -9223372036854775807L;
                        }
                        if (z4 && j7 != -9223372036854775807L) {
                            i5 = 1;
                        }
                        return z6 ? i5 | 2 : i5;
                    }
                }
                z4 = false;
                if (zzlnVar != this.zzk) {
                }
                zzs = zzs(zzlnVar);
                if (zzs == 0) {
                }
            } else {
                zzlnVar2 = zzlnVar;
                zzlnVar = zzlnVar.zzp();
            }
        }
        return zzs(zzlnVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlo zzx(zzbf zzbfVar, zzlo zzloVar) {
        long j2;
        long j5;
        long j6;
        long j7;
        int i5;
        zzwk zzwkVar = zzloVar.zza;
        boolean zzL = zzL(zzwkVar);
        boolean zzI = zzI(zzbfVar, zzwkVar);
        boolean zzJ = zzJ(zzbfVar, zzwkVar, zzL);
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzwkVar.zzb() || (i5 = zzwkVar.zze) == -1) {
            j2 = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i5);
            j2 = 0;
        }
        if (zzwkVar.zzb()) {
            j5 = zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc);
        } else {
            if (j2 != -9223372036854775807L) {
                j6 = 0;
                j7 = 0;
                if (zzwkVar.zzb()) {
                    int i6 = zzwkVar.zze;
                    if (i6 != -1) {
                        zzbdVar.zzk(i6);
                    }
                } else {
                    zzbdVar.zzk(zzwkVar.zzb);
                }
                return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j7, j6, false, false, zzL, zzI, zzJ);
            }
            j5 = zzbdVar.zzd;
        }
        j6 = j5;
        j7 = j2;
        if (zzwkVar.zzb()) {
        }
        return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j7, j6, false, false, zzL, zzI, zzJ);
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j2) {
        long zzC;
        int zze;
        zzbd zzbdVar = this.zza;
        int i5 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i5) {
            zzln zzlnVar = this.zzi;
            while (true) {
                if (zzlnVar == null) {
                    zzln zzlnVar2 = this.zzi;
                    while (true) {
                        if (zzlnVar2 != null) {
                            int zze2 = zzbfVar.zze(zzlnVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i5) {
                                zzC = zzlnVar2.zzg.zza.zzd;
                                break;
                            }
                            zzlnVar2 = zzlnVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlnVar.zzb.equals(obj)) {
                        zzC = zzlnVar.zzg.zza.zzd;
                        break;
                    }
                    zzlnVar = zzlnVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j5 = zzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i6 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i6, zzbeVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j2, j5, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }
}
