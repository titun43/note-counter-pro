package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzmp {
    private final zzml zza;
    private final int zzb;
    private final zzml zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmp(zzml zzmlVar, zzml zzmlVar2, int i5) {
        this.zza = zzmlVar;
        this.zzb = i5;
        this.zzc = zzmlVar2;
    }

    private final boolean zzN() {
        int i5 = this.zzd;
        return i5 == 2 || i5 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzln zzlnVar, zzml zzmlVar) {
        if (zzmlVar == null) {
            return true;
        }
        zzyc[] zzycVarArr = zzlnVar.zzc;
        int i5 = this.zzb;
        zzyc zzycVar = zzycVarArr[i5];
        if (zzmlVar.zzcV() != null) {
            if (zzmlVar.zzcV() == zzycVar) {
                if (zzycVar != null && !zzmlVar.zzcW()) {
                    zzlnVar.zzp();
                    boolean z4 = zzlnVar.zzg.zzg;
                }
            }
            zzln zzp = zzlnVar.zzp();
            return zzp != null && zzp.zzc[i5] == zzmlVar.zzcV();
        }
        return true;
    }

    private final void zzQ(boolean z4) {
        if (z4) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzx(17, this.zza);
        } else {
            zzml zzmlVar2 = this.zza;
            zzml zzmlVar3 = this.zzc;
            zzmlVar3.getClass();
            zzmlVar2.zzx(17, zzmlVar3);
        }
    }

    private final void zzR(zzml zzmlVar, zzyc zzycVar, zziu zziuVar, long j2, boolean z4) {
        if (zzW(zzmlVar)) {
            if (zzycVar != zzmlVar.zzcV()) {
                zzS(zzmlVar, zziuVar);
            } else if (z4) {
                zzmlVar.zzp(j2, true);
            }
        }
    }

    private final void zzS(zzml zzmlVar, zziu zziuVar) {
        boolean z4 = true;
        if (this.zza != zzmlVar && this.zzc != zzmlVar) {
            z4 = false;
        }
        zzgrc.zzi(z4);
        if (zzW(zzmlVar)) {
            zziuVar.zze(zzmlVar);
            zzY(zzmlVar);
            zzmlVar.zzr();
        }
    }

    private final void zzT(boolean z4) {
        if (z4) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzml zzmlVar, zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) {
        if (zzmlVar != null && zzW(zzmlVar)) {
            zzml zzmlVar2 = this.zza;
            boolean z4 = zzmlVar != zzmlVar2;
            if ((zzmlVar != zzmlVar2 || !zzN()) && (zzmlVar != this.zzc || !zzO())) {
                zzyc zzcV = zzmlVar.zzcV();
                zzyc[] zzycVarArr = zzlnVar.zzc;
                int i5 = this.zzb;
                zzyc zzycVar = zzycVarArr[i5];
                boolean zza = zzaakVar.zza(i5);
                if (zza && zzcV == zzycVar) {
                    return 1;
                }
                if (!zzmlVar.zzm()) {
                    zzv[] zzV = zzV(zzaakVar.zzc[i5]);
                    zzyc zzycVar2 = zzycVarArr[i5];
                    zzycVar2.getClass();
                    zzmlVar.zzcU(zzV, zzycVar2, zzlnVar.zzc(), zzlnVar.zza(), zzlnVar.zzg.zza);
                    return 3;
                }
                if (!zzmlVar.zzZ()) {
                    return 0;
                }
                zzS(zzmlVar, zziuVar);
                if (!zza || zzc()) {
                    zzT(!z4);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzaac zzaacVar) {
        int zze = zzaacVar != null ? zzaacVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[zze];
        for (int i5 = 0; i5 < zze; i5++) {
            zzaacVar.getClass();
            zzvVarArr[i5] = zzaacVar.zzb(i5);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzml zzmlVar) {
        return zzmlVar.zze() != 0;
    }

    private final zzml zzX(zzln zzlnVar) {
        if (zzlnVar != null) {
            int i5 = this.zzb;
            zzyc[] zzycVarArr = zzlnVar.zzc;
            if (zzycVarArr[i5] != null) {
                zzml zzmlVar = this.zza;
                zzyc zzcV = zzmlVar.zzcV();
                zzyc zzycVar = zzycVarArr[i5];
                if (zzcV == zzycVar) {
                    return zzmlVar;
                }
                zzml zzmlVar2 = this.zzc;
                if (zzmlVar2 != null && zzmlVar2.zzcV() == zzycVar) {
                    return zzmlVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzml zzmlVar) {
        if (zzmlVar.zze() == 2) {
            zzmlVar.zzq();
        }
    }

    private static final void zzZ(zzml zzmlVar, long j2) {
        zzmlVar.zzl();
        if (zzmlVar instanceof zzyr) {
            throw null;
        }
    }

    public final void zzA(zziu zziuVar) {
        zzS(this.zza, zziuVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            boolean z4 = zzW(zzmlVar) && this.zzd != 3;
            zzS(zzmlVar, zziuVar);
            zzT(false);
            if (z4) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() {
        int i5 = this.zzd;
        if (i5 == 3 || i5 == 4) {
            zzQ(i5 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i5 == 2) {
            this.zzd = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzC(zziu zziuVar) {
        boolean z4;
        zzml zzmlVar;
        if (zzc()) {
            int i5 = this.zzd;
            if (i5 != 4) {
                if (i5 != 2) {
                    z4 = false;
                    if (z4) {
                        zzmlVar = this.zzc;
                        zzmlVar.getClass();
                    } else {
                        zzmlVar = this.zza;
                    }
                    zzS(zzmlVar, zziuVar);
                    zzT(z4);
                    this.zzd = i5 == 4 ? 1 : 0;
                }
                i5 = 2;
            }
            z4 = true;
            if (z4) {
            }
            zzS(zzmlVar, zziuVar);
            zzT(z4);
            this.zzd = i5 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzyc zzycVar, zziu zziuVar, long j2, boolean z4) {
        zzR(this.zza, zzycVar, zziuVar, j2, z4);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzR(zzmlVar, zzycVar, zziuVar, j2, z4);
        }
    }

    public final void zzE(zzln zzlnVar, long j2, boolean z4) {
        zzml zzX = zzX(zzlnVar);
        if (zzX != null) {
            zzX.zzp(j2, z4);
        }
    }

    public final boolean zzF(zzln zzlnVar, long j2) {
        zzml zzX = zzX(zzlnVar);
        return zzX != null && zzX.zzU(j2);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzW(zzmlVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) {
        int zzU = zzU(this.zza, zzlnVar, zzaakVar, zziuVar);
        return zzU == 1 ? zzU(this.zzc, zzlnVar, zzaakVar, zziuVar) : zzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) {
        if (zze() != 2) {
            return;
        }
        int i5 = this.zzd;
        if (i5 != 4 && i5 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        zzmlVar.zzx(1, obj);
    }

    public final void zzK(zzacp zzacpVar) {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzacpVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(7, zzacpVar);
        }
    }

    public final void zzL(float f5) {
        if (zze() != 1) {
            return;
        }
        zzml zzmlVar = this.zza;
        Float valueOf = Float.valueOf(f5);
        zzmlVar.zzx(2, valueOf);
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 != null) {
            zzmlVar2.zzx(2, valueOf);
        }
    }

    public final boolean zzM() {
        int i5 = this.zzd;
        if (i5 == 0 || i5 == 2 || i5 == 4) {
            return zzW(this.zza);
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        return zzW(zzmlVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i5;
        zzgrc.zzi(!zzc());
        if (zzW(this.zza)) {
            i5 = 3;
        } else {
            zzml zzmlVar = this.zzc;
            i5 = (zzmlVar == null || !zzW(zzmlVar)) ? 2 : 4;
        }
        this.zzd = i5;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzml zzmlVar = this.zzc;
        boolean zzW = zzW(this.zza);
        int i5 = 0;
        if (zzmlVar != null && zzW(zzmlVar)) {
            i5 = 1;
        }
        return (zzW ? 1 : 0) + i5;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        Objects.requireNonNull(zzX);
        return zzX.zzk();
    }

    public final boolean zzg(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        return zzX.zzcW();
    }

    public final void zzh(zzln zzlnVar, long j2) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzZ(zzX, j2);
    }

    public final void zzi(zzaak zzaakVar, zzaak zzaakVar2, long j2) {
        int i5;
        int i6 = this.zzb;
        boolean zza = zzaakVar.zza(i6);
        boolean zza2 = zzaakVar2.zza(i6);
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || (i5 = this.zzd) == 3 || (i5 == 0 && zzW(this.zza))) {
            zzmlVar = this.zza;
        }
        if (!zza || zzmlVar.zzm()) {
            return;
        }
        zze();
        zzmo zzmoVar = zzaakVar.zzb[i6];
        zzmo zzmoVar2 = zzaakVar2.zzb[i6];
        if (zza2 && Objects.equals(zzmoVar2, zzmoVar) && !zzc()) {
            return;
        }
        zzZ(zzmlVar, j2);
    }

    public final void zzj(long j2) {
        int i5;
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar) && (i5 = this.zzd) != 4 && i5 != 2) {
            zzZ(zzmlVar, j2);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmlVar2, j2);
    }

    public final long zzk(long j2, long j5) {
        zzml zzmlVar = this.zza;
        long zzT = zzW(zzmlVar) ? zzmlVar.zzT(j2, j5) : Long.MAX_VALUE;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zzT : Math.min(zzT, zzmlVar2.zzT(j2, j5));
    }

    public final void zzl() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzW();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzW();
    }

    public final void zzm(float f5, float f6) {
        this.zza.zzV(f5, f6);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzV(f5, f6);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzml zzmlVar = this.zza;
        boolean zzZ = zzW(zzmlVar) ? zzmlVar.zzZ() : true;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zzZ : zzZ & zzmlVar2.zzZ();
    }

    public final boolean zzp(zzln zzlnVar) {
        return zzX(zzlnVar) != null;
    }

    public final boolean zzq(zzln zzlnVar) {
        return (zzN() && zzX(zzlnVar) == this.zza) || (zzO() && zzX(zzlnVar) == this.zzc);
    }

    public final boolean zzr(zzln zzlnVar) {
        return zzP(zzlnVar, this.zza) && zzP(zzlnVar, this.zzc);
    }

    public final void zzs(long j2, long j5) {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzX(j2, j5);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzX(j2, j5);
    }

    public final boolean zzt(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        return zzX == null || zzX.zzcW() || zzX.zzY() || zzX.zzZ();
    }

    public final void zzu(zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzX.zzn();
    }

    public final void zzv() {
        zzml zzmlVar = this.zza;
        if (zzmlVar.zze() == 1 && this.zzd != 4) {
            zzmlVar.zzcT();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || zzmlVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmlVar2.zzcT();
    }

    public final void zzw() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzY(zzmlVar);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzY(zzmlVar2);
    }

    public final void zzx(zzmo zzmoVar, zzaac zzaacVar, zzyc zzycVar, long j2, boolean z4, boolean z5, long j5, long j6, zzwk zzwkVar, zziu zziuVar) {
        zzv[] zzV = zzV(zzaacVar);
        int i5 = this.zzd;
        if (i5 == 0 || i5 == 2 || i5 == 4) {
            this.zze = true;
            zzml zzmlVar = this.zza;
            zzmlVar.zzf(zzmoVar, zzV, zzycVar, j2, z4, z5, j5, j6, zzwkVar);
            zziuVar.zzd(zzmlVar);
            return;
        }
        this.zzf = true;
        zzml zzmlVar2 = this.zzc;
        zzmlVar2.getClass();
        zzmlVar2.zzf(zzmoVar, zzV, zzycVar, j2, z4, z5, j5, j6, zzwkVar);
        zziuVar.zzd(zzmlVar2);
    }

    public final void zzy(int i5, Object obj, zzln zzlnVar) {
        zzml zzX = zzX(zzlnVar);
        zzX.getClass();
        zzX.zzx(11, obj);
    }

    public final void zzz(zzms zzmsVar) {
        this.zza.zzx(18, zzmsVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(18, zzmsVar);
        }
    }
}
