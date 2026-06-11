.class public final Landroidx/activity/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/d;


# instance fields
.field public final g:Landroidx/activity/y;

.field public final synthetic h:Landroidx/activity/f0;


# direct methods
.method public constructor <init>(Landroidx/activity/f0;Landroidx/activity/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "onBackPressedCallback"

    .line 5
    .line 6
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/activity/d0;->h:Landroidx/activity/f0;

    .line 10
    .line 11
    iput-object p2, p0, Landroidx/activity/d0;->g:Landroidx/activity/y;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/activity/d0;->h:Landroidx/activity/f0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/activity/f0;->b:Lu3/e;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/activity/d0;->g:Landroidx/activity/y;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lu3/e;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/activity/f0;->c:Landroidx/activity/y;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/activity/y;->handleOnBackCancelled()V

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Landroidx/activity/f0;->c:Landroidx/activity/y;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2, p0}, Landroidx/activity/y;->removeCancellable(Landroidx/activity/d;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroidx/activity/y;->getEnabledChangedCallback$activity_release()Lf4/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Lf4/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2, v3}, Landroidx/activity/y;->setEnabledChangedCallback$activity_release(Lf4/a;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
