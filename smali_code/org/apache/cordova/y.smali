.class public final Lorg/apache/cordova/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/cordova/y;->g:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/y;->g:Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl$EngineClient;->a:Lorg/apache/cordova/CordovaWebViewImpl;

    .line 4
    .line 5
    const-wide/16 v1, 0x7d0

    .line 6
    .line 7
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 11
    .line 12
    invoke-interface {v1}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 19
    .line 20
    invoke-interface {v0}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lorg/apache/cordova/x;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lorg/apache/cordova/x;-><init>(Lorg/apache/cordova/y;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    :catch_0
    :cond_0
    return-void
.end method
