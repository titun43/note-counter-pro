package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.b0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdsm extends zzbqu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbkc {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzdoc zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdsm(zzdoc zzdocVar, zzdoh zzdohVar) {
        this.zza = zzdohVar.zzJ();
        this.zzb = zzdohVar.zzy();
        this.zzc = zzdocVar;
        if (zzdohVar.zzT() != null) {
            zzdohVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdocVar.zzu(view, map, map, zzdoc.zzI(view));
    }

    private static final void zzi(zzbqy zzbqyVar, int i5) {
        try {
            zzbqyVar.zzf(i5);
        } catch (RemoteException e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zza() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzdsm.this.zzc();
                } catch (RemoteException e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final com.google.android.gms.ads.internal.client.zzed zzb() {
        b0.d("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzc() {
        b0.d("#008 Must be called on the main UI thread.");
        zzg();
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar != null) {
            zzdocVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzd(a3.a aVar, zzbqy zzbqyVar) {
        b0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad can not be shown after destroy().");
            zzi(zzbqyVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream internal error: ".concat(str));
            zzi(zzbqyVar, 0);
            return;
        }
        if (this.zze) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instream ad should not be used again.");
            zzi(zzbqyVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) a3.b.b(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zza(this.zza, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcev.zzb(this.zza, this);
        zzh();
        try {
            zzbqyVar.zze();
        } catch (RemoteException e4) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zze(a3.a aVar) {
        b0.d("#008 Must be called on the main UI thread.");
        zzd(aVar, new zzdsk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final zzbkp zzf() {
        b0.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdoc zzdocVar = this.zzc;
        if (zzdocVar == null || zzdocVar.zzP() == null) {
            return null;
        }
        return zzdocVar.zzP().zza();
    }
}
