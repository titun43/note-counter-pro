.class public Lu1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/b;
.implements Lf0/c;
.implements Lj/l;
.implements Lh2/b;
.implements Lk/h2;
.implements Lk/o;
.implements Lj1/b;
.implements Lk1/p;
.implements Lr4/b;
.implements Lcom/google/android/gms/common/api/internal/q;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x17

    iput v0, p0, Lu1/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lu1/f;->g:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/g;->l(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lu1/f;->g:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ln0/g;

    invoke-direct {v0, p1}, Ln0/g;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf4/p;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lu1/f;->g:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    check-cast p1, Ly3/g;

    iput-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lu1/f;->g:I

    iput-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk1/j;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lu1/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object p1, p1, Lk1/j;->h:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 4
    iput-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lv2/c;

    .line 2
    .line 3
    check-cast p2, Lh3/h;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv2/a;

    .line 10
    .line 11
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/gms/common/internal/t;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/base/zaa;->zaa()Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/base/zac;->zac(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/base/zaa;->zad(ILandroid/os/Parcel;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p2, p1}, Lh3/h;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public b(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/g;->w(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public build()Lf0/f;
    .locals 3

    .line 1
    new-instance v0, Lf0/f;

    .line 2
    .line 3
    new-instance v1, Lk1/j;

    .line 4
    .line 5
    iget-object v2, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/view/ContentInfo$Builder;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/g;->m(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Lk1/j;-><init>(Landroid/view/ContentInfo;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lf0/f;-><init>(Lf0/e;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lu1/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;

    .line 9
    .line 10
    check-cast p1, Ld/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Ld/a;->h:Landroid/content/Intent;

    .line 16
    .line 17
    const-string v2, "ProxyBillingActivityV2"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzf(Landroid/content/Intent;Ljava/lang/String;)Ly1/e;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget v3, v3, Ly1/e;->a:I

    .line 24
    .line 25
    iget-object v4, v0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->j:Landroid/os/ResultReceiver;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-virtual {v4, v3, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget p1, p1, Ld/a;->g:I

    .line 41
    .line 42
    const/4 v1, -0x1

    .line 43
    if-ne p1, v1, :cond_2

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "External offer dialog finished with resultCode: "

    .line 50
    .line 51
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, " and billing\'s responseCode: "

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_0
    check-cast p1, Ld/a;

    .line 77
    .line 78
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Landroidx/fragment/app/u0;

    .line 81
    .line 82
    iget-object v1, v0, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Landroidx/fragment/app/q0;

    .line 89
    .line 90
    const-string v2, "FragmentManager"

    .line 91
    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v0, "No Activities were started for result for "

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    iget-object v3, v1, Landroidx/fragment/app/q0;->g:Ljava/lang/String;

    .line 113
    .line 114
    iget v1, v1, Landroidx/fragment/app/q0;->h:I

    .line 115
    .line 116
    iget-object v0, v0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Lr1/h;->h(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    new-instance p1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v0, "Activity result delivered for unknown Fragment "

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    iget v2, p1, Ld/a;->g:I

    .line 143
    .line 144
    iget-object p1, p1, Ld/a;->h:Landroid/content/Intent;

    .line 145
    .line 146
    invoke-virtual {v0, v1, v2, p1}, Landroidx/fragment/app/z;->k(IILandroid/content/Intent;)V

    .line 147
    .line 148
    .line 149
    :goto_1
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->createWebView(Landroid/webkit/WebView;)Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p1
.end method

.method public e(Lj/n;Lj/p;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj/h;

    .line 4
    .line 5
    iget-object v1, v0, Lj/h;->l:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lj/h;->n:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lj/g;

    .line 26
    .line 27
    iget-object v6, v6, Lj/g;->b:Lj/n;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Lj/g;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, Lj/f;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v4, p0

    .line 59
    move-object v7, p1

    .line 60
    move-object v6, p2

    .line 61
    invoke-direct/range {v3 .. v8}, Lj/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    const-wide/16 v4, 0xc8

    .line 69
    .line 70
    add-long/2addr p1, v4

    .line 71
    invoke-virtual {v1, v3, v7, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public f(Lj/n;)V
    .locals 4

    .line 1
    iget v0, p0, Lu1/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->B:Lj/l;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lj/l;->f(Lj/n;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lg/n0;

    .line 21
    .line 22
    iget-object v1, v0, Lg/n0;->b:Landroid/view/Window$Callback;

    .line 23
    .line 24
    iget-object v0, v0, Lg/n0;->a:Lk/d3;

    .line 25
    .line 26
    iget-object v0, v0, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->o()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v2, 0x6c

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-interface {v1, v0, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v1, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lj/n;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget p1, p0, Lu1/f;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 9
    .line 10
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->G:Lk/o;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    check-cast p1, Lu1/f;

    .line 16
    .line 17
    iget-object p1, p1, Lu1/f;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 20
    .line 21
    iget-object v1, p1, Landroidx/appcompat/widget/Toolbar;->M:Lf0/m;

    .line 22
    .line 23
    invoke-virtual {v1}, Lf0/m;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    move p1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->O:Lk/a3;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    check-cast p1, Lg/l0;

    .line 37
    .line 38
    iget-object p1, p1, Lg/l0;->a:Lg/n0;

    .line 39
    .line 40
    iget-object p1, p1, Lg/n0;->b:Landroid/view/Window$Callback;

    .line 41
    .line 42
    invoke-interface {p1, v0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move p1, v0

    .line 48
    :goto_0
    if-eqz p1, :cond_2

    .line 49
    .line 50
    move v0, v2

    .line 51
    :cond_2
    return v0

    .line 52
    :pswitch_0
    const/4 p1, 0x0

    .line 53
    return p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu1/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls3/a;

    .line 9
    .line 10
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 24
    .line 25
    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :pswitch_0
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lu1/f;

    .line 37
    .line 38
    iget-object v0, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    new-instance v1, Lt2/i;

    .line 43
    .line 44
    const/16 v2, 0x18

    .line 45
    .line 46
    invoke-direct {v1, v2}, Lt2/i;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lt2/i;

    .line 50
    .line 51
    const/16 v3, 0x17

    .line 52
    .line 53
    invoke-direct {v2, v3}, Lt2/i;-><init>(I)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Landroidx/emoji2/text/t;

    .line 57
    .line 58
    const/16 v4, 0xb

    .line 59
    .line 60
    invoke-direct {v3, v0, v1, v2, v4}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getProfileStore()Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getProfileStore()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/ProfileStoreBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ly4/b;->f(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object v0
.end method

.method public h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/g;->v(Landroid/view/ContentInfo$Builder;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(Lj/n;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lj/h;

    .line 4
    .line 5
    iget-object p2, p2, Lj/h;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public j(Lr4/c;Lw3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lr4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr4/a;

    .line 7
    .line 8
    iget v1, v0, Lr4/a;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr4/a;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/a;

    .line 21
    .line 22
    check-cast p2, Ly3/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lr4/a;-><init>(Lu1/f;Ly3/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, Lr4/a;->h:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 30
    .line 31
    iget v2, v0, Lr4/a;->j:I

    .line 32
    .line 33
    sget-object v3, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lr4/a;->g:Ls4/j;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p2, Ls4/j;

    .line 60
    .line 61
    invoke-interface {v0}, Lw3/c;->getContext()Lw3/h;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {p2, p1, v2}, Ls4/j;-><init>(Lr4/c;Lw3/h;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iput-object p2, v0, Lr4/a;->g:Ls4/j;

    .line 69
    .line 70
    iput v4, v0, Lr4/a;->j:I

    .line 71
    .line 72
    iget-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ly3/g;

    .line 75
    .line 76
    invoke-interface {p1, p2, v0}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    if-ne p1, v1, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object p1, v3

    .line 84
    :goto_1
    if-ne p1, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    move-object p1, p2

    .line 88
    :goto_2
    invoke-virtual {p1}, Ly3/c;->releaseIntercepted()V

    .line 89
    .line 90
    .line 91
    return-object v3

    .line 92
    :goto_3
    move-object v5, p2

    .line 93
    move-object p2, p1

    .line 94
    move-object p1, v5

    .line 95
    goto :goto_4

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    goto :goto_3

    .line 98
    :goto_4
    invoke-virtual {p1}, Ly3/c;->releaseIntercepted()V

    .line 99
    .line 100
    .line 101
    throw p2
.end method

.method public k(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget v0, p0, Lu1/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/webkit/JsPromptResult;

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void

    .line 20
    :pswitch_0
    iget-object p1, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroid/webkit/JsResult;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 31
    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "input_method"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public m(I)I
    .locals 10

    .line 1
    const-class v0, Lu1/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "next_job_scheduler_id"

    .line 5
    .line 6
    iget-object v2, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Landroidx/work/impl/WorkDatabase;

    .line 9
    .line 10
    invoke-virtual {v2}, Lz0/i;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->j()Landroidx/emoji2/text/p;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3, v1}, Landroidx/emoji2/text/p;->z(Ljava/lang/String;)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_4

    .line 31
    :cond_0
    move v3, v4

    .line 32
    :goto_0
    const v5, 0x7fffffff

    .line 33
    .line 34
    .line 35
    if-ne v3, v5, :cond_1

    .line 36
    .line 37
    move v5, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->j()Landroidx/emoji2/text/p;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Lt1/c;

    .line 46
    .line 47
    int-to-long v8, v5

    .line 48
    invoke-direct {v7, v1, v8, v9}, Lt1/c;-><init>(Ljava/lang/String;J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v7}, Landroidx/emoji2/text/p;->B(Lt1/c;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_2
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 58
    .line 59
    .line 60
    if-ltz v3, :cond_3

    .line 61
    .line 62
    if-le v3, p1, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move v4, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    :goto_2
    const-string p1, "next_job_scheduler_id"

    .line 68
    .line 69
    iget-object v1, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->j()Landroidx/emoji2/text/p;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v2, Lt1/c;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    int-to-long v5, v3

    .line 81
    invoke-direct {v2, p1, v5, v6}, Lt1/c;-><init>(Ljava/lang/String;J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroidx/emoji2/text/p;->B(Lt1/c;)V

    .line 85
    .line 86
    .line 87
    :goto_3
    monitor-exit v0

    .line 88
    return v4

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    goto :goto_5

    .line 91
    :goto_4
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    throw p1
.end method

.method public n(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const/4 v3, 0x0

    .line 11
    if-ge v2, v1, :cond_5

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    check-cast v4, Lj1/d;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v5, v4, Lj1/d;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v7, "http"

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    iget-boolean v6, v4, Lj1/d;->a:Z

    .line 39
    .line 40
    if-nez v6, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, "https"

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    iget-object v7, v4, Lj1/d;->b:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object v3, v4, Lj1/d;->d:Lx4/d;

    .line 91
    .line 92
    :goto_1
    if-nez v3, :cond_4

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-string v6, ""

    .line 100
    .line 101
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-object v5, v3, Lx4/d;->a:Lx4/f;

    .line 106
    .line 107
    iget-object v3, v3, Lx4/d;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 108
    .line 109
    invoke-static {v5, v3, v4}, Lx4/f;->a(Lx4/f;Lorg/apache/cordova/engine/SystemWebViewEngine;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    if-nez v3, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    return-object v3
.end method

.method public o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    move-object v1, v0

    .line 34
    :goto_1
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :cond_3
    if-eqz v1, :cond_4

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    new-instance v0, Landroidx/activity/o;

    .line 56
    .line 57
    const/4 v2, 0x5

    .line 58
    invoke-direct {v0, v1, v2}, Landroidx/activity/o;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    return-void
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/f;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ContentInfo$Builder;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/g;->x(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
