package y0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3780d;

    public h(long j2, int i5, int i6, long j5) {
        this.f3777a = i5;
        this.f3778b = i6;
        this.f3779c = j2;
        this.f3780d = j5;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3777a);
            dataOutputStream.writeInt(this.f3778b);
            dataOutputStream.writeLong(this.f3779c);
            dataOutputStream.writeLong(this.f3780d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f3778b == hVar.f3778b && this.f3779c == hVar.f3779c && this.f3777a == hVar.f3777a && this.f3780d == hVar.f3780d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3778b), Long.valueOf(this.f3779c), Integer.valueOf(this.f3777a), Long.valueOf(this.f3780d));
    }
}
