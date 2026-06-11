.class public final Lg/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/t;
.implements Lj/y;


# instance fields
.field public final synthetic g:Lg/f0;


# direct methods
.method public synthetic constructor <init>(Lg/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg/t;->g:Lg/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lj/n;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Lg/t;->g:Lg/f0;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lg/f0;->t(Lj/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Landroid/view/View;Lf0/q1;)Lf0/q1;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    invoke-virtual {v2}, Lf0/q1;->d()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    move-object/from16 v4, p0

    .line 10
    .line 11
    iget-object v5, v4, Lg/t;->g:Lg/f0;

    .line 12
    .line 13
    iget-object v6, v5, Lg/f0;->q:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v2}, Lf0/q1;->d()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v0, v5, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 20
    .line 21
    const/16 v8, 0x1d

    .line 22
    .line 23
    if-eqz v0, :cond_11

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 30
    .line 31
    if-eqz v0, :cond_11

    .line 32
    .line 33
    iget-object v0, v5, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v11, v0

    .line 40
    check-cast v11, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 41
    .line 42
    iget-object v0, v5, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v12, 0x1

    .line 49
    if-eqz v0, :cond_f

    .line 50
    .line 51
    iget-object v0, v5, Lg/f0;->i0:Landroid/graphics/Rect;

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, v5, Lg/f0;->i0:Landroid/graphics/Rect;

    .line 61
    .line 62
    new-instance v0, Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, v5, Lg/f0;->j0:Landroid/graphics/Rect;

    .line 68
    .line 69
    :cond_0
    iget-object v13, v5, Lg/f0;->i0:Landroid/graphics/Rect;

    .line 70
    .line 71
    iget-object v0, v5, Lg/f0;->j0:Landroid/graphics/Rect;

    .line 72
    .line 73
    invoke-virtual {v2}, Lf0/q1;->b()I

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    invoke-virtual {v2}, Lf0/q1;->d()I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    invoke-virtual {v2}, Lf0/q1;->c()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    invoke-virtual {v2}, Lf0/q1;->a()I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    invoke-virtual {v13, v14, v15, v10, v9}, Landroid/graphics/Rect;->set(IIII)V

    .line 90
    .line 91
    .line 92
    iget-object v9, v5, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 93
    .line 94
    const-class v10, Landroid/graphics/Rect;

    .line 95
    .line 96
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    if-lt v14, v8, :cond_1

    .line 99
    .line 100
    sget-boolean v10, Lk/l3;->a:Z

    .line 101
    .line 102
    invoke-static {v9, v13, v0}, Lk/k3;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-boolean v14, Lk/l3;->a:Z

    .line 107
    .line 108
    const-string v15, "ViewUtils"

    .line 109
    .line 110
    if-nez v14, :cond_2

    .line 111
    .line 112
    sput-boolean v12, Lk/l3;->a:Z

    .line 113
    .line 114
    :try_start_0
    const-class v14, Landroid/view/View;

    .line 115
    .line 116
    const-string v8, "computeFitSystemWindows"

    .line 117
    .line 118
    filled-new-array {v10, v10}, [Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-virtual {v14, v8, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    sput-object v8, Lk/l3;->b:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-virtual {v8}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-nez v8, :cond_2

    .line 133
    .line 134
    sget-object v8, Lk/l3;->b:Ljava/lang/reflect/Method;

    .line 135
    .line 136
    invoke-virtual {v8, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :catch_0
    const-string v8, "Could not find method computeFitSystemWindows. Oh well."

    .line 141
    .line 142
    invoke-static {v15, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    :cond_2
    :goto_0
    sget-object v8, Lk/l3;->b:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz v8, :cond_3

    .line 148
    .line 149
    :try_start_1
    filled-new-array {v13, v0}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v8, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :catch_1
    move-exception v0

    .line 158
    const-string v8, "Could not invoke computeFitSystemWindows"

    .line 159
    .line 160
    invoke-static {v15, v8, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 161
    .line 162
    .line 163
    :cond_3
    :goto_1
    iget v0, v13, Landroid/graphics/Rect;->top:I

    .line 164
    .line 165
    iget v8, v13, Landroid/graphics/Rect;->left:I

    .line 166
    .line 167
    iget v9, v13, Landroid/graphics/Rect;->right:I

    .line 168
    .line 169
    iget-object v10, v5, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 170
    .line 171
    sget-object v13, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 172
    .line 173
    invoke-static {v10}, Lf0/l0;->a(Landroid/view/View;)Lf0/q1;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    if-nez v10, :cond_4

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    goto :goto_2

    .line 181
    :cond_4
    invoke-virtual {v10}, Lf0/q1;->b()I

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    :goto_2
    if-nez v10, :cond_5

    .line 186
    .line 187
    const/4 v10, 0x0

    .line 188
    goto :goto_3

    .line 189
    :cond_5
    invoke-virtual {v10}, Lf0/q1;->c()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    :goto_3
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 194
    .line 195
    if-ne v14, v0, :cond_7

    .line 196
    .line 197
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 198
    .line 199
    if-ne v14, v8, :cond_7

    .line 200
    .line 201
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 202
    .line 203
    if-eq v14, v9, :cond_6

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    const/4 v8, 0x0

    .line 207
    goto :goto_5

    .line 208
    :cond_7
    :goto_4
    iput v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 209
    .line 210
    iput v8, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 211
    .line 212
    iput v9, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 213
    .line 214
    move v8, v12

    .line 215
    :goto_5
    if-lez v0, :cond_8

    .line 216
    .line 217
    iget-object v0, v5, Lg/f0;->I:Landroid/view/View;

    .line 218
    .line 219
    if-nez v0, :cond_8

    .line 220
    .line 221
    new-instance v0, Landroid/view/View;

    .line 222
    .line 223
    invoke-direct {v0, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 224
    .line 225
    .line 226
    iput-object v0, v5, Lg/f0;->I:Landroid/view/View;

    .line 227
    .line 228
    const/16 v9, 0x8

    .line 229
    .line 230
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 234
    .line 235
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 236
    .line 237
    const/16 v15, 0x33

    .line 238
    .line 239
    const/4 v9, -0x1

    .line 240
    invoke-direct {v0, v9, v14, v15}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 241
    .line 242
    .line 243
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 244
    .line 245
    iput v10, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 246
    .line 247
    iget-object v10, v5, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 248
    .line 249
    iget-object v13, v5, Lg/f0;->I:Landroid/view/View;

    .line 250
    .line 251
    invoke-virtual {v10, v13, v9, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 252
    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_8
    iget-object v0, v5, Lg/f0;->I:Landroid/view/View;

    .line 256
    .line 257
    if-eqz v0, :cond_a

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 264
    .line 265
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 266
    .line 267
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 268
    .line 269
    if-ne v9, v14, :cond_9

    .line 270
    .line 271
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 272
    .line 273
    if-ne v9, v13, :cond_9

    .line 274
    .line 275
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 276
    .line 277
    if-eq v9, v10, :cond_a

    .line 278
    .line 279
    :cond_9
    iput v14, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 280
    .line 281
    iput v13, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 282
    .line 283
    iput v10, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 284
    .line 285
    iget-object v9, v5, Lg/f0;->I:Landroid/view/View;

    .line 286
    .line 287
    invoke-virtual {v9, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 288
    .line 289
    .line 290
    :cond_a
    :goto_6
    iget-object v0, v5, Lg/f0;->I:Landroid/view/View;

    .line 291
    .line 292
    if-eqz v0, :cond_b

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_b
    const/4 v12, 0x0

    .line 296
    :goto_7
    if-eqz v12, :cond_d

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_d

    .line 303
    .line 304
    iget-object v0, v5, Lg/f0;->I:Landroid/view/View;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    and-int/lit16 v9, v9, 0x2000

    .line 311
    .line 312
    if-eqz v9, :cond_c

    .line 313
    .line 314
    const v9, 0x7f050006

    .line 315
    .line 316
    .line 317
    invoke-static {v6, v9}, Lv/a;->getColor(Landroid/content/Context;I)I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    goto :goto_8

    .line 322
    :cond_c
    const v9, 0x7f050005

    .line 323
    .line 324
    .line 325
    invoke-static {v6, v9}, Lv/a;->getColor(Landroid/content/Context;I)I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    :goto_8
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 330
    .line 331
    .line 332
    :cond_d
    iget-boolean v0, v5, Lg/f0;->N:Z

    .line 333
    .line 334
    if-nez v0, :cond_e

    .line 335
    .line 336
    if-eqz v12, :cond_e

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    :cond_e
    move v0, v12

    .line 340
    const/4 v6, 0x0

    .line 341
    move v12, v8

    .line 342
    goto :goto_9

    .line 343
    :cond_f
    iget v0, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 344
    .line 345
    const/4 v6, 0x0

    .line 346
    if-eqz v0, :cond_10

    .line 347
    .line 348
    iput v6, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 349
    .line 350
    move v0, v6

    .line 351
    goto :goto_9

    .line 352
    :cond_10
    move v0, v6

    .line 353
    move v12, v0

    .line 354
    :goto_9
    if-eqz v12, :cond_12

    .line 355
    .line 356
    iget-object v8, v5, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 357
    .line 358
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 359
    .line 360
    .line 361
    goto :goto_a

    .line 362
    :cond_11
    const/4 v6, 0x0

    .line 363
    move v0, v6

    .line 364
    :cond_12
    :goto_a
    iget-object v5, v5, Lg/f0;->I:Landroid/view/View;

    .line 365
    .line 366
    if-eqz v5, :cond_14

    .line 367
    .line 368
    if-eqz v0, :cond_13

    .line 369
    .line 370
    move v9, v6

    .line 371
    goto :goto_b

    .line 372
    :cond_13
    const/16 v9, 0x8

    .line 373
    .line 374
    :goto_b
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 375
    .line 376
    .line 377
    :cond_14
    if-eq v3, v7, :cond_19

    .line 378
    .line 379
    invoke-virtual {v2}, Lf0/q1;->b()I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    invoke-virtual {v2}, Lf0/q1;->c()I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-virtual {v2}, Lf0/q1;->a()I

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 392
    .line 393
    const/16 v8, 0x22

    .line 394
    .line 395
    if-lt v6, v8, :cond_15

    .line 396
    .line 397
    new-instance v6, Lf0/c1;

    .line 398
    .line 399
    invoke-direct {v6, v2}, Lf0/c1;-><init>(Lf0/q1;)V

    .line 400
    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_15
    const/16 v8, 0x1f

    .line 404
    .line 405
    if-lt v6, v8, :cond_16

    .line 406
    .line 407
    new-instance v6, Lf0/b1;

    .line 408
    .line 409
    invoke-direct {v6, v2}, Lf0/b1;-><init>(Lf0/q1;)V

    .line 410
    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_16
    const/16 v8, 0x1e

    .line 414
    .line 415
    if-lt v6, v8, :cond_17

    .line 416
    .line 417
    new-instance v6, Lf0/a1;

    .line 418
    .line 419
    invoke-direct {v6, v2}, Lf0/a1;-><init>(Lf0/q1;)V

    .line 420
    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_17
    const/16 v8, 0x1d

    .line 424
    .line 425
    if-lt v6, v8, :cond_18

    .line 426
    .line 427
    new-instance v6, Lf0/z0;

    .line 428
    .line 429
    invoke-direct {v6, v2}, Lf0/z0;-><init>(Lf0/q1;)V

    .line 430
    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_18
    new-instance v6, Lf0/y0;

    .line 434
    .line 435
    invoke-direct {v6, v2}, Lf0/y0;-><init>(Lf0/q1;)V

    .line 436
    .line 437
    .line 438
    :goto_c
    invoke-static {v0, v7, v3, v5}, Ly/c;->b(IIII)Ly/c;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v6, v0}, Lf0/d1;->g(Ly/c;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v6}, Lf0/d1;->b()Lf0/q1;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    goto :goto_d

    .line 450
    :cond_19
    move-object v0, v2

    .line 451
    :goto_d
    sget-object v2, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 452
    .line 453
    invoke-virtual {v0}, Lf0/q1;->f()Landroid/view/WindowInsets;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    if-eqz v2, :cond_1a

    .line 458
    .line 459
    invoke-static {v1, v2}, Lf0/i0;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-virtual {v3, v2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-nez v2, :cond_1a

    .line 468
    .line 469
    invoke-static {v3, v1}, Lf0/q1;->g(Landroid/view/WindowInsets;Landroid/view/View;)Lf0/q1;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :cond_1a
    return-object v0
.end method

.method public k(Lj/n;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg/t;->g:Lg/f0;

    .line 2
    .line 3
    iget-object v0, v0, Lg/f0;->r:Landroid/view/Window;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6c

    .line 12
    .line 13
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method
