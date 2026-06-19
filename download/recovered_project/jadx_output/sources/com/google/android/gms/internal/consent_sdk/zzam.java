package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import z2.c;

/* loaded from: classes.dex */
public final class zzam {
    private final Context zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();

    public zzam(Application application) {
        this.zza = application.getApplicationContext();
    }

    public final Object zza(String str) {
        Object obj;
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null || (obj = ((Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void zzb(Context context) {
        AtomicReference atomicReference = this.zzf;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(c.a(context).b(128, context.getPackageName()).metaData);
            } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e4);
            }
        }
    }

    public final void zzc(Map map) {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            try {
                hashMap.put((Enum) ((Method) this.zze.get()).invoke(null, str), (Enum) ((Method) this.zzd.get()).invoke(null, map.get(str)));
            } catch (Exception e4) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e4);
            }
        }
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == null || hashMap.isEmpty()) {
            return;
        }
        try {
            ((Method) atomicReference.get()).invoke(this.zzb.get(), hashMap);
        } catch (Exception e5) {
            Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e5);
        }
    }

    public final boolean zzd() {
        AtomicReference atomicReference = this.zzg;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.zza;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            this.zzb.set(cls.getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            this.zzc.set(cls.getDeclaredMethod("setConsent", Map.class));
            Class<?> cls2 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus");
            Class<?> cls3 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentType");
            Method declaredMethod = cls2.getDeclaredMethod("valueOf", String.class);
            Method declaredMethod2 = cls3.getDeclaredMethod("valueOf", String.class);
            this.zzd.set(declaredMethod);
            this.zze.set(declaredMethod2);
            this.zzg.set(Boolean.TRUE);
            return true;
        } catch (Exception e4) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e4);
            this.zzg.set(Boolean.FALSE);
            return false;
        }
    }
}
