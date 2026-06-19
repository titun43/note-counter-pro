package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
final class zzeop implements zzdmc {
    private final Context zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;
    private final zzfir zze;
    private final j3.a zzf;
    private final zzcjl zzg;
    private final zzbok zzh;
    private final boolean zzi;
    private final zzejf zzj;
    private final zzdxt zzk;
    private final zzdxz zzl;

    public zzeop(Context context, zzduv zzduvVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, j3.a aVar, zzcjl zzcjlVar, zzbok zzbokVar, boolean z4, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfirVar;
        this.zzf = aVar;
        this.zzg = zzcjlVar;
        this.zzh = zzbokVar;
        this.zzi = z4;
        this.zzj = zzejfVar;
        this.zzk = zzdxtVar;
        this.zzl = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        zzdua zzduaVar = (zzdua) zzgzo.zzt(this.zzf);
        try {
            zzfir zzfirVar = this.zze;
            final zzcjl zzcjlVar = this.zzg;
            if (zzcjlVar.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbt)).booleanValue()) {
                    zzcjlVar = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbpa.zzb(zzcjlVar, zzduaVar.zzk());
                    final zzduz zzduzVar = new zzduz();
                    zzduaVar.zzl().zzi(zzcjlVar, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcjlVar.zzP().zzG(new zzclh(zzduzVar, zzcjlVar) { // from class: com.google.android.gms.internal.ads.zzeoo
                        private final /* synthetic */ zzcjl zza;

                        {
                            this.zza = zzcjlVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzclh
                        public final /* synthetic */ void zza(boolean z5, int i5, String str, String str2) {
                            zzcjl zzcjlVar2 = this.zza;
                            zzcjlVar2.zzJ();
                            zzcjlVar2.zzP().zzq();
                        }
                    });
                    zzcjlVar.zzP().zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzeon
                        @Override // com.google.android.gms.internal.ads.zzcli
                        public final /* synthetic */ void zza() {
                            zzcjl.this.zzI();
                        }
                    });
                    zzfiw zzfiwVar = zzfirVar.zzs;
                    zzcjlVar.zzau(zzfiwVar.zzb, zzfiwVar.zza, null);
                }
            }
            zzcjl zzcjlVar2 = zzcjlVar;
            zzcjlVar2.zzag(true);
            boolean z5 = this.zzi;
            boolean z6 = false;
            boolean zzc = z5 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
            if (z5 && this.zzh.zzd()) {
                z6 = true;
            }
            float zze = z5 ? this.zzh.zze() : 0.0f;
            zzfir zzfirVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzN, z6, zze, -1, z4, zzfirVar2.zzO, zzfirVar2.zzP);
            if (zzdbsVar != null) {
                zzdbsVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdlr zzj = zzduaVar.zzj();
            int i5 = zzfirVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfirVar2.zzB;
            zzfiw zzfiwVar2 = zzfirVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar2, i5, versionInfoParcel, str, zzlVar, zzfiwVar2.zzb, zzfiwVar2.zza, this.zzc.zzg, zzdbsVar, zzfirVar2.zzb() ? this.zzj : null, zzcjlVar2.zzn()), true, this.zzl);
        } catch (zzcka e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zze;
    }
}
