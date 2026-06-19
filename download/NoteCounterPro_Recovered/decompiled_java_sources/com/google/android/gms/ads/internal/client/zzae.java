package com.google.android.gms.ads.internal.client;

import a3.b;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzae extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbtt zzb;

    public zzae(zzaz zzazVar, Context context, zzbtt zzbttVar) {
        this.zza = context;
        this.zzb = zzbttVar;
        Objects.requireNonNull(zzazVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzb() {
        Context context = this.zza;
        b bVar = new b(context);
        zzbhe.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkP)).booleanValue()) {
            try {
                return ((zzdx) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.zza)).zze(bVar, this.zzb, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e4) {
                zzbyp.zza(this.zza).zzh(e4, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzc(zzcr zzcrVar) {
        Context context = this.zza;
        b bVar = new b(context);
        zzbhe.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkP)).booleanValue()) {
            return zzcrVar.zzq(bVar, this.zzb, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
