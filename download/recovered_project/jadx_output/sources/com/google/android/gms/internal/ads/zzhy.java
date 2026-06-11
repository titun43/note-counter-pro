package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhy implements zzhb {
    private final zzhb zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.EMPTY_MAP;

    public zzhy(zzhb zzhbVar) {
        this.zza = zzhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        int zza = this.zza.zza(bArr, i5, i6);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        this.zzc = zzhfVar.zza;
        this.zzd = Collections.EMPTY_MAP;
        try {
            long zzb = this.zza.zzb(zzhfVar);
            Uri zzc = zzc();
            if (zzc != null) {
                this.zzc = zzc;
            }
            this.zzd = zzj();
            return zzb;
        } catch (Throwable th) {
            Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zzj();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    public final long zzf() {
        return this.zzb;
    }

    public final Uri zzg() {
        return this.zzc;
    }

    public final Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return this.zza.zzj();
    }
}
