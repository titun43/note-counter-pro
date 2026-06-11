package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public interface zzuk {
    void zza(int i5, int i6, int i7, long j2, int i8);

    void zzb(int i5, int i6, zzie zzieVar, long j2, int i7);

    void zzc(int i5, boolean z4);

    void zzd(int i5, long j2);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i5);

    default void zzi(Runnable runnable) {
        runnable.run();
    }

    ByteBuffer zzj(int i5);

    void zzk();

    void zzl();

    default boolean zzm(zzuj zzujVar) {
        return false;
    }

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i5);

    void zzr(List list);
}
