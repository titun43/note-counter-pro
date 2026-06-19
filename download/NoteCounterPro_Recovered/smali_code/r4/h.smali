.class public final Lr4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/b;


# instance fields
.field public final synthetic g:Landroidx/emoji2/text/p;

.field public final synthetic h:Lf4/q;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/p;Lf4/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/h;->g:Landroidx/emoji2/text/p;

    .line 5
    .line 6
    iput-object p2, p0, Lr4/h;->h:Lf4/q;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Lr4/c;Lw3/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lr4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr4/g;

    .line 7
    .line 8
    iget v1, v0, Lr4/g;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lr4/g;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/g;

    .line 21
    .line 22
    check-cast p2, Ly3/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lr4/g;-><init>(Lr4/h;Ly3/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, Lr4/g;->g:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 30
    .line 31
    iget v2, v0, Lr4/g;->h:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ls4/j;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_3
    iget-object p1, v0, Lr4/g;->k:Lr4/c;

    .line 72
    .line 73
    iget-object v2, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lr4/h;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_1
    move-exception p1

    .line 82
    goto :goto_4

    .line 83
    :cond_4
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :try_start_2
    iget-object p2, p0, Lr4/h;->g:Landroidx/emoji2/text/p;

    .line 87
    .line 88
    iput-object p0, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p1, v0, Lr4/g;->k:Lr4/c;

    .line 91
    .line 92
    iput v5, v0, Lr4/g;->h:I

    .line 93
    .line 94
    invoke-virtual {p2, p1, v0}, Landroidx/emoji2/text/p;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 98
    if-ne p2, v1, :cond_5

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_5
    move-object v2, p0

    .line 102
    :goto_1
    new-instance p2, Ls4/j;

    .line 103
    .line 104
    invoke-interface {v0}, Lw3/c;->getContext()Lw3/h;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-direct {p2, p1, v4}, Ls4/j;-><init>(Lr4/c;Lw3/h;)V

    .line 109
    .line 110
    .line 111
    :try_start_3
    iget-object p1, v2, Lr4/h;->h:Lf4/q;

    .line 112
    .line 113
    iput-object p2, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v6, v0, Lr4/g;->k:Lr4/c;

    .line 116
    .line 117
    iput v3, v0, Lr4/g;->h:I

    .line 118
    .line 119
    invoke-interface {p1, p2, v6, v0}, Lf4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    if-ne p1, v1, :cond_6

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_6
    move-object p1, p2

    .line 127
    :goto_2
    invoke-virtual {p1}, Ly3/c;->releaseIntercepted()V

    .line 128
    .line 129
    .line 130
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 131
    .line 132
    return-object p1

    .line 133
    :catchall_2
    move-exception p1

    .line 134
    move-object v7, p2

    .line 135
    move-object p2, p1

    .line 136
    move-object p1, v7

    .line 137
    :goto_3
    invoke-virtual {p1}, Ly3/c;->releaseIntercepted()V

    .line 138
    .line 139
    .line 140
    throw p2

    .line 141
    :catchall_3
    move-exception p1

    .line 142
    move-object v2, p0

    .line 143
    :goto_4
    new-instance p2, Lr4/v;

    .line 144
    .line 145
    invoke-direct {p2, p1}, Lr4/v;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    iget-object v2, v2, Lr4/h;->h:Lf4/q;

    .line 149
    .line 150
    iput-object p1, v0, Lr4/g;->j:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v6, v0, Lr4/g;->k:Lr4/c;

    .line 153
    .line 154
    iput v4, v0, Lr4/g;->h:I

    .line 155
    .line 156
    invoke-static {p2, v2, p1, v0}, Lr4/t;->a(Lr4/v;Lf4/q;Ljava/lang/Throwable;Ly3/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    if-ne p2, v1, :cond_7

    .line 161
    .line 162
    :goto_5
    return-object v1

    .line 163
    :cond_7
    :goto_6
    throw p1
.end method
