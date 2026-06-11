package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class zzger {
    public long zza;
    public long zzb;
    public long zzc;
    public long zzd;
    public double zze;
    public float zzf;
    public float zzg;
    public float zzh;
    public float zzi;
    private double zzj;
    private double zzk;

    private static double zzb(MotionEvent motionEvent, double d5, double d6, double d7) {
        return Math.hypot(motionEvent.getRawX() - d5, motionEvent.getRawY() - d6) + d7;
    }

    public final /* synthetic */ void zza(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zza++;
            this.zze = 0.0d;
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            this.zzf = motionEvent.getX();
            this.zzg = motionEvent.getY();
            this.zzh = motionEvent.getRawX();
            this.zzi = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.zzc++;
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.zzd++;
        } else {
            this.zzb += motionEvent.getHistorySize() + 1;
            this.zze = zzb(motionEvent, this.zzj, this.zzk, this.zze);
            this.zzj = motionEvent.getRawX();
            this.zzk = motionEvent.getRawY();
        }
    }
}
