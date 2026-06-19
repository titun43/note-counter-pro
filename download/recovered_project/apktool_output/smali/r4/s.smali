.class public final Lr4/s;
.super Ls4/b;
.source "SourceFile"

# interfaces
.implements Lr4/q;
.implements Lr4/b;
.implements Ls4/f;


# static fields
.field public static final synthetic k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public j:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Lr4/s;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lr4/s;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/s;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lr4/s;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ls4/i;->a:Landroidx/emoji2/text/r;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 5
    .line 6
    return-object p1
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ls4/i;->a:Landroidx/emoji2/text/r;

    .line 4
    .line 5
    :cond_0
    monitor-enter p0

    .line 6
    :try_start_0
    sget-object v0, Lr4/s;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :cond_1
    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lr4/s;->j:I

    .line 24
    .line 25
    and-int/lit8 v0, p1, 0x1

    .line 26
    .line 27
    if-nez v0, :cond_b

    .line 28
    .line 29
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    iput p1, p0, Lr4/s;->j:I

    .line 32
    .line 33
    iget-object v0, p0, Ls4/b;->g:[Lr4/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    :goto_0
    if-eqz v0, :cond_9

    .line 37
    .line 38
    array-length v1, v0

    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_1
    if-ge v2, v1, :cond_9

    .line 41
    .line 42
    aget-object v3, v0, v2

    .line 43
    .line 44
    if-eqz v3, :cond_8

    .line 45
    .line 46
    iget-object v3, v3, Lr4/u;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    :goto_2
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-nez v4, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    sget-object v5, Lr4/t;->b:Landroidx/emoji2/text/r;

    .line 56
    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    sget-object v6, Lr4/t;->a:Landroidx/emoji2/text/r;

    .line 61
    .line 62
    if-ne v4, v6, :cond_6

    .line 63
    .line 64
    :cond_4
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-eq v6, v4, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    invoke-virtual {v3, v4, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_7

    .line 83
    .line 84
    check-cast v4, Lo4/f;

    .line 85
    .line 86
    sget-object v3, Lt3/h;->a:Lt3/h;

    .line 87
    .line 88
    invoke-virtual {v4, v3}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_7
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eq v5, v4, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_8
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_9
    monitor-enter p0

    .line 103
    :try_start_2
    iget v0, p0, Lr4/s;->j:I

    .line 104
    .line 105
    if-ne v0, p1, :cond_a

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x1

    .line 108
    .line 109
    iput p1, p0, Lr4/s;->j:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    monitor-exit p0

    .line 112
    return-void

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    goto :goto_4

    .line 115
    :cond_a
    :try_start_3
    iget-object p1, p0, Ls4/b;->g:[Lr4/u;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    .line 117
    monitor-exit p0

    .line 118
    move v7, v0

    .line 119
    move-object v0, p1

    .line 120
    move p1, v7

    .line 121
    goto :goto_0

    .line 122
    :goto_4
    monitor-exit p0

    .line 123
    throw p1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_5

    .line 126
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 127
    .line 128
    :try_start_4
    iput p1, p0, Lr4/s;->j:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    .line 130
    monitor-exit p0

    .line 131
    return-void

    .line 132
    :goto_5
    monitor-exit p0

    .line 133
    throw p1
.end method

.method public final d(Lw3/h;Lq4/a;)Lr4/b;
    .locals 2

    .line 1
    sget-object v0, Lq4/a;->g:Lq4/a;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ls4/d;

    .line 7
    .line 8
    const/4 v1, -0x3

    .line 9
    invoke-direct {v0, p0, p1, v1, p2}, Ls4/d;-><init>(Lr4/b;Lw3/h;ILq4/a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final j(Lr4/c;Lw3/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lr4/r;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lr4/r;

    .line 11
    .line 12
    iget v3, v2, Lr4/r;->n:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lr4/r;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lr4/r;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lr4/r;-><init>(Lr4/s;Lw3/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lr4/r;->l:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lx3/a;->g:Lx3/a;

    .line 32
    .line 33
    iget v4, v2, Lr4/r;->n:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v9, :cond_3

    .line 43
    .line 44
    if-eq v4, v8, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    iget-object v4, v2, Lr4/r;->k:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v10, v2, Lr4/r;->j:Lo4/r0;

    .line 51
    .line 52
    iget-object v11, v2, Lr4/r;->i:Lr4/u;

    .line 53
    .line 54
    iget-object v12, v2, Lr4/r;->h:Lr4/c;

    .line 55
    .line 56
    iget-object v13, v2, Lr4/r;->g:Lr4/s;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    move-object v0, v4

    .line 62
    goto/16 :goto_b

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_c

    .line 66
    .line 67
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    iget-object v4, v2, Lr4/r;->k:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v10, v2, Lr4/r;->j:Lo4/r0;

    .line 78
    .line 79
    iget-object v11, v2, Lr4/r;->i:Lr4/u;

    .line 80
    .line 81
    iget-object v12, v2, Lr4/r;->h:Lr4/c;

    .line 82
    .line 83
    iget-object v13, v2, Lr4/r;->g:Lr4/s;

    .line 84
    .line 85
    :try_start_1
    invoke-static {v0}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    goto/16 :goto_7

    .line 89
    .line 90
    :cond_3
    iget-object v11, v2, Lr4/r;->i:Lr4/u;

    .line 91
    .line 92
    iget-object v4, v2, Lr4/r;->h:Lr4/c;

    .line 93
    .line 94
    iget-object v13, v2, Lr4/r;->g:Lr4/s;

    .line 95
    .line 96
    :try_start_2
    invoke-static {v0}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    invoke-static {v0}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    monitor-enter p0

    .line 104
    :try_start_3
    iget-object v0, v1, Ls4/b;->g:[Lr4/u;

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    new-array v0, v8, [Lr4/u;

    .line 109
    .line 110
    iput-object v0, v1, Ls4/b;->g:[Lr4/u;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto/16 :goto_f

    .line 115
    .line 116
    :cond_5
    iget v4, v1, Ls4/b;->h:I

    .line 117
    .line 118
    array-length v10, v0

    .line 119
    if-lt v4, v10, :cond_6

    .line 120
    .line 121
    array-length v4, v0

    .line 122
    mul-int/2addr v4, v8

    .line 123
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v4, "copyOf(...)"

    .line 128
    .line 129
    invoke-static {v0, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v4, v0

    .line 133
    check-cast v4, [Lr4/u;

    .line 134
    .line 135
    iput-object v4, v1, Ls4/b;->g:[Lr4/u;

    .line 136
    .line 137
    check-cast v0, [Lr4/u;

    .line 138
    .line 139
    :cond_6
    :goto_1
    iget v4, v1, Ls4/b;->i:I

    .line 140
    .line 141
    :goto_2
    aget-object v10, v0, v4

    .line 142
    .line 143
    if-nez v10, :cond_7

    .line 144
    .line 145
    new-instance v10, Lr4/u;

    .line 146
    .line 147
    invoke-direct {v10}, Lr4/u;-><init>()V

    .line 148
    .line 149
    .line 150
    aput-object v10, v0, v4

    .line 151
    .line 152
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    array-length v11, v0

    .line 155
    if-lt v4, v11, :cond_8

    .line 156
    .line 157
    move v4, v7

    .line 158
    :cond_8
    iget-object v11, v10, Lr4/u;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 159
    .line 160
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    if-eqz v12, :cond_9

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_9
    sget-object v0, Lr4/t;->a:Landroidx/emoji2/text/r;

    .line 168
    .line 169
    invoke-virtual {v11, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iput v4, v1, Ls4/b;->i:I

    .line 173
    .line 174
    iget v0, v1, Ls4/b;->h:I

    .line 175
    .line 176
    add-int/2addr v0, v9

    .line 177
    iput v0, v1, Ls4/b;->h:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    .line 179
    monitor-exit p0

    .line 180
    move-object/from16 v4, p1

    .line 181
    .line 182
    move-object v13, v1

    .line 183
    move-object v11, v10

    .line 184
    :goto_3
    :try_start_4
    invoke-interface {v2}, Lw3/c;->getContext()Lw3/h;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sget-object v10, Lo4/s;->h:Lo4/s;

    .line 189
    .line 190
    invoke-interface {v0, v10}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Lo4/r0;

    .line 195
    .line 196
    move-object v10, v0

    .line 197
    move-object v12, v4

    .line 198
    move-object v0, v6

    .line 199
    :goto_4
    sget-object v4, Lr4/s;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 200
    .line 201
    invoke-virtual {v4, v13}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    if-eqz v10, :cond_b

    .line 206
    .line 207
    invoke-interface {v10}, Lo4/r0;->a()Z

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    if-eqz v14, :cond_a

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_a
    invoke-interface {v10}, Lo4/r0;->g()Ljava/util/concurrent/CancellationException;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    throw v0

    .line 219
    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    .line 220
    .line 221
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-nez v14, :cond_f

    .line 226
    .line 227
    :cond_c
    sget-object v0, Ls4/i;->a:Landroidx/emoji2/text/r;

    .line 228
    .line 229
    if-ne v4, v0, :cond_d

    .line 230
    .line 231
    move-object v0, v6

    .line 232
    goto :goto_6

    .line 233
    :cond_d
    move-object v0, v4

    .line 234
    :goto_6
    iput-object v13, v2, Lr4/r;->g:Lr4/s;

    .line 235
    .line 236
    iput-object v12, v2, Lr4/r;->h:Lr4/c;

    .line 237
    .line 238
    iput-object v11, v2, Lr4/r;->i:Lr4/u;

    .line 239
    .line 240
    iput-object v10, v2, Lr4/r;->j:Lo4/r0;

    .line 241
    .line 242
    iput-object v4, v2, Lr4/r;->k:Ljava/lang/Object;

    .line 243
    .line 244
    iput v8, v2, Lr4/r;->n:I

    .line 245
    .line 246
    invoke-interface {v12, v0, v2}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-ne v0, v3, :cond_e

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_e
    :goto_7
    move-object v0, v4

    .line 254
    :cond_f
    iget-object v4, v11, Lr4/u;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 255
    .line 256
    sget-object v14, Lr4/t;->a:Landroidx/emoji2/text/r;

    .line 257
    .line 258
    invoke-virtual {v4, v14}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v4}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    sget-object v15, Lr4/t;->b:Landroidx/emoji2/text/r;

    .line 266
    .line 267
    if-ne v4, v15, :cond_10

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_10
    iput-object v13, v2, Lr4/r;->g:Lr4/s;

    .line 271
    .line 272
    iput-object v12, v2, Lr4/r;->h:Lr4/c;

    .line 273
    .line 274
    iput-object v11, v2, Lr4/r;->i:Lr4/u;

    .line 275
    .line 276
    iput-object v10, v2, Lr4/r;->j:Lo4/r0;

    .line 277
    .line 278
    iput-object v0, v2, Lr4/r;->k:Ljava/lang/Object;

    .line 279
    .line 280
    iput v5, v2, Lr4/r;->n:I

    .line 281
    .line 282
    sget-object v4, Lt3/h;->a:Lt3/h;

    .line 283
    .line 284
    new-instance v15, Lo4/f;

    .line 285
    .line 286
    invoke-static {v2}, La/a;->o(Lw3/c;)Lw3/c;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-direct {v15, v9, v5}, Lo4/f;-><init>(ILw3/c;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v15}, Lo4/f;->r()V

    .line 294
    .line 295
    .line 296
    iget-object v5, v11, Lr4/u;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 297
    .line 298
    :goto_8
    invoke-virtual {v5, v14, v15}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v16

    .line 302
    if-eqz v16, :cond_11

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_11
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    if-eq v8, v14, :cond_14

    .line 310
    .line 311
    invoke-virtual {v15, v4}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :goto_9
    invoke-virtual {v15}, Lo4/f;->q()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    sget-object v8, Lx3/a;->g:Lx3/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 319
    .line 320
    if-ne v5, v8, :cond_12

    .line 321
    .line 322
    move-object v4, v5

    .line 323
    :cond_12
    if-ne v4, v3, :cond_13

    .line 324
    .line 325
    :goto_a
    return-object v3

    .line 326
    :cond_13
    :goto_b
    const/4 v5, 0x3

    .line 327
    const/4 v8, 0x2

    .line 328
    goto/16 :goto_4

    .line 329
    .line 330
    :cond_14
    const/4 v8, 0x2

    .line 331
    goto :goto_8

    .line 332
    :goto_c
    monitor-enter v13

    .line 333
    :try_start_5
    iget v2, v13, Ls4/b;->h:I

    .line 334
    .line 335
    add-int/lit8 v2, v2, -0x1

    .line 336
    .line 337
    iput v2, v13, Ls4/b;->h:I

    .line 338
    .line 339
    if-nez v2, :cond_15

    .line 340
    .line 341
    iput v7, v13, Ls4/b;->i:I

    .line 342
    .line 343
    goto :goto_d

    .line 344
    :catchall_2
    move-exception v0

    .line 345
    goto :goto_e

    .line 346
    :cond_15
    :goto_d
    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    .line 347
    .line 348
    invoke-static {v11, v2}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    iget-object v2, v11, Lr4/u;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 352
    .line 353
    invoke-virtual {v2, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 354
    .line 355
    .line 356
    monitor-exit v13

    .line 357
    throw v0

    .line 358
    :goto_e
    monitor-exit v13

    .line 359
    throw v0

    .line 360
    :goto_f
    monitor-exit p0

    .line 361
    throw v0
.end method
