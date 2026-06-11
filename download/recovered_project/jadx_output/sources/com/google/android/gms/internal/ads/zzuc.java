package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzuc implements zzui {
    private final Context zza;

    @Deprecated
    public zzuc() {
        this.zza = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // com.google.android.gms.internal.ads.zzui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzuk zzb(zzuh zzuhVar) {
        Context context;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 || ((context = this.zza) != null && i5 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzf = zzas.zzf(zzuhVar.zzc.zzo);
            zzee.zzb("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfj.zzP(zzf)));
            return new zztu(zzf).zza(zzuhVar);
        }
        MediaCodec mediaCodec = null;
        try {
            zzun zzunVar = zzuhVar.zza;
            String str = zzunVar.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzuhVar.zzd;
                int i6 = 0;
                if (surface == null && zzunVar.zzh && i5 >= 35) {
                    i6 = 8;
                }
                createByCodecName.configure(zzuhVar.zzb, surface, (MediaCrypto) null, i6);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zzvh(createByCodecName, zzuhVar.zzf, null);
            } catch (IOException e4) {
                e = e4;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                }
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (RuntimeException e7) {
            e = e7;
        }
    }

    public zzuc(Context context, zzgru zzgruVar, zzgru zzgruVar2) {
        this.zza = context;
    }
}
