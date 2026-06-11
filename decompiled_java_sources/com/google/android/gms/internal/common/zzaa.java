package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i5) {
    }

    public final zzaa zza(Object obj) {
        int i5;
        obj.getClass();
        int length = this.zza.length;
        int i6 = this.zzb;
        int i7 = i6 + 1;
        if (i7 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i7 <= length) {
            i5 = length;
        } else {
            i5 = (length >> 1) + length + 1;
            if (i5 < i7) {
                int highestOneBit = Integer.highestOneBit(i6);
                i5 = highestOneBit + highestOneBit;
            }
            if (i5 < 0) {
                i5 = f.API_PRIORITY_OTHER;
            }
        }
        if (i5 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i5);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        objArr[i8] = obj;
        return this;
    }
}
