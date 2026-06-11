package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzm zza;

    public /* synthetic */ zzl(zzm zzmVar, byte[] bArr) {
        Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzm zzmVar = this.zza;
        Bitmap zza = com.google.android.gms.ads.internal.zzt.zzy().zza(Integer.valueOf(zzmVar.zzc.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.zzc.zzo;
            boolean z4 = zzlVar.zzd;
            float f5 = zzlVar.zze;
            Activity activity = zzmVar.zzb;
            if (!z4 || f5 <= 0.0f || f5 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f5);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzl.this.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
