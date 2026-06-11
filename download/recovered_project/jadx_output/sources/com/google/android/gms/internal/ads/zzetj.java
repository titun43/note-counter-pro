package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzetj implements zzfav {
    public final com.google.android.gms.ads.internal.client.zzr zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final y.c zzk;
    public final zzetg zzl;

    public zzetj(com.google.android.gms.ads.internal.client.zzr zzrVar, String str, boolean z4, String str2, float f5, int i5, int i6, String str3, int i7, boolean z5, y.c cVar, zzetg zzetgVar) {
        b0.h(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = f5;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = str3;
        this.zzi = i7;
        this.zzj = z5;
        this.zzk = cVar;
        this.zzl = zzetgVar;
    }

    private final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        int i5 = zzrVar.zze;
        zzfjz.zzb(bundle, "smart_w", "full", i5 == -1);
        int i6 = zzrVar.zzb;
        zzfjz.zzb(bundle, "smart_h", "auto", i6 == -2);
        zzfjz.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfjz.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfjz.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfjz.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfjz.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfjz.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfjz.zze(bundle, "format", this.zzb);
        zzfjz.zzb(bundle, "fluid", "height", this.zzc);
        zzfjz.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfjz.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i7 = this.zzi;
        if (i7 != -1) {
            bundle.putInt("u_mso", i7);
        }
        y.c cVar = this.zzk;
        if (cVar != null) {
            bundle.putInt("sam_t", cVar.f3730b);
            bundle.putInt("sam_b", cVar.f3732d);
            bundle.putInt("sam_l", cVar.f3729a);
            bundle.putInt("sam_r", cVar.f3731c);
        }
        zzetg zzetgVar = this.zzl;
        if (zzetgVar != null) {
            bundle.putInt("rc_tl", zzetgVar.zza);
            bundle.putInt("rc_tr", zzetgVar.zzb);
            bundle.putInt("rc_bl", zzetgVar.zzc);
            bundle.putInt("rc_br", zzetgVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i6);
            bundle2.putInt("width", i5);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt("height", zzrVar2.zzb);
                bundle3.putInt("width", zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzdah) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzdah) obj).zzb);
    }
}
