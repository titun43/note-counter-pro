package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;

/* loaded from: classes.dex */
public final class zzg {
    public final r removeActivityUpdates(p pVar, PendingIntent pendingIntent) {
        return ((d0) pVar).f964a.doWrite((m) new zze(this, pVar, pendingIntent));
    }

    public final r requestActivityUpdates(p pVar, long j2, PendingIntent pendingIntent) {
        return ((d0) pVar).f964a.doWrite((m) new zzd(this, pVar, j2, pendingIntent));
    }
}
