package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbfy implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbfz zzb;

    public zzbfy(zzbfz zzbfzVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzb = zzbfzVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(t2.b bVar) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
