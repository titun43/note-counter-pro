.class public final Lr4/e;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr4/e;->g:I

    iput-object p1, p0, Lr4/e;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 2

    .line 1
    iget p1, p0, Lr4/e;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lr4/e;

    .line 7
    .line 8
    iget-object v0, p0, Lr4/e;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lu0/a;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, v0, p2, v1}, Lr4/e;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lr4/e;

    .line 18
    .line 19
    iget-object v0, p0, Lr4/e;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/emoji2/text/p;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, v0, p2, v1}, Lr4/e;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

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
    iget v0, p0, Lr4/e;->g:I

    .line 2
    .line 3
    check-cast p1, Lo4/t;

    .line 4
    .line 5
    check-cast p2, Lw3/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lr4/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lr4/e;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lr4/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lr4/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lr4/e;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lr4/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr4/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 7
    .line 8
    iget v1, p0, Lr4/e;->h:I

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
    iget-object p1, p0, Lr4/e;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lu0/a;

    .line 33
    .line 34
    iget-object p1, p1, Lu0/a;->a:Lw0/b;

    .line 35
    .line 36
    iput v2, p0, Lr4/e;->h:I

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lw0/b;->b(Lw3/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    move-object p1, v0

    .line 45
    :cond_2
    :goto_0
    return-object p1

    .line 46
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 47
    .line 48
    iget v1, p0, Lr4/e;->h:I

    .line 49
    .line 50
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    if-ne v1, v3, :cond_4

    .line 56
    .line 57
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    move-object v0, v2

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_5
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lr4/e;->i:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Landroidx/emoji2/text/p;

    .line 76
    .line 77
    iput v3, p0, Lr4/e;->h:I

    .line 78
    .line 79
    sget-object v1, Ls4/h;->g:Ls4/h;

    .line 80
    .line 81
    invoke-virtual {p1, v1, p0}, Landroidx/emoji2/text/p;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_6

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    move-object p1, v2

    .line 89
    :goto_1
    if-ne p1, v0, :cond_3

    .line 90
    .line 91
    :goto_2
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
