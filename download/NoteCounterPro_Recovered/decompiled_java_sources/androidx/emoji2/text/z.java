package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z extends SpannableStringBuilder {

    /* renamed from: g, reason: collision with root package name */
    public final Class f300g;
    public final ArrayList h;

    public z(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.h = new ArrayList();
        y4.b.g(cls, "watcherClass cannot be null");
        this.f300g = cls;
    }

    public final void a() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i5)).h.incrementAndGet();
            i5++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i5)).onTextChanged(this, 0, length(), length());
            i5++;
        }
    }

    public final y c(Object obj) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                return null;
            }
            y yVar = (y) arrayList.get(i5);
            if (yVar.f299g == obj) {
                return yVar;
            }
            i5++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f300g == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i5, int i6) {
        super.delete(i5, i6);
        return this;
    }

    public final void e() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i5)).h.decrementAndGet();
            i5++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        y c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        y c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        y c5;
        if (d(obj) && (c5 = c(obj)) != null) {
            obj = c5;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i5, int i6, Class cls) {
        if (this.f300g != cls) {
            return super.getSpans(i5, i6, cls);
        }
        y[] yVarArr = (y[]) super.getSpans(i5, i6, y.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, yVarArr.length);
        for (int i7 = 0; i7 < yVarArr.length; i7++) {
            objArr[i7] = yVarArr[i7].f299g;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i5, CharSequence charSequence) {
        super.insert(i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i5, int i6, Class cls) {
        if (cls == null || this.f300g == cls) {
            cls = y.class;
        }
        return super.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        y yVar;
        if (d(obj)) {
            yVar = c(obj);
            if (yVar != null) {
                obj = yVar;
            }
        } else {
            yVar = null;
        }
        super.removeSpan(obj);
        if (yVar != null) {
            this.h.remove(yVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i5, int i6, CharSequence charSequence) {
        replace(i5, i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i5, int i6, int i7) {
        if (d(obj)) {
            y yVar = new y(obj);
            this.h.add(yVar);
            obj = yVar;
        }
        super.setSpan(obj, i5, i6, i7);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i6) {
        return new z(this.f300g, this, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i5, int i6) {
        super.delete(i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i5, CharSequence charSequence) {
        super.insert(i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i5, int i6, CharSequence charSequence, int i7, int i8) {
        replace(i5, i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i5, CharSequence charSequence, int i6, int i7) {
        super.insert(i5, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i5, int i6, CharSequence charSequence) {
        a();
        super.replace(i5, i6, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i5, CharSequence charSequence, int i6, int i7) {
        super.insert(i5, charSequence, i6, i7);
        return this;
    }

    public z(Class cls, z zVar, int i5, int i6) {
        super(zVar, i5, i6);
        this.h = new ArrayList();
        y4.b.g(cls, "watcherClass cannot be null");
        this.f300g = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i5, int i6, CharSequence charSequence, int i7, int i8) {
        a();
        super.replace(i5, i6, charSequence, i7, i8);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i5, int i6) {
        super.append(charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i5, int i6) {
        super.append(charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i6) {
        super.append(charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i5) {
        super.append(charSequence, obj, i5);
        return this;
    }
}
