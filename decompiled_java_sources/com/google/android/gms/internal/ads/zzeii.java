package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzeii {
    private final zzbgd zza;
    private final Context zzb;
    private final zzehn zzc;
    private final VersionInfoParcel zzd;

    public zzeii(Context context, VersionInfoParcel versionInfoParcel, zzbgd zzbgdVar, zzehn zzehnVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbgdVar;
        this.zzc = zzehnVar;
    }

    public final void zza(final boolean z4) {
        try {
            this.zzc.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzeih
                @Override // com.google.android.gms.internal.ads.zzfmu
                public final /* synthetic */ Object zza(Object obj) {
                    zzeii.this.zzb(z4, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e4) {
            String valueOf = String.valueOf(e4.getMessage());
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    public final Void zzb(boolean z4, SQLiteDatabase sQLiteDatabase) {
        if (z4) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbgj.zzaf.zza.zzk(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzicg e4) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e4.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbgj.zzaf.zzc zzB = zzbgj.zzaf.zzB();
            zzB.zzB(context.getPackageName());
            zzB.zzH(Build.MODEL);
            zzB.zzo(zzeic.zzc(sQLiteDatabase, 0));
            zzB.zzj(arrayList);
            zzB.zzs(zzeic.zzc(sQLiteDatabase, 1));
            zzB.zzQ(zzeic.zzc(sQLiteDatabase, 3));
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzB.zzw(System.currentTimeMillis());
            zzB.zzM(zzeic.zzd(sQLiteDatabase, 2));
            final zzbgj.zzaf zzbu = zzB.zzbu();
            int size = arrayList.size();
            long j2 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                zzbgj.zzaf.zza zzaVar = (zzbgj.zzaf.zza) arrayList.get(i6);
                if (zzaVar.zzf() == zzbgj.zzq.ENUM_TRUE && zzaVar.zzb() > j2) {
                    j2 = zzaVar.zzb();
                }
            }
            if (j2 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j2));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbgd zzbgdVar = this.zza;
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeif
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzbgj.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbgj.zzar.zza zzs = zzbgj.zzar.zzs();
            zzs.zzc(versionInfoParcel.buddyApkVersion);
            zzs.zzg(versionInfoParcel.clientJarVersion);
            zzs.zzk(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbgj.zzar zzbu2 = zzs.zzbu();
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzeig
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar2) {
                    zzbgj.zzm.zza zzcc = zzaVar2.zzG().zzcc();
                    zzcc.zzs(zzbgj.zzar.this);
                    zzaVar2.zzI(zzcc);
                }
            });
            zzbgdVar.zzc(10004);
            zzeic.zzb(sQLiteDatabase);
        }
        return null;
    }
}
