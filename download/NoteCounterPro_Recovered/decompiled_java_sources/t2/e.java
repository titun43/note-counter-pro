package t2;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.emoji2.text.u;
import androidx.fragment.app.e0;
import androidx.fragment.app.u0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3371c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f3372d = new e();

    public static AlertDialog e(Activity activity, int i5, w wVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i5 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(v.b(activity, i5));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i5 != 1 ? i5 != 2 ? i5 != 3 ? resources.getString(R.string.ok) : resources.getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_enable_button) : resources.getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_update_button) : resources.getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, wVar);
        }
        String c5 = v.c(activity, i5);
        if (c5 != null) {
            builder.setTitle(c5);
        }
        Log.w("GoogleApiAvailability", u.h(i5, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e0) {
                u0 supportFragmentManager = ((e0) activity).getSupportFragmentManager();
                j jVar = new j();
                b0.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f3380o0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f3381p0 = onCancelListener;
                }
                jVar.l0 = false;
                jVar.f432m0 = true;
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f315o = true;
                aVar.f(0, jVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        b0.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f3366g = alertDialog;
        if (onCancelListener != null) {
            cVar.h = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i5, GoogleApiActivity googleApiActivity2) {
        AlertDialog e4 = e(googleApiActivity, i5, new w(super.b(googleApiActivity, "d", i5), googleApiActivity, 0), googleApiActivity2);
        if (e4 == null) {
            return;
        }
        f(googleApiActivity, e4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i5, PendingIntent pendingIntent) {
        int i6;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", u.i(i5, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i5 == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i5 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e4 = i5 == 6 ? v.e(context, "common_google_play_services_resolution_required_title") : v.c(context, i5);
        if (e4 == null) {
            e4 = context.getResources().getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_notification_ticker);
        }
        String d5 = (i5 == 6 || i5 == 19) ? v.d(context, "common_google_play_services_resolution_required_text", v.a(context)) : v.b(context, i5);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        b0.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        u.p pVar = new u.p(context, null);
        pVar.f3483l = true;
        pVar.f3487p.flags |= 16;
        pVar.f3477e = u.p.b(e4);
        u.o oVar = new u.o();
        oVar.f3472b = u.p.b(d5);
        pVar.d(oVar);
        PackageManager packageManager = context.getPackageManager();
        if (x2.d.f3705b == null) {
            x2.d.f3705b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (x2.d.f3705b.booleanValue()) {
            pVar.f3487p.icon = context.getApplicationInfo().icon;
            pVar.f3480i = 2;
            if (x2.d.i(context)) {
                pVar.f3474b.add(new u.k(resources.getString(com.lokhnathtechnical.notecounterpro.R.string.common_open_on_phone), pendingIntent));
            } else {
                pVar.f3479g = pendingIntent;
            }
        } else {
            pVar.f3487p.icon = R.drawable.stat_sys_warning;
            pVar.f3487p.tickerText = u.p.b(resources.getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_notification_ticker));
            pVar.f3487p.when = System.currentTimeMillis();
            pVar.f3479g = pendingIntent;
            pVar.f3478f = u.p.b(d5);
        }
        if (x2.d.f()) {
            if (!x2.d.f()) {
                throw new IllegalStateException();
            }
            synchronized (f3371c) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.lokhnathtechnical.notecounterpro.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(g0.b.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            pVar.f3485n = "com.google.android.gms.availability";
        }
        Notification a5 = pVar.a();
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            h.f3375a.set(false);
            i6 = 10436;
        } else {
            i6 = 39789;
        }
        notificationManager.notify(i6, a5);
    }

    public final void h(Activity activity, com.google.android.gms.common.api.internal.i iVar, int i5, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e4 = e(activity, i5, new w(super.b(activity, "d", i5), iVar, 1), onCancelListener);
        if (e4 == null) {
            return;
        }
        f(activity, e4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
