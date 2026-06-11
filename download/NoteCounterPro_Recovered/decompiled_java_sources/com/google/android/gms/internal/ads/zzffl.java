package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzffl implements zzfgj {
    private zzdam zza;
    private final Executor zzb = zzhaf.zza();

    public final zzdam zza() {
        return this.zza;
    }

    public final j3.a zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zza = zzfgiVar.zza(zzfgkVar.zzb);
        zza.zzj(new zzfgn(true));
        zzdam zzdamVar2 = (zzdam) zza.zzh();
        this.zza = zzdamVar2;
        final zzcxj zza2 = zzdamVar2.zza();
        final zzfli zzfliVar = new zzfli();
        zzgzg zzw = zzgzg.zzw(zza2.zzb());
        zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                zzfjc zzfjcVar = (zzfjc) obj;
                zzfliVar.zzb = zzfjcVar;
                Iterator it = zzfjcVar.zzb.zza.iterator();
                boolean z4 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfir) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z4 = true;
                        }
                    } else if (z4) {
                        return zza2.zzc(zzgzo.zza(zzfjcVar));
                    }
                }
                return zzgzo.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj(zzw, zzgywVar, executor), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzffj
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzfli zzfliVar2 = zzfli.this;
                zzfliVar2.zzc = (zzcwf) obj;
                return zzfliVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ j3.a zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
