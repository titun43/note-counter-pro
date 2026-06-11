package d0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1182d;

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i5, int i6) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = androidx.emoji2.text.b.j(textPaint).setBreakStrategy(i5);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i6);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f1179a = textPaint;
        this.f1180b = textDirectionHeuristic;
        this.f1181c = i5;
        this.f1182d = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1181c != aVar.f1181c || this.f1182d != aVar.f1182d) {
            return false;
        }
        TextPaint textPaint = this.f1179a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = aVar.f1179a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f1180b == aVar.f1180b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1179a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1180b, Integer.valueOf(this.f1181c), Integer.valueOf(this.f1182d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1179a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i5 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i5 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f1180b);
        sb.append(", breakStrategy=" + this.f1181c);
        sb.append(", hyphenationFrequency=" + this.f1182d);
        sb.append("}");
        return sb.toString();
    }

    public a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f1179a = textPaint;
        textDirection = params.getTextDirection();
        this.f1180b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f1181c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f1182d = hyphenationFrequency;
    }
}
