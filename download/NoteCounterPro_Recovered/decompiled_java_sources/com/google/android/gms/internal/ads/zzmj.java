package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzmj extends zzii {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzmj(Collection collection, zzyf zzyfVar) {
        this(r0, r1, zzyfVar);
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i6] = ((zzlr) it.next()).zzb();
            i6++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i5] = ((zzlr) it2.next()).zza();
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzp(int i5) {
        return zzfj.zzl(this.zze, i5 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzq(int i5) {
        return zzfj.zzl(this.zzf, i5 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final zzbf zzs(int i5) {
        return this.zzg[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzt(int i5) {
        return this.zze[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzu(int i5) {
        return this.zzf[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final Object zzv(int i5) {
        return this.zzh[i5];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzmj zzx(zzyf zzyfVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i5 = 0; i5 < zzbfVarArr.length; i5++) {
            zzbfVarArr2[i5] = new zzmi(this, zzbfVarArr[i5]);
        }
        return new zzmj(zzbfVarArr2, this.zzh, zzyfVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmj(zzbf[] zzbfVarArr, Object[] objArr, zzyf zzyfVar) {
        super(false, zzyfVar);
        int i5 = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i5 < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i5];
            this.zzg[i8] = zzbfVar;
            this.zzf[i8] = i6;
            this.zze[i8] = i7;
            i6 += zzbfVar.zza();
            i7 += this.zzg[i8].zzc();
            this.zzi.put(objArr[i8], Integer.valueOf(i8));
            i5++;
            i8++;
        }
        this.zzc = i6;
        this.zzd = i7;
    }
}
