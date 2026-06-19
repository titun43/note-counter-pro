package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");

    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    static {
        new AdSize(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i5, int i6) {
        this(i5, i6, u.n(new StringBuilder(String.valueOf(r1).length() + String.valueOf(r0).length() + 1 + 3), r0, "x", r1, "_as"));
        String valueOf = i5 == -1 ? "FULL" : String.valueOf(i5);
        String valueOf2 = i6 == -2 ? "AUTO" : String.valueOf(i6);
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i5) {
        AdSize zzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i5, 50, 0);
        zzj.zze = true;
        return zzj;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i5) {
        int zzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 0);
        if (zzp == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i5, 0);
        adSize.zzg = zzp;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i5, int i6) {
        AdSize adSize = new AdSize(i5, 0);
        adSize.zzg = i6;
        adSize.zzf = true;
        if (i6 < 32) {
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 118);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i6);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            zzo.zzi(sb.toString());
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i5) {
        AdSize zzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i5, 50, 2);
        zzj.zze = true;
        return zzj;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i5) {
        int zzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 2);
        AdSize adSize = new AdSize(i5, 0);
        if (zzp == -1) {
            return INVALID;
        }
        adSize.zzg = zzp;
        adSize.zzf = true;
        return adSize;
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i5) {
        AdSize zzj = com.google.android.gms.ads.internal.util.client.zzf.zzj(context, i5, 50, 1);
        zzj.zze = true;
        return zzj;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i5) {
        int zzp = com.google.android.gms.ads.internal.util.client.zzf.zzp(context, 1);
        AdSize adSize = new AdSize(i5, 0);
        if (zzp == -1) {
            return INVALID;
        }
        adSize.zzg = zzp;
        adSize.zzf = true;
        return adSize;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(Context context) {
        int i5 = this.zzc;
        if (i5 == -4 || i5 == -3) {
            return -1;
        }
        if (i5 == -2) {
            return zzr.zza(context.getResources().getDisplayMetrics());
        }
        zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i5);
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(Context context) {
        int i5 = this.zzb;
        if (i5 == -3) {
            return -1;
        }
        if (i5 != -1) {
            zzbb.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i5);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzr> creator = zzr.CREATOR;
        return displayMetrics.widthPixels;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    public String toString() {
        return this.zzd;
    }

    public final boolean zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final void zzc(boolean z4) {
        this.zzf = true;
    }

    public final void zzd(int i5) {
        this.zzg = i5;
    }

    public final int zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final void zzg(boolean z4) {
        this.zzh = true;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final void zzi(int i5) {
        this.zzi = i5;
    }

    public AdSize(int i5, int i6, String str) {
        if (i5 < 0 && i5 != -1 && i5 != -3) {
            throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i5).length() + 26), "Invalid width for AdSize: ", i5));
        }
        if (i6 < 0 && i6 != -2 && i6 != -4) {
            throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i6).length() + 27), "Invalid height for AdSize: ", i6));
        }
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = str;
    }
}
