.class public final Lcom/google/android/gms/internal/ads/zzeha;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfmu;


# instance fields
.field protected final zza:Landroid/content/Context;

.field protected final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcac;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeha;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeha;->zzb:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeha;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzegy;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeha;->zzb(Lcom/google/android/gms/internal/ads/zzegy;)Lcom/google/android/gms/internal/ads/zzegz;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzegy;)Lcom/google/android/gms/internal/ads/zzegz;
    .locals 8

    .line 1
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzegy;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzegy;->zzb:I

    .line 4
    .line 5
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzegy;->zzc:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzegy;->zzd:[B

    .line 8
    .line 9
    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzegy;->zze:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lx2/c;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    move-object v0, p0

    .line 25
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzeha;->zzc(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;J)Lcom/google/android/gms/internal/ads/zzegz;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public final zzc(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;J)Lcom/google/android/gms/internal/ads/zzegz;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "AdRequestServiceImpl: Sending request: "

    .line 8
    .line 9
    const-string v4, "SDK version: "

    .line 10
    .line 11
    const-string v5, "Received error HTTP response code: "

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    :try_start_0
    new-instance v7, Lcom/google/android/gms/internal/ads/zzegz;

    .line 15
    .line 16
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzegz;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzcZ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 20
    .line 21
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    check-cast v8, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zze()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    const/16 v0, 0x19a

    .line 44
    .line 45
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzegz;->zza:I

    .line 46
    .line 47
    return-object v7

    .line 48
    :catch_0
    move-exception v0

    .line 49
    goto/16 :goto_10

    .line 50
    .line 51
    :cond_0
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzeha;->zzb:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    add-int/lit8 v8, v8, 0xd

    .line 62
    .line 63
    new-instance v9, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget v8, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 79
    .line 80
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzh(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    add-int/lit8 v4, v4, 0x27

    .line 92
    .line 93
    new-instance v8, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Ljava/net/URL;

    .line 112
    .line 113
    invoke-direct {v3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 119
    .line 120
    .line 121
    const/4 v15, 0x0

    .line 122
    move/from16 v16, v15

    .line 123
    .line 124
    :goto_0
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    move-object v12, v0

    .line 129
    check-cast v12, Ljava/net/HttpURLConnection;

    .line 130
    .line 131
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeha;->zzc:Ljava/lang/String;

    .line 132
    .line 133
    if-eqz v0, :cond_1

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    .line 138
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzeha;->zza:Landroid/content/Context;

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v13, 0x0

    .line 146
    move/from16 v14, p2

    .line 147
    .line 148
    invoke-virtual/range {v8 .. v14}, Lcom/google/android/gms/ads/internal/util/zzs;->zzb(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;ZI)V

    .line 149
    .line 150
    .line 151
    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_2

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Ljava/util/Map$Entry;

    .line 170
    .line 171
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    check-cast v8, Ljava/lang/String;

    .line 176
    .line 177
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v12, v8, v3}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :catchall_0
    move-exception v0

    .line 188
    goto/16 :goto_f

    .line 189
    .line 190
    :catch_1
    move-exception v0

    .line 191
    goto/16 :goto_d

    .line 192
    .line 193
    :cond_2
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-nez v0, :cond_3

    .line 198
    .line 199
    const-string v0, "Content-Type"

    .line 200
    .line 201
    move-object/from16 v3, p5

    .line 202
    .line 203
    invoke-virtual {v12, v0, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_3
    move-object/from16 v3, p5

    .line 208
    .line 209
    :goto_2
    new-instance v8, Lcom/google/android/gms/ads/internal/util/client/zzl;

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    invoke-direct {v8, v9}, Lcom/google/android/gms/ads/internal/util/client/zzl;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 213
    .line 214
    .line 215
    :try_start_2
    invoke-virtual {v8, v12, v2}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zza(Ljava/net/HttpURLConnection;[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    :try_start_3
    const-string v11, "Network request logging failed."

    .line 221
    .line 222
    invoke-static {v11, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    const-string v13, "HttpRequestFunction.logAdRequest"

    .line 230
    .line 231
    invoke-virtual {v11, v0, v13}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    array-length v0, v2

    .line 235
    if-lez v0, :cond_4

    .line 236
    .line 237
    invoke-virtual {v12, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 241
    .line 242
    .line 243
    :try_start_4
    new-instance v11, Ljava/io/BufferedOutputStream;

    .line 244
    .line 245
    invoke-virtual {v12}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-direct {v11, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 250
    .line 251
    .line 252
    :try_start_5
    invoke-virtual {v11, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 253
    .line 254
    .line 255
    :try_start_6
    invoke-static {v11}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :catchall_2
    move-exception v0

    .line 260
    move-object v9, v11

    .line 261
    goto :goto_4

    .line 262
    :catchall_3
    move-exception v0

    .line 263
    :goto_4
    invoke-static {v9}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 264
    .line 265
    .line 266
    throw v0

    .line 267
    :cond_4
    :goto_5
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-virtual {v12}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    if-eqz v13, :cond_6

    .line 288
    .line 289
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    check-cast v13, Ljava/util/Map$Entry;

    .line 294
    .line 295
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v14

    .line 299
    check-cast v14, Ljava/lang/String;

    .line 300
    .line 301
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    check-cast v13, Ljava/util/List;

    .line 306
    .line 307
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v17

    .line 311
    if-eqz v17, :cond_5

    .line 312
    .line 313
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    check-cast v14, Ljava/util/List;

    .line 318
    .line 319
    invoke-interface {v14, v13}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_5
    new-instance v9, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v14, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    const/4 v9, 0x0

    .line 332
    goto :goto_6

    .line 333
    :cond_6
    invoke-virtual {v8, v12, v0}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zzc(Ljava/net/HttpURLConnection;I)V

    .line 334
    .line 335
    .line 336
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzegz;->zza:I

    .line 337
    .line 338
    iput-object v4, v7, Lcom/google/android/gms/internal/ads/zzegz;->zzb:Ljava/util/Map;

    .line 339
    .line 340
    const-string v9, ""

    .line 341
    .line 342
    iput-object v9, v7, Lcom/google/android/gms/internal/ads/zzegz;->zzc:Ljava/lang/String;
    :try_end_6
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 343
    .line 344
    const/16 v9, 0xc8

    .line 345
    .line 346
    const/16 v11, 0x12c

    .line 347
    .line 348
    if-lt v0, v9, :cond_a

    .line 349
    .line 350
    if-ge v0, v11, :cond_a

    .line 351
    .line 352
    :try_start_7
    new-instance v2, Ljava/io/InputStreamReader;

    .line 353
    .line 354
    invoke-virtual {v12}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 359
    .line 360
    .line 361
    :try_start_8
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 362
    .line 363
    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    const/16 v3, 0x2000

    .line 367
    .line 368
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 369
    .line 370
    .line 371
    const/16 v3, 0x800

    .line 372
    .line 373
    new-array v3, v3, [C

    .line 374
    .line 375
    :goto_7
    invoke-virtual {v2, v3}, Ljava/io/Reader;->read([C)I

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    const/4 v5, -0x1

    .line 380
    if-eq v4, v5, :cond_7

    .line 381
    .line 382
    invoke-virtual {v0, v3, v15, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :catchall_4
    move-exception v0

    .line 387
    goto :goto_a

    .line 388
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 392
    :try_start_9
    invoke-static {v2}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v8, v0}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zze(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iput-object v0, v7, Lcom/google/android/gms/internal/ads/zzegz;->zzc:Ljava/lang/String;

    .line 399
    .line 400
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_9

    .line 405
    .line 406
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzgz:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 407
    .line 408
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    check-cast v0, Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_8

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_8
    new-instance v0, Lcom/google/android/gms/internal/ads/zzecr;

    .line 426
    .line 427
    const/4 v2, 0x3

    .line 428
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(I)V

    .line 429
    .line 430
    .line 431
    throw v0

    .line 432
    :cond_9
    :goto_8
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, Lx2/c;

    .line 437
    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 442
    .line 443
    .line 444
    move-result-wide v2

    .line 445
    sub-long v2, v2, p6

    .line 446
    .line 447
    iput-wide v2, v7, Lcom/google/android/gms/internal/ads/zzegz;->zzd:J
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 448
    .line 449
    :goto_9
    :try_start_a
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 450
    .line 451
    .line 452
    goto/16 :goto_e

    .line 453
    .line 454
    :goto_a
    move-object v9, v2

    .line 455
    goto :goto_b

    .line 456
    :catchall_5
    move-exception v0

    .line 457
    const/4 v9, 0x0

    .line 458
    :goto_b
    :try_start_b
    invoke-static {v9}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 459
    .line 460
    .line 461
    throw v0

    .line 462
    :cond_a
    if-lt v0, v11, :cond_e

    .line 463
    .line 464
    const/16 v8, 0x190

    .line 465
    .line 466
    if-ge v0, v8, :cond_e

    .line 467
    .line 468
    const-string v0, "Location"

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    if-nez v8, :cond_d

    .line 479
    .line 480
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzja:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 481
    .line 482
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    check-cast v8, Ljava/lang/Boolean;

    .line 491
    .line 492
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 493
    .line 494
    .line 495
    move-result v8
    :try_end_b
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 496
    if-eqz v8, :cond_b

    .line 497
    .line 498
    :try_start_c
    new-instance v8, Ljava/net/URI;

    .line 499
    .line 500
    invoke-direct {v8, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v8}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 504
    .line 505
    .line 506
    move-result-object v0
    :try_end_c
    .catch Ljava/net/URISyntaxException; {:try_start_c .. :try_end_c} :catch_2
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 507
    move-object v8, v0

    .line 508
    goto :goto_c

    .line 509
    :catch_2
    move-exception v0

    .line 510
    :try_start_d
    new-instance v2, Lcom/google/android/gms/internal/ads/zzecr;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-direct {v2, v6, v3, v0}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 517
    .line 518
    .line 519
    throw v2

    .line 520
    :cond_b
    new-instance v8, Ljava/net/URL;

    .line 521
    .line 522
    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    :goto_c
    add-int/lit8 v0, v16, 0x1

    .line 526
    .line 527
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzgi:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 528
    .line 529
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    invoke-virtual {v11, v9}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v9

    .line 537
    check-cast v9, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v9
    :try_end_d
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 543
    if-gt v0, v9, :cond_c

    .line 544
    .line 545
    :try_start_e
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 546
    .line 547
    .line 548
    move/from16 v16, v0

    .line 549
    .line 550
    move-object v3, v8

    .line 551
    goto/16 :goto_0

    .line 552
    .line 553
    :cond_c
    :try_start_f
    const-string v0, "Too many redirects."

    .line 554
    .line 555
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    new-instance v0, Lcom/google/android/gms/internal/ads/zzecr;

    .line 559
    .line 560
    const-string v2, "Too many redirects"

    .line 561
    .line 562
    invoke-direct {v0, v6, v2}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(ILjava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v0

    .line 566
    :cond_d
    const-string v0, "No location header to follow redirect."

    .line 567
    .line 568
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    new-instance v0, Lcom/google/android/gms/internal/ads/zzecr;

    .line 572
    .line 573
    const-string v2, "No location header to follow redirect"

    .line 574
    .line 575
    invoke-direct {v0, v6, v2}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(ILjava/lang/String;)V

    .line 576
    .line 577
    .line 578
    throw v0

    .line 579
    :cond_e
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 584
    .line 585
    .line 586
    move-result v2

    .line 587
    add-int/lit8 v2, v2, 0x23

    .line 588
    .line 589
    new-instance v3, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    new-instance v2, Lcom/google/android/gms/internal/ads/zzecr;

    .line 608
    .line 609
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    add-int/lit8 v3, v3, 0x23

    .line 618
    .line 619
    new-instance v4, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-direct {v2, v6, v0}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(ILjava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw v2
    :try_end_f
    .catch Lcom/google/android/gms/internal/ads/zzecr; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 638
    :goto_d
    :try_start_10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzjE:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 639
    .line 640
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    check-cast v2, Ljava/lang/Boolean;

    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_f

    .line 655
    .line 656
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    check-cast v0, Lx2/c;

    .line 661
    .line 662
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 666
    .line 667
    .line 668
    move-result-wide v2

    .line 669
    sub-long v2, v2, p6

    .line 670
    .line 671
    iput-wide v2, v7, Lcom/google/android/gms/internal/ads/zzegz;->zzd:J

    .line 672
    .line 673
    goto/16 :goto_9

    .line 674
    .line 675
    :goto_e
    return-object v7

    .line 676
    :cond_f
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 677
    :goto_f
    :try_start_11
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 678
    .line 679
    .line 680
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    .line 681
    :goto_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 690
    .line 691
    const-string v3, "Error while connecting to ad server: "

    .line 692
    .line 693
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    new-instance v3, Lcom/google/android/gms/internal/ads/zzecr;

    .line 701
    .line 702
    invoke-direct {v3, v6, v2, v0}, Lcom/google/android/gms/internal/ads/zzecr;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 703
    .line 704
    .line 705
    throw v3
.end method
