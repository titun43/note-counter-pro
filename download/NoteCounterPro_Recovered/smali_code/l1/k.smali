.class public final Ll1/k;
.super Lz2/b;
.source "SourceFile"


# static fields
.field public static l:Ll1/k;

.field public static m:Ll1/k;

.field public static final n:Ljava/lang/Object;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Landroidx/work/b;

.field public final e:Landroidx/work/impl/WorkDatabase;

.field public final f:Landroidx/emoji2/text/t;

.field public final g:Ljava/util/List;

.field public final h:Ll1/b;

.field public final i:Lk1/j;

.field public j:Z

.field public k:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, Ll1/k;->l:Ll1/k;

    .line 8
    .line 9
    sput-object v0, Ll1/k;->m:Ll1/k;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ll1/k;->n:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/b;Landroidx/emoji2/text/t;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v5, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v2, 0x7f040005

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, v5, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lu1/i;

    .line 25
    .line 26
    sget v6, Landroidx/work/impl/WorkDatabase;->k:I

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Lz0/h;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-direct {v0, v2, v7}, Lz0/h;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v6, v0, Lz0/h;->g:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Ll1/j;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "androidx.work.workdb"

    .line 43
    .line 44
    new-instance v7, Lz0/h;

    .line 45
    .line 46
    invoke-direct {v7, v2, v0}, Lz0/h;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lf2/k;

    .line 50
    .line 51
    invoke-direct {v0, v2}, Lf2/k;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, v7, Lz0/h;->f:Ld1/b;

    .line 55
    .line 56
    move-object v0, v7

    .line 57
    :goto_0
    iput-object v3, v0, Lz0/h;->d:Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    new-instance v3, Ll1/f;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v7, v0, Lz0/h;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    new-instance v7, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v7, v0, Lz0/h;->c:Ljava/util/ArrayList;

    .line 74
    .line 75
    :cond_1
    iget-object v7, v0, Lz0/h;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    new-array v3, v6, [La1/a;

    .line 81
    .line 82
    sget-object v7, Ll1/i;->a:Ll1/g;

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    aput-object v7, v3, v8

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Ll1/h;

    .line 91
    .line 92
    const/4 v7, 0x2

    .line 93
    const/4 v9, 0x3

    .line 94
    invoke-direct {v3, v2, v7, v9}, Ll1/h;-><init>(Landroid/content/Context;II)V

    .line 95
    .line 96
    .line 97
    new-array v10, v6, [La1/a;

    .line 98
    .line 99
    aput-object v3, v10, v8

    .line 100
    .line 101
    invoke-virtual {v0, v10}, Lz0/h;->a([La1/a;)V

    .line 102
    .line 103
    .line 104
    new-array v3, v6, [La1/a;

    .line 105
    .line 106
    sget-object v10, Ll1/i;->b:Ll1/g;

    .line 107
    .line 108
    aput-object v10, v3, v8

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 111
    .line 112
    .line 113
    new-array v3, v6, [La1/a;

    .line 114
    .line 115
    sget-object v10, Ll1/i;->c:Ll1/g;

    .line 116
    .line 117
    aput-object v10, v3, v8

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, Ll1/h;

    .line 123
    .line 124
    const/4 v10, 0x5

    .line 125
    const/4 v11, 0x6

    .line 126
    invoke-direct {v3, v2, v10, v11}, Ll1/h;-><init>(Landroid/content/Context;II)V

    .line 127
    .line 128
    .line 129
    new-array v10, v6, [La1/a;

    .line 130
    .line 131
    aput-object v3, v10, v8

    .line 132
    .line 133
    invoke-virtual {v0, v10}, Lz0/h;->a([La1/a;)V

    .line 134
    .line 135
    .line 136
    new-array v3, v6, [La1/a;

    .line 137
    .line 138
    sget-object v10, Ll1/i;->d:Ll1/g;

    .line 139
    .line 140
    aput-object v10, v3, v8

    .line 141
    .line 142
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 143
    .line 144
    .line 145
    new-array v3, v6, [La1/a;

    .line 146
    .line 147
    sget-object v10, Ll1/i;->e:Ll1/g;

    .line 148
    .line 149
    aput-object v10, v3, v8

    .line 150
    .line 151
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 152
    .line 153
    .line 154
    new-array v3, v6, [La1/a;

    .line 155
    .line 156
    sget-object v10, Ll1/i;->f:Ll1/g;

    .line 157
    .line 158
    aput-object v10, v3, v8

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Lz0/h;->a([La1/a;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, Ll1/h;

    .line 164
    .line 165
    invoke-direct {v3, v2}, Ll1/h;-><init>(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    new-array v10, v6, [La1/a;

    .line 169
    .line 170
    aput-object v3, v10, v8

    .line 171
    .line 172
    invoke-virtual {v0, v10}, Lz0/h;->a([La1/a;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Ll1/h;

    .line 176
    .line 177
    const/16 v10, 0xa

    .line 178
    .line 179
    const/16 v11, 0xb

    .line 180
    .line 181
    invoke-direct {v3, v2, v10, v11}, Ll1/h;-><init>(Landroid/content/Context;II)V

    .line 182
    .line 183
    .line 184
    new-array v2, v6, [La1/a;

    .line 185
    .line 186
    aput-object v3, v2, v8

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Lz0/h;->a([La1/a;)V

    .line 189
    .line 190
    .line 191
    new-array v2, v6, [La1/a;

    .line 192
    .line 193
    sget-object v3, Ll1/i;->g:Ll1/g;

    .line 194
    .line 195
    aput-object v3, v2, v8

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Lz0/h;->a([La1/a;)V

    .line 198
    .line 199
    .line 200
    iput-boolean v8, v0, Lz0/h;->h:Z

    .line 201
    .line 202
    iput-boolean v6, v0, Lz0/h;->i:Z

    .line 203
    .line 204
    const-class v2, Landroidx/work/impl/WorkDatabase;

    .line 205
    .line 206
    iget-object v11, v0, Lz0/h;->b:Landroid/content/Context;

    .line 207
    .line 208
    if-eqz v11, :cond_b

    .line 209
    .line 210
    iget-object v3, v0, Lz0/h;->d:Ljava/util/concurrent/Executor;

    .line 211
    .line 212
    if-nez v3, :cond_2

    .line 213
    .line 214
    iget-object v10, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 215
    .line 216
    if-nez v10, :cond_2

    .line 217
    .line 218
    sget-object v3, Ll/b;->k:Ll/a;

    .line 219
    .line 220
    iput-object v3, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 221
    .line 222
    iput-object v3, v0, Lz0/h;->d:Ljava/util/concurrent/Executor;

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_2
    if-eqz v3, :cond_3

    .line 226
    .line 227
    iget-object v10, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 228
    .line 229
    if-nez v10, :cond_3

    .line 230
    .line 231
    iput-object v3, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_3
    if-nez v3, :cond_4

    .line 235
    .line 236
    iget-object v3, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 237
    .line 238
    if-eqz v3, :cond_4

    .line 239
    .line 240
    iput-object v3, v0, Lz0/h;->d:Ljava/util/concurrent/Executor;

    .line 241
    .line 242
    :cond_4
    :goto_1
    iget-object v3, v0, Lz0/h;->f:Ld1/b;

    .line 243
    .line 244
    if-nez v3, :cond_5

    .line 245
    .line 246
    new-instance v3, Lt2/i;

    .line 247
    .line 248
    const/16 v10, 0xc

    .line 249
    .line 250
    invoke-direct {v3, v10}, Lt2/i;-><init>(I)V

    .line 251
    .line 252
    .line 253
    iput-object v3, v0, Lz0/h;->f:Ld1/b;

    .line 254
    .line 255
    :cond_5
    new-instance v10, Lz0/a;

    .line 256
    .line 257
    iget-object v12, v0, Lz0/h;->a:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v13, v0, Lz0/h;->f:Ld1/b;

    .line 260
    .line 261
    iget-object v14, v0, Lz0/h;->j:Lk1/j;

    .line 262
    .line 263
    iget-object v15, v0, Lz0/h;->c:Ljava/util/ArrayList;

    .line 264
    .line 265
    iget-boolean v3, v0, Lz0/h;->g:Z

    .line 266
    .line 267
    const-string v7, "activity"

    .line 268
    .line 269
    invoke-virtual {v11, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    check-cast v7, Landroid/app/ActivityManager;

    .line 274
    .line 275
    if-eqz v7, :cond_6

    .line 276
    .line 277
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-nez v7, :cond_6

    .line 282
    .line 283
    move/from16 v17, v9

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_6
    const/16 v17, 0x2

    .line 287
    .line 288
    :goto_2
    iget-object v7, v0, Lz0/h;->d:Ljava/util/concurrent/Executor;

    .line 289
    .line 290
    iget-object v8, v0, Lz0/h;->e:Ljava/util/concurrent/Executor;

    .line 291
    .line 292
    move/from16 v22, v6

    .line 293
    .line 294
    iget-boolean v6, v0, Lz0/h;->h:Z

    .line 295
    .line 296
    iget-boolean v0, v0, Lz0/h;->i:Z

    .line 297
    .line 298
    move/from16 v21, v0

    .line 299
    .line 300
    move/from16 v16, v3

    .line 301
    .line 302
    move/from16 v20, v6

    .line 303
    .line 304
    move-object/from16 v18, v7

    .line 305
    .line 306
    move-object/from16 v19, v8

    .line 307
    .line 308
    invoke-direct/range {v10 .. v21}, Lz0/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ld1/b;Lk1/j;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZ)V

    .line 309
    .line 310
    .line 311
    move/from16 v0, v16

    .line 312
    .line 313
    move/from16 v3, v17

    .line 314
    .line 315
    move-object/from16 v6, v18

    .line 316
    .line 317
    const-string v7, "_Impl"

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-virtual {v8}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    if-eqz v12, :cond_7

    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_7
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    add-int/lit8 v12, v12, 0x1

    .line 343
    .line 344
    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    :goto_3
    new-instance v12, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 351
    .line 352
    .line 353
    const/16 v13, 0x2e

    .line 354
    .line 355
    const/16 v14, 0x5f

    .line 356
    .line 357
    invoke-virtual {v11, v13, v14}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    if-eqz v11, :cond_8

    .line 376
    .line 377
    move-object v8, v7

    .line 378
    goto :goto_4

    .line 379
    :cond_8
    new-instance v11, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v8, "."

    .line 388
    .line 389
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v8

    .line 399
    :goto_4
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-virtual {v8}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 407
    check-cast v2, Lz0/i;

    .line 408
    .line 409
    invoke-virtual {v2, v10}, Lz0/i;->e(Lz0/a;)Ld1/c;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    iput-object v7, v2, Lz0/i;->c:Ld1/c;

    .line 414
    .line 415
    if-ne v3, v9, :cond_9

    .line 416
    .line 417
    move/from16 v3, v22

    .line 418
    .line 419
    goto :goto_5

    .line 420
    :cond_9
    const/4 v3, 0x0

    .line 421
    :goto_5
    invoke-interface {v7, v3}, Ld1/c;->setWriteAheadLoggingEnabled(Z)V

    .line 422
    .line 423
    .line 424
    iput-object v15, v2, Lz0/i;->g:Ljava/util/List;

    .line 425
    .line 426
    iput-object v6, v2, Lz0/i;->b:Ljava/util/concurrent/Executor;

    .line 427
    .line 428
    new-instance v6, Ljava/util/ArrayDeque;

    .line 429
    .line 430
    invoke-direct {v6}, Ljava/util/ArrayDeque;-><init>()V

    .line 431
    .line 432
    .line 433
    iput-boolean v0, v2, Lz0/i;->e:Z

    .line 434
    .line 435
    iput-boolean v3, v2, Lz0/i;->f:Z

    .line 436
    .line 437
    move-object v6, v2

    .line 438
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 439
    .line 440
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    new-instance v2, Landroidx/work/n;

    .line 448
    .line 449
    iget v3, v4, Landroidx/work/b;->f:I

    .line 450
    .line 451
    invoke-direct {v2, v3}, Landroidx/work/n;-><init>(I)V

    .line 452
    .line 453
    .line 454
    const-class v3, Landroidx/work/n;

    .line 455
    .line 456
    monitor-enter v3

    .line 457
    :try_start_1
    sput-object v2, Landroidx/work/n;->h:Landroidx/work/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 458
    .line 459
    monitor-exit v3

    .line 460
    sget-object v2, Ll1/d;->a:Ljava/lang/String;

    .line 461
    .line 462
    new-instance v2, Lo1/c;

    .line 463
    .line 464
    invoke-direct {v2, v0, v1}, Lo1/c;-><init>(Landroid/content/Context;Ll1/k;)V

    .line 465
    .line 466
    .line 467
    const-class v3, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 468
    .line 469
    move/from16 v7, v22

    .line 470
    .line 471
    invoke-static {v0, v3, v7}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 472
    .line 473
    .line 474
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    sget-object v8, Ll1/d;->a:Ljava/lang/String;

    .line 479
    .line 480
    const-string v9, "Created SystemJobScheduler and enabled SystemJobService"

    .line 481
    .line 482
    const/4 v10, 0x0

    .line 483
    new-array v11, v10, [Ljava/lang/Throwable;

    .line 484
    .line 485
    invoke-virtual {v3, v8, v9, v11}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    new-instance v3, Lm1/b;

    .line 489
    .line 490
    invoke-direct {v3, v0, v4, v5, v1}, Lm1/b;-><init>(Landroid/content/Context;Landroidx/work/b;Landroidx/emoji2/text/t;Ll1/k;)V

    .line 491
    .line 492
    .line 493
    const/4 v0, 0x2

    .line 494
    new-array v0, v0, [Ll1/c;

    .line 495
    .line 496
    aput-object v2, v0, v10

    .line 497
    .line 498
    aput-object v3, v0, v7

    .line 499
    .line 500
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 501
    .line 502
    .line 503
    move-result-object v7

    .line 504
    new-instance v2, Ll1/b;

    .line 505
    .line 506
    move-object/from16 v3, p1

    .line 507
    .line 508
    invoke-direct/range {v2 .. v7}, Ll1/b;-><init>(Landroid/content/Context;Landroidx/work/b;Landroidx/emoji2/text/t;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    iput-object v0, v1, Ll1/k;->c:Landroid/content/Context;

    .line 516
    .line 517
    iput-object v4, v1, Ll1/k;->d:Landroidx/work/b;

    .line 518
    .line 519
    iput-object v5, v1, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 520
    .line 521
    iput-object v6, v1, Ll1/k;->e:Landroidx/work/impl/WorkDatabase;

    .line 522
    .line 523
    iput-object v7, v1, Ll1/k;->g:Ljava/util/List;

    .line 524
    .line 525
    iput-object v2, v1, Ll1/k;->h:Ll1/b;

    .line 526
    .line 527
    new-instance v2, Lk1/j;

    .line 528
    .line 529
    const/16 v3, 0x15

    .line 530
    .line 531
    invoke-direct {v2, v6, v3}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 532
    .line 533
    .line 534
    iput-object v2, v1, Ll1/k;->i:Lk1/j;

    .line 535
    .line 536
    const/4 v10, 0x0

    .line 537
    iput-boolean v10, v1, Ll1/k;->j:Z

    .line 538
    .line 539
    invoke-virtual {v0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    if-nez v2, :cond_a

    .line 544
    .line 545
    iget-object v2, v1, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 546
    .line 547
    new-instance v3, Lu1/e;

    .line 548
    .line 549
    invoke-direct {v3, v0, v1}, Lu1/e;-><init>(Landroid/content/Context;Ll1/k;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v3}, Landroidx/emoji2/text/t;->i(Ljava/lang/Runnable;)V

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 557
    .line 558
    const-string v2, "Cannot initialize WorkManager in direct boot mode"

    .line 559
    .line 560
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw v0

    .line 564
    :catchall_0
    move-exception v0

    .line 565
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 566
    throw v0

    .line 567
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 568
    .line 569
    new-instance v3, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v4, "Failed to create an instance of "

    .line 572
    .line 573
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0

    .line 591
    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 592
    .line 593
    new-instance v3, Ljava/lang/StringBuilder;

    .line 594
    .line 595
    const-string v4, "Cannot access the constructor"

    .line 596
    .line 597
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :catch_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 616
    .line 617
    new-instance v3, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    const-string v4, "cannot find implementation for "

    .line 620
    .line 621
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    const-string v2, ". "

    .line 632
    .line 633
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const-string v2, " does not exist"

    .line 640
    .line 641
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    throw v0

    .line 652
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 653
    .line 654
    const-string v2, "Cannot provide null context for the database."

    .line 655
    .line 656
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    throw v0
.end method

.method public static Q(Landroid/content/Context;)Ll1/k;
    .locals 2

    .line 1
    sget-object v0, Ll1/k;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    sget-object v1, Ll1/k;->l:Ll1/k;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sget-object v1, Ll1/k;->m:Ll1/k;

    .line 14
    .line 15
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_2
    monitor-exit v0

    .line 19
    return-object v1

    .line 20
    :catchall_1
    move-exception p0

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 33
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    :try_start_4
    throw p0

    .line 35
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 36
    throw p0
.end method

.method public static R(Landroid/content/Context;Landroidx/work/b;)V
    .locals 4

    .line 1
    sget-object v0, Ll1/k;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ll1/k;->l:Ll1/k;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v2, Ll1/k;->m:Ll1/k;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, Ll1/k;->m:Ll1/k;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    new-instance v1, Ll1/k;

    .line 34
    .line 35
    new-instance v2, Landroidx/emoji2/text/t;

    .line 36
    .line 37
    iget-object v3, p1, Landroidx/work/b;->b:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-direct {v2, v3}, Landroidx/emoji2/text/t;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, p1, v2}, Ll1/k;-><init>(Landroid/content/Context;Landroidx/work/b;Landroidx/emoji2/text/t;)V

    .line 43
    .line 44
    .line 45
    sput-object v1, Ll1/k;->m:Ll1/k;

    .line 46
    .line 47
    :cond_2
    sget-object p0, Ll1/k;->m:Ll1/k;

    .line 48
    .line 49
    sput-object p0, Ll1/k;->l:Ll1/k;

    .line 50
    .line 51
    :cond_3
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw p0
.end method


# virtual methods
.method public final S()V
    .locals 2

    .line 1
    sget-object v0, Ll1/k;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ll1/k;->j:Z

    .line 6
    .line 7
    iget-object v1, p0, Ll1/k;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Ll1/k;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method

.method public final T()V
    .locals 5

    .line 1
    sget-object v0, Lo1/c;->k:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "jobscheduler"

    .line 4
    .line 5
    iget-object v1, p0, Ll1/k;->c:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v1, v0}, Lo1/c;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    check-cast v4, Landroid/app/job/JobInfo;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/app/job/JobInfo;->getId()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v0, v4}, Lo1/c;->c(Landroid/app/job/JobScheduler;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Ll1/k;->e:Landroidx/work/impl/WorkDatabase;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, v1, Ll2/j;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    invoke-virtual {v2}, Lz0/i;->b()V

    .line 61
    .line 62
    .line 63
    iget-object v1, v1, Ll2/j;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lt1/e;

    .line 66
    .line 67
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2}, Lz0/i;->c()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    iget-object v4, v3, Le1/f;->j:Landroid/database/sqlite/SQLiteStatement;

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Lz0/l;->c(Le1/f;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Ll1/k;->d:Landroidx/work/b;

    .line 89
    .line 90
    iget-object v2, p0, Ll1/k;->g:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v1, v0, v2}, Ll1/d;->a(Landroidx/work/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3}, Lz0/l;->c(Le1/f;)V

    .line 101
    .line 102
    .line 103
    throw v0
.end method

.method public final U(Ljava/lang/String;Landroidx/emoji2/text/t;)V
    .locals 2

    .line 1
    new-instance v0, Lc0/n;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lc0/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, Lc0/n;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p1, v0, Lc0/n;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, v0, Lc0/n;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p1, p0, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroidx/emoji2/text/t;->i(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final V(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lu1/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lu1/j;-><init>(Ll1/k;Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/emoji2/text/t;->i(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
