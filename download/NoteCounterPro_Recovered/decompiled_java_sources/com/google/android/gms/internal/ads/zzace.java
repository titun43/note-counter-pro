package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class zzace extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacd zzd;
    private boolean zze;

    public /* synthetic */ zzace(zzacd zzacdVar, SurfaceTexture surfaceTexture, boolean z4, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacdVar;
        this.zza = z4;
    }

    public static synchronized boolean zza(Context context) {
        int i5;
        int i6;
        synchronized (zzace.class) {
            if (!zzc) {
                try {
                } catch (zzdu e4) {
                    zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e4.getMessage())));
                }
                if (zzdv.zza(context)) {
                    i5 = zzdv.zzb() ? 1 : 2;
                    zzb = i5;
                    zzc = true;
                }
                i5 = 0;
                zzb = i5;
                zzc = true;
            }
            i6 = zzb;
        }
        return i6 != 0;
    }

    public static zzace zzb(Context context, boolean z4) {
        boolean z5 = true;
        if (z4 && !zza(context)) {
            z5 = false;
        }
        zzgrc.zzi(z5);
        return new zzacd().zza(z4 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzacd zzacdVar = this.zzd;
        synchronized (zzacdVar) {
            try {
                if (!this.zze) {
                    zzacdVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
