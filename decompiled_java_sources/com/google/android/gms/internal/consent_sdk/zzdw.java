package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzdw extends zzds implements Set {
    private transient zzdv zza;

    public static int zzf(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzdw zzi() {
        return zzdz.zza;
    }

    public static zzdw zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzm(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static zzdw zzk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static zzdw zzm(int i5, Object... objArr) {
        if (i5 == 0) {
            return zzdz.zza;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzea(obj);
        }
        int zzf = zzf(i5);
        Object[] objArr2 = new Object[zzf];
        int i6 = zzf - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                throw new NullPointerException(u.h(i9, "at index "));
            }
            int hashCode = obj2.hashCode();
            int zza = zzdr.zza(hashCode);
            while (true) {
                int i10 = zza & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += hashCode;
                    i8++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i8, i5, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzea(obj4);
        }
        if (zzf(i8) < zzf / 2) {
            return zzm(i8, objArr);
        }
        if (i8 < 3) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new zzdz(objArr, i7, objArr2, i6, i8);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdw) && zzl() && ((zzdw) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 += next != null ? next.hashCode() : 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzeb iterator();

    public final zzdv zzg() {
        zzdv zzdvVar = this.zza;
        if (zzdvVar != null) {
            return zzdvVar;
        }
        zzdv zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public zzdv zzh() {
        Object[] array = toArray();
        int i5 = zzdv.zzd;
        return zzdv.zzg(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
