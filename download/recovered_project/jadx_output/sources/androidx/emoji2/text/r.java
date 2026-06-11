package androidx.emoji2.text;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class r implements q, d1.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f275g;
    public String h;

    @Override // d1.d
    public String a() {
        return this.h;
    }

    @Override // androidx.emoji2.text.q
    public Object c() {
        return this;
    }

    @Override // androidx.emoji2.text.q
    public boolean e(CharSequence charSequence, int i5, int i6, a0 a0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i5, i6), this.h)) {
            return true;
        }
        a0Var.f247c = (a0Var.f247c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f275g) {
            case 2:
                return "<" + this.h + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(String str, int i5) {
        this.f275g = i5;
        this.h = str;
    }

    @Override // d1.d
    public void b(e1.b bVar) {
    }
}
