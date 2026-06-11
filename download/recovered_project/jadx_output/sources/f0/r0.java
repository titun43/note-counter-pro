package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f1407a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f1408b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1409c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f1410d = new e0();

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f1411e = new g0();

    public static w0 a(View view) {
        if (f1407a == null) {
            f1407a = new WeakHashMap();
        }
        w0 w0Var = (w0) f1407a.get(view);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(view);
        f1407a.put(view, w0Var2);
        return w0Var2;
    }

    public static void b(View view, q1 q1Var) {
        int i5 = Build.VERSION.SDK_INT;
        WindowInsets f5 = q1Var.f();
        if (f5 != null) {
            WindowInsets a5 = i5 >= 30 ? o0.a(view, f5) : i0.a(view, f5);
            if (a5.equals(f5)) {
                return;
            }
            q1.g(a5, view);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = q0.f1401d;
        q0 q0Var = (q0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (q0Var == null) {
            q0Var = new q0();
            q0Var.f1402a = null;
            q0Var.f1403b = null;
            q0Var.f1404c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = q0Var.f1402a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = q0.f1401d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (q0Var.f1402a == null) {
                            q0Var.f1402a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = q0.f1401d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                q0Var.f1402a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    q0Var.f1402a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a5 = q0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a5 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (q0Var.f1403b == null) {
                    q0Var.f1403b = new SparseArray();
                }
                q0Var.f1403b.put(keyCode, new WeakReference(a5));
            }
        }
        return a5 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n0.a(view);
        }
        if (f1409c) {
            return null;
        }
        if (f1408b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1408b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1409c = true;
                return null;
            }
        }
        try {
            Object obj = f1408b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1409c = true;
            return null;
        }
    }

    public static String[] e(k.x xVar) {
        return Build.VERSION.SDK_INT >= 31 ? p0.a(xVar) : (String[]) xVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i5) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i6 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i6 >= 28) {
                tag = m0.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z4 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i5);
                if (z4) {
                    List<CharSequence> text = obtain.getText();
                    if (i6 >= 28) {
                        charSequence = m0.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i5 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i5);
                        return;
                    } catch (AbstractMethodError e4) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i5);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i6 >= 28) {
                charSequence = m0.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f g(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p0.b(view, fVar);
        }
        i0.j jVar = (i0.j) view.getTag(R.id.tag_on_receive_content_listener);
        u uVar = f1410d;
        if (jVar == null) {
            if (view instanceof u) {
                uVar = (u) view;
            }
            return uVar.a(fVar);
        }
        f a5 = i0.j.a(view, fVar);
        if (a5 == null) {
            return null;
        }
        if (view instanceof u) {
            uVar = (u) view;
        }
        return uVar.a(a5);
    }

    public static void h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            n0.b(view, context, iArr, attributeSet, typedArray, i5, i6);
        }
    }

    public static void i(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f1338b);
    }

    public static void j(View view, CharSequence charSequence) {
        new f0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        g0 g0Var = f1411e;
        if (charSequence == null) {
            g0Var.f1366g.remove(view);
            view.removeOnAttachStateChangeListener(g0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(g0Var);
        } else {
            g0Var.f1366g.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g0Var);
            }
        }
    }
}
