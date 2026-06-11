.class final Lcom/google/android/gms/internal/ads/zzfbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgzy;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzecp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgzy;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzecp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbi;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfbi;->zzc:Lcom/google/android/gms/internal/ads/zzecp;

    return-void
.end method

.method private static zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    const/high16 p1, 0x10000

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfbh;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfbh;-><init>(Lcom/google/android/gms/internal/ads/zzfbi;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfbi;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x26

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfbg;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "com.google.unity.ads.UNITY_VERSION"

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v5, "geo:0,0?q=donuts"

    .line 16
    .line 17
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzfbi;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const-string v6, "http://www.google.com"

    .line 22
    .line 23
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzfbi;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzw()Z

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    invoke-static {v2}, Lx2/d;->h(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    invoke-static {v2}, Lx2/d;->k(Landroid/content/Context;)Z

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    new-instance v15, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/4 v7, 0x0

    .line 63
    move v8, v7

    .line 64
    :goto_0
    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-ge v8, v9, :cond_0

    .line 69
    .line 70
    invoke-virtual {v4, v8}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v9}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v8, v8, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const-string v4, "market://details?id=com.google.android.gms.ads"

    .line 85
    .line 86
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzfbi;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const-string v8, "."

    .line 91
    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    if-nez v4, :cond_1

    .line 95
    .line 96
    :goto_1
    move-object/from16 v2, v16

    .line 97
    .line 98
    const/16 v17, 0x1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 102
    .line 103
    if-nez v4, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    :try_start_0
    invoke-static {v2}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 107
    .line 108
    .line 109
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 110
    const/16 v17, 0x1

    .line 111
    .line 112
    :try_start_1
    iget-object v9, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v2, v7, v9}, Lf2/k;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 121
    .line 122
    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    add-int/lit8 v9, v9, 0x1

    .line 133
    .line 134
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v18

    .line 138
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 139
    .line 140
    .line 141
    move-result v18

    .line 142
    add-int v9, v9, v18

    .line 143
    .line 144
    new-instance v7, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 162
    goto :goto_3

    .line 163
    :catch_0
    :cond_3
    :goto_2
    move-object/from16 v2, v16

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :catch_1
    const/16 v17, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :goto_3
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    .line 170
    .line 171
    const/16 v7, 0x80

    .line 172
    .line 173
    :try_start_2
    invoke-static {v4}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const-string v9, "com.android.vending"

    .line 178
    .line 179
    invoke-virtual {v4, v7, v9}, Lf2/k;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-eqz v4, :cond_4

    .line 184
    .line 185
    iget v9, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 186
    .line 187
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v19

    .line 193
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v19

    .line 197
    add-int/lit8 v19, v19, 0x1

    .line 198
    .line 199
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v20

    .line 203
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 204
    .line 205
    .line 206
    move-result v20
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 207
    add-int v7, v19, v20

    .line 208
    .line 209
    move-object/from16 v19, v2

    .line 210
    .line 211
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 229
    :goto_4
    const/4 v4, 0x0

    .line 230
    goto :goto_5

    .line 231
    :catch_2
    :cond_4
    move-object/from16 v19, v2

    .line 232
    .line 233
    :catch_3
    move-object/from16 v2, v16

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :goto_5
    sget-object v18, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-virtual {v7}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzoU:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 247
    .line 248
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    check-cast v8, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_5

    .line 263
    .line 264
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    .line 265
    .line 266
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/zzs;->zzm(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/util/zzq;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-virtual {v7}, Lcom/google/android/gms/ads/internal/util/zzq;->zzb()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-virtual {v7}, Lcom/google/android/gms/ads/internal/util/zzq;->zza()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    move-object/from16 v27, v7

    .line 279
    .line 280
    move-object/from16 v26, v8

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_5
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzoT:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 284
    .line 285
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    check-cast v8, Ljava/lang/Boolean;

    .line 294
    .line 295
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_6

    .line 300
    .line 301
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    .line 302
    .line 303
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/zzs;->zzm(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/util/zzq;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v7}, Lcom/google/android/gms/ads/internal/util/zzq;->zzb()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    :cond_6
    move-object/from16 v26, v7

    .line 312
    .line 313
    move-object/from16 v27, v16

    .line 314
    .line 315
    :goto_6
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzb:Landroid/content/Context;

    .line 316
    .line 317
    if-nez v3, :cond_7

    .line 318
    .line 319
    move-object/from16 v20, v2

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_7
    new-instance v8, Landroid/content/Intent;

    .line 323
    .line 324
    const-string v9, "android.intent.action.VIEW"

    .line 325
    .line 326
    const-string v20, "http://www.example.com"

    .line 327
    .line 328
    invoke-static/range {v20 .. v20}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-direct {v8, v9, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 333
    .line 334
    .line 335
    const/4 v4, 0x0

    .line 336
    invoke-virtual {v3, v8, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    const/high16 v4, 0x10000

    .line 341
    .line 342
    invoke-virtual {v3, v8, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    if-eqz v3, :cond_9

    .line 347
    .line 348
    if-eqz v9, :cond_9

    .line 349
    .line 350
    const/4 v4, 0x0

    .line 351
    :goto_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 352
    .line 353
    .line 354
    move-result v8

    .line 355
    if-ge v4, v8, :cond_9

    .line 356
    .line 357
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v8

    .line 361
    check-cast v8, Landroid/content/pm/ResolveInfo;

    .line 362
    .line 363
    move-object/from16 v20, v2

    .line 364
    .line 365
    iget-object v2, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 366
    .line 367
    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 368
    .line 369
    iget-object v8, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 370
    .line 371
    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 372
    .line 373
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-eqz v2, :cond_8

    .line 378
    .line 379
    iget-object v2, v9, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 380
    .line 381
    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 382
    .line 383
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzikw;->zza(Landroid/content/Context;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    goto :goto_8

    .line 392
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 393
    .line 394
    move-object/from16 v2, v20

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_9
    move-object/from16 v20, v2

    .line 398
    .line 399
    const/4 v4, 0x0

    .line 400
    :goto_8
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 401
    .line 402
    .line 403
    new-instance v2, Landroid/os/StatFs;

    .line 404
    .line 405
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-direct {v2, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 417
    .line 418
    .line 419
    move-result-wide v2

    .line 420
    const-wide/16 v8, 0x400

    .line 421
    .line 422
    div-long/2addr v2, v8

    .line 423
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzmO:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 424
    .line 425
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    check-cast v8, Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    .line 437
    .line 438
    move-result v8

    .line 439
    if-eqz v8, :cond_a

    .line 440
    .line 441
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 442
    .line 443
    .line 444
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/zzs;->zzG(Landroid/content/Context;)Z

    .line 445
    .line 446
    .line 447
    move-result v8

    .line 448
    if-eqz v8, :cond_a

    .line 449
    .line 450
    move/from16 v23, v17

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_a
    const/16 v23, 0x0

    .line 454
    .line 455
    :goto_9
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzmS:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 456
    .line 457
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    check-cast v8, Ljava/lang/Boolean;

    .line 466
    .line 467
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    if-eqz v8, :cond_c

    .line 472
    .line 473
    :try_start_4
    invoke-static {v7}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    const/16 v9, 0x80

    .line 482
    .line 483
    invoke-virtual {v8, v9, v7}, Lf2/k;->b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 488
    .line 489
    if-eqz v7, :cond_b

    .line 490
    .line 491
    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    if-eqz v8, :cond_b

    .line 496
    .line 497
    invoke-virtual {v7, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v16
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_4

    .line 501
    :catch_4
    :cond_b
    :goto_a
    move-object/from16 v24, v16

    .line 502
    .line 503
    goto :goto_b

    .line 504
    :cond_c
    const-string v16, ""

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :goto_b
    if-eqz v6, :cond_d

    .line 508
    .line 509
    move/from16 v9, v17

    .line 510
    .line 511
    goto :goto_c

    .line 512
    :cond_d
    const/4 v9, 0x0

    .line 513
    :goto_c
    if-eqz v5, :cond_e

    .line 514
    .line 515
    move/from16 v8, v17

    .line 516
    .line 517
    goto :goto_d

    .line 518
    :cond_e
    const/4 v8, 0x0

    .line 519
    :goto_d
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfbi;->zzc:Lcom/google/android/gms/internal/ads/zzecp;

    .line 520
    .line 521
    new-instance v7, Lcom/google/android/gms/internal/ads/zzfbg;

    .line 522
    .line 523
    move-object/from16 v17, v20

    .line 524
    .line 525
    sget-object v20, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 526
    .line 527
    sget v25, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 528
    .line 529
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzecp;->zza()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v28

    .line 533
    move-wide/from16 v21, v2

    .line 534
    .line 535
    move-object/from16 v16, v19

    .line 536
    .line 537
    move/from16 v19, v4

    .line 538
    .line 539
    invoke-direct/range {v7 .. v28}, Lcom/google/android/gms/internal/ads/zzfbg;-><init>(ZZLjava/lang/String;ZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    return-object v7
.end method
