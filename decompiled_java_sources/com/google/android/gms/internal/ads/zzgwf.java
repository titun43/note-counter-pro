package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgwf extends zzgui {
    static final zzgui zza = new zzgwf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgwf(Object obj, Object[] objArr, int i5) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b1  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgwf zzk(int i5, Object[] objArr, zzguh zzguhVar) {
        boolean z4;
        int i6;
        char c5;
        Object obj;
        char c6;
        short[] sArr;
        boolean z5;
        int i7;
        ?? r16;
        boolean z6;
        boolean z7;
        int i8 = i5;
        Object[] objArr2 = objArr;
        if (i8 == 0) {
            return (zzgwf) zza;
        }
        Object obj2 = null;
        boolean z8 = false;
        int i9 = 1;
        if (i8 == 1) {
            Object obj3 = objArr2[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr2[1];
            Objects.requireNonNull(obj4);
            zzgtb.zza(obj3, obj4);
            return new zzgwf(null, objArr2, 1);
        }
        zzgrc.zzn(i8, objArr2.length >> 1, "index");
        int zzn = zzgup.zzn(i8);
        char c7 = 2;
        if (i8 == 1) {
            Object obj5 = objArr2[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArr2[1];
            Objects.requireNonNull(obj6);
            zzgtb.zza(obj5, obj6);
            z7 = false;
            i8 = 1;
            i6 = 1;
        } else {
            int i10 = zzn - 1;
            if (zzn <= 128) {
                byte[] bArr = new byte[zzn];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj7 = objArr2[i14];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArr2[i14 ^ i9];
                    Objects.requireNonNull(obj8);
                    zzgtb.zza(obj7, obj8);
                    int zza2 = zzgty.zza(obj7.hashCode());
                    while (true) {
                        int i15 = zza2 & i10;
                        z5 = z8;
                        i7 = i9;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArr2[i13] = obj7;
                                objArr2[i13 ^ 1] = obj8;
                            }
                            i12++;
                        } else {
                            if (obj7.equals(objArr2[i16])) {
                                int i17 = i16 ^ 1;
                                Object obj9 = objArr2[i17];
                                Objects.requireNonNull(obj9);
                                zzgug zzgugVar = new zzgug(obj7, obj8, obj9);
                                objArr2[i17] = obj8;
                                obj2 = zzgugVar;
                                break;
                            }
                            zza2 = i15 + 1;
                            z8 = z5;
                            i9 = i7;
                        }
                    }
                    i11++;
                    z8 = z5;
                    i9 = i7;
                }
                z4 = z8;
                i6 = i9;
                if (i12 == i8) {
                    obj2 = bArr;
                    z7 = z4;
                } else {
                    sArr = new Object[3];
                    sArr[z4 ? 1 : 0] = bArr;
                    sArr[i6] = Integer.valueOf(i12);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z7 = z4;
                }
            } else {
                z4 = false;
                i6 = 1;
                if (zzn > 32768) {
                    int[] iArr = new int[zzn];
                    Arrays.fill(iArr, -1);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i8) {
                        int i20 = i19 + i19;
                        int i21 = i18 + i18;
                        Object obj10 = objArr2[i21];
                        Objects.requireNonNull(obj10);
                        Object obj11 = objArr2[i21 ^ 1];
                        Objects.requireNonNull(obj11);
                        zzgtb.zza(obj10, obj11);
                        int zza3 = zzgty.zza(obj10.hashCode());
                        while (true) {
                            int i22 = zza3 & i10;
                            int i23 = iArr[i22];
                            if (i23 == -1) {
                                iArr[i22] = i20;
                                if (i19 < i18) {
                                    objArr2[i20] = obj10;
                                    objArr2[i20 ^ 1] = obj11;
                                }
                                i19++;
                                c6 = c7;
                            } else {
                                c6 = c7;
                                if (obj10.equals(objArr2[i23])) {
                                    int i24 = i23 ^ 1;
                                    Object obj12 = objArr2[i24];
                                    Objects.requireNonNull(obj12);
                                    zzgug zzgugVar2 = new zzgug(obj10, obj11, obj12);
                                    objArr2[i24] = obj11;
                                    obj2 = zzgugVar2;
                                    break;
                                }
                                zza3 = i22 + 1;
                                c7 = c6;
                            }
                        }
                        i18++;
                        c7 = c6;
                    }
                    c5 = c7;
                    if (i19 == i8) {
                        obj = iArr;
                        r16 = z4;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i19);
                        objArr3[c5] = obj2;
                        obj = objArr3;
                        r16 = z4;
                    }
                    z6 = obj instanceof Object[];
                    Object obj13 = obj;
                    if (z6) {
                        Object[] objArr4 = (Object[]) obj;
                        zzgug zzgugVar3 = (zzgug) objArr4[c5];
                        if (zzguhVar == null) {
                            throw zzgugVar3.zza();
                        }
                        zzguhVar.zzc = zzgugVar3;
                        Object obj14 = objArr4[r16];
                        int intValue = ((Integer) objArr4[i6]).intValue();
                        objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                        obj13 = obj14;
                        i8 = intValue;
                    }
                    return new zzgwf(obj13, objArr2, i8);
                }
                sArr = new short[zzn];
                Arrays.fill(sArr, (short) -1);
                int i25 = 0;
                for (int i26 = 0; i26 < i8; i26++) {
                    int i27 = i25 + i25;
                    int i28 = i26 + i26;
                    Object obj15 = objArr2[i28];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArr2[i28 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzgtb.zza(obj15, obj16);
                    int zza4 = zzgty.zza(obj15.hashCode());
                    while (true) {
                        int i29 = zza4 & i10;
                        char c8 = (char) sArr[i29];
                        if (c8 == 65535) {
                            sArr[i29] = (short) i27;
                            if (i25 < i26) {
                                objArr2[i27] = obj15;
                                objArr2[i27 ^ 1] = obj16;
                            }
                            i25++;
                        } else {
                            if (obj15.equals(objArr2[c8])) {
                                int i30 = c8 ^ 1;
                                Object obj17 = objArr2[i30];
                                Objects.requireNonNull(obj17);
                                zzgug zzgugVar4 = new zzgug(obj15, obj16, obj17);
                                objArr2[i30] = obj16;
                                obj2 = zzgugVar4;
                                break;
                            }
                            zza4 = i29 + 1;
                        }
                    }
                }
                if (i25 != i8) {
                    obj2 = new Object[]{sArr, Integer.valueOf(i25), obj2};
                    z7 = z4;
                }
                obj2 = sArr;
                z7 = z4;
            }
        }
        c5 = 2;
        obj = obj2;
        r16 = z7;
        z6 = obj instanceof Object[];
        Object obj132 = obj;
        if (z6) {
        }
        return new zzgwf(obj132, objArr2, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgui, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i5 = this.zzd;
            Object[] objArr = this.zzb;
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int zza2 = zzgty.zza(obj.hashCode());
                        while (true) {
                            int i6 = zza2 & length;
                            int i7 = bArr[i6] & 255;
                            if (i7 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i7])) {
                                obj2 = objArr[i7 ^ 1];
                                break;
                            }
                            zza2 = i6 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int zza3 = zzgty.zza(obj.hashCode());
                        while (true) {
                            int i8 = zza3 & length2;
                            char c5 = (char) sArr[i8];
                            if (c5 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c5])) {
                                obj2 = objArr[c5 ^ 1];
                                break;
                            }
                            zza3 = i8 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int zza4 = zzgty.zza(obj.hashCode());
                        while (true) {
                            int i9 = zza4 & length3;
                            int i10 = iArr[i9];
                            if (i10 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            }
                            zza4 = i9 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgup zze() {
        return new zzgwc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgup zzg() {
        return new zzgwd(this, new zzgwe(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final zzgub zzi() {
        return new zzgwe(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgui
    public final boolean zzj() {
        return false;
    }
}
