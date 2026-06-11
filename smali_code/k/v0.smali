.class public final Lk/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final h:I

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p3, p0, Lk/v0;->g:I

    iput-object p1, p0, Lk/v0;->i:Ljava/lang/Object;

    iput-object p4, p0, Lk/v0;->j:Ljava/lang/Object;

    iput p2, p0, Lk/v0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILandroid/os/Parcelable;I)V
    .locals 0

    .line 2
    iput p4, p0, Lk/v0;->g:I

    iput-object p1, p0, Lk/v0;->j:Ljava/lang/Object;

    iput p2, p0, Lk/v0;->h:I

    iput-object p3, p0, Lk/v0;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lk/v0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk/v0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->k:Landroid/app/NotificationManager;

    .line 11
    .line 12
    iget-object v1, p0, Lk/v0;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/app/Notification;

    .line 15
    .line 16
    iget v2, p0, Lk/v0;->h:I

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lk/v0;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ln1/g;

    .line 25
    .line 26
    iget-object v1, p0, Lk/v0;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Intent;

    .line 29
    .line 30
    iget v2, p0, Lk/v0;->h:I

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Ln1/g;->a(Landroid/content/Intent;I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object v0, p0, Lk/v0;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ln/g;

    .line 39
    .line 40
    iget-object v0, v0, Ln/g;->h:Ln/a;

    .line 41
    .line 42
    iget-object v1, p0, Lk/v0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/os/Bundle;

    .line 45
    .line 46
    iget v2, p0, Lk/v0;->h:I

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Ln/a;->onNavigationEvent(ILandroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    iget-object v0, p0, Lk/v0;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/widget/TextView;

    .line 55
    .line 56
    iget-object v1, p0, Lk/v0;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroid/graphics/Typeface;

    .line 59
    .line 60
    iget v2, p0, Lk/v0;->h:I

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
