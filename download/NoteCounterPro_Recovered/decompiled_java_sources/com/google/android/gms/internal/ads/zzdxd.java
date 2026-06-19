package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdxd implements zzdgh, com.google.android.gms.ads.internal.client.zza, zzdbz, zzdbj, zzdea {
    private final Context zzc;
    private final zzfkd zzd;
    private final zzdxz zze;
    private final zzfjc zzf;
    private final zzfir zzg;
    private final zzeiu zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhK)).booleanValue();

    public zzdxd(Context context, zzfkd zzfkdVar, zzdxz zzdxzVar, zzfjc zzfjcVar, zzfir zzfirVar, zzeiu zzeiuVar, String str) {
        this.zzc = context;
        this.zzd = zzfkdVar;
        this.zze = zzdxzVar;
        this.zzf = zzfjcVar;
        this.zzg = zzfirVar;
        this.zzh = zzeiuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbZ);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z4 = false;
                    if (str2 != null && str != null) {
                        try {
                            z4 = Pattern.matches(str2, str);
                        } catch (RuntimeException e4) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z4);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdxy zzg(String str) {
        zzfjc zzfjcVar = this.zzf;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzdxy zza = this.zze.zza();
        zza.zza(zzfjbVar.zzb);
        zzfir zzfirVar = this.zzg;
        zza.zzb(zzfirVar);
        zza.zzc("action", str);
        zza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfirVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfirVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : n.a.ONLINE_EXTRAS_KEY);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zza.zzc("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfjcVar);
            zza.zzc("scar", String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjcVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(zzdxy zzdxyVar) {
        if (!this.zzg.zzb()) {
            zzdxyVar.zzd();
            return;
        }
        String zzg = zzdxyVar.zzg();
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zzh.zze(new zzeiw(System.currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzg, 2));
    }

    private final boolean zzj() {
        int i5 = this.zzg.zzb;
        return i5 == 2 || i5 == 5 || i5 == 6 || i5 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "adapter");
            int i5 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i5 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i5 >= 0) {
                zzg.zzc("arec", String.valueOf(i5));
            }
            String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzd(zzdmb zzdmbVar) {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdmbVar.getMessage())) {
                zzg.zzc("msg", zzdmbVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        if (zzf()) {
            zzdxy zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzg.zzc("pil", String.valueOf(System.currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdxy zzg = zzg("impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzg.zzc("p_imp_l", String.valueOf(System.currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zze() {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            this.zzj = System.currentTimeMillis();
            zzdxy zzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc));
                zzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzg.zzd();
        }
    }
}
