package com.google.android.gms.internal.play_billing;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzcp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzcp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        return new IllegalArgumentException(h1.b(sb, valueOf3, "=", valueOf4));
    }
}
