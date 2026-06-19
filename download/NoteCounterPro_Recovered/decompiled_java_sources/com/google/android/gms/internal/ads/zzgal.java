package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgal extends zzgak {
    private static zzgal zzd;

    private zzgal(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgal zzh(Context context) {
        zzgal zzgalVar;
        synchronized (zzgal.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgal(context);
                }
                zzgalVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgalVar;
    }

    public final zzgah zzi(long j2, boolean z4) {
        zzgah zza;
        synchronized (zzgal.class) {
            zza = zza(null, null, j2, z4);
        }
        return zza;
    }

    public final zzgah zzj(String str, String str2, long j2, boolean z4) {
        zzgah zza;
        synchronized (zzgal.class) {
            zza = zza(str, str2, j2, z4);
        }
        return zza;
    }

    public final void zzk() {
        synchronized (zzgal.class) {
            zzc(false);
        }
    }

    public final void zzl() {
        synchronized (zzgal.class) {
            zzc(true);
        }
    }
}
