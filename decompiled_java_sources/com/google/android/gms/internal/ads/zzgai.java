package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgai {
    private static zzgai zzb;
    final zzgaj zza;

    private zzgai(Context context) {
        this.zza = zzgaj.zza(context);
    }

    public static final zzgai zza(Context context) {
        zzgai zzgaiVar;
        synchronized (zzgai.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgai(context);
                }
                zzgaiVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgaiVar;
    }

    public final void zzb(boolean z4) {
        synchronized (zzgai.class) {
            try {
                zzgaj zzgajVar = this.zza;
                zzgajVar.zzb("paidv2_publisher_option", Boolean.valueOf(z4));
                if (!z4) {
                    zzgajVar.zzf("paidv2_creation_time");
                    zzgajVar.zzf("paidv2_id");
                    zzgajVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zze;
        synchronized (zzgai.class) {
            zze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zze;
    }

    public final void zzd(boolean z4) {
        synchronized (zzgai.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z4));
        }
    }

    public final boolean zze() {
        boolean zze;
        synchronized (zzgai.class) {
            zze = this.zza.zze("paidv2_user_option", true);
        }
        return zze;
    }
}
