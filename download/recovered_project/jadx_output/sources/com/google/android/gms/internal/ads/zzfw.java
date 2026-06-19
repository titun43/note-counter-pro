package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzfw {
    public final int zzd;

    public static String zze(int i5) {
        char c5 = (char) ((i5 >> 24) & 255);
        int length = String.valueOf(c5).length();
        char c6 = (char) ((i5 >> 16) & 255);
        int length2 = String.valueOf(c6).length();
        char c7 = (char) ((i5 >> 8) & 255);
        char c8 = (char) (i5 & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c7).length() + String.valueOf(c8).length());
        sb.append(c5);
        sb.append(c6);
        sb.append(c7);
        sb.append(c8);
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
