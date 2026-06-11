package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbai implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbak zzb;

    public zzbai(zzbak zzbakVar, int i5, boolean z4) {
        this.zza = i5;
        Objects.requireNonNull(zzbakVar);
        this.zzb = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaxg zzaxgVar;
        int i5 = this.zza;
        zzbak zzbakVar = this.zzb;
        if (i5 > 0) {
            try {
                Thread.sleep(i5 * zzbgj.zzq.zzf);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbakVar.zza;
            zzaxgVar = zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaxgVar = null;
        }
        zzbak zzbakVar2 = this.zzb;
        zzbakVar2.zzs(zzaxgVar);
        int i6 = this.zza;
        if (i6 < 4) {
            if (zzaxgVar != null && zzaxgVar.zza() && !zzaxgVar.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaxgVar.zzg() && zzaxgVar.zzh().zza() && zzaxgVar.zzh().zzb() != -2) {
                return;
            }
            zzbakVar2.zzp(i6 + 1, true);
        }
    }
}
