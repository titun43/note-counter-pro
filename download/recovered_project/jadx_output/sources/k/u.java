package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f2239a = null;

    /* renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f2240b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2241c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2242d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f2244f;

    public /* synthetic */ u(TextView textView) {
        this.f2244f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f2244f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f2241c || this.f2242d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f2241c) {
                    mutate.setTintList(this.f2239a);
                }
                if (this.f2242d) {
                    mutate.setTintMode(this.f2240b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        t tVar = (t) this.f2244f;
        Drawable checkMarkDrawable = tVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2241c || this.f2242d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2241c) {
                    mutate.setTintList(this.f2239a);
                }
                if (this.f2242d) {
                    mutate.setTintMode(this.f2240b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(tVar.getDrawableState());
                }
                tVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(AttributeSet attributeSet, int i5) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f2244f;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f1321m;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, i5);
        TypedArray typedArray = (TypedArray) r2.f284i;
        f0.r0.h(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) r2.f284i, i5, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(b3.g.t(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(r2.k(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(n1.b(typedArray.getInt(3, -1), null));
                }
                r2.u();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(b3.g.t(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            r2.u();
        } catch (Throwable th) {
            r2.u();
            throw th;
        }
    }
}
