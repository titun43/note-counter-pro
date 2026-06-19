package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzguo extends zzgtz {
    Object[] zzd;
    private int zze;

    public zzguo() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz, com.google.android.gms.internal.ads.zzgua
    public final /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzguo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzn = zzgup.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (zzn <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgty.zza(hashCode);
                while (true) {
                    int i5 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i5];
                    if (obj2 == null) {
                        objArr2[i5] = obj;
                        this.zze += hashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    zza = i5 + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzguo zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            zzf(objArr[i5]);
        }
        return this;
    }

    public final zzguo zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgup zzi() {
        zzgup zzv;
        boolean zzw;
        int i5 = this.zzb;
        if (i5 == 0) {
            return zzgwg.zza;
        }
        if (i5 == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        if (this.zzd == null || zzgup.zzn(i5) != this.zzd.length) {
            zzv = zzgup.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i6 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzgup.zzw(i6, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i6);
            }
            zzv = new zzgwg(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public zzguo(int i5, boolean z4) {
        super(i5);
        this.zzd = new Object[zzgup.zzn(i5)];
    }
}
