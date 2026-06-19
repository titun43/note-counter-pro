package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzgq {
    private final zzgp zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzgo zzf;

    public zzgq(zzgp zzgpVar) {
        this.zza = zzgpVar;
    }

    private final void zzf(int i5) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i5) {
                return;
            }
            zzgo zzgoVar = (zzgo) priorityQueue.poll();
            String str = zzfj.zza;
            int i6 = 0;
            while (true) {
                list = zzgoVar.zza;
                if (i6 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgoVar.zzb, (zzer) list.get(i6));
                this.zzb.push((zzer) list.get(i6));
                i6++;
            }
            list.clear();
            zzgo zzgoVar2 = this.zzf;
            if (zzgoVar2 != null && zzgoVar2.zzb == zzgoVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgoVar);
        }
    }

    public final void zza(int i5) {
        zzgrc.zzi(i5 >= 0);
        this.zze = i5;
        zzf(i5);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j2, zzer zzerVar) {
        if (j2 != -9223372036854775807L) {
            int i5 = this.zze;
            if (i5 != 0) {
                if (i5 != -1) {
                    PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        zzgo zzgoVar = (zzgo) priorityQueue.peek();
                        String str = zzfj.zza;
                    }
                }
                ArrayDeque arrayDeque = this.zzb;
                zzer zzerVar2 = arrayDeque.isEmpty() ? new zzer() : (zzer) arrayDeque.pop();
                zzerVar2.zza(zzerVar.zzd());
                System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), zzerVar2.zzi(), 0, zzerVar2.zzd());
                zzgo zzgoVar2 = this.zzf;
                if (zzgoVar2 != null && j2 == zzgoVar2.zzb) {
                    zzgoVar2.zza.add(zzerVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.zzc;
                zzgo zzgoVar3 = arrayDeque2.isEmpty() ? new zzgo() : (zzgo) arrayDeque2.pop();
                List list = zzgoVar3.zza;
                zzgrc.zzi(list.isEmpty());
                zzgoVar3.zzb = j2;
                list.add(zzerVar2);
                this.zzd.add(zzgoVar3);
                this.zzf = zzgoVar3;
                int i6 = this.zze;
                if (i6 != -1) {
                    zzf(i6);
                    return;
                }
                return;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.zza.zza(j2, zzerVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
