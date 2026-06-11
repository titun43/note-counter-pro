package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class k extends a0 implements m {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f2133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f2133j = lVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        z2.b.z(this, getContentDescription());
        setOnTouchListener(new j.b(this, this));
    }

    @Override // k.m
    public final boolean a() {
        return false;
    }

    @Override // k.m
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f2133j.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i5, int i6, int i7, int i8) {
        boolean frame = super.setFrame(i5, i6, i7, i8);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
