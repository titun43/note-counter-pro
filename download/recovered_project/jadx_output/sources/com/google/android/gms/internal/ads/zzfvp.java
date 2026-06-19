package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfvp implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    protected final zzfwj zza;
    private final String zzb;
    private final String zzc;
    private final zzbch zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfvh zzg;
    private final long zzh;

    public zzfvp(Context context, int i5, zzbch zzbchVar, String str, String str2, String str3, zzfvh zzfvhVar) {
        this.zzb = str;
        this.zzd = zzbchVar;
        this.zzc = str2;
        this.zzg = zzfvhVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfwj zzfwjVar = new zzfwj(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfwjVar;
        this.zze = new LinkedBlockingQueue();
        zzfwjVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i5, long j2, Exception exc) {
        zzfvh zzfvhVar = this.zzg;
        if (zzfvhVar != null) {
            zzfvhVar.zzc(i5, System.currentTimeMillis() - j2, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzfwo zzc = zzc();
        if (zzc != null) {
            try {
                zzfwv zzg = zzc.zzg(new zzfwt(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(t2.b bVar) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i5) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfwv zza(int i5) {
        zzfwv zzfwvVar;
        try {
            zzfwvVar = (zzfwv) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            zzd(2009, this.zzh, e4);
            zzfwvVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfwvVar != null) {
            if (zzfwvVar.zzc == 7) {
                zzfvh.zzg(3);
            } else {
                zzfvh.zzg(2);
            }
        }
        return zzfwvVar == null ? new zzfwv(null, 1) : zzfwvVar;
    }

    public final void zzb() {
        zzfwj zzfwjVar = this.zza;
        if (zzfwjVar != null) {
            if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                zzfwjVar.disconnect();
            }
        }
    }

    public final zzfwo zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
