package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zziw extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzwk zzh;
    final boolean zzi;

    private zziw(int i5, Throwable th, int i6) {
        this(i5, th, null, i6, null, -1, null, 4, null, false);
    }

    public static zziw zza(IOException iOException, int i5) {
        return new zziw(0, iOException, i5);
    }

    public static zziw zzb(Throwable th, String str, int i5, zzv zzvVar, int i6, zzwk zzwkVar, boolean z4, int i7) {
        if (zzvVar == null) {
            i6 = 4;
        }
        return new zziw(1, th, null, i7, str, i5, zzvVar, i6, zzwkVar, z4);
    }

    public static zziw zzc(RuntimeException runtimeException, int i5) {
        return new zziw(2, runtimeException, i5);
    }

    public final zziw zzd(zzwk zzwkVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zziw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zziw(int i5, Throwable th, String str, int i6, String str2, int i7, zzv zzvVar, int i8, zzwk zzwkVar, boolean z4) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i6, i5, r5, r6, zzvVar, i8, zzwkVar, SystemClock.elapsedRealtime(), z4);
        String str3;
        int i9;
        String str4;
        String str5;
        if (i5 == 0) {
            str3 = str2;
            i9 = i7;
            str4 = "Source error";
        } else if (i5 != 1) {
            str4 = "Unexpected runtime error";
            str3 = str2;
            i9 = i7;
        } else {
            String valueOf = String.valueOf(zzvVar);
            String str6 = zzfj.zza;
            if (i8 == 0) {
                str5 = "NO";
            } else if (i8 == 1) {
                str5 = "NO_UNSUPPORTED_TYPE";
            } else if (i8 == 2) {
                str5 = "NO_UNSUPPORTED_DRM";
            } else if (i8 == 3) {
                str5 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i8 != 4) {
                    throw new IllegalStateException();
                }
                str5 = "YES";
            }
            StringBuilder sb = new StringBuilder(str5.length() + valueOf.length() + u.e(String.valueOf(i7), String.valueOf(str2).length() + 14, 9) + 19);
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i9 = i7;
            sb.append(i9);
            sb.append(", format=");
            str4 = h1.b(sb, valueOf, ", format_supported=", str5);
        }
    }

    private zziw(String str, Throwable th, int i5, int i6, String str2, int i7, zzv zzvVar, int i8, zzwk zzwkVar, long j2, boolean z4) {
        super(str, th, i5, Bundle.EMPTY, j2);
        boolean z5;
        if (!z4) {
            z5 = true;
        } else if (i6 == 1) {
            i6 = 1;
            z5 = true;
        } else {
            z5 = false;
        }
        zzgrc.zza(z5);
        zzgrc.zza(th != null);
        this.zzc = i6;
        this.zzd = str2;
        this.zze = i7;
        this.zzf = zzvVar;
        this.zzg = i8;
        this.zzh = zzwkVar;
        this.zzi = z4;
    }
}
