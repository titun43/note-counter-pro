package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdvm {
    private final Map zza = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(String str, zzfki zzfkiVar) {
        zzbwh zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbwh zzbwhVar = null;
        if (zzfkiVar != null) {
            try {
                zzB = zzfkiVar.zzB();
            } catch (zzfjr unused) {
            }
            if (zzfkiVar != null) {
                try {
                    zzbwhVar = zzfkiVar.zzC();
                } catch (zzfjr unused2) {
                }
            }
            boolean z4 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
                if (zzfkiVar != null) {
                    try {
                        zzfkiVar.zzn();
                    } catch (zzfjr unused3) {
                    }
                }
                z4 = false;
            }
            this.zza.put(str, new zzdvl(str, zzB, zzbwhVar, z4));
        }
        zzB = null;
        if (zzfkiVar != null) {
        }
        boolean z42 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
        }
        this.zza.put(str, new zzdvl(str, zzB, zzbwhVar, z42));
    }

    public final synchronized void zzb(String str, zzbvs zzbvsVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdvl(str, zzbvsVar.zzf(), zzbvsVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized zzdvl zzc(String str) {
        return (zzdvl) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbwh zzbwhVar;
        zzdvl zzc = zzc(str);
        return (zzc == null || (zzbwhVar = zzc.zzb) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzbwhVar.toString();
    }
}
