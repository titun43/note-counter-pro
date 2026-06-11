package com.google.android.gms.ads.internal.client;

import a3.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzau extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaz zzb;

    public zzau(zzaz zzazVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzazVar);
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzb() {
        Context context = this.zza;
        zzbhe.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            return this.zzb.zzp().zza(this.zza);
        }
        try {
            IBinder zze = ((zzdc) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzat.zza)).zze(new b(context), ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(zze);
        } catch (RemoteException e4) {
            e = e4;
            zzaz zzazVar = this.zzb;
            zzazVar.zzu(zzbyp.zza(this.zza));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e5) {
            e = e5;
            zzaz zzazVar2 = this.zzb;
            zzazVar2.zzu(zzbyp.zza(this.zza));
            zzazVar2.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            zzaz zzazVar22 = this.zzb;
            zzazVar22.zzu(zzbyp.zza(this.zza));
            zzazVar22.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final Object zzc(zzcr zzcrVar) {
        return zzcrVar.zzi(new b(this.zza), ModuleDescriptor.MODULE_VERSION);
    }
}
