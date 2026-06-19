package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzjc implements Iterator {
    final /* synthetic */ zzjf zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzjc(zzjf zzjfVar, zzje zzjeVar) {
        this.zza = zzjfVar;
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
        zzjf zzjfVar = this.zza;
        i5 = zzjfVar.zzb;
        if (i6 < i5) {
            return true;
        }
        map = zzjfVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i5;
        Object[] objArr;
        this.zzc = true;
        int i6 = this.zzb + 1;
        this.zzb = i6;
        zzjf zzjfVar = this.zza;
        i5 = zzjfVar.zzb;
        if (i6 >= i5) {
            return (Map.Entry) zza().next();
        }
        objArr = zzjfVar.zza;
        return (zzjb) objArr[i6];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i5;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i6 = this.zzb;
        zzjf zzjfVar = this.zza;
        i5 = zzjfVar.zzb;
        if (i6 >= i5) {
            zza().remove();
        } else {
            this.zzb = i6 - 1;
            zzjfVar.zzm(i6);
        }
    }
}
