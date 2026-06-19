package com.google.android.gms.internal.ads;

import com.getcapacitor.Bridge;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfjv {
    public static zzboh zza(final zzeiu zzeiuVar, final zzfqk zzfqkVar, final zzcrv zzcrvVar, final zzdjm zzdjmVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfju
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjm.this);
                String str = (String) map.get(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM);
                if (str == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzeiu zzeiuVar2 = zzeiuVar;
                    zzfqk zzfqkVar2 = zzfqkVar;
                    zzgzo.zzr(zzbog.zza(zzcjlVar, str), new zzfjs(zzcjlVar, zzcrvVar, zzfqkVar2, zzeiuVar2), zzcei.zza);
                }
            }
        };
    }

    public static zzboh zzb(final zzeiu zzeiuVar, final zzfqk zzfqkVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // com.google.android.gms.internal.ads.zzboh
            public final void zza(Object obj, Map map) {
                zzcjc zzcjcVar = (zzcjc) obj;
                String str = (String) map.get(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM);
                if (str == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfir zzC = zzcjcVar.zzC();
                if (zzC != null && !zzC.zzai) {
                    zzfqk.this.zzb(str, zzC.zzax, null, null);
                    return;
                }
                zzfiu zzaC = ((zzcks) zzcjcVar).zzaC();
                if (zzaC == null) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                } else {
                    zzeiu zzeiuVar2 = zzeiuVar;
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    zzeiuVar2.zze(new zzeiw(System.currentTimeMillis(), zzaC.zzb, str, 2));
                }
            }
        };
    }
}
