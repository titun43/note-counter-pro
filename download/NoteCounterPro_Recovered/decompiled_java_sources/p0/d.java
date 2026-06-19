package p0;

import android.view.ViewGroup;
import androidx.fragment.app.z;
import g4.i;

/* loaded from: classes.dex */
public final class d extends e {
    public final ViewGroup h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z zVar, ViewGroup viewGroup, int i5) {
        super(zVar, "Attempting to use <fragment> tag to add fragment " + zVar + " to container " + viewGroup);
        switch (i5) {
            case 1:
                i.e(zVar, "fragment");
                super(zVar, "Attempting to add fragment " + zVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.h = viewGroup;
                break;
            default:
                this.h = viewGroup;
                break;
        }
    }
}
