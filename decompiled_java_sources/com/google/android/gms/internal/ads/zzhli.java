package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhli {
    private final Class zza;
    private final zzhye zzb;

    public /* synthetic */ zzhli(Class cls, zzhye zzhyeVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhyeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhli)) {
            return false;
        }
        zzhli zzhliVar = (zzhli) obj;
        return zzhliVar.zza.equals(this.zza) && zzhliVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzhye zzhyeVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzhyeVar);
        return h1.b(new StringBuilder(simpleName.length() + 21 + valueOf.length()), simpleName, ", object identifier: ", valueOf);
    }
}
