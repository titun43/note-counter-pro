package androidx.emoji2.text;

import android.os.Trace;

/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i5 = b0.i.f691a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (l.f262k != null) {
                l.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i6 = b0.i.f691a;
            Trace.endSection();
            throw th;
        }
    }
}
