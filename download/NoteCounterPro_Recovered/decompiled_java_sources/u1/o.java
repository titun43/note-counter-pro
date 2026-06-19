package u1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final w1.a f3526a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.a f3527b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.j f3528c;

    static {
        androidx.work.n.g("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, l1.b bVar, androidx.emoji2.text.t tVar) {
        this.f3527b = bVar;
        this.f3526a = tVar;
        this.f3528c = workDatabase.n();
    }
}
