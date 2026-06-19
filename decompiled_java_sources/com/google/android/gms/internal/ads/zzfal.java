package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfal implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzfal(zzgzy zzgzyVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfak
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfal.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 35;
    }

    public final zzfam zzc() {
        Context context = this.zzb;
        boolean d5 = z2.c.a(context).d();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(context);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzK = com.google.android.gms.ads.internal.util.zzs.zzK();
        com.google.android.gms.ads.internal.zzt.zzc();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzfam(d5, zzJ, str, zzK, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, b3.e.d(context, ModuleDescriptor.MODULE_ID, false), b3.e.a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
