package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzvq implements zzwv, zztk {
    final /* synthetic */ zzvs zza;
    private final Object zzb;
    private zzwu zzc;
    private zztj zzd;

    public zzvq(zzvs zzvsVar, Object obj) {
        Objects.requireNonNull(zzvsVar);
        this.zza = zzvsVar;
        this.zzc = zzvsVar.zzf(null);
        this.zzd = zzvsVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i5, zzwk zzwkVar) {
        zzwk zzwkVar2;
        if (zzwkVar != null) {
            zzwkVar2 = this.zza.zzx(this.zzb, zzwkVar);
            if (zzwkVar2 == null) {
                return false;
            }
        } else {
            zzwkVar2 = null;
        }
        zzvs zzvsVar = this.zza;
        zzvsVar.zzw(this.zzb, 0);
        zzwu zzwuVar = this.zzc;
        int i6 = zzwuVar.zza;
        if (!Objects.equals(zzwuVar.zzb, zzwkVar2)) {
            this.zzc = zzvsVar.zzg(0, zzwkVar2);
        }
        zztj zztjVar = this.zzd;
        int i7 = zztjVar.zza;
        if (Objects.equals(zztjVar.zzb, zzwkVar2)) {
            return true;
        }
        this.zzd = zzvsVar.zzi(0, zzwkVar2);
        return true;
    }

    private final zzwg zzg(zzwg zzwgVar, zzwk zzwkVar) {
        zzvs zzvsVar = this.zza;
        Object obj = this.zzb;
        zzvsVar.zzy(obj, zzwgVar.zzc, zzwkVar);
        zzvsVar.zzy(obj, zzwgVar.zzd, zzwkVar);
        return zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i5, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, int i6) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzd(zzwbVar, zzwgVar, i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i5, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zze(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i5, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzf(zzwbVar, zzwgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i5, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z4) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzg(zzwbVar, zzwgVar, iOException, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i5, zzwk zzwkVar, zzwg zzwgVar) {
        if (zzf(0, zzwkVar)) {
            zzwu zzwuVar = this.zzc;
            zzg(zzwgVar, zzwkVar);
            zzwuVar.zzh(zzwgVar);
        }
    }
}
