package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgql {
    public static String zza(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            if (zzd(str.charAt(i5))) {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c5 = charArray[i5];
                    if (zzd(c5)) {
                        charArray[i5] = (char) (c5 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static String zzb(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            if (zzc(str.charAt(i5))) {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c5 = charArray[i5];
                    if (zzc(c5)) {
                        charArray[i5] = (char) (c5 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static boolean zzc(char c5) {
        return c5 >= 'a' && c5 <= 'z';
    }

    public static boolean zzd(char c5) {
        return c5 >= 'A' && c5 <= 'Z';
    }

    public static boolean zze(CharSequence charSequence, CharSequence charSequence2) {
        int zzf;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            char charAt2 = charSequence2.charAt(i5);
            if (charAt != charAt2 && ((zzf = zzf(charAt)) >= 26 || zzf != zzf(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int zzf(char c5) {
        return (char) ((c5 | ' ') - 97);
    }
}
