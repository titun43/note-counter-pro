package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfuw extends zzfus {
    public zzfuw(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfulVar, hashSet, jSONObject, j2);
    }

    private final void zzc(String str) {
        zzfth zza = zzfth.zza();
        if (zza != null) {
            for (zzfsn zzfsnVar : zza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
