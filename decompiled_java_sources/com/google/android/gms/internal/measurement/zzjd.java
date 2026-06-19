package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
final class zzjd extends zzjf {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzjd(byte[] bArr, int i5, int i6, boolean z4, zzjc zzjcVar) {
        super(null);
        this.zze = f.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i5) {
        int i6 = this.zze;
        this.zze = 0;
        int i7 = this.zzc + this.zzd;
        this.zzc = i7;
        if (i7 <= 0) {
            this.zzd = 0;
            return i6;
        }
        this.zzd = i7;
        this.zzc = 0;
        return i6;
    }
}
