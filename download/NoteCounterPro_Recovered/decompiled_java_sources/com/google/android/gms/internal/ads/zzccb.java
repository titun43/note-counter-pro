package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzccb extends u2.a {
    public static final Parcelable.Creator<zzccb> CREATOR = new zzccc();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzccb(String str, String str2, boolean z4, boolean z5, List list, boolean z6, boolean z7, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = z5;
        this.zze = list;
        this.zzf = z6;
        this.zzg = z7;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzccb zza(JSONObject jSONObject) {
        return new zzccb(jSONObject.optString("click_string", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), jSONObject.optString("report_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbp.zza(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbp.zza(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 2, str);
        z2.b.I(parcel, 3, this.zzb);
        boolean z4 = this.zzc;
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzd;
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(z5 ? 1 : 0);
        z2.b.K(parcel, 6, this.zze);
        boolean z6 = this.zzf;
        z2.b.N(parcel, 7, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzg;
        z2.b.N(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        z2.b.K(parcel, 9, this.zzh);
        z2.b.P(parcel, O);
    }
}
