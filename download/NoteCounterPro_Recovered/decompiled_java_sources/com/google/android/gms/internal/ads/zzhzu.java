package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzhzu extends FilterInputStream {
    private int zza;

    public zzhzu(InputStream inputStream, int i5) {
        super(inputStream);
        this.zza = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        int skip = (int) super.skip(Math.min(j2, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        int i7 = this.zza;
        if (i7 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i5, Math.min(i6, i7));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
