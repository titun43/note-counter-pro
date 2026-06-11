package com.google.android.gms.internal.location;

/* loaded from: classes.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    public zzbq(zzbs<E> zzbsVar, int i5) {
        super(zzbsVar.size(), i5);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    public final E zza(int i5) {
        return this.zza.get(i5);
    }
}
