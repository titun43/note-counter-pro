package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfjs implements zzgzl {
    final /* synthetic */ zzcjl zza;
    final /* synthetic */ zzcrv zzb;
    final /* synthetic */ zzfqk zzc;
    final /* synthetic */ zzeiu zzd;

    public zzfjs(zzcjl zzcjlVar, zzcrv zzcrvVar, zzfqk zzfqkVar, zzeiu zzeiuVar) {
        this.zza = zzcjlVar;
        this.zzb = zzcrvVar;
        this.zzc = zzfqkVar;
        this.zzd = zzeiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        zzcrv zzcrvVar;
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        zzfir zzC = zzcjlVar.zzC();
        if (zzC != null && !zzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzb) != null && zzcrv.zzc(str)) {
                zzcrvVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfiu zzaC = zzcjlVar.zzaC();
        if (zzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcjlVar.getContext());
        boolean z4 = false;
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhh)).booleanValue() && zzC != null && zzC.zzS;
        if (zzC != null && zzC.zzad != null) {
            z4 = true;
        }
        this.zzd.zze(new zzeiw(currentTimeMillis, zzaC.zzb, str, (zzs || z5 || z4) ? 2 : 1));
    }
}
