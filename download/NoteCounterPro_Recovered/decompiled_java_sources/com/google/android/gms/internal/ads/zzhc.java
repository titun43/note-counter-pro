package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i5) {
        this.zza = i5;
    }

    public zzhc(String str, int i5) {
        super(str);
        this.zza = i5;
    }

    public zzhc(String str, Throwable th, int i5) {
        super(str, th);
        this.zza = i5;
    }

    public zzhc(Throwable th, int i5) {
        super(th);
        this.zza = i5;
    }
}
