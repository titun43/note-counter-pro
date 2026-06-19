package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzatz implements zzaty {
    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i5) {
        return zzaukVar.zzb(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i5, int i6) {
        byte[] bArr;
        int length;
        if (i5 < 0 || i5 > i6 || i6 > (length = (bArr = zzaukVar.zza).length) || i5 > i6 || i6 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzauk(zzauk.zzh(bArr, i5, i6 - i5));
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzaty zzc() {
        return new zzatz();
    }
}
