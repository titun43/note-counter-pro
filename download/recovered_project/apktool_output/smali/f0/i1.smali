.class public Lf0/i1;
.super Lf0/g1;
.source "SourceFile"


# instance fields
.field public o:Ly/c;

.field public p:Ly/c;

.field public q:Ly/c;


# direct methods
.method public constructor <init>(Lf0/q1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf0/g1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lf0/i1;->o:Ly/c;

    .line 6
    .line 7
    iput-object p1, p0, Lf0/i1;->p:Ly/c;

    .line 8
    .line 9
    iput-object p1, p0, Lf0/i1;->q:Ly/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Ly/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/i1;->p:Ly/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf0/e1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lf0/h1;->b(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lf0/i1;->p:Ly/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lf0/i1;->p:Ly/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public i()Ly/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/i1;->o:Ly/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf0/e1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lf0/h1;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lf0/i1;->o:Ly/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lf0/i1;->o:Ly/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Ly/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/i1;->q:Ly/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf0/e1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/lifecycle/g0;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lf0/i1;->q:Ly/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lf0/i1;->q:Ly/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public l(IIII)Lf0/q1;
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/e1;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lf0/h1;->j(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p1, p2}, Lf0/q1;->g(Landroid/view/WindowInsets;Landroid/view/View;)Lf0/q1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public r(Ly/c;)V
    .locals 0

    .line 1
    return-void
.end method
