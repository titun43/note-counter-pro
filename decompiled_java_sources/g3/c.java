package g3;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public abstract class c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i5, Parcel parcel, Parcel parcel2, int i6) {
        switch (i5) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                g gVar = (g) zac.zaa(parcel, g.CREATOR);
                zac.zab(parcel);
                j0 j0Var = (j0) this;
                j0Var.h.post(new c0.a(j0Var, gVar, 4, false));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
