package k;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class x extends EditText implements f0.u {

    /* renamed from: g, reason: collision with root package name */
    public final q f2270g;
    public final z0 h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f2271i;

    /* renamed from: j, reason: collision with root package name */
    public final i0.j f2272j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f2273k;

    /* renamed from: l, reason: collision with root package name */
    public w f2274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        t2.a(context);
        s2.a(this, getContext());
        q qVar = new q(this);
        this.f2270g = qVar;
        qVar.d(attributeSet, R.attr.editTextStyle);
        z0 z0Var = new z0(this);
        this.h = z0Var;
        z0Var.f(attributeSet, R.attr.editTextStyle);
        z0Var.b();
        d0 d0Var = new d0();
        d0Var.f2041b = this;
        this.f2271i = d0Var;
        this.f2272j = new i0.j();
        d0 d0Var2 = new d0(this);
        this.f2273k = d0Var2;
        d0Var2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a5 = d0Var2.a(keyListener);
        if (a5 == keyListener) {
            return;
        }
        super.setKeyListener(a5);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private w getSuperCaller() {
        if (this.f2274l == null) {
            this.f2274l = new w(this);
        }
        return this.f2274l;
    }

    @Override // f0.u
    public final f0.f a(f0.f fVar) {
        this.f2272j.getClass();
        return i0.j.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f2270g;
        if (qVar != null) {
            qVar.a();
        }
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return z2.b.C(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f2270g;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f2270g;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        d0 d0Var;
        if (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f2271i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) d0Var.f2042c;
        return textClassifier == null ? t0.a((TextView) d0Var.f2041b) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i5;
        String[] e4;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.h.getClass();
        z0.h(editorInfo, onCreateInputConnection, this);
        y4.b.B(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i5 = Build.VERSION.SDK_INT) <= 30 && (e4 = f0.r0.e(this)) != null) {
            if (i5 >= 25) {
                editorInfo.contentMimeTypes = e4;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", e4);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", e4);
            }
            com.getcapacitor.plugin.c cVar = new com.getcapacitor.plugin.c(this, 4);
            if (i5 >= 25) {
                eVar = new h0.d(onCreateInputConnection, cVar);
            } else {
                String[] strArr = h0.c.f1706a;
                if (i5 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new h0.e(onCreateInputConnection, cVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f2273k.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 || i5 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && f0.r0.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z4 = g0.a(dragEvent, this, activity);
            }
        }
        if (z4) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i5) {
        f0.c cVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31 || f0.r0.e(this) == null || !(i5 == 16908322 || i5 == 16908337)) {
            return super.onTextContextMenuItem(i5);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i6 >= 31) {
                cVar = new u1.f(primaryClip, 1);
            } else {
                f0.d dVar = new f0.d();
                dVar.h = primaryClip;
                dVar.f1342i = 1;
                cVar = dVar;
            }
            cVar.h(i5 == 16908322 ? 0 : 1);
            f0.r0.g(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f2270g;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.f2270g;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z2.b.D(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f2273k.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2273k.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f2270g;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2270g;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.h;
        z0Var.l(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.h;
        z0Var.m(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        z0 z0Var = this.h;
        if (z0Var != null) {
            z0Var.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        d0 d0Var;
        if (Build.VERSION.SDK_INT >= 28 || (d0Var = this.f2271i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            d0Var.f2042c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
