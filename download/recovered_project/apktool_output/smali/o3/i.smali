.class public final Lo3/i;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr3/z;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk1/j;Landroid/net/Uri;Lr3/z;Lw3/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo3/i;->g:I

    .line 1
    iput-object p1, p0, Lo3/i;->k:Ljava/lang/Object;

    iput-object p2, p0, Lo3/i;->l:Ljava/lang/Object;

    iput-object p3, p0, Lo3/i;->j:Lr3/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public constructor <init>(Lr3/z;Lo3/k;Lb3/g;Lw3/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo3/i;->g:I

    .line 2
    iput-object p1, p0, Lo3/i;->j:Lr3/z;

    iput-object p2, p0, Lo3/i;->k:Ljava/lang/Object;

    iput-object p3, p0, Lo3/i;->l:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 4

    .line 1
    iget v0, p0, Lo3/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lo3/i;

    .line 7
    .line 8
    iget-object v1, p0, Lo3/i;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lk1/j;

    .line 11
    .line 12
    iget-object v2, p0, Lo3/i;->l:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v3, p0, Lo3/i;->j:Lr3/z;

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3, p2}, Lo3/i;-><init>(Lk1/j;Landroid/net/Uri;Lr3/z;Lw3/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lo3/i;->i:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    new-instance v0, Lo3/i;

    .line 25
    .line 26
    iget-object v1, p0, Lo3/i;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lo3/k;

    .line 29
    .line 30
    iget-object v2, p0, Lo3/i;->l:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lb3/g;

    .line 33
    .line 34
    iget-object v3, p0, Lo3/i;->j:Lr3/z;

    .line 35
    .line 36
    invoke-direct {v0, v3, v1, v2, p2}, Lo3/i;-><init>(Lr3/z;Lo3/k;Lb3/g;Lw3/c;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v0, Lo3/i;->i:Ljava/lang/Object;

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lo3/i;->g:I

    .line 2
    .line 3
    check-cast p1, Lr4/c;

    .line 4
    .line 5
    check-cast p2, Lw3/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lo3/i;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lo3/i;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lo3/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lo3/i;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lo3/i;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lo3/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget v0, p0, Lo3/i;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lo3/i;->j:Lr3/z;

    .line 5
    .line 6
    iget-object v3, p0, Lo3/i;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lo3/i;->k:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    sget-object v8, Lt3/h;->a:Lt3/h;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 20
    .line 21
    iget v9, p0, Lo3/i;->h:I

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    if-ne v9, v7, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/io/Closeable;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lr4/c;

    .line 49
    .line 50
    check-cast v4, Lk1/j;

    .line 51
    .line 52
    iget-object v4, v4, Lk1/j;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Landroid/content/ContentResolver;

    .line 55
    .line 56
    check-cast v3, Landroid/net/Uri;

    .line 57
    .line 58
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    :try_start_1
    new-instance v4, Lp3/g;

    .line 65
    .line 66
    invoke-direct {v4, p1, v6, v1}, Lp3/g;-><init>(Lr4/c;Lw3/c;I)V

    .line 67
    .line 68
    .line 69
    iput-object v3, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 70
    .line 71
    iput v7, p0, Lo3/i;->h:I

    .line 72
    .line 73
    const/16 p1, 0x2000

    .line 74
    .line 75
    invoke-static {v3, v2, p1, v4, p0}, Ly4/b;->H(Ljava/io/InputStream;Lr3/z;ILf4/p;Ly3/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    move-object v8, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    move-object v0, v3

    .line 84
    :goto_0
    invoke-static {v0, v6}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object p1, v8

    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    move-object v0, v3

    .line 91
    :goto_1
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 92
    :catchall_2
    move-exception v1

    .line 93
    invoke-static {v0, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_3
    move-object p1, v6

    .line 98
    :goto_2
    if-eqz p1, :cond_4

    .line 99
    .line 100
    :goto_3
    return-object v8

    .line 101
    :cond_4
    new-instance p1, Lr3/s;

    .line 102
    .line 103
    invoke-direct {p1, v6}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :pswitch_0
    check-cast v4, Lo3/k;

    .line 108
    .line 109
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 110
    .line 111
    iget v9, p0, Lo3/i;->h:I

    .line 112
    .line 113
    const/4 v10, 0x2

    .line 114
    if-eqz v9, :cond_7

    .line 115
    .line 116
    if-eq v9, v7, :cond_6

    .line 117
    .line 118
    if-ne v9, v10, :cond_5

    .line 119
    .line 120
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_a

    .line 124
    .line 125
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1

    .line 131
    :cond_6
    iget-object v3, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Lr4/c;

    .line 134
    .line 135
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    check-cast p1, Lt3/e;

    .line 139
    .line 140
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p1, Lr4/c;

    .line 149
    .line 150
    iget v5, v2, Lr3/z;->c:I

    .line 151
    .line 152
    iget v9, v2, Lr3/z;->d:I

    .line 153
    .line 154
    invoke-static {v5, v9}, Lb3/g;->z(II)V

    .line 155
    .line 156
    .line 157
    iget-object v5, v4, Lo3/k;->a:Lr1/h;

    .line 158
    .line 159
    check-cast v3, Lb3/g;

    .line 160
    .line 161
    instance-of v9, v3, Lr3/f0;

    .line 162
    .line 163
    if-eqz v9, :cond_8

    .line 164
    .line 165
    check-cast v3, Lr3/f0;

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    instance-of v9, v3, Lr3/g0;

    .line 169
    .line 170
    if-eqz v9, :cond_12

    .line 171
    .line 172
    check-cast v3, Lr3/g0;

    .line 173
    .line 174
    iput-object p1, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 175
    .line 176
    iput v7, p0, Lo3/i;->h:I

    .line 177
    .line 178
    invoke-virtual {v5, v3, p0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    if-ne v3, v0, :cond_9

    .line 183
    .line 184
    goto/16 :goto_9

    .line 185
    .line 186
    :cond_9
    move-object v11, v3

    .line 187
    move-object v3, p1

    .line 188
    move-object p1, v11

    .line 189
    :goto_4
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-nez v5, :cond_b

    .line 194
    .line 195
    check-cast p1, Lr3/f0;

    .line 196
    .line 197
    move-object v11, v3

    .line 198
    move-object v3, p1

    .line 199
    move-object p1, v11

    .line 200
    :goto_5
    instance-of v5, v3, Lr3/e0;

    .line 201
    .line 202
    if-eqz v5, :cond_c

    .line 203
    .line 204
    move-object v5, v3

    .line 205
    check-cast v5, Lr3/e0;

    .line 206
    .line 207
    iget-object v5, v5, Lr3/e0;->f:Lr3/h0;

    .line 208
    .line 209
    sget-object v7, Lr3/h0;->h:Lr3/h0;

    .line 210
    .line 211
    if-eq v5, v7, :cond_a

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_a
    new-instance v3, Lr3/q;

    .line 215
    .line 216
    invoke-direct {v3}, Lr3/q;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-static {v3}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    goto :goto_6

    .line 224
    :cond_b
    invoke-static {v5}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    move-object v11, v3

    .line 229
    move-object v3, p1

    .line 230
    move-object p1, v11

    .line 231
    :cond_c
    :goto_6
    invoke-static {v3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    if-nez v5, :cond_11

    .line 236
    .line 237
    check-cast v3, Lr3/f0;

    .line 238
    .line 239
    instance-of v5, v3, Lr3/e0;

    .line 240
    .line 241
    if-eqz v5, :cond_d

    .line 242
    .line 243
    iget-object v4, v4, Lo3/k;->b:Lt2/i;

    .line 244
    .line 245
    check-cast v3, Lr3/e0;

    .line 246
    .line 247
    iget-object v3, v3, Lr3/e0;->d:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    const-string v4, "fullPath"

    .line 253
    .line 254
    invoke-static {v3, v4}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    new-instance v4, Lp3/w;

    .line 258
    .line 259
    invoke-direct {v4, v3, v2, v6, v1}, Lp3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 260
    .line 261
    .line 262
    new-instance v1, Lu1/f;

    .line 263
    .line 264
    invoke-direct {v1, v4}, Lu1/f;-><init>(Lf4/p;)V

    .line 265
    .line 266
    .line 267
    sget-object v2, Lo4/e0;->a:Lv4/e;

    .line 268
    .line 269
    sget-object v2, Lv4/d;->i:Lv4/d;

    .line 270
    .line 271
    invoke-static {v1, v2}, Lr4/t;->e(Lu1/f;Lw3/h;)Lr4/b;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    goto :goto_7

    .line 276
    :cond_d
    iget-object v1, v4, Lo3/k;->d:Lk1/j;

    .line 277
    .line 278
    invoke-virtual {v3}, Lr3/f0;->C()Landroid/net/Uri;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    const-string v4, "uri"

    .line 286
    .line 287
    invoke-static {v3, v4}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    new-instance v4, Lo3/i;

    .line 291
    .line 292
    invoke-direct {v4, v1, v3, v2, v6}, Lo3/i;-><init>(Lk1/j;Landroid/net/Uri;Lr3/z;Lw3/c;)V

    .line 293
    .line 294
    .line 295
    new-instance v2, Lu1/f;

    .line 296
    .line 297
    invoke-direct {v2, v4}, Lu1/f;-><init>(Lf4/p;)V

    .line 298
    .line 299
    .line 300
    sget-object v4, Lo4/e0;->a:Lv4/e;

    .line 301
    .line 302
    sget-object v4, Lv4/d;->i:Lv4/d;

    .line 303
    .line 304
    invoke-static {v2, v4}, Lr4/t;->e(Lu1/f;Lw3/h;)Lr4/b;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    new-instance v4, Lp3/h;

    .line 309
    .line 310
    invoke-direct {v4, v1, v3, v6}, Lp3/h;-><init>(Lk1/j;Landroid/net/Uri;Lw3/c;)V

    .line 311
    .line 312
    .line 313
    new-instance v1, Landroidx/emoji2/text/p;

    .line 314
    .line 315
    invoke-direct {v1, v2, v4}, Landroidx/emoji2/text/p;-><init>(Lr4/b;Lf4/q;)V

    .line 316
    .line 317
    .line 318
    :goto_7
    iput-object v6, p0, Lo3/i;->i:Ljava/lang/Object;

    .line 319
    .line 320
    iput v10, p0, Lo3/i;->h:I

    .line 321
    .line 322
    instance-of v2, p1, Lr4/v;

    .line 323
    .line 324
    if-nez v2, :cond_10

    .line 325
    .line 326
    invoke-interface {v1, p1, p0}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    if-ne p1, v0, :cond_e

    .line 331
    .line 332
    goto :goto_8

    .line 333
    :cond_e
    move-object p1, v8

    .line 334
    :goto_8
    if-ne p1, v0, :cond_f

    .line 335
    .line 336
    :goto_9
    move-object v8, v0

    .line 337
    :cond_f
    :goto_a
    return-object v8

    .line 338
    :cond_10
    check-cast p1, Lr4/v;

    .line 339
    .line 340
    iget-object p1, p1, Lr4/v;->g:Ljava/lang/Throwable;

    .line 341
    .line 342
    throw p1

    .line 343
    :cond_11
    throw v5

    .line 344
    :cond_12
    new-instance p1, Landroidx/fragment/app/x;

    .line 345
    .line 346
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 347
    .line 348
    .line 349
    throw p1

    .line 350
    nop

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
