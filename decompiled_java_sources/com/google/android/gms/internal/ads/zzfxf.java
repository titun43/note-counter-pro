package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzfxf extends zzbct implements zzfxg {
    public zzfxf() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 2:
                a3.b.a(parcel.readStrongBinder());
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbcu.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbcu.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbcu.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbcu.zzh(parcel);
                break;
            case 8:
                a3.b.a(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbcu.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
