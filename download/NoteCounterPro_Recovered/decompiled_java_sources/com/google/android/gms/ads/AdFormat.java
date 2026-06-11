package com.google.android.gms.ads;

/* loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zza;

    AdFormat(int i5) {
        this.zza = i5;
    }

    public static AdFormat getAdFormat(int i5) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i5) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zza;
    }
}
