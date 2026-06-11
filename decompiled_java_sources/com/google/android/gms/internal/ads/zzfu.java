package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfu extends zzfw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfu(int i5, long j2) {
        super(i5, null);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public final String toString() {
        List list = this.zzb;
        String zze = zzfw.zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = zze.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        s.c.e(sb, zze, " leaves: ", arrays, " containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzfv zzfvVar) {
        this.zzb.add(zzfvVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzc.add(zzfuVar);
    }

    public final zzfv zzc(int i5) {
        List list = this.zzb;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            zzfv zzfvVar = (zzfv) list.get(i6);
            if (zzfvVar.zzd == i5) {
                return zzfvVar;
            }
        }
        return null;
    }

    public final zzfu zzd(int i5) {
        List list = this.zzc;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            zzfu zzfuVar = (zzfu) list.get(i6);
            if (zzfuVar.zzd == i5) {
                return zzfuVar;
            }
        }
        return null;
    }
}
