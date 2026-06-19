package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzfqi implements zzgzl {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzddu zzc;
    final /* synthetic */ zzfqk zzd;

    public zzfqi(zzfqk zzfqkVar, zzfoe zzfoeVar, zzfoo zzfooVar, zzddu zzdduVar) {
        this.zza = zzfoeVar;
        this.zzb = zzfooVar;
        this.zzc = zzdduVar;
        Objects.requireNonNull(zzfqkVar);
        this.zzd = zzfqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzfoe zzfoeVar = this.zza;
        if (zzfoeVar == null) {
            return;
        }
        zzfoeVar.zzd(false);
        zzfoo zzfooVar = this.zzb;
        if (zzfooVar != null) {
            zzfooVar.zza(zzfoeVar);
            zzfooVar.zzh();
        } else {
            zzfqk zzfqkVar = this.zzd;
            zzfqkVar.zze().zzb(zzfoeVar.zzm());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r4.equals("PRECISE") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i5;
        int hashCode;
        zzfoe zzfoeVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfoeVar != null) {
            zzfoeVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            zzfoo zzfooVar = this.zzb;
            if (zzfooVar == null) {
                this.zzd.zze().zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zza(zzfoeVar);
                zzfooVar.zzh();
            }
        }
        zzddu zzdduVar = this.zzc;
        if (zzdduVar == null) {
            return;
        }
        String zzb = this.zzd.zzd().zzb();
        if (TextUtils.isEmpty(zzb)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzb);
            Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("precision");
            String optString3 = jSONObject.optString("currency");
            long optLong = jSONObject.optLong("value", 0L);
            int hashCode2 = optString.hashCode();
            int i6 = 3;
            if (hashCode2 == 66934) {
                if (optString.equals("CPC")) {
                    i5 = 2;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                }
                i5 = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            } else if (hashCode2 != 66944) {
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    optLong /= 1000;
                    i5 = 3;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                        if (optString2.equals("ESTIMATED")) {
                            i6 = 1;
                            zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i5, i6, optString3, optLong));
                            return;
                        }
                        i6 = 0;
                        zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i5, i6, optString3, optLong));
                        return;
                    }
                    if (hashCode != 399232571) {
                        if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                            i6 = 2;
                            zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i5, i6, optString3, optLong));
                            return;
                        }
                        i6 = 0;
                        zzdduVar.zza(new com.google.android.gms.ads.internal.client.zzt(i5, i6, optString3, optLong));
                        return;
                    }
                }
                i5 = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            } else {
                if (optString.equals("CPM")) {
                    i5 = 1;
                    hashCode = optString2.hashCode();
                    if (hashCode != -2131980260) {
                    }
                }
                i5 = 0;
                hashCode = optString2.hashCode();
                if (hashCode != -2131980260) {
                }
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "UrlPinger.pingUrl");
        }
    }
}
