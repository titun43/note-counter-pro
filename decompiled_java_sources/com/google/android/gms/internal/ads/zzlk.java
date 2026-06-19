package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzlk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzlk zza(long j2) {
        this.zza = j2;
        return this;
    }

    public final zzlk zzb(float f5) {
        boolean z4 = true;
        if (f5 <= 0.0f && f5 != -3.4028235E38f) {
            z4 = false;
        }
        zzgrc.zza(z4);
        this.zzb = f5;
        return this;
    }

    public final zzlk zzc(long j2) {
        boolean z4 = true;
        if (j2 < 0) {
            if (j2 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                z4 = false;
            }
        }
        zzgrc.zza(z4);
        this.zzc = j2;
        return this;
    }

    public final zzll zzd() {
        return new zzll(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzlk(zzll zzllVar, byte[] bArr) {
        this.zza = zzllVar.zza;
        this.zzb = zzllVar.zzb;
        this.zzc = zzllVar.zzc;
    }
}
