.class final Lcom/google/android/gms/internal/ads/zzrl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzrk;

.field private final zzb:I

.field private final zzc:Lcom/google/android/gms/internal/ads/zzsj;

.field private zzd:I

.field private zze:J

.field private zzf:J

.field private zzg:J

.field private zzh:J

.field private zzi:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzsj;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzrk;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzrk;-><init>(Landroid/media/AudioTrack;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zza:Lcom/google/android/gms/internal/ads/zzrk;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzb:I

    .line 16
    .line 17
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzc:Lcom/google/android/gms/internal/ads/zzsj;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final zzf(I)V
    .locals 6

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzd:I

    .line 2
    .line 3
    const-wide/16 v0, 0x2710

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const-wide/32 v0, 0x7a120

    .line 17
    .line 18
    .line 19
    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzf:J

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-wide/32 v0, 0x989680

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzf:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzg:J

    .line 32
    .line 33
    const-wide/16 v2, -0x1

    .line 34
    .line 35
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzh:J

    .line 36
    .line 37
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzi:J

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    const-wide/16 v4, 0x3e8

    .line 49
    .line 50
    div-long/2addr v2, v4

    .line 51
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzrl;->zze:J

    .line 52
    .line 53
    goto :goto_0
.end method

.method private final zzg(JF)J
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zza:Lcom/google/android/gms/internal/ads/zzrk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-object v1, p0

    .line 12
    move-wide v6, p1

    .line 13
    move v8, p3

    .line 14
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzrl;->zzh(JJJF)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method

.method private final zzh(JJJF)J
    .locals 0

    .line 1
    sub-long/2addr p5, p3

    .line 2
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzb:I

    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    invoke-static {p5, p6, p7}, Lcom/google/android/gms/internal/ads/zzfj;->zzv(JF)J

    .line 9
    .line 10
    .line 11
    move-result-wide p3

    .line 12
    add-long/2addr p3, p1

    .line 13
    return-wide p3
.end method


# virtual methods
.method public final zza(JFJ)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v1, p4

    .line 6
    .line 7
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzg:J

    .line 8
    .line 9
    sub-long v3, v5, v3

    .line 10
    .line 11
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzf:J

    .line 12
    .line 13
    cmp-long v3, v3, v7

    .line 14
    .line 15
    if-gez v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzg:J

    .line 20
    .line 21
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzrl;->zza:Lcom/google/android/gms/internal/ads/zzrk;

    .line 22
    .line 23
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zza()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()J

    .line 30
    .line 31
    .line 32
    move-result-wide v10

    .line 33
    invoke-direct/range {p0 .. p3}, Lcom/google/android/gms/internal/ads/zzrl;->zzg(JF)J

    .line 34
    .line 35
    .line 36
    move-result-wide v12

    .line 37
    sub-long v14, v10, v5

    .line 38
    .line 39
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v14

    .line 43
    const-wide/32 v16, 0x4c4b40

    .line 44
    .line 45
    .line 46
    cmp-long v7, v14, v16

    .line 47
    .line 48
    const-string v14, "AudioTrackAudioOutput"

    .line 49
    .line 50
    const-string v15, ", "

    .line 51
    .line 52
    const/16 v18, 0x2

    .line 53
    .line 54
    const/4 v9, 0x4

    .line 55
    if-lez v7, :cond_1

    .line 56
    .line 57
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzc:Lcom/google/android/gms/internal/ads/zzsj;

    .line 58
    .line 59
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 60
    .line 61
    .line 62
    move-result-wide v12

    .line 63
    check-cast v7, Lcom/google/android/gms/internal/ads/zzrw;

    .line 64
    .line 65
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzrw;->zza:Lcom/google/android/gms/internal/ads/zzsd;

    .line 66
    .line 67
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzsd;->zzq()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v16

    .line 87
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v17

    .line 95
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v19

    .line 99
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v19

    .line 103
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v20

    .line 107
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v20

    .line 111
    add-int/lit8 v7, v7, 0x34

    .line 112
    .line 113
    add-int v7, v7, v16

    .line 114
    .line 115
    add-int/lit8 v7, v7, 0x2

    .line 116
    .line 117
    add-int v7, v7, v17

    .line 118
    .line 119
    add-int/lit8 v7, v7, 0x2

    .line 120
    .line 121
    add-int v7, v7, v19

    .line 122
    .line 123
    add-int/lit8 v7, v7, 0x2

    .line 124
    .line 125
    new-instance v6, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    add-int v7, v7, v20

    .line 128
    .line 129
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 130
    .line 131
    .line 132
    const-string v7, "Spurious audio timestamp (system clock mismatch): "

    .line 133
    .line 134
    invoke-static {v6, v7, v12, v13, v15}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    move-wide/from16 v10, p1

    .line 141
    .line 142
    invoke-static {v6, v15, v10, v11, v15}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 162
    .line 163
    .line 164
    move/from16 v20, v3

    .line 165
    .line 166
    move-wide v4, v10

    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_1
    move-wide v4, v5

    .line 170
    sub-long/2addr v12, v1

    .line 171
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    cmp-long v6, v6, v16

    .line 176
    .line 177
    if-lez v6, :cond_2

    .line 178
    .line 179
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzc:Lcom/google/android/gms/internal/ads/zzsj;

    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 182
    .line 183
    .line 184
    move-result-wide v12

    .line 185
    check-cast v6, Lcom/google/android/gms/internal/ads/zzrw;

    .line 186
    .line 187
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzrw;->zza:Lcom/google/android/gms/internal/ads/zzsd;

    .line 188
    .line 189
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzsd;->zzq()J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v17

    .line 205
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v17

    .line 209
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v20

    .line 213
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v20

    .line 217
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v21

    .line 221
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v21

    .line 225
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v22

    .line 229
    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    .line 230
    .line 231
    .line 232
    move-result v22

    .line 233
    add-int/lit8 v16, v16, 0x36

    .line 234
    .line 235
    add-int v16, v16, v17

    .line 236
    .line 237
    add-int/lit8 v16, v16, 0x2

    .line 238
    .line 239
    add-int v16, v16, v20

    .line 240
    .line 241
    add-int/lit8 v16, v16, 0x2

    .line 242
    .line 243
    add-int v16, v16, v21

    .line 244
    .line 245
    add-int/lit8 v16, v16, 0x2

    .line 246
    .line 247
    new-instance v9, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    move/from16 v20, v3

    .line 250
    .line 251
    add-int v3, v16, v22

    .line 252
    .line 253
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 254
    .line 255
    .line 256
    const-string v3, "Spurious audio timestamp (frame position mismatch): "

    .line 257
    .line 258
    invoke-static {v9, v3, v12, v13, v15}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-static {v9, v15, v4, v5, v15}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    const/4 v1, 0x4

    .line 284
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 285
    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_2
    move/from16 v20, v3

    .line 289
    .line 290
    move v1, v9

    .line 291
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzd:I

    .line 292
    .line 293
    if-ne v2, v1, :cond_4

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 297
    .line 298
    .line 299
    goto :goto_0

    .line 300
    :cond_3
    move/from16 v20, v3

    .line 301
    .line 302
    move-wide v4, v5

    .line 303
    const/16 v18, 0x2

    .line 304
    .line 305
    :cond_4
    :goto_0
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzd:I

    .line 306
    .line 307
    const/4 v2, 0x1

    .line 308
    const/4 v9, 0x3

    .line 309
    if-eqz v1, :cond_c

    .line 310
    .line 311
    if-eq v1, v2, :cond_7

    .line 312
    .line 313
    move/from16 v2, v18

    .line 314
    .line 315
    if-eq v1, v2, :cond_6

    .line 316
    .line 317
    if-eq v1, v9, :cond_5

    .line 318
    .line 319
    goto/16 :goto_2

    .line 320
    .line 321
    :cond_5
    if-eqz v20, :cond_e

    .line 322
    .line 323
    const/4 v6, 0x0

    .line 324
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :cond_6
    const/4 v6, 0x0

    .line 329
    if-nez v20, :cond_e

    .line 330
    .line 331
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_7
    if-eqz v20, :cond_b

    .line 336
    .line 337
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 338
    .line 339
    .line 340
    move-result-wide v1

    .line 341
    move-wide v6, v1

    .line 342
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzh:J

    .line 343
    .line 344
    cmp-long v3, v6, v1

    .line 345
    .line 346
    if-gtz v3, :cond_8

    .line 347
    .line 348
    goto :goto_1

    .line 349
    :cond_8
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzi:J

    .line 350
    .line 351
    move-wide/from16 v5, p1

    .line 352
    .line 353
    move/from16 v7, p3

    .line 354
    .line 355
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzrl;->zzh(JJJF)J

    .line 356
    .line 357
    .line 358
    move-result-wide v1

    .line 359
    invoke-direct/range {p0 .. p3}, Lcom/google/android/gms/internal/ads/zzrl;->zzg(JF)J

    .line 360
    .line 361
    .line 362
    move-result-wide v3

    .line 363
    sub-long/2addr v3, v1

    .line 364
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 365
    .line 366
    .line 367
    move-result-wide v1

    .line 368
    const-wide/16 v3, 0x3e8

    .line 369
    .line 370
    cmp-long v1, v1, v3

    .line 371
    .line 372
    if-gez v1, :cond_9

    .line 373
    .line 374
    const/4 v2, 0x2

    .line 375
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :cond_9
    :goto_1
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zze:J

    .line 380
    .line 381
    sub-long v1, p1, v1

    .line 382
    .line 383
    const-wide/32 v3, 0x1e8480

    .line 384
    .line 385
    .line 386
    cmp-long v1, v1, v3

    .line 387
    .line 388
    if-lez v1, :cond_a

    .line 389
    .line 390
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 395
    .line 396
    .line 397
    move-result-wide v1

    .line 398
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzh:J

    .line 399
    .line 400
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()J

    .line 401
    .line 402
    .line 403
    move-result-wide v1

    .line 404
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzi:J

    .line 405
    .line 406
    return-void

    .line 407
    :cond_b
    const/4 v6, 0x0

    .line 408
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_c
    if-eqz v20, :cond_d

    .line 413
    .line 414
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()J

    .line 415
    .line 416
    .line 417
    move-result-wide v3

    .line 418
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzrl;->zze:J

    .line 419
    .line 420
    cmp-long v1, v3, v5

    .line 421
    .line 422
    if-ltz v1, :cond_e

    .line 423
    .line 424
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzc()J

    .line 425
    .line 426
    .line 427
    move-result-wide v3

    .line 428
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzh:J

    .line 429
    .line 430
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzrk;->zzb()J

    .line 431
    .line 432
    .line 433
    move-result-wide v3

    .line 434
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzrl;->zzi:J

    .line 435
    .line 436
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :cond_d
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzrl;->zze:J

    .line 441
    .line 442
    sub-long v1, p1, v1

    .line 443
    .line 444
    const-wide/32 v3, 0x7a120

    .line 445
    .line 446
    .line 447
    cmp-long v1, v1, v3

    .line 448
    .line 449
    if-lez v1, :cond_e

    .line 450
    .line 451
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 452
    .line 453
    .line 454
    :cond_e
    :goto_2
    return-void
.end method

.method public final zzb()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzd:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrl;->zzd:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final zzd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzrl;->zzf(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final zze(JF)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzrl;->zzg(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method
