package d4;

import java.io.File;
import java.io.IOException;
import o4.r0;
import o4.s;
import o4.z0;
import t4.r;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1223g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m(Object obj, int i5) {
        this.f1223g = i5;
        this.h = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r0 == null) goto L19;
     */
    @Override // f4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1223g) {
            case 0:
                f4.p pVar = (f4.p) this.h;
                File file = (File) obj;
                IOException iOException = (IOException) obj2;
                g4.i.e(file, "f");
                g4.i.e(iOException, "e");
                if (pVar.invoke(file, iOException) != o.f1225g) {
                    return t3.h.f3400a;
                }
                throw new p(file, null, null);
            default:
                s4.j jVar = (s4.j) this.h;
                int intValue = ((Integer) obj).intValue();
                w3.f fVar = (w3.f) obj2;
                w3.g key = fVar.getKey();
                w3.f d5 = jVar.h.d(key);
                if (key != s.h) {
                    if (fVar != d5) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    r0 r0Var = (r0) d5;
                    r0 r0Var2 = (r0) fVar;
                    while (true) {
                        r0 r0Var3 = null;
                        if (r0Var2 == null) {
                            r0Var2 = null;
                        } else if (r0Var2 != r0Var && (r0Var2 instanceof r)) {
                            o4.i iVar = (o4.i) z0.h.get((r) r0Var2);
                            if (iVar != null) {
                                r0Var3 = iVar.getParent();
                            }
                            r0Var2 = r0Var3;
                        }
                    }
                    if (r0Var2 != r0Var) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r0Var2 + ", expected child of " + r0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(intValue);
        }
    }
}
