package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzah extends zzar implements zzai {
    public zzah() {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean zzb(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzas.zza(parcel, Bundle.CREATOR);
        zzas.zzb(parcel);
        zza(bundle);
        return true;
    }
}
