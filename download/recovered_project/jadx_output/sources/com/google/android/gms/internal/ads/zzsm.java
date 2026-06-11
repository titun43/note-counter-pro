package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzsm {
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i5;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        zzvVar.getClass();
        zzdVar.getClass();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 29 || (i5 = zzvVar.zzH) == -1) {
            return zzpz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z4 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || i6 < zzfj.zzC(zzg)) {
            return zzpz.zza;
        }
        int zzB = zzfj.zzB(zzvVar.zzG);
        if (zzB == 0) {
            return zzpz.zza;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i5).setChannelMask(zzB).setEncoding(zzg).build();
            if (i6 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(build, zzdVar.zza());
                if (!isOffloadedPlaybackSupported) {
                    return zzpz.zza;
                }
                zzpy zzpyVar = new zzpy();
                zzpyVar.zza(true);
                zzpyVar.zzc(booleanValue);
                return zzpyVar.zzd();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpz.zza;
            }
            zzpy zzpyVar2 = new zzpy();
            if (i6 > 32 && playbackOffloadSupport == 2) {
                z4 = true;
            }
            zzpyVar2.zza(true);
            zzpyVar2.zzb(z4);
            zzpyVar2.zzc(booleanValue);
            return zzpyVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpz.zza;
        }
    }

    public zzsm(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
