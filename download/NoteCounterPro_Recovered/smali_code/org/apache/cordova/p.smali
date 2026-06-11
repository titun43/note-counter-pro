.class public abstract Lorg/apache/cordova/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lorg/apache/cordova/r;

.field public b:Ljava/lang/String;

.field public cordova:Lorg/apache/cordova/n;

.field public webView:Lorg/apache/cordova/u;


# virtual methods
.method public execute(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/e;)Z
    .locals 1

    .line 2
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1, v0, p3}, Lorg/apache/cordova/p;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/e;)Z

    move-result p1

    return p1
.end method

.method public execute(Ljava/lang/String;Lorg/apache/cordova/h;Lorg/apache/cordova/e;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/e;)Z
    .locals 0

    .line 4
    new-instance p2, Lorg/apache/cordova/h;

    .line 5
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/cordova/p;->execute(Ljava/lang/String;Lorg/apache/cordova/h;Lorg/apache/cordova/e;)Z

    move-result p1

    return p1
.end method

.method public getPathHandler()Lorg/apache/cordova/q;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/p;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public handleOpenForRead(Landroid/net/Uri;)Lorg/apache/cordova/s;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Plugin can\'t handle uri: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public hasPermisssion()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initialize(Lorg/apache/cordova/n;Lorg/apache/cordova/u;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method public onOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onPause(Z)V
    .locals 0

    return-void
.end method

.method public onReceivedClientCertRequest(Lorg/apache/cordova/u;Lorg/apache/cordova/b0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onReceivedHttpAuthRequest(Lorg/apache/cordova/u;Lorg/apache/cordova/d0;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onRequestPermissionResult(I[Ljava/lang/String;[I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method public onReset()V
    .locals 0

    return-void
.end method

.method public onRestoreStateForActivityResult(Landroid/os/Bundle;Lorg/apache/cordova/e;)V
    .locals 0

    return-void
.end method

.method public onResume(Z)V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    return-void
.end method

.method public pluginInitialize()V
    .locals 0

    return-void
.end method

.method public final privateInitialize(Ljava/lang/String;Lorg/apache/cordova/n;Lorg/apache/cordova/u;Lorg/apache/cordova/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/cordova/p;->b:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/apache/cordova/p;->cordova:Lorg/apache/cordova/n;

    .line 4
    .line 5
    iput-object p3, p0, Lorg/apache/cordova/p;->webView:Lorg/apache/cordova/u;

    .line 6
    .line 7
    iput-object p4, p0, Lorg/apache/cordova/p;->a:Lorg/apache/cordova/r;

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3}, Lorg/apache/cordova/p;->initialize(Lorg/apache/cordova/n;Lorg/apache/cordova/u;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/apache/cordova/p;->pluginInitialize()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public remapUri(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public requestPermissions(I)V
    .locals 0

    return-void
.end method

.method public shouldAllowBridgeAccess(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/cordova/p;->shouldAllowNavigation(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public shouldAllowNavigation(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public shouldAllowRequest(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public shouldOpenExternalUrl(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
