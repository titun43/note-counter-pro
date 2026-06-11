.class public final Lw4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/d;
.implements Lo4/k1;


# instance fields
.field public final g:Lo4/f;

.field public final synthetic h:Lw4/c;


# direct methods
.method public constructor <init>(Lw4/c;Lo4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw4/b;->h:Lw4/c;

    .line 5
    .line 6
    iput-object p2, p0, Lw4/b;->g:Lo4/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt4/s;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/b;->g:Lo4/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lo4/f;->a(Lt4/s;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ljava/lang/Object;Lf4/q;)Landroidx/emoji2/text/r;
    .locals 2

    .line 1
    check-cast p1, Lt3/h;

    .line 2
    .line 3
    new-instance p2, Lo4/e;

    .line 4
    .line 5
    iget-object v0, p0, Lw4/b;->h:Lw4/c;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0}, Lo4/e;-><init>(Lw4/c;Lw4/b;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lw4/b;->g:Lo4/f;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2}, Lo4/f;->f(Ljava/lang/Object;Lf4/q;)Landroidx/emoji2/text/r;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    sget-object p2, Lw4/c;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p1
.end method

.method public final getContext()Lw3/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/b;->g:Lo4/f;

    .line 2
    .line 3
    iget-object v0, v0, Lo4/f;->k:Lw3/h;

    .line 4
    .line 5
    return-object v0
.end method

.method public final o(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/b;->g:Lo4/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo4/f;->o(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/b;->g:Lo4/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
