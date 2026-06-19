.class public final Ls4/c;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ls4/d;


# direct methods
.method public synthetic constructor <init>(Ls4/d;Lw3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls4/c;->g:I

    iput-object p1, p0, Ls4/c;->j:Ls4/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget v0, p0, Ls4/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls4/c;

    .line 7
    .line 8
    iget-object v1, p0, Ls4/c;->j:Ls4/d;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, p2, v2}, Ls4/c;-><init>(Ls4/d;Lw3/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Ls4/c;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Ls4/c;

    .line 18
    .line 19
    iget-object v1, p0, Ls4/c;->j:Ls4/d;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, p2, v2}, Ls4/c;-><init>(Ls4/d;Lw3/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Ls4/c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ls4/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr4/c;

    .line 7
    .line 8
    check-cast p2, Lw3/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ls4/c;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ls4/c;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ls4/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lq4/o;

    .line 24
    .line 25
    check-cast p2, Lw3/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ls4/c;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ls4/c;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ls4/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    iget v0, p0, Ls4/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 7
    .line 8
    iget v1, p0, Ls4/c;->h:I

    .line 9
    .line 10
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Ls4/c;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lr4/c;

    .line 35
    .line 36
    iput v3, p0, Ls4/c;->h:I

    .line 37
    .line 38
    iget-object v1, p0, Ls4/c;->j:Ls4/d;

    .line 39
    .line 40
    iget-object v1, v1, Ls4/d;->j:Lr4/b;

    .line 41
    .line 42
    invoke-interface {v1, p1, p0}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object p1, v2

    .line 50
    :goto_0
    if-ne p1, v0, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    :goto_1
    move-object v0, v2

    .line 54
    :goto_2
    return-object v0

    .line 55
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 56
    .line 57
    iget v1, p0, Ls4/c;->h:I

    .line 58
    .line 59
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    if-ne v1, v3, :cond_5

    .line 65
    .line 66
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    move-object v0, v2

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :cond_6
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Ls4/c;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Lq4/o;

    .line 85
    .line 86
    iput v3, p0, Ls4/c;->h:I

    .line 87
    .line 88
    new-instance v1, Ls4/m;

    .line 89
    .line 90
    invoke-direct {v1, p1}, Ls4/m;-><init>(Lq4/q;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Ls4/c;->j:Ls4/d;

    .line 94
    .line 95
    iget-object p1, p1, Ls4/d;->j:Lr4/b;

    .line 96
    .line 97
    invoke-interface {p1, v1, p0}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v0, :cond_7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    move-object p1, v2

    .line 105
    :goto_3
    if-ne p1, v0, :cond_8

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_8
    move-object p1, v2

    .line 109
    :goto_4
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    :goto_5
    return-object v0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
