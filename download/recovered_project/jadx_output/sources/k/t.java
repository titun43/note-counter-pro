package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class t extends CheckedTextView {

    /* renamed from: g, reason: collision with root package name */
    public final u f2224g;
    public final q h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f2225i;

    /* renamed from: j, reason: collision with root package name */
    public y f2226j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        t2.a(context);
        s2.a(this, getContext());
        z0 z0Var = new z0(this);
        this.f2225i = z0Var;
        z0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        z0Var.b();
        q qVar = new q(this);
        this.h = qVar;
        qVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f2224g = new u(this);
        Context context2 = getContext();
        int[] iArr = f.a.f1320l;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) r2.f284i;
        f0.r0.h(this, getContext(), iArr, attributeSet, (TypedArray) r2.f284i, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(b3.g.t(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(r2.k(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(n1.b(typedArray.getInt(3, -1), null));
                }
                r2.u();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(b3.g.t(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            r2.u();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            r2.u();
            throw th;
        }
    }

    private y getEmojiTextViewHelper() {
        if (this.f2226j == null) {
            this.f2226j = new y(this);
        }
        return this.f2226j;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z0 z0Var = this.f2225i;
        if (z0Var != null) {
            z0Var.b();
        }
        q qVar = this.h;
        if (qVar != null) {
            qVar.a();
        }
        u uVar = this.f2224g;
        if (uVar != null) {
            uVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return z2.b.C(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.h;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.h;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        u uVar = this.f2224g;
        if (uVar != null) {
            return uVar.f2239a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        u uVar = this.f2224g;
        if (uVar != null) {
            return uVar.f2240b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2225i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2225i.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y4.b.B(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().b(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.h;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        q qVar = this.h;
        if (qVar != null) {
            qVar.f(i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        u uVar = this.f2224g;
        if (uVar != null) {
            if (uVar.f2243e) {
                uVar.f2243e = false;
            } else {
                uVar.f2243e = true;
                uVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f2225i;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z0 z0Var = this.f2225i;
        if (z0Var != null) {
            z0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z2.b.D(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().c(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.h;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.h;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        u uVar = this.f2224g;
        if (uVar != null) {
            uVar.f2239a = colorStateList;
            uVar.f2241c = true;
            uVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        u uVar = this.f2224g;
        if (uVar != null) {
            uVar.f2240b = mode;
            uVar.f2242d = true;
            uVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        z0 z0Var = this.f2225i;
        z0Var.l(colorStateList);
        z0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        z0 z0Var = this.f2225i;
        z0Var.m(mode);
        z0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        z0 z0Var = this.f2225i;
        if (z0Var != null) {
            z0Var.g(context, i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i5) {
        setCheckMarkDrawable(b3.g.t(getContext(), i5));
    }
}
