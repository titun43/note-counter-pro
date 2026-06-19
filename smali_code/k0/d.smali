.class public final Lk0/d;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/l;


# instance fields
.field public g:I


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lw3/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk0/d;->create(Lw3/c;)Lw3/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lk0/d;

    .line 8
    .line 9
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lk0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final create(Lw3/c;)Lw3/c;
    .locals 2

    .line 1
    new-instance v0, Lk0/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p1}, Ly3/g;-><init>(ILw3/c;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 2
    .line 3
    iget v0, p0, Lk0/d;->g:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput v1, p0, Lk0/d;->g:I

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
.end method
