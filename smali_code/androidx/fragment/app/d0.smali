.class public final Landroidx/fragment/app/d0;
.super La/a;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/x0;
.implements Landroidx/lifecycle/t;
.implements Lc1/f;
.implements Landroidx/fragment/app/z0;


# instance fields
.field public final m:Lg/k;

.field public final n:Lg/k;

.field public final o:Landroid/os/Handler;

.field public final p:Landroidx/fragment/app/v0;

.field public final synthetic q:Lg/k;


# direct methods
.method public constructor <init>(Lg/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/fragment/app/d0;->m:Lg/k;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, Landroidx/fragment/app/v0;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/fragment/app/u0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/z;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/fragment/app/e0;->onAttachFragment(Landroidx/fragment/app/z;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 4
    .line 5
    return-object v0
.end method

.method public final getSavedStateRegistry()Lc1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/s;->getSavedStateRegistry()Lc1/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/w0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/activity/s;->getViewModelStore()Landroidx/lifecycle/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final r(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg/k;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method
