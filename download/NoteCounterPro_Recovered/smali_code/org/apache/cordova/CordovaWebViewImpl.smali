.class public Lorg/apache/cordova/CordovaWebViewImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/cordova/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "CordovaWebViewImpl"


# instance fields
.field public a:Lorg/apache/cordova/k0;

.field public final b:Lorg/apache/cordova/w;

.field public c:Lorg/apache/cordova/n;

.field public d:I

.field public e:Lorg/apache/cordova/t;

.field public f:Lorg/apache/cordova/r;

.field public g:Lorg/apache/cordova/CoreAndroid;

.field public h:Lorg/apache/cordova/h0;

.field public final i:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

.field public j:Z

.field public k:Ljava/lang/String;

.field public l:Lorg/apache/cordova/z;

.field public m:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field public final n:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 6
    .line 7
    new-instance v0, Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;-><init>(Lorg/apache/cordova/CordovaWebViewImpl;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->i:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

    .line 13
    .line 14
    new-instance v0, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->n:Ljava/util/HashSet;

    .line 20
    .line 21
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 22
    .line 23
    return-void
.end method

.method public static createEngine(Landroid/content/Context;Lorg/apache/cordova/r;)Lorg/apache/cordova/w;
    .locals 3

    .line 1
    const-class v0, Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "webview"

    .line 8
    .line 9
    invoke-virtual {p1, v1, v0}, Lorg/apache/cordova/r;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-class v1, Landroid/content/Context;

    .line 18
    .line 19
    const-class v2, Lorg/apache/cordova/r;

    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lorg/apache/cordova/w;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :catch_0
    move-exception p0

    .line 41
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string v0, "Failed to create webview. "

    .line 44
    .line 45
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->g:Lorg/apache/cordova/CoreAndroid;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 6
    .line 7
    const-string v1, "CoreAndroid"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/apache/cordova/k0;->c(Ljava/lang/String;)Lorg/apache/cordova/p;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lorg/apache/cordova/CoreAndroid;

    .line 14
    .line 15
    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->g:Lorg/apache/cordova/CoreAndroid;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->g:Lorg/apache/cordova/CoreAndroid;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Lorg/apache/cordova/CoreAndroid;->fireJavascriptEvent(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public backHistory()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->goBack()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public canGoBack()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->canGoBack()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public clearCache()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    invoke-interface {v0}, Lorg/apache/cordova/w;->clearCache()V

    return-void
.end method

.method public clearCache(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    invoke-interface {p1}, Lorg/apache/cordova/w;->clearCache()V

    return-void
.end method

.method public clearHistory()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->clearHistory()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getCookieManager()Lorg/apache/cordova/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->getCookieManager()Lorg/apache/cordova/c0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getEngine()Lorg/apache/cordova/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPluginManager()Lorg/apache/cordova/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreferences()Lorg/apache/cordova/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->f:Lorg/apache/cordova/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public getResourceApi()Lorg/apache/cordova/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->e:Lorg/apache/cordova/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public handleDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lorg/apache/cordova/k0;->e()V

    .line 17
    .line 18
    .line 19
    const-string v0, "about:blank"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/apache/cordova/CordovaWebViewImpl;->loadUrl(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 25
    .line 26
    invoke-interface {v0}, Lorg/apache/cordova/w;->destroy()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->hideCustomView()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public handlePause(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->j:Z

    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lorg/apache/cordova/k0;->g(Z)V

    .line 14
    .line 15
    .line 16
    const-string v1, "pause"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/apache/cordova/CordovaWebViewImpl;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lorg/apache/cordova/w;->setPaused(Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method public handleResume(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Lorg/apache/cordova/w;->setPaused(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/apache/cordova/k0;->h(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->j:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-string p1, "resume"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaWebViewImpl;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
.end method

.method public handleStart()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/apache/cordova/k0;->i()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public handleStop()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->isInitialized()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/apache/cordova/k0;->j()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public hideCustomView()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 12
    .line 13
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 30
    .line 31
    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->m:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 32
    .line 33
    invoke-interface {v1}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public init(Lorg/apache/cordova/n;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lorg/apache/cordova/r;

    invoke-direct {v1}, Lorg/apache/cordova/r;-><init>()V

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/cordova/CordovaWebViewImpl;->init(Lorg/apache/cordova/n;Ljava/util/List;Lorg/apache/cordova/r;)V

    return-void
.end method

.method public init(Lorg/apache/cordova/n;Ljava/util/List;Lorg/apache/cordova/r;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/cordova/n;",
            "Ljava/util/List<",
            "Lorg/apache/cordova/i0;",
            ">;",
            "Lorg/apache/cordova/r;",
            ")V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    if-nez v0, :cond_1

    .line 3
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 4
    iput-object p3, p0, Lorg/apache/cordova/CordovaWebViewImpl;->f:Lorg/apache/cordova/r;

    .line 5
    new-instance v0, Lorg/apache/cordova/k0;

    iget-object v1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    invoke-direct {v0, p0, v1, p2}, Lorg/apache/cordova/k0;-><init>(Lorg/apache/cordova/u;Lorg/apache/cordova/n;Ljava/util/List;)V

    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 6
    new-instance p2, Lorg/apache/cordova/t;

    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    invoke-direct {p2, v1, v2}, Lorg/apache/cordova/t;-><init>(Landroid/content/Context;Lorg/apache/cordova/k0;)V

    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->e:Lorg/apache/cordova/t;

    .line 7
    new-instance p2, Lorg/apache/cordova/h0;

    invoke-direct {p2}, Lorg/apache/cordova/h0;-><init>()V

    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->h:Lorg/apache/cordova/h0;

    .line 8
    new-instance v1, Lorg/apache/cordova/NativeToJsMessageQueue$NoOpBridgeMode;

    invoke-direct {v1}, Lorg/apache/cordova/NativeToJsMessageQueue$NoOpBridgeMode;-><init>()V

    .line 9
    iget-object p2, p2, Lorg/apache/cordova/h0;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->h:Lorg/apache/cordova/h0;

    new-instance v1, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;

    invoke-direct {v1, v0, p1}, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;-><init>(Lorg/apache/cordova/w;Lorg/apache/cordova/n;)V

    .line 11
    iget-object p2, p2, Lorg/apache/cordova/h0;->c:Ljava/util/ArrayList;

    .line 12
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    const-string p2, "DisallowOverscroll"

    const/4 v1, 0x0

    invoke-virtual {p3, p2, v1}, Lorg/apache/cordova/r;->a(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 14
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p2, p3}, Landroid/view/View;->setOverScrollMode(I)V

    .line 15
    :cond_0
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebViewImpl;->e:Lorg/apache/cordova/t;

    iget-object v5, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    iget-object v6, p0, Lorg/apache/cordova/CordovaWebViewImpl;->h:Lorg/apache/cordova/h0;

    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    iget-object v3, p0, Lorg/apache/cordova/CordovaWebViewImpl;->i:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

    move-object v1, p0

    move-object v2, p1

    invoke-interface/range {v0 .. v6}, Lorg/apache/cordova/w;->init(Lorg/apache/cordova/u;Lorg/apache/cordova/n;Lorg/apache/cordova/v;Lorg/apache/cordova/t;Lorg/apache/cordova/k0;Lorg/apache/cordova/h0;)V

    .line 16
    iget-object p1, v1, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    new-instance p2, Lorg/apache/cordova/i0;

    const-string p3, "CoreAndroid"

    const-string v0, "org.apache.cordova.CoreAndroid"

    const/4 v2, 0x1

    invoke-direct {p2, p3, v0, v2}, Lorg/apache/cordova/i0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    iget-object p1, p1, Lorg/apache/cordova/k0;->b:Ljava/util/Map;

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object p1, v1, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    invoke-virtual {p1}, Lorg/apache/cordova/k0;->d()V

    return-void

    :cond_1
    move-object v1, p0

    .line 20
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public isButtonPlumbedToJs(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public isCustomViewShowing()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public isInitialized()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lorg/apache/cordova/CordovaWebViewImpl;->loadUrlIntoView(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public loadUrlIntoView(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    const-string v0, "about:blank"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "javascript:"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object v3, p0

    .line 19
    move-object v6, p1

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    if-nez p2, :cond_3

    .line 22
    .line 23
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->k:Ljava/lang/String;

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    move v7, v1

    .line 29
    goto :goto_2

    .line 30
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :goto_2
    if-eqz v7, :cond_5

    .line 33
    .line 34
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->k:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->g:Lorg/apache/cordova/CoreAndroid;

    .line 40
    .line 41
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 42
    .line 43
    invoke-virtual {p2}, Lorg/apache/cordova/k0;->d()V

    .line 44
    .line 45
    .line 46
    :cond_4
    iput-object p1, p0, Lorg/apache/cordova/CordovaWebViewImpl;->k:Ljava/lang/String;

    .line 47
    .line 48
    :cond_5
    iget v3, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 49
    .line 50
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->f:Lorg/apache/cordova/r;

    .line 51
    .line 52
    const-string v0, "LoadUrlTimeoutValue"

    .line 53
    .line 54
    const/16 v1, 0x4e20

    .line 55
    .line 56
    invoke-virtual {p2, v1, v0}, Lorg/apache/cordova/r;->b(ILjava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    new-instance v4, Lc0/a;

    .line 61
    .line 62
    const/16 p2, 0xc

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {v4, p0, p1, p2, v0}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ln/e;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    move-object v1, p0

    .line 72
    invoke-direct/range {v0 .. v5}, Ln/e;-><init>(Ljava/lang/Object;IILjava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    iget-object p2, v1, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 76
    .line 77
    invoke-interface {p2}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    iget-object p2, v1, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 84
    .line 85
    invoke-interface {p2}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    move v4, v2

    .line 90
    new-instance v2, Ln/d;

    .line 91
    .line 92
    move-object v6, p1

    .line 93
    move-object v5, v0

    .line 94
    move-object v3, v1

    .line 95
    invoke-direct/range {v2 .. v7}, Ln/d;-><init>(Lorg/apache/cordova/CordovaWebViewImpl;ILn/e;Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    move-object v3, v1

    .line 103
    return-void

    .line 104
    :goto_3
    iget-object p1, v3, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 105
    .line 106
    invoke-interface {p1, v6, v1}, Lorg/apache/cordova/w;->loadUrl(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/apache/cordova/k0;->f(Landroid/content/Intent;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public postMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/k0;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public sendJavascript(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->h:Lorg/apache/cordova/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/apache/cordova/f0;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lorg/apache/cordova/f0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lorg/apache/cordova/h0;->b(Lorg/apache/cordova/f0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public sendPluginResult(Lorg/apache/cordova/l0;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->h:Lorg/apache/cordova/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/apache/cordova/h0;->a(Lorg/apache/cordova/l0;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setButtonPlumbedToJs(IZ)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/16 v0, 0x52

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x18

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x19

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "Unsupported keycode: "

    .line 20
    .line 21
    invoke-static {p1, v0}, Landroidx/emoji2/text/u;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p2

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->n:Ljava/util/HashSet;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public showCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Lorg/apache/cordova/z;

    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaWebViewImpl;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/z;-><init>(Landroid/content/Context;Lorg/apache/cordova/w;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->l:Lorg/apache/cordova/z;

    .line 24
    .line 25
    iput-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->m:Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 26
    .line 27
    invoke-interface {v2}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/view/ViewGroup;

    .line 36
    .line 37
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 38
    .line 39
    const/16 v1, 0x11

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    invoke-direct {p2, v3, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/16 v0, 0x8

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public showWebPage(Ljava/lang/String;ZZLjava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "CordovaWebViewImpl"

    .line 2
    .line 3
    const-string v1, "intent://"

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 8
    .line 9
    invoke-interface {v2}, Lorg/apache/cordova/w;->clearHistory()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lorg/apache/cordova/k0;->l(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_6

    .line 22
    .line 23
    invoke-virtual {p0, p1, v2}, Lorg/apache/cordova/CordovaWebViewImpl;->loadUrlIntoView(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v3, p0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 28
    .line 29
    invoke-virtual {v3, p1}, Lorg/apache/cordova/k0;->n(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-static {p1, v2}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :goto_0
    move-object v3, v2

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v2

    .line 55
    goto :goto_2

    .line 56
    :catch_1
    move-exception p2

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    new-instance v2, Landroid/content/Intent;

    .line 59
    .line 60
    const-string v4, "android.intent.action.VIEW"

    .line 61
    .line 62
    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    :try_start_1
    const-string v3, "android.intent.category.BROWSABLE"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v4, "file"

    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    iget-object v4, p0, Lorg/apache/cordova/CordovaWebViewImpl;->e:Lorg/apache/cordova/t;

    .line 87
    .line 88
    invoke-virtual {v4, v3}, Lorg/apache/cordova/t;->a(Landroid/net/Uri;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catch_2
    move-exception v3

    .line 97
    move-object v6, v3

    .line 98
    move-object v3, v2

    .line 99
    move-object v2, v6

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :goto_1
    :try_start_2
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 106
    .line 107
    invoke-interface {v2}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    iget-object v2, p0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 114
    .line 115
    invoke-interface {v2}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/net/URISyntaxException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_2
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    const-string v1, "browser_fallback_url"

    .line 132
    .line 133
    invoke-virtual {v3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    if-eqz v4, :cond_5

    .line 138
    .line 139
    invoke-virtual {v3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/cordova/CordovaWebViewImpl;->showWebPage(Ljava/lang/String;ZZLjava/util/Map;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    const-string p2, "Error loading url "

    .line 148
    .line 149
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v0, p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :goto_3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string p4, "Error parsing url "

    .line 160
    .line 161
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 172
    .line 173
    .line 174
    :cond_6
    :goto_4
    return-void
.end method

.method public stopLoading()V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 6
    .line 7
    return-void
.end method
