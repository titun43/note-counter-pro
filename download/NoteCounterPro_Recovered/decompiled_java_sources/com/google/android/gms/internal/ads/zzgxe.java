package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzgxe extends FilterInputStream {
    private long zza;
    private long zzb;

    public zzgxe(InputStream inputStream, long j2) {
        super(inputStream);
        this.zzb = -1L;
        inputStream.getClass();
        zzgrc.zzb(j2 >= 0, "limit must be non-negative");
        this.zza = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.zza == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.zzb == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.zza = this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j2, this.zza));
        this.zza -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        long j2 = this.zza;
        if (j2 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i5, (int) Math.min(i6, j2));
        if (read != -1) {
            this.zza -= read;
        }
        return read;
    }
}
