package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdpu {
    private final zzduv zza;
    private final zzdtk zzb;
    private final zzctc zzc;
    private final zzdop zzd;

    public zzdpu(zzduv zzduvVar, zzdtk zzdtkVar, zzctc zzctcVar, zzdop zzdopVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
        this.zzc = zzctcVar;
        this.zzd = zzdopVar;
    }

    public final View zza() {
        zzcjl zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zza.zzE().setVisibility(8);
        zza.zzab("/sendMessageToSdk", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpt
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdpu.this.zzb((zzcjl) obj, map);
            }
        });
        zza.zzab("/adMuted", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdpu.this.zzc((zzcjl) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zza);
        zzboh zzbohVar = new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzclj zzP = zzcjlVar.zzP();
                final zzdpu zzdpuVar = zzdpu.this;
                zzP.zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdps
                    @Override // com.google.android.gms.internal.ads.zzclh
                    public final /* synthetic */ void zza(boolean z4, int i5, String str, String str2) {
                        zzdpu.this.zzf(map, z4, i5, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcjlVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcjlVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadHtml", zzbohVar);
        zzdtkVar.zzh(new WeakReference(zza), "/showOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdpu.this.zzd((zzcjl) obj, map);
            }
        });
        zzdtkVar.zzh(new WeakReference(zza), "/hideOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpr
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdpu.this.zze((zzcjl) obj, map);
            }
        });
        return zza.zzE();
    }

    public final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzd.zzt();
    }

    public final /* synthetic */ void zzd(zzcjl zzcjlVar, Map map) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcjlVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zze(zzcjl zzcjlVar, Map map) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcjlVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    public final /* synthetic */ void zzf(Map map, boolean z4, int i5, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}
