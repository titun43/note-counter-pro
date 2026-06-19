package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import n.h;
import n.n;

/* loaded from: classes.dex */
public final class zzikx extends n {
    private final WeakReference zza;

    public zzikx(zzbif zzbifVar) {
        this.zza = new WeakReference(zzbifVar);
    }

    @Override // n.n
    public final void onCustomTabsServiceConnected(ComponentName componentName, h hVar) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzf(hVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbif zzbifVar = (zzbif) this.zza.get();
        if (zzbifVar != null) {
            zzbifVar.zzg();
        }
    }
}
