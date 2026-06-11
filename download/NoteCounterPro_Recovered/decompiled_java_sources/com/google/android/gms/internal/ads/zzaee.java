package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaee(int i5, long j2, long j5) {
        this.zzb = i5;
        this.zzc = j2;
        this.zzd = j5;
    }

    public static zzaee zza(long j2, long j5) {
        return new zzaee(-1, j2, j5);
    }

    public static zzaee zzb(long j2, long j5) {
        return new zzaee(-2, j2, j5);
    }

    public static zzaee zzc(long j2) {
        return new zzaee(0, -9223372036854775807L, j2);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
