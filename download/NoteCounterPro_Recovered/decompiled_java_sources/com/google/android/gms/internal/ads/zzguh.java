package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzguh {
    Object[] zza;
    int zzb;
    zzgug zzc;

    public zzguh() {
        this(4);
    }

    private final void zze(int i5) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i6 = i5 + i5;
        if (i6 > length) {
            this.zza = Arrays.copyOf(objArr, zzgua.zze(length, i6));
        }
    }

    private final zzgui zzf(boolean z4) {
        zzgug zzgugVar;
        zzgug zzgugVar2;
        if (z4 && (zzgugVar2 = this.zzc) != null) {
            throw zzgugVar2.zza();
        }
        zzgwf zzk = zzgwf.zzk(this.zzb, this.zza, this);
        if (!z4 || (zzgugVar = this.zzc) == null) {
            return zzk;
        }
        throw zzgugVar.zza();
    }

    public final zzguh zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgtb.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        int i6 = i5 + i5;
        objArr[i6] = obj;
        objArr[i6 + 1] = obj2;
        this.zzb = i5 + 1;
        return this;
    }

    public final zzguh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgui zzc() {
        return zzf(true);
    }

    public final zzgui zzd() {
        return zzf(false);
    }

    public zzguh(int i5) {
        this.zza = new Object[i5 + i5];
        this.zzb = 0;
    }
}
