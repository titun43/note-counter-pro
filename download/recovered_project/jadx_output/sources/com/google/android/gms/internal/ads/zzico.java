package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzico {
    public static final List zza(Object obj, long j2) {
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j2);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        zziem.zzo(obj, j2, zzh);
        return zzh;
    }
}
