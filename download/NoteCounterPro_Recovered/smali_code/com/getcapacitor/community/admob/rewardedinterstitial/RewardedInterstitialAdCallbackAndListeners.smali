.class public final Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;

    invoke-direct {v0}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;-><init>()V

    sput-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;->INSTANCE:Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lx2/a;Lcom/getcapacitor/PluginCall;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;->getOnUserEarnedRewardListener$lambda$0(Lx2/a;Lcom/getcapacitor/PluginCall;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void
.end method

.method private static final getOnUserEarnedRewardListener$lambda$0(Lx2/a;Lcom/getcapacitor/PluginCall;Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 3

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "type"

    .line 12
    .line 13
    invoke-interface {p2}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "amount"

    .line 22
    .line 23
    invoke-interface {p2}, Lcom/google/android/gms/ads/rewarded/RewardItem;->getAmount()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {v1, v2, p2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;I)Lcom/getcapacitor/JSObject;

    .line 28
    .line 29
    .line 30
    const-string p2, "onRewardedInterstitialAdReward"

    .line 31
    .line 32
    invoke-interface {p0, p2, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final getOnUserEarnedRewardListener(Lcom/getcapacitor/PluginCall;Lx2/a;)Lcom/google/android/gms/ads/OnUserEarnedRewardListener;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")",
            "Lcom/google/android/gms/ads/OnUserEarnedRewardListener;"
        }
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notifyListenersFunction"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/getcapacitor/community/admob/rewarded/a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p2, p1, v1}, Lcom/getcapacitor/community/admob/rewarded/a;-><init>(Lx2/a;Lcom/getcapacitor/PluginCall;I)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final getRewardedAdLoadCallback(Lcom/getcapacitor/PluginCall;Lx2/a;Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            "Lcom/getcapacitor/community/admob/models/AdOptions;",
            ")",
            "Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;"
        }
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notifyListenersFunction"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "adOptions"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p3, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;

    .line 17
    .line 18
    invoke-direct {p3, p2, p1}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;-><init>(Lx2/a;Lcom/getcapacitor/PluginCall;)V

    .line 19
    .line 20
    .line 21
    return-object p3
.end method
