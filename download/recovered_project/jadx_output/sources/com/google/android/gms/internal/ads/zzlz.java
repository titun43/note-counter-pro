package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzlz implements zzlr {
    public final zzwf zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlz(zzwm zzwmVar, boolean z4) {
        this.zza = new zzwf(zzwmVar, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i5) {
        this.zzd = i5;
        this.zze = false;
        this.zzc.clear();
    }
}
