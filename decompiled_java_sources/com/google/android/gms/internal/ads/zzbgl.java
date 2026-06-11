package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzbgl {
    private final Context zza;

    public zzbgl(Context context) {
        b0.h(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        Context context = this.zza;
        return ((Boolean) com.google.android.gms.ads.internal.util.zzcb.zza(context, zzbgk.zza)).booleanValue() && z2.c.a(context).f1474g.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzb() {
        return zzc(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(Intent intent) {
        b0.h(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
