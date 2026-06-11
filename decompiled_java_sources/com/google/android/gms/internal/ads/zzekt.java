package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
final class zzekt implements zzdmc {
    private final VersionInfoParcel zza;
    private final j3.a zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzfjk zze;
    private final zzbok zzf;
    private final boolean zzg;
    private final zzejf zzh;
    private final zzdxz zzi;

    public zzekt(VersionInfoParcel versionInfoParcel, j3.a aVar, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z4, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = versionInfoParcel;
        this.zzb = aVar;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzfjkVar;
        this.zzg = z4;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        zzcti zzctiVar = (zzcti) zzgzo.zzt(this.zzb);
        zzcjl zzcjlVar = this.zzd;
        zzcjlVar.zzag(true);
        boolean z5 = this.zzg;
        boolean zzc = z5 ? this.zzf.zzc(true) : true;
        boolean z6 = z5 && this.zzf.zzd();
        float zze = z5 ? this.zzf.zze() : 0.0f;
        zzfir zzfirVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z6, zze, -1, z4, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzj = zzctiVar.zzj();
        int i5 = zzfirVar.zzQ;
        if (i5 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar != null) {
                int i6 = zzxVar.zza;
                if (i6 == 1) {
                    i5 = 7;
                } else if (i6 == 2) {
                    i5 = 6;
                }
            }
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar, i5, versionInfoParcel, str, zzlVar, zzfiwVar.zzb, zzfiwVar.zza, this.zze.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzh : null, zzcjlVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzc;
    }
}
