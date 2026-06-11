package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzclx {
    private String zza;
    private zziff zzb;
    private zzijc zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzclx(zzclk zzclkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String e4 = a.a.q("GET_VARIATIONS_HEADER") ? j1.f.e() : null;
            if (e4 != null && !e4.isEmpty()) {
                this.zza = e4;
                byte[] decode = Base64.decode(e4, 10);
                this.zzb = zziff.zzc(decode, zzibb.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue()) {
                    this.zzc = zzijc.zzc(decode, zzibb.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzki)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclx.this.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkj)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzicg e5) {
            e = e5;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e6) {
            e = e6;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzijc zzijcVar = this.zzc;
        if (zzijcVar != null) {
            return Base64.encodeToString(zzijcVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziff zzd() {
        return this.zzb;
    }
}
