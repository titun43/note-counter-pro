package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzgge extends zzghb {
    private final Activity zza;
    private final View zzb;

    public zzgge(zzawg zzawgVar, zzgfx zzgfxVar, View view, Activity activity, zzgoe zzgoeVar) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", zzawgVar, zzgfxVar, zzgoeVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        Object[] objArr = (Object[]) method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzS(((Long) objArr[0]).longValue());
            zzawgVar.zzT(((Long) objArr[1]).longValue());
            zzawgVar.zzU((String) objArr[2]);
        }
    }
}
