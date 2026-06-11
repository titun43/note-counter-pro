package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbhe;
import x2.c;

/* loaded from: classes.dex */
public final class zzaa {
    private static volatile float zzc = -1.0f;
    private static volatile long zzd;
    private static final Object zze = new Object();
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpD)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            return zzg(audioManager);
        }
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpE)).intValue();
        if (zzc != -1.0f && currentTimeMillis - zzd < intValue) {
            return zzc;
        }
        synchronized (zze) {
            try {
                ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (zzc != -1.0f && currentTimeMillis2 - zzd < intValue) {
                    return zzc;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    zzc = 0.0f;
                    zzd = currentTimeMillis2;
                    return 0.0f;
                }
                zzc = zzg(audioManager2);
                zzd = currentTimeMillis2;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized boolean zzf() {
        return this.zzb >= 0.0f;
    }

    private static float zzg(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void zza(float f5) {
        this.zzb = f5;
    }

    public final synchronized float zzb() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z4) {
        this.zza = z4;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }
}
