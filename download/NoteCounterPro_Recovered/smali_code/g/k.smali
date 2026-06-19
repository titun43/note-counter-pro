.class public abstract Lg/k;
.super Landroidx/fragment/app/e0;
.source "SourceFile"

# interfaces
.implements Lg/l;
.implements Lu/y;


# static fields
.field private static final DELEGATE_TAG:Ljava/lang/String; = "androidx:appcompat"


# instance fields
.field private mDelegate:Lg/r;

.field private mResources:Landroid/content/res/Resources;


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/activity/s;->initializeViewTreeOwners()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lg/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lg/f0;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Lg/f0;->s:Lg/z;

    .line 28
    .line 29
    iget-object p2, v0, Lg/f0;->r:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Lg/z;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lg/f0;->U:Z

    .line 9
    .line 10
    iget v2, v0, Lg/f0;->Y:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lg/r;->h:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lg/f0;->E(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lg/r;->d(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Lg/r;->d(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v2, v4, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Lg/r;->l:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Lg/r;->g:Lg/p;

    .line 48
    .line 49
    new-instance v4, Lg/m;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lg/m;-><init>(Landroid/content/Context;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lg/p;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lg/r;->o:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Lg/r;->i:Lb0/g;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Lg/r;->j:Lb0/g;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lu/e;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lb0/g;->a(Ljava/lang/String;)Lb0/g;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Lg/r;->j:Lb0/g;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    sget-object v4, Lg/r;->j:Lb0/g;

    .line 83
    .line 84
    invoke-virtual {v4}, Lb0/g;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    monitor-exit v2

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    sget-object v4, Lg/r;->j:Lb0/g;

    .line 93
    .line 94
    sput-object v4, Lg/r;->i:Lb0/g;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v5, Lg/r;->j:Lb0/g;

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Lb0/g;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_6

    .line 104
    .line 105
    sget-object v4, Lg/r;->i:Lb0/g;

    .line 106
    .line 107
    sput-object v4, Lg/r;->j:Lb0/g;

    .line 108
    .line 109
    iget-object v4, v4, Lb0/g;->a:Lb0/h;

    .line 110
    .line 111
    iget-object v4, v4, Lb0/h;->a:Landroid/os/LocaleList;

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {p1, v4}, Lu/e;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    :goto_2
    monitor-exit v2

    .line 121
    goto :goto_4

    .line 122
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    throw p1

    .line 124
    :cond_7
    :goto_4
    invoke-static {p1}, Lg/f0;->r(Landroid/content/Context;)Lb0/g;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    if-eqz v4, :cond_8

    .line 132
    .line 133
    invoke-static {p1, v0, v2, v5, v3}, Lg/f0;->v(Landroid/content/Context;ILb0/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :try_start_1
    move-object v6, p1

    .line 138
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 139
    .line 140
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .line 142
    .line 143
    goto/16 :goto_b

    .line 144
    .line 145
    :catch_0
    :cond_8
    instance-of v4, p1, Li/d;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    invoke-static {p1, v0, v2, v5, v3}, Lg/f0;->v(Landroid/content/Context;ILb0/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :try_start_2
    move-object v4, p1

    .line 154
    check-cast v4, Li/d;

    .line 155
    .line 156
    invoke-virtual {v4, v3}, Li/d;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 157
    .line 158
    .line 159
    goto/16 :goto_b

    .line 160
    .line 161
    :catch_1
    :cond_9
    sget-boolean v3, Lg/f0;->p0:Z

    .line 162
    .line 163
    if-nez v3, :cond_a

    .line 164
    .line 165
    goto/16 :goto_b

    .line 166
    .line 167
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 168
    .line 169
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 170
    .line 171
    .line 172
    const/4 v4, -0x1

    .line 173
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 177
    .line 178
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 199
    .line 200
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 201
    .line 202
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-nez v7, :cond_20

    .line 207
    .line 208
    new-instance v7, Landroid/content/res/Configuration;

    .line 209
    .line 210
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 211
    .line 212
    .line 213
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 214
    .line 215
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-nez v4, :cond_b

    .line 220
    .line 221
    goto/16 :goto_5

    .line 222
    .line 223
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 224
    .line 225
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 226
    .line 227
    cmpl-float v4, v4, v8

    .line 228
    .line 229
    if-eqz v4, :cond_c

    .line 230
    .line 231
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 232
    .line 233
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 234
    .line 235
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 236
    .line 237
    if-eq v4, v8, :cond_d

    .line 238
    .line 239
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 240
    .line 241
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 242
    .line 243
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 244
    .line 245
    if-eq v4, v8, :cond_e

    .line 246
    .line 247
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 248
    .line 249
    :cond_e
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 250
    .line 251
    invoke-static {v3, v6, v7}, Lg/x;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 252
    .line 253
    .line 254
    iget v8, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 255
    .line 256
    iget v9, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 257
    .line 258
    if-eq v8, v9, :cond_f

    .line 259
    .line 260
    iput v9, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 261
    .line 262
    :cond_f
    iget v8, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 263
    .line 264
    iget v9, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 265
    .line 266
    if-eq v8, v9, :cond_10

    .line 267
    .line 268
    iput v9, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 269
    .line 270
    :cond_10
    iget v8, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 271
    .line 272
    iget v9, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 273
    .line 274
    if-eq v8, v9, :cond_11

    .line 275
    .line 276
    iput v9, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 277
    .line 278
    :cond_11
    iget v8, v3, Landroid/content/res/Configuration;->navigation:I

    .line 279
    .line 280
    iget v9, v6, Landroid/content/res/Configuration;->navigation:I

    .line 281
    .line 282
    if-eq v8, v9, :cond_12

    .line 283
    .line 284
    iput v9, v7, Landroid/content/res/Configuration;->navigation:I

    .line 285
    .line 286
    :cond_12
    iget v8, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 287
    .line 288
    iget v9, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 289
    .line 290
    if-eq v8, v9, :cond_13

    .line 291
    .line 292
    iput v9, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 293
    .line 294
    :cond_13
    iget v8, v3, Landroid/content/res/Configuration;->orientation:I

    .line 295
    .line 296
    iget v9, v6, Landroid/content/res/Configuration;->orientation:I

    .line 297
    .line 298
    if-eq v8, v9, :cond_14

    .line 299
    .line 300
    iput v9, v7, Landroid/content/res/Configuration;->orientation:I

    .line 301
    .line 302
    :cond_14
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 303
    .line 304
    and-int/lit8 v8, v8, 0xf

    .line 305
    .line 306
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 307
    .line 308
    and-int/lit8 v9, v9, 0xf

    .line 309
    .line 310
    if-eq v8, v9, :cond_15

    .line 311
    .line 312
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 313
    .line 314
    or-int/2addr v8, v9

    .line 315
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 316
    .line 317
    :cond_15
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 318
    .line 319
    and-int/lit16 v8, v8, 0xc0

    .line 320
    .line 321
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 322
    .line 323
    and-int/lit16 v9, v9, 0xc0

    .line 324
    .line 325
    if-eq v8, v9, :cond_16

    .line 326
    .line 327
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 328
    .line 329
    or-int/2addr v8, v9

    .line 330
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 331
    .line 332
    :cond_16
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 333
    .line 334
    and-int/lit8 v8, v8, 0x30

    .line 335
    .line 336
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 337
    .line 338
    and-int/lit8 v9, v9, 0x30

    .line 339
    .line 340
    if-eq v8, v9, :cond_17

    .line 341
    .line 342
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 343
    .line 344
    or-int/2addr v8, v9

    .line 345
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 346
    .line 347
    :cond_17
    iget v8, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 348
    .line 349
    and-int/lit16 v8, v8, 0x300

    .line 350
    .line 351
    iget v9, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 352
    .line 353
    and-int/lit16 v9, v9, 0x300

    .line 354
    .line 355
    if-eq v8, v9, :cond_18

    .line 356
    .line 357
    iget v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 358
    .line 359
    or-int/2addr v8, v9

    .line 360
    iput v8, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 361
    .line 362
    :cond_18
    const/16 v8, 0x1a

    .line 363
    .line 364
    if-lt v4, v8, :cond_1a

    .line 365
    .line 366
    invoke-static {v3}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    and-int/lit8 v4, v4, 0x3

    .line 371
    .line 372
    invoke-static {v6}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    and-int/lit8 v8, v8, 0x3

    .line 377
    .line 378
    if-eq v4, v8, :cond_19

    .line 379
    .line 380
    invoke-static {v7}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    invoke-static {v6}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 385
    .line 386
    .line 387
    move-result v8

    .line 388
    and-int/lit8 v8, v8, 0x3

    .line 389
    .line 390
    or-int/2addr v4, v8

    .line 391
    invoke-static {v7, v4}, Lcom/getcapacitor/plugin/util/a;->v(Landroid/content/res/Configuration;I)V

    .line 392
    .line 393
    .line 394
    :cond_19
    invoke-static {v3}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    and-int/lit8 v4, v4, 0xc

    .line 399
    .line 400
    invoke-static {v6}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    and-int/lit8 v8, v8, 0xc

    .line 405
    .line 406
    if-eq v4, v8, :cond_1a

    .line 407
    .line 408
    invoke-static {v7}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    invoke-static {v6}, Lcom/getcapacitor/plugin/util/a;->b(Landroid/content/res/Configuration;)I

    .line 413
    .line 414
    .line 415
    move-result v8

    .line 416
    and-int/lit8 v8, v8, 0xc

    .line 417
    .line 418
    or-int/2addr v4, v8

    .line 419
    invoke-static {v7, v4}, Lcom/getcapacitor/plugin/util/a;->v(Landroid/content/res/Configuration;I)V

    .line 420
    .line 421
    .line 422
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 423
    .line 424
    and-int/lit8 v4, v4, 0xf

    .line 425
    .line 426
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 427
    .line 428
    and-int/lit8 v8, v8, 0xf

    .line 429
    .line 430
    if-eq v4, v8, :cond_1b

    .line 431
    .line 432
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 433
    .line 434
    or-int/2addr v4, v8

    .line 435
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 436
    .line 437
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 438
    .line 439
    and-int/lit8 v4, v4, 0x30

    .line 440
    .line 441
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 442
    .line 443
    and-int/lit8 v8, v8, 0x30

    .line 444
    .line 445
    if-eq v4, v8, :cond_1c

    .line 446
    .line 447
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 448
    .line 449
    or-int/2addr v4, v8

    .line 450
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 451
    .line 452
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 453
    .line 454
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 455
    .line 456
    if-eq v4, v8, :cond_1d

    .line 457
    .line 458
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 459
    .line 460
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 461
    .line 462
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 463
    .line 464
    if-eq v4, v8, :cond_1e

    .line 465
    .line 466
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 467
    .line 468
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 469
    .line 470
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 471
    .line 472
    if-eq v4, v8, :cond_1f

    .line 473
    .line 474
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 475
    .line 476
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 477
    .line 478
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 479
    .line 480
    if-eq v3, v4, :cond_21

    .line 481
    .line 482
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_20
    move-object v7, v5

    .line 486
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v7, v1}, Lg/f0;->v(Landroid/content/Context;ILb0/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    new-instance v2, Li/d;

    .line 491
    .line 492
    const v3, 0x7f0f010b

    .line 493
    .line 494
    .line 495
    invoke-direct {v2, p1, v3}, Li/d;-><init>(Landroid/content/Context;I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v0}, Li/d;->a(Landroid/content/res/Configuration;)V

    .line 499
    .line 500
    .line 501
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 502
    .line 503
    .line 504
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    .line 505
    if-eqz p1, :cond_25

    .line 506
    .line 507
    invoke-virtual {v2}, Li/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 512
    .line 513
    const/16 v3, 0x1d

    .line 514
    .line 515
    if-lt v0, v3, :cond_22

    .line 516
    .line 517
    invoke-static {p1}, Lx/j;->a(Landroid/content/res/Resources$Theme;)V

    .line 518
    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_22
    sget-object v0, Lx/b;->e:Ljava/lang/Object;

    .line 522
    .line 523
    monitor-enter v0

    .line 524
    :try_start_4
    sget-boolean v3, Lx/b;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 525
    .line 526
    if-nez v3, :cond_23

    .line 527
    .line 528
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 529
    .line 530
    const-string v4, "rebase"

    .line 531
    .line 532
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    sput-object v3, Lx/b;->f:Ljava/lang/reflect/Method;

    .line 537
    .line 538
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 539
    .line 540
    .line 541
    goto :goto_6

    .line 542
    :catchall_1
    move-exception p1

    .line 543
    goto :goto_9

    .line 544
    :catch_2
    move-exception v3

    .line 545
    :try_start_6
    const-string v4, "ResourcesCompat"

    .line 546
    .line 547
    const-string v6, "Failed to retrieve rebase() method"

    .line 548
    .line 549
    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 550
    .line 551
    .line 552
    :goto_6
    sput-boolean v1, Lx/b;->g:Z

    .line 553
    .line 554
    :cond_23
    sget-object v1, Lx/b;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 555
    .line 556
    if-eqz v1, :cond_24

    .line 557
    .line 558
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 559
    .line 560
    .line 561
    goto :goto_8

    .line 562
    :catch_3
    move-exception p1

    .line 563
    goto :goto_7

    .line 564
    :catch_4
    move-exception p1

    .line 565
    :goto_7
    :try_start_8
    const-string v1, "ResourcesCompat"

    .line 566
    .line 567
    const-string v3, "Failed to invoke rebase() method via reflection"

    .line 568
    .line 569
    invoke-static {v1, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 570
    .line 571
    .line 572
    sput-object v5, Lx/b;->f:Ljava/lang/reflect/Method;

    .line 573
    .line 574
    :cond_24
    :goto_8
    monitor-exit v0

    .line 575
    goto :goto_a

    .line 576
    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 577
    throw p1

    .line 578
    :catch_5
    :cond_25
    :goto_a
    move-object p1, v2

    .line 579
    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 580
    .line 581
    .line 582
    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg/k;->getSupportActionBar()Lg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lg/a;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lg/k;->getSupportActionBar()Lg/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lg/a;->j(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lu/h;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg/f0;->y()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lg/f0;->r:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public getDelegate()Lg/r;
    .locals 2

    .line 1
    iget-object v0, p0, Lg/k;->mDelegate:Lg/r;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lg/r;->g:Lg/p;

    .line 6
    .line 7
    new-instance v0, Lg/f0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lg/f0;-><init>(Landroid/content/Context;Landroid/view/Window;Lg/l;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lg/k;->mDelegate:Lg/r;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lg/k;->mDelegate:Lg/r;

    .line 16
    .line 17
    return-object v0
.end method

.method public getDrawerToggleDelegate()Lg/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lt2/i;

    .line 11
    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lt2/i;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    iget-object v1, v0, Lg/f0;->v:Li/i;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Li/i;

    .line 15
    .line 16
    iget-object v2, v0, Lg/f0;->u:Lg/a;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Lg/a;->e()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Lg/f0;->q:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Li/i;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Lg/f0;->v:Li/i;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lg/f0;->v:Li/i;

    .line 33
    .line 34
    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    .line 1
    iget-object v0, p0, Lg/k;->mResources:Landroid/content/res/Resources;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v1, Lk/i3;->a:I

    .line 6
    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_1
    return-object v0
.end method

.method public getSupportActionBar()Lg/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lg/f0;->u:Lg/a;

    .line 11
    .line 12
    return-object v0
.end method

.method public getSupportParentActivityIntent()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-static {p0}, Lu/e;->a(Lg/k;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg/r;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/s;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lg/f0;

    .line 9
    .line 10
    iget-boolean v0, p1, Lg/f0;->L:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Lg/f0;->F:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lg/f0;->C()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lg/f0;->u:Lg/a;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lg/a;->g()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Lk/v;->a()Lk/v;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p1, Lg/f0;->q:Landroid/content/Context;

    .line 33
    .line 34
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v2, v0, Lk/v;->a:Lk/n2;

    .line 36
    .line 37
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-object v3, v2, Lk/n2;->b:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lo/i;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget v4, v1, Lo/i;->j:I

    .line 50
    .line 51
    iget-object v5, v1, Lo/i;->i:[Ljava/lang/Object;

    .line 52
    .line 53
    move v6, v3

    .line 54
    :goto_0
    if-ge v6, v4, :cond_1

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    aput-object v7, v5, v6

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iput v3, v1, Lo/i;->j:I

    .line 63
    .line 64
    iput-boolean v3, v1, Lo/i;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    :cond_2
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    monitor-exit v0

    .line 68
    new-instance v0, Landroid/content/res/Configuration;

    .line 69
    .line 70
    iget-object v1, p1, Lg/f0;->q:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p1, Lg/f0;->X:Landroid/content/res/Configuration;

    .line 84
    .line 85
    invoke-virtual {p1, v3, v3}, Lg/f0;->p(ZZ)Z

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lg/k;->mResources:Landroid/content/res/Resources;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, Lg/k;->mResources:Landroid/content/res/Resources;

    .line 109
    .line 110
    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    return-void

    .line 114
    :catchall_0
    move-exception p1

    .line 115
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    :try_start_4
    throw p1

    .line 117
    :catchall_1
    move-exception p1

    .line 118
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 119
    throw p1
.end method

.method public onContentChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg/k;->onSupportContentChanged()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onCreateSupportNavigateUpTaskStack(Lu/z;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lu/z;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p1, p1, Lu/z;->h:Lg/k;

    .line 4
    .line 5
    invoke-interface {p0}, Lu/y;->getSupportParentActivityIntent()Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lu/e;->a(Lg/k;)Landroid/content/Intent;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :try_start_0
    invoke-static {p1, v2}, Lu/e;->b(Lg/k;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :goto_0
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {p1, v2}, Lu/e;->b(Lg/k;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_1
    const-string v0, "TaskStackBuilder"

    .line 60
    .line 61
    const-string v1, "Bad ComponentName while traversing activity parent metadata"

    .line 62
    .line 63
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_3
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lg/r;->h()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public onLocalesChanged(Lb0/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/e0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lg/k;->getSupportActionBar()Lg/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const v0, 0x102002c

    .line 18
    .line 19
    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lg/a;->d()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lg/k;->onSupportNavigateUp()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public onNightModeChanged(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/s;->onPanelClosed(ILandroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lg/f0;

    .line 9
    .line 10
    invoke-virtual {p1}, Lg/f0;->y()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lg/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lg/f0;->u:Lg/a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lg/a;->m(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onPrepareSupportNavigateUpTaskStack(Lu/z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lg/f0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lg/f0;->p(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lg/f0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lg/f0;->u:Lg/a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Lg/a;->m(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onSupportActionModeFinished(Li/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onSupportActionModeStarted(Li/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onSupportContentChanged()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public onSupportNavigateUp()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lg/k;->getSupportParentActivityIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lg/k;->supportShouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    new-instance v0, Lu/z;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lu/z;-><init>(Lg/k;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lg/k;->onCreateSupportNavigateUpTaskStack(Lu/z;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lg/k;->onPrepareSupportNavigateUpTaskStack(Lu/z;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Lu/z;->g:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    new-array v4, v1, [Landroid/content/Intent;

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, [Landroid/content/Intent;

    .line 41
    .line 42
    new-instance v4, Landroid/content/Intent;

    .line 43
    .line 44
    aget-object v5, v2, v1

    .line 45
    .line 46
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 47
    .line 48
    .line 49
    const v5, 0x1000c000

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    aput-object v4, v2, v1

    .line 57
    .line 58
    iget-object v0, v0, Lu/z;->h:Lg/k;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v0, v2, v1}, Lv/a;->startActivities(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_0

    .line 66
    .line 67
    new-instance v1, Landroid/content/Intent;

    .line 68
    .line 69
    array-length v4, v2

    .line 70
    sub-int/2addr v4, v3

    .line 71
    aget-object v2, v2, v4

    .line 72
    .line 73
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 74
    .line 75
    .line 76
    const/high16 v2, 0x10000000

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 89
    .line 90
    .line 91
    :goto_0
    return v3

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_2
    invoke-virtual {p0, v0}, Lg/k;->supportNavigateUpTo(Landroid/content/Intent;)V

    .line 101
    .line 102
    .line 103
    return v3

    .line 104
    :cond_3
    return v1
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Lg/r;->n(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onWindowStartingSupportActionMode(Li/a;)Li/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg/k;->getSupportActionBar()Lg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lg/a;->k()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/activity/s;->initializeViewTreeOwners()V

    .line 2
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/r;->k(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroidx/activity/s;->initializeViewTreeOwners()V

    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg/r;->l(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Landroidx/activity/s;->initializeViewTreeOwners()V

    .line 6
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg/r;->m(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg/f0;

    .line 6
    .line 7
    iget-object v1, v0, Lg/f0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v1, v1, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lg/f0;->u:Lg/a;

    .line 18
    .line 19
    instance-of v2, v1, Lg/s0;

    .line 20
    .line 21
    if-nez v2, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-object v2, v0, Lg/f0;->v:Li/i;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lg/a;->h()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, v0, Lg/f0;->u:Lg/a;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    new-instance v1, Lg/n0;

    .line 36
    .line 37
    iget-object v2, v0, Lg/f0;->p:Ljava/lang/Object;

    .line 38
    .line 39
    instance-of v3, v2, Landroid/app/Activity;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    check-cast v2, Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v2, v0, Lg/f0;->w:Ljava/lang/CharSequence;

    .line 51
    .line 52
    :goto_0
    iget-object v3, v0, Lg/f0;->s:Lg/z;

    .line 53
    .line 54
    invoke-direct {v1, p1, v2, v3}, Lg/n0;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Lg/z;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lg/f0;->u:Lg/a;

    .line 58
    .line 59
    iget-object v2, v0, Lg/f0;->s:Lg/z;

    .line 60
    .line 61
    iget-object v1, v1, Lg/n0;->c:Lg/l0;

    .line 62
    .line 63
    iput-object v1, v2, Lg/z;->h:Lg/l0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-object p1, v0, Lg/f0;->s:Lg/z;

    .line 71
    .line 72
    iput-object v2, p1, Lg/z;->h:Lg/l0;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v0}, Lg/f0;->c()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public setSupportProgress(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setSupportProgressBarIndeterminate(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setSupportProgressBarVisibility(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lg/f0;

    .line 9
    .line 10
    iput p1, v0, Lg/f0;->Z:I

    .line 11
    .line 12
    return-void
.end method

.method public startSupportActionMode(Li/a;)Li/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg/r;->o(Li/a;)Li/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg/r;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public supportNavigateUpTo(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg/k;->getDelegate()Lg/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg/r;->j(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public supportShouldUpRecreateTask(Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
