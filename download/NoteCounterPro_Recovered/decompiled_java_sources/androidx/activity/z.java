package androidx.activity;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements f4.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f71g;
    public final /* synthetic */ f0 h;

    public /* synthetic */ z(f0 f0Var, int i5) {
        this.f71g = i5;
        this.h = f0Var;
    }

    @Override // f4.l
    public final Object a(Object obj) {
        Object obj2;
        Object obj3;
        c cVar = (c) obj;
        switch (this.f71g) {
            case 0:
                g4.i.e(cVar, "backEvent");
                f0 f0Var = this.h;
                u3.e eVar = f0Var.f42b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((y) obj2).isEnabled()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                y yVar = (y) obj2;
                if (f0Var.f43c != null) {
                    f0Var.b();
                }
                f0Var.f43c = yVar;
                if (yVar != null) {
                    yVar.handleOnBackStarted(cVar);
                }
                break;
            default:
                g4.i.e(cVar, "backEvent");
                f0 f0Var2 = this.h;
                y yVar2 = f0Var2.f43c;
                if (yVar2 == null) {
                    u3.e eVar2 = f0Var2.f42b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((y) obj3).isEnabled()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    yVar2 = (y) obj3;
                }
                if (yVar2 != null) {
                    yVar2.handleOnBackProgressed(cVar);
                }
                break;
        }
        return t3.h.f3400a;
    }
}
