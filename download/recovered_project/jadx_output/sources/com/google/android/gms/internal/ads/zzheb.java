package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzheb extends zzhch {
    private final zzhea zza;

    private zzheb(zzhea zzheaVar) {
        this.zza = zzheaVar;
    }

    public static zzheb zzb(zzhea zzheaVar) {
        return new zzheb(zzheaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzheb) && ((zzheb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzheb.class, this.zza);
    }

    public final String toString() {
        String zzheaVar = this.zza.toString();
        return h1.b(new StringBuilder(zzheaVar.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", zzheaVar, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhea.zzc;
    }

    public final zzhea zzc() {
        return this.zza;
    }
}
