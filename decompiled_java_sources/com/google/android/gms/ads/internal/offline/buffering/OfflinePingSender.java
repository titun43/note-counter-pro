package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.j;
import androidx.work.l;
import androidx.work.m;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbxl;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbxl zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbtp());
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.zza.zzg();
            return new l(g.f635c);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
