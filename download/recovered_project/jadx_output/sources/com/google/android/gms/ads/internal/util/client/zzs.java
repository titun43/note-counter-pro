package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import b3.e;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class zzs {
    public static Object zza(Context context, String str, zzq zzqVar) {
        try {
            return zzqVar.zza(zzc(context).b(str));
        } catch (Exception e4) {
            throw new zzr(e4);
        }
    }

    public static Context zzb(Context context) {
        return zzc(context).f728a;
    }

    private static e zzc(Context context) {
        try {
            return e.c(context, e.f717b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e4) {
            throw new zzr(e4);
        }
    }
}
