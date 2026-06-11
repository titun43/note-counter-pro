package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzaje implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    public /* synthetic */ zzaje(long j2, long j5, long j6, byte[] bArr) {
        this.zza = j2;
        this.zzb = j5;
        this.zzc = j6;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzaje) obj).zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaje)) {
            return false;
        }
        zzaje zzajeVar = (zzaje) obj;
        return this.zza == zzajeVar.zza && this.zzb == zzajeVar.zzb && this.zzc == zzajeVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ long zzb() {
        return this.zzb;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
