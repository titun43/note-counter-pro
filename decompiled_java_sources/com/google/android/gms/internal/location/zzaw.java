package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

/* loaded from: classes.dex */
final class zzaw extends zzaj {
    private d zza;

    public zzaw(d dVar) {
        this.zza = dVar;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i5, String[] strArr) {
        d dVar = this.zza;
        if (dVar == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        if ((i5 < 0 || i5 > 1) && (i5 < 1000 || i5 >= 1006)) {
            i5 = 1;
        }
        if (i5 == 1) {
            i5 = 13;
        }
        dVar.setResult(new Status(i5, null, null, null));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i5, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i5, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
