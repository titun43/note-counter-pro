package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import c3.f;
import c3.g;
import c3.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public final class zzz {
    public final r flushLocations(p pVar) {
        return ((d0) pVar).f964a.doWrite((m) new zzq(this, pVar));
    }

    public final Location getLastLocation(p pVar) {
        i iVar = h.f812a;
        b0.a("GoogleApiClient parameter is required.", pVar != null);
        pVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(p pVar) {
        i iVar = h.f812a;
        b0.a("GoogleApiClient parameter is required.", pVar != null);
        pVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final r removeLocationUpdates(p pVar, PendingIntent pendingIntent) {
        return ((d0) pVar).f964a.doWrite((m) new zzw(this, pVar, pendingIntent));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return ((d0) pVar).f964a.doWrite((m) new zzu(this, pVar, locationRequest, pendingIntent));
    }

    public final r setMockLocation(p pVar, Location location) {
        return ((d0) pVar).f964a.doWrite((m) new zzp(this, pVar, location));
    }

    public final r setMockMode(p pVar, boolean z4) {
        return ((d0) pVar).f964a.doWrite((m) new zzo(this, pVar, z4));
    }

    public final r removeLocationUpdates(p pVar, f fVar) {
        return ((d0) pVar).f964a.doWrite((m) new zzn(this, pVar, fVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, f fVar, Looper looper) {
        return ((d0) pVar).f964a.doWrite((m) new zzt(this, pVar, locationRequest, fVar, looper));
    }

    public final r removeLocationUpdates(p pVar, g gVar) {
        return ((d0) pVar).f964a.doWrite((m) new zzv(this, pVar, gVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, g gVar) {
        b0.h(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return ((d0) pVar).f964a.doWrite((m) new zzr(this, pVar, locationRequest, gVar));
    }

    public final r requestLocationUpdates(p pVar, LocationRequest locationRequest, g gVar, Looper looper) {
        return ((d0) pVar).f964a.doWrite((m) new zzs(this, pVar, locationRequest, gVar, looper));
    }
}
