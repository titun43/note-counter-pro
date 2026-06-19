.class public Lcom/getcapacitor/community/admob/AdMob;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    permissions = {
        .subannotation Lcom/getcapacitor/annotation/Permission;
            alias = "network"
            strings = {
                "android.permission.ACCESS_NETWORK_STATE",
                "android.permission.INTERNET"
            }
        .end subannotation
    }
.end annotation


# static fields
.field public static final EMPTY_TESTING_DEVICES:Lcom/getcapacitor/JSArray;


# instance fields
.field private final adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

.field private final adInterstitialExecutor:Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

.field private final adRewardExecutor:Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

.field private final adRewardInterstitialExecutor:Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

.field private final bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/JSArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/getcapacitor/community/admob/AdMob;->EMPTY_TESTING_DEVICES:Lcom/getcapacitor/JSArray;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 5
    .line 6
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/getcapacitor/community/admob/a;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p0, v3}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lcom/getcapacitor/community/admob/a;

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    invoke-direct {v3, p0, v4}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 33
    .line 34
    new-instance v0, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    .line 35
    .line 36
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 37
    .line 38
    const/16 v2, 0x10

    .line 39
    .line 40
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/getcapacitor/community/admob/a;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, p0, v3}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lcom/getcapacitor/community/admob/a;

    .line 50
    .line 51
    const/4 v4, 0x5

    .line 52
    invoke-direct {v3, p0, v4}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardExecutor:Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    .line 63
    .line 64
    new-instance v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    .line 65
    .line 66
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 67
    .line 68
    const/16 v2, 0x10

    .line 69
    .line 70
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 71
    .line 72
    .line 73
    new-instance v2, Lcom/getcapacitor/community/admob/a;

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    invoke-direct {v2, p0, v3}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Lcom/getcapacitor/community/admob/a;

    .line 80
    .line 81
    const/4 v4, 0x6

    .line 82
    invoke-direct {v3, p0, v4}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardInterstitialExecutor:Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    .line 93
    .line 94
    new-instance v5, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    .line 95
    .line 96
    new-instance v6, Lcom/getcapacitor/community/admob/a;

    .line 97
    .line 98
    const/16 v0, 0x10

    .line 99
    .line 100
    invoke-direct {v6, p0, v0}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 101
    .line 102
    .line 103
    new-instance v7, Lcom/getcapacitor/community/admob/a;

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    invoke-direct {v7, p0, v0}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 107
    .line 108
    .line 109
    new-instance v8, Lcom/getcapacitor/community/admob/a;

    .line 110
    .line 111
    const/4 v0, 0x2

    .line 112
    invoke-direct {v8, p0, v0}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    sget-object v10, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;->INSTANCE:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;

    .line 120
    .line 121
    invoke-direct/range {v5 .. v10}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;)V

    .line 122
    .line 123
    .line 124
    iput-object v5, p0, Lcom/getcapacitor/community/admob/AdMob;->adInterstitialExecutor:Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    .line 125
    .line 126
    new-instance v0, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 127
    .line 128
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 129
    .line 130
    const/16 v2, 0x10

    .line 131
    .line 132
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 133
    .line 134
    .line 135
    new-instance v2, Lcom/getcapacitor/community/admob/a;

    .line 136
    .line 137
    const/4 v3, 0x1

    .line 138
    invoke-direct {v2, p0, v3}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 139
    .line 140
    .line 141
    new-instance v3, Lcom/getcapacitor/community/admob/a;

    .line 142
    .line 143
    const/4 v4, 0x3

    .line 144
    invoke-direct {v3, p0, v4}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 155
    .line 156
    return-void
.end method

