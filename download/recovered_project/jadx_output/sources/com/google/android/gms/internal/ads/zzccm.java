package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzccm extends zzccr {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    final zzikp zzh;
    private final x2.b zzj;

    public zzccm(Context context, x2.b bVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzccq zzccqVar) {
        this.zzj = bVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = zzikf.zza(zzccg.zza(zza, zza2));
        zzikg zza3 = zzikh.zza(bVar);
        this.zzd = zza3;
        zzikg zza4 = zzikh.zza(zzccqVar);
        this.zze = zza4;
        zzikp zza5 = zzikf.zza(zzcci.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        zzcck zzc = zzcck.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = zzikf.zza(zzccx.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final zzccj zza() {
        return new zzccj(this.zzj, (zzcch) this.zzf.zzb());
    }
}
