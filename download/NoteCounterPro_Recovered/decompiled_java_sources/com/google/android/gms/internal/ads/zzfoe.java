package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public interface zzfoe {
    static zzfoe zzn(Context context, int i5) {
        boolean booleanValue;
        if (zzfor.zza()) {
            int i6 = i5 - 2;
            if (i6 == 20 || i6 == 21) {
                booleanValue = ((Boolean) zzbix.zze.zze()).booleanValue();
            } else if (i6 != 110) {
                switch (i6) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbix.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbix.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbix.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkm)).booleanValue();
            }
            if (booleanValue) {
                return new zzfog(context, i5);
            }
        }
        return new zzfph();
    }

    static zzfoe zzo(Context context, int i5, int i6, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfoe zzn = zzn(context, i5);
        if (zzn instanceof zzfog) {
            zzn.zza();
            zzn.zzp(i6);
            zzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfon.zza(str)) {
                zzn.zze(str);
            }
        }
        return zzn;
    }

    zzfoe zza();

    boolean zzb();

    zzfoe zzc();

    zzfoe zzd(boolean z4);

    zzfoe zze(String str);

    zzfoe zzf(zzfot zzfotVar);

    zzfoe zzg(zzfjb zzfjbVar);

    zzfoe zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfoe zzi(String str);

    zzfoe zzj(Throwable th);

    zzfoe zzk(String str);

    boolean zzl();

    zzfoh zzm();

    zzfoe zzp(int i5);
}
