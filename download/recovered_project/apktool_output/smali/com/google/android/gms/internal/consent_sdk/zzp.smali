.class final Lcom/google/android/gms/internal/consent_sdk/zzp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/consent_sdk/zzn;

.field private final zzb:Landroid/app/Activity;

.field private final zzc:Li3/b;

.field private final zzd:Li3/i;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/consent_sdk/zzn;Landroid/app/Activity;Li3/b;Li3/i;Lcom/google/android/gms/internal/consent_sdk/zzo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zza:Lcom/google/android/gms/internal/consent_sdk/zzn;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzb:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzc:Li3/b;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzd:Li3/i;

    .line 11
    .line 12
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/consent_sdk/zzp;)Lcom/google/android/gms/internal/consent_sdk/zzcl;
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/consent_sdk/zzcl;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzd:Li3/i;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x3

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    move-object v2, v1

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zza:Lcom/google/android/gms/internal/consent_sdk/zzn;

    .line 22
    .line 23
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/16 v5, 0x80

    .line 40
    .line 41
    invoke-virtual {v4, v2, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-object v2, v1

    .line 49
    :goto_0
    if-eqz v2, :cond_1

    .line 50
    .line 51
    const-string v4, "com.google.android.gms.ads.APPLICATION_ID"

    .line 52
    .line 53
    invoke-virtual {v2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v2, v1

    .line 59
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_12

    .line 64
    .line 65
    :goto_2
    iput-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zza:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzc:Li3/b;

    .line 68
    .line 69
    iget-boolean v4, v2, Li3/b;->a:Z

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iget v2, v2, Li3/b;->b:I

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    if-eq v2, v6, :cond_6

    .line 86
    .line 87
    if-eq v2, v5, :cond_5

    .line 88
    .line 89
    if-eq v2, v3, :cond_4

    .line 90
    .line 91
    const/4 v3, 0x4

    .line 92
    if-eq v2, v3, :cond_3

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/consent_sdk/zzcg;->zze:Lcom/google/android/gms/internal/consent_sdk/zzcg;

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/consent_sdk/zzcg;->zzd:Lcom/google/android/gms/internal/consent_sdk/zzcg;

    .line 102
    .line 103
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    sget-object v2, Lcom/google/android/gms/internal/consent_sdk/zzcg;->zzf:Lcom/google/android/gms/internal/consent_sdk/zzcg;

    .line 108
    .line 109
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    sget-object v2, Lcom/google/android/gms/internal/consent_sdk/zzcg;->zzc:Lcom/google/android/gms/internal/consent_sdk/zzcg;

    .line 114
    .line 115
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :goto_3
    sget-object v2, Lcom/google/android/gms/internal/consent_sdk/zzcg;->zzg:Lcom/google/android/gms/internal/consent_sdk/zzcg;

    .line 119
    .line 120
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-object v2, v4

    .line 124
    :goto_4
    iput-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzj:Ljava/util/List;

    .line 125
    .line 126
    iget-object v2, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zza:Lcom/google/android/gms/internal/consent_sdk/zzn;

    .line 127
    .line 128
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zzb(Lcom/google/android/gms/internal/consent_sdk/zzn;)Lcom/google/android/gms/internal/consent_sdk/zzaq;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3}, Lcom/google/android/gms/internal/consent_sdk/zzaq;->zzc()Ljava/util/Map;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    iput-object v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzf:Ljava/util/Map;

    .line 137
    .line 138
    iget-object v3, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzd:Li3/i;

    .line 139
    .line 140
    iget-boolean v3, v3, Li3/i;->a:Z

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iput-object v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zze:Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iput-object v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzd:Ljava/lang/String;

    .line 157
    .line 158
    new-instance v3, Lcom/google/android/gms/internal/consent_sdk/zzch;

    .line 159
    .line 160
    invoke-direct {v3}, Lcom/google/android/gms/internal/consent_sdk/zzch;-><init>()V

    .line 161
    .line 162
    .line 163
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    iput-object v6, v3, Lcom/google/android/gms/internal/consent_sdk/zzch;->zzb:Ljava/lang/Integer;

    .line 170
    .line 171
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 172
    .line 173
    iput-object v6, v3, Lcom/google/android/gms/internal/consent_sdk/zzch;->zza:Ljava/lang/String;

    .line 174
    .line 175
    iput v5, v3, Lcom/google/android/gms/internal/consent_sdk/zzch;->zzc:I

    .line 176
    .line 177
    iput-object v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzc:Lcom/google/android/gms/internal/consent_sdk/zzch;

    .line 178
    .line 179
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 200
    .line 201
    .line 202
    new-instance v5, Lcom/google/android/gms/internal/consent_sdk/zzcj;

    .line 203
    .line 204
    invoke-direct {v5}, Lcom/google/android/gms/internal/consent_sdk/zzcj;-><init>()V

    .line 205
    .line 206
    .line 207
    iget v6, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 208
    .line 209
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    iput-object v6, v5, Lcom/google/android/gms/internal/consent_sdk/zzcj;->zza:Ljava/lang/Integer;

    .line 214
    .line 215
    iget v3, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 216
    .line 217
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    iput-object v3, v5, Lcom/google/android/gms/internal/consent_sdk/zzcj;->zzb:Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 236
    .line 237
    float-to-double v6, v3

    .line 238
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    iput-object v3, v5, Lcom/google/android/gms/internal/consent_sdk/zzcj;->zzc:Ljava/lang/Double;

    .line 243
    .line 244
    const/16 v3, 0x1c

    .line 245
    .line 246
    if-ge v4, v3, :cond_7

    .line 247
    .line 248
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 249
    .line 250
    goto/16 :goto_a

    .line 251
    .line 252
    :cond_7
    iget-object v4, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzb:Landroid/app/Activity;

    .line 253
    .line 254
    if-nez v4, :cond_8

    .line 255
    .line 256
    move-object v4, v1

    .line 257
    goto :goto_5

    .line 258
    :cond_8
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    :goto_5
    if-nez v4, :cond_9

    .line 263
    .line 264
    move-object v4, v1

    .line 265
    goto :goto_6

    .line 266
    :cond_9
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    :goto_6
    if-nez v4, :cond_a

    .line 271
    .line 272
    move-object v4, v1

    .line 273
    goto :goto_7

    .line 274
    :cond_a
    invoke-virtual {v4}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    :goto_7
    if-nez v4, :cond_b

    .line 279
    .line 280
    move-object v4, v1

    .line 281
    goto :goto_8

    .line 282
    :cond_b
    invoke-static {v4}, Landroidx/emoji2/text/b;->m(Landroid/view/WindowInsets;)Landroid/view/DisplayCutout;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    :goto_8
    if-nez v4, :cond_c

    .line 287
    .line 288
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_c
    invoke-static {v4}, Landroidx/emoji2/text/b;->u(Landroid/view/DisplayCutout;)V

    .line 292
    .line 293
    .line 294
    new-instance v6, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-static {v4}, Landroidx/emoji2/text/b;->r(Landroid/view/DisplayCutout;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    :cond_d
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    if-eqz v7, :cond_e

    .line 312
    .line 313
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    check-cast v7, Landroid/graphics/Rect;

    .line 318
    .line 319
    if-eqz v7, :cond_d

    .line 320
    .line 321
    new-instance v8, Lcom/google/android/gms/internal/consent_sdk/zzci;

    .line 322
    .line 323
    invoke-direct {v8}, Lcom/google/android/gms/internal/consent_sdk/zzci;-><init>()V

    .line 324
    .line 325
    .line 326
    iget v9, v7, Landroid/graphics/Rect;->left:I

    .line 327
    .line 328
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    iput-object v9, v8, Lcom/google/android/gms/internal/consent_sdk/zzci;->zzb:Ljava/lang/Integer;

    .line 333
    .line 334
    iget v9, v7, Landroid/graphics/Rect;->right:I

    .line 335
    .line 336
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    iput-object v9, v8, Lcom/google/android/gms/internal/consent_sdk/zzci;->zzc:Ljava/lang/Integer;

    .line 341
    .line 342
    iget v9, v7, Landroid/graphics/Rect;->top:I

    .line 343
    .line 344
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    iput-object v9, v8, Lcom/google/android/gms/internal/consent_sdk/zzci;->zza:Ljava/lang/Integer;

    .line 349
    .line 350
    iget v7, v7, Landroid/graphics/Rect;->bottom:I

    .line 351
    .line 352
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    iput-object v7, v8, Lcom/google/android/gms/internal/consent_sdk/zzci;->zzd:Ljava/lang/Integer;

    .line 357
    .line 358
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_e
    move-object v4, v6

    .line 363
    :goto_a
    iput-object v4, v5, Lcom/google/android/gms/internal/consent_sdk/zzcj;->zzd:Ljava/util/List;

    .line 364
    .line 365
    iput-object v5, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzg:Lcom/google/android/gms/internal/consent_sdk/zzcj;

    .line 366
    .line 367
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    :try_start_1
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    const/4 v6, 0x0

    .line 384
    invoke-virtual {v2, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 385
    .line 386
    .line 387
    move-result-object v2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 388
    goto :goto_b

    .line 389
    :catch_1
    move-object v2, v1

    .line 390
    :goto_b
    new-instance v5, Lcom/google/android/gms/internal/consent_sdk/zzcf;

    .line 391
    .line 392
    invoke-direct {v5}, Lcom/google/android/gms/internal/consent_sdk/zzcf;-><init>()V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    iput-object v4, v5, Lcom/google/android/gms/internal/consent_sdk/zzcf;->zza:Ljava/lang/String;

    .line 400
    .line 401
    iget-object v4, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zza:Lcom/google/android/gms/internal/consent_sdk/zzn;

    .line 402
    .line 403
    invoke-static {v4}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    invoke-static {v4}, Lcom/google/android/gms/internal/consent_sdk/zzn;->zza(Lcom/google/android/gms/internal/consent_sdk/zzn;)Landroid/app/Application;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v6, v4}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    if-eqz v4, :cond_f

    .line 424
    .line 425
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    goto :goto_c

    .line 430
    :cond_f
    move-object v4, v1

    .line 431
    :goto_c
    iput-object v4, v5, Lcom/google/android/gms/internal/consent_sdk/zzcf;->zzb:Ljava/lang/String;

    .line 432
    .line 433
    if-eqz v2, :cond_11

    .line 434
    .line 435
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 436
    .line 437
    if-lt v4, v3, :cond_10

    .line 438
    .line 439
    invoke-static {v2}, Landroidx/emoji2/text/b;->e(Landroid/content/pm/PackageInfo;)J

    .line 440
    .line 441
    .line 442
    move-result-wide v2

    .line 443
    goto :goto_d

    .line 444
    :cond_10
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 445
    .line 446
    int-to-long v2, v2

    .line 447
    :goto_d
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    iput-object v2, v5, Lcom/google/android/gms/internal/consent_sdk/zzcf;->zzc:Ljava/lang/String;

    .line 452
    .line 453
    :cond_11
    iput-object v5, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzh:Lcom/google/android/gms/internal/consent_sdk/zzcf;

    .line 454
    .line 455
    new-instance v2, Lcom/google/android/gms/internal/consent_sdk/zzck;

    .line 456
    .line 457
    invoke-direct {v2}, Lcom/google/android/gms/internal/consent_sdk/zzck;-><init>()V

    .line 458
    .line 459
    .line 460
    const-string v3, "4.0.0"

    .line 461
    .line 462
    iput-object v3, v2, Lcom/google/android/gms/internal/consent_sdk/zzck;->zza:Ljava/lang/String;

    .line 463
    .line 464
    iput-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzi:Lcom/google/android/gms/internal/consent_sdk/zzck;

    .line 465
    .line 466
    iget-object p0, p0, Lcom/google/android/gms/internal/consent_sdk/zzp;->zzd:Li3/i;

    .line 467
    .line 468
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcl;->zzb:Ljava/lang/String;

    .line 472
    .line 473
    return-object v0

    .line 474
    :cond_12
    new-instance p0, Lcom/google/android/gms/internal/consent_sdk/zzg;

    .line 475
    .line 476
    const-string v0, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">"

    .line 477
    .line 478
    invoke-direct {p0, v3, v0}, Lcom/google/android/gms/internal/consent_sdk/zzg;-><init>(ILjava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw p0
.end method
