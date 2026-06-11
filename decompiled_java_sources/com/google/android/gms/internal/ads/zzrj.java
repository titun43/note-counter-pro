package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface zzrj {
    void zzA();

    void zzB();

    default void zzC() {
    }

    void zza(zzrg zzrgVar);

    default void zzb(zzpq zzpqVar) {
    }

    default void zzc(zzdn zzdnVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzpz zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z4);

    void zzh(zzv zzvVar, int i5, int[] iArr);

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j2, int i5);

    void zzl();

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z4);

    void zzr(zzd zzdVar);

    void zzs(int i5);

    void zzt(zze zzeVar);

    default void zzu(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzv(int i5) {
    }

    long zzw();

    default void zzx(int i5, int i6) {
    }

    void zzy(float f5);

    void zzz();
}
