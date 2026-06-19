package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhyr extends zzhys {
    final /* synthetic */ zzhys zza;

    public /* synthetic */ zzhyr(zzhys zzhysVar, byte[] bArr) {
        Objects.requireNonNull(zzhysVar);
        this.zza = zzhysVar;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return h1.b(new StringBuilder(obj.length() + 21), "NullSafeTypeAdapter[", obj, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzhys
    public final void zza(zzhzs zzhzsVar, Object obj) {
        throw null;
    }
}
