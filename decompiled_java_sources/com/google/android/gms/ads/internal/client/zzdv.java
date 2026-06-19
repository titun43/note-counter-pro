package com.google.android.gms.ads.internal.client;

import a3.a;
import a3.b;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;

/* loaded from: classes.dex */
public abstract class zzdv extends zzbct implements zzdw {
    public zzdv() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        String readString = parcel.readString();
        a a5 = b.a(parcel.readStrongBinder());
        a a6 = b.a(parcel.readStrongBinder());
        zzbcu.zzh(parcel);
        zze(readString, a5, a6);
        parcel2.writeNoException();
        return true;
    }
}
