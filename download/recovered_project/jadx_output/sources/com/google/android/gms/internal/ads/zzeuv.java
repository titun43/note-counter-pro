package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeuv implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzeuv(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeuv.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 13;
    }

    public final /* synthetic */ zzeuw zzc() {
        int i5;
        int i6;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float zzb = com.google.android.gms.ads.internal.zzt.zzi().zzb();
        boolean zzd = com.google.android.gms.ads.internal.zzt.zzi().zzd();
        if (audioManager == null) {
            return new zzeuw(-1, false, false, -1, -1, -1, -1, -1, zzb, zzd, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmv)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzf().zzk(audioManager);
            i6 = audioManager.getStreamMaxVolume(3);
            i5 = zzk;
        } else {
            i5 = -1;
            i6 = -1;
        }
        return new zzeuw(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i5, i6, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzb, zzd, false);
    }
}
