package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfyy extends zzibr implements zzidd {
    private static final zzfyy zzb;
    private static volatile zzidk zzc;
    private zzicw zza = zzicw.zza();

    static {
        zzfyy zzfyyVar = new zzfyy();
        zzb = zzfyyVar;
        zzibr.zzbu(zzfyy.class, zzfyyVar);
    }

    private zzfyy() {
    }

    public static zzfyy zzc(InputStream inputStream) {
        return (zzfyy) zzibr.zzbW(zzb, inputStream);
    }

    public static zzfyy zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfyx.zza});
        }
        if (ordinal == 3) {
            return new zzfyy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfyw(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfyy.class) {
            try {
                zzidkVar = zzc;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzb);
                    zzc = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
