package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.l;

/* loaded from: classes.dex */
public final class zzdst extends zzbll {
    private final Context zza;
    private final zzdoh zzb;
    private zzdpg zzc;
    private zzdoc zzd;

    public zzdst(Context context, zzdoh zzdohVar, zzdpg zzdpgVar, zzdoc zzdocVar) {
        this.zza = context;
        this.zzb = zzdohVar;
        this.zzc = zzdpgVar;
        this.zzd = zzdocVar;
    }

    public final /* synthetic */ zzdoc zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbks zzf(String str) {
        return (zzbks) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final List zzg() {
        try {
            zzdoh zzdohVar = this.zzb;
            l zzaa = zzdohVar.zzaa();
            l zzad = zzdohVar.zzad();
            String[] strArr = new String[zzaa.f2733i + zzad.f2733i];
            int i5 = 0;
            for (int i6 = 0; i6 < zzaa.f2733i; i6++) {
                strArr[i5] = (String) zzaa.f(i6);
                i5++;
            }
            for (int i7 = 0; i7 < zzad.f2733i; i7++) {
                strArr[i5] = (String) zzad.f(i7);
                i5++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzi(String str) {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzj() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzl() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final a3.a zzm() {
        return new a3.b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzn(a3.a aVar) {
        zzdpg zzdpgVar;
        Object b2 = a3.b.b(aVar);
        if (!(b2 instanceof ViewGroup) || (zzdpgVar = this.zzc) == null || !zzdpgVar.zzd((ViewGroup) b2)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdss(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzo() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null && !zzdocVar.zzM()) {
            return false;
        }
        zzdoh zzdohVar = this.zzb;
        return zzdohVar.zzW() != null && zzdohVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzp() {
        zzdoh zzdohVar = this.zzb;
        zzekb zzZ = zzdohVar.zzZ();
        if (zzZ == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzZ.zza());
        if (zzdohVar.zzW() == null) {
            return true;
        }
        zzdohVar.zzW().zze("onSdkLoaded", new o.f(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzq(a3.a aVar) {
        zzdoc zzdocVar;
        Object b2 = a3.b.b(aVar);
        if (!(b2 instanceof View) || this.zzb.zzZ() == null || (zzdocVar = this.zzd) == null) {
            return;
        }
        zzdocVar.zzN((View) b2);
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzr() {
        try {
            String zzac = this.zzb.zzac();
            if (Objects.equals(zzac, "Google")) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzac)) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdoc zzdocVar = this.zzd;
                if (zzdocVar != null) {
                    zzdocVar.zzL(zzac, false);
                }
            }
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbkp zzs() {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final boolean zzt(a3.a aVar) {
        zzdpg zzdpgVar;
        Object b2 = a3.b.b(aVar);
        if (!(b2 instanceof ViewGroup) || (zzdpgVar = this.zzc) == null || !zzdpgVar.zze((ViewGroup) b2)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdss(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
