.class public final Lo3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr1/h;

.field public final b:Lt2/i;

.field public final c:Lt2/i;

.field public final d:Lk1/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    new-instance v0, Lr1/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lr1/h;->h:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, v0, Lr1/h;->i:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lr1/h;->j:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v1, Lt2/i;

    .line 32
    .line 33
    const/16 v2, 0x1a

    .line 34
    .line 35
    invoke-direct {v1, v2}, Lt2/i;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lt2/i;

    .line 39
    .line 40
    const/16 v3, 0x19

    .line 41
    .line 42
    invoke-direct {v2, v3}, Lt2/i;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Lk1/j;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v4, "getContentResolver(...)"

    .line 52
    .line 53
    invoke-static {p1, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/16 v4, 0x13

    .line 57
    .line 58
    invoke-direct {v3, p1, v4}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lo3/k;->a:Lr1/h;

    .line 65
    .line 66
    iput-object v1, p0, Lo3/k;->b:Lt2/i;

    .line 67
    .line 68
    iput-object v2, p0, Lo3/k;->c:Lt2/i;

    .line 69
    .line 70
    iput-object v3, p0, Lo3/k;->d:Lk1/j;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(Lb3/g;Lb3/g;Ly3/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lo3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/a;

    .line 7
    .line 8
    iget v1, v0, Lo3/a;->k:I

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
    iput v1, v0, Lo3/a;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/a;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/a;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/a;->k:I

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x1

    .line 36
    if-eqz v2, :cond_5

    .line 37
    .line 38
    if-eq v2, v7, :cond_4

    .line 39
    .line 40
    if-eq v2, v6, :cond_3

    .line 41
    .line 42
    if-eq v2, v5, :cond_1

    .line 43
    .line 44
    if-eq v2, v4, :cond_1

    .line 45
    .line 46
    if-ne v2, v3, :cond_2

    .line 47
    .line 48
    :cond_1
    iget-object p1, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lr3/f0;

    .line 51
    .line 52
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    check-cast p3, Lt3/e;

    .line 56
    .line 57
    iget-object p2, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    iget-object p1, v0, Lo3/a;->h:Lb3/g;

    .line 70
    .line 71
    check-cast p1, Lr3/f0;

    .line 72
    .line 73
    iget-object p2, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Lo3/k;

    .line 76
    .line 77
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    check-cast p3, Lt3/e;

    .line 81
    .line 82
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_4
    iget-object p2, v0, Lo3/a;->h:Lb3/g;

    .line 87
    .line 88
    iget-object p1, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Lo3/k;

    .line 91
    .line 92
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    check-cast p3, Lt3/e;

    .line 96
    .line 97
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    instance-of p3, p1, Lr3/f0;

    .line 104
    .line 105
    if-eqz p3, :cond_6

    .line 106
    .line 107
    check-cast p1, Lr3/f0;

    .line 108
    .line 109
    move-object p3, p2

    .line 110
    move-object p2, p0

    .line 111
    goto :goto_2

    .line 112
    :cond_6
    instance-of p3, p1, Lr3/g0;

    .line 113
    .line 114
    if-eqz p3, :cond_13

    .line 115
    .line 116
    check-cast p1, Lr3/g0;

    .line 117
    .line 118
    iput-object p0, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p2, v0, Lo3/a;->h:Lb3/g;

    .line 121
    .line 122
    iput v7, v0, Lo3/a;->k:I

    .line 123
    .line 124
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 125
    .line 126
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    if-ne p3, v1, :cond_7

    .line 131
    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :cond_7
    move-object p1, p0

    .line 135
    :goto_1
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-nez v2, :cond_12

    .line 140
    .line 141
    check-cast p3, Lr3/f0;

    .line 142
    .line 143
    move-object v8, p2

    .line 144
    move-object p2, p1

    .line 145
    move-object p1, p3

    .line 146
    move-object p3, v8

    .line 147
    :goto_2
    iget-object v2, p2, Lo3/k;->a:Lr1/h;

    .line 148
    .line 149
    instance-of v7, p3, Lr3/f0;

    .line 150
    .line 151
    if-eqz v7, :cond_8

    .line 152
    .line 153
    check-cast p3, Lr3/f0;

    .line 154
    .line 155
    :goto_3
    move-object v8, p2

    .line 156
    move-object p2, p1

    .line 157
    move-object p1, p3

    .line 158
    move-object p3, v8

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    instance-of v7, p3, Lr3/g0;

    .line 161
    .line 162
    if-eqz v7, :cond_11

    .line 163
    .line 164
    check-cast p3, Lr3/g0;

    .line 165
    .line 166
    iput-object p2, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object p1, v0, Lo3/a;->h:Lb3/g;

    .line 169
    .line 170
    iput v6, v0, Lo3/a;->k:I

    .line 171
    .line 172
    invoke-virtual {v2, p3, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    if-ne p3, v1, :cond_9

    .line 177
    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :cond_9
    :goto_4
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    if-nez v2, :cond_10

    .line 185
    .line 186
    check-cast p3, Lr3/f0;

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :goto_5
    instance-of v2, p2, Lr3/e0;

    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    if-eqz v2, :cond_a

    .line 193
    .line 194
    instance-of v7, p1, Lr3/d0;

    .line 195
    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    new-instance p2, Lr3/g;

    .line 199
    .line 200
    const-string p3, "Copy is not allowed from local file to content:// file"

    .line 201
    .line 202
    invoke-direct {p2, p3, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    invoke-static {p2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    goto :goto_7

    .line 210
    :cond_a
    instance-of v7, p2, Lr3/d0;

    .line 211
    .line 212
    if-eqz v7, :cond_b

    .line 213
    .line 214
    instance-of v7, p1, Lr3/d0;

    .line 215
    .line 216
    if-eqz v7, :cond_b

    .line 217
    .line 218
    new-instance p2, Lr3/j;

    .line 219
    .line 220
    const-string p3, "Copy is not allowed from content:// to content://"

    .line 221
    .line 222
    invoke-direct {p2, p3, v6}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    invoke-static {p2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    goto :goto_7

    .line 230
    :cond_b
    const-string v7, "null cannot be cast to non-null type io.ionic.libs.ionfilesystemlib.model.IONFILEUri.Resolved.Local"

    .line 231
    .line 232
    if-eqz v2, :cond_d

    .line 233
    .line 234
    check-cast p2, Lr3/e0;

    .line 235
    .line 236
    iget-object v2, p2, Lr3/e0;->d:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {p1, v7}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    move-object v3, p1

    .line 242
    check-cast v3, Lr3/e0;

    .line 243
    .line 244
    iget-object v3, v3, Lr3/e0;->d:Ljava/lang/String;

    .line 245
    .line 246
    iget-object p2, p2, Lr3/e0;->f:Lr3/h0;

    .line 247
    .line 248
    sget-object v7, Lr3/h0;->h:Lr3/h0;

    .line 249
    .line 250
    if-ne p2, v7, :cond_c

    .line 251
    .line 252
    iget-object p2, p3, Lo3/k;->c:Lt2/i;

    .line 253
    .line 254
    iput-object p1, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v6, v0, Lo3/a;->h:Lb3/g;

    .line 257
    .line 258
    iput v5, v0, Lo3/a;->k:I

    .line 259
    .line 260
    invoke-virtual {p2, v2, v3, v0}, Lt2/i;->i(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    if-ne p2, v1, :cond_e

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_c
    iget-object p2, p3, Lo3/k;->b:Lt2/i;

    .line 268
    .line 269
    iput-object p1, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v6, v0, Lo3/a;->h:Lb3/g;

    .line 272
    .line 273
    iput v4, v0, Lo3/a;->k:I

    .line 274
    .line 275
    invoke-virtual {p2, v2, v3, v0}, Lt2/i;->j(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    if-ne p2, v1, :cond_e

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_d
    invoke-virtual {p2}, Lr3/f0;->C()Landroid/net/Uri;

    .line 283
    .line 284
    .line 285
    move-result-object p2

    .line 286
    invoke-static {p1, v7}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    move-object v2, p1

    .line 290
    check-cast v2, Lr3/e0;

    .line 291
    .line 292
    iget-object v2, v2, Lr3/e0;->d:Ljava/lang/String;

    .line 293
    .line 294
    iget-object p3, p3, Lo3/k;->d:Lk1/j;

    .line 295
    .line 296
    iput-object p1, v0, Lo3/a;->g:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v6, v0, Lo3/a;->h:Lb3/g;

    .line 299
    .line 300
    iput v3, v0, Lo3/a;->k:I

    .line 301
    .line 302
    invoke-virtual {p3, p2, v2, v0}, Lk1/j;->s(Landroid/net/Uri;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    if-ne p2, v1, :cond_e

    .line 307
    .line 308
    :goto_6
    return-object v1

    .line 309
    :cond_e
    :goto_7
    instance-of p3, p2, Lt3/d;

    .line 310
    .line 311
    if-nez p3, :cond_f

    .line 312
    .line 313
    check-cast p2, Lt3/h;

    .line 314
    .line 315
    invoke-virtual {p1}, Lr3/f0;->C()Landroid/net/Uri;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    return-object p1

    .line 320
    :cond_f
    return-object p2

    .line 321
    :cond_10
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    return-object p1

    .line 326
    :cond_11
    new-instance p1, Landroidx/fragment/app/x;

    .line 327
    .line 328
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 329
    .line 330
    .line 331
    throw p1

    .line 332
    :cond_12
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    return-object p1

    .line 337
    :cond_13
    new-instance p1, Landroidx/fragment/app/x;

    .line 338
    .line 339
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 340
    .line 341
    .line 342
    throw p1
.end method

.method public final b(Lb3/g;Lr3/a;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lo3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/b;

    .line 7
    .line 8
    iget v1, v0, Lo3/b;->k:I

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
    iput v1, v0, Lo3/b;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/b;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/b;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/b;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lo3/b;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lr3/e0;

    .line 42
    .line 43
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p3, Lt3/e;

    .line 47
    .line 48
    iget-object p2, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 49
    .line 50
    goto/16 :goto_4

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
    iget-object p2, v0, Lo3/b;->h:Lr3/a;

    .line 61
    .line 62
    iget-object p1, v0, Lo3/b;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lo3/k;

    .line 65
    .line 66
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    check-cast p3, Lt3/e;

    .line 70
    .line 71
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    instance-of p3, p1, Lr3/f0;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    check-cast p1, Lr3/f0;

    .line 82
    .line 83
    move-object p3, p2

    .line 84
    move-object p2, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    instance-of p3, p1, Lr3/g0;

    .line 87
    .line 88
    if-eqz p3, :cond_b

    .line 89
    .line 90
    check-cast p1, Lr3/g0;

    .line 91
    .line 92
    iput-object p0, v0, Lo3/b;->g:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Lo3/b;->h:Lr3/a;

    .line 95
    .line 96
    iput v4, v0, Lo3/b;->k:I

    .line 97
    .line 98
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 99
    .line 100
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-ne p3, v1, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    move-object p1, p0

    .line 108
    :goto_1
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-nez v2, :cond_a

    .line 113
    .line 114
    check-cast p3, Lr3/f0;

    .line 115
    .line 116
    move-object v5, p2

    .line 117
    move-object p2, p1

    .line 118
    move-object p1, p3

    .line 119
    move-object p3, v5

    .line 120
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    check-cast p1, Lr3/e0;

    .line 125
    .line 126
    iget-object v2, p1, Lr3/e0;->f:Lr3/h0;

    .line 127
    .line 128
    sget-object v4, Lr3/h0;->g:Lr3/h0;

    .line 129
    .line 130
    if-eq v2, v4, :cond_8

    .line 131
    .line 132
    iget-object p2, p2, Lo3/k;->c:Lt2/i;

    .line 133
    .line 134
    iget-object v2, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 135
    .line 136
    iput-object p1, v0, Lo3/b;->g:Ljava/lang/Object;

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    iput-object v4, v0, Lo3/b;->h:Lr3/a;

    .line 140
    .line 141
    iput v3, v0, Lo3/b;->k:I

    .line 142
    .line 143
    invoke-virtual {p2, v2, p3, v0}, Lt2/i;->l(Ljava/lang/String;Lr3/a;Ly3/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-ne p2, v1, :cond_6

    .line 148
    .line 149
    :goto_3
    return-object v1

    .line 150
    :cond_6
    :goto_4
    instance-of p3, p2, Lt3/d;

    .line 151
    .line 152
    if-nez p3, :cond_7

    .line 153
    .line 154
    check-cast p2, Lt3/h;

    .line 155
    .line 156
    iget-object p1, p1, Lr3/e0;->e:Landroid/net/Uri;

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_7
    return-object p2

    .line 160
    :cond_8
    new-instance p1, Lr3/r;

    .line 161
    .line 162
    invoke-direct {p1}, Lr3/r;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_9
    new-instance p1, Lr3/p;

    .line 171
    .line 172
    invoke-direct {p1}, Lr3/p;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_a
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1

    .line 185
    :cond_b
    new-instance p1, Landroidx/fragment/app/x;

    .line 186
    .line 187
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 188
    .line 189
    .line 190
    throw p1
.end method

.method public final c(Lb3/g;Lr3/b;Ly3/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lo3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/c;

    .line 7
    .line 8
    iget v1, v0, Lo3/c;->k:I

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
    iput v1, v0, Lo3/c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/c;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_1

    .line 40
    .line 41
    if-eq v2, v4, :cond_1

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    :cond_1
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    check-cast p3, Lt3/e;

    .line 49
    .line 50
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
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
    :cond_3
    iget-object p2, v0, Lo3/c;->h:Lr3/b;

    .line 62
    .line 63
    iget-object p1, v0, Lo3/c;->g:Lo3/k;

    .line 64
    .line 65
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    check-cast p3, Lt3/e;

    .line 69
    .line 70
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    instance-of p3, p1, Lr3/f0;

    .line 77
    .line 78
    if-eqz p3, :cond_5

    .line 79
    .line 80
    check-cast p1, Lr3/f0;

    .line 81
    .line 82
    move-object p3, p2

    .line 83
    move-object p2, p0

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    instance-of p3, p1, Lr3/g0;

    .line 86
    .line 87
    if-eqz p3, :cond_d

    .line 88
    .line 89
    check-cast p1, Lr3/g0;

    .line 90
    .line 91
    iput-object p0, v0, Lo3/c;->g:Lo3/k;

    .line 92
    .line 93
    iput-object p2, v0, Lo3/c;->h:Lr3/b;

    .line 94
    .line 95
    iput v6, v0, Lo3/c;->k:I

    .line 96
    .line 97
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 98
    .line 99
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    if-ne p3, v1, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    move-object p1, p0

    .line 107
    :goto_1
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_c

    .line 112
    .line 113
    check-cast p3, Lr3/f0;

    .line 114
    .line 115
    move-object v7, p2

    .line 116
    move-object p2, p1

    .line 117
    move-object p1, p3

    .line 118
    move-object p3, v7

    .line 119
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    if-eqz v2, :cond_a

    .line 123
    .line 124
    check-cast p1, Lr3/e0;

    .line 125
    .line 126
    iget-object v2, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 127
    .line 128
    iget-object p1, p1, Lr3/e0;->f:Lr3/h0;

    .line 129
    .line 130
    sget-object v3, Lr3/h0;->h:Lr3/h0;

    .line 131
    .line 132
    if-ne p1, v3, :cond_8

    .line 133
    .line 134
    iget-object p1, p2, Lo3/k;->c:Lt2/i;

    .line 135
    .line 136
    iput-object v6, v0, Lo3/c;->g:Lo3/k;

    .line 137
    .line 138
    iput-object v6, v0, Lo3/c;->h:Lr3/b;

    .line 139
    .line 140
    iput v5, v0, Lo3/c;->k:I

    .line 141
    .line 142
    invoke-virtual {p1, v2, p3, v0}, Lt2/i;->n(Ljava/lang/String;Lr3/b;Ly3/c;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v1, :cond_7

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    return-object p1

    .line 150
    :cond_8
    iget-object p1, p2, Lo3/k;->b:Lt2/i;

    .line 151
    .line 152
    iput-object v6, v0, Lo3/c;->g:Lo3/k;

    .line 153
    .line 154
    iput-object v6, v0, Lo3/c;->h:Lr3/b;

    .line 155
    .line 156
    iput v4, v0, Lo3/c;->k:I

    .line 157
    .line 158
    invoke-virtual {p1, v2, v0}, Lt2/i;->o(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-ne p1, v1, :cond_9

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_9
    return-object p1

    .line 166
    :cond_a
    iget-object p2, p2, Lo3/k;->d:Lk1/j;

    .line 167
    .line 168
    invoke-virtual {p1}, Lr3/f0;->C()Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iput-object v6, v0, Lo3/c;->g:Lo3/k;

    .line 173
    .line 174
    iput-object v6, v0, Lo3/c;->h:Lr3/b;

    .line 175
    .line 176
    iput v3, v0, Lo3/c;->k:I

    .line 177
    .line 178
    invoke-virtual {p2, p1, v0}, Lk1/j;->u(Landroid/net/Uri;Ly3/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v1, :cond_b

    .line 183
    .line 184
    :goto_3
    return-object v1

    .line 185
    :cond_b
    return-object p1

    .line 186
    :cond_c
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    :cond_d
    new-instance p1, Landroidx/fragment/app/x;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 194
    .line 195
    .line 196
    throw p1
.end method

.method public final d(Lr3/g0;Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lo3/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lo3/d;

    .line 7
    .line 8
    iget v1, v0, Lo3/d;->i:I

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
    iput v1, v0, Lo3/d;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/d;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lo3/d;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lo3/d;->g:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/d;->i:I

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
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, Lt3/e;

    .line 40
    .line 41
    iget-object p1, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, Lo3/d;->i:I

    .line 56
    .line 57
    iget-object p2, p0, Lo3/k;->a:Lr1/h;

    .line 58
    .line 59
    invoke-virtual {p2, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    return-object p1
.end method

.method public final e(Lb3/g;Ly3/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lo3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lo3/e;

    .line 7
    .line 8
    iget v1, v0, Lo3/e;->j:I

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
    iput v1, v0, Lo3/e;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lo3/e;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lo3/e;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/e;->j:I

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
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_1

    .line 39
    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast p2, Lt3/e;

    .line 46
    .line 47
    iget-object p1, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_3
    iget-object p1, v0, Lo3/e;->g:Lo3/k;

    .line 59
    .line 60
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    check-cast p2, Lt3/e;

    .line 64
    .line 65
    iget-object p2, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    instance-of p2, p1, Lr3/f0;

    .line 72
    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    check-cast p1, Lr3/f0;

    .line 76
    .line 77
    move-object p2, p0

    .line 78
    goto :goto_2

    .line 79
    :cond_5
    instance-of p2, p1, Lr3/g0;

    .line 80
    .line 81
    if-eqz p2, :cond_b

    .line 82
    .line 83
    check-cast p1, Lr3/g0;

    .line 84
    .line 85
    iput-object p0, v0, Lo3/e;->g:Lo3/k;

    .line 86
    .line 87
    iput v5, v0, Lo3/e;->j:I

    .line 88
    .line 89
    iget-object p2, p0, Lo3/k;->a:Lr1/h;

    .line 90
    .line 91
    invoke-virtual {p2, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-ne p2, v1, :cond_6

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    move-object p1, p0

    .line 99
    :goto_1
    invoke-static {p2}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-nez v2, :cond_a

    .line 104
    .line 105
    check-cast p2, Lr3/f0;

    .line 106
    .line 107
    move-object v6, p2

    .line 108
    move-object p2, p1

    .line 109
    move-object p1, v6

    .line 110
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    if-eqz v2, :cond_8

    .line 114
    .line 115
    iget-object p2, p2, Lo3/k;->b:Lt2/i;

    .line 116
    .line 117
    check-cast p1, Lr3/e0;

    .line 118
    .line 119
    iget-object p1, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 120
    .line 121
    iput-object v5, v0, Lo3/e;->g:Lo3/k;

    .line 122
    .line 123
    iput v4, v0, Lo3/e;->j:I

    .line 124
    .line 125
    invoke-virtual {p2, p1, v0}, Lt2/i;->q(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    return-object p1

    .line 133
    :cond_8
    iget-object p2, p2, Lo3/k;->d:Lk1/j;

    .line 134
    .line 135
    invoke-virtual {p1}, Lr3/f0;->C()Landroid/net/Uri;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object v5, v0, Lo3/e;->g:Lo3/k;

    .line 140
    .line 141
    iput v3, v0, Lo3/e;->j:I

    .line 142
    .line 143
    invoke-virtual {p2, p1, v0}, Lk1/j;->x(Landroid/net/Uri;Ly3/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v1, :cond_9

    .line 148
    .line 149
    :goto_3
    return-object v1

    .line 150
    :cond_9
    return-object p1

    .line 151
    :cond_a
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :cond_b
    new-instance p1, Landroidx/fragment/app/x;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1
.end method

.method public final f(Lb3/g;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lo3/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lo3/f;

    .line 7
    .line 8
    iget v1, v0, Lo3/f;->j:I

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
    iput v1, v0, Lo3/f;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/f;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lo3/f;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lo3/f;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/f;->j:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p2, Lt3/e;

    .line 43
    .line 44
    iget-object p1, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    iget-object p1, v0, Lo3/f;->g:Lo3/k;

    .line 56
    .line 57
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast p2, Lt3/e;

    .line 61
    .line 62
    iget-object p2, p2, Lt3/e;->g:Ljava/lang/Object;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    instance-of p2, p1, Lr3/f0;

    .line 69
    .line 70
    if-eqz p2, :cond_4

    .line 71
    .line 72
    check-cast p1, Lr3/f0;

    .line 73
    .line 74
    move-object p2, p0

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    instance-of p2, p1, Lr3/g0;

    .line 77
    .line 78
    if-eqz p2, :cond_a

    .line 79
    .line 80
    check-cast p1, Lr3/g0;

    .line 81
    .line 82
    iput-object p0, v0, Lo3/f;->g:Lo3/k;

    .line 83
    .line 84
    iput v4, v0, Lo3/f;->j:I

    .line 85
    .line 86
    iget-object p2, p0, Lo3/k;->a:Lr1/h;

    .line 87
    .line 88
    invoke-virtual {p2, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-ne p2, v1, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    move-object p1, p0

    .line 96
    :goto_1
    invoke-static {p2}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-nez v2, :cond_9

    .line 101
    .line 102
    check-cast p2, Lr3/f0;

    .line 103
    .line 104
    move-object v5, p2

    .line 105
    move-object p2, p1

    .line 106
    move-object p1, v5

    .line 107
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 108
    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    check-cast p1, Lr3/e0;

    .line 112
    .line 113
    iget-object v2, p1, Lr3/e0;->f:Lr3/h0;

    .line 114
    .line 115
    sget-object v4, Lr3/h0;->g:Lr3/h0;

    .line 116
    .line 117
    if-eq v2, v4, :cond_7

    .line 118
    .line 119
    iget-object p2, p2, Lo3/k;->c:Lt2/i;

    .line 120
    .line 121
    iget-object p1, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    iput-object v2, v0, Lo3/f;->g:Lo3/k;

    .line 125
    .line 126
    iput v3, v0, Lo3/f;->j:I

    .line 127
    .line 128
    invoke-virtual {p2, p1, v0}, Lt2/i;->v(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_6

    .line 133
    .line 134
    :goto_3
    return-object v1

    .line 135
    :cond_6
    return-object p1

    .line 136
    :cond_7
    new-instance p1, Lr3/r;

    .line 137
    .line 138
    invoke-direct {p1}, Lr3/r;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :cond_8
    new-instance p1, Lr3/p;

    .line 147
    .line 148
    invoke-direct {p1}, Lr3/p;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :cond_9
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_a
    new-instance p1, Landroidx/fragment/app/x;

    .line 162
    .line 163
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1
.end method

.method public final g(Lb3/g;Lb3/g;Ly3/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lo3/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/g;

    .line 7
    .line 8
    iget v1, v0, Lo3/g;->k:I

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
    iput v1, v0, Lo3/g;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/g;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/g;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/g;->k:I

    .line 30
    .line 31
    const/4 v3, 0x4

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eq v2, v6, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_1

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    :cond_1
    iget-object p1, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lr3/e0;

    .line 48
    .line 49
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    check-cast p3, Lt3/e;

    .line 53
    .line 54
    iget-object p2, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_3
    iget-object p1, v0, Lo3/g;->h:Lb3/g;

    .line 67
    .line 68
    check-cast p1, Lr3/e0;

    .line 69
    .line 70
    iget-object p2, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Lo3/k;

    .line 73
    .line 74
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    check-cast p3, Lt3/e;

    .line 78
    .line 79
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    iget-object p2, v0, Lo3/g;->h:Lb3/g;

    .line 84
    .line 85
    iget-object p1, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lo3/k;

    .line 88
    .line 89
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    check-cast p3, Lt3/e;

    .line 93
    .line 94
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    instance-of p3, p1, Lr3/f0;

    .line 101
    .line 102
    if-eqz p3, :cond_6

    .line 103
    .line 104
    check-cast p1, Lr3/f0;

    .line 105
    .line 106
    move-object p3, p2

    .line 107
    move-object p2, p0

    .line 108
    goto :goto_2

    .line 109
    :cond_6
    instance-of p3, p1, Lr3/g0;

    .line 110
    .line 111
    if-eqz p3, :cond_13

    .line 112
    .line 113
    check-cast p1, Lr3/g0;

    .line 114
    .line 115
    iput-object p0, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object p2, v0, Lo3/g;->h:Lb3/g;

    .line 118
    .line 119
    iput v6, v0, Lo3/g;->k:I

    .line 120
    .line 121
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 122
    .line 123
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    if-ne p3, v1, :cond_7

    .line 128
    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_7
    move-object p1, p0

    .line 132
    :goto_1
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-nez v2, :cond_12

    .line 137
    .line 138
    check-cast p3, Lr3/f0;

    .line 139
    .line 140
    move-object v8, p2

    .line 141
    move-object p2, p1

    .line 142
    move-object p1, p3

    .line 143
    move-object p3, v8

    .line 144
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 145
    .line 146
    if-eqz v2, :cond_11

    .line 147
    .line 148
    check-cast p1, Lr3/e0;

    .line 149
    .line 150
    iget-object v2, p2, Lo3/k;->a:Lr1/h;

    .line 151
    .line 152
    instance-of v6, p3, Lr3/f0;

    .line 153
    .line 154
    if-eqz v6, :cond_8

    .line 155
    .line 156
    check-cast p3, Lr3/f0;

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    instance-of v6, p3, Lr3/g0;

    .line 160
    .line 161
    if-eqz v6, :cond_10

    .line 162
    .line 163
    check-cast p3, Lr3/g0;

    .line 164
    .line 165
    iput-object p2, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object p1, v0, Lo3/g;->h:Lb3/g;

    .line 168
    .line 169
    iput v5, v0, Lo3/g;->k:I

    .line 170
    .line 171
    invoke-virtual {v2, p3, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    if-ne p3, v1, :cond_9

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_9
    :goto_3
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-nez v2, :cond_f

    .line 183
    .line 184
    check-cast p3, Lr3/f0;

    .line 185
    .line 186
    :goto_4
    instance-of v2, p3, Lr3/e0;

    .line 187
    .line 188
    if-eqz v2, :cond_e

    .line 189
    .line 190
    check-cast p3, Lr3/e0;

    .line 191
    .line 192
    iget-object v2, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v5, p3, Lr3/e0;->d:Ljava/lang/String;

    .line 195
    .line 196
    iget-object p1, p1, Lr3/e0;->f:Lr3/h0;

    .line 197
    .line 198
    sget-object v6, Lr3/h0;->h:Lr3/h0;

    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    if-ne p1, v6, :cond_b

    .line 202
    .line 203
    iget-object p1, p2, Lo3/k;->c:Lt2/i;

    .line 204
    .line 205
    iput-object p3, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v7, v0, Lo3/g;->h:Lb3/g;

    .line 208
    .line 209
    iput v4, v0, Lo3/g;->k:I

    .line 210
    .line 211
    invoke-virtual {p1, v2, v5, v0}, Lt2/i;->w(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-ne p1, v1, :cond_a

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_a
    move-object p2, p1

    .line 219
    goto :goto_6

    .line 220
    :cond_b
    iget-object p1, p2, Lo3/k;->b:Lt2/i;

    .line 221
    .line 222
    iput-object p3, v0, Lo3/g;->g:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object v7, v0, Lo3/g;->h:Lb3/g;

    .line 225
    .line 226
    iput v3, v0, Lo3/g;->k:I

    .line 227
    .line 228
    invoke-virtual {p1, v2, v5, v0}, Lt2/i;->y(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    if-ne p2, v1, :cond_c

    .line 233
    .line 234
    :goto_5
    return-object v1

    .line 235
    :cond_c
    :goto_6
    move-object p1, p3

    .line 236
    :goto_7
    instance-of p3, p2, Lt3/d;

    .line 237
    .line 238
    if-nez p3, :cond_d

    .line 239
    .line 240
    check-cast p2, Lt3/h;

    .line 241
    .line 242
    iget-object p1, p1, Lr3/e0;->e:Landroid/net/Uri;

    .line 243
    .line 244
    return-object p1

    .line 245
    :cond_d
    return-object p2

    .line 246
    :cond_e
    new-instance p1, Lr3/p;

    .line 247
    .line 248
    invoke-direct {p1}, Lr3/p;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    :cond_f
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    return-object p1

    .line 261
    :cond_10
    new-instance p1, Landroidx/fragment/app/x;

    .line 262
    .line 263
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 264
    .line 265
    .line 266
    throw p1

    .line 267
    :cond_11
    new-instance p1, Lr3/p;

    .line 268
    .line 269
    invoke-direct {p1}, Lr3/p;-><init>()V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    return-object p1

    .line 277
    :cond_12
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    return-object p1

    .line 282
    :cond_13
    new-instance p1, Landroidx/fragment/app/x;

    .line 283
    .line 284
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 285
    .line 286
    .line 287
    throw p1
.end method

.method public final h(Lb3/g;Lr3/a0;Ly3/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lo3/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/h;

    .line 7
    .line 8
    iget v1, v0, Lo3/h;->k:I

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
    iput v1, v0, Lo3/h;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/h;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/h;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/h;->k:I

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
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    :goto_1
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    check-cast p3, Lt3/e;

    .line 55
    .line 56
    iget-object p1, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_3
    iget-object p2, v0, Lo3/h;->h:Lr3/a0;

    .line 61
    .line 62
    iget-object p1, v0, Lo3/h;->g:Lo3/k;

    .line 63
    .line 64
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    check-cast p3, Lt3/e;

    .line 68
    .line 69
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    instance-of p3, p1, Lr3/f0;

    .line 76
    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    check-cast p1, Lr3/f0;

    .line 80
    .line 81
    move-object p3, p2

    .line 82
    move-object p2, p0

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    instance-of p3, p1, Lr3/g0;

    .line 85
    .line 86
    if-eqz p3, :cond_d

    .line 87
    .line 88
    check-cast p1, Lr3/g0;

    .line 89
    .line 90
    iput-object p0, v0, Lo3/h;->g:Lo3/k;

    .line 91
    .line 92
    iput-object p2, v0, Lo3/h;->h:Lr3/a0;

    .line 93
    .line 94
    iput v5, v0, Lo3/h;->k:I

    .line 95
    .line 96
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 97
    .line 98
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    if-ne p3, v1, :cond_6

    .line 103
    .line 104
    goto/16 :goto_6

    .line 105
    .line 106
    :cond_6
    move-object p1, p0

    .line 107
    :goto_2
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_c

    .line 112
    .line 113
    check-cast p3, Lr3/f0;

    .line 114
    .line 115
    move-object v7, p2

    .line 116
    move-object p2, p1

    .line 117
    move-object p1, p3

    .line 118
    move-object p3, v7

    .line 119
    :goto_3
    instance-of v2, p1, Lr3/e0;

    .line 120
    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    move-object v5, p1

    .line 124
    check-cast v5, Lr3/e0;

    .line 125
    .line 126
    iget-object v5, v5, Lr3/e0;->f:Lr3/h0;

    .line 127
    .line 128
    sget-object v6, Lr3/h0;->h:Lr3/h0;

    .line 129
    .line 130
    if-eq v5, v6, :cond_7

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    new-instance p1, Lr3/q;

    .line 134
    .line 135
    invoke-direct {p1}, Lr3/q;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_8
    :goto_4
    :try_start_0
    iget v5, p3, Lr3/a0;->b:I

    .line 144
    .line 145
    iget v6, p3, Lr3/a0;->c:I

    .line 146
    .line 147
    invoke-static {v5, v6}, Lb3/g;->z(II)V

    .line 148
    .line 149
    .line 150
    sget-object v5, Lt3/h;->a:Lt3/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :catchall_0
    move-exception v5

    .line 154
    invoke-static {v5}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    :goto_5
    invoke-static {v5}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-eqz v5, :cond_9

    .line 163
    .line 164
    invoke-static {v5}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    goto :goto_7

    .line 169
    :cond_9
    const/4 v5, 0x0

    .line 170
    if-eqz v2, :cond_a

    .line 171
    .line 172
    iget-object p2, p2, Lo3/k;->b:Lt2/i;

    .line 173
    .line 174
    check-cast p1, Lr3/e0;

    .line 175
    .line 176
    iget-object p1, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 177
    .line 178
    iput-object v5, v0, Lo3/h;->g:Lo3/k;

    .line 179
    .line 180
    iput-object v5, v0, Lo3/h;->h:Lr3/a0;

    .line 181
    .line 182
    iput v4, v0, Lo3/h;->k:I

    .line 183
    .line 184
    invoke-virtual {p2, p1, p3, v0}, Lt2/i;->x(Ljava/lang/String;Lr3/a0;Ly3/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v1, :cond_b

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_a
    iget-object p2, p2, Lo3/k;->d:Lk1/j;

    .line 192
    .line 193
    invoke-virtual {p1}, Lr3/f0;->C()Landroid/net/Uri;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object v5, v0, Lo3/h;->g:Lo3/k;

    .line 198
    .line 199
    iput-object v5, v0, Lo3/h;->h:Lr3/a0;

    .line 200
    .line 201
    iput v3, v0, Lo3/h;->k:I

    .line 202
    .line 203
    invoke-virtual {p2, p1, p3, v0}, Lk1/j;->B(Landroid/net/Uri;Lr3/a0;Ly3/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    if-ne p1, v1, :cond_b

    .line 208
    .line 209
    :goto_6
    return-object v1

    .line 210
    :cond_b
    :goto_7
    return-object p1

    .line 211
    :cond_c
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    return-object p1

    .line 216
    :cond_d
    new-instance p1, Landroidx/fragment/app/x;

    .line 217
    .line 218
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 219
    .line 220
    .line 221
    throw p1
.end method

.method public final i(Lb3/g;Lr3/c0;Ly3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lo3/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lo3/j;

    .line 7
    .line 8
    iget v1, v0, Lo3/j;->k:I

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
    iput v1, v0, Lo3/j;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo3/j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lo3/j;-><init>(Lo3/k;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lo3/j;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lo3/j;->k:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lo3/j;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lr3/e0;

    .line 42
    .line 43
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    check-cast p3, Lt3/e;

    .line 47
    .line 48
    iget-object p2, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 49
    .line 50
    goto/16 :goto_4

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
    iget-object p2, v0, Lo3/j;->h:Lr3/c0;

    .line 61
    .line 62
    iget-object p1, v0, Lo3/j;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lo3/k;

    .line 65
    .line 66
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    check-cast p3, Lt3/e;

    .line 70
    .line 71
    iget-object p3, p3, Lt3/e;->g:Ljava/lang/Object;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p3}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    instance-of p3, p1, Lr3/f0;

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    check-cast p1, Lr3/f0;

    .line 82
    .line 83
    move-object p3, p2

    .line 84
    move-object p2, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    instance-of p3, p1, Lr3/g0;

    .line 87
    .line 88
    if-eqz p3, :cond_b

    .line 89
    .line 90
    check-cast p1, Lr3/g0;

    .line 91
    .line 92
    iput-object p0, v0, Lo3/j;->g:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Lo3/j;->h:Lr3/c0;

    .line 95
    .line 96
    iput v4, v0, Lo3/j;->k:I

    .line 97
    .line 98
    iget-object p3, p0, Lo3/k;->a:Lr1/h;

    .line 99
    .line 100
    invoke-virtual {p3, p1, v0}, Lr1/h;->r(Lr3/g0;Ly3/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    if-ne p3, v1, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    move-object p1, p0

    .line 108
    :goto_1
    invoke-static {p3}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-nez v2, :cond_a

    .line 113
    .line 114
    check-cast p3, Lr3/f0;

    .line 115
    .line 116
    move-object v5, p2

    .line 117
    move-object p2, p1

    .line 118
    move-object p1, p3

    .line 119
    move-object p3, v5

    .line 120
    :goto_2
    instance-of v2, p1, Lr3/e0;

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    check-cast p1, Lr3/e0;

    .line 125
    .line 126
    iget-object v2, p1, Lr3/e0;->f:Lr3/h0;

    .line 127
    .line 128
    sget-object v4, Lr3/h0;->h:Lr3/h0;

    .line 129
    .line 130
    if-eq v2, v4, :cond_8

    .line 131
    .line 132
    iget-object p2, p2, Lo3/k;->b:Lt2/i;

    .line 133
    .line 134
    iget-object v2, p1, Lr3/e0;->d:Ljava/lang/String;

    .line 135
    .line 136
    iput-object p1, v0, Lo3/j;->g:Ljava/lang/Object;

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    iput-object v4, v0, Lo3/j;->h:Lr3/c0;

    .line 140
    .line 141
    iput v3, v0, Lo3/j;->k:I

    .line 142
    .line 143
    invoke-virtual {p2, v2, p3, v0}, Lt2/i;->z(Ljava/lang/String;Lr3/c0;Ly3/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-ne p2, v1, :cond_6

    .line 148
    .line 149
    :goto_3
    return-object v1

    .line 150
    :cond_6
    :goto_4
    instance-of p3, p2, Lt3/d;

    .line 151
    .line 152
    if-nez p3, :cond_7

    .line 153
    .line 154
    check-cast p2, Lt3/h;

    .line 155
    .line 156
    iget-object p1, p1, Lr3/e0;->e:Landroid/net/Uri;

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_7
    return-object p2

    .line 160
    :cond_8
    new-instance p1, Lr3/q;

    .line 161
    .line 162
    invoke-direct {p1}, Lr3/q;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_9
    new-instance p1, Lr3/p;

    .line 171
    .line 172
    invoke-direct {p1}, Lr3/p;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_a
    invoke-static {v2}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1

    .line 185
    :cond_b
    new-instance p1, Landroidx/fragment/app/x;

    .line 186
    .line 187
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 188
    .line 189
    .line 190
    throw p1
.end method
