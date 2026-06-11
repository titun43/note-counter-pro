.class public final Landroidx/activity/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Landroidx/activity/z;

.field public final synthetic b:Landroidx/activity/z;

.field public final synthetic c:Landroidx/activity/a0;

.field public final synthetic d:Landroidx/activity/a0;


# direct methods
.method public constructor <init>(Landroidx/activity/z;Landroidx/activity/z;Landroidx/activity/a0;Landroidx/activity/a0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/c0;->a:Landroidx/activity/z;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/c0;->b:Landroidx/activity/z;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/c0;->c:Landroidx/activity/a0;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/activity/c0;->d:Landroidx/activity/a0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/c0;->d:Landroidx/activity/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/a0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/activity/c0;->c:Landroidx/activity/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/a0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/activity/c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/activity/c;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/c0;->b:Landroidx/activity/z;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/activity/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/activity/c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/activity/c;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/c0;->a:Landroidx/activity/z;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/activity/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
