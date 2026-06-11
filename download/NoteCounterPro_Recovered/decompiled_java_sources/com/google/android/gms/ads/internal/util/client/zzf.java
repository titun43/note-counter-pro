package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzfvb;
import com.google.android.gms.internal.ads.zzfyn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.f;

/* loaded from: classes.dex */
public final class zzf {
    public static final Handler zza = new zzfyn(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = zzfvb.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    public static final int zzA(DisplayMetrics displayMetrics, int i5) {
        return Math.round(i5 / displayMetrics.density);
    }

    public static final void zzB(Context context, String str, String str2, Bundle bundle, boolean z4, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            f.f3374b.getClass();
            int a5 = f.a(context);
            StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 10);
            sb.append(a5);
            sb.append(".254715000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Bridge.CAPACITOR_HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(appendQueryParameter.toString());
    }

    public static final int zzC(Context context, int i5) {
        return zzu(context.getResources().getDisplayMetrics(), i5);
    }

    public static final String zzD(Context context) {
        zzbhe.zza(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzw()) {
            string = "emulator";
        }
        return zzE(string, "MD5");
    }

    private static String zzE(String str, String str2) {
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray zzF(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzG(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzG(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzm((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzk((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zzF((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzn((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzH(JSONObject jSONObject, String str, Object obj) {
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzs)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzm((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzk((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzF((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, zzF(Arrays.asList((Object[]) obj)));
            return;
        }
        int i5 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i5 < length) {
                numArr[i5] = Integer.valueOf(iArr[i5]);
                i5++;
            }
            jSONObject.put(str, zzn(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i5 < length2) {
                dArr2[i5] = Double.valueOf(dArr[i5]);
                i5++;
            }
            jSONObject.put(str, zzn(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i5 < length3) {
                lArr[i5] = Long.valueOf(jArr[i5]);
                i5++;
            }
            jSONObject.put(str, zzn(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i5 < length4) {
            boolArr[i5] = Boolean.valueOf(zArr[i5]);
            i5++;
        }
        jSONObject.put(str, zzn(boolArr));
    }

    private static final void zzI(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i5, int i6) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i5);
        textView.setBackgroundColor(i6);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i5);
        int zzC = zzC(context, 3);
        int i7 = zzrVar.zzf;
        int i8 = zzrVar.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i7 - zzC, i8 - zzC, 17));
        viewGroup.addView(frameLayout, i7, i8);
    }

    public static Object zzd(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    public static ActivityManager.MemoryInfo zze(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.zzi("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static String zzf(String str) {
        return zzE(str, "MD5");
    }

    public static String zzg(String str) {
        return zzE(str, "SHA-256");
    }

    public static String zzi() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i5 = 0; i5 < 2; i5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static AdSize zzj(Context context, int i5, int i6, int i7) {
        int zzp = zzp(context, i7);
        if (zzp == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i5, Math.max(Math.min(i5 > 655 ? Math.round((i5 / 728.0f) * 90.0f) : i5 > 632 ? 81 : i5 > 526 ? Math.round((i5 / 468.0f) * 60.0f) : i5 > 432 ? 68 : Math.round((i5 / 320.0f) * 50.0f), Math.min(90, Math.round(zzp * 0.15f))), 50));
    }

    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbjn.zzd.zze());
    }

    public static int zzp(Context context, int i5) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i6 = configuration.orientation;
        if (i5 == 0) {
            i5 = i6;
        }
        return i5 == i6 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static PreloadConfiguration zzq(zzft zzftVar) {
        PreloadConfiguration zzr = zzr(zzftVar);
        if (zzr == null) {
            return null;
        }
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(zzr.getAdUnitId());
        builder.setAdRequest(zzr.getAdRequest());
        builder.setBufferSize(zzr.getBufferSize());
        return builder.build();
    }

    public static PreloadConfiguration zzr(zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzftVar.zzc;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zza(zzmVar.zzm);
        Bundle bundle = zzmVar.zzn;
        for (String str2 : bundle.keySet()) {
            builder.addCustomTargeting(str2, bundle.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        String str3 = zzmVar.zzl;
        if (str3 != null) {
            builder.setContentUrl(str3);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest build = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(build);
        builder2.setBufferSize(zzftVar.zzd);
        return builder2.build();
    }

    public static zzft zzs(Context context, PreloadConfiguration preloadConfiguration, AdFormat adFormat) {
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfiguration.getAdUnitId(), adFormat);
        builder.setAdRequest(preloadConfiguration.getAdRequest());
        builder.setBufferSize(preloadConfiguration.getBufferSize());
        return zzt(context, builder.build(), 2);
    }

    public static zzft zzt(Context context, PreloadConfiguration preloadConfiguration, int i5) {
        int bufferSize;
        int intValue;
        com.google.android.gms.ads.internal.client.zzm zza2 = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, preloadConfiguration.getAdRequest().zza());
        int i6 = 1;
        if (i5 == 1) {
            zza2.zzc.putBoolean("is_sdk_preload", true);
        } else {
            zza2.zzc.putBoolean("zenith_v2", true);
        }
        if (preloadConfiguration.getBufferSize() <= 0) {
            AdFormat adFormat = preloadConfiguration.getAdFormat();
            AdFormat adFormat2 = AdFormat.BANNER;
            int ordinal = adFormat.ordinal();
            if (ordinal == 1) {
                bufferSize = ((Integer) zzbd.zzc().zzd(zzbhe.zzac)).intValue();
            } else if (ordinal == 2) {
                bufferSize = ((Integer) zzbd.zzc().zzd(zzbhe.zzad)).intValue();
            } else if (ordinal != 5) {
                bufferSize = 1;
            } else {
                bufferSize = ((Integer) zzbd.zzc().zzd(zzbhe.zzab)).intValue();
            }
        } else {
            bufferSize = preloadConfiguration.getBufferSize();
        }
        AdFormat adFormat3 = preloadConfiguration.getAdFormat();
        AdFormat adFormat4 = AdFormat.BANNER;
        int ordinal2 = adFormat3.ordinal();
        if (ordinal2 == 1) {
            intValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzZ)).intValue();
        } else if (ordinal2 == 2) {
            intValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzaa)).intValue();
        } else if (ordinal2 != 5) {
            intValue = 1;
        } else {
            intValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzY)).intValue();
        }
        int max = Math.max(Math.min(intValue, 15), 1);
        int ordinal3 = preloadConfiguration.getAdFormat().ordinal();
        if (ordinal3 == 1) {
            i6 = ((Integer) zzbd.zzc().zzd(zzbhe.zzaf)).intValue();
        } else if (ordinal3 == 2) {
            i6 = ((Integer) zzbd.zzc().zzd(zzbhe.zzag)).intValue();
        } else if (ordinal3 == 5) {
            i6 = ((Integer) zzbd.zzc().zzd(zzbhe.zzae)).intValue();
        }
        return new zzft(preloadConfiguration.getAdUnitId(), preloadConfiguration.getAdFormat().getValue(), zza2, Math.max(Math.min(bufferSize, max), Math.min(i6, max)));
    }

    public static final int zzu(DisplayMetrics displayMetrics, int i5) {
        return (int) TypedValue.applyDimension(1, i5, displayMetrics);
    }

    public static final String zzv(StackTraceElement[] stackTraceElementArr, String str) {
        int i5;
        int i6;
        String str2;
        while (true) {
            i6 = i5 + 1;
            if (i6 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i5];
            String className = stackTraceElement.getClassName();
            i5 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i6;
        }
        str2 = stackTraceElementArr[i6].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i7 = 2; i7 > 0 && stringTokenizer.hasMoreElements(); i7--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzw() {
        boolean booleanValue = ((Boolean) zzbd.zzc().zzd(zzbhe.zzmR)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzx(Context context, int i5) {
        return f.f3374b.c(context, i5) == 0;
    }

    public static final boolean zzy(Context context) {
        int c5 = f.f3374b.c(context, 12451000);
        return c5 == 0 || c5 == 2;
    }

    public static final boolean zzz() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final int zza(Context context, int i5) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                try {
                    if (this.zzh < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.zzh = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i5 / this.zzh);
    }

    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, String str2) {
        if (str2 != null) {
            zzo.zzi(str2);
        }
        zzI(viewGroup, zzrVar, str, -65536, -16777216);
    }

    public final void zzc(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str) {
        zzI(viewGroup, zzrVar, "Ads by Google", -16777216, -1);
    }

    public final void zzh(final Context context, String str, String str2, Bundle bundle, boolean z4) {
        zzB(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ zzt zza(String str3) {
                new zzc(zzf.this, context, str3).start();
                return zzt.SUCCESS;
            }
        });
    }

    public final JSONObject zzk(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzH(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e4) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e4.getMessage())));
        }
    }

    public final JSONObject zzl(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzm(bundle);
            } catch (JSONException e4) {
                zzo.zzg("Error converting Bundle to JSON", e4);
            }
        }
        return null;
    }

    public final JSONObject zzm(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzH(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONArray zzn(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzG(jSONArray, obj);
        }
        return jSONArray;
    }
}
