package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class zzpn extends zzpp {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzpn(byte[] bArr, int i5, int i6, boolean z4, zzpo zzpoVar) {
        super(null);
        this.zzd = f.API_PRIORITY_OTHER;
        this.zzb = 0;
    }

    public final int zza(int i5) {
        int i6 = this.zzd;
        this.zzd = 0;
        int i7 = this.zzb + this.zzc;
        this.zzb = i7;
        if (i7 <= 0) {
            this.zzc = 0;
            return i6;
        }
        this.zzc = i7;
        this.zzb = 0;
        return i6;
    }
}
