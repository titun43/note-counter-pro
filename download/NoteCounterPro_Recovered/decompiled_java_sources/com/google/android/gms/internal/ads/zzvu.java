package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzvu implements zzye {
    private final zzguf zza;
    private long zzb;

    public zzvu(List list, List list2) {
        int i5 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgrc.zza(list.size() == list2.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzgucVar.zzf(new zzvt((zzye) list.get(i6), (List) list2.get(i6)));
        }
        this.zza = zzgucVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        int i5 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                return;
            }
            ((zzvt) zzgufVar.get(i5)).zzg(j2);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        int i5 = 0;
        long j2 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                break;
            }
            zzvt zzvtVar = (zzvt) zzgufVar.get(i5);
            long zzi = zzvtVar.zzi();
            if ((zzvtVar.zza().contains(1) || zzvtVar.zza().contains(2) || zzvtVar.zza().contains(4)) && zzi != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzi);
            }
            if (zzi != Long.MIN_VALUE) {
                j5 = Math.min(j5, zzi);
            }
            i5++;
        }
        if (j2 != Long.MAX_VALUE) {
            this.zzb = j2;
            return j2;
        }
        if (j5 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.zzb;
        return j6 != -9223372036854775807L ? j6 : j5;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        int i5 = 0;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                break;
            }
            long zzl = ((zzvt) zzgufVar.get(i5)).zzl();
            if (zzl != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzl);
            }
            i5++;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        boolean z4;
        boolean z5 = false;
        do {
            long zzl = zzl();
            if (zzl == Long.MIN_VALUE) {
                break;
            }
            int i5 = 0;
            z4 = false;
            while (true) {
                zzguf zzgufVar = this.zza;
                if (i5 >= zzgufVar.size()) {
                    break;
                }
                long zzl2 = ((zzvt) zzgufVar.get(i5)).zzl();
                boolean z6 = zzl2 != Long.MIN_VALUE && zzl2 <= zzllVar.zza;
                if (zzl2 == zzl || z6) {
                    z4 |= ((zzvt) zzgufVar.get(i5)).zzm(zzllVar);
                }
                i5++;
            }
            z5 |= z4;
        } while (z4);
        return z5;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        int i5 = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i5 >= zzgufVar.size()) {
                return false;
            }
            if (((zzvt) zzgufVar.get(i5)).zzn()) {
                return true;
            }
            i5++;
        }
    }
}
