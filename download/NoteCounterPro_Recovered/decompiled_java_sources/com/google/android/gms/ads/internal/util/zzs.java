package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.activity.t;
import androidx.emoji2.text.p;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import com.getcapacitor.PluginMethod;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjc;
import com.google.android.gms.internal.ads.zzcks;
import com.google.android.gms.internal.ads.zzcln;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfiu;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgrr;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzikw;
import f0.z;
import j3.a;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import n.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.h;
import x2.d;
import z2.c;

/* loaded from: classes.dex */
public final class zzs {
    public static final zzfyn zza = new zzf(Looper.getMainLooper());
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzA(View view) {
        float f5 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f5 = Math.min(f5, view2.getAlpha());
            view = view2.getParent();
        } while (f5 > 0.0f);
        return Math.round((f5 >= 0.0f ? f5 : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzB(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e4);
        }
        return null;
    }

    public static final int zzC(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof z) {
                return 4;
            }
        }
        return 0;
    }

    public static final String zzD() {
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        return zzf != null ? zzf.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbo zzE(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder);
            }
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzF(Context context, String str) {
        Context zza2 = zzcae.zza(context);
        return c.a(zza2).f1474g.getPackageManager().checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzG(Context context) {
        try {
            if (d.f3710g == null) {
                d.f3710g = Boolean.valueOf(d.g() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return d.f3710g.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzH(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgf)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgh);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgg);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        KeyguardManager zzaf;
        return (context == null || (zzaf = zzaf(context)) == null || !zzaf.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzJ(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzK() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzL(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzM(Context context) {
        try {
            Bundle zzai = zzai(context);
            String string = zzai.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzah(zzai))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzN(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzO(View view, int i5, MotionEvent motionEvent) {
        String str;
        int i6;
        int i7;
        int i8;
        String str2;
        String str3;
        String str4;
        zzfir zzC;
        zzfiu zzaC;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof zzduy) {
                view2 = ((zzduy) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzh) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i6 = 1;
            } else {
                str = "UNKNOWN";
                i6 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i8 = rect.width();
                i7 = rect.height();
            } else {
                i7 = 0;
                i8 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long zzA = zzA(view2);
            view2.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            boolean z4 = view2 instanceof zzcks;
            String str5 = PluginMethod.RETURN_NONE;
            if (!z4 || (zzaC = ((zzcks) view2).zzaC()) == null) {
                str2 = str;
                str3 = PluginMethod.RETURN_NONE;
            } else {
                str3 = zzaC.zzb;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof zzcjc) || (zzC = ((zzcjc) view2).zzC()) == null) {
                str4 = str2;
            } else {
                str4 = zzfir.zza(zzC.zzb);
                i6 = zzC.zze;
                str5 = zzC.zzE;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i6 + ", class=" + view2.getClass().getName() + ", x=" + i9 + ", y=" + i10 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i8 + ", vHeight=" + i7 + ", alpha=" + zzA + ", state=" + Integer.toString(i5, 2) + ">";
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str6);
        } catch (Exception e4) {
            int i12 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e4);
        }
    }

    public static final AlertDialog.Builder zzP(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzQ(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzR(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzbjn.zzb.zze()).booleanValue()) {
                d.a(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final void zzS(Context context, zzfir zzfirVar, zzdxz zzdxzVar) {
        zzdxy zza2 = zzdxzVar.zza();
        zza2.zzc("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        zza2.zzc("foreground", true != zzL(context) ? "1" : "0");
        zza2.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
        if (zzfirVar != null) {
            List list = zzfirVar.zzt;
            if (!list.isEmpty()) {
                zza2.zzc("ancn", (String) list.get(0));
            }
            zza2.zzc("ad_format", zzfir.zza(zzfirVar.zzb));
        }
        zza2.zzd();
    }

    public static final boolean zzT(zzfir zzfirVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoX)).booleanValue() && zzfirVar != null && zzfirVar.zze == 4;
    }

    public static final int zzU(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            String concat = "Could not parse value:".concat(e4.toString());
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return 0;
        }
    }

    public static final Map zzV(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzt)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i5 = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i5);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i5);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i5, indexOf2)), indexOf2 == length ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i5 = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] zzX(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzY(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] zzy = (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? zzy() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, zzy[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, zzy[1])};
    }

    public static final boolean zzZ(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z4 = com.google.android.gms.ads.internal.zzt.zzc().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzq(view);
        long zzA = zzA(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z4)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbS)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzma)).booleanValue()) {
            if (zzA < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmc)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static int zza(int i5) {
        if (i5 >= 5000) {
            return i5;
        }
        if (i5 <= 0) {
            return 60000;
        }
        String m5 = u.m(new StringBuilder(String.valueOf(i5).length() + 86), "HTTP timeout too low: ", i5, " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i6 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(m5);
        return 60000;
    }

    public static final void zzaa(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmx)).booleanValue()) {
            zzal(context, intent);
            return;
        }
        try {
            zzal(context, intent);
        } catch (SecurityException e4) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzab(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzs(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        } catch (ActivityNotFoundException e4) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e4);
        }
    }

    public static final int[] zzac(Activity activity) {
        int[] zzX = zzX(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, zzX[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(activity, zzX[1])};
    }

    public static final boolean zzad(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzZ(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzaf(context));
    }

    public static final void zzae(Context context, Intent intent, zzdxz zzdxzVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoC)).booleanValue() || !(context instanceof zzcln)) {
            zzaa(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoE))) {
                    ((zzcln) context).zza(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoD)).booleanValue() || zzdxzVar == null) {
                        return;
                    }
                    zzdxy zza2 = zzdxzVar.zza();
                    zza2.zzc("action", "hila");
                    zza2.zzc("gqi", zzgrt.zza(str));
                    zza2.zzf();
                    return;
                }
            }
            zzaa(context, intent);
        } catch (ActivityNotFoundException e4) {
            e = e4;
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        } catch (SecurityException e5) {
            e = e5;
            int i52 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        } catch (Exception e6) {
            int i6 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e6);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e6, "AdUtil.startActivityForResult");
            zzaa(context, intent);
        }
    }

    private static KeyguardManager zzaf(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static boolean zzag(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static String zzah(Bundle bundle) {
        if (bundle == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    private static Bundle zzai(Context context) {
        try {
            return c.a(context).b(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            zze.zzb("Error getting metadata", e4);
            return null;
        }
    }

    private static final void zzaj(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzak(l lVar, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i5 = bundle.getInt("h", -1);
        if (i5 >= 0) {
            Intent intent = lVar.f2632a;
            if (i5 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i5);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i6 = bundle.getInt("cbp", -1);
        if (i6 < 0 || i6 > 2) {
            return;
        }
        lVar.getClass();
        if (i6 < 0 || i6 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        lVar.f2632a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i6);
    }

    private static final void zzal(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzam(final Context context, String str) {
        final Context context2;
        if (str == null) {
            return zzu();
        }
        String str2 = null;
        try {
            zzce zza2 = zzce.zza();
            if (TextUtils.isEmpty(zza2.zza)) {
                int i5 = h.f3377c;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                zza2.zza = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        SharedPreferences sharedPreferences;
                        Context context3 = context2;
                        Context context4 = context;
                        boolean z4 = false;
                        if (context3 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context4.getSharedPreferences("admob_user_agent", 0);
                            z4 = true;
                        }
                        String string = sharedPreferences.getString("user_agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(string)) {
                            return string;
                        }
                        zze.zza("Reading user agent from WebSettings");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context4);
                        if (z4) {
                            sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            zze.zza("Persisting user agent.");
                        }
                        return defaultUserAgent;
                    }
                });
            }
            str2 = zza2.zza;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = zzu();
        }
        String b2 = h1.b(new StringBuilder(String.valueOf(str2).length() + 10 + str.length()), str2, " (Mobile; ", str);
        try {
            if (c.a(context).d()) {
                StringBuilder sb = new StringBuilder(b2.length() + 4);
                sb.append(b2);
                sb.append(";aia");
                b2 = sb.toString();
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdUtil.getUserAgent");
        }
        return b2.concat(")");
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcei.zza.execute(runnable);
        }
    }

    public static List zzk() {
        zzbgv zzbgvVar = zzbhe.zza;
        List zzf = com.google.android.gms.ads.internal.client.zzbd.zzb().zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzgrr.zza(zzgqq.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static String zzl(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            charArray[i5] = (char) (charArray[i5] ^ str2.charAt(i5 % str2.length()));
        }
        return new String(charArray);
    }

    public static zzq zzm(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager c5 = t.c(context.getSystemService(t.l()));
        if (c5 == null) {
            return zzqVar;
        }
        systemLocales = c5.getSystemLocales();
        if (systemLocales.isEmpty()) {
            return zzqVar;
        }
        systemLocales2 = c5.getSystemLocales();
        Locale locale2 = systemLocales2.get(0);
        return new zzq(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzq(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final boolean zzr(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfyn zzfynVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbr)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzs(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzt(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzah(zzai(context));
    }

    public static final String zzu() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzv() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : h1.b(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final Integer zzw(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzx(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzy() {
        return new int[]{0, 0};
    }

    public static final Map zzz(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        String optString = optJSONArray.optString(i5);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public final void zzb(Context context, String str, boolean z4, HttpURLConnection httpURLConnection, boolean z5, int i5) {
        int zza2 = zza(i5);
        String m5 = u.m(new StringBuilder(String.valueOf(zza2).length() + 28), "HTTP timeout: ", zza2, " milliseconds.");
        int i6 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(m5);
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzc(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbhe.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final boolean zzd(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbhe.zza(context);
        byte[] bArr = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, bArr), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmJ)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzam(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String zzam = zzam(context, str);
                this.zzh = zzam;
                return zzam;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a zzf(final Uri uri) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfyn zzfynVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzV(uri);
            }
        }, this.zzl);
    }

    public final void zzg(final Context context, final String str, String str2, Bundle bundle, boolean z4) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString("device", zzv());
        zzbgv zzbgvVar = zzbhe.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zzb().zze()));
        if (bundle.isEmpty()) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlY);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzs.this.zzn(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzB(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfyn zzfynVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzQ(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzi(String str) {
        return zzag(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaM));
    }

    public final boolean zzj(String str) {
        return zzag(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaN));
    }

    public final /* synthetic */ void zzn(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzac.zzb(context, str));
    }

    public final /* synthetic */ void zzo(boolean z4) {
        this.zzf = z4;
    }

    public final int zzp(Context context, Uri uri, Bundle bundle) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzaj(context, uri);
            return 2;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfx)).booleanValue()) {
                zzaj(context, uri);
                return 9;
            }
            zzbif zzbifVar = new zzbif();
            zzbifVar.zzd(new zzk(this, zzbifVar, bundle, context, uri));
            zzbifVar.zze((Activity) context);
            return 5;
        }
        l lVar = new l(com.google.android.gms.ads.internal.zzt.zzn().zzb());
        zzak(lVar, bundle);
        p a5 = lVar.a();
        Intent intent = (Intent) a5.h;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfM)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zza();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzw()) {
                return 5;
            }
        }
        intent.setPackage(zzikw.zza(context));
        intent.setData(uri);
        v.a.startActivity(context, intent, (Bundle) a5.f274i);
        return 5;
    }
}
