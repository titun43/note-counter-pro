.class public final Lp3/g;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr4/c;


# direct methods
.method public synthetic constructor <init>(Lr4/c;Lw3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp3/g;->g:I

    iput-object p1, p0, Lp3/g;->j:Lr4/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget v0, p0, Lp3/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp3/g;

    .line 7
    .line 8
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lp3/g;-><init>(Lr4/c;Lw3/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lp3/g;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lp3/g;

    .line 18
    .line 19
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lp3/g;-><init>(Lr4/c;Lw3/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lp3/g;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, Lp3/g;

    .line 29
    .line 30
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, v1, p2, v2}, Lp3/g;-><init>(Lr4/c;Lw3/c;I)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, Lp3/g;->i:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Lw3/c;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lp3/g;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lp3/g;

    .line 13
    .line 14
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lp3/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    check-cast p2, Lw3/c;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lp3/g;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lp3/g;

    .line 30
    .line 31
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lp3/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 39
    .line 40
    check-cast p2, Lw3/c;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Lp3/g;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lp3/g;

    .line 47
    .line 48
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lp3/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lp3/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 7
    .line 8
    iget v1, p0, Lp3/g;->h:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lp3/g;->i:Ljava/lang/Object;

    .line 31
    .line 32
    iput v2, p0, Lp3/g;->h:I

    .line 33
    .line 34
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 35
    .line 36
    invoke-interface {v1, p1, p0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 44
    .line 45
    :goto_1
    return-object v0

    .line 46
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 47
    .line 48
    iget v1, p0, Lp3/g;->h:I

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    if-ne v1, v2, :cond_3

    .line 54
    .line 55
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_4
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lp3/g;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ljava/lang/String;

    .line 73
    .line 74
    iput v2, p0, Lp3/g;->h:I

    .line 75
    .line 76
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 77
    .line 78
    invoke-interface {v1, p1, p0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_2
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 86
    .line 87
    :goto_3
    return-object v0

    .line 88
    :pswitch_1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 89
    .line 90
    iget v1, p0, Lp3/g;->h:I

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    if-ne v1, v2, :cond_6

    .line 96
    .line 97
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_7
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Lp3/g;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Ljava/lang/String;

    .line 115
    .line 116
    iput v2, p0, Lp3/g;->h:I

    .line 117
    .line 118
    iget-object v1, p0, Lp3/g;->j:Lr4/c;

    .line 119
    .line 120
    invoke-interface {v1, p1, p0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v0, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    :goto_4
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 128
    .line 129
    :goto_5
    return-object v0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
