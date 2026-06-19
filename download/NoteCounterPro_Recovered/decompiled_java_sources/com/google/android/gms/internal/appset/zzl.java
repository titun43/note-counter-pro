package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.b0;
import h3.g;
import h3.h;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.a;
import q2.b;

/* loaded from: classes.dex */
public final class zzl implements a {
    private static a zza;
    private final Context zzb;
    private boolean zzc;
    private final ScheduledExecutorService zzd;
    private final ExecutorService zze;

    public zzl(Context context) {
        this.zzc = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.zzd = newSingleThreadScheduledExecutor;
        this.zze = Executors.newSingleThreadExecutor();
        this.zzb = context;
        if (this.zzc) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.zzc = true;
    }

    public static synchronized a zzc(Context context) {
        a aVar;
        synchronized (zzl.class) {
            try {
                b0.h(context, "Context must not be null");
                if (zza == null) {
                    zza = new zzl(context.getApplicationContext());
                }
                aVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static final void zze(Context context) {
        if (!zzf(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (zzf(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences zzf(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void zzg(Context context) {
        if (zzf(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new zzk("Failed to store the app set ID last used time.");
    }

    @Override // q2.a
    public final g getAppSetIdInfo() {
        final h hVar = new h();
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzl.this.zzd(hVar);
            }
        });
        return hVar.f1713a;
    }

    public final long zza() {
        long j2 = zzf(this.zzb).getLong("app_set_id_last_used_time", -1L);
        if (j2 != -1) {
            return j2 + 33696000000L;
        }
        return -1L;
    }

    public final void zzd(h hVar) {
        String string = zzf(this.zzb).getString("app_set_id", null);
        long zza2 = zza();
        if (string == null || System.currentTimeMillis() > zza2) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.zzb;
                if (!zzf(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new zzk("Failed to store the app set ID.");
                }
                zzg(context);
                Context context2 = this.zzb;
                if (!zzf(context2).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e4) {
                hVar.f1713a.d(e4);
                return;
            }
        } else {
            try {
                zzg(this.zzb);
            } catch (zzk e5) {
                hVar.f1713a.d(e5);
                return;
            }
        }
        hVar.a(new b(string, 1));
    }
}
