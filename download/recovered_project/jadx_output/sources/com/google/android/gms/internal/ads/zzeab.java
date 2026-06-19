package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzeab extends zzbqj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzcen zze;
    final /* synthetic */ zzeak zzf;

    public zzeab(zzeak zzeakVar, Object obj, String str, long j2, zzfoe zzfoeVar, zzcen zzcenVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = zzfoeVar;
        this.zze = zzcenVar;
        Objects.requireNonNull(zzeakVar);
        this.zzf = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze() {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str = this.zzb;
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzeakVar.zzm(str, true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzb(str);
            zzeakVar.zzs().zzb(str);
            zzfor zzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzd(true);
            zzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str2 = this.zzb;
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzeakVar.zzm(str2, false, str, (int) (SystemClock.elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzc(str2, "error");
            zzeakVar.zzs().zzc(str2, "error");
            zzfor zzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk(str);
            zzfoeVar.zzd(false);
            zzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
