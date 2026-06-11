package com.google.android.gms.internal.common;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    public zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i5) {
        return (this.zza.size() - 1) - i5;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzah zzahVar = this.zza;
        zzr.zzb(i5, zzahVar.size(), "index");
        return zzahVar.get(zzs(i5));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzs(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzs(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i5, int i6) {
        zzah zzahVar = this.zza;
        zzr.zzd(i5, i6, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i6, zzahVar.size() - i5).zzh();
    }
}
