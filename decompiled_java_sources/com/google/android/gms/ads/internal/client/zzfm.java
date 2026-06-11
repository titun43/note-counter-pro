package com.google.android.gms.ads.internal.client;

import a3.a;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfm extends zzda {
    private zzbqn zza;

    public final /* synthetic */ void zzb() {
        zzbqn zzbqnVar = this.zza;
        if (zzbqnVar != null) {
            try {
                zzbqnVar.zzb(Collections.EMPTY_LIST);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onComplete event.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfm.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f5) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z4) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbtt zzbttVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbqn zzbqnVar) {
        this.zza = zzbqnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z4) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzw() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(a aVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, a aVar) {
    }
}
