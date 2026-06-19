.class public final Lp3/t;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/t;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 1

    .line 1
    new-instance p1, Lp3/t;

    .line 2
    .line 3
    iget-object v0, p0, Lp3/t;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lp3/t;-><init>(Ljava/lang/String;Lw3/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo4/t;

    .line 2
    .line 3
    check-cast p2, Lw3/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lp3/t;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lp3/t;

    .line 10
    .line 11
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lp3/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lr3/b;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Lr3/b;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lp3/t;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lb3/g;->o(Ljava/lang/String;Lr3/b;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Lt3/e;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
