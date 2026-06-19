.class public final Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;
.super Lcom/google/android/gms/ads/FullScreenContentCallback;
.source "SourceFile"


# instance fields
.field private final loadPluginObject:Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;

.field private final notifyListenersFunction:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;Lx2/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;",
            "Lx2/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "loadPluginObject"

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
    invoke-direct {p0}, Lcom/google/android/gms/ads/FullScreenContentCallback;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->loadPluginObject:Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->notifyListenersFunction:Lx2/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public onAdDismissedFullScreenContent()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->notifyListenersFunction:Lx2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->loadPluginObject:Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;->getDismissed()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/getcapacitor/JSObject;

    .line 10
    .line 11
    invoke-direct {v2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onAdFailedToShowFullScreenContent(Lcom/google/android/gms/ads/AdError;)V
    .locals 2

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
    iget-object p1, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->notifyListenersFunction:Lx2/a;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->loadPluginObject:Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;

    .line 14
    .line 15
    invoke-interface {v1}, Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;->getFailedToShow()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {p1, v1, v0}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->notifyListenersFunction:Lx2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/community/admob/helpers/FullscreenPluginCallback;->loadPluginObject:Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;->getShowed()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/getcapacitor/JSObject;

    .line 10
    .line 11
    invoke-direct {v2}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lx2/a;->a(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
