package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final /* synthetic */ class zzetb implements zzgyw {
    static final /* synthetic */ zzetb zza = new zzetb();

    private /* synthetic */ zzetb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ j3.a zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgzo.zza(new zzete(Integer.toString(17))) : zzgzo.zza(new zzete(null));
    }
}
