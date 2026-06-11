package v;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import b0.d;
import b0.g;
import f0.n;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import u.e;
import u.v;
import x.c;
import x.h;
import x.i;
import x.k;

/* loaded from: classes.dex */
public abstract class a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new v(context).f3490a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? b0.a.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b0.a.c(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int i5) {
        return context.getColor(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f3677c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList getColorStateList(Context context, int i5) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h hVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        i iVar = new i(resources, theme);
        synchronized (k.f3682c) {
            try {
                SparseArray sparseArray = (SparseArray) k.f3681b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h) sparseArray.get(i5)) != null) {
                    if (hVar.f3676b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (hVar.f3677c != 0) {
                            }
                            colorStateList2 = hVar.f3675a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i5);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = k.f3680a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i5, typedValue, true);
        int i6 = typedValue.type;
        if (i6 < 28 || i6 > 31) {
            try {
                colorStateList = c.a(resources, resources.getXml(i5), theme);
            } catch (Exception e4) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i5, theme);
        }
        synchronized (k.f3682c) {
            try {
                WeakHashMap weakHashMap = k.f3681b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i5, new h(colorStateList, iVar.f3678a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Context getContextForLanguage(Context context) {
        g a5;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            Object systemService = context.getSystemService("locale");
            a5 = systemService != null ? new g(new b0.h(u.i.a(systemService))) : g.f688b;
        } else {
            a5 = g.a(e.e(context));
        }
        if (i5 > 32 || a5.b()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocales(a5.f689a.f690a);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return context.getDataDir();
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? b0.a.d(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i5) {
        return context.getDrawable(i5);
    }

    @Deprecated
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? b0.e.e(context) : new d(new Handler(context.getMainLooper()), 0);
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    @Deprecated
    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i5) {
        return getContextForLanguage(context).getString(i5);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String opPackageName;
        String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (b3.g.e(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sb = new StringBuilder();
            opPackageName = context.getOpPackageName();
            sb.append(opPackageName);
            sb.append(DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX);
            str = sb.toString();
            if (b3.g.e(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException(s.c.b("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i5) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i5);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    @Deprecated
    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            n.j(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i5) {
        int i6 = i5 & 1;
        if (i6 != 0 && (i5 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i6 != 0) {
            i5 |= 2;
        }
        int i7 = i5;
        int i8 = i7 & 2;
        if (i8 == 0 && (i7 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i9 = Build.VERSION.SDK_INT;
        return i9 >= 33 ? n.c(context, broadcastReceiver, intentFilter, str, handler, i7) : i9 >= 26 ? n.b(context, broadcastReceiver, intentFilter, str, handler, i7) : ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
