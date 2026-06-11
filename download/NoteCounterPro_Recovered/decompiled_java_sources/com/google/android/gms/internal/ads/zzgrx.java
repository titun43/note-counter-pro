package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzgrx implements zzgru {
    private static final zzgru zzb = zzgrw.zza;
    private final zzgsb zza = new zzgsb();
    private volatile zzgru zzc;
    private Object zzd;

    public zzgrx(zzgru zzgruVar) {
        this.zzc = zzgruVar;
    }

    public final String toString() {
        Object obj = this.zzc;
        if (obj == zzb) {
            String valueOf = String.valueOf(this.zzd);
            obj = h1.b(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return h1.b(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        zzgru zzgruVar = this.zzc;
        zzgru zzgruVar2 = zzb;
        if (zzgruVar != zzgruVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgruVar2) {
                        Object zza = this.zzc.zza();
                        this.zzd = zza;
                        this.zzc = zzgruVar2;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzd;
    }
}
