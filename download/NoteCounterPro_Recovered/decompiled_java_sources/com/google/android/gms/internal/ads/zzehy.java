package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzehy implements zzgzl {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzehz zzb;

    public zzehy(zzehz zzehzVar, boolean z4) {
        this.zza = z4;
        Objects.requireNonNull(zzehzVar);
        this.zzb = zzehzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> list;
        List asList;
        zzbgj.zzd.zza zzaVar;
        zzehz zzehzVar = this.zzb;
        zzdah zzdahVar = (zzdah) obj;
        if (zzehzVar.zzf()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                list = Collections.EMPTY_LIST;
                final ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                zzaVar = zzbgj.zzd.zza.BANNER;
                                break;
                            }
                            zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                zzaVar = zzbgj.zzd.zza.NATIVE_APP_INSTALL;
                                break;
                            }
                            zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                zzaVar = zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD;
                                break;
                            }
                            zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                zzaVar = zzbgj.zzd.zza.INTERSTITIAL;
                                break;
                            }
                            zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        default:
                            zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                    }
                    arrayList.add(zzaVar);
                }
                final zzbgj.zzaf.zzd zze = zzehz.zze(bundle);
                final zzbgj.zzab zzb = zzehzVar.zzb(bundle);
                final boolean z4 = this.zza;
                zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
                    @Override // com.google.android.gms.internal.ads.zzfmu
                    public final /* synthetic */ Object zza(Object obj3) {
                        zzehz zzehzVar2 = zzehy.this.zzb;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                        if (zzehzVar2.zzf()) {
                            return null;
                        }
                        zzbgj.zzaf.zzd zzdVar = zze;
                        zzbgj.zzab zzabVar = zzb;
                        ArrayList arrayList2 = arrayList;
                        boolean z5 = z4;
                        byte[] zzc = zzehzVar2.zzc(z5, arrayList2, zzabVar, zzdVar);
                        zzeic.zzf(sQLiteDatabase, z5, true);
                        zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), zzc);
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        list = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbgj.zzaf.zzd zze2 = zzehz.zze(bundle);
        final zzbgj.zzab zzb2 = zzehzVar.zzb(bundle);
        final boolean z42 = this.zza;
        zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj32) {
                zzehz zzehzVar2 = zzehy.this.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzehzVar2.zzf()) {
                    return null;
                }
                zzbgj.zzaf.zzd zzdVar = zze2;
                zzbgj.zzab zzabVar = zzb2;
                ArrayList arrayList22 = arrayList3;
                boolean z5 = z42;
                byte[] zzc = zzehzVar2.zzc(z5, arrayList22, zzabVar, zzdVar);
                zzeic.zzf(sQLiteDatabase, z5, true);
                zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), zzc);
                return null;
            }
        });
    }
}
