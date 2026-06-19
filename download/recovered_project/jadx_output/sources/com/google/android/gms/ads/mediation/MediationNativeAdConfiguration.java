package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbkh;

/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    private final zzbkh zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z4, Location location, int i5, int i6, String str2, String str3, zzbkh zzbkhVar) {
        super(context, str, bundle, bundle2, z4, location, i5, i6, str2, str3);
        this.zza = zzbkhVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbkh.zza(this.zza);
    }
}
