package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzddu extends zzdhd implements zzdbz, zzdde {
    private final zzfir zzb;
    private final AtomicBoolean zzc;
    private final zzfjc zzd;

    public zzddu(Set set, zzfir zzfirVar, zzfjc zzfjcVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfirVar;
        this.zzd = zzfjcVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjb)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzddt
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdds
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddw) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        int i5 = this.zzb.zzb;
        if (i5 == 2 || i5 == 5 || i5 == 4 || i5 == 6 || i5 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdde
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
