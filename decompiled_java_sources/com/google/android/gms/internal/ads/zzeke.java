package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzeke {
    private final Context zza;

    public zzeke(Context context) {
        this.zza = context;
    }

    public final j3.a zza(boolean z4) {
        try {
            x0.a aVar = new x0.a(z4);
            v0.a a5 = v0.a.a(this.zza);
            return a5 != null ? a5.b(aVar) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e4) {
            return zzgzo.zzc(e4);
        }
    }
}
