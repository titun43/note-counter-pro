package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class zzvj implements zzwm {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzwu zzc = new zzwu();
    private final zztj zzd = new zztj();
    private Looper zze;
    private zzbf zzf;
    private zzpq zzg;

    public void zzM() {
    }

    public abstract void zza(zzhz zzhzVar);

    public void zzc() {
    }

    public abstract void zzd();

    public final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzwl) arrayList.get(i5)).zza(this, zzbfVar);
        }
    }

    public final zzwu zzf(zzwk zzwkVar) {
        return this.zzc.zza(0, zzwkVar);
    }

    public final zzwu zzg(int i5, zzwk zzwkVar) {
        return this.zzc.zza(0, zzwkVar);
    }

    public final zztj zzh(zzwk zzwkVar) {
        return this.zzd.zza(0, zzwkVar);
    }

    public final zztj zzi(int i5, zzwk zzwkVar) {
        return this.zzd.zza(0, zzwkVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    public final zzpq zzk() {
        zzpq zzpqVar = this.zzg;
        zzpqVar.getClass();
        return zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzl(Handler handler, zzwv zzwvVar) {
        this.zzc.zzb(handler, zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzm(zzwv zzwvVar) {
        this.zzc.zzc(zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzn(Handler handler, zztk zztkVar) {
        this.zzd.zzb(handler, zztkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzo(zztk zztkVar) {
        this.zzd.zzc(zztkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzp(zzwl zzwlVar, zzhz zzhzVar, zzpq zzpqVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z4 = true;
        if (looper != null && looper != myLooper) {
            z4 = false;
        }
        zzgrc.zza(z4);
        this.zzg = zzpqVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzwlVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzwlVar);
            zza(zzhzVar);
        } else if (zzbfVar != null) {
            zzq(zzwlVar);
            zzwlVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzq(zzwl zzwlVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzwlVar);
        if (isEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzr(zzwl zzwlVar) {
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(zzwlVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzs(zzwl zzwlVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzwlVar);
        if (!arrayList.isEmpty()) {
            zzr(zzwlVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }
}
