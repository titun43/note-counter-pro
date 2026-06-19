package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzasr {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzasr(String str, String str2, long j2, long j5, long j6, long j7, List list) {
        this.zzb = str;
        this.zzc = true == RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str2) ? null : str2;
        this.zzd = j2;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzh = list;
    }

    public static zzasr zza(zzass zzassVar) {
        if (zzasu.zzi(zzassVar) != 538247942) {
            throw new IOException();
        }
        String zzm = zzasu.zzm(zzassVar);
        String zzm2 = zzasu.zzm(zzassVar);
        long zzk = zzasu.zzk(zzassVar);
        long zzk2 = zzasu.zzk(zzassVar);
        long zzk3 = zzasu.zzk(zzassVar);
        long zzk4 = zzasu.zzk(zzassVar);
        int zzi = zzasu.zzi(zzassVar);
        if (zzi < 0) {
            throw new IOException(u.l(new StringBuilder(String.valueOf(zzi).length() + 20), "readHeaderList size=", zzi));
        }
        List arrayList = zzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i5 = 0; i5 < zzi; i5++) {
            arrayList.add(new zzarq(zzasu.zzm(zzassVar).intern(), zzasu.zzm(zzassVar).intern()));
        }
        return new zzasr(zzm, zzm2, zzk, zzk2, zzk3, zzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzasr(String str, zzarh zzarhVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzarhVar.zzb;
        long j2 = zzarhVar.zzc;
        long j5 = zzarhVar.zzd;
        long j6 = zzarhVar.zze;
        long j7 = zzarhVar.zzf;
        List list = zzarhVar.zzh;
        if (list == 0) {
            Map map = zzarhVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}
