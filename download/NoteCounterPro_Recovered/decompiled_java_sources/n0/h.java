package n0;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2655a;

    public h(EditText editText) {
        this.f2655a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        i.a((EditText) this.f2655a.get(), 1);
    }
}
