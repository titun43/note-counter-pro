package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import q2.d;

/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (d) zzc.zza(parcel, d.CREATOR));
        return true;
    }
}
