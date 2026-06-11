package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzhyk extends zzhyl implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhyk) && ((zzhyk) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzhyl zzhylVar) {
        this.zza.add(zzhylVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzhyl zzc(int i5) {
        return (zzhyl) this.zza.get(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzhyl
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzhyl) arrayList.get(0)).zzd();
        }
        throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(size).length() + 37), "Array must have size 1, but has size ", size));
    }
}
