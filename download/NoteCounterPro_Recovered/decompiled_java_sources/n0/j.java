package n0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: g, reason: collision with root package name */
    public final TransformationMethod f2658g;

    public j(TransformationMethod transformationMethod) {
        this.f2658g = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2658g;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l.a().b() != 1) {
            return charSequence;
        }
        l a5 = l.a();
        a5.getClass();
        return a5.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i5, Rect rect) {
        TransformationMethod transformationMethod = this.f2658g;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i5, rect);
        }
    }
}
