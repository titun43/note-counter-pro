package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgw(final byte[] bArr) {
        super(false);
        zzgv zzgvVar = new zzgv() { // from class: com.google.android.gms.internal.ads.zzgu
            @Override // com.google.android.gms.internal.ads.zzgv
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        this.zza = zzgvVar;
        zzgrc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        int i7 = this.zze;
        if (i7 == 0) {
            return -1;
        }
        int min = Math.min(i6, i7);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i5, min);
        this.zzd += min;
        this.zze -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        byte[] zza = this.zza.zza(uri);
        this.zzc = zza;
        long j2 = zzhfVar.zze;
        int length = zza.length;
        if (j2 > length) {
            throw new zzhc(2008);
        }
        int i5 = (int) j2;
        this.zzd = i5;
        int i6 = length - i5;
        this.zze = i6;
        long j5 = zzhfVar.zzf;
        if (j5 != -1) {
            this.zze = (int) Math.min(i6, j5);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j5 != -1 ? j5 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
