package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaei implements zzafy {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaei(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i5 = length - 1;
            this.zzf = jArr2[i5] + jArr3[i5];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        int i5 = this.zza;
        int length = String.valueOf(i5).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i5);
        sb.append(", sizes=");
        sb.append(arrays);
        s.c.e(sb, ", offsets=", arrays2, ", timeUs=", arrays3);
        return h1.b(sb, ", durationsUs=", arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        long[] jArr = this.zze;
        int zzm = zzfj.zzm(jArr, j2, true, true);
        long j5 = jArr[zzm];
        long[] jArr2 = this.zzc;
        zzafz zzafzVar = new zzafz(j5, jArr2[zzm]);
        if (zzafzVar.zzb >= j2 || zzm == this.zza - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i5 = zzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i5], jArr2[i5]));
    }
}
