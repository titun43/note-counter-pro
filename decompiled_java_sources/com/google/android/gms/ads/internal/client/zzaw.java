package com.google.android.gms.ads.internal.client;

import a3.b;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaw extends zzba {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaz zzd;

    public zzaw(zzaz zzazVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zzc, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzb() {
        Context context = this.zzc;
        zzbhe.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            zzaz zzazVar = this.zzd;
            return zzazVar.zzq().zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbkv.zzdF(((zzbkz) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzav.zza)).zze(new b(context), new b(this.zza), new b(this.zzb), ModuleDescriptor.MODULE_VERSION));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e4) {
            zzaz zzazVar2 = this.zzd;
            zzazVar2.zzu(zzbyp.zza(this.zzc));
            zzazVar2.zzt().zzh(e4, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzc(zzcr zzcrVar) {
        return zzcrVar.zze(new b(this.zza), new b(this.zzb));
    }
}
