package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
final class zzggs extends zzghb {
    private final Map zza;

    public zzggs(zzawg zzawgVar, zzgfx zzgfxVar, Map map, zzgoe zzgoeVar) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zzawgVar, zzgfxVar, zzgoeVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzf(((Long) objArr[0]).longValue());
                long longValue = ((Long) objArr[1]).longValue();
                if (longValue >= 0) {
                    zzawgVar.zzW(longValue);
                }
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 >= 0) {
                    zzawgVar.zzX(longValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
