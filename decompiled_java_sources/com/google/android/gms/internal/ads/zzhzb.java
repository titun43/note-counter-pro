package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Map;

/* loaded from: classes.dex */
final class zzhzb implements Map.Entry {
    zzhzb zza;
    zzhzb zzb;
    zzhzb zzc;
    zzhzb zzd;
    zzhzb zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    public zzhzb(boolean z4) {
        this.zzf = null;
        this.zzg = z4;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzh);
        return h1.b(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public zzhzb(boolean z4, zzhzb zzhzbVar, Object obj, zzhzb zzhzbVar2, zzhzb zzhzbVar3) {
        this.zza = zzhzbVar;
        this.zzf = obj;
        this.zzg = z4;
        this.zzi = 1;
        this.zzd = zzhzbVar2;
        this.zze = zzhzbVar3;
        zzhzbVar3.zzd = this;
        zzhzbVar2.zze = this;
    }
}
