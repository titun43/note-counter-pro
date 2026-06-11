package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;
    private final zzto zzd;
    private final zztj zze;
    private zzya zzf;
    private zzv zzg;
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = zzbgj.zzq.zzf;
    private long[] zzj = new long[zzbgj.zzq.zzf];
    private long[] zzk = new long[zzbgj.zzq.zzf];
    private long[] zzn = new long[zzbgj.zzq.zzf];
    private int[] zzm = new int[zzbgj.zzq.zzf];
    private int[] zzl = new int[zzbgj.zzq.zzf];
    private zzagg[] zzo = new zzagg[zzbgj.zzq.zzf];
    private final zzyi zzc = new zzyi(zzxy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    public zzyb(zzaan zzaanVar, zzto zztoVar, zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z4, boolean z5, zzxx zzxxVar) {
        try {
            zzihVar.zzd = false;
            if (!zzH()) {
                if (!z5 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z4 && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzlhVar);
                    return -5;
                }
                zzihVar.zzg(4);
                zzihVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z4 && zzvVar2 == this.zzg) {
                int zzM = zzM(this.zzs);
                if (!zzJ(zzM)) {
                    zzihVar.zzd = true;
                    return -3;
                }
                zzihVar.zzg(this.zzm[zzM]);
                if (this.zzs == this.zzp - 1 && (z5 || this.zzw)) {
                    zzihVar.zzh(536870912);
                }
                zzihVar.zze = this.zzn[zzM];
                zzxxVar.zza = this.zzl[zzM];
                zzxxVar.zzb = this.zzk[zzM];
                zzxxVar.zzc = this.zzo[zzM];
                return -4;
            }
            zzI(zzvVar2, zzlhVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
                this.zzz = zzvVar;
            } else {
                this.zzz = ((zzxz) zzyiVar.zzc()).zza;
            }
            boolean z4 = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z4 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzD(long j2, boolean z4, boolean z5) {
        Throwable th;
        try {
            try {
                int i5 = this.zzp;
                if (i5 != 0) {
                    long[] jArr = this.zzn;
                    int i6 = this.zzr;
                    if (j2 >= jArr[i6]) {
                        if (z5) {
                            try {
                                int i7 = this.zzs;
                                if (i7 != i5) {
                                    i5 = i7 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int zzK = zzK(i6, i5, j2, false);
                        if (zzK != -1) {
                            return zzL(zzK);
                        }
                        return -1L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i5 = this.zzp;
        if (i5 == 0) {
            return -1L;
        }
        return zzL(i5);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j2, int i5, long j5, int i6, zzagg zzaggVar) {
        try {
            int i7 = this.zzp;
            if (i7 > 0) {
                int zzM = zzM(i7 - 1);
                zzgrc.zza(this.zzk[zzM] + ((long) this.zzl[zzM]) <= j5);
            }
            this.zzw = (536870912 & i5) != 0;
            this.zzv = Math.max(this.zzv, j2);
            int zzM2 = zzM(this.zzp);
            this.zzn[zzM2] = j2;
            this.zzk[zzM2] = j5;
            this.zzl[zzM2] = i6;
            this.zzm[zzM2] = i5;
            this.zzo[zzM2] = zzaggVar;
            this.zzj[zzM2] = 0;
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null) {
                    throw null;
                }
                zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
            }
            int i8 = this.zzp + 1;
            this.zzp = i8;
            int i9 = this.zzi;
            if (i8 == i9) {
                int i10 = i9 + zzbgj.zzq.zzf;
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                long[] jArr3 = new long[i10];
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                zzagg[] zzaggVarArr = new zzagg[i10];
                int i11 = this.zzr;
                int i12 = i9 - i11;
                System.arraycopy(this.zzk, i11, jArr2, 0, i12);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i12);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i12);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i12);
                System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i12);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i12);
                int i13 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i12, i13);
                System.arraycopy(this.zzn, 0, jArr3, i12, i13);
                System.arraycopy(this.zzm, 0, iArr, i12, i13);
                System.arraycopy(this.zzl, 0, iArr2, i12, i13);
                System.arraycopy(this.zzo, 0, zzaggVarArr, i12, i13);
                System.arraycopy(this.zzj, 0, jArr, i12, i13);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaggVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zza;
            zzlhVar.zza = zza;
        }
    }

    private final boolean zzJ(int i5) {
        if (this.zzh == null) {
            return true;
        }
        int i6 = this.zzm[i5];
        return false;
    }

    private final int zzK(int i5, int i6, long j2, boolean z4) {
        int i7 = -1;
        for (int i8 = 0; i8 < i6; i8++) {
            long j5 = this.zzn[i5];
            if (j5 > j2) {
                break;
            }
            if (!z4 || (this.zzm[i5] & 1) != 0) {
                if (j5 == j2) {
                    return i8;
                }
                i7 = i8;
            }
            i5++;
            if (i5 == this.zzi) {
                i5 = 0;
            }
        }
        return i7;
    }

    private final long zzL(int i5) {
        long j2 = this.zzu;
        long j5 = Long.MIN_VALUE;
        if (i5 != 0) {
            int zzM = zzM(i5 - 1);
            for (int i6 = 0; i6 < i5; i6++) {
                j5 = Math.max(j5, this.zzn[zzM]);
                if ((this.zzm[zzM] & 1) != 0) {
                    break;
                }
                zzM--;
                if (zzM == -1) {
                    zzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j2, j5);
        this.zzp -= i5;
        int i7 = this.zzq + i5;
        this.zzq = i7;
        int i8 = this.zzr + i5;
        this.zzr = i8;
        int i9 = this.zzi;
        if (i8 >= i9) {
            this.zzr = i8 - i9;
        }
        int i10 = this.zzs - i5;
        this.zzs = i10;
        if (i10 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i7);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i11 = this.zzr;
        if (i11 == 0) {
            i11 = this.zzi;
        }
        return this.zzk[i11 - 1] + this.zzl[r12];
    }

    private final int zzM(int i5) {
        int i6 = this.zzr + i5;
        int i7 = this.zzi;
        return i6 < i7 ? i6 : i6 - i7;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i5, boolean z4, int i6) {
        return this.zza.zzg(zzjVar, i5, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i5, int i6) {
        this.zza.zzh(zzerVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i5, int i6, int i7, zzagg zzaggVar) {
        if (this.zzx) {
            if ((i5 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j2 < this.zzt) {
                return;
            }
            if ((i5 & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i5 |= 1;
            }
        }
        zzG(j2, i5, (this.zza.zzf() - i6) - i7, i6, zzaggVar);
    }

    public final void zzf() {
        zzg(true);
        zzF();
    }

    public final void zzg(boolean z4) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z4) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzh(long j2) {
        this.zzt = j2;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    public final void zzj() {
        zzx();
        zzF();
    }

    public final void zzk() {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq(boolean z4) {
        boolean z5 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z4 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z5 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z5;
    }

    public final int zzr(zzlh zzlhVar, zzih zzihVar, int i5, boolean z4) {
        boolean z5 = (i5 & 2) != 0;
        zzxx zzxxVar = this.zzb;
        int zzB = zzB(zzlhVar, zzihVar, z5, z4, zzxxVar);
        if (zzB != -4) {
            return zzB;
        }
        if (!zzihVar.zzb()) {
            int i6 = i5 & 1;
            if ((i5 & 4) == 0) {
                if (i6 != 0) {
                    this.zza.zzd(zzihVar, zzxxVar);
                    return -4;
                }
                this.zza.zzc(zzihVar, zzxxVar);
            } else if (i6 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzs(int i5) {
        zzA();
        int i6 = this.zzq;
        if (i5 >= i6 && i5 <= this.zzp + i6) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i5 - i6;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzt(long j2, boolean z4) {
        Throwable th;
        zzyb zzybVar;
        long j5;
        int i5;
        try {
            try {
                zzA();
                int i6 = this.zzs;
                int zzM = zzM(i6);
                if (zzH() && j2 >= this.zzn[zzM]) {
                    if (j2 > this.zzv) {
                        if (z4) {
                            z4 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i7 = this.zzp - i6;
                            int i8 = 0;
                            while (true) {
                                if (i8 < i7) {
                                    if (this.zzn[zzM] >= j2) {
                                        zzybVar = this;
                                        j5 = j2;
                                        i5 = i8;
                                        break;
                                    }
                                    zzM++;
                                    if (zzM == this.zzi) {
                                        zzM = 0;
                                    }
                                    i8++;
                                } else if (z4) {
                                    j5 = j2;
                                    i5 = i7;
                                    zzybVar = this;
                                } else {
                                    zzybVar = this;
                                    j5 = j2;
                                    i5 = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzybVar = this;
                        j5 = j2;
                        i5 = zzybVar.zzK(zzM, this.zzp - i6, j5, true);
                    }
                    if (i5 == -1) {
                        return false;
                    }
                    zzybVar.zzt = j5;
                    zzybVar.zzs += i5;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzu(long j2, boolean z4) {
        Throwable th;
        try {
            try {
                int i5 = this.zzs;
                int zzM = zzM(i5);
                if (!zzH() || j2 < this.zzn[zzM]) {
                    return 0;
                }
                if (j2 <= this.zzv || !z4) {
                    int zzK = zzK(zzM, this.zzp - i5, j2, true);
                    if (zzK == -1) {
                        return 0;
                    }
                    return zzK;
                }
                try {
                    return this.zzp - i5;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void zzv(int i5) {
        boolean z4 = false;
        if (i5 >= 0) {
            try {
                if (this.zzs + i5 <= this.zzp) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgrc.zza(z4);
        this.zzs += i5;
    }

    public final void zzw(long j2, boolean z4, boolean z5) {
        this.zza.zze(zzD(j2, false, z5));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    public final void zzy(zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar == null || !zzC) {
            return;
        }
        zzyaVar.zzy(zzvVar);
    }
}
