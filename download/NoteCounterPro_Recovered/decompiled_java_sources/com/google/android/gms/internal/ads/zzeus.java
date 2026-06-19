package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzeus implements zzfav {
    private final Integer zza;

    private zzeus(Integer num) {
        this.zza = num;
    }

    public static /* synthetic */ zzeus zzc(VersionInfoParcel versionInfoParcel) {
        int i5;
        int extensionVersion;
        int extensionVersion2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue()) {
            return new zzeus(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int i6 = 0;
        try {
            i5 = Build.VERSION.SDK_INT;
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdUtil.getAdServicesExtensionVersion");
        }
        if (i5 >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i6 = SdkExtensions.getExtensionVersion(1000000);
                return new zzeus(Integer.valueOf(i6));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlB)).booleanValue()) {
            if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlA)).intValue() && i5 >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i6 = SdkExtensions.getExtensionVersion(31);
                }
            }
        }
        return new zzeus(Integer.valueOf(i6));
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (num != null) {
            zzdahVar.zza.putInt("aos", num.intValue());
        }
    }
}
