package c3;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* loaded from: classes.dex */
public abstract class v extends zzb implements w {
    public static w zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new u(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        if (i5 != 1) {
            return false;
        }
        zzd((Location) zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
