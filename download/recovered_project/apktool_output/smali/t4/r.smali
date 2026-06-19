.class public Lt4/r;
.super Lo4/a;
.source "SourceFile"

# interfaces
.implements Ly3/d;


# instance fields
.field public final j:Ly3/c;


# direct methods
.method public constructor <init>(Lw3/h;Ly3/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lo4/a;-><init>(Lw3/h;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lt4/r;->j:Ly3/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public V()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCallerFrame()Ly3/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/r;->j:Ly3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public p(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/r;->j:Ly3/c;

    .line 2
    .line 3
    invoke-static {v0}, La/a;->o(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lo4/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, v0}, Lt4/b;->h(Ljava/lang/Object;Lw3/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public q(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/r;->j:Ly3/c;

    .line 2
    .line 3
    invoke-static {p1}, Lo4/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lw3/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
