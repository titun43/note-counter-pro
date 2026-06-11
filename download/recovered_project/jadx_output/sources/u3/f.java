package u3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends b3.g {
    public static void B(int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        g4.i.e(iArr, "<this>");
        g4.i.e(iArr2, "destination");
        System.arraycopy(iArr, i6, iArr2, i5, i7 - i6);
    }

    public static void C(Object[] objArr, int i5, Object[] objArr2, int i6, int i7) {
        g4.i.e(objArr, "<this>");
        g4.i.e(objArr2, "destination");
        System.arraycopy(objArr, i6, objArr2, i5, i7 - i6);
    }

    public static /* synthetic */ void D(Object[] objArr, int i5, Object[] objArr2, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        C(objArr, 0, objArr2, i5, i6);
    }

    public static List E(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new d(objArr)) : y4.b.y(objArr[0]) : o.f3547g;
    }
}
