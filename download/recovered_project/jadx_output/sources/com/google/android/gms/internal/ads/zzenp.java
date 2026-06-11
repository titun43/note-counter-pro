package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzenp implements zzgzl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfqg zze;
    final /* synthetic */ zzfjc zzf;
    final /* synthetic */ zzenr zzg;

    public zzenp(zzenr zzenrVar, long j2, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j2;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        int i5;
        int i6;
        com.google.android.gms.ads.internal.client.zze zzb;
        Integer valueOf;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzenr zzenrVar = this.zzg;
        ((x2.c) zzenrVar.zzj()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i6 = 2;
        } else {
            if (th instanceof zzemz) {
                i5 = 3;
            } else if (th instanceof CancellationException) {
                i6 = 4;
            } else if (th instanceof zzfjr) {
                i6 = 5;
            } else if (th instanceof zzecr) {
                i6 = zzfkm.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() && (th instanceof zzekk) && (zzb = ((zzekk) th).zzb()) != null) {
                    valueOf = Integer.valueOf(zzb.zza);
                    i5 = i6;
                    synchronized (zzenrVar) {
                        try {
                            if (zzenrVar.zzn()) {
                                zzenrVar.zzk().zza(this.zzb, this.zzc, i5, th instanceof zzekk ? (zzekk) th : null, elapsedRealtime);
                                elapsedRealtime = elapsedRealtime;
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjG)).booleanValue()) {
                                zzfqk zzl = zzenrVar.zzl();
                                zzfqg zzfqgVar = this.zze;
                                zzfjc zzfjcVar = this.zzf;
                                zzfir zzfirVar = this.zzc;
                                zzl.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzn), zzfirVar.zzax);
                            }
                            if (zzenrVar.zzp()) {
                                return;
                            }
                            LinkedHashMap zzm = zzenrVar.zzm();
                            zzfir zzfirVar2 = this.zzc;
                            zzm.put(zzfirVar2, new zzenq(this.zzd, zzfirVar2.zzaf, i5, elapsedRealtime, valueOf));
                            com.google.android.gms.ads.internal.client.zze zza = zzfkm.zza(th);
                            int i7 = zza.zza;
                            if ((i7 == 3 || i7 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                                zza = zzfkm.zza(new zzekk(13, zza.zzd));
                            }
                            zzenrVar.zzo().zze(zzfirVar2, elapsedRealtime, zza);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                i5 = 6;
            }
            valueOf = null;
            synchronized (zzenrVar) {
            }
        }
        i5 = i6;
        valueOf = null;
        synchronized (zzenrVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        long j2;
        zzenr zzenrVar = this.zzg;
        ((x2.c) zzenrVar.zzj()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            try {
                if (zzenrVar.zzn()) {
                    j2 = elapsedRealtime;
                    zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, j2);
                } else {
                    j2 = elapsedRealtime;
                }
                if (zzenrVar.zzp()) {
                    return;
                }
                zzfir zzfirVar = this.zzc;
                if (zzenrVar.zzi(zzfirVar)) {
                    ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = j2;
                } else {
                    long j5 = j2;
                    j2 = j5;
                    zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, j5, null));
                }
                zzenrVar.zzo().zzd(zzfirVar, j2, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
