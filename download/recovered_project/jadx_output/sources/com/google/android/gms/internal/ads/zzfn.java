package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
final class zzfn {
    private final Context zza;
    private PowerManager.WakeLock zzb;

    public zzfn(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzb(boolean z4, boolean z5) {
        boolean zzg;
        if (z4) {
            if (this.zzb == null) {
                Context context = this.zza;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    zzee.zzc("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    zzee.zzc("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.zzb = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock == null) {
            return;
        }
        zzg = zzfo.zzg(z4, z5);
        if (zzg) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zza() {
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }
}
