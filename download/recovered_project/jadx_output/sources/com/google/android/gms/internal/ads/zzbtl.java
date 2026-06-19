package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final j3.a zzb;

    public zzbtl(j3.a aVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final j3.a zza(Object obj) {
        return zzb(obj);
    }

    public final j3.a zzb(final Object obj) {
        return zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj2) {
                return zzbtl.this.zzc(obj, (zzbsm) obj2);
            }
        }, zzcei.zzg);
    }

    public final /* synthetic */ j3.a zzc(Object obj, zzbsm zzbsmVar) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzbog.zzo.zzb(uuid, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }
}
