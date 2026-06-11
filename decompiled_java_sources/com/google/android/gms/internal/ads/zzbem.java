package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbem {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbem(long j2, String str, int i5) {
        this.zza = j2;
        this.zzb = str;
        this.zzc = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbem)) {
            return false;
        }
        zzbem zzbemVar = (zzbem) obj;
        return zzbemVar.zza == this.zza && zzbemVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
