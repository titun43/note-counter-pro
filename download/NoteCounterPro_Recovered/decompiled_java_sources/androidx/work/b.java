package androidx.work;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f615a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f616b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final u f617c;

    /* renamed from: d, reason: collision with root package name */
    public final t2.i f618d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.j f619e;

    /* renamed from: f, reason: collision with root package name */
    public final int f620f;

    /* renamed from: g, reason: collision with root package name */
    public final int f621g;
    public final int h;

    public b(t2.i iVar) {
        String str = v.f679a;
        this.f617c = new u();
        this.f618d = new t2.i(7);
        this.f619e = new k1.j();
        this.f620f = 4;
        this.f621g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.h = 20;
    }
}
