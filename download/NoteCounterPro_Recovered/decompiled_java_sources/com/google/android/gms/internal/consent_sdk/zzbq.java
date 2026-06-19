package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import i3.c;
import i3.d;
import i3.g;
import i3.j;
import i3.k;
import i3.l;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbq {
    private final zztm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    public zzbq(zztm zztmVar, Executor executor) {
        this.zza = zztmVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbq zzbqVar, zzbe zzbeVar) {
        final AtomicReference atomicReference = zzbqVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbeVar.zzf(new l() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
            @Override // i3.l
            public final void onConsentFormLoadSuccess(d dVar) {
                atomicReference.set(dVar);
            }
        }, new k() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // i3.k
            public final void onConsentFormLoadFailure(j jVar) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(jVar.f1865a)));
            }
        });
    }

    public final void zzb(l lVar, k kVar, boolean z4) {
        zzcz.zza();
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            kVar.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        zzbe zza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zzb = z4;
        zza.zzf(lVar, kVar);
    }

    public final void zzc() {
        zzbs zzbsVar = (zzbs) this.zzc.get();
        if (zzbsVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbe zza = ((zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zza = true;
        zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                zzbq.zza(zzbq.this, zza);
            }
        });
    }

    public final void zzd(zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(Activity activity, final c cVar) {
        zzcz.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        boolean isConsentFormAvailable = zzb.isConsentFormAvailable();
        g gVar = g.h;
        if (!isConsentFormAvailable && zzb.getPrivacyOptionsRequirementStatus() != gVar) {
            zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == gVar) {
                zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            d dVar = (d) this.zzd.get();
            if (dVar == null) {
                zzcz.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.a(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                dVar.show(activity, cVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbq.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
