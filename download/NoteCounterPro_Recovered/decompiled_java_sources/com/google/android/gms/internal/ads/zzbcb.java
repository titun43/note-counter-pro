package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzbcb {
    public static String zza(Context context, String str, List list, Executor executor) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhah zze = zzhah.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbca
            public final /* synthetic */ void onChecksumsReady(List list2) {
                int type;
                byte[] value;
                zzhah zzhahVar = zzhah.this;
                if (list2 == null) {
                    zzhahVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ApkChecksum c5 = c.c(list2.get(i5));
                        type = c5.getType();
                        if (type == 8) {
                            value = c5.getValue();
                            zzhahVar.zza(zzban.zza(value));
                            return;
                        }
                    }
                    zzhahVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhahVar.zza((Object) null);
                }
            }
        });
        return (String) zze.get();
    }
}
