package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class zzfgb implements zzgqt {
    final /* synthetic */ zzfgf zza;

    public zzfgb(zzfgf zzfgfVar) {
        Objects.requireNonNull(zzfgfVar);
        this.zza = zzfgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (zzeff) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfgf zzfgfVar = this.zza;
        zzfgfVar.zzd(new zzfgd(null, zzfgfVar.zzb(), null));
        return zzfgfVar.zzc();
    }
}
