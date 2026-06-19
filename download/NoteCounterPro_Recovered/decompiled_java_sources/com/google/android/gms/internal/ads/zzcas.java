package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import java.util.Arrays;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class zzcas extends u2.a {
    public static final Parcelable.Creator<zzcas> CREATOR = new zzcat();
    public final String zza;
    public final int zzb;

    public zzcas(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    public static zzcas zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcas(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcas)) {
            return false;
        }
        zzcas zzcasVar = (zzcas) obj;
        return b0.j(this.zza, zzcasVar.zza) && b0.j(Integer.valueOf(this.zzb), Integer.valueOf(zzcasVar.zzb));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 2, str);
        int i6 = this.zzb;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        z2.b.P(parcel, O);
    }
}
