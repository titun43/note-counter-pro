package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.emoji2.text.u;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzcia extends zzchr implements zzcfu {
    public static final /* synthetic */ int zzd = 0;
    private zzcfv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzchj zzi;
    private long zzj;
    private long zzk;

    public zzcia(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, (zzcge) this.zzc.get(), null);
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcitVar;
        zzcitVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j2) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcia.this.zzb();
            }
        }, j2);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        s.c.e(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void release() {
        zzcfv zzcfvVar = this.zze;
        if (zzcfvVar != null) {
            zzcfvVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcfv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfv zzcfvVar = this.zze;
        this.zze = null;
        return zzcfvVar;
    }

    public final void zzb() {
        long longValue;
        long intValue;
        boolean booleanValue;
        long j2;
        long j5;
        long j6;
        String zzc = zzc(this.zzf);
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
        } catch (Exception e4) {
            String str = this.zzf;
            String message = e4.getMessage();
            String n5 = u.n(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, zzc, "error", zzx("error", e4));
        }
        synchronized (this) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            if (System.currentTimeMillis() - this.zzj > longValue) {
                StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                sb.append("Timeout reached. Limit: ");
                sb.append(longValue);
                sb.append(" ms");
                throw new IOException(sb.toString());
            }
            if (this.zzg) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.zzh) {
                if (!this.zze.zzB()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long zzH = this.zze.zzH();
                if (zzH > 0) {
                    long zzN = this.zze.zzN();
                    if (zzN != this.zzk) {
                        boolean z4 = zzN > 0;
                        j5 = zzH;
                        j6 = zzN;
                        j2 = intValue;
                        zzm(this.zzf, zzc, j6, j5, z4, booleanValue ? this.zze.zzI() : -1L, booleanValue ? this.zze.zzJ() : -1L, booleanValue ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                        this.zzk = j6;
                    } else {
                        j2 = intValue;
                        j5 = zzH;
                        j6 = zzN;
                    }
                    if (j6 >= j5) {
                        zzp(this.zzf, zzc, j5);
                    } else if (this.zze.zzO() >= j2 && j6 > 0) {
                    }
                }
                zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzf(String str, String[] strArr) {
        boolean z4;
        String str2;
        String str3;
        long j2;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        boolean z5;
        this.zzf = str;
        String zzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                uriArr[i5] = Uri.parse(strArr[i5]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(zzc, this);
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
            long j11 = -1;
            while (true) {
                synchronized (this) {
                    if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                        long j12 = longValue2;
                        StringBuilder sb = new StringBuilder(String.valueOf(j12).length() + 27);
                        sb.append(str5);
                        sb.append(j12);
                        sb.append(str4);
                        throw new IOException(sb.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long zzH = this.zze.zzH();
                        if (zzH > 0) {
                            z4 = booleanValue;
                            long zzN = this.zze.zzN();
                            if (zzN != j11) {
                                if (zzN > 0) {
                                    j10 = longValue2;
                                    z5 = true;
                                } else {
                                    j10 = longValue2;
                                    z5 = false;
                                }
                                long j13 = longValue;
                                j8 = zzH;
                                str3 = str5;
                                j7 = j13;
                                str2 = str4;
                                j9 = zzN;
                                j5 = intValue;
                                j2 = j10;
                                zzm(str, zzc, j9, j8, z5, z4 ? this.zze.zzI() : -1L, z4 ? this.zze.zzJ() : -1L, z4 ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                j11 = j9;
                            } else {
                                str3 = str5;
                                j7 = longValue;
                                j5 = intValue;
                                j8 = zzH;
                                str2 = str4;
                                j2 = longValue2;
                                j9 = zzN;
                            }
                            if (j9 >= j8) {
                                zzp(str, zzc, j8);
                            } else if (this.zze.zzO() < j5 || j9 <= 0) {
                                j6 = j7;
                            }
                        } else {
                            z4 = booleanValue;
                            str2 = str4;
                            str3 = str5;
                            j2 = longValue2;
                            j5 = intValue;
                            j6 = longValue;
                        }
                        try {
                            wait(j6);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                }
                longValue = j6;
                str4 = str2;
                longValue2 = j2;
                intValue = j5;
                str5 = str3;
                booleanValue = z4;
            }
            return true;
        } catch (Exception e4) {
            String message = e4.getMessage();
            String n5 = u.n(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e4));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        this.zzf = str;
        this.zzi = zzchjVar;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                uriArr[i5] = Uri.parse(strArr[i5]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(zzc, this);
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e4) {
            String message = e4.getMessage();
            String n5 = u.n(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(n5);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, zzc, "error", zzx("error", e4));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzh(int i5) {
        this.zze.zzG(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzi(int i5) {
        this.zze.zzF(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzj(int i5) {
        this.zze.zzy(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzk(int i5) {
        this.zze.zzz(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z4, final long j2) {
        final zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcge.this.zzu(z4, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i5, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
