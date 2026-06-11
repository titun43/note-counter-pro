package f0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class w implements x {

    /* renamed from: g, reason: collision with root package name */
    public final ScrollFeedbackProvider f1425g;

    public w(NestedScrollView nestedScrollView) {
        this.f1425g = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // f0.x
    public final void d(boolean z4, int i5, int i6, int i7) {
        this.f1425g.onScrollLimit(i5, i6, i7, z4);
    }

    @Override // f0.x
    public final void onScrollProgress(int i5, int i6, int i7, int i8) {
        this.f1425g.onScrollProgress(i5, i6, i7, i8);
    }
}
