package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzbro implements zzbrg, zzbre {
    private zzcjl zza;

    public zzbro(Context context, VersionInfoParcel versionInfoParcel, zzazh zzazhVar, com.google.android.gms.ads.internal.zza zzaVar) {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcjl zza = zzckb.zza(context, zzclv.zzb(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, versionInfoParcel, null, null, null, zzbgd.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbro.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzf(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbro.this.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbro.this.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbro.this.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzi(final zzbrf zzbrfVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzclj zzP = zzcjlVar.zzP();
            Objects.requireNonNull(zzbrfVar);
            zzP.zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzbri
                @Override // com.google.android.gms.internal.ads.zzcli
                public final /* synthetic */ void zza() {
                    zzbrf.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final void zzj() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final boolean zzk() {
        zzcjl zzcjlVar = this.zza;
        return zzcjlVar == null || zzcjlVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final zzbsn zzl() {
        return new zzbsn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzm(String str, zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzab(str, new zzbrh(this, zzbohVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzn(String str, final zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzad(str, new x2.e() { // from class: com.google.android.gms.internal.ads.zzbrm
                @Override // x2.e
                public final /* synthetic */ boolean apply(Object obj) {
                    zzboh zzbohVar2 = (zzboh) obj;
                    if (zzbohVar2 instanceof zzbrh) {
                        return ((zzbrh) zzbohVar2).zzb().equals(zzboh.this);
                    }
                    return false;
                }
            });
        }
    }

    public final /* synthetic */ void zzo(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zza(str);
        }
    }

    public final /* synthetic */ void zzp(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzq(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzr(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadUrl(str);
        }
    }
}
