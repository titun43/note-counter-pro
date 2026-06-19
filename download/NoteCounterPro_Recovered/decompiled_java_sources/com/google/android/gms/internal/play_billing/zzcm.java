package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzcm extends zzco {
    private final transient zzco zza;

    public zzcm(zzco zzcoVar) {
        this.zza = zzcoVar;
    }

    private final int zzp(int i5) {
        return (this.zza.size() - 1) - i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzbe.zza(i5, this.zza.size(), "index");
        return this.zza.get(zzp(i5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzp(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzp(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzco subList(int i5, int i6) {
        zzbe.zze(i5, i6, this.zza.size());
        zzco zzcoVar = this.zza;
        return zzcoVar.subList(zzcoVar.size() - i6, this.zza.size() - i5).zzh();
    }
}
