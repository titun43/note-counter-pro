package com.google.android.gms.ads.internal.offline.buffering;

import a3.b;
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
public class OfflineNotificationPoster extends Worker {
    private final zzbxl zza;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbtp());
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        try {
            this.zza.zzj(new b(getApplicationContext()), new zza(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new l(g.f635c);
        } catch (RemoteException unused) {
            return new j();
        }
    }
}
