package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface zzabl extends Executor {
    static zzabl zzb(Executor executor, zzdr zzdrVar) {
        return new zzabk(executor, zzdrVar);
    }

    void zza();
}
