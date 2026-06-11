.class public final Lcom/google/android/gms/internal/ads/zzady;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzady;->zzb:[I

    return-void

    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzer;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;
    .locals 21

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeq;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zza(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzc()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    if-gt v3, v4, :cond_3c

    .line 22
    .line 23
    const/4 v5, 0x7

    .line 24
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eq v4, v7, :cond_0

    .line 33
    .line 34
    const v7, 0xac44

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const v7, 0xbb80

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 v8, 0x4

    .line 42
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 43
    .line 44
    .line 45
    const/16 v9, 0x9

    .line 46
    .line 47
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/16 v10, 0x10

    .line 52
    .line 53
    if-le v6, v4, :cond_2

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-eqz v11, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_2

    .line 71
    .line 72
    const/16 v11, 0x80

    .line 73
    .line 74
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    const-string v0, "Invalid AC-4 DSI version: 0"

    .line 79
    .line 80
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    throw v0

    .line 85
    :cond_2
    :goto_1
    if-ne v3, v4, :cond_4

    .line 86
    .line 87
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzady;->zzg(Lcom/google/android/gms/internal/ads/zzeq;)Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-eqz v11, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzm()V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 98
    .line 99
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    throw v0

    .line 104
    :cond_4
    :goto_2
    new-instance v11, Lcom/google/android/gms/internal/ads/zzadw;

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    invoke-direct {v11, v12}, Lcom/google/android/gms/internal/ads/zzadw;-><init>([B)V

    .line 108
    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    :goto_3
    const/4 v8, 0x6

    .line 112
    const/4 v15, 0x5

    .line 113
    const/16 v14, 0x8

    .line 114
    .line 115
    const/4 v5, 0x2

    .line 116
    if-ge v13, v9, :cond_2d

    .line 117
    .line 118
    if-nez v3, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 125
    .line 126
    .line 127
    move-result v16

    .line 128
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 129
    .line 130
    .line 131
    move-result v17

    .line 132
    move/from16 v18, v14

    .line 133
    .line 134
    move/from16 v14, v16

    .line 135
    .line 136
    move/from16 v5, v17

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v12, 0x0

    .line 141
    goto :goto_5

    .line 142
    :cond_5
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    move/from16 v18, v14

    .line 151
    .line 152
    const/16 v14, 0xff

    .line 153
    .line 154
    if-ne v4, v14, :cond_6

    .line 155
    .line 156
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    add-int/2addr v4, v14

    .line 161
    :cond_6
    if-le v12, v5, :cond_7

    .line 162
    .line 163
    mul-int/lit8 v4, v4, 0x8

    .line 164
    .line 165
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v13, v13, 0x1

    .line 169
    .line 170
    const/4 v4, 0x1

    .line 171
    const/4 v5, 0x7

    .line 172
    const/4 v8, 0x4

    .line 173
    goto :goto_3

    .line 174
    :cond_7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzc()I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    sub-int v9, v1, v9

    .line 179
    .line 180
    div-int/lit8 v9, v9, 0x8

    .line 181
    .line 182
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    const/16 v10, 0x1f

    .line 187
    .line 188
    if-ne v14, v10, :cond_8

    .line 189
    .line 190
    const/4 v10, 0x1

    .line 191
    goto :goto_4

    .line 192
    :cond_8
    const/4 v10, 0x0

    .line 193
    :goto_4
    move v5, v12

    .line 194
    move v12, v10

    .line 195
    move v10, v9

    .line 196
    const/4 v9, 0x0

    .line 197
    :goto_5
    iput v5, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzf:I

    .line 198
    .line 199
    const/16 v15, 0xf

    .line 200
    .line 201
    if-nez v9, :cond_a

    .line 202
    .line 203
    if-nez v12, :cond_a

    .line 204
    .line 205
    if-eq v14, v8, :cond_9

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_9
    move/from16 v20, v1

    .line 209
    .line 210
    :goto_6
    const/4 v1, 0x7

    .line 211
    goto/16 :goto_18

    .line 212
    .line 213
    :cond_a
    :goto_7
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    iput v8, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzg:I

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eqz v8, :cond_b

    .line 224
    .line 225
    const/4 v8, 0x5

    .line 226
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 227
    .line 228
    .line 229
    :cond_b
    const/4 v8, 0x2

    .line 230
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 231
    .line 232
    .line 233
    const/4 v2, 0x1

    .line 234
    if-ne v3, v2, :cond_d

    .line 235
    .line 236
    if-eq v5, v2, :cond_c

    .line 237
    .line 238
    if-ne v5, v8, :cond_d

    .line 239
    .line 240
    move v5, v8

    .line 241
    :cond_c
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 242
    .line 243
    .line 244
    :cond_d
    const/4 v8, 0x5

    .line 245
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 246
    .line 247
    .line 248
    const/16 v8, 0xa

    .line 249
    .line 250
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 251
    .line 252
    .line 253
    if-ne v3, v2, :cond_17

    .line 254
    .line 255
    if-lez v5, :cond_e

    .line 256
    .line 257
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    iput-boolean v8, v11, Lcom/google/android/gms/internal/ads/zzadw;->zza:Z

    .line 262
    .line 263
    :cond_e
    iget-boolean v8, v11, Lcom/google/android/gms/internal/ads/zzadw;->zza:Z

    .line 264
    .line 265
    if-eqz v8, :cond_13

    .line 266
    .line 267
    if-eq v5, v2, :cond_10

    .line 268
    .line 269
    const/4 v8, 0x2

    .line 270
    if-ne v5, v8, :cond_f

    .line 271
    .line 272
    const/4 v2, 0x2

    .line 273
    :goto_8
    move/from16 v20, v1

    .line 274
    .line 275
    const/4 v8, 0x5

    .line 276
    goto :goto_a

    .line 277
    :cond_f
    move/from16 v20, v1

    .line 278
    .line 279
    move v2, v5

    .line 280
    :goto_9
    const/16 v1, 0x18

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_10
    const/4 v2, 0x1

    .line 284
    goto :goto_8

    .line 285
    :goto_a
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-ltz v1, :cond_11

    .line 290
    .line 291
    if-gt v1, v15, :cond_11

    .line 292
    .line 293
    iput v1, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzb:I

    .line 294
    .line 295
    :cond_11
    const/16 v8, 0xb

    .line 296
    .line 297
    if-lt v1, v8, :cond_12

    .line 298
    .line 299
    const/16 v8, 0xe

    .line 300
    .line 301
    if-gt v1, v8, :cond_12

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    iput-boolean v1, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzd:Z

    .line 308
    .line 309
    const/4 v8, 0x2

    .line 310
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    iput v1, v11, Lcom/google/android/gms/internal/ads/zzadw;->zze:I

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_12
    const/4 v8, 0x2

    .line 318
    goto :goto_9

    .line 319
    :goto_b
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 320
    .line 321
    .line 322
    const/4 v1, 0x1

    .line 323
    goto :goto_c

    .line 324
    :cond_13
    move/from16 v20, v1

    .line 325
    .line 326
    const/4 v8, 0x2

    .line 327
    move v1, v2

    .line 328
    move v2, v5

    .line 329
    :goto_c
    if-eq v5, v1, :cond_14

    .line 330
    .line 331
    if-ne v5, v8, :cond_16

    .line 332
    .line 333
    :cond_14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eqz v1, :cond_15

    .line 338
    .line 339
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_15

    .line 344
    .line 345
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 346
    .line 347
    .line 348
    :cond_15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-eqz v1, :cond_16

    .line 353
    .line 354
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzg()V

    .line 355
    .line 356
    .line 357
    move/from16 v1, v18

    .line 358
    .line 359
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    const/4 v8, 0x0

    .line 364
    :goto_d
    if-ge v8, v5, :cond_16

    .line 365
    .line 366
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 367
    .line 368
    .line 369
    add-int/lit8 v8, v8, 0x1

    .line 370
    .line 371
    const/16 v1, 0x8

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_16
    move v5, v2

    .line 375
    goto :goto_e

    .line 376
    :cond_17
    move/from16 v20, v1

    .line 377
    .line 378
    :goto_e
    if-nez v9, :cond_20

    .line 379
    .line 380
    if-eqz v12, :cond_18

    .line 381
    .line 382
    goto/16 :goto_16

    .line 383
    .line 384
    :cond_18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzg()V

    .line 385
    .line 386
    .line 387
    if-eqz v14, :cond_1e

    .line 388
    .line 389
    const/4 v1, 0x1

    .line 390
    if-eq v14, v1, :cond_1e

    .line 391
    .line 392
    const/4 v8, 0x2

    .line 393
    if-eq v14, v8, :cond_1e

    .line 394
    .line 395
    const/4 v1, 0x3

    .line 396
    if-eq v14, v1, :cond_1c

    .line 397
    .line 398
    const/4 v1, 0x4

    .line 399
    if-eq v14, v1, :cond_1c

    .line 400
    .line 401
    const/4 v8, 0x5

    .line 402
    if-eq v14, v8, :cond_19

    .line 403
    .line 404
    const/4 v1, 0x7

    .line 405
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    const/4 v1, 0x0

    .line 410
    :goto_f
    if-ge v1, v2, :cond_22

    .line 411
    .line 412
    const/16 v8, 0x8

    .line 413
    .line 414
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 415
    .line 416
    .line 417
    add-int/lit8 v1, v1, 0x1

    .line 418
    .line 419
    goto :goto_f

    .line 420
    :cond_19
    if-nez v5, :cond_1b

    .line 421
    .line 422
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zzd(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 423
    .line 424
    .line 425
    :cond_1a
    :goto_10
    const/4 v5, 0x0

    .line 426
    goto :goto_17

    .line 427
    :cond_1b
    const/4 v1, 0x3

    .line 428
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    const/4 v1, 0x0

    .line 433
    :goto_11
    const/16 v19, 0x2

    .line 434
    .line 435
    add-int/lit8 v8, v2, 0x2

    .line 436
    .line 437
    if-ge v1, v8, :cond_22

    .line 438
    .line 439
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zze(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 440
    .line 441
    .line 442
    add-int/lit8 v1, v1, 0x1

    .line 443
    .line 444
    goto :goto_11

    .line 445
    :cond_1c
    if-nez v5, :cond_1d

    .line 446
    .line 447
    const/4 v1, 0x0

    .line 448
    const/4 v2, 0x3

    .line 449
    :goto_12
    if-ge v1, v2, :cond_1a

    .line 450
    .line 451
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zzd(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 452
    .line 453
    .line 454
    add-int/lit8 v1, v1, 0x1

    .line 455
    .line 456
    goto :goto_12

    .line 457
    :cond_1d
    const/4 v1, 0x0

    .line 458
    :goto_13
    const/4 v2, 0x3

    .line 459
    if-ge v1, v2, :cond_22

    .line 460
    .line 461
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zze(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 462
    .line 463
    .line 464
    add-int/lit8 v1, v1, 0x1

    .line 465
    .line 466
    goto :goto_13

    .line 467
    :cond_1e
    if-nez v5, :cond_1f

    .line 468
    .line 469
    const/4 v1, 0x0

    .line 470
    const/4 v8, 0x2

    .line 471
    :goto_14
    if-ge v1, v8, :cond_1a

    .line 472
    .line 473
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zzd(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 474
    .line 475
    .line 476
    add-int/lit8 v1, v1, 0x1

    .line 477
    .line 478
    goto :goto_14

    .line 479
    :cond_1f
    const/4 v1, 0x0

    .line 480
    :goto_15
    const/4 v8, 0x2

    .line 481
    if-ge v1, v8, :cond_22

    .line 482
    .line 483
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zze(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 484
    .line 485
    .line 486
    add-int/lit8 v1, v1, 0x1

    .line 487
    .line 488
    goto :goto_15

    .line 489
    :cond_20
    :goto_16
    if-nez v5, :cond_21

    .line 490
    .line 491
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zzd(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 492
    .line 493
    .line 494
    goto :goto_10

    .line 495
    :cond_21
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzady;->zze(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V

    .line 496
    .line 497
    .line 498
    :cond_22
    :goto_17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzg()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-eqz v1, :cond_23

    .line 506
    .line 507
    goto/16 :goto_6

    .line 508
    .line 509
    :goto_18
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    const/4 v8, 0x0

    .line 514
    :goto_19
    if-ge v8, v2, :cond_24

    .line 515
    .line 516
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 517
    .line 518
    .line 519
    add-int/lit8 v8, v8, 0x1

    .line 520
    .line 521
    goto :goto_19

    .line 522
    :cond_23
    const/4 v1, 0x7

    .line 523
    :cond_24
    if-lez v5, :cond_28

    .line 524
    .line 525
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_26

    .line 530
    .line 531
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzady;->zzg(Lcom/google/android/gms/internal/ads/zzeq;)Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_25

    .line 536
    .line 537
    goto :goto_1a

    .line 538
    :cond_25
    const-string v0, "Can\'t parse bitrate DSI."

    .line 539
    .line 540
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    throw v0

    .line 545
    :cond_26
    :goto_1a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    if-eqz v2, :cond_28

    .line 550
    .line 551
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzm()V

    .line 552
    .line 553
    .line 554
    const/16 v2, 0x10

    .line 555
    .line 556
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzo(I)V

    .line 561
    .line 562
    .line 563
    const/4 v8, 0x5

    .line 564
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    const/4 v12, 0x0

    .line 569
    :goto_1b
    if-ge v12, v2, :cond_27

    .line 570
    .line 571
    const/4 v5, 0x3

    .line 572
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 573
    .line 574
    .line 575
    const/16 v5, 0x8

    .line 576
    .line 577
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 578
    .line 579
    .line 580
    add-int/lit8 v12, v12, 0x1

    .line 581
    .line 582
    goto :goto_1b

    .line 583
    :cond_27
    const/16 v5, 0x8

    .line 584
    .line 585
    goto :goto_1c

    .line 586
    :cond_28
    const/16 v5, 0x8

    .line 587
    .line 588
    const/4 v8, 0x5

    .line 589
    :goto_1c
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzm()V

    .line 590
    .line 591
    .line 592
    const/4 v2, 0x1

    .line 593
    if-ne v3, v2, :cond_2a

    .line 594
    .line 595
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzc()I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    sub-int v2, v20, v2

    .line 600
    .line 601
    div-int/2addr v2, v5

    .line 602
    sub-int/2addr v2, v10

    .line 603
    if-lt v4, v2, :cond_29

    .line 604
    .line 605
    sub-int/2addr v4, v2

    .line 606
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzo(I)V

    .line 607
    .line 608
    .line 609
    goto :goto_1d

    .line 610
    :cond_29
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    .line 611
    .line 612
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    throw v0

    .line 617
    :cond_2a
    :goto_1d
    iget-boolean v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zza:Z

    .line 618
    .line 619
    if-eqz v0, :cond_2c

    .line 620
    .line 621
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzb:I

    .line 622
    .line 623
    const/4 v2, -0x1

    .line 624
    if-eq v0, v2, :cond_2b

    .line 625
    .line 626
    goto :goto_1f

    .line 627
    :cond_2b
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    new-instance v1, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    add-int/lit8 v0, v0, 0x2d

    .line 638
    .line 639
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 640
    .line 641
    .line 642
    const-string v0, "Can\'t determine channel mode of presentation "

    .line 643
    .line 644
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    throw v0

    .line 659
    :cond_2c
    :goto_1e
    const/4 v2, -0x1

    .line 660
    goto :goto_1f

    .line 661
    :cond_2d
    move v5, v14

    .line 662
    move v8, v15

    .line 663
    const/4 v1, 0x7

    .line 664
    goto :goto_1e

    .line 665
    :goto_1f
    iget-boolean v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zza:Z

    .line 666
    .line 667
    const/16 v3, 0xc

    .line 668
    .line 669
    if-eqz v0, :cond_33

    .line 670
    .line 671
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzb:I

    .line 672
    .line 673
    iget-boolean v4, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzd:Z

    .line 674
    .line 675
    iget v9, v11, Lcom/google/android/gms/internal/ads/zzadw;->zze:I

    .line 676
    .line 677
    const/16 v10, 0xd

    .line 678
    .line 679
    packed-switch v0, :pswitch_data_0

    .line 680
    .line 681
    .line 682
    :goto_20
    const/16 v8, 0xb

    .line 683
    .line 684
    goto :goto_21

    .line 685
    :pswitch_0
    const/16 v2, 0x18

    .line 686
    .line 687
    goto :goto_20

    .line 688
    :pswitch_1
    const/16 v2, 0xe

    .line 689
    .line 690
    goto :goto_20

    .line 691
    :pswitch_2
    move v2, v10

    .line 692
    goto :goto_20

    .line 693
    :pswitch_3
    move v2, v3

    .line 694
    goto :goto_20

    .line 695
    :pswitch_4
    const/16 v2, 0xb

    .line 696
    .line 697
    goto :goto_20

    .line 698
    :pswitch_5
    move v2, v5

    .line 699
    goto :goto_20

    .line 700
    :pswitch_6
    move v2, v1

    .line 701
    goto :goto_20

    .line 702
    :pswitch_7
    const/4 v2, 0x6

    .line 703
    goto :goto_20

    .line 704
    :pswitch_8
    move v2, v8

    .line 705
    goto :goto_20

    .line 706
    :pswitch_9
    const/4 v2, 0x3

    .line 707
    goto :goto_20

    .line 708
    :pswitch_a
    const/4 v2, 0x2

    .line 709
    goto :goto_20

    .line 710
    :pswitch_b
    const/4 v2, 0x1

    .line 711
    goto :goto_20

    .line 712
    :goto_21
    if-eq v0, v8, :cond_2f

    .line 713
    .line 714
    if-eq v0, v3, :cond_2f

    .line 715
    .line 716
    if-eq v0, v10, :cond_2f

    .line 717
    .line 718
    const/16 v8, 0xe

    .line 719
    .line 720
    if-ne v0, v8, :cond_2e

    .line 721
    .line 722
    goto :goto_22

    .line 723
    :cond_2e
    move v12, v2

    .line 724
    goto/16 :goto_24

    .line 725
    .line 726
    :cond_2f
    :goto_22
    if-nez v4, :cond_30

    .line 727
    .line 728
    add-int/lit8 v2, v2, -0x2

    .line 729
    .line 730
    :cond_30
    move v12, v2

    .line 731
    if-eqz v9, :cond_32

    .line 732
    .line 733
    const/4 v1, 0x1

    .line 734
    if-eq v9, v1, :cond_31

    .line 735
    .line 736
    goto :goto_24

    .line 737
    :cond_31
    add-int/lit8 v12, v12, -0x2

    .line 738
    .line 739
    goto :goto_24

    .line 740
    :cond_32
    add-int/lit8 v12, v12, -0x4

    .line 741
    .line 742
    goto :goto_24

    .line 743
    :cond_33
    const/4 v1, 0x1

    .line 744
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzc:I

    .line 745
    .line 746
    if-lez v0, :cond_34

    .line 747
    .line 748
    add-int/lit8 v12, v0, 0x1

    .line 749
    .line 750
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzg:I

    .line 751
    .line 752
    const/4 v1, 0x4

    .line 753
    if-ne v0, v1, :cond_3a

    .line 754
    .line 755
    const/16 v0, 0x11

    .line 756
    .line 757
    if-ne v12, v0, :cond_3a

    .line 758
    .line 759
    const/16 v12, 0x15

    .line 760
    .line 761
    goto :goto_24

    .line 762
    :cond_34
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzg:I

    .line 763
    .line 764
    if-eqz v0, :cond_39

    .line 765
    .line 766
    const/4 v1, 0x1

    .line 767
    if-eq v0, v1, :cond_38

    .line 768
    .line 769
    const/4 v8, 0x2

    .line 770
    if-eq v0, v8, :cond_37

    .line 771
    .line 772
    const/4 v1, 0x3

    .line 773
    if-eq v0, v1, :cond_36

    .line 774
    .line 775
    const/4 v1, 0x4

    .line 776
    if-eq v0, v1, :cond_35

    .line 777
    .line 778
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    new-instance v2, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    add-int/lit8 v1, v1, 0x21

    .line 789
    .line 790
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 791
    .line 792
    .line 793
    const-string v1, "AC-4 level "

    .line 794
    .line 795
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    const-string v0, " has not been defined."

    .line 802
    .line 803
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    const-string v1, "Ac4Util"

    .line 811
    .line 812
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    :goto_23
    move v12, v8

    .line 816
    goto :goto_24

    .line 817
    :cond_35
    move v12, v3

    .line 818
    goto :goto_24

    .line 819
    :cond_36
    const/16 v12, 0xa

    .line 820
    .line 821
    goto :goto_24

    .line 822
    :cond_37
    move v12, v5

    .line 823
    goto :goto_24

    .line 824
    :cond_38
    const/4 v12, 0x6

    .line 825
    goto :goto_24

    .line 826
    :cond_39
    const/4 v8, 0x2

    .line 827
    goto :goto_23

    .line 828
    :cond_3a
    :goto_24
    if-lez v12, :cond_3b

    .line 829
    .line 830
    iget v0, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzf:I

    .line 831
    .line 832
    iget v1, v11, Lcom/google/android/gms/internal/ads/zzadw;->zzg:I

    .line 833
    .line 834
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 843
    .line 844
    .line 845
    move-result-object v1

    .line 846
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 851
    .line 852
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 853
    .line 854
    const-string v2, "ac-4.%02d.%02d.%02d"

    .line 855
    .line 856
    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    new-instance v1, Lcom/google/android/gms/internal/ads/zzt;

    .line 861
    .line 862
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 863
    .line 864
    .line 865
    move-object/from16 v2, p1

    .line 866
    .line 867
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 868
    .line 869
    .line 870
    const-string v2, "audio/ac4"

    .line 871
    .line 872
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/zzt;->zzE(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzF(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 879
    .line 880
    .line 881
    move-object/from16 v2, p3

    .line 882
    .line 883
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzq(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    .line 884
    .line 885
    .line 886
    move-object/from16 v2, p2

    .line 887
    .line 888
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    return-object v0

    .line 899
    :cond_3b
    const-string v0, "Cannot determine channel count of presentation."

    .line 900
    .line 901
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    throw v0

    .line 906
    :cond_3c
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 911
    .line 912
    .line 913
    move-result v0

    .line 914
    new-instance v1, Ljava/lang/StringBuilder;

    .line 915
    .line 916
    add-int/lit8 v0, v0, 0x1e

    .line 917
    .line 918
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 919
    .line 920
    .line 921
    const-string v0, "Unsupported AC-4 DSI version: "

    .line 922
    .line 923
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    throw v0

    .line 938
    nop

    .line 939
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzeq;)Lcom/google/android/gms/internal/ads/zzadx;
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    const v2, 0xac41

    .line 28
    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    :cond_1
    move v8, v0

    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v4, 0x3

    .line 42
    if-ne v1, v4, :cond_2

    .line 43
    .line 44
    move v1, v2

    .line 45
    :goto_1
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/2addr v5, v1

    .line 50
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    add-int/lit8 v1, v5, 0x3

    .line 57
    .line 58
    :cond_2
    move v5, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    shl-int/lit8 v1, v5, 0x2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :goto_2
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-lez v6, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const v7, 0xbb80

    .line 91
    .line 92
    .line 93
    const v9, 0xac44

    .line 94
    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    if-eq v10, v6, :cond_5

    .line 98
    .line 99
    move v6, v7

    .line 100
    move v7, v9

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move v6, v7

    .line 103
    :goto_3
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-ne v7, v9, :cond_7

    .line 108
    .line 109
    const/16 v9, 0xd

    .line 110
    .line 111
    if-ne p0, v9, :cond_7

    .line 112
    .line 113
    sget-object p0, Lcom/google/android/gms/internal/ads/zzady;->zzb:[I

    .line 114
    .line 115
    aget v2, p0, v9

    .line 116
    .line 117
    :cond_6
    :goto_4
    move v9, v2

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    if-ne v7, v6, :cond_6

    .line 120
    .line 121
    const/16 v6, 0xe

    .line 122
    .line 123
    if-ge p0, v6, :cond_6

    .line 124
    .line 125
    sget-object v2, Lcom/google/android/gms/internal/ads/zzady;->zzb:[I

    .line 126
    .line 127
    aget v2, v2, p0

    .line 128
    .line 129
    rem-int/lit8 v1, v1, 0x5

    .line 130
    .line 131
    const/16 v6, 0x8

    .line 132
    .line 133
    if-eq v1, v10, :cond_b

    .line 134
    .line 135
    const/16 v9, 0xb

    .line 136
    .line 137
    if-eq v1, v0, :cond_a

    .line 138
    .line 139
    if-eq v1, v4, :cond_b

    .line 140
    .line 141
    if-eq v1, v3, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    if-eq p0, v4, :cond_9

    .line 145
    .line 146
    if-eq p0, v6, :cond_9

    .line 147
    .line 148
    if-ne p0, v9, :cond_6

    .line 149
    .line 150
    :cond_9
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-eq p0, v6, :cond_9

    .line 154
    .line 155
    if-ne p0, v9, :cond_6

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_b
    if-eq p0, v4, :cond_9

    .line 159
    .line 160
    if-ne p0, v6, :cond_6

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :goto_6
    new-instance v4, Lcom/google/android/gms/internal/ads/zzadx;

    .line 164
    .line 165
    const/4 v6, 0x2

    .line 166
    const/4 v10, 0x0

    .line 167
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzadx;-><init>(IIIII[B)V

    .line 168
    .line 169
    .line 170
    return-object v4
.end method

.method public static zzc(ILcom/google/android/gms/internal/ads/zzer;)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, -0x54

    .line 11
    .line 12
    aput-byte v1, p1, v0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/16 v1, 0x40

    .line 16
    .line 17
    aput-byte v1, p1, v0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    const/4 v1, -0x1

    .line 21
    aput-byte v1, p1, v0

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    aput-byte v1, p1, v0

    .line 25
    .line 26
    shr-int/lit8 v0, p0, 0x10

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0xff

    .line 29
    .line 30
    int-to-byte v0, v0

    .line 31
    const/4 v1, 0x4

    .line 32
    aput-byte v0, p1, v1

    .line 33
    .line 34
    shr-int/lit8 v0, p0, 0x8

    .line 35
    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    const/4 v1, 0x5

    .line 40
    aput-byte v0, p1, v1

    .line 41
    .line 42
    and-int/lit16 p0, p0, 0xff

    .line 43
    .line 44
    int-to-byte p0, p0

    .line 45
    const/4 v0, 0x6

    .line 46
    aput-byte p0, p1, v0

    .line 47
    .line 48
    return-void
.end method

.method private static zzd(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V
    .locals 4

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x7

    .line 20
    if-lt v1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    if-gt v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzg()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzadw;->zzb:I

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    if-ne v2, v3, :cond_3

    .line 44
    .line 45
    if-ltz v1, :cond_3

    .line 46
    .line 47
    const/16 v2, 0xf

    .line 48
    .line 49
    if-gt v1, v2, :cond_3

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    :cond_2
    iput v1, p1, Lcom/google/android/gms/internal/ads/zzadw;->zzb:I

    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzady;->zzf(Lcom/google/android/gms/internal/ads/zzeq;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzeq;Lcom/google/android/gms/internal/ads/zzadw;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x18

    .line 34
    .line 35
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 v4, 0x6

    .line 56
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzadw;->zzc:I

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    const/4 p1, 0x3

    .line 77
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzi()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzady;->zzf(Lcom/google/android/gms/internal/ads/zzeq;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzeq;)V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x2a

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "Invalid language tag bytes number: %d. Must be between 2 and 42."

    .line 28
    .line 29
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    throw p0
.end method

.method private static zzg(Lcom/google/android/gms/internal/ads/zzeq;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeq;->zzc()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x42

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeq;->zzh(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method
