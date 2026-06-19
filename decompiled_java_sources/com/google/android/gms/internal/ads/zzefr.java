package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzefr {
    private final zzgzy zza;
    private final zzeew zzb;
    private final zzika zzc;

    public zzefr(zzgzy zzgzyVar, zzeew zzeewVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzeewVar;
        this.zzc = zzikaVar;
    }

    private final j3.a zzg(final zzbzu zzbzuVar, zzefh zzefhVar, final zzefh zzefhVar2, final zzgyw zzgywVar) {
        j3.a zzh;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            zzh = zzgzo.zzc(new zzeff(1));
        } else {
            zzh = zzgzo.zzh(zzefhVar.zza(zzbzuVar), ExecutionException.class, zzefq.zza, this.zza);
        }
        zzgzy zzgzyVar = this.zza;
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj(zzgzg.zzw(zzh), zzefj.zza, zzgzyVar), zzgywVar, zzgzyVar), zzeff.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzefr.this.zzc(zzefhVar2, zzbzuVar, zzgywVar, (zzeff) obj);
            }
        }, zzgzyVar);
    }

    public final j3.a zza(final zzbzu zzbzuVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                String str = new String(zzgxf.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbzu zzbzuVar2 = zzbzu.this;
                zzbzuVar2.zzj = str;
                return zzgzo.zza(zzbzuVar2);
            }
        };
        final zzeew zzeewVar = this.zzb;
        Objects.requireNonNull(zzeewVar);
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ j3.a zza(zzbzu zzbzuVar2) {
                return zzeew.this.zza(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ j3.a zza(zzbzu zzbzuVar2) {
                return zzefr.this.zzd(zzbzuVar2);
            }
        }, zzgywVar);
    }

    public final j3.a zzb(zzbzu zzbzuVar) {
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ j3.a zza(zzbzu zzbzuVar2) {
                return zzefr.this.zze(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ j3.a zza(zzbzu zzbzuVar2) {
                return zzefr.this.zzf(zzbzuVar2);
            }
        }, zzefn.zza);
    }

    public final /* synthetic */ j3.a zzc(zzefh zzefhVar, zzbzu zzbzuVar, zzgyw zzgywVar, zzeff zzeffVar) {
        return zzgzo.zzj(zzefhVar.zza(zzbzuVar), zzgywVar, this.zza);
    }

    public final /* synthetic */ j3.a zzd(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzc(zzbzuVar, Binder.getCallingUid());
    }

    public final /* synthetic */ j3.a zze(zzbzu zzbzuVar) {
        return this.zzb.zzd(zzbzuVar.zzh);
    }

    public final /* synthetic */ j3.a zzf(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzd(zzbzuVar.zzh);
    }
}
