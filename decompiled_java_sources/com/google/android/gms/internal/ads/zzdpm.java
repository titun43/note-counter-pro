package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdpm implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdtk zzd;
    private final x2.b zze;
    private zzbmj zzf;
    private zzboh zzg;

    public zzdpm(zzdtk zzdtkVar, x2.b bVar) {
        this.zzd = zzdtkVar;
        this.zze = bVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zza);
            ((x2.c) this.zze).getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(final zzbmj zzbmjVar) {
        this.zzf = zzbmjVar;
        zzboh zzbohVar = this.zzg;
        if (zzbohVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbohVar);
        }
        zzboh zzbohVar2 = new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdpm zzdpmVar = zzdpm.this;
                try {
                    zzdpmVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbmj zzbmjVar2 = zzbmjVar;
                zzdpmVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbmjVar2 == null) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbmjVar2.zze(str);
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
            }
        };
        this.zzg = zzbohVar2;
        this.zzd.zzd("/unconfirmedClick", zzbohVar2);
    }

    public final zzbmj zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }
}
