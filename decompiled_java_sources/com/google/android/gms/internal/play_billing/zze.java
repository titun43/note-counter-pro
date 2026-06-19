package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c0.j;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import y1.e;
import y1.f;

/* loaded from: classes.dex */
public final class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzl("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, long j2) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j2);
        return bundle;
    }

    public static Bundle zzd(boolean z4, boolean z5, boolean z6, boolean z7, String str, long j2) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j2);
        if (z4 && z6) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z5 && z7) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zze(String str, long j2) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j2);
        return bundle;
    }

    public static e zzf(Intent intent, String str) {
        if (intent != null) {
            j a5 = e.a();
            a5.f763a = zzb(intent.getExtras(), str);
            a5.f764b = zzh(intent.getExtras(), str);
            return a5.b();
        }
        zzl("BillingHelper", "Got null intent!");
        j a6 = e.a();
        a6.f763a = 6;
        a6.f764b = "An internal error occurred.";
        return a6.b();
    }

    public static f zzg(Bundle bundle, String str) {
        if (bundle == null) {
            return new f();
        }
        zzp(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new f();
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static String zzi(int i5) {
        return zzd.zza(i5).toString();
    }

    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq);
            return arrayList;
        }
        zzk("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i5 = 0; i5 < stringArrayList.size() && i5 < stringArrayList2.size(); i5++) {
            Purchase zzq2 = zzq(stringArrayList.get(i5), stringArrayList2.get(i5));
            if (zzq2 != null) {
                arrayList.add(zzq2);
            }
        }
        return arrayList;
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i5 = 40000;
            while (!str2.isEmpty() && i5 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i5));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i5 -= min;
            }
        }
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzn(e eVar, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", eVar.f3832a);
        bundle.putString("DEBUG_MESSAGE", eVar.f3833b);
        bundle.putInt("LOG_REASON", i5 - 1);
        return bundle;
    }

    public static Bundle zzo(e eVar, int i5, String str) {
        Bundle zzn = zzn(eVar, 5);
        if (str != null) {
            zzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return zzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzl(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e4) {
            zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e4.toString()));
            return null;
        }
    }
}
