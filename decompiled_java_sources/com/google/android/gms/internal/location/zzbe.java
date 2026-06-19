package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import c3.d;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Locale;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzbe extends a implements d {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    private final String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(String str, int i5, short s5, double d5, double d6, float f5, long j2, int i6, int i7) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        }
        if (f5 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f5);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d5 > 90.0d || d5 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d5);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d6 > 180.0d || d6 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d6);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i8 = i5 & 7;
        if (i8 == 0) {
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i5);
            throw new IllegalArgumentException(sb4.toString());
        }
        this.zzc = s5;
        this.zza = str;
        this.zzd = d5;
        this.zze = d6;
        this.zzf = f5;
        this.zzb = j2;
        this.zzg = i8;
        this.zzh = i6;
        this.zzi = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s5 = this.zzc;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s5 != -1 ? s5 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / zzbgj.zzq.zzf), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.I(parcel, 1, this.zza);
        long j2 = this.zzb;
        b.N(parcel, 2, 8);
        parcel.writeLong(j2);
        short s5 = this.zzc;
        b.N(parcel, 3, 4);
        parcel.writeInt(s5);
        double d5 = this.zzd;
        b.N(parcel, 4, 8);
        parcel.writeDouble(d5);
        double d6 = this.zze;
        b.N(parcel, 5, 8);
        parcel.writeDouble(d6);
        float f5 = this.zzf;
        b.N(parcel, 6, 4);
        parcel.writeFloat(f5);
        int i6 = this.zzg;
        b.N(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.zzh;
        b.N(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.zzi;
        b.N(parcel, 9, 4);
        parcel.writeInt(i8);
        b.P(parcel, O);
    }
}
