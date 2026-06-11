.class public final Lk0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/c;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk0/s;->g:I

    iput-object p1, p0, Lk0/s;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lk0/s;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lk0/s;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lg4/n;

    .line 9
    .line 10
    iput-object p1, p2, Lg4/n;->g:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, Ls4/a;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Ls4/a;-><init>(Lk0/s;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    instance-of v0, p2, Lk0/r;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, Lk0/r;

    .line 24
    .line 25
    iget v1, v0, Lk0/r;->h:I

    .line 26
    .line 27
    const/high16 v2, -0x80000000

    .line 28
    .line 29
    and-int v3, v1, v2

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    sub-int/2addr v1, v2

    .line 34
    iput v1, v0, Lk0/r;->h:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lk0/r;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Lk0/r;-><init>(Lk0/s;Lw3/c;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p2, v0, Lk0/r;->g:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 45
    .line 46
    iget v2, v0, Lk0/r;->h:I

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    if-ne v2, v3, :cond_1

    .line 52
    .line 53
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Lk0/s;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, Lr4/c;

    .line 71
    .line 72
    check-cast p1, Lk0/e0;

    .line 73
    .line 74
    instance-of v2, p1, Lk0/h;

    .line 75
    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    instance-of v2, p1, Lk0/g;

    .line 79
    .line 80
    if-nez v2, :cond_6

    .line 81
    .line 82
    instance-of v2, p1, Lk0/a;

    .line 83
    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    check-cast p1, Lk0/a;

    .line 87
    .line 88
    iget-object p1, p1, Lk0/a;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, v0, Lk0/r;->h:I

    .line 91
    .line 92
    invoke-interface {p2, p1, v0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v1, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 100
    .line 101
    :goto_2
    return-object v1

    .line 102
    :cond_4
    instance-of p1, p1, Lk0/f0;

    .line 103
    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_5
    new-instance p1, Landroidx/fragment/app/x;

    .line 115
    .line 116
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_6
    check-cast p1, Lk0/g;

    .line 121
    .line 122
    iget-object p1, p1, Lk0/g;->a:Ljava/lang/Throwable;

    .line 123
    .line 124
    throw p1

    .line 125
    :cond_7
    check-cast p1, Lk0/h;

    .line 126
    .line 127
    iget-object p1, p1, Lk0/h;->a:Ljava/lang/Throwable;

    .line 128
    .line 129
    throw p1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
