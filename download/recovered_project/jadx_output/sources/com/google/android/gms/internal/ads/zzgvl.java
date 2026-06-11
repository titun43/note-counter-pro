package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
abstract class zzgvl extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zza = zza();
        this.zza = zza;
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set zzh = zzh();
        this.zzb = zzh;
        return zzh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzgvk zzgvkVar = new zzgvk(this);
        this.zzc = zzgvkVar;
        return zzgvkVar;
    }

    public abstract Set zza();

    public Set zzh() {
        return new zzgvj(this);
    }
}
