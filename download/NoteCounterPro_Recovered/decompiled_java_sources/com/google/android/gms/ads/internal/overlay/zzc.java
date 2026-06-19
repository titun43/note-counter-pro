package com.google.android.gms.ads.internal.overlay;

import a3.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import u2.a;

/* loaded from: classes.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzaa zzi;
    public final boolean zzj;
    public final Bundle zzk;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z4, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) b.b(b.a(iBinder));
        this.zzj = z4;
        this.zzk = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 2, str);
        z2.b.I(parcel, 3, this.zzb);
        z2.b.I(parcel, 4, this.zzc);
        z2.b.I(parcel, 5, this.zzd);
        z2.b.I(parcel, 6, this.zze);
        z2.b.I(parcel, 7, this.zzf);
        z2.b.I(parcel, 8, this.zzg);
        z2.b.H(parcel, 9, this.zzh, i5);
        z2.b.G(parcel, 10, new b(this.zzi).asBinder());
        boolean z4 = this.zzj;
        z2.b.N(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        z2.b.E(parcel, 12, this.zzk);
        z2.b.P(parcel, O);
    }

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new b(zzaaVar).asBinder(), false, new Bundle());
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(zzaaVar).asBinder(), false, new Bundle());
    }
}
