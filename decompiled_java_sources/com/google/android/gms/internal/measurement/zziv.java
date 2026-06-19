package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zziv extends zziy {
    private final int zzc;

    public zziv(byte[] bArr, int i5, int i6) {
        super(bArr);
        zzjb.zzj(0, i6, bArr.length);
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zza(int i5) {
        int i6 = this.zzc;
        if (((i6 - (i5 + 1)) | i5) >= 0) {
            return this.zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(u.h(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(u.g(i5, i6, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final byte zzb(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy, com.google.android.gms.internal.measurement.zzjb
    public final int zzd() {
        return this.zzc;
    }
}
