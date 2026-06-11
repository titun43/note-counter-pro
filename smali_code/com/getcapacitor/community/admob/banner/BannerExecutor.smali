.class public Lcom/getcapacitor/community/admob/banner/BannerExecutor;
.super Lcom/getcapacitor/community/admob/models/Executor;
.source "SourceFile"


# instance fields
.field private final emptyObject:Lcom/getcapacitor/JSObject;

.field private mAdView:Lcom/google/android/gms/ads/AdView;

.field private mAdViewLayout:Landroid/widget/RelativeLayout;

.field private mViewGroup:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Le0/d;Le0/d;Lx2/a;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le0/d;",
            "Le0/d;",
            "Lx2/a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v5, "BannerExecutor"

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
    new-instance p1, Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->emptyObject:Lcom/getcapacitor/JSObject;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$showBanner$0(Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$000(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$400(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$600(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$updateExistingAdView$4(Lcom/getcapacitor/community/admob/models/AdOptions;)V

    return-void
.end method

.method public static synthetic c(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$removeBanner$3()V

    return-void
.end method

.method private createNewAdView(Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    new-instance v1, Lcom/getcapacitor/community/admob/banner/c;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, p0, p1, v2}, Lcom/getcapacitor/community/admob/banner/c;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic d(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$hideBanner$1(Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$resumeBanner$2()V

    return-void
.end method

.method public static synthetic f(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->lambda$createNewAdView$5(Lcom/getcapacitor/community/admob/models/AdOptions;)V

    return-void
.end method

.method public static bridge synthetic g(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/getcapacitor/JSObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->emptyObject:Lcom/getcapacitor/JSObject;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/google/android/gms/ads/AdView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method public static bridge synthetic j(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mViewGroup:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public static bridge synthetic k(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    return-void
.end method

.method private synthetic lambda$createNewAdView$5(Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/getcapacitor/community/admob/helpers/RequestHelper;->createRequest(Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/AdRequest;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/getcapacitor/community/admob/models/Executor;->logTag:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 10
    .line 11
    invoke-interface {v3}, Le0/d;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v1, p1, v0, v2, v3}, Lcom/getcapacitor/community/admob/helpers/AdViewIdHelper;->assignIdToAdView(Lcom/google/android/gms/ads/AdView;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/google/android/gms/ads/AdRequest;Ljava/lang/String;Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/BaseAdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 33
    .line 34
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/BaseAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mViewGroup:Landroid/view/ViewGroup;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private synthetic lambda$hideBanner$1(Lcom/getcapacitor/PluginCall;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->pause()V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(II)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0, v1, v0}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method private synthetic lambda$removeBanner$3()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mViewGroup:Landroid/view/ViewGroup;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->destroy()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->logTag:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "Banner AD Removed"

    .line 30
    .line 31
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, v1, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, v1, v0}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method private synthetic lambda$resumeBanner$2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->resume()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(Lcom/google/android/gms/ads/AdView;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {p0, v1, v0}, Lcom/getcapacitor/community/admob/models/Executor;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->logTag:Ljava/lang/String;

    .line 35
    .line 36
    const-string v1, "Banner AD Resumed"

    .line 37
    .line 38
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method private synthetic lambda$showBanner$0(Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .line 1
    invoke-virtual {p4}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-virtual {p4}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "TOP_CENTER"

    .line 10
    .line 11
    iget-object p1, p1, Lcom/getcapacitor/community/admob/models/AdOptions;->position:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, v1, v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2, v1, v1, v1, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    return-object p4
.end method

.method private synthetic lambda$updateExistingAdView$4(Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/getcapacitor/community/admob/helpers/RequestHelper;->createRequest(Lcom/getcapacitor/community/admob/models/AdOptions;)Lcom/google/android/gms/ads/AdRequest;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/BaseAdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private updateExistingAdView(Lcom/getcapacitor/community/admob/models/AdOptions;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    new-instance v1, Lcom/getcapacitor/community/admob/banner/c;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v2}, Lcom/getcapacitor/community/admob/banner/c;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public hideBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "You tried to hide a banner that was never shown"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 12
    .line 13
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/app/Activity;

    .line 18
    .line 19
    new-instance v1, La2/b;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {v1, v2, p0, p1}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public initialize()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    const v1, 0x1020002

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mViewGroup:Landroid/view/ViewGroup;

    .line 26
    .line 27
    return-void
.end method

.method public removeBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 6
    .line 7
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    new-instance v1, Lcom/getcapacitor/community/admob/banner/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/banner/b;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public resumeBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 2
    .line 3
    invoke-interface {v0}, Le0/d;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    new-instance v1, Lcom/getcapacitor/community/admob/banner/b;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/community/admob/banner/b;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public showBanner(Lcom/getcapacitor/PluginCall;)V
    .locals 12

    .line 1
    const-string v0, "ADAPTIVE_BANNER"

    .line 2
    .line 3
    invoke-static {}, Lcom/getcapacitor/community/admob/models/AdOptions;->getFactory()Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;->createBannerOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 12
    .line 13
    invoke-interface {v2}, Le0/d;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/content/Context;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 28
    .line 29
    iget-object v3, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 30
    .line 31
    invoke-interface {v3}, Le0/d;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 46
    .line 47
    new-instance v4, Landroid/util/DisplayMetrics;

    .line 48
    .line 49
    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 53
    .line 54
    invoke-interface {v5}, Le0/d;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Landroid/app/Activity;

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5, v4}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 69
    .line 70
    .line 71
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 72
    .line 73
    iget-object v5, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 74
    .line 75
    invoke-interface {v5}, Le0/d;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Landroid/app/Activity;

    .line 80
    .line 81
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget v5, v5, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 90
    .line 91
    and-int/lit16 v5, v5, 0x400

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    const/4 v7, 0x0

    .line 95
    if-eqz v5, :cond_0

    .line 96
    .line 97
    move v5, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_0
    move v5, v7

    .line 100
    :goto_0
    iget-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 101
    .line 102
    if-eqz v8, :cond_1

    .line 103
    .line 104
    invoke-direct {p0, v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->updateExistingAdView(Lcom/getcapacitor/community/admob/models/AdOptions;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_1
    :try_start_0
    new-instance v8, Lcom/google/android/gms/ads/AdView;

    .line 109
    .line 110
    iget-object v9, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 111
    .line 112
    invoke-interface {v9}, Le0/d;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    check-cast v9, Landroid/content/Context;

    .line 117
    .line 118
    invoke-direct {v8, v9}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    .line 119
    .line 120
    .line 121
    iput-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 122
    .line 123
    iget-object v8, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 124
    .line 125
    invoke-virtual {v8}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-nez v8, :cond_2

    .line 134
    .line 135
    iget-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 136
    .line 137
    iget-object v9, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 138
    .line 139
    invoke-virtual {v9}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->getSize()Lcom/google/android/gms/ads/AdSize;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v8, v9}, Lcom/google/android/gms/ads/BaseAdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :catch_0
    move-exception v0

    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_2
    iget-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdView:Lcom/google/android/gms/ads/AdView;

    .line 151
    .line 152
    iget-object v9, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 153
    .line 154
    invoke-interface {v9}, Le0/d;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    check-cast v9, Landroid/content/Context;

    .line 159
    .line 160
    int-to-float v10, v3

    .line 161
    div-float/2addr v10, v2

    .line 162
    float-to-int v10, v10

    .line 163
    invoke-static {v9, v10}, Lcom/google/android/gms/ads/AdSize;->getCurrentOrientationAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lcom/google/android/gms/ads/AdSize;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-virtual {v8, v9}, Lcom/google/android/gms/ads/BaseAdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 168
    .line 169
    .line 170
    :goto_1
    new-instance v8, Landroid/widget/RelativeLayout;

    .line 171
    .line 172
    iget-object v9, p0, Lcom/getcapacitor/community/admob/models/Executor;->contextSupplier:Le0/d;

    .line 173
    .line 174
    invoke-interface {v9}, Le0/d;->get()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    check-cast v9, Landroid/content/Context;

    .line 179
    .line 180
    invoke-direct {v8, v9}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 181
    .line 182
    .line 183
    iput-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 184
    .line 185
    invoke-virtual {v8, v6}, Landroid/widget/RelativeLayout;->setHorizontalGravity(I)V

    .line 186
    .line 187
    .line 188
    iget-object v6, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 189
    .line 190
    const/16 v8, 0x50

    .line 191
    .line 192
    invoke-virtual {v6, v8}, Landroid/widget/RelativeLayout;->setVerticalGravity(I)V

    .line 193
    .line 194
    .line 195
    new-instance v6, Ls/d;

    .line 196
    .line 197
    invoke-direct {v6}, Ls/d;-><init>()V

    .line 198
    .line 199
    .line 200
    iget-object v9, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->position:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    const v11, 0x7645c055

    .line 207
    .line 208
    .line 209
    if-eq v10, v11, :cond_4

    .line 210
    .line 211
    const v11, 0x774b229f

    .line 212
    .line 213
    .line 214
    if-eq v10, v11, :cond_3

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    const-string v10, "TOP_CENTER"

    .line 218
    .line 219
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-eqz v9, :cond_5

    .line 224
    .line 225
    const/16 v8, 0x30

    .line 226
    .line 227
    iput v8, v6, Ls/d;->b:I

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_4
    const-string v10, "CENTER"

    .line 231
    .line 232
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    if-eqz v9, :cond_5

    .line 237
    .line 238
    const/16 v8, 0x11

    .line 239
    .line 240
    iput v8, v6, Ls/d;->b:I

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_5
    :goto_2
    iput v8, v6, Ls/d;->b:I

    .line 244
    .line 245
    :goto_3
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 246
    .line 247
    const/16 v9, 0x23

    .line 248
    .line 249
    if-lt v8, v9, :cond_6

    .line 250
    .line 251
    iget-object v8, p0, Lcom/getcapacitor/community/admob/models/Executor;->activitySupplier:Le0/d;

    .line 252
    .line 253
    invoke-interface {v8}, Le0/d;->get()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    check-cast v8, Landroid/app/Activity;

    .line 258
    .line 259
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v8}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    new-instance v9, Lcom/getcapacitor/community/admob/banner/a;

    .line 268
    .line 269
    invoke-direct {v9, p0, v1, v6}, Lcom/getcapacitor/community/admob/banner/a;-><init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v8, v9}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 273
    .line 274
    .line 275
    :cond_6
    iget-object v8, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->mAdViewLayout:Landroid/widget/RelativeLayout;

    .line 276
    .line 277
    invoke-virtual {v8, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    iget v8, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->margin:I

    .line 281
    .line 282
    int-to-float v8, v8

    .line 283
    mul-float/2addr v8, v2

    .line 284
    float-to-int v8, v8

    .line 285
    iget-object v9, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 286
    .line 287
    invoke-virtual {v9}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->getSize()Lcom/google/android/gms/ads/AdSize;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-virtual {v9}, Lcom/google/android/gms/ads/AdSize;->getWidth()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    int-to-float v9, v9

    .line 296
    mul-float/2addr v9, v2

    .line 297
    float-to-int v2, v9

    .line 298
    if-lez v2, :cond_9

    .line 299
    .line 300
    iget-object v9, v1, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 301
    .line 302
    invoke-virtual {v9}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_7

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_7
    sub-int/2addr v3, v2

    .line 314
    div-int/lit8 v3, v3, 0x2

    .line 315
    .line 316
    if-eqz v5, :cond_8

    .line 317
    .line 318
    sub-int/2addr v4, v2

    .line 319
    div-int/lit8 v3, v4, 0x2

    .line 320
    .line 321
    :cond_8
    invoke-virtual {v6, v3, v8, v3, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_9
    :goto_4
    if-eqz v5, :cond_a

    .line 326
    .line 327
    sub-int/2addr v4, v3

    .line 328
    div-int/lit8 v7, v4, 0x2

    .line 329
    .line 330
    :cond_a
    invoke-virtual {v6, v7, v8, v7, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 331
    .line 332
    .line 333
    :goto_5
    invoke-direct {p0, v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->createNewAdView(Lcom/getcapacitor/community/admob/models/AdOptions;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 345
    .line 346
    .line 347
    return-void
.end method
