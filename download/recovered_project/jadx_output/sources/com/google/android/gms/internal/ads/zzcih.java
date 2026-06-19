package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcih implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzcih(zzhb zzhbVar, int i5, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i5;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        int i7;
        long j2 = this.zzd;
        long j5 = this.zzb;
        if (j2 < j5) {
            int zza = this.zza.zza(bArr, i5, (int) Math.min(i6, j5 - j2));
            long j6 = this.zzd + zza;
            this.zzd = j6;
            i7 = zza;
            j2 = j6;
        } else {
            i7 = 0;
        }
        if (j2 < j5) {
            return i7;
        }
        int zza2 = this.zzc.zza(bArr, i5 + i7, i6 - i7);
        int i8 = i7 + zza2;
        this.zzd += zza2;
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        Uri uri;
        zzhf zzhfVar2;
        Uri uri2 = zzhfVar.zza;
        this.zze = uri2;
        long j2 = zzhfVar.zze;
        long j5 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j2 >= j5) {
            uri = uri2;
            zzhfVar2 = null;
        } else {
            long j6 = zzhfVar.zzf;
            long j7 = j5 - j2;
            if (j6 != -1) {
                j7 = Math.min(j6, j7);
            }
            uri = uri2;
            zzhfVar2 = new zzhf(uri, j2, j7, null);
        }
        long j8 = zzhfVar.zzf;
        if (j8 == -1 || j2 + j8 > j5) {
            zzhfVar3 = new zzhf(uri, Math.max(j5, j2), j8 != -1 ? Math.min(j8, (j2 + j8) - j5) : -1L, null);
        }
        long zzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long zzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j2;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgui.zza();
    }
}
