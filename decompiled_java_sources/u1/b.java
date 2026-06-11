package u1;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends c {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1.k f3495i;

    public /* synthetic */ b(l1.k kVar, int i5) {
        this.h = i5;
        this.f3495i = kVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // u1.c
    public final void b() {
        switch (this.h) {
            case 0:
                l1.k kVar = this.f3495i;
                WorkDatabase workDatabase = kVar.f2489e;
                workDatabase.c();
                try {
                    ArrayList g5 = workDatabase.n().g();
                    int size = g5.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = g5.get(i5);
                        i5++;
                        c.a(kVar, (String) obj);
                    }
                    workDatabase.h();
                    workDatabase.f();
                    l1.d.a(kVar.f2488d, kVar.f2489e, kVar.f2491g);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                l1.k kVar2 = this.f3495i;
                WorkDatabase workDatabase2 = kVar2.f2489e;
                workDatabase2.c();
                try {
                    ArrayList f5 = workDatabase2.n().f();
                    int size2 = f5.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = f5.get(i6);
                        i6++;
                        c.a(kVar2, (String) obj2);
                    }
                    workDatabase2.h();
                    workDatabase2.f();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.f();
                    throw th2;
                }
        }
    }
}
