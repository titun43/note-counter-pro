.class public final Ln/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln/g;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln/d;->g:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln/d;->l:Ljava/lang/Object;

    iput p2, p0, Ln/d;->h:I

    iput-object p3, p0, Ln/d;->j:Ljava/lang/Object;

    iput-boolean p4, p0, Ln/d;->i:Z

    iput-object p5, p0, Ln/d;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/CordovaWebViewImpl;ILn/e;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ln/d;->g:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln/d;->l:Ljava/lang/Object;

    iput p2, p0, Ln/d;->h:I

    iput-object p3, p0, Ln/d;->j:Ljava/lang/Object;

    iput-object p4, p0, Ln/d;->k:Ljava/lang/Object;

    iput-boolean p5, p0, Ln/d;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ln/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln/d;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lorg/apache/cordova/CordovaWebViewImpl;

    .line 9
    .line 10
    iget v1, p0, Ln/d;->h:I

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 15
    .line 16
    invoke-interface {v1}, Lorg/apache/cordova/n;->getThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Ln/d;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ln/e;

    .line 23
    .line 24
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->b:Lorg/apache/cordova/w;

    .line 28
    .line 29
    iget-object v1, p0, Ln/d;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v2, p0, Ln/d;->i:Z

    .line 34
    .line 35
    invoke-interface {v0, v1, v2}, Lorg/apache/cordova/w;->loadUrl(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    iget-object v0, p0, Ln/d;->l:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ln/g;

    .line 42
    .line 43
    iget-object v0, v0, Ln/g;->h:Ln/a;

    .line 44
    .line 45
    iget-object v1, p0, Ln/d;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroid/net/Uri;

    .line 48
    .line 49
    iget-object v2, p0, Ln/d;->k:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroid/os/Bundle;

    .line 52
    .line 53
    iget v3, p0, Ln/d;->h:I

    .line 54
    .line 55
    iget-boolean v4, p0, Ln/d;->i:Z

    .line 56
    .line 57
    invoke-virtual {v0, v3, v1, v4, v2}, Ln/a;->onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
