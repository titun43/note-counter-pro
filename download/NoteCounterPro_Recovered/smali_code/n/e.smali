.class public final Ln/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ln/e;->g:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln/e;->k:Ljava/lang/Object;

    iput p2, p0, Ln/e;->h:I

    iput-object p3, p0, Ln/e;->j:Ljava/lang/Object;

    iput p4, p0, Ln/e;->i:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Ln/e;->g:I

    iput-object p1, p0, Ln/e;->k:Ljava/lang/Object;

    iput p2, p0, Ln/e;->h:I

    iput p3, p0, Ln/e;->i:I

    iput-object p4, p0, Ln/e;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ln/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln/e;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Notification;

    .line 9
    .line 10
    iget v1, p0, Ln/e;->h:I

    .line 11
    .line 12
    iget-object v2, p0, Ln/e;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 15
    .line 16
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v4, 0x1d

    .line 19
    .line 20
    if-lt v3, v4, :cond_0

    .line 21
    .line 22
    iget v3, p0, Ln/e;->i:I

    .line 23
    .line 24
    invoke-static {v2, v1, v0, v3}, Lf0/h1;->p(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :pswitch_0
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :try_start_1
    iget v0, p0, Ln/e;->h:I

    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    :goto_1
    iget-object v0, p0, Ln/e;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lorg/apache/cordova/CordovaWebViewImpl;

    .line 51
    .line 52
    iget v1, v0, Lorg/apache/cordova/CordovaWebViewImpl;->d:I

    .line 53
    .line 54
    iget v2, p0, Ln/e;->i:I

    .line 55
    .line 56
    if-ne v1, v2, :cond_1

    .line 57
    .line 58
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 59
    .line 60
    invoke-interface {v0}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Ln/e;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lorg/apache/cordova/CordovaWebViewImpl;

    .line 69
    .line 70
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 71
    .line 72
    invoke-interface {v0}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, Ln/e;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lc0/a;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    iget-object v0, p0, Ln/e;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lorg/apache/cordova/CordovaWebViewImpl;

    .line 87
    .line 88
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->c:Lorg/apache/cordova/n;

    .line 89
    .line 90
    invoke-interface {v0}, Lorg/apache/cordova/n;->getActivity()Lg/k;

    .line 91
    .line 92
    .line 93
    :goto_2
    return-void

    .line 94
    :pswitch_1
    iget-object v0, p0, Ln/e;->k:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ln/g;

    .line 97
    .line 98
    iget-object v0, v0, Ln/g;->h:Ln/a;

    .line 99
    .line 100
    iget v1, p0, Ln/e;->h:I

    .line 101
    .line 102
    iget v2, p0, Ln/e;->i:I

    .line 103
    .line 104
    iget-object v3, p0, Ln/e;->j:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Landroid/os/Bundle;

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2, v3}, Ln/a;->onActivityResized(IILandroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
