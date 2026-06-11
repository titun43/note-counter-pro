package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import c3.a0;
import c3.c;
import c3.e;
import c3.i;
import c3.l;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
public interface zzam extends IInterface {
    void zzd(e eVar, PendingIntent pendingIntent, zzak zzakVar);

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str);

    void zzf(String[] strArr, zzak zzakVar, String str);

    void zzg(a0 a0Var, zzak zzakVar);

    void zzh(long j2, boolean z4, PendingIntent pendingIntent);

    void zzi(c cVar, PendingIntent pendingIntent, h hVar);

    void zzj(PendingIntent pendingIntent, h hVar);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, h hVar);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbcVar);

    void zzp(boolean z4);

    void zzq(Location location);

    void zzr(zzai zzaiVar);

    LocationAvailability zzs(String str);

    void zzt(i iVar, zzao zzaoVar, String str);

    void zzu(zzl zzlVar);

    void zzv(PendingIntent pendingIntent, l lVar, h hVar);
}
