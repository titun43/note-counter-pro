.class public final synthetic Landroidx/activity/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/activity/g;->g:I

    iput-object p2, p0, Landroidx/activity/g;->h:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/activity/g;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    iget p1, p0, Landroidx/activity/g;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/activity/g;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lf0/m;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/activity/g;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lf0/o;

    .line 13
    .line 14
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 15
    .line 16
    if-ne p2, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lf0/m;->b(Lf0/o;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :pswitch_0
    iget-object p1, p0, Landroidx/activity/g;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroidx/activity/f0;

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/activity/g;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroidx/activity/s;

    .line 33
    .line 34
    sget-object v1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 35
    .line 36
    if-ne p2, v1, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, Landroidx/activity/k;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p1, Landroidx/activity/f0;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 43
    .line 44
    iget-boolean p2, p1, Landroidx/activity/f0;->g:Z

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroidx/activity/f0;->d(Z)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
