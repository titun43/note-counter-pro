package k0;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class n extends OutputStream {

    /* renamed from: g, reason: collision with root package name */
    public final FileOutputStream f2359g;

    public n(FileOutputStream fileOutputStream) {
        this.f2359g = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f2359g.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f2359g.write(i5);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        g4.i.e(bArr, "b");
        this.f2359g.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i6) {
        g4.i.e(bArr, "bytes");
        this.f2359g.write(bArr, i5, i6);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
