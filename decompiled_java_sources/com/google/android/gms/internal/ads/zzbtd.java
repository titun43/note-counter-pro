package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbtd implements zzbsp {
    private final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    public zzbtd(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzc = zzbslVar;
        this.zzd = str;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final j3.a zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final j3.a zzb(Object obj) {
        zzcen zzcenVar = new zzcen();
        zzbsf zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zze(new zzbta(this, zzb, obj, zzcenVar), new zzbtb(this, zzcenVar, zzb));
        return zzcenVar;
    }

    public final /* synthetic */ void zzc(zzbsf zzbsfVar, zzbsm zzbsmVar, Object obj, zzcen zzcenVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbog.zzo.zzb(uuid, new zzbtc(this, zzbsfVar, zzcenVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbsmVar.zzb(this.zzd, jSONObject);
        } catch (Exception e4) {
            try {
                zzcenVar.zzd(e4);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e4);
            } finally {
                zzbsfVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbsr zzd() {
        return this.zza;
    }
}
