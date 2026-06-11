.class public Lorg/apache/cordova/engine/SystemWebView;
.super Landroid/webkit/WebView;
.source "SourceFile"


# instance fields
.field public g:Lx4/f;

.field public h:Lx4/c;

.field public i:Lorg/apache/cordova/engine/SystemWebViewEngine;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/engine/SystemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebView;->i:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/apache/cordova/engine/SystemWebViewEngine;->e:Lorg/apache/cordova/v;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/apache/cordova/v;->onDispatchKeyEvent(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public getCordovaWebView()Lorg/apache/cordova/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebView;->i:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getCordovaWebView()Lorg/apache/cordova/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lx4/c;

    .line 3
    .line 4
    iput-object v0, p0, Lorg/apache/cordova/engine/SystemWebView;->h:Lx4/c;

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lx4/f;

    .line 3
    .line 4
    iput-object v0, p0, Lorg/apache/cordova/engine/SystemWebView;->g:Lx4/f;

    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
