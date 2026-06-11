package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import i3.a;
import i3.b;
import i3.i;

/* loaded from: classes.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcl zzc(Activity activity, i iVar) {
        b bVar = iVar.f1864b;
        if (bVar == null) {
            bVar = new a(this.zza).b();
        }
        return zzp.zza(new zzp(this, activity, bVar, iVar, null));
    }
}
