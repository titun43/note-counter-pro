package r0;

import androidx.fragment.app.x0;
import androidx.lifecycle.r0;
import o.m;

/* loaded from: classes.dex */
public class b extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final x0 f3143e = new x0(1);

    /* renamed from: d, reason: collision with root package name */
    public final m f3144d = new m();

    @Override // androidx.lifecycle.r0
    public final void b() {
        m mVar = this.f3144d;
        int i5 = mVar.f2735i;
        if (i5 > 0) {
            mVar.h[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = mVar.h;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        mVar.f2735i = 0;
    }
}
