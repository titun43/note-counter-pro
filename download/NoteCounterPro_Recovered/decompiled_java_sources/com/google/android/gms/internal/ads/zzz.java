package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzz {
    private String zza;
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzguf zze;
    private final zzae zzf;
    private final zzai zzg;

    public zzz() {
        zzguf.zzi();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzguf.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzz zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzak zzc() {
        zzag zzagVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new zzag(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null);
        } else {
            zzagVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, bArr), zzan.zza, this.zzg, null);
    }
}