.method public static synthetic c(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$new$2(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic d(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$showConsentForm$7(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$prepareInterstitial$9(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic f(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$prepareRewardVideoAd$11(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic g(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$showRewardVideoAd$12(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic h(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$requestConsentInfo$5(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic i(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$new$0(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic j(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$new$3(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic k(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$showInterstitial$10(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic l(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$showPrivacyOptionsForm$6(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method private static synthetic lambda$new$0(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$new$1(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$new$2(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$new$3(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$new$4(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$prepareInterstitial$9(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$prepareRewardInterstitialAd$13(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$prepareRewardVideoAd$11(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$requestConsentInfo$5(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$resetConsentInfo$8(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$showConsentForm$7(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$showInterstitial$10(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$showPrivacyOptionsForm$6(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$showRewardInterstitialAd$14(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic lambda$showRewardVideoAd$12(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic m(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$new$1(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic n(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$new$4(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic o(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$showRewardInterstitialAd$14(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic p(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$prepareRewardInterstitialAd$13(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public static synthetic q(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/AdMob;->lambda$resetConsentInfo$8(Lcom/getcapacitor/community/admob/AdMob;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method private setRequestConfiguration(Lcom/getcapacitor/PluginCall;)V
    .locals 8

    .line 1
    const-string v0, "initializeForTesting"

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "testingDevices"

    .line 16
    .line 17
    sget-object v1, Lcom/getcapacitor/community/admob/AdMob;->EMPTY_TESTING_DEVICES:Lcom/getcapacitor/JSArray;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getArray(Ljava/lang/String;Lcom/getcapacitor/JSArray;)Lcom/getcapacitor/JSArray;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v0, Lcom/getcapacitor/community/admob/AdMob;->EMPTY_TESTING_DEVICES:Lcom/getcapacitor/JSArray;

    .line 25
    .line 26
    :goto_0
    const-string v1, "tagForChildDirectedTreatment"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, -0x1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    move v1, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v1, v2

    .line 48
    :goto_1
    const-string v5, "tagForUnderAgeOfConsent"

    .line 49
    .line 50
    invoke-virtual {p1, v5}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-nez v5, :cond_3

    .line 55
    .line 56
    move v5, v4

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    move v5, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    move v5, v2

    .line 67
    :goto_2
    const-string v6, "maxAdContentRating"

    .line 68
    .line 69
    invoke-virtual {p1, v6}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-eqz v6, :cond_9

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    sparse-switch v7, :sswitch_data_0

    .line 80
    .line 81
    .line 82
    :goto_3
    move v2, v4

    .line 83
    goto :goto_4

    .line 84
    :sswitch_0
    const-string v2, "General"

    .line 85
    .line 86
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    const/4 v2, 0x3

    .line 94
    goto :goto_4

    .line 95
    :sswitch_1
    const-string v2, "MatureAudience"

    .line 96
    .line 97
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_6

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_6
    const/4 v2, 0x2

    .line 105
    goto :goto_4

    .line 106
    :sswitch_2
    const-string v2, "Teen"

    .line 107
    .line 108
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-nez v2, :cond_7

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    move v2, v3

    .line 116
    goto :goto_4

    .line 117
    :sswitch_3
    const-string v3, "ParentalGuidance"

    .line 118
    .line 119
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-nez v3, :cond_8

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    :goto_4
    packed-switch v2, :pswitch_data_0

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :pswitch_0
    const-string v2, "G"

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :pswitch_1
    const-string v2, "MA"

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :pswitch_2
    const-string v2, "T"

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :pswitch_3
    const-string v2, "PG"

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_9
    :goto_5
    const-string v2, ""

    .line 143
    .line 144
    :goto_6
    :try_start_0
    new-instance v3, Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 145
    .line 146
    invoke-direct {v3}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/getcapacitor/JSArray;->toList()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTestDeviceIds(Ljava/util/List;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForChildDirectedTreatment(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, v5}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForUnderAgeOfConsent(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setMaxAdContentRating(Ljava/lang/String;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->build()Lcom/google/android/gms/ads/RequestConfiguration;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setRequestConfiguration(Lcom/google/android/gms/ads/RequestConfiguration;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :catch_0
    move-exception v0

    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    nop

    .line 187
    :sswitch_data_0
    .sparse-switch
        -0x2fa0ff13 -> :sswitch_3
        0x27b6fa -> :sswitch_2
        0x5e15364c -> :sswitch_1
        0x5e71a0c8 -> :sswitch_0
    .end sparse-switch

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public hideBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->hideBanner(Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public initialize(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/AdMob;->setRequestConfiguration(Lcom/getcapacitor/PluginCall;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcom/getcapacitor/community/admob/AdMob$1;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/getcapacitor/community/admob/AdMob$1;-><init>(Lcom/getcapacitor/community/admob/AdMob;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->initialize()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public prepareInterstitial(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adInterstitialExecutor:Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->prepareInterstitial(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public prepareRewardInterstitialAd(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardInterstitialExecutor:Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;->prepareRewardInterstitialAd(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public prepareRewardVideoAd(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardExecutor:Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->prepareRewardVideoAd(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public removeBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->removeBanner(Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public requestConsentInfo(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->requestConsentInfo(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public requestTrackingAuthorization(Lcom/getcapacitor/PluginCall;)V
    .locals 0
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public resetConsentInfo(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->resetConsentInfo(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public resumeBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->resumeBanner(Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setApplicationMuted(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "muted"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "muted property cannot be null"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setAppMuted(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setApplicationVolume(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "volume"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->getFloat(Ljava/lang/String;)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "volume property cannot be null"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Lcom/google/android/gms/ads/MobileAds;->setAppVolume(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public showBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->bannerExecutor:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->showBanner(Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public showConsentForm(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->showConsentForm(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public showInterstitial(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adInterstitialExecutor:Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->showInterstitial(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public showPrivacyOptionsForm(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adConsentExecutor:Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->showPrivacyOptionsForm(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public showRewardInterstitialAd(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardInterstitialExecutor:Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;->showRewardInterstitialAd(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public showRewardVideoAd(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/AdMob;->adRewardExecutor:Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    .line 2
    .line 3
    new-instance v1, Lcom/getcapacitor/community/admob/a;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/a;-><init>(Lcom/getcapacitor/community/admob/AdMob;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->showRewardVideoAd(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public trackingAuthorizationStatus(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/getcapacitor/community/admob/helpers/AuthorizationStatusEnum;->AUTHORIZED:Lcom/getcapacitor/community/admob/helpers/AuthorizationStatusEnum;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/helpers/AuthorizationStatusEnum;->getStatus()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "status"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
