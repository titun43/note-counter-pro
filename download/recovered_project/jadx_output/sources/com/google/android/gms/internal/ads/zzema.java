package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
final class zzema implements zzdmc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final j3.a zzc;
    private final zzfir zzd;
    private final zzcjl zze;
    private final zzfjk zzf;
    private final zzbok zzg;
    private final boolean zzh;
    private final zzejf zzi;
    private final zzdxz zzj;

    public zzema(Context context, VersionInfoParcel versionInfoParcel, j3.a aVar, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z4, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = aVar;
        this.zzd = zzfirVar;
        this.zze = zzcjlVar;
        this.zzf = zzfjkVar;
        this.zzg = zzbokVar;
        this.zzh = z4;
        this.zzi = zzejfVar;
        this.zzj = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        zzdko zzdkoVar = (zzdko) zzgzo.zzt(this.zzc);
        zzcjl zzcjlVar = this.zze;
        zzcjlVar.zzag(true);
        boolean z5 = this.zzh;
        boolean zzc = z5 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
        boolean z6 = z5 && this.zzg.zzd();
        float zze = z5 ? this.zzg.zze() : 0.0f;
        zzfir zzfirVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzN, z6, zze, -1, z4, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzj = zzdkoVar.zzj();
        int i5 = zzfirVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar, i5, versionInfoParcel, str, zzlVar, zzfiwVar.zzb, zzfiwVar.zza, this.zzf.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzi : null, zzcjlVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzd;
    }
}
