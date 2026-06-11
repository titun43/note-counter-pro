.class public Lcom/getcapacitor/Bridge$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/Bridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private activity:Lg/k;

.field private config:Lcom/getcapacitor/CapConfig;

.field private fragment:Landroidx/fragment/app/z;

.field private instanceState:Landroid/os/Bundle;

.field private pluginInstances:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/getcapacitor/Plugin;",
            ">;"
        }
    .end annotation
.end field

.field private plugins:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;>;"
        }
    .end annotation
.end field

.field private routeProcessor:Lcom/getcapacitor/RouteProcessor;

.field private serverPath:Lcom/getcapacitor/ServerPath;

.field private final webViewListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/getcapacitor/WebViewListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/z;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->instanceState:Landroid/os/Bundle;

    .line 10
    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->config:Lcom/getcapacitor/CapConfig;

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->plugins:Ljava/util/List;

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->pluginInstances:Ljava/util/List;

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->webViewListeners:Ljava/util/List;

    .line 14
    iget-object v1, p1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    if-nez v1, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/d0;->m:Lg/k;

    .line 16
    :goto_0
    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 17
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->fragment:Landroidx/fragment/app/z;

    return-void
.end method

.method public constructor <init>(Lg/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->instanceState:Landroid/os/Bundle;

    .line 3
    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->config:Lcom/getcapacitor/CapConfig;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->plugins:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->pluginInstances:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->webViewListeners:Ljava/util/List;

    .line 7
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    return-void
.end method


# virtual methods
.method public addPlugin(Ljava/lang/Class;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;)",
            "Lcom/getcapacitor/Bridge$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->plugins:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public addPluginInstance(Lcom/getcapacitor/Plugin;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->pluginInstances:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public addPluginInstances(Ljava/util/List;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/getcapacitor/Plugin;",
            ">;)",
            "Lcom/getcapacitor/Bridge$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->pluginInstances:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public addPlugins(Ljava/util/List;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;>;)",
            "Lcom/getcapacitor/Bridge$Builder;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/getcapacitor/Bridge$Builder;->addPlugin(Ljava/lang/Class;)Lcom/getcapacitor/Bridge$Builder;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p0
.end method

.method public addWebViewListener(Lcom/getcapacitor/WebViewListener;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->webViewListeners:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public addWebViewListeners(Ljava/util/List;)Lcom/getcapacitor/Bridge$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/getcapacitor/WebViewListener;",
            ">;)",
            "Lcom/getcapacitor/Bridge$Builder;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/getcapacitor/WebViewListener;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/getcapacitor/Bridge$Builder;->addWebViewListener(Lcom/getcapacitor/WebViewListener;)Lcom/getcapacitor/Bridge$Builder;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p0
.end method

.method public create()Lcom/getcapacitor/Bridge;
    .locals 14

    .line 1
    new-instance v0, Lorg/apache/cordova/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/apache/cordova/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lorg/apache/cordova/g;->c(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    iget-object v11, v0, Lorg/apache/cordova/g;->b:Lorg/apache/cordova/r;

    .line 25
    .line 26
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v9, Lcom/getcapacitor/cordova/MockCordovaInterfaceImpl;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 32
    .line 33
    invoke-direct {v9, v1}, Lcom/getcapacitor/cordova/MockCordovaInterfaceImpl;-><init>(Lg/k;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->instanceState:Landroid/os/Bundle;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v9, v1}, Lorg/apache/cordova/CordovaInterfaceImpl;->restoreInstanceState(Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->fragment:Landroidx/fragment/app/z;

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 48
    .line 49
    sget v2, Lcom/getcapacitor/android/R$id;->webview:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lg/k;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v6, v1

    .line 56
    check-cast v6, Landroid/webkit/WebView;

    .line 57
    .line 58
    new-instance v1, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v1, v2}, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, Lorg/apache/cordova/g;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v1, v9, v0, v11, v6}, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;->init(Lorg/apache/cordova/n;Ljava/util/List;Lorg/apache/cordova/r;Landroid/webkit/WebView;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl;->getPluginManager()Lorg/apache/cordova/k0;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    invoke-virtual {v9, v10}, Lorg/apache/cordova/CordovaInterfaceImpl;->onCordovaInit(Lorg/apache/cordova/k0;)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Lcom/getcapacitor/Bridge;

    .line 82
    .line 83
    iget-object v3, p0, Lcom/getcapacitor/Bridge$Builder;->activity:Lg/k;

    .line 84
    .line 85
    iget-object v4, p0, Lcom/getcapacitor/Bridge$Builder;->serverPath:Lcom/getcapacitor/ServerPath;

    .line 86
    .line 87
    iget-object v5, p0, Lcom/getcapacitor/Bridge$Builder;->fragment:Landroidx/fragment/app/z;

    .line 88
    .line 89
    iget-object v7, p0, Lcom/getcapacitor/Bridge$Builder;->plugins:Ljava/util/List;

    .line 90
    .line 91
    iget-object v8, p0, Lcom/getcapacitor/Bridge$Builder;->pluginInstances:Ljava/util/List;

    .line 92
    .line 93
    iget-object v12, p0, Lcom/getcapacitor/Bridge$Builder;->config:Lcom/getcapacitor/CapConfig;

    .line 94
    .line 95
    const/4 v13, 0x0

    .line 96
    invoke-direct/range {v2 .. v13}, Lcom/getcapacitor/Bridge;-><init>(Lg/k;Lcom/getcapacitor/ServerPath;Landroidx/fragment/app/z;Landroid/webkit/WebView;Ljava/util/List;Ljava/util/List;Lcom/getcapacitor/cordova/MockCordovaInterfaceImpl;Lorg/apache/cordova/k0;Lorg/apache/cordova/r;Lcom/getcapacitor/CapConfig;I)V

    .line 97
    .line 98
    .line 99
    instance-of v0, v6, Lcom/getcapacitor/CapacitorWebView;

    .line 100
    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    check-cast v6, Lcom/getcapacitor/CapacitorWebView;

    .line 104
    .line 105
    invoke-virtual {v6, v2}, Lcom/getcapacitor/CapacitorWebView;->setBridge(Lcom/getcapacitor/Bridge;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    invoke-virtual {v2, v1}, Lcom/getcapacitor/Bridge;->setCordovaWebView(Lorg/apache/cordova/u;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->webViewListeners:Ljava/util/List;

    .line 112
    .line 113
    invoke-virtual {v2, v0}, Lcom/getcapacitor/Bridge;->setWebViewListeners(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->routeProcessor:Lcom/getcapacitor/RouteProcessor;

    .line 117
    .line 118
    invoke-virtual {v2, v0}, Lcom/getcapacitor/Bridge;->setRouteProcessor(Lcom/getcapacitor/RouteProcessor;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/getcapacitor/Bridge$Builder;->instanceState:Landroid/os/Bundle;

    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    invoke-virtual {v2, v0}, Lcom/getcapacitor/Bridge;->restoreInstanceState(Landroid/os/Bundle;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    return-object v2

    .line 129
    :cond_3
    const/4 v0, 0x0

    .line 130
    throw v0
.end method

.method public setConfig(Lcom/getcapacitor/CapConfig;)Lcom/getcapacitor/Bridge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->config:Lcom/getcapacitor/CapConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public setInstanceState(Landroid/os/Bundle;)Lcom/getcapacitor/Bridge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->instanceState:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method

.method public setPlugins(Ljava/util/List;)Lcom/getcapacitor/Bridge$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Lcom/getcapacitor/Plugin;",
            ">;>;)",
            "Lcom/getcapacitor/Bridge$Builder;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->plugins:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public setRouteProcessor(Lcom/getcapacitor/RouteProcessor;)Lcom/getcapacitor/Bridge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->routeProcessor:Lcom/getcapacitor/RouteProcessor;

    .line 2
    .line 3
    return-object p0
.end method

.method public setServerPath(Lcom/getcapacitor/ServerPath;)Lcom/getcapacitor/Bridge$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/Bridge$Builder;->serverPath:Lcom/getcapacitor/ServerPath;

    .line 2
    .line 3
    return-object p0
.end method
