package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzchr {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzchr(zzcge zzcgeVar) {
        Context context = zzcgeVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcgeVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcgeVar);
    }

    public void release() {
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        return zze(str);
    }

    public void zzh(int i5) {
    }

    public void zzi(int i5) {
    }

    public void zzj(int i5) {
    }

    public void zzk(int i5) {
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j2, long j5, boolean z4, long j6, long j7, long j8, int i5, int i6) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchm(this, str, str2, j2, j5, j6, j7, j8, z4, i5, i6));
    }

    public final void zzn(String str, String str2, int i5, int i6, long j2, long j5, boolean z4, int i7, int i8) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchn(this, str, str2, i5, i6, j2, j5, z4, i7, i8));
    }

    public final void zzo(String str, String str2, int i5) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcho(this, str, str2, i5));
    }

    public final void zzp(String str, String str2, long j2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchp(this, str, str2, j2));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchq(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcgeVar.zze("onPrecacheEvent", map);
        }
    }
}
