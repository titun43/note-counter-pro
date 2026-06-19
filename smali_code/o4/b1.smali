.class public final Lo4/b1;
.super Lw3/a;
.source "SourceFile"

# interfaces
.implements Lo4/r0;


# static fields
.field public static final h:Lo4/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo4/b1;

    .line 2
    .line 3
    sget-object v1, Lo4/s;->h:Lo4/s;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw3/a;-><init>(Lw3/g;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lo4/b1;->h:Lo4/b1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final b(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(ZZLo4/u0;)Lo4/f0;
    .locals 0

    .line 1
    sget-object p1, Lo4/c1;->a:Lo4/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final g()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final h(Lf4/l;)Lo4/f0;
    .locals 0

    .line 1
    sget-object p1, Lo4/c1;->a:Lo4/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final n(Lo4/z0;)Lo4/i;
    .locals 0

    .line 1
    sget-object p1, Lo4/c1;->a:Lo4/c1;

    .line 2
    .line 3
    return-object p1
.end method

.method public final start()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
