.class public Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;
.super Lcom/getcapacitor/community/admob/models/Executor;
.source "SourceFile"


# static fields
.field public static interstitialAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;


# instance fields
.field adCallbackAndListeners:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;


# direct methods
.method public constructor <init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le0/d;",
            "Le0/d;",
            "Lx2/a;",
            "Ljava/lang/String;",
            "Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v5, "AdRewardExecutor"

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v3, p3

    .line 7
    move-object v4, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/getcapacitor/community/admob/models/Executor;-><init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p5, v0, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->adCallbackAndListeners:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->lambda$prepareInterstitial$0(Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    return-void
.end method

.method public static synthetic b(Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->lambda$showInterstitial$1(Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method private synthetic lambda$prepareInterstitial$0(Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/getcapacitor/community/admob/helpers/RequestHelper;->createRequest(Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/AdRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/getcapacitor/community/admob/models/Executor;->logTag:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 8
    .line 9
    invoke-interface {v2}, Le0/d;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {p1, v0, v1, v2}, Lcom/getcapacitor/community/admob/helpers/AdViewIdHelper;->getFinalAdId(Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/google/android/gms/ads/AdRequest;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v1, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 20
    .line 21
    invoke-interface {v1}, Le0/d;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/content/Context;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->adCallbackAndListeners:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;

    .line 28
    .line 29
    invoke-virtual {v2, p2, p3}, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;->getInterstitialAdLoadCallback(Lcom/getcapacitor/PluginCall;Lx2/a;)Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {v1, p1, v0, p2}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private synthetic lambda$showInterstitial$1(Lcom/getcapacitor/PluginCall;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->interstitialAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 4
    .line 5
    invoke-interface {v1}, Le0/d;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/interstitial/InterstitialAd;->show(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public prepareInterstitial(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/getcapacitor/community/admob/models/AdOptions;->getFactory()Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;->createInterstitialOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 10
    .line 11
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/app/Activity;

    .line 16
    .line 17
    new-instance v1, Lcom/getcapacitor/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    move-object v2, p0

    .line 21
    move-object v4, p1

    .line 22
    move-object v5, p2

    .line 23
    :try_start_1
    invoke-direct/range {v1 .. v6}, Lcom/getcapacitor/a;-><init>(Lcom/getcapacitor/community/admob/models/Executor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 31
    :goto_0
    move-object p1, v0

    .line 32
    goto :goto_1

    .line 33
    :catch_1
    move-exception v0

    .line 34
    move-object v4, p1

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {v4, p2, p1}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public showInterstitial(Lcom/getcapacitor/PluginCall;Lx2/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->interstitialAd:Lcom/google/android/gms/ads/interstitial/InterstitialAd;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "No Interstitial can be shown. It was not prepared or maybe it failed to be prepared."

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lcom/getcapacitor/community/admob/models/AdMobPluginError;

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    invoke-direct {p1, v1, v0}, Lcom/getcapacitor/community/admob/models/AdMobPluginError;-><init>(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "interstitialAdFailedToLoad"

    .line 17
    .line 18
    invoke-interface {p2, v0, p1}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p2, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 23
    .line 24
    invoke-interface {p2}, Le0/d;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Landroid/app/Activity;

    .line 29
    .line 30
    new-instance v0, La2/b;

    .line 31
    .line 32
    const/4 v1, 0x6

    .line 33
    invoke-direct {v0, v1, p0, p1}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
