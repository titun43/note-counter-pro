package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbqf implements zzarr {
    private volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    public final zzaru zza(zzary zzaryVar) {
        Parcelable.Creator<zzbpt> creator = zzbpt.CREATOR;
        Map zzm = zzaryVar.zzm();
        int size = zzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i5 = 0;
        for (Map.Entry entry : zzm.entrySet()) {
            strArr[i5] = (String) entry.getKey();
            strArr2[i5] = (String) entry.getValue();
            i5++;
        }
        zzbpt zzbptVar = new zzbpt(zzaryVar.zzh(), strArr, strArr2);
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzcen zzcenVar = new zzcen();
            this.zza = new zzbps(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbqd(this, zzcenVar), new zzbqe(this, zzcenVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqb zzbqbVar = new zzbqb(this, zzbptVar);
            zzgzy zzgzyVar = zzcei.zza;
            j3.a zzi = zzgzo.zzi(zzgzo.zzj(zzcenVar, zzbqbVar, zzgzyVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfr)).intValue(), TimeUnit.MILLISECONDS, zzcei.zzd);
            zzi.addListener(new zzbqc(this), zzgzyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzi.get();
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbpv zzbpvVar = (zzbpv) new zzbzs(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpvVar != null) {
                if (zzbpvVar.zza) {
                    throw new zzash(zzbpvVar.zzb);
                }
                String[] strArr3 = zzbpvVar.zze;
                String[] strArr4 = zzbpvVar.zzf;
                if (strArr3.length == strArr4.length) {
                    HashMap hashMap = new HashMap();
                    for (int i6 = 0; i6 < strArr3.length; i6++) {
                        hashMap.put(strArr3[i6], strArr4[i6]);
                    }
                    return new zzaru(zzbpvVar.zzc, zzbpvVar.zzd, hashMap, zzbpvVar.zzg, zzbpvVar.zzh);
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbps zzc() {
        return this.zza;
    }
}
