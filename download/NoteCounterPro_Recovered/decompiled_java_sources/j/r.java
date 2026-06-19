package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class r extends FrameLayout implements i.c {

    /* renamed from: g, reason: collision with root package name */
    public final CollapsibleActionView f1993g;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view) {
        super(view.getContext());
        this.f1993g = (CollapsibleActionView) view;
        addView(view);
    }
}
