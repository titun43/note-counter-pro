package com.google.android.gms.ads.internal.client;

import a3.b;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzay extends zzba {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaz zzd;

    public zzay(zzaz zzazVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzb() {
        View view = this.zza;
        zzbhe.zza(view.getContext());
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            zzaz zzazVar = this.zzd;
            return zzazVar.zzs().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzblb.zze(((zzblf) com.google.android.gms.ads.internal.util.client.zzs.zza(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzax.zza)).zze(new b(view), new b(this.zzb), new b(this.zzc)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e4) {
            zzaz zzazVar2 = this.zzd;
            zzazVar2.zzu(zzbyp.zza(this.zza.getContext()));
            zzazVar2.zzt().zzh(e4, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzc(zzcr zzcrVar) {
        HashMap hashMap = this.zzc;
        return zzcrVar.zzk(new b(this.zza), new b(this.zzb), new b(hashMap));
    }
}
