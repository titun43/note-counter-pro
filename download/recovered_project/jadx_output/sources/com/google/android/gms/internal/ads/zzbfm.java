package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzbfm extends u2.a {
    public static final Parcelable.Creator<zzbfm> CREATOR = new zzbfn();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbfm(ParcelFileDescriptor parcelFileDescriptor, boolean z4, boolean z5, long j2, boolean z6) {
        this.zza = parcelFileDescriptor;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = j2;
        this.zze = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 2, zzc(), i5);
        boolean zzd = zzd();
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(zzd ? 1 : 0);
        boolean zze = zze();
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(zze ? 1 : 0);
        long zzf = zzf();
        z2.b.N(parcel, 5, 8);
        parcel.writeLong(zzf);
        boolean zzg = zzg();
        z2.b.N(parcel, 6, 4);
        parcel.writeInt(zzg ? 1 : 0);
        z2.b.P(parcel, O);
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }

    public final synchronized InputStream zzb() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized ParcelFileDescriptor zzc() {
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final synchronized long zzf() {
        return this.zzd;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbfm() {
        this(null, false, false, 0L, false);
    }
}
