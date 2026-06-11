package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzaci implements zzadr {
    final /* synthetic */ zzaco zza;
    private zzguf zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzaci(zzaco zzacoVar, Context context, int i5) {
        Objects.requireNonNull(zzacoVar);
        this.zza = zzacoVar;
        zzfj.zzR(context);
        this.zzb = zzguf.zzi();
        this.zze = -9223372036854775807L;
        zzado zzadoVar = zzado.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzi zzC;
        zzt zza = zzvVar.zza();
        zzC = zzaco.zzC(zzvVar.zzE);
        zza.zzC(zzC);
        zza.zzM();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzb() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzc(zzado zzadoVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzd(zzv zzvVar) {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzg(boolean z4) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzh(boolean z4) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzi() {
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(this.zze);
        if (zzacoVar.zzy() >= zzacoVar.zzz()) {
            zzacoVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final Surface zzk() {
        zzgrc.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzl(zzacp zzacpVar) {
        this.zza.zzp(zzacpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzm(float f5) {
        this.zza.zzq(f5);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzguf.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(long j2) {
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzp(Surface surface, zzes zzesVar) {
        this.zza.zzc(surface, zzesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzr(int i5) {
        this.zza.zzr(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzs(int i5, zzv zzvVar, long j2, int i6, List list) {
        zzgrc.zzi(false);
        this.zzb = zzguf.zzq(list);
        this.zzc = zzvVar;
        zzaco zzacoVar = this.zza;
        zzacoVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j5 = this.zze;
        long j6 = -4611686018427387904L;
        if (zzacoVar.zzt()) {
            if (j5 != -9223372036854775807L) {
                j6 = j5 + 1;
            }
        } else if (j5 != -9223372036854775807L) {
            return;
        }
        long j7 = j6;
        zzacoVar.zzw().zza(j7, new zzacn(j2 + this.zzd, i6, j7));
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzt() {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzw().zzc() == 0) {
            zzacoVar.zzo();
            return;
        }
        zzff zzffVar = new zzff(10);
        boolean z4 = true;
        while (zzacoVar.zzw().zzc() > 0) {
            zzacn zzacnVar = (zzacn) zzacoVar.zzw().zzd();
            zzacnVar.getClass();
            if (z4) {
                int i5 = zzacnVar.zzb;
                if (i5 == 0 || i5 == 1) {
                    zzacnVar = new zzacn(zzacnVar.zza, 0, zzacnVar.zzc);
                } else {
                    zzacoVar.zzo();
                }
            }
            zzffVar.zza(zzacnVar.zzc, zzacnVar);
            z4 = false;
        }
        zzacoVar.zzx(zzffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean zzu(long j2, zzadp zzadpVar) {
        int i5;
        zzgrc.zzi(false);
        long j5 = j2 + this.zzd;
        zzaco zzacoVar = this.zza;
        long zzb = zzacoVar.zzv().zzb(j5);
        if (zzb == -9223372036854775807L || zzacoVar.zzu() == -9223372036854775807L || zzb >= zzacoVar.zzu() || (i5 = this.zzf) >= 2) {
            if (zzacoVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i5 + 1;
        zzadpVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzv(long j2, long j5) {
        this.zza.zzl(j2 + this.zzd, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzw(boolean z4) {
        zzaco zzacoVar = this.zza;
        if (zzacoVar.zzt()) {
            zzacoVar.zzn(z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzx() {
        this.zza.zzg();
    }
}
