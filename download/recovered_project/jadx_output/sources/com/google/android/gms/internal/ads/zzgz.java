package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class zzgz extends zzgt {
    private zzhf zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        int i7 = this.zzd;
        if (i7 == 0) {
            return -1;
        }
        int min = Math.min(i6, i7);
        byte[] bArr2 = this.zzb;
        String str = zzfj.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i5, min);
        this.zzc += min;
        this.zzd -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        zzf(zzhfVar);
        this.zza = zzhfVar;
        Uri normalizeScheme = zzhfVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzgrc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzfj.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e4) {
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e4);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = zzhfVar.zze;
        int length = this.zzb.length;
        if (j2 > length) {
            this.zzb = null;
            throw new zzhc(2008);
        }
        int i5 = (int) j2;
        this.zzc = i5;
        int i6 = length - i5;
        this.zzd = i6;
        long j5 = zzhfVar.zzf;
        if (j5 != -1) {
            this.zzd = (int) Math.min(i6, j5);
        }
        zzg(zzhfVar);
        return j5 != -1 ? j5 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        zzhf zzhfVar = this.zza;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
