.class final Lcom/google/android/gms/internal/ads/zzghe;
.super Lcom/google/android/gms/internal/ads/zzghb;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgfx;

.field private final zzc:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzawg;Lcom/google/android/gms/internal/ads/zzgfx;Ljava/util/Map;Landroid/util/DisplayMetrics;Lcom/google/android/gms/internal/ads/zzgoe;)V
    .locals 7

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/ads/zzgoe;->zza(I)Lcom/google/android/gms/internal/ads/zzgoc;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj"

    .line 8
    .line 9
    const-string v3, "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzghb;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;Lcom/google/android/gms/internal/ads/zzgfx;Lcom/google/android/gms/internal/ads/zzgoc;)V

    .line 15
    .line 16
    .line 17
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzghe;->zzb:Lcom/google/android/gms/internal/ads/zzgfx;

    .line 18
    .line 19
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzghe;->zza:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p4, v1, Lcom/google/android/gms/internal/ads/zzghe;->zzc:Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    return-void
.end method

.method private static zzb(DLandroid/util/DisplayMetrics;)J
    .locals 2

    .line 1
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 2
    .line 3
    float-to-double v0, p2

    .line 4
    div-double/2addr p0, v0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method private static zzc(Landroid/util/DisplayMetrics;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    cmpl-float p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzawg;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzghe;->zza:Ljava/util/Map;

    .line 2
    .line 3
    const-string v1, "nv"

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/view/MotionEvent;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzghe;->zzc:Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v3, ""

    .line 18
    .line 19
    invoke-virtual {p1, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxd;->zza()Lcom/google/android/gms/internal/ads/zzaxc;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v3, 0x0

    .line 33
    aget-object v4, p1, v3

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    aget-object v6, p1, v5

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    check-cast v4, Ljava/lang/Long;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzaxc;->zza(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 49
    .line 50
    .line 51
    aget-object v4, p1, v5

    .line 52
    .line 53
    check-cast v4, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzaxc;->zzb(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 60
    .line 61
    .line 62
    :cond_0
    const/4 v4, 0x2

    .line 63
    aget-object v6, p1, v4

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    check-cast v6, Ljava/lang/Long;

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzaxc;->zzh(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 74
    .line 75
    .line 76
    :cond_1
    const/4 v6, 0x3

    .line 77
    aget-object v7, p1, v6

    .line 78
    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    check-cast v7, Ljava/lang/Long;

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/ads/zzaxc;->zzf(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 88
    .line 89
    .line 90
    :cond_2
    const/4 v7, 0x4

    .line 91
    aget-object v8, p1, v7

    .line 92
    .line 93
    if-eqz v8, :cond_3

    .line 94
    .line 95
    check-cast v8, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v8

    .line 101
    invoke-virtual {v1, v8, v9}, Lcom/google/android/gms/internal/ads/zzaxc;->zzc(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 102
    .line 103
    .line 104
    :cond_3
    const/4 v8, 0x5

    .line 105
    aget-object v8, p1, v8

    .line 106
    .line 107
    const-wide/16 v9, 0x0

    .line 108
    .line 109
    if-eqz v8, :cond_5

    .line 110
    .line 111
    check-cast v8, Ljava/lang/Long;

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 114
    .line 115
    .line 116
    move-result-wide v11

    .line 117
    cmp-long v8, v11, v9

    .line 118
    .line 119
    if-eqz v8, :cond_4

    .line 120
    .line 121
    move v8, v4

    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move v8, v5

    .line 124
    :goto_0
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzaxc;->zzs(I)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 125
    .line 126
    .line 127
    :cond_5
    const/4 v8, 0x6

    .line 128
    aget-object v8, p1, v8

    .line 129
    .line 130
    if-eqz v8, :cond_6

    .line 131
    .line 132
    check-cast v8, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v11

    .line 138
    invoke-virtual {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzaxc;->zzj(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 139
    .line 140
    .line 141
    :cond_6
    const/4 v8, 0x7

    .line 142
    aget-object v8, p1, v8

    .line 143
    .line 144
    if-eqz v8, :cond_7

    .line 145
    .line 146
    check-cast v8, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v11

    .line 152
    invoke-virtual {v1, v11, v12}, Lcom/google/android/gms/internal/ads/zzaxc;->zzi(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 153
    .line 154
    .line 155
    :cond_7
    const/16 v8, 0x8

    .line 156
    .line 157
    aget-object p1, p1, v8

    .line 158
    .line 159
    if-eqz p1, :cond_9

    .line 160
    .line 161
    check-cast p1, Ljava/lang/Long;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 164
    .line 165
    .line 166
    move-result-wide v11

    .line 167
    cmp-long p1, v11, v9

    .line 168
    .line 169
    if-eqz p1, :cond_8

    .line 170
    .line 171
    move p1, v4

    .line 172
    goto :goto_1

    .line 173
    :cond_8
    move p1, v5

    .line 174
    :goto_1
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzaxc;->zzt(I)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 175
    .line 176
    .line 177
    :cond_9
    monitor-enter p2

    .line 178
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzghe;->zzb:Lcom/google/android/gms/internal/ads/zzgfx;

    .line 179
    .line 180
    const-string v8, "LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M"

    .line 181
    .line 182
    const-string v11, "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s="

    .line 183
    .line 184
    invoke-interface {p1, v8, v11}, Lcom/google/android/gms/internal/ads/zzgfx;->zzc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const/4 v8, 0x0

    .line 189
    if-eqz p1, :cond_1b

    .line 190
    .line 191
    const-string v11, "nv"

    .line 192
    .line 193
    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    check-cast v11, Landroid/view/MotionEvent;

    .line 198
    .line 199
    const-string v12, ""

    .line 200
    .line 201
    filled-new-array {v11, v2}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-virtual {p1, v12, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, [Ljava/lang/Object;

    .line 210
    .line 211
    if-eqz p1, :cond_1a

    .line 212
    .line 213
    aget-object v11, p1, v3

    .line 214
    .line 215
    if-eqz v11, :cond_a

    .line 216
    .line 217
    check-cast v11, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v11

    .line 223
    invoke-virtual {p2, v11, v12}, Lcom/google/android/gms/internal/ads/zzawg;->zzh(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :catchall_0
    move-exception p1

    .line 228
    goto/16 :goto_6

    .line 229
    .line 230
    :cond_a
    :goto_2
    aget-object v5, p1, v5

    .line 231
    .line 232
    if-eqz v5, :cond_b

    .line 233
    .line 234
    check-cast v5, Ljava/lang/Long;

    .line 235
    .line 236
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 237
    .line 238
    .line 239
    move-result-wide v11

    .line 240
    invoke-virtual {p2, v11, v12}, Lcom/google/android/gms/internal/ads/zzawg;->zzi(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 241
    .line 242
    .line 243
    :cond_b
    aget-object v4, p1, v4

    .line 244
    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    check-cast v4, Ljava/lang/Long;

    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 250
    .line 251
    .line 252
    move-result-wide v4

    .line 253
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzj(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 254
    .line 255
    .line 256
    :cond_c
    aget-object v4, p1, v6

    .line 257
    .line 258
    if-eqz v4, :cond_d

    .line 259
    .line 260
    check-cast v4, Ljava/lang/Long;

    .line 261
    .line 262
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 263
    .line 264
    .line 265
    move-result-wide v4

    .line 266
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzv(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 267
    .line 268
    .line 269
    :cond_d
    aget-object p1, p1, v7

    .line 270
    .line 271
    if-eqz p1, :cond_e

    .line 272
    .line 273
    check-cast p1, Ljava/lang/Long;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzw(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 280
    .line 281
    .line 282
    :cond_e
    const-string p1, "oe"

    .line 283
    .line 284
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    check-cast p1, Lcom/google/android/gms/internal/ads/zzger;

    .line 289
    .line 290
    if-nez p1, :cond_f

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_f
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zza:J

    .line 294
    .line 295
    cmp-long v6, v4, v9

    .line 296
    .line 297
    if-lez v6, :cond_10

    .line 298
    .line 299
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzz(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 300
    .line 301
    .line 302
    :cond_10
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzb:J

    .line 303
    .line 304
    cmp-long v6, v4, v9

    .line 305
    .line 306
    if-lez v6, :cond_11

    .line 307
    .line 308
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzy(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 309
    .line 310
    .line 311
    :cond_11
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzc:J

    .line 312
    .line 313
    cmp-long v6, v4, v9

    .line 314
    .line 315
    if-lez v6, :cond_12

    .line 316
    .line 317
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzx(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 318
    .line 319
    .line 320
    :cond_12
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzd:J

    .line 321
    .line 322
    cmp-long p1, v4, v9

    .line 323
    .line 324
    if-lez p1, :cond_13

    .line 325
    .line 326
    invoke-virtual {p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzawg;->zzA(J)Lcom/google/android/gms/internal/ads/zzawg;

    .line 327
    .line 328
    .line 329
    :cond_13
    :goto_3
    const-string p1, "oe"

    .line 330
    .line 331
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    check-cast p1, Lcom/google/android/gms/internal/ads/zzger;

    .line 336
    .line 337
    if-nez p1, :cond_14

    .line 338
    .line 339
    goto/16 :goto_4

    .line 340
    .line 341
    :cond_14
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zza:J

    .line 342
    .line 343
    cmp-long v4, v4, v9

    .line 344
    .line 345
    if-eqz v4, :cond_17

    .line 346
    .line 347
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzc(Landroid/util/DisplayMetrics;)Z

    .line 348
    .line 349
    .line 350
    move-result v4

    .line 351
    if-eqz v4, :cond_17

    .line 352
    .line 353
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zze:D

    .line 354
    .line 355
    if-eqz v2, :cond_16

    .line 356
    .line 357
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 358
    .line 359
    .line 360
    move-result-wide v4

    .line 361
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzl(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 362
    .line 363
    .line 364
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzh:F

    .line 365
    .line 366
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzger;->zzf:F

    .line 367
    .line 368
    sub-float/2addr v4, v5

    .line 369
    float-to-double v4, v4

    .line 370
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 371
    .line 372
    .line 373
    move-result-wide v4

    .line 374
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzm(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 375
    .line 376
    .line 377
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzi:F

    .line 378
    .line 379
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzger;->zzg:F

    .line 380
    .line 381
    sub-float/2addr v4, v5

    .line 382
    float-to-double v4, v4

    .line 383
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 384
    .line 385
    .line 386
    move-result-wide v4

    .line 387
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzn(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 388
    .line 389
    .line 390
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzf:F

    .line 391
    .line 392
    float-to-double v4, v4

    .line 393
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 394
    .line 395
    .line 396
    move-result-wide v4

    .line 397
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzq(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 398
    .line 399
    .line 400
    iget v4, p1, Lcom/google/android/gms/internal/ads/zzger;->zzg:F

    .line 401
    .line 402
    float-to-double v4, v4

    .line 403
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 404
    .line 405
    .line 406
    move-result-wide v4

    .line 407
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzr(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 408
    .line 409
    .line 410
    const-string v4, "nv"

    .line 411
    .line 412
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    check-cast v4, Landroid/view/MotionEvent;

    .line 417
    .line 418
    if-eqz v4, :cond_17

    .line 419
    .line 420
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzger;->zzf:F

    .line 421
    .line 422
    iget v6, p1, Lcom/google/android/gms/internal/ads/zzger;->zzh:F

    .line 423
    .line 424
    sub-float/2addr v5, v6

    .line 425
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getRawX()F

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    add-float/2addr v5, v6

    .line 430
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getX()F

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    sub-float/2addr v5, v6

    .line 435
    float-to-double v5, v5

    .line 436
    invoke-static {v5, v6, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 437
    .line 438
    .line 439
    move-result-wide v5

    .line 440
    cmp-long v7, v5, v9

    .line 441
    .line 442
    if-eqz v7, :cond_15

    .line 443
    .line 444
    invoke-virtual {v1, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxc;->zzo(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 445
    .line 446
    .line 447
    :cond_15
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzger;->zzg:F

    .line 448
    .line 449
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzger;->zzi:F

    .line 450
    .line 451
    sub-float/2addr v5, p1

    .line 452
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getRawY()F

    .line 453
    .line 454
    .line 455
    move-result p1

    .line 456
    add-float/2addr v5, p1

    .line 457
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    sub-float/2addr v5, p1

    .line 462
    float-to-double v4, v5

    .line 463
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 464
    .line 465
    .line 466
    move-result-wide v4

    .line 467
    cmp-long p1, v4, v9

    .line 468
    .line 469
    if-eqz p1, :cond_17

    .line 470
    .line 471
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzp(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 472
    .line 473
    .line 474
    goto :goto_4

    .line 475
    :cond_16
    throw v8

    .line 476
    :cond_17
    :goto_4
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzawg;->zzJ(Lcom/google/android/gms/internal/ads/zzaxc;)Lcom/google/android/gms/internal/ads/zzawg;

    .line 477
    .line 478
    .line 479
    const-string p1, "ro"

    .line 480
    .line 481
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    check-cast p1, [Lcom/google/android/gms/internal/ads/zzges;

    .line 486
    .line 487
    if-eqz p1, :cond_19

    .line 488
    .line 489
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzc(Landroid/util/DisplayMetrics;)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_19

    .line 494
    .line 495
    :goto_5
    array-length v0, p1

    .line 496
    add-int/lit8 v0, v0, -0x2

    .line 497
    .line 498
    if-gt v3, v0, :cond_19

    .line 499
    .line 500
    aget-object v0, p1, v3

    .line 501
    .line 502
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxd;->zza()Lcom/google/android/gms/internal/ads/zzaxc;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzges;->zza:F

    .line 507
    .line 508
    float-to-double v4, v4

    .line 509
    if-eqz v2, :cond_18

    .line 510
    .line 511
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 512
    .line 513
    .line 514
    move-result-wide v4

    .line 515
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zza(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 516
    .line 517
    .line 518
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzges;->zzb:F

    .line 519
    .line 520
    float-to-double v4, v0

    .line 521
    invoke-static {v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzghe;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 522
    .line 523
    .line 524
    move-result-wide v4

    .line 525
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxc;->zzb(J)Lcom/google/android/gms/internal/ads/zzaxc;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxd;

    .line 533
    .line 534
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzawg;->zzK(Lcom/google/android/gms/internal/ads/zzaxd;)Lcom/google/android/gms/internal/ads/zzawg;

    .line 535
    .line 536
    .line 537
    add-int/lit8 v3, v3, 0x1

    .line 538
    .line 539
    goto :goto_5

    .line 540
    :cond_18
    throw v8

    .line 541
    :cond_19
    monitor-exit p2

    .line 542
    return-void

    .line 543
    :cond_1a
    throw v8

    .line 544
    :cond_1b
    throw v8

    .line 545
    :goto_6
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 546
    throw p1
.end method
