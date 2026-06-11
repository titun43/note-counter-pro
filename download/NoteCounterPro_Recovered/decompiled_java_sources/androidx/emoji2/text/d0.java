package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class d0 implements Spannable {

    /* renamed from: g, reason: collision with root package name */
    public boolean f252g = false;
    public Spannable h;

    public d0(Spannable spannable) {
        this.h = spannable;
    }

    public final void a() {
        Spannable spannable = this.h;
        if (!this.f252g) {
            if ((Build.VERSION.SDK_INT < 28 ? new t2.i(4) : new c0(4)).u(spannable)) {
                this.h = new SpannableString(spannable);
            }
        }
        this.f252g = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.h.charAt(i5);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.h.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.h.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.h.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.h.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.h.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i5, int i6, Class cls) {
        return this.h.getSpans(i5, i6, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.h.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i5, int i6, Class cls) {
        return this.h.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.h.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i5, int i6, int i7) {
        a();
        this.h.setSpan(obj, i5, i6, i7);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i6) {
        return this.h.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.h.toString();
    }
}
