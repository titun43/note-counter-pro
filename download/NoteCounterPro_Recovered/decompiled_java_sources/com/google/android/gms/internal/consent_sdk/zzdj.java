package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzdj {
    public static int zza(int i5, int i6, String str) {
        String zza;
        if (i5 >= 0 && i5 < i6) {
            return i5;
        }
        if (i5 < 0) {
            zza = zzdp.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i6 < 0) {
                throw new IllegalArgumentException(u.h(i6, "negative size: "));
            }
            zza = zzdp.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i5, int i6, String str) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(zzd(i5, i6, "index"));
        }
        return i5;
    }

    public static void zzc(int i5, int i6, int i7) {
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i7) ? zzd(i5, i7, "start index") : (i6 < 0 || i6 > i7) ? zzd(i6, i7, "end index") : zzdp.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    private static String zzd(int i5, int i6, String str) {
        if (i5 < 0) {
            return zzdp.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return zzdp.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(u.h(i6, "negative size: "));
    }
}
