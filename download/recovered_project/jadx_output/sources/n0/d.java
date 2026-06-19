package n0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2647a;

    /* renamed from: b, reason: collision with root package name */
    public c f2648b;

    public d(TextView textView) {
        this.f2647a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        TextView textView = this.f2647a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i8 == 0 && i7 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i5 != 0 || i6 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i5, i6);
                }
                return l.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        l a5 = l.a();
        if (this.f2648b == null) {
            this.f2648b = new c(textView, this);
        }
        a5.f(this.f2648b);
        return charSequence;
    }
}
