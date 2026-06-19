package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e4) {
            throw new zzhlm(e4);
        }
    }

    public zzhlm(String str, Throwable th) {
        super(str, th);
    }

    public zzhlm(Throwable th) {
        super(th);
    }
}
