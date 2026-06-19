package com.getcapacitor.community.admob.banner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BannerAdPluginEvents {
    private static final /* synthetic */ z3.a $ENTRIES;
    private static final /* synthetic */ BannerAdPluginEvents[] $VALUES;
    private final String webEventName;
    public static final BannerAdPluginEvents SizeChanged = new BannerAdPluginEvents("SizeChanged", 0, "bannerAdSizeChanged");
    public static final BannerAdPluginEvents Closed = new BannerAdPluginEvents("Closed", 1, "bannerAdClosed");
    public static final BannerAdPluginEvents FailedToLoad = new BannerAdPluginEvents("FailedToLoad", 2, "bannerAdFailedToLoad");
    public static final BannerAdPluginEvents Opened = new BannerAdPluginEvents("Opened", 3, "bannerAdOpened");
    public static final BannerAdPluginEvents Loaded = new BannerAdPluginEvents("Loaded", 4, "bannerAdLoaded");
    public static final BannerAdPluginEvents Clicked = new BannerAdPluginEvents("Clicked", 5, "bannerAdClicked");
    public static final BannerAdPluginEvents AdImpression = new BannerAdPluginEvents("AdImpression", 6, "bannerAdImpression");

    private static final /* synthetic */ BannerAdPluginEvents[] $values() {
        return new BannerAdPluginEvents[]{SizeChanged, Closed, FailedToLoad, Opened, Loaded, Clicked, AdImpression};
    }

    static {
        BannerAdPluginEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = z2.b.g($values);
    }

    private BannerAdPluginEvents(String str, int i5, String str2) {
        this.webEventName = str2;
    }

    public static z3.a getEntries() {
        return $ENTRIES;
    }

    public static BannerAdPluginEvents valueOf(String str) {
        return (BannerAdPluginEvents) Enum.valueOf(BannerAdPluginEvents.class, str);
    }

    public static BannerAdPluginEvents[] values() {
        return (BannerAdPluginEvents[]) $VALUES.clone();
    }

    public final String getWebEventName() {
        return this.webEventName;
    }
}
