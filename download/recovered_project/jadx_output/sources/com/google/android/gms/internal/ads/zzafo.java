package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzafo {
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
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzgj zzo;

    private zzafo(List list, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f5, int i17, String str, zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = i14;
        this.zzj = i15;
        this.zzk = i16;
        this.zzl = f5;
        this.zzm = i17;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafo zza(zzer zzerVar) {
        return zzc(zzerVar, false, null);
    }

    public static zzafo zzb(zzer zzerVar, zzgj zzgjVar) {
        return zzc(zzerVar, true, zzgjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzafo zzc(zzer zzerVar, boolean z4, zzgj zzgjVar) {
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        zzgf zzgfVar;
        int i7;
        int max;
        int i8;
        int max2;
        int i9;
        int i10;
        int i11;
        int i12 = 4;
        boolean z7 = true;
        if (z4) {
            try {
                zzerVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e4) {
                e = e4;
                z6 = true;
                throw zzat.zzb("Error parsing".concat(z6 != z4 ? "HEVC config" : "L-HEVC config"), e);
            }
        } else {
            try {
                zzerVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e5) {
                e = e5;
                z5 = z7;
                z6 = z5;
                throw zzat.zzb("Error parsing".concat(z6 != z4 ? "HEVC config" : "L-HEVC config"), e);
            }
        }
        int zzs = zzerVar.zzs() & 3;
        int zzs2 = zzerVar.zzs();
        int zzg = zzerVar.zzg();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < zzs2; i15++) {
            zzerVar.zzk(1);
            int zzt = zzerVar.zzt();
            for (int i16 = 0; i16 < zzt; i16++) {
                int zzt2 = zzerVar.zzt();
                i14 += zzt2 + 4;
                zzerVar.zzk(zzt2);
            }
        }
        zzerVar.zzh(zzg);
        byte[] bArr = new byte[i14];
        zzgj zzgjVar2 = zzgjVar;
        int i17 = 0;
        float f5 = 1.0f;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        String str = null;
        int i30 = 0;
        while (i30 < zzs2) {
            int zzs3 = zzerVar.zzs() & 63;
            int zzt3 = zzerVar.zzt();
            z5 = z7;
            int i31 = i13;
            zzgj zzgjVar3 = zzgjVar2;
            while (i31 < zzt3) {
                try {
                    int zzt4 = zzerVar.zzt();
                    int i32 = i31;
                    System.arraycopy(zzgm.zza, i13, bArr, i17, i12);
                    int i33 = i17 + 4;
                    System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i33, zzt4);
                    int i34 = 32;
                    if (zzs3 != 32) {
                        i34 = zzs3;
                    } else if (i32 == 0) {
                        zzgjVar3 = zzgm.zzf(bArr, i33, i33 + zzt4);
                        i6 = i33;
                        i5 = zzs;
                        i10 = 0;
                        i9 = 0;
                        i17 = i6 + zzt4;
                        zzerVar.zzk(zzt4);
                        i31 = i10 + 1;
                        i13 = i9;
                        zzs = i5;
                        i12 = 4;
                    }
                    i5 = zzs;
                    if (i34 != 33) {
                        i6 = i33;
                        int i35 = 8;
                        if (i34 == 39 && i32 == 0) {
                            int i36 = i17 + 6;
                            int i37 = (i6 + zzt4) - 1;
                            while (true) {
                                byte b2 = bArr[i37];
                                if (b2 == 0) {
                                    if (i37 <= i36) {
                                        break;
                                    }
                                    i37--;
                                } else if (b2 != 0 && i37 > i36) {
                                    zzgn zzgnVar = new zzgn(bArr, i36, i37 + 1);
                                    while (true) {
                                        if (!zzgnVar.zzd(16)) {
                                            break;
                                        }
                                        int i38 = i35;
                                        int zzf = zzgnVar.zzf(i38);
                                        int i39 = 0;
                                        while (zzf == 255) {
                                            i39 += 255;
                                            zzf = zzgnVar.zzf(i38);
                                        }
                                        int i40 = i39 + zzf;
                                        int zzf2 = zzgnVar.zzf(i38);
                                        int i41 = 0;
                                        while (zzf2 == 255) {
                                            i41 += 255;
                                            zzf2 = zzgnVar.zzf(8);
                                        }
                                        i35 = 8;
                                        int i42 = i41 + zzf2;
                                        if (i42 == 0 || !zzgnVar.zzd(i42)) {
                                            break;
                                        }
                                        if (i40 == 176) {
                                            int zzg2 = zzgnVar.zzg();
                                            boolean zze = zzgnVar.zze();
                                            int zzg3 = zze ? zzgnVar.zzg() : 0;
                                            int zzg4 = zzgnVar.zzg();
                                            int i43 = -1;
                                            int i44 = -1;
                                            int i45 = -1;
                                            int i46 = -1;
                                            int i47 = -1;
                                            int i48 = -1;
                                            int i49 = 0;
                                            while (i49 <= zzg4) {
                                                i43 = zzgnVar.zzg();
                                                i44 = zzgnVar.zzg();
                                                boolean z8 = zze;
                                                int zzf3 = zzgnVar.zzf(6);
                                                if (zzf3 != 63) {
                                                    if (zzf3 == 0) {
                                                        i7 = zzf3;
                                                        max = Math.max(0, zzg2 - 30);
                                                    } else {
                                                        i7 = zzf3;
                                                        max = Math.max(0, (i7 + zzg2) - 31);
                                                    }
                                                    i46 = zzgnVar.zzf(max);
                                                    if (z8) {
                                                        int zzf4 = zzgnVar.zzf(6);
                                                        if (zzf4 != 63) {
                                                            if (zzf4 == 0) {
                                                                i8 = zzf4;
                                                                max2 = Math.max(0, zzg3 - 30);
                                                            } else {
                                                                i8 = zzf4;
                                                                max2 = Math.max(0, (i8 + zzg3) - 31);
                                                            }
                                                            i48 = zzgnVar.zzf(max2);
                                                            i47 = i8;
                                                        }
                                                    }
                                                    if (zzgnVar.zze()) {
                                                        zzgnVar.zzb(10);
                                                    }
                                                    i49++;
                                                    zze = z8;
                                                    i45 = i7;
                                                }
                                            }
                                            zzgfVar = new zzgf(zzg2, zzg3, zzg4 + 1, i43, i44, i45, i46, i47, i48);
                                        } else {
                                            zzgnVar.zzb(i42 * 8);
                                        }
                                    }
                                }
                            }
                            zzgfVar = null;
                            if (zzgfVar != null && zzgjVar3 != null) {
                                i9 = 0;
                                if (zzgfVar.zza == ((zzfz) zzgjVar3.zza.get(0)).zzb) {
                                    i10 = i32;
                                    i28 = 4;
                                    i17 = i6 + zzt4;
                                    zzerVar.zzk(zzt4);
                                    i31 = i10 + 1;
                                    i13 = i9;
                                    zzs = i5;
                                    i12 = 4;
                                } else {
                                    i28 = 5;
                                }
                            }
                        }
                        i9 = 0;
                    } else if (i32 == 0) {
                        zzgg zzg5 = zzgm.zzg(bArr, i33, i33 + zzt4, zzgjVar3);
                        int i50 = zzg5.zza + 1;
                        int i51 = zzg5.zze;
                        int i52 = zzg5.zzf;
                        int i53 = zzg5.zzg;
                        i6 = i33;
                        int i54 = zzg5.zzh;
                        int i55 = zzg5.zzc + 8;
                        int i56 = zzg5.zzd + 8;
                        int i57 = zzg5.zzk;
                        int i58 = zzg5.zzl;
                        int i59 = zzg5.zzm;
                        float f6 = zzg5.zzi;
                        int i60 = zzg5.zzj;
                        zzgb zzgbVar = zzg5.zzb;
                        if (zzgbVar != null) {
                            i11 = i60;
                            str = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                        } else {
                            i11 = i60;
                        }
                        i27 = i59;
                        f5 = f6;
                        i29 = i11;
                        i10 = i32;
                        i24 = i56;
                        i25 = i57;
                        i26 = i58;
                        i21 = i53;
                        i22 = i54;
                        i23 = i55;
                        i9 = 0;
                        i19 = i51;
                        i20 = i52;
                        i18 = i50;
                        i17 = i6 + zzt4;
                        zzerVar.zzk(zzt4);
                        i31 = i10 + 1;
                        i13 = i9;
                        zzs = i5;
                        i12 = 4;
                    } else {
                        i6 = i33;
                        i9 = 0;
                    }
                    i10 = i32;
                    i17 = i6 + zzt4;
                    zzerVar.zzk(zzt4);
                    i31 = i10 + 1;
                    i13 = i9;
                    zzs = i5;
                    i12 = 4;
                } catch (ArrayIndexOutOfBoundsException e6) {
                    e = e6;
                    z6 = z5;
                    throw zzat.zzb("Error parsing".concat(z6 != z4 ? "HEVC config" : "L-HEVC config"), e);
                }
            }
            i30++;
            zzgjVar2 = zzgjVar3;
            z7 = z5;
            zzs = zzs;
            i12 = 4;
        }
        z5 = z7;
        return new zzafo(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), zzs + 1, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, f5, i29, str, zzgjVar2);
    }
}
