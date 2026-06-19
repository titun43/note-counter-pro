package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzgf extends zzgi {
    private final int zzc;

    public zzgf(byte[] bArr, int i5, int i6) {
        super(bArr);
        zzgk.zzh(0, i6, bArr.length);
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zza(int i5) {
        int i6 = this.zzc;
        if (((i6 - (i5 + 1)) | i5) >= 0) {
            return ((zzgi) this).zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(u.h(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(u.g(i5, i6, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zzb(int i5) {
        return ((zzgi) this).zza[i5];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final int zzd() {
        return this.zzc;
    }
}
