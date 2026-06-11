package androidx.lifecycle;

import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class l0 extends g4.j implements f4.a {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f553i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, int i5) {
        super(0);
        this.h = i5;
        this.f553i = obj;
    }

    @Override // f4.a
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return k0.e((x0) this.f553i);
            default:
                File file = (File) ((k0.d0) this.f553i).f2336a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (k0.d0.f2335j) {
                    LinkedHashSet linkedHashSet = k0.d0.f2334i;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    g4.i.d(absolutePath, "it");
                    linkedHashSet.add(absolutePath);
                }
                return file;
        }
    }
}
