.class public Lorg/apache/cordova/SplashScreenPlugin;
.super Lorg/apache/cordova/p;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/e;)Z
    .locals 0

    .line 1
    const-string p2, "hide"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lorg/apache/cordova/SplashScreenPlugin;->c:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Lorg/apache/cordova/e;->success()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "setupSplashScreen"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/lang/ClassCastException;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public final pluginInitialize()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/p;->a:Lorg/apache/cordova/r;

    .line 2
    .line 3
    const-string v1, "AutoHideSplashScreen"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/r;->a(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-boolean v0, p0, Lorg/apache/cordova/SplashScreenPlugin;->c:Z

    .line 11
    .line 12
    iget-object v0, p0, Lorg/apache/cordova/p;->a:Lorg/apache/cordova/r;

    .line 13
    .line 14
    const-string v1, "SplashScreenDelay"

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    invoke-virtual {v0, v3, v1}, Lorg/apache/cordova/r;->b(ILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lorg/apache/cordova/p;->a:Lorg/apache/cordova/r;

    .line 21
    .line 22
    const-string v1, "FadeSplashScreen"

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/r;->a(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/apache/cordova/p;->a:Lorg/apache/cordova/r;

    .line 28
    .line 29
    const-string v1, "FadeSplashScreenDuration"

    .line 30
    .line 31
    const/16 v2, 0x1f4

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Lorg/apache/cordova/r;->b(ILjava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void
.end method
