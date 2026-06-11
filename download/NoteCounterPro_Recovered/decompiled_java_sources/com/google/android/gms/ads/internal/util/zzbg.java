package com.google.android.gms.ads.internal.util;

import androidx.emoji2.text.u;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzash;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbg implements zzasc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzash zzashVar) {
        String str = this.zza;
        String obj = zzashVar.toString();
        String n5 = u.n(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length()), "Failed to load URL: ", str, "\n", obj);
        int i5 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
        this.zzb.zza((Object) null);
    }
}
