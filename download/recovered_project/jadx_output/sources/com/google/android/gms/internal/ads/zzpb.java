package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class zzpb {
    private final zzbd zza;
    private zzguf zzb = zzguf.zzi();
    private zzgui zzc = zzgui.zza();
    private zzwk zzd;
    private zzwk zze;
    private zzwk zzf;

    public zzpb(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzguh zzguhVar = new zzguh();
        if (this.zzb.isEmpty()) {
            zzk(zzguhVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzguhVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzguhVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i5 = 0; i5 < this.zzb.size(); i5++) {
                zzk(zzguhVar, (zzwk) this.zzb.get(i5), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzguhVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzguhVar.zzc();
    }

    private final void zzk(zzguh zzguhVar, zzwk zzwkVar, zzbf zzbfVar) {
        if (zzwkVar == null) {
            return;
        }
        if (zzbfVar.zze(zzwkVar.zza) != -1) {
            zzguhVar.zza(zzwkVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzwkVar);
        if (zzbfVar2 != null) {
            zzguhVar.zza(zzwkVar, zzbfVar2);
        }
    }

    private static zzwk zzl(zzbb zzbbVar, zzguf zzgufVar, zzwk zzwkVar, zzbd zzbdVar) {
        zzbf zzq = zzbbVar.zzq();
        int zzr = zzbbVar.zzr();
        Object zzf = zzq.zzg() ? null : zzq.zzf(zzr);
        int i5 = -1;
        if (!zzbbVar.zzx() && !zzq.zzg()) {
            i5 = zzq.zzd(zzr, zzbdVar, false).zzf(zzfj.zzq(zzbbVar.zzu()));
        }
        int i6 = i5;
        for (int i7 = 0; i7 < zzgufVar.size(); i7++) {
            zzwk zzwkVar2 = (zzwk) zzgufVar.get(i7);
            if (zzm(zzwkVar2, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i6)) {
                return zzwkVar2;
            }
        }
        if (zzgufVar.isEmpty() && zzwkVar != null && zzm(zzwkVar, zzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i6)) {
            return zzwkVar;
        }
        return null;
    }

    private static boolean zzm(zzwk zzwkVar, Object obj, boolean z4, int i5, int i6, int i7) {
        if (zzwkVar.zza.equals(obj)) {
            return z4 ? zzwkVar.zzb == i5 && zzwkVar.zzc == i6 : zzwkVar.zzb == -1 && zzwkVar.zze == i7;
        }
        return false;
    }

    public final zzwk zza() {
        return this.zzd;
    }

    public final zzwk zzb() {
        return this.zze;
    }

    public final zzwk zzc() {
        return this.zzf;
    }

    public final zzwk zzd() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            obj = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzwk) obj;
    }

    public final zzbf zze(zzwk zzwkVar) {
        return (zzbf) this.zzc.get(zzwkVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzwk zzwkVar, zzbb zzbbVar) {
        this.zzb = zzguf.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzwk) list.get(0);
            zzwkVar.getClass();
            this.zzf = zzwkVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzguf zzi() {
        return this.zzb;
    }
}
