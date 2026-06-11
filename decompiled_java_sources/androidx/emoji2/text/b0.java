package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b0 extends ReplacementSpan {
    public final a0 h;

    /* renamed from: k, reason: collision with root package name */
    public TextPaint f251k;

    /* renamed from: g, reason: collision with root package name */
    public final Paint.FontMetricsInt f248g = new Paint.FontMetricsInt();

    /* renamed from: i, reason: collision with root package name */
    public short f249i = -1;

    /* renamed from: j, reason: collision with root package name */
    public float f250j = 1.0f;

    public b0(a0 a0Var) {
        y4.b.g(a0Var, "rasterizer cannot be null");
        this.h = a0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i5, i6, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f251k;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f251k = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f5, i7, f5 + this.f249i, i9, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        l.a().getClass();
        float f6 = i8;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        a0 a0Var = this.h;
        r1.h hVar = a0Var.f246b;
        Typeface typeface = (Typeface) hVar.f3163j;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) hVar.h, a0Var.f245a * 2, 2, f5, f6, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f248g;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        a0 a0Var = this.h;
        this.f250j = abs / (a0Var.b().a(14) != 0 ? ((ByteBuffer) r8.f1377d).getShort(r1 + r8.f1374a) : (short) 0);
        m0.a b2 = a0Var.b();
        int a5 = b2.a(14);
        if (a5 != 0) {
            ((ByteBuffer) b2.f1377d).getShort(a5 + b2.f1374a);
        }
        short s5 = (short) ((a0Var.b().a(12) != 0 ? ((ByteBuffer) r5.f1377d).getShort(r7 + r5.f1374a) : (short) 0) * this.f250j);
        this.f249i = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}
