package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzass extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzass(InputStream inputStream, long j2) {
        super(inputStream);
        this.zza = j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        int read = super.read(bArr, i5, i6);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
