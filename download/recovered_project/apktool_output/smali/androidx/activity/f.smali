.class public final synthetic Landroidx/activity/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroidx/activity/s;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/f;->g:I

    iput-object p1, p0, Landroidx/activity/f;->h:Landroidx/activity/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/activity/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/activity/f0;

    .line 7
    .line 8
    new-instance v1, Landroidx/activity/e;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Landroidx/activity/f;->h:Landroidx/activity/s;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2}, Landroidx/activity/e;-><init>(Landroidx/activity/s;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroidx/activity/f0;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v2, 0x21

    .line 22
    .line 23
    if-lt v1, v2, :cond_1

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v1, v2}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La2/b;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-direct {v2, v4, v3, v0}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v3}, Landroidx/activity/s;->getLifecycle()Landroidx/lifecycle/o;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v2, Landroidx/activity/g;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-direct {v2, v4, v0, v3}, Landroidx/activity/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    return-object v0

    .line 72
    :pswitch_0
    new-instance v0, Landroidx/lifecycle/o0;

    .line 73
    .line 74
    iget-object v1, p0, Landroidx/activity/f;->h:Landroidx/activity/s;

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const/4 v3, 0x0

    .line 96
    :goto_1
    invoke-direct {v0, v2, v1, v3}, Landroidx/lifecycle/o0;-><init>(Landroid/app/Application;Lc1/f;Landroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/f;->h:Landroidx/activity/s;

    .line 101
    .line 102
    invoke-static {v0}, Landroidx/activity/s;->d(Landroidx/activity/s;)Landroidx/activity/v;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/f;->h:Landroidx/activity/s;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/activity/s;->reportFullyDrawn()V

    .line 110
    .line 111
    .line 112
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
