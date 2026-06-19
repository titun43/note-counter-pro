package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes.dex */
public interface zzfxm {
    static String zzb(File file, String str, zzfxq zzfxqVar) {
        return new File(file, str).getPath();
    }

    default String zza(File file, String str) {
        return zzb(file, str, zzfxq.zza);
    }
}
