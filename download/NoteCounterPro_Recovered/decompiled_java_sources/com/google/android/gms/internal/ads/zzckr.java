package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzckr extends com.google.android.gms.ads.internal.client.zzec {
    private final zzcge zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzeg zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbma zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzckr(zzcge zzcgeVar, float f5, boolean z4, boolean z5) {
        this.zza = zzcgeVar;
        this.zzi = f5;
        this.zzc = z4;
        this.zzd = z5;
    }

    private final void zzw(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckr.this.zzt(hashMap);
            }
        });
    }

    private final void zzx(final int i5, final int i6, final boolean z4, final boolean z5) {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzckr.this.zzu(i5, i6, z4, z5);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        Object obj = this.zzb;
        boolean z4 = zzgaVar.zzb;
        boolean z5 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z4;
            this.zzm = z5;
        }
        boolean z6 = zzgaVar.zza;
        String str = true != z4 ? "0" : "1";
        String str2 = true != z5 ? "0" : "1";
        String str3 = true != z6 ? "0" : "1";
        o.f fVar = new o.f(3);
        fVar.put("muteStart", str3);
        fVar.put("customControlsRequested", str);
        fVar.put("clickToExpandRequested", str2);
        zzw("initialState", Collections.unmodifiableMap(fVar));
    }

    public final void zzd(float f5) {
        synchronized (this.zzb) {
            this.zzj = f5;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzw("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z4) {
        zzw(true != z4 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() {
        boolean z4;
        synchronized (this.zzb) {
            z4 = this.zzh;
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() {
        int i5;
        synchronized (this.zzb) {
            i5 = this.zze;
        }
        return i5;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() {
        float f5;
        synchronized (this.zzb) {
            f5 = this.zzi;
        }
        return f5;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() {
        float f5;
        synchronized (this.zzb) {
            f5 = this.zzj;
        }
        return f5;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        synchronized (this.zzb) {
            this.zzf = zzegVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() {
        float f5;
        synchronized (this.zzb) {
            f5 = this.zzk;
        }
        return f5;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() {
        boolean z4;
        synchronized (this.zzb) {
            try {
                z4 = false;
                if (this.zzc && this.zzl) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final com.google.android.gms.ads.internal.client.zzeg zzo() {
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        synchronized (this.zzb) {
            zzegVar = this.zzf;
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        boolean z4;
        Object obj = this.zzb;
        boolean zzn = zzn();
        synchronized (obj) {
            z4 = false;
            if (!zzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z4 = true;
                    }
                } finally {
                }
            }
        }
        return z4;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z4;
        int i5;
        synchronized (this.zzb) {
            z4 = this.zzh;
            i5 = this.zze;
            this.zze = 3;
        }
        zzx(i5, 3, z4, z4);
    }

    public final void zzs(float f5, float f6, int i5, boolean z4, float f7) {
        boolean z5;
        boolean z6;
        int i6;
        synchronized (this.zzb) {
            try {
                z5 = true;
                if (f6 == this.zzi && f7 == this.zzk) {
                    z5 = false;
                }
                this.zzi = f6;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzol)).booleanValue()) {
                    this.zzj = f5;
                }
                z6 = this.zzh;
                this.zzh = z4;
                i6 = this.zze;
                this.zze = i5;
                float f8 = this.zzk;
                this.zzk = f7;
                if (Math.abs(f7 - f8) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            try {
                zzbma zzbmaVar = this.zzn;
                if (zzbmaVar != null) {
                    zzbmaVar.zze();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
        zzx(i6, i5, z6, z4);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i5, int i6, boolean z4, boolean z5) {
        int i7;
        boolean z6;
        boolean z7;
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        com.google.android.gms.ads.internal.client.zzeg zzegVar2;
        com.google.android.gms.ads.internal.client.zzeg zzegVar3;
        synchronized (this.zzb) {
            try {
                boolean z8 = this.zzg;
                if (z8 || i6 != 1) {
                    i7 = i6;
                    z6 = false;
                } else {
                    i6 = 1;
                    i7 = 1;
                    z6 = true;
                }
                boolean z9 = i5 != i6;
                if (z9 && i7 == 1) {
                    z7 = true;
                    i7 = 1;
                } else {
                    z7 = false;
                }
                boolean z10 = z9 && i7 == 2;
                boolean z11 = z9 && i7 == 3;
                this.zzg = z8 || z6;
                if (z6) {
                    try {
                        com.google.android.gms.ads.internal.client.zzeg zzegVar4 = this.zzf;
                        if (zzegVar4 != null) {
                            zzegVar4.zze();
                        }
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (z7 && (zzegVar3 = this.zzf) != null) {
                    zzegVar3.zzf();
                }
                if (z10 && (zzegVar2 = this.zzf) != null) {
                    zzegVar2.zzg();
                }
                if (z11) {
                    com.google.android.gms.ads.internal.client.zzeg zzegVar5 = this.zzf;
                    if (zzegVar5 != null) {
                        zzegVar5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z4 != z5 && (zzegVar = this.zzf) != null) {
                    zzegVar.zzi(z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv(zzbma zzbmaVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmaVar;
        }
    }
}
