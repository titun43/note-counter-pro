package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.fragment.app.h1;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdsx implements zzboh {
    private final zzblw zza;
    private final zzdtk zzb;
    private final zzika zzc;

    public zzdsx(zzdor zzdorVar, zzdoh zzdohVar, zzdtk zzdtkVar, zzika zzikaVar) {
        this.zza = zzdorVar.zzg(zzdohVar.zzS());
        this.zzb = zzdtkVar;
        this.zzc = zzikaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblm) this.zzc.zzb(), str);
        } catch (RemoteException e4) {
            String b2 = h1.b(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, ".");
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(b2, e4);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
