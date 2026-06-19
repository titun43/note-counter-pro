package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbia extends n.a {
    final /* synthetic */ zzbid zza;

    public zzbia(zzbid zzbidVar) {
        Objects.requireNonNull(zzbidVar);
        this.zza = zzbidVar;
    }

    @Override // n.a
    public final void onNavigationEvent(int i5, Bundle bundle) {
        this.zza.zzc(i5);
    }
}
