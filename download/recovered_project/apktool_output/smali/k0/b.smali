.class public final Lk0/b;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf4/p;Ljava/lang/Object;Lw3/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk0/b;->g:I

    .line 1
    iput-object p1, p0, Lk0/b;->j:Ljava/lang/Object;

    iput-object p2, p0, Lk0/b;->i:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 2
    iput p4, p0, Lk0/b;->g:I

    iput-object p1, p0, Lk0/b;->i:Ljava/lang/Object;

    iput-object p2, p0, Lk0/b;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 3
    iput p3, p0, Lk0/b;->g:I

    iput-object p1, p0, Lk0/b;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget v0, p0, Lk0/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lk0/b;

    .line 7
    .line 8
    iget-object v0, p0, Lk0/b;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lv0/a;

    .line 11
    .line 12
    iget-object v1, p0, Lk0/b;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lx0/a;

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-direct {p1, v0, v1, p2, v2}, Lk0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    new-instance p1, Lk0/b;

    .line 22
    .line 23
    iget-object v0, p0, Lk0/b;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lu0/a;

    .line 26
    .line 27
    iget-object v1, p0, Lk0/b;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Landroid/net/Uri;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {p1, v0, v1, p2, v2}, Lk0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    new-instance p1, Lk0/b;

    .line 37
    .line 38
    iget-object v0, p0, Lk0/b;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lf4/p;

    .line 41
    .line 42
    iget-object v1, p0, Lk0/b;->i:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {p1, v0, v1, p2}, Lk0/b;-><init>(Lf4/p;Ljava/lang/Object;Lw3/c;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_2
    new-instance p1, Lk0/b;

    .line 49
    .line 50
    iget-object v0, p0, Lk0/b;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lr1/h;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {p1, v0, p2, v1}, Lk0/b;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_3
    new-instance v0, Lk0/b;

    .line 60
    .line 61
    iget-object v1, p0, Lk0/b;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/List;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-direct {v0, v1, p2, v2}, Lk0/b;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v0, Lk0/b;->i:Ljava/lang/Object;

    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk0/b;->g:I

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
    invoke-virtual {p0, p1, p2}, Lk0/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk0/b;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lo4/t;

    .line 24
    .line 25
    check-cast p2, Lw3/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lk0/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lk0/b;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lk0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lo4/t;

    .line 41
    .line 42
    check-cast p2, Lw3/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lk0/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lk0/b;

    .line 49
    .line 50
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lk0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Lo4/t;

    .line 58
    .line 59
    check-cast p2, Lw3/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lk0/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lk0/b;

    .line 66
    .line 67
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lk0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_3
    check-cast p1, Lk0/w;

    .line 75
    .line 76
    check-cast p2, Lw3/c;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lk0/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lk0/b;

    .line 83
    .line 84
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lk0/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lk0/b;->g:I

    .line 4
    .line 5
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 6
    .line 7
    iget-object v3, v1, Lk0/b;->j:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 16
    .line 17
    iget v2, v1, Lk0/b;->h:I

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lv0/a;

    .line 41
    .line 42
    iget-object v2, v2, Lv0/a;->a:Lx0/g;

    .line 43
    .line 44
    check-cast v3, Lx0/a;

    .line 45
    .line 46
    iput v5, v1, Lk0/b;->h:I

    .line 47
    .line 48
    invoke-virtual {v2, v3, v1}, Lx0/g;->b(Lx0/a;Lw3/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-ne v2, v0, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v0, v2

    .line 56
    :goto_0
    return-object v0

    .line 57
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 58
    .line 59
    iget v6, v1, Lk0/b;->h:I

    .line 60
    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    if-ne v6, v5, :cond_3

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_4
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v4, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lu0/a;

    .line 81
    .line 82
    iget-object v4, v4, Lu0/a;->a:Lw0/b;

    .line 83
    .line 84
    check-cast v3, Landroid/net/Uri;

    .line 85
    .line 86
    iput v5, v1, Lk0/b;->h:I

    .line 87
    .line 88
    invoke-virtual {v4, v3, v1}, Lw0/b;->d(Landroid/net/Uri;Lw3/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-ne v3, v0, :cond_5

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    :cond_5
    :goto_1
    return-object v2

    .line 96
    :pswitch_1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 97
    .line 98
    iget v2, v1, Lk0/b;->h:I

    .line 99
    .line 100
    if-eqz v2, :cond_7

    .line 101
    .line 102
    if-ne v2, v5, :cond_6

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, p1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_7
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast v3, Lf4/p;

    .line 120
    .line 121
    iget-object v2, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 122
    .line 123
    iput v5, v1, Lk0/b;->h:I

    .line 124
    .line 125
    invoke-interface {v3, v2, v1}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-ne v2, v0, :cond_8

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_8
    move-object v0, v2

    .line 133
    :goto_2
    return-object v0

    .line 134
    :pswitch_2
    check-cast v3, Lr1/h;

    .line 135
    .line 136
    iget-object v0, v3, Lr1/h;->j:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 139
    .line 140
    sget-object v6, Lx3/a;->g:Lx3/a;

    .line 141
    .line 142
    iget v7, v1, Lk0/b;->h:I

    .line 143
    .line 144
    const/4 v9, 0x2

    .line 145
    if-eqz v7, :cond_c

    .line 146
    .line 147
    if-eq v7, v5, :cond_a

    .line 148
    .line 149
    if-ne v7, v9, :cond_9

    .line 150
    .line 151
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object/from16 v18, v0

    .line 155
    .line 156
    move-object/from16 v17, v3

    .line 157
    .line 158
    move v5, v9

    .line 159
    const/4 v3, 0x0

    .line 160
    move-object v9, v2

    .line 161
    move-object v2, v6

    .line 162
    goto/16 :goto_e

    .line 163
    .line 164
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_a
    iget-object v4, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v4, Lk0/p;

    .line 173
    .line 174
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v18, v0

    .line 178
    .line 179
    move-object v9, v2

    .line 180
    move-object/from16 v17, v3

    .line 181
    .line 182
    move-object v2, v6

    .line 183
    move-object/from16 v0, p1

    .line 184
    .line 185
    :cond_b
    const/4 v3, 0x0

    .line 186
    goto/16 :goto_d

    .line 187
    .line 188
    :cond_c
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-lez v4, :cond_20

    .line 196
    .line 197
    :goto_3
    iget-object v4, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v4, Lo4/t;

    .line 200
    .line 201
    invoke-interface {v4}, Lo4/t;->k()Lw3/h;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v4}, Lo4/w;->c(Lw3/h;)V

    .line 206
    .line 207
    .line 208
    iget-object v4, v3, Lr1/h;->h:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v4, Lk0/p;

    .line 211
    .line 212
    iget-object v7, v3, Lr1/h;->i:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v10, v7

    .line 215
    check-cast v10, Lq4/c;

    .line 216
    .line 217
    iput-object v4, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 218
    .line 219
    iput v5, v1, Lk0/b;->h:I

    .line 220
    .line 221
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    sget-object v7, Lq4/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 225
    .line 226
    sget-object v11, Lq4/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 227
    .line 228
    sget-object v12, Lq4/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 229
    .line 230
    invoke-virtual {v12, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    check-cast v13, Lq4/k;

    .line 235
    .line 236
    :goto_4
    invoke-virtual {v7, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v14

    .line 240
    invoke-virtual {v10, v14, v15, v5}, Lq4/c;->s(JZ)Z

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-nez v14, :cond_1f

    .line 245
    .line 246
    invoke-virtual {v11, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 247
    .line 248
    .line 249
    move-result-wide v14

    .line 250
    sget v9, Lq4/e;->b:I

    .line 251
    .line 252
    int-to-long v8, v9

    .line 253
    move-object/from16 v16, v6

    .line 254
    .line 255
    div-long v5, v14, v8

    .line 256
    .line 257
    rem-long v8, v14, v8

    .line 258
    .line 259
    long-to-int v8, v8

    .line 260
    move-object v9, v2

    .line 261
    move-object/from16 v17, v3

    .line 262
    .line 263
    iget-wide v2, v13, Lt4/s;->c:J

    .line 264
    .line 265
    cmp-long v2, v2, v5

    .line 266
    .line 267
    if-eqz v2, :cond_e

    .line 268
    .line 269
    invoke-virtual {v10, v5, v6, v13}, Lq4/c;->l(JLq4/k;)Lq4/k;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    if-nez v2, :cond_d

    .line 274
    .line 275
    move-object v2, v9

    .line 276
    move-object/from16 v6, v16

    .line 277
    .line 278
    move-object/from16 v3, v17

    .line 279
    .line 280
    const/4 v5, 0x1

    .line 281
    :goto_5
    const/4 v9, 0x2

    .line 282
    goto :goto_4

    .line 283
    :cond_d
    move-object v13, v2

    .line 284
    :cond_e
    move-wide v2, v14

    .line 285
    const/4 v15, 0x0

    .line 286
    move-wide/from16 v19, v2

    .line 287
    .line 288
    move-object v2, v11

    .line 289
    move-object v11, v13

    .line 290
    move-wide/from16 v13, v19

    .line 291
    .line 292
    move-object v3, v12

    .line 293
    move v12, v8

    .line 294
    invoke-virtual/range {v10 .. v15}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    sget-object v6, Lq4/e;->m:Landroidx/emoji2/text/r;

    .line 299
    .line 300
    const-string v8, "unexpected"

    .line 301
    .line 302
    if-eq v5, v6, :cond_1e

    .line 303
    .line 304
    sget-object v15, Lq4/e;->o:Landroidx/emoji2/text/r;

    .line 305
    .line 306
    if-ne v5, v15, :cond_10

    .line 307
    .line 308
    invoke-virtual {v10}, Lq4/c;->q()J

    .line 309
    .line 310
    .line 311
    move-result-wide v5

    .line 312
    cmp-long v5, v13, v5

    .line 313
    .line 314
    if-gez v5, :cond_f

    .line 315
    .line 316
    invoke-virtual {v11}, Lt4/c;->a()V

    .line 317
    .line 318
    .line 319
    :cond_f
    move-object v12, v3

    .line 320
    move-object v13, v11

    .line 321
    move-object/from16 v6, v16

    .line 322
    .line 323
    move-object/from16 v3, v17

    .line 324
    .line 325
    const/4 v5, 0x1

    .line 326
    move-object v11, v2

    .line 327
    move-object v2, v9

    .line 328
    goto :goto_5

    .line 329
    :cond_10
    move-object/from16 v18, v0

    .line 330
    .line 331
    sget-object v0, Lq4/e;->n:Landroidx/emoji2/text/r;

    .line 332
    .line 333
    if-ne v5, v0, :cond_1b

    .line 334
    .line 335
    invoke-static {v1}, La/a;->o(Lw3/c;)Lw3/c;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v0}, Lo4/w;->f(Lw3/c;)Lo4/f;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    move-object v0, v15

    .line 344
    move-object v15, v5

    .line 345
    :try_start_0
    invoke-virtual/range {v10 .. v15}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    if-ne v5, v6, :cond_11

    .line 350
    .line 351
    invoke-virtual {v15, v11, v12}, Lo4/f;->a(Lt4/s;I)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_9

    .line 355
    .line 356
    :catchall_0
    move-exception v0

    .line 357
    goto/16 :goto_b

    .line 358
    .line 359
    :cond_11
    if-ne v5, v0, :cond_1a

    .line 360
    .line 361
    invoke-virtual {v10}, Lq4/c;->q()J

    .line 362
    .line 363
    .line 364
    move-result-wide v5

    .line 365
    cmp-long v0, v13, v5

    .line 366
    .line 367
    if-gez v0, :cond_12

    .line 368
    .line 369
    invoke-virtual {v11}, Lt4/c;->a()V

    .line 370
    .line 371
    .line 372
    :cond_12
    invoke-virtual {v3, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v0, Lq4/k;

    .line 377
    .line 378
    :goto_6
    invoke-virtual {v7, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 379
    .line 380
    .line 381
    move-result-wide v5

    .line 382
    const/4 v3, 0x1

    .line 383
    invoke-virtual {v10, v5, v6, v3}, Lq4/c;->s(JZ)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_13

    .line 388
    .line 389
    invoke-virtual {v10}, Lq4/c;->o()Ljava/lang/Throwable;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v0}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v15, v0}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto :goto_9

    .line 401
    :cond_13
    invoke-virtual {v2, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 402
    .line 403
    .line 404
    move-result-wide v13

    .line 405
    sget v3, Lq4/e;->b:I

    .line 406
    .line 407
    int-to-long v5, v3

    .line 408
    div-long v11, v13, v5

    .line 409
    .line 410
    rem-long v5, v13, v5

    .line 411
    .line 412
    long-to-int v3, v5

    .line 413
    iget-wide v5, v0, Lt4/s;->c:J

    .line 414
    .line 415
    cmp-long v5, v5, v11

    .line 416
    .line 417
    if-eqz v5, :cond_15

    .line 418
    .line 419
    invoke-virtual {v10, v11, v12, v0}, Lq4/c;->l(JLq4/k;)Lq4/k;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    if-nez v5, :cond_14

    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_14
    move-object v11, v5

    .line 427
    :goto_7
    move v12, v3

    .line 428
    goto :goto_8

    .line 429
    :cond_15
    move-object v11, v0

    .line 430
    goto :goto_7

    .line 431
    :goto_8
    invoke-virtual/range {v10 .. v15}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    move-object v5, v11

    .line 436
    sget-object v3, Lq4/e;->m:Landroidx/emoji2/text/r;

    .line 437
    .line 438
    if-ne v0, v3, :cond_16

    .line 439
    .line 440
    invoke-virtual {v15, v5, v12}, Lo4/f;->a(Lt4/s;I)V

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_16
    sget-object v3, Lq4/e;->o:Landroidx/emoji2/text/r;

    .line 445
    .line 446
    if-ne v0, v3, :cond_18

    .line 447
    .line 448
    invoke-virtual {v10}, Lq4/c;->q()J

    .line 449
    .line 450
    .line 451
    move-result-wide v11

    .line 452
    cmp-long v0, v13, v11

    .line 453
    .line 454
    if-gez v0, :cond_17

    .line 455
    .line 456
    invoke-virtual {v5}, Lt4/c;->a()V

    .line 457
    .line 458
    .line 459
    :cond_17
    move-object v0, v5

    .line 460
    goto :goto_6

    .line 461
    :cond_18
    sget-object v2, Lq4/e;->n:Landroidx/emoji2/text/r;

    .line 462
    .line 463
    if-eq v0, v2, :cond_19

    .line 464
    .line 465
    invoke-virtual {v5}, Lt4/c;->a()V

    .line 466
    .line 467
    .line 468
    const/4 v2, 0x0

    .line 469
    invoke-virtual {v15, v0, v2}, Lo4/f;->y(Ljava/lang/Object;Lf4/q;)V

    .line 470
    .line 471
    .line 472
    goto :goto_9

    .line 473
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 474
    .line 475
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v0

    .line 479
    :cond_1a
    invoke-virtual {v11}, Lt4/c;->a()V

    .line 480
    .line 481
    .line 482
    const/4 v2, 0x0

    .line 483
    invoke-virtual {v15, v5, v2}, Lo4/f;->y(Ljava/lang/Object;Lf4/q;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 484
    .line 485
    .line 486
    :goto_9
    invoke-virtual {v15}, Lo4/f;->q()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    sget-object v2, Lx3/a;->g:Lx3/a;

    .line 491
    .line 492
    :goto_a
    move-object/from16 v2, v16

    .line 493
    .line 494
    goto :goto_c

    .line 495
    :goto_b
    invoke-virtual {v15}, Lo4/f;->x()V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :cond_1b
    invoke-virtual {v11}, Lt4/c;->a()V

    .line 500
    .line 501
    .line 502
    move-object v0, v5

    .line 503
    goto :goto_a

    .line 504
    :goto_c
    if-ne v0, v2, :cond_b

    .line 505
    .line 506
    goto :goto_f

    .line 507
    :goto_d
    iput-object v3, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 508
    .line 509
    const/4 v5, 0x2

    .line 510
    iput v5, v1, Lk0/b;->h:I

    .line 511
    .line 512
    invoke-interface {v4, v0, v1}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    if-ne v0, v2, :cond_1c

    .line 517
    .line 518
    goto :goto_f

    .line 519
    :cond_1c
    :goto_e
    invoke-virtual/range {v18 .. v18}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-nez v0, :cond_1d

    .line 524
    .line 525
    move-object v2, v9

    .line 526
    :goto_f
    return-object v2

    .line 527
    :cond_1d
    move-object v6, v2

    .line 528
    move-object v2, v9

    .line 529
    move-object/from16 v3, v17

    .line 530
    .line 531
    move-object/from16 v0, v18

    .line 532
    .line 533
    move v9, v5

    .line 534
    const/4 v5, 0x1

    .line 535
    goto/16 :goto_3

    .line 536
    .line 537
    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 538
    .line 539
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    throw v0

    .line 543
    :cond_1f
    invoke-virtual {v10}, Lq4/c;->o()Ljava/lang/Throwable;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    sget v2, Lt4/t;->a:I

    .line 548
    .line 549
    throw v0

    .line 550
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 551
    .line 552
    const-string v2, "Check failed."

    .line 553
    .line 554
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v0

    .line 558
    :pswitch_3
    move-object v9, v2

    .line 559
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 560
    .line 561
    iget v2, v1, Lk0/b;->h:I

    .line 562
    .line 563
    const/4 v5, 0x1

    .line 564
    if-eqz v2, :cond_22

    .line 565
    .line 566
    if-ne v2, v5, :cond_21

    .line 567
    .line 568
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    goto :goto_10

    .line 572
    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 573
    .line 574
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v0

    .line 578
    :cond_22
    invoke-static/range {p1 .. p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    iget-object v2, v1, Lk0/b;->i:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v2, Lk0/w;

    .line 584
    .line 585
    check-cast v3, Ljava/util/List;

    .line 586
    .line 587
    iput v5, v1, Lk0/b;->h:I

    .line 588
    .line 589
    invoke-static {v3, v2, v1}, La/a;->c(Ljava/util/List;Lk0/w;Ly3/c;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    if-ne v2, v0, :cond_23

    .line 594
    .line 595
    move-object v2, v0

    .line 596
    goto :goto_11

    .line 597
    :cond_23
    :goto_10
    move-object v2, v9

    .line 598
    :goto_11
    return-object v2

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
