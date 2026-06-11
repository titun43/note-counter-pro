package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeny implements zzgyw {
    private final zzfnu zza;
    private final zzdbh zzb;
    private final zzfqg zzc;
    private final zzfqk zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcwi zzg;
    private final zzenr zzh;
    private final zzekl zzi;
    private final Context zzj;
    private final zzfoo zzk;
    private final zzenb zzl;
    private final zzdxt zzm;

    public zzeny(Context context, zzfnu zzfnuVar, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, zzfqk zzfqkVar, zzcwi zzcwiVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, zzfoo zzfooVar, zzenb zzenbVar, zzdxt zzdxtVar) {
        this.zzj = context;
        this.zza = zzfnuVar;
        this.zzh = zzenrVar;
        this.zzb = zzdbhVar;
        this.zzc = zzfqgVar;
        this.zzd = zzfqkVar;
        this.zzg = zzcwiVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeklVar;
        this.zzk = zzfooVar;
        this.zzl = zzenbVar;
        this.zzm = zzdxtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzgz)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzb(zzfjc zzfjcVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgA)).booleanValue() ? "No ad config." : "No fill.";
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        int i5 = zzfiuVar.zzf;
        if (i5 != 0) {
            if (i5 < 200 || i5 >= 300) {
                str = (i5 < 300 || i5 >= 400) ? u.l(new StringBuilder(String.valueOf(i5).length() + 35), "Received error HTTP response code: ", i5) : "No location header to follow redirect or too many redirects.";
            }
            zzfit zzfitVar = zzfiuVar.zzj;
            return zzfitVar == null ? zzfitVar.zza() : str;
        }
        str = str2;
        zzfit zzfitVar2 = zzfiuVar.zzj;
        if (zzfitVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final j3.a zza(Object obj) {
        int i5;
        Bundle bundle;
        final zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzfjcVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcL)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzm.zze(), zzdxh.RENDERING_START.zza());
        }
        String zzb = zzb(zzfjcVar);
        zzekl zzeklVar = this.zzi;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzfiu zzfiuVar = zzfjbVar.zzb;
        zzeklVar.zza(zzfiuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue() && (i5 = zzfiuVar.zzf) != 0 && (i5 < 200 || i5 >= 300)) {
            return zzgzo.zzc(new zzenv(3, zzb));
        }
        String str = zzfiuVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfir zzfirVar : zzfjbVar.zza) {
                zzeklVar.zzb(zzfirVar);
                Iterator it = zzfirVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.zze(zzfirVar, 0L, zzfkm.zzd(1, null, null));
                        break;
                    }
                    zzekg zza = this.zzg.zza(zzfirVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfjcVar, zzfirVar)) {
                    }
                }
            }
        } else {
            zzeklVar.zzc(str, zzfjbVar.zza);
        }
        zzdbh zzdbhVar = this.zzb;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzdbhVar.zzq(zzcrzVar, executor);
        if (zzfiuVar.zzr > 1) {
            return this.zzl.zza(zzfjcVar);
        }
        String zzb2 = zzb(zzfjcVar);
        zzfnu zzfnuVar = this.zza;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfnuVar);
        zzfnb zzi = zzfnf.zza(zzgzo.zzc(new zzenv(3, zzb2)), zzfnoVar, zzfnuVar).zzi();
        final zzenr zzenrVar = this.zzh;
        zzenrVar.zza();
        int i6 = 0;
        for (final zzfir zzfirVar2 : zzfjbVar.zza) {
            Iterator it2 = zzfirVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzekg zza2 = this.zzg.zza(zzfirVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfjcVar, zzfirVar2)) {
                    zzfnl zza3 = zzfnuVar.zza(zzfno.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i6);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzenx
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ j3.a zza(Object obj2) {
                            return zzeny.this.zzc(zzfirVar2, zzfjcVar, zza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i6++;
        }
        zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenr.this.zzb();
            }
        }, executor);
        return zzi;
    }

    public final /* synthetic */ j3.a zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzekg zzekgVar, Throwable th) {
        zzfoe zzn = zzfoe.zzn(this.zzj, 12);
        zzn.zzi(zzfirVar.zzE);
        zzn.zza();
        j3.a zzi = zzgzo.zzi(zzekgVar.zzb(zzfjcVar, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfjcVar, zzfirVar, zzi, this.zzc);
        zzfon.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
