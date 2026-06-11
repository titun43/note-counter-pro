package f0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class n {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i5) {
        return ((i5 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i5 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, v.a.obtainAndCheckReceiverPermission(context), handler);
    }

    public static Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i5) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i5);
    }

    public static void d(MenuItem menuItem, char c5, int i5) {
        menuItem.setAlphabeticShortcut(c5, i5);
    }

    public static void e(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void f(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void g(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void h(MenuItem menuItem, char c5, int i5) {
        menuItem.setNumericShortcut(c5, i5);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void j(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
