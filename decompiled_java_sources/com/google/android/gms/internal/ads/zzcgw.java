package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcgw extends zzcfk implements TextureView.SurfaceTextureListener, zzcfu {
    private final zzcge zzc;
    private final zzcgf zzd;
    private final zzcgd zze;
    private final zzdxz zzf;
    private zzcfj zzg;
    private Surface zzh;
    private zzcfv zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcgc zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcgw(Context context, zzcgf zzcgfVar, zzcge zzcgeVar, boolean z4, boolean z5, zzcgd zzcgdVar, zzdxz zzdxzVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcgeVar;
        this.zzd = zzcgfVar;
        this.zzo = z4;
        this.zze = zzcgdVar;
        zzcgfVar.zza(this);
        this.zzf = zzdxzVar;
    }

    private final boolean zzT() {
        zzcfv zzcfvVar = this.zzi;
        return (zzcfvVar == null || !zzcfvVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z4, Integer num) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null && !z4) {
            zzcfvVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z4) {
            if (!zzT()) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcfvVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzchr zzr = this.zzc.zzr(this.zzj);
            if (zzr instanceof zzcia) {
                zzcfv zza = ((zzcia) zzr).zza();
                this.zzi = zza;
                zza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof zzchx)) {
                    String valueOf = String.valueOf(this.zzj);
                    int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                zzchx zzchxVar = (zzchx) zzr;
                String zzF = zzF();
                ByteBuffer zzu = zzchxVar.zzu();
                boolean zzt = zzchxVar.zzt();
                String zzs = zzchxVar.zzs();
                if (zzs == null) {
                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcfv zzE = zzE(num);
                    this.zzi = zzE;
                    zzE.zzr(new Uri[]{Uri.parse(zzs)}, zzF, zzu, zzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String zzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i9 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i9 >= strArr.length) {
                    break;
                }
                uriArr[i9] = Uri.parse(strArr[i9]);
                i9++;
            }
            this.zzi.zzq(uriArr, zzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int zzC = this.zzi.zzC();
            this.zzm = zzC;
            if (zzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcfv zzcfvVar = this.zzi;
            if (zzcfvVar != null) {
                zzcfvVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z4) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzu(surface, z4);
        } catch (IOException e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        s.c.e(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i5, int i6) {
        float f5 = i6 > 0 ? i5 / i6 : 1.0f;
        if (this.zzt != f5) {
            this.zzt = f5;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f5 = this.zzt;
        if (f5 != 0.0f && this.zzn == null) {
            float f6 = measuredWidth;
            float f7 = f6 / measuredHeight;
            if (f5 > f7) {
                measuredHeight = (int) (f6 / f5);
            }
            if (f5 < f7) {
                measuredWidth = (int) (measuredHeight * f5);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i6) {
        zzdxz zzdxzVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoK)).booleanValue() && (zzdxzVar = this.zzf) != null) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "svp_aepv");
                zza.zzd();
            }
            zzcgc zzcgcVar = new zzcgc(getContext());
            this.zzn = zzcgcVar;
            zzcgcVar.zzb(surfaceTexture, i5, i6);
            zzcgc zzcgcVar2 = this.zzn;
            zzcgcVar2.start();
            SurfaceTexture zze = zzcgcVar2.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i5, i6);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i5, final int i6) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzc(i5, i6);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzN(i5, i6);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i5) {
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i5);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzP(i5);
            }
        });
        super.onWindowVisibilityChanged(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i5) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzy(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i5) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzz(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzC(int i5) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzA(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzS();
            }
        });
    }

    public final zzcfv zzE(Integer num) {
        zzcgd zzcgdVar = this.zze;
        zzcge zzcgeVar = this.zzc;
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, zzcgeVar, num);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcitVar;
    }

    public final String zzF() {
        zzcge zzcgeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcgeVar.getContext(), zzcgeVar.zzs().afmaVersion);
    }

    public final /* synthetic */ void zzG() {
        float zzc = this.zzb.zzc();
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar == null) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcfvVar.zzv(zzc, false);
        } catch (IOException e4) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzb();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zze();
        }
    }

    public final /* synthetic */ void zzJ(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzc();
        }
    }

    public final /* synthetic */ void zzL() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzd();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zza();
        }
    }

    public final /* synthetic */ void zzN(int i5, int i6) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzj(i5, i6);
        }
    }

    public final /* synthetic */ void zzO() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzh();
        }
    }

    public final /* synthetic */ void zzP(int i5) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.onWindowVisibilityChanged(i5);
        }
    }

    public final /* synthetic */ void zzQ(boolean z4, long j2) {
        this.zzc.zzu(z4, j2);
    }

    public final /* synthetic */ void zzR(String str) {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzS() {
        zzcfj zzcfjVar = this.zzg;
        if (zzcfjVar != null) {
            zzcfjVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzb(zzcfj zzcfjVar) {
        this.zzg = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcgf zzcgfVar = this.zzd;
        zzcgfVar.zzf();
        this.zzb.zze();
        zzcgfVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzi(int i5) {
        if (zzU()) {
            this.zzi.zzx(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzj(float f5, float f6) {
        zzcgc zzcgcVar = this.zzn;
        if (zzcgcVar != null) {
            zzcgcVar.zzf(f5, f6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzm() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzn() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final long zzo() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgh
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z4, final long j2) {
        if (this.zzc != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzQ(z4, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i5) {
        if (this.zzm != i5) {
            this.zzm = i5;
            if (i5 == 3) {
                zzY();
                return;
            }
            if (i5 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgw.this.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i5, int i6) {
        this.zzr = i5;
        this.zzs = i6;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        final String zzZ = zzZ(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzZ);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzJ(zzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        final String zzZ = zzZ("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzZ);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgw.this.zzR(zzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final Integer zzw() {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            return zzcfvVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z4 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z4 = true;
        }
        this.zzj = str;
        zzV(z4, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzy(int i5) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzF(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzz(int i5) {
        zzcfv zzcfvVar = this.zzi;
        if (zzcfvVar != null) {
            zzcfvVar.zzG(i5);
        }
    }
}
