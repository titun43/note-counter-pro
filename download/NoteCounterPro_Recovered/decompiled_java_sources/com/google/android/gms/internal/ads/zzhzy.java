package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class zzhzy implements zzidk {
    static {
        int i5 = zzibb.zzb;
        int i6 = zziaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidk
    public final /* synthetic */ Object zza(InputStream inputStream, zzibb zzibbVar) {
        zziee zzaU;
        zziaq zzF = zziaq.zzF(inputStream, 4096);
        zzidc zzidcVar = (zzidc) zzb(zzF, zzibbVar);
        zzF.zzb(0);
        if (zzidcVar == null || zzidcVar.zzbi()) {
            return zzidcVar;
        }
        if (zzidcVar instanceof zzhzw) {
            zzaU = ((zzhzw) zzidcVar).zzaU();
        } else {
            if (zzidcVar instanceof zzhzx) {
                throw null;
            }
            zzaU = new zziee(zzidcVar);
        }
        throw zzaU.zza();
    }
}
