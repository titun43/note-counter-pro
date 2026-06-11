package n0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.l;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: g, reason: collision with root package name */
    public final EditText f2656g;
    public h h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2657i = true;

    public i(EditText editText) {
        this.f2656g = editText;
    }

    public static void a(EditText editText, int i5) {
        int length;
        if (i5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a5 = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                a5.getClass();
                length = editableText.length();
            }
            a5.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        EditText editText = this.f2656g;
        if (editText.isInEditMode() || !this.f2657i || l.f262k == null || i6 > i7 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                l.a().e((Spannable) charSequence, i5, i7 + i5);
                return;
            } else if (b2 != 3) {
                return;
            }
        }
        l a5 = l.a();
        if (this.h == null) {
            this.h = new h(editText);
        }
        a5.f(this.h);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }
}
