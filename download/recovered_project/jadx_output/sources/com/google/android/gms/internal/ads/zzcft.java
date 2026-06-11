package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzcft {
    private final Context zza;
    private final zzcge zzb;
    private final ViewGroup zzc;
    private final zzdxz zzd;
    private zzcfs zze;

    public zzcft(Context context, ViewGroup viewGroup, zzcjl zzcjlVar, zzdxz zzdxzVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcjlVar;
        this.zze = null;
        this.zzd = zzdxzVar;
    }

    public final Integer zza() {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            return zzcfsVar.zzl();
        }
        return null;
    }

    public final void zzb(int i5, int i6, int i7, int i8) {
        b0.d("The underlay may only be modified from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzn(i5, i6, i7, i8);
        }
    }

    public final void zzc(int i5, int i6, int i7, int i8, int i9, boolean z4, zzcgd zzcgdVar) {
        if (this.zze != null) {
            return;
        }
        zzcge zzcgeVar = this.zzb;
        zzbhl.zza(zzcgeVar.zzq().zzc(), zzcgeVar.zzi(), "vpr2");
        zzcfs zzcfsVar = new zzcfs(this.zza, zzcgeVar, i9, z4, zzcgeVar.zzq().zzc(), zzcgdVar, this.zzd);
        this.zze = zzcfsVar;
        this.zzc.addView(zzcfsVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i5, i6, i7, i8);
        zzcgeVar.zzdn(false);
    }

    public final zzcfs zzd() {
        return this.zze;
    }

    public final void zze() {
        b0.d("onPause must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzr();
        }
    }

    public final void zzf() {
        b0.d("onDestroy must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i5) {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzm(i5);
        }
    }
}
