package c3;

import android.view.View;
import f0.k0;
import f0.r0;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c0 implements Comparator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f802g;

    public /* synthetic */ c0(int i5) {
        this.f802g = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r0 >= r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r6 < r7) goto L19;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.f802g) {
            case 0:
                b bVar = (b) obj;
                b bVar2 = (b) obj2;
                com.google.android.gms.common.internal.b0.g(bVar);
                com.google.android.gms.common.internal.b0.g(bVar2);
                int i5 = bVar.f794g;
                int i6 = bVar2.f794g;
                if (i5 == i6) {
                    int i7 = bVar.h;
                    int i8 = bVar2.h;
                    if (i7 == i8) {
                    }
                }
                break;
            default:
                WeakHashMap weakHashMap = r0.f1407a;
                float e4 = k0.e((View) obj);
                float e5 = k0.e((View) obj2);
                if (e4 <= e5) {
                    if (e4 < e5) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return 1;
    }
}
