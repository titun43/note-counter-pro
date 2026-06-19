package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import androidx.emoji2.text.u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdqv {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final x2.b zzb;
    private final Executor zzc;

    public zzdqv(com.google.android.gms.ads.internal.util.zzbl zzblVar, x2.b bVar, Executor executor) {
        this.zza = zzblVar;
        this.zzb = bVar;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        ((x2.c) this.zzb).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j2 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z4 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z4).length());
            u.s(sb, "Decoded image w: ", width, " h:", height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    public final j3.a zza(String str, final double d5, final boolean z4) {
        return zzgzo.zzk(this.zza.zza(str), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdqu
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzdqv.this.zzb(d5, z4, (zzaru) obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ Bitmap zzb(double d5, boolean z4, zzaru zzaruVar) {
        byte[] bArr = zzaruVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d5 * 160.0d);
        if (!z4) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i5 = options.outWidth * options.outHeight;
            if (i5 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i5 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }
}
