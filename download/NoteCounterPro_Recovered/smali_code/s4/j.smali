.class public final Ls4/j;
.super Ly3/c;
.source "SourceFile"

# interfaces
.implements Lr4/c;


# instance fields
.field public final g:Lr4/c;

.field public final h:Lw3/h;

.field public final i:I

.field public j:Lw3/h;

.field public k:Lw3/c;


# direct methods
.method public constructor <init>(Lr4/c;Lw3/h;)V
    .locals 2

    .line 1
    sget-object v0, Ls4/g;->g:Ls4/g;

    .line 2
    .line 3
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Ly3/c;-><init>(Lw3/c;Lw3/h;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ls4/j;->g:Lr4/c;

    .line 9
    .line 10
    iput-object p2, p0, Ls4/j;->h:Lw3/h;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Lo4/o;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lo4/o;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2, p1, v0}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Ls4/j;->i:I

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p1}, Ls4/j;->c(Lw3/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 6
    .line 7
    if-ne p1, p2, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 11
    .line 12
    return-object p1

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    new-instance v0, Ls4/e;

    .line 15
    .line 16
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {v0, p1, p2}, Ls4/e;-><init>(Ljava/lang/Throwable;Lw3/h;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ls4/j;->j:Lw3/h;

    .line 24
    .line 25
    throw p1
.end method

.method public final c(Lw3/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Lw3/c;->getContext()Lw3/h;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v2}, Lo4/w;->c(Lw3/h;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Ls4/j;->j:Lw3/h;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eq v3, v2, :cond_16

    .line 16
    .line 17
    instance-of v5, v3, Ls4/e;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v5, :cond_15

    .line 21
    .line 22
    check-cast v3, Ls4/e;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v7, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    .line 29
    .line 30
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v3, v3, Ls4/e;->h:Ljava/lang/Throwable;

    .line 34
    .line 35
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, ", but then emission attempt of value \'"

    .line 39
    .line 40
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    .line 47
    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v3, "<this>"

    .line 56
    .line 57
    invoke-static {v1, v3}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v5, Ln4/b;

    .line 61
    .line 62
    invoke-direct {v5, v1}, Ln4/b;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_0

    .line 70
    .line 71
    sget-object v5, Lu3/o;->g:Lu3/o;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-nez v8, :cond_1

    .line 83
    .line 84
    invoke-static {v7}, Ly4/b;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_2

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    move-object v5, v8

    .line 112
    :goto_1
    new-instance v7, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    :cond_3
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_4

    .line 126
    .line 127
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    move-object v10, v9

    .line 132
    check-cast v10, Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v10}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-nez v10, :cond_3

    .line 139
    .line 140
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v7}, Lu3/i;->T(Ljava/lang/Iterable;)I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    move v10, v6

    .line 158
    :goto_3
    if-ge v10, v9, :cond_9

    .line 159
    .line 160
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    add-int/lit8 v10, v10, 0x1

    .line 165
    .line 166
    check-cast v11, Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    move v13, v6

    .line 173
    :goto_4
    const/4 v14, -0x1

    .line 174
    if-ge v13, v12, :cond_6

    .line 175
    .line 176
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    invoke-static {v15}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 181
    .line 182
    .line 183
    move-result v16

    .line 184
    if-nez v16, :cond_5

    .line 185
    .line 186
    invoke-static {v15}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    if-eqz v15, :cond_7

    .line 191
    .line 192
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_6
    move v13, v14

    .line 196
    :cond_7
    if-ne v13, v14, :cond_8

    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    :cond_8
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_9
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-nez v8, :cond_a

    .line 219
    .line 220
    move-object v8, v4

    .line 221
    goto :goto_6

    .line 222
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    check-cast v8, Ljava/lang/Comparable;

    .line 227
    .line 228
    :cond_b
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    if-eqz v9, :cond_c

    .line 233
    .line 234
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    check-cast v9, Ljava/lang/Comparable;

    .line 239
    .line 240
    invoke-interface {v8, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    if-lez v10, :cond_b

    .line 245
    .line 246
    move-object v8, v9

    .line 247
    goto :goto_5

    .line 248
    :cond_c
    :goto_6
    check-cast v8, Ljava/lang/Integer;

    .line 249
    .line 250
    if-eqz v8, :cond_d

    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    goto :goto_7

    .line 257
    :cond_d
    move v7, v6

    .line 258
    :goto_7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    add-int/lit8 v8, v8, -0x1

    .line 270
    .line 271
    new-instance v9, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    if-eqz v10, :cond_14

    .line 285
    .line 286
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    add-int/lit8 v11, v6, 0x1

    .line 291
    .line 292
    if-ltz v6, :cond_13

    .line 293
    .line 294
    check-cast v10, Ljava/lang/String;

    .line 295
    .line 296
    if-eqz v6, :cond_e

    .line 297
    .line 298
    if-ne v6, v8, :cond_f

    .line 299
    .line 300
    :cond_e
    invoke-static {v10}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-eqz v6, :cond_f

    .line 305
    .line 306
    move-object v6, v4

    .line 307
    goto :goto_a

    .line 308
    :cond_f
    invoke-static {v10, v3}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    if-ltz v7, :cond_12

    .line 312
    .line 313
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-le v7, v6, :cond_10

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_10
    move v6, v7

    .line 321
    :goto_9
    invoke-virtual {v10, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    const-string v10, "substring(...)"

    .line 326
    .line 327
    invoke-static {v6, v10}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    :goto_a
    if-eqz v6, :cond_11

    .line 331
    .line 332
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    :cond_11
    move v6, v11

    .line 336
    goto :goto_8

    .line 337
    :cond_12
    const-string v1, "Requested character count "

    .line 338
    .line 339
    const-string v2, " is less than zero."

    .line 340
    .line 341
    invoke-static {v7, v1, v2}, Landroidx/emoji2/text/u;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v2

    .line 355
    :cond_13
    new-instance v1, Ljava/lang/ArithmeticException;

    .line 356
    .line 357
    const-string v2, "Index overflow has happened."

    .line 358
    .line 359
    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v1

    .line 363
    :cond_14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 366
    .line 367
    .line 368
    const-string v1, "\n"

    .line 369
    .line 370
    invoke-static {v9, v3, v1}, Lu3/g;->W(Ljava/util/List;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v2

    .line 385
    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    new-instance v5, Ld4/m;

    .line 390
    .line 391
    const/4 v6, 0x1

    .line 392
    invoke-direct {v5, v0, v6}, Ld4/m;-><init>(Ljava/lang/Object;I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v2, v3, v5}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    check-cast v3, Ljava/lang/Number;

    .line 400
    .line 401
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    iget v5, v0, Ls4/j;->i:I

    .line 406
    .line 407
    if-ne v3, v5, :cond_17

    .line 408
    .line 409
    iput-object v2, v0, Ls4/j;->j:Lw3/h;

    .line 410
    .line 411
    :cond_16
    move-object/from16 v2, p1

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 415
    .line 416
    new-instance v3, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    const-string v4, "Flow invariant is violated:\n\t\tFlow was collected in "

    .line 419
    .line 420
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    iget-object v4, v0, Ls4/j;->h:Lw3/h;

    .line 424
    .line 425
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    const-string v4, ",\n\t\tbut emission happened in "

    .line 429
    .line 430
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    const-string v2, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    .line 437
    .line 438
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :goto_b
    iput-object v2, v0, Ls4/j;->k:Lw3/c;

    .line 454
    .line 455
    sget-object v2, Ls4/l;->a:Lf4/q;

    .line 456
    .line 457
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    .line 458
    .line 459
    iget-object v5, v0, Ls4/j;->g:Lr4/c;

    .line 460
    .line 461
    invoke-static {v5, v3}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v2, v5, v1, v0}, Lf4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    sget-object v2, Lx3/a;->g:Lx3/a;

    .line 469
    .line 470
    invoke-static {v1, v2}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    if-nez v2, :cond_18

    .line 475
    .line 476
    iput-object v4, v0, Ls4/j;->k:Lw3/c;

    .line 477
    .line 478
    :cond_18
    return-object v1
.end method

.method public final getCallerFrame()Ly3/d;
    .locals 2

    .line 1
    iget-object v0, p0, Ls4/j;->k:Lw3/c;

    .line 2
    .line 3
    instance-of v1, v0, Ly3/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ly3/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getContext()Lw3/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/j;->j:Lw3/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lw3/i;->g:Lw3/i;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Ls4/e;

    .line 8
    .line 9
    invoke-virtual {p0}, Ls4/j;->getContext()Lw3/h;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v0, v2}, Ls4/e;-><init>(Ljava/lang/Throwable;Lw3/h;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ls4/j;->j:Lw3/h;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Ls4/j;->k:Lw3/c;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lw3/c;->resumeWith(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object p1, Lx3/a;->g:Lx3/a;

    .line 26
    .line 27
    return-object p1
.end method
