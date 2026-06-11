package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzpt extends AudioDeviceCallback {
    final /* synthetic */ zzpx zza;

    public /* synthetic */ zzpt(zzpx zzpxVar, byte[] bArr) {
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zza(zzpxVar.zzg(), zzpxVar.zzj(), zzpxVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfj.zza;
        int length = audioDeviceInfoArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            zzpx zzpxVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i5], zzpxVar.zzh())) {
                zzpxVar.zzi(null);
                break;
            }
            i5++;
        }
        zzpx zzpxVar2 = this.zza;
        zzpxVar2.zzf(zzps.zza(zzpxVar2.zzg(), zzpxVar2.zzj(), zzpxVar2.zzh()));
    }
}
