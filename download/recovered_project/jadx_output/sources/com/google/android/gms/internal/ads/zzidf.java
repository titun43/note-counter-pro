package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzidf<T> implements zzidu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziem.zzs();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzidc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzief zzm;
    private final zzibc zzn;

    private zzidf(int[] iArr, Object[] objArr, int i5, int i6, zzidc zzidcVar, boolean z4, int[] iArr2, int i7, int i8, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i6;
        this.zzi = zzidcVar instanceof zzibr;
        boolean z5 = false;
        if (zzibcVar != null && (zzidcVar instanceof zzibn)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzj = iArr2;
        this.zzk = i7;
        this.zzl = i8;
        this.zzm = zziefVar;
        this.zzn = zzibcVar;
        this.zzg = zzidcVar;
    }

    private final int zzA(int i5) {
        return this.zzc[i5 + 1];
    }

    private final int zzB(int i5) {
        return this.zzc[i5 + 2];
    }

    private static int zzC(int i5) {
        return (i5 >>> 20) & 255;
    }

    private static boolean zzD(int i5) {
        return (i5 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzibr) {
            return ((zzibr) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j2) {
        return ((Double) zziem.zzn(obj, j2)).doubleValue();
    }

    private static float zzH(Object obj, long j2) {
        return ((Float) zziem.zzn(obj, j2)).floatValue();
    }

    private static int zzI(Object obj, long j2) {
        return ((Integer) zziem.zzn(obj, j2)).intValue();
    }

    private static long zzJ(Object obj, long j2) {
        return ((Long) zziem.zzn(obj, j2)).longValue();
    }

    private static boolean zzK(Object obj, long j2) {
        return ((Boolean) zziem.zzn(obj, j2)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i5) {
        return zzN(obj, i5) == zzN(obj2, i5);
    }

    private final boolean zzM(Object obj, int i5, int i6, int i7, int i8) {
        return i6 == 1048575 ? zzN(obj, i5) : (i7 & i8) != 0;
    }

    private final boolean zzN(Object obj, int i5) {
        int zzB = zzB(i5);
        long j2 = zzB & 1048575;
        if (j2 != 1048575) {
            return (zziem.zzd(obj, j2) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i5);
        long j5 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziem.zzl(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziem.zzj(obj, j5)) != 0;
            case 2:
                return zziem.zzf(obj, j5) != 0;
            case 3:
                return zziem.zzf(obj, j5) != 0;
            case 4:
                return zziem.zzd(obj, j5) != 0;
            case 5:
                return zziem.zzf(obj, j5) != 0;
            case 6:
                return zziem.zzd(obj, j5) != 0;
            case 7:
                return zziem.zzh(obj, j5);
            case 8:
                Object zzn = zziem.zzn(obj, j5);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzian) {
                    return !zzian.zza.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziem.zzn(obj, j5) != null;
            case 10:
                return !zzian.zza.equals(zziem.zzn(obj, j5));
            case 11:
                return zziem.zzd(obj, j5) != 0;
            case 12:
                return zziem.zzd(obj, j5) != 0;
            case 13:
                return zziem.zzd(obj, j5) != 0;
            case 14:
                return zziem.zzf(obj, j5) != 0;
            case 15:
                return zziem.zzd(obj, j5) != 0;
            case 16:
                return zziem.zzf(obj, j5) != 0;
            case 17:
                return zziem.zzn(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i5) {
        int zzB = zzB(i5);
        long j2 = 1048575 & zzB;
        if (j2 == 1048575) {
            return;
        }
        zziem.zze(obj, j2, (1 << (zzB >>> 20)) | zziem.zzd(obj, j2));
    }

    private final boolean zzP(Object obj, int i5, int i6) {
        return zziem.zzd(obj, (long) (zzB(i6) & 1048575)) == i5;
    }

    private final void zzQ(Object obj, int i5, int i6) {
        zziem.zze(obj, zzB(i6) & 1048575, i5);
    }

    private final int zzR(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzS(i5, 0);
    }

    private final int zzS(int i5, int i6) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i6 <= length) {
            int i7 = (length + i6) >>> 1;
            int i8 = i7 * 3;
            int i9 = iArr[i8];
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

    private static final int zzT(byte[] bArr, int i5, int i6, zzies zziesVar, Class cls, zziab zziabVar) {
        zzies zziesVar2 = zzies.zza;
        switch (zziesVar.ordinal()) {
            case 0:
                int i7 = i5 + 8;
                zziabVar.zzc = Double.valueOf(Double.longBitsToDouble(zziac.zze(bArr, i5)));
                return i7;
            case 1:
                int i8 = i5 + 4;
                zziabVar.zzc = Float.valueOf(Float.intBitsToFloat(zziac.zzd(bArr, i5)));
                return i8;
            case 2:
            case 3:
                int zzc = zziac.zzc(bArr, i5, zziabVar);
                zziabVar.zzc = Long.valueOf(zziabVar.zzb);
                return zzc;
            case 4:
            case 12:
            case 13:
                int zza2 = zziac.zza(bArr, i5, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziabVar.zza);
                return zza2;
            case 5:
            case 15:
                int i9 = i5 + 8;
                zziabVar.zzc = Long.valueOf(zziac.zze(bArr, i5));
                return i9;
            case 6:
            case 14:
                int i10 = i5 + 4;
                zziabVar.zzc = Integer.valueOf(zziac.zzd(bArr, i5));
                return i10;
            case 7:
                int zzc2 = zziac.zzc(bArr, i5, zziabVar);
                zziabVar.zzc = Boolean.valueOf(zziabVar.zzb != 0);
                return zzc2;
            case 8:
                return zziac.zzf(bArr, i5, zziabVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zziac.zzh(zzidm.zza().zzb(cls), bArr, i5, i6, zziabVar);
            case 11:
                return zziac.zzg(bArr, i5, zziabVar);
            case 16:
                int zza3 = zziac.zza(bArr, i5, zziabVar);
                zziabVar.zzc = Integer.valueOf(zziaq.zzK(zziabVar.zza));
                return zza3;
            case 17:
                int zzc3 = zziac.zzc(bArr, i5, zziabVar);
                zziabVar.zzc = Long.valueOf(zziaq.zzL(zziabVar.zzb));
                return zzc3;
        }
    }

    private static final void zzU(int i5, Object obj, zzieu zzieuVar) {
        if (obj instanceof String) {
            zzieuVar.zzm(i5, (String) obj);
        } else {
            zzieuVar.zzn(i5, (zzian) obj);
        }
    }

    public static zzieg zzh(Object obj) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        if (zziegVar != zzieg.zza()) {
            return zziegVar;
        }
        zzieg zzb2 = zzieg.zzb();
        zzibrVar.zzt = zzb2;
        return zzb2;
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
    public static zzidf zzm(Class cls, zzicz zziczVar, zzidi zzidiVar, zzico zzicoVar, zzief zziefVar, zzibc zzibcVar, zzicx zzicxVar) {
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
        Field zzn;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i34;
        char charAt11;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        if (!(zziczVar instanceof zzido)) {
            throw null;
        }
        zzido zzidoVar = (zzido) zziczVar;
        String zzd = zzidoVar.zzd();
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
        Object[] zze = zzidoVar.zze();
        Class<?> cls2 = zzidoVar.zzb().getClass();
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
            zzido zzidoVar2 = zzidoVar;
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
                        if (zzidoVar2.zzc() == 1 || i83 != 0) {
                            i32 = i10 + 1;
                            int i91 = i73 / 3;
                            objArr[i91 + i91 + 1] = zze[i10];
                        } else {
                            i33 = 0;
                            int i92 = charAt25 + charAt25;
                            obj = zze[i92];
                            int i93 = i33;
                            if (obj instanceof Field) {
                                zzn2 = (Field) obj;
                            } else {
                                zzn2 = zzn(cls2, (String) obj);
                                zze[i92] = zzn2;
                            }
                            int i94 = i11;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                            int i95 = i92 + 1;
                            obj2 = zze[i95];
                            i23 = i94;
                            if (obj2 instanceof Field) {
                                zzn3 = (Field) obj2;
                            } else {
                                zzn3 = zzn(cls2, (String) obj2);
                                zze[i95] = zzn3;
                            }
                            i25 = (int) unsafe.objectFieldOffset(zzn3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                    int i952 = i922 + 1;
                    obj2 = zze[i952];
                    i23 = i942;
                    if (obj2 instanceof Field) {
                    }
                    i25 = (int) unsafe.objectFieldOffset(zzn3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                int i9522 = i9222 + 1;
                obj2 = zze[i9522];
                i23 = i9422;
                if (obj2 instanceof Field) {
                }
                i25 = (int) unsafe.objectFieldOffset(zzn3);
                str = zzd;
                i27 = i9322;
                i21 = i88;
                i26 = 0;
                c5 = 55296;
            } else {
                i22 = length;
                i23 = i11;
                int i96 = i10 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i10]);
                if (i82 == 9 || i82 == 17) {
                    i24 = i96;
                    int i97 = i73 / 3;
                    objArr[i97 + i97 + 1] = zzn4.getType();
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
                        if (zzidoVar2.zzc() == 1 || i83 != 0) {
                            i10 += 2;
                            int i98 = i73 / 3;
                            objArr[i98 + i98 + 1] = zze[i96];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                                    zzn = (Field) obj3;
                                } else {
                                    zzn = zzn(cls2, (String) obj3);
                                    zze[i102] = zzn;
                                }
                                i26 = charAt26 % 32;
                                i21 = i28;
                                c5 = 55296;
                                i25 = (int) unsafe.objectFieldOffset(zzn);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
            zzidoVar = zzidoVar2;
            length = i22;
            i11 = i23;
        }
        return new zzidf(iArr3, objArr, i6, i8, zzidoVar.zzb(), false, iArr, i9, i68, zzidiVar, zzicoVar, zziefVar, zzibcVar, zzicxVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            s.c.e(sb, "Field ", str, " for ", name);
            throw new RuntimeException(s.c.d(sb, " not found. Known fields are ", arrays), e4);
        }
    }

    private final void zzo(Object obj, Object obj2, int i5) {
        if (zzN(obj2, i5)) {
            int zzA = zzA(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzA;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i6 = this.zzc[i5];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(u.b(i6, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i6);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzidu zzq = zzq(i5);
            if (!zzN(obj, i5)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j2, zza2);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzO(obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j2, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i5) {
        int[] iArr = this.zzc;
        int i6 = iArr[i5];
        if (zzP(obj2, i6, i5)) {
            int zzA = zzA(i5) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzA;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i7 = iArr[i5];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(u.b(i7, 38) + obj3.length());
                sb.append("Source subfield ");
                sb.append(i7);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zzidu zzq = zzq(i5);
            if (!zzP(obj, i6, i5)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j2, zza2);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzQ(obj, i6, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j2, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zzidu zzq(int i5) {
        Object[] objArr = this.zzd;
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        zzidu zziduVar = (zzidu) objArr[i7];
        if (zziduVar != null) {
            return zziduVar;
        }
        zzidu zzb2 = zzidm.zza().zzb((Class) objArr[i7 + 1]);
        objArr[i7] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i5) {
        int i6 = i5 / 3;
        return this.zzd[i6 + i6];
    }

    private final zzibx zzs(int i5) {
        int i6 = i5 / 3;
        return (zzibx) this.zzd[i6 + i6 + 1];
    }

    private final Object zzt(Object obj, int i5) {
        zzidu zzq = zzq(i5);
        int zzA = zzA(i5) & 1048575;
        if (!zzN(obj, i5)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i5, Object obj2) {
        zzb.putObject(obj, zzA(i5) & 1048575, obj2);
        zzO(obj, i5);
    }

    private final Object zzv(Object obj, int i5, int i6) {
        zzidu zzq = zzq(i6);
        if (!zzP(obj, i5, i6)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i6) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i5, int i6, Object obj2) {
        zzb.putObject(obj, zzA(i6) & 1048575, obj2);
        zzQ(obj, i5, i6);
    }

    private final Object zzx(Object obj, int i5, Object obj2, zzief zziefVar, Object obj3) {
        zzibx zzs;
        int i6 = this.zzc[i5];
        Object zzn = zziem.zzn(obj, zzA(i5) & 1048575);
        if (zzn == null || (zzs = zzs(i5)) == null) {
            return obj2;
        }
        zzicu zze = ((zzicv) zzr(i5)).zze();
        Iterator it = ((zzicw) zzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zziefVar.zzh(obj3);
                }
                int zzc = zzicv.zzc(zze, entry.getKey(), entry.getValue());
                zzian zzianVar = zzian.zza;
                byte[] bArr = new byte[zzc];
                int i7 = zziaw.zzf;
                zziat zziatVar = new zziat(bArr, 0, zzc);
                try {
                    zzicv.zzb(zziatVar, zze, entry.getKey(), entry.getValue());
                    zziefVar.zzd(obj2, i6, zziaj.zza(zziatVar, bArr));
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i5, zzidu zziduVar) {
        return zziduVar.zzl(zziem.zzn(obj, i5 & 1048575));
    }

    private final void zzz(Object obj, int i5, zzidp zzidpVar) {
        long j2 = i5 & 1048575;
        if (zzD(i5)) {
            zziem.zzo(obj, j2, zzidpVar.zzn());
        } else if (this.zzi) {
            zziem.zzo(obj, j2, zzidpVar.zzm());
        } else {
            zziem.zzo(obj, j2, zzidpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final Object zza() {
        return ((zzibr) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzG;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzA = zzA(i5);
            long j2 = zzA & 1048575;
            switch (zzC(zzA)) {
                case 0:
                    if (zzL(obj, obj2, i5) && Double.doubleToLongBits(zziem.zzl(obj, j2)) == Double.doubleToLongBits(zziem.zzl(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i5) && Float.floatToIntBits(zziem.zzj(obj, j2)) == Float.floatToIntBits(zziem.zzj(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i5) && zziem.zzf(obj, j2) == zziem.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i5) && zziem.zzf(obj, j2) == zziem.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i5) && zziem.zzf(obj, j2) == zziem.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i5) && zziem.zzh(obj, j2) == zziem.zzh(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i5) && zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i5) && zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i5) && zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i5) && zziem.zzf(obj, j2) == zziem.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i5) && zziem.zzd(obj, j2) == zziem.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i5) && zziem.zzf(obj, j2) == zziem.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i5) && zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2))) {
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
                    zzG = zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2));
                    break;
                case 50:
                    zzG = zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2));
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
                    long zzB = zzB(i5) & 1048575;
                    if (zziem.zzd(obj, zzB) == zziem.zzd(obj2, zzB) && zzidw.zzG(zziem.zzn(obj, j2), zziem.zzn(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!((zzibr) obj).zzt.equals(((zzibr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzibn) obj).zza.equals(((zzibn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zzc(Object obj) {
        int i5;
        long doubleToLongBits;
        int i6;
        int floatToIntBits;
        int zzd;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i8 >= iArr.length) {
                int hashCode = ((zzibr) obj).zzt.hashCode() + (i9 * 53);
                return this.zzh ? (hashCode * 53) + ((zzibn) obj).zza.zza.hashCode() : hashCode;
            }
            int zzA = zzA(i8);
            int i10 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i11 = iArr[i8];
            long j2 = i10;
            int i12 = 37;
            switch (zzC) {
                case 0:
                    i5 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zziem.zzl(obj, j2));
                    byte[] bArr = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 1:
                    i6 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(zziem.zzj(obj, j2));
                    i9 = floatToIntBits + i6;
                    break;
                case 2:
                    i5 = i9 * 53;
                    doubleToLongBits = zziem.zzf(obj, j2);
                    byte[] bArr2 = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 3:
                    i5 = i9 * 53;
                    doubleToLongBits = zziem.zzf(obj, j2);
                    byte[] bArr3 = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 4:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 5:
                    i5 = i9 * 53;
                    doubleToLongBits = zziem.zzf(obj, j2);
                    byte[] bArr4 = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 6:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 7:
                    i6 = i9 * 53;
                    floatToIntBits = zzice.zzb(zziem.zzh(obj, j2));
                    i9 = floatToIntBits + i6;
                    break;
                case 8:
                    i6 = i9 * 53;
                    floatToIntBits = ((String) zziem.zzn(obj, j2)).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object zzn = zziem.zzn(obj, j2);
                    if (zzn != null) {
                        i12 = zzn.hashCode();
                    }
                    i9 = i7 + i12;
                    break;
                case 10:
                    i6 = i9 * 53;
                    floatToIntBits = zziem.zzn(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 11:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 12:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 13:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 14:
                    i5 = i9 * 53;
                    doubleToLongBits = zziem.zzf(obj, j2);
                    byte[] bArr5 = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 15:
                    i5 = i9 * 53;
                    zzd = zziem.zzd(obj, j2);
                    i9 = i5 + zzd;
                    break;
                case 16:
                    i5 = i9 * 53;
                    doubleToLongBits = zziem.zzf(obj, j2);
                    byte[] bArr6 = zzice.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i9 = i5 + zzd;
                    break;
                case 17:
                    i7 = i9 * 53;
                    Object zzn2 = zziem.zzn(obj, j2);
                    if (zzn2 != null) {
                        i12 = zzn2.hashCode();
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
                    floatToIntBits = zziem.zzn(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 50:
                    i6 = i9 * 53;
                    floatToIntBits = zziem.zzn(obj, j2).hashCode();
                    i9 = floatToIntBits + i6;
                    break;
                case 51:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzG(obj, j2));
                        byte[] bArr7 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(zzH(obj, j2));
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 53:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzJ(obj, j2);
                        byte[] bArr8 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzJ(obj, j2);
                        byte[] bArr9 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzJ(obj, j2);
                        byte[] bArr10 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 58:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zzice.zzb(zzK(obj, j2));
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = ((String) zziem.zzn(obj, j2)).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zziem.zzn(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 61:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zziem.zzn(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
                case 62:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 63:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 65:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzJ(obj, j2);
                        byte[] bArr11 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case 66:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        zzd = zzI(obj, j2);
                        i9 = i5 + zzd;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        doubleToLongBits = zzJ(obj, j2);
                        byte[] bArr12 = zzice.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i9 = i5 + zzd;
                        break;
                    }
                case 68:
                    if (!zzP(obj, i11, i8)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        floatToIntBits = zziem.zzn(obj, j2).hashCode();
                        i9 = floatToIntBits + i6;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                zzidw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzidw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i5);
            int i6 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i7 = iArr[i5];
            long j2 = i6;
            switch (zzC) {
                case 0:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzm(obj, j2, zziem.zzl(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzk(obj, j2, zziem.zzj(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzg(obj, j2, zziem.zzf(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzg(obj, j2, zziem.zzf(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzg(obj, j2, zziem.zzf(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzi(obj, j2, zziem.zzh(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzo(obj, j2, zziem.zzn(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i5);
                    break;
                case 10:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzo(obj, j2, zziem.zzn(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzg(obj, j2, zziem.zzf(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zze(obj, j2, zziem.zzd(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i5)) {
                        break;
                    } else {
                        zziem.zzg(obj, j2, zziem.zzf(obj2, j2));
                        zzO(obj, i5);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i5);
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
                    zzicd zzicdVar = (zzicd) zziem.zzn(obj, j2);
                    zzicd zzicdVar2 = (zzicd) zziem.zzn(obj2, j2);
                    int size = zzicdVar.size();
                    int size2 = zzicdVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzicdVar.zza()) {
                            zzicdVar = zzicdVar.zzh(size2 + size);
                        }
                        zzicdVar.addAll(zzicdVar2);
                    }
                    if (size > 0) {
                        zzicdVar2 = zzicdVar;
                    }
                    zziem.zzo(obj, j2, zzicdVar2);
                    break;
                case 50:
                    int i8 = zzidw.zza;
                    zziem.zzo(obj, j2, zzicx.zzb(zziem.zzn(obj, j2), zziem.zzn(obj2, j2)));
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
                    if (!zzP(obj2, i7, i5)) {
                        break;
                    } else {
                        zziem.zzo(obj, j2, zziem.zzn(obj2, j2));
                        zzQ(obj, i7, i5);
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    zzp(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzP(obj2, i7, i5)) {
                        break;
                    } else {
                        zziem.zzo(obj, j2, zziem.zzn(obj2, j2));
                        zzQ(obj, i7, i5);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i5);
                    break;
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final int zze(Object obj) {
        int i5;
        int zzA;
        int zzB;
        int zzD;
        int zzA2;
        int size;
        int zzt;
        int zzA3;
        int zzA4;
        int zzA5;
        int i6;
        int zzA6;
        int zzB2;
        zzidf<T> zzidfVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = zzidfVar.zzc;
            if (i8 >= iArr.length) {
                int zzi = ((zzibr) obj).zzt.zzi() + i10;
                if (!zzidfVar.zzh) {
                    return zzi;
                }
                zzieb zziebVar = ((zzibn) obj).zza.zza;
                int zzc = zziebVar.zzc();
                int i12 = 0;
                for (int i13 = 0; i13 < zzc; i13++) {
                    Map.Entry zzd = zziebVar.zzd(i13);
                    i12 += zzibg.zzj((zzibf) ((zzidy) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zziebVar.zze()) {
                    i12 += zzibg.zzj((zzibf) entry.getKey(), entry.getValue());
                }
                return zzi + i12;
            }
            int zzA7 = zzidfVar.zzA(i8);
            int zzC = zzC(zzA7);
            int i14 = iArr[i8];
            int i15 = iArr[i8 + 2];
            int i16 = i15 & i7;
            if (zzC <= 17) {
                if (i16 != i11) {
                    i9 = i16 == i7 ? 0 : unsafe.getInt(obj2, i16);
                    i11 = i16;
                }
                i5 = 1 << (i15 >>> 20);
            } else {
                i5 = 0;
            }
            int i17 = zzA7 & i7;
            if (zzC >= zzibh.zzJ.zza()) {
                zzibh.zzW.zza();
            }
            long j2 = i17;
            switch (zzC) {
                case 0:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 4, i10);
                    }
                    zzidfVar = this;
                    break;
                case 2:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        long j5 = unsafe.getLong(obj2, j2);
                        zzA = zziaw.zzA(i14 << 3);
                        zzB = zziaw.zzB(j5);
                        i10 += zzB + zzA;
                    }
                    zzidfVar = this;
                    break;
                case 3:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        long j6 = unsafe.getLong(obj2, j2);
                        zzA = zziaw.zzA(i14 << 3);
                        zzB = zziaw.zzB(j6);
                        i10 += zzB + zzA;
                    }
                    zzidfVar = this;
                    break;
                case 4:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        long j7 = unsafe.getInt(obj2, j2);
                        zzA = zziaw.zzA(i14 << 3);
                        zzB = zziaw.zzB(j7);
                        i10 += zzB + zzA;
                    }
                    zzidfVar = this;
                    break;
                case 5:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 8, i10);
                    }
                    zzidfVar = this;
                    break;
                case 6:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 4, i10);
                    }
                    zzidfVar = this;
                    break;
                case 7:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 1, i10);
                    }
                    zzidfVar = this;
                    break;
                case 8:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j2);
                        if (object instanceof zzian) {
                            int zzA8 = zziaw.zzA(i18);
                            int zzc2 = ((zzian) object).zzc();
                            i10 = u.w(zzc2, zzc2, zzA8, i10);
                        } else {
                            int zzA9 = zziaw.zzA(i18);
                            int zzc3 = zzier.zzc((String) object);
                            i10 = u.w(zzc3, zzc3, zzA9, i10);
                        }
                    }
                    zzidfVar = this;
                    break;
                case 9:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        zzD = zzidw.zzD(i14, unsafe.getObject(obj2, j2), zzidfVar.zzq(i8));
                        i10 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        zzian zzianVar = (zzian) unsafe.getObject(obj2, j2);
                        int zzA10 = zziaw.zzA(i14 << 3);
                        int zzc4 = zzianVar.zzc();
                        i10 = u.w(zzc4, zzc4, zzA10, i10);
                    }
                    zzidfVar = this;
                    break;
                case 11:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(unsafe.getInt(obj2, j2), zziaw.zzA(i14 << 3), i10);
                    }
                    zzidfVar = this;
                    break;
                case 12:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        long j8 = unsafe.getInt(obj2, j2);
                        zzA = zziaw.zzA(i14 << 3);
                        zzB = zziaw.zzB(j8);
                        i10 += zzB + zzA;
                    }
                    zzidfVar = this;
                    break;
                case 13:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 4, i10);
                    }
                    zzidfVar = this;
                    break;
                case 14:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        i10 = u.c(i14 << 3, 8, i10);
                    }
                    zzidfVar = this;
                    break;
                case 15:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        int i19 = unsafe.getInt(obj2, j2);
                        i10 = u.c((i19 >> 31) ^ (i19 + i19), zziaw.zzA(i14 << 3), i10);
                    }
                    zzidfVar = this;
                    break;
                case 16:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        long j9 = unsafe.getLong(obj2, j2);
                        zzA = zziaw.zzA(i14 << 3);
                        zzB = zziaw.zzB((j9 >> 63) ^ (j9 + j9));
                        i10 += zzB + zzA;
                    }
                    zzidfVar = this;
                    break;
                case 17:
                    if (zzidfVar.zzM(obj2, i8, i11, i9, i5)) {
                        zzD = zzidw.zzE(i14, (zzidc) unsafe.getObject(obj2, j2), zzidfVar.zzq(i8));
                        i10 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzD = zzidw.zzC(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 19:
                    zzD = zzidw.zzA(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j2);
                    int i20 = zzidw.zza;
                    if (list.size() != 0) {
                        zzA2 = (zziaw.zzA(i14 << 3) * list.size()) + zzidw.zzs(list);
                        i10 += zzA2;
                        break;
                    }
                    zzA2 = 0;
                    i10 += zzA2;
                case zzbgj.zzt.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    int i21 = zzidw.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzt = zzidw.zzt(list2);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    int i22 = zzidw.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzt = zzidw.zzw(list3);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 23:
                    zzD = zzidw.zzC(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 24:
                    zzD = zzidw.zzA(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    int i23 = zzidw.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzA2 = (zziaw.zzA(i14 << 3) + 1) * size2;
                        i10 += zzA2;
                        break;
                    }
                    zzA2 = 0;
                    i10 += zzA2;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j2);
                    int i24 = zzidw.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzA4 = zziaw.zzA(i14 << 3) * size3;
                        if (list5 instanceof zzicn) {
                            zzicn zzicnVar = (zzicn) list5;
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object zzc5 = zzicnVar.zzc();
                                if (zzc5 instanceof zzian) {
                                    int zzc6 = ((zzian) zzc5).zzc();
                                    zzA4 = u.c(zzc6, zzc6, zzA4);
                                } else {
                                    int zzc7 = zzier.zzc((String) zzc5);
                                    zzA4 = u.c(zzc7, zzc7, zzA4);
                                }
                            }
                        } else {
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj3 = list5.get(i26);
                                if (obj3 instanceof zzian) {
                                    int zzc8 = ((zzian) obj3).zzc();
                                    zzA4 = u.c(zzc8, zzc8, zzA4);
                                } else {
                                    int zzc9 = zzier.zzc((String) obj3);
                                    zzA4 = u.c(zzc9, zzc9, zzA4);
                                }
                            }
                        }
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j2);
                    zzidu zzq = zzidfVar.zzq(i8);
                    int i27 = zzidw.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA5 = 0;
                    } else {
                        zzA5 = zziaw.zzA(i14 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            Object obj4 = list6.get(i28);
                            if (obj4 instanceof zzicm) {
                                int zzb2 = ((zzicm) obj4).zzb();
                                zzA5 = u.c(zzb2, zzb2, zzA5);
                            } else {
                                int zzaT = ((zzhzw) obj4).zzaT(zzq);
                                zzA5 = u.c(zzaT, zzaT, zzA5);
                            }
                        }
                    }
                    i10 += zzA5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j2);
                    int i29 = zzidw.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzA4 = zziaw.zzA(i14 << 3) * size5;
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int zzc10 = ((zzian) list7.get(i30)).zzc();
                            zzA4 = u.c(zzc10, zzc10, zzA4);
                        }
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j2);
                    int i31 = zzidw.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzt = zzidw.zzx(list8);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j2);
                    int i32 = zzidw.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzt = zzidw.zzv(list9);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 31:
                    zzD = zzidw.zzA(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 32:
                    zzD = zzidw.zzC(i14, (List) unsafe.getObject(obj2, j2), false);
                    i10 += zzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j2);
                    int i33 = zzidw.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzt = zzidw.zzy(list10);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j2);
                    int i34 = zzidw.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzt = zzidw.zzu(list11);
                        zzA3 = zziaw.zzA(i14 << 3);
                        zzA4 = (zzA3 * size) + zzt;
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 35:
                    int zzB3 = zzidw.zzB((List) unsafe.getObject(obj2, j2));
                    if (zzB3 > 0) {
                        i10 = u.w(zzB3, zziaw.zzA(i14 << 3), zzB3, i10);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzz = zzidw.zzz((List) unsafe.getObject(obj2, j2));
                    if (zzz > 0) {
                        i10 = u.w(zzz, zziaw.zzA(i14 << 3), zzz, i10);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzs = zzidw.zzs((List) unsafe.getObject(obj2, j2));
                    if (zzs > 0) {
                        i10 = u.w(zzs, zziaw.zzA(i14 << 3), zzs, i10);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzt2 = zzidw.zzt((List) unsafe.getObject(obj2, j2));
                    if (zzt2 > 0) {
                        i10 = u.w(zzt2, zziaw.zzA(i14 << 3), zzt2, i10);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzw = zzidw.zzw((List) unsafe.getObject(obj2, j2));
                    if (zzw > 0) {
                        i10 = u.w(zzw, zziaw.zzA(i14 << 3), zzw, i10);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzB4 = zzidw.zzB((List) unsafe.getObject(obj2, j2));
                    if (zzB4 > 0) {
                        i10 = u.w(zzB4, zziaw.zzA(i14 << 3), zzB4, i10);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzz2 = zzidw.zzz((List) unsafe.getObject(obj2, j2));
                    if (zzz2 > 0) {
                        i10 = u.w(zzz2, zziaw.zzA(i14 << 3), zzz2, i10);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j2);
                    int i35 = zzidw.zza;
                    int size6 = list12.size();
                    if (size6 > 0) {
                        i10 = u.w(size6, zziaw.zzA(i14 << 3), size6, i10);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzx = zzidw.zzx((List) unsafe.getObject(obj2, j2));
                    if (zzx > 0) {
                        i10 = u.w(zzx, zziaw.zzA(i14 << 3), zzx, i10);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzv = zzidw.zzv((List) unsafe.getObject(obj2, j2));
                    if (zzv > 0) {
                        i10 = u.w(zzv, zziaw.zzA(i14 << 3), zzv, i10);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzz3 = zzidw.zzz((List) unsafe.getObject(obj2, j2));
                    if (zzz3 > 0) {
                        i10 = u.w(zzz3, zziaw.zzA(i14 << 3), zzz3, i10);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzB5 = zzidw.zzB((List) unsafe.getObject(obj2, j2));
                    if (zzB5 > 0) {
                        i10 = u.w(zzB5, zziaw.zzA(i14 << 3), zzB5, i10);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzy = zzidw.zzy((List) unsafe.getObject(obj2, j2));
                    if (zzy > 0) {
                        i10 = u.w(zzy, zziaw.zzA(i14 << 3), zzy, i10);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzu = zzidw.zzu((List) unsafe.getObject(obj2, j2));
                    if (zzu > 0) {
                        i10 = u.w(zzu, zziaw.zzA(i14 << 3), zzu, i10);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j2);
                    zzidu zzq2 = zzidfVar.zzq(i8);
                    int i36 = zzidw.zza;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i37 = 0; i37 < size7; i37++) {
                            i6 += zzidw.zzE(i14, (zzidc) list13.get(i37), zzq2);
                        }
                    }
                    i10 += i6;
                    break;
                case 50:
                    zzicw zzicwVar = (zzicw) unsafe.getObject(obj2, j2);
                    zzicv zzicvVar = (zzicv) zzidfVar.zzr(i8);
                    if (!zzicwVar.isEmpty()) {
                        zzA4 = 0;
                        for (Map.Entry entry2 : zzicwVar.entrySet()) {
                            zzA4 += zzicvVar.zzd(i14, entry2.getKey(), entry2.getValue());
                        }
                        i10 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i10 += zzA4;
                case 51:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        long zzJ = zzJ(obj2, j2);
                        zzA6 = zziaw.zzA(i14 << 3);
                        zzB2 = zziaw.zzB(zzJ);
                        i10 += zzB2 + zzA6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        long zzJ2 = zzJ(obj2, j2);
                        zzA6 = zziaw.zzA(i14 << 3);
                        zzB2 = zziaw.zzB(zzJ2);
                        i10 += zzB2 + zzA6;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        long zzI = zzI(obj2, j2);
                        zzA6 = zziaw.zzA(i14 << 3);
                        zzB2 = zziaw.zzB(zzI);
                        i10 += zzB2 + zzA6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        int i38 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j2);
                        if (object2 instanceof zzian) {
                            int zzA11 = zziaw.zzA(i38);
                            int zzc11 = ((zzian) object2).zzc();
                            i10 = u.w(zzc11, zzc11, zzA11, i10);
                            break;
                        } else {
                            int zzA12 = zziaw.zzA(i38);
                            int zzc12 = zzier.zzc((String) object2);
                            i10 = u.w(zzc12, zzc12, zzA12, i10);
                            break;
                        }
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        zzD = zzidw.zzD(i14, unsafe.getObject(obj2, j2), zzidfVar.zzq(i8));
                        i10 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        zzian zzianVar2 = (zzian) unsafe.getObject(obj2, j2);
                        int zzA13 = zziaw.zzA(i14 << 3);
                        int zzc13 = zzianVar2.zzc();
                        i10 = u.w(zzc13, zzc13, zzA13, i10);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(zzI(obj2, j2), zziaw.zzA(i14 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        long zzI2 = zzI(obj2, j2);
                        zzA6 = zziaw.zzA(i14 << 3);
                        zzB2 = zziaw.zzB(zzI2);
                        i10 += zzB2 + zzA6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        i10 = u.c(i14 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        int zzI3 = zzI(obj2, j2);
                        i10 = u.c((zzI3 >> 31) ^ (zzI3 + zzI3), zziaw.zzA(i14 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        long zzJ3 = zzJ(obj2, j2);
                        zzA6 = zziaw.zzA(i14 << 3);
                        zzB2 = zziaw.zzB((zzJ3 >> 63) ^ (zzJ3 + zzJ3));
                        i10 += zzB2 + zzA6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzidfVar.zzP(obj2, i14, i8)) {
                        zzD = zzidw.zzE(i14, (zzidc) unsafe.getObject(obj2, j2), zzidfVar.zzq(i8));
                        i10 += zzD;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzieu zzieuVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i5;
        boolean z4;
        Map.Entry entry2;
        int i6;
        int i7;
        int i8;
        int i9;
        zzidf<T> zzidfVar = this;
        if (zzidfVar.zzh) {
            zzibg zzibgVar = ((zzibn) obj).zza;
            if (!zzibgVar.zza.isEmpty()) {
                Iterator zzc = zzibgVar.zzc();
                entry = (Map.Entry) zzc.next();
                it = zzc;
                iArr = zzidfVar.zzc;
                Unsafe unsafe = zzb;
                int i10 = 1048575;
                int i11 = 1048575;
                i5 = 0;
                int i12 = 0;
                while (i5 < iArr.length) {
                    int zzA = zzidfVar.zzA(i5);
                    int zzC = zzC(zzA);
                    int i13 = iArr[i5];
                    if (zzC <= 17) {
                        int i14 = iArr[i5 + 2];
                        z4 = true;
                        int i15 = i14 & i10;
                        if (i15 != i11) {
                            i12 = i15 == i10 ? 0 : unsafe.getInt(obj, i15);
                            i11 = i15;
                        }
                        int i16 = 1 << (i14 >>> 20);
                        entry2 = entry;
                        i6 = i11;
                        i7 = i12;
                        i8 = i16;
                    } else {
                        z4 = true;
                        entry2 = entry;
                        i6 = i11;
                        i7 = i12;
                        i8 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzibc zzibcVar = zzidfVar.zzn;
                            i9 = i10;
                            if (((zzibo) entry2.getKey()).zza <= i13) {
                                zzibcVar.zzb(zzieuVar, entry2);
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                    i10 = i9;
                                } else {
                                    i10 = i9;
                                    entry2 = null;
                                }
                            }
                        } else {
                            i9 = i10;
                        }
                    }
                    long j2 = zzA & i9;
                    switch (zzC) {
                        case 0:
                            if (!zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                break;
                            } else {
                                zzieuVar.zzf(i13, zziem.zzl(obj, j2));
                                break;
                            }
                        case 1:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zze(i13, zziem.zzj(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 2:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzc(i13, unsafe.getLong(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 3:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzh(i13, unsafe.getLong(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 4:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzi(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 5:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzj(i13, unsafe.getLong(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 6:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzk(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 7:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzl(i13, zziem.zzh(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 8:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzU(i13, unsafe.getObject(obj, j2), zzieuVar);
                            }
                            zzidfVar = this;
                            break;
                        case 9:
                            if (!zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                break;
                            } else {
                                zzieuVar.zzr(i13, unsafe.getObject(obj, j2), zzidfVar.zzq(i5));
                                break;
                            }
                        case 10:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzn(i13, (zzian) unsafe.getObject(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 11:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzo(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 12:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzg(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 13:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzb(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 14:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzd(i13, unsafe.getLong(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 15:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzp(i13, unsafe.getInt(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 16:
                            if (zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                zzieuVar.zzq(i13, unsafe.getLong(obj, j2));
                            }
                            zzidfVar = this;
                            break;
                        case 17:
                            if (!zzidfVar.zzM(obj, i5, i6, i7, i8)) {
                                break;
                            } else {
                                zzieuVar.zzs(i13, unsafe.getObject(obj, j2), zzidfVar.zzq(i5));
                                break;
                            }
                        case 18:
                            zzidw.zza(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 19:
                            zzidw.zzb(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 20:
                            zzidw.zzc(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case zzbgj.zzt.zzm /* 21 */:
                            zzidw.zzd(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 22:
                            zzidw.zzh(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 23:
                            zzidw.zzf(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 24:
                            zzidw.zzk(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 25:
                            zzidw.zzn(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 26:
                            zzidw.zzo(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar);
                            break;
                        case 27:
                            zzidw.zzq(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, zzidfVar.zzq(i5));
                            break;
                        case 28:
                            zzidw.zzp(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar);
                            break;
                        case 29:
                            zzidw.zzi(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 30:
                            zzidw.zzm(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 31:
                            zzidw.zzl(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 32:
                            zzidw.zzg(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 33:
                            zzidw.zzj(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 34:
                            zzidw.zze(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, false);
                            break;
                        case 35:
                            zzidw.zza(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 36:
                            zzidw.zzb(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 37:
                            zzidw.zzc(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 38:
                            zzidw.zzd(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 39:
                            zzidw.zzh(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 40:
                            zzidw.zzf(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 41:
                            zzidw.zzk(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 42:
                            zzidw.zzn(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 43:
                            zzidw.zzi(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 44:
                            zzidw.zzm(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 45:
                            zzidw.zzl(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 46:
                            zzidw.zzg(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 47:
                            zzidw.zzj(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 48:
                            zzidw.zze(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, z4);
                            break;
                        case 49:
                            zzidw.zzr(iArr[i5], (List) unsafe.getObject(obj, j2), zzieuVar, zzidfVar.zzq(i5));
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                zzieuVar.zzM(i13, ((zzicv) zzidfVar.zzr(i5)).zze(), (zzicw) object);
                            }
                            break;
                        case 51:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzf(i13, zzG(obj, j2));
                            }
                            break;
                        case 52:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zze(i13, zzH(obj, j2));
                            }
                            break;
                        case 53:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzc(i13, zzJ(obj, j2));
                            }
                            break;
                        case 54:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzh(i13, zzJ(obj, j2));
                            }
                            break;
                        case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzi(i13, zzI(obj, j2));
                            }
                            break;
                        case 56:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzj(i13, zzJ(obj, j2));
                            }
                            break;
                        case 57:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzk(i13, zzI(obj, j2));
                            }
                            break;
                        case 58:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzl(i13, zzK(obj, j2));
                            }
                            break;
                        case 59:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzU(i13, unsafe.getObject(obj, j2), zzieuVar);
                            }
                            break;
                        case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzr(i13, unsafe.getObject(obj, j2), zzidfVar.zzq(i5));
                            }
                            break;
                        case 61:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzn(i13, (zzian) unsafe.getObject(obj, j2));
                            }
                            break;
                        case 62:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzo(i13, zzI(obj, j2));
                            }
                            break;
                        case 63:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzg(i13, zzI(obj, j2));
                            }
                            break;
                        case 64:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzb(i13, zzI(obj, j2));
                            }
                            break;
                        case 65:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzd(i13, zzJ(obj, j2));
                            }
                            break;
                        case 66:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzp(i13, zzI(obj, j2));
                            }
                            break;
                        case 67:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzq(i13, zzJ(obj, j2));
                            }
                            break;
                        case 68:
                            if (zzidfVar.zzP(obj, i13, i5)) {
                                zzieuVar.zzs(i13, unsafe.getObject(obj, j2), zzidfVar.zzq(i5));
                            }
                            break;
                    }
                    i5 += 3;
                    i12 = i7;
                    i10 = i9;
                    i11 = i6;
                    entry = entry2;
                }
                while (entry != null) {
                    zzidfVar.zzn.zzb(zzieuVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzibr) obj).zzt.zzg(zzieuVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzidfVar.zzc;
        Unsafe unsafe2 = zzb;
        int i102 = 1048575;
        int i112 = 1048575;
        i5 = 0;
        int i122 = 0;
        while (i5 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzibr) obj).zzt.zzg(zzieuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0072, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05a5 A[LOOP:2: B:112:0x05a1->B:114:0x05a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0572 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzidu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzidp zzidpVar, zzibb zzibbVar) {
        zzidf<T> zzidfVar;
        Object obj2;
        Throwable th;
        int i5;
        Object obj3;
        Object obj4;
        Object obj5;
        zzidf<T> zzidfVar2;
        zzibbVar.getClass();
        zzF(obj);
        zzief zziefVar = this.zzm;
        Object obj6 = null;
        while (true) {
            try {
                int zzb2 = zzidpVar.zzb();
                int zzR = zzR(zzb2);
                if (zzR >= 0) {
                    obj5 = obj;
                    zzidfVar2 = this;
                    try {
                        int zzA = zzA(zzR);
                        try {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj5;
                            }
                        } catch (zzicf unused) {
                            obj2 = obj5;
                        }
                        switch (zzC(zzA)) {
                            case 0:
                                obj2 = obj5;
                                zziem.zzm(obj2, zzA & 1048575, zzidpVar.zze());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                zziem.zzk(obj2, zzA & 1048575, zzidpVar.zzf());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                zziem.zzg(obj2, zzA & 1048575, zzidpVar.zzh());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                zziem.zzg(obj2, zzA & 1048575, zzidpVar.zzg());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                zziem.zze(obj2, zzA & 1048575, zzidpVar.zzi());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                zziem.zzg(obj2, zzA & 1048575, zzidpVar.zzj());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                zziem.zze(obj2, zzA & 1048575, zzidpVar.zzk());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                zziem.zzi(obj2, zzA & 1048575, zzidpVar.zzl());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                zzz(obj2, zzA, zzidpVar);
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                zzidc zzidcVar = (zzidc) zzt(obj2, zzR);
                                zzidpVar.zzo(zzidcVar, zzq(zzR), zzibbVar);
                                zzu(obj2, zzR, zzidcVar);
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                zziem.zzo(obj2, zzA & 1048575, zzidpVar.zzq());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                zziem.zze(obj2, zzA & 1048575, zzidpVar.zzr());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                int zzs = zzidpVar.zzs();
                                zzibx zzs2 = zzs(zzR);
                                if (zzs2 != null && !zzs2.zza(zzs)) {
                                    obj6 = zzidw.zzK(obj2, zzb2, zzs, obj6, zziefVar);
                                    obj = obj2;
                                }
                                zziem.zze(obj2, zzA & 1048575, zzs);
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                zziem.zze(obj2, zzA & 1048575, zzidpVar.zzt());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                zziem.zzg(obj2, zzA & 1048575, zzidpVar.zzu());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                zziem.zze(obj2, zzA & 1048575, zzidpVar.zzv());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                zziem.zzg(obj2, zzA & 1048575, zzidpVar.zzw());
                                zzO(obj2, zzR);
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                zzidc zzidcVar2 = (zzidc) zzt(obj2, zzR);
                                zzidpVar.zzp(zzidcVar2, zzq(zzR), zzibbVar);
                                zzu(obj2, zzR, zzidcVar2);
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                zzidpVar.zzx(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                zzidpVar.zzy(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                zzidpVar.zzA(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case zzbgj.zzt.zzm /* 21 */:
                                obj2 = obj5;
                                zzidpVar.zzz(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                zzidpVar.zzB(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                zzidpVar.zzC(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                zzidpVar.zzD(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                zzidpVar.zzE(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                if (zzD(zzA)) {
                                    ((zziar) zzidpVar).zzF(zzico.zza(obj2, zzA & 1048575), true);
                                } else {
                                    ((zziar) zzidpVar).zzF(zzico.zza(obj2, zzA & 1048575), false);
                                }
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                zzidpVar.zzG(zzico.zza(obj2, zzA & 1048575), zzq(zzR), zzibbVar);
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                zzidpVar.zzI(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                zzidpVar.zzJ(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 30:
                                List zza2 = zzico.zza(obj5, zzA & 1048575);
                                zzidpVar.zzK(zza2);
                                obj6 = zzidw.zzJ(obj5, zzb2, zza2, zzs(zzR), obj6, zziefVar);
                                obj2 = obj5;
                                obj = obj2;
                            case 31:
                                obj2 = obj5;
                                zzidpVar.zzL(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                zzidpVar.zzM(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                zzidpVar.zzN(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                zzidpVar.zzO(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                zzidpVar.zzx(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                zzidpVar.zzy(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                zzidpVar.zzA(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                zzidpVar.zzz(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                zzidpVar.zzB(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                zzidpVar.zzC(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                zzidpVar.zzD(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                zzidpVar.zzE(zzico.zza(obj2, zzA & 1048575));
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                try {
                                    zzidpVar.zzJ(zzico.zza(obj2, zzA & 1048575));
                                } catch (zzicf unused2) {
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zziefVar.zzh(obj2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            zzidfVar = zzidfVar2;
                                            i5 = zzidfVar.zzk;
                                            obj3 = obj6;
                                            while (i5 < zzidfVar.zzl) {
                                            }
                                            zzief zziefVar2 = zziefVar;
                                            if (obj3 != null) {
                                            }
                                        }
                                    }
                                    try {
                                        if (zziefVar.zzk(obj6, zzidpVar, 0)) {
                                            obj4 = obj6;
                                            for (int i6 = zzidfVar2.zzk; i6 < zzidfVar2.zzl; i6++) {
                                                zzief zziefVar3 = zziefVar;
                                                obj4 = zzidfVar2.zzx(obj2, zzidfVar2.zzj[i6], obj4, zziefVar3, obj2);
                                                zziefVar = zziefVar3;
                                            }
                                            if (obj4 == null) {
                                            }
                                        } else {
                                            obj = obj2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzidfVar = zzidfVar2;
                                        th = th;
                                        i5 = zzidfVar.zzk;
                                        obj3 = obj6;
                                        while (i5 < zzidfVar.zzl) {
                                            zzief zziefVar4 = zziefVar;
                                            obj3 = zzidfVar.zzx(obj2, zzidfVar.zzj[i5], obj3, zziefVar4, obj2);
                                            i5++;
                                            zzidfVar = this;
                                            zziefVar = zziefVar4;
                                        }
                                        zzief zziefVar22 = zziefVar;
                                        if (obj3 != null) {
                                            throw th;
                                        }
                                        zziefVar22.zzi(obj2, obj3);
                                        throw th;
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List zza3 = zzico.zza(obj5, zzA & 1048575);
                                zzidpVar.zzK(zza3);
                                try {
                                    obj6 = zzidw.zzJ(obj5, zzb2, zza3, zzs(zzR), obj6, zziefVar);
                                    obj2 = obj5;
                                } catch (zzicf unused3) {
                                    obj2 = obj5;
                                    if (obj6 == null) {
                                    }
                                    if (zziefVar.zzk(obj6, zzidpVar, 0)) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj5;
                                    th = th;
                                    zzidfVar = zzidfVar2;
                                    i5 = zzidfVar.zzk;
                                    obj3 = obj6;
                                    while (i5 < zzidfVar.zzl) {
                                    }
                                    zzief zziefVar222 = zziefVar;
                                    if (obj3 != null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzidpVar.zzL(zzico.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                            case 46:
                                zzidpVar.zzM(zzico.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                            case 47:
                                zzidpVar.zzN(zzico.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                            case 48:
                                zzidpVar.zzO(zzico.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                            case 49:
                                zzidpVar.zzH(zzico.zza(obj5, zzA & 1048575), zzq(zzR), zzibbVar);
                                obj2 = obj5;
                                obj = obj2;
                            case 50:
                                Object zzr = zzr(zzR);
                                long zzA2 = zzA(zzR) & 1048575;
                                Object zzn = zziem.zzn(obj5, zzA2);
                                if (zzn == null) {
                                    zzn = zzicw.zza().zzc();
                                    zziem.zzo(obj5, zzA2, zzn);
                                } else if (zzicx.zza(zzn)) {
                                    Object zzc = zzicw.zza().zzc();
                                    zzicx.zzb(zzc, zzn);
                                    zziem.zzo(obj5, zzA2, zzc);
                                    zzn = zzc;
                                }
                                zzidpVar.zzP((zzicw) zzn, ((zzicv) zzr).zze(), zzibbVar);
                                obj2 = obj5;
                                obj = obj2;
                            case 51:
                                zziem.zzo(obj5, zzA & 1048575, Double.valueOf(zzidpVar.zze()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 52:
                                zziem.zzo(obj5, zzA & 1048575, Float.valueOf(zzidpVar.zzf()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 53:
                                zziem.zzo(obj5, zzA & 1048575, Long.valueOf(zzidpVar.zzh()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 54:
                                zziem.zzo(obj5, zzA & 1048575, Long.valueOf(zzidpVar.zzg()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzidpVar.zzi()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 56:
                                zziem.zzo(obj5, zzA & 1048575, Long.valueOf(zzidpVar.zzj()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 57:
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzidpVar.zzk()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 58:
                                zziem.zzo(obj5, zzA & 1048575, Boolean.valueOf(zzidpVar.zzl()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 59:
                                zzz(obj5, zzA, zzidpVar);
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                                zzidc zzidcVar3 = (zzidc) zzv(obj5, zzb2, zzR);
                                zzidpVar.zzo(zzidcVar3, zzq(zzR), zzibbVar);
                                zzw(obj5, zzb2, zzR, zzidcVar3);
                                obj2 = obj5;
                                obj = obj2;
                            case 61:
                                zziem.zzo(obj5, zzA & 1048575, zzidpVar.zzq());
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 62:
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzidpVar.zzr()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 63:
                                int zzs3 = zzidpVar.zzs();
                                zzibx zzs4 = zzs(zzR);
                                if (zzs4 != null && !zzs4.zza(zzs3)) {
                                    obj6 = zzidw.zzK(obj5, zzb2, zzs3, obj6, zziefVar);
                                    obj = obj5;
                                }
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzs3));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 64:
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzidpVar.zzt()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 65:
                                zziem.zzo(obj5, zzA & 1048575, Long.valueOf(zzidpVar.zzu()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 66:
                                zziem.zzo(obj5, zzA & 1048575, Integer.valueOf(zzidpVar.zzv()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 67:
                                zziem.zzo(obj5, zzA & 1048575, Long.valueOf(zzidpVar.zzw()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                            case 68:
                                zzidc zzidcVar4 = (zzidc) zzv(obj5, zzb2, zzR);
                                zzidpVar.zzp(zzidcVar4, zzq(zzR), zzibbVar);
                                zzw(obj5, zzb2, zzR, zzidcVar4);
                                obj2 = obj5;
                                obj = obj2;
                            default:
                                if (obj6 == null) {
                                    try {
                                        obj6 = zziefVar.zzh(obj5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        zzidfVar = zzidfVar2;
                                        obj2 = obj5;
                                        i5 = zzidfVar.zzk;
                                        obj3 = obj6;
                                        while (i5 < zzidfVar.zzl) {
                                        }
                                        zzief zziefVar2222 = zziefVar;
                                        if (obj3 != null) {
                                        }
                                    }
                                }
                                if (!zziefVar.zzk(obj6, zzidpVar, 0)) {
                                    obj4 = obj6;
                                    for (int i7 = zzidfVar2.zzk; i7 < zzidfVar2.zzl; i7++) {
                                        zzief zziefVar5 = zziefVar;
                                        Object obj7 = obj5;
                                        obj4 = zzidfVar2.zzx(obj7, zzidfVar2.zzj[i7], obj4, zziefVar5, obj5);
                                        obj5 = obj7;
                                        zziefVar = zziefVar5;
                                    }
                                    break;
                                }
                                obj = obj5;
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        zzidfVar = zzidfVar2;
                        obj2 = obj5;
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj4 = obj6;
                    for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                        zzief zziefVar6 = zziefVar;
                        obj4 = zzx(obj, this.zzj[i8], obj4, zziefVar6, obj);
                        zziefVar = zziefVar6;
                    }
                    obj2 = obj;
                } else {
                    zzidfVar = this;
                    try {
                        if ((!zzidfVar.zzh ? null : zzibbVar.zzc(zzidfVar.zzg, zzb2)) != null) {
                            obj5 = obj;
                            zzidfVar2 = zzidfVar;
                            throw null;
                        }
                        if (obj6 == null) {
                            try {
                                obj6 = zziefVar.zzh(obj);
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj;
                                i5 = zzidfVar.zzk;
                                obj3 = obj6;
                                while (i5 < zzidfVar.zzl) {
                                }
                                zzief zziefVar22222 = zziefVar;
                                if (obj3 != null) {
                                }
                            }
                        }
                        if (zziefVar.zzk(obj6, zzidpVar, 0)) {
                            obj5 = obj;
                            obj = obj5;
                        } else {
                            int i9 = zzidfVar.zzk;
                            obj4 = obj6;
                            while (i9 < zzidfVar.zzl) {
                                zzief zziefVar7 = zziefVar;
                                Object obj8 = obj;
                                obj4 = zzidfVar.zzx(obj8, zzidfVar.zzj[i9], obj4, zziefVar7, obj);
                                zziefVar = zziefVar7;
                                i9++;
                                obj = obj8;
                            }
                            obj5 = obj;
                        }
                    } catch (Throwable th9) {
                        obj5 = obj;
                        th = th9;
                        obj2 = obj5;
                        i5 = zzidfVar.zzk;
                        obj3 = obj6;
                        while (i5 < zzidfVar.zzl) {
                        }
                        zzief zziefVar222222 = zziefVar;
                        if (obj3 != null) {
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                zzidfVar = this;
                obj2 = obj;
            }
        }
        if (obj4 == null) {
            zziefVar.zzi(obj2, obj4);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zziab r37) {
        /*
            Method dump skipped, instructions count: 3754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzidf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zziab):int");
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzj(Object obj, byte[] bArr, int i5, int i6, zziab zziabVar) {
        zzi(obj, bArr, i5, i6, 0, zziabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzibr) {
                zzibr zzibrVar = (zzibr) obj;
                zzibrVar.zzbq();
                zzibrVar.zzbb();
                zzibrVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i5 = 0; i5 < iArr.length; i5 += 3) {
                int zzA = zzA(i5);
                int i6 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j2 = i6;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
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
                                ((zzicd) zziem.zzn(obj, j2)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzicw) object).zzd();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzP(obj, iArr[i5], i5)) {
                        zzq(i5).zzk(zzb.getObject(obj, j2));
                    }
                }
                if (zzN(obj, i5)) {
                    zzq(i5).zzk(zzb.getObject(obj, j2));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    public final boolean zzl(Object obj) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i9 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i11 = iArr[i9];
            int i12 = iArr2[i11];
            int zzA = zzA(i11);
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
            if ((268435456 & zzA) != 0 && !zzM(obj, i6, i5, i7, i15)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzP(obj, i12, i6) && !zzy(obj, zzA, zzq(i6))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            zzicw zzicwVar = (zzicw) zziem.zzn(obj, zzA & 1048575);
                            if (!zzicwVar.isEmpty() && ((zzicv) zzr(i6)).zze().zzc.zza() == zziet.MESSAGE) {
                                zzidu zziduVar = null;
                                for (Object obj2 : zzicwVar.values()) {
                                    if (zziduVar == null) {
                                        zziduVar = zzidm.zza().zzb(obj2.getClass());
                                    }
                                    if (!zziduVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zziem.zzn(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzidu zzq = zzq(i6);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzq.zzl(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzM(obj, i6, i5, i7, i15) && !zzy(obj, zzA, zzq(i6))) {
                return false;
            }
            i9++;
            i10 = i5;
            i8 = i7;
        }
        return !this.zzh || ((zzibn) obj).zza.zze();
    }
}
