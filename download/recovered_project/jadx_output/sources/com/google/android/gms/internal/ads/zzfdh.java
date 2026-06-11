package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfdh implements zzikg {
    private final zzfdc zza;

    private zzfdh(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    public static zzfdh zzc(zzfdc zzfdcVar) {
        return new zzfdh(zzfdcVar);
    }

    public static String zzd(zzfdc zzfdcVar) {
        String zze = zzfdcVar.zze();
        zziko.zzb(zze);
        return zze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
