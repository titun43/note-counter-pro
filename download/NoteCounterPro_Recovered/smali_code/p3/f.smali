.class public final Lp3/f;
.super Ly3/c;
.source "SourceFile"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lk1/j;

.field public i:I


# direct methods
.method public constructor <init>(Lk1/j;Ly3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/f;->h:Lk1/j;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ly3/c;-><init>(Lw3/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lp3/f;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lp3/f;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lp3/f;->i:I

    .line 9
    .line 10
    iget-object p1, p0, Lp3/f;->h:Lk1/j;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lk1/j;->B(Landroid/net/Uri;Lr3/a0;Ly3/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v0, Lt3/e;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
