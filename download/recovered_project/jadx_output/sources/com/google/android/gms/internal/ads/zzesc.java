package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzesc {
    private final zzdor zza;
    private final zzerp zzb;
    private final zzdbi zzc;

    public zzesc(zzdor zzdorVar, zzdxz zzdxzVar) {
        this.zza = zzdorVar;
        final zzerp zzerpVar = new zzerp(zzdxzVar);
        this.zzb = zzerpVar;
        final zzbrb zze = zzdorVar.zze();
        this.zzc = new zzdbi() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final /* synthetic */ void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzerp.this.zzdI(zzeVar);
                zzbrb zzbrbVar = zze;
                if (zzbrbVar != null) {
                    try {
                        zzbrbVar.zzg(zzeVar);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (zzbrbVar != null) {
                    try {
                        zzbrbVar.zzf(zzeVar.zza);
                    } catch (RemoteException e5) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzb.zzl(zzbkVar);
    }

    public final zzdml zzb() {
        return new zzdml(this.zza, this.zzb.zzi());
    }

    public final zzerp zzc() {
        return this.zzb;
    }

    public final zzdct zzd() {
        return this.zzb;
    }

    public final zzdbi zze() {
        return this.zzc;
    }
}
