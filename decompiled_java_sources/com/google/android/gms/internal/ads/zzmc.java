package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzmc {
    private final zzpq zza;
    private final zzmb zze;
    private final zzmx zzh;
    private final zzdx zzi;
    private boolean zzj;
    private zzhz zzk;
    private zzyf zzl = new zzyf(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzmc(zzmb zzmbVar, zzmx zzmxVar, zzdx zzdxVar, zzpq zzpqVar) {
        this.zza = zzpqVar;
        this.zze = zzmbVar;
        this.zzh = zzmxVar;
        this.zzi = zzdxVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlz zzlzVar = (zzlz) it.next();
            if (zzlzVar.zzc.isEmpty()) {
                zzs(zzlzVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzlz zzlzVar) {
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzr(zzlyVar.zzb);
        }
    }

    private final void zzt(int i5, int i6) {
        while (true) {
            i6--;
            if (i6 < i5) {
                return;
            }
            zzlz zzlzVar = (zzlz) this.zzb.remove(i6);
            this.zzd.remove(zzlzVar.zzb);
            zzu(i6, -zzlzVar.zza.zzz().zza());
            zzlzVar.zze = true;
            if (this.zzj) {
                zzw(zzlzVar);
            }
        }
    }

    private final void zzu(int i5, int i6) {
        while (true) {
            List list = this.zzb;
            if (i5 >= list.size()) {
                return;
            }
            ((zzlz) list.get(i5)).zzd += i6;
            i5++;
        }
    }

    private final void zzv(zzlz zzlzVar) {
        zzwf zzwfVar = zzlzVar.zza;
        zzwl zzwlVar = new zzwl() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzwl
            public final /* synthetic */ void zza(zzwm zzwmVar, zzbf zzbfVar) {
                zzmc.this.zzi(zzwmVar, zzbfVar);
            }
        };
        zzlx zzlxVar = new zzlx(this, zzlzVar);
        this.zzf.put(zzlzVar, new zzly(zzwfVar, zzwlVar, zzlxVar));
        zzwfVar.zzl(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzn(new Handler(zzfj.zze(), null), zzlxVar);
        zzwfVar.zzp(zzwlVar, this.zzk, this.zza);
    }

    private final void zzw(zzlz zzlzVar) {
        if (zzlzVar.zze && zzlzVar.zzc.isEmpty()) {
            zzly zzlyVar = (zzly) this.zzf.remove(zzlzVar);
            zzlyVar.getClass();
            zzwm zzwmVar = zzlyVar.zza;
            zzwmVar.zzs(zzlyVar.zzb);
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
            this.zzg.remove(zzlzVar);
        }
    }

    public final zzbf zza(int i5, int i6, List list) {
        zzgrc.zza(i5 >= 0 && i5 <= i6 && i6 <= zzc());
        zzgrc.zza(list.size() == i6 - i5);
        for (int i7 = i5; i7 < i6; i7++) {
            ((zzlz) this.zzb.get(i7)).zza.zzA((zzak) list.get(i7 - i5));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(zzhz zzhzVar) {
        zzgrc.zzi(!this.zzj);
        this.zzk = zzhzVar;
        int i5 = 0;
        while (true) {
            List list = this.zzb;
            if (i5 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlz zzlzVar = (zzlz) list.get(i5);
            zzv(zzlzVar);
            this.zzg.add(zzlzVar);
            i5++;
        }
    }

    public final zzwi zze(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        int i5 = zzmj.zzb;
        Pair pair = (Pair) zzwkVar.zza;
        Object obj = pair.first;
        zzwk zza = zzwkVar.zza(pair.second);
        zzlz zzlzVar = (zzlz) this.zzd.get(obj);
        zzlzVar.getClass();
        this.zzg.add(zzlzVar);
        zzly zzlyVar = (zzly) this.zzf.get(zzlzVar);
        if (zzlyVar != null) {
            zzlyVar.zza.zzq(zzlyVar.zzb);
        }
        zzlzVar.zzc.add(zza);
        zzwc zzG = zzlzVar.zza.zzG(zza, zzaanVar, j2);
        this.zzc.put(zzG, zzlzVar);
        zzr();
        return zzG;
    }

    public final void zzf(zzwi zzwiVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlz zzlzVar = (zzlz) identityHashMap.remove(zzwiVar);
        zzlzVar.getClass();
        zzlzVar.zza.zzD(zzwiVar);
        zzlzVar.zzc.remove(((zzwc) zzwiVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzlzVar);
    }

    public final void zzg() {
        for (zzly zzlyVar : this.zzf.values()) {
            try {
                zzlyVar.zza.zzs(zzlyVar.zzb);
            } catch (RuntimeException e4) {
                zzee.zzf("MediaSourceList", "Failed to release child source.", e4);
            }
            zzwm zzwmVar = zzlyVar.zza;
            zzlx zzlxVar = zzlyVar.zzc;
            zzwmVar.zzm(zzlxVar);
            zzwmVar.zzo(zzlxVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzlz zzlzVar = (zzlz) list.get(i6);
            zzlzVar.zzd = i5;
            i5 += zzlzVar.zza.zzz().zza();
        }
        return new zzmj(list, this.zzl);
    }

    public final /* synthetic */ void zzi(zzwm zzwmVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    public final /* synthetic */ zzmx zzj() {
        return this.zzh;
    }

    public final /* synthetic */ zzdx zzk() {
        return this.zzi;
    }

    public final zzbf zzl(List list, zzyf zzyfVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzyfVar);
    }

    public final zzbf zzm(int i5, List list, zzyf zzyfVar) {
        if (!list.isEmpty()) {
            this.zzl = zzyfVar;
            for (int i6 = i5; i6 < list.size() + i5; i6++) {
                zzlz zzlzVar = (zzlz) list.get(i6 - i5);
                if (i6 > 0) {
                    zzlz zzlzVar2 = (zzlz) this.zzb.get(i6 - 1);
                    zzlzVar.zzc(zzlzVar2.zza.zzz().zza() + zzlzVar2.zzd);
                } else {
                    zzlzVar.zzc(0);
                }
                zzu(i6, zzlzVar.zza.zzz().zza());
                this.zzb.add(i6, zzlzVar);
                this.zzd.put(zzlzVar.zzb, zzlzVar);
                if (this.zzj) {
                    zzv(zzlzVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlzVar);
                    } else {
                        zzs(zzlzVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i5, int i6, zzyf zzyfVar) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= i6 && i6 <= zzc()) {
            z4 = true;
        }
        zzgrc.zza(z4);
        this.zzl = zzyfVar;
        zzt(i5, i6);
        return zzh();
    }

    public final zzbf zzo(int i5, int i6, int i7, zzyf zzyfVar) {
        zzgrc.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzyf zzyfVar) {
        int zzc = zzc();
        if (zzyfVar.zza() != zzc) {
            zzyfVar = zzyfVar.zzg().zzf(0, zzc);
        }
        this.zzl = zzyfVar;
        return zzh();
    }

    public final zzyf zzq() {
        return this.zzl;
    }
}
