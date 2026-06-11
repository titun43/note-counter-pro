package u1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class a extends c {
    public final /* synthetic */ l1.k h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ UUID f3494i;

    public a(l1.k kVar, UUID uuid) {
        this.h = kVar;
        this.f3494i = uuid;
    }

    @Override // u1.c
    public final void b() {
        l1.k kVar = this.h;
        WorkDatabase workDatabase = kVar.f2489e;
        workDatabase.c();
        try {
            c.a(kVar, this.f3494i.toString());
            workDatabase.h();
            workDatabase.f();
            l1.d.a(kVar.f2488d, kVar.f2489e, kVar.f2491g);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
