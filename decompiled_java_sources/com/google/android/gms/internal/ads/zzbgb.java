package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzbgb {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbgb(InputStream inputStream, boolean z4, boolean z5, long j2, boolean z6) {
        this.zza = inputStream;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = j2;
        this.zze = z6;
    }

    public static zzbgb zza(InputStream inputStream, boolean z4, boolean z5, long j2, boolean z6) {
        return new zzbgb(inputStream, z4, z5, j2, z6);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
