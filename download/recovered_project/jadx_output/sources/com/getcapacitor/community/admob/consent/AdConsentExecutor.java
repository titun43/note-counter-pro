package com.getcapacitor.community.admob.consent;

import a2.b;
import a2.f;
import android.app.Activity;
import android.content.Context;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.getcapacitor.community.admob.models.Executor;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import e0.d;
import g.m0;
import i3.c;
import i3.h;
import i3.i;
import i3.j;
import i3.k;
import i3.l;
import java.util.ArrayList;
import x2.a;

/* loaded from: classes.dex */
public class AdConsentExecutor extends Executor {
    private h consentInformation;

    public AdConsentExecutor(d dVar, d dVar2, a aVar, String str) {
        super(dVar, dVar2, aVar, str, "AdConsentExecutor");
    }

    private void ensureConsentInfo() {
        if (this.consentInformation == null) {
            this.consentInformation = zza.zza((Context) this.contextSupplier.get()).zzb();
        }
    }

    private String getConsentStatusString(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "UNKNOWN" : "OBTAINED" : "REQUIRED" : "NOT_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestConsentInfo$0(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("status", getConsentStatusString(this.consentInformation.getConsentStatus()));
        jSObject.put("isConsentFormAvailable", this.consentInformation.isConsentFormAvailable());
        jSObject.put("canRequestAds", this.consentInformation.canRequestAds());
        jSObject.put("privacyOptionsRequirementStatus", this.consentInformation.getPrivacyOptionsRequirementStatus().name());
        pluginCall.resolve(jSObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$requestConsentInfo$1(PluginCall pluginCall, j jVar) {
        pluginCall.reject(jVar.f1865a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$showConsentForm$4(PluginCall pluginCall, j jVar) {
        if (jVar != null) {
            pluginCall.reject("Error when show consent form", jVar.f1865a);
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("status", getConsentStatusString(this.consentInformation.getConsentStatus()));
        jSObject.put("canRequestAds", this.consentInformation.canRequestAds());
        jSObject.put("privacyOptionsRequirementStatus", this.consentInformation.getPrivacyOptionsRequirementStatus().name());
        pluginCall.resolve(jSObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$showConsentForm$5(final Activity activity, final PluginCall pluginCall) {
        final c cVar = new c() { // from class: a2.a
            @Override // i3.c
            public final void a(j jVar) {
                AdConsentExecutor.this.lambda$showConsentForm$4(pluginCall, jVar);
            }
        };
        zza zza = zza.zza(activity);
        if (zza.zzb().canRequestAds()) {
            cVar.a(null);
            return;
        }
        zza.zzd().zzc();
        zzbq zzc = zza.zzc();
        zzcz.zza();
        zzc.zzb(new l() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // i3.l
            public final void onConsentFormLoadSuccess(i3.d dVar) {
                dVar.show(activity, cVar);
            }
        }, new k() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // i3.k
            public final void onConsentFormLoadFailure(j jVar) {
                c.this.a(jVar);
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showPrivacyOptionsForm$2(PluginCall pluginCall, j jVar) {
        if (jVar != null) {
            pluginCall.reject("Error when show privacy form", jVar.f1865a);
        } else {
            pluginCall.resolve();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showPrivacyOptionsForm$3(Activity activity, final PluginCall pluginCall) {
        zza.zza(activity).zzc().zze(activity, new c() { // from class: a2.e
            @Override // i3.c
            public final void a(j jVar) {
                AdConsentExecutor.lambda$showPrivacyOptionsForm$2(PluginCall.this, jVar);
            }
        });
    }

    @PluginMethod
    public void requestConsentInfo(PluginCall pluginCall, a aVar) {
        try {
            ensureConsentInfo();
            m0 m0Var = new m0();
            i3.a aVar2 = new i3.a((Context) this.contextSupplier.get());
            if (pluginCall.getData().has("testDeviceIdentifiers")) {
                JSArray array = pluginCall.getArray("testDeviceIdentifiers");
                for (int i5 = 0; i5 < array.length(); i5++) {
                    ((ArrayList) aVar2.f1856b).add(array.getString(i5));
                }
            }
            if (pluginCall.getData().has("debugGeography")) {
                aVar2.f1855a = pluginCall.getInt("debugGeography").intValue();
            }
            m0Var.h = aVar2.b();
            if (pluginCall.getData().has("tagForUnderAgeOfConsent")) {
                m0Var.f1592g = pluginCall.getBoolean("tagForUnderAgeOfConsent").booleanValue();
            }
            i iVar = new i(m0Var);
            if (this.activitySupplier.get() == null) {
                pluginCall.reject("Trying to request consent info but the Activity is null");
            } else {
                this.consentInformation.requestConsentInfoUpdate((Activity) this.activitySupplier.get(), iVar, new a2.c(0, this, pluginCall), new a2.d(pluginCall));
            }
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    @PluginMethod
    public void resetConsentInfo(PluginCall pluginCall, a aVar) {
        ensureConsentInfo();
        this.consentInformation.reset();
        pluginCall.resolve();
    }

    @PluginMethod
    public void showConsentForm(PluginCall pluginCall, a aVar) {
        try {
            Activity activity = (Activity) this.activitySupplier.get();
            if (activity == null) {
                pluginCall.reject("Trying to show the consent form but the Activity is null");
            } else {
                ensureConsentInfo();
                activity.runOnUiThread(new f(this, activity, pluginCall, 0));
            }
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }

    @PluginMethod
    public void showPrivacyOptionsForm(PluginCall pluginCall, a aVar) {
        try {
            Activity activity = (Activity) this.activitySupplier.get();
            if (activity == null) {
                pluginCall.reject("Trying to show the privacy options form but the Activity is null");
            } else {
                ensureConsentInfo();
                activity.runOnUiThread(new b(0, activity, pluginCall));
            }
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage(), e4);
        }
    }
}
