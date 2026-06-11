.class public final Lq4/n;
.super Lo4/a;
.source "SourceFile"

# interfaces
.implements Lq4/o;
.implements Lq4/g;


# instance fields
.field public final j:Lq4/c;


# direct methods
.method public constructor <init>(Lw3/h;Lq4/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lo4/a;-><init>(Lw3/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lq4/n;->j:Lq4/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final S(ZLjava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq4/n;->j:Lq4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, p2}, Lq4/c;->g(ZLjava/lang/Throwable;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lo4/a;->i:Lw3/h;

    .line 13
    .line 14
    invoke-static {p2, p1}, Lo4/w;->g(Ljava/lang/Throwable;Lw3/h;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final T(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lt3/h;

    .line 2
    .line 3
    iget-object p1, p0, Lq4/n;->j:Lq4/c;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v0, v1}, Lq4/c;->g(ZLjava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo4/z0;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, Lo4/s0;

    .line 11
    .line 12
    invoke-virtual {p0}, Lo4/a;->u()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, Lo4/s0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lo4/z0;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lq4/n;->s(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lq4/n;->j:Lq4/c;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lq4/q;->c(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final s(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lq4/n;->j:Lq4/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1, p1}, Lq4/c;->g(ZLjava/lang/Throwable;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lo4/z0;->r(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
