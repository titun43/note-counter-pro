package b3;

import android.os.Parcel;
import androidx.emoji2.text.u;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class k extends zza {
    public final a3.a a(a3.b bVar, String str, int i5) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i5);
        return u.f(zzB(2, zza));
    }

    public final a3.a b(a3.b bVar, String str, int i5) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i5);
        return u.f(zzB(4, zza));
    }

    public final a3.a c(a3.b bVar, String str, int i5, a3.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i5);
        zzc.zze(zza, bVar2);
        return u.f(zzB(8, zza));
    }
}
