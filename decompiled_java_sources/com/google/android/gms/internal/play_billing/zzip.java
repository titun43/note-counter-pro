package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbgj;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i5, int i6, zzim zzimVar, boolean z4, int[] iArr2, int i7, int i8, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i6;
        boolean z5 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i7;
        this.zzk = i8;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i5) {
        if (zzI(obj2, i5)) {
            int zzs = zzs(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i5);
            if (!zzI(obj, i5)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzD(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i5) {
        int i6 = this.zzc[i5];
        if (zzM(obj2, i6, i5)) {
            int zzs = zzs(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i5] + " is present but null: " + obj2.toString());
            }
            zzix zzv = zzv(i5);
            if (!zzM(obj, i6, i5)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzE(obj, i6, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i5) {
        int zzp = zzp(i5);
        long j2 = 1048575 & zzp;
        if (j2 == 1048575) {
            return;
        }
        zzjq.zzq(obj, j2, (1 << (zzp >>> 20)) | zzjq.zzc(obj, j2));
    }

    private final void zzE(Object obj, int i5, int i6) {
        zzjq.zzq(obj, zzp(i6) & 1048575, i5);
    }

    private final void zzF(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzs(i5) & 1048575, obj2);
        zzD(obj, i5);
    }

    private final void zzG(Object obj, int i5, int i6, Object obj2) {
        zzb.putObject(obj, zzs(i6) & 1048575, obj2);
        zzE(obj, i5, i6);
    }

    private final boolean zzH(Object obj, Object obj2, int i5) {
        return zzI(obj, i5) == zzI(obj2, i5);
    }

    private final boolean zzI(Object obj, int i5) {
        int zzp = zzp(i5);
        long j2 = zzp & 1048575;
        if (j2 != 1048575) {
            return (zzjq.zzc(obj, j2) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i5);
        long j5 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzjq.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzjq.zzb(obj, j5)) != 0;
            case 2:
                return zzjq.zzd(obj, j5) != 0;
            case 3:
                return zzjq.zzd(obj, j5) != 0;
            case 4:
                return zzjq.zzc(obj, j5) != 0;
            case 5:
                return zzjq.zzd(obj, j5) != 0;
            case 6:
                return zzjq.zzc(obj, j5) != 0;
            case 7:
                return zzjq.zzw(obj, j5);
            case 8:
                Object zzf = zzjq.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzgk) {
                    return !zzgk.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzjq.zzf(obj, j5) != null;
            case 10:
                return !zzgk.zzb.equals(zzjq.zzf(obj, j5));
            case 11:
                return zzjq.zzc(obj, j5) != 0;
            case 12:
                return zzjq.zzc(obj, j5) != 0;
            case 13:
                return zzjq.zzc(obj, j5) != 0;
            case 14:
                return zzjq.zzd(obj, j5) != 0;
            case 15:
                return zzjq.zzc(obj, j5) != 0;
            case 16:
                return zzjq.zzd(obj, j5) != 0;
            case 17:
                return zzjq.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i5, int i6, int i7, int i8) {
        return i6 == 1048575 ? zzI(obj, i5) : (i7 & i8) != 0;
    }

    private static boolean zzK(Object obj, int i5, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i5 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i5, int i6) {
        return zzjq.zzc(obj, (long) (zzp(i6) & 1048575)) == i5;
    }

    private static boolean zzN(Object obj, long j2) {
        return ((Boolean) zzjq.zzf(obj, j2)).booleanValue();
    }

    private static final void zzO(int i5, Object obj, zzjw zzjwVar) {
        if (obj instanceof String) {
            zzjwVar.zzG(i5, (String) obj);
        } else {
            zzjwVar.zzd(i5, (zzgk) obj);
        }
    }

    public static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzf = zzjk.zzf();
        zzhkVar.zzc = zzf;
        return zzf;
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
    public static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
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
        Field zzz;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i34;
        char charAt11;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar = (zziw) zzijVar;
        String zzd = zziwVar.zzd();
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
        Object[] zze = zziwVar.zze();
        Class<?> cls2 = zziwVar.zza().getClass();
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
            zziw zziwVar2 = zziwVar;
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
                        if (zziwVar2.zzc() == 1 || i83 != 0) {
                            i32 = i10 + 1;
                            int i91 = i73 / 3;
                            objArr[i91 + i91 + 1] = zze[i10];
                        } else {
                            i33 = 0;
                            int i92 = charAt25 + charAt25;
                            obj = zze[i92];
                            int i93 = i33;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i92] = zzz2;
                            }
                            int i94 = i11;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i95 = i92 + 1;
                            obj2 = zze[i95];
                            i23 = i94;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i95] = zzz3;
                            }
                            i25 = (int) unsafe.objectFieldOffset(zzz3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i952 = i922 + 1;
                    obj2 = zze[i952];
                    i23 = i942;
                    if (obj2 instanceof Field) {
                    }
                    i25 = (int) unsafe.objectFieldOffset(zzz3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i9522 = i9222 + 1;
                obj2 = zze[i9522];
                i23 = i9422;
                if (obj2 instanceof Field) {
                }
                i25 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i27 = i9322;
                i21 = i88;
                i26 = 0;
                c5 = 55296;
            } else {
                i22 = length;
                i23 = i11;
                int i96 = i10 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i10]);
                if (i82 == 9 || i82 == 17) {
                    i24 = i96;
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = zzz4.getType();
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
                        if (zziwVar2.zzc() == 1 || i83 != 0) {
                            i10 += 2;
                            int i98 = i73 / 3;
                            objArr[i98 + i98 + 1] = zze[i96];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i102] = zzz;
                                }
                                i26 = charAt26 % 32;
                                i21 = i28;
                                c5 = 55296;
                                i25 = (int) unsafe.objectFieldOffset(zzz);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
            zziwVar = zziwVar2;
            length = i22;
            i11 = i23;
        }
        return new zzip(iArr3, objArr, i6, i8, zziwVar.zza(), false, iArr, i9, i68, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zzjq.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zzjq.zzf(obj, j2)).floatValue();
    }

    private static int zzo(Object obj, long j2) {
        return ((Integer) zzjq.zzf(obj, j2)).intValue();
    }

    private final int zzp(int i5) {
        return this.zzc[i5 + 2];
    }

    private final int zzq(int i5, int i6) {
        int length = (this.zzc.length / 3) - 1;
        while (i6 <= length) {
            int i7 = (length + i6) >>> 1;
            int i8 = i7 * 3;
            int i9 = this.zzc[i8];
            if (i5 == i9) {
                return i8;
            }
            if (i5 < i9) {
                length = i7 - 1;
            } else {
                i6 = i7 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzs(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzt(Object obj, long j2) {
        return ((Long) zzjq.zzf(obj, j2)).longValue();
    }

    private final zzhm zzu(int i5) {
        int i6 = i5 / 3;
        return (zzhm) this.zzd[i6 + i6 + 1];
    }

    private final zzix zzv(int i5) {
        Object[] objArr = this.zzd;
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        zzix zzixVar = (zzix) objArr[i7];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzb2 = zziu.zza().zzb((Class) objArr[i7 + 1]);
        this.zzd[i7] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i5) {
        int i6 = i5 / 3;
        return this.zzd[i6 + i6];
    }

    private final Object zzx(Object obj, int i5) {
        zzix zzv = zzv(i5);
        int zzs = zzs(i5) & 1048575;
        if (!zzI(obj, i5)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i5, int i6) {
        zzix zzv = zzv(i6);
        if (!zzM(obj, i5, i6)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i6) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int i5;
        int zzz;
        int zzA;
        int zzz2;
        int zzd;
        int zzz3;
        int zzh;
        int zzz4;
        int size;
        int zzl;
        int zzz5;
        int zzd2;
        boolean z4;
        int zzb2;
        int i6;
        int zzz6;
        int zzz7;
        int size2;
        int zzk;
        int zzz8;
        int size3;
        int zzi;
        int zzz9;
        int i7;
        int zze;
        int zzz10;
        int zzz11;
        int zzz12;
        int zzA2;
        zzip<T> zzipVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < zzipVar.zzc.length) {
            int zzs = zzipVar.zzs(i10);
            int zzr = zzr(zzs);
            int[] iArr = zzipVar.zzc;
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i8;
            if (zzr <= 17) {
                if (i15 != i9) {
                    i11 = i15 == i8 ? 0 : unsafe.getInt(obj2, i15);
                    i9 = i15;
                }
                i5 = 1 << (i14 >>> 20);
            } else {
                i5 = 0;
            }
            int i16 = zzs & i8;
            if (zzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            long j2 = i16;
            switch (zzr) {
                case 0:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 1:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 2:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        long j5 = unsafe.getLong(obj2, j2);
                        zzz = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j5);
                        i12 += zzA + zzz;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 3:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        long j6 = unsafe.getLong(obj2, j2);
                        zzz = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j6);
                        i12 += zzA + zzz;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 4:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        long j7 = unsafe.getInt(obj2, j2);
                        zzz = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j7);
                        i12 += zzA + zzz;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 5:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 6:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 7:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 1, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 8:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(obj2, j2);
                        if (object instanceof zzgk) {
                            zzz2 = zzgr.zzz(i17);
                            zzd = ((zzgk) object).zzd();
                            zzz3 = zzgr.zzz(zzd);
                            i12 += zzz3 + zzd + zzz2;
                        } else {
                            zzz = zzgr.zzz(i17);
                            zzA = zzgr.zzy((String) object);
                            i12 += zzA + zzz;
                        }
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 9:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        zzh = zziz.zzh(i13, unsafe.getObject(obj2, j2), zzipVar.zzv(i10));
                        i12 += zzh;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                case 10:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj2, j2);
                        zzz2 = zzgr.zzz(i13 << 3);
                        zzd = zzgkVar.zzd();
                        zzz3 = zzgr.zzz(zzd);
                        i12 += zzz3 + zzd + zzz2;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 11:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(unsafe.getInt(obj2, j2), zzgr.zzz(i13 << 3), i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 12:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        long j8 = unsafe.getInt(obj2, j2);
                        zzz = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA(j8);
                        i12 += zzA + zzz;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 13:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 14:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 15:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        int i18 = unsafe.getInt(obj2, j2);
                        i12 = u.z((i18 >> 31) ^ (i18 + i18), zzgr.zzz(i13 << 3), i12);
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 16:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        long j9 = unsafe.getLong(obj2, j2);
                        zzz = zzgr.zzz(i13 << 3);
                        zzA = zzgr.zzA((j9 >> 63) ^ (j9 + j9));
                        i12 += zzA + zzz;
                    }
                    zzipVar = this;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 17:
                    if (zzipVar.zzJ(obj2, i10, i9, i11, i5)) {
                        i12 += zzgr.zzw(i13, (zzim) unsafe.getObject(obj2, j2), zzipVar.zzv(i10));
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 18:
                    zzh = zziz.zzd(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzh;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 19:
                    zzh = zziz.zzb(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzh;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j2);
                    int i19 = zziz.zza;
                    if (list.size() != 0) {
                        zzz4 = (zzgr.zzz(i13 << 3) * list.size()) + zziz.zzg(list);
                        i12 += zzz4;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzz4 = 0;
                    i12 += zzz4;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case zzbgj.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    int i20 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zziz.zzl(list2);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz4 = (zzz5 * size) + zzl;
                        i12 += zzz4;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzz4 = 0;
                    i12 += zzz4;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    int i21 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zziz.zzf(list3);
                        zzz5 = zzgr.zzz(i13 << 3);
                        zzz4 = (zzz5 * size) + zzl;
                        i12 += zzz4;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzz4 = 0;
                    i12 += zzz4;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 23:
                    zzd2 = zziz.zzd(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzd2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 24:
                    z4 = false;
                    zzb2 = zziz.zzb(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzb2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    int i22 = zziz.zza;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        zzd2 = size4 * (zzgr.zzz(i13 << 3) + 1);
                        i12 += zzd2;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzd2 = 0;
                    i12 += zzd2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j2);
                    int i23 = zziz.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        i6 = 0;
                    } else {
                        int zzz13 = zzgr.zzz(i13 << 3) * size5;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            i6 = zzz13;
                            for (int i24 = 0; i24 < size5; i24++) {
                                Object zzc = zzhyVar.zzc();
                                if (zzc instanceof zzgk) {
                                    int zzd3 = ((zzgk) zzc).zzd();
                                    i6 = u.z(zzd3, zzd3, i6);
                                } else {
                                    i6 = zzgr.zzy((String) zzc) + i6;
                                }
                            }
                        } else {
                            i6 = zzz13;
                            for (int i25 = 0; i25 < size5; i25++) {
                                Object obj3 = list5.get(i25);
                                if (obj3 instanceof zzgk) {
                                    int zzd4 = ((zzgk) obj3).zzd();
                                    i6 = u.z(zzd4, zzd4, i6);
                                } else {
                                    i6 = zzgr.zzy((String) obj3) + i6;
                                }
                            }
                        }
                    }
                    i12 += i6;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j2);
                    zzix zzv = zzipVar.zzv(i10);
                    int i26 = zziz.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        zzz6 = 0;
                    } else {
                        zzz6 = zzgr.zzz(i13 << 3) * size6;
                        for (int i27 = 0; i27 < size6; i27++) {
                            Object obj4 = list6.get(i27);
                            if (obj4 instanceof zzhx) {
                                int zza2 = ((zzhx) obj4).zza();
                                zzz6 = u.z(zza2, zza2, zzz6);
                            } else {
                                zzz6 = zzgr.zzx((zzim) obj4, zzv) + zzz6;
                            }
                        }
                    }
                    i12 += zzz6;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j2);
                    int i28 = zziz.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        zzz7 = 0;
                    } else {
                        zzz7 = zzgr.zzz(i13 << 3) * size7;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzd5 = ((zzgk) list7.get(i29)).zzd();
                            zzz7 = u.z(zzd5, zzd5, zzz7);
                        }
                    }
                    i12 += zzz7;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j2);
                    int i30 = zziz.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zziz.zzk(list8);
                        zzz8 = zzgr.zzz(i13 << 3);
                        zzd2 = zzk + (zzz8 * size2);
                        i12 += zzd2;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzd2 = 0;
                    i12 += zzd2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j2);
                    int i31 = zziz.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zziz.zza(list9);
                        zzz8 = zzgr.zzz(i13 << 3);
                        zzd2 = zzk + (zzz8 * size2);
                        i12 += zzd2;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    zzd2 = 0;
                    i12 += zzd2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 31:
                    zzd2 = zziz.zzb(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzd2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 32:
                    z4 = false;
                    zzb2 = zziz.zzd(i13, (List) unsafe.getObject(obj2, j2), false);
                    i12 += zzb2;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j2);
                    int i32 = zziz.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zzi = zziz.zzi(list10);
                        zzz9 = zzgr.zzz(i13 << 3);
                        i7 = (zzz9 * size3) + zzi;
                        i12 += i7;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    i7 = 0;
                    i12 += i7;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j2);
                    int i33 = zziz.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        zzi = zziz.zzj(list11);
                        zzz9 = zzgr.zzz(i13 << 3);
                        i7 = (zzz9 * size3) + zzi;
                        i12 += i7;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    i7 = 0;
                    i12 += i7;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 35:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 36:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 37:
                    zze = zziz.zzg((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 38:
                    zze = zziz.zzl((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 39:
                    zze = zziz.zzf((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 40:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 41:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j2);
                    int i34 = zziz.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 43:
                    zze = zziz.zzk((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 44:
                    zze = zziz.zza((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 45:
                    zze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 46:
                    zze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 47:
                    zze = zziz.zzi((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 48:
                    zze = zziz.zzj((List) unsafe.getObject(obj2, j2));
                    if (zze > 0) {
                        zzz10 = zzgr.zzz(i13 << 3);
                        zzz11 = zzgr.zzz(zze);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j2);
                    zzix zzv2 = zzipVar.zzv(i10);
                    int i35 = zziz.zza;
                    int size8 = list13.size();
                    if (size8 != 0) {
                        int i36 = 0;
                        for (int i37 = 0; i37 < size8; i37++) {
                            i36 += zzgr.zzw(i13, (zzim) list13.get(i37), zzv2);
                        }
                        i7 = i36;
                        i12 += i7;
                        i10 += 3;
                        obj2 = obj;
                        i8 = 1048575;
                    }
                    i7 = 0;
                    i12 += i7;
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj2, j2);
                    if (!zzigVar.isEmpty()) {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 51:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 52:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 53:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        long zzt = zzt(obj2, j2);
                        zzz12 = zzgr.zzz(i13 << 3);
                        zzA2 = zzgr.zzA(zzt);
                        i12 += zzA2 + zzz12;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 54:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        long zzt2 = zzt(obj2, j2);
                        zzz12 = zzgr.zzz(i13 << 3);
                        zzA2 = zzgr.zzA(zzt2);
                        i12 += zzA2 + zzz12;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        long zzo = zzo(obj2, j2);
                        zzz12 = zzgr.zzz(i13 << 3);
                        zzA2 = zzgr.zzA(zzo);
                        i12 += zzA2 + zzz12;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 56:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 57:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 58:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 1, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 59:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        int i38 = i13 << 3;
                        Object object2 = unsafe.getObject(obj2, j2);
                        if (object2 instanceof zzgk) {
                            zze = zzgr.zzz(i38);
                            zzz10 = ((zzgk) object2).zzd();
                            zzz11 = zzgr.zzz(zzz10);
                            i12 += zzz11 + zzz10 + zze;
                        } else {
                            zzz12 = zzgr.zzz(i38);
                            zzA2 = zzgr.zzy((String) object2);
                            i12 += zzA2 + zzz12;
                        }
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        zzd2 = zziz.zzh(i13, unsafe.getObject(obj2, j2), zzipVar.zzv(i10));
                        i12 += zzd2;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 61:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj2, j2);
                        zze = zzgr.zzz(i13 << 3);
                        zzz10 = zzgkVar2.zzd();
                        zzz11 = zzgr.zzz(zzz10);
                        i12 += zzz11 + zzz10 + zze;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 62:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(zzo(obj2, j2), zzgr.zzz(i13 << 3), i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 63:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        long zzo2 = zzo(obj2, j2);
                        zzz12 = zzgr.zzz(i13 << 3);
                        zzA2 = zzgr.zzA(zzo2);
                        i12 += zzA2 + zzz12;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 64:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 65:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 = u.z(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 66:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        int zzo3 = zzo(obj2, j2);
                        i12 = u.z((zzo3 >> 31) ^ (zzo3 + zzo3), zzgr.zzz(i13 << 3), i12);
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 67:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        long zzt3 = zzt(obj2, j2);
                        zzz12 = zzgr.zzz(i13 << 3);
                        zzA2 = zzgr.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        i12 += zzA2 + zzz12;
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                case 68:
                    if (zzipVar.zzM(obj2, i13, i10)) {
                        i12 += zzgr.zzw(i13, (zzim) unsafe.getObject(obj2, j2), zzipVar.zzv(i10));
                    }
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
                default:
                    i10 += 3;
                    obj2 = obj;
                    i8 = 1048575;
            }
        }
        int i39 = 0;
        int zza3 = ((zzhk) obj).zzc.zza() + i12;
        if (!zzipVar.zzh) {
            return zza3;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int zzc2 = zzhbVar.zza.zzc();
        for (int i40 = 0; i40 < zzc2; i40++) {
            Map.Entry zzg = zzhbVar.zza.zzg(i40);
            i39 += zzhb.zzb((zzha) ((zzjb) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            i39 += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i39;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i5;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int zzc;
        int i7;
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzs = zzs(i9);
            int[] iArr = this.zzc;
            int i10 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i11 = iArr[i9];
            long j2 = i10;
            int i12 = 37;
            switch (zzr) {
                case 0:
                    i5 = i8 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j2));
                    byte[] bArr = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 1:
                    i6 = i8 * 53;
                    floatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j2));
                    i8 = floatToIntBits + i6;
                    break;
                case 2:
                    i5 = i8 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr2 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 3:
                    i5 = i8 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr3 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 4:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 5:
                    i5 = i8 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr4 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 6:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 7:
                    i6 = i8 * 53;
                    floatToIntBits = zzhp.zza(zzjq.zzw(obj, j2));
                    i8 = floatToIntBits + i6;
                    break;
                case 8:
                    i6 = i8 * 53;
                    floatToIntBits = ((String) zzjq.zzf(obj, j2)).hashCode();
                    i8 = floatToIntBits + i6;
                    break;
                case 9:
                    i7 = i8 * 53;
                    Object zzf = zzjq.zzf(obj, j2);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i8 = i7 + i12;
                    break;
                case 10:
                    i6 = i8 * 53;
                    floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i8 = floatToIntBits + i6;
                    break;
                case 11:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 12:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 13:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 14:
                    i5 = i8 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr5 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 15:
                    i5 = i8 * 53;
                    zzc = zzjq.zzc(obj, j2);
                    i8 = i5 + zzc;
                    break;
                case 16:
                    i5 = i8 * 53;
                    doubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr6 = zzhp.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i8 = i5 + zzc;
                    break;
                case 17:
                    i7 = i8 * 53;
                    Object zzf2 = zzjq.zzf(obj, j2);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i8 = i7 + i12;
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
                    i6 = i8 * 53;
                    floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i8 = floatToIntBits + i6;
                    break;
                case 50:
                    i6 = i8 * 53;
                    floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i8 = floatToIntBits + i6;
                    break;
                case 51:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j2));
                        byte[] bArr7 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j2));
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr8 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr9 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr10 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = zzhp.zza(zzN(obj, j2));
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = ((String) zzjq.zzf(obj, j2)).hashCode();
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr11 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        zzc = zzo(obj, j2);
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i11, i9)) {
                        i5 = i8 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr12 = zzhp.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i8 = i5 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i11, i9)) {
                        i6 = i8 * 53;
                        floatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i8 = floatToIntBits + i6;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzhk) obj).zzc.hashCode() + (i8 * 53);
        return this.zzh ? (hashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0eb0, code lost:
    
        if (r9 == 1048575) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0eb2, code lost:
    
        r20.putInt(r2, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0eb8, code lost:
    
        r1 = r12.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0ebc, code lost:
    
        if (r1 >= r12.zzk) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ebe, code lost:
    
        r3 = r12.zzi;
        r6 = r12.zzc;
        r3 = r3[r1];
        r6 = r6[r3];
        r6 = com.google.android.gms.internal.play_billing.zzjq.zzf(r2, r12.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ed4, code lost:
    
        if (r6 != null) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0edb, code lost:
    
        if (r12.zzu(r3) != null) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ee0, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzig) r6;
        r0 = (com.google.android.gms.internal.play_billing.zzif) r12.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ee8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0edd, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0eeb, code lost:
    
        if (r0 != 0) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0eed, code lost:
    
        if (r5 != r4) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0ef5, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0efa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0ef6, code lost:
    
        if (r5 > r4) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0ef8, code lost:
    
        if (r15 != r0) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f00, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0e2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0e43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0e4a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i5, int i6, int i7, zzfz zzfzVar) {
        zzip<T> zzipVar;
        Unsafe unsafe;
        int i8;
        int zzq;
        zzfz zzfzVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj2;
        byte[] bArr2;
        int i13;
        int i14;
        int i15;
        int zzg;
        int i16;
        int i17;
        Unsafe unsafe2;
        Object obj3;
        zzfz zzfzVar3;
        int i18;
        int i19;
        int i20;
        byte[] bArr3;
        int i21;
        int i22;
        int i23;
        int i24;
        zzfz zzfzVar4;
        int i25;
        Unsafe unsafe3;
        Object obj4;
        byte[] bArr4;
        Object obj5;
        int i26;
        int zzh;
        int i27;
        int i28;
        int i29;
        byte[] bArr5;
        int i30;
        int i31;
        zzfz zzfzVar5;
        int i32;
        int i33;
        int i34;
        zzfz zzfzVar6;
        int i35;
        int i36;
        int i37;
        int zzh2;
        int i38;
        int i39;
        int i40;
        zzho zzhoVar;
        int zzj;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int zzh3;
        int zzh4;
        int i46;
        int i47;
        int i48;
        byte[] bArr6;
        int i49;
        zzip<T> zzipVar2 = this;
        Object obj6 = obj;
        byte[] bArr7 = bArr;
        int i50 = i6;
        zzfz zzfzVar7 = zzfzVar;
        zzA(obj6);
        Unsafe unsafe4 = zzb;
        int i51 = 0;
        int i52 = -1;
        int i53 = i5;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = -1;
        int i58 = 1048575;
        while (true) {
            if (i53 < i50) {
                int i59 = i53 + 1;
                int i60 = bArr7[i53];
                if (i60 < 0) {
                    i59 = zzga.zzi(i60, bArr7, i59, zzfzVar7);
                    i60 = zzfzVar7.zza;
                }
                int i61 = i59;
                i56 = i60;
                int i62 = i56 >>> 3;
                if (i62 > i57) {
                    int i63 = i54 / 3;
                    if (i62 >= zzipVar2.zze && i62 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i62, i63);
                        if (zzq != i52) {
                            zzfzVar2 = zzfzVar;
                            zzipVar = zzipVar2;
                            unsafe = unsafe4;
                            i9 = i58;
                            i54 = i51;
                            i10 = i54;
                            i11 = i55;
                            i12 = i56;
                            i8 = i7;
                            obj2 = obj6;
                            bArr2 = bArr7;
                            i13 = i62;
                            i14 = i61;
                        } else {
                            int i64 = i56 & 7;
                            int[] iArr = zzipVar2.zzc;
                            int i65 = iArr[zzq + 1];
                            int zzr = zzr(i65);
                            long j2 = i65 & 1048575;
                            if (zzr <= 17) {
                                int i66 = iArr[zzq + 2];
                                int i67 = 1 << (i66 >>> 20);
                                int i68 = i66 & 1048575;
                                if (i68 != i58) {
                                    int i69 = 1048575;
                                    i16 = zzr;
                                    if (i58 != 1048575) {
                                        unsafe4.putInt(obj6, i58, i55);
                                        i69 = 1048575;
                                    }
                                    int i70 = i68 == i69 ? 0 : unsafe4.getInt(obj6, i68);
                                    i17 = i68;
                                    i55 = i70;
                                } else {
                                    i16 = zzr;
                                    i17 = i58;
                                }
                                switch (i16) {
                                    case 0:
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i23 = i55;
                                        i24 = i56;
                                        obj2 = obj6;
                                        i25 = i61;
                                        if (i64 != 1) {
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i53 = i25 + 8;
                                            i55 = i23 | i67;
                                            zzjq.zzo(obj2, j2, Double.longBitsToDouble(zzga.zzn(bArr3, i25)));
                                            i58 = i22;
                                            i50 = i6;
                                            bArr7 = bArr3;
                                            i54 = i21;
                                            zzfzVar7 = zzfzVar4;
                                            i57 = i19;
                                            obj6 = obj2;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 1:
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i23 = i55;
                                        i24 = i56;
                                        obj2 = obj6;
                                        i25 = i61;
                                        if (i64 != 5) {
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i53 = i25 + 4;
                                            i55 = i23 | i67;
                                            zzjq.zzp(obj2, j2, Float.intBitsToFloat(zzga.zzb(bArr3, i25)));
                                            i58 = i22;
                                            i50 = i6;
                                            bArr7 = bArr3;
                                            i54 = i21;
                                            zzfzVar7 = zzfzVar4;
                                            i57 = i19;
                                            obj6 = obj2;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 2:
                                    case 3:
                                        unsafe3 = unsafe4;
                                        obj4 = obj6;
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        i25 = i61;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 0) {
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 = i23 | i67;
                                            int zzk = zzga.zzk(bArr3, i25, zzfzVar4);
                                            obj6 = obj4;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj6, j2, zzfzVar4.zzb);
                                            i58 = i22;
                                            i50 = i6;
                                            bArr7 = bArr3;
                                            i53 = zzk;
                                            i54 = i21;
                                            zzfzVar7 = zzfzVar4;
                                            i57 = i19;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 4:
                                    case 11:
                                        unsafe3 = unsafe4;
                                        obj4 = obj6;
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        i25 = i61;
                                        bArr3 = bArr;
                                        zzfzVar4 = zzfzVar;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 0) {
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 = i23 | i67;
                                            i53 = zzga.zzh(bArr3, i25, zzfzVar4);
                                            unsafe3.putInt(obj4, j2, zzfzVar4.zza);
                                            i50 = i6;
                                            obj6 = obj4;
                                            bArr7 = bArr3;
                                            unsafe4 = unsafe3;
                                            i54 = i21;
                                            zzfzVar7 = zzfzVar4;
                                            i57 = i19;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                            i58 = i22;
                                        }
                                    case 5:
                                    case 14:
                                        unsafe3 = unsafe4;
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        Object obj7 = obj6;
                                        i25 = i61;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 1) {
                                            bArr3 = bArr;
                                            obj4 = obj7;
                                            zzfzVar4 = zzfzVar;
                                            obj2 = obj4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            int i71 = i25 + 8;
                                            int i72 = i23 | i67;
                                            long zzn = zzga.zzn(bArr, i25);
                                            zzfzVar4 = zzfzVar;
                                            obj6 = obj7;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj6, j2, zzn);
                                            i58 = i22;
                                            i50 = i6;
                                            bArr7 = bArr;
                                            i53 = i71;
                                            i54 = i21;
                                            i55 = i72;
                                            zzfzVar7 = zzfzVar4;
                                            i57 = i19;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 6:
                                    case 13:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i21 = zzq;
                                        i22 = i17;
                                        i19 = i62;
                                        bArr4 = bArr;
                                        obj5 = obj6;
                                        i25 = i61;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 5) {
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i53 = i25 + 4;
                                            i26 = i23 | i67;
                                            unsafe3.putInt(obj5, j2, zzga.zzb(bArr4, i25));
                                            i50 = i6;
                                            i55 = i26;
                                            obj6 = obj5;
                                            i54 = i21;
                                            i57 = i19;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                            bArr7 = bArr4;
                                            unsafe4 = unsafe3;
                                            i58 = i22;
                                        }
                                    case 7:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i22 = i17;
                                        i19 = i62;
                                        bArr4 = bArr;
                                        int i73 = zzq;
                                        obj5 = obj6;
                                        i25 = i61;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 0) {
                                            i21 = i73;
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i26 = i23 | i67;
                                            i53 = zzga.zzk(bArr4, i25, zzfzVar7);
                                            i21 = i73;
                                            zzjq.zzm(obj5, j2, zzfzVar7.zzb != 0);
                                            i50 = i6;
                                            i55 = i26;
                                            obj6 = obj5;
                                            i54 = i21;
                                            i57 = i19;
                                            i56 = i24;
                                            i51 = 0;
                                            i52 = -1;
                                            bArr7 = bArr4;
                                            unsafe4 = unsafe3;
                                            i58 = i22;
                                        }
                                    case 8:
                                        zzfzVar7 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        i22 = i17;
                                        i19 = i62;
                                        int i74 = zzq;
                                        Object obj8 = obj6;
                                        i25 = i61;
                                        i23 = i55;
                                        i24 = i56;
                                        if (i64 != 2) {
                                            obj2 = obj8;
                                            i21 = i74;
                                            bArr3 = bArr;
                                            zzfzVar4 = zzfzVar7;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            if ((i65 & 536870912) != 0) {
                                                int i75 = i23 | i67;
                                                zzh = zzga.zzh(bArr, i25, zzfzVar7);
                                                int i76 = zzfzVar7.zza;
                                                if (i76 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i76 == 0) {
                                                    zzfzVar7.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                                    i27 = i75;
                                                    i51 = 0;
                                                } else {
                                                    int i77 = zzjt.zza;
                                                    int length = bArr.length;
                                                    if ((((length - zzh) - i76) | zzh | i76) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh), Integer.valueOf(i76)));
                                                    }
                                                    int i78 = zzh + i76;
                                                    char[] cArr = new char[i76];
                                                    int i79 = 0;
                                                    while (zzh < i78) {
                                                        byte b2 = bArr[zzh];
                                                        if (zzjr.zzd(b2)) {
                                                            zzh++;
                                                            cArr[i79] = (char) b2;
                                                            i79++;
                                                        } else {
                                                            while (zzh < i78) {
                                                                int i80 = zzh + 1;
                                                                int i81 = zzh;
                                                                byte b5 = bArr[i81];
                                                                if (zzjr.zzd(b5)) {
                                                                    int i82 = i79 + 1;
                                                                    cArr[i79] = (char) b5;
                                                                    zzh = i80;
                                                                    while (true) {
                                                                        i79 = i82;
                                                                        if (zzh < i78) {
                                                                            byte b6 = bArr[zzh];
                                                                            if (zzjr.zzd(b6)) {
                                                                                zzh++;
                                                                                i82 = i79 + 1;
                                                                                cArr[i79] = (char) b6;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int i83 = i75;
                                                                    if (b5 >= -32) {
                                                                        if (b5 >= -16) {
                                                                            i28 = i78;
                                                                            if (i80 >= i28 - 2) {
                                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                                            }
                                                                            char[] cArr2 = cArr;
                                                                            zzjr.zza(b5, bArr[i80], bArr[i81 + 2], bArr[i81 + 3], cArr2, i79);
                                                                            i79 += 2;
                                                                            cArr = cArr2;
                                                                            zzh = i81 + 4;
                                                                        } else {
                                                                            if (i80 >= i78 - 1) {
                                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                                            }
                                                                            i28 = i78;
                                                                            zzjr.zzb(b5, bArr[i80], bArr[i81 + 2], cArr, i79);
                                                                            i79++;
                                                                            zzh = i81 + 3;
                                                                        }
                                                                        i75 = i83;
                                                                        i78 = i28;
                                                                    } else {
                                                                        if (i80 >= i78) {
                                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        zzjr.zzc(b5, bArr[i80], cArr, i79);
                                                                        i79++;
                                                                        zzh = i81 + 2;
                                                                        i75 = i83;
                                                                    }
                                                                }
                                                            }
                                                            i27 = i75;
                                                            i51 = 0;
                                                            zzfzVar7.zzc = new String(cArr, 0, i79);
                                                            zzh = i78;
                                                        }
                                                    }
                                                    while (zzh < i78) {
                                                    }
                                                    i27 = i75;
                                                    i51 = 0;
                                                    zzfzVar7.zzc = new String(cArr, 0, i79);
                                                    zzh = i78;
                                                }
                                            } else {
                                                i51 = 0;
                                                zzh = zzga.zzh(bArr, i25, zzfzVar7);
                                                int i84 = zzfzVar7.zza;
                                                if (i84 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i85 = i23 | i67;
                                                if (i84 == 0) {
                                                    zzfzVar7.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                                } else {
                                                    zzfzVar7.zzc = new String(bArr, zzh, i84, zzhp.zza);
                                                    zzh += i84;
                                                }
                                                i27 = i85;
                                            }
                                            i53 = zzh;
                                            unsafe3.putObject(obj8, j2, zzfzVar7.zzc);
                                            i50 = i6;
                                            bArr7 = bArr;
                                            obj6 = obj8;
                                            unsafe4 = unsafe3;
                                            i54 = i74;
                                            i57 = i19;
                                            i55 = i27;
                                            i56 = i24;
                                            i52 = -1;
                                            i58 = i22;
                                        }
                                        break;
                                    case 9:
                                        Object obj9 = obj6;
                                        Unsafe unsafe5 = unsafe4;
                                        int i86 = zzq;
                                        i19 = i62;
                                        if (i64 != 2) {
                                            obj5 = obj9;
                                            bArr4 = bArr;
                                            zzfzVar7 = zzfzVar;
                                            unsafe3 = unsafe5;
                                            i25 = i61;
                                            i21 = i86;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            zzfzVar4 = zzfzVar7;
                                            obj2 = obj5;
                                            bArr3 = bArr4;
                                            unsafe4 = unsafe3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 |= i67;
                                            Object zzx = zzipVar2.zzx(obj9, i86);
                                            zzfzVar7 = zzfzVar;
                                            i54 = i86;
                                            int zzm = zzga.zzm(zzx, zzipVar2.zzv(i86), bArr, i61, i6, zzfzVar7);
                                            zzipVar2.zzF(obj9, i54, zzx);
                                            i50 = i6;
                                            bArr7 = bArr;
                                            i53 = zzm;
                                            obj6 = obj9;
                                            unsafe4 = unsafe5;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 10:
                                        Object obj10 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj10;
                                        zzfzVar3 = zzfzVar;
                                        i18 = zzq;
                                        i19 = i62;
                                        i20 = i61;
                                        bArr3 = bArr;
                                        if (i64 != 2) {
                                            i21 = i18;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i25 = i20;
                                            zzfzVar4 = zzfzVar3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 |= i67;
                                            int zza2 = zzga.zza(bArr3, i20, zzfzVar3);
                                            unsafe2.putObject(obj3, j2, zzfzVar3.zzc);
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i54 = i18;
                                            i53 = zza2;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                            i50 = i6;
                                        }
                                    case 12:
                                        Object obj11 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj11;
                                        zzfzVar3 = zzfzVar;
                                        i18 = zzq;
                                        i19 = i62;
                                        i20 = i61;
                                        bArr3 = bArr;
                                        if (i64 != 0) {
                                            i21 = i18;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i25 = i20;
                                            zzfzVar4 = zzfzVar3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            int zzh5 = zzga.zzh(bArr3, i20, zzfzVar3);
                                            int i87 = zzfzVar3.zza;
                                            zzhm zzu = zzipVar2.zzu(i18);
                                            if ((i65 & Integer.MIN_VALUE) == 0 || zzu == null || zzu.zza(i87)) {
                                                i55 |= i67;
                                                unsafe2.putInt(obj3, j2, i87);
                                            } else {
                                                zzd(obj3).zzj(i56, Long.valueOf(i87));
                                            }
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i53 = zzh5;
                                            i50 = i6;
                                            i54 = i18;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 15:
                                        Object obj12 = obj6;
                                        unsafe2 = unsafe4;
                                        obj3 = obj12;
                                        zzfzVar3 = zzfzVar;
                                        i29 = zzq;
                                        i19 = i62;
                                        i20 = i61;
                                        bArr3 = bArr;
                                        if (i64 != 0) {
                                            i21 = i29;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i25 = i20;
                                            zzfzVar4 = zzfzVar3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 |= i67;
                                            int zzh6 = zzga.zzh(bArr3, i20, zzfzVar3);
                                            unsafe2.putInt(obj3, j2, zzgn.zzb(zzfzVar3.zza));
                                            obj6 = obj3;
                                            unsafe4 = unsafe2;
                                            i50 = i6;
                                            i53 = zzh6;
                                            bArr7 = bArr3;
                                            zzfzVar7 = zzfzVar3;
                                            i54 = i29;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    case 16:
                                        zzfzVar3 = zzfzVar;
                                        i29 = zzq;
                                        i19 = i62;
                                        i20 = i61;
                                        bArr3 = bArr;
                                        if (i64 != 0) {
                                            Object obj13 = obj6;
                                            unsafe2 = unsafe4;
                                            obj3 = obj13;
                                            i21 = i29;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            obj2 = obj3;
                                            unsafe4 = unsafe2;
                                            i25 = i20;
                                            zzfzVar4 = zzfzVar3;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 |= i67;
                                            int zzk2 = zzga.zzk(bArr3, i20, zzfzVar3);
                                            unsafe4.putLong(obj6, j2, zzgn.zzc(zzfzVar3.zzb));
                                            obj6 = obj6;
                                            unsafe4 = unsafe4;
                                            i50 = i6;
                                            bArr7 = bArr3;
                                            i53 = zzk2;
                                            zzfzVar7 = zzfzVar3;
                                            i54 = i29;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                        }
                                    default:
                                        if (i64 != 3) {
                                            i19 = i62;
                                            i21 = zzq;
                                            i22 = i17;
                                            i23 = i55;
                                            i24 = i56;
                                            bArr3 = bArr;
                                            zzfzVar4 = zzfzVar;
                                            obj2 = obj6;
                                            i25 = i61;
                                            i9 = i22;
                                            i14 = i25;
                                            bArr2 = bArr3;
                                            i54 = i21;
                                            zzfzVar2 = zzfzVar4;
                                            i13 = i19;
                                            i12 = i24;
                                            i11 = i23;
                                            i10 = 0;
                                            zzipVar = zzipVar2;
                                            unsafe = unsafe4;
                                            i8 = i7;
                                            break;
                                        } else {
                                            i55 |= i67;
                                            Object zzx2 = zzipVar2.zzx(obj6, zzq);
                                            int i88 = zzq;
                                            i19 = i62;
                                            int zzl = zzga.zzl(zzx2, zzipVar2.zzv(zzq), bArr, i61, i6, (i62 << 3) | 4, zzfzVar);
                                            zzipVar2.zzF(obj6, i88, zzx2);
                                            i53 = zzl;
                                            bArr7 = bArr;
                                            zzfzVar7 = zzfzVar;
                                            i54 = i88;
                                            i58 = i17;
                                            i57 = i19;
                                            i51 = 0;
                                            i52 = -1;
                                            i50 = i6;
                                        }
                                }
                            } else {
                                int i89 = zzq;
                                int i90 = i62;
                                i10 = 0;
                                obj2 = obj6;
                                i9 = i58;
                                if (zzr != 27) {
                                    Unsafe unsafe6 = unsafe4;
                                    if (zzr > 49) {
                                        unsafe = unsafe6;
                                        i30 = i90;
                                        zzipVar = zzipVar2;
                                        i12 = i56;
                                        i31 = i61;
                                        bArr5 = bArr;
                                        i11 = i55;
                                        zzfzVar5 = zzfzVar;
                                        if (zzr != 50) {
                                            Unsafe unsafe7 = zzb;
                                            long j5 = iArr[i89 + 2] & 1048575;
                                            switch (zzr) {
                                                case 51:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 1) {
                                                        i48 = i47 + 8;
                                                        unsafe7.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr2, i47))));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                            i8 = i7;
                                                            i14 = i53;
                                                            i54 = i46;
                                                            break;
                                                        } else {
                                                            i50 = i6;
                                                            i57 = i13;
                                                            zzfzVar7 = zzfzVar2;
                                                            zzipVar2 = zzipVar;
                                                            bArr7 = bArr2;
                                                            obj6 = obj2;
                                                            i51 = 0;
                                                            unsafe4 = unsafe;
                                                            i54 = i46;
                                                            i58 = i9;
                                                            i55 = i11;
                                                            i52 = -1;
                                                            i56 = i12;
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                case 52:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 5) {
                                                        i48 = i47 + 4;
                                                        unsafe7.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr2, i47))));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 0) {
                                                        i48 = zzga.zzk(bArr2, i47, zzfzVar2);
                                                        unsafe7.putObject(obj2, j2, Long.valueOf(zzfzVar2.zzb));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                                                case 62:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 0) {
                                                        i48 = zzga.zzh(bArr2, i47, zzfzVar2);
                                                        unsafe7.putObject(obj2, j2, Integer.valueOf(zzfzVar2.zza));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 1) {
                                                        i48 = i47 + 8;
                                                        unsafe7.putObject(obj2, j2, Long.valueOf(zzga.zzn(bArr2, i47)));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 5) {
                                                        i48 = i47 + 4;
                                                        unsafe7.putObject(obj2, j2, Integer.valueOf(zzga.zzb(bArr2, i47)));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 58:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 0) {
                                                        i48 = zzga.zzk(bArr2, i47, zzfzVar2);
                                                        unsafe7.putObject(obj2, j2, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i53 = i48;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 59:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    if (i64 == 2) {
                                                        i53 = zzga.zzh(bArr2, i47, zzfzVar2);
                                                        int i91 = zzfzVar2.zza;
                                                        if (i91 == 0) {
                                                            unsafe7.putObject(obj2, j2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                        } else {
                                                            int i92 = i53 + i91;
                                                            if ((i65 & 536870912) != 0 && !zzjt.zzd(bArr2, i53, i92)) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe7.putObject(obj2, j2, new String(bArr2, i53, i91, zzhp.zza));
                                                            i53 = i92;
                                                        }
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                                                    i13 = i30;
                                                    if (i64 == 2) {
                                                        Object zzy = zzipVar.zzy(obj2, i13, i89);
                                                        int zzm2 = zzga.zzm(zzy, zzipVar.zzv(i89), bArr, i31, i6, zzfzVar5);
                                                        bArr2 = bArr;
                                                        zzipVar.zzG(obj2, i13, i89, zzy);
                                                        i53 = zzm2;
                                                        i47 = i31;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar;
                                                        if (i53 == i47) {
                                                        }
                                                    } else {
                                                        bArr2 = bArr;
                                                        i47 = i31;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar;
                                                        i53 = i47;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    bArr6 = bArr;
                                                    i13 = i30;
                                                    i49 = i31;
                                                    if (i64 == 2) {
                                                        i53 = zzga.zza(bArr6, i49, zzfzVar5);
                                                        unsafe7.putObject(obj2, j2, zzfzVar5.zzc);
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i47 = i49;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i47 = i49;
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr6 = bArr;
                                                    i46 = i89;
                                                    i13 = i30;
                                                    i49 = i31;
                                                    if (i64 == 0) {
                                                        i53 = zzga.zzh(bArr6, i49, zzfzVar5);
                                                        int i93 = zzfzVar5.zza;
                                                        i89 = i46;
                                                        zzhm zzu2 = zzipVar.zzu(i89);
                                                        if (zzu2 == null || zzu2.zza(i93)) {
                                                            unsafe7.putObject(obj2, j2, Integer.valueOf(i93));
                                                            unsafe7.putInt(obj2, j5, i13);
                                                        } else {
                                                            zzd(obj2).zzj(i12, Long.valueOf(i93));
                                                        }
                                                        i47 = i49;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i47 = i49;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 66:
                                                    bArr6 = bArr;
                                                    i46 = i89;
                                                    i13 = i30;
                                                    i49 = i31;
                                                    if (i64 == 0) {
                                                        i53 = zzga.zzh(bArr6, i49, zzfzVar5);
                                                        unsafe7.putObject(obj2, j2, Integer.valueOf(zzgn.zzb(zzfzVar5.zza)));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i47 = i49;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i47 = i49;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 67:
                                                    bArr6 = bArr;
                                                    i13 = i30;
                                                    i49 = i31;
                                                    if (i64 == 0) {
                                                        i53 = zzga.zzk(bArr6, i49, zzfzVar5);
                                                        i46 = i89;
                                                        unsafe7.putObject(obj2, j2, Long.valueOf(zzgn.zzc(zzfzVar5.zzb)));
                                                        unsafe7.putInt(obj2, j5, i13);
                                                        i47 = i49;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    i47 = i49;
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    bArr2 = bArr6;
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i64 == 3) {
                                                        i13 = i30;
                                                        Object zzy2 = zzipVar.zzy(obj2, i13, i89);
                                                        bArr6 = bArr;
                                                        i49 = i31;
                                                        int zzl2 = zzga.zzl(zzy2, zzipVar.zzv(i89), bArr6, i49, i6, (i12 & (-8)) | 4, zzfzVar5);
                                                        zzipVar.zzG(obj2, i13, i89, zzy2);
                                                        i53 = zzl2;
                                                        i47 = i49;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar5;
                                                        bArr2 = bArr6;
                                                        if (i53 == i47) {
                                                        }
                                                    } else {
                                                        i13 = i30;
                                                        i46 = i89;
                                                        zzfzVar2 = zzfzVar5;
                                                        i47 = i31;
                                                        bArr2 = bArr;
                                                        i53 = i47;
                                                        if (i53 == i47) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    i46 = i89;
                                                    zzfzVar2 = zzfzVar5;
                                                    i13 = i30;
                                                    i47 = i31;
                                                    bArr2 = bArr;
                                                    i53 = i47;
                                                    if (i53 == i47) {
                                                    }
                                                    break;
                                            }
                                        } else if (i64 == 2) {
                                            Unsafe unsafe8 = zzb;
                                            Object zzw = zzipVar.zzw(i89);
                                            Object object = unsafe8.getObject(obj2, j2);
                                            if (!((zzig) object).zze()) {
                                                zzig zzb2 = zzig.zza().zzb();
                                                zzih.zza(zzb2, object);
                                                unsafe8.putObject(obj2, j2, zzb2);
                                            }
                                            throw null;
                                        }
                                    } else {
                                        long j6 = i65;
                                        Unsafe unsafe9 = zzb;
                                        zzho zzhoVar2 = (zzho) unsafe9.getObject(obj2, j2);
                                        if (!zzhoVar2.zzc()) {
                                            int size = zzhoVar2.size();
                                            zzhoVar2 = zzhoVar2.zzd(size + size);
                                            unsafe9.putObject(obj2, j2, zzhoVar2);
                                        }
                                        zzho zzhoVar3 = zzhoVar2;
                                        switch (zzr) {
                                            case 18:
                                            case 35:
                                                bArr5 = bArr;
                                                i32 = i6;
                                                i30 = i90;
                                                i12 = i56;
                                                i33 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzgt zzgtVar = (zzgt) zzhoVar3;
                                                    i31 = zzga.zzh(bArr5, i33, zzfzVar5);
                                                    int i94 = zzfzVar5.zza;
                                                    int i95 = i31 + i94;
                                                    if (i95 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzgtVar.zzg((i94 / 8) + zzgtVar.size());
                                                    while (i31 < i95) {
                                                        zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, i31)));
                                                        i31 += 8;
                                                    }
                                                    if (i31 != i95) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i31 == i33) {
                                                        break;
                                                    } else {
                                                        bArr7 = bArr5;
                                                        i50 = i32;
                                                        i54 = i89;
                                                        zzfzVar7 = zzfzVar5;
                                                        obj6 = obj2;
                                                        i51 = 0;
                                                        unsafe4 = unsafe;
                                                        i58 = i9;
                                                        i57 = i30;
                                                        i55 = i11;
                                                        i53 = i31;
                                                        zzipVar2 = zzipVar;
                                                        i56 = i12;
                                                        i52 = -1;
                                                    }
                                                } else {
                                                    if (i64 == 1) {
                                                        i34 = i33 + 8;
                                                        zzgt zzgtVar2 = (zzgt) zzhoVar3;
                                                        zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, i33)));
                                                        while (i34 < i32) {
                                                            int zzh7 = zzga.zzh(bArr5, i34, zzfzVar5);
                                                            if (i12 == zzfzVar5.zza) {
                                                                zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr5, zzh7)));
                                                                i34 = zzh7 + 8;
                                                            } else {
                                                                i31 = i34;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        i31 = i34;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                            case 19:
                                            case 36:
                                                bArr5 = bArr;
                                                i32 = i6;
                                                i30 = i90;
                                                i12 = i56;
                                                i33 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzhd zzhdVar = (zzhd) zzhoVar3;
                                                    i31 = zzga.zzh(bArr5, i33, zzfzVar5);
                                                    int i96 = zzfzVar5.zza;
                                                    int i97 = i31 + i96;
                                                    if (i97 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhdVar.zzg((i96 / 4) + zzhdVar.size());
                                                    while (i31 < i97) {
                                                        zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, i31)));
                                                        i31 += 4;
                                                    }
                                                    if (i31 != i97) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 5) {
                                                        i34 = i33 + 4;
                                                        zzhd zzhdVar2 = (zzhd) zzhoVar3;
                                                        zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, i33)));
                                                        while (i34 < i32) {
                                                            int zzh8 = zzga.zzh(bArr5, i34, zzfzVar5);
                                                            if (i12 == zzfzVar5.zza) {
                                                                zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr5, zzh8)));
                                                                i34 = zzh8 + 4;
                                                            } else {
                                                                i31 = i34;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        i31 = i34;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 20:
                                            case zzbgj.zzt.zzm /* 21 */:
                                            case 37:
                                            case 38:
                                                bArr5 = bArr;
                                                i32 = i6;
                                                i30 = i90;
                                                i12 = i56;
                                                i33 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                zzfzVar5 = zzfzVar;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzib zzibVar = (zzib) zzhoVar3;
                                                    i31 = zzga.zzh(bArr5, i33, zzfzVar5);
                                                    int i98 = zzfzVar5.zza + i31;
                                                    while (i31 < i98) {
                                                        i31 = zzga.zzk(bArr5, i31, zzfzVar5);
                                                        zzibVar.zzf(zzfzVar5.zzb);
                                                    }
                                                    if (i31 != i98) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i64 == 0) {
                                                        zzib zzibVar2 = (zzib) zzhoVar3;
                                                        i31 = zzga.zzk(bArr5, i33, zzfzVar5);
                                                        zzibVar2.zzf(zzfzVar5.zzb);
                                                        while (i31 < i32) {
                                                            int zzh9 = zzga.zzh(bArr5, i31, zzfzVar5);
                                                            if (i12 == zzfzVar5.zza) {
                                                                i31 = zzga.zzk(bArr5, zzh9, zzfzVar5);
                                                                zzibVar2.zzf(zzfzVar5.zzb);
                                                            }
                                                        }
                                                    }
                                                    i31 = i33;
                                                }
                                                if (i31 == i33) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i37 = i6;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    i31 = zzga.zzf(bArr5, i36, zzhoVar3, zzfzVar6);
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 0) {
                                                        i31 = zzga.zzj(i35, bArr5, i36, i37, zzhoVar3, zzfzVar6);
                                                        i12 = i35;
                                                        i32 = i37;
                                                        zzfzVar5 = zzfzVar6;
                                                        i33 = i36;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i37 = i6;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzib zzibVar3 = (zzib) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i36, zzfzVar6);
                                                    int i99 = zzfzVar6.zza;
                                                    int i100 = zzh2 + i99;
                                                    if (i100 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzibVar3.zzg((i99 / 8) + zzibVar3.size());
                                                    while (zzh2 < i100) {
                                                        zzibVar3.zzf(zzga.zzn(bArr5, zzh2));
                                                        zzh2 += 8;
                                                    }
                                                    if (zzh2 != i100) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i31 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 1) {
                                                        i31 = i36 + 8;
                                                        zzib zzibVar4 = (zzib) zzhoVar3;
                                                        zzibVar4.zzf(zzga.zzn(bArr5, i36));
                                                        while (i31 < i37) {
                                                            int zzh10 = zzga.zzh(bArr5, i31, zzfzVar6);
                                                            if (i35 == zzfzVar6.zza) {
                                                                zzibVar4.zzf(zzga.zzn(bArr5, zzh10));
                                                                i31 = zzh10 + 8;
                                                            } else {
                                                                zzfzVar5 = zzfzVar6;
                                                                i32 = i37;
                                                                i12 = i35;
                                                                i33 = i36;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar5 = zzfzVar6;
                                                        i32 = i37;
                                                        i12 = i35;
                                                        i33 = i36;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i37 = i6;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzhl zzhlVar = (zzhl) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i36, zzfzVar6);
                                                    int i101 = zzfzVar6.zza;
                                                    int i102 = zzh2 + i101;
                                                    if (i102 > bArr5.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhlVar.zzh((i101 / 4) + zzhlVar.size());
                                                    while (zzh2 < i102) {
                                                        zzhlVar.zzg(zzga.zzb(bArr5, zzh2));
                                                        zzh2 += 4;
                                                    }
                                                    if (zzh2 != i102) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i31 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 5) {
                                                        i31 = i36 + 4;
                                                        zzhl zzhlVar2 = (zzhl) zzhoVar3;
                                                        zzhlVar2.zzg(zzga.zzb(bArr5, i36));
                                                        while (i31 < i37) {
                                                            int zzh11 = zzga.zzh(bArr5, i31, zzfzVar6);
                                                            if (i35 == zzfzVar6.zza) {
                                                                zzhlVar2.zzg(zzga.zzb(bArr5, zzh11));
                                                                i31 = zzh11 + 4;
                                                            } else {
                                                                zzfzVar5 = zzfzVar6;
                                                                i32 = i37;
                                                                i12 = i35;
                                                                i33 = i36;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar5 = zzfzVar6;
                                                        i32 = i37;
                                                        i12 = i35;
                                                        i33 = i36;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i37 = i6;
                                                zzipVar = zzipVar2;
                                                if (i64 == 2) {
                                                    zzgb zzgbVar = (zzgb) zzhoVar3;
                                                    zzh2 = zzga.zzh(bArr5, i36, zzfzVar6);
                                                    int i103 = zzfzVar6.zza + zzh2;
                                                    while (zzh2 < i103) {
                                                        zzh2 = zzga.zzk(bArr5, zzh2, zzfzVar6);
                                                        zzgbVar.zze(zzfzVar6.zzb != 0);
                                                    }
                                                    if (zzh2 != i103) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i31 = zzh2;
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 0) {
                                                        zzgb zzgbVar2 = (zzgb) zzhoVar3;
                                                        int zzk3 = zzga.zzk(bArr5, i36, zzfzVar6);
                                                        zzgbVar2.zze(zzfzVar6.zzb != 0);
                                                        while (zzk3 < i37) {
                                                            int zzh12 = zzga.zzh(bArr5, zzk3, zzfzVar6);
                                                            if (i35 == zzfzVar6.zza) {
                                                                zzk3 = zzga.zzk(bArr5, zzh12, zzfzVar6);
                                                                zzgbVar2.zze(zzfzVar6.zzb != 0);
                                                            } else {
                                                                i31 = zzk3;
                                                                zzfzVar5 = zzfzVar6;
                                                                i32 = i37;
                                                                i12 = i35;
                                                                i33 = i36;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        i31 = zzk3;
                                                        zzfzVar5 = zzfzVar6;
                                                        i32 = i37;
                                                        i12 = i35;
                                                        i33 = i36;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr5 = bArr;
                                                zzfzVar6 = zzfzVar;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                zzipVar = zzipVar2;
                                                i37 = i6;
                                                if (i64 != 2) {
                                                    i30 = i90;
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                } else if ((j6 & 536870912) == 0) {
                                                    i31 = zzga.zzh(bArr5, i36, zzfzVar6);
                                                    int i104 = zzfzVar6.zza;
                                                    if (i104 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i104 == 0) {
                                                        zzhoVar3.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                    } else {
                                                        zzhoVar3.add(new String(bArr5, i31, i104, zzhp.zza));
                                                        i31 += i104;
                                                    }
                                                    while (i31 < i37) {
                                                        int zzh13 = zzga.zzh(bArr5, i31, zzfzVar6);
                                                        if (i35 == zzfzVar6.zza) {
                                                            i31 = zzga.zzh(bArr5, zzh13, zzfzVar6);
                                                            int i105 = zzfzVar6.zza;
                                                            if (i105 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i105 == 0) {
                                                                zzhoVar3.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                            } else {
                                                                zzhoVar3.add(new String(bArr5, i31, i105, zzhp.zza));
                                                                i31 += i105;
                                                            }
                                                        } else {
                                                            i32 = i37;
                                                            i12 = i35;
                                                            i33 = i36;
                                                            i30 = i90;
                                                            zzfzVar5 = zzfzVar6;
                                                            if (i31 == i33) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i30 = i90;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    i31 = zzga.zzh(bArr5, i36, zzfzVar6);
                                                    int i106 = zzfzVar6.zza;
                                                    if (i106 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i106 == 0) {
                                                        zzhoVar3.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                        i30 = i90;
                                                    } else {
                                                        int i107 = i31 + i106;
                                                        if (!zzjt.zzd(bArr5, i31, i107)) {
                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                        }
                                                        i30 = i90;
                                                        zzhoVar3.add(new String(bArr5, i31, i106, zzhp.zza));
                                                        i31 = i107;
                                                    }
                                                    while (i31 < i37) {
                                                        int zzh14 = zzga.zzh(bArr5, i31, zzfzVar6);
                                                        if (i35 == zzfzVar6.zza) {
                                                            i31 = zzga.zzh(bArr5, zzh14, zzfzVar6);
                                                            int i108 = zzfzVar6.zza;
                                                            if (i108 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i108 == 0) {
                                                                zzhoVar3.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                            } else {
                                                                int i109 = i31 + i108;
                                                                if (!zzjt.zzd(bArr5, i31, i109)) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzhoVar3.add(new String(bArr5, i31, i108, zzhp.zza));
                                                                i31 = i109;
                                                            }
                                                        } else {
                                                            zzfzVar5 = zzfzVar6;
                                                            i32 = i37;
                                                            i12 = i35;
                                                            i33 = i36;
                                                            if (i31 == i33) {
                                                            }
                                                        }
                                                    }
                                                    zzfzVar5 = zzfzVar6;
                                                    i32 = i37;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                bArr5 = bArr;
                                                i38 = i6;
                                                zzfzVar6 = zzfzVar;
                                                i35 = i56;
                                                i39 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i40 = i90;
                                                if (i64 == 2) {
                                                    zzipVar = this;
                                                    i32 = i38;
                                                    i33 = i39;
                                                    i31 = zzga.zze(zzipVar.zzv(i89), i35, bArr5, i33, i32, zzhoVar3, zzfzVar6);
                                                    i12 = i35;
                                                    bArr5 = bArr5;
                                                    i30 = i40;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                zzipVar = this;
                                                i32 = i38;
                                                i12 = i35;
                                                i30 = i40;
                                                i33 = i39;
                                                zzfzVar5 = zzfzVar6;
                                                i31 = i33;
                                                if (i31 == i33) {
                                                }
                                                break;
                                            case 28:
                                                bArr5 = bArr;
                                                i38 = i6;
                                                zzfzVar6 = zzfzVar;
                                                i35 = i56;
                                                i39 = i61;
                                                unsafe = unsafe6;
                                                i11 = i55;
                                                i40 = i90;
                                                if (i64 == 2) {
                                                    i31 = zzga.zzh(bArr5, i39, zzfzVar6);
                                                    int i110 = zzfzVar6.zza;
                                                    if (i110 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i110 > bArr5.length - i31) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i110 == 0) {
                                                        zzhoVar3.add(zzgk.zzb);
                                                    } else {
                                                        zzhoVar3.add(zzgk.zzj(bArr5, i31, i110));
                                                        i31 += i110;
                                                    }
                                                    while (i31 < i38) {
                                                        int zzh15 = zzga.zzh(bArr5, i31, zzfzVar6);
                                                        if (i35 == zzfzVar6.zza) {
                                                            i31 = zzga.zzh(bArr5, zzh15, zzfzVar6);
                                                            int i111 = zzfzVar6.zza;
                                                            if (i111 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i111 > bArr5.length - i31) {
                                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i111 == 0) {
                                                                zzhoVar3.add(zzgk.zzb);
                                                            } else {
                                                                zzhoVar3.add(zzgk.zzj(bArr5, i31, i111));
                                                                i31 += i111;
                                                            }
                                                        } else {
                                                            zzipVar = this;
                                                            i32 = i38;
                                                            i12 = i35;
                                                            i30 = i40;
                                                            i33 = i39;
                                                            zzfzVar5 = zzfzVar6;
                                                            if (i31 == i33) {
                                                            }
                                                        }
                                                    }
                                                    zzipVar = this;
                                                    i32 = i38;
                                                    i12 = i35;
                                                    i30 = i40;
                                                    i33 = i39;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                zzipVar = this;
                                                i32 = i38;
                                                i12 = i35;
                                                i30 = i40;
                                                i33 = i39;
                                                zzfzVar5 = zzfzVar6;
                                                i31 = i33;
                                                if (i31 == i33) {
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                bArr5 = bArr;
                                                i38 = i6;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i35 = i56;
                                                i36 = i61;
                                                unsafe = unsafe6;
                                                if (i64 == 2) {
                                                    zzj = zzga.zzf(bArr5, i36, zzhoVar3, zzfzVar6);
                                                    i39 = i36;
                                                    zzhoVar = zzhoVar3;
                                                } else if (i64 == 0) {
                                                    i39 = i36;
                                                    zzhoVar = zzhoVar3;
                                                    zzj = zzga.zzj(i35, bArr5, i39, i38, zzhoVar3, zzfzVar6);
                                                } else {
                                                    i11 = i55;
                                                    zzipVar = this;
                                                    i32 = i38;
                                                    zzfzVar5 = zzfzVar6;
                                                    i12 = i35;
                                                    i33 = i36;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                zzhm zzu3 = zzipVar2.zzu(i89);
                                                zzjj zzjjVar = zzipVar2.zzl;
                                                int i112 = zziz.zza;
                                                if (zzu3 == null) {
                                                    i41 = zzj;
                                                    i11 = i55;
                                                    i40 = i30;
                                                } else if (zzhoVar != null) {
                                                    int size2 = zzhoVar.size();
                                                    i41 = zzj;
                                                    Object obj14 = null;
                                                    int i113 = 0;
                                                    int i114 = 0;
                                                    while (i113 < size2) {
                                                        int i115 = i55;
                                                        Integer num = (Integer) zzhoVar.get(i113);
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i113 != i114) {
                                                                zzhoVar.set(i114, num);
                                                            }
                                                            i114++;
                                                            i42 = i30;
                                                        } else {
                                                            i42 = i30;
                                                            obj14 = zziz.zzn(obj2, i42, intValue, obj14, zzjjVar);
                                                        }
                                                        i113++;
                                                        i30 = i42;
                                                        i55 = i115;
                                                    }
                                                    i11 = i55;
                                                    i40 = i30;
                                                    if (i114 != size2) {
                                                        zzhoVar.subList(i114, size2).clear();
                                                    }
                                                } else {
                                                    i41 = zzj;
                                                    i11 = i55;
                                                    i40 = i30;
                                                    Iterator it = zzhoVar.iterator();
                                                    Object obj15 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj15 = zziz.zzn(obj2, i40, intValue2, obj15, zzjjVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                zzipVar = this;
                                                i31 = i41;
                                                i32 = i38;
                                                i12 = i35;
                                                i30 = i40;
                                                i33 = i39;
                                                zzfzVar5 = zzfzVar6;
                                                if (i31 == i33) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr5 = bArr;
                                                i43 = i6;
                                                zzfzVar6 = zzfzVar;
                                                i30 = i90;
                                                i44 = i56;
                                                i45 = i61;
                                                unsafe = unsafe6;
                                                if (i64 == 2) {
                                                    zzhl zzhlVar3 = (zzhl) zzhoVar3;
                                                    zzh4 = zzga.zzh(bArr5, i45, zzfzVar6);
                                                    int i116 = zzfzVar6.zza + zzh4;
                                                    while (zzh4 < i116) {
                                                        zzh4 = zzga.zzh(bArr5, zzh4, zzfzVar6);
                                                        zzhlVar3.zzg(zzgn.zzb(zzfzVar6.zza));
                                                    }
                                                    if (zzh4 != i116) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i31 = zzh4;
                                                    i32 = i43;
                                                    i12 = i44;
                                                    i33 = i45;
                                                    i11 = i55;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    if (i64 == 0) {
                                                        zzhl zzhlVar4 = (zzhl) zzhoVar3;
                                                        zzh3 = zzga.zzh(bArr5, i45, zzfzVar6);
                                                        zzhlVar4.zzg(zzgn.zzb(zzfzVar6.zza));
                                                        while (zzh3 < i43) {
                                                            int zzh16 = zzga.zzh(bArr5, zzh3, zzfzVar6);
                                                            if (i44 == zzfzVar6.zza) {
                                                                zzh3 = zzga.zzh(bArr5, zzh16, zzfzVar6);
                                                                zzhlVar4.zzg(zzgn.zzb(zzfzVar6.zza));
                                                            } else {
                                                                zzipVar = zzipVar2;
                                                                i31 = zzh3;
                                                                i32 = i43;
                                                                i12 = i44;
                                                                i33 = i45;
                                                                i11 = i55;
                                                                zzfzVar5 = zzfzVar6;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        zzipVar = zzipVar2;
                                                        i31 = zzh3;
                                                        i32 = i43;
                                                        i12 = i44;
                                                        i33 = i45;
                                                        i11 = i55;
                                                        zzfzVar5 = zzfzVar6;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i32 = i43;
                                                    i12 = i44;
                                                    i33 = i45;
                                                    i11 = i55;
                                                    zzfzVar5 = zzfzVar6;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr5 = bArr;
                                                i43 = i6;
                                                zzfzVar6 = zzfzVar;
                                                i44 = i56;
                                                i45 = i61;
                                                if (i64 == 2) {
                                                    zzib zzibVar5 = (zzib) zzhoVar3;
                                                    zzh4 = zzga.zzh(bArr5, i45, zzfzVar6);
                                                    int i117 = zzfzVar6.zza + zzh4;
                                                    while (zzh4 < i117) {
                                                        zzh4 = zzga.zzk(bArr5, zzh4, zzfzVar6);
                                                        zzibVar5.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                        unsafe6 = unsafe6;
                                                        i90 = i90;
                                                    }
                                                    unsafe = unsafe6;
                                                    i30 = i90;
                                                    if (zzh4 != i117) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i31 = zzh4;
                                                    i32 = i43;
                                                    i12 = i44;
                                                    i33 = i45;
                                                    i11 = i55;
                                                    zzfzVar5 = zzfzVar6;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    unsafe = unsafe6;
                                                    i30 = i90;
                                                    if (i64 == 0) {
                                                        zzib zzibVar6 = (zzib) zzhoVar3;
                                                        zzh3 = zzga.zzk(bArr5, i45, zzfzVar6);
                                                        zzibVar6.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                        while (zzh3 < i43) {
                                                            int zzh17 = zzga.zzh(bArr5, zzh3, zzfzVar6);
                                                            if (i44 == zzfzVar6.zza) {
                                                                zzh3 = zzga.zzk(bArr5, zzh17, zzfzVar6);
                                                                zzibVar6.zzf(zzgn.zzc(zzfzVar6.zzb));
                                                            } else {
                                                                zzipVar = zzipVar2;
                                                                i31 = zzh3;
                                                                i32 = i43;
                                                                i12 = i44;
                                                                i33 = i45;
                                                                i11 = i55;
                                                                zzfzVar5 = zzfzVar6;
                                                                if (i31 == i33) {
                                                                }
                                                            }
                                                        }
                                                        zzipVar = zzipVar2;
                                                        i31 = zzh3;
                                                        i32 = i43;
                                                        i12 = i44;
                                                        i33 = i45;
                                                        i11 = i55;
                                                        zzfzVar5 = zzfzVar6;
                                                        if (i31 == i33) {
                                                        }
                                                    }
                                                    zzipVar = zzipVar2;
                                                    i32 = i43;
                                                    i12 = i44;
                                                    i33 = i45;
                                                    i11 = i55;
                                                    zzfzVar5 = zzfzVar6;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i64 == 3) {
                                                    int i118 = (i56 & (-8)) | 4;
                                                    zzix zzv = zzipVar2.zzv(i89);
                                                    bArr5 = bArr;
                                                    int zzc = zzga.zzc(zzv, bArr5, i61, i6, i118, zzfzVar);
                                                    zzhoVar3.add(zzfzVar.zzc);
                                                    while (zzc < i6) {
                                                        int zzh18 = zzga.zzh(bArr5, zzc, zzfzVar);
                                                        zzix zzixVar = zzv;
                                                        if (i56 == zzfzVar.zza) {
                                                            zzv = zzixVar;
                                                            zzc = zzga.zzc(zzv, bArr5, zzh18, i6, i118, zzfzVar);
                                                            zzhoVar3.add(zzfzVar.zzc);
                                                        } else {
                                                            i32 = i6;
                                                            i33 = i61;
                                                            unsafe = unsafe6;
                                                            i30 = i90;
                                                            i11 = i55;
                                                            zzipVar = zzipVar2;
                                                            zzfzVar5 = zzfzVar;
                                                            i31 = zzc;
                                                            i12 = i56;
                                                            if (i31 == i33) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i6;
                                                    i33 = i61;
                                                    unsafe = unsafe6;
                                                    i30 = i90;
                                                    i11 = i55;
                                                    zzipVar = zzipVar2;
                                                    zzfzVar5 = zzfzVar;
                                                    i31 = zzc;
                                                    i12 = i56;
                                                    if (i31 == i33) {
                                                    }
                                                } else {
                                                    bArr5 = bArr;
                                                    i32 = i6;
                                                    i30 = i90;
                                                    i12 = i56;
                                                    i33 = i61;
                                                    unsafe = unsafe6;
                                                    i11 = i55;
                                                    zzfzVar5 = zzfzVar;
                                                    zzipVar = zzipVar2;
                                                    i31 = i33;
                                                    if (i31 == i33) {
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    i14 = i31;
                                    i54 = i89;
                                    zzfzVar2 = zzfzVar5;
                                    i13 = i30;
                                    i8 = i7;
                                    bArr2 = bArr5;
                                } else if (i64 == 2) {
                                    zzho zzhoVar4 = (zzho) unsafe4.getObject(obj2, j2);
                                    if (!zzhoVar4.zzc()) {
                                        int size3 = zzhoVar4.size();
                                        zzhoVar4 = zzhoVar4.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe4.putObject(obj2, j2, zzhoVar4);
                                    }
                                    Unsafe unsafe10 = unsafe4;
                                    int zze = zzga.zze(zzipVar2.zzv(i89), i56, bArr, i61, i6, zzhoVar4, zzfzVar);
                                    i56 = i56;
                                    obj6 = obj2;
                                    bArr7 = bArr;
                                    i50 = i6;
                                    zzfzVar7 = zzfzVar;
                                    i53 = zze;
                                    i54 = i89;
                                    unsafe4 = unsafe10;
                                    i57 = i90;
                                    i51 = 0;
                                    i58 = i9;
                                    i52 = -1;
                                } else {
                                    bArr5 = bArr;
                                    zzipVar = zzipVar2;
                                    i30 = i90;
                                    i12 = i56;
                                    i31 = i61;
                                    unsafe = unsafe4;
                                    i11 = i55;
                                    zzfzVar5 = zzfzVar;
                                    i14 = i31;
                                    i54 = i89;
                                    zzfzVar2 = zzfzVar5;
                                    i13 = i30;
                                    i8 = i7;
                                    bArr2 = bArr5;
                                }
                            }
                        }
                        if (i12 == i8 || i8 == 0) {
                            if (zzipVar.zzh) {
                                zzgw zzgwVar = zzfzVar2.zzd;
                                int i119 = zzgw.zzb;
                                int i120 = zziu.zza;
                                if (zzgwVar != zzgw.zza) {
                                    if (zzgwVar.zzb(zzipVar.zzg, i13) != null) {
                                        throw null;
                                    }
                                    i50 = i6;
                                    i15 = i12;
                                    zzg = zzga.zzg(i15, bArr2, i14, i50, zzd(obj2), zzfzVar2);
                                    i53 = zzg;
                                    bArr7 = bArr;
                                    zzfzVar7 = zzfzVar;
                                    i57 = i13;
                                    zzipVar2 = zzipVar;
                                    obj6 = obj2;
                                    i51 = i10;
                                    i58 = i9;
                                    i55 = i11;
                                    i52 = -1;
                                    i56 = i15;
                                    unsafe4 = unsafe;
                                }
                            }
                            i15 = i12;
                            i50 = i6;
                            zzg = zzga.zzg(i15, bArr, i14, i50, zzd(obj2), zzfzVar);
                            i53 = zzg;
                            bArr7 = bArr;
                            zzfzVar7 = zzfzVar;
                            i57 = i13;
                            zzipVar2 = zzipVar;
                            obj6 = obj2;
                            i51 = i10;
                            i58 = i9;
                            i55 = i11;
                            i52 = -1;
                            i56 = i15;
                            unsafe4 = unsafe;
                        } else {
                            i50 = i6;
                            i53 = i14;
                            obj6 = obj2;
                            i56 = i12;
                            i58 = i9;
                            i55 = i11;
                        }
                    }
                    zzq = i52;
                    if (zzq != i52) {
                    }
                    if (i12 == i8) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i15 = i12;
                    i50 = i6;
                    zzg = zzga.zzg(i15, bArr, i14, i50, zzd(obj2), zzfzVar);
                    i53 = zzg;
                    bArr7 = bArr;
                    zzfzVar7 = zzfzVar;
                    i57 = i13;
                    zzipVar2 = zzipVar;
                    obj6 = obj2;
                    i51 = i10;
                    i58 = i9;
                    i55 = i11;
                    i52 = -1;
                    i56 = i15;
                    unsafe4 = unsafe;
                } else {
                    if (i62 >= zzipVar2.zze && i62 <= zzipVar2.zzf) {
                        zzq = zzipVar2.zzq(i62, i51);
                        if (zzq != i52) {
                        }
                        if (i12 == i8) {
                        }
                        if (zzipVar.zzh) {
                        }
                        i15 = i12;
                        i50 = i6;
                        zzg = zzga.zzg(i15, bArr, i14, i50, zzd(obj2), zzfzVar);
                        i53 = zzg;
                        bArr7 = bArr;
                        zzfzVar7 = zzfzVar;
                        i57 = i13;
                        zzipVar2 = zzipVar;
                        obj6 = obj2;
                        i51 = i10;
                        i58 = i9;
                        i55 = i11;
                        i52 = -1;
                        i56 = i15;
                        unsafe4 = unsafe;
                    }
                    zzq = i52;
                    if (zzq != i52) {
                    }
                    if (i12 == i8) {
                    }
                    if (zzipVar.zzh) {
                    }
                    i15 = i12;
                    i50 = i6;
                    zzg = zzga.zzg(i15, bArr, i14, i50, zzd(obj2), zzfzVar);
                    i53 = zzg;
                    bArr7 = bArr;
                    zzfzVar7 = zzfzVar;
                    i57 = i13;
                    zzipVar2 = zzipVar;
                    obj6 = obj2;
                    i51 = i10;
                    i58 = i9;
                    i55 = i11;
                    i52 = -1;
                    i56 = i15;
                    unsafe4 = unsafe;
                }
            } else {
                zzipVar = zzipVar2;
                unsafe = unsafe4;
                i8 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(f.API_PRIORITY_OTHER);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i5 = 0; i5 < iArr.length; i5 += 3) {
                int zzs = zzs(i5);
                int i6 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j2 = i6;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzho) zzjq.zzf(obj, j2)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i5], i5)) {
                        zzv(i5).zzf(zzb.getObject(obj, j2));
                    }
                }
                if (zzI(obj, i5)) {
                    zzv(i5).zzf(zzb.getObject(obj, j2));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int i6 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j2 = i6;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i5)) {
                        zzjq.zzo(obj, j2, zzjq.zza(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i5)) {
                        zzjq.zzp(obj, j2, zzjq.zzb(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i5)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i5)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i5)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i5)) {
                        zzjq.zzm(obj, j2, zzjq.zzw(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i5)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i5);
                    break;
                case 10:
                    if (zzI(obj2, i5)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i5)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i5)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i5)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i5);
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
                    zzho zzhoVar = (zzho) zzjq.zzf(obj, j2);
                    zzho zzhoVar2 = (zzho) zzjq.zzf(obj2, j2);
                    int size = zzhoVar.size();
                    int size2 = zzhoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVar.zzc()) {
                            zzhoVar = zzhoVar.zzd(size2 + size);
                        }
                        zzhoVar.addAll(zzhoVar2);
                    }
                    if (size > 0) {
                        zzhoVar2 = zzhoVar;
                    }
                    zzjq.zzs(obj, j2, zzhoVar2);
                    break;
                case 50:
                    int i8 = zziz.zza;
                    zzjq.zzs(obj, j2, zzih.zza(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2)));
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
                    if (zzM(obj2, i7, i5)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzE(obj, i7, i5);
                        break;
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    zzC(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i7, i5)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzE(obj, i7, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i5);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i5, int i6, zzfz zzfzVar) {
        zzc(obj, bArr, i5, i6, 0, zzfzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzjw zzjwVar) {
        Map.Entry entry;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        zzip<T> zzipVar = this;
        if (zzipVar.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            if (!zzhbVar.zza.isEmpty()) {
                entry = (Map.Entry) zzhbVar.zze().next();
                iArr = zzipVar.zzc;
                Unsafe unsafe = zzb;
                int i8 = 1048575;
                int i9 = 1048575;
                i5 = 0;
                int i10 = 0;
                while (i5 < iArr.length) {
                    int zzs = zzipVar.zzs(i5);
                    int[] iArr2 = zzipVar.zzc;
                    int zzr = zzr(zzs);
                    int i11 = iArr2[i5];
                    if (zzr <= 17) {
                        int i12 = iArr2[i5 + 2];
                        int i13 = i12 & i8;
                        if (i13 != i9) {
                            i10 = i13 == i8 ? 0 : unsafe.getInt(obj, i13);
                            i9 = i13;
                        }
                        int i14 = 1 << (i12 >>> 20);
                        i6 = zzs;
                        i7 = i14;
                    } else {
                        i6 = zzs;
                        i7 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j2 = i6 & i8;
                    switch (zzr) {
                        case 0:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzf(i11, zzjq.zza(obj, j2));
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 1:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzo(i11, zzjq.zzb(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 2:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzt(i11, unsafe.getLong(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 3:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzK(i11, unsafe.getLong(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 4:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzr(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 5:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzm(i11, unsafe.getLong(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 6:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzk(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 7:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzb(i11, zzjq.zzw(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 8:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzO(i11, unsafe.getObject(obj, j2), zzjwVar);
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 9:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzv(i11, unsafe.getObject(obj, j2), zzipVar.zzv(i5));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 10:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzd(i11, (zzgk) unsafe.getObject(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 11:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzI(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 12:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzi(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 13:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzx(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 14:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzz(i11, unsafe.getLong(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 15:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzB(i11, unsafe.getInt(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 16:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzD(i11, unsafe.getLong(obj, j2));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 17:
                            if (zzipVar.zzJ(obj, i5, i9, i10, i7)) {
                                zzjwVar.zzq(i11, unsafe.getObject(obj, j2), zzipVar.zzv(i5));
                            } else {
                                continue;
                            }
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 18:
                            zziz.zzr(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 19:
                            zziz.zzv(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 20:
                            zziz.zzx(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case zzbgj.zzt.zzm /* 21 */:
                            zziz.zzD(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 22:
                            zziz.zzw(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 23:
                            zziz.zzu(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 24:
                            zziz.zzt(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 25:
                            zziz.zzq(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 26:
                            int i15 = zzipVar.zzc[i5];
                            List list = (List) unsafe.getObject(obj, j2);
                            int i16 = zziz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzjwVar.zzH(i15, list);
                                break;
                            }
                            break;
                        case 27:
                            int i17 = zzipVar.zzc[i5];
                            List list2 = (List) unsafe.getObject(obj, j2);
                            zzix zzv = zzipVar.zzv(i5);
                            int i18 = zziz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i19 = 0; i19 < list2.size(); i19++) {
                                    ((zzgs) zzjwVar).zzv(i17, list2.get(i19), zzv);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i20 = zzipVar.zzc[i5];
                            List list3 = (List) unsafe.getObject(obj, j2);
                            int i21 = zziz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzjwVar.zze(i20, list3);
                                break;
                            }
                            break;
                        case 29:
                            zziz.zzC(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 30:
                            zziz.zzs(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 31:
                            zziz.zzy(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 32:
                            zziz.zzz(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 33:
                            zziz.zzA(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 34:
                            zziz.zzB(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                            continue;
                            i5 += 3;
                            i8 = 1048575;
                            zzipVar = this;
                        case 35:
                            zziz.zzr(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 36:
                            zziz.zzv(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 37:
                            zziz.zzx(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 38:
                            zziz.zzD(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 39:
                            zziz.zzw(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 40:
                            zziz.zzu(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 41:
                            zziz.zzt(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 42:
                            zziz.zzq(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 43:
                            zziz.zzC(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 44:
                            zziz.zzs(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 45:
                            zziz.zzy(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 46:
                            zziz.zzz(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 47:
                            zziz.zzA(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 48:
                            zziz.zzB(zzipVar.zzc[i5], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                            break;
                        case 49:
                            int i22 = zzipVar.zzc[i5];
                            List list4 = (List) unsafe.getObject(obj, j2);
                            zzix zzv2 = zzipVar.zzv(i5);
                            int i23 = zziz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                    ((zzgs) zzjwVar).zzq(i22, list4.get(i24), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j2) != null) {
                                throw null;
                            }
                            break;
                        case 51:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzf(i11, zzm(obj, j2));
                                break;
                            }
                            break;
                        case 52:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzo(i11, zzn(obj, j2));
                                break;
                            }
                            break;
                        case 53:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzt(i11, zzt(obj, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzK(i11, zzt(obj, j2));
                                break;
                            }
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzr(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzm(i11, zzt(obj, j2));
                                break;
                            }
                            break;
                        case 57:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzk(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 58:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzb(i11, zzN(obj, j2));
                                break;
                            }
                            break;
                        case 59:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzO(i11, unsafe.getObject(obj, j2), zzjwVar);
                                break;
                            }
                            break;
                        case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzv(i11, unsafe.getObject(obj, j2), zzipVar.zzv(i5));
                                break;
                            }
                            break;
                        case 61:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzd(i11, (zzgk) unsafe.getObject(obj, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzI(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzi(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzx(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 65:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzz(i11, zzt(obj, j2));
                                break;
                            }
                            break;
                        case 66:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzB(i11, zzo(obj, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzD(i11, zzt(obj, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (zzipVar.zzM(obj, i11, i5)) {
                                zzjwVar.zzq(i11, unsafe.getObject(obj, j2), zzipVar.zzv(i5));
                                break;
                            }
                            break;
                    }
                    i5 += 3;
                    i8 = 1048575;
                    zzipVar = this;
                }
                if (entry != null) {
                    ((zzhk) obj).zzc.zzl(zzjwVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzipVar.zzc;
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

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            long j2 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i5) && Double.doubleToLongBits(zzjq.zza(obj, j2)) == Double.doubleToLongBits(zzjq.zza(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i5) && Float.floatToIntBits(zzjq.zzb(obj, j2)) == Float.floatToIntBits(zzjq.zzb(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i5) && zzjq.zzd(obj, j2) == zzjq.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i5) && zzjq.zzd(obj, j2) == zzjq.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i5) && zzjq.zzd(obj, j2) == zzjq.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i5) && zzjq.zzw(obj, j2) == zzjq.zzw(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i5) && zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i5) && zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i5) && zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i5) && zzjq.zzd(obj, j2) == zzjq.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i5) && zzjq.zzc(obj, j2) == zzjq.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i5) && zzjq.zzd(obj, j2) == zzjq.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i5) && zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
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
                    zzE = zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2));
                    break;
                case 50:
                    zzE = zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2));
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
                    long zzp = zzp(i5) & 1048575;
                    if (zzjq.zzc(obj, zzp) == zzjq.zzc(obj2, zzp) && zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i7 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i10 = iArr[i7];
            int i11 = iArr2[i10];
            int zzs = zzs(i10);
            int i12 = this.zzc[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i8 = zzb.getInt(obj, i13);
                }
                i6 = i8;
                i5 = i13;
            } else {
                i5 = i9;
                i6 = i8;
            }
            Object obj2 = obj;
            if ((268435456 & zzs) != 0 && !zzJ(obj2, i10, i5, i6, i14)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj2, i11, i10) && !zzK(obj2, zzs, zzv(i10))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzig) zzjq.zzf(obj2, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzjq.zzf(obj2, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzv = zzv(i10);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!zzv.zzk(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj2, i10, i5, i6, i14) && !zzK(obj2, zzs, zzv(i10))) {
                return false;
            }
            i7++;
            obj = obj2;
            i9 = i5;
            i8 = i6;
        }
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }
}
