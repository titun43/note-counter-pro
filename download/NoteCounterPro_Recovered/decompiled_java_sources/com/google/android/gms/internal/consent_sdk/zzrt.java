package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbgj;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i5, int i6, zzrq zzrqVar, boolean z4, int[] iArr2, int i7, int i8, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z5 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z5 = true;
        }
        this.zzf = z5;
        this.zzg = iArr2;
        this.zzh = i7;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i5, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i5 & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i5, int i6) {
        return zzsw.zzc(obj, (long) (zzm(i6) & 1048575)) == i5;
    }

    private static boolean zzD(Object obj, long j2) {
        return ((Boolean) zzsw.zzf(obj, j2)).booleanValue();
    }

    private static final void zzE(int i5, Object obj, zztb zztbVar) {
        if (obj instanceof String) {
            zztbVar.zzF(i5, (String) obj);
        } else {
            zztbVar.zzd(i5, (zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        int i5;
        int charAt;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        char charAt2;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String str;
        int objectFieldOffset;
        char c5;
        int i25;
        int i26;
        int i27;
        int i28;
        Field zzs;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zzs2;
        Object obj2;
        Field zzs3;
        int i34;
        char charAt11;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String zzd = zzrzVar.zzd();
        int length = zzd.length();
        char c6 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i5 = i38 + 1;
                if (zzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i5;
            }
        } else {
            i5 = 1;
        }
        int i39 = i5 + 1;
        int charAt15 = zzd.charAt(i5);
        if (charAt15 >= 55296) {
            int i40 = charAt15 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt14 = zzd.charAt(i39);
                if (charAt14 < 55296) {
                    break;
                }
                i40 |= (charAt14 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt15 = i40 | (charAt14 << i41);
            i39 = i37;
        }
        if (charAt15 == 0) {
            i7 = 0;
            i10 = 0;
            charAt = 0;
            i6 = 0;
            i8 = 0;
            i9 = 0;
            iArr = zza;
            i11 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt16 = zzd.charAt(i39);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i19 = i42 + 1;
                    charAt9 = zzd.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i19;
                }
                charAt16 = i43 | (charAt9 << i44);
                i42 = i19;
            }
            int i45 = i42 + 1;
            int charAt17 = zzd.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i18 = i45 + 1;
                    charAt8 = zzd.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i18;
                }
                charAt17 = i46 | (charAt8 << i47);
                i45 = i18;
            }
            int i48 = i45 + 1;
            int charAt18 = zzd.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i50 = 13;
                while (true) {
                    i17 = i48 + 1;
                    charAt7 = zzd.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i17;
                }
                charAt18 = i49 | (charAt7 << i50);
                i48 = i17;
            }
            int i51 = i48 + 1;
            int charAt19 = zzd.charAt(i48);
            if (charAt19 >= 55296) {
                int i52 = charAt19 & 8191;
                int i53 = 13;
                while (true) {
                    i16 = i51 + 1;
                    charAt6 = zzd.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i16;
                }
                charAt19 = i52 | (charAt6 << i53);
                i51 = i16;
            }
            int i54 = i51 + 1;
            charAt = zzd.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i15 = i54 + 1;
                    charAt5 = zzd.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i15;
                }
                charAt = i55 | (charAt5 << i56);
                i54 = i15;
            }
            int i57 = i54 + 1;
            int charAt20 = zzd.charAt(i54);
            if (charAt20 >= 55296) {
                int i58 = charAt20 & 8191;
                int i59 = 13;
                while (true) {
                    i14 = i57 + 1;
                    charAt4 = zzd.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i14;
                }
                charAt20 = i58 | (charAt4 << i59);
                i57 = i14;
            }
            int i60 = i57 + 1;
            int charAt21 = zzd.charAt(i57);
            if (charAt21 >= 55296) {
                int i61 = charAt21 & 8191;
                int i62 = 13;
                while (true) {
                    i13 = i60 + 1;
                    charAt3 = zzd.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i13;
                }
                charAt21 = i61 | (charAt3 << i62);
                i60 = i13;
            }
            int i63 = i60 + 1;
            int charAt22 = zzd.charAt(i60);
            if (charAt22 >= 55296) {
                int i64 = charAt22 & 8191;
                int i65 = 13;
                while (true) {
                    i12 = i63 + 1;
                    charAt2 = zzd.charAt(i63);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i64 |= (charAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i12;
                }
                charAt22 = i64 | (charAt2 << i65);
                i63 = i12;
            }
            int i66 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i67 = charAt20;
            i6 = charAt18;
            i7 = i67;
            i8 = charAt19;
            i9 = charAt22;
            i10 = i66;
            iArr = iArr2;
            i11 = charAt16;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzrzVar.zze();
        Class<?> cls2 = zzrzVar.zza().getClass();
        int i68 = i9 + i7;
        int i69 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i9;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i39 < length) {
            int i74 = i39 + 1;
            int charAt23 = zzd.charAt(i39);
            if (charAt23 >= c6) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    charAt13 = zzd.charAt(i76);
                    if (charAt13 < c6) {
                        break;
                    }
                    i75 |= (charAt13 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                }
                charAt23 = i75 | (charAt13 << i77);
                i20 = i36;
            } else {
                i20 = i74;
            }
            int i78 = i20 + 1;
            int charAt24 = zzd.charAt(i20);
            if (charAt24 >= c6) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i35 = i80 + 1;
                    charAt12 = zzd.charAt(i80);
                    if (charAt12 < c6) {
                        break;
                    }
                    i79 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i35;
                }
                charAt24 = i79 | (charAt12 << i81);
                i21 = i35;
            } else {
                i21 = i78;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = charAt24 & 255;
            zzrz zzrzVar2 = zzrzVar;
            int i83 = charAt24 & 2048;
            if (i82 >= 51) {
                int i84 = i21 + 1;
                int charAt25 = zzd.charAt(i21);
                char c7 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i34 = i86 + 1;
                        charAt11 = zzd.charAt(i86);
                        if (charAt11 < c7) {
                            break;
                        }
                        i85 |= (charAt11 & 8191) << i87;
                        i87 += 13;
                        i86 = i34;
                        c7 = 55296;
                    }
                    charAt25 = i85 | (charAt11 << i87);
                    i31 = i34;
                } else {
                    i31 = i84;
                }
                int i88 = i31;
                int i89 = i82 - 51;
                i22 = length;
                if (i89 == 9 || i89 == 17) {
                    i32 = i10 + 1;
                    int i90 = i73 / 3;
                    objArr[i90 + i90 + 1] = zze[i10];
                } else {
                    if (i89 == 12) {
                        if (zzrzVar2.zzc() == 1 || i83 != 0) {
                            i32 = i10 + 1;
                            int i91 = i73 / 3;
                            objArr[i91 + i91 + 1] = zze[i10];
                        } else {
                            i33 = 0;
                            int i92 = charAt25 + charAt25;
                            obj = zze[i92];
                            int i93 = i33;
                            if (obj instanceof Field) {
                                zzs2 = (Field) obj;
                            } else {
                                zzs2 = zzs(cls2, (String) obj);
                                zze[i92] = zzs2;
                            }
                            int i94 = i11;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                            int i95 = i92 + 1;
                            obj2 = zze[i95];
                            i23 = i94;
                            if (obj2 instanceof Field) {
                                zzs3 = (Field) obj2;
                            } else {
                                zzs3 = zzs(cls2, (String) obj2);
                                zze[i95] = zzs3;
                            }
                            i25 = (int) unsafe.objectFieldOffset(zzs3);
                            str = zzd;
                            i27 = i93;
                            i21 = i88;
                            i26 = 0;
                            c5 = 55296;
                        }
                    }
                    i33 = i83;
                    int i922 = charAt25 + charAt25;
                    obj = zze[i922];
                    int i932 = i33;
                    if (obj instanceof Field) {
                    }
                    int i942 = i11;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                    int i952 = i922 + 1;
                    obj2 = zze[i952];
                    i23 = i942;
                    if (obj2 instanceof Field) {
                    }
                    i25 = (int) unsafe.objectFieldOffset(zzs3);
                    str = zzd;
                    i27 = i932;
                    i21 = i88;
                    i26 = 0;
                    c5 = 55296;
                }
                i10 = i32;
                i33 = i83;
                int i9222 = charAt25 + charAt25;
                obj = zze[i9222];
                int i9322 = i33;
                if (obj instanceof Field) {
                }
                int i9422 = i11;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs2);
                int i9522 = i9222 + 1;
                obj2 = zze[i9522];
                i23 = i9422;
                if (obj2 instanceof Field) {
                }
                i25 = (int) unsafe.objectFieldOffset(zzs3);
                str = zzd;
                i27 = i9322;
                i21 = i88;
                i26 = 0;
                c5 = 55296;
            } else {
                i22 = length;
                i23 = i11;
                int i96 = i10 + 1;
                Field zzs4 = zzs(cls2, (String) zze[i10]);
                if (i82 == 9 || i82 == 17) {
                    i24 = i96;
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = zzs4.getType();
                } else {
                    if (i82 == 27) {
                        i29 = i96;
                        i30 = 1;
                        i10 += 2;
                    } else if (i82 == 49) {
                        i10 += 2;
                        i29 = i96;
                        i30 = 1;
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        if (zzrzVar2.zzc() == 1 || i83 != 0) {
                            i10 += 2;
                            int i98 = i73 / 3;
                            objArr[i98 + i98 + 1] = zze[i96];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                            if ((charAt24 & 4096) != 0 || i82 > 17) {
                                c5 = 55296;
                                i25 = 1048575;
                                i26 = 0;
                            } else {
                                int i99 = i21 + 1;
                                int charAt26 = str.charAt(i21);
                                if (charAt26 >= 55296) {
                                    int i100 = charAt26 & 8191;
                                    int i101 = 13;
                                    while (true) {
                                        i28 = i99 + 1;
                                        charAt10 = str.charAt(i99);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i100 |= (charAt10 & 8191) << i101;
                                        i101 += 13;
                                        i99 = i28;
                                    }
                                    charAt26 = i100 | (charAt10 << i101);
                                } else {
                                    i28 = i99;
                                }
                                int i102 = (charAt26 / 32) + i23 + i23;
                                Object obj3 = zze[i102];
                                if (obj3 instanceof Field) {
                                    zzs = (Field) obj3;
                                } else {
                                    zzs = zzs(cls2, (String) obj3);
                                    zze[i102] = zzs;
                                }
                                i26 = charAt26 % 32;
                                i21 = i28;
                                c5 = 55296;
                                i25 = (int) unsafe.objectFieldOffset(zzs);
                            }
                            if (i82 >= 18 && i82 <= 49) {
                                iArr[i71] = objectFieldOffset;
                                i71++;
                            }
                            i27 = i83;
                        } else {
                            str = zzd;
                            i10 = i96;
                            i83 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c5 = 55296;
                            i25 = 1048575;
                            i26 = 0;
                            if (i82 >= 18) {
                                iArr[i71] = objectFieldOffset;
                                i71++;
                            }
                            i27 = i83;
                        }
                    } else if (i82 == 50) {
                        int i103 = i10 + 2;
                        int i104 = i70 + 1;
                        iArr[i70] = i73;
                        int i105 = i73 / 3;
                        int i106 = i105 + i105;
                        objArr[i106] = zze[i96];
                        if (i83 != 0) {
                            objArr[i106 + 1] = zze[i103];
                            i10 += 3;
                            str = zzd;
                            i70 = i104;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c5 = 55296;
                            i25 = 1048575;
                            i26 = 0;
                            if (i82 >= 18) {
                            }
                            i27 = i83;
                        } else {
                            i10 = i103;
                            i70 = i104;
                            i83 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c5 = 55296;
                            i25 = 1048575;
                            i26 = 0;
                            if (i82 >= 18) {
                            }
                            i27 = i83;
                        }
                    } else {
                        i24 = i96;
                    }
                    int i107 = i73 / 3;
                    objArr[i107 + i107 + i30] = zze[i29];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c5 = 55296;
                    i25 = 1048575;
                    i26 = 0;
                    if (i82 >= 18) {
                    }
                    i27 = i83;
                }
                str = zzd;
                i10 = i24;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                if ((charAt24 & 4096) != 0) {
                }
                c5 = 55296;
                i25 = 1048575;
                i26 = 0;
                if (i82 >= 18) {
                }
                i27 = i83;
            }
            int i108 = i73 + 1;
            iArr3[i73] = charAt23;
            int i109 = i73 + 2;
            iArr3[i108] = ((charAt24 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i27 != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | objectFieldOffset;
            i73 += 3;
            iArr3[i109] = (i26 << 20) | i25;
            i39 = i21;
            zzd = str;
            c6 = c5;
            zzrzVar = zzrzVar2;
            length = i22;
            i11 = i23;
        }
        return new zzrt(iArr3, objArr, i6, i8, zzrzVar.zza(), false, iArr, i9, i68, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j2) {
        return ((Double) zzsw.zzf(obj, j2)).doubleValue();
    }

    private static float zzk(Object obj, long j2) {
        return ((Float) zzsw.zzf(obj, j2)).floatValue();
    }

    private static int zzl(Object obj, long j2) {
        return ((Integer) zzsw.zzf(obj, j2)).intValue();
    }

    private final int zzm(int i5) {
        return this.zzc[i5 + 2];
    }

    private static int zzn(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzo(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzp(Object obj, long j2) {
        return ((Long) zzsw.zzf(obj, j2)).longValue();
    }

    private final zzsa zzq(int i5) {
        Object[] objArr = this.zzd;
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        zzsa zzsaVar = (zzsa) objArr[i7];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzb2 = zzrx.zza().zzb((Class) objArr[i7 + 1]);
        objArr[i7] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i5) {
        int i6 = i5 / 3;
        return this.zzd[i6 + i6];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e4);
        }
    }

    private final void zzt(Object obj, Object obj2, int i5) {
        if (zzy(obj2, i5)) {
            int zzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzo;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i5);
            if (!zzy(obj, i5)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j2, zzc);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzv(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j2, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i5) {
        int[] iArr = this.zzc;
        int i6 = iArr[i5];
        if (zzC(obj2, i6, i5)) {
            int zzo = zzo(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzo;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i5] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i5);
            if (!zzC(obj, i6, i5)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j2, zzc);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzw(obj, i6, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j2, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i5) {
        int zzm = zzm(i5);
        long j2 = 1048575 & zzm;
        if (j2 == 1048575) {
            return;
        }
        zzsw.zzq(obj, j2, (1 << (zzm >>> 20)) | zzsw.zzc(obj, j2));
    }

    private final void zzw(Object obj, int i5, int i6) {
        zzsw.zzq(obj, zzm(i6) & 1048575, i5);
    }

    private final boolean zzx(Object obj, Object obj2, int i5) {
        return zzy(obj, i5) == zzy(obj2, i5);
    }

    private final boolean zzy(Object obj, int i5) {
        int zzm = zzm(i5);
        long j2 = zzm & 1048575;
        if (j2 != 1048575) {
            return (zzsw.zzc(obj, j2) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i5);
        long j5 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j5)) != 0;
            case 2:
                return zzsw.zzd(obj, j5) != 0;
            case 3:
                return zzsw.zzd(obj, j5) != 0;
            case 4:
                return zzsw.zzc(obj, j5) != 0;
            case 5:
                return zzsw.zzd(obj, j5) != 0;
            case 6:
                return zzsw.zzc(obj, j5) != 0;
            case 7:
                return zzsw.zzw(obj, j5);
            case 8:
                Object zzf = zzsw.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzpm) {
                    return !zzpm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j5) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j5));
            case 11:
                return zzsw.zzc(obj, j5) != 0;
            case 12:
                return zzsw.zzc(obj, j5) != 0;
            case 13:
                return zzsw.zzc(obj, j5) != 0;
            case 14:
                return zzsw.zzd(obj, j5) != 0;
            case 15:
                return zzsw.zzc(obj, j5) != 0;
            case 16:
                return zzsw.zzd(obj, j5) != 0;
            case 17:
                return zzsw.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i5, int i6, int i7, int i8) {
        return i6 == 1048575 ? zzy(obj, i5) : (i7 & i8) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i5;
        int zzC;
        int zzD;
        int zzC2;
        int zzd;
        int zzC3;
        int zzi;
        int zzC4;
        int size;
        int zzm;
        int zzC5;
        int zzC6;
        int zzC7;
        int zzf;
        int zzC8;
        int zzC9;
        int i6;
        int zzC10;
        int zzD2;
        zzrt<T> zzrtVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = zzrtVar.zzc;
            if (i8 >= iArr.length) {
                int zza2 = ((zzqm) obj).zzc.zza() + i10;
                if (!zzrtVar.zzf) {
                    return zza2;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int zzc = zzsiVar.zzc();
                int i12 = 0;
                for (int i13 = 0; i13 < zzc; i13++) {
                    Map.Entry zzg = zzsiVar.zzg(i13);
                    i12 += zzqf.zzc((zzqe) ((zzse) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    i12 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return zza2 + i12;
            }
            int zzo = zzrtVar.zzo(i8);
            int zzn = zzn(zzo);
            int i14 = iArr[i8];
            int i15 = iArr[i8 + 2];
            int i16 = i15 & i7;
            if (zzn <= 17) {
                if (i16 != i11) {
                    i9 = i16 == i7 ? 0 : unsafe.getInt(obj2, i16);
                    i11 = i16;
                }
                i5 = 1 << (i15 >>> 20);
            } else {
                i5 = 0;
            }
            int i17 = zzo & i7;
            if (zzn >= zzqg.zzJ.zza()) {
                zzqg.zzW.zza();
            }
            long j2 = i17;
            switch (zzn) {
                case 0:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 4, i10);
                    }
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        long j5 = unsafe.getLong(obj2, j2);
                        zzC = zzpv.zzC(i14 << 3);
                        zzD = zzpv.zzD(j5);
                        i10 += zzD + zzC;
                    }
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        long j6 = unsafe.getLong(obj2, j2);
                        zzC = zzpv.zzC(i14 << 3);
                        zzD = zzpv.zzD(j6);
                        i10 += zzD + zzC;
                    }
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        long j7 = unsafe.getInt(obj2, j2);
                        zzC = zzpv.zzC(i14 << 3);
                        zzD = zzpv.zzD(j7);
                        i10 += zzD + zzC;
                    }
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 8, i10);
                    }
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 4, i10);
                    }
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 1, i10);
                    }
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j2);
                        if (object instanceof zzpm) {
                            zzC2 = zzpv.zzC(i18);
                            zzd = ((zzpm) object).zzd();
                            zzC3 = zzpv.zzC(zzd);
                            i10 += zzC3 + zzd + zzC2;
                        } else {
                            zzC = zzpv.zzC(i18);
                            zzD = zzpv.zzB((String) object);
                            i10 += zzD + zzC;
                        }
                    }
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        zzi = zzsc.zzi(i14, unsafe.getObject(obj2, j2), zzrtVar.zzq(i8));
                        i10 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj2, j2);
                        zzC2 = zzpv.zzC(i14 << 3);
                        zzd = zzpmVar.zzd();
                        zzC3 = zzpv.zzC(zzd);
                        i10 += zzC3 + zzd + zzC2;
                    }
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(unsafe.getInt(obj2, j2), zzpv.zzC(i14 << 3), i10);
                    }
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        long j8 = unsafe.getInt(obj2, j2);
                        zzC = zzpv.zzC(i14 << 3);
                        zzD = zzpv.zzD(j8);
                        i10 += zzD + zzC;
                    }
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 4, i10);
                    }
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        i10 = u.v(i14 << 3, 8, i10);
                    }
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        int i19 = unsafe.getInt(obj2, j2);
                        i10 = u.v((i19 >> 31) ^ (i19 + i19), zzpv.zzC(i14 << 3), i10);
                    }
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        long j9 = unsafe.getLong(obj2, j2);
                        zzC = zzpv.zzC(i14 << 3);
                        zzD = zzpv.zzD((j9 >> 63) ^ (j9 + j9));
                        i10 += zzD + zzC;
                    }
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj2, i8, i11, i9, i5)) {
                        zzi = zzsc.zza(i14, (zzrq) unsafe.getObject(obj2, j2), zzrtVar.zzq(i8));
                        i10 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzi = zzsc.zze(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 19:
                    zzi = zzsc.zzc(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j2);
                    int i20 = zzsc.zza;
                    if (list.size() != 0) {
                        zzC4 = (zzpv.zzC(i14 << 3) * list.size()) + zzsc.zzh(list);
                        i10 += zzC4;
                        break;
                    }
                    zzC4 = 0;
                    i10 += zzC4;
                case zzbgj.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    int i21 = zzsc.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzm = zzsc.zzm(list2);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    int i22 = zzsc.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzm = zzsc.zzg(list3);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 23:
                    zzi = zzsc.zze(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 24:
                    zzi = zzsc.zzc(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    int i23 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzC4 = (zzpv.zzC(i14 << 3) + 1) * size2;
                        i10 += zzC4;
                        break;
                    }
                    zzC4 = 0;
                    i10 += zzC4;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j2);
                    int i24 = zzsc.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzC6 = zzpv.zzC(i14 << 3) * size3;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object zza3 = zzrbVar.zza();
                                if (zza3 instanceof zzpm) {
                                    int zzd2 = ((zzpm) zza3).zzd();
                                    zzC6 = u.v(zzd2, zzd2, zzC6);
                                } else {
                                    zzC6 = zzpv.zzB((String) zza3) + zzC6;
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj3 = list5.get(i26);
                                if (obj3 instanceof zzpm) {
                                    int zzd3 = ((zzpm) obj3).zzd();
                                    zzC6 = u.v(zzd3, zzd3, zzC6);
                                } else {
                                    zzC6 = zzpv.zzB((String) obj3) + zzC6;
                                }
                            }
                        }
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j2);
                    zzsa zzq = zzrtVar.zzq(i8);
                    int i27 = zzsc.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzC7 = 0;
                    } else {
                        zzC7 = zzpv.zzC(i14 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            Object obj4 = list6.get(i28);
                            if (obj4 instanceof zzra) {
                                int zza4 = ((zzra) obj4).zza();
                                zzC7 = u.v(zza4, zza4, zzC7);
                            } else {
                                int zzj = ((zzpa) obj4).zzj(zzq);
                                zzC7 = u.v(zzj, zzj, zzC7);
                            }
                        }
                    }
                    i10 += zzC7;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j2);
                    int i29 = zzsc.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzC6 = zzpv.zzC(i14 << 3) * size5;
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int zzd4 = ((zzpm) list7.get(i30)).zzd();
                            zzC6 = u.v(zzd4, zzd4, zzC6);
                        }
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j2);
                    int i31 = zzsc.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzm = zzsc.zzl(list8);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j2);
                    int i32 = zzsc.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzm = zzsc.zzb(list9);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 31:
                    zzi = zzsc.zzc(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 32:
                    zzi = zzsc.zze(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzi;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j2);
                    int i33 = zzsc.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzm = zzsc.zzj(list10);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j2);
                    int i34 = zzsc.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzm = zzsc.zzk(list11);
                        zzC5 = zzpv.zzC(i14 << 3);
                        zzC6 = (zzC5 * size) + zzm;
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 35:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = zzsc.zzh((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzf = zzsc.zzm((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = zzsc.zzg((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j2);
                    int i35 = zzsc.zza;
                    zzf = list12.size();
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzf = zzsc.zzl((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = zzsc.zzb((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzf = zzsc.zzj((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = zzsc.zzk((List) unsafe.getObject(obj2, j2));
                    if (zzf > 0) {
                        zzC8 = zzpv.zzC(i14 << 3);
                        zzC9 = zzpv.zzC(zzf);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j2);
                    zzsa zzq2 = zzrtVar.zzq(i8);
                    int i36 = zzsc.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i37 = 0; i37 < size6; i37++) {
                            i6 += zzsc.zza(i14, (zzrq) list13.get(i37), zzq2);
                        }
                    }
                    i10 += i6;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj2, j2);
                    zzrj zzrjVar = (zzrj) zzrtVar.zzr(i8);
                    if (!zzrkVar.isEmpty()) {
                        zzC6 = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            zzC6 += zzrjVar.zza(i14, entry2.getKey(), entry2.getValue());
                        }
                        i10 += zzC6;
                        break;
                    }
                    zzC6 = 0;
                    i10 += zzC6;
                case 51:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        long zzp = zzp(obj2, j2);
                        zzC10 = zzpv.zzC(i14 << 3);
                        zzD2 = zzpv.zzD(zzp);
                        i10 += zzD2 + zzC10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        long zzp2 = zzp(obj2, j2);
                        zzC10 = zzpv.zzC(i14 << 3);
                        zzD2 = zzpv.zzD(zzp2);
                        i10 += zzD2 + zzC10;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        long zzl = zzl(obj2, j2);
                        zzC10 = zzpv.zzC(i14 << 3);
                        zzD2 = zzpv.zzD(zzl);
                        i10 += zzD2 + zzC10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        int i38 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j2);
                        if (object2 instanceof zzpm) {
                            zzf = zzpv.zzC(i38);
                            zzC8 = ((zzpm) object2).zzd();
                            zzC9 = zzpv.zzC(zzC8);
                            i10 += zzC9 + zzC8 + zzf;
                            break;
                        } else {
                            zzC10 = zzpv.zzC(i38);
                            zzD2 = zzpv.zzB((String) object2);
                            i10 += zzD2 + zzC10;
                            break;
                        }
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        zzi = zzsc.zzi(i14, unsafe.getObject(obj2, j2), zzrtVar.zzq(i8));
                        i10 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj2, j2);
                        zzf = zzpv.zzC(i14 << 3);
                        zzC8 = zzpmVar2.zzd();
                        zzC9 = zzpv.zzC(zzC8);
                        i10 += zzC9 + zzC8 + zzf;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(zzl(obj2, j2), zzpv.zzC(i14 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        long zzl2 = zzl(obj2, j2);
                        zzC10 = zzpv.zzC(i14 << 3);
                        zzD2 = zzpv.zzD(zzl2);
                        i10 += zzD2 + zzC10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        i10 = u.v(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        int zzl3 = zzl(obj2, j2);
                        i10 = u.v((zzl3 >> 31) ^ (zzl3 + zzl3), zzpv.zzC(i14 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        long zzp3 = zzp(obj2, j2);
                        zzC10 = zzpv.zzC(i14 << 3);
                        zzD2 = zzpv.zzD((zzp3 >> 63) ^ (zzp3 + zzp3));
                        i10 += zzD2 + zzC10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzrtVar.zzC(obj2, i14, i8)) {
                        zzi = zzsc.zza(i14, (zzrq) unsafe.getObject(obj2, j2), zzrtVar.zzq(i8));
                        i10 += zzi;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            obj2 = obj;
            i7 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i5;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int zzc;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i8 >= iArr.length) {
                int hashCode = ((zzqm) obj).zzc.hashCode() + (i9 * 53);
                return this.zzf ? (hashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzo = zzo(i8);
            int i10 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i11 = iArr[i8];
            long j2 = i10;
            int i12 = 37;
            switch (zzn) {
                case 0:
                    i5 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j2));
                    byte[] bArr = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 1:
                    i6 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j2));
                    i9 = floatToIntBits + i6;
                    break;
                case 2:
                    i5 = i9 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j2);
                    byte[] bArr2 = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 3:
                    i5 = i9 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j2);
                    byte[] bArr3 = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 4:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 5:
                    i5 = i9 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j2);
                    byte[] bArr4 = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 6:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 7:
                    i6 = i9 * 53;
                    floatToIntBits = zzqs.zza(zzsw.zzw(obj, j2));
                    i9 = floatToIntBits + i6;
                    break;
                case 8:
                    i6 = i9 * 53;
                    floatToIntBits = ((String) zzsw.zzf(obj, j2)).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object zzf = zzsw.zzf(obj, j2);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i9 = i7 + i12;
                    break;
                case 10:
                    i6 = i9 * 53;
                    floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 11:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 12:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 13:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 14:
                    i5 = i9 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j2);
                    byte[] bArr5 = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 15:
                    i5 = i9 * 53;
                    zzc = zzsw.zzc(obj, j2);
                    i9 = i5 + zzc;
                    break;
                case 16:
                    i5 = i9 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j2);
                    byte[] bArr6 = zzqs.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzc;
                    break;
                case 17:
                    i7 = i9 * 53;
                    Object zzf2 = zzsw.zzf(obj, j2);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i9 = i7 + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbgj.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i6 = i9 * 53;
                    floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 50:
                    i6 = i9 * 53;
                    floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 51:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j2));
                        byte[] bArr7 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j2));
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzp(obj, j2);
                        byte[] bArr8 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzp(obj, j2);
                        byte[] bArr9 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzp(obj, j2);
                        byte[] bArr10 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case 57:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zzqs.zza(zzD(obj, j2));
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = ((String) zzsw.zzf(obj, j2)).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzp(obj, j2);
                        byte[] bArr11 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzc = zzl(obj, j2);
                        i9 = i5 + zzc;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzp(obj, j2);
                        byte[] bArr12 = zzqs.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzc;
                        break;
                    }
                case 68:
                    if (!zzC(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zzsw.zzf(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(f.API_PRIORITY_OTHER);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i5 = 0; i5 < iArr.length; i5 += 3) {
                int zzo = zzo(i5);
                int i6 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j2 = i6;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
                            case 18:
                            case 19:
                            case 20:
                            case zzbgj.zzt.zzm /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzqr) zzsw.zzf(obj, j2)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, iArr[i5], i5)) {
                        zzq(i5).zzd(zzb.getObject(obj, j2));
                    }
                }
                if (zzy(obj, i5)) {
                    zzq(i5).zzd(zzb.getObject(obj, j2));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzo = zzo(i5);
            int i6 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i7 = iArr[i5];
            long j2 = i6;
            switch (zzn) {
                case 0:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzo(obj, j2, zzsw.zza(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzp(obj, j2, zzsw.zzb(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j2, zzsw.zzd(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j2, zzsw.zzd(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j2, zzsw.zzd(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzm(obj, j2, zzsw.zzw(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j2, zzsw.zzf(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i5);
                    break;
                case 10:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j2, zzsw.zzf(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j2, zzsw.zzd(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j2, zzsw.zzc(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i5)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j2, zzsw.zzd(obj2, j2));
                        zzv(obj, i5);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i5);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbgj.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj, j2);
                    zzqr zzqrVar2 = (zzqr) zzsw.zzf(obj2, j2);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.zzd(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    zzsw.zzs(obj, j2, zzqrVar2);
                    break;
                case 50:
                    int i8 = zzsc.zza;
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj, j2);
                    zzrk zzrkVar2 = (zzrk) zzsw.zzf(obj2, j2);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.zze()) {
                            zzrkVar = zzrkVar.zzb();
                        }
                        zzrkVar.zzd(zzrkVar2);
                    }
                    zzsw.zzs(obj, j2, zzrkVar);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzC(obj2, i7, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j2, zzsw.zzf(obj2, j2));
                        zzw(obj, i7, i5);
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    zzu(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i7, i5)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j2, zzsw.zzf(obj2, j2));
                        zzw(obj, i7, i5);
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i5);
                    break;
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zztb zztbVar) {
        Map.Entry entry;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        zzrt<T> zzrtVar = this;
        if (zzrtVar.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (!zzqfVar.zza.isEmpty()) {
                entry = (Map.Entry) zzqfVar.zzf().next();
                iArr = zzrtVar.zzc;
                Unsafe unsafe = zzb;
                int i8 = 1048575;
                int i9 = 1048575;
                i5 = 0;
                int i10 = 0;
                while (i5 < iArr.length) {
                    int zzo = zzrtVar.zzo(i5);
                    int zzn = zzn(zzo);
                    int i11 = iArr[i5];
                    if (zzn <= 17) {
                        int i12 = iArr[i5 + 2];
                        int i13 = i12 & i8;
                        if (i13 != i9) {
                            i10 = i13 == i8 ? 0 : unsafe.getInt(obj, i13);
                            i9 = i13;
                        }
                        i6 = zzo;
                        i7 = 1 << (i12 >>> 20);
                    } else {
                        i6 = zzo;
                        i7 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j2 = i6 & i8;
                    switch (zzn) {
                        case 0:
                            if (!zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                break;
                            } else {
                                zztbVar.zzf(i11, zzsw.zza(obj, j2));
                                continue;
                            }
                        case 1:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzn(i11, zzsw.zzb(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzs(i11, unsafe.getLong(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzJ(i11, unsafe.getLong(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzq(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzl(i11, unsafe.getLong(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzj(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzb(i11, zzsw.zzw(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zzE(i11, unsafe.getObject(obj, j2), zztbVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzv(i11, unsafe.getObject(obj, j2), zzrtVar.zzq(i5));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzd(i11, (zzpm) unsafe.getObject(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzH(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzh(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzx(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzz(i11, unsafe.getLong(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzB(i11, unsafe.getInt(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzD(i11, unsafe.getLong(obj, j2));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zzrtVar.zzz(obj, i5, i9, i10, i7)) {
                                zztbVar.zzp(i11, unsafe.getObject(obj, j2), zzrtVar.zzq(i5));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzsc.zzr(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 19:
                            zzsc.zzv(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 20:
                            zzsc.zzx(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case zzbgj.zzt.zzm /* 21 */:
                            zzsc.zzD(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 22:
                            zzsc.zzw(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 23:
                            zzsc.zzu(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 24:
                            zzsc.zzt(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 25:
                            zzsc.zzq(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 26:
                            int i14 = iArr[i5];
                            List list = (List) unsafe.getObject(obj, j2);
                            int i15 = zzsc.zza;
                            if (list != null && !list.isEmpty()) {
                                zztbVar.zzG(i14, list);
                                break;
                            }
                            break;
                        case 27:
                            int i16 = iArr[i5];
                            List list2 = (List) unsafe.getObject(obj, j2);
                            zzsa zzq = zzrtVar.zzq(i5);
                            int i17 = zzsc.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i18 = 0; i18 < list2.size(); i18++) {
                                    ((zzpw) zztbVar).zzv(i16, list2.get(i18), zzq);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i19 = iArr[i5];
                            List list3 = (List) unsafe.getObject(obj, j2);
                            int i20 = zzsc.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zztbVar.zze(i19, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzsc.zzC(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 30:
                            zzsc.zzs(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 31:
                            zzsc.zzy(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 32:
                            zzsc.zzz(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 33:
                            zzsc.zzA(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 34:
                            zzsc.zzB(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, false);
                            continue;
                        case 35:
                            zzsc.zzr(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 36:
                            zzsc.zzv(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 37:
                            zzsc.zzx(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 38:
                            zzsc.zzD(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 39:
                            zzsc.zzw(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 40:
                            zzsc.zzu(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 41:
                            zzsc.zzt(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 42:
                            zzsc.zzq(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 43:
                            zzsc.zzC(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 44:
                            zzsc.zzs(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 45:
                            zzsc.zzy(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 46:
                            zzsc.zzz(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 47:
                            zzsc.zzA(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 48:
                            zzsc.zzB(iArr[i5], (List) unsafe.getObject(obj, j2), zztbVar, true);
                            break;
                        case 49:
                            int i21 = iArr[i5];
                            List list4 = (List) unsafe.getObject(obj, j2);
                            zzsa zzq2 = zzrtVar.zzq(i5);
                            int i22 = zzsc.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                    ((zzpw) zztbVar).zzp(i21, list4.get(i23), zzq2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                zztbVar.zzu(i11, ((zzrj) zzrtVar.zzr(i5)).zzc(), (zzrk) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzf(i11, zzj(obj, j2));
                                break;
                            }
                            break;
                        case 52:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzn(i11, zzk(obj, j2));
                                break;
                            }
                            break;
                        case 53:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzs(i11, zzp(obj, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzJ(i11, zzp(obj, j2));
                                break;
                            }
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzq(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzl(i11, zzp(obj, j2));
                                break;
                            }
                            break;
                        case 57:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzj(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 58:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzb(i11, zzD(obj, j2));
                                break;
                            }
                            break;
                        case 59:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zzE(i11, unsafe.getObject(obj, j2), zztbVar);
                                break;
                            }
                            break;
                        case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzv(i11, unsafe.getObject(obj, j2), zzrtVar.zzq(i5));
                                break;
                            }
                            break;
                        case 61:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzd(i11, (zzpm) unsafe.getObject(obj, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzH(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzh(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzx(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 65:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzz(i11, zzp(obj, j2));
                                break;
                            }
                            break;
                        case 66:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzB(i11, zzl(obj, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzD(i11, zzp(obj, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (zzrtVar.zzC(obj, i11, i5)) {
                                zztbVar.zzp(i11, unsafe.getObject(obj, j2), zzrtVar.zzq(i5));
                                break;
                            }
                            break;
                    }
                    i5 += 3;
                    i8 = 1048575;
                    zzrtVar = this;
                }
                if (entry != null) {
                    zzsq zzsqVar = ((zzqm) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzrtVar.zzc;
        Unsafe unsafe2 = zzb;
        int i82 = 1048575;
        int i92 = 1048575;
        i5 = 0;
        int i102 = 0;
        while (i5 < iArr.length) {
        }
        if (entry != null) {
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzo = zzo(i5);
            long j2 = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i5) && Double.doubleToLongBits(zzsw.zza(obj, j2)) == Double.doubleToLongBits(zzsw.zza(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i5) && Float.floatToIntBits(zzsw.zzb(obj, j2)) == Float.floatToIntBits(zzsw.zzb(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i5) && zzsw.zzd(obj, j2) == zzsw.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i5) && zzsw.zzd(obj, j2) == zzsw.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i5) && zzsw.zzd(obj, j2) == zzsw.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i5) && zzsw.zzw(obj, j2) == zzsw.zzw(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i5) && zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i5) && zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i5) && zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i5) && zzsw.zzd(obj, j2) == zzsw.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i5) && zzsw.zzc(obj, j2) == zzsw.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i5) && zzsw.zzd(obj, j2) == zzsw.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i5) && zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case zzbgj.zzt.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzE = zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2));
                    break;
                case 50:
                    zzE = zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzm = zzm(i5) & 1048575;
                    if (zzsw.zzc(obj, zzm) == zzsw.zzc(obj2, zzm) && zzsc.zzE(zzsw.zzf(obj, j2), zzsw.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(Object obj) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i9 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i11 = iArr[i9];
            int i12 = iArr2[i11];
            int zzo = zzo(i11);
            int i13 = iArr2[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i10) {
                if (i14 != 1048575) {
                    i8 = zzb.getInt(obj, i14);
                }
                i6 = i11;
                i7 = i8;
                i5 = i14;
            } else {
                int i16 = i8;
                i5 = i10;
                i6 = i11;
                i7 = i16;
            }
            if ((268435456 & zzo) != 0 && !zzz(obj, i6, i5, i7, i15)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i12, i6) && !zzA(obj, zzo, zzq(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn != 50) {
                            continue;
                        } else {
                            zzrk zzrkVar = (zzrk) zzsw.zzf(obj, zzo & 1048575);
                            if (!zzrkVar.isEmpty() && ((zzrj) zzr(i6)).zzc().zzb.zzb() == zzta.MESSAGE) {
                                zzsa zzsaVar = null;
                                for (Object obj2 : zzrkVar.values()) {
                                    if (zzsaVar == null) {
                                        zzsaVar = zzrx.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzsaVar.zzh(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzsw.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsa zzq = zzq(i6);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzq.zzh(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i6, i5, i7, i15) && !zzA(obj, zzo, zzq(i6))) {
                return false;
            }
            i9++;
            i10 = i5;
            i8 = i7;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
