package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.io.Serializable;

/* loaded from: classes.dex */
final class zzgrv implements Serializable, zzgru {
    final zzgru zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgsb zzd = new zzgsb();

    public zzgrv(zzgru zzgruVar) {
        this.zza = zzgruVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            obj = h1.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String obj2 = obj.toString();
        return h1.b(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
