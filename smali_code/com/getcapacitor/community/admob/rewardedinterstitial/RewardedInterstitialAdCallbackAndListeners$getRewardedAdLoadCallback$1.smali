.class public final Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;
.super Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;->getRewardedAdLoadCallback(Lcom/getcapacitor/PluginCall;Lx2/a;Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field final synthetic $notifyListenersFunction:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx2/a;Lcom/getcapacitor/PluginCall;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/a;",
            "Lcom/getcapacitor/PluginCall;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAdLoadCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 3

    .line 1
    const-string v0, "adError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdMobPluginError;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/getcapacitor/community/admob/models/AdMobPluginError;-><init>(Lcom/google/android/gms/ads/AdError;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 12
    .line 13
    const-string v2, "onRewardedInterstitialAdFailedToLoad"

    .line 14
    .line 15
    invoke-interface {v1, v2, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdError;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onAdLoaded(Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;)V
    .locals 3

    const-string v0, "ad"

    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sput-object p1, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;->mRewardedInterstitialAd:Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;

    .line 3
    new-instance v0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;

    .line 4
    sget-object v1, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->INSTANCE:Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;

    iget-object v2, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 5
    invoke-direct {v0, v1, v2}, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;-><init>(Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;Lx2/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 6
    new-instance v0, Lcom/getcapacitor/JSObject;

    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 7
    const-string v1, "adUnitId"

    invoke-virtual {p1}, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 8
    iget-object p1, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 9
    iget-object p1, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    const-string v1, "onRewardedInterstitialAdLoaded"

    invoke-interface {p1, v1, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;

    invoke-virtual {p0, p1}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners$getRewardedAdLoadCallback$1;->onAdLoaded(Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;)V

    return-void
.end method
