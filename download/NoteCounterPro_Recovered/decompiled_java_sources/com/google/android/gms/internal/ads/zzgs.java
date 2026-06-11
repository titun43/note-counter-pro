package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzgs extends zzgt {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgs(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j2 = this.zzd;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i6 = (int) Math.min(j2, i6);
            } catch (IOException e4) {
                throw new zzgr(e4, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzfj.zza;
        int read = inputStream.read(bArr, i5, i6);
        if (read == -1) {
            return -1;
        }
        long j5 = this.zzd;
        if (j5 != -1) {
            this.zzd = j5 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        try {
            Uri uri = zzhfVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzhfVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            long j2 = zzhfVar.zze;
            if (open.skip(j2) < j2) {
                throw new zzgr(null, 2008);
            }
            long j5 = zzhfVar.zzf;
            if (j5 != -1) {
                this.zzd = j5;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzhfVar);
            return this.zzd;
        } catch (zzgr e4) {
            throw e4;
        } catch (IOException e5) {
            throw new zzgr(e5, true != (e5 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e4) {
                throw new zzgr(e4, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
