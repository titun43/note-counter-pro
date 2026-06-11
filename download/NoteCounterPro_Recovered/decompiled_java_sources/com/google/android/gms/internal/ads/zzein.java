package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzein implements zzgzl {
    final /* synthetic */ zzfmu zza;

    public zzein(zzeiu zzeiuVar, zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
        Objects.requireNonNull(zzeiuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
