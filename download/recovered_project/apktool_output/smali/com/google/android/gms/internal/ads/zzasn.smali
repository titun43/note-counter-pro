.class public Lcom/google/android/gms/internal/ads/zzasn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzarr;


# instance fields
.field protected final zza:Lcom/google/android/gms/internal/ads/zzasp;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzasm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzasm;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasp;

    .line 2
    .line 3
    const/16 v1, 0x1000

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzasp;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzasn;->zzb:Lcom/google/android/gms/internal/ads/zzasm;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzasn;->zza:Lcom/google/android/gms/internal/ads/zzasp;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/ads/zzary;)Lcom/google/android/gms/internal/ads/zzaru;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "]"

    .line 6
    .line 7
    const-string v4, "Error occurred when closing InputStream"

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v5

    .line 13
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzk()Lcom/google/android/gms/internal/ads/zzarh;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto/16 :goto_10

    .line 24
    .line 25
    :cond_0
    new-instance v8, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzb:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v9, :cond_1

    .line 33
    .line 34
    const-string v10, "If-None-Match"

    .line 35
    .line 36
    invoke-virtual {v8, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzd:J

    .line 40
    .line 41
    const-wide/16 v11, 0x0

    .line 42
    .line 43
    cmp-long v0, v9, v11

    .line 44
    .line 45
    if-lez v0, :cond_2

    .line 46
    .line 47
    const-string v0, "If-Modified-Since"

    .line 48
    .line 49
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzasv;->zzc(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    invoke-virtual {v8, v0, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_2
    move-object v0, v8

    .line 57
    :goto_1
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzasn;->zzb:Lcom/google/android/gms/internal/ads/zzasm;

    .line 58
    .line 59
    invoke-virtual {v8, v2, v0}, Lcom/google/android/gms/internal/ads/zzasm;->zza(Lcom/google/android/gms/internal/ads/zzary;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/zzasw;

    .line 60
    .line 61
    .line 62
    move-result-object v8
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :try_start_1
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzasw;->zza()I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzasw;->zzb()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    const/16 v0, 0x130

    .line 72
    .line 73
    if-ne v10, v0, :cond_9

    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    sub-long v20, v9, v5

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzk()Lcom/google/android/gms/internal/ads/zzarh;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    new-instance v11, Lcom/google/android/gms/internal/ads/zzaru;

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x1

    .line 91
    const/16 v12, 0x130

    .line 92
    .line 93
    move-object/from16 v17, v15

    .line 94
    .line 95
    move-wide/from16 v15, v20

    .line 96
    .line 97
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzaru;-><init>(I[BZJLjava/util/List;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :catch_1
    move-exception v0

    .line 103
    goto/16 :goto_e

    .line 104
    .line 105
    :cond_3
    new-instance v9, Ljava/util/TreeSet;

    .line 106
    .line 107
    sget-object v10, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 108
    .line 109
    invoke-direct {v9, v10}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-nez v10, :cond_4

    .line 117
    .line 118
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-eqz v11, :cond_4

    .line 127
    .line 128
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    check-cast v11, Lcom/google/android/gms/internal/ads/zzarq;

    .line 133
    .line 134
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzarq;->zza()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-virtual {v9, v11}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v10, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 145
    .line 146
    .line 147
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzh:Ljava/util/List;

    .line 148
    .line 149
    if-eqz v11, :cond_6

    .line 150
    .line 151
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-nez v11, :cond_8

    .line 156
    .line 157
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzh:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    :cond_5
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    if-eqz v12, :cond_8

    .line 168
    .line 169
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    check-cast v12, Lcom/google/android/gms/internal/ads/zzarq;

    .line 174
    .line 175
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzarq;->zza()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    invoke-virtual {v9, v13}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-nez v13, :cond_5

    .line 184
    .line 185
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_6
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzg:Ljava/util/Map;

    .line 190
    .line 191
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v11

    .line 195
    if-nez v11, :cond_8

    .line 196
    .line 197
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzarh;->zzg:Ljava/util/Map;

    .line 198
    .line 199
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    :cond_7
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-eqz v12, :cond_8

    .line 212
    .line 213
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    check-cast v12, Ljava/util/Map$Entry;

    .line 218
    .line 219
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-virtual {v9, v13}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v13

    .line 227
    if-nez v13, :cond_7

    .line 228
    .line 229
    new-instance v13, Lcom/google/android/gms/internal/ads/zzarq;

    .line 230
    .line 231
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    check-cast v14, Ljava/lang/String;

    .line 236
    .line 237
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    check-cast v12, Ljava/lang/String;

    .line 242
    .line 243
    invoke-direct {v13, v14, v12}, Lcom/google/android/gms/internal/ads/zzarq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    new-instance v16, Lcom/google/android/gms/internal/ads/zzaru;

    .line 251
    .line 252
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzarh;->zza:[B

    .line 253
    .line 254
    const/16 v19, 0x1

    .line 255
    .line 256
    const/16 v17, 0x130

    .line 257
    .line 258
    move-object/from16 v18, v0

    .line 259
    .line 260
    move-object/from16 v22, v10

    .line 261
    .line 262
    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/internal/ads/zzaru;-><init>(I[BZJLjava/util/List;)V

    .line 263
    .line 264
    .line 265
    move-object/from16 v11, v16

    .line 266
    .line 267
    :goto_5
    return-object v11

    .line 268
    :cond_9
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzasw;->zzd()Ljava/io/InputStream;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    const/4 v11, 0x0

    .line 273
    if-eqz v9, :cond_b

    .line 274
    .line 275
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzasw;->zzc()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzasn;->zza:Lcom/google/android/gms/internal/ads/zzasp;

    .line 280
    .line 281
    new-instance v13, Lcom/google/android/gms/internal/ads/zzata;

    .line 282
    .line 283
    invoke-direct {v13, v12, v0}, Lcom/google/android/gms/internal/ads/zzata;-><init>(Lcom/google/android/gms/internal/ads/zzasp;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 284
    .line 285
    .line 286
    const/16 v0, 0x400

    .line 287
    .line 288
    :try_start_2
    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/ads/zzasp;->zza(I)[B

    .line 289
    .line 290
    .line 291
    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 292
    :goto_6
    :try_start_3
    invoke-virtual {v9, v14}, Ljava/io/InputStream;->read([B)I

    .line 293
    .line 294
    .line 295
    move-result v0

    .line 296
    const/4 v7, -0x1

    .line 297
    if-eq v0, v7, :cond_a

    .line 298
    .line 299
    invoke-virtual {v13, v14, v11, v0}, Lcom/google/android/gms/internal/ads/zzata;->write([BII)V

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :catchall_0
    move-exception v0

    .line 304
    goto :goto_9

    .line 305
    :cond_a
    invoke-virtual {v13}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 306
    .line 307
    .line 308
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 309
    :try_start_4
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :catch_2
    :try_start_5
    new-array v7, v11, [Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v4, v7}, Lcom/google/android/gms/internal/ads/zzask;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :goto_7
    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/zzasp;->zzb([B)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzata;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 322
    .line 323
    .line 324
    :goto_8
    move-object v11, v0

    .line 325
    goto :goto_b

    .line 326
    :catchall_1
    move-exception v0

    .line 327
    const/4 v14, 0x0

    .line 328
    :goto_9
    :try_start_6
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 329
    .line 330
    .line 331
    goto :goto_a

    .line 332
    :catch_3
    :try_start_7
    new-array v7, v11, [Ljava/lang/Object;

    .line 333
    .line 334
    invoke-static {v4, v7}, Lcom/google/android/gms/internal/ads/zzask;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :goto_a
    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/ads/zzasp;->zzb([B)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzata;->close()V

    .line 341
    .line 342
    .line 343
    throw v0

    .line 344
    :cond_b
    new-array v0, v11, [B
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 345
    .line 346
    goto :goto_8

    .line 347
    :goto_b
    :try_start_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 348
    .line 349
    .line 350
    move-result-wide v12

    .line 351
    sub-long/2addr v12, v5

    .line 352
    sget-boolean v0, Lcom/google/android/gms/internal/ads/zzask;->zzb:Z

    .line 353
    .line 354
    if-nez v0, :cond_c

    .line 355
    .line 356
    const-wide/16 v16, 0xbb8

    .line 357
    .line 358
    cmp-long v0, v12, v16

    .line 359
    .line 360
    if-lez v0, :cond_e

    .line 361
    .line 362
    :cond_c
    const-string v0, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    .line 363
    .line 364
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    if-eqz v11, :cond_d

    .line 369
    .line 370
    array-length v9, v11

    .line 371
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    goto :goto_c

    .line 376
    :catch_4
    move-exception v0

    .line 377
    goto :goto_d

    .line 378
    :cond_d
    const-string v9, "null"

    .line 379
    .line 380
    :goto_c
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzy()Lcom/google/android/gms/internal/ads/zzarm;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzarm;->zzb()I

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v13

    .line 396
    filled-new-array {v2, v7, v9, v12, v13}, [Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-static {v0, v7}, Lcom/google/android/gms/internal/ads/zzask;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_e
    const/16 v0, 0xc8

    .line 404
    .line 405
    if-lt v10, v0, :cond_f

    .line 406
    .line 407
    const/16 v0, 0x12b

    .line 408
    .line 409
    if-gt v10, v0, :cond_f

    .line 410
    .line 411
    new-instance v9, Lcom/google/android/gms/internal/ads/zzaru;

    .line 412
    .line 413
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 414
    .line 415
    .line 416
    move-result-wide v12

    .line 417
    sub-long v13, v12, v5

    .line 418
    .line 419
    const/4 v12, 0x0

    .line 420
    invoke-direct/range {v9 .. v15}, Lcom/google/android/gms/internal/ads/zzaru;-><init>(I[BZJLjava/util/List;)V

    .line 421
    .line 422
    .line 423
    return-object v9

    .line 424
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 425
    .line 426
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 427
    .line 428
    .line 429
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 430
    :goto_d
    move-object v7, v8

    .line 431
    move-object v10, v11

    .line 432
    goto :goto_11

    .line 433
    :goto_e
    move-object v7, v8

    .line 434
    :goto_f
    const/4 v10, 0x0

    .line 435
    goto :goto_11

    .line 436
    :goto_10
    const/4 v7, 0x0

    .line 437
    goto :goto_f

    .line 438
    :goto_11
    instance-of v8, v0, Ljava/net/SocketTimeoutException;

    .line 439
    .line 440
    if-eqz v8, :cond_10

    .line 441
    .line 442
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasg;

    .line 443
    .line 444
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzasg;-><init>()V

    .line 445
    .line 446
    .line 447
    const-string v7, "socket"

    .line 448
    .line 449
    goto :goto_13

    .line 450
    :cond_10
    instance-of v8, v0, Ljava/net/MalformedURLException;

    .line 451
    .line 452
    if-nez v8, :cond_16

    .line 453
    .line 454
    if-eqz v7, :cond_15

    .line 455
    .line 456
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzasw;->zza()I

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzh()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    filled-new-array {v0, v8}, [Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    const-string v8, "Unexpected response code %d for %s"

    .line 473
    .line 474
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzask;->zzc(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    if-eqz v10, :cond_14

    .line 478
    .line 479
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzasw;->zzb()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v14

    .line 483
    new-instance v8, Lcom/google/android/gms/internal/ads/zzaru;

    .line 484
    .line 485
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 486
    .line 487
    .line 488
    move-result-wide v11

    .line 489
    sub-long v12, v11, v5

    .line 490
    .line 491
    const/4 v11, 0x0

    .line 492
    invoke-direct/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzaru;-><init>(I[BZJLjava/util/List;)V

    .line 493
    .line 494
    .line 495
    const/16 v0, 0x191

    .line 496
    .line 497
    if-eq v9, v0, :cond_13

    .line 498
    .line 499
    const/16 v0, 0x193

    .line 500
    .line 501
    if-ne v9, v0, :cond_11

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_11
    const/16 v0, 0x190

    .line 505
    .line 506
    if-lt v9, v0, :cond_12

    .line 507
    .line 508
    const/16 v0, 0x1f3

    .line 509
    .line 510
    if-gt v9, v0, :cond_12

    .line 511
    .line 512
    new-instance v0, Lcom/google/android/gms/internal/ads/zzarl;

    .line 513
    .line 514
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzarl;-><init>(Lcom/google/android/gms/internal/ads/zzaru;)V

    .line 515
    .line 516
    .line 517
    throw v0

    .line 518
    :cond_12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasf;

    .line 519
    .line 520
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzasf;-><init>(Lcom/google/android/gms/internal/ads/zzaru;)V

    .line 521
    .line 522
    .line 523
    throw v0

    .line 524
    :cond_13
    :goto_12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzarg;

    .line 525
    .line 526
    invoke-direct {v0, v8}, Lcom/google/android/gms/internal/ads/zzarg;-><init>(Lcom/google/android/gms/internal/ads/zzaru;)V

    .line 527
    .line 528
    .line 529
    const-string v7, "auth"

    .line 530
    .line 531
    goto :goto_13

    .line 532
    :cond_14
    new-instance v0, Lcom/google/android/gms/internal/ads/zzart;

    .line 533
    .line 534
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzart;-><init>()V

    .line 535
    .line 536
    .line 537
    const-string v7, "network"

    .line 538
    .line 539
    :goto_13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzy()Lcom/google/android/gms/internal/ads/zzarm;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzo()I

    .line 544
    .line 545
    .line 546
    move-result v9

    .line 547
    :try_start_9
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/zzarm;->zzc(Lcom/google/android/gms/internal/ads/zzash;)V
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/zzash; {:try_start_9 .. :try_end_9} :catch_5

    .line 548
    .line 549
    .line 550
    new-instance v0, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    const-string v7, "-retry [timeout="

    .line 559
    .line 560
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzary;->zzc(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_0

    .line 577
    .line 578
    :catch_5
    move-exception v0

    .line 579
    new-instance v4, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string v5, "-timeout-giveup [timeout="

    .line 588
    .line 589
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzary;->zzc(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw v0

    .line 606
    :cond_15
    new-instance v2, Lcom/google/android/gms/internal/ads/zzarv;

    .line 607
    .line 608
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzarv;-><init>(Ljava/lang/Throwable;)V

    .line 609
    .line 610
    .line 611
    throw v2

    .line 612
    :cond_16
    new-instance v3, Ljava/lang/RuntimeException;

    .line 613
    .line 614
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzary;->zzh()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    const-string v4, "Bad URL "

    .line 623
    .line 624
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 629
    .line 630
    .line 631
    throw v3
.end method
