package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzeyn implements zzfav {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzeyn(String str, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = z6;
        this.zze = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z4 = this.zzb;
        bundle.putInt("test_mode", z4 ? 1 : 0);
        boolean z5 = this.zzc;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z4 || z5) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkG)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkK)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z4 = this.zzb;
        bundle.putInt("test_mode", z4 ? 1 : 0);
        boolean z5 = this.zzc;
        bundle.putInt("linked_device", z5 ? 1 : 0);
        if (z4 || z5) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkK)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
