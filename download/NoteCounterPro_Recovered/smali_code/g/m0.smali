.class public final Lg/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/y;


# instance fields
.field public g:Z

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lg/m0;->g:Z

    .line 5
    .line 6
    iput-object p1, p0, Lg/m0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg/m0;->g:Z

    .line 2
    .line 3
    const-string v1, "BillingLogger"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "Skipping logging since initialization failed."

    .line 8
    .line 9
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, Lg/m0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/emoji2/text/t;

    .line 16
    .line 17
    new-instance v2, Lc2/a;

    .line 18
    .line 19
    invoke-direct {v2, p1}, Lc2/a;-><init>(Lcom/google/android/gms/internal/play_billing/zzlk;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroidx/emoji2/text/t;->x(Lc2/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    const-string p1, "logging failed."

    .line 27
    .line 28
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public b(Lj/n;Z)V
    .locals 2

    .line 1
    iget-object p2, p0, Lg/m0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Lg/n0;

    .line 4
    .line 5
    iget-boolean v0, p0, Lg/m0;->g:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lg/m0;->g:Z

    .line 12
    .line 13
    iget-object v0, p2, Lg/n0;->a:Lk/d3;

    .line 14
    .line 15
    iget-object v0, v0, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lk/l;->g()Z

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lk/l;->z:Lk/h;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Lj/x;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Lj/x;->i:Lj/v;

    .line 39
    .line 40
    invoke-interface {v0}, Lj/d0;->dismiss()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p2, p2, Lg/n0;->b:Landroid/view/Window$Callback;

    .line 44
    .line 45
    const/16 v0, 0x6c

    .line 46
    .line 47
    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-boolean p1, p0, Lg/m0;->g:Z

    .line 52
    .line 53
    return-void
.end method

.method public k(Lj/n;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg/m0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg/n0;

    .line 4
    .line 5
    iget-object v0, v0, Lg/n0;->b:Landroid/view/Window$Callback;

    .line 6
    .line 7
    const/16 v1, 0x6c

    .line 8
    .line 9
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1
.end method
