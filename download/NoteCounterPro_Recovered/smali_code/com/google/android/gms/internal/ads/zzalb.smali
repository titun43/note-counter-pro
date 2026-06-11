.class public final Lcom/google/android/gms/internal/ads/zzalb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzalb;->zza:[I

    return-void

    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.8909645E8f
        0x4d344120    # 1.8901043E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzaev;)Lcom/google/android/gms/internal/ads/zzagc;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzalb;->zzc(Lcom/google/android/gms/internal/ads/zzaev;ZZ)Lcom/google/android/gms/internal/ads/zzagc;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzaev;Z)Lcom/google/android/gms/internal/ads/zzagc;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzalb;->zzc(Lcom/google/android/gms/internal/ads/zzaev;ZZ)Lcom/google/android/gms/internal/ads/zzagc;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private static zzc(Lcom/google/android/gms/internal/ads/zzaev;ZZ)Lcom/google/android/gms/internal/ads/zzagc;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    cmp-long v6, v2, v4

    .line 12
    .line 13
    const-wide/16 v7, 0x1000

    .line 14
    .line 15
    if-eqz v6, :cond_1

    .line 16
    .line 17
    cmp-long v9, v2, v7

    .line 18
    .line 19
    if-lez v9, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v7, v2

    .line 23
    :cond_1
    :goto_0
    new-instance v9, Lcom/google/android/gms/internal/ads/zzer;

    .line 24
    .line 25
    const/16 v10, 0x40

    .line 26
    .line 27
    invoke-direct {v9, v10}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 28
    .line 29
    .line 30
    long-to-int v7, v7

    .line 31
    const/4 v8, 0x0

    .line 32
    move v10, v8

    .line 33
    move v11, v10

    .line 34
    :goto_1
    if-ge v10, v7, :cond_19

    .line 35
    .line 36
    const/16 v13, 0x8

    .line 37
    .line 38
    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    const/4 v15, 0x1

    .line 46
    invoke-interface {v0, v14, v8, v13, v15}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    if-nez v14, :cond_2

    .line 51
    .line 52
    :goto_2
    const/16 v17, 0x0

    .line 53
    .line 54
    goto/16 :goto_b

    .line 55
    .line 56
    :cond_2
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 57
    .line 58
    .line 59
    move-result-wide v16

    .line 60
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    const-wide/16 v18, 0x1

    .line 65
    .line 66
    cmp-long v18, v16, v18

    .line 67
    .line 68
    const-wide/16 v19, 0x8

    .line 69
    .line 70
    if-nez v18, :cond_3

    .line 71
    .line 72
    move-wide/from16 v21, v4

    .line 73
    .line 74
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v0, v4, v13, v13}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 79
    .line 80
    .line 81
    const/16 v4, 0x10

    .line 82
    .line 83
    invoke-virtual {v9, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzD()J

    .line 87
    .line 88
    .line 89
    move-result-wide v16

    .line 90
    move-object v5, v9

    .line 91
    :goto_3
    move-wide/from16 v8, v16

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_3
    move-wide/from16 v21, v4

    .line 97
    .line 98
    const-wide/16 v4, 0x0

    .line 99
    .line 100
    cmp-long v4, v16, v4

    .line 101
    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    cmp-long v18, v4, v21

    .line 109
    .line 110
    if-eqz v18, :cond_4

    .line 111
    .line 112
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 113
    .line 114
    .line 115
    move-result-wide v16

    .line 116
    sub-long v4, v4, v16

    .line 117
    .line 118
    add-long v16, v4, v19

    .line 119
    .line 120
    :cond_4
    move-object v5, v9

    .line 121
    move v4, v13

    .line 122
    goto :goto_3

    .line 123
    :goto_4
    int-to-long v12, v4

    .line 124
    cmp-long v23, v8, v12

    .line 125
    .line 126
    if-gez v23, :cond_7

    .line 127
    .line 128
    move/from16 v23, v15

    .line 129
    .line 130
    const v15, 0x66726565

    .line 131
    .line 132
    .line 133
    if-ne v14, v15, :cond_6

    .line 134
    .line 135
    const/16 v15, 0x8

    .line 136
    .line 137
    if-ne v4, v15, :cond_5

    .line 138
    .line 139
    move-wide/from16 v8, v19

    .line 140
    .line 141
    const v14, 0x66726565

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    const v14, 0x66726565

    .line 146
    .line 147
    .line 148
    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzajv;

    .line 149
    .line 150
    invoke-direct {v0, v14, v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzajv;-><init>(IJI)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_7
    move/from16 v23, v15

    .line 155
    .line 156
    :goto_5
    add-int/2addr v10, v4

    .line 157
    const v4, 0x6d6f6f76

    .line 158
    .line 159
    .line 160
    if-ne v14, v4, :cond_9

    .line 161
    .line 162
    long-to-int v4, v8

    .line 163
    add-int/2addr v7, v4

    .line 164
    if-eqz v6, :cond_8

    .line 165
    .line 166
    int-to-long v8, v7

    .line 167
    cmp-long v4, v8, v2

    .line 168
    .line 169
    if-lez v4, :cond_8

    .line 170
    .line 171
    long-to-int v7, v2

    .line 172
    :cond_8
    move-object v9, v5

    .line 173
    move-wide/from16 v4, v21

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :cond_9
    const v4, 0x7472616b

    .line 179
    .line 180
    .line 181
    if-eq v14, v4, :cond_a

    .line 182
    .line 183
    const v4, 0x6d646961

    .line 184
    .line 185
    .line 186
    if-eq v14, v4, :cond_a

    .line 187
    .line 188
    const v4, 0x6d696e66

    .line 189
    .line 190
    .line 191
    if-ne v14, v4, :cond_b

    .line 192
    .line 193
    :cond_a
    move-wide/from16 v19, v2

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    goto/16 :goto_a

    .line 197
    .line 198
    :cond_b
    const v4, 0x6d6f6f66

    .line 199
    .line 200
    .line 201
    if-eq v14, v4, :cond_c

    .line 202
    .line 203
    const v4, 0x6d766578

    .line 204
    .line 205
    .line 206
    if-ne v14, v4, :cond_d

    .line 207
    .line 208
    :cond_c
    move/from16 v8, v23

    .line 209
    .line 210
    goto/16 :goto_b

    .line 211
    .line 212
    :cond_d
    const v4, 0x6d646174

    .line 213
    .line 214
    .line 215
    if-ne v14, v4, :cond_e

    .line 216
    .line 217
    const/4 v4, 0x0

    .line 218
    goto :goto_6

    .line 219
    :cond_e
    move/from16 v4, v23

    .line 220
    .line 221
    :goto_6
    xor-int/lit8 v4, v4, 0x1

    .line 222
    .line 223
    or-int/2addr v11, v4

    .line 224
    const v4, 0x7374626c

    .line 225
    .line 226
    .line 227
    if-ne v14, v4, :cond_10

    .line 228
    .line 229
    const-wide/32 v14, 0xf4240

    .line 230
    .line 231
    .line 232
    cmp-long v14, v8, v14

    .line 233
    .line 234
    if-lez v14, :cond_f

    .line 235
    .line 236
    :goto_7
    const/4 v8, 0x0

    .line 237
    goto/16 :goto_b

    .line 238
    .line 239
    :cond_f
    move v14, v4

    .line 240
    :cond_10
    move-wide/from16 v19, v2

    .line 241
    .line 242
    int-to-long v2, v10

    .line 243
    move-wide/from16 v24, v2

    .line 244
    .line 245
    int-to-long v2, v7

    .line 246
    add-long v24, v24, v8

    .line 247
    .line 248
    sub-long v24, v24, v12

    .line 249
    .line 250
    cmp-long v2, v24, v2

    .line 251
    .line 252
    if-ltz v2, :cond_11

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_11
    sub-long/2addr v8, v12

    .line 256
    long-to-int v2, v8

    .line 257
    add-int/2addr v10, v2

    .line 258
    const v3, 0x66747970

    .line 259
    .line 260
    .line 261
    if-ne v14, v3, :cond_17

    .line 262
    .line 263
    const/16 v15, 0x8

    .line 264
    .line 265
    if-ge v2, v15, :cond_12

    .line 266
    .line 267
    int-to-long v0, v2

    .line 268
    new-instance v2, Lcom/google/android/gms/internal/ads/zzajv;

    .line 269
    .line 270
    invoke-direct {v2, v3, v0, v1, v15}, Lcom/google/android/gms/internal/ads/zzajv;-><init>(IJI)V

    .line 271
    .line 272
    .line 273
    return-object v2

    .line 274
    :cond_12
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-interface {v0, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzalb;->zzd(IZ)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    or-int/2addr v3, v11

    .line 294
    const/4 v8, 0x4

    .line 295
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    div-int/2addr v9, v8

    .line 303
    if-nez v3, :cond_15

    .line 304
    .line 305
    if-lez v9, :cond_15

    .line 306
    .line 307
    new-array v12, v9, [I

    .line 308
    .line 309
    move v8, v4

    .line 310
    :goto_8
    if-ge v8, v9, :cond_14

    .line 311
    .line 312
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 313
    .line 314
    .line 315
    move-result v11

    .line 316
    aput v11, v12, v8

    .line 317
    .line 318
    invoke-static {v11, v1}, Lcom/google/android/gms/internal/ads/zzalb;->zzd(IZ)Z

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-eqz v11, :cond_13

    .line 323
    .line 324
    move/from16 v15, v23

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_14
    move v15, v3

    .line 331
    goto :goto_9

    .line 332
    :cond_15
    move v15, v3

    .line 333
    move-object/from16 v12, v17

    .line 334
    .line 335
    :goto_9
    if-eqz v15, :cond_16

    .line 336
    .line 337
    move v11, v15

    .line 338
    goto :goto_a

    .line 339
    :cond_16
    new-instance v0, Lcom/google/android/gms/internal/ads/zzalg;

    .line 340
    .line 341
    invoke-direct {v0, v2, v12}, Lcom/google/android/gms/internal/ads/zzalg;-><init>(I[I)V

    .line 342
    .line 343
    .line 344
    return-object v0

    .line 345
    :cond_17
    const/4 v4, 0x0

    .line 346
    if-eqz v2, :cond_18

    .line 347
    .line 348
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzk(I)V

    .line 349
    .line 350
    .line 351
    :cond_18
    :goto_a
    move v8, v4

    .line 352
    move-object v9, v5

    .line 353
    move-wide/from16 v2, v19

    .line 354
    .line 355
    move-wide/from16 v4, v21

    .line 356
    .line 357
    goto/16 :goto_1

    .line 358
    .line 359
    :cond_19
    move v4, v8

    .line 360
    goto/16 :goto_2

    .line 361
    .line 362
    :goto_b
    if-nez v11, :cond_1a

    .line 363
    .line 364
    sget-object v0, Lcom/google/android/gms/internal/ads/zzakx;->zza:Lcom/google/android/gms/internal/ads/zzakx;

    .line 365
    .line 366
    return-object v0

    .line 367
    :cond_1a
    move/from16 v0, p1

    .line 368
    .line 369
    if-eq v0, v8, :cond_1c

    .line 370
    .line 371
    if-eqz v8, :cond_1b

    .line 372
    .line 373
    sget-object v0, Lcom/google/android/gms/internal/ads/zzakp;->zza:Lcom/google/android/gms/internal/ads/zzakp;

    .line 374
    .line 375
    return-object v0

    .line 376
    :cond_1b
    sget-object v0, Lcom/google/android/gms/internal/ads/zzakp;->zzb:Lcom/google/android/gms/internal/ads/zzakp;

    .line 377
    .line 378
    return-object v0

    .line 379
    :cond_1c
    return-object v17
.end method

.method private static zzd(IZ)Z
    .locals 4

    .line 1
    ushr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    const v1, 0x336770

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    const v0, 0x68656963

    .line 11
    .line 12
    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    move p0, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v2

    .line 20
    :cond_2
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzalb;->zza:[I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    move v1, v0

    .line 24
    :goto_1
    const/16 v3, 0x1d

    .line 25
    .line 26
    if-ge v1, v3, :cond_4

    .line 27
    .line 28
    aget v3, p1, v1

    .line 29
    .line 30
    if-ne v3, p0, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_4
    return v0
.end method
