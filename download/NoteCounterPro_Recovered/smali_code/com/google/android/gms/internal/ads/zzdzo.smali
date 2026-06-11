.class public final Lcom/google/android/gms/internal/ads/zzdzo;
.super Lcom/google/android/gms/internal/ads/zzbpj;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdzr;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdzm;

.field private final zzc:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdzr;Lcom/google/android/gms/internal/ads/zzdzm;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbpj;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zza:Lcom/google/android/gms/internal/ads/zzdzr;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 14
    .line 15
    return-void
.end method

.method private static zzc(Ljava/util/Map;)Lcom/google/android/gms/ads/internal/client/zzm;
    .locals 32

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzn;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzn;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ad_request"

    .line 7
    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzn;->zza()Lcom/google/android/gms/ads/internal/client/zzm;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Landroid/util/JsonReader;

    .line 28
    .line 29
    new-instance v3, Ljava/io/StringReader;

    .line 30
    .line 31
    invoke-direct {v3, v1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v2, v3}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 35
    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v2}, Landroid/util/JsonReader;->beginObject()V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    invoke-virtual {v2}, Landroid/util/JsonReader;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_7

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x1

    .line 56
    sparse-switch v3, :sswitch_data_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :sswitch_0
    const-string v3, "tagForChildDirectedTreatment"

    .line 62
    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    :try_start_1
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0, v5}, Lcom/google/android/gms/ads/internal/client/zzn;->zze(I)Lcom/google/android/gms/ads/internal/client/zzn;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v0, v4}, Lcom/google/android/gms/ads/internal/client/zzn;->zze(I)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :sswitch_1
    const-string v3, "maxAdContentRating"

    .line 84
    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_6

    .line 90
    .line 91
    :try_start_2
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sget-object v3, Lcom/google/android/gms/ads/RequestConfiguration;->zza:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_1

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzn;->zzg(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :sswitch_2
    const-string v3, "keywords"

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    :try_start_3
    invoke-virtual {v2}, Landroid/util/JsonReader;->beginArray()V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-virtual {v2}, Landroid/util/JsonReader;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_3

    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    invoke-virtual {v2}, Landroid/util/JsonReader;->endArray()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzn;->zzc(Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :sswitch_3
    const-string v3, "httpTimeoutMillis"

    .line 145
    .line 146
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    :try_start_4
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextInt()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzn;->zzh(I)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :sswitch_4
    const-string v3, "tagForUnderAgeOfConsent"

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    :try_start_5
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    invoke-virtual {v0, v5}, Lcom/google/android/gms/ads/internal/client/zzn;->zzf(I)Lcom/google/android/gms/ads/internal/client/zzn;

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_4
    invoke-virtual {v0, v4}, Lcom/google/android/gms/ads/internal/client/zzn;->zzf(I)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_5
    const-string v3, "isTestDevice"

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_6

    .line 191
    .line 192
    :try_start_6
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzn;->zzd(Z)Lcom/google/android/gms/ads/internal/client/zzn;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 197
    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :sswitch_6
    const-string v3, "extras"

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_6

    .line 208
    .line 209
    :try_start_7
    invoke-virtual {v2}, Landroid/util/JsonReader;->beginObject()V

    .line 210
    .line 211
    .line 212
    new-instance v1, Landroid/os/Bundle;

    .line 213
    .line 214
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 215
    .line 216
    .line 217
    :goto_2
    invoke-virtual {v2}, Landroid/util/JsonReader;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_5

    .line 222
    .line 223
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_5
    invoke-virtual {v2}, Landroid/util/JsonReader;->endObject()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzn;->zzb(Landroid/os/Bundle;)Lcom/google/android/gms/ads/internal/client/zzn;

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_6
    :goto_3
    invoke-virtual {v2}, Landroid/util/JsonReader;->skipValue()V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_7
    invoke-virtual {v2}, Landroid/util/JsonReader;->endObject()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :catch_0
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 253
    .line 254
    const-string v1, "Ad Request json was malformed, parsing ended early."

    .line 255
    .line 256
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    :goto_4
    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzn;->zza()Lcom/google/android/gms/ads/internal/client/zzm;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v15, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzm:Landroid/os/Bundle;

    .line 264
    .line 265
    const-string v1, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 266
    .line 267
    invoke-virtual {v15, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-nez v2, :cond_8

    .line 272
    .line 273
    iget-object v2, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzc:Landroid/os/Bundle;

    .line 274
    .line 275
    invoke-virtual {v15, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    move-object v5, v2

    .line 279
    iget v2, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zza:I

    .line 280
    .line 281
    iget-wide v3, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzb:J

    .line 282
    .line 283
    iget v6, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzd:I

    .line 284
    .line 285
    iget-object v7, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zze:Ljava/util/List;

    .line 286
    .line 287
    iget-boolean v8, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzf:Z

    .line 288
    .line 289
    iget v9, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzg:I

    .line 290
    .line 291
    iget-boolean v10, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzh:Z

    .line 292
    .line 293
    iget-object v11, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzi:Ljava/lang/String;

    .line 294
    .line 295
    iget-object v12, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzj:Lcom/google/android/gms/ads/internal/client/zzfx;

    .line 296
    .line 297
    iget-object v13, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzk:Landroid/location/Location;

    .line 298
    .line 299
    iget-object v14, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzl:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzn:Landroid/os/Bundle;

    .line 302
    .line 303
    move-object/from16 v16, v1

    .line 304
    .line 305
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzo:Ljava/util/List;

    .line 306
    .line 307
    move-object/from16 v17, v1

    .line 308
    .line 309
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzp:Ljava/lang/String;

    .line 310
    .line 311
    move-object/from16 v18, v1

    .line 312
    .line 313
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzq:Ljava/lang/String;

    .line 314
    .line 315
    move-object/from16 v19, v1

    .line 316
    .line 317
    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzr:Z

    .line 318
    .line 319
    move/from16 v20, v1

    .line 320
    .line 321
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    .line 322
    .line 323
    move-object/from16 v21, v1

    .line 324
    .line 325
    iget v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzt:I

    .line 326
    .line 327
    move/from16 v22, v1

    .line 328
    .line 329
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzu:Ljava/lang/String;

    .line 330
    .line 331
    move-object/from16 v23, v1

    .line 332
    .line 333
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzv:Ljava/util/List;

    .line 334
    .line 335
    move-object/from16 v24, v1

    .line 336
    .line 337
    iget v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzw:I

    .line 338
    .line 339
    move/from16 v25, v1

    .line 340
    .line 341
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzx:Ljava/lang/String;

    .line 342
    .line 343
    move-object/from16 v26, v1

    .line 344
    .line 345
    iget v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzy:I

    .line 346
    .line 347
    move/from16 v28, v1

    .line 348
    .line 349
    move/from16 v27, v2

    .line 350
    .line 351
    iget-wide v1, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzz:J

    .line 352
    .line 353
    move-wide/from16 v29, v1

    .line 354
    .line 355
    iget-wide v0, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzA:J

    .line 356
    .line 357
    move/from16 v2, v27

    .line 358
    .line 359
    move/from16 v27, v28

    .line 360
    .line 361
    move-wide/from16 v28, v29

    .line 362
    .line 363
    move-wide/from16 v30, v0

    .line 364
    .line 365
    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzm;

    .line 366
    .line 367
    invoke-direct/range {v1 .. v31}, Lcom/google/android/gms/ads/internal/client/zzm;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/zzfx;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/ads/internal/client/zzc;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 368
    .line 369
    .line 370
    return-object v1

    .line 371
    :sswitch_data_0
    .sparse-switch
        -0x4cd5119d -> :sswitch_6
        -0x3203e9ae -> :sswitch_5
        -0x2bb75c13 -> :sswitch_4
        -0x5f434a1 -> :sswitch_3
        0x1f2e9faa -> :sswitch_2
        0x239f260f -> :sswitch_1
        0x54230b03 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)V
    .locals 11

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzls:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Received H5 gmsg: "

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzV(Landroid/net/Uri;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "action"

    .line 45
    .line 46
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    const-string p1, "H5 gmsg did not contain an action"

    .line 59
    .line 60
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const v2, 0x2283a781

    .line 69
    .line 70
    .line 71
    if-eq v1, v2, :cond_3

    .line 72
    .line 73
    const v2, 0x33ebcb90

    .line 74
    .line 75
    .line 76
    if-eq v1, v2, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const-string v1, "initialize"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_5

    .line 86
    .line 87
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdzm;->zza()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    const-string v1, "dispose_all"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 127
    .line 128
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdzi;->zzc()V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_5
    :goto_1
    const-string v1, "obj_id"

    .line 137
    .line 138
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Ljava/lang/String;

    .line 143
    .line 144
    :try_start_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    const-string v4, " with ad unit "

    .line 156
    .line 157
    const-string v5, "Could not create H5 ad, missing ad unit id"

    .line 158
    .line 159
    const-string v6, "ad_unit"

    .line 160
    .line 161
    const-string v7, "Could not create H5 ad, object ID already exists"

    .line 162
    .line 163
    const-string v8, "Could not create H5 ad, too many existing objects"

    .line 164
    .line 165
    const-string v9, "Could not load H5 ad, object ID does not exist"

    .line 166
    .line 167
    const-string v10, "Could not show H5 ad, object ID does not exist"

    .line 168
    .line 169
    sparse-switch v3, :sswitch_data_0

    .line 170
    .line 171
    .line 172
    goto/16 :goto_2

    .line 173
    .line 174
    :sswitch_0
    const-string v3, "create_rewarded_ad"

    .line 175
    .line 176
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_11

    .line 181
    .line 182
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzlt:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 189
    .line 190
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    check-cast v9, Ljava/lang/Integer;

    .line 199
    .line 200
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-lt v3, v9, :cond_6

    .line 205
    .line 206
    invoke-static {v8}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 210
    .line 211
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_6
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v8

    .line 223
    if-eqz v8, :cond_7

    .line 224
    .line 225
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 229
    .line 230
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_7
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    check-cast p1, Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_8

    .line 245
    .line 246
    invoke-static {v5}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 250
    .line 251
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_8
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zza:Lcom/google/android/gms/internal/ads/zzdzr;

    .line 256
    .line 257
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzr;->zzc()Lcom/google/android/gms/internal/ads/zzdzj;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-interface {v5, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzj;->zzc(J)Lcom/google/android/gms/internal/ads/zzdzj;

    .line 262
    .line 263
    .line 264
    invoke-interface {v5, p1}, Lcom/google/android/gms/internal/ads/zzdzj;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzj;

    .line 265
    .line 266
    .line 267
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzj;->zza()Lcom/google/android/gms/internal/ads/zzdzk;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzk;->zzb()Lcom/google/android/gms/internal/ads/zzdzx;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzb(J)V

    .line 281
    .line 282
    .line 283
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    add-int/lit8 v0, v0, 0x23

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    new-instance v5, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    add-int/2addr v0, v3

    .line 304
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 305
    .line 306
    .line 307
    const-string v0, "Created H5 rewarded #"

    .line 308
    .line 309
    invoke-static {v5, v0, v1, v2, v4}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :sswitch_1
    const-string p1, "dispose"

    .line 324
    .line 325
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-eqz p1, :cond_11

    .line 330
    .line 331
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 332
    .line 333
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    check-cast v3, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 342
    .line 343
    if-nez v3, :cond_9

    .line 344
    .line 345
    const-string p1, "Could not dispose H5 ad, object ID does not exist"

    .line 346
    .line 347
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_9
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzdzi;->zzc()V

    .line 352
    .line 353
    .line 354
    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    add-int/lit8 p1, p1, 0x10

    .line 368
    .line 369
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 370
    .line 371
    .line 372
    const-string p1, "Disposed H5 ad #"

    .line 373
    .line 374
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :sswitch_2
    const-string v3, "load_interstitial_ad"

    .line 389
    .line 390
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-eqz v3, :cond_11

    .line 395
    .line 396
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 397
    .line 398
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 407
    .line 408
    if-nez v0, :cond_a

    .line 409
    .line 410
    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 414
    .line 415
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzd(J)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :cond_a
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdzo;->zzc(Ljava/util/Map;)Lcom/google/android/gms/ads/internal/client/zzm;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdzi;->zza(Lcom/google/android/gms/ads/internal/client/zzm;)V

    .line 424
    .line 425
    .line 426
    return-void

    .line 427
    :sswitch_3
    const-string v3, "create_interstitial_ad"

    .line 428
    .line 429
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    if-eqz v3, :cond_11

    .line 434
    .line 435
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 436
    .line 437
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzlt:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 442
    .line 443
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    check-cast v9, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    if-lt v3, v9, :cond_b

    .line 458
    .line 459
    invoke-static {v8}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 463
    .line 464
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :cond_b
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v8

    .line 476
    if-eqz v8, :cond_c

    .line 477
    .line 478
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 482
    .line 483
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 484
    .line 485
    .line 486
    return-void

    .line 487
    :cond_c
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    check-cast p1, Ljava/lang/String;

    .line 492
    .line 493
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-eqz v6, :cond_d

    .line 498
    .line 499
    invoke-static {v5}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 503
    .line 504
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzc(J)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :cond_d
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zza:Lcom/google/android/gms/internal/ads/zzdzr;

    .line 509
    .line 510
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzr;->zzc()Lcom/google/android/gms/internal/ads/zzdzj;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    invoke-interface {v5, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzj;->zzc(J)Lcom/google/android/gms/internal/ads/zzdzj;

    .line 515
    .line 516
    .line 517
    invoke-interface {v5, p1}, Lcom/google/android/gms/internal/ads/zzdzj;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzdzj;

    .line 518
    .line 519
    .line 520
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzj;->zza()Lcom/google/android/gms/internal/ads/zzdzk;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdzk;->zza()Lcom/google/android/gms/internal/ads/zzdzt;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 532
    .line 533
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzb(J)V

    .line 534
    .line 535
    .line 536
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    add-int/lit8 v0, v0, 0x27

    .line 549
    .line 550
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    new-instance v5, Ljava/lang/StringBuilder;

    .line 555
    .line 556
    add-int/2addr v0, v3

    .line 557
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 558
    .line 559
    .line 560
    const-string v0, "Created H5 interstitial #"

    .line 561
    .line 562
    invoke-static {v5, v0, v1, v2, v4}, Landroidx/emoji2/text/u;->t(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p1

    .line 572
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :sswitch_4
    const-string v3, "load_rewarded_ad"

    .line 577
    .line 578
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    if-eqz v3, :cond_11

    .line 583
    .line 584
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 585
    .line 586
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 595
    .line 596
    if-nez v0, :cond_e

    .line 597
    .line 598
    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 602
    .line 603
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzj(J)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_e
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzdzo;->zzc(Ljava/util/Map;)Lcom/google/android/gms/ads/internal/client/zzm;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzdzi;->zza(Lcom/google/android/gms/ads/internal/client/zzm;)V

    .line 612
    .line 613
    .line 614
    return-void

    .line 615
    :sswitch_5
    const-string p1, "show_rewarded_ad"

    .line 616
    .line 617
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result p1

    .line 621
    if-eqz p1, :cond_11

    .line 622
    .line 623
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 624
    .line 625
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object p1

    .line 633
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 634
    .line 635
    if-nez p1, :cond_f

    .line 636
    .line 637
    invoke-static {v10}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 641
    .line 642
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzj(J)V

    .line 643
    .line 644
    .line 645
    return-void

    .line 646
    :cond_f
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdzi;->zzb()V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :sswitch_6
    const-string p1, "show_interstitial_ad"

    .line 651
    .line 652
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result p1

    .line 656
    if-eqz p1, :cond_11

    .line 657
    .line 658
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 659
    .line 660
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object p1

    .line 668
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdzi;

    .line 669
    .line 670
    if-nez p1, :cond_10

    .line 671
    .line 672
    invoke-static {v10}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzb:Lcom/google/android/gms/internal/ads/zzdzm;

    .line 676
    .line 677
    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzdzm;->zzd(J)V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :cond_10
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdzi;->zzb()V

    .line 682
    .line 683
    .line 684
    return-void

    .line 685
    :cond_11
    :goto_2
    const-string p1, "H5 gmsg contained invalid action: "

    .line 686
    .line 687
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object p1

    .line 691
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :catch_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    const-string v0, "H5 gmsg did not contain a valid object id: "

    .line 700
    .line 701
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :sswitch_data_0
    .sparse-switch
        -0x6abfbf2c -> :sswitch_6
        -0x4b7b584e -> :sswitch_5
        -0xf5303e5 -> :sswitch_4
        0x177a28d3 -> :sswitch_3
        0x22e638bd -> :sswitch_2
        0x63a5261f -> :sswitch_1
        0x7db86731 -> :sswitch_0
    .end sparse-switch
.end method

.method public final zzf()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzo;->zzc:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
