package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzexq implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzexq(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzexq.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 18;
    }

    public final /* synthetic */ zzexo zzc() {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgY)).booleanValue();
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String string = !booleanValue ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzha)).booleanValue()) {
            str = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgZ)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i5 = 0; i5 < 4; i5++) {
                String str2 = strArr[i5];
                if (defaultSharedPreferences.contains(str2)) {
                    bundle.putString(str2, defaultSharedPreferences.getString(str2, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzexo(string, str, bundle, null);
    }
}
