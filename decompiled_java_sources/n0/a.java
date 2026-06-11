package n0;

import android.text.Editable;
import androidx.emoji2.text.z;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2640a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f2641b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2642c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f2642c;
        return cls != null ? new z(cls, charSequence) : super.newEditable(charSequence);
    }
}
