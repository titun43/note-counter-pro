package com.google.android.gms.internal.ads;

import g4.i;
import java.util.concurrent.ExecutorService;
import o4.m0;
import o4.t;
import o4.w;

/* loaded from: classes.dex */
public final class zzfzj {
    public static final zzfzh zza(final ExecutorService executorService) {
        i.e(executorService, "executorService");
        return new zzfzh() { // from class: com.google.android.gms.internal.ads.zzfzi
            @Override // com.google.android.gms.internal.ads.zzfzh
            public final t zza() {
                return w.a(new m0(executorService));
            }
        };
    }
}
