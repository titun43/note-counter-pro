package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfux extends zzfus {
    public zzfux(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfulVar, hashSet, jSONObject, j2);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzful zzfulVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfud.zzg(jSONObject, zzfulVar.zzd())) {
            return null;
        }
        zzfulVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfth zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfth.zza()) != null) {
            for (zzfsn zzfsnVar : zza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
