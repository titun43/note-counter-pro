package com.getcapacitor.community.admob.banner;

import com.google.android.gms.ads.AdSize;
import g4.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BannerAdSizeEnum {
    private static final /* synthetic */ z3.a $ENTRIES;
    private static final /* synthetic */ BannerAdSizeEnum[] $VALUES;
    public static final BannerAdSizeEnum ADAPTIVE_BANNER;
    public static final BannerAdSizeEnum BANNER;
    public static final BannerAdSizeEnum FULL_BANNER;
    public static final BannerAdSizeEnum LARGE_BANNER;
    public static final BannerAdSizeEnum LEADERBOARD;
    public static final BannerAdSizeEnum MEDIUM_RECTANGLE;
    public static final BannerAdSizeEnum SMART_BANNER;
    private final AdSize size;

    private static final /* synthetic */ BannerAdSizeEnum[] $values() {
        return new BannerAdSizeEnum[]{BANNER, FULL_BANNER, LARGE_BANNER, MEDIUM_RECTANGLE, LEADERBOARD, ADAPTIVE_BANNER, SMART_BANNER};
    }

    static {
        AdSize adSize = AdSize.BANNER;
        i.d(adSize, "BANNER");
        BANNER = new BannerAdSizeEnum("BANNER", 0, adSize);
        AdSize adSize2 = AdSize.FULL_BANNER;
        i.d(adSize2, "FULL_BANNER");
        FULL_BANNER = new BannerAdSizeEnum("FULL_BANNER", 1, adSize2);
        AdSize adSize3 = AdSize.LARGE_BANNER;
        i.d(adSize3, "LARGE_BANNER");
        LARGE_BANNER = new BannerAdSizeEnum("LARGE_BANNER", 2, adSize3);
        AdSize adSize4 = AdSize.MEDIUM_RECTANGLE;
        i.d(adSize4, "MEDIUM_RECTANGLE");
        MEDIUM_RECTANGLE = new BannerAdSizeEnum("MEDIUM_RECTANGLE", 3, adSize4);
        AdSize adSize5 = AdSize.LEADERBOARD;
        i.d(adSize5, "LEADERBOARD");
        LEADERBOARD = new BannerAdSizeEnum("LEADERBOARD", 4, adSize5);
        AdSize adSize6 = AdSize.INVALID;
        i.d(adSize6, "INVALID");
        ADAPTIVE_BANNER = new BannerAdSizeEnum("ADAPTIVE_BANNER", 5, adSize6);
        AdSize adSize7 = AdSize.SMART_BANNER;
        i.d(adSize7, "SMART_BANNER");
        SMART_BANNER = new BannerAdSizeEnum("SMART_BANNER", 6, adSize7);
        BannerAdSizeEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = z2.b.g($values);
    }

    private BannerAdSizeEnum(String str, int i5, AdSize adSize) {
        this.size = adSize;
    }

    public static z3.a getEntries() {
        return $ENTRIES;
    }

    public static BannerAdSizeEnum valueOf(String str) {
        return (BannerAdSizeEnum) Enum.valueOf(BannerAdSizeEnum.class, str);
    }

    public static BannerAdSizeEnum[] values() {
        return (BannerAdSizeEnum[]) $VALUES.clone();
    }

    public final AdSize getSize() {
        return this.size;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
