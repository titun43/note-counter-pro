package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
class zzgsu extends zzgss implements List {
    final /* synthetic */ zzgsv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsu(zzgsv zzgsvVar, Object obj, List list, zzgss zzgssVar) {
        super(zzgsvVar, obj, list, zzgssVar);
        Objects.requireNonNull(zzgsvVar);
        this.zzf = zzgsvVar;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i5, obj);
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i5, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zza();
        return ((List) this.zzb).get(i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgst(this);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        zza();
        Object remove = ((List) this.zzb).remove(i5);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        zza();
        return ((List) this.zzb).set(i5, obj);
    }

    @Override // java.util.List
    public final List subList(int i5, int i6) {
        zza();
        List subList = ((List) this.zzb).subList(i5, i6);
        zzgss zzgssVar = this.zzc;
        if (zzgssVar == null) {
            zzgssVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzgssVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        zza();
        return new zzgst(this, i5);
    }
}
