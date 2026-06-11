package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzadz(List list, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f5, String str) {
        this.zza = list;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = i9;
        this.zzg = i10;
        this.zzh = i11;
        this.zzi = i12;
        this.zzj = i13;
        this.zzk = f5;
        this.zzl = str;
    }

    public static zzadz zza(zzer zzerVar) {
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        try {
            zzerVar.zzk(4);
            int zzs = (zzerVar.zzs() & 3) + 1;
            if (zzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzs2 = zzerVar.zzs() & 31;
            for (int i13 = 0; i13 < zzs2; i13++) {
                arrayList.add(zzb(zzerVar));
            }
            int zzs3 = zzerVar.zzs();
            for (int i14 = 0; i14 < zzs3; i14++) {
                arrayList.add(zzb(zzerVar));
            }
            if (zzs2 > 0) {
                zzgl zze = zzgm.zze((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i15 = zze.zze;
                int i16 = zze.zzf;
                int i17 = zze.zzh + 8;
                int i18 = zze.zzi + 8;
                int i19 = zze.zzj;
                int i20 = zze.zzk;
                int i21 = zze.zzl;
                int i22 = zze.zzm;
                float f6 = zze.zzg;
                str = zzdo.zza(zze.zza, zze.zzb, zze.zzc);
                i9 = i21;
                i10 = i22;
                f5 = f6;
                i8 = i18;
                i11 = i19;
                i12 = i20;
                i5 = i15;
                i6 = i16;
                i7 = i17;
            } else {
                str = null;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = 16;
                f5 = 1.0f;
                i11 = -1;
                i12 = -1;
            }
            return new zzadz(arrayList, zzs, i5, i6, i7, i8, i11, i12, i9, i10, f5, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw zzat.zzb("Error parsing AVC config", e4);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int zzt = zzerVar.zzt();
        int zzg = zzerVar.zzg();
        zzerVar.zzk(zzt);
        return zzdo.zzf(zzerVar.zzi(), zzg, zzt);
    }
}
