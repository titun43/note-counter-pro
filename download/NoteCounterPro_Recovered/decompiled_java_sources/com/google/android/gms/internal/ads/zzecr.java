package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzecr extends Exception {
    private final int zza;

    public zzecr(int i5) {
        this.zza = i5;
    }

    public final int zza() {
        return this.zza;
    }

    public zzecr(int i5, String str) {
        super(str);
        this.zza = i5;
    }

    public zzecr(int i5, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
