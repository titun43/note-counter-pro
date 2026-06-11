package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbgn implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgm
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

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzbd.zza();
                SharedPreferences zza = zzbgx.zza(context);
                this.zzb = zza;
                zzg(zza);
                if (!((Boolean) zzbje.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j2) {
        return !str.startsWith("adapter:") ? j2 : this.zzc.optLong(str, j2);
    }

    public final int zzd(String str, int i5) {
        return !str.startsWith("adapter:") ? i5 : this.zzc.optInt(str, i5);
    }

    public final float zze(String str, float f5) {
        return !str.startsWith("adapter:") ? f5 : (float) this.zzc.optDouble(str, f5);
    }

    public final boolean zzf(String str, boolean z4) {
        return !str.startsWith("adapter:") ? z4 : this.zzc.optBoolean(str, z4);
    }
}
