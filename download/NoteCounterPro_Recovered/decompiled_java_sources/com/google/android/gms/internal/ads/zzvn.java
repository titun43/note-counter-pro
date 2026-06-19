package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzvn implements zzyc {
    public final zzyc zza;
    final /* synthetic */ zzvo zzb;
    private boolean zzc;

    public zzvn(zzvo zzvoVar, zzyc zzycVar) {
        Objects.requireNonNull(zzvoVar);
        this.zzb = zzvoVar;
        this.zza = zzycVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i5) {
        zzvo zzvoVar = this.zzb;
        if (zzvoVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzihVar.zzg(4);
            return -4;
        }
        long zzi = zzvoVar.zzi();
        int zzd = this.zza.zzd(zzlhVar, zzihVar, i5);
        if (zzd != -5) {
            long j2 = zzvoVar.zzb;
            if (j2 == Long.MIN_VALUE || ((zzd != -4 || zzihVar.zze < j2) && !(zzd == -3 && zzi == Long.MIN_VALUE && !zzihVar.zzd))) {
                return zzd;
            }
            zzihVar.zza();
            zzihVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        int i6 = zzvVar.zzJ;
        if (i6 == 0) {
            if (zzvVar.zzK != 0) {
                i6 = 0;
            }
            return -5;
        }
        int i7 = zzvoVar.zzb == Long.MIN_VALUE ? zzvVar.zzK : 0;
        zzt zza = zzvVar.zza();
        zza.zzH(i6);
        zza.zzI(i7);
        zzlhVar.zzb = zza.zzM();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j2) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j2);
    }
}
