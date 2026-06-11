package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f253b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f254a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.f254a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
