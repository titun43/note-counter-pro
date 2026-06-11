package n0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* loaded from: classes.dex */
public final class g extends a.a {

    /* renamed from: m, reason: collision with root package name */
    public final f f2654m;

    public g(TextView textView) {
        this.f2654m = new f(textView);
    }

    @Override // a.a
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        return !(l.f262k != null) ? inputFilterArr : this.f2654m.k(inputFilterArr);
    }

    @Override // a.a
    public final void t(boolean z4) {
        if (l.f262k != null) {
            this.f2654m.t(z4);
        }
    }

    @Override // a.a
    public final void w(boolean z4) {
        f fVar = this.f2654m;
        if (l.f262k != null) {
            fVar.w(z4);
        } else {
            fVar.f2653o = z4;
        }
    }
}
