package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class zzeeq implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    protected final zzcen zza = new zzcen();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbzu zze;
    protected zzbyw zzf;

    public static void zzc(Context context, j3.a aVar, Executor executor) {
        if (((Boolean) zzbiw.zzj.zze()).booleanValue() || ((Boolean) zzbiw.zzh.zze()).booleanValue()) {
            zzgzo.zzr(aVar, new zzeen(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(t2.b bVar) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Disconnected from remote ad request service.");
        this.zza.zzd(new zzeff(1));
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnectionSuspended(int i5) {
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (!this.zzf.isConnected()) {
                    if (this.zzf.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.zzf.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
