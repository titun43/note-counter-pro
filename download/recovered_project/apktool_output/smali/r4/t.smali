.class public abstract Lr4/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/emoji2/text/r;

.field public static final b:Landroidx/emoji2/text/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/emoji2/text/r;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lr4/t;->a:Landroidx/emoji2/text/r;

    .line 10
    .line 11
    new-instance v0, Landroidx/emoji2/text/r;

    .line 12
    .line 13
    const-string v1, "PENDING"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lr4/t;->b:Landroidx/emoji2/text/r;

    .line 19
    .line 20
    return-void
.end method

.method public static final a(Lr4/v;Lf4/q;Ljava/lang/Throwable;Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lr4/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr4/f;

    .line 7
    .line 8
    iget v1, v0, Lr4/f;->i:I

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
    iput v1, v0, Lr4/f;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/f;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ly3/c;-><init>(Lw3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lr4/f;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lr4/f;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p2, v0, Lr4/f;->g:Ljava/lang/Throwable;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p2, v0, Lr4/f;->g:Ljava/lang/Throwable;

    .line 56
    .line 57
    iput v3, v0, Lr4/f;->i:I

    .line 58
    .line 59
    invoke-interface {p1, p0, p2, v0}, Lf4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    sget-object p0, Lt3/h;->a:Lt3/h;

    .line 67
    .line 68
    return-object p0

    .line 69
    :goto_2
    if-eqz p2, :cond_4

    .line 70
    .line 71
    if-eq p2, p0, :cond_4

    .line 72
    .line 73
    invoke-static {p0, p2}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    throw p0
.end method

.method public static final b(Lr4/b;Lr4/c;Ly3/c;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p2, Lr4/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr4/j;

    .line 7
    .line 8
    iget v1, v0, Lr4/j;->i:I

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
    iput v1, v0, Lr4/j;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/j;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ly3/c;-><init>(Lw3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr4/j;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lr4/j;->i:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lr4/j;->g:Lg4/n;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lg4/n;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    :try_start_1
    new-instance v2, Lr4/l;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-direct {v2, p1, p2, v4}, Lr4/l;-><init>(Lr4/c;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    iput-object p2, v0, Lr4/j;->g:Lg4/n;

    .line 67
    .line 68
    iput v3, v0, Lr4/j;->i:I

    .line 69
    .line 70
    invoke-interface {p0, v2, v0}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    if-ne p0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :catchall_1
    move-exception p1

    .line 80
    move-object p0, p2

    .line 81
    :goto_2
    iget-object p0, p0, Lg4/n;->g:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ljava/lang/Throwable;

    .line 84
    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-nez p2, :cond_6

    .line 92
    .line 93
    :cond_4
    invoke-interface {v0}, Lw3/c;->getContext()Lw3/h;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget-object v0, Lo4/s;->h:Lo4/s;

    .line 98
    .line 99
    invoke-interface {p2, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Lo4/r0;

    .line 104
    .line 105
    if-eqz p2, :cond_7

    .line 106
    .line 107
    invoke-interface {p2}, Lo4/r0;->isCancelled()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    invoke-interface {p2}, Lo4/r0;->g()Ljava/util/concurrent/CancellationException;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    throw p1

    .line 128
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 132
    .line 133
    if-eqz p2, :cond_9

    .line 134
    .line 135
    invoke-static {p0, p1}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :cond_9
    invoke-static {p1, p0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p1
.end method

.method public static final c(Lr4/c;Lq4/n;ZLy3/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lr4/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lr4/d;

    .line 7
    .line 8
    iget v1, v0, Lr4/d;->l:I

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
    iput v1, v0, Lr4/d;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/d;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Ly3/c;-><init>(Lw3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lr4/d;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lr4/d;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-ne v2, v4, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, Lr4/d;->j:Z

    .line 41
    .line 42
    iget-object p0, v0, Lr4/d;->i:Lq4/b;

    .line 43
    .line 44
    iget-object p1, v0, Lr4/d;->h:Lq4/p;

    .line 45
    .line 46
    iget-object v2, v0, Lr4/d;->g:Lr4/c;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object v7, v2

    .line 52
    move-object v2, p0

    .line 53
    move-object p0, v7

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    iget-boolean p2, v0, Lr4/d;->j:Z

    .line 67
    .line 68
    iget-object p0, v0, Lr4/d;->i:Lq4/b;

    .line 69
    .line 70
    iget-object p1, v0, Lr4/d;->h:Lq4/p;

    .line 71
    .line 72
    iget-object v2, v0, Lr4/d;->g:Lr4/c;

    .line 73
    .line 74
    :try_start_1
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    instance-of p3, p0, Lr4/v;

    .line 82
    .line 83
    if-nez p3, :cond_d

    .line 84
    .line 85
    :try_start_2
    iget-object p3, p1, Lq4/n;->j:Lq4/c;

    .line 86
    .line 87
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Lq4/b;

    .line 91
    .line 92
    invoke-direct {v2, p3}, Lq4/b;-><init>(Lq4/c;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iput-object p0, v0, Lr4/d;->g:Lr4/c;

    .line 96
    .line 97
    iput-object p1, v0, Lr4/d;->h:Lq4/p;

    .line 98
    .line 99
    iput-object v2, v0, Lr4/d;->i:Lq4/b;

    .line 100
    .line 101
    iput-boolean p2, v0, Lr4/d;->j:Z

    .line 102
    .line 103
    iput v5, v0, Lr4/d;->l:I

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Lq4/b;->b(Lr4/d;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    if-ne p3, v1, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    move-object v7, v2

    .line 113
    move-object v2, p0

    .line 114
    move-object p0, v7

    .line 115
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    if-eqz p3, :cond_8

    .line 122
    .line 123
    iget-object p3, p0, Lq4/b;->g:Ljava/lang/Object;

    .line 124
    .line 125
    sget-object v6, Lq4/e;->p:Landroidx/emoji2/text/r;

    .line 126
    .line 127
    if-eq p3, v6, :cond_7

    .line 128
    .line 129
    iput-object v6, p0, Lq4/b;->g:Ljava/lang/Object;

    .line 130
    .line 131
    sget-object v6, Lq4/e;->l:Landroidx/emoji2/text/r;

    .line 132
    .line 133
    if-eq p3, v6, :cond_6

    .line 134
    .line 135
    iput-object v2, v0, Lr4/d;->g:Lr4/c;

    .line 136
    .line 137
    iput-object p1, v0, Lr4/d;->h:Lq4/p;

    .line 138
    .line 139
    iput-object p0, v0, Lr4/d;->i:Lq4/b;

    .line 140
    .line 141
    iput-boolean p2, v0, Lr4/d;->j:Z

    .line 142
    .line 143
    iput v4, v0, Lr4/d;->l:I

    .line 144
    .line 145
    invoke-interface {v2, p3, v0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    if-ne p3, v1, :cond_1

    .line 150
    .line 151
    :goto_3
    return-object v1

    .line 152
    :cond_6
    iget-object p0, p0, Lq4/b;->i:Lq4/c;

    .line 153
    .line 154
    invoke-virtual {p0}, Lq4/c;->o()Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    sget p3, Lt4/t;->a:I

    .line 159
    .line 160
    throw p0

    .line 161
    :cond_7
    const-string p0, "`hasNext()` has not been invoked"

    .line 162
    .line 163
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    invoke-direct {p3, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    :cond_8
    if-eqz p2, :cond_9

    .line 170
    .line 171
    invoke-interface {p1, v3}, Lq4/p;->b(Ljava/util/concurrent/CancellationException;)V

    .line 172
    .line 173
    .line 174
    :cond_9
    sget-object p0, Lt3/h;->a:Lt3/h;

    .line 175
    .line 176
    return-object p0

    .line 177
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    :catchall_1
    move-exception p3

    .line 179
    if-eqz p2, :cond_c

    .line 180
    .line 181
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 182
    .line 183
    if-eqz p2, :cond_a

    .line 184
    .line 185
    move-object v3, p0

    .line 186
    check-cast v3, Ljava/util/concurrent/CancellationException;

    .line 187
    .line 188
    :cond_a
    if-nez v3, :cond_b

    .line 189
    .line 190
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 191
    .line 192
    const-string p2, "Channel was consumed, consumer had failed"

    .line 193
    .line 194
    invoke-direct {v3, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    :cond_b
    invoke-interface {p1, v3}, Lq4/p;->b(Ljava/util/concurrent/CancellationException;)V

    .line 201
    .line 202
    .line 203
    :cond_c
    throw p3

    .line 204
    :cond_d
    check-cast p0, Lr4/v;

    .line 205
    .line 206
    iget-object p0, p0, Lr4/v;->g:Ljava/lang/Throwable;

    .line 207
    .line 208
    throw p0
.end method

.method public static final d(Lr4/b;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lr4/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lr4/o;

    .line 7
    .line 8
    iget v1, v0, Lr4/o;->j:I

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
    iput v1, v0, Lr4/o;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr4/o;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Ly3/c;-><init>(Lw3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lr4/o;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lr4/o;->j:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lr4/o;->h:Lk0/s;

    .line 37
    .line 38
    iget-object v1, v0, Lr4/o;->g:Lg4/n;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catch Ls4/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lg4/n;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v2, Lk0/s;

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    invoke-direct {v2, p1, v4}, Lk0/s;-><init>(Ljava/lang/Object;I)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iput-object p1, v0, Lr4/o;->g:Lg4/n;

    .line 69
    .line 70
    iput-object v2, v0, Lr4/o;->h:Lk0/s;

    .line 71
    .line 72
    iput v3, v0, Lr4/o;->j:I

    .line 73
    .line 74
    invoke-interface {p0, v2, v0}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catch Ls4/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v1, p1

    .line 82
    goto :goto_2

    .line 83
    :catch_1
    move-exception p0

    .line 84
    move-object v1, p1

    .line 85
    move-object p1, p0

    .line 86
    move-object p0, v2

    .line 87
    :goto_1
    iget-object v2, p1, Ls4/a;->g:Lk0/s;

    .line 88
    .line 89
    if-ne v2, p0, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Lw3/c;->getContext()Lw3/h;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lo4/w;->c(Lw3/h;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p0, v1, Lg4/n;->g:Ljava/lang/Object;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_4
    throw p1
.end method

.method public static final e(Lu1/f;Lw3/h;)Lr4/b;
    .locals 3

    .line 1
    sget-object v0, Lo4/s;->h:Lo4/s;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    sget-object v0, Lw3/i;->g:Lw3/i;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, Ls4/f;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, Ls4/f;

    .line 23
    .line 24
    sget-object v0, Lq4/a;->g:Lq4/a;

    .line 25
    .line 26
    invoke-interface {p0, p1, v0}, Ls4/f;->d(Lw3/h;Lq4/a;)Lr4/b;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance v0, Ls4/d;

    .line 32
    .line 33
    sget-object v1, Lq4/a;->g:Lq4/a;

    .line 34
    .line 35
    const/4 v2, -0x3

    .line 36
    invoke-direct {v0, p0, p1, v2, v1}, Ls4/d;-><init>(Lr4/b;Lw3/h;ILq4/a;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v0, "Flow context cannot contain job in it. Had "

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
