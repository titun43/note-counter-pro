package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
class zzgtz extends zzgua {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzgtz(int i5) {
        zzgtb.zzb(i5, "initialCapacity");
        this.zza = new Object[i5];
        this.zzb = 0;
    }

    private final void zzf(int i5) {
        int length = this.zza.length;
        int zze = zzgua.zze(length, this.zzb + i5);
        if (zze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zze);
            this.zzc = false;
        }
    }

    public final zzgtz zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }

    public final void zzb(Object[] objArr, int i5) {
        zzgvy.zza(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    public final zzgua zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzgub) {
                this.zzb = ((zzgub) collection).zzg(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzd(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgua
    public /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        throw null;
    }
}
