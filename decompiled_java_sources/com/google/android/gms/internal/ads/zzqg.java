package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzqg {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzqg zza(boolean z4) {
        this.zza = z4;
        return this;
    }

    public final zzqg zzb(boolean z4) {
        this.zzb = z4;
        return this;
    }

    public final zzqg zzc(boolean z4) {
        this.zzc = z4;
        return this;
    }

    public final zzqg zzd(int i5) {
        this.zzd = i5;
        return this;
    }

    public final zzqh zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqh(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
