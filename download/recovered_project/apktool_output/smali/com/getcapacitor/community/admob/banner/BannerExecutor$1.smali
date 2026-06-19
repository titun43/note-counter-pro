.class Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/banner/BannerExecutor;->createNewAdView(Lcom/getcapacitor/community/admob/models/AdOptions;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAdClosed()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Closed:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->g(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$500(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->h(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/google/android/gms/ads/AdView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->j(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Landroid/view/ViewGroup;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->i(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Landroid/widget/RelativeLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->i(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->h(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/google/android/gms/ads/AdView;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->h(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/google/android/gms/ads/AdView;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/android/gms/ads/BaseAdView;->destroy()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->k(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, v1, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(II)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 60
    .line 61
    sget-object v2, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 62
    .line 63
    invoke-virtual {v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v1, v2, v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$200(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdMobPluginError;

    .line 71
    .line 72
    invoke-direct {v0, p1}, Lcom/getcapacitor/community/admob/models/AdMobPluginError;-><init>(Lcom/google/android/gms/ads/AdError;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 76
    .line 77
    sget-object v2, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->FailedToLoad:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v1, v2, v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$300(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 84
    .line 85
    .line 86
    invoke-super {p0, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(Lcom/google/android/gms/ads/LoadAdError;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public onAdImpression()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->AdImpression:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->g(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$600(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdImpression()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->h(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/google/android/gms/ads/AdView;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeInfo;-><init>(Lcom/google/android/gms/ads/AdView;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 13
    .line 14
    sget-object v2, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->SizeChanged:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v1, v2, v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$000(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 24
    .line 25
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Loaded:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->g(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/getcapacitor/JSObject;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$100(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 38
    .line 39
    .line 40
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onAdOpened()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 2
    .line 3
    sget-object v1, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->Opened:Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/getcapacitor/community/admob/banner/BannerAdPluginEvents;->getWebEventName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/getcapacitor/community/admob/banner/BannerExecutor$1;->this$0:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 10
    .line 11
    invoke-static {v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->g(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->access$400(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
