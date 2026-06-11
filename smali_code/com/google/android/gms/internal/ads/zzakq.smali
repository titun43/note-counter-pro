.class final Lcom/google/android/gms/internal/ads/zzakq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs zza(ILcom/google/android/gms/internal/ads/zzap;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzap;[Lcom/google/android/gms/internal/ads/zzap;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    new-instance p3, Lcom/google/android/gms/internal/ads/zzap;

    .line 5
    .line 6
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    new-array v3, v0, [Lcom/google/android/gms/internal/ads/zzao;

    .line 12
    .line 13
    invoke-direct {p3, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p1, :cond_3

    .line 17
    .line 18
    const-class v1, Lcom/google/android/gms/internal/ads/zzfs;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzap;->zzd(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move v2, v0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_3

    .line 30
    .line 31
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfs;

    .line 36
    .line 37
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzfs;->zza:Ljava/lang/String;

    .line 38
    .line 39
    const-string v5, "com.android.capture.fps"

    .line 40
    .line 41
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    if-ne p0, v4, :cond_2

    .line 49
    .line 50
    :cond_1
    const/4 v4, 0x1

    .line 51
    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zzao;

    .line 52
    .line 53
    aput-object v3, v4, v0

    .line 54
    .line 55
    invoke-virtual {p3, v4}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    array-length p0, p4

    .line 63
    :goto_1
    if-ge v0, p0, :cond_4

    .line 64
    .line 65
    aget-object p1, p4, v0

    .line 66
    .line 67
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzap;->zza()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-lez p0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void
.end method

.method public static zzb(ILcom/google/android/gms/internal/ads/zzafn;Lcom/google/android/gms/internal/ads/zzt;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzafn;->zzb()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzafn;->zza:I

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzt;->zzH(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 13
    .line 14
    .line 15
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzafn;->zzb:I

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzao;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    shr-int/lit8 v2, v0, 0x18

    .line 15
    .line 16
    and-int/lit16 v2, v2, 0xff

    .line 17
    .line 18
    const-string v3, "Skipped unknown metadata entry: "

    .line 19
    .line 20
    const/16 v4, 0xa9

    .line 21
    .line 22
    const v5, 0xffffff

    .line 23
    .line 24
    .line 25
    const-string v6, "TCON"

    .line 26
    .line 27
    const v7, 0x64617461

    .line 28
    .line 29
    .line 30
    const/4 v8, 0x1

    .line 31
    const-string v9, "MetadataUtil"

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    if-eq v2, v4, :cond_1c

    .line 36
    .line 37
    const/16 v4, 0xfd

    .line 38
    .line 39
    if-ne v2, v4, :cond_0

    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    const v2, 0x676e7265

    .line 44
    .line 45
    .line 46
    const/4 v4, -0x1

    .line 47
    if-ne v0, v2, :cond_2

    .line 48
    .line 49
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzf(Lcom/google/android/gms/internal/ads/zzer;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/2addr v0, v4

    .line 54
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaio;->zza(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    new-instance v2, Lcom/google/android/gms/internal/ads/zzais;

    .line 61
    .line 62
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {v2, v6, v11, v0}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    move-object v11, v2

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_1
    const-string v0, "Failed to parse standard genre code"

    .line 76
    .line 77
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_6

    .line 81
    .line 82
    :cond_2
    const v2, 0x6469736b

    .line 83
    .line 84
    .line 85
    if-ne v0, v2, :cond_3

    .line 86
    .line 87
    const-string v0, "TPOS"

    .line 88
    .line 89
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_3
    const v2, 0x74726b6e

    .line 96
    .line 97
    .line 98
    if-ne v0, v2, :cond_4

    .line 99
    .line 100
    const-string v0, "TRCK"

    .line 101
    .line 102
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_4
    const v2, 0x746d706f

    .line 109
    .line 110
    .line 111
    if-ne v0, v2, :cond_5

    .line 112
    .line 113
    const-string v0, "TBPM"

    .line 114
    .line 115
    invoke-static {v2, v0, p0, v8, v10}, Lcom/google/android/gms/internal/ads/zzakq;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    goto/16 :goto_6

    .line 120
    .line 121
    :cond_5
    const v2, 0x6370696c

    .line 122
    .line 123
    .line 124
    if-ne v0, v2, :cond_6

    .line 125
    .line 126
    const-string v0, "TCMP"

    .line 127
    .line 128
    invoke-static {v2, v0, p0, v8, v8}, Lcom/google/android/gms/internal/ads/zzakq;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :cond_6
    const v2, 0x636f7672

    .line 135
    .line 136
    .line 137
    const/4 v6, 0x4

    .line 138
    if-ne v0, v2, :cond_b

    .line 139
    .line 140
    const-string v0, "Unrecognized cover art flags: "

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-ne v3, v7, :cond_a

    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    sget v4, Lcom/google/android/gms/internal/ads/zzakh;->zza:I

    .line 157
    .line 158
    and-int/2addr v3, v5

    .line 159
    const/16 v4, 0xd

    .line 160
    .line 161
    if-ne v3, v4, :cond_7

    .line 162
    .line 163
    const-string v4, "image/jpeg"

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    const/16 v4, 0xe

    .line 167
    .line 168
    if-ne v3, v4, :cond_8

    .line 169
    .line 170
    const-string v3, "image/png"

    .line 171
    .line 172
    move v14, v4

    .line 173
    move-object v4, v3

    .line 174
    move v3, v14

    .line 175
    goto :goto_1

    .line 176
    :cond_8
    move-object v4, v11

    .line 177
    :goto_1
    if-nez v4, :cond_9

    .line 178
    .line 179
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    add-int/lit8 v2, v2, 0x1e

    .line 188
    .line 189
    new-instance v4, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_9
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v2, v2, -0x10

    .line 213
    .line 214
    new-array v0, v2, [B

    .line 215
    .line 216
    invoke-virtual {p0, v0, v10, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 217
    .line 218
    .line 219
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaid;

    .line 220
    .line 221
    const/4 v3, 0x3

    .line 222
    invoke-direct {v2, v4, v11, v3, v0}, Lcom/google/android/gms/internal/ads/zzaid;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_a
    const-string v0, "Failed to parse cover art attribute"

    .line 228
    .line 229
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_6

    .line 233
    .line 234
    :cond_b
    const v2, 0x61415254

    .line 235
    .line 236
    .line 237
    if-ne v0, v2, :cond_c

    .line 238
    .line 239
    const-string v0, "TPE2"

    .line 240
    .line 241
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    goto/16 :goto_6

    .line 246
    .line 247
    :cond_c
    const v2, 0x736f6e6d

    .line 248
    .line 249
    .line 250
    if-ne v0, v2, :cond_d

    .line 251
    .line 252
    const-string v0, "TSOT"

    .line 253
    .line 254
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    goto/16 :goto_6

    .line 259
    .line 260
    :cond_d
    const v2, 0x736f616c

    .line 261
    .line 262
    .line 263
    if-ne v0, v2, :cond_e

    .line 264
    .line 265
    const-string v0, "TSOA"

    .line 266
    .line 267
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_e
    const v2, 0x736f6172

    .line 274
    .line 275
    .line 276
    if-ne v0, v2, :cond_f

    .line 277
    .line 278
    const-string v0, "TSOP"

    .line 279
    .line 280
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    goto/16 :goto_6

    .line 285
    .line 286
    :cond_f
    const v2, 0x736f6161

    .line 287
    .line 288
    .line 289
    if-ne v0, v2, :cond_10

    .line 290
    .line 291
    const-string v0, "TSO2"

    .line 292
    .line 293
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    goto/16 :goto_6

    .line 298
    .line 299
    :cond_10
    const v2, 0x736f636f

    .line 300
    .line 301
    .line 302
    if-ne v0, v2, :cond_11

    .line 303
    .line 304
    const-string v0, "TSOC"

    .line 305
    .line 306
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    goto/16 :goto_6

    .line 311
    .line 312
    :cond_11
    const v2, 0x72746e67

    .line 313
    .line 314
    .line 315
    if-ne v0, v2, :cond_12

    .line 316
    .line 317
    const-string v0, "ITUNESADVISORY"

    .line 318
    .line 319
    invoke-static {v2, v0, p0, v10, v10}, Lcom/google/android/gms/internal/ads/zzakq;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    goto/16 :goto_6

    .line 324
    .line 325
    :cond_12
    const v2, 0x70676170

    .line 326
    .line 327
    .line 328
    if-ne v0, v2, :cond_13

    .line 329
    .line 330
    const-string v0, "ITUNESGAPLESS"

    .line 331
    .line 332
    invoke-static {v2, v0, p0, v10, v8}, Lcom/google/android/gms/internal/ads/zzakq;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    goto/16 :goto_6

    .line 337
    .line 338
    :cond_13
    const v2, 0x736f736e

    .line 339
    .line 340
    .line 341
    if-ne v0, v2, :cond_14

    .line 342
    .line 343
    const-string v0, "TVSHOWSORT"

    .line 344
    .line 345
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    goto/16 :goto_6

    .line 350
    .line 351
    :cond_14
    const v2, 0x74767368

    .line 352
    .line 353
    .line 354
    if-ne v0, v2, :cond_15

    .line 355
    .line 356
    const-string v0, "TVSHOW"

    .line 357
    .line 358
    invoke-static {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    goto/16 :goto_6

    .line 363
    .line 364
    :cond_15
    const v2, 0x2d2d2d2d

    .line 365
    .line 366
    .line 367
    if-ne v0, v2, :cond_29

    .line 368
    .line 369
    move v3, v4

    .line 370
    move v5, v3

    .line 371
    move-object v0, v11

    .line 372
    move-object v2, v0

    .line 373
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 374
    .line 375
    .line 376
    move-result v8

    .line 377
    if-ge v8, v1, :cond_1a

    .line 378
    .line 379
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-virtual {p0, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 392
    .line 393
    .line 394
    const v12, 0x6d65616e

    .line 395
    .line 396
    .line 397
    if-ne v10, v12, :cond_16

    .line 398
    .line 399
    add-int/lit8 v9, v9, -0xc

    .line 400
    .line 401
    invoke-virtual {p0, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzL(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    goto :goto_2

    .line 406
    :cond_16
    add-int/lit8 v12, v9, -0xc

    .line 407
    .line 408
    const v13, 0x6e616d65

    .line 409
    .line 410
    .line 411
    if-ne v10, v13, :cond_17

    .line 412
    .line 413
    invoke-virtual {p0, v12}, Lcom/google/android/gms/internal/ads/zzer;->zzL(I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    goto :goto_2

    .line 418
    :cond_17
    if-ne v10, v7, :cond_18

    .line 419
    .line 420
    move v5, v9

    .line 421
    :cond_18
    if-ne v10, v7, :cond_19

    .line 422
    .line 423
    move v3, v8

    .line 424
    :cond_19
    invoke-virtual {p0, v12}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 425
    .line 426
    .line 427
    goto :goto_2

    .line 428
    :cond_1a
    if-eqz v0, :cond_2c

    .line 429
    .line 430
    if-eqz v2, :cond_2c

    .line 431
    .line 432
    if-ne v3, v4, :cond_1b

    .line 433
    .line 434
    goto/16 :goto_6

    .line 435
    .line 436
    :cond_1b
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 437
    .line 438
    .line 439
    const/16 v3, 0x10

    .line 440
    .line 441
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 442
    .line 443
    .line 444
    add-int/lit8 v5, v5, -0x10

    .line 445
    .line 446
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzL(I)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    new-instance v11, Lcom/google/android/gms/internal/ads/zzaip;

    .line 451
    .line 452
    invoke-direct {v11, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzaip;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_6

    .line 456
    .line 457
    :cond_1c
    :goto_3
    and-int v2, v0, v5

    .line 458
    .line 459
    const v4, 0x636d74

    .line 460
    .line 461
    .line 462
    if-ne v2, v4, :cond_1e

    .line 463
    .line 464
    const-string v2, "Failed to parse comment attribute: "

    .line 465
    .line 466
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    if-ne v4, v7, :cond_1d

    .line 475
    .line 476
    const/16 v0, 0x8

    .line 477
    .line 478
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 479
    .line 480
    .line 481
    add-int/lit8 v3, v3, -0x10

    .line 482
    .line 483
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzL(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    new-instance v11, Lcom/google/android/gms/internal/ads/zzaih;

    .line 488
    .line 489
    const-string v2, "und"

    .line 490
    .line 491
    invoke-direct {v11, v2, v0, v0}, Lcom/google/android/gms/internal/ads/zzaih;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_6

    .line 495
    .line 496
    :cond_1d
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfw;->zze(I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    goto/16 :goto_6

    .line 508
    .line 509
    :cond_1e
    const v4, 0x6e616d

    .line 510
    .line 511
    .line 512
    if-eq v2, v4, :cond_2b

    .line 513
    .line 514
    const v4, 0x74726b

    .line 515
    .line 516
    .line 517
    if-ne v2, v4, :cond_1f

    .line 518
    .line 519
    goto/16 :goto_5

    .line 520
    .line 521
    :cond_1f
    const v4, 0x636f6d

    .line 522
    .line 523
    .line 524
    if-eq v2, v4, :cond_2a

    .line 525
    .line 526
    const v4, 0x777274

    .line 527
    .line 528
    .line 529
    if-ne v2, v4, :cond_20

    .line 530
    .line 531
    goto/16 :goto_4

    .line 532
    .line 533
    :cond_20
    const v4, 0x646179

    .line 534
    .line 535
    .line 536
    if-ne v2, v4, :cond_21

    .line 537
    .line 538
    const-string v2, "TDRC"

    .line 539
    .line 540
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 541
    .line 542
    .line 543
    move-result-object v11

    .line 544
    goto/16 :goto_6

    .line 545
    .line 546
    :cond_21
    const v4, 0x415254

    .line 547
    .line 548
    .line 549
    if-ne v2, v4, :cond_22

    .line 550
    .line 551
    const-string v2, "TPE1"

    .line 552
    .line 553
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 554
    .line 555
    .line 556
    move-result-object v11

    .line 557
    goto/16 :goto_6

    .line 558
    .line 559
    :cond_22
    const v4, 0x746f6f

    .line 560
    .line 561
    .line 562
    if-ne v2, v4, :cond_23

    .line 563
    .line 564
    const-string v2, "TSSE"

    .line 565
    .line 566
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    goto/16 :goto_6

    .line 571
    .line 572
    :cond_23
    const v4, 0x616c62

    .line 573
    .line 574
    .line 575
    if-ne v2, v4, :cond_24

    .line 576
    .line 577
    const-string v2, "TALB"

    .line 578
    .line 579
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 580
    .line 581
    .line 582
    move-result-object v11

    .line 583
    goto :goto_6

    .line 584
    :cond_24
    const v4, 0x6c7972

    .line 585
    .line 586
    .line 587
    if-ne v2, v4, :cond_25

    .line 588
    .line 589
    const-string v2, "USLT"

    .line 590
    .line 591
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    goto :goto_6

    .line 596
    :cond_25
    const v4, 0x67656e

    .line 597
    .line 598
    .line 599
    if-ne v2, v4, :cond_26

    .line 600
    .line 601
    invoke-static {v0, v6, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    goto :goto_6

    .line 606
    :cond_26
    const v4, 0x677270

    .line 607
    .line 608
    .line 609
    if-ne v2, v4, :cond_27

    .line 610
    .line 611
    const-string v2, "TIT1"

    .line 612
    .line 613
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 614
    .line 615
    .line 616
    move-result-object v11

    .line 617
    goto :goto_6

    .line 618
    :cond_27
    const v4, 0x6d766e

    .line 619
    .line 620
    .line 621
    if-ne v2, v4, :cond_28

    .line 622
    .line 623
    const-string v2, "MVNM"

    .line 624
    .line 625
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 626
    .line 627
    .line 628
    move-result-object v11

    .line 629
    goto :goto_6

    .line 630
    :cond_28
    const v4, 0x6d7669

    .line 631
    .line 632
    .line 633
    if-ne v2, v4, :cond_29

    .line 634
    .line 635
    const-string v2, "MVIN"

    .line 636
    .line 637
    invoke-static {v0, v2, p0, v8, v10}, Lcom/google/android/gms/internal/ads/zzakq;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;

    .line 638
    .line 639
    .line 640
    move-result-object v11

    .line 641
    goto :goto_6

    .line 642
    :cond_29
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfw;->zze(I)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    add-int/lit8 v2, v2, 0x20

    .line 651
    .line 652
    new-instance v4, Ljava/lang/StringBuilder;

    .line 653
    .line 654
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzee;->zza(Ljava/lang/String;Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto :goto_6

    .line 671
    :cond_2a
    :goto_4
    const-string v2, "TCOM"

    .line 672
    .line 673
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 674
    .line 675
    .line 676
    move-result-object v11

    .line 677
    goto :goto_6

    .line 678
    :cond_2b
    :goto_5
    const-string v2, "TIT2"

    .line 679
    .line 680
    invoke-static {v0, v2, p0}, Lcom/google/android/gms/internal/ads/zzakq;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;

    .line 681
    .line 682
    .line 683
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 684
    :cond_2c
    :goto_6
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 685
    .line 686
    .line 687
    return-object v11

    .line 688
    :goto_7
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 689
    .line 690
    .line 691
    throw v0
.end method

.method private static zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x10

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzL(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p2, Lcom/google/android/gms/internal/ads/zzais;

    .line 27
    .line 28
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p2, p1, v3, p0}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfw;->zze(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "Failed to parse text attribute: "

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "MetadataUtil"

    .line 47
    .line 48
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3
.end method

.method private static zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;ZZ)Lcom/google/android/gms/internal/ads/zzain;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzakq;->zzf(Lcom/google/android/gms/internal/ads/zzer;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :cond_0
    const/4 p4, 0x0

    .line 13
    if-ltz p2, :cond_2

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    new-instance p0, Lcom/google/android/gms/internal/ads/zzais;

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, p4, p2}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/ads/zzaih;

    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string p3, "und"

    .line 38
    .line 39
    invoke-direct {p0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzaih;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfw;->zze(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "Failed to parse uint8 attribute: "

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "MetadataUtil"

    .line 54
    .line 55
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p4
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzer;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzn()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_0
    const-string p0, "MetadataUtil"

    .line 63
    .line 64
    const-string v0, "Failed to parse data atom to int"

    .line 65
    .line 66
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, -0x1

    .line 70
    return p0
.end method

.method private static zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzais;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-lez p2, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    add-int/2addr v0, v1

    .line 73
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, "/"

    .line 80
    .line 81
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/ads/zzais;

    .line 92
    .line 93
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-direct {p2, p1, v3, p0}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfw;->zze(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "Failed to parse index/count attribute: "

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "MetadataUtil"

    .line 112
    .line 113
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v3
.end method
