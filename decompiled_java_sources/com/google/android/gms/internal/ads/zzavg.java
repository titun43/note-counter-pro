package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzavg {
    public int zza = 1;
    private Object zzb;
    private long zzc;
    private double zzd;
    private zzauk zze;
    private List zzf;
    private zzauy zzg;

    private zzavg() {
    }

    public static zzavg zza(Object obj) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 1937477084) ^ d5;
        zzavgVar.zzb = obj;
        return zzavgVar;
    }

    public static zzavg zzb(long j2) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 327254586) ^ d5;
        zzavgVar.zzc = j2;
        return zzavgVar;
    }

    public static zzavg zzc(double d5) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d6 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 1605908235) ^ d6;
        zzavgVar.zzd = d5;
        return zzavgVar;
    }

    public static zzavg zzd(zzauk zzaukVar) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 1402586708) ^ d5;
        zzavgVar.zze = zzaukVar;
        return zzavgVar;
    }

    public static zzavg zze(List list) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 324763920) ^ d5;
        zzavgVar.zzf = list;
        return zzavgVar;
    }

    public static zzavg zzf(zzauy zzauyVar) {
        zzavg zzavgVar = new zzavg();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        zzavgVar.zzr();
        zzavgVar.zza = (i12 % 474613996) ^ d5;
        zzavgVar.zzg = zzauyVar;
        return zzavgVar;
    }

    public static zzavg zzg(Object obj) {
        if (obj instanceof Long) {
            return zzb(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return zzb(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return zzb(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return zzc(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return zzc(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return zzb(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return zzb(((Byte) obj).byteValue());
        }
        if (obj instanceof zzauk) {
            return zzd((zzauk) obj);
        }
        if (obj instanceof String) {
            return zzd(zzauk.zzf((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return zza(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(zzg(arrayList2.get(i5)));
        }
        return zze(arrayList);
    }

    public static zzavg zzj(zzavg zzavgVar) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = i12 % 552812661;
        try {
            int i14 = zzavgVar.zza;
            int i15 = (i13 ^ d5) + i14;
            if (i14 == 0) {
                throw null;
            }
            switch (i15) {
                case 0:
                    return new zzavg();
                case 1:
                    return zza(zzavgVar.zzl());
                case 2:
                    return zzb(zzavgVar.zzm());
                case 3:
                    return zzd(zzavgVar.zzn());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = zzavgVar.zzo().iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzj((zzavg) it.next()));
                    }
                    return zze(arrayList);
                case 5:
                    return zzf(zzavgVar.zzp());
                case 6:
                    return zzc(zzavgVar.zzq());
                default:
                    throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (zzavd e4) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e4);
        }
    }

    private final void zzr() {
        this.zza = 1;
        this.zzc = 0L;
        this.zzb = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    private final void zzs(int i5) {
        if (i5 != this.zza) {
            throw new zzavd();
        }
    }

    public final Object zzh() {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        int i12 = iArr[7];
        int d5 = u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11);
        int i13 = this.zza;
        int i14 = ((i12 % 473891334) ^ d5) + i13;
        if (i13 == 0) {
            throw null;
        }
        switch (i14) {
            case 0:
            case 5:
                throw new zzavd();
            case 1:
                return zzl();
            case 2:
                return Long.valueOf(zzm());
            case 3:
                return zzn().zza();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = zzo().iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzavg) it.next()).zzh());
                }
                return arrayList;
            case 6:
                return Double.valueOf(zzq());
            default:
                throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0252, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Class cls) {
        int i5 = ((((~849876229) & 176298782) | 901785696) + ((849876229 & 1241658174) | 1140858976)) - 1963068318;
        int i6 = 1297046355 % 1049561859;
        int i7 = ((((~1123716509) & 1768229282) | 106234960) + ((1123716509 & 1830821282) | 337466384)) - (-2089431944);
        int i8 = 878786386 % 19063328;
        int i9 = this.zza;
        int i10 = ((((((~104451352) & 1645008493) | 1535758986) + ((104451352 & (-1340865435)) | (-650413174))) - (-2144387213)) ^ (1862140492 % 1134040403)) + i9;
        if (i9 == 0) {
            throw null;
        }
        int i11 = i7 ^ i8;
        int i12 = i5 ^ i6;
        Class cls2 = Double.TYPE;
        Class cls3 = Short.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Float.TYPE;
        switch (i10) {
            case 0:
                break;
            case 1:
                return zzl();
            case 2:
                long zzm = zzm();
                if (!cls.equals(Byte.class) && !cls.equals(cls4)) {
                    if (cls.equals(Short.class) || cls.equals(cls3)) {
                        return Short.valueOf((short) ((((int) zzm) << i12) >> i12));
                    }
                    if (cls.equals(Integer.class) || cls.equals(cls6)) {
                        return Integer.valueOf(Math.toIntExact(zzm));
                    }
                    if (!cls.equals(Long.class) && !cls.equals(cls5)) {
                        if (cls.equals(Float.class) || cls.equals(cls7)) {
                            return Float.valueOf(zzm);
                        }
                        if (cls.equals(Double.class) || cls.equals(cls2)) {
                            return Double.valueOf(zzm);
                        }
                        if (!cls.equals(Boolean.class) && !cls.equals(Boolean.TYPE)) {
                            if (!cls.equals(Character.class) && !cls.equals(Character.TYPE)) {
                                break;
                            }
                        } else {
                            return Boolean.valueOf(zzm != 0);
                        }
                    }
                    return Long.valueOf(zzm);
                }
                return Byte.valueOf((byte) ((((int) zzm) << i11) >> i11));
            case 3:
                zzauk zzn = zzn();
                if (cls.equals(zzauk.class)) {
                    return zzn;
                }
                if (cls.equals(Object.class) || cls.equals(String.class)) {
                    return zzn.zzc();
                }
                if (cls.equals(byte[].class)) {
                    return zzn.zza();
                }
                break;
            case 4:
                if (cls.equals(ArrayList.class) || cls.equals(Object.class) || cls.equals(AbstractList.class) || cls.equals(AbstractCollection.class) || cls.equals(Serializable.class) || cls.equals(Cloneable.class) || cls.equals(Iterable.class) || cls.equals(Collection.class) || cls.equals(List.class) || cls.equals(RandomAccess.class)) {
                    return zzh();
                }
                if (cls.isArray()) {
                    List zzo = zzo();
                    Class<?> componentType = cls.getComponentType();
                    Object newInstance = Array.newInstance(componentType, zzo.size());
                    for (int i13 = 0; i13 < zzo.size(); i13++) {
                        Array.set(newInstance, i13, ((zzavg) zzo.get(i13)).zzi(componentType));
                    }
                    return newInstance;
                }
                break;
            case 5:
                return zzp();
            case 6:
                double zzq = zzq();
                if (cls.equals(Float.class) || cls.equals(cls7)) {
                    return Float.valueOf((float) zzq);
                }
                if (cls.equals(Integer.class) || cls.equals(cls6)) {
                    return Integer.valueOf((int) zzq);
                }
                if (cls.equals(Long.class) || cls.equals(cls5)) {
                    return Long.valueOf((long) zzq);
                }
                if (cls.equals(Byte.class) || cls.equals(cls4)) {
                    return Byte.valueOf((byte) ((((int) zzq) << i11) >> i11));
                }
                if (cls.equals(Short.class) || cls.equals(cls3)) {
                    return Short.valueOf((short) ((((int) zzq) << i12) >> i12));
                }
                if (cls.equals(Double.class) || cls.equals(cls2) || cls.equals(Object.class)) {
                    return Double.valueOf(zzq);
                }
                break;
            default:
                throw new AssertionError(zzaui.zza("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
        throw new zzavd();
    }

    public final void zzk(OutputStream outputStream) {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j2 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long j8 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        long j12 = (((((~j2) & j5) | j6) + ((j2 & j7) | j8)) - j9) + j10;
        long j13 = j11 % 297598514;
        int i5 = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i6 = 1414460396 % 78756298;
        int i7 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i8 = 1225708428 % 987359759;
        int i9 = this.zza;
        int i10 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i9;
        if (i9 == 0) {
            throw null;
        }
        switch (i10) {
            case 0:
            case 1:
            case 5:
                throw new zzavd();
            case 2:
                zzaug.zzb(zzm(), new zzavf(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = zzn().zza;
                zzaug.zzb(bArr.length * (j12 ^ j13), new zzavf(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List zzo = zzo();
                zzaug.zzb(zzo.size(), new zzavf(outputStream, i7 ^ i8), true);
                Iterator it = zzo.iterator();
                while (it.hasNext()) {
                    ((zzavg) it.next()).zzk(outputStream);
                }
                return;
            case 6:
                double zzq = zzq();
                zzavf zzavfVar = new zzavf(outputStream, i5 ^ i6);
                long doubleToRawLongBits = Double.doubleToRawLongBits(zzq);
                ByteBuffer allocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(doubleToRawLongBits);
                for (byte b2 : allocate.array()) {
                    zzavfVar.zza(b2);
                }
                int length = allocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object zzl() {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 235745791) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zzb;
    }

    public final long zzm() {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 733327814) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zzc;
    }

    public final zzauk zzn() {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 1140384172) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zze;
    }

    public final List zzo() {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 1250801052) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zzf;
    }

    public final zzauy zzp() {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 395191309) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zzg;
    }

    public final double zzq() {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        int i9 = iArr[4];
        int i10 = iArr[5];
        int i11 = iArr[6];
        zzs((iArr[7] % 846930886) ^ u.d((i6 & (~i5)) | i7, (i5 & i8) | i9, i10, i11));
        return this.zzd;
    }
}
