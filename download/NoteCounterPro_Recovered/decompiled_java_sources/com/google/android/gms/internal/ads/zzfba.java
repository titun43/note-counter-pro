package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final j3.a zza(final Object obj, final Bundle bundle, final boolean z4) {
        zzfoe zzn = zzfoe.zzn(this.zza, 8);
        zzn.zza();
        Set<zzfax> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zzf = SystemClock.elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof zzdah) {
                bundle.putLong(zzdxh.CLIENT_SIGNALS_START.zza(), currentTimeMillis);
            } else {
                bundle.putLong(zzdxh.GMS_SIGNALS_START.zza(), currentTimeMillis);
            }
        }
        for (final zzfax zzfaxVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfaxVar.zzb()))) {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                j3.a zza = zzfaxVar.zza();
                final Bundle bundle3 = bundle2;
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfay
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfba.this.zzb(elapsedRealtime, zzfaxVar, bundle3);
                    }
                }, zzcei.zzg);
                arrayList.add(zza);
                bundle2 = bundle3;
            }
        }
        j3.a zza2 = zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfav zzfavVar = (zzfav) ((j3.a) it.next()).get();
                    if (zzfavVar != null) {
                        boolean z5 = z4;
                        zzfavVar.zza(obj2);
                        if (z5) {
                            zzfavVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (obj2 instanceof zzdah) {
                        bundle4.putLong(zzdxh.CLIENT_SIGNALS_END.zza(), currentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdxh.GMS_SIGNALS_END.zza(), currentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(zza2, this.zzd, zzn);
        }
        return zza2;
    }

    public final void zzb(long j2, zzfax zzfaxVar, Bundle bundle) {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String zza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(zza.length() + 25 + String.valueOf(elapsedRealtime).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(zza);
            sb.append(" = ");
            sb.append(elapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int zzb = zzfaxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(zzb);
                    bundle.putLong(sb2.toString(), elapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue()) {
            zzdxy zza2 = this.zze.zza();
            zza2.zzc("action", "lat_ms");
            zza2.zzc("lat_grp", "sig_lat_grp");
            zza2.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
            zza2.zzc("clat_ms", String.valueOf(elapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcJ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza2.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zzf);
                            if (zzfaxVar.zzb() <= 39 || zzfaxVar.zzb() >= 52) {
                                zza2.zzc("lat_clsg", valueOf);
                            } else {
                                zza2.zzc("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            zza2.zzh();
        }
    }
}
