package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbnf implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgpp zzl = zzgpq.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzg(zzcjlVar.getWidth());
        zzl.zza(zzcjlVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzcjlVar, zzl.zzi());
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
