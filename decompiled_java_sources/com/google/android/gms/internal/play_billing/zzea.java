package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.e;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final /* synthetic */ class zzea {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!e.a(unsafe, obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
