package k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2275a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.f f2276b;

    public y(TextView textView) {
        this.f2275a = textView;
        this.f2276b = new u1.f(textView);
    }

    public final void a(AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = this.f2275a.getContext().obtainStyledAttributes(attributeSet, f.a.f1317i, i5, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z4) {
        ((a.a) this.f2276b.h).t(z4);
    }

    public final void c(boolean z4) {
        ((a.a) this.f2276b.h).w(z4);
    }
}
