package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.c0;

/* loaded from: classes.dex */
public final class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1746a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1747b;

    public f(Context context, b bVar) {
        this.f1746a = context;
        this.f1747b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1747b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1747b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new c0(this.f1746a, this.f1747b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1747b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1747b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1747b.f1733g;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1747b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1747b.h;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1747b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1747b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1747b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1747b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1747b.f1733g = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1747b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f1747b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i5) {
        this.f1747b.l(i5);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i5) {
        this.f1747b.n(i5);
    }
}
