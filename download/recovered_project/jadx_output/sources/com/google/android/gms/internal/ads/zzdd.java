package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes.dex */
public final class zzdd {
    public static void zza(Spannable spannable, Object obj, int i5, int i6, int i7) {
        for (Object obj2 : spannable.getSpans(i5, i6, obj.getClass())) {
            zzc(spannable, obj2, i5, i6, 33);
        }
        spannable.setSpan(obj, i5, i6, 33);
    }

    public static void zzb(Spannable spannable, float f5, int i5, int i6, int i7) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i5, i6, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i5 && spannable.getSpanEnd(relativeSizeSpan) >= i6) {
                f5 = relativeSizeSpan.getSizeChange() * f5;
            }
            zzc(spannable, relativeSizeSpan, i5, i6, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f5), i5, i6, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i5, int i6, int i7) {
        if (spannable.getSpanStart(obj) == i5 && spannable.getSpanEnd(obj) == i6 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
