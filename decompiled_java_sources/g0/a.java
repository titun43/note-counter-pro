package g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: g, reason: collision with root package name */
    public final int f1659g;
    public final d h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1660i;

    public a(int i5, d dVar, int i6) {
        this.f1659g = i5;
        this.h = dVar;
        this.f1660i = i6;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1659g);
        this.h.f1668a.performAction(this.f1660i, bundle);
    }
}
