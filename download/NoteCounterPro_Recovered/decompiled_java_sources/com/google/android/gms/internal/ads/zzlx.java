package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzlx implements zzwv, zztk {
    final /* synthetic */ zzmc zza;
    private final zzlz zzb;

    public zzlx(zzmc zzmcVar, zzlz zzlzVar) {
        Objects.requireNonNull(zzmcVar);
        this.zza = zzmcVar;
        this.zzb = zzlzVar;
    }

    private final Pair zzf(int i5, zzwk zzwkVar) {
        zzwk zzwkVar2;
        zzwk zzwkVar3 = null;
        if (zzwkVar != null) {
            zzlz zzlzVar = this.zzb;
            int i6 = 0;
            while (true) {
                List list = zzlzVar.zzc;
                if (i6 >= list.size()) {
                    zzwkVar2 = null;
                    break;
                }
                if (((zzwk) list.get(i6)).zzd == zzwkVar.zzd) {
                    Object obj = zzwkVar.zza;
                    Object obj2 = zzlzVar.zzb;
                    int i7 = zzmj.zzb;
                    zzwkVar2 = zzwkVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i6++;
            }
            if (zzwkVar2 == null) {
                return null;
            }
            zzwkVar3 = zzwkVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzwkVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final int i6) {
        final Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzlx.this.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, i6);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzlx.this.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzlx.this.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i5, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z4) {
        final Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzlx.this.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, iOException, z4);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i5, zzwk zzwkVar, final zzwg zzwgVar) {
        final Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = zzf;
                    zzlx.this.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwgVar);
                }
            });
        }
    }
}
