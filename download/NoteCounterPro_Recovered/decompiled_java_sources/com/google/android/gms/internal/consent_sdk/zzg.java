package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import i3.j;

/* loaded from: classes.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i5, String str) {
        super(str);
        this.zza = i5;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final j zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new j(super.getMessage());
    }

    public zzg(int i5, String str, Throwable th) {
        super(str, th);
        this.zza = i5;
    }
}
