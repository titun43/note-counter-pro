package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class zzggq extends zzghb {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzggq(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", zzawgVar, zzgfxVar, zzgoeVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l5 = (Long) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null);
                        if (l5 == null) {
                            throw null;
                        }
                        zza = l5;
                    }
                } finally {
                }
            }
        }
        synchronized (zzawgVar) {
            try {
                if (zza != null) {
                    zzawgVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
