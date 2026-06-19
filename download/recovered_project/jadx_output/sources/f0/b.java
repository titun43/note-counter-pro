package f0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1336c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1337a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1338b;

    public b() {
        this(f1336c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1337a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, g0.d dVar) {
        this.f1337a.onInitializeAccessibilityNodeInfo(view, dVar.f1668a);
    }

    public boolean c(View view, int i5, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i6 = 0; i6 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((g0.c) list.get(i6)).f1665a).getId() != i5; i6++) {
        }
        boolean performAccessibilityAction = this.f1337a.performAccessibilityAction(view, i5, bundle);
        if (performAccessibilityAction || i5 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i7 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i7)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i8 = 0; clickableSpanArr != null && i8 < clickableSpanArr.length; i8++) {
                if (clickableSpan.equals(clickableSpanArr[i8])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1337a = accessibilityDelegate;
        this.f1338b = new a(this);
    }
}
