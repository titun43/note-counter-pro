.class public final synthetic Ly1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ly1/p;


# direct methods
.method public synthetic constructor <init>(Ly1/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/o;->a:Ly1/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Ly1/o;->a:Ly1/p;

    .line 4
    .line 5
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 6
    .line 7
    iget-object v3, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 11
    .line 12
    iget v0, v0, Ly1/b;->b:I

    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    if-ne v0, v4, :cond_0

    .line 17
    .line 18
    monitor-exit v3

    .line 19
    return-object v5

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto/16 :goto_22

    .line 22
    .line 23
    :cond_0
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 24
    .line 25
    iget v6, v0, Ly1/b;->b:I

    .line 26
    .line 27
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "accountName"

    .line 40
    .line 41
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, v2, Ly1/p;->b:Ly1/b;

    .line 45
    .line 46
    iget-object v7, v3, Ly1/b;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, v3, Ly1/b;->y:Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    invoke-static {v0, v7, v8, v9}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v0, v5

    .line 59
    :goto_0
    const/4 v3, 0x6

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x1

    .line 62
    :try_start_1
    iget-object v9, v2, Ly1/p;->b:Ly1/b;

    .line 63
    .line 64
    iget-object v9, v9, Ly1/b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    :try_start_2
    iget-object v10, v2, Ly1/p;->b:Ly1/b;

    .line 68
    .line 69
    iget-object v10, v10, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 70
    .line 71
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 72
    if-nez v10, :cond_2

    .line 73
    .line 74
    :try_start_3
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 75
    .line 76
    invoke-virtual {v0, v7}, Ly1/b;->m(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 80
    .line 81
    sget-object v4, Ly1/b0;->i:Ly1/e;

    .line 82
    .line 83
    const/16 v9, 0x77

    .line 84
    .line 85
    invoke-virtual {v0, v9, v3, v4}, Ly1/b;->t(IILy1/e;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, Ly1/p;->a(Ly1/e;)V

    .line 89
    .line 90
    .line 91
    return-object v5

    .line 92
    :catch_0
    move-exception v0

    .line 93
    move-object/from16 v16, v5

    .line 94
    .line 95
    goto/16 :goto_17

    .line 96
    .line 97
    :cond_2
    iget-object v9, v2, Ly1/p;->b:Ly1/b;

    .line 98
    .line 99
    iget-object v9, v9, Ly1/b;->f:Landroid/content/Context;

    .line 100
    .line 101
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    const/16 v11, 0x17

    .line 106
    .line 107
    move v13, v4

    .line 108
    move v12, v11

    .line 109
    :goto_1
    if-lt v12, v4, :cond_5

    .line 110
    .line 111
    if-nez v0, :cond_3

    .line 112
    .line 113
    const-string v13, "subs"

    .line 114
    .line 115
    invoke-interface {v10, v12, v9, v13}, Lcom/google/android/gms/internal/play_billing/zzan;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const-string v13, "subs"

    .line 121
    .line 122
    invoke-interface {v10, v12, v9, v13, v0}, Lcom/google/android/gms/internal/play_billing/zzan;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    :goto_2
    if-nez v13, :cond_4

    .line 127
    .line 128
    const-string v14, "BillingClient"

    .line 129
    .line 130
    new-instance v15, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 133
    .line 134
    .line 135
    move-object/from16 v16, v5

    .line 136
    .line 137
    :try_start_4
    const-string v5, "highestLevelSupportedForSubs: "

    .line 138
    .line 139
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v14, v5}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catch_1
    move-exception v0

    .line 154
    goto/16 :goto_17

    .line 155
    .line 156
    :cond_4
    move-object/from16 v16, v5

    .line 157
    .line 158
    add-int/lit8 v12, v12, -0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    move-object/from16 v16, v5

    .line 162
    .line 163
    move v12, v7

    .line 164
    :goto_3
    iget-object v5, v2, Ly1/p;->b:Ly1/b;

    .line 165
    .line 166
    if-lt v12, v4, :cond_6

    .line 167
    .line 168
    move v14, v8

    .line 169
    goto :goto_4

    .line 170
    :cond_6
    move v14, v7

    .line 171
    :goto_4
    iput-boolean v14, v5, Ly1/b;->j:Z

    .line 172
    .line 173
    const/16 v5, 0x9

    .line 174
    .line 175
    if-ge v12, v4, :cond_7

    .line 176
    .line 177
    const-string v12, "BillingClient"

    .line 178
    .line 179
    const-string v14, "In-app billing API does not support subscription on this device."

    .line 180
    .line 181
    invoke-static {v12, v14}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    move v12, v5

    .line 185
    goto :goto_5

    .line 186
    :cond_7
    move v12, v8

    .line 187
    :goto_5
    if-lt v11, v4, :cond_a

    .line 188
    .line 189
    if-nez v0, :cond_8

    .line 190
    .line 191
    const-string v13, "inapp"

    .line 192
    .line 193
    invoke-interface {v10, v11, v9, v13}, Lcom/google/android/gms/internal/play_billing/zzan;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    goto :goto_6

    .line 198
    :cond_8
    const-string v13, "inapp"

    .line 199
    .line 200
    invoke-interface {v10, v11, v9, v13, v0}, Lcom/google/android/gms/internal/play_billing/zzan;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 201
    .line 202
    .line 203
    move-result v13

    .line 204
    :goto_6
    if-nez v13, :cond_9

    .line 205
    .line 206
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 207
    .line 208
    iput v11, v0, Ly1/b;->k:I

    .line 209
    .line 210
    const-string v0, "BillingClient"

    .line 211
    .line 212
    new-instance v9, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const-string v10, "mHighestLevelSupportedForInApp: "

    .line 218
    .line 219
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-static {v0, v9}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_9
    add-int/lit8 v11, v11, -0x1

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_a
    :goto_7
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 237
    .line 238
    iget v9, v0, Ly1/b;->k:I

    .line 239
    .line 240
    const/16 v10, 0x15

    .line 241
    .line 242
    if-lt v9, v10, :cond_b

    .line 243
    .line 244
    move v10, v8

    .line 245
    goto :goto_8

    .line 246
    :cond_b
    move v10, v7

    .line 247
    :goto_8
    iput-boolean v10, v0, Ly1/b;->t:Z

    .line 248
    .line 249
    const/16 v10, 0x14

    .line 250
    .line 251
    if-lt v9, v10, :cond_c

    .line 252
    .line 253
    move v10, v8

    .line 254
    goto :goto_9

    .line 255
    :cond_c
    move v10, v7

    .line 256
    :goto_9
    iput-boolean v10, v0, Ly1/b;->s:Z

    .line 257
    .line 258
    const/16 v10, 0x13

    .line 259
    .line 260
    if-lt v9, v10, :cond_d

    .line 261
    .line 262
    move v10, v8

    .line 263
    goto :goto_a

    .line 264
    :cond_d
    move v10, v7

    .line 265
    :goto_a
    iput-boolean v10, v0, Ly1/b;->r:Z

    .line 266
    .line 267
    const/16 v10, 0x11

    .line 268
    .line 269
    if-lt v9, v10, :cond_e

    .line 270
    .line 271
    move v10, v8

    .line 272
    goto :goto_b

    .line 273
    :cond_e
    move v10, v7

    .line 274
    :goto_b
    iput-boolean v10, v0, Ly1/b;->q:Z

    .line 275
    .line 276
    const/16 v10, 0x10

    .line 277
    .line 278
    if-lt v9, v10, :cond_f

    .line 279
    .line 280
    move v10, v8

    .line 281
    goto :goto_c

    .line 282
    :cond_f
    move v10, v7

    .line 283
    :goto_c
    iput-boolean v10, v0, Ly1/b;->p:Z

    .line 284
    .line 285
    const/16 v10, 0xf

    .line 286
    .line 287
    if-lt v9, v10, :cond_10

    .line 288
    .line 289
    move v10, v8

    .line 290
    goto :goto_d

    .line 291
    :cond_10
    move v10, v7

    .line 292
    :goto_d
    iput-boolean v10, v0, Ly1/b;->o:Z

    .line 293
    .line 294
    const/16 v10, 0xe

    .line 295
    .line 296
    if-lt v9, v10, :cond_11

    .line 297
    .line 298
    move v10, v8

    .line 299
    goto :goto_e

    .line 300
    :cond_11
    move v10, v7

    .line 301
    :goto_e
    iput-boolean v10, v0, Ly1/b;->n:Z

    .line 302
    .line 303
    if-lt v9, v5, :cond_12

    .line 304
    .line 305
    move v5, v8

    .line 306
    goto :goto_f

    .line 307
    :cond_12
    move v5, v7

    .line 308
    :goto_f
    iput-boolean v5, v0, Ly1/b;->m:Z

    .line 309
    .line 310
    if-lt v9, v3, :cond_13

    .line 311
    .line 312
    move v5, v8

    .line 313
    goto :goto_10

    .line 314
    :cond_13
    move v5, v7

    .line 315
    :goto_10
    iput-boolean v5, v0, Ly1/b;->l:Z

    .line 316
    .line 317
    if-ge v9, v4, :cond_14

    .line 318
    .line 319
    const-string v0, "BillingClient"

    .line 320
    .line 321
    const-string v5, "In-app billing API version 3 is not supported on this device."

    .line 322
    .line 323
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const/16 v12, 0x24

    .line 327
    .line 328
    :cond_14
    if-nez v13, :cond_19

    .line 329
    .line 330
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 331
    .line 332
    iget-object v5, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 333
    .line 334
    monitor-enter v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 335
    :try_start_5
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 336
    .line 337
    iget v0, v0, Ly1/b;->b:I

    .line 338
    .line 339
    if-ne v0, v4, :cond_15

    .line 340
    .line 341
    monitor-exit v5

    .line 342
    return-object v16

    .line 343
    :catchall_1
    move-exception v0

    .line 344
    goto :goto_14

    .line 345
    :cond_15
    if-ne v6, v8, :cond_16

    .line 346
    .line 347
    move v0, v7

    .line 348
    goto :goto_11

    .line 349
    :cond_16
    move v0, v8

    .line 350
    :goto_11
    iget-object v4, v2, Ly1/p;->b:Ly1/b;

    .line 351
    .line 352
    const/4 v9, 0x2

    .line 353
    invoke-virtual {v4, v9}, Ly1/b;->m(I)V

    .line 354
    .line 355
    .line 356
    iget-object v4, v2, Ly1/p;->b:Ly1/b;

    .line 357
    .line 358
    iget-object v4, v4, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 359
    .line 360
    if-eqz v4, :cond_17

    .line 361
    .line 362
    iget-object v4, v2, Ly1/p;->b:Ly1/b;

    .line 363
    .line 364
    iget-object v4, v4, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 365
    .line 366
    goto :goto_12

    .line 367
    :cond_17
    move-object/from16 v4, v16

    .line 368
    .line 369
    :goto_12
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 370
    if-eqz v4, :cond_18

    .line 371
    .line 372
    :try_start_6
    iget-object v5, v2, Ly1/p;->b:Ly1/b;

    .line 373
    .line 374
    iget-boolean v5, v5, Ly1/b;->t:Z

    .line 375
    .line 376
    invoke-virtual {v4, v5}, Lcom/google/android/gms/common/api/internal/c0;->c(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 377
    .line 378
    .line 379
    :cond_18
    :goto_13
    move-object/from16 v4, v16

    .line 380
    .line 381
    goto :goto_1c

    .line 382
    :goto_14
    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 383
    :try_start_8
    throw v0

    .line 384
    :cond_19
    if-ne v6, v8, :cond_1a

    .line 385
    .line 386
    move v0, v7

    .line 387
    goto :goto_15

    .line 388
    :cond_1a
    move v0, v8

    .line 389
    :goto_15
    iget-object v4, v2, Ly1/p;->b:Ly1/b;

    .line 390
    .line 391
    invoke-virtual {v4, v7}, Ly1/b;->m(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 392
    .line 393
    .line 394
    goto :goto_13

    .line 395
    :catchall_2
    move-exception v0

    .line 396
    move-object/from16 v16, v5

    .line 397
    .line 398
    :goto_16
    :try_start_9
    monitor-exit v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 399
    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 400
    :catchall_3
    move-exception v0

    .line 401
    goto :goto_16

    .line 402
    :goto_17
    if-ne v6, v8, :cond_1b

    .line 403
    .line 404
    move v4, v7

    .line 405
    goto :goto_18

    .line 406
    :cond_1b
    move v4, v8

    .line 407
    :goto_18
    const-string v5, "BillingClient"

    .line 408
    .line 409
    const-string v6, "Exception while checking if billing is supported; try to reconnect"

    .line 410
    .line 411
    invoke-static {v5, v6, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 412
    .line 413
    .line 414
    instance-of v5, v0, Landroid/os/DeadObjectException;

    .line 415
    .line 416
    const/16 v6, 0x2a

    .line 417
    .line 418
    if-eqz v5, :cond_1c

    .line 419
    .line 420
    const/16 v5, 0x65

    .line 421
    .line 422
    :goto_19
    move v12, v5

    .line 423
    goto :goto_1a

    .line 424
    :cond_1c
    instance-of v5, v0, Landroid/os/RemoteException;

    .line 425
    .line 426
    if-eqz v5, :cond_1d

    .line 427
    .line 428
    const/16 v5, 0x64

    .line 429
    .line 430
    goto :goto_19

    .line 431
    :cond_1d
    instance-of v5, v0, Ljava/lang/SecurityException;

    .line 432
    .line 433
    if-eqz v5, :cond_1e

    .line 434
    .line 435
    const/16 v5, 0x66

    .line 436
    .line 437
    goto :goto_19

    .line 438
    :cond_1e
    move v12, v6

    .line 439
    :goto_1a
    if-ne v12, v6, :cond_1f

    .line 440
    .line 441
    invoke-static {v0}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    goto :goto_1b

    .line 446
    :cond_1f
    move-object/from16 v0, v16

    .line 447
    .line 448
    :goto_1b
    iget-object v5, v2, Ly1/p;->b:Ly1/b;

    .line 449
    .line 450
    invoke-virtual {v5, v7}, Ly1/b;->m(I)V

    .line 451
    .line 452
    .line 453
    move v13, v4

    .line 454
    move-object v4, v0

    .line 455
    move v0, v13

    .line 456
    move v13, v3

    .line 457
    :goto_1c
    if-nez v13, :cond_21

    .line 458
    .line 459
    if-eq v8, v0, :cond_20

    .line 460
    .line 461
    :try_start_b
    iget-object v0, v2, Ly1/p;->b:Ly1/b;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 462
    .line 463
    :try_start_c
    invoke-static {v3}, Ly1/z;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {v0, v3}, Ly1/b;->l(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 468
    .line 469
    .line 470
    goto :goto_1e

    .line 471
    :catchall_4
    move-exception v0

    .line 472
    :try_start_d
    const-string v3, "BillingClient"

    .line 473
    .line 474
    const-string v4, "Unable to log."

    .line 475
    .line 476
    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    goto :goto_1e

    .line 480
    :catchall_5
    move-exception v0

    .line 481
    goto :goto_1d

    .line 482
    :cond_20
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 483
    .line 484
    iget-object v0, v0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 485
    .line 486
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlq;->zzc()Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/play_billing/zzke;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/play_billing/zzlo;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzlq;

    .line 505
    .line 506
    invoke-virtual {v0, v3}, Landroidx/emoji2/text/p;->J(Lcom/google/android/gms/internal/play_billing/zzlq;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 507
    .line 508
    .line 509
    goto :goto_1e

    .line 510
    :goto_1d
    const-string v3, "BillingClient"

    .line 511
    .line 512
    const-string v4, "Unable to log."

    .line 513
    .line 514
    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    :goto_1e
    sget-object v0, Ly1/b0;->h:Ly1/e;

    .line 518
    .line 519
    invoke-virtual {v2, v0}, Ly1/p;->a(Ly1/e;)V

    .line 520
    .line 521
    .line 522
    goto :goto_21

    .line 523
    :cond_21
    sget-object v5, Ly1/b0;->a:Ly1/e;

    .line 524
    .line 525
    if-eq v8, v0, :cond_22

    .line 526
    .line 527
    :try_start_e
    iget-object v0, v2, Ly1/p;->b:Ly1/b;

    .line 528
    .line 529
    invoke-virtual {v0, v12, v3, v5, v4}, Ly1/b;->u(IILy1/e;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    goto :goto_20

    .line 533
    :catchall_6
    move-exception v0

    .line 534
    goto :goto_1f

    .line 535
    :cond_22
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iget v3, v5, Ly1/e;->a:I

    .line 540
    .line 541
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 542
    .line 543
    .line 544
    iget-object v3, v5, Ly1/e;->b:Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 550
    .line 551
    .line 552
    if-eqz v4, :cond_23

    .line 553
    .line 554
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/play_billing/zzke;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 555
    .line 556
    .line 557
    :cond_23
    iget-object v3, v2, Ly1/p;->b:Ly1/b;

    .line 558
    .line 559
    iget-object v3, v3, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 560
    .line 561
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlq;->zzc()Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzki;

    .line 570
    .line 571
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzlo;->zzm(Lcom/google/android/gms/internal/play_billing/zzki;)Lcom/google/android/gms/internal/play_billing/zzlo;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzlq;

    .line 579
    .line 580
    invoke-virtual {v3, v0}, Landroidx/emoji2/text/p;->J(Lcom/google/android/gms/internal/play_billing/zzlq;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 581
    .line 582
    .line 583
    goto :goto_20

    .line 584
    :goto_1f
    const-string v3, "BillingClient"

    .line 585
    .line 586
    const-string v4, "Unable to log."

    .line 587
    .line 588
    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 589
    .line 590
    .line 591
    :goto_20
    sget-object v0, Ly1/b0;->a:Ly1/e;

    .line 592
    .line 593
    invoke-virtual {v2, v0}, Ly1/p;->a(Ly1/e;)V

    .line 594
    .line 595
    .line 596
    :goto_21
    return-object v16

    .line 597
    :goto_22
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 598
    throw v0
.end method
