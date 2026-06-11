package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class zzho extends zzgt {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzho() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j2 = this.zzc;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfj.zza;
            int read = randomAccessFile.read(bArr, i5, (int) Math.min(j2, i6));
            if (read > 0) {
                this.zzc -= read;
                zzh(read);
            }
            return read;
        } catch (IOException e4) {
            throw new zzhn(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        zzf(zzhfVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j2 = zzhfVar.zze;
                randomAccessFile.seek(j2);
                long j5 = zzhfVar.zzf;
                if (j5 == -1) {
                    j5 = this.zza.length() - j2;
                }
                this.zzc = j5;
                if (j5 < 0) {
                    throw new zzhn(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhfVar);
                return this.zzc;
            } catch (IOException e4) {
                throw new zzhn(e4, 2000);
            }
        } catch (FileNotFoundException e5) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzhn(e5, ((e5.getCause() instanceof ErrnoException) && ((ErrnoException) e5.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzhn("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e5, 1004);
        } catch (SecurityException e6) {
            throw new zzhn(e6, 2006);
        } catch (RuntimeException e7) {
            throw new zzhn(e7, 2000);
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
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e4) {
                throw new zzhn(e4, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
