package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcch {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcch(x2.b bVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzccq zzccqVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i5, long j2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzba)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zza;
        if (j2 - zzgVar.zzF() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbb)).booleanValue()) {
            zzgVar.zzE(i5);
            zzgVar.zzG(j2);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j2);
        }
    }
}
