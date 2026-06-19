package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzapq {
    private final List zza;
    private final zzagh[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgq zzd = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzapp
        @Override // com.google.android.gms.internal.ads.zzgp
        public final /* synthetic */ void zza(long j2, zzer zzerVar) {
            zzapq.this.zzf(j2, zzerVar);
        }
    });

    public zzapq(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
    }

    public final void zza(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i5 = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i5 >= zzaghVarArr.length) {
                return;
            }
            zzaqbVar.zza();
            zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i5);
            String str = zzvVar.zzo;
            boolean z4 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z4 = false;
            }
            zzgrc.zzf(z4, "Invalid closed caption MIME type provided: %s", str);
            String str2 = zzvVar.zza;
            if (str2 == null) {
                str2 = zzaqbVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(str2);
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzu.zzz(zztVar.zzM());
            zzaghVarArr[i5] = zzu;
            i5++;
        }
    }

    public final void zzb(int i5) {
        this.zzd.zza(i5);
    }

    public final void zzc(long j2, zzer zzerVar) {
        this.zzd.zzc(j2, zzerVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j2, zzer zzerVar) {
        zzaeh.zza(j2, zzerVar, this.zzc);
    }
}
