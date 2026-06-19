package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzbaw extends zzbby {
    public zzbaw(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i5, int i6) {
        super(zzbakVar, "YcvOy2Y9scoLzd9aO/r1q51CuRDPgptfjUczBG/4u9TSMf5O8lCrtIMZ2+ctDcs+", "6V7/ExCl9vngHnxEtX1goXpmDP9bA02eRvmHfr0qsgM=", zzawgVar, i5, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzaf(3);
        try {
            int i5 = 1;
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i5 = 2;
            }
            zzawgVar.zzaf(i5);
        } catch (InvocationTargetException e4) {
            if (!(e4.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e4;
            }
        }
    }
}
