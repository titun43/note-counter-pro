package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgy extends zzgt {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgy(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        long j2 = this.zze;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i6 = (int) Math.min(j2, i6);
            } catch (IOException e4) {
                throw new zzgx(e4, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        String str = zzfj.zza;
        int read = fileInputStream.read(bArr, i5, i6);
        if (read == -1) {
            return -1;
        }
        long j5 = this.zze;
        if (j5 != -1) {
            this.zze = j5 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        int i5;
        AssetFileDescriptor openAssetFileDescriptor;
        long j2;
        try {
            try {
                Uri normalizeScheme = zzhfVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzf(zzhfVar);
                if (Objects.equals(normalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    String valueOf = String.valueOf(normalizeScheme);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    IOException iOException = new IOException(sb.toString());
                    i5 = 2000;
                    try {
                        throw new zzgx(iOException, 2000);
                    } catch (IOException e4) {
                        e = e4;
                        throw new zzgx(e, true != (e instanceof FileNotFoundException) ? i5 : 2005);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzhfVar.zze > length) {
                    throw new zzgx(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long j5 = zzhfVar.zze;
                long skip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (skip != j5) {
                    throw new zzgx(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j2 = -1;
                    } else {
                        j2 = size - channel.position();
                        this.zze = j2;
                        if (j2 < 0) {
                            throw new zzgx(null, 2008);
                        }
                    }
                } else {
                    j2 = length - skip;
                    this.zze = j2;
                    if (j2 < 0) {
                        throw new zzgx(null, 2008);
                    }
                }
                long j6 = zzhfVar.zzf;
                if (j6 != -1) {
                    this.zze = j2 == -1 ? j6 : Math.min(j2, j6);
                }
                this.zzf = true;
                zzg(zzhfVar);
                return j6 != -1 ? j6 : this.zze;
            } catch (IOException e5) {
                e = e5;
                i5 = 2000;
            }
        } catch (zzgx e6) {
            throw e6;
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
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e4) {
                        throw new zzgx(e4, 2000);
                    }
                } catch (IOException e5) {
                    throw new zzgx(e5, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th;
                } catch (IOException e6) {
                    throw new zzgx(e6, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th2;
        }
    }
}
