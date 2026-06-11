package com.getcapacitor.community.admob.models;

import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.banner.BannerAdSizeEnum;
import com.getcapacitor.community.admob.rewarded.models.SsvInfo;

/* loaded from: classes.dex */
public abstract class AdOptions {
    public static final String BANNER_TESTER_ID = "ca-app-pub-3940256099942544/6300978111";
    public static final String INTERSTITIAL_TESTER_ID = "ca-app-pub-3940256099942544/1033173712";
    public static final String REWARD_INTERSTITIAL_TESTER_ID = "ca-app-pub-3940256099942544/5354046379";
    public static final String REWARD_VIDEO_TESTER_ID = "ca-app-pub-3940256099942544/5224354917";
    private static AdOptionsFactory factory;
    public final String adId;
    public final BannerAdSizeEnum adSize;
    public final boolean isTesting;
    public final int margin;
    public final boolean npa;
    public final String position;
    public final SsvInfo ssvInfo;

    public static class AdOptionsFactory {
        public /* synthetic */ AdOptionsFactory(int i5) {
            this();
        }

        public AdOptions createBannerOptions(PluginCall pluginCall) {
            return new AdOptions(this, pluginCall) { // from class: com.getcapacitor.community.admob.models.AdOptions.AdOptionsFactory.1
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return AdOptions.BANNER_TESTER_ID;
                }
            };
        }

        public AdOptions createGenericOptions(PluginCall pluginCall, final String str) {
            return new AdOptions(this, pluginCall) { // from class: com.getcapacitor.community.admob.models.AdOptions.AdOptionsFactory.5
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return str;
                }
            };
        }

        public AdOptions createInterstitialOptions(PluginCall pluginCall) {
            return new AdOptions(this, pluginCall) { // from class: com.getcapacitor.community.admob.models.AdOptions.AdOptionsFactory.2
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return AdOptions.INTERSTITIAL_TESTER_ID;
                }
            };
        }

        public AdOptions createRewardInterstitialOptions(PluginCall pluginCall) {
            return new AdOptions(this, pluginCall) { // from class: com.getcapacitor.community.admob.models.AdOptions.AdOptionsFactory.4
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return AdOptions.REWARD_INTERSTITIAL_TESTER_ID;
                }
            };
        }

        public AdOptions createRewardVideoOptions(PluginCall pluginCall) {
            return new AdOptions(this, pluginCall) { // from class: com.getcapacitor.community.admob.models.AdOptions.AdOptionsFactory.3
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return AdOptions.REWARD_VIDEO_TESTER_ID;
                }
            };
        }

        private AdOptionsFactory() {
        }
    }

    public static class TesterAdOptionsBuilder {
        private String id = "TesterAdOptionsBuilder__defaultID";
        private String testingID = "TesterAdOptionsBuilder__testingID";
        private boolean isTesting = true;
        private String position = "TesterAdOptionsBuilder__position";
        private int margin = 1;
        private boolean npa = false;
        private BannerAdSizeEnum adSize = BannerAdSizeEnum.ADAPTIVE_BANNER;
        private SsvInfo ssvInfo = new SsvInfo();

        public AdOptions build() {
            return new AdOptions(this.id, this.isTesting, this.position, this.margin, this.npa, this.adSize, this.ssvInfo) { // from class: com.getcapacitor.community.admob.models.AdOptions.TesterAdOptionsBuilder.1
                {
                    int i5 = 0;
                }

                @Override // com.getcapacitor.community.admob.models.AdOptions
                public String getTestingId() {
                    return TesterAdOptionsBuilder.this.testingID;
                }
            };
        }

        public TesterAdOptionsBuilder setAdSize(BannerAdSizeEnum bannerAdSizeEnum) {
            this.adSize = bannerAdSizeEnum;
            return this;
        }

        public TesterAdOptionsBuilder setID(String str) {
            this.id = str;
            return this;
        }

        public TesterAdOptionsBuilder setIsTesting(boolean z4) {
            this.isTesting = z4;
            return this;
        }

        public TesterAdOptionsBuilder setMargin(int i5) {
            this.margin = i5;
            return this;
        }

        public TesterAdOptionsBuilder setNpa(boolean z4) {
            this.npa = z4;
            return this;
        }

        public TesterAdOptionsBuilder setPosition(String str) {
            this.position = str;
            return this;
        }

        public TesterAdOptionsBuilder setSsvInfo(SsvInfo ssvInfo) {
            this.ssvInfo = ssvInfo;
            return this;
        }

        public TesterAdOptionsBuilder setTestingID(String str) {
            this.testingID = str;
            return this;
        }
    }

    public /* synthetic */ AdOptions(PluginCall pluginCall, int i5) {
        this(pluginCall);
    }

    private static BannerAdSizeEnum adSizeStringToAdSizeEnum(String str) {
        try {
            return BannerAdSizeEnum.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return BannerAdSizeEnum.ADAPTIVE_BANNER;
        }
    }

    public static AdOptionsFactory getFactory() {
        AdOptionsFactory adOptionsFactory = factory;
        if (adOptionsFactory != null) {
            return adOptionsFactory;
        }
        AdOptionsFactory adOptionsFactory2 = new AdOptionsFactory(0);
        factory = adOptionsFactory2;
        return adOptionsFactory2;
    }

    public abstract String getTestingId();

    public /* synthetic */ AdOptions(String str, boolean z4, String str2, int i5, boolean z5, BannerAdSizeEnum bannerAdSizeEnum, SsvInfo ssvInfo, int i6) {
        this(str, z4, str2, i5, z5, bannerAdSizeEnum, ssvInfo);
    }

    private AdOptions(PluginCall pluginCall) {
        this.adId = pluginCall.getString("adId", getTestingId());
        Boolean bool = Boolean.FALSE;
        this.isTesting = pluginCall.getBoolean("isTesting", bool).booleanValue();
        this.position = pluginCall.getString("position", "BOTTOM_CENTER");
        this.margin = pluginCall.getInt("margin", 0).intValue();
        this.npa = pluginCall.getBoolean("npa", bool).booleanValue();
        this.ssvInfo = new SsvInfo(pluginCall);
        this.adSize = adSizeStringToAdSizeEnum(pluginCall.getString("adSize", BannerAdSizeEnum.ADAPTIVE_BANNER.name()));
    }

    private AdOptions(String str, boolean z4, String str2, int i5, boolean z5, BannerAdSizeEnum bannerAdSizeEnum, SsvInfo ssvInfo) {
        this.adId = str;
        this.isTesting = z4;
        this.position = str2;
        this.margin = i5;
        this.npa = z5;
        this.adSize = bannerAdSizeEnum;
        this.ssvInfo = ssvInfo;
    }
}
