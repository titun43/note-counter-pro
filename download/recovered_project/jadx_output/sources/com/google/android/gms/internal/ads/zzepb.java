package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzepb implements zzeki {
    private final zzeqf zza;
    private final zzdvp zzb;

    public zzepb(zzeqf zzeqfVar, zzdvp zzdvpVar) {
        this.zza = zzeqfVar;
        this.zzb = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) {
        zzbvs zzbvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzck)).booleanValue()) {
            try {
                zzbvsVar = this.zzb.zzb(str);
            } catch (RemoteException e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e4);
                zzbvsVar = null;
            }
        } else {
            zzbvsVar = this.zza.zzb(str);
        }
        if (zzbvsVar == null) {
            return null;
        }
        return new zzekj(zzbvsVar, new zzelv(), str);
    }
}
