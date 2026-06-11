package e1;

import android.content.Context;
import androidx.emoji2.text.p;
import java.io.File;

/* loaded from: classes.dex */
public final class e implements d1.c {

    /* renamed from: g, reason: collision with root package name */
    public final Context f1236g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final p f1237i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1238j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1239k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public d f1240l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1241m;

    public e(Context context, String str, p pVar, boolean z4) {
        this.f1236g = context;
        this.h = str;
        this.f1237i = pVar;
        this.f1238j = z4;
    }

    public final d a() {
        d dVar;
        synchronized (this.f1239k) {
            try {
                if (this.f1240l == null) {
                    b[] bVarArr = new b[1];
                    if (this.h == null || !this.f1238j) {
                        this.f1240l = new d(this.f1236g, this.h, bVarArr, this.f1237i);
                    } else {
                        this.f1240l = new d(this.f1236g, new File(this.f1236g.getNoBackupFilesDir(), this.h).getAbsolutePath(), bVarArr, this.f1237i);
                    }
                    this.f1240l.setWriteAheadLoggingEnabled(this.f1241m);
                }
                dVar = this.f1240l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // d1.c
    public final b c() {
        return a().b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // d1.c
    public final void setWriteAheadLoggingEnabled(boolean z4) {
        synchronized (this.f1239k) {
            try {
                d dVar = this.f1240l;
                if (dVar != null) {
                    dVar.setWriteAheadLoggingEnabled(z4);
                }
                this.f1241m = z4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
