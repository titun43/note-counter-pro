package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        zzdvl zzc;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbqg zzbqgVar = (zzbqg) it.next();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkM)).booleanValue()) {
                        zzdvl zzc2 = this.zzb.zzc(zzbqgVar.zza);
                        if (zzc2 != null && (zzbwhVar = zzc2.zzc) != null) {
                            str = zzbwhVar.toString();
                        }
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    String str2 = str;
                    boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue() && (zzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzc.zzd;
                    List list2 = this.zzd;
                    String str3 = zzbqgVar.zza;
                    list2.add(new zzeaz(str3, str2, this.zzb.zzd(str3), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z4));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    public final JSONArray zzb() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zzeak zzeakVar = this.zza;
                    if (!zzeakVar.zze()) {
                        zza();
                        return jSONArray;
                    }
                    zzc(zzeakVar.zzd());
                }
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((zzeaz) it.next()).zza());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
