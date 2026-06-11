package com.google.android.gms.ads.internal.client;

import a3.a;
import a3.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbtp;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzen {
    final zzbc zza;
    private final zzbtp zzb;
    private final zzq zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbx zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;
    private final AtomicLong zzq;

    public zzen(ViewGroup viewGroup, int i5) {
        this(viewGroup, null, false, zzq.zza, null, i5);
    }

    private static zzr zzF(Context context, AdSize[] adSizeArr, int i5) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = zzG(i5);
        return zzrVar;
    }

    private static boolean zzG(int i5) {
        return i5 == 1;
    }

    public final void zzA(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzG(videoOptions == null ? null : new zzga(videoOptions));
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final VideoOptions zzB() {
        return this.zzk;
    }

    public final boolean zzC(zzbx zzbxVar) {
        try {
            a zzb = zzbxVar.zzb();
            if (zzb == null || ((View) b.b(zzb)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) b.b(zzb));
            this.zzj = zzbxVar;
            return true;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final /* synthetic */ void zzD(a aVar) {
        this.zzm.addView((View) b.b(aVar));
    }

    public final /* synthetic */ VideoController zzE() {
        return this.zze;
    }

    public final void zza() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzc();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final AdListener zzb() {
        return this.zzg;
    }

    public final AdSize zzc() {
        zzr zzn;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null && (zzn = zzbxVar.zzn()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzn.zze, zzn.zzb, zzn.zza);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.zzh;
    }

    public final String zze() {
        zzbx zzbxVar;
        if (this.zzl == null && (zzbxVar = this.zzj) != null) {
            try {
                this.zzl = zzbxVar.zzu();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
        return this.zzl;
    }

    public final AppEventListener zzf() {
        return this.zzi;
    }

    public final void zzg(zzek zzekVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.zzm;
                Context context = viewGroup.getContext();
                zzr zzF = zzF(context, this.zzh, this.zzn);
                zzbx zzbxVar = "search_v2".equals(zzF.zza) ? (zzbx) new zzan(zzbb.zzb(), context, zzF, this.zzl).zzd(context, false) : (zzbx) new zzal(zzbb.zzb(), context, zzF, this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzbxVar;
                zzbxVar.zzdR(new zzg(this.zza));
                zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzy(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzi(new zzbdt(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzG(new zzga(this.zzk));
                }
                this.zzj.zzP(new zzfs(this.zzp));
                this.zzj.zzz(this.zzo);
                zzbx zzbxVar2 = this.zzj;
                if (zzbxVar2 != null) {
                    try {
                        final a zzb = zzbxVar2.zzb();
                        if (zzb != null) {
                            if (((Boolean) zzbjc.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzem
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzen.this.zzD(zzb);
                                        }
                                    });
                                }
                            }
                            viewGroup.addView((View) b.b(zzb));
                        }
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
            }
            zzekVar.zzp(currentTimeMillis);
            if (zzekVar.zzr() != 0) {
                this.zzq.set(zzekVar.zzr());
            }
            zzbx zzbxVar3 = this.zzj;
            if (zzbxVar3 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != 0) {
                zzbxVar3.zzT(atomicLong.get());
            }
            zzbxVar3.zze(this.zzc.zza(this.zzm.getContext(), zzekVar));
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
        }
    }

    public final void zzh() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzf();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzi() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzm();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzj() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzg();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzk(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzl(zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzy(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzn(adSizeArr);
    }

    public final void zzn(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzo(zzF(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
        this.zzm.requestLayout();
    }

    public final void zzo(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzp(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzi(appEventListener != null ? new zzbdt(appEventListener) : null);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void zzq(boolean z4) {
        this.zzo = z4;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzz(z4);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final boolean zzr() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                return zzbxVar.zzA();
            }
            return false;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                return zzbxVar.zzB();
            }
            return false;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public final ResponseInfo zzt() {
        zzea zzeaVar = null;
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzeaVar = zzbxVar.zzt();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
        return ResponseInfo.zzb(zzeaVar);
    }

    public final void zzu(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final long zzv() {
        AtomicLong atomicLong = this.zzq;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                atomicLong.set(zzbxVar.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
        return 0L;
    }

    public final void zzw(long j2) {
        this.zzq.set(j2);
        try {
            zzbx zzbxVar = this.zzj;
            if (zzbxVar != null) {
                zzbxVar.zzT(j2);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final OnPaidEventListener zzx() {
        return this.zzp;
    }

    public final VideoController zzy() {
        return this.zze;
    }

    public final zzed zzz() {
        zzbx zzbxVar = this.zzj;
        if (zzbxVar != null) {
            try {
                return zzbxVar.zzF();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
        return null;
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z4) {
        this(viewGroup, attributeSet, z4, zzq.zza, null, 0);
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z4, int i5) {
        this(viewGroup, attributeSet, z4, zzq.zza, null, i5);
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z4, zzq zzqVar, zzbx zzbxVar, int i5) {
        zzr zzrVar;
        this.zzb = new zzbtp();
        this.zze = new VideoController();
        this.zza = new zzel(this);
        this.zzq = new AtomicLong();
        this.zzm = viewGroup;
        this.zzc = zzqVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i5;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.zzh = zzzVar.zza(z4);
                this.zzl = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zza = zzbb.zza();
                    AdSize adSize = this.zzh[0];
                    int i6 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.zzj = zzG(i6);
                    }
                    zza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e4) {
                zzbb.zza().zzb(viewGroup, new zzr(context, AdSize.BANNER), e4.getMessage(), e4.getMessage());
            }
        }
    }
}
