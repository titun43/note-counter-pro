.class public final Lx4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/apache/cordova/i;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx4/a;->a:Lorg/apache/cordova/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public exec(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lx4/a;->a:Lorg/apache/cordova/i;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Lorg/apache/cordova/i;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public retrieveJsMessages(IZ)Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lx4/a;->a:Lorg/apache/cordova/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/cordova/i;->b(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p1, v0, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lorg/apache/cordova/h0;->d(Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public setNativeToJsBridgeMode(II)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lx4/a;->a:Lorg/apache/cordova/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/cordova/i;->b(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, v0, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lorg/apache/cordova/h0;->f(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
