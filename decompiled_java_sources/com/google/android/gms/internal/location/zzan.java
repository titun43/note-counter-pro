package com.google.android.gms.internal.location;

import android.os.Parcel;
import c3.j;

/* loaded from: classes.dex */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        zzb((j) zzc.zzb(parcel, j.CREATOR));
        return true;
    }
}
