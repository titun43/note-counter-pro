package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzgrh extends zzgra {
    private final Object zza;

    public zzgrh(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgrh) {
            return this.zza.equals(((zzgrh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return h1.b(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final zzgra zzb(zzgqt zzgqtVar) {
        Object apply = zzgqtVar.apply(this.zza);
        zzgrc.zzk(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzgrh(apply);
    }
}
