package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzyg extends zzbf {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzak zzf;
    private final zzaf zzg;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("SinglePeriodTimeline");
        zzzVar.zzb(Uri.EMPTY);
        zzzVar.zzc();
    }

    public zzyg(long j2, long j5, long j6, long j7, long j8, long j9, long j10, boolean z4, boolean z5, boolean z6, Object obj, zzak zzakVar, zzaf zzafVar) {
        this.zzc = j7;
        this.zzd = j8;
        this.zze = z4;
        zzakVar.getClass();
        this.zzf = zzakVar;
        this.zzg = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j2) {
        zzgrc.zzm(i5, 1, "index");
        boolean z4 = this.zze;
        zzbeVar.zza(zzbe.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z4, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z4) {
        zzgrc.zzm(i5, 1, "index");
        zzbdVar.zza(null, z4 ? zzb : null, 0, this.zzc, 0L, zzc.zza, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i5) {
        zzgrc.zzm(i5, 1, "index");
        return zzb;
    }
}
