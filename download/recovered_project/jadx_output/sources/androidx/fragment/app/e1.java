package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class e1 extends Writer {
    public final StringBuilder h = new StringBuilder(128);

    /* renamed from: g, reason: collision with root package name */
    public final String f373g = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.h;
        if (sb.length() > 0) {
            Log.d(this.f373g, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            char c5 = cArr[i5 + i7];
            if (c5 == '\n') {
                a();
            } else {
                this.h.append(c5);
            }
        }
    }
}
