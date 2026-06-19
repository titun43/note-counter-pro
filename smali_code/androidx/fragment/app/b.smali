.class public final Landroidx/fragment/app/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/fragment/app/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/fragment/app/b;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v6, v3

    .line 17
    move-object v9, v6

    .line 18
    move-object v11, v9

    .line 19
    move v7, v4

    .line 20
    move v8, v7

    .line 21
    move v10, v8

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ge v4, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    int-to-char v5, v4

    .line 33
    packed-switch v5, :pswitch_data_1

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v4}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_0
    invoke-static {v1, v4}, Ly4/b;->N(Landroid/os/Parcel;I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v4, :cond_0

    .line 49
    .line 50
    move-object v11, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    add-int/2addr v5, v4

    .line 57
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_1
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    invoke-static {v1, v4}, Ly4/b;->N(Landroid/os/Parcel;I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-nez v4, :cond_1

    .line 75
    .line 76
    move-object v9, v3

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->createIntArray()[I

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    add-int/2addr v5, v4

    .line 83
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_3
    invoke-static {v1, v4}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    goto :goto_0

    .line 92
    :pswitch_4
    invoke-static {v1, v4}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    goto :goto_0

    .line 97
    :pswitch_5
    sget-object v5, Lcom/google/android/gms/common/internal/s;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 98
    .line 99
    invoke-static {v1, v4, v5}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object v6, v4

    .line 104
    check-cast v6, Lcom/google/android/gms/common/internal/s;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 108
    .line 109
    .line 110
    new-instance v5, Lcom/google/android/gms/common/internal/j;

    .line 111
    .line 112
    invoke-direct/range {v5 .. v11}, Lcom/google/android/gms/common/internal/j;-><init>(Lcom/google/android/gms/common/internal/s;ZZ[II[I)V

    .line 113
    .line 114
    .line 115
    return-object v5

    .line 116
    :pswitch_6
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/4 v3, 0x0

    .line 121
    const/4 v4, 0x0

    .line 122
    move-object v5, v3

    .line 123
    move v6, v4

    .line 124
    move-object v4, v5

    .line 125
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-ge v7, v2, :cond_7

    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    int-to-char v8, v7

    .line 136
    const/4 v9, 0x1

    .line 137
    if-eq v8, v9, :cond_6

    .line 138
    .line 139
    const/4 v9, 0x2

    .line 140
    if-eq v8, v9, :cond_5

    .line 141
    .line 142
    const/4 v9, 0x3

    .line 143
    if-eq v8, v9, :cond_4

    .line 144
    .line 145
    const/4 v9, 0x4

    .line 146
    if-eq v8, v9, :cond_3

    .line 147
    .line 148
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    sget-object v5, Lcom/google/android/gms/common/internal/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 153
    .line 154
    invoke-static {v1, v7, v5}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Lcom/google/android/gms/common/internal/j;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    goto :goto_1

    .line 166
    :cond_5
    sget-object v4, Lt2/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 167
    .line 168
    invoke-static {v1, v7, v4}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, [Lt2/d;

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_6
    invoke-static {v1, v7}, Ly4/b;->l(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    goto :goto_1

    .line 180
    :cond_7
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Lcom/google/android/gms/common/internal/j0;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object v3, v1, Lcom/google/android/gms/common/internal/j0;->g:Landroid/os/Bundle;

    .line 189
    .line 190
    iput-object v4, v1, Lcom/google/android/gms/common/internal/j0;->h:[Lt2/d;

    .line 191
    .line 192
    iput v6, v1, Lcom/google/android/gms/common/internal/j0;->i:I

    .line 193
    .line 194
    iput-object v5, v1, Lcom/google/android/gms/common/internal/j0;->j:Lcom/google/android/gms/common/internal/j;

    .line 195
    .line 196
    return-object v1

    .line 197
    :pswitch_7
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    const/4 v3, 0x0

    .line 202
    move v5, v3

    .line 203
    move v6, v5

    .line 204
    move v7, v6

    .line 205
    move v8, v7

    .line 206
    move v9, v8

    .line 207
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-ge v3, v2, :cond_d

    .line 212
    .line 213
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    int-to-char v4, v3

    .line 218
    const/4 v10, 0x1

    .line 219
    if-eq v4, v10, :cond_c

    .line 220
    .line 221
    const/4 v10, 0x2

    .line 222
    if-eq v4, v10, :cond_b

    .line 223
    .line 224
    const/4 v10, 0x3

    .line 225
    if-eq v4, v10, :cond_a

    .line 226
    .line 227
    const/4 v10, 0x4

    .line 228
    if-eq v4, v10, :cond_9

    .line 229
    .line 230
    const/4 v10, 0x5

    .line 231
    if-eq v4, v10, :cond_8

    .line 232
    .line 233
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_8
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    goto :goto_2

    .line 242
    :cond_9
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    goto :goto_2

    .line 247
    :cond_a
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    goto :goto_2

    .line 252
    :cond_b
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    goto :goto_2

    .line 257
    :cond_c
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    goto :goto_2

    .line 262
    :cond_d
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 263
    .line 264
    .line 265
    new-instance v4, Lcom/google/android/gms/common/internal/s;

    .line 266
    .line 267
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/internal/s;-><init>(IZZII)V

    .line 268
    .line 269
    .line 270
    return-object v4

    .line 271
    :pswitch_8
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    const/4 v3, 0x0

    .line 276
    const/4 v4, 0x0

    .line 277
    move v6, v3

    .line 278
    move v9, v6

    .line 279
    move v10, v9

    .line 280
    move-object v7, v4

    .line 281
    move-object v8, v7

    .line 282
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-ge v3, v2, :cond_13

    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    int-to-char v4, v3

    .line 293
    const/4 v5, 0x1

    .line 294
    if-eq v4, v5, :cond_12

    .line 295
    .line 296
    const/4 v5, 0x2

    .line 297
    if-eq v4, v5, :cond_11

    .line 298
    .line 299
    const/4 v5, 0x3

    .line 300
    if-eq v4, v5, :cond_10

    .line 301
    .line 302
    const/4 v5, 0x4

    .line 303
    if-eq v4, v5, :cond_f

    .line 304
    .line 305
    const/4 v5, 0x5

    .line 306
    if-eq v4, v5, :cond_e

    .line 307
    .line 308
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_e
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 313
    .line 314
    .line 315
    move-result v10

    .line 316
    goto :goto_3

    .line 317
    :cond_f
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    goto :goto_3

    .line 322
    :cond_10
    sget-object v4, Lt2/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 323
    .line 324
    invoke-static {v1, v3, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    move-object v8, v3

    .line 329
    check-cast v8, Lt2/b;

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_11
    invoke-static {v1, v3}, Ly4/b;->K(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    goto :goto_3

    .line 337
    :cond_12
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    goto :goto_3

    .line 342
    :cond_13
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 343
    .line 344
    .line 345
    new-instance v5, Lcom/google/android/gms/common/internal/y;

    .line 346
    .line 347
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/common/internal/y;-><init>(ILandroid/os/IBinder;Lt2/b;ZZ)V

    .line 348
    .line 349
    .line 350
    return-object v5

    .line 351
    :pswitch_9
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    const/4 v3, 0x0

    .line 356
    const/4 v4, 0x0

    .line 357
    move v5, v4

    .line 358
    move v6, v5

    .line 359
    move-object v4, v3

    .line 360
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    if-ge v7, v2, :cond_18

    .line 365
    .line 366
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    int-to-char v8, v7

    .line 371
    const/4 v9, 0x1

    .line 372
    if-eq v8, v9, :cond_17

    .line 373
    .line 374
    const/4 v9, 0x2

    .line 375
    if-eq v8, v9, :cond_16

    .line 376
    .line 377
    const/4 v9, 0x3

    .line 378
    if-eq v8, v9, :cond_15

    .line 379
    .line 380
    const/4 v9, 0x4

    .line 381
    if-eq v8, v9, :cond_14

    .line 382
    .line 383
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 384
    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_14
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 388
    .line 389
    invoke-static {v1, v7, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 394
    .line 395
    goto :goto_4

    .line 396
    :cond_15
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    goto :goto_4

    .line 401
    :cond_16
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 402
    .line 403
    invoke-static {v1, v7, v3}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Landroid/accounts/Account;

    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_17
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    goto :goto_4

    .line 415
    :cond_18
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 416
    .line 417
    .line 418
    new-instance v1, Lcom/google/android/gms/common/internal/x;

    .line 419
    .line 420
    invoke-direct {v1, v5, v3, v6, v4}, Lcom/google/android/gms/common/internal/x;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 421
    .line 422
    .line 423
    return-object v1

    .line 424
    :pswitch_a
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    const/4 v3, -0x1

    .line 429
    const/4 v4, 0x0

    .line 430
    const/4 v5, 0x0

    .line 431
    const-wide/16 v6, 0x0

    .line 432
    .line 433
    move/from16 v19, v3

    .line 434
    .line 435
    move v9, v4

    .line 436
    move v10, v9

    .line 437
    move v11, v10

    .line 438
    move/from16 v18, v11

    .line 439
    .line 440
    move-object/from16 v16, v5

    .line 441
    .line 442
    move-object/from16 v17, v16

    .line 443
    .line 444
    move-wide v12, v6

    .line 445
    move-wide v14, v12

    .line 446
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-ge v3, v2, :cond_19

    .line 451
    .line 452
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    int-to-char v4, v3

    .line 457
    packed-switch v4, :pswitch_data_2

    .line 458
    .line 459
    .line 460
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 461
    .line 462
    .line 463
    goto :goto_5

    .line 464
    :pswitch_b
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    move/from16 v19, v3

    .line 469
    .line 470
    goto :goto_5

    .line 471
    :pswitch_c
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    move/from16 v18, v3

    .line 476
    .line 477
    goto :goto_5

    .line 478
    :pswitch_d
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    move-object/from16 v17, v3

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :pswitch_e
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    move-object/from16 v16, v3

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :pswitch_f
    invoke-static {v1, v3}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 493
    .line 494
    .line 495
    move-result-wide v3

    .line 496
    move-wide v14, v3

    .line 497
    goto :goto_5

    .line 498
    :pswitch_10
    invoke-static {v1, v3}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 499
    .line 500
    .line 501
    move-result-wide v3

    .line 502
    move-wide v12, v3

    .line 503
    goto :goto_5

    .line 504
    :pswitch_11
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    move v11, v3

    .line 509
    goto :goto_5

    .line 510
    :pswitch_12
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    move v10, v3

    .line 515
    goto :goto_5

    .line 516
    :pswitch_13
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    move v9, v3

    .line 521
    goto :goto_5

    .line 522
    :cond_19
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 523
    .line 524
    .line 525
    new-instance v8, Lcom/google/android/gms/common/internal/q;

    .line 526
    .line 527
    invoke-direct/range {v8 .. v19}, Lcom/google/android/gms/common/internal/q;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 528
    .line 529
    .line 530
    return-object v8

    .line 531
    :pswitch_14
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    const/4 v3, 0x0

    .line 536
    const/4 v4, 0x0

    .line 537
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-ge v5, v2, :cond_1c

    .line 542
    .line 543
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    int-to-char v6, v5

    .line 548
    const/4 v7, 0x1

    .line 549
    if-eq v6, v7, :cond_1b

    .line 550
    .line 551
    const/4 v7, 0x2

    .line 552
    if-eq v6, v7, :cond_1a

    .line 553
    .line 554
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 555
    .line 556
    .line 557
    goto :goto_6

    .line 558
    :cond_1a
    sget-object v3, Lcom/google/android/gms/common/internal/q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 559
    .line 560
    invoke-static {v1, v5, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    goto :goto_6

    .line 565
    :cond_1b
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    goto :goto_6

    .line 570
    :cond_1c
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 571
    .line 572
    .line 573
    new-instance v1, Lcom/google/android/gms/common/internal/t;

    .line 574
    .line 575
    invoke-direct {v1, v4, v3}, Lcom/google/android/gms/common/internal/t;-><init>(ILjava/util/List;)V

    .line 576
    .line 577
    .line 578
    return-object v1

    .line 579
    :pswitch_15
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    const/4 v3, 0x0

    .line 584
    const/4 v4, 0x0

    .line 585
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    if-ge v5, v2, :cond_1f

    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    int-to-char v6, v5

    .line 596
    const/4 v7, 0x1

    .line 597
    if-eq v6, v7, :cond_1e

    .line 598
    .line 599
    const/4 v7, 0x2

    .line 600
    if-eq v6, v7, :cond_1d

    .line 601
    .line 602
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 603
    .line 604
    .line 605
    goto :goto_7

    .line 606
    :cond_1d
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    goto :goto_7

    .line 611
    :cond_1e
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    goto :goto_7

    .line 616
    :cond_1f
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 617
    .line 618
    .line 619
    new-instance v1, Lcom/google/android/gms/common/internal/g;

    .line 620
    .line 621
    invoke-direct {v1, v4, v3}, Lcom/google/android/gms/common/internal/g;-><init>(ILjava/lang/String;)V

    .line 622
    .line 623
    .line 624
    return-object v1

    .line 625
    :pswitch_16
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    const/4 v3, 0x0

    .line 630
    const/4 v4, 0x0

    .line 631
    move-object v5, v3

    .line 632
    move v6, v4

    .line 633
    move-object v4, v5

    .line 634
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    if-ge v7, v2, :cond_24

    .line 639
    .line 640
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    int-to-char v8, v7

    .line 645
    const/4 v9, 0x1

    .line 646
    if-eq v8, v9, :cond_23

    .line 647
    .line 648
    const/4 v9, 0x2

    .line 649
    if-eq v8, v9, :cond_22

    .line 650
    .line 651
    const/4 v9, 0x3

    .line 652
    if-eq v8, v9, :cond_21

    .line 653
    .line 654
    const/4 v9, 0x4

    .line 655
    if-eq v8, v9, :cond_20

    .line 656
    .line 657
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 658
    .line 659
    .line 660
    goto :goto_8

    .line 661
    :cond_20
    sget-object v5, Lt2/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 662
    .line 663
    invoke-static {v1, v7, v5}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    check-cast v5, Lt2/b;

    .line 668
    .line 669
    goto :goto_8

    .line 670
    :cond_21
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 671
    .line 672
    invoke-static {v1, v7, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    check-cast v4, Landroid/app/PendingIntent;

    .line 677
    .line 678
    goto :goto_8

    .line 679
    :cond_22
    invoke-static {v1, v7}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    goto :goto_8

    .line 684
    :cond_23
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 685
    .line 686
    .line 687
    move-result v6

    .line 688
    goto :goto_8

    .line 689
    :cond_24
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 690
    .line 691
    .line 692
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 693
    .line 694
    invoke-direct {v1, v6, v3, v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 695
    .line 696
    .line 697
    return-object v1

    .line 698
    :pswitch_17
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 699
    .line 700
    .line 701
    move-result v2

    .line 702
    const/4 v3, 0x0

    .line 703
    const/4 v4, 0x0

    .line 704
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    if-ge v5, v2, :cond_27

    .line 709
    .line 710
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    int-to-char v6, v5

    .line 715
    const/4 v7, 0x1

    .line 716
    if-eq v6, v7, :cond_26

    .line 717
    .line 718
    const/4 v7, 0x2

    .line 719
    if-eq v6, v7, :cond_25

    .line 720
    .line 721
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 722
    .line 723
    .line 724
    goto :goto_9

    .line 725
    :cond_25
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v3

    .line 729
    goto :goto_9

    .line 730
    :cond_26
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    goto :goto_9

    .line 735
    :cond_27
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 736
    .line 737
    .line 738
    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    .line 739
    .line 740
    invoke-direct {v1, v4, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 741
    .line 742
    .line 743
    return-object v1

    .line 744
    :pswitch_18
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    const/4 v3, 0x1

    .line 749
    const-wide/16 v4, 0x32

    .line 750
    .line 751
    const/4 v6, 0x0

    .line 752
    const-wide v7, 0x7fffffffffffffffL

    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    const v9, 0x7fffffff

    .line 758
    .line 759
    .line 760
    move v11, v3

    .line 761
    move-wide v12, v4

    .line 762
    move v14, v6

    .line 763
    move-wide v15, v7

    .line 764
    move/from16 v17, v9

    .line 765
    .line 766
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    if-ge v4, v2, :cond_2d

    .line 771
    .line 772
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    int-to-char v5, v4

    .line 777
    if-eq v5, v3, :cond_2c

    .line 778
    .line 779
    const/4 v6, 0x2

    .line 780
    if-eq v5, v6, :cond_2b

    .line 781
    .line 782
    const/4 v6, 0x3

    .line 783
    if-eq v5, v6, :cond_2a

    .line 784
    .line 785
    const/4 v6, 0x4

    .line 786
    if-eq v5, v6, :cond_29

    .line 787
    .line 788
    const/4 v6, 0x5

    .line 789
    if-eq v5, v6, :cond_28

    .line 790
    .line 791
    invoke-static {v1, v4}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 792
    .line 793
    .line 794
    goto :goto_a

    .line 795
    :cond_28
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    move/from16 v17, v4

    .line 800
    .line 801
    goto :goto_a

    .line 802
    :cond_29
    invoke-static {v1, v4}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 803
    .line 804
    .line 805
    move-result-wide v4

    .line 806
    move-wide v15, v4

    .line 807
    goto :goto_a

    .line 808
    :cond_2a
    invoke-static {v1, v4}, Ly4/b;->I(Landroid/os/Parcel;I)F

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    move v14, v4

    .line 813
    goto :goto_a

    .line 814
    :cond_2b
    invoke-static {v1, v4}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 815
    .line 816
    .line 817
    move-result-wide v4

    .line 818
    move-wide v12, v4

    .line 819
    goto :goto_a

    .line 820
    :cond_2c
    invoke-static {v1, v4}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 821
    .line 822
    .line 823
    move-result v11

    .line 824
    goto :goto_a

    .line 825
    :cond_2d
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 826
    .line 827
    .line 828
    new-instance v10, Lc3/d0;

    .line 829
    .line 830
    invoke-direct/range {v10 .. v17}, Lc3/d0;-><init>(ZJFJI)V

    .line 831
    .line 832
    .line 833
    return-object v10

    .line 834
    :pswitch_19
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    const/4 v3, 0x0

    .line 839
    move-object v4, v3

    .line 840
    move-object v5, v4

    .line 841
    move-object v6, v5

    .line 842
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 843
    .line 844
    .line 845
    move-result v7

    .line 846
    if-ge v7, v2, :cond_32

    .line 847
    .line 848
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 849
    .line 850
    .line 851
    move-result v7

    .line 852
    int-to-char v8, v7

    .line 853
    const/4 v9, 0x1

    .line 854
    if-eq v8, v9, :cond_31

    .line 855
    .line 856
    const/4 v9, 0x2

    .line 857
    if-eq v8, v9, :cond_30

    .line 858
    .line 859
    const/4 v9, 0x3

    .line 860
    if-eq v8, v9, :cond_2f

    .line 861
    .line 862
    const/4 v9, 0x4

    .line 863
    if-eq v8, v9, :cond_2e

    .line 864
    .line 865
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 866
    .line 867
    .line 868
    goto :goto_b

    .line 869
    :cond_2e
    invoke-static {v1, v7}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v6

    .line 873
    goto :goto_b

    .line 874
    :cond_2f
    sget-object v5, Lcom/google/android/gms/common/internal/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 875
    .line 876
    invoke-static {v1, v7, v5}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 877
    .line 878
    .line 879
    move-result-object v5

    .line 880
    goto :goto_b

    .line 881
    :cond_30
    invoke-static {v1, v7}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    goto :goto_b

    .line 886
    :cond_31
    sget-object v3, Lc3/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 887
    .line 888
    invoke-static {v1, v7, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    goto :goto_b

    .line 893
    :cond_32
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 894
    .line 895
    .line 896
    new-instance v1, Lc3/c;

    .line 897
    .line 898
    invoke-direct {v1, v3, v4, v5, v6}, Lc3/c;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    return-object v1

    .line 902
    :pswitch_1a
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 903
    .line 904
    .line 905
    move-result v2

    .line 906
    const/4 v3, 0x0

    .line 907
    move v4, v3

    .line 908
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 909
    .line 910
    .line 911
    move-result v5

    .line 912
    if-ge v5, v2, :cond_35

    .line 913
    .line 914
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 915
    .line 916
    .line 917
    move-result v5

    .line 918
    int-to-char v6, v5

    .line 919
    const/4 v7, 0x1

    .line 920
    if-eq v6, v7, :cond_34

    .line 921
    .line 922
    const/4 v7, 0x2

    .line 923
    if-eq v6, v7, :cond_33

    .line 924
    .line 925
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 926
    .line 927
    .line 928
    goto :goto_c

    .line 929
    :cond_33
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 930
    .line 931
    .line 932
    move-result v4

    .line 933
    goto :goto_c

    .line 934
    :cond_34
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    goto :goto_c

    .line 939
    :cond_35
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 940
    .line 941
    .line 942
    new-instance v1, Lc3/b;

    .line 943
    .line 944
    invoke-direct {v1, v3, v4}, Lc3/b;-><init>(II)V

    .line 945
    .line 946
    .line 947
    return-object v1

    .line 948
    :pswitch_1b
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    const/4 v3, 0x0

    .line 953
    move v4, v3

    .line 954
    move v5, v4

    .line 955
    move v6, v5

    .line 956
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 957
    .line 958
    .line 959
    move-result v7

    .line 960
    if-ge v7, v2, :cond_3a

    .line 961
    .line 962
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 963
    .line 964
    .line 965
    move-result v7

    .line 966
    int-to-char v8, v7

    .line 967
    const/4 v9, 0x1

    .line 968
    if-eq v8, v9, :cond_39

    .line 969
    .line 970
    const/4 v9, 0x2

    .line 971
    if-eq v8, v9, :cond_38

    .line 972
    .line 973
    const/4 v9, 0x3

    .line 974
    if-eq v8, v9, :cond_37

    .line 975
    .line 976
    const/4 v9, 0x4

    .line 977
    if-eq v8, v9, :cond_36

    .line 978
    .line 979
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 980
    .line 981
    .line 982
    goto :goto_d

    .line 983
    :cond_36
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 984
    .line 985
    .line 986
    move-result v6

    .line 987
    goto :goto_d

    .line 988
    :cond_37
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 989
    .line 990
    .line 991
    move-result v5

    .line 992
    goto :goto_d

    .line 993
    :cond_38
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    goto :goto_d

    .line 998
    :cond_39
    invoke-static {v1, v7}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    goto :goto_d

    .line 1003
    :cond_3a
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1004
    .line 1005
    .line 1006
    new-instance v1, Lc3/b0;

    .line 1007
    .line 1008
    invoke-direct {v1, v3, v4, v5, v6}, Lc3/b0;-><init>(IIII)V

    .line 1009
    .line 1010
    .line 1011
    return-object v1

    .line 1012
    :pswitch_1c
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1013
    .line 1014
    .line 1015
    move-result v2

    .line 1016
    const/4 v3, 0x0

    .line 1017
    const/4 v4, 0x0

    .line 1018
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1019
    .line 1020
    .line 1021
    move-result v5

    .line 1022
    if-ge v5, v2, :cond_3d

    .line 1023
    .line 1024
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1025
    .line 1026
    .line 1027
    move-result v5

    .line 1028
    int-to-char v6, v5

    .line 1029
    const/4 v7, 0x1

    .line 1030
    if-eq v6, v7, :cond_3c

    .line 1031
    .line 1032
    const/4 v7, 0x2

    .line 1033
    if-eq v6, v7, :cond_3b

    .line 1034
    .line 1035
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_e

    .line 1039
    :cond_3b
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1040
    .line 1041
    .line 1042
    move-result v4

    .line 1043
    goto :goto_e

    .line 1044
    :cond_3c
    sget-object v3, Lc3/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1045
    .line 1046
    invoke-static {v1, v5, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v3

    .line 1050
    goto :goto_e

    .line 1051
    :cond_3d
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1052
    .line 1053
    .line 1054
    new-instance v1, Lc3/l;

    .line 1055
    .line 1056
    invoke-direct {v1, v3, v4}, Lc3/l;-><init>(Ljava/util/ArrayList;I)V

    .line 1057
    .line 1058
    .line 1059
    return-object v1

    .line 1060
    :pswitch_1d
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1061
    .line 1062
    .line 1063
    move-result v2

    .line 1064
    const-string v3, ""

    .line 1065
    .line 1066
    const/4 v4, 0x0

    .line 1067
    move-object v5, v4

    .line 1068
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1069
    .line 1070
    .line 1071
    move-result v6

    .line 1072
    if-ge v6, v2, :cond_41

    .line 1073
    .line 1074
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1075
    .line 1076
    .line 1077
    move-result v6

    .line 1078
    int-to-char v7, v6

    .line 1079
    const/4 v8, 0x1

    .line 1080
    if-eq v7, v8, :cond_40

    .line 1081
    .line 1082
    const/4 v8, 0x2

    .line 1083
    if-eq v7, v8, :cond_3f

    .line 1084
    .line 1085
    const/4 v8, 0x3

    .line 1086
    if-eq v7, v8, :cond_3e

    .line 1087
    .line 1088
    invoke-static {v1, v6}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_f

    .line 1092
    :cond_3e
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    goto :goto_f

    .line 1097
    :cond_3f
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1098
    .line 1099
    invoke-static {v1, v6, v5}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v5

    .line 1103
    check-cast v5, Landroid/app/PendingIntent;

    .line 1104
    .line 1105
    goto :goto_f

    .line 1106
    :cond_40
    invoke-static {v1, v6}, Ly4/b;->q(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v4

    .line 1110
    goto :goto_f

    .line 1111
    :cond_41
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1112
    .line 1113
    .line 1114
    new-instance v1, Lc3/a0;

    .line 1115
    .line 1116
    invoke-direct {v1, v4, v5, v3}, Lc3/a0;-><init>(Ljava/util/List;Landroid/app/PendingIntent;Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    return-object v1

    .line 1120
    :pswitch_1e
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    const/4 v3, 0x1

    .line 1125
    const-wide/16 v4, -0x1

    .line 1126
    .line 1127
    move v9, v3

    .line 1128
    move v10, v9

    .line 1129
    move-wide v7, v4

    .line 1130
    move-wide v11, v7

    .line 1131
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1132
    .line 1133
    .line 1134
    move-result v4

    .line 1135
    if-ge v4, v2, :cond_46

    .line 1136
    .line 1137
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1138
    .line 1139
    .line 1140
    move-result v4

    .line 1141
    int-to-char v5, v4

    .line 1142
    if-eq v5, v3, :cond_45

    .line 1143
    .line 1144
    const/4 v6, 0x2

    .line 1145
    if-eq v5, v6, :cond_44

    .line 1146
    .line 1147
    const/4 v6, 0x3

    .line 1148
    if-eq v5, v6, :cond_43

    .line 1149
    .line 1150
    const/4 v6, 0x4

    .line 1151
    if-eq v5, v6, :cond_42

    .line 1152
    .line 1153
    invoke-static {v1, v4}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_10

    .line 1157
    :cond_42
    invoke-static {v1, v4}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v4

    .line 1161
    move-wide v11, v4

    .line 1162
    goto :goto_10

    .line 1163
    :cond_43
    invoke-static {v1, v4}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v4

    .line 1167
    move-wide v7, v4

    .line 1168
    goto :goto_10

    .line 1169
    :cond_44
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1170
    .line 1171
    .line 1172
    move-result v10

    .line 1173
    goto :goto_10

    .line 1174
    :cond_45
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v9

    .line 1178
    goto :goto_10

    .line 1179
    :cond_46
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1180
    .line 1181
    .line 1182
    new-instance v6, Lc3/z;

    .line 1183
    .line 1184
    invoke-direct/range {v6 .. v12}, Lc3/z;-><init>(JIIJ)V

    .line 1185
    .line 1186
    .line 1187
    return-object v6

    .line 1188
    :pswitch_1f
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1189
    .line 1190
    .line 1191
    move-result v2

    .line 1192
    const/4 v3, 0x0

    .line 1193
    move v5, v3

    .line 1194
    move v6, v5

    .line 1195
    move v7, v6

    .line 1196
    move v8, v7

    .line 1197
    move v9, v8

    .line 1198
    move v10, v9

    .line 1199
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1200
    .line 1201
    .line 1202
    move-result v3

    .line 1203
    if-ge v3, v2, :cond_47

    .line 1204
    .line 1205
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1206
    .line 1207
    .line 1208
    move-result v3

    .line 1209
    int-to-char v4, v3

    .line 1210
    packed-switch v4, :pswitch_data_3

    .line 1211
    .line 1212
    .line 1213
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_11

    .line 1217
    :pswitch_20
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v3

    .line 1221
    move v10, v3

    .line 1222
    goto :goto_11

    .line 1223
    :pswitch_21
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v3

    .line 1227
    move v9, v3

    .line 1228
    goto :goto_11

    .line 1229
    :pswitch_22
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v3

    .line 1233
    move v8, v3

    .line 1234
    goto :goto_11

    .line 1235
    :pswitch_23
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v3

    .line 1239
    move v7, v3

    .line 1240
    goto :goto_11

    .line 1241
    :pswitch_24
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v3

    .line 1245
    move v6, v3

    .line 1246
    goto :goto_11

    .line 1247
    :pswitch_25
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1248
    .line 1249
    .line 1250
    move-result v3

    .line 1251
    move v5, v3

    .line 1252
    goto :goto_11

    .line 1253
    :cond_47
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1254
    .line 1255
    .line 1256
    new-instance v4, Lc3/k;

    .line 1257
    .line 1258
    invoke-direct/range {v4 .. v10}, Lc3/k;-><init>(ZZZZZZ)V

    .line 1259
    .line 1260
    .line 1261
    return-object v4

    .line 1262
    :pswitch_26
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    const/4 v3, 0x0

    .line 1267
    move-object v4, v3

    .line 1268
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1269
    .line 1270
    .line 1271
    move-result v5

    .line 1272
    if-ge v5, v2, :cond_4a

    .line 1273
    .line 1274
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1275
    .line 1276
    .line 1277
    move-result v5

    .line 1278
    int-to-char v6, v5

    .line 1279
    const/4 v7, 0x1

    .line 1280
    if-eq v6, v7, :cond_49

    .line 1281
    .line 1282
    const/4 v7, 0x2

    .line 1283
    if-eq v6, v7, :cond_48

    .line 1284
    .line 1285
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_12

    .line 1289
    :cond_48
    sget-object v4, Lc3/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1290
    .line 1291
    invoke-static {v1, v5, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    check-cast v4, Lc3/k;

    .line 1296
    .line 1297
    goto :goto_12

    .line 1298
    :cond_49
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1299
    .line 1300
    invoke-static {v1, v5, v3}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    check-cast v3, Lcom/google/android/gms/common/api/Status;

    .line 1305
    .line 1306
    goto :goto_12

    .line 1307
    :cond_4a
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1308
    .line 1309
    .line 1310
    new-instance v1, Lc3/j;

    .line 1311
    .line 1312
    invoke-direct {v1, v3, v4}, Lc3/j;-><init>(Lcom/google/android/gms/common/api/Status;Lc3/k;)V

    .line 1313
    .line 1314
    .line 1315
    return-object v1

    .line 1316
    :pswitch_27
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    const/4 v3, 0x0

    .line 1321
    const/4 v4, 0x0

    .line 1322
    move v5, v4

    .line 1323
    move v6, v5

    .line 1324
    move-object v4, v3

    .line 1325
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1326
    .line 1327
    .line 1328
    move-result v7

    .line 1329
    if-ge v7, v2, :cond_4f

    .line 1330
    .line 1331
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1332
    .line 1333
    .line 1334
    move-result v7

    .line 1335
    int-to-char v8, v7

    .line 1336
    const/4 v9, 0x1

    .line 1337
    if-eq v8, v9, :cond_4e

    .line 1338
    .line 1339
    const/4 v9, 0x2

    .line 1340
    if-eq v8, v9, :cond_4d

    .line 1341
    .line 1342
    const/4 v9, 0x3

    .line 1343
    if-eq v8, v9, :cond_4c

    .line 1344
    .line 1345
    const/4 v9, 0x5

    .line 1346
    if-eq v8, v9, :cond_4b

    .line 1347
    .line 1348
    invoke-static {v1, v7}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1349
    .line 1350
    .line 1351
    goto :goto_13

    .line 1352
    :cond_4b
    sget-object v4, Lc3/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1353
    .line 1354
    invoke-static {v1, v7, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v4

    .line 1358
    check-cast v4, Lc3/y;

    .line 1359
    .line 1360
    goto :goto_13

    .line 1361
    :cond_4c
    invoke-static {v1, v7}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v6

    .line 1365
    goto :goto_13

    .line 1366
    :cond_4d
    invoke-static {v1, v7}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v5

    .line 1370
    goto :goto_13

    .line 1371
    :cond_4e
    sget-object v3, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1372
    .line 1373
    invoke-static {v1, v7, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v3

    .line 1377
    goto :goto_13

    .line 1378
    :cond_4f
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v1, Lc3/i;

    .line 1382
    .line 1383
    invoke-direct {v1, v3, v5, v6, v4}, Lc3/i;-><init>(Ljava/util/ArrayList;ZZLc3/y;)V

    .line 1384
    .line 1385
    .line 1386
    return-object v1

    .line 1387
    :pswitch_28
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1388
    .line 1389
    .line 1390
    move-result v2

    .line 1391
    const-string v3, ""

    .line 1392
    .line 1393
    move-object v4, v3

    .line 1394
    move-object v5, v4

    .line 1395
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1396
    .line 1397
    .line 1398
    move-result v6

    .line 1399
    if-ge v6, v2, :cond_53

    .line 1400
    .line 1401
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1402
    .line 1403
    .line 1404
    move-result v6

    .line 1405
    int-to-char v7, v6

    .line 1406
    const/4 v8, 0x1

    .line 1407
    if-eq v7, v8, :cond_52

    .line 1408
    .line 1409
    const/4 v8, 0x2

    .line 1410
    if-eq v7, v8, :cond_51

    .line 1411
    .line 1412
    const/4 v8, 0x5

    .line 1413
    if-eq v7, v8, :cond_50

    .line 1414
    .line 1415
    invoke-static {v1, v6}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_14

    .line 1419
    :cond_50
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    goto :goto_14

    .line 1424
    :cond_51
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v5

    .line 1428
    goto :goto_14

    .line 1429
    :cond_52
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v4

    .line 1433
    goto :goto_14

    .line 1434
    :cond_53
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1435
    .line 1436
    .line 1437
    new-instance v1, Lc3/y;

    .line 1438
    .line 1439
    invoke-direct {v1, v3, v4, v5}, Lc3/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1440
    .line 1441
    .line 1442
    return-object v1

    .line 1443
    :pswitch_29
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    sget-object v3, Lcom/google/android/gms/location/LocationResult;->h:Ljava/util/List;

    .line 1448
    .line 1449
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1450
    .line 1451
    .line 1452
    move-result v4

    .line 1453
    if-ge v4, v2, :cond_55

    .line 1454
    .line 1455
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1456
    .line 1457
    .line 1458
    move-result v4

    .line 1459
    int-to-char v5, v4

    .line 1460
    const/4 v6, 0x1

    .line 1461
    if-eq v5, v6, :cond_54

    .line 1462
    .line 1463
    invoke-static {v1, v4}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1464
    .line 1465
    .line 1466
    goto :goto_15

    .line 1467
    :cond_54
    sget-object v3, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1468
    .line 1469
    invoke-static {v1, v4, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v3

    .line 1473
    goto :goto_15

    .line 1474
    :cond_55
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1475
    .line 1476
    .line 1477
    new-instance v1, Lcom/google/android/gms/location/LocationResult;

    .line 1478
    .line 1479
    invoke-direct {v1, v3}, Lcom/google/android/gms/location/LocationResult;-><init>(Ljava/util/List;)V

    .line 1480
    .line 1481
    .line 1482
    return-object v1

    .line 1483
    :pswitch_2a
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1484
    .line 1485
    .line 1486
    move-result v2

    .line 1487
    const/16 v3, 0x66

    .line 1488
    .line 1489
    const-wide/32 v4, 0x36ee80

    .line 1490
    .line 1491
    .line 1492
    const-wide/32 v6, 0x927c0

    .line 1493
    .line 1494
    .line 1495
    const/4 v8, 0x0

    .line 1496
    const-wide v9, 0x7fffffffffffffffL

    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    const v11, 0x7fffffff

    .line 1502
    .line 1503
    .line 1504
    const/4 v12, 0x0

    .line 1505
    const-wide/16 v13, 0x0

    .line 1506
    .line 1507
    move-wide v14, v13

    .line 1508
    move v13, v12

    .line 1509
    move v12, v11

    .line 1510
    move-wide v10, v9

    .line 1511
    move v9, v8

    .line 1512
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1513
    .line 1514
    .line 1515
    move-result v0

    .line 1516
    if-ge v0, v2, :cond_56

    .line 1517
    .line 1518
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1519
    .line 1520
    .line 1521
    move-result v0

    .line 1522
    move/from16 v16, v9

    .line 1523
    .line 1524
    int-to-char v9, v0

    .line 1525
    packed-switch v9, :pswitch_data_4

    .line 1526
    .line 1527
    .line 1528
    invoke-static {v1, v0}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1529
    .line 1530
    .line 1531
    :goto_17
    move/from16 v9, v16

    .line 1532
    .line 1533
    goto :goto_16

    .line 1534
    :pswitch_2b
    invoke-static {v1, v0}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1535
    .line 1536
    .line 1537
    move-result v0

    .line 1538
    move v9, v0

    .line 1539
    goto :goto_16

    .line 1540
    :pswitch_2c
    invoke-static {v1, v0}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1541
    .line 1542
    .line 1543
    move-result-wide v14

    .line 1544
    goto :goto_17

    .line 1545
    :pswitch_2d
    invoke-static {v1, v0}, Ly4/b;->I(Landroid/os/Parcel;I)F

    .line 1546
    .line 1547
    .line 1548
    move-result v0

    .line 1549
    move v13, v0

    .line 1550
    goto :goto_17

    .line 1551
    :pswitch_2e
    invoke-static {v1, v0}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1552
    .line 1553
    .line 1554
    move-result v0

    .line 1555
    move v12, v0

    .line 1556
    goto :goto_17

    .line 1557
    :pswitch_2f
    invoke-static {v1, v0}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1558
    .line 1559
    .line 1560
    move-result-wide v9

    .line 1561
    move-wide v10, v9

    .line 1562
    goto :goto_17

    .line 1563
    :pswitch_30
    invoke-static {v1, v0}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v0

    .line 1567
    move v8, v0

    .line 1568
    goto :goto_17

    .line 1569
    :pswitch_31
    invoke-static {v1, v0}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1570
    .line 1571
    .line 1572
    move-result-wide v6

    .line 1573
    goto :goto_17

    .line 1574
    :pswitch_32
    invoke-static {v1, v0}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1575
    .line 1576
    .line 1577
    move-result-wide v4

    .line 1578
    goto :goto_17

    .line 1579
    :pswitch_33
    invoke-static {v1, v0}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1580
    .line 1581
    .line 1582
    move-result v0

    .line 1583
    move v3, v0

    .line 1584
    goto :goto_17

    .line 1585
    :cond_56
    move/from16 v16, v9

    .line 1586
    .line 1587
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1588
    .line 1589
    .line 1590
    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    .line 1591
    .line 1592
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1593
    .line 1594
    .line 1595
    iput v3, v0, Lcom/google/android/gms/location/LocationRequest;->g:I

    .line 1596
    .line 1597
    iput-wide v4, v0, Lcom/google/android/gms/location/LocationRequest;->h:J

    .line 1598
    .line 1599
    iput-wide v6, v0, Lcom/google/android/gms/location/LocationRequest;->i:J

    .line 1600
    .line 1601
    iput-boolean v8, v0, Lcom/google/android/gms/location/LocationRequest;->j:Z

    .line 1602
    .line 1603
    iput-wide v10, v0, Lcom/google/android/gms/location/LocationRequest;->k:J

    .line 1604
    .line 1605
    iput v12, v0, Lcom/google/android/gms/location/LocationRequest;->l:I

    .line 1606
    .line 1607
    iput v13, v0, Lcom/google/android/gms/location/LocationRequest;->m:F

    .line 1608
    .line 1609
    iput-wide v14, v0, Lcom/google/android/gms/location/LocationRequest;->n:J

    .line 1610
    .line 1611
    move/from16 v8, v16

    .line 1612
    .line 1613
    iput-boolean v8, v0, Lcom/google/android/gms/location/LocationRequest;->o:Z

    .line 1614
    .line 1615
    return-object v0

    .line 1616
    :pswitch_34
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1617
    .line 1618
    .line 1619
    move-result v0

    .line 1620
    const/16 v2, 0x3e8

    .line 1621
    .line 1622
    const/4 v3, 0x1

    .line 1623
    const-wide/16 v4, 0x0

    .line 1624
    .line 1625
    const/4 v6, 0x0

    .line 1626
    move v7, v3

    .line 1627
    move v8, v7

    .line 1628
    :goto_18
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1629
    .line 1630
    .line 1631
    move-result v9

    .line 1632
    if-ge v9, v0, :cond_5c

    .line 1633
    .line 1634
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1635
    .line 1636
    .line 1637
    move-result v9

    .line 1638
    int-to-char v10, v9

    .line 1639
    if-eq v10, v3, :cond_5b

    .line 1640
    .line 1641
    const/4 v11, 0x2

    .line 1642
    if-eq v10, v11, :cond_5a

    .line 1643
    .line 1644
    const/4 v11, 0x3

    .line 1645
    if-eq v10, v11, :cond_59

    .line 1646
    .line 1647
    const/4 v11, 0x4

    .line 1648
    if-eq v10, v11, :cond_58

    .line 1649
    .line 1650
    const/4 v11, 0x5

    .line 1651
    if-eq v10, v11, :cond_57

    .line 1652
    .line 1653
    invoke-static {v1, v9}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1654
    .line 1655
    .line 1656
    goto :goto_18

    .line 1657
    :cond_57
    sget-object v6, Lc3/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1658
    .line 1659
    invoke-static {v1, v9, v6}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v6

    .line 1663
    check-cast v6, [Lc3/z;

    .line 1664
    .line 1665
    goto :goto_18

    .line 1666
    :cond_58
    invoke-static {v1, v9}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1667
    .line 1668
    .line 1669
    move-result v2

    .line 1670
    goto :goto_18

    .line 1671
    :cond_59
    invoke-static {v1, v9}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 1672
    .line 1673
    .line 1674
    move-result-wide v4

    .line 1675
    goto :goto_18

    .line 1676
    :cond_5a
    invoke-static {v1, v9}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1677
    .line 1678
    .line 1679
    move-result v8

    .line 1680
    goto :goto_18

    .line 1681
    :cond_5b
    invoke-static {v1, v9}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1682
    .line 1683
    .line 1684
    move-result v7

    .line 1685
    goto :goto_18

    .line 1686
    :cond_5c
    invoke-static {v1, v0}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v0, Lcom/google/android/gms/location/LocationAvailability;

    .line 1690
    .line 1691
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1692
    .line 1693
    .line 1694
    iput v2, v0, Lcom/google/android/gms/location/LocationAvailability;->j:I

    .line 1695
    .line 1696
    iput v7, v0, Lcom/google/android/gms/location/LocationAvailability;->g:I

    .line 1697
    .line 1698
    iput v8, v0, Lcom/google/android/gms/location/LocationAvailability;->h:I

    .line 1699
    .line 1700
    iput-wide v4, v0, Lcom/google/android/gms/location/LocationAvailability;->i:J

    .line 1701
    .line 1702
    iput-object v6, v0, Lcom/google/android/gms/location/LocationAvailability;->k:[Lc3/z;

    .line 1703
    .line 1704
    return-object v0

    .line 1705
    :pswitch_35
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    const-string v2, ""

    .line 1710
    .line 1711
    const/4 v3, 0x0

    .line 1712
    const/4 v4, 0x0

    .line 1713
    move v5, v4

    .line 1714
    move-object v4, v3

    .line 1715
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1716
    .line 1717
    .line 1718
    move-result v6

    .line 1719
    if-ge v6, v0, :cond_61

    .line 1720
    .line 1721
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1722
    .line 1723
    .line 1724
    move-result v6

    .line 1725
    int-to-char v7, v6

    .line 1726
    const/4 v8, 0x1

    .line 1727
    if-eq v7, v8, :cond_60

    .line 1728
    .line 1729
    const/4 v8, 0x2

    .line 1730
    if-eq v7, v8, :cond_5f

    .line 1731
    .line 1732
    const/4 v8, 0x3

    .line 1733
    if-eq v7, v8, :cond_5e

    .line 1734
    .line 1735
    const/4 v8, 0x4

    .line 1736
    if-eq v7, v8, :cond_5d

    .line 1737
    .line 1738
    invoke-static {v1, v6}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 1739
    .line 1740
    .line 1741
    goto :goto_19

    .line 1742
    :cond_5d
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v4

    .line 1746
    goto :goto_19

    .line 1747
    :cond_5e
    invoke-static {v1, v6}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v2

    .line 1751
    goto :goto_19

    .line 1752
    :cond_5f
    invoke-static {v1, v6}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 1753
    .line 1754
    .line 1755
    move-result v5

    .line 1756
    goto :goto_19

    .line 1757
    :cond_60
    sget-object v3, Lcom/google/android/gms/internal/location/zzbe;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1758
    .line 1759
    invoke-static {v1, v6, v3}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1760
    .line 1761
    .line 1762
    move-result-object v3

    .line 1763
    goto :goto_19

    .line 1764
    :cond_61
    invoke-static {v1, v0}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 1765
    .line 1766
    .line 1767
    new-instance v0, Lc3/e;

    .line 1768
    .line 1769
    invoke-direct {v0, v3, v5, v2, v4}, Lc3/e;-><init>(Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    return-object v0

    .line 1773
    :pswitch_36
    new-instance v0, Landroidx/fragment/app/a1;

    .line 1774
    .line 1775
    invoke-direct {v0, v1}, Landroidx/fragment/app/a1;-><init>(Landroid/os/Parcel;)V

    .line 1776
    .line 1777
    .line 1778
    return-object v0

    .line 1779
    :pswitch_37
    new-instance v0, Landroidx/fragment/app/w0;

    .line 1780
    .line 1781
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1782
    .line 1783
    .line 1784
    const/4 v2, 0x0

    .line 1785
    iput-object v2, v0, Landroidx/fragment/app/w0;->k:Ljava/lang/String;

    .line 1786
    .line 1787
    new-instance v2, Ljava/util/ArrayList;

    .line 1788
    .line 1789
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1790
    .line 1791
    .line 1792
    iput-object v2, v0, Landroidx/fragment/app/w0;->l:Ljava/util/ArrayList;

    .line 1793
    .line 1794
    new-instance v2, Ljava/util/ArrayList;

    .line 1795
    .line 1796
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1797
    .line 1798
    .line 1799
    iput-object v2, v0, Landroidx/fragment/app/w0;->m:Ljava/util/ArrayList;

    .line 1800
    .line 1801
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    iput-object v2, v0, Landroidx/fragment/app/w0;->g:Ljava/util/ArrayList;

    .line 1806
    .line 1807
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v2

    .line 1811
    iput-object v2, v0, Landroidx/fragment/app/w0;->h:Ljava/util/ArrayList;

    .line 1812
    .line 1813
    sget-object v2, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1814
    .line 1815
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v2

    .line 1819
    check-cast v2, [Landroidx/fragment/app/c;

    .line 1820
    .line 1821
    iput-object v2, v0, Landroidx/fragment/app/w0;->i:[Landroidx/fragment/app/c;

    .line 1822
    .line 1823
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1824
    .line 1825
    .line 1826
    move-result v2

    .line 1827
    iput v2, v0, Landroidx/fragment/app/w0;->j:I

    .line 1828
    .line 1829
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v2

    .line 1833
    iput-object v2, v0, Landroidx/fragment/app/w0;->k:Ljava/lang/String;

    .line 1834
    .line 1835
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v2

    .line 1839
    iput-object v2, v0, Landroidx/fragment/app/w0;->l:Ljava/util/ArrayList;

    .line 1840
    .line 1841
    sget-object v2, Landroidx/fragment/app/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1842
    .line 1843
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v2

    .line 1847
    iput-object v2, v0, Landroidx/fragment/app/w0;->m:Ljava/util/ArrayList;

    .line 1848
    .line 1849
    sget-object v2, Landroidx/fragment/app/q0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1850
    .line 1851
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v1

    .line 1855
    iput-object v1, v0, Landroidx/fragment/app/w0;->n:Ljava/util/ArrayList;

    .line 1856
    .line 1857
    return-object v0

    .line 1858
    :pswitch_38
    new-instance v0, Landroidx/fragment/app/q0;

    .line 1859
    .line 1860
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v2

    .line 1867
    iput-object v2, v0, Landroidx/fragment/app/q0;->g:Ljava/lang/String;

    .line 1868
    .line 1869
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1870
    .line 1871
    .line 1872
    move-result v1

    .line 1873
    iput v1, v0, Landroidx/fragment/app/q0;->h:I

    .line 1874
    .line 1875
    return-object v0

    .line 1876
    :pswitch_39
    new-instance v0, Landroidx/fragment/app/d;

    .line 1877
    .line 1878
    invoke-direct {v0, v1}, Landroidx/fragment/app/d;-><init>(Landroid/os/Parcel;)V

    .line 1879
    .line 1880
    .line 1881
    return-object v0

    .line 1882
    :pswitch_3a
    new-instance v0, Landroidx/fragment/app/c;

    .line 1883
    .line 1884
    invoke-direct {v0, v1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    .line 1885
    .line 1886
    .line 1887
    return-object v0

    .line 1888
    nop

    .line 1889
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/fragment/app/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lcom/google/android/gms/common/internal/j;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lcom/google/android/gms/common/internal/j0;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lcom/google/android/gms/common/internal/s;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lcom/google/android/gms/common/internal/y;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lcom/google/android/gms/common/internal/x;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lcom/google/android/gms/common/internal/q;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lcom/google/android/gms/common/internal/t;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lcom/google/android/gms/common/internal/g;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lc3/d0;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lc3/c;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lc3/b;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lc3/b0;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lc3/l;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lc3/a0;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lc3/z;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lc3/k;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lc3/j;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lc3/i;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lc3/y;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lcom/google/android/gms/location/LocationResult;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lcom/google/android/gms/location/LocationRequest;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lcom/google/android/gms/location/LocationAvailability;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lc3/e;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Landroidx/fragment/app/a1;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Landroidx/fragment/app/w0;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Landroidx/fragment/app/q0;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Landroidx/fragment/app/d;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Landroidx/fragment/app/c;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
