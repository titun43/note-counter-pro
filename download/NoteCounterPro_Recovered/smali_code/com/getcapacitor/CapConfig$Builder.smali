.class public Lcom/getcapacitor/CapConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/CapConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private allowMixedContent:Z

.field private allowNavigation:[Ljava/lang/String;

.field private androidScheme:Ljava/lang/String;

.field private appendedUserAgentString:Ljava/lang/String;

.field private backgroundColor:Ljava/lang/String;

.field private captureInput:Z

.field private context:Landroid/content/Context;

.field private errorPath:Ljava/lang/String;

.field private hostname:Ljava/lang/String;

.field private html5mode:Z

.field private initialFocus:Z

.field private loggingEnabled:Z

.field private minHuaweiWebViewVersion:I

.field private minWebViewVersion:I

.field private overriddenUserAgentString:Ljava/lang/String;

.field private pluginsConfiguration:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/getcapacitor/PluginConfig;",
            ">;"
        }
    .end annotation
.end field

.field private resolveServiceWorkerRequests:Z

.field private serverUrl:Ljava/lang/String;

.field private startPath:Ljava/lang/String;

.field private useLegacyBridge:Z

.field private webContentsDebuggingEnabled:Ljava/lang/Boolean;

.field private zoomableWebView:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig$Builder;->html5mode:Z

    .line 6
    .line 7
    const-string v1, "localhost"

    .line 8
    .line 9
    iput-object v1, p0, Lcom/getcapacitor/CapConfig$Builder;->hostname:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "https"

    .line 12
    .line 13
    iput-object v1, p0, Lcom/getcapacitor/CapConfig$Builder;->androidScheme:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig$Builder;->allowMixedContent:Z

    .line 17
    .line 18
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig$Builder;->captureInput:Z

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lcom/getcapacitor/CapConfig$Builder;->webContentsDebuggingEnabled:Ljava/lang/Boolean;

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig$Builder;->loggingEnabled:Z

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig$Builder;->initialFocus:Z

    .line 26
    .line 27
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig$Builder;->useLegacyBridge:Z

    .line 28
    .line 29
    const/16 v3, 0x3c

    .line 30
    .line 31
    iput v3, p0, Lcom/getcapacitor/CapConfig$Builder;->minWebViewVersion:I

    .line 32
    .line 33
    const/16 v3, 0xa

    .line 34
    .line 35
    iput v3, p0, Lcom/getcapacitor/CapConfig$Builder;->minHuaweiWebViewVersion:I

    .line 36
    .line 37
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig$Builder;->zoomableWebView:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig$Builder;->resolveServiceWorkerRequests:Z

    .line 40
    .line 41
    iput-object v2, p0, Lcom/getcapacitor/CapConfig$Builder;->startPath:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v0, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/getcapacitor/CapConfig$Builder;->pluginsConfiguration:Ljava/util/Map;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->context:Landroid/content/Context;

    .line 51
    .line 52
    return-void
.end method

.method public static bridge synthetic a(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->allowMixedContent:Z

    return p0
.end method

.method public static bridge synthetic b(Lcom/getcapacitor/CapConfig$Builder;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->allowNavigation:[Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->androidScheme:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->appendedUserAgentString:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->backgroundColor:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->captureInput:Z

    return p0
.end method

.method public static bridge synthetic g(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->errorPath:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->hostname:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->html5mode:Z

    return p0
.end method

.method public static bridge synthetic j(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->initialFocus:Z

    return p0
.end method

.method public static bridge synthetic k(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->loggingEnabled:Z

    return p0
.end method

.method public static bridge synthetic l(Lcom/getcapacitor/CapConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/getcapacitor/CapConfig$Builder;->minHuaweiWebViewVersion:I

    return p0
.end method

.method public static bridge synthetic m(Lcom/getcapacitor/CapConfig$Builder;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/getcapacitor/CapConfig$Builder;->minWebViewVersion:I

    return p0
.end method

.method public static bridge synthetic n(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->overriddenUserAgentString:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/getcapacitor/CapConfig$Builder;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->pluginsConfiguration:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic p(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->resolveServiceWorkerRequests:Z

    return p0
.end method

.method public static bridge synthetic q(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->serverUrl:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic r(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->startPath:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic s(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->useLegacyBridge:Z

    return p0
.end method

.method public static bridge synthetic t(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/CapConfig$Builder;->webContentsDebuggingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic u(Lcom/getcapacitor/CapConfig$Builder;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/CapConfig$Builder;->zoomableWebView:Z

    return p0
.end method


# virtual methods
.method public create()Lcom/getcapacitor/CapConfig;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig$Builder;->webContentsDebuggingEnabled:Ljava/lang/Boolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/getcapacitor/CapConfig$Builder;->context:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 13
    .line 14
    and-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/getcapacitor/CapConfig$Builder;->webContentsDebuggingEnabled:Ljava/lang/Boolean;

    .line 26
    .line 27
    :cond_1
    new-instance v0, Lcom/getcapacitor/CapConfig;

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Lcom/getcapacitor/CapConfig;-><init>(Lcom/getcapacitor/CapConfig$Builder;I)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public setAllowMixedContent(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->allowMixedContent:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setAllowNavigation([Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->allowNavigation:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setAndroidScheme(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->androidScheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setAppendedUserAgentString(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->appendedUserAgentString:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setBackgroundColor(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->backgroundColor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setCaptureInput(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->captureInput:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setErrorPath(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->errorPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setHTML5mode(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->html5mode:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setHostname(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->hostname:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setInitialFocus(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->initialFocus:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setLoggingEnabled(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->loggingEnabled:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setOverriddenUserAgentString(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->overriddenUserAgentString:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setPluginsConfiguration(Lorg/json/JSONObject;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/getcapacitor/CapConfig;->a(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->pluginsConfiguration:Ljava/util/Map;

    .line 6
    .line 7
    return-object p0
.end method

.method public setResolveServiceWorkerRequests(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->resolveServiceWorkerRequests:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setServerUrl(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->serverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setStartPath(Ljava/lang/String;)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->startPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setUseLegacyBridge(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->useLegacyBridge:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setWebContentsDebuggingEnabled(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/getcapacitor/CapConfig$Builder;->webContentsDebuggingEnabled:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p0
.end method

.method public setZoomableWebView(Z)Lcom/getcapacitor/CapConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig$Builder;->zoomableWebView:Z

    .line 2
    .line 3
    return-object p0
.end method
