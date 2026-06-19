package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2038g;
    public final /* synthetic */ ActionBarOverlayLayout h;

    public /* synthetic */ d(ActionBarOverlayLayout actionBarOverlayLayout, int i5) {
        this.f2038g = i5;
        this.h = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2038g) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.h;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.C = actionBarOverlayLayout.f127j.animate().translationY(0.0f).setListener(actionBarOverlayLayout.D);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.h;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.C = actionBarOverlayLayout2.f127j.animate().translationY(-actionBarOverlayLayout2.f127j.getHeight()).setListener(actionBarOverlayLayout2.D);
                break;
        }
    }
}
