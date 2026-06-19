.class public final Lo4/i1;
.super Lt4/r;
.source "SourceFile"


# instance fields
.field public final k:Ljava/lang/ThreadLocal;

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Lw3/h;Ly3/c;)V
    .locals 2

    .line 1
    sget-object v0, Lo4/j1;->g:Lo4/j1;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    invoke-direct {p0, v0, p2}, Lt4/r;-><init>(Lw3/h;Ly3/c;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 24
    .line 25
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    sget-object v0, Lw3/d;->g:Lw3/d;

    .line 30
    .line 31
    invoke-interface {p2, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of p2, p2, Lo4/r;

    .line 36
    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-static {p1, p2}, Lt4/b;->m(Lw3/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p1, p2}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, Lo4/i1;->Y(Lw3/h;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method


# virtual methods
.method public final V()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo4/i1;->X()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final W()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lo4/i1;->threadLocalIsSet:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object v2, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    xor-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public final X()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lo4/i1;->threadLocalIsSet:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lt3/c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lt3/c;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lw3/h;

    .line 18
    .line 19
    iget-object v0, v0, Lt3/c;->h:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v1, v0}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final Y(Lw3/h;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lo4/i1;->threadLocalIsSet:Z

    .line 3
    .line 4
    iget-object v0, p0, Lo4/i1;->k:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    new-instance v1, Lt3/c;

    .line 7
    .line 8
    invoke-direct {v1, p1, p2}, Lt3/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lo4/i1;->X()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lo4/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lt4/r;->j:Ly3/c;

    .line 9
    .line 10
    invoke-interface {v0}, Lw3/c;->getContext()Lw3/h;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v1, v2}, Lt4/b;->m(Lw3/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Lt4/b;->d:Landroidx/emoji2/text/r;

    .line 20
    .line 21
    if-eq v3, v4, :cond_0

    .line 22
    .line 23
    invoke-static {v0, v1, v3}, Lo4/w;->o(Ly3/c;Lw3/h;Ljava/lang/Object;)Lo4/i1;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lw3/c;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Lo4/i1;->W()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    :goto_0
    invoke-static {v1, v3}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {v2}, Lo4/i1;->W()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    :cond_3
    invoke-static {v1, v3}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    throw p1
.end method
