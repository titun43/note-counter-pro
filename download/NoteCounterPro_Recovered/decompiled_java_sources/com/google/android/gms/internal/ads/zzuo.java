package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.lifecycle.g0;
import java.util.List;

/* loaded from: classes.dex */
final class zzuo {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i6, double d5) {
        List supportedPerformancePoints;
        Boolean bool;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int zzc = zzc(supportedPerformancePoints, g0.e(i5, i6, (int) d5));
            boolean z4 = true;
            if (zzc == 1) {
                bool = zzup.zza;
                if (bool == null) {
                    int zzb = Build.VERSION.SDK_INT >= 35 ? 2 : zzb(false);
                    int zzb2 = zzb(true);
                    if (zzb != 0 && (zzb2 != 0 ? !(zzb != 2 || zzb2 != 2) : zzb == 2)) {
                        z4 = false;
                    }
                    zzup.zza = Boolean.valueOf(z4);
                    bool2 = zzup.zza;
                    if (bool2.booleanValue()) {
                    }
                }
            }
            return zzc;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(boolean z4) {
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzM = zztVar.zzM();
            if (zzM.zzo != null) {
                List zzc = zzvg.zzc(zzuw.zzb, zzM, z4, false);
                for (int i5 = 0; i5 < zzc.size(); i5++) {
                    if (((zzun) zzc.get(i5)).zzd != null && (r2 = ((zzun) zzc.get(i5)).zzd.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        g0.k();
                        return zzc(supportedPerformancePoints, g0.d());
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i5 = 0; i5 < list.size(); i5++) {
            covers = g0.f(list.get(i5)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
