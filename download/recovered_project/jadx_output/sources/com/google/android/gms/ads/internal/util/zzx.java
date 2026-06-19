package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbhe;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (displayCutout != null) {
                zzg zzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    Locale locale = Locale.US;
                    int i5 = rect.left;
                    int i6 = rect.top;
                    int i7 = rect.right;
                    int i8 = rect.bottom;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i5);
                    sb.append(",");
                    sb.append(i6);
                    sb.append(",");
                    sb.append(i7);
                    String l5 = u.l(sb, ",", i8);
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(l5);
                }
                zzo.zzv(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzv(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z4, Activity activity) {
        int i5;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i5 = attributes.layoutInDisplayCutoutMode;
        int i6 = true != z4 ? 2 : 1;
        if (i6 != i5) {
            attributes.layoutInDisplayCutoutMode = i6;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzj(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbM)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzu() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzk(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
