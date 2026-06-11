package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class zzhia implements zzhic {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public zzhia(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzhic
    public final boolean zza() {
        return this.zza.get();
    }
}
