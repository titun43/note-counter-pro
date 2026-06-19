.class public final Lk0/q;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lr3/b;Lw3/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk0/q;->g:I

    .line 1
    iput-object p1, p0, Lk0/q;->h:Ljava/lang/Object;

    iput-object p2, p0, Lk0/q;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public constructor <init>(Lk0/e0;Lw3/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk0/q;->g:I

    .line 2
    iput-object p1, p0, Lk0/q;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 2

    .line 1
    iget v0, p0, Lk0/q;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lk0/q;

    .line 7
    .line 8
    iget-object v0, p0, Lk0/q;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lk0/q;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lr3/b;

    .line 15
    .line 16
    invoke-direct {p1, v0, v1, p2}, Lk0/q;-><init>(Ljava/lang/String;Lr3/b;Lw3/c;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance v0, Lk0/q;

    .line 21
    .line 22
    iget-object v1, p0, Lk0/q;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lk0/e0;

    .line 25
    .line 26
    invoke-direct {v0, v1, p2}, Lk0/q;-><init>(Lk0/e0;Lw3/c;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lk0/q;->h:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk0/q;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lo4/t;

    .line 7
    .line 8
    check-cast p2, Lw3/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lk0/q;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk0/q;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk0/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lk0/e0;

    .line 24
    .line 25
    check-cast p2, Lw3/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lk0/q;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lk0/q;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lk0/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lk0/q;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lk0/q;->i:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 9
    .line 10
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lk0/q;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    check-cast v1, Lr3/b;

    .line 18
    .line 19
    invoke-static {p1, v1}, Lb3/g;->o(Ljava/lang/String;Lr3/b;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Lt3/e;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 30
    .line 31
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lk0/q;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lk0/e0;

    .line 37
    .line 38
    check-cast v1, Lk0/e0;

    .line 39
    .line 40
    instance-of v0, v1, Lk0/a;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    instance-of v0, v1, Lk0/g;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    if-ne p1, v1, :cond_1

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
