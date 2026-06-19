package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzxb extends zzvs {
    private static final zzak zza;
    private final zzwm[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzwz zzh;
    private final zzvv zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzxb(boolean z4, boolean z5, zzvv zzvvVar, zzwm... zzwmVarArr) {
        this.zzb = zzwmVarArr;
        this.zzi = zzvvVar;
        this.zze = new ArrayList(Arrays.asList(zzwmVarArr));
        this.zzc = new ArrayList(zzwmVarArr.length);
        int i5 = 0;
        while (true) {
            int length = zzwmVarArr.length;
            if (i5 >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgvu.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        zzwy zzwyVar = (zzwy) zzwiVar;
        int i5 = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i5 >= zzwmVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i5);
            zzwi zza2 = zzwyVar.zza(i5);
            int i6 = 0;
            while (true) {
                if (i6 >= list.size()) {
                    break;
                }
                if (((zzxa) list.get(i6)).zzb().equals(zza2)) {
                    list.remove(i6);
                    break;
                }
                i6++;
            }
            zzwmVarArr[i5].zzD(zzwyVar.zza(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        zzbf[] zzbfVarArr = this.zzd;
        zzwm[] zzwmVarArr = this.zzb;
        int length = zzwmVarArr.length;
        zzwi[] zzwiVarArr = new zzwi[length];
        int zze = zzbfVarArr[0].zze(zzwkVar.zza);
        for (int i5 = 0; i5 < length; i5++) {
            zzwk zza2 = zzwkVar.zza(zzbfVarArr[i5].zzf(zze));
            zzwiVarArr[i5] = zzwmVarArr[i5].zzG(zza2, zzaanVar, j2 - this.zzg[zze][i5]);
            ((List) this.zzc.get(i5)).add(new zzxa(zza2, zzwiVarArr[i5], null));
        }
        return new zzwy(this.zzi, this.zzg[zze], zzwiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzak zzJ() {
        zzwm[] zzwmVarArr = this.zzb;
        return zzwmVarArr.length > 0 ? zzwmVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zza(zzhz zzhzVar) {
        super.zza(zzhzVar);
        int i5 = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i5 >= zzwmVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i5), zzwmVarArr[i5]);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzwm
    public final void zzt() {
        zzwz zzwzVar = this.zzh;
        if (zzwzVar != null) {
            throw zzwzVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final /* bridge */ /* synthetic */ void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar) {
        int i5;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i5 = zzbfVar.zzc();
            this.zzf = i5;
        } else {
            int zzc = zzbfVar.zzc();
            int i6 = this.zzf;
            if (zzc != i6) {
                this.zzh = new zzwz(0);
                return;
            }
            i5 = i6;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i5, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzwmVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final /* bridge */ /* synthetic */ zzwk zzx(Object obj, zzwk zzwkVar) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i5 = 0; i5 < list2.size(); i5++) {
            if (((zzxa) list2.get(i5)).zza().equals(zzwkVar)) {
                return ((zzxa) ((List) list.get(0)).get(i5)).zza();
            }
        }
        return null;
    }
}
