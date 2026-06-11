package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import g.m0;
import i3.e;
import i3.f;
import i3.g;
import i3.h;
import i3.i;
import i3.j;

/* loaded from: classes.dex */
public final class zzj implements h {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbq zzc;
    private final zzcr zzf;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private i zzi = new i(new m0());

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbq zzbqVar, zzcr zzcrVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzbqVar;
        this.zzf = zzcrVar;
    }

    @Override // i3.h
    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int zza = !zzc() ? 0 : zzaqVar.zza();
            if (zza != 1 && zza != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // i3.h
    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // i3.h
    public final g getPrivacyOptionsRequirementStatus() {
        return !zzc() ? g.f1860g : this.zza.zzb();
    }

    @Override // i3.h
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // i3.h
    public final void requestConsentInfoUpdate(Activity activity, i iVar, f fVar, e eVar) {
        synchronized (this.zzd) {
            this.zzg = true;
        }
        this.zzi = iVar;
        this.zzf.zzh();
        this.zzb.zzc(activity, iVar, fVar, eVar);
    }

    @Override // i3.h
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzg = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzi, new f() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // i3.f
                public final void onConsentInfoUpdateSuccess() {
                    zzj.this.zzb(false);
                }
            }, new e() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // i3.e
                public final void onConsentInfoUpdateFailure(j jVar) {
                    zzj.this.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z4) {
        synchronized (this.zze) {
            this.zzh = z4;
        }
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzd) {
            z4 = this.zzg;
        }
        return z4;
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzh;
        }
        return z4;
    }
}
