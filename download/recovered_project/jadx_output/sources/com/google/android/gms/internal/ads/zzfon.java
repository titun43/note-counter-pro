package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfon {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzke), str);
    }

    public static void zzb(j3.a aVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(aVar), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static zzfmu zzc(final zzfoe zzfoeVar) {
        return new zzfmu() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfoe.this.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(j3.a aVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(aVar, zzfooVar, zzfoeVar, false);
    }

    public static void zze(j3.a aVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(aVar, zzfooVar, zzfoeVar, true);
    }

    public static void zzf(j3.a aVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(aVar), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    public static int zzg(zzfjk zzfjkVar) {
        int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        return (zzg == 0 || zzg == 1) ? 7 : 23;
    }

    private static void zzh(j3.a aVar, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z4) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(aVar), new zzfok(zzfooVar, zzfoeVar, z4), zzcei.zzg);
        }
    }
}
