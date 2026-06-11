package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbgj;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i5, int i6, zzlj zzljVar, boolean z4, boolean z5, int[] iArr2, int i7, int i8, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i5;
        this.zzf = i6;
        this.zzi = z4;
        boolean z6 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z6 = true;
        }
        this.zzh = z6;
        this.zzj = iArr2;
        this.zzk = i7;
        this.zzl = i8;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i5) {
        return (i5 >>> 20) & 255;
    }

    private final int zzB(int i5) {
        return this.zzc[i5 + 1];
    }

    private static long zzC(Object obj, long j2) {
        return ((Long) zzmv.zzf(obj, j2)).longValue();
    }

    private final zzkg zzD(int i5) {
        int i6 = i5 / 3;
        return (zzkg) this.zzd[i6 + i6 + 1];
    }

    private final zzlu zzE(int i5) {
        int i6 = i5 / 3;
        int i7 = i6 + i6;
        zzlu zzluVar = (zzlu) this.zzd[i7];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i7 + 1]);
        this.zzd[i7] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i5) {
        int i6 = i5 / 3;
        return this.zzd[i6 + i6];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i5) {
        long zzB = zzB(i5) & 1048575;
        if (zzO(obj2, i5)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i5);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i5);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i5) {
        int zzB = zzB(i5);
        int i6 = this.zzc[i5];
        long j2 = zzB & 1048575;
        if (zzR(obj2, i6, i5)) {
            Object zzf = zzR(obj, i6, i5) ? zzmv.zzf(obj, j2) : null;
            Object zzf2 = zzmv.zzf(obj2, j2);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j2, zzkk.zzg(zzf, zzf2));
                zzK(obj, i6, i5);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j2, zzf2);
                zzK(obj, i6, i5);
            }
        }
    }

    private final void zzJ(Object obj, int i5) {
        int zzy = zzy(i5);
        long j2 = 1048575 & zzy;
        if (j2 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j2, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j2));
    }

    private final void zzK(Object obj, int i5, int i6) {
        zzmv.zzq(obj, zzy(i6) & 1048575, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) {
        int i5;
        boolean z4;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int zzB = zzB(i8);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i5 = 1 << (i11 >>> 20);
            } else {
                i5 = 0;
            }
            long j2 = zzB & i6;
            switch (zzA) {
                case 0:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i10, zzmv.zza(obj, j2));
                        break;
                    }
                case 1:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i10, zzmv.zzb(obj, j2));
                        break;
                    }
                case 2:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i10, unsafe.getLong(obj, j2));
                        break;
                    }
                case 3:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i10, unsafe.getLong(obj, j2));
                        break;
                    }
                case 4:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 5:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i10, unsafe.getLong(obj, j2));
                        break;
                    }
                case 6:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 7:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i10, zzmv.zzw(obj, j2));
                        break;
                    }
                case 8:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzT(i10, unsafe.getObject(obj, j2), zzndVar);
                        break;
                    }
                case 9:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i10, unsafe.getObject(obj, j2), zzE(i8));
                        break;
                    }
                case 10:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i10, (zzjb) unsafe.getObject(obj, j2));
                        break;
                    }
                case 11:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 12:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 13:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 14:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i10, unsafe.getLong(obj, j2));
                        break;
                    }
                case 15:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i10, unsafe.getInt(obj, j2));
                        break;
                    }
                case 16:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i10, unsafe.getLong(obj, j2));
                        break;
                    }
                case 17:
                    if ((i9 & i5) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i10, unsafe.getObject(obj, j2), zzE(i8));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    zzlw.zzY(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, zzE(i8));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar);
                    break;
                case 29:
                    z4 = false;
                    zzlw.zzX(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 30:
                    z4 = false;
                    zzlw.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 31:
                    z4 = false;
                    zzlw.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 32:
                    z4 = false;
                    zzlw.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 33:
                    z4 = false;
                    zzlw.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 34:
                    z4 = false;
                    zzlw.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzndVar, zzE(i8));
                    break;
                case 50:
                    zzM(zzndVar, i10, unsafe.getObject(obj, j2), i8);
                    break;
                case 51:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzf(i10, zzn(obj, j2));
                    }
                    break;
                case 52:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzo(i10, zzo(obj, j2));
                    }
                    break;
                case 53:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzt(i10, zzC(obj, j2));
                    }
                    break;
                case 54:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzJ(i10, zzC(obj, j2));
                    }
                    break;
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzr(i10, zzr(obj, j2));
                    }
                    break;
                case 56:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzm(i10, zzC(obj, j2));
                    }
                    break;
                case 57:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzk(i10, zzr(obj, j2));
                    }
                    break;
                case 58:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzb(i10, zzS(obj, j2));
                    }
                    break;
                case 59:
                    if (zzR(obj, i10, i8)) {
                        zzT(i10, unsafe.getObject(obj, j2), zzndVar);
                    }
                    break;
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzv(i10, unsafe.getObject(obj, j2), zzE(i8));
                    }
                    break;
                case 61:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzd(i10, (zzjb) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzH(i10, zzr(obj, j2));
                    }
                    break;
                case 63:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzi(i10, zzr(obj, j2));
                    }
                    break;
                case 64:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzw(i10, zzr(obj, j2));
                    }
                    break;
                case 65:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzy(i10, zzC(obj, j2));
                    }
                    break;
                case 66:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzA(i10, zzr(obj, j2));
                    }
                    break;
                case 67:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzC(i10, zzC(obj, j2));
                    }
                    break;
                case 68:
                    if (zzR(obj, i10, i8)) {
                        zzndVar.zzq(i10, unsafe.getObject(obj, j2), zzE(i8));
                    }
                    break;
            }
            i8 += 3;
            i6 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i5, Object obj, int i6) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i5) {
        return zzO(obj, i5) == zzO(obj2, i5);
    }

    private final boolean zzO(Object obj, int i5) {
        int zzy = zzy(i5);
        long j2 = zzy & 1048575;
        if (j2 != 1048575) {
            return (zzmv.zzc(obj, j2) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i5);
        long j5 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j5)) != 0;
            case 2:
                return zzmv.zzd(obj, j5) != 0;
            case 3:
                return zzmv.zzd(obj, j5) != 0;
            case 4:
                return zzmv.zzc(obj, j5) != 0;
            case 5:
                return zzmv.zzd(obj, j5) != 0;
            case 6:
                return zzmv.zzc(obj, j5) != 0;
            case 7:
                return zzmv.zzw(obj, j5);
            case 8:
                Object zzf = zzmv.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j5) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j5));
            case 11:
                return zzmv.zzc(obj, j5) != 0;
            case 12:
                return zzmv.zzc(obj, j5) != 0;
            case 13:
                return zzmv.zzc(obj, j5) != 0;
            case 14:
                return zzmv.zzd(obj, j5) != 0;
            case 15:
                return zzmv.zzc(obj, j5) != 0;
            case 16:
                return zzmv.zzd(obj, j5) != 0;
            case 17:
                return zzmv.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i5, int i6, int i7, int i8) {
        return i6 == 1048575 ? zzO(obj, i5) : (i7 & i8) != 0;
    }

    private static boolean zzQ(Object obj, int i5, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i5 & 1048575));
    }

    private final boolean zzR(Object obj, int i5, int i6) {
        return zzmv.zzc(obj, (long) (zzy(i6) & 1048575)) == i5;
    }

    private static boolean zzS(Object obj, long j2) {
        return ((Boolean) zzmv.zzf(obj, j2)).booleanValue();
    }

    private static final void zzT(int i5, Object obj, zznd zzndVar) {
        if (obj instanceof String) {
            zzndVar.zzF(i5, (String) obj);
        } else {
            zzndVar.zzd(i5, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zze = zzmm.zze();
        zzkcVar.zzc = zze;
        return zze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i5;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        char charAt11;
        int i16;
        char charAt12;
        int i17;
        int i18;
        int i19;
        int i20;
        int objectFieldOffset;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field zzG;
        char charAt13;
        int i27;
        int i28;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i29;
        char charAt14;
        int i30;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        int i33;
        char charAt17;
        boolean z4 = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
        int length = zzd.length();
        char c5 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i5 = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i5;
            }
        } else {
            i5 = 1;
        }
        int i35 = i5 + 1;
        int charAt18 = zzd.charAt(i5);
        if (charAt18 >= 55296) {
            int i36 = charAt18 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt17 = zzd.charAt(i35);
                if (charAt17 < 55296) {
                    break;
                }
                i36 |= (charAt17 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt18 = i36 | (charAt17 << i37);
            i35 = i33;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i7 = 0;
            charAt4 = 0;
            i6 = 0;
            iArr = zza;
            i8 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i16 = i38 + 1;
                    charAt12 = zzd.charAt(i38);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i39 |= (charAt12 & 8191) << i40;
                    i40 += 13;
                    i38 = i16;
                }
                charAt19 = i39 | (charAt12 << i40);
                i38 = i16;
            }
            int i41 = i38 + 1;
            int charAt20 = zzd.charAt(i38);
            if (charAt20 >= 55296) {
                int i42 = charAt20 & 8191;
                int i43 = 13;
                while (true) {
                    i15 = i41 + 1;
                    charAt11 = zzd.charAt(i41);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i42 |= (charAt11 & 8191) << i43;
                    i43 += 13;
                    i41 = i15;
                }
                charAt20 = i42 | (charAt11 << i43);
                i41 = i15;
            }
            int i44 = i41 + 1;
            charAt = zzd.charAt(i41);
            if (charAt >= 55296) {
                int i45 = charAt & 8191;
                int i46 = 13;
                while (true) {
                    i14 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i14;
                }
                charAt = i45 | (charAt10 << i46);
                i44 = i14;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i13 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i13;
                }
                charAt2 = i48 | (charAt9 << i49);
                i47 = i13;
            }
            int i50 = i47 + 1;
            charAt3 = zzd.charAt(i47);
            if (charAt3 >= 55296) {
                int i51 = charAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i12 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i12;
                }
                charAt3 = i51 | (charAt8 << i52);
                i50 = i12;
            }
            int i53 = i50 + 1;
            int charAt21 = zzd.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i11 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i11;
                }
                charAt21 = i54 | (charAt7 << i55);
                i53 = i11;
            }
            int i56 = i53 + 1;
            int charAt22 = zzd.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i10 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i10;
                }
                charAt22 = i57 | (charAt6 << i58);
                i56 = i10;
            }
            int i59 = i56 + 1;
            charAt4 = zzd.charAt(i56);
            if (charAt4 >= 55296) {
                int i60 = charAt4 & 8191;
                int i61 = 13;
                while (true) {
                    i9 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i9;
                }
                charAt4 = i60 | (charAt5 << i61);
                i59 = i9;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i6 = charAt19 + charAt19 + charAt20;
            i7 = charAt21;
            iArr = iArr2;
            i8 = charAt19;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 + charAt3];
        int i62 = i7 + charAt4;
        int i63 = i62;
        int i64 = charAt4;
        int i65 = 0;
        int i66 = 0;
        while (i35 < length) {
            int i67 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c5) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i32 = i69 + 1;
                    charAt16 = zzd.charAt(i69);
                    if (charAt16 < c5) {
                        break;
                    }
                    i68 |= (charAt16 & 8191) << i70;
                    i70 += 13;
                    i69 = i32;
                }
                charAt23 = i68 | (charAt16 << i70);
                i17 = i32;
            } else {
                i17 = i67;
            }
            int i71 = i17 + 1;
            int charAt24 = zzd.charAt(i17);
            if (charAt24 >= c5) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i31 = i73 + 1;
                    charAt15 = zzd.charAt(i73);
                    i18 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i72 |= (charAt15 & 8191) << i74;
                    i74 += 13;
                    i73 = i31;
                    length = i18;
                }
                charAt24 = i72 | (charAt15 << i74);
                i19 = i31;
            } else {
                i18 = length;
                i19 = i71;
            }
            int i75 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i66] = i65;
                i66++;
            }
            if (i75 >= 51) {
                int i76 = i19 + 1;
                int charAt25 = zzd.charAt(i19);
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i29 = i78 + 1;
                        charAt14 = zzd.charAt(i78);
                        i30 = i77;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i77 = i30 | ((charAt14 & 8191) << i79);
                        i79 += 13;
                        i78 = i29;
                    }
                    charAt25 = i30 | (charAt14 << i79);
                    i27 = i29;
                } else {
                    i27 = i76;
                }
                int i80 = charAt25;
                int i81 = i75 - 51;
                int i82 = i27;
                if (i81 == 9 || i81 == 17) {
                    int i83 = i65 / 3;
                    i28 = i6 + 1;
                    objArr[i83 + i83 + 1] = zze[i6];
                } else {
                    if (i81 == 12 && !z4) {
                        int i84 = i65 / 3;
                        i28 = i6 + 1;
                        objArr[i84 + i84 + 1] = zze[i6];
                    }
                    int i85 = i80 + i80;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzG2 = zzG(cls, (String) obj);
                        zze[i85] = zzG2;
                    } else {
                        zzG2 = (Field) obj;
                    }
                    i20 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzG3 = zzG(cls, (String) obj2);
                        zze[i86] = zzG3;
                    } else {
                        zzG3 = (Field) obj2;
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzG3);
                    i25 = objectFieldOffset2;
                    i35 = i82;
                    i24 = 0;
                }
                i6 = i28;
                int i852 = i80 + i80;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i20 = charAt23;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzG2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzG3);
                i25 = objectFieldOffset22;
                i35 = i82;
                i24 = 0;
            } else {
                i20 = charAt23;
                int i87 = i6 + 1;
                Field zzG4 = zzG(cls, (String) zze[i6]);
                if (i75 == 9 || i75 == 17) {
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = zzG4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        int i89 = i65 / 3;
                        i6 += 2;
                        objArr[i89 + i89 + 1] = zze[i87];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        if (!z4) {
                            int i90 = i65 / 3;
                            i6 += 2;
                            objArr[i90 + i90 + 1] = zze[i87];
                        }
                    } else if (i75 == 50) {
                        int i91 = i64 + 1;
                        iArr[i64] = i65;
                        int i92 = i65 / 3;
                        int i93 = i92 + i92;
                        int i94 = i6 + 2;
                        objArr[i93] = zze[i87];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i93 + 1] = zze[i94];
                            i6 += 3;
                        } else {
                            i6 = i94;
                        }
                        i64 = i91;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                    i21 = 1048575;
                    if ((charAt24 & 4096) == 4096 || i75 > 17) {
                        i22 = i19;
                        i23 = 0;
                    } else {
                        int i95 = i19 + 1;
                        int charAt26 = zzd.charAt(i19);
                        if (charAt26 >= 55296) {
                            int i96 = charAt26 & 8191;
                            int i97 = 13;
                            while (true) {
                                i26 = i95 + 1;
                                charAt13 = zzd.charAt(i95);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i96 |= (charAt13 & 8191) << i97;
                                i97 += 13;
                                i95 = i26;
                            }
                            charAt26 = i96 | (charAt13 << i97);
                        } else {
                            i26 = i95;
                        }
                        int i98 = (charAt26 / 32) + i8 + i8;
                        Object obj3 = zze[i98];
                        if (obj3 instanceof Field) {
                            zzG = (Field) obj3;
                        } else {
                            zzG = zzG(cls, (String) obj3);
                            zze[i98] = zzG;
                        }
                        i23 = charAt26 % 32;
                        int i99 = i26;
                        i21 = (int) unsafe.objectFieldOffset(zzG);
                        i22 = i99;
                    }
                    if (i75 >= 18 && i75 <= 49) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                    i35 = i22;
                    i24 = i23;
                    i25 = objectFieldOffset;
                }
                i6 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
                i21 = 1048575;
                if ((charAt24 & 4096) == 4096) {
                }
                i22 = i19;
                i23 = 0;
                if (i75 >= 18) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i35 = i22;
                i24 = i23;
                i25 = objectFieldOffset;
            }
            int i100 = i65 + 1;
            iArr4[i65] = i20;
            int i101 = i65 + 2;
            String str = zzd;
            iArr4[i100] = ((charAt24 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i75 << 20) | i25;
            i65 += 3;
            iArr4[i101] = (i24 << 20) | i21;
            iArr3 = iArr4;
            length = i18;
            zzd = str;
            c5 = 55296;
        }
        return new zzlm(iArr3, objArr, charAt, charAt2, zzltVar.zza(), z4, false, iArr, charAt4, i62, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j2) {
        return ((Double) zzmv.zzf(obj, j2)).doubleValue();
    }

    private static float zzo(Object obj, long j2) {
        return ((Float) zzmv.zzf(obj, j2)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i5;
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int i6;
        int zzu;
        boolean z4;
        int zzd;
        int zzA3;
        int zzB2;
        int zzA4;
        int zzv2;
        int i7;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < this.zzc.length) {
            int zzB3 = zzB(i10);
            int[] iArr = this.zzc;
            int i13 = iArr[i10];
            int zzA5 = zzA(zzB3);
            if (zzA5 <= 17) {
                int i14 = iArr[i10 + 2];
                int i15 = i14 & i8;
                i5 = 1 << (i14 >>> 20);
                if (i15 != i9) {
                    i12 = unsafe.getInt(obj, i15);
                    i9 = i15;
                }
            } else {
                i5 = 0;
            }
            long j2 = zzB3 & i8;
            switch (zzA5) {
                case 0:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 8, i11);
                        break;
                    }
                case 1:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 4, i11);
                        break;
                    }
                case 2:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j2);
                        zzA = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(j5);
                        i6 = zzB + zzA;
                        i11 += i6;
                        break;
                    }
                case 3:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        long j6 = unsafe.getLong(obj, j2);
                        zzA = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(j6);
                        i6 = zzB + zzA;
                        i11 += i6;
                        break;
                    }
                case 4:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j2);
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(i16);
                        i6 = zzv + zzA2;
                        i11 += i6;
                        break;
                    }
                case 5:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 8, i11);
                        break;
                    }
                case 6:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 4, i11);
                        break;
                    }
                case 7:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 1, i11);
                        break;
                    }
                case 8:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        if (!(object instanceof zzjb)) {
                            zzA2 = zzjj.zzA(i13 << 3);
                            zzv = zzjj.zzy((String) object);
                            i6 = zzv + zzA2;
                            i11 += i6;
                            break;
                        } else {
                            int zzA6 = zzjj.zzA(i13 << 3);
                            int zzd2 = ((zzjb) object).zzd();
                            i11 = u.y(zzd2, zzd2, zzA6, i11);
                            break;
                        }
                    }
                case 9:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        zzo = zzlw.zzo(i13, unsafe.getObject(obj, j2), zzE(i10));
                        i11 += zzo;
                        break;
                    }
                case 10:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j2);
                        int zzA7 = zzjj.zzA(i13 << 3);
                        int zzd3 = zzjbVar.zzd();
                        i11 = u.y(zzd3, zzd3, zzA7, i11);
                        break;
                    }
                case 11:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(unsafe.getInt(obj, j2), zzjj.zzA(i13 << 3), i11);
                        break;
                    }
                case 12:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        int i17 = unsafe.getInt(obj, j2);
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(i17);
                        i6 = zzv + zzA2;
                        i11 += i6;
                        break;
                    }
                case 13:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 4, i11);
                        break;
                    }
                case 14:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i11 = u.x(i13 << 3, 8, i11);
                        break;
                    }
                case 15:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(obj, j2);
                        i11 = u.x((i18 >> 31) ^ (i18 + i18), zzjj.zzA(i13 << 3), i11);
                        break;
                    }
                case 16:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        long j7 = unsafe.getLong(obj, j2);
                        zzA = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB((j7 >> 63) ^ (j7 + j7));
                        i6 = zzB + zzA;
                        i11 += i6;
                        break;
                    }
                case 17:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        i6 = zzjj.zzu(i13, (zzlj) unsafe.getObject(obj, j2), zzE(i10));
                        i11 += i6;
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    zzo = zzlw.zzx(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzo;
                    break;
                case 26:
                    zzu = zzlw.zzu(i13, (List) unsafe.getObject(obj, j2));
                    i11 += zzu;
                    break;
                case 27:
                    zzu = zzlw.zzp(i13, (List) unsafe.getObject(obj, j2), zzE(i10));
                    i11 += zzu;
                    break;
                case 28:
                    zzu = zzlw.zzc(i13, (List) unsafe.getObject(obj, j2));
                    i11 += zzu;
                    break;
                case 29:
                    zzu = zzlw.zzv(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzu;
                    break;
                case 30:
                    z4 = false;
                    zzd = zzlw.zzd(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzd;
                    break;
                case 31:
                    z4 = false;
                    zzd = zzlw.zzf(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzd;
                    break;
                case 32:
                    z4 = false;
                    zzd = zzlw.zzh(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzd;
                    break;
                case 33:
                    z4 = false;
                    zzd = zzlw.zzq(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzd;
                    break;
                case 34:
                    z4 = false;
                    zzd = zzlw.zzs(i13, (List) unsafe.getObject(obj, j2), false);
                    i11 += zzd;
                    break;
                case 35:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        i11 = u.y(zzi, zzjj.zzz(i13), zzi, i11);
                    }
                    break;
                case 36:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg > 0) {
                        i11 = u.y(zzg, zzjj.zzz(i13), zzg, i11);
                    }
                    break;
                case 37:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j2));
                    if (zzn > 0) {
                        i11 = u.y(zzn, zzjj.zzz(i13), zzn, i11);
                    }
                    break;
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j2));
                    if (zzy > 0) {
                        i11 = u.y(zzy, zzjj.zzz(i13), zzy, i11);
                    }
                    break;
                case 39:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j2));
                    if (zzl > 0) {
                        i11 = u.y(zzl, zzjj.zzz(i13), zzl, i11);
                    }
                    break;
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi2 > 0) {
                        i11 = u.y(zzi2, zzjj.zzz(i13), zzi2, i11);
                    }
                    break;
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg2 > 0) {
                        i11 = u.y(zzg2, zzjj.zzz(i13), zzg2, i11);
                    }
                    break;
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j2));
                    if (zzb2 > 0) {
                        i11 = u.y(zzb2, zzjj.zzz(i13), zzb2, i11);
                    }
                    break;
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j2));
                    if (zzw > 0) {
                        i11 = u.y(zzw, zzjj.zzz(i13), zzw, i11);
                    }
                    break;
                case 44:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j2));
                    if (zze > 0) {
                        i11 = u.y(zze, zzjj.zzz(i13), zze, i11);
                    }
                    break;
                case 45:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg3 > 0) {
                        i11 = u.y(zzg3, zzjj.zzz(i13), zzg3, i11);
                    }
                    break;
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi3 > 0) {
                        i11 = u.y(zzi3, zzjj.zzz(i13), zzi3, i11);
                    }
                    break;
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j2));
                    if (zzr > 0) {
                        i11 = u.y(zzr, zzjj.zzz(i13), zzr, i11);
                    }
                    break;
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j2));
                    if (zzt > 0) {
                        i11 = u.y(zzt, zzjj.zzz(i13), zzt, i11);
                    }
                    break;
                case 49:
                    zzu = zzlw.zzj(i13, (List) unsafe.getObject(obj, j2), zzE(i10));
                    i11 += zzu;
                    break;
                case 50:
                    zzle.zza(i13, unsafe.getObject(obj, j2), zzF(i10));
                    break;
                case 51:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 8, i11);
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 4, i11);
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i10)) {
                        long zzC = zzC(obj, j2);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB2 = zzjj.zzB(zzC);
                        i7 = zzB2 + zzA3;
                        i11 += i7;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i10)) {
                        long zzC2 = zzC(obj, j2);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB2 = zzjj.zzB(zzC2);
                        i7 = zzB2 + zzA3;
                        i11 += i7;
                    }
                    break;
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzR(obj, i13, i10)) {
                        int zzr2 = zzr(obj, j2);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv2 = zzjj.zzv(zzr2);
                        i7 = zzv2 + zzA4;
                        i11 += i7;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 8, i11);
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 4, i11);
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 1, i11);
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i10)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof zzjb) {
                            int zzA8 = zzjj.zzA(i13 << 3);
                            int zzd4 = ((zzjb) object2).zzd();
                            i11 = u.y(zzd4, zzd4, zzA8, i11);
                        } else {
                            zzA4 = zzjj.zzA(i13 << 3);
                            zzv2 = zzjj.zzy((String) object2);
                            i7 = zzv2 + zzA4;
                            i11 += i7;
                        }
                    }
                    break;
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzR(obj, i13, i10)) {
                        zzu = zzlw.zzo(i13, unsafe.getObject(obj, j2), zzE(i10));
                        i11 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i10)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j2);
                        int zzA9 = zzjj.zzA(i13 << 3);
                        int zzd5 = zzjbVar2.zzd();
                        i11 = u.y(zzd5, zzd5, zzA9, i11);
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(zzr(obj, j2), zzjj.zzA(i13 << 3), i11);
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i10)) {
                        int zzr3 = zzr(obj, j2);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv2 = zzjj.zzv(zzr3);
                        i7 = zzv2 + zzA4;
                        i11 += i7;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 4, i11);
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i10)) {
                        i11 = u.x(i13 << 3, 8, i11);
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i10)) {
                        int zzr4 = zzr(obj, j2);
                        i11 = u.x((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i13 << 3), i11);
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i10)) {
                        long zzC3 = zzC(obj, j2);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB2 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i7 = zzB2 + zzA3;
                        i11 += i7;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i10)) {
                        i7 = zzjj.zzu(i13, (zzlj) unsafe.getObject(obj, j2), zzE(i10));
                        i11 += i7;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i11 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int zzu;
        Unsafe unsafe = zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzB2 = zzB(i6);
            int zzA3 = zzA(zzB2);
            int i7 = this.zzc[i6];
            long j2 = zzB2 & 1048575;
            if (zzA3 >= zzju.zzJ.zza() && zzA3 <= zzju.zzW.zza()) {
                int i8 = this.zzc[i6 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i6)) {
                        long zzd = zzmv.zzd(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzd);
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i6)) {
                        long zzd2 = zzmv.zzd(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzd2);
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i6)) {
                        int zzc = zzmv.zzc(obj, j2);
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzc);
                        zzu = zzv + zzA2;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i6)) {
                        Object zzf = zzmv.zzf(obj, j2);
                        if (zzf instanceof zzjb) {
                            int zzA4 = zzjj.zzA(i7 << 3);
                            int zzd3 = ((zzjb) zzf).zzd();
                            i5 = u.y(zzd3, zzd3, zzA4, i5);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i7 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            zzu = zzv + zzA2;
                            i5 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i6)) {
                        zzo = zzlw.zzo(i7, zzmv.zzf(obj, j2), zzE(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i6)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j2);
                        int zzA5 = zzjj.zzA(i7 << 3);
                        int zzd4 = zzjbVar.zzd();
                        i5 = u.y(zzd4, zzd4, zzA5, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i6)) {
                        i5 = u.x(zzmv.zzc(obj, j2), zzjj.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i6)) {
                        int zzc2 = zzmv.zzc(obj, j2);
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzc2);
                        zzu = zzv + zzA2;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i6)) {
                        int zzc3 = zzmv.zzc(obj, j2);
                        i5 = u.x((zzc3 >> 31) ^ (zzc3 + zzc3), zzjj.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i6)) {
                        long zzd5 = zzmv.zzd(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i6)) {
                        zzu = zzjj.zzu(i7, (zzlj) zzmv.zzf(obj, j2), zzE(i6));
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    zzo = zzlw.zzx(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i7, (List) zzmv.zzf(obj, j2));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i7, (List) zzmv.zzf(obj, j2), zzE(i6));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i7, (List) zzmv.zzf(obj, j2));
                    i5 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i7, (List) zzmv.zzf(obj, j2), false);
                    i5 += zzo;
                    break;
                case 35:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        i5 = u.y(zzi, zzjj.zzz(i7), zzi, i5);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg > 0) {
                        i5 = u.y(zzg, zzjj.zzz(i7), zzg, i5);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j2));
                    if (zzn > 0) {
                        i5 = u.y(zzn, zzjj.zzz(i7), zzn, i5);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j2));
                    if (zzy > 0) {
                        i5 = u.y(zzy, zzjj.zzz(i7), zzy, i5);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j2));
                    if (zzl > 0) {
                        i5 = u.y(zzl, zzjj.zzz(i7), zzl, i5);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi2 > 0) {
                        i5 = u.y(zzi2, zzjj.zzz(i7), zzi2, i5);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg2 > 0) {
                        i5 = u.y(zzg2, zzjj.zzz(i7), zzg2, i5);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j2));
                    if (zzb2 > 0) {
                        i5 = u.y(zzb2, zzjj.zzz(i7), zzb2, i5);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j2));
                    if (zzw > 0) {
                        i5 = u.y(zzw, zzjj.zzz(i7), zzw, i5);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j2));
                    if (zze > 0) {
                        i5 = u.y(zze, zzjj.zzz(i7), zze, i5);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j2));
                    if (zzg3 > 0) {
                        i5 = u.y(zzg3, zzjj.zzz(i7), zzg3, i5);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi3 > 0) {
                        i5 = u.y(zzi3, zzjj.zzz(i7), zzi3, i5);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j2));
                    if (zzr > 0) {
                        i5 = u.y(zzr, zzjj.zzz(i7), zzr, i5);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j2));
                    if (zzt > 0) {
                        i5 = u.y(zzt, zzjj.zzz(i7), zzt, i5);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i7, (List) zzmv.zzf(obj, j2), zzE(i6));
                    i5 += zzo;
                    break;
                case 50:
                    zzle.zza(i7, zzmv.zzf(obj, j2), zzF(i6));
                    break;
                case 51:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i7, i6)) {
                        long zzC = zzC(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzC);
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i6)) {
                        long zzC2 = zzC(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzC2);
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzR(obj, i7, i6)) {
                        int zzr2 = zzr(obj, j2);
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzr2);
                        zzu = zzv + zzA2;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 1, i5);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i6)) {
                        Object zzf2 = zzmv.zzf(obj, j2);
                        if (zzf2 instanceof zzjb) {
                            int zzA6 = zzjj.zzA(i7 << 3);
                            int zzd6 = ((zzjb) zzf2).zzd();
                            i5 = u.y(zzd6, zzd6, zzA6, i5);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i7 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            zzu = zzv + zzA2;
                            i5 += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzR(obj, i7, i6)) {
                        zzo = zzlw.zzo(i7, zzmv.zzf(obj, j2), zzE(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i6)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j2);
                        int zzA7 = zzjj.zzA(i7 << 3);
                        int zzd7 = zzjbVar2.zzd();
                        i5 = u.y(zzd7, zzd7, zzA7, i5);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(zzr(obj, j2), zzjj.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i6)) {
                        int zzr3 = zzr(obj, j2);
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzr3);
                        zzu = zzv + zzA2;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 4, i5);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i6)) {
                        i5 = u.x(i7 << 3, 8, i5);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i7, i6)) {
                        int zzr4 = zzr(obj, j2);
                        i5 = u.x((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i7 << 3), i5);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i7, i6)) {
                        long zzC3 = zzC(obj, j2);
                        zzA = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzu = zzB + zzA;
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i6)) {
                        zzu = zzjj.zzu(i7, (zzlj) zzmv.zzf(obj, j2), zzE(i6));
                        i5 += zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i5 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j2) {
        return ((Integer) zzmv.zzf(obj, j2)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i5, int i6, int i7, long j2, zzio zzioVar) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i7);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j2, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j2, int i12, zzio zzioVar) {
        Object object;
        Unsafe unsafe = zzb;
        long j5 = this.zzc[i12 + 2] & 1048575;
        switch (i11) {
            case 51:
                if (i9 != 1) {
                    return i5;
                }
                unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i5))));
                unsafe.putInt(obj, j5, i8);
                return i5 + 8;
            case 52:
                if (i9 != 5) {
                    return i5;
                }
                unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i5))));
                unsafe.putInt(obj, j5, i8);
                return i5 + 4;
            case 53:
            case 54:
                if (i9 != 0) {
                    return i5;
                }
                int zzm = zzip.zzm(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j5, i8);
                return zzm;
            case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
            case 62:
                if (i9 != 0) {
                    return i5;
                }
                int zzj = zzip.zzj(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j5, i8);
                return zzj;
            case 56:
            case 65:
                if (i9 != 1) {
                    return i5;
                }
                unsafe.putObject(obj, j2, Long.valueOf(zzip.zzn(bArr, i5)));
                unsafe.putInt(obj, j5, i8);
                return i5 + 8;
            case 57:
            case 64:
                if (i9 != 5) {
                    return i5;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(zzip.zzb(bArr, i5)));
                unsafe.putInt(obj, j5, i8);
                return i5 + 4;
            case 58:
                if (i9 != 0) {
                    return i5;
                }
                int zzm2 = zzip.zzm(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j5, i8);
                return zzm2;
            case 59:
                if (i9 != 2) {
                    return i5;
                }
                int zzj2 = zzip.zzj(bArr, i5, zzioVar);
                int i13 = zzioVar.zza;
                if (i13 == 0) {
                    unsafe.putObject(obj, j2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else {
                    if ((i10 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i13)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j2, new String(bArr, zzj2, i13, zzkk.zzb));
                    zzj2 += i13;
                }
                unsafe.putInt(obj, j5, i8);
                return zzj2;
            case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                if (i9 != 2) {
                    return i5;
                }
                int zzd = zzip.zzd(zzE(i12), bArr, i5, i6, zzioVar);
                object = unsafe.getInt(obj, j5) == i8 ? unsafe.getObject(obj, j2) : null;
                if (object == null) {
                    unsafe.putObject(obj, j2, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j2, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j5, i8);
                return zzd;
            case 61:
                if (i9 != 2) {
                    return i5;
                }
                int zza2 = zzip.zza(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, zzioVar.zzc);
                unsafe.putInt(obj, j5, i8);
                return zza2;
            case 63:
                if (i9 != 0) {
                    return i5;
                }
                int zzj3 = zzip.zzj(bArr, i5, zzioVar);
                int i14 = zzioVar.zza;
                zzkg zzD = zzD(i12);
                if (zzD != null && !zzD.zza(i14)) {
                    zzd(obj).zzh(i7, Long.valueOf(i14));
                    return zzj3;
                }
                unsafe.putObject(obj, j2, Integer.valueOf(i14));
                unsafe.putInt(obj, j5, i8);
                return zzj3;
            case 66:
                if (i9 != 0) {
                    return i5;
                }
                int zzj4 = zzip.zzj(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j5, i8);
                return zzj4;
            case 67:
                if (i9 != 0) {
                    return i5;
                }
                int zzm3 = zzip.zzm(bArr, i5, zzioVar);
                unsafe.putObject(obj, j2, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j5, i8);
                return zzm3;
            case 68:
                if (i9 == 3) {
                    int zzc = zzip.zzc(zzE(i12), bArr, i5, i6, (i7 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j5) == i8 ? unsafe.getObject(obj, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j2, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j2, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j5, i8);
                    return zzc;
                }
                break;
        }
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i5, int i6, zzio zzioVar) {
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i17 = i6;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i18 = -1;
        int i19 = i5;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1048575;
        while (i19 < i17) {
            int i24 = i19 + 1;
            int i25 = bArr2[i19];
            if (i25 < 0) {
                i24 = zzip.zzk(i25, bArr2, i24, zzioVar2);
                i25 = zzioVar2.zza;
            }
            int i26 = i24;
            int i27 = i25 >>> 3;
            int i28 = i25 & 7;
            int zzx = i27 > i20 ? zzlmVar.zzx(i27, i21 / 3) : zzlmVar.zzw(i27);
            if (zzx == i18) {
                unsafe = unsafe2;
                i7 = i25;
                i8 = i18;
                i9 = i27;
                i10 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i29 = iArr[zzx + 1];
                int zzA = zzA(i29);
                int i30 = i25;
                int i31 = zzx;
                long j2 = i29 & 1048575;
                if (zzA <= 17) {
                    int i32 = iArr[i31 + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    if (i34 != i23) {
                        int i35 = 1048575;
                        if (i23 != 1048575) {
                            unsafe2.putInt(obj3, i23, i22);
                            i35 = 1048575;
                        }
                        if (i34 != i35) {
                            i22 = unsafe2.getInt(obj3, i34);
                        }
                        i23 = i34;
                    }
                    switch (zzA) {
                        case 0:
                            i16 = i31;
                            if (i28 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                zzmv.zzo(obj3, j2, Double.longBitsToDouble(zzip.zzn(bArr2, i26)));
                                i19 = i26 + 8;
                                i22 |= i33;
                                i17 = i6;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 1:
                            i16 = i31;
                            if (i28 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                zzmv.zzp(obj3, j2, Float.intBitsToFloat(zzip.zzb(bArr2, i26)));
                                i19 = i26 + 4;
                                i22 |= i33;
                                i17 = i6;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i16 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                int zzm = zzip.zzm(bArr2, i26, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j2, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i22 |= i33;
                                i19 = zzm;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                i17 = i6;
                                break;
                            }
                        case 4:
                        case 11:
                            i16 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                int zzj = zzip.zzj(bArr2, i26, zzioVar2);
                                unsafe2.putInt(obj3, j2, zzioVar2.zza);
                                i22 |= i33;
                                i17 = i6;
                                i19 = zzj;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i16 = i31;
                            if (i28 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j2, zzip.zzn(bArr2, i26));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                i19 = i26 + 8;
                                i22 |= i33;
                                i17 = i6;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i16 = i31;
                            if (i28 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j2, zzip.zzb(bArr2, i26));
                                i19 = i26 + 4;
                                i22 |= i33;
                                i17 = i6;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 7:
                            i16 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = zzip.zzm(bArr2, i26, zzioVar2);
                                zzmv.zzm(obj3, j2, zzioVar2.zzb != 0);
                                i22 |= i33;
                                i17 = i6;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 8:
                            i16 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = (536870912 & i29) == 0 ? zzip.zzg(bArr2, i26, zzioVar2) : zzip.zzh(bArr2, i26, zzioVar2);
                                unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                i22 |= i33;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 9:
                            i16 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = zzip.zzd(zzlmVar.zzE(i16), bArr2, i26, i17, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j2);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j2, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i22 |= i33;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 10:
                            i16 = i31;
                            if (i28 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = zzip.zza(bArr2, i26, zzioVar2);
                                unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                i22 |= i33;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 12:
                            i16 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = zzip.zzj(bArr2, i26, zzioVar2);
                                unsafe2.putInt(obj3, j2, zzioVar2.zza);
                                i22 |= i33;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 15:
                            i16 = i31;
                            if (i28 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                i19 = zzip.zzj(bArr2, i26, zzioVar2);
                                unsafe2.putInt(obj3, j2, zzjf.zzb(zzioVar2.zza));
                                i22 |= i33;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        case 16:
                            if (i28 != 0) {
                                i16 = i31;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i9 = i27;
                                i10 = i16;
                                i8 = -1;
                                i7 = i30;
                                break;
                            } else {
                                int zzm2 = zzip.zzm(bArr2, i26, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i16 = i31;
                                unsafe5.putLong(obj6, j2, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i22 |= i33;
                                i19 = zzm2;
                                i20 = i27;
                                i21 = i16;
                                i18 = -1;
                                break;
                            }
                        default:
                            i16 = i31;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i9 = i27;
                            i10 = i16;
                            i8 = -1;
                            i7 = i30;
                            break;
                    }
                } else {
                    i10 = i31;
                    if (zzA != 27) {
                        i11 = i26;
                        Unsafe unsafe6 = unsafe2;
                        if (zzA <= 49) {
                            i12 = i22;
                            unsafe = unsafe6;
                            i8 = -1;
                            i14 = i23;
                            int zzv = zzlmVar.zzv(obj, bArr, i11, i6, i30, i27, i28, i10, i29, zzA, j2, zzioVar);
                            i13 = i30;
                            i15 = i27;
                            if (zzv != i11) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                i19 = zzv;
                                i21 = i10;
                                i20 = i15;
                                i23 = i14;
                                i18 = i8;
                                i22 = i12;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i17 = i6;
                            } else {
                                obj2 = obj;
                                i26 = zzv;
                                i9 = i15;
                                i7 = i13;
                            }
                        } else {
                            i12 = i22;
                            unsafe = unsafe6;
                            i8 = -1;
                            i13 = i30;
                            i14 = i23;
                            i15 = i27;
                            if (zzA != 50) {
                                i9 = i15;
                                int zzt = zzt(obj, bArr, i11, i6, i13, i9, i28, i29, zzA, j2, i10, zzioVar);
                                obj2 = obj;
                                i7 = i13;
                                i10 = i10;
                                if (zzt != i11) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i20 = i9;
                                    i19 = zzt;
                                    i21 = i10;
                                    obj3 = obj2;
                                    i23 = i14;
                                    i18 = i8;
                                    i22 = i12;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i17 = i6;
                                } else {
                                    i26 = zzt;
                                }
                            } else if (i28 == 2) {
                                int zzs = zzs(obj, bArr, i11, i6, i10, j2, zzioVar);
                                i10 = i10;
                                if (zzs != i11) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    i19 = zzs;
                                    i21 = i10;
                                    i20 = i15;
                                    i23 = i14;
                                    i18 = -1;
                                    i22 = i12;
                                    unsafe2 = unsafe;
                                    i17 = i6;
                                } else {
                                    obj2 = obj;
                                    i26 = zzs;
                                    i9 = i15;
                                    i7 = i13;
                                }
                            } else {
                                i10 = i10;
                                obj2 = obj;
                                i26 = i11;
                                i9 = i15;
                                i7 = i13;
                            }
                        }
                    } else if (i28 == 2) {
                        zzkj zzkjVar = (zzkj) unsafe2.getObject(obj3, j2);
                        if (!zzkjVar.zzc()) {
                            int size = zzkjVar.size();
                            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j2, zzkjVar);
                        }
                        int zze = zzip.zze(zzlmVar.zzE(i10), i30, bArr2, i26, i6, zzkjVar, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        i19 = zze;
                        i21 = i10;
                        unsafe2 = unsafe2;
                        i20 = i27;
                        i18 = -1;
                        obj3 = obj;
                        i17 = i6;
                    } else {
                        i11 = i26;
                        i14 = i23;
                        i12 = i22;
                        unsafe = unsafe2;
                        i15 = i27;
                        i8 = -1;
                        i13 = i30;
                        obj2 = obj;
                        i26 = i11;
                        i9 = i15;
                        i7 = i13;
                    }
                    i23 = i14;
                    i22 = i12;
                }
            }
            int zzi = zzip.zzi(i7, bArr, i26, i6, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i20 = i9;
            i21 = i10;
            obj3 = obj2;
            i18 = i8;
            unsafe2 = unsafe;
            i17 = i6;
            i19 = zzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i36 = i17;
        int i37 = i23;
        int i38 = i22;
        if (i37 != 1048575) {
            unsafe7.putInt(obj7, i37, i38);
        }
        if (i19 == i36) {
            return i19;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i5, int i6, int i7, int i8, int i9, int i10, long j2, int i11, long j5, zzio zzioVar) {
        int zzl;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j5);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, zzkjVar);
        }
        zzkj zzkjVar2 = zzkjVar;
        switch (i11) {
            case 18:
            case 35:
                if (i9 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar2;
                    int zzj = zzip.zzj(bArr, i5, zzioVar);
                    int i12 = zzioVar.zza + zzj;
                    while (zzj < i12) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i12) {
                        return zzj;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar2;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i5)));
                    int i13 = i5 + 8;
                    while (i13 < i6) {
                        int zzj2 = zzip.zzj(bArr, i13, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return i13;
                        }
                        zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj2)));
                        i13 = zzj2 + 8;
                    }
                    return i13;
                }
                return i5;
            case 19:
            case 36:
                if (i9 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar2;
                    int zzj3 = zzip.zzj(bArr, i5, zzioVar);
                    int i14 = zzioVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar2;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i5)));
                    int i15 = i5 + 4;
                    while (i15 < i6) {
                        int zzj4 = zzip.zzj(bArr, i15, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return i15;
                        }
                        zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj4)));
                        i15 = zzj4 + 4;
                    }
                    return i15;
                }
                return i5;
            case 20:
            case zzbgj.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i9 == 2) {
                    zzky zzkyVar = (zzky) zzkjVar2;
                    int zzj5 = zzip.zzj(bArr, i5, zzioVar);
                    int i16 = zzioVar.zza + zzj5;
                    while (zzj5 < i16) {
                        zzj5 = zzip.zzm(bArr, zzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj5 == i16) {
                        return zzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar2;
                    int zzm = zzip.zzm(bArr, i5, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i6) {
                        int zzj6 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i5;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i9 == 2) {
                    return zzip.zzf(bArr, i5, zzkjVar2, zzioVar);
                }
                if (i9 == 0) {
                    return zzip.zzl(i7, bArr, i5, i6, zzkjVar2, zzioVar);
                }
                return i5;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i9 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar2;
                    int zzj7 = zzip.zzj(bArr, i5, zzioVar);
                    int i17 = zzioVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar2;
                    zzkyVar4.zzg(zzip.zzn(bArr, i5));
                    int i18 = i5 + 8;
                    while (i18 < i6) {
                        int zzj8 = zzip.zzj(bArr, i18, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return i18;
                        }
                        zzkyVar4.zzg(zzip.zzn(bArr, zzj8));
                        i18 = zzj8 + 8;
                    }
                    return i18;
                }
                return i5;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i9 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVar2;
                    int zzj9 = zzip.zzj(bArr, i5, zzioVar);
                    int i19 = zzioVar.zza + zzj9;
                    while (zzj9 < i19) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i19) {
                        return zzj9;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar2;
                    zzkdVar2.zzh(zzip.zzb(bArr, i5));
                    int i20 = i5 + 4;
                    while (i20 < i6) {
                        int zzj10 = zzip.zzj(bArr, i20, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return i20;
                        }
                        zzkdVar2.zzh(zzip.zzb(bArr, zzj10));
                        i20 = zzj10 + 4;
                    }
                    return i20;
                }
                return i5;
            case 25:
            case 42:
                if (i9 == 2) {
                    zziq zziqVar = (zziq) zzkjVar2;
                    int zzj11 = zzip.zzj(bArr, i5, zzioVar);
                    int i21 = zzioVar.zza + zzj11;
                    while (zzj11 < i21) {
                        zzj11 = zzip.zzm(bArr, zzj11, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj11 == i21) {
                        return zzj11;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar2;
                    int zzm2 = zzip.zzm(bArr, i5, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i6) {
                        int zzj12 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj12, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i5;
            case 26:
                if (i9 == 2) {
                    if ((j2 & 536870912) == 0) {
                        int zzj13 = zzip.zzj(bArr, i5, zzioVar);
                        int i22 = zzioVar.zza;
                        if (i22 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i22 == 0) {
                            zzkjVar2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        } else {
                            zzkjVar2.add(new String(bArr, zzj13, i22, zzkk.zzb));
                            zzj13 += i22;
                        }
                        while (zzj13 < i6) {
                            int zzj14 = zzip.zzj(bArr, zzj13, zzioVar);
                            if (i7 != zzioVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzip.zzj(bArr, zzj14, zzioVar);
                            int i23 = zzioVar.zza;
                            if (i23 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i23 == 0) {
                                zzkjVar2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            } else {
                                zzkjVar2.add(new String(bArr, zzj13, i23, zzkk.zzb));
                                zzj13 += i23;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzip.zzj(bArr, i5, zzioVar);
                    int i24 = zzioVar.zza;
                    if (i24 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i24 == 0) {
                        zzkjVar2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    } else {
                        int i25 = zzj15 + i24;
                        if (!zzna.zzf(bArr, zzj15, i25)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar2.add(new String(bArr, zzj15, i24, zzkk.zzb));
                        zzj15 = i25;
                    }
                    while (zzj15 < i6) {
                        int zzj16 = zzip.zzj(bArr, zzj15, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzip.zzj(bArr, zzj16, zzioVar);
                        int i26 = zzioVar.zza;
                        if (i26 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i26 == 0) {
                            zzkjVar2.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        } else {
                            int i27 = zzj15 + i26;
                            if (!zzna.zzf(bArr, zzj15, i27)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar2.add(new String(bArr, zzj15, i26, zzkk.zzb));
                            zzj15 = i27;
                        }
                    }
                    return zzj15;
                }
                return i5;
            case 27:
                if (i9 == 2) {
                    return zzip.zze(zzE(i10), i7, bArr, i5, i6, zzkjVar2, zzioVar);
                }
                return i5;
            case 28:
                if (i9 == 2) {
                    int zzj17 = zzip.zzj(bArr, i5, zzioVar);
                    int i28 = zzioVar.zza;
                    if (i28 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i28 > bArr.length - zzj17) {
                        throw zzkm.zzf();
                    }
                    if (i28 == 0) {
                        zzkjVar2.add(zzjb.zzb);
                    } else {
                        zzkjVar2.add(zzjb.zzl(bArr, zzj17, i28));
                        zzj17 += i28;
                    }
                    while (zzj17 < i6) {
                        int zzj18 = zzip.zzj(bArr, zzj17, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzip.zzj(bArr, zzj18, zzioVar);
                        int i29 = zzioVar.zza;
                        if (i29 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i29 > bArr.length - zzj17) {
                            throw zzkm.zzf();
                        }
                        if (i29 == 0) {
                            zzkjVar2.add(zzjb.zzb);
                        } else {
                            zzkjVar2.add(zzjb.zzl(bArr, zzj17, i29));
                            zzj17 += i29;
                        }
                    }
                    return zzj17;
                }
                return i5;
            case 30:
            case 44:
                if (i9 != 2) {
                    if (i9 == 0) {
                        zzl = zzip.zzl(i7, bArr, i5, i6, zzkjVar2, zzioVar);
                    }
                    return i5;
                }
                zzl = zzip.zzf(bArr, i5, zzkjVar2, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i8, zzkjVar2, zzD(i10), zzmmVar, this.zzn);
                if (zzC == null) {
                    return zzl;
                }
                zzkcVar.zzc = (zzmm) zzC;
                return zzl;
            case 33:
            case 47:
                if (i9 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar2;
                    int zzj19 = zzip.zzj(bArr, i5, zzioVar);
                    int i30 = zzioVar.zza + zzj19;
                    while (zzj19 < i30) {
                        zzj19 = zzip.zzj(bArr, zzj19, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj19 == i30) {
                        return zzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar2;
                    int zzj20 = zzip.zzj(bArr, i5, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj20 < i6) {
                        int zzj21 = zzip.zzj(bArr, zzj20, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzip.zzj(bArr, zzj21, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj20;
                }
                return i5;
            case 34:
            case 48:
                if (i9 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar2;
                    int zzj22 = zzip.zzj(bArr, i5, zzioVar);
                    int i31 = zzioVar.zza + zzj22;
                    while (zzj22 < i31) {
                        zzj22 = zzip.zzm(bArr, zzj22, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj22 == i31) {
                        return zzj22;
                    }
                    throw zzkm.zzf();
                }
                if (i9 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar2;
                    int zzm3 = zzip.zzm(bArr, i5, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i6) {
                        int zzj23 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i7 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj23, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i5;
            default:
                if (i9 == 3) {
                    zzlu zzE = zzE(i10);
                    int i32 = (i7 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i5, i6, i32, zzioVar);
                    zzlu zzluVar = zzE;
                    zzio zzioVar2 = zzioVar;
                    zzkjVar2.add(zzioVar2.zzc);
                    while (zzc < i6) {
                        int zzj24 = zzip.zzj(bArr, zzc, zzioVar2);
                        if (i7 != zzioVar2.zza) {
                            return zzc;
                        }
                        zzlu zzluVar2 = zzluVar;
                        zzio zzioVar3 = zzioVar2;
                        zzc = zzip.zzc(zzluVar2, bArr, zzj24, i6, i32, zzioVar3);
                        zzkjVar2.add(zzioVar3.zzc);
                        zzluVar = zzluVar2;
                        zzioVar2 = zzioVar3;
                    }
                    return zzc;
                }
                return i5;
        }
    }

    private final int zzw(int i5) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzz(i5, 0);
    }

    private final int zzx(int i5, int i6) {
        if (i5 < this.zze || i5 > this.zzf) {
            return -1;
        }
        return zzz(i5, i6);
    }

    private final int zzy(int i5) {
        return this.zzc[i5 + 2];
    }

    private final int zzz(int i5, int i6) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i5;
        int zzc;
        int i6;
        int zzc2;
        int length = this.zzc.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int zzB = zzB(i8);
            int i9 = this.zzc[i8];
            long j2 = 1048575 & zzB;
            int i10 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j2)));
                    i7 = zzc + i5;
                    break;
                case 1:
                    i5 = i7 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 2:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 3:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 4:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 5:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 6:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 7:
                    i5 = i7 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 8:
                    i5 = i7 * 53;
                    zzc = ((String) zzmv.zzf(obj, j2)).hashCode();
                    i7 = zzc + i5;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j2);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
                    break;
                case 10:
                    i5 = i7 * 53;
                    zzc = zzmv.zzf(obj, j2).hashCode();
                    i7 = zzc + i5;
                    break;
                case 11:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 12:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 13:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 14:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 15:
                    i6 = i7 * 53;
                    zzc2 = zzmv.zzc(obj, j2);
                    i7 = i6 + zzc2;
                    break;
                case 16:
                    i5 = i7 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j2));
                    i7 = zzc + i5;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j2);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
                    }
                    i7 = (i7 * 53) + i10;
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
                    i5 = i7 * 53;
                    zzc = zzmv.zzf(obj, j2).hashCode();
                    i7 = zzc + i5;
                    break;
                case 50:
                    i5 = i7 * 53;
                    zzc = zzmv.zzf(obj, j2).hashCode();
                    i7 = zzc + i5;
                    break;
                case 51:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j2)));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(zzC(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(zzC(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(zzC(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zza(zzS(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = ((String) zzmv.zzf(obj, j2)).hashCode();
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzmv.zzf(obj, j2).hashCode();
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzmv.zzf(obj, j2).hashCode();
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(zzC(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i9, i8)) {
                        i6 = i7 * 53;
                        zzc2 = zzr(obj, j2);
                        i7 = i6 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzkk.zzc(zzC(obj, j2));
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i9, i8)) {
                        i5 = i7 * 53;
                        zzc = zzmv.zzf(obj, j2).hashCode();
                        i7 = zzc + i5;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(obj).hashCode() + (i7 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x04a4, code lost:
    
        if (r11 == r15) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04a6, code lost:
    
        r20.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04ac, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04b0, code lost:
    
        if (r0 >= r8.zzl) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04b2, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r8.zzB(r1) & r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04c4, code lost:
    
        if (r2 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04cb, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04d0, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzld) r2;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04cd, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04d9, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04db, code lost:
    
        if (r3 != r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04e2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04e7, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04e3, code lost:
    
        if (r3 > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04e5, code lost:
    
        if (r6 != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04ec, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i5, int i6, int i7, zzio zzioVar) {
        int i8;
        Object obj2;
        Unsafe unsafe;
        int i9;
        zzlm<T> zzlmVar;
        int i10;
        int i11;
        int zzi;
        int i12;
        int i13;
        int i14;
        int i15;
        zzio zzioVar2;
        Unsafe unsafe2;
        int i16;
        int i17;
        byte[] bArr2;
        int i18;
        int i19;
        byte[] bArr3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzlm<T> zzlmVar2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i26 = i6;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe3 = zzb;
        int i27 = i5;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 1048575;
        while (true) {
            if (i27 < i26) {
                int i33 = i27 + 1;
                int i34 = bArr4[i27];
                if (i34 < 0) {
                    i33 = zzip.zzk(i34, bArr4, i33, zzioVar3);
                    i34 = zzioVar3.zza;
                }
                int i35 = i34;
                int i36 = i33;
                int i37 = i35 >>> 3;
                int i38 = i35 & 7;
                i30 = i37 > i31 ? zzlmVar2.zzx(i37, i30 / 3) : zzlmVar2.zzw(i37);
                if (i30 == -1) {
                    obj2 = obj3;
                    i10 = i36;
                    unsafe = unsafe3;
                    i30 = 0;
                    i9 = 1048575;
                    i8 = i7;
                    zzlmVar = zzlmVar2;
                    i11 = i35;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i39 = iArr[i30 + 1];
                    int zzA = zzA(i39);
                    int i40 = i35;
                    long j2 = i39 & 1048575;
                    if (zzA <= 17) {
                        int i41 = iArr[i30 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i32) {
                            i12 = 1048575;
                            if (i32 != 1048575) {
                                unsafe3.putInt(obj3, i32, i29);
                            }
                            i32 = i43;
                            i29 = unsafe3.getInt(obj3, i43);
                        } else {
                            i12 = 1048575;
                        }
                        switch (zzA) {
                            case 0:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i16 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 1) {
                                    int i44 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i44;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    zzmv.zzo(obj3, j2, Double.longBitsToDouble(zzip.zzn(bArr2, i16)));
                                    i27 = i16 + 8;
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 1:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i16 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 5) {
                                    int i442 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i442;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    zzmv.zzp(obj3, j2, Float.intBitsToFloat(zzip.zzb(bArr2, i16)));
                                    i27 = i16 + 4;
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 2:
                            case 3:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i16 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                if (i38 != 0) {
                                    int i4422 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i4422;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzm = zzip.zzm(bArr, i16, zzioVar2);
                                    unsafe2.putLong(obj, j2, zzioVar2.zzb);
                                    unsafe2 = unsafe2;
                                    obj3 = obj;
                                    i29 |= i42;
                                    bArr4 = bArr;
                                    i28 = i17;
                                    i27 = zzm;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i16 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 0) {
                                    int i44222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i44222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zzj(bArr2, i16, zzioVar2);
                                    unsafe2.putInt(obj3, j2, zzioVar2.zza);
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 5:
                            case 14:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 1) {
                                    i16 = i18;
                                    int i442222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i442222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i16 = i18;
                                    unsafe2.putLong(obj, j2, zzip.zzn(bArr2, i18));
                                    unsafe2 = unsafe2;
                                    obj3 = obj;
                                    i27 = i16 + 8;
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 6:
                            case 13:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 5) {
                                    i16 = i18;
                                    int i4422222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i4422222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j2, zzip.zzb(bArr2, i18));
                                    i27 = i18 + 4;
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 7:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 0) {
                                    i16 = i18;
                                    int i44222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i44222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zzm(bArr2, i18, zzioVar2);
                                    zzmv.zzm(obj3, j2, zzioVar2.zzb != 0);
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 8:
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr2 = bArr;
                                if (i38 != 2) {
                                    i16 = i18;
                                    int i442222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i442222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = (536870912 & i39) == 0 ? zzip.zzg(bArr2, i18, zzioVar2) : zzip.zzh(bArr2, i18, zzioVar2);
                                    unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                    i29 |= i42;
                                    bArr4 = bArr2;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i6;
                                    break;
                                }
                            case 9:
                                i19 = i6;
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr3 = bArr;
                                if (i38 != 2) {
                                    i16 = i18;
                                    int i4422222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i4422222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zzd(zzlmVar2.zzE(i30), bArr3, i18, i19, zzioVar2);
                                    if ((i29 & i42) == 0) {
                                        unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j2, zzkk.zzg(unsafe2.getObject(obj3, j2), zzioVar2.zzc));
                                    }
                                    i29 |= i42;
                                    bArr4 = bArr3;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i19;
                                    break;
                                }
                            case 10:
                                i19 = i6;
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                i17 = i40;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr3 = bArr;
                                if (i38 != 2) {
                                    i16 = i18;
                                    int i44222222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i44222222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zza(bArr3, i18, zzioVar2);
                                    unsafe2.putObject(obj3, j2, zzioVar2.zzc);
                                    i29 |= i42;
                                    bArr4 = bArr3;
                                    i28 = i17;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    unsafe3 = unsafe2;
                                    i26 = i19;
                                    break;
                                }
                            case 12:
                                i19 = i6;
                                i13 = i37;
                                unsafe2 = unsafe3;
                                i18 = i36;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                bArr3 = bArr;
                                if (i38 != 0) {
                                    i17 = i40;
                                    i16 = i18;
                                    int i442222222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i442222222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zzj(bArr3, i18, zzioVar2);
                                    int i45 = zzioVar2.zza;
                                    zzkg zzD = zzlmVar2.zzD(i30);
                                    if (zzD == null || zzD.zza(i45)) {
                                        i17 = i40;
                                        unsafe2.putInt(obj3, j2, i45);
                                        i29 |= i42;
                                        bArr4 = bArr3;
                                        i28 = i17;
                                        zzioVar3 = zzioVar2;
                                        i31 = i13;
                                        unsafe3 = unsafe2;
                                        i26 = i19;
                                        break;
                                    } else {
                                        i17 = i40;
                                        zzd(obj3).zzh(i17, Long.valueOf(i45));
                                        bArr4 = bArr3;
                                        i28 = i17;
                                        zzioVar3 = zzioVar2;
                                        i31 = i13;
                                        unsafe3 = unsafe2;
                                        i26 = i19;
                                    }
                                }
                                break;
                            case 15:
                                i20 = i6;
                                i13 = i37;
                                unsafe2 = unsafe3;
                                zzioVar2 = zzioVar;
                                i15 = i12;
                                if (i38 != 0) {
                                    i16 = i36;
                                    i17 = i40;
                                    int i4422222222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i4422222222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i27 = zzip.zzj(bArr, i36, zzioVar2);
                                    unsafe2.putInt(obj3, j2, zzjf.zzb(zzioVar2.zza));
                                    i29 |= i42;
                                    unsafe3 = unsafe2;
                                    bArr4 = bArr;
                                    i26 = i20;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    i28 = i40;
                                    break;
                                }
                            case 16:
                                i20 = i6;
                                i13 = i37;
                                i14 = i36;
                                i15 = i12;
                                if (i38 != 0) {
                                    zzioVar2 = zzioVar;
                                    i16 = i14;
                                    unsafe2 = unsafe3;
                                    i17 = i40;
                                    int i44222222222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i44222222222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzm2 = zzip.zzm(bArr, i14, zzioVar);
                                    zzioVar2 = zzioVar;
                                    Object obj4 = obj3;
                                    Unsafe unsafe4 = unsafe3;
                                    unsafe4.putLong(obj4, j2, zzjf.zzc(zzioVar.zzb));
                                    obj3 = obj4;
                                    i29 |= i42;
                                    unsafe3 = unsafe4;
                                    bArr4 = bArr;
                                    i27 = zzm2;
                                    i26 = i20;
                                    zzioVar3 = zzioVar2;
                                    i31 = i13;
                                    i28 = i40;
                                    break;
                                }
                            default:
                                if (i38 != 3) {
                                    i13 = i37;
                                    i14 = i36;
                                    i15 = i12;
                                    zzioVar2 = zzioVar;
                                    i16 = i14;
                                    unsafe2 = unsafe3;
                                    i17 = i40;
                                    int i442222222222222 = i17;
                                    zzlmVar = zzlmVar2;
                                    i11 = i442222222222222;
                                    i8 = i7;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i10 = i16;
                                    i37 = i13;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzc = zzip.zzc(zzlmVar2.zzE(i30), bArr, i36, i6, (i37 << 3) | 4, zzioVar);
                                    if ((i29 & i42) == 0) {
                                        unsafe3.putObject(obj3, j2, zzioVar.zzc);
                                    } else {
                                        unsafe3.putObject(obj3, j2, zzkk.zzg(unsafe3.getObject(obj3, j2), zzioVar.zzc));
                                    }
                                    i29 |= i42;
                                    zzioVar3 = zzioVar;
                                    i26 = i6;
                                    i28 = i40;
                                    i27 = zzc;
                                    bArr4 = bArr;
                                    i31 = i37;
                                    break;
                                }
                        }
                    } else {
                        Unsafe unsafe5 = unsafe3;
                        zzio zzioVar4 = zzioVar3;
                        if (zzA != 27) {
                            i40 = i40;
                            i21 = i36;
                            if (zzA <= 49) {
                                unsafe = unsafe5;
                                i9 = 1048575;
                                i22 = i32;
                                i24 = i29;
                                int zzv = zzlmVar2.zzv(obj, bArr, i21, i6, i40, i37, i38, i30, i39, zzA, j2, zzioVar);
                                i23 = i37;
                                i25 = i30;
                                if (zzv != i21) {
                                    zzlmVar2 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i26 = i6;
                                    zzioVar3 = zzioVar;
                                    i27 = zzv;
                                    i31 = i23;
                                    i30 = i25;
                                    i32 = i22;
                                    i29 = i24;
                                    unsafe3 = unsafe;
                                    i28 = i40;
                                } else {
                                    zzlmVar = this;
                                    zzioVar3 = zzioVar;
                                    i10 = zzv;
                                    i37 = i23;
                                    i30 = i25;
                                    i32 = i22;
                                    i29 = i24;
                                    i11 = i40;
                                    obj2 = obj;
                                    i8 = i7;
                                }
                            } else {
                                unsafe = unsafe5;
                                i9 = 1048575;
                                i22 = i32;
                                i23 = i37;
                                i24 = i29;
                                i25 = i30;
                                if (zzA != 50) {
                                    i37 = i23;
                                    int zzt = zzt(obj, bArr, i21, i6, i40, i37, i38, i39, zzA, j2, i25, zzioVar);
                                    zzlmVar = this;
                                    obj2 = obj;
                                    i11 = i40;
                                    zzioVar3 = zzioVar;
                                    if (zzt != i21) {
                                        bArr4 = bArr;
                                        i26 = i6;
                                        i27 = zzt;
                                        obj3 = obj2;
                                        i30 = i25;
                                        i32 = i22;
                                        i29 = i24;
                                        i31 = i37;
                                        i28 = i11;
                                        zzlmVar2 = zzlmVar;
                                        unsafe3 = unsafe;
                                    } else {
                                        i10 = zzt;
                                        i30 = i25;
                                        i32 = i22;
                                        i29 = i24;
                                        i8 = i7;
                                    }
                                } else if (i38 == 2) {
                                    int zzs = zzs(obj, bArr, i21, i6, i25, j2, zzioVar);
                                    if (zzs != i21) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i26 = i6;
                                        zzioVar3 = zzioVar;
                                        i27 = zzs;
                                        i31 = i23;
                                        i30 = i25;
                                        i32 = i22;
                                        i29 = i24;
                                        unsafe3 = unsafe;
                                        i28 = i40;
                                    } else {
                                        zzlmVar = this;
                                        i8 = i7;
                                        zzioVar3 = zzioVar;
                                        i10 = zzs;
                                        i37 = i23;
                                        i30 = i25;
                                        i32 = i22;
                                        i29 = i24;
                                        i11 = i40;
                                        obj2 = obj;
                                    }
                                }
                            }
                        } else if (i38 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe5.getObject(obj3, j2);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe5.putObject(obj3, j2, zzkjVar);
                            }
                            int zze = zzip.zze(zzlmVar2.zzE(i30), i40, bArr, i36, i6, zzkjVar, zzioVar4);
                            bArr4 = bArr;
                            i26 = i6;
                            zzioVar3 = zzioVar;
                            i27 = zze;
                            unsafe3 = unsafe5;
                            i31 = i37;
                            i28 = i40;
                            obj3 = obj;
                        } else {
                            i40 = i40;
                            i22 = i32;
                            i21 = i36;
                            i23 = i37;
                            i9 = 1048575;
                            unsafe = unsafe5;
                            i24 = i29;
                            i25 = i30;
                        }
                        zzlmVar = this;
                        i8 = i7;
                        zzioVar3 = zzioVar;
                        i10 = i21;
                        i37 = i23;
                        i30 = i25;
                        i32 = i22;
                        i29 = i24;
                        i11 = i40;
                        obj2 = obj;
                    }
                }
                if (i11 != i8 || i8 == 0) {
                    if (!zzlmVar.zzh || zzioVar3.zzd == zzjo.zza()) {
                        zzi = zzip.zzi(i11, bArr, i10, i6, zzd(obj2), zzioVar);
                        i26 = i6;
                    } else {
                        if (zzioVar3.zzd.zzc(zzlmVar.zzg, i37) != null) {
                            throw null;
                        }
                        zzi = zzip.zzi(i11, bArr, i10, i6, zzd(obj2), zzioVar3);
                        i26 = i6;
                    }
                    i27 = zzi;
                    bArr4 = bArr;
                    zzioVar3 = zzioVar;
                    i31 = i37;
                    obj3 = obj2;
                    i28 = i11;
                    zzlmVar2 = zzlmVar;
                    unsafe3 = unsafe;
                } else {
                    i26 = i6;
                    i28 = i11;
                    i27 = i10;
                }
            } else {
                i8 = i7;
                obj2 = obj3;
                unsafe = unsafe3;
                i9 = 1048575;
                zzlmVar = zzlmVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i5;
        int i6 = this.zzk;
        while (true) {
            i5 = this.zzl;
            if (i6 >= i5) {
                break;
            }
            long zzB = zzB(this.zzj[i6]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i6++;
        }
        int length = this.zzj.length;
        while (i5 < length) {
            this.zzm.zza(obj, this.zzj[i5]);
            i5++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzB = zzB(i5);
            long j2 = 1048575 & zzB;
            int i6 = this.zzc[i5];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i5)) {
                        zzmv.zzo(obj, j2, zzmv.zza(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i5)) {
                        zzmv.zzp(obj, j2, zzmv.zzb(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i5)) {
                        zzmv.zzr(obj, j2, zzmv.zzd(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i5)) {
                        zzmv.zzr(obj, j2, zzmv.zzd(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i5)) {
                        zzmv.zzr(obj, j2, zzmv.zzd(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i5)) {
                        zzmv.zzm(obj, j2, zzmv.zzw(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i5)) {
                        zzmv.zzs(obj, j2, zzmv.zzf(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i5);
                    break;
                case 10:
                    if (zzO(obj2, i5)) {
                        zzmv.zzs(obj, j2, zzmv.zzf(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i5)) {
                        zzmv.zzr(obj, j2, zzmv.zzd(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i5)) {
                        zzmv.zzq(obj, j2, zzmv.zzc(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i5)) {
                        zzmv.zzr(obj, j2, zzmv.zzd(obj2, j2));
                        zzJ(obj, i5);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i5);
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
                    this.zzm.zzb(obj, obj2, j2);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j2);
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
                    if (zzR(obj2, i6, i5)) {
                        zzmv.zzs(obj, j2, zzmv.zzf(obj2, j2));
                        zzK(obj, i6, i5);
                        break;
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    zzI(obj, obj2, i5);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i6, i5)) {
                        zzmv.zzs(obj, j2, zzmv.zzf(obj2, j2));
                        zzK(obj, i6, i5);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i5);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i5, int i6, zzio zzioVar) {
        if (this.zzi) {
            zzu(obj, bArr, i5, i6, zzioVar);
        } else {
            zzc(obj, bArr, i5, i6, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzB = zzB(i5);
            int i6 = this.zzc[i5];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj, i5)) {
                        zzndVar.zzf(i6, zzmv.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i5)) {
                        zzndVar.zzo(i6, zzmv.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i5)) {
                        zzndVar.zzt(i6, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i5)) {
                        zzndVar.zzJ(i6, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i5)) {
                        zzndVar.zzr(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i5)) {
                        zzndVar.zzm(i6, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i5)) {
                        zzndVar.zzk(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i5)) {
                        zzndVar.zzb(i6, zzmv.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i5)) {
                        zzT(i6, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i5)) {
                        zzndVar.zzv(i6, zzmv.zzf(obj, zzB & 1048575), zzE(i5));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i5)) {
                        zzndVar.zzd(i6, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i5)) {
                        zzndVar.zzH(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i5)) {
                        zzndVar.zzi(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i5)) {
                        zzndVar.zzw(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i5)) {
                        zzndVar.zzy(i6, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i5)) {
                        zzndVar.zzA(i6, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i5)) {
                        zzndVar.zzC(i6, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i5)) {
                        zzndVar.zzq(i6, zzmv.zzf(obj, zzB & 1048575), zzE(i5));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    zzlw.zzY(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i5));
                    break;
                case 28:
                    zzlw.zzI(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i6, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i5));
                    break;
                case 50:
                    zzM(zzndVar, i6, zzmv.zzf(obj, zzB & 1048575), i5);
                    break;
                case 51:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzf(i6, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzo(i6, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzt(i6, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzJ(i6, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzr(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzm(i6, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzk(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzb(i6, zzS(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i5)) {
                        zzT(i6, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzv(i6, zzmv.zzf(obj, zzB & 1048575), zzE(i5));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzd(i6, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzH(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzi(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzw(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzy(i6, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzA(i6, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzC(i6, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i5)) {
                        zzndVar.zzq(i6, zzmv.zzf(obj, zzB & 1048575), zzE(i5));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzB = zzB(i5);
            long j2 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i5) && Double.doubleToLongBits(zzmv.zza(obj, j2)) == Double.doubleToLongBits(zzmv.zza(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i5) && Float.floatToIntBits(zzmv.zzb(obj, j2)) == Float.floatToIntBits(zzmv.zzb(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i5) && zzmv.zzd(obj, j2) == zzmv.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i5) && zzmv.zzd(obj, j2) == zzmv.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i5) && zzmv.zzd(obj, j2) == zzmv.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i5) && zzmv.zzw(obj, j2) == zzmv.zzw(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i5) && zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i5) && zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i5) && zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i5) && zzmv.zzd(obj, j2) == zzmv.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i5) && zzmv.zzc(obj, j2) == zzmv.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i5) && zzmv.zzd(obj, j2) == zzmv.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i5) && zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2));
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
                    long zzy = zzy(i5) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j2), zzmv.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i5;
        int i6;
        int i7;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.zzk) {
            int i11 = this.zzj[i10];
            int i12 = this.zzc[i11];
            int zzB = zzB(i11);
            int i13 = this.zzc[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i9 = zzb.getInt(obj, i14);
                }
                i6 = i11;
                i7 = i9;
                i5 = i14;
            } else {
                int i16 = i9;
                i5 = i8;
                i6 = i11;
                i7 = i16;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i6, i5, i7, i15)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i12, i6) && !zzQ(obj, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i6);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzE.zzk(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzP(obj, i6, i5, i7, i15) && !zzQ(obj, zzB, zzE(i6))) {
                return false;
            }
            i10++;
            i8 = i5;
            i9 = i7;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
