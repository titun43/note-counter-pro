package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class zzghg extends zzghb {
    private final DisplayMetrics zza;
    private final View zzb;

    public zzghg(zzawg zzawgVar, zzgfx zzgfxVar, DisplayMetrics displayMetrics, View view, zzgoe zzgoeVar) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", zzawgVar, zzgfxVar, zzgoeVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this.zza, view);
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        zzaxe zza = zzaxf.zza();
        zza.zzb(lArr[2].longValue());
        zza.zzc(lArr[1].longValue());
        zza.zzd(lArr[0].longValue());
        zza.zza(lArr[3].longValue());
        zza.zze(lArr[4].longValue());
        zzawgVar.zzM((zzaxf) zza.zzbu());
    }
}
