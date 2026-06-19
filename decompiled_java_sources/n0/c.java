package n0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2645a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2646b;

    public c(TextView textView, d dVar) {
        this.f2645a = new WeakReference(textView);
        this.f2646b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2645a.get();
        InputFilter inputFilter = (InputFilter) this.f2646b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    l a5 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a5.getClass();
                        length = text.length();
                    }
                    CharSequence e4 = a5.e(text, 0, length);
                    if (text == e4) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e4);
                    int selectionEnd = Selection.getSelectionEnd(e4);
                    textView.setText(e4);
                    if (e4 instanceof Spannable) {
                        Spannable spannable = (Spannable) e4;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
