package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzgrc {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Character.valueOf(c5)));
        }
    }

    public static void zzd(boolean z4, String str, int i5) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i5)));
        }
    }

    public static void zze(boolean z4, String str, long j2) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Long.valueOf(j2)));
        }
    }

    public static void zzf(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj));
        }
    }

    public static void zzg(boolean z4, String str, int i5, int i6) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
    }

    public static void zzh(boolean z4, String str, Object obj, Object obj2) {
        if (!z4) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgrt.zzd(str, obj2));
    }

    public static int zzm(int i5, int i6, String str) {
        String zzd;
        if (i5 >= 0 && i5 < i6) {
            return i5;
        }
        if (i5 < 0) {
            zzd = zzgrt.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i5));
        } else {
            if (i6 < 0) {
                throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i6).length() + 15), "negative size: ", i6));
            }
            zzd = zzgrt.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(zzd);
    }

    public static int zzn(int i5, int i6, String str) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(zzp(i5, i6, "index"));
        }
        return i5;
    }

    public static void zzo(int i5, int i6, int i7) {
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i7) ? zzp(i5, i7, "start index") : (i6 < 0 || i6 > i7) ? zzp(i6, i7, "end index") : zzgrt.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    private static String zzp(int i5, int i6, String str) {
        if (i5 < 0) {
            return zzgrt.zzd("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return zzgrt.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i6).length() + 15), "negative size: ", i6));
    }
}
