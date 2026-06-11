package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbqd implements com.google.android.gms.common.internal.b {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbqf zzb;

    public zzbqd(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
        this.zzb = zzbqfVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e4) {
            this.zza.zzd(e4);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i5) {
        this.zza.zzd(new RuntimeException(u.l(new StringBuilder(String.valueOf(i5).length() + 23), "onConnectionSuspended: ", i5)));
    }
}
