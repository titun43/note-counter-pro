package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdnp extends zzbko {
    private final zzdoh zza;
    private a3.a zzb;

    public zzdnp(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static float zzb(a3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) a3.b.b(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zze() {
        zzclv zzN;
        int i5;
        int i6;
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzab() != 0.0f) {
            return zzdohVar.zzab();
        }
        if (zzdohVar.zzy() != null) {
            try {
                return zzdohVar.zzy().zzm();
            } catch (RemoteException e4) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e4);
                return 0.0f;
            }
        }
        a3.a aVar = this.zzb;
        if (aVar != null) {
            return zzb(aVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznO)).booleanValue() && zzdohVar.zzU() != null && (zzN = zzdohVar.zzU().zzN()) != null && (i5 = zzN.zzb) >= 0 && (i6 = zzN.zza) > 0) {
            return i5 / i6;
        }
        zzbks zzD = zzdohVar.zzD();
        if (zzD == null) {
            return 0.0f;
        }
        float zze = (zzD.zze() == -1 || zzD.zzf() == -1) ? 0.0f : zzD.zze() / zzD.zzf();
        return zze == 0.0f ? zzb(zzD.zzb()) : zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzf(a3.a aVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final a3.a zzg() {
        a3.a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbks zzD = this.zza.zzD();
        if (zzD == null) {
            return null;
        }
        return zzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzh() {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final float zzi() {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final com.google.android.gms.ads.internal.client.zzed zzj() {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzk() {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final boolean zzl() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final void zzm(zzbma zzbmaVar) {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() instanceof zzckr) {
            ((zzckr) zzdohVar.zzy()).zzv(zzbmaVar);
        }
    }
}
