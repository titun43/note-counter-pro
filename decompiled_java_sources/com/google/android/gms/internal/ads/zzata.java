package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class zzata extends ByteArrayOutputStream {
    private final zzasp zza;

    public zzata(zzasp zzaspVar, int i5) {
        this.zza = zzaspVar;
        ((ByteArrayOutputStream) this).buf = zzaspVar.zza(Math.max(i5, 256));
    }

    private final void zza(int i5) {
        int i6 = ((ByteArrayOutputStream) this).count;
        if (i6 + i5 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzasp zzaspVar = this.zza;
        int i7 = i6 + i5;
        byte[] zza = zzaspVar.zza(i7 + i7);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zza, 0, ((ByteArrayOutputStream) this).count);
        zzaspVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i5) {
        zza(1);
        super.write(i5);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i5, int i6) {
        zza(i6);
        super.write(bArr, i5, i6);
    }
}
