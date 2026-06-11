.class public final Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;
.super Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners;->getRewardedAdLoadCallback(Lcom/getcapacitor/PluginCall;Lx2/a;Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $adOptions:Lcom/getcapacitor/community/admob/models/AdOptions;

.field final synthetic $call:Lcom/getcapacitor/PluginCall;

.field final synthetic $notifyListenersFunction:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/getcapacitor/PluginCall;Lx2/a;Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            "Lcom/getcapacitor/community/admob/models/AdOptions;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$adOptions:Lcom/getcapacitor/community/admob/models/AdOptions;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;-><init>()V

    .line 8
    .line 9
    .line 10
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
    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 12
    .line 13
    const-string v2, "onRewardedVideoAdFailedToLoad"

    .line 14
    .line 15
    invoke-interface {v1, v2, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

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

.method public onAdLoaded(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V
    .locals 3

    const-string v0, "ad"

    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    const-string v1, "immersiveMode"

    invoke-virtual {v0, v1}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->setImmersiveMode(Z)V

    .line 4
    sput-object p1, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->mRewardedAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    .line 5
    new-instance v0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;

    .line 6
    sget-object v1, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->INSTANCE:Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;

    iget-object v2, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    .line 7
    invoke-direct {v0, v1, v2}, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;-><init>(Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;Lx2/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->setFullScreenContentCallback(Lcom/google/android/gms/ads/FullScreenContentCallback;)V

    .line 8
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$adOptions:Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v0, v0, Lcom/getcapacitor/community/admob/models/AdOptions;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    invoke-virtual {v0}, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;->getHasInfo()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    new-instance v0, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;-><init>()V

    .line 10
    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$adOptions:Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v1, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;->getCustomData()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->setCustomData(Ljava/lang/String;)Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    .line 12
    :cond_1
    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$adOptions:Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v1, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;->getUserId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->setUserId(Ljava/lang/String;)Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;

    .line 14
    :cond_2
    sget-object v1, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->mRewardedAd:Lcom/google/android/gms/ads/rewarded/RewardedAd;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions$Builder;->build()Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->setServerSideVerificationOptions(Lcom/google/android/gms/ads/rewarded/ServerSideVerificationOptions;)V

    .line 15
    :cond_3
    new-instance v0, Lcom/getcapacitor/JSObject;

    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 16
    const-string v1, "adUnitId"

    invoke-virtual {p1}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->getAdUnitId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 17
    iget-object p1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$call:Lcom/getcapacitor/PluginCall;

    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 18
    iget-object p1, p0, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->$notifyListenersFunction:Lx2/a;

    const-string v1, "onRewardedVideoAdLoaded"

    invoke-interface {p1, v1, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/ads/rewarded/RewardedAd;

    invoke-virtual {p0, p1}, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners$getRewardedAdLoadCallback$1;->onAdLoaded(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V

    return-void
.end method
