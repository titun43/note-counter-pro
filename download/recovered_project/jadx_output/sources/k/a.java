package k;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class a implements f0.x0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2022a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2024c;

    public a(ActionBarContextView actionBarContextView) {
        this.f2024c = actionBarContextView;
    }

    @Override // f0.x0
    public final void a() {
        this.f2022a = true;
    }

    @Override // f0.x0
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f2022a = false;
    }

    @Override // f0.x0
    public final void c() {
        if (this.f2022a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2024c;
        actionBarContextView.f111l = null;
        super/*android.view.View*/.setVisibility(this.f2023b);
    }
}
