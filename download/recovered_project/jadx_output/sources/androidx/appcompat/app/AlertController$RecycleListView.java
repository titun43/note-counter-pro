package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: g, reason: collision with root package name */
    public final int f72g;
    public final int h;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1328t);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f72g = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
