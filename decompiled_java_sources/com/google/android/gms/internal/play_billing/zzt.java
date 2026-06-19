package com.google.android.gms.internal.play_billing;

import s.c;

/* loaded from: classes.dex */
final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    public zzt(zzu zzuVar) {
        this.zzg = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    public final String zza() {
        zzr zzrVar = (zzr) this.zzg.zza.get();
        return zzrVar == null ? "Completer object has been garbage collected, future will fail soon" : c.b("tag=[", String.valueOf(zzrVar.zza), "]");
    }
}
