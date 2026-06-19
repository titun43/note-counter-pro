package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import c3.a0;
import c3.d;
import c3.e;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaf {
    @Deprecated
    public final r addGeofences(p pVar, List<d> list, PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (d dVar : list) {
                if (dVar != null) {
                    b0.a("Geofence must be created using Geofence.Builder.", dVar instanceof zzbe);
                    arrayList.add((zzbe) dVar);
                }
            }
        }
        b0.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return ((d0) pVar).f964a.doWrite((m) new zzac(this, pVar, new e(arrayList, 5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, null), pendingIntent));
    }

    public final r removeGeofences(p pVar, PendingIntent pendingIntent) {
        b0.h(pendingIntent, "PendingIntent can not be null.");
        return zza(pVar, new a0(null, pendingIntent, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public final r zza(p pVar, a0 a0Var) {
        return ((d0) pVar).f964a.doWrite((m) new zzad(this, pVar, a0Var));
    }

    public final r removeGeofences(p pVar, List<String> list) {
        b0.h(list, "geofence can't be null.");
        b0.a("Geofences must contains at least one id.", !list.isEmpty());
        return zza(pVar, new a0(list, null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public final r addGeofences(p pVar, e eVar, PendingIntent pendingIntent) {
        return ((d0) pVar).f964a.doWrite((m) new zzac(this, pVar, eVar, pendingIntent));
    }
}
