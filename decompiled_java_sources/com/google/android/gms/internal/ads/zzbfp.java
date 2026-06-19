package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfp extends u2.a {
    public static final Parcelable.Creator<zzbfp> CREATOR = new zzbfq();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbfp(String str, long j2, String str2, String str3, String str4, Bundle bundle, boolean z4, long j5, String str5, int i5) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = str2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        this.zzd = str3 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3;
        this.zze = str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z4;
        this.zzh = j5;
        this.zzi = str5;
        this.zzj = i5;
    }

    public static zzbfp zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String sb2 = sb.toString();
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbfp(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        } catch (NullPointerException e4) {
            e = e4;
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            int i62 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 2, str);
        long j2 = this.zzb;
        z2.b.N(parcel, 3, 8);
        parcel.writeLong(j2);
        z2.b.I(parcel, 4, this.zzc);
        z2.b.I(parcel, 5, this.zzd);
        z2.b.I(parcel, 6, this.zze);
        z2.b.E(parcel, 7, this.zzf);
        boolean z4 = this.zzg;
        z2.b.N(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j5 = this.zzh;
        z2.b.N(parcel, 9, 8);
        parcel.writeLong(j5);
        z2.b.I(parcel, 10, this.zzi);
        int i6 = this.zzj;
        z2.b.N(parcel, 11, 4);
        parcel.writeInt(i6);
        z2.b.P(parcel, O);
    }
}
