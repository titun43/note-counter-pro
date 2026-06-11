package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class zzgtm extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgtm() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i5) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i5, int i6, int i7, int i8) {
        int i9 = i6 - 1;
        Object zza = zzgtn.zza(i6);
        if (i8 != 0) {
            zzgtn.zzc(zza, i7 & i9, i8 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzl = zzl();
        for (int i10 = 0; i10 <= i5; i10++) {
            int zzb = zzgtn.zzb(obj, i10);
            while (zzb != 0) {
                int i11 = zzb - 1;
                int i12 = zzl[i11];
                int i13 = ((~i5) & i12) | i10;
                int i14 = i13 & i9;
                int zzb2 = zzgtn.zzb(zza, i14);
                zzgtn.zzc(zza, i14, zzb);
                zzl[i11] = ((~i9) & i13) | (zzb2 & i9);
                zzb = i12 & i5;
            }
        }
        this.zze = zza;
        zzv(i9);
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb = zzgty.zzb(obj);
        int zzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzb2 = zzgtn.zzb(obj2, zzb & zzh);
        if (zzb2 != 0) {
            int i5 = ~zzh;
            int i6 = zzb & i5;
            do {
                int i7 = zzb2 - 1;
                int i8 = zzl()[i7];
                if ((i8 & i5) == i6 && Objects.equals(obj, zzm()[i7])) {
                    return i7;
                }
                zzb2 = i8 & zzh;
            } while (zzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int zzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zze = zzgtn.zze(obj, null, zzh, obj2, zzl(), zzm(), null);
            if (zze != -1) {
                Object obj3 = zzn()[zze];
                zze(zze, zzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map zzc = zzc();
        if (zzc != null) {
            this.zzf = zzgxz.zzc(size(), 3, 1073741823);
            zzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzc = zzc();
        return zzc != null ? zzc.containsKey(obj) : zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.containsValue(obj);
        }
        for (int i5 = 0; i5 < this.zzg; i5++) {
            if (Objects.equals(obj, zzn()[i5])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgth zzgthVar = new zzgth(this, null);
        this.zzi = zzgthVar;
        return zzgthVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.get(obj);
        }
        int zzi = zzi(obj);
        if (zzi == -1) {
            return null;
        }
        return zzn()[zzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgtj zzgtjVar = new zzgtj(this, null);
        this.zzh = zzgtjVar;
        return zzgtjVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i5;
        if (zzb()) {
            zzgrc.zzj(zzb(), "Arrays already allocated");
            int i6 = this.zzf;
            int max = Math.max(i6 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzgtn.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i6];
            this.zzb = new Object[i6];
            this.zzc = new Object[i6];
        }
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.put(obj, obj2);
        }
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int i7 = this.zzg;
        int i8 = i7 + 1;
        int zzb = zzgty.zzb(obj);
        int zzh = zzh();
        int i9 = zzb & zzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzb2 = zzgtn.zzb(obj3, i9);
        if (zzb2 == 0) {
            if (i8 > zzh) {
                zzh = zzx(zzh, zzgtn.zzd(zzh), zzb, i7);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgtn.zzc(obj4, i9, i8);
            }
            i5 = 1;
        } else {
            int i10 = ~zzh;
            int i11 = zzb & i10;
            int i12 = 0;
            while (true) {
                int i13 = zzb2 - 1;
                int i14 = zzl[i13];
                i5 = 1;
                int i15 = i14 & i10;
                if (i15 == i11 && Objects.equals(obj, zzm[i13])) {
                    Object obj5 = zzn[i13];
                    zzn[i13] = obj2;
                    return obj5;
                }
                int i16 = i14 & zzh;
                i12++;
                if (i16 != 0) {
                    zzb2 = i16;
                } else {
                    if (i12 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                        int zzf = zzf();
                        while (zzf >= 0) {
                            linkedHashMap.put(zzm()[zzf], zzn()[zzf]);
                            zzf = zzg(zzf);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i8 > zzh) {
                        zzh = zzx(zzh, zzgtn.zzd(zzh), zzb, i7);
                    } else {
                        zzl[i13] = (i8 & zzh) | i15;
                    }
                }
            }
        }
        int length = zzl().length;
        if (i8 > length) {
            int i17 = i5;
            int min = Math.min(1073741823, (Math.max(i17, length >>> 1) + length) | i17);
            if (min != length) {
                this.zza = Arrays.copyOf(zzl(), min);
                this.zzb = Arrays.copyOf(zzm(), min);
                this.zzc = Arrays.copyOf(zzn(), min);
            }
        }
        zzl()[i7] = (~zzh) & zzb;
        zzm()[i7] = obj;
        zzn()[i7] = obj2;
        this.zzg = i8;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzc = zzc();
        if (zzc != null) {
            return zzc.remove(obj);
        }
        Object zzj = zzj(obj);
        if (zzj == zzd) {
            return null;
        }
        return zzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzc = zzc();
        return zzc != null ? zzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgtl zzgtlVar = new zzgtl(this, null);
        this.zzj = zzgtlVar;
        return zzgtlVar;
    }

    public final void zza(int i5) {
        this.zzf = zzgxz.zzc(i5, 1, 1073741823);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    public final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i5, int i6) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzl = zzl();
        Object[] zzm = zzm();
        Object[] zzn = zzn();
        int size = size();
        int i7 = size - 1;
        if (i5 >= i7) {
            zzm[i5] = null;
            zzn[i5] = null;
            zzl[i5] = 0;
            return;
        }
        int i8 = i5 + 1;
        Object obj2 = zzm[i7];
        zzm[i5] = obj2;
        zzn[i5] = zzn[i7];
        zzm[i7] = null;
        zzn[i7] = null;
        zzl[i5] = zzl[i7];
        zzl[i7] = 0;
        int zzb = zzgty.zzb(obj2) & i6;
        int zzb2 = zzgtn.zzb(obj, zzb);
        if (zzb2 == size) {
            zzgtn.zzc(obj, zzb, i8);
            return;
        }
        while (true) {
            int i9 = zzb2 - 1;
            int i10 = zzl[i9];
            int i11 = i10 & i6;
            if (i11 == size) {
                zzl[i9] = (i10 & (~i6)) | (i6 & i8);
                return;
            }
            zzb2 = i11;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i5) {
        int i6 = i5 + 1;
        if (i6 < this.zzg) {
            return i6;
        }
        return -1;
    }

    public final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final /* synthetic */ Object zzo(int i5) {
        return zzm()[i5];
    }

    public final /* synthetic */ Object zzp(int i5) {
        return zzn()[i5];
    }

    public final /* synthetic */ void zzq(int i5, Object obj) {
        zzn()[i5] = obj;
    }

    public final /* synthetic */ int zzs() {
        return this.zzf;
    }

    public final /* synthetic */ int zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(int i5) {
        this.zzg = i5;
    }

    public zzgtm(int i5) {
        zza(8);
    }
}
