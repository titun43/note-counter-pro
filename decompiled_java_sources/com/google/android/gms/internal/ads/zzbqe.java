package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbqe implements com.google.android.gms.common.internal.c {
    final /* synthetic */ zzcen zza;

    public zzbqe(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(t2.b bVar) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
