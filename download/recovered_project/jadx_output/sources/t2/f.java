package t2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.u;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzbgj;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3373a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f3374b;

    static {
        int i5 = h.f3377c;
        f3373a = 12451000;
        f3374b = new f();
    }

    public static int a(Context context) {
        int i5 = h.f3377c;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, String str, int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && x2.d.i(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f3373a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(z2.c.a(context).c(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(15:50|(1:52)(1:147)|53|(4:139|140|(1:142)(1:145)|143)(1:55)|56|57|(1:59)(1:137)|60|61|129|80|(1:82)(2:(2:105|(1:107))|(4:113|(1:115)(1:132)|(1:117)|(1:119)(4:120|(2:126|127)|122|(1:124)(1:125)))(1:112))|83|(2:(5:86|87|88|89|(2:90|(2:92|(1:94)(1:95))(2:96|97)))|100)(0)|(1:102)(1:103)))|148|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|129|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x022d, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i5) {
        boolean z4;
        PackageInfo packageInfo;
        Bundle bundle;
        int i6 = h.f3377c;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z5 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f3376b.get()) {
            synchronized (b0.f1039a) {
                try {
                    if (!b0.f1040b) {
                        b0.f1040b = true;
                        try {
                            bundle = z2.c.a(context).b(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e4);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            b0.f1041c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i7 = b0.f1041c;
            if (i7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i7 != 12451000) {
                int i8 = f3373a;
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 104 + String.valueOf(i7).length() + 194);
                u.s(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i8, " but found ", i7);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        int i9 = 0;
        if (!x2.d.i(context)) {
            if (x2.d.f3708e == null) {
                x2.d.f3708e = Boolean.valueOf(x2.d.f() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!x2.d.f3708e.booleanValue()) {
                z4 = true;
                b0.b(i5 < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i10 = 9;
                if (z4) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                synchronized (i.class) {
                    if (i.h == null) {
                        l lVar = p.f3391a;
                        synchronized (p.class) {
                            if (p.f3393c == null) {
                                p.f3393c = context.getApplicationContext();
                            } else {
                                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                            }
                        }
                        i iVar = new i(i9);
                        context.getApplicationContext();
                        i.h = iVar;
                    }
                }
                if (i.B(packageInfo2)) {
                    if (z4) {
                        b0.g(packageInfo);
                        if (!i.B(packageInfo)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i11 = packageInfo2.versionCode;
                        if ((i11 == -1 ? -1 : i11 / zzbgj.zzq.zzf) < (i5 != -1 ? i5 / zzbgj.zzq.zzf : -1)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i5).length() + 11 + String.valueOf(i11).length());
                            sb2.append("Google Play services out of date for ");
                            sb2.append(packageName);
                            sb2.append(".  Requires ");
                            sb2.append(i5);
                            sb2.append(" but found ");
                            sb2.append(i11);
                            Log.w("GooglePlayServicesUtil", sb2.toString());
                            i10 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e5) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e5);
                                    i10 = 1;
                                    if (i10 != 18) {
                                    }
                                    if (z5) {
                                    }
                                }
                            }
                            i10 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                }
                if (i10 != 18) {
                    if (i10 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z5 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused3) {
                        }
                    }
                    z5 = false;
                }
                if (z5) {
                    return i10;
                }
                return 18;
            }
        }
        z4 = false;
        b0.b(i5 < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        int i102 = 9;
        if (z4) {
        }
        PackageInfo packageInfo22 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        synchronized (i.class) {
        }
    }
}
