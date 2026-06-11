package com.google.android.gms.internal.consent_sdk;

import i3.d;
import i3.j;
import i3.k;
import i3.l;

/* loaded from: classes.dex */
final class zzbc implements l, k {
    private final l zza;
    private final k zzb;

    public /* synthetic */ zzbc(l lVar, k kVar, zzbd zzbdVar) {
        this.zza = lVar;
        this.zzb = kVar;
    }

    @Override // i3.k
    public final void onConsentFormLoadFailure(j jVar) {
        this.zzb.onConsentFormLoadFailure(jVar);
    }

    @Override // i3.l
    public final void onConsentFormLoadSuccess(d dVar) {
        this.zza.onConsentFormLoadSuccess(dVar);
    }
}
