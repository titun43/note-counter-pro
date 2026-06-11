package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzeid implements zzfnv {
    private final zzehr zza;
    private final zzehv zzb;

    public zzeid(zzehr zzehrVar, zzehv zzehvVar) {
        this.zza = zzehrVar;
        this.zzb = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdL(zzfno zzfnoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            if (zzfno.RENDERER == zzfnoVar) {
                zzehr zzehrVar = this.zza;
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzehrVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfno.PRELOADED_LOADER == zzfnoVar || zzfno.SERVER_TRANSACTION == zzfnoVar) {
                zzehr zzehrVar2 = this.zza;
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzehrVar2.zza(SystemClock.elapsedRealtime());
                final zzehv zzehvVar = this.zzb;
                final long zzb = zzehrVar2.zzb();
                zzehvVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehu
                    @Override // com.google.android.gms.internal.ads.zzfmu
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzehv.this.zzf()) {
                            return null;
                        }
                        long j2 = zzb;
                        zzbgj.zzaf.zza.C0002zza zzz = zzbgj.zzaf.zza.zzz();
                        zzz.zzad(j2);
                        byte[] zzaN = zzz.zzbu().zzaN();
                        zzeic.zzf(sQLiteDatabase, false, false);
                        zzeic.zze(sQLiteDatabase, j2, zzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzehrVar.zzi(SystemClock.elapsedRealtime() - zzehrVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final void zzdN(zzfno zzfnoVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && zzfno.RENDERER == zzfnoVar) {
            zzehr zzehrVar = this.zza;
            if (zzehrVar.zzh() != 0) {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                zzehrVar.zzi(SystemClock.elapsedRealtime() - zzehrVar.zzh());
            }
        }
    }
}
