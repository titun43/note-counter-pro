.class public final Lcom/google/android/gms/internal/ads/zzajp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# static fields
.field public static final synthetic zza:I


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzafr;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzafn;

.field private final zze:Lcom/google/android/gms/internal/ads/zzafp;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzagh;

.field private zzg:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzh:Lcom/google/android/gms/internal/ads/zzagh;

.field private zzi:Lcom/google/android/gms/internal/ads/zzagh;

.field private zzj:I

.field private zzk:Lcom/google/android/gms/internal/ads/zzap;

.field private zzl:J

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:I

.field private zzq:Lcom/google/android/gms/internal/ads/zzajr;

.field private zzr:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzafr;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzafr;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzafn;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzafn;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzd:Lcom/google/android/gms/internal/ads/zzafn;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzl:J

    new-instance p1, Lcom/google/android/gms/internal/ads/zzafp;

    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzafp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zze:Lcom/google/android/gms/internal/ads/zzafp;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaer;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzf:Lcom/google/android/gms/internal/ads/zzagh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzi:Lcom/google/android/gms/internal/ads/zzagh;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzo:J

    return-void
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzaev;)I
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzj:I

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzajp;->zzk(Lcom/google/android/gms/internal/ads/zzaev;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    return v3

    .line 16
    :cond_0
    :goto_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 17
    .line 18
    const/4 v7, 0x1

    .line 19
    if-nez v2, :cond_17

    .line 20
    .line 21
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    .line 22
    .line 23
    new-instance v14, Lcom/google/android/gms/internal/ads/zzer;

    .line 24
    .line 25
    iget v2, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 26
    .line 27
    invoke-direct {v14, v2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v9, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 35
    .line 36
    invoke-interface {v1, v2, v4, v9}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 37
    .line 38
    .line 39
    iget v2, v13, Lcom/google/android/gms/internal/ads/zzafr;->zza:I

    .line 40
    .line 41
    and-int/2addr v2, v7

    .line 42
    const/16 v9, 0x15

    .line 43
    .line 44
    const/16 v10, 0x24

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget v2, v13, Lcom/google/android/gms/internal/ads/zzafr;->zze:I

    .line 49
    .line 50
    if-eq v2, v7, :cond_3

    .line 51
    .line 52
    move v9, v10

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget v2, v13, Lcom/google/android/gms/internal/ads/zzafr;->zze:I

    .line 55
    .line 56
    if-eq v2, v7, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/16 v9, 0xd

    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    add-int/lit8 v11, v9, 0x4

    .line 66
    .line 67
    const v12, 0x56425249

    .line 68
    .line 69
    .line 70
    const v15, 0x496e666f

    .line 71
    .line 72
    .line 73
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    const v5, 0x58696e67

    .line 79
    .line 80
    .line 81
    if-lt v2, v11, :cond_4

    .line 82
    .line 83
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eq v2, v5, :cond_6

    .line 91
    .line 92
    if-ne v2, v15, :cond_4

    .line 93
    .line 94
    move v2, v15

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const/16 v6, 0x28

    .line 101
    .line 102
    if-lt v2, v6, :cond_5

    .line 103
    .line 104
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ne v2, v12, :cond_5

    .line 112
    .line 113
    move v2, v12

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    move v2, v4

    .line 116
    :cond_6
    :goto_2
    if-eq v2, v15, :cond_8

    .line 117
    .line 118
    if-eq v2, v12, :cond_7

    .line 119
    .line 120
    if-eq v2, v5, :cond_8

    .line 121
    .line 122
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 123
    .line 124
    .line 125
    move/from16 v21, v3

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    :goto_3
    const/16 v20, 0x0

    .line 129
    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_7
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 133
    .line 134
    .line 135
    move-result-wide v9

    .line 136
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 137
    .line 138
    .line 139
    move-result-wide v11

    .line 140
    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/ads/zzajs;->zzd(JJLcom/google/android/gms/internal/ads/zzafr;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzajs;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget v5, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 145
    .line 146
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 147
    .line 148
    .line 149
    move/from16 v21, v3

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-static {v13, v14}, Lcom/google/android/gms/internal/ads/zzajt;->zza(Lcom/google/android/gms/internal/ads/zzafr;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzajt;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzd:Lcom/google/android/gms/internal/ads/zzafn;

    .line 157
    .line 158
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzafn;->zzb()Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_9

    .line 163
    .line 164
    iget v10, v6, Lcom/google/android/gms/internal/ads/zzajt;->zzd:I

    .line 165
    .line 166
    if-eq v10, v3, :cond_9

    .line 167
    .line 168
    iget v11, v6, Lcom/google/android/gms/internal/ads/zzajt;->zze:I

    .line 169
    .line 170
    if-eq v11, v3, :cond_9

    .line 171
    .line 172
    iput v10, v9, Lcom/google/android/gms/internal/ads/zzafn;->zza:I

    .line 173
    .line 174
    iput v11, v9, Lcom/google/android/gms/internal/ads/zzafn;->zzb:I

    .line 175
    .line 176
    :cond_9
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 181
    .line 182
    .line 183
    move-result-wide v11

    .line 184
    const-wide/16 v14, -0x1

    .line 185
    .line 186
    cmp-long v11, v11, v14

    .line 187
    .line 188
    if-eqz v11, :cond_a

    .line 189
    .line 190
    iget-wide v11, v6, Lcom/google/android/gms/internal/ads/zzajt;->zzc:J

    .line 191
    .line 192
    cmp-long v18, v11, v14

    .line 193
    .line 194
    if-eqz v18, :cond_a

    .line 195
    .line 196
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 197
    .line 198
    .line 199
    move-result-wide v18

    .line 200
    add-long/2addr v11, v9

    .line 201
    cmp-long v18, v18, v11

    .line 202
    .line 203
    if-eqz v18, :cond_a

    .line 204
    .line 205
    move-wide/from16 v18, v14

    .line 206
    .line 207
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 208
    .line 209
    .line 210
    move-result-wide v14

    .line 211
    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v20

    .line 215
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v20

    .line 219
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v21

    .line 223
    add-int/lit8 v20, v20, 0x35

    .line 224
    .line 225
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 226
    .line 227
    .line 228
    move-result v21

    .line 229
    add-int v21, v21, v20

    .line 230
    .line 231
    const/16 v20, 0x0

    .line 232
    .line 233
    new-instance v8, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    add-int/lit8 v7, v21, 0x14

    .line 236
    .line 237
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 238
    .line 239
    .line 240
    const-string v7, "Data size mismatch between stream ("

    .line 241
    .line 242
    move/from16 v21, v3

    .line 243
    .line 244
    const-string v3, ") and Xing frame ("

    .line 245
    .line 246
    invoke-static {v8, v7, v14, v15, v3}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v3, "), using Xing value."

    .line 253
    .line 254
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    const-string v7, "Mp3Extractor"

    .line 262
    .line 263
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/ads/zzee;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_a
    move/from16 v21, v3

    .line 268
    .line 269
    move-wide/from16 v18, v14

    .line 270
    .line 271
    const/16 v20, 0x0

    .line 272
    .line 273
    :goto_4
    iget v3, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 274
    .line 275
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 276
    .line 277
    .line 278
    if-ne v2, v5, :cond_b

    .line 279
    .line 280
    invoke-static {v6, v9, v10}, Lcom/google/android/gms/internal/ads/zzaju;->zzd(Lcom/google/android/gms/internal/ads/zzajt;J)Lcom/google/android/gms/internal/ads/zzaju;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    goto :goto_7

    .line 285
    :cond_b
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 286
    .line 287
    .line 288
    move-result-wide v2

    .line 289
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzajt;->zzb()J

    .line 290
    .line 291
    .line 292
    move-result-wide v26

    .line 293
    cmp-long v5, v26, v16

    .line 294
    .line 295
    if-nez v5, :cond_d

    .line 296
    .line 297
    :cond_c
    move-object/from16 v2, v20

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_d
    iget-wide v7, v6, Lcom/google/android/gms/internal/ads/zzajt;->zzc:J

    .line 301
    .line 302
    cmp-long v5, v7, v18

    .line 303
    .line 304
    if-eqz v5, :cond_e

    .line 305
    .line 306
    add-long v2, v9, v7

    .line 307
    .line 308
    iget-object v5, v6, Lcom/google/android/gms/internal/ads/zzajt;->zza:Lcom/google/android/gms/internal/ads/zzafr;

    .line 309
    .line 310
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 311
    .line 312
    :goto_5
    int-to-long v11, v5

    .line 313
    sub-long/2addr v7, v11

    .line 314
    move-wide/from16 v29, v2

    .line 315
    .line 316
    move-wide/from16 v22, v7

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_e
    cmp-long v5, v2, v18

    .line 320
    .line 321
    if-eqz v5, :cond_c

    .line 322
    .line 323
    sub-long v7, v2, v9

    .line 324
    .line 325
    iget-object v5, v6, Lcom/google/android/gms/internal/ads/zzajt;->zza:Lcom/google/android/gms/internal/ads/zzafr;

    .line 326
    .line 327
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :goto_6
    sget-object v28, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 331
    .line 332
    const-wide/32 v24, 0x7a1200

    .line 333
    .line 334
    .line 335
    invoke-static/range {v22 .. v28}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 336
    .line 337
    .line 338
    move-result-wide v2

    .line 339
    move-wide/from16 v7, v22

    .line 340
    .line 341
    move-object/from16 v5, v28

    .line 342
    .line 343
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzgxz;->zza(J)I

    .line 344
    .line 345
    .line 346
    move-result v33

    .line 347
    iget-wide v2, v6, Lcom/google/android/gms/internal/ads/zzajt;->zzb:J

    .line 348
    .line 349
    invoke-static {v7, v8, v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzgxu;->zza(JJLjava/math/RoundingMode;)J

    .line 350
    .line 351
    .line 352
    move-result-wide v2

    .line 353
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzgxz;->zza(J)I

    .line 354
    .line 355
    .line 356
    move-result v34

    .line 357
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzajt;->zza:Lcom/google/android/gms/internal/ads/zzafr;

    .line 358
    .line 359
    new-instance v28, Lcom/google/android/gms/internal/ads/zzajk;

    .line 360
    .line 361
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 362
    .line 363
    int-to-long v2, v2

    .line 364
    add-long v31, v9, v2

    .line 365
    .line 366
    const/16 v35, 0x0

    .line 367
    .line 368
    invoke-direct/range {v28 .. v35}, Lcom/google/android/gms/internal/ads/zzajk;-><init>(JJIIZ)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v2, v28

    .line 372
    .line 373
    :goto_7
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 374
    .line 375
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 376
    .line 377
    .line 378
    move-result-wide v5

    .line 379
    if-nez v3, :cond_f

    .line 380
    .line 381
    :goto_8
    move-object/from16 v3, v20

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :cond_f
    const-class v7, Lcom/google/android/gms/internal/ads/zzaiq;

    .line 385
    .line 386
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgrg;->zza()Lcom/google/android/gms/internal/ads/zzgrd;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgrd;)Lcom/google/android/gms/internal/ads/zzao;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    check-cast v7, Lcom/google/android/gms/internal/ads/zzaiq;

    .line 395
    .line 396
    if-nez v7, :cond_10

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_10
    const-class v8, Lcom/google/android/gms/internal/ads/zzais;

    .line 400
    .line 401
    sget-object v9, Lcom/google/android/gms/internal/ads/zzajo;->zza:Lcom/google/android/gms/internal/ads/zzajo;

    .line 402
    .line 403
    invoke-virtual {v3, v8, v9}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgrd;)Lcom/google/android/gms/internal/ads/zzao;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Lcom/google/android/gms/internal/ads/zzais;

    .line 408
    .line 409
    if-nez v3, :cond_11

    .line 410
    .line 411
    move-wide/from16 v8, v16

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_11
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzais;->zzb:Lcom/google/android/gms/internal/ads/zzguf;

    .line 415
    .line 416
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    check-cast v3, Ljava/lang/String;

    .line 421
    .line 422
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 423
    .line 424
    .line 425
    move-result-wide v8

    .line 426
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v8

    .line 430
    :goto_9
    invoke-static {v5, v6, v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzajm;->zzd(JLcom/google/android/gms/internal/ads/zzaiq;J)Lcom/google/android/gms/internal/ads/zzajm;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    :goto_a
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzr:Z

    .line 435
    .line 436
    if-eqz v5, :cond_12

    .line 437
    .line 438
    new-instance v2, Lcom/google/android/gms/internal/ads/zzajq;

    .line 439
    .line 440
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzajq;-><init>()V

    .line 441
    .line 442
    .line 443
    goto :goto_c

    .line 444
    :cond_12
    if-eqz v3, :cond_13

    .line 445
    .line 446
    move-object v2, v3

    .line 447
    goto :goto_b

    .line 448
    :cond_13
    if-nez v2, :cond_14

    .line 449
    .line 450
    move-object/from16 v2, v20

    .line 451
    .line 452
    :cond_14
    :goto_b
    if-nez v2, :cond_15

    .line 453
    .line 454
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 455
    .line 456
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    const/4 v5, 0x4

    .line 461
    invoke-interface {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    invoke-virtual {v13, v2}, Lcom/google/android/gms/internal/ads/zzafr;->zza(I)Z

    .line 472
    .line 473
    .line 474
    new-instance v5, Lcom/google/android/gms/internal/ads/zzajk;

    .line 475
    .line 476
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 477
    .line 478
    .line 479
    move-result-wide v6

    .line 480
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 481
    .line 482
    .line 483
    move-result-wide v8

    .line 484
    iget v10, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzf:I

    .line 485
    .line 486
    iget v11, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 487
    .line 488
    const/4 v12, 0x0

    .line 489
    invoke-direct/range {v5 .. v12}, Lcom/google/android/gms/internal/ads/zzajk;-><init>(JJIIZ)V

    .line 490
    .line 491
    .line 492
    move-object v2, v5

    .line 493
    :cond_15
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzh:Lcom/google/android/gms/internal/ads/zzagh;

    .line 494
    .line 495
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzafy;->zza()J

    .line 496
    .line 497
    .line 498
    move-result-wide v5

    .line 499
    invoke-interface {v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzagh;->zzN(J)V

    .line 500
    .line 501
    .line 502
    :goto_c
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 503
    .line 504
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzg:Lcom/google/android/gms/internal/ads/zzaex;

    .line 505
    .line 506
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 507
    .line 508
    .line 509
    new-instance v2, Lcom/google/android/gms/internal/ads/zzt;

    .line 510
    .line 511
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 512
    .line 513
    .line 514
    const-string v3, "audio/mpeg"

    .line 515
    .line 516
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 517
    .line 518
    .line 519
    iget-object v3, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzb:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 522
    .line 523
    .line 524
    const/16 v3, 0x1000

    .line 525
    .line 526
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzn(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 527
    .line 528
    .line 529
    iget v3, v13, Lcom/google/android/gms/internal/ads/zzafr;->zze:I

    .line 530
    .line 531
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzE(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 532
    .line 533
    .line 534
    iget v3, v13, Lcom/google/android/gms/internal/ads/zzafr;->zzd:I

    .line 535
    .line 536
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzF(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 537
    .line 538
    .line 539
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzd:Lcom/google/android/gms/internal/ads/zzafn;

    .line 540
    .line 541
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzafn;->zza:I

    .line 542
    .line 543
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzH(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 544
    .line 545
    .line 546
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzafn;->zzb:I

    .line 547
    .line 548
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 549
    .line 550
    .line 551
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 552
    .line 553
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 554
    .line 555
    .line 556
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 557
    .line 558
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzajr;->zzg()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    const v5, -0x7fffffff

    .line 563
    .line 564
    .line 565
    if-eq v3, v5, :cond_16

    .line 566
    .line 567
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 568
    .line 569
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzajr;->zzg()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzh(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 574
    .line 575
    .line 576
    :cond_16
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzi:Lcom/google/android/gms/internal/ads/zzagh;

    .line 577
    .line 578
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 583
    .line 584
    .line 585
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 586
    .line 587
    .line 588
    move-result-wide v2

    .line 589
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzn:J

    .line 590
    .line 591
    goto :goto_d

    .line 592
    :cond_17
    move/from16 v21, v3

    .line 593
    .line 594
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    const/16 v20, 0x0

    .line 600
    .line 601
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzn:J

    .line 602
    .line 603
    const-wide/16 v5, 0x0

    .line 604
    .line 605
    cmp-long v5, v2, v5

    .line 606
    .line 607
    if-eqz v5, :cond_18

    .line 608
    .line 609
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 610
    .line 611
    .line 612
    move-result-wide v5

    .line 613
    cmp-long v7, v5, v2

    .line 614
    .line 615
    if-gez v7, :cond_18

    .line 616
    .line 617
    sub-long/2addr v2, v5

    .line 618
    long-to-int v2, v2

    .line 619
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 620
    .line 621
    .line 622
    :cond_18
    :goto_d
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 623
    .line 624
    if-nez v2, :cond_1d

    .line 625
    .line 626
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 627
    .line 628
    .line 629
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajp;->zzl(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-eqz v2, :cond_19

    .line 634
    .line 635
    return v21

    .line 636
    :cond_19
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 637
    .line 638
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzj:I

    .line 646
    .line 647
    int-to-long v5, v3

    .line 648
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzajp;->zzn(IJ)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eqz v3, :cond_1a

    .line 653
    .line 654
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzafs;->zza(I)I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    move/from16 v5, v21

    .line 659
    .line 660
    if-ne v3, v5, :cond_1b

    .line 661
    .line 662
    :cond_1a
    const/4 v3, 0x1

    .line 663
    goto :goto_e

    .line 664
    :cond_1b
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    .line 665
    .line 666
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzafr;->zza(I)Z

    .line 667
    .line 668
    .line 669
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzl:J

    .line 670
    .line 671
    cmp-long v2, v5, v16

    .line 672
    .line 673
    if-nez v2, :cond_1c

    .line 674
    .line 675
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 676
    .line 677
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 678
    .line 679
    .line 680
    move-result-wide v5

    .line 681
    invoke-interface {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzajr;->zze(J)J

    .line 682
    .line 683
    .line 684
    move-result-wide v5

    .line 685
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzl:J

    .line 686
    .line 687
    :cond_1c
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 688
    .line 689
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 690
    .line 691
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 692
    .line 693
    .line 694
    move-result-wide v5

    .line 695
    int-to-long v7, v2

    .line 696
    add-long/2addr v5, v7

    .line 697
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzo:J

    .line 698
    .line 699
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 700
    .line 701
    instance-of v5, v5, Lcom/google/android/gms/internal/ads/zzajl;

    .line 702
    .line 703
    if-nez v5, :cond_1e

    .line 704
    .line 705
    :cond_1d
    const/4 v3, 0x1

    .line 706
    goto :goto_f

    .line 707
    :cond_1e
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 708
    .line 709
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzafr;->zzg:I

    .line 710
    .line 711
    int-to-long v3, v3

    .line 712
    add-long/2addr v1, v3

    .line 713
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajp;->zzj(J)J

    .line 714
    .line 715
    .line 716
    throw v20

    .line 717
    :goto_e
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 718
    .line 719
    .line 720
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzj:I

    .line 721
    .line 722
    return v4

    .line 723
    :goto_f
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzi:Lcom/google/android/gms/internal/ads/zzagh;

    .line 724
    .line 725
    invoke-interface {v5, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    const/4 v5, -0x1

    .line 730
    if-ne v1, v5, :cond_1f

    .line 731
    .line 732
    return v5

    .line 733
    :cond_1f
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 734
    .line 735
    sub-int/2addr v2, v1

    .line 736
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 737
    .line 738
    if-lez v2, :cond_20

    .line 739
    .line 740
    return v4

    .line 741
    :cond_20
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzi:Lcom/google/android/gms/internal/ads/zzagh;

    .line 742
    .line 743
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 744
    .line 745
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajp;->zzj(J)J

    .line 746
    .line 747
    .line 748
    move-result-wide v6

    .line 749
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    .line 750
    .line 751
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzafr;->zzc:I

    .line 752
    .line 753
    const/4 v10, 0x0

    .line 754
    const/4 v11, 0x0

    .line 755
    const/4 v8, 0x1

    .line 756
    invoke-interface/range {v5 .. v11}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 757
    .line 758
    .line 759
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 760
    .line 761
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzafr;->zzg:I

    .line 762
    .line 763
    int-to-long v5, v1

    .line 764
    add-long/2addr v2, v5

    .line 765
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 766
    .line 767
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 768
    .line 769
    return v4
.end method

.method private final zzj(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzl:J

    .line 4
    .line 5
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzafr;->zzd:I

    .line 6
    .line 7
    int-to-long v3, v0

    .line 8
    const-wide/32 v5, 0xf4240

    .line 9
    .line 10
    .line 11
    mul-long/2addr p1, v5

    .line 12
    div-long/2addr p1, v3

    .line 13
    add-long/2addr p1, v1

    .line 14
    return-wide p1
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzaev;Z)Z
    .locals 10

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    const/high16 v1, 0x20000

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zze:Lcom/google/android/gms/internal/ads/zzafp;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, p1, v3, v1}, Lcom/google/android/gms/internal/ads/zzafp;->zza(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzaij;I)Lcom/google/android/gms/internal/ads/zzap;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzd:Lcom/google/android/gms/internal/ads/zzafn;

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzafn;->zza(Lcom/google/android/gms/internal/ads/zzap;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    long-to-int v0, v3

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    move v3, v2

    .line 44
    :goto_0
    move v4, v3

    .line 45
    move v5, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v0, v2

    .line 48
    move v3, v0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajp;->zzl(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/4 v7, 0x1

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    if-lez v4, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajp;->zzm()V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ljava/io/EOFException;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 70
    .line 71
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    int-to-long v8, v3

    .line 81
    invoke-static {v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzajp;->zzn(IJ)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_6

    .line 86
    .line 87
    :cond_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzafs;->zza(I)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    const/4 v9, -0x1

    .line 92
    if-ne v8, v9, :cond_a

    .line 93
    .line 94
    :cond_6
    add-int/lit8 v3, v5, 0x1

    .line 95
    .line 96
    if-ne v5, v1, :cond_8

    .line 97
    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    return v2

    .line 101
    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajp;->zzm()V

    .line 102
    .line 103
    .line 104
    new-instance p1, Ljava/io/EOFException;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_8
    if-eqz p2, :cond_9

    .line 111
    .line 112
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 113
    .line 114
    .line 115
    add-int v4, v0, v3

    .line 116
    .line 117
    invoke-interface {p1, v4}, Lcom/google/android/gms/internal/ads/zzaev;->zzk(I)V

    .line 118
    .line 119
    .line 120
    :goto_2
    move v4, v2

    .line 121
    move v5, v3

    .line 122
    move v3, v4

    .line 123
    goto :goto_1

    .line 124
    :cond_9
    invoke-interface {p1, v7}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    if-ne v4, v7, :cond_b

    .line 131
    .line 132
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzc:Lcom/google/android/gms/internal/ads/zzafr;

    .line 133
    .line 134
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzafr;->zza(I)Z

    .line 135
    .line 136
    .line 137
    move v3, v6

    .line 138
    goto :goto_5

    .line 139
    :cond_b
    const/4 v6, 0x4

    .line 140
    if-ne v4, v6, :cond_d

    .line 141
    .line 142
    :goto_3
    if-eqz p2, :cond_c

    .line 143
    .line 144
    add-int/2addr v0, v5

    .line 145
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_c
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 150
    .line 151
    .line 152
    :goto_4
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzj:I

    .line 153
    .line 154
    return v7

    .line 155
    :cond_d
    :goto_5
    add-int/lit8 v8, v8, -0x4

    .line 156
    .line 157
    invoke-interface {p1, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzk(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_1
.end method

.method private final zzl(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzajr;->zzf()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, -0x4

    .line 21
    .line 22
    add-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v1

    .line 29
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v2, 0x4

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-interface {p1, v0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    return v3

    .line 45
    :catch_0
    return v1
.end method

.method private final zzm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzajk;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzafy;->zzb()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzo:J

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 22
    .line 23
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzajr;->zzf()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 32
    .line 33
    check-cast v0, Lcom/google/android/gms/internal/ads/zzajk;

    .line 34
    .line 35
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzo:J

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajk;->zzh(J)Lcom/google/android/gms/internal/ads/zzajk;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzg:Lcom/google/android/gms/internal/ads/zzaex;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzh:Lcom/google/android/gms/internal/ads/zzagh;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 59
    .line 60
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzafy;->zza()J

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method private static zzn(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzajp;->zzk(Lcom/google/android/gms/internal/ads/zzaev;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzg:Lcom/google/android/gms/internal/ads/zzaex;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzh:Lcom/google/android/gms/internal/ads/zzagh;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzi:Lcom/google/android/gms/internal/ads/zzagh;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzg:Lcom/google/android/gms/internal/ads/zzaex;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 4

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzh:Lcom/google/android/gms/internal/ads/zzagh;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajp;->zzi(Lcom/google/android/gms/internal/ads/zzaev;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, -0x1

    .line 13
    if-ne p1, p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 16
    .line 17
    instance-of p2, p2, Lcom/google/android/gms/internal/ads/zzajl;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 22
    .line 23
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzajp;->zzj(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 28
    .line 29
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzafy;->zza()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    cmp-long p2, v2, v0

    .line 34
    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 39
    .line 40
    check-cast p1, Lcom/google/android/gms/internal/ads/zzajl;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    return p1
.end method

.method public final zze(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzj:I

    .line 3
    .line 4
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzl:J

    .line 10
    .line 11
    const-wide/16 p2, 0x0

    .line 12
    .line 13
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzm:J

    .line 14
    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzp:I

    .line 16
    .line 17
    const-wide/16 p1, -0x1

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzo:J

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzq:Lcom/google/android/gms/internal/ads/zzajr;

    .line 22
    .line 23
    instance-of p1, p1, Lcom/google/android/gms/internal/ads/zzajl;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    throw p1
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final zzh()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajp;->zzr:Z

    return-void
.end method
