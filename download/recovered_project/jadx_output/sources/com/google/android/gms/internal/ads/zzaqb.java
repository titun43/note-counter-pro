package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzaqb {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaqb(int i5, int i6, int i7) {
        String str;
        if (i5 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 1);
            sb.append(i5);
            sb.append("/");
            str = sb.toString();
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.zza = str;
        this.zzb = i6;
        this.zzc = i7;
        this.zzd = Integer.MIN_VALUE;
        this.zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i5 = this.zzd;
        int i6 = i5 == Integer.MIN_VALUE ? this.zzb : i5 + this.zzc;
        this.zzd = i6;
        String str = this.zza;
        this.zze = u.l(new StringBuilder(str.length() + String.valueOf(i6).length()), str, i6);
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
