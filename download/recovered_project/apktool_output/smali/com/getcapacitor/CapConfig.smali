.class public Lcom/getcapacitor/CapConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/getcapacitor/CapConfig$Builder;
    }
.end annotation


# static fields
.field private static final LOG_BEHAVIOR_DEBUG:Ljava/lang/String; = "debug"

.field private static final LOG_BEHAVIOR_NONE:Ljava/lang/String; = "none"

.field private static final LOG_BEHAVIOR_PRODUCTION:Ljava/lang/String; = "production"


# instance fields
.field private allowMixedContent:Z

.field private allowNavigation:[Ljava/lang/String;

.field private androidScheme:Ljava/lang/String;

.field private appendedUserAgentString:Ljava/lang/String;

.field private backgroundColor:Ljava/lang/String;

.field private captureInput:Z

.field private configJSON:Lorg/json/JSONObject;

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

.field private webContentsDebuggingEnabled:Z

.field private zoomableWebView:Z


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 4
    const-string v1, "localhost"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 5
    const-string v1, "https"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 7
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 8
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 9
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 10
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 11
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    const/16 v2, 0x3c

    .line 12
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    const/16 v2, 0xa

    .line 13
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 14
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 15
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    .line 17
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/AssetManager;Lorg/json/JSONObject;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 20
    const-string v1, "localhost"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 21
    const-string v1, "https"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 23
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 24
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 25
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 26
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 27
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    const/16 v2, 0x3c

    .line 28
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    const/16 v2, 0xa

    .line 29
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 30
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 31
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    .line 33
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    if-eqz p2, :cond_0

    .line 34
    iput-object p2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/getcapacitor/CapConfig;->loadConfigFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 36
    :goto_0
    invoke-direct {p0, v0}, Lcom/getcapacitor/CapConfig;->deserializeConfig(Landroid/content/Context;)V

    return-void
.end method

.method private constructor <init>(Lcom/getcapacitor/CapConfig$Builder;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 39
    const-string v1, "localhost"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 40
    const-string v1, "https"

    iput-object v1, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    const/4 v1, 0x0

    .line 41
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 42
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 43
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 44
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 45
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 46
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    const/16 v2, 0x3c

    .line 47
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    const/16 v2, 0xa

    .line 48
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 49
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 50
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    const/4 v0, 0x0

    .line 51
    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    .line 52
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 53
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->i(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 54
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->q(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->serverUrl:Ljava/lang/String;

    .line 55
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->h(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 56
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->c(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/getcapacitor/CapConfig;->validateScheme(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->c(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    .line 58
    :cond_0
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->b(Lcom/getcapacitor/CapConfig$Builder;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->allowNavigation:[Ljava/lang/String;

    .line 59
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->n(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->overriddenUserAgentString:Ljava/lang/String;

    .line 60
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->d(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->appendedUserAgentString:Ljava/lang/String;

    .line 61
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->e(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->backgroundColor:Ljava/lang/String;

    .line 62
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->a(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 63
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->f(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 64
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->t(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 65
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->k(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 66
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->j(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 67
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->s(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    .line 68
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->m(Lcom/getcapacitor/CapConfig$Builder;)I

    move-result v0

    iput v0, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    .line 69
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->l(Lcom/getcapacitor/CapConfig$Builder;)I

    move-result v0

    iput v0, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 70
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->g(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->errorPath:Ljava/lang/String;

    .line 71
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->u(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 72
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->p(Lcom/getcapacitor/CapConfig$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    .line 73
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->r(Lcom/getcapacitor/CapConfig$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->startPath:Ljava/lang/String;

    .line 74
    invoke-static {p1}, Lcom/getcapacitor/CapConfig$Builder;->o(Lcom/getcapacitor/CapConfig$Builder;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/getcapacitor/CapConfig$Builder;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/CapConfig;-><init>(Lcom/getcapacitor/CapConfig$Builder;)V

    return-void
.end method

.method public static bridge synthetic a(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/getcapacitor/CapConfig;->deserializePluginsConfig(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private deserializeConfig(Landroid/content/Context;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 10
    .line 11
    and-int/lit8 p1, p1, 0x2

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    move p1, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, v0

    .line 18
    :goto_0
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 19
    .line 20
    const-string v3, "server.html5mode"

    .line 21
    .line 22
    iget-boolean v4, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 23
    .line 24
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 29
    .line 30
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 31
    .line 32
    const-string v3, "server.url"

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->serverUrl:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 42
    .line 43
    const-string v3, "server.hostname"

    .line 44
    .line 45
    iget-object v5, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2, v3, v5}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 54
    .line 55
    const-string v3, "server.errorPath"

    .line 56
    .line 57
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->errorPath:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 64
    .line 65
    const-string v3, "server.appStartPath"

    .line 66
    .line 67
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->startPath:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 74
    .line 75
    const-string v3, "server.androidScheme"

    .line 76
    .line 77
    iget-object v5, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v2, v3, v5}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-direct {p0, v2}, Lcom/getcapacitor/CapConfig;->validateScheme(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    .line 90
    .line 91
    :cond_1
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 92
    .line 93
    const-string v3, "server.allowNavigation"

    .line 94
    .line 95
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getArray(Lorg/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->allowNavigation:[Ljava/lang/String;

    .line 100
    .line 101
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 102
    .line 103
    const-string v3, "overrideUserAgent"

    .line 104
    .line 105
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v5, "android.overrideUserAgent"

    .line 110
    .line 111
    invoke-static {v2, v5, v3}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->overriddenUserAgentString:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 118
    .line 119
    const-string v3, "appendUserAgent"

    .line 120
    .line 121
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    const-string v5, "android.appendUserAgent"

    .line 126
    .line 127
    invoke-static {v2, v5, v3}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->appendedUserAgentString:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 134
    .line 135
    const-string v3, "backgroundColor"

    .line 136
    .line 137
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    const-string v4, "android.backgroundColor"

    .line 142
    .line 143
    invoke-static {v2, v4, v3}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iput-object v2, p0, Lcom/getcapacitor/CapConfig;->backgroundColor:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 150
    .line 151
    const-string v3, "allowMixedContent"

    .line 152
    .line 153
    iget-boolean v4, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 154
    .line 155
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    const-string v4, "android.allowMixedContent"

    .line 160
    .line 161
    invoke-static {v2, v4, v3}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 166
    .line 167
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 168
    .line 169
    const-string v3, "android.minWebViewVersion"

    .line 170
    .line 171
    const/16 v4, 0x3c

    .line 172
    .line 173
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getInt(Lorg/json/JSONObject;Ljava/lang/String;I)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    .line 178
    .line 179
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 180
    .line 181
    const-string v3, "android.minHuaweiWebViewVersion"

    .line 182
    .line 183
    const/16 v4, 0xa

    .line 184
    .line 185
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getInt(Lorg/json/JSONObject;Ljava/lang/String;I)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    iput v2, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 190
    .line 191
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 192
    .line 193
    const-string v3, "android.captureInput"

    .line 194
    .line 195
    iget-boolean v4, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 196
    .line 197
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 202
    .line 203
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 204
    .line 205
    const-string v3, "android.useLegacyBridge"

    .line 206
    .line 207
    iget-boolean v4, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    .line 208
    .line 209
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    .line 214
    .line 215
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 216
    .line 217
    const-string v3, "android.webContentsDebuggingEnabled"

    .line 218
    .line 219
    invoke-static {v2, v3, p1}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 224
    .line 225
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 226
    .line 227
    const-string v3, "zoomEnabled"

    .line 228
    .line 229
    invoke-static {v2, v3, v0}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    const-string v4, "android.zoomEnabled"

    .line 234
    .line 235
    invoke-static {v2, v4, v3}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 240
    .line 241
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 242
    .line 243
    const-string v3, "android.resolveServiceWorkerRequests"

    .line 244
    .line 245
    invoke-static {v2, v3, v1}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    iput-boolean v2, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    .line 250
    .line 251
    iget-object v2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 252
    .line 253
    const-string v3, "loggingBehavior"

    .line 254
    .line 255
    const-string v4, "debug"

    .line 256
    .line 257
    invoke-static {v2, v3, v4}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    const-string v4, "android.loggingBehavior"

    .line 262
    .line 263
    invoke-static {v2, v4, v3}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 268
    .line 269
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    const-string v3, "none"

    .line 277
    .line 278
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-nez v3, :cond_3

    .line 283
    .line 284
    const-string v0, "production"

    .line 285
    .line 286
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-nez v0, :cond_2

    .line 291
    .line 292
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_2
    iput-boolean v1, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 296
    .line 297
    goto :goto_1

    .line 298
    :cond_3
    iput-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 299
    .line 300
    :goto_1
    iget-object p1, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 301
    .line 302
    const-string v0, "initialFocus"

    .line 303
    .line 304
    iget-boolean v1, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 305
    .line 306
    invoke-static {p1, v0, v1}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    const-string v1, "android.initialFocus"

    .line 311
    .line 312
    invoke-static {p1, v1, v0}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    iput-boolean p1, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 317
    .line 318
    iget-object p1, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 319
    .line 320
    const-string v0, "plugins"

    .line 321
    .line 322
    invoke-static {p1, v0}, Lcom/getcapacitor/util/JSONUtils;->getObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-static {p1}, Lcom/getcapacitor/CapConfig;->deserializePluginsConfig(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    iput-object p1, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    .line 331
    .line 332
    return-void
.end method

.method private static deserializePluginsConfig(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/getcapacitor/PluginConfig;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, Lcom/getcapacitor/PluginConfig;

    .line 30
    .line 31
    invoke-direct {v4, v3}, Lcom/getcapacitor/PluginConfig;-><init>(Lorg/json/JSONObject;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    return-object v0
.end method

.method private loadConfigFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string p2, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x2f

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const-string v0, "/"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, "capacitor.config.json"

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p1, p2}, Lcom/getcapacitor/FileUtils;->readFileFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    return-void

    .line 55
    :catch_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :catch_1
    move-exception p1

    .line 58
    goto :goto_2

    .line 59
    :goto_1
    const-string p2, "Unable to parse capacitor.config.json. Make sure it\'s valid json"

    .line 60
    .line 61
    invoke-static {p2, p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :goto_2
    const-string p2, "Unable to load capacitor.config.json. Run npx cap copy first"

    .line 66
    .line 67
    invoke-static {p2, p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :goto_3
    return-void
.end method

.method private loadConfigFromFile(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x2f

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const-string v0, "/"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, "capacitor.config.json"

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/getcapacitor/FileUtils;->readFileFromDisk(Ljava/io/File;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lorg/json/JSONObject;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception p1

    .line 61
    goto :goto_1

    .line 62
    :catch_1
    move-exception p1

    .line 63
    goto :goto_2

    .line 64
    :goto_1
    const-string v0, "Unable to load capacitor.config.json."

    .line 65
    .line 66
    invoke-static {v0, p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    const-string v0, "Unable to parse capacitor.config.json. Make sure it\'s valid json"

    .line 71
    .line 72
    invoke-static {v0, p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    return-void
.end method

.method public static loadDefault(Landroid/content/Context;)Lcom/getcapacitor/CapConfig;
    .locals 3

    .line 1
    new-instance v0, Lcom/getcapacitor/CapConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/CapConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "Capacitor Config could not be created from file. Context must not be null."

    .line 9
    .line 10
    invoke-static {p0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, v1, v2}, Lcom/getcapacitor/CapConfig;->loadConfigFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/getcapacitor/CapConfig;->deserializeConfig(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static loadFromAssets(Landroid/content/Context;Ljava/lang/String;)Lcom/getcapacitor/CapConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/getcapacitor/CapConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/CapConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "Capacitor Config could not be created from file. Context must not be null."

    .line 9
    .line 10
    invoke-static {p0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1, p1}, Lcom/getcapacitor/CapConfig;->loadConfigFromAssets(Landroid/content/res/AssetManager;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/getcapacitor/CapConfig;->deserializeConfig(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static loadFromFile(Landroid/content/Context;Ljava/lang/String;)Lcom/getcapacitor/CapConfig;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/CapConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/CapConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    const-string p0, "Capacitor Config could not be created from file. Context must not be null."

    .line 9
    .line 10
    invoke-static {p0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-direct {v0, p1}, Lcom/getcapacitor/CapConfig;->loadConfigFromFile(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/getcapacitor/CapConfig;->deserializeConfig(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private validateScheme(Ljava/lang/String;)Z
    .locals 8

    .line 1
    const-string v6, "blob"

    .line 2
    .line 3
    const-string v7, "data"

    .line 4
    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    const-string v1, "ftp"

    .line 8
    .line 9
    const-string v2, "ftps"

    .line 10
    .line 11
    const-string v3, "ws"

    .line 12
    .line 13
    const-string v4, "wss"

    .line 14
    .line 15
    const-string v5, "about"

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, " is not an allowed scheme.  Defaulting to https."

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lcom/getcapacitor/Logger;->warn(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    :cond_0
    const-string v0, "http"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    const-string v0, "https"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v1, "Using a non-standard scheme: "

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p1, " for Android. This is known to cause issues as of Android Webview 117."

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lcom/getcapacitor/Logger;->warn(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    const/4 p1, 0x1

    .line 92
    return p1
.end method


# virtual methods
.method public getAllowNavigation()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->allowNavigation:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAndroidScheme()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->androidScheme:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAppendedUserAgentString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->appendedUserAgentString:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getArray(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/getcapacitor/util/JSONUtils;->getArray(Lorg/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getArray(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    invoke-static {v0, p1, p2}, Lcom/getcapacitor/util/JSONUtils;->getArray(Lorg/json/JSONObject;Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getBackgroundColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->backgroundColor:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/getcapacitor/util/JSONUtils;->getBoolean(Lorg/json/JSONObject;Ljava/lang/String;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getErrorPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->errorPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHostname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->hostname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getInt(Ljava/lang/String;I)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/getcapacitor/util/JSONUtils;->getInt(Lorg/json/JSONObject;Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getMinHuaweiWebViewVersion()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/getcapacitor/CapConfig;->minHuaweiWebViewVersion:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const-string v0, "Specified minimum Huawei webview version is too low, defaulting to 10"

    .line 8
    .line 9
    invoke-static {v0}, Lcom/getcapacitor/Logger;->warn(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    return v0
.end method

.method public getMinWebViewVersion()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/getcapacitor/CapConfig;->minWebViewVersion:I

    .line 2
    .line 3
    const/16 v1, 0x37

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const-string v0, "Specified minimum webview version is too low, defaulting to 55"

    .line 8
    .line 9
    invoke-static {v0}, Lcom/getcapacitor/Logger;->warn(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    return v0
.end method

.method public getObject(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p1

    .line 8
    :catch_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public getOverriddenUserAgentString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->overriddenUserAgentString:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPluginConfiguration(Ljava/lang/String;)Lcom/getcapacitor/PluginConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->pluginsConfiguration:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/getcapacitor/PluginConfig;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lcom/getcapacitor/PluginConfig;

    .line 12
    .line 13
    new-instance v0, Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcom/getcapacitor/PluginConfig;-><init>(Lorg/json/JSONObject;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object p1
.end method

.method public getServerUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->serverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStartPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->startPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/getcapacitor/CapConfig;->configJSON:Lorg/json/JSONObject;

    invoke-static {v0, p1, p2}, Lcom/getcapacitor/util/JSONUtils;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isHTML5Mode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->html5mode:Z

    .line 2
    .line 3
    return v0
.end method

.method public isInitialFocus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->initialFocus:Z

    .line 2
    .line 3
    return v0
.end method

.method public isInputCaptured()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->captureInput:Z

    .line 2
    .line 3
    return v0
.end method

.method public isLoggingEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->loggingEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public isMixedContentAllowed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->allowMixedContent:Z

    .line 2
    .line 3
    return v0
.end method

.method public isResolveServiceWorkerRequests()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->resolveServiceWorkerRequests:Z

    .line 2
    .line 3
    return v0
.end method

.method public isUsingLegacyBridge()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->useLegacyBridge:Z

    .line 2
    .line 3
    return v0
.end method

.method public isWebContentsDebuggingEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->webContentsDebuggingEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public isZoomableWebView()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/getcapacitor/CapConfig;->zoomableWebView:Z

    .line 2
    .line 3
    return v0
.end method
