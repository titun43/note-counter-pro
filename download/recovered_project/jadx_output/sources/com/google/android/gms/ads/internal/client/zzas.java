package com.google.android.gms.ads.internal.client;

import a3.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzas extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbtt zzb;
    final /* synthetic */ zzaz zzc;

    public zzas(zzaz zzazVar, Context context, zzbtt zzbttVar) {
        this.zza = context;
        this.zzb = zzbttVar;
        Objects.requireNonNull(zzazVar);
        this.zzc = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzb() {
        zzck zzciVar;
        Context context = this.zza;
        b bVar = new b(context);
        zzbhe.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            return this.zzc.zzv().zza(this.zza, this.zzb);
        }
        try {
            zzcl zzclVar = (zzcl) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzar.zza);
            zzbtt zzbttVar = this.zzb;
            IBinder zze = zzclVar.zze(bVar, zzbttVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzciVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzciVar = queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(zze);
            }
            zzciVar.zzl(zzbttVar);
            return zzciVar;
        } catch (RemoteException e4) {
            e = e4;
            zzaz zzazVar = this.zzc;
            zzazVar.zzu(zzbyp.zza(this.zza));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e5) {
            e = e5;
            zzaz zzazVar2 = this.zzc;
            zzazVar2.zzu(zzbyp.zza(this.zza));
            zzazVar2.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            zzaz zzazVar22 = this.zzc;
            zzazVar22.zzu(zzbyp.zza(this.zza));
            zzazVar22.zzt().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzc(zzcr zzcrVar) {
        return zzcrVar.zzh(new b(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
