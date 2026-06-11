package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i5) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzapx zzapxVar;
        int i5;
        zzeq zzeqVar;
        int i6;
        int i7;
        if (zzerVar.zzs() != 2) {
            return;
        }
        zzapx zzapxVar2 = this.zza;
        zzfg zzfgVar = (zzfg) zzapxVar2.zzh().get(0);
        if ((zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(1);
            int zzt = zzerVar.zzt();
            int i8 = 3;
            zzerVar.zzk(3);
            zzeq zzeqVar2 = this.zzb;
            zzerVar.zzl(zzeqVar2, 2);
            zzeqVar2.zzh(3);
            int i9 = 13;
            zzapxVar2.zzq(zzeqVar2.zzj(13));
            zzerVar.zzl(zzeqVar2, 2);
            int i10 = 4;
            zzeqVar2.zzh(4);
            int i11 = 12;
            zzerVar.zzk(zzeqVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int zzd = zzerVar.zzd();
            while (zzd > 0) {
                int i12 = 5;
                zzerVar.zzl(zzeqVar2, 5);
                int zzj = zzeqVar2.zzj(8);
                zzeqVar2.zzh(i8);
                int zzj2 = zzeqVar2.zzj(i9);
                zzeqVar2.zzh(i10);
                int zzj3 = zzeqVar2.zzj(i11);
                int zzg = zzerVar.zzg();
                int i13 = zzg + zzj3;
                String str = null;
                ArrayList arrayList = null;
                int i14 = -1;
                int i15 = 0;
                while (zzerVar.zzg() < i13) {
                    int zzs = zzerVar.zzs();
                    int zzg2 = zzerVar.zzg() + zzerVar.zzs();
                    if (zzg2 > i13) {
                        break;
                    }
                    if (zzs == i12) {
                        long zzz = zzerVar.zzz();
                        if (zzz != 1094921523) {
                            if (zzz != 1161904947) {
                                if (zzz != 1094921524) {
                                    if (zzz == 1212503619) {
                                        i7 = 36;
                                        zzapxVar = zzapxVar2;
                                        i14 = i7;
                                        i5 = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i6 = zzd;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i5 = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i6 = zzd;
                                }
                                zzapxVar = zzapxVar2;
                                i5 = zzg2;
                                zzeqVar = zzeqVar2;
                                i6 = zzd;
                                i14 = 172;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i6 = zzd;
                            i14 = 135;
                            i5 = zzg2;
                            zzerVar.zzk(i5 - zzerVar.zzg());
                            zzd = i6;
                            zzeqVar2 = zzeqVar;
                            zzapxVar2 = zzapxVar;
                            i12 = 5;
                        }
                        zzapxVar = zzapxVar2;
                        i5 = zzg2;
                        zzeqVar = zzeqVar2;
                        i6 = zzd;
                        i14 = 129;
                    } else {
                        if (zzs != 106) {
                            if (zzs != 122) {
                                if (zzs == 127) {
                                    int zzs2 = zzerVar.zzs();
                                    if (zzs2 != 21) {
                                        if (zzs2 == 14) {
                                            i7 = 136;
                                        } else {
                                            if (zzs2 == 33) {
                                                i7 = 139;
                                            }
                                            zzapxVar = zzapxVar2;
                                            i5 = zzg2;
                                            zzeqVar = zzeqVar2;
                                            i6 = zzd;
                                        }
                                    }
                                    zzapxVar = zzapxVar2;
                                    i5 = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i6 = zzd;
                                    i14 = 172;
                                } else if (zzs == 123) {
                                    i7 = 138;
                                } else if (zzs == 10) {
                                    String trim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    i15 = zzerVar.zzs();
                                    zzapxVar = zzapxVar2;
                                    str = trim;
                                    i5 = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i6 = zzd;
                                } else {
                                    if (zzs == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzerVar.zzg() < zzg2) {
                                            int i16 = zzg2;
                                            String trim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzerVar.zzs();
                                            int i17 = zzd;
                                            byte[] bArr = new byte[4];
                                            zzerVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new zzapy(trim2, zzs3, bArr));
                                            zzd = i17;
                                            zzg2 = i16;
                                            zzeqVar2 = zzeqVar2;
                                            zzapxVar2 = zzapxVar2;
                                        }
                                        zzapxVar = zzapxVar2;
                                        i5 = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i6 = zzd;
                                        arrayList = arrayList2;
                                        i14 = 89;
                                    } else {
                                        zzapxVar = zzapxVar2;
                                        i5 = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i6 = zzd;
                                        if (zzs == 111) {
                                            i14 = 257;
                                        }
                                    }
                                    zzerVar.zzk(i5 - zzerVar.zzg());
                                    zzd = i6;
                                    zzeqVar2 = zzeqVar;
                                    zzapxVar2 = zzapxVar;
                                    i12 = 5;
                                }
                                zzapxVar = zzapxVar2;
                                i14 = i7;
                                i5 = zzg2;
                                zzeqVar = zzeqVar2;
                                i6 = zzd;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i6 = zzd;
                            i14 = 135;
                            i5 = zzg2;
                            zzerVar.zzk(i5 - zzerVar.zzg());
                            zzd = i6;
                            zzeqVar2 = zzeqVar;
                            zzapxVar2 = zzapxVar;
                            i12 = 5;
                        }
                        zzapxVar = zzapxVar2;
                        i5 = zzg2;
                        zzeqVar = zzeqVar2;
                        i6 = zzd;
                        i14 = 129;
                    }
                    zzerVar.zzk(i5 - zzerVar.zzg());
                    zzd = i6;
                    zzeqVar2 = zzeqVar;
                    zzapxVar2 = zzapxVar;
                    i12 = 5;
                }
                zzapx zzapxVar3 = zzapxVar2;
                zzeq zzeqVar3 = zzeqVar2;
                int i18 = zzd;
                zzerVar.zzh(i13);
                zzapz zzapzVar = new zzapz(i14, str, i15, arrayList, Arrays.copyOfRange(zzerVar.zzi(), zzg, i13));
                if (zzj == 6 || zzj == 5) {
                    zzj = zzapzVar.zza;
                }
                zzd = i18 - (zzj3 + 5);
                if (!zzapxVar3.zzk().get(zzj2)) {
                    zzaqc zzb = zzapxVar3.zzi().zzb(zzj, zzapzVar);
                    sparseIntArray.put(zzj2, zzj2);
                    sparseArray.put(zzj2, zzb);
                }
                i10 = 4;
                zzeqVar2 = zzeqVar3;
                zzapxVar2 = zzapxVar3;
                i8 = 3;
                i9 = 13;
                i11 = 12;
            }
            zzapx zzapxVar4 = zzapxVar2;
            int size = sparseIntArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                int keyAt = sparseIntArray.keyAt(i19);
                int valueAt = sparseIntArray.valueAt(i19);
                zzapxVar4.zzk().put(keyAt, true);
                zzapxVar4.zzl().put(valueAt, true);
                zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i19);
                if (zzaqcVar != null) {
                    zzaqcVar.zza(zzfgVar, zzapxVar4.zzm(), new zzaqb(zzt, keyAt, 8192));
                    zzapxVar4.zzj().put(valueAt, zzaqcVar);
                }
            }
            zzapxVar4.zzj().remove(this.zze);
            zzapxVar4.zzo(0);
            if (zzapxVar4.zzn() == 0) {
                zzapxVar4.zzm().zzv();
                zzapxVar4.zzp(true);
            }
        }
    }
}
