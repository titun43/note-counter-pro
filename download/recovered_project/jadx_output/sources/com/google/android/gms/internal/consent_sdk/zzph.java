package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzph extends zzpk {
    public zzph(byte[] bArr, int i5, int i6) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zza(int i5) {
        if (((47 - (i5 + 1)) | i5) >= 0) {
            return ((zzpk) this).zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(u.h(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(u.i(i5, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zzb(int i5) {
        return ((zzpk) this).zza[i5];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final int zzd() {
        return 47;
    }
}
