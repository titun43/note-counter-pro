package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgz
                    @Override // com.google.android.gms.internal.ads.zzgru
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011d, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbhg.zza(new com.google.android.gms.internal.ads.zzbha(r3))).optBoolean("local_flags_enabled") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0012, B:13:0x0017, B:14:0x0019, B:16:0x002b, B:17:0x002f, B:19:0x0031, B:37:0x00a4, B:38:0x00a8, B:39:0x00ab, B:48:0x00db, B:54:0x0123, B:66:0x0168, B:67:0x016f, B:89:0x0171, B:90:0x0178, B:22:0x0046, B:27:0x0064, B:29:0x006d, B:30:0x0075, B:32:0x007b, B:34:0x008b, B:36:0x00a0, B:41:0x00ae, B:43:0x00b2, B:45:0x00c2, B:47:0x00d7, B:49:0x00e0, B:52:0x011f, B:55:0x0128, B:57:0x0135, B:59:0x0143, B:60:0x014c, B:62:0x015a, B:64:0x015e, B:65:0x0161, B:69:0x00f1, B:71:0x00ff, B:73:0x0107, B:75:0x0112, B:80:0x004d, B:82:0x005a), top: B:5:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:27:0x0064, B:29:0x006d, B:30:0x0075, B:32:0x007b, B:34:0x008b, B:36:0x00a0, B:41:0x00ae, B:43:0x00b2, B:45:0x00c2, B:47:0x00d7, B:49:0x00e0, B:52:0x011f, B:55:0x0128, B:57:0x0135, B:59:0x0143, B:60:0x014c, B:62:0x015a, B:64:0x015e, B:65:0x0161, B:69:0x00f1, B:71:0x00ff, B:73:0x0107, B:75:0x0112, B:80:0x004d, B:82:0x005a), top: B:21:0x0046, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        ConditionVariable conditionVariable;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = z2.c.a(context).b(128, this.zzg.getPackageName()).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context3 = this.zzg;
                    SharedPreferences sharedPreferences2 = null;
                    if (context3 == null) {
                        context3 = null;
                    } else {
                        try {
                            context2 = context3.createPackageContext("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            context2 = null;
                        }
                        if (context2 != null || (context2 = context3.getApplicationContext()) != null) {
                            context3 = context2;
                        }
                    }
                    if (context3 != null) {
                        com.google.android.gms.ads.internal.client.zzbd.zza();
                        sharedPreferences2 = zzbgx.zzb(context3);
                    }
                    if (sharedPreferences2 != null) {
                        zzbjw.zzc(new zzbgy(this, sharedPreferences2));
                    }
                    if (!this.zzi) {
                        zzbio zzbioVar = zzbiw.zzd;
                        if (((Long) zzbioVar.zze()).longValue() > 0 && zzbgp.zzd(this.zzg) >= ((Long) zzbioVar.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            conditionVariable = this.zzc;
                            conditionVariable.open();
                            return;
                        }
                    }
                    if (!this.zzi) {
                        zzbio zzbioVar2 = zzbiw.zzf;
                        if (((Long) zzbioVar2.zze()).longValue() > 0 && zzbgp.zzc(this.zzg) >= ((Long) zzbioVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            conditionVariable = this.zzc;
                            conditionVariable.open();
                            return;
                        }
                    }
                    Context context4 = this.zzg;
                    if (!((Boolean) zzbje.zzk.zze()).booleanValue()) {
                        if (((Boolean) zzbje.zzl.zze()).booleanValue() && (r3 = context4.getSharedPreferences("admob", 0)) != null) {
                        }
                        if (context3 != null) {
                            this.zza = false;
                            conditionVariable = this.zzc;
                            conditionVariable.open();
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzbd.zza();
                        this.zze = zzbgx.zzb(context3);
                        if (!this.zzi && ((Boolean) zzbje.zze.zze()).booleanValue()) {
                            com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                        }
                        if (!((Boolean) zzbje.zzc.zze()).booleanValue() && (sharedPreferences = this.zze) != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                        }
                        zzg(this.zze);
                        this.zzd = true;
                        return;
                    }
                    context3 = this.zzg;
                    if (context3 != null) {
                    }
                } finally {
                    this.zza = false;
                    this.zzc.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbgv zzbgvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbhb
                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    return zzbhc.this.zzf(zzbgvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }
}
