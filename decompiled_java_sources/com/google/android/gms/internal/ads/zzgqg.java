package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzgqg {
    private final String zza;

    public zzgqg(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(myUid).length() + 15 + String.valueOf(myPid).length() + 2);
        u.s(sb, "UID: [", myUid, "]  PID: [", myPid);
        sb.append("] ");
        this.zza = sb.toString().concat(str);
    }

    private static String zze(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e4);
                String join = TextUtils.join(", ", objArr);
                int length = String.valueOf(str2).length();
                str2 = u.n(new StringBuilder(String.valueOf(join).length() + length + 2 + 1), str2, " [", join, "]");
            }
        }
        return h1.b(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public final int zza(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzc(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }
}
