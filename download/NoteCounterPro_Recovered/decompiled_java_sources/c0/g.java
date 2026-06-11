package c0;

import androidx.emoji2.text.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements e0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f756b;

    public /* synthetic */ g(Object obj, int i5) {
        this.f755a = i5;
        this.f756b = obj;
    }

    @Override // e0.a
    public final void accept(Object obj) {
        switch (this.f755a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((p) this.f756b).C(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f761c) {
                    try {
                        o.l lVar = i.f762d;
                        ArrayList arrayList = (ArrayList) lVar.get((String) this.f756b);
                        if (arrayList == null) {
                            return;
                        }
                        lVar.remove((String) this.f756b);
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            ((e0.a) arrayList.get(i5)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
