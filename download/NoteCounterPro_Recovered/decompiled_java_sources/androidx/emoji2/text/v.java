package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v implements k {

    /* renamed from: g, reason: collision with root package name */
    public final Context f286g;
    public final c0.e h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.i f287i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f288j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public Handler f289k;

    /* renamed from: l, reason: collision with root package name */
    public ThreadPoolExecutor f290l;

    /* renamed from: m, reason: collision with root package name */
    public ThreadPoolExecutor f291m;

    /* renamed from: n, reason: collision with root package name */
    public z2.b f292n;

    public v(Context context, c0.e eVar) {
        y4.b.g(context, "Context cannot be null");
        this.f286g = context.getApplicationContext();
        this.h = eVar;
        this.f287i = w.f293d;
    }

    public final void a() {
        synchronized (this.f288j) {
            try {
                this.f292n = null;
                Handler handler = this.f289k;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f289k = null;
                ThreadPoolExecutor threadPoolExecutor = this.f291m;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f290l = null;
                this.f291m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c0.k b() {
        try {
            t2.i iVar = this.f287i;
            Context context = this.f286g;
            c0.e eVar = this.h;
            iVar.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            c0.j a5 = c0.d.a(context, Collections.unmodifiableList(arrayList));
            int i5 = a5.f763a;
            if (i5 != 0) {
                throw new RuntimeException(u.i(i5, "fetchFonts failed (", ")"));
            }
            c0.k[] kVarArr = (c0.k[]) ((List) a5.f764b).get(0);
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }

    @Override // androidx.emoji2.text.k
    public final void i(z2.b bVar) {
        synchronized (this.f288j) {
            this.f292n = bVar;
        }
        synchronized (this.f288j) {
            try {
                if (this.f292n == null) {
                    return;
                }
                if (this.f290l == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f291m = threadPoolExecutor;
                    this.f290l = threadPoolExecutor;
                }
                this.f290l.execute(new androidx.activity.o(this, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
