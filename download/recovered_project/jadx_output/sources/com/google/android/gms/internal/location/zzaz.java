package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import c3.a0;
import c3.c;
import c3.e;
import c3.e0;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, n nVar, o oVar, String str, i iVar) {
        super(context, looper, nVar, oVar, str, iVar);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e4) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e4);
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, l lVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, lVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, l lVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, lVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(j jVar, zzai zzaiVar) {
        this.zzf.zzh(jVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(j jVar, zzai zzaiVar) {
        this.zzf.zzi(jVar, zzaiVar);
    }

    public final void zzI(boolean z4) {
        this.zzf.zzk(z4);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(c3.i iVar, d dVar, String str) {
        checkConnected();
        b0.a("locationSettingsRequest can't be null nor empty.", iVar != null);
        b0.a("listener can't be null.", dVar != null);
        ((zzam) getService()).zzt(iVar, new zzay(dVar), null);
    }

    public final void zzq(long j2, PendingIntent pendingIntent) {
        checkConnected();
        b0.g(pendingIntent);
        b0.a("detectionIntervalMillis must be >= 0", j2 >= 0);
        ((zzam) getService()).zzh(j2, true, pendingIntent);
    }

    public final void zzr(c cVar, PendingIntent pendingIntent, d dVar) {
        checkConnected();
        b0.h(cVar, "activityTransitionRequest must be specified.");
        b0.h(pendingIntent, "PendingIntent must be specified.");
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(cVar, pendingIntent, new r(dVar));
    }

    public final void zzs(PendingIntent pendingIntent, d dVar) {
        checkConnected();
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new r(dVar));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        b0.g(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, d dVar) {
        checkConnected();
        b0.h(pendingIntent, "PendingIntent must be specified.");
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new r(dVar));
    }

    public final void zzv(e eVar, PendingIntent pendingIntent, d dVar) {
        checkConnected();
        b0.h(eVar, "geofencingRequest can't be null.");
        b0.h(pendingIntent, "PendingIntent must be specified.");
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzd(eVar, pendingIntent, new zzaw(dVar));
    }

    public final void zzw(a0 a0Var, d dVar) {
        checkConnected();
        b0.h(a0Var, "removeGeofencingRequest can't be null.");
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(a0Var, new zzax(dVar));
    }

    public final void zzx(PendingIntent pendingIntent, d dVar) {
        checkConnected();
        b0.h(pendingIntent, "PendingIntent must be specified.");
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(dVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, d dVar) {
        checkConnected();
        b0.a("geofenceRequestIds can't be null nor empty.", list != null && list.size() > 0);
        b0.h(dVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(dVar), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        return x2.d.d(getAvailableFeatures(), e0.f810a) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
