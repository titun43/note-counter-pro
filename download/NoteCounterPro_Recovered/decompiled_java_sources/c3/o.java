package c3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* loaded from: classes.dex */
public abstract class o extends zzb implements p {
    public static p zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new n(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        throw null;
    }
}
