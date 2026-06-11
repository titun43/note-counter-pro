package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbgy implements zzbju {
    final /* synthetic */ SharedPreferences zza;

    public zzbgy(zzbhc zzbhcVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Boolean zza(String str, boolean z4) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z4));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z4)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Long zzb(String str, long j2) {
        try {
            return Long.valueOf(this.zza.getLong(str, j2));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final Double zzc(String str, double d5) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d5));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d5)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
