.class public final Lp3/l;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lr3/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lr3/a;Lw3/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp3/l;->g:I

    iput-object p1, p0, Lp3/l;->h:Ljava/lang/String;

    iput-object p2, p0, Lp3/l;->i:Lr3/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget p1, p0, Lp3/l;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp3/l;

    .line 7
    .line 8
    iget-object v0, p0, Lp3/l;->i:Lr3/a;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p0, Lp3/l;->h:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lp3/l;-><init>(Ljava/lang/String;Lr3/a;Lw3/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lp3/l;

    .line 18
    .line 19
    iget-object v0, p0, Lp3/l;->i:Lr3/a;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object v2, p0, Lp3/l;->h:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lp3/l;-><init>(Ljava/lang/String;Lr3/a;Lw3/c;I)V

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
    iget v0, p0, Lp3/l;->g:I

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
    invoke-virtual {p0, p1, p2}, Lp3/l;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/l;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp3/l;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lp3/l;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lp3/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget v0, p0, Lp3/l;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lp3/l;->i:Lr3/a;

    .line 4
    .line 5
    iget-object v2, p0, Lp3/l;->h:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 11
    .line 12
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-static {v2, v1, p1}, Lb3/g;->f(Ljava/lang/String;Lr3/a;Z)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, Lt3/e;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 27
    .line 28
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    invoke-static {v2, v1, p1}, Lb3/g;->f(Ljava/lang/String;Lr3/a;Z)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lt3/e;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
