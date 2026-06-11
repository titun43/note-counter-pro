package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgje {
    private final File zza;
    private final zzfvc zzb;
    private final zzgoe zzc;

    public zzgje(File file, zzfvc zzfvcVar, zzgoe zzgoeVar) {
        this.zza = file;
        this.zzb = zzfvcVar;
        this.zzc = zzgoeVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean z4;
        try {
            File file = this.zza;
            zzgxm.zzb(file);
            zzgxm.zza(bArr, file);
            z4 = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e4) {
            this.zzc.zzd(2027, e4);
            z4 = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return z4;
    }
}
