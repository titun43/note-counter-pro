package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcqr implements zzcql {
    private final zzebf zza;

    public zzcqr(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                this.zza.zze(zzebb.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zze(zzebb.FLICK);
            return;
        }
        this.zza.zze(zzebb.NONE);
    }
}
