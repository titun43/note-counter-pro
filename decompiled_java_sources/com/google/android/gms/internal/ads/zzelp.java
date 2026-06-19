package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzelp implements zzekm {
    private final Context zza;
    private final zzcvc zzb;
    private View zzc;
    private zzbuc zzd;

    public zzelp(Context context, zzcvc zzcvcVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
                String str = zzfirVar.zzU;
                String jSONObject = zzfirVar.zzv.toString();
                zzfjk zzfjkVar = zzfjcVar.zza.zza;
                zzbvsVar.zzq(str, jSONObject, zzfjkVar.zzd, new a3.b(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzf);
                return;
            }
            String str2 = zzfirVar.zzU;
            String jSONObject2 = zzfirVar.zzv.toString();
            zzfjk zzfjkVar2 = zzfjcVar.zza.zza;
            zzbvsVar.zzi(str2, jSONObject2, zzfjkVar2.zzd, new a3.b(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar2.zzf);
        } catch (RemoteException e4) {
            throw new zzfjr(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, final zzfir zzfirVar, final zzekj zzekjVar) {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            try {
                view = (View) a3.b.b(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfjr(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelm
                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ j3.a zza(Object obj) {
                                return zzelp.this.zzc(view, zzfirVar, obj);
                            }
                        }, zzcei.zzf).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        throw new zzfjr(e4);
                    }
                }
            } catch (RemoteException e5) {
                throw new zzfjr(e5);
            }
        } else {
            view = this.zzc;
        }
        zzcty zzf2 = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzcue(view, null, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzeln
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                try {
                    return ((zzbvs) zzekj.this.zzb).zzh();
                } catch (RemoteException e6) {
                    throw new zzfjr(e6);
                }
            }
        }, (zzfis) zzfirVar.zzu.get(0)));
        zzf2.zzk().zza(view);
        ((zzelv) zzekjVar.zzc).zzc(zzf2.zzg());
        return zzf2.zzi();
    }

    public final /* synthetic */ j3.a zzc(View view, zzfir zzfirVar, Object obj) {
        return zzgzo.zza(zzcvr.zza(this.zza, view, zzfirVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbuc zzbucVar) {
        this.zzd = zzbucVar;
    }
}
