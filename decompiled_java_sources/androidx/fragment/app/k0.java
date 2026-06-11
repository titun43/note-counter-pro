package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class k0 implements d.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f401g;
    public final /* synthetic */ u0 h;

    public /* synthetic */ k0(u0 u0Var, int i5) {
        this.f401g = i5;
        this.h = u0Var;
    }

    @Override // d.b
    public final void c(Object obj) {
        switch (this.f401g) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
                }
                u0 u0Var = this.h;
                q0 q0Var = (q0) u0Var.F.pollFirst();
                if (q0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = q0Var.f418g;
                    if (u0Var.f441c.h(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            default:
                d.a aVar = (d.a) obj;
                u0 u0Var2 = this.h;
                q0 q0Var2 = (q0) u0Var2.F.pollFirst();
                if (q0Var2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str2 = q0Var2.f418g;
                    int i6 = q0Var2.h;
                    z h = u0Var2.f441c.h(str2);
                    if (h == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        h.k(i6, aVar.f1157g, aVar.h);
                        break;
                    }
                }
        }
    }
}
