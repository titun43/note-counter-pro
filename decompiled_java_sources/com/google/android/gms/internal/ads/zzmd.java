package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
final class zzmd {
    private static final zzwk zzu = new zzwk(new Object(), -1);
    public final zzbf zza;
    public final zzwk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zziw zzf;
    public final boolean zzg;
    public final zzyn zzh;
    public final zzaak zzi;
    public final List zzj;
    public final zzwk zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmd(zzbf zzbfVar, zzwk zzwkVar, long j2, long j5, int i5, zziw zziwVar, boolean z4, zzyn zzynVar, zzaak zzaakVar, List list, zzwk zzwkVar2, boolean z5, int i6, int i7, zzav zzavVar, long j6, long j7, long j8, long j9, boolean z6) {
        this.zza = zzbfVar;
        this.zzb = zzwkVar;
        this.zzc = j2;
        this.zzd = j5;
        this.zze = i5;
        this.zzf = zziwVar;
        this.zzg = z4;
        this.zzh = zzynVar;
        this.zzi = zzaakVar;
        this.zzj = list;
        this.zzk = zzwkVar2;
        this.zzl = z5;
        this.zzm = i6;
        this.zzn = i7;
        this.zzo = zzavVar;
        this.zzq = j6;
        this.zzr = j7;
        this.zzs = j8;
        this.zzt = j9;
    }

    public static zzmd zza(zzaak zzaakVar) {
        zzbf zzbfVar = zzbf.zza;
        zzwk zzwkVar = zzu;
        return new zzmd(zzbfVar, zzwkVar, -9223372036854775807L, 0L, 1, null, false, zzyn.zza, zzaakVar, zzguf.zzi(), zzwkVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzwk zzb() {
        return zzu;
    }

    public final zzmd zzc(zzwk zzwkVar, long j2, long j5, long j6, long j7, zzyn zzynVar, zzaak zzaakVar, List list) {
        zzwk zzwkVar2 = this.zzk;
        boolean z4 = this.zzl;
        int i5 = this.zzm;
        int i6 = this.zzn;
        zzav zzavVar = this.zzo;
        long j8 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmd(this.zza, zzwkVar, j5, j6, this.zze, this.zzf, this.zzg, zzynVar, zzaakVar, list, zzwkVar2, z4, i5, i6, zzavVar, j8, j7, j2, elapsedRealtime, false);
    }

    public final zzmd zzd(zzbf zzbfVar) {
        return new zzmd(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zze(int i5) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, i5, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzf(zziw zziwVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziwVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzg(boolean z4) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z4, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzh(zzwk zzwkVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzwkVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmd zzi(boolean z4, int i5, int i6) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z4, i5, i6, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
