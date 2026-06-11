package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzapx implements zzaeu {
    private final int zza;
    private final List zzb;
    private final zzer zzc;
    private final SparseIntArray zzd;
    private final zzaqa zze;
    private final zzamd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapt zzj;
    private zzaps zzk;
    private zzaex zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzapx() {
        this(1, 1, zzamd.zza, new zzfg(0L), new zzaok(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzaev zzaevVar) {
        byte[] zzi = this.zzc.zzi();
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzi, 0, 940, false);
        int i5 = 0;
        while (i5 < 188) {
            for (int i6 = 0; i6 < 5; i6++) {
                if (zzi[(i6 * 188) + i5] != 71) {
                    break;
                }
            }
            zzaelVar.zze(i5, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zza == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzf);
        }
        this.zzl = zzaexVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        if (r3 == false) goto L96;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        long j2;
        long j5;
        long zzo = zzaevVar.zzo();
        if (this.zzn) {
            if (zzo != -1) {
                zzapt zzaptVar = this.zzj;
                if (!zzaptVar.zza()) {
                    return zzaptVar.zzb(zzaevVar, zzafvVar, this.zzr);
                }
            }
            if (this.zzo) {
                j2 = -1;
                j5 = 0;
            } else {
                this.zzo = true;
                zzapt zzaptVar2 = this.zzj;
                if (zzaptVar2.zzc() != -9223372036854775807L) {
                    j2 = -1;
                    j5 = 0;
                    zzaps zzapsVar = new zzaps(zzaptVar2.zzd(), zzaptVar2.zzc(), zzo, this.zzr, 112800);
                    this.zzk = zzapsVar;
                    this.zzl.zzw(zzapsVar.zza());
                } else {
                    j2 = -1;
                    j5 = 0;
                    this.zzl.zzw(new zzafx(zzaptVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j5, j5);
                if (zzaevVar.zzn() != j5) {
                    zzafvVar.zza = j5;
                    return 1;
                }
            }
            zzaps zzapsVar2 = this.zzk;
            if (zzapsVar2 != null && zzapsVar2.zzc()) {
                return zzapsVar2.zzd(zzaevVar, zzafvVar);
            }
        } else {
            j2 = -1;
        }
        zzer zzerVar = this.zzc;
        byte[] zzi = zzerVar.zzi();
        if (9400 - zzerVar.zzg() < 188) {
            int zzd = zzerVar.zzd();
            if (zzd > 0) {
                System.arraycopy(zzi, zzerVar.zzg(), zzi, 0, zzd);
            }
            zzerVar.zzb(zzi, zzd);
        }
        while (zzerVar.zzd() < 188) {
            int zze = zzerVar.zze();
            int zza = zzaevVar.zza(zzi, zze, 9400 - zze);
            if (zza == -1) {
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i5 >= sparseArray.size()) {
                        return -1;
                    }
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i5);
                    if (zzaqcVar instanceof zzapg) {
                        zzapg zzapgVar = (zzapg) zzaqcVar;
                        if (zzapgVar.zzd(false)) {
                            zzapgVar.zzc(new zzer(), 1);
                        }
                    }
                    i5++;
                }
            } else {
                zzerVar.zzf(zze + zza);
            }
        }
        int zzg = zzerVar.zzg();
        int zze2 = zzerVar.zze();
        int zza2 = zzaqd.zza(zzerVar.zzi(), zzg, zze2);
        zzerVar.zzh(zza2);
        int i6 = zza2 + 188;
        if (i6 > zze2) {
            this.zzq = (zza2 - zzg) + this.zzq;
        } else {
            this.zzq = 0;
        }
        int zze3 = zzerVar.zze();
        if (i6 > zze3) {
            return 0;
        }
        int zzB = zzerVar.zzB();
        if ((8388608 & zzB) != 0) {
            zzerVar.zzh(i6);
            return 0;
        }
        int i7 = (4194304 & zzB) != 0 ? 1 : 0;
        int i8 = zzB & 32;
        int i9 = (zzB >> 8) & 8191;
        zzaqc zzaqcVar2 = (zzB & 16) != 0 ? (zzaqc) this.zzg.get(i9) : null;
        if (zzaqcVar2 == null) {
            zzerVar.zzh(i6);
            return 0;
        }
        int i10 = zzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i11 = sparseIntArray.get(i9, i10 - 1);
        sparseIntArray.put(i9, i10);
        if (i11 == i10) {
            zzerVar.zzh(i6);
            return 0;
        }
        if (i10 != ((i11 + 1) & 15)) {
            zzaqcVar2.zzb();
        }
        if (i8 != 0) {
            int zzs = zzerVar.zzs();
            i7 |= (zzerVar.zzs() & 64) != 0 ? 2 : 0;
            zzerVar.zzk(zzs - 1);
        }
        boolean z4 = this.zzn;
        if (z4 || !this.zzi.get(i9, false)) {
            zzerVar.zzf(i6);
            zzaqcVar2.zzc(zzerVar, i7);
            zzerVar.zzf(zze3);
        }
        if (this.zzn && zzo != j2) {
            this.zzp = true;
        }
        zzerVar.zzh(i6);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        zzaps zzapsVar;
        List list = this.zzb;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzfg zzfgVar = (zzfg) list.get(i5);
            if (zzfgVar.zzc() != -9223372036854775807L) {
                long zza = zzfgVar.zza();
                if (zza != -9223372036854775807L) {
                    if (zza != 0) {
                        if (zza == j5) {
                        }
                    }
                }
            }
            zzfgVar.zzd(j5);
        }
        if (j5 != 0 && (zzapsVar = this.zzk) != null) {
            zzapsVar.zzb(j5);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i6 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzaqc) sparseArray.valueAt(i6)).zzb();
                i6++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final /* synthetic */ List zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzaqa zzi() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    public final /* synthetic */ zzaex zzm() {
        return this.zzl;
    }

    public final /* synthetic */ int zzn() {
        return this.zzm;
    }

    public final /* synthetic */ void zzo(int i5) {
        this.zzm = i5;
    }

    public final /* synthetic */ void zzp(boolean z4) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzq(int i5) {
        this.zzr = i5;
    }

    public zzapx(int i5, int i6, zzamd zzamdVar, zzfg zzfgVar, zzaqa zzaqaVar, int i7) {
        this.zze = zzaqaVar;
        this.zza = i6;
        this.zzf = zzamdVar;
        this.zzb = Collections.singletonList(zzfgVar);
        this.zzc = new zzer(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapt(112800);
        this.zzl = zzaex.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaqaVar.zza();
        int size = zza.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.zzg.put(zza.keyAt(i8), (zzaqc) zza.valueAt(i8));
        }
        this.zzg.put(0, new zzapo(new zzapu(this)));
    }
}
