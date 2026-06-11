package f0;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1364e;

    public f0(int i5, Class cls, int i6, int i7, int i8) {
        this.f1364e = i8;
        this.f1374a = i5;
        this.f1377d = cls;
        this.f1376c = i6;
        this.f1375b = i7;
    }

    @Override // f0.h0
    public final Object b(View view) {
        switch (this.f1364e) {
            case 0:
                return Boolean.valueOf(m0.c(view));
            case 1:
                return m0.a(view);
            default:
                return Boolean.valueOf(m0.b(view));
        }
    }

    @Override // f0.h0
    public final void c(View view, Object obj) {
        switch (this.f1364e) {
            case 0:
                m0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                m0.e(view, (CharSequence) obj);
                break;
            default:
                m0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // f0.h0
    public final boolean e(Object obj, Object obj2) {
        switch (this.f1364e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
