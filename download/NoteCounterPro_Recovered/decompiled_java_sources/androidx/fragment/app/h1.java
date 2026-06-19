package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f390a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static final void a(int i5, View view, ViewGroup viewGroup) {
        g4.i.e(view, "view");
        g4.i.e(viewGroup, "container");
        if (u0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c5 = c(i5);
        if (c5 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (u0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (c5 == 1) {
            if (u0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (u0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (c5 == 2) {
            if (u0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (c5 != 3) {
            return;
        }
        if (u0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static String b(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static /* synthetic */ int c(int i5) {
        if (i5 != 0) {
            return i5 - 1;
        }
        throw null;
    }
}
