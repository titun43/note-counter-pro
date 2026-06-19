package com.google.android.gms.ads.internal;

import a3.a;
import a3.b;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzeqr;
import com.google.android.gms.internal.ads.zzfdu;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzfgx;
import com.google.android.gms.internal.ads.zzfik;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ClientApi extends zzcq {
    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        zzffh zzj = zzcma.zza(context, zzbttVar, i5).zzj();
        zzj.zzd(context);
        zzj.zzb(zzrVar);
        zzj.zzc(str);
        return zzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        zzfgx zzn = zzcma.zza(context, zzbttVar, i5).zzn();
        zzn.zzd(context);
        zzn.zzb(zzrVar);
        zzn.zzc(str);
        return zzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(a aVar, String str, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        return new zzeqr(zzcma.zza(context, zzbttVar, i5), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbkw zze(a aVar, a aVar2) {
        return new zzdpc((FrameLayout) b.b(aVar), (FrameLayout) b.b(aVar2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaj zzf(a aVar, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        zzfik zzq = zzcma.zza(context, zzbttVar, i5).zzq();
        zzq.zzc(context);
        return zzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxs zzg(a aVar) {
        Activity activity = (Activity) b.b(aVar);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i5 = zza.zzk;
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? new zzw(activity) : new zzag(activity) : new zzac(activity, zza) : new zzaj(activity) : new zzai(activity) : new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(a aVar, zzbtt zzbttVar, int i5) {
        return zzcma.zza((Context) b.b(aVar), zzbttVar, i5).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(a aVar, int i5) {
        return zzcma.zza((Context) b.b(aVar), null, i5).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i5) {
        return new zzs((Context) b.b(aVar), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i5, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzblc zzk(a aVar, a aVar2, a aVar3) {
        return new zzdpa((View) b.b(aVar), (HashMap) b.b(aVar2), (HashMap) b.b(aVar3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcaz zzl(a aVar, String str, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        zzfik zzq = zzcma.zza(context, zzbttVar, i5).zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        return zzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbtt zzbttVar, int i5) {
        Context context = (Context) b.b(aVar);
        zzfdu zzl = zzcma.zza(context, zzbttVar, i5).zzl();
        zzl.zzb(str);
        zzl.zzc(context);
        return zzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcdd zzn(a aVar, zzbtt zzbttVar, int i5) {
        return zzcma.zza((Context) b.b(aVar), zzbttVar, i5).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxl zzo(a aVar, zzbtt zzbttVar, int i5) {
        return zzcma.zza((Context) b.b(aVar), zzbttVar, i5).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbpk zzp(a aVar, zzbtt zzbttVar, int i5, zzbph zzbphVar) {
        Context context = (Context) b.b(aVar);
        zzdzq zzA = zzcma.zza(context, zzbttVar, i5).zzA();
        zzA.zzc(context);
        zzA.zzb(zzbphVar);
        return zzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(a aVar, zzbtt zzbttVar, int i5) {
        return zzcma.zza((Context) b.b(aVar), zzbttVar, i5).zzC();
    }
}
