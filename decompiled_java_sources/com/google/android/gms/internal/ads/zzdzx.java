package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdzx implements zzdzi {
    private final long zza;
    private final zzdzm zzb;
    private final zzfii zzc;

    public zzdzx(long j2, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j2;
        this.zzb = zzdzmVar;
        zzfik zzq = zzcmaVar.zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        this.zzc = zzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdzv(this));
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzb() {
        try {
            zzfii zzfiiVar = this.zzc;
            zzfiiVar.zze(new zzdzw(this));
            zzfiiVar.zzb(new a3.b(null));
        } catch (RemoteException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdzm zze() {
        return this.zzb;
    }
}
