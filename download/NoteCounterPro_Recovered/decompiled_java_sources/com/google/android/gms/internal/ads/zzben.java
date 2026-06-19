package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzben {
    public static void zza(String[] strArr, int i5, int i6, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i5, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzb(i5, zze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i7 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i7 >= length2 - 5) {
                return;
            }
            long zza = zzbek.zza(strArr[i7 - 1]);
            long zza2 = zzbek.zza(strArr[i7 + 5]);
            String zzc = zzc(strArr, i7, 6);
            zze = (((zza2 + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((zza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i5, zze, zzc, length2, priorityQueue);
            i7++;
        }
    }

    public static void zzb(int i5, long j2, String str, int i6, PriorityQueue priorityQueue) {
        zzbem zzbemVar = new zzbem(j2, str, i6);
        if ((priorityQueue.size() != i5 || (((zzbem) priorityQueue.peek()).zzc <= zzbemVar.zzc && ((zzbem) priorityQueue.peek()).zza <= zzbemVar.zza)) && !priorityQueue.contains(zzbemVar)) {
            priorityQueue.add(zzbemVar);
            if (priorityQueue.size() > i5) {
                priorityQueue.poll();
            }
        }
    }

    public static String zzc(String[] strArr, int i5, int i6) {
        int i7 = i6 + i5;
        if (strArr.length < i7) {
            int i8 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i9 = i7 - 1;
            if (i5 >= i9) {
                sb.append(strArr[i9]);
                return sb.toString();
            }
            sb.append(strArr[i5]);
            sb.append(' ');
            i5++;
        }
    }

    public static long zzd(long j2, int i5) {
        if (i5 == 1) {
            return j2;
        }
        int i6 = i5 >> 1;
        long j5 = (j2 * j2) % 1073807359;
        return (i5 & 1) == 0 ? zzd(j5, i6) % 1073807359 : ((zzd(j5, i6) % 1073807359) * j2) % 1073807359;
    }

    private static long zze(String[] strArr, int i5, int i6) {
        long zza = (zzbek.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i7 = 1; i7 < i6; i7++) {
            zza = (((zzbek.zza(strArr[i7]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
