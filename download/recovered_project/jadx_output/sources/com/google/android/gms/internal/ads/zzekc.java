package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzekc {
    private u0.b zza;
    private final Context zzb;

    public zzekc(Context context) {
        this.zzb = context;
    }

    public final j3.a zza() {
        try {
            u0.a a5 = u0.b.a(this.zzb);
            this.zza = a5;
            return a5 == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : a5.d();
        } catch (Exception e4) {
            return zzgzo.zzc(e4);
        }
    }

    public final j3.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            u0.b bVar = this.zza;
            Objects.requireNonNull(bVar);
            return bVar.b(uri, inputEvent);
        } catch (Exception e4) {
            return zzgzo.zzc(e4);
        }
    }
}
