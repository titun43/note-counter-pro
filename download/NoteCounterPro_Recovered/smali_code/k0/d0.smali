.class public final Lk0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/f;


# static fields
.field public static final i:Ljava/util/LinkedHashSet;

.field public static final j:Ljava/lang/Object;


# instance fields
.field public final a:Lf4/a;

.field public final b:Lk0/i;

.field public final c:Lu1/f;

.field public final d:Ljava/lang/String;

.field public final e:Lt3/f;

.field public final f:Lr4/s;

.field public g:Ljava/util/List;

.field public final h:Lr1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk0/d0;->i:Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lk0/d0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lf4/a;Lcom/google/android/gms/internal/ads/zzfzb;Ljava/util/List;Lt2/i;Lo4/t;)V
    .locals 1

    .line 1
    const-string p4, "serializer"

    .line 2
    .line 3
    invoke-static {p2, p4}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk0/d0;->a:Lf4/a;

    .line 10
    .line 11
    iput-object p2, p0, Lk0/d0;->b:Lk0/i;

    .line 12
    .line 13
    new-instance p1, Lk0/p;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    const/4 p4, 0x0

    .line 17
    invoke-direct {p1, p0, p4, p2}, Lk0/p;-><init>(Lk0/d0;Lw3/c;I)V

    .line 18
    .line 19
    .line 20
    new-instance p2, Lu1/f;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lu1/f;-><init>(Lf4/p;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lk0/d0;->c:Lu1/f;

    .line 26
    .line 27
    const-string p1, ".tmp"

    .line 28
    .line 29
    iput-object p1, p0, Lk0/d0;->d:Ljava/lang/String;

    .line 30
    .line 31
    new-instance p1, Landroidx/lifecycle/l0;

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    invoke-direct {p1, p0, p2}, Landroidx/lifecycle/l0;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    new-instance p2, Lt3/f;

    .line 38
    .line 39
    invoke-direct {p2, p1}, Lt3/f;-><init>(Lf4/a;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lk0/d0;->e:Lt3/f;

    .line 43
    .line 44
    new-instance p1, Lr4/s;

    .line 45
    .line 46
    sget-object p2, Lk0/f0;->a:Lk0/f0;

    .line 47
    .line 48
    invoke-direct {p1, p2}, Lr4/s;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lk0/d0;->f:Lr4/s;

    .line 52
    .line 53
    invoke-static {p3}, Lu3/g;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lk0/d0;->g:Ljava/util/List;

    .line 58
    .line 59
    new-instance p1, Lr1/h;

    .line 60
    .line 61
    new-instance p2, Lk0/o;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Lk0/o;-><init>(Lk0/d0;)V

    .line 64
    .line 65
    .line 66
    new-instance p3, Lk0/p;

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-direct {p3, p0, p4, v0}, Lk0/p;-><init>(Lk0/d0;Lw3/c;I)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p5, p1, Lr1/h;->g:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p3, p1, Lr1/h;->h:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 p3, 0x0

    .line 80
    const/4 p4, 0x6

    .line 81
    const v0, 0x7fffffff

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p3, p4}, Lq4/j;->a(ILq4/a;I)Lq4/c;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    iput-object p3, p1, Lr1/h;->i:Ljava/lang/Object;

    .line 89
    .line 90
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    const/4 p4, 0x0

    .line 93
    invoke-direct {p3, p4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iput-object p3, p1, Lr1/h;->j:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-interface {p5}, Lo4/t;->k()Lw3/h;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    sget-object p4, Lo4/s;->h:Lo4/s;

    .line 103
    .line 104
    invoke-interface {p3, p4}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    check-cast p3, Lo4/r0;

    .line 109
    .line 110
    if-nez p3, :cond_0

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    new-instance p4, Lk0/j;

    .line 114
    .line 115
    const/4 p5, 0x0

    .line 116
    invoke-direct {p4, p5, p2, p1}, Lk0/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p3, p4}, Lo4/r0;->h(Lf4/l;)Lo4/f0;

    .line 120
    .line 121
    .line 122
    :goto_0
    iput-object p1, p0, Lk0/d0;->h:Lr1/h;

    .line 123
    .line 124
    return-void
.end method

.method public static final a(Lk0/d0;Lk0/l;Ly3/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lk0/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lk0/t;

    .line 7
    .line 8
    iget v1, v0, Lk0/t;->l:I

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
    iput v1, v0, Lk0/t;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/t;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lk0/t;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lk0/t;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/t;->l:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_1

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    :cond_1
    iget-object p0, v0, Lk0/t;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lo4/k;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_3
    iget-object p0, v0, Lk0/t;->i:Lo4/l;

    .line 63
    .line 64
    iget-object p1, v0, Lk0/t;->h:Lk0/d0;

    .line 65
    .line 66
    iget-object v2, v0, Lk0/t;->g:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lk0/l;

    .line 69
    .line 70
    :try_start_1
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    move-object p2, p0

    .line 74
    move-object p0, p1

    .line 75
    move-object p1, v2

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p1, Lk0/l;->b:Lo4/l;

    .line 81
    .line 82
    :try_start_2
    iget-object v2, p0, Lk0/d0;->f:Lr4/s;

    .line 83
    .line 84
    invoke-virtual {v2}, Lr4/s;->a()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Lk0/e0;

    .line 89
    .line 90
    instance-of v6, v2, Lk0/a;

    .line 91
    .line 92
    if-eqz v6, :cond_6

    .line 93
    .line 94
    iget-object v2, p1, Lk0/l;->a:Ly3/g;

    .line 95
    .line 96
    iget-object p1, p1, Lk0/l;->d:Lw3/h;

    .line 97
    .line 98
    iput-object p2, v0, Lk0/t;->g:Ljava/lang/Object;

    .line 99
    .line 100
    iput v5, v0, Lk0/t;->l:I

    .line 101
    .line 102
    invoke-virtual {p0, v2, p1, v0}, Lk0/d0;->h(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_5

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move-object v7, p2

    .line 110
    move-object p2, p0

    .line 111
    move-object p0, v7

    .line 112
    goto :goto_5

    .line 113
    :catchall_1
    move-exception p1

    .line 114
    move-object p0, p2

    .line 115
    goto :goto_4

    .line 116
    :cond_6
    instance-of v6, v2, Lk0/h;

    .line 117
    .line 118
    if-eqz v6, :cond_7

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    instance-of v5, v2, Lk0/f0;

    .line 122
    .line 123
    :goto_1
    if-eqz v5, :cond_a

    .line 124
    .line 125
    iget-object v5, p1, Lk0/l;->c:Lk0/e0;

    .line 126
    .line 127
    if-ne v2, v5, :cond_9

    .line 128
    .line 129
    iput-object p1, v0, Lk0/t;->g:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p0, v0, Lk0/t;->h:Lk0/d0;

    .line 132
    .line 133
    iput-object p2, v0, Lk0/t;->i:Lo4/l;

    .line 134
    .line 135
    iput v4, v0, Lk0/t;->l:I

    .line 136
    .line 137
    invoke-virtual {p0, v0}, Lk0/d0;->d(Ly3/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-ne v2, v1, :cond_8

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    :goto_2
    iget-object v2, p1, Lk0/l;->a:Ly3/g;

    .line 145
    .line 146
    iget-object p1, p1, Lk0/l;->d:Lw3/h;

    .line 147
    .line 148
    iput-object p2, v0, Lk0/t;->g:Ljava/lang/Object;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    iput-object v4, v0, Lk0/t;->h:Lk0/d0;

    .line 152
    .line 153
    iput-object v4, v0, Lk0/t;->i:Lo4/l;

    .line 154
    .line 155
    iput v3, v0, Lk0/t;->l:I

    .line 156
    .line 157
    invoke-virtual {p0, v2, p1, v0}, Lk0/d0;->h(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, v1, :cond_5

    .line 162
    .line 163
    :goto_3
    return-object v1

    .line 164
    :cond_9
    check-cast v2, Lk0/h;

    .line 165
    .line 166
    iget-object p0, v2, Lk0/h;->a:Ljava/lang/Throwable;

    .line 167
    .line 168
    throw p0

    .line 169
    :cond_a
    instance-of p0, v2, Lk0/g;

    .line 170
    .line 171
    if-eqz p0, :cond_b

    .line 172
    .line 173
    check-cast v2, Lk0/g;

    .line 174
    .line 175
    iget-object p0, v2, Lk0/g;->a:Ljava/lang/Throwable;

    .line 176
    .line 177
    throw p0

    .line 178
    :cond_b
    new-instance p0, Landroidx/fragment/app/x;

    .line 179
    .line 180
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 181
    .line 182
    .line 183
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 184
    :goto_4
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    :goto_5
    invoke-static {p2}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p0, Lo4/l;

    .line 193
    .line 194
    if-nez p1, :cond_c

    .line 195
    .line 196
    invoke-virtual {p0, p2}, Lo4/z0;->G(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance p2, Lo4/n;

    .line 204
    .line 205
    const/4 v0, 0x0

    .line 206
    invoke-direct {p2, v0, p1}, Lo4/n;-><init>(ZLjava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p2}, Lo4/z0;->G(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :goto_6
    sget-object p0, Lt3/h;->a:Lt3/h;

    .line 213
    .line 214
    return-object p0
.end method


# virtual methods
.method public final b()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/d0;->e:Lt3/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt3/f;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Ly3/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Lk0/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk0/u;

    .line 7
    .line 8
    iget v1, v0, Lk0/u;->o:I

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
    iput v1, v0, Lk0/u;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lk0/u;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk0/u;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/u;->o:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object v1, v0, Lk0/u;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lw4/a;

    .line 46
    .line 47
    iget-object v2, v0, Lk0/u;->i:Ljava/io/Serializable;

    .line 48
    .line 49
    check-cast v2, Lg4/l;

    .line 50
    .line 51
    iget-object v3, v0, Lk0/u;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lg4/n;

    .line 54
    .line 55
    iget-object v0, v0, Lk0/u;->g:Lk0/d0;

    .line 56
    .line 57
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_1
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
    :cond_2
    iget-object v2, v0, Lk0/u;->l:Ljava/util/Iterator;

    .line 71
    .line 72
    iget-object v7, v0, Lk0/u;->k:Lk0/w;

    .line 73
    .line 74
    iget-object v8, v0, Lk0/u;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v8, Lg4/l;

    .line 77
    .line 78
    iget-object v9, v0, Lk0/u;->i:Ljava/io/Serializable;

    .line 79
    .line 80
    check-cast v9, Lg4/n;

    .line 81
    .line 82
    iget-object v10, v0, Lk0/u;->h:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v10, Lw4/a;

    .line 85
    .line 86
    iget-object v11, v0, Lk0/u;->g:Lk0/d0;

    .line 87
    .line 88
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_3
    iget-object v2, v0, Lk0/u;->j:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Lg4/n;

    .line 96
    .line 97
    iget-object v7, v0, Lk0/u;->i:Ljava/io/Serializable;

    .line 98
    .line 99
    check-cast v7, Lg4/n;

    .line 100
    .line 101
    iget-object v8, v0, Lk0/u;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v8, Lw4/a;

    .line 104
    .line 105
    iget-object v9, v0, Lk0/u;->g:Lk0/d0;

    .line 106
    .line 107
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lk0/d0;->f:Lr4/s;

    .line 115
    .line 116
    invoke-virtual {p1}, Lr4/s;->a()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v7, Lk0/f0;->a:Lk0/f0;

    .line 121
    .line 122
    invoke-static {v2, v7}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    invoke-virtual {p1}, Lr4/s;->a()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    instance-of p1, p1, Lk0/h;

    .line 133
    .line 134
    if-eqz p1, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    const-string v0, "Check failed."

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_6
    :goto_1
    new-instance v8, Lw4/c;

    .line 146
    .line 147
    invoke-direct {v8}, Lw4/c;-><init>()V

    .line 148
    .line 149
    .line 150
    new-instance v2, Lg4/n;

    .line 151
    .line 152
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object p0, v0, Lk0/u;->g:Lk0/d0;

    .line 156
    .line 157
    iput-object v8, v0, Lk0/u;->h:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v2, v0, Lk0/u;->i:Ljava/io/Serializable;

    .line 160
    .line 161
    iput-object v2, v0, Lk0/u;->j:Ljava/lang/Object;

    .line 162
    .line 163
    iput v5, v0, Lk0/u;->o:I

    .line 164
    .line 165
    invoke-virtual {p0, v0}, Lk0/d0;->g(Ly3/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v1, :cond_7

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_7
    move-object v9, p0

    .line 174
    move-object v7, v2

    .line 175
    :goto_2
    iput-object p1, v2, Lg4/n;->g:Ljava/lang/Object;

    .line 176
    .line 177
    new-instance p1, Lg4/l;

    .line 178
    .line 179
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v2, Lk0/w;

    .line 183
    .line 184
    invoke-direct {v2, v8, p1, v7, v9}, Lk0/w;-><init>(Lw4/a;Lg4/l;Lg4/n;Lk0/d0;)V

    .line 185
    .line 186
    .line 187
    iget-object v10, v9, Lk0/d0;->g:Ljava/util/List;

    .line 188
    .line 189
    if-nez v10, :cond_8

    .line 190
    .line 191
    move-object v2, p1

    .line 192
    move-object p1, v0

    .line 193
    move-object v0, v9

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    move-object v11, v9

    .line 200
    move-object v9, v7

    .line 201
    move-object v7, v2

    .line 202
    move-object v2, v10

    .line 203
    move-object v10, v8

    .line 204
    move-object v8, p1

    .line 205
    :cond_9
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    if-eqz p1, :cond_a

    .line 210
    .line 211
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Lf4/p;

    .line 216
    .line 217
    iput-object v11, v0, Lk0/u;->g:Lk0/d0;

    .line 218
    .line 219
    iput-object v10, v0, Lk0/u;->h:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v9, v0, Lk0/u;->i:Ljava/io/Serializable;

    .line 222
    .line 223
    iput-object v8, v0, Lk0/u;->j:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v7, v0, Lk0/u;->k:Lk0/w;

    .line 226
    .line 227
    iput-object v2, v0, Lk0/u;->l:Ljava/util/Iterator;

    .line 228
    .line 229
    iput v4, v0, Lk0/u;->o:I

    .line 230
    .line 231
    invoke-interface {p1, v7, v0}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-ne p1, v1, :cond_9

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_a
    move-object p1, v0

    .line 239
    move-object v2, v8

    .line 240
    move-object v7, v9

    .line 241
    move-object v8, v10

    .line 242
    move-object v0, v11

    .line 243
    :goto_4
    iput-object v6, v0, Lk0/d0;->g:Ljava/util/List;

    .line 244
    .line 245
    iput-object v0, p1, Lk0/u;->g:Lk0/d0;

    .line 246
    .line 247
    iput-object v7, p1, Lk0/u;->h:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v2, p1, Lk0/u;->i:Ljava/io/Serializable;

    .line 250
    .line 251
    iput-object v8, p1, Lk0/u;->j:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v6, p1, Lk0/u;->k:Lk0/w;

    .line 254
    .line 255
    iput-object v6, p1, Lk0/u;->l:Ljava/util/Iterator;

    .line 256
    .line 257
    iput v3, p1, Lk0/u;->o:I

    .line 258
    .line 259
    move-object v3, v8

    .line 260
    check-cast v3, Lw4/c;

    .line 261
    .line 262
    invoke-virtual {v3, p1}, Lw4/c;->c(Ly3/c;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, v1, :cond_b

    .line 267
    .line 268
    :goto_5
    return-object v1

    .line 269
    :cond_b
    move-object v1, v3

    .line 270
    move-object v3, v7

    .line 271
    :goto_6
    :try_start_0
    iput-boolean v5, v2, Lg4/l;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    .line 273
    check-cast v1, Lw4/c;

    .line 274
    .line 275
    invoke-virtual {v1, v6}, Lw4/c;->d(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iget-object p1, v0, Lk0/d0;->f:Lr4/s;

    .line 279
    .line 280
    new-instance v0, Lk0/a;

    .line 281
    .line 282
    iget-object v1, v3, Lg4/n;->g:Ljava/lang/Object;

    .line 283
    .line 284
    if-eqz v1, :cond_c

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    goto :goto_7

    .line 291
    :cond_c
    const/4 v2, 0x0

    .line 292
    :goto_7
    invoke-direct {v0, v1, v2}, Lk0/a;-><init>(Ljava/lang/Object;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v0}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 299
    .line 300
    return-object p1

    .line 301
    :catchall_0
    move-exception p1

    .line 302
    check-cast v1, Lw4/c;

    .line 303
    .line 304
    invoke-virtual {v1, v6}, Lw4/c;->d(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    throw p1
.end method

.method public final d(Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lk0/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk0/x;

    .line 7
    .line 8
    iget v1, v0, Lk0/x;->j:I

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
    iput v1, v0, Lk0/x;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/x;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lk0/x;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk0/x;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/x;->j:I

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
    iget-object v0, v0, Lk0/x;->g:Lk0/d0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
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
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p0, v0, Lk0/x;->g:Lk0/d0;

    .line 56
    .line 57
    iput v3, v0, Lk0/x;->j:I

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lk0/d0;->c(Ly3/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_1
    move-exception p1

    .line 70
    move-object v0, p0

    .line 71
    :goto_2
    iget-object v0, v0, Lk0/d0;->f:Lr4/s;

    .line 72
    .line 73
    new-instance v1, Lk0/h;

    .line 74
    .line 75
    invoke-direct {v1, p1}, Lk0/h;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public final e(Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lk0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk0/y;

    .line 7
    .line 8
    iget v1, v0, Lk0/y;->j:I

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
    iput v1, v0, Lk0/y;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/y;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lk0/y;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk0/y;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/y;->j:I

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
    iget-object v0, v0, Lk0/y;->g:Lk0/d0;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :try_start_1
    iput-object p0, v0, Lk0/y;->g:Lk0/d0;

    .line 56
    .line 57
    iput v3, v0, Lk0/y;->j:I

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lk0/d0;->c(Ly3/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :catchall_1
    move-exception p1

    .line 67
    move-object v0, p0

    .line 68
    :goto_1
    iget-object v0, v0, Lk0/d0;->f:Lr4/s;

    .line 69
    .line 70
    new-instance v1, Lk0/h;

    .line 71
    .line 72
    invoke-direct {v1, p1}, Lk0/h;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_2
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 79
    .line 80
    return-object p1
.end method

.method public final f(Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lk0/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk0/z;

    .line 7
    .line 8
    iget v1, v0, Lk0/z;->k:I

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
    iput v1, v0, Lk0/z;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/z;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lk0/z;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk0/z;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/z;->k:I

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
    iget-object v1, v0, Lk0/z;->h:Ljava/io/FileInputStream;

    .line 37
    .line 38
    iget-object v0, v0, Lk0/z;->g:Lk0/d0;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 58
    .line 59
    invoke-virtual {p0}, Lk0/d0;->b()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {p1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    .line 65
    .line 66
    :try_start_2
    iget-object v2, p0, Lk0/d0;->b:Lk0/i;

    .line 67
    .line 68
    iput-object p0, v0, Lk0/z;->g:Lk0/d0;

    .line 69
    .line 70
    iput-object p1, v0, Lk0/z;->h:Ljava/io/FileInputStream;

    .line 71
    .line 72
    iput v3, v0, Lk0/z;->k:I

    .line 73
    .line 74
    invoke-interface {v2, p1, v0}, Lk0/i;->readFrom(Ljava/io/InputStream;Lw3/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v1, p1

    .line 82
    move-object p1, v0

    .line 83
    move-object v0, p0

    .line 84
    :goto_1
    const/4 v2, 0x0

    .line 85
    :try_start_3
    invoke-static {v1, v2}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :catch_0
    move-exception p1

    .line 90
    goto :goto_3

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object v1, p1

    .line 93
    move-object p1, v0

    .line 94
    move-object v0, p0

    .line 95
    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 96
    :catchall_2
    move-exception v2

    .line 97
    :try_start_5
    invoke-static {v1, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v2
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 101
    :catch_1
    move-exception p1

    .line 102
    move-object v0, p0

    .line 103
    :goto_3
    invoke-virtual {v0}, Lk0/d0;->b()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    iget-object p1, v0, Lk0/d0;->b:Lk0/i;

    .line 114
    .line 115
    invoke-interface {p1}, Lk0/i;->getDefaultValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_4
    throw p1
.end method

.method public final g(Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lk0/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lk0/a0;

    .line 7
    .line 8
    iget v1, v0, Lk0/a0;->k:I

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
    iput v1, v0, Lk0/a0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/a0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lk0/a0;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lk0/a0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/a0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_7

    .line 33
    .line 34
    if-eq v2, v3, :cond_6

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x3

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eq v2, v3, :cond_3

    .line 40
    .line 41
    if-ne v2, v4, :cond_2

    .line 42
    .line 43
    iget-object v1, v0, Lk0/a0;->h:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, v0, Lk0/a0;->g:Lk0/d0;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    iget-object v2, v0, Lk0/a0;->h:Ljava/lang/Object;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    iget-object v2, v0, Lk0/a0;->g:Lk0/d0;

    .line 74
    .line 75
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :try_start_1
    iput-object v5, v0, Lk0/a0;->g:Lk0/d0;

    .line 79
    .line 80
    iput-object p1, v0, Lk0/a0;->h:Ljava/lang/Object;

    .line 81
    .line 82
    iput v4, v0, Lk0/a0;->k:I

    .line 83
    .line 84
    invoke-virtual {v2, p1, v0}, Lk0/d0;->j(Ljava/lang/Object;Ly3/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    if-ne v0, v1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    return-object p1

    .line 92
    :goto_1
    invoke-static {v5, p1}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    throw v5

    .line 96
    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    .line 97
    .line 98
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_6
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_7
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-object p0, v0, Lk0/a0;->g:Lk0/d0;

    .line 110
    .line 111
    iput v3, v0, Lk0/a0;->k:I

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Lk0/d0;->f(Ly3/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v1, :cond_8

    .line 118
    .line 119
    :goto_2
    return-object v1

    .line 120
    :cond_8
    return-object p1
.end method

.method public final h(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lk0/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lk0/b0;

    .line 7
    .line 8
    iget v1, v0, Lk0/b0;->l:I

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
    iput v1, v0, Lk0/b0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/b0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lk0/b0;-><init>(Lk0/d0;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lk0/b0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/b0;->l:I

    .line 30
    .line 31
    const-string v3, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v7, :cond_2

    .line 40
    .line 41
    if-ne v2, v6, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lk0/b0;->h:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p2, v0, Lk0/b0;->g:Lk0/d0;

    .line 46
    .line 47
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, Lk0/b0;->i:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p2, v0, Lk0/b0;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lk0/a;

    .line 65
    .line 66
    iget-object v2, v0, Lk0/b0;->g:Lk0/d0;

    .line 67
    .line 68
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p3, p0, Lk0/d0;->f:Lr4/s;

    .line 76
    .line 77
    invoke-virtual {p3}, Lr4/s;->a()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    check-cast p3, Lk0/a;

    .line 82
    .line 83
    iget-object v2, p3, Lk0/a;->a:Ljava/lang/Object;

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move v2, v4

    .line 93
    :goto_1
    iget v8, p3, Lk0/a;->b:I

    .line 94
    .line 95
    if-ne v2, v8, :cond_b

    .line 96
    .line 97
    iget-object v2, p3, Lk0/a;->a:Ljava/lang/Object;

    .line 98
    .line 99
    new-instance v8, Lk0/b;

    .line 100
    .line 101
    invoke-direct {v8, p1, v2, v5}, Lk0/b;-><init>(Lf4/p;Ljava/lang/Object;Lw3/c;)V

    .line 102
    .line 103
    .line 104
    iput-object p0, v0, Lk0/b0;->g:Lk0/d0;

    .line 105
    .line 106
    iput-object p3, v0, Lk0/b0;->h:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v2, v0, Lk0/b0;->i:Ljava/lang/Object;

    .line 109
    .line 110
    iput v7, v0, Lk0/b0;->l:I

    .line 111
    .line 112
    invoke-static {v8, p2, v0}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v1, :cond_5

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_5
    move-object p2, p3

    .line 120
    move-object p3, p1

    .line 121
    move-object p1, v2

    .line 122
    move-object v2, p0

    .line 123
    :goto_2
    iget-object v7, p2, Lk0/a;->a:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v7, :cond_6

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move v7, v4

    .line 133
    :goto_3
    iget p2, p2, Lk0/a;->b:I

    .line 134
    .line 135
    if-ne v7, p2, :cond_a

    .line 136
    .line 137
    invoke-static {p1, p3}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    if-eqz p2, :cond_7

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_7
    iput-object v2, v0, Lk0/b0;->g:Lk0/d0;

    .line 145
    .line 146
    iput-object p3, v0, Lk0/b0;->h:Ljava/lang/Object;

    .line 147
    .line 148
    iput-object v5, v0, Lk0/b0;->i:Ljava/lang/Object;

    .line 149
    .line 150
    iput v6, v0, Lk0/b0;->l:I

    .line 151
    .line 152
    invoke-virtual {v2, p3, v0}, Lk0/d0;->j(Ljava/lang/Object;Ly3/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne p1, v1, :cond_8

    .line 157
    .line 158
    :goto_4
    return-object v1

    .line 159
    :cond_8
    move-object p1, p3

    .line 160
    move-object p2, v2

    .line 161
    :goto_5
    iget-object p2, p2, Lk0/d0;->f:Lr4/s;

    .line 162
    .line 163
    new-instance p3, Lk0/a;

    .line 164
    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    :cond_9
    invoke-direct {p3, p1, v4}, Lk0/a;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2, p3}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object p1

    .line 178
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 179
    .line 180
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 185
    .line 186
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
.end method

.method public final i(Lf4/p;Ly3/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lo4/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lo4/z0;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v2}, Lo4/z0;->D(Lo4/r0;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lk0/d0;->f:Lr4/s;

    .line 12
    .line 13
    invoke-virtual {v2}, Lr4/s;->a()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lk0/e0;

    .line 18
    .line 19
    new-instance v3, Lk0/l;

    .line 20
    .line 21
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-direct {v3, p1, v0, v2, v4}, Lk0/l;-><init>(Lf4/p;Lo4/l;Lk0/e0;Lw3/h;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lk0/d0;->h:Lr1/h;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Lr1/h;->q(Lk0/m;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget-object p1, Lo4/z0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    instance-of v2, p1, Lo4/o0;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    instance-of p2, p1, Lo4/n;

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, Lo4/w;->n(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    check-cast p1, Lo4/n;

    .line 53
    .line 54
    iget-object p1, p1, Lo4/n;->a:Ljava/lang/Throwable;

    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-virtual {v0, p1}, Lo4/z0;->O(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-ltz p1, :cond_0

    .line 62
    .line 63
    new-instance p1, Lo4/w0;

    .line 64
    .line 65
    invoke-static {p2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-direct {p1, p2, v0}, Lo4/w0;-><init>(Lw3/c;Lo4/l;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lo4/f;->r()V

    .line 73
    .line 74
    .line 75
    new-instance p2, Lo4/h;

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {p2, p1, v2}, Lo4/h;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1, p2}, Lo4/w;->h(Lo4/r0;ZLo4/v0;)Lo4/f0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance v0, Lo4/g0;

    .line 86
    .line 87
    invoke-direct {v0, p2}, Lo4/g0;-><init>(Lo4/f0;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Lo4/f;->t(Lo4/d1;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lo4/f;->q()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 98
    .line 99
    :goto_0
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 100
    .line 101
    return-object p1
.end method

.method public final j(Ljava/lang/Object;Ly3/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "Unable to rename "

    .line 2
    .line 3
    instance-of v1, p2, Lk0/c0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lk0/c0;

    .line 9
    .line 10
    iget v2, v1, Lk0/c0;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lk0/c0;->m:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lk0/c0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lk0/c0;-><init>(Lk0/d0;Ly3/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lk0/c0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lx3/a;->g:Lx3/a;

    .line 30
    .line 31
    iget v3, v1, Lk0/c0;->m:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget-object p1, v1, Lk0/c0;->j:Ljava/io/FileOutputStream;

    .line 39
    .line 40
    iget-object v2, v1, Lk0/c0;->i:Ljava/io/FileOutputStream;

    .line 41
    .line 42
    iget-object v3, v1, Lk0/c0;->h:Ljava/io/File;

    .line 43
    .line 44
    iget-object v1, v1, Lk0/c0;->g:Lk0/d0;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lk0/d0;->b()Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    :goto_1
    new-instance v3, Ljava/io/File;

    .line 89
    .line 90
    invoke-virtual {p0}, Lk0/d0;->b()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    new-instance v5, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lk0/d0;->d:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    .line 119
    .line 120
    invoke-direct {p2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 121
    .line 122
    .line 123
    :try_start_2
    iget-object v5, p0, Lk0/d0;->b:Lk0/i;

    .line 124
    .line 125
    new-instance v6, Lk0/n;

    .line 126
    .line 127
    invoke-direct {v6, p2}, Lk0/n;-><init>(Ljava/io/FileOutputStream;)V

    .line 128
    .line 129
    .line 130
    iput-object p0, v1, Lk0/c0;->g:Lk0/d0;

    .line 131
    .line 132
    iput-object v3, v1, Lk0/c0;->h:Ljava/io/File;

    .line 133
    .line 134
    iput-object p2, v1, Lk0/c0;->i:Ljava/io/FileOutputStream;

    .line 135
    .line 136
    iput-object p2, v1, Lk0/c0;->j:Ljava/io/FileOutputStream;

    .line 137
    .line 138
    iput v4, v1, Lk0/c0;->m:I

    .line 139
    .line 140
    invoke-interface {v5, p1, v6, v1}, Lk0/i;->writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lw3/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    if-ne p1, v2, :cond_4

    .line 145
    .line 146
    return-object v2

    .line 147
    :cond_4
    move-object v1, p0

    .line 148
    move-object p1, p2

    .line 149
    move-object v2, p1

    .line 150
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    .line 156
    .line 157
    const/4 p1, 0x0

    .line 158
    :try_start_4
    invoke-static {v2, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lk0/d0;->b()Ljava/io/File;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v3, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 166
    .line 167
    .line 168
    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 169
    if-eqz p1, :cond_5

    .line 170
    .line 171
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_5
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    .line 175
    .line 176
    new-instance p2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 185
    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 197
    :catch_0
    move-exception p1

    .line 198
    goto :goto_4

    .line 199
    :catchall_1
    move-exception p1

    .line 200
    move-object v2, p2

    .line 201
    :goto_3
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 202
    :catchall_2
    move-exception p2

    .line 203
    :try_start_7
    invoke-static {v2, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    throw p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 207
    :goto_4
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-eqz p2, :cond_6

    .line 212
    .line 213
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 214
    .line 215
    .line 216
    :cond_6
    throw p1

    .line 217
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 218
    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v1, "Unable to create parent directories of "

    .line 222
    .line 223
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p1
.end method
