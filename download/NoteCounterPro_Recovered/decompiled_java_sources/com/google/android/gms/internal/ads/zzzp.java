package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzzp {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public zzzp(Context context, zzaaa zzaaaVar, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager zza = context == null ? null : zzcj.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        spatializer = zza.getSpatializer();
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.zzb = immersiveAudioLevel != 0;
        zzzn zzznVar = new zzzn(this, zzaaaVar);
        this.zzd = zzznVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzzo
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzznVar);
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        boolean isAvailable;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isAvailable = d.c(spatializer).isAvailable();
        return isAvailable;
    }

    public final boolean zzc() {
        boolean isEnabled;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isEnabled = d.c(spatializer).isEnabled();
        return isEnabled;
    }

    public final boolean zzd(zzd zzdVar, zzv zzvVar) {
        int i5;
        boolean canBeSpatialized;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i5 = zzvVar.zzG;
            if (i5 == 16) {
                i5 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i5 = zzvVar.zzG;
            if (i5 == -1) {
                i5 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i5 = zzvVar.zzG;
            if (i5 == 18 || i5 == 21) {
                i5 = 24;
            }
        } else {
            i5 = zzvVar.zzG;
        }
        int zzB = zzfj.zzB(i5);
        if (zzB == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzB);
        int i6 = zzvVar.zzH;
        if (i6 != -1) {
            channelMask.setSampleRate(i6);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        canBeSpatialized = d.c(spatializer).canBeSpatialized(zzdVar.zza(), channelMask.build());
        return canBeSpatialized;
    }

    public final void zze() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
