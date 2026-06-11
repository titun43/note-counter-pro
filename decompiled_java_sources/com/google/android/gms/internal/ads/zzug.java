package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzug {
    private final HashSet zza;
    private LoudnessCodecController zzb;

    public zzug() {
        throw null;
    }

    public final void zza(int i5) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.zzb = null;
        }
        create = LoudnessCodecController.create(i5, zzhaf.zza(), new zzud(this));
        this.zzb = create;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public final void zzb(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        zzgrc.zzi(this.zza.add(mediaCodec));
    }

    public final void zzc(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.zza.remove(mediaCodec) || (loudnessCodecController = this.zzb) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void zzd() {
        this.zza.clear();
        LoudnessCodecController loudnessCodecController = this.zzb;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public zzug(zzuf zzufVar) {
        this.zza = new HashSet();
    }
}
