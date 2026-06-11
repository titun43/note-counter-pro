package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbkd extends zzbkr {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzbkd(Drawable drawable, Uri uri, double d5, int i5, int i6, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d5;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final a3.a zzb() {
        return new a3.b(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final Map zzg() {
        return this.zzf;
    }
}
