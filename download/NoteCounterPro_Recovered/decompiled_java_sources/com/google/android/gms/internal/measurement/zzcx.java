package com.google.android.gms.internal.measurement;

import a3.b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import b3.e;
import com.google.android.gms.common.internal.b0;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
final class zzcx extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzee zzeeVar, String str, String str2, Context context, Bundle bundle) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() {
        boolean zzV;
        String str;
        String str2;
        String str3;
        zzcc zzccVar;
        String packageName;
        zzcc zzccVar2;
        String str4;
        String str5;
        try {
            zzee zzeeVar = this.zze;
            zzV = zzee.zzV(this.zza, this.zzb);
            if (zzV) {
                String str6 = this.zzb;
                String str7 = this.zza;
                str5 = this.zze.zzd;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            b0.g(this.zzc);
            zzee zzeeVar2 = this.zze;
            zzeeVar2.zzj = zzeeVar2.zzf(this.zzc, true);
            zzccVar = this.zze.zzj;
            if (zzccVar == null) {
                str4 = this.zze.zzd;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a5 = e.a(this.zzc, "com.google.android.gms.measurement.dynamite");
            int d5 = e.d(this.zzc, "com.google.android.gms.measurement.dynamite", false);
            int max = Math.max(a5, d5);
            boolean z4 = d5 < a5;
            long j2 = max;
            Bundle bundle = this.zzd;
            Context context = this.zzc;
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            zzcl zzclVar = new zzcl(61000L, j2, z4, str, str2, str3, bundle, packageName);
            zzccVar2 = this.zze.zzj;
            b0.g(zzccVar2);
            zzccVar2.initialize(new b(this.zzc), zzclVar, this.zzh);
        } catch (Exception e4) {
            this.zze.zzS(e4, true, false);
        }
    }
}
