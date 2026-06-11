package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class zzbm {
    public static int zza(int i5, int i6, @NullableDecl String str) {
        String zza;
        if (i5 >= 0 && i5 < i6) {
            return i5;
        }
        if (i5 < 0) {
            zza = zzbn.zza("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i6 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i6);
                throw new IllegalArgumentException(sb.toString());
            }
            zza = zzbn.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i5, int i6, @NullableDecl String str) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(zzd(i5, i6, "index"));
        }
        return i5;
    }

    public static void zzc(int i5, int i6, int i7) {
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i7) ? zzd(i5, i7, "start index") : (i6 < 0 || i6 > i7) ? zzd(i6, i7, "end index") : zzbn.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    private static String zzd(int i5, int i6, @NullableDecl String str) {
        if (i5 < 0) {
            return zzbn.zza("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return zzbn.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }
}
