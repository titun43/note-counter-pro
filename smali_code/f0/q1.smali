.class public final Lf0/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lf0/q1;


# instance fields
.field public final a:Lf0/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lf0/l1;->s:Lf0/q1;

    .line 8
    .line 9
    sput-object v0, Lf0/q1;->b:Lf0/q1;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/16 v1, 0x1e

    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    sget-object v0, Lf0/j1;->r:Lf0/q1;

    .line 17
    .line 18
    sput-object v0, Lf0/q1;->b:Lf0/q1;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v0, Lf0/m1;->b:Lf0/q1;

    .line 22
    .line 23
    sput-object v0, Lf0/q1;->b:Lf0/q1;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lf0/m1;

    invoke-direct {v0, p0}, Lf0/m1;-><init>(Lf0/q1;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lf0/l1;

    invoke-direct {v0, p0, p1}, Lf0/l1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lf0/k1;

    invoke-direct {v0, p0, p1}, Lf0/k1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lf0/j1;

    invoke-direct {v0, p0, p1}, Lf0/j1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 6
    new-instance v0, Lf0/i1;

    invoke-direct {v0, p0, p1}, Lf0/i1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 7
    new-instance v0, Lf0/g1;

    invoke-direct {v0, p0, p1}, Lf0/g1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void

    .line 8
    :cond_4
    new-instance v0, Lf0/f1;

    invoke-direct {v0, p0, p1}, Lf0/f1;-><init>(Lf0/q1;Landroid/view/WindowInsets;)V

    iput-object v0, p0, Lf0/q1;->a:Lf0/m1;

    return-void
.end method

.method public static e(Ly/c;IIII)Ly/c;
    .locals 5

    .line 1
    iget v0, p0, Ly/c;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, Ly/c;->b:I

    .line 10
    .line 11
    sub-int/2addr v2, p2

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, Ly/c;->c:I

    .line 17
    .line 18
    sub-int/2addr v3, p3

    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, Ly/c;->d:I

    .line 24
    .line 25
    sub-int/2addr v4, p4

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, p1, :cond_0

    .line 31
    .line 32
    if-ne v2, p2, :cond_0

    .line 33
    .line 34
    if-ne v3, p3, :cond_0

    .line 35
    .line 36
    if-ne v1, p4, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0, v2, v3, v1}, Ly/c;->b(IIII)Ly/c;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static g(Landroid/view/WindowInsets;Landroid/view/View;)Lf0/q1;
    .locals 2

    .line 1
    new-instance v0, Lf0/q1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Lf0/q1;-><init>(Landroid/view/WindowInsets;)V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object p0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-static {p1}, Lf0/l0;->a(Landroid/view/View;)Lf0/q1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object v1, v0, Lf0/q1;->a:Lf0/m1;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lf0/m1;->q(Lf0/q1;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v1, p0}, Lf0/m1;->d(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v1, p0}, Lf0/m1;->s(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf0/m1;->j()Ly/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ly/c;->d:I

    .line 8
    .line 9
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf0/m1;->j()Ly/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ly/c;->a:I

    .line 8
    .line 9
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf0/m1;->j()Ly/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ly/c;->c:I

    .line 8
    .line 9
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf0/m1;->j()Ly/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ly/c;->b:I

    .line 8
    .line 9
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lf0/q1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lf0/q1;

    .line 12
    .line 13
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 14
    .line 15
    iget-object p1, p1, Lf0/q1;->a:Lf0/m1;

    .line 16
    .line 17
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final f()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    instance-of v1, v0, Lf0/e1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lf0/e1;

    .line 8
    .line 9
    iget-object v0, v0, Lf0/e1;->c:Landroid/view/WindowInsets;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf0/q1;->a:Lf0/m1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lf0/m1;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
