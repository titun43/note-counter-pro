package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdzt implements zzdzi {
    private final long zza;
    private final zzerx zzb;

    public zzdzt(long j2, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j2;
        zzfgx zzn = zzcmaVar.zzn();
        zzn.zzd(context);
        zzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzn.zzc(str);
        zzerx zza = zzn.zza().zza();
        this.zzb = zza;
        zza.zzdR(new zzdzs(this, zzdzmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzb() {
        this.zzb.zzR(new a3.b(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
