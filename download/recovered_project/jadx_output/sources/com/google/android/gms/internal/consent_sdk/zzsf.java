package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsi zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzsf(zzsi zzsiVar, zzsh zzshVar) {
        Objects.requireNonNull(zzsiVar);
        this.zza = zzsiVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        Map map;
        int i6 = this.zzb + 1;
        zzsi zzsiVar = this.zza;
        i5 = zzsiVar.zzb;
        if (i6 < i5) {
            return true;
        }
        map = zzsiVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i5;
        Object[] objArr;
        this.zzc = true;
        int i6 = this.zzb + 1;
        this.zzb = i6;
        zzsi zzsiVar = this.zza;
        i5 = zzsiVar.zzb;
        if (i6 >= i5) {
            return (Map.Entry) zza().next();
        }
        objArr = zzsiVar.zza;
        return (zzse) objArr[i6];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i5;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzsi zzsiVar = this.zza;
        zzsiVar.zzo();
        int i6 = this.zzb;
        i5 = zzsiVar.zzb;
        if (i6 >= i5) {
            zza().remove();
        } else {
            this.zzb = i6 - 1;
            zzsiVar.zzm(i6);
        }
    }
}
