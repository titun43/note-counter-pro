.class public Lf0/r1;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final n:Landroid/view/Window;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Window;Lk1/j;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf0/r1;->m:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 10
    .line 11
    iput-object p2, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {p1}, Lf0/n1;->d(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p1, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public A(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    or-int/2addr p1, v1

    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public B(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final n(I)V
    .locals 3

    .line 1
    iget v0, p0, Lf0/r1;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/WindowInsetsController;

    .line 9
    .line 10
    and-int/lit8 p1, p1, -0x9

    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/k;->w(Landroid/view/WindowInsetsController;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    move v1, v0

    .line 18
    :goto_0
    const/16 v2, 0x200

    .line 19
    .line 20
    if-gt v1, v2, :cond_4

    .line 21
    .line 22
    and-int v2, p1, v1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    if-eq v1, v0, :cond_3

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    if-eq v1, v2, :cond_2

    .line 31
    .line 32
    const/16 v2, 0x8

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v2, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lk1/j;

    .line 40
    .line 41
    iget-object v2, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lu1/f;

    .line 44
    .line 45
    invoke-virtual {v2}, Lu1/f;->l()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p0, v2}, Lf0/r1;->A(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const/4 v2, 0x4

    .line 54
    invoke-virtual {p0, v2}, Lf0/r1;->A(I)V

    .line 55
    .line 56
    .line 57
    :goto_1
    shl-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public u(Z)V
    .locals 1

    .line 1
    iget v0, p0, Lf0/r1;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    or-int/lit8 v0, v0, 0x10

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/view/WindowInsetsController;

    .line 29
    .line 30
    invoke-static {p1}, Lf0/n1;->l(Landroid/view/WindowInsetsController;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    and-int/lit8 v0, v0, -0x11

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Landroid/view/WindowInsetsController;

    .line 52
    .line 53
    invoke-static {p1}, Lf0/n1;->n(Landroid/view/WindowInsetsController;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final v(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lf0/r1;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    or-int/lit16 v0, v0, 0x2000

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Landroid/view/WindowInsetsController;

    .line 28
    .line 29
    invoke-static {p1}, Lf0/n1;->g(Landroid/view/WindowInsetsController;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    and-int/lit16 v0, v0, -0x2001

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Landroid/view/WindowInsetsController;

    .line 51
    .line 52
    invoke-static {p1}, Lf0/n1;->j(Landroid/view/WindowInsetsController;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :pswitch_0
    const/16 v0, 0x2000

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const/high16 p1, 0x4000000

    .line 61
    .line 62
    iget-object v1, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 63
    .line 64
    invoke-virtual {v1, p1}, Landroid/view/Window;->clearFlags(I)V

    .line 65
    .line 66
    .line 67
    const/high16 p1, -0x80000000

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Landroid/view/Window;->addFlags(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lf0/r1;->A(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {p0, v0}, Lf0/r1;->B(I)V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x(I)V
    .locals 4

    .line 1
    iget v0, p0, Lf0/r1;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/WindowInsetsController;

    .line 9
    .line 10
    and-int/lit8 p1, p1, -0x9

    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/k;->r(Landroid/view/WindowInsetsController;I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    move v1, v0

    .line 18
    :goto_0
    const/16 v2, 0x200

    .line 19
    .line 20
    if-gt v1, v2, :cond_4

    .line 21
    .line 22
    and-int v2, p1, v1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    if-eq v1, v0, :cond_3

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    if-eq v1, v2, :cond_2

    .line 31
    .line 32
    const/16 v2, 0x8

    .line 33
    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v2, p0, Lf0/r1;->o:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lk1/j;

    .line 40
    .line 41
    iget-object v2, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lu1/f;

    .line 44
    .line 45
    invoke-virtual {v2}, Lu1/f;->o()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p0, v2}, Lf0/r1;->B(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const/4 v2, 0x4

    .line 54
    invoke-virtual {p0, v2}, Lf0/r1;->B(I)V

    .line 55
    .line 56
    .line 57
    const/16 v2, 0x400

    .line 58
    .line 59
    iget-object v3, p0, Lf0/r1;->n:Landroid/view/Window;

    .line 60
    .line 61
    invoke-virtual {v3, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 62
    .line 63
    .line 64
    :goto_1
    shl-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
