package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzibb {
    static final zzibb zza = new zzibb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzibb zzd;
    private final Map zze;

    public zzibb() {
        this.zze = new HashMap();
    }

    public static zzibb zza() {
        int i5 = zziaa.zza;
        return zza;
    }

    public static zzibb zzb() {
        zzibb zzibbVar = zzd;
        if (zzibbVar != null) {
            return zzibbVar;
        }
        synchronized (zzibb.class) {
            try {
                zzibb zzibbVar2 = zzd;
                if (zzibbVar2 != null) {
                    return zzibbVar2;
                }
                int i5 = zziaa.zza;
                zzibb zzb2 = zzibj.zzb(zzibb.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzibp zzc(zzidc zzidcVar, int i5) {
        return (zzibp) this.zze.get(new zziba(zzidcVar, i5));
    }

    public zzibb(boolean z4) {
        this.zze = Collections.EMPTY_MAP;
    }
}
