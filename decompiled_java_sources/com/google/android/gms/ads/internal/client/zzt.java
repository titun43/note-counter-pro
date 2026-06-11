package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzt extends a {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzt(int i5, int i6, String str, long j2) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = str;
        this.zzd = j2;
    }

    public static zzt zza(JSONObject jSONObject) {
        return new zzt(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzb;
        b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        b.I(parcel, 3, this.zzc);
        long j2 = this.zzd;
        b.N(parcel, 4, 8);
        parcel.writeLong(j2);
        b.P(parcel, O);
    }
}
