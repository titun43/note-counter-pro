package com.google.android.gms.ads.internal.overlay;

import a3.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import u2.a;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzr zzc;
    public final zzcjl zzd;
    public final zzbmz zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzad zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final zzbmx zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzdbs zzt;
    public final zzdjm zzu;
    public final zzbxl zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcjl zzcjlVar, int i5, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzdbs zzdbsVar, zzbxl zzbxlVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbp)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i5;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzdbsVar;
        this.zzu = null;
        this.zzv = zzbxlVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e4) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzot)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzot)).booleanValue()) {
            return null;
        }
        return new b(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 2, this.zza, i5);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        z2.b.G(parcel, 3, zzc(zzaVar));
        zzr zzrVar = this.zzc;
        z2.b.G(parcel, 4, zzc(zzrVar));
        zzcjl zzcjlVar = this.zzd;
        z2.b.G(parcel, 5, zzc(zzcjlVar));
        zzbmz zzbmzVar = this.zze;
        z2.b.G(parcel, 6, zzc(zzbmzVar));
        z2.b.I(parcel, 7, this.zzf);
        boolean z4 = this.zzg;
        z2.b.N(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        z2.b.I(parcel, 9, this.zzh);
        zzad zzadVar = this.zzi;
        z2.b.G(parcel, 10, zzc(zzadVar));
        int i6 = this.zzj;
        z2.b.N(parcel, 11, 4);
        parcel.writeInt(i6);
        int i7 = this.zzk;
        z2.b.N(parcel, 12, 4);
        parcel.writeInt(i7);
        z2.b.I(parcel, 13, this.zzl);
        z2.b.H(parcel, 14, this.zzm, i5);
        z2.b.I(parcel, 16, this.zzn);
        z2.b.H(parcel, 17, this.zzo, i5);
        zzbmx zzbmxVar = this.zzp;
        z2.b.G(parcel, 18, zzc(zzbmxVar));
        z2.b.I(parcel, 19, this.zzq);
        z2.b.I(parcel, 24, this.zzr);
        z2.b.I(parcel, 25, this.zzs);
        zzdbs zzdbsVar = this.zzt;
        z2.b.G(parcel, 26, zzc(zzdbsVar));
        zzdjm zzdjmVar = this.zzu;
        z2.b.G(parcel, 27, zzc(zzdjmVar));
        zzbxl zzbxlVar = this.zzv;
        z2.b.G(parcel, 28, zzc(zzbxlVar));
        boolean z5 = this.zzw;
        z2.b.N(parcel, 29, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j2 = this.zzx;
        z2.b.N(parcel, 30, 8);
        parcel.writeLong(j2);
        z2.b.P(parcel, O);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzot)).booleanValue()) {
            zzz.put(Long.valueOf(j2), new zzp(zzaVar, zzrVar, zzcjlVar, zzbmxVar, zzbmzVar, zzadVar, zzdbsVar, zzdjmVar, zzbxlVar, zzcei.zzd.schedule(new zzq(j2), ((Integer) zzbd.zzc().zzd(zzbhe.zzov)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcjl zzcjlVar, boolean z4, int i5, VersionInfoParcel versionInfoParcel, zzdjm zzdjmVar, zzbxl zzbxlVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z4;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i5;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdjmVar;
        this.zzv = zzbxlVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbmx zzbmxVar, zzbmz zzbmzVar, zzad zzadVar, zzcjl zzcjlVar, boolean z4, int i5, String str, VersionInfoParcel versionInfoParcel, zzdjm zzdjmVar, zzbxl zzbxlVar, boolean z5) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzp = zzbmxVar;
        this.zze = zzbmzVar;
        this.zzf = null;
        this.zzg = z4;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i5;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdjmVar;
        this.zzv = zzbxlVar;
        this.zzw = z5;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbmx zzbmxVar, zzbmz zzbmzVar, zzad zzadVar, zzcjl zzcjlVar, boolean z4, int i5, String str, String str2, VersionInfoParcel versionInfoParcel, zzdjm zzdjmVar, zzbxl zzbxlVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzp = zzbmxVar;
        this.zze = zzbmzVar;
        this.zzf = str2;
        this.zzg = z4;
        this.zzh = str;
        this.zzi = zzadVar;
        this.zzj = i5;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdjmVar;
        this.zzv = zzbxlVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z4, String str2, IBinder iBinder5, int i5, int i6, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z5, long j2) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z4;
        this.zzh = str2;
        this.zzj = i5;
        this.zzk = i6;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z5;
        this.zzx = j2;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzot)).booleanValue()) {
            zzp zzpVar = (zzp) zzz.remove(Long.valueOf(j2));
            if (zzpVar != null) {
                this.zzb = zzpVar.zza();
                this.zzc = zzpVar.zzb();
                this.zzd = zzpVar.zzc();
                this.zzp = zzpVar.zzd();
                this.zze = zzpVar.zze();
                this.zzt = zzpVar.zzg();
                this.zzu = zzpVar.zzh();
                this.zzv = zzpVar.zzi();
                this.zzi = zzpVar.zzf();
                zzpVar.zzj().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) b.b(b.a(iBinder));
        this.zzc = (zzr) b.b(b.a(iBinder2));
        this.zzd = (zzcjl) b.b(b.a(iBinder3));
        this.zzp = (zzbmx) b.b(b.a(iBinder6));
        this.zze = (zzbmz) b.b(b.a(iBinder4));
        this.zzi = (zzad) b.b(b.a(iBinder5));
        this.zzt = (zzdbs) b.b(b.a(iBinder7));
        this.zzu = (zzdjm) b.b(b.a(iBinder8));
        this.zzv = (zzbxl) b.b(b.a(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, zzcjl zzcjlVar, zzdjm zzdjmVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdjmVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcjl zzcjlVar, int i5, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcjlVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcjl zzcjlVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i5, zzbxl zzbxlVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcjlVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbxlVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
