package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class h0 extends SeekBar {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f2102g;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        s2.a(this, getContext());
        i0 i0Var = new i0(this);
        this.f2102g = i0Var;
        i0Var.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        i0 i0Var = this.f2102g;
        h0 h0Var = i0Var.f2110e;
        Drawable drawable = i0Var.f2111f;
        if (drawable != null && drawable.isStateful() && drawable.setState(h0Var.getDrawableState())) {
            h0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2102g.f2111f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2102g.g(canvas);
    }
}
