.class public final synthetic Landroidx/activity/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/o;->g:I

    iput-object p1, p0, Landroidx/activity/o;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/activity/o;->g:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lk/u0;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_9

    .line 28
    .line 29
    sget-object v5, Lu/d;->g:Landroid/os/Handler;

    .line 30
    .line 31
    sget-object v0, Lu/d;->f:Ljava/lang/reflect/Method;

    .line 32
    .line 33
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v7, 0x1c

    .line 36
    .line 37
    if-lt v6, v7, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    const/16 v7, 0x1b

    .line 45
    .line 46
    const/16 v8, 0x1a

    .line 47
    .line 48
    if-eq v6, v8, :cond_1

    .line 49
    .line 50
    if-ne v6, v7, :cond_2

    .line 51
    .line 52
    :cond_1
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_2
    sget-object v9, Lu/d;->e:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-nez v9, :cond_3

    .line 59
    .line 60
    sget-object v9, Lu/d;->d:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    if-nez v9, :cond_3

    .line 63
    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_3
    :try_start_0
    sget-object v9, Lu/d;->c:Ljava/lang/reflect/Field;

    .line 67
    .line 68
    invoke-virtual {v9, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    if-nez v10, :cond_4

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_4
    sget-object v9, Lu/d;->b:Ljava/lang/reflect/Field;

    .line 77
    .line 78
    invoke-virtual {v9, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-nez v9, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    new-instance v12, Lu/c;

    .line 90
    .line 91
    invoke-direct {v12, v4}, Lu/c;-><init>(Landroid/app/Activity;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 95
    .line 96
    .line 97
    new-instance v13, Lc0/a;

    .line 98
    .line 99
    const/16 v14, 0x12

    .line 100
    .line 101
    invoke-direct {v13, v14, v12, v10}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 105
    .line 106
    .line 107
    if-eq v6, v8, :cond_7

    .line 108
    .line 109
    if-ne v6, v7, :cond_6

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_6
    move v2, v3

    .line 113
    :cond_7
    :goto_0
    const/16 v6, 0x13

    .line 114
    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    .line 123
    const/4 v15, 0x0

    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    move-object v2, v11

    .line 127
    const/4 v11, 0x0

    .line 128
    move-object v3, v12

    .line 129
    const/4 v12, 0x0

    .line 130
    move-object/from16 v17, v14

    .line 131
    .line 132
    move-object/from16 v18, v14

    .line 133
    .line 134
    :try_start_2
    filled-new-array/range {v10 .. v18}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-virtual {v0, v9, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    goto :goto_2

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    move-object v2, v11

    .line 146
    move-object v3, v12

    .line 147
    goto :goto_2

    .line 148
    :cond_8
    move-object v2, v11

    .line 149
    move-object v3, v12

    .line 150
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    .line 152
    .line 153
    :goto_1
    :try_start_3
    new-instance v0, Lc0/a;

    .line 154
    .line 155
    invoke-direct {v0, v6, v2, v3}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :goto_2
    new-instance v7, Lc0/a;

    .line 163
    .line 164
    invoke-direct {v7, v6, v2, v3}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 168
    .line 169
    .line 170
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 171
    :catchall_2
    :goto_3
    invoke-virtual {v4}, Landroid/app/Activity;->recreate()V

    .line 172
    .line 173
    .line 174
    :cond_9
    :goto_4
    return-void

    .line 175
    :pswitch_1
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lr1/h;

    .line 178
    .line 179
    iget-object v2, v0, Lr1/h;->j:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Ln2/c;

    .line 182
    .line 183
    new-instance v3, Lcom/getcapacitor/plugin/c;

    .line 184
    .line 185
    const/16 v4, 0x8

    .line 186
    .line 187
    invoke-direct {v3, v0, v4}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 188
    .line 189
    .line 190
    check-cast v2, Lm2/h;

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_2
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Landroid/view/View;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const-string v4, "input_method"

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 211
    .line 212
    invoke-virtual {v2, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_3
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lcom/getcapacitor/plugin/SystemBars;

    .line 219
    .line 220
    invoke-static {v0}, Lcom/getcapacitor/plugin/SystemBars;->h(Lcom/getcapacitor/plugin/SystemBars;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_4
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Landroidx/lifecycle/e0;

    .line 227
    .line 228
    iget-object v3, v0, Landroidx/lifecycle/e0;->l:Landroidx/lifecycle/v;

    .line 229
    .line 230
    iget v4, v0, Landroidx/lifecycle/e0;->h:I

    .line 231
    .line 232
    if-nez v4, :cond_a

    .line 233
    .line 234
    iput-boolean v2, v0, Landroidx/lifecycle/e0;->i:Z

    .line 235
    .line 236
    sget-object v4, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 237
    .line 238
    invoke-virtual {v3, v4}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 239
    .line 240
    .line 241
    :cond_a
    iget v4, v0, Landroidx/lifecycle/e0;->g:I

    .line 242
    .line 243
    if-nez v4, :cond_b

    .line 244
    .line 245
    iget-boolean v4, v0, Landroidx/lifecycle/e0;->i:Z

    .line 246
    .line 247
    if-eqz v4, :cond_b

    .line 248
    .line 249
    sget-object v4, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 250
    .line 251
    invoke-virtual {v3, v4}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 252
    .line 253
    .line 254
    iput-boolean v2, v0, Landroidx/lifecycle/e0;->j:Z

    .line 255
    .line 256
    :cond_b
    return-void

    .line 257
    :pswitch_5
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v2, v0

    .line 260
    check-cast v2, Landroidx/emoji2/text/v;

    .line 261
    .line 262
    const-string v0, "fetchFonts result is not OK. ("

    .line 263
    .line 264
    iget-object v4, v2, Landroidx/emoji2/text/v;->j:Ljava/lang/Object;

    .line 265
    .line 266
    monitor-enter v4

    .line 267
    :try_start_4
    iget-object v5, v2, Landroidx/emoji2/text/v;->n:Lz2/b;

    .line 268
    .line 269
    if-nez v5, :cond_c

    .line 270
    .line 271
    monitor-exit v4

    .line 272
    goto/16 :goto_b

    .line 273
    .line 274
    :catchall_3
    move-exception v0

    .line 275
    goto/16 :goto_d

    .line 276
    .line 277
    :cond_c
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 278
    :try_start_5
    invoke-virtual {v2}, Landroidx/emoji2/text/v;->b()Lc0/k;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    iget v5, v4, Lc0/k;->f:I

    .line 283
    .line 284
    const/4 v6, 0x2

    .line 285
    if-ne v5, v6, :cond_d

    .line 286
    .line 287
    iget-object v6, v2, Landroidx/emoji2/text/v;->j:Ljava/lang/Object;

    .line 288
    .line 289
    monitor-enter v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 290
    :try_start_6
    monitor-exit v6

    .line 291
    goto :goto_5

    .line 292
    :catchall_4
    move-exception v0

    .line 293
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 294
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 295
    :catchall_5
    move-exception v0

    .line 296
    goto/16 :goto_9

    .line 297
    .line 298
    :cond_d
    :goto_5
    if-nez v5, :cond_10

    .line 299
    .line 300
    :try_start_8
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 301
    .line 302
    sget v5, Lb0/i;->a:I

    .line 303
    .line 304
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    iget-object v0, v2, Landroidx/emoji2/text/v;->i:Lt2/i;

    .line 308
    .line 309
    iget-object v5, v2, Landroidx/emoji2/text/v;->g:Landroid/content/Context;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    filled-new-array {v4}, [Lc0/k;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    sget-object v6, Ly/f;->a:Lb3/g;

    .line 319
    .line 320
    const-string v6, "TypefaceCompat.createFromFontInfo"

    .line 321
    .line 322
    invoke-static {v6}, La/a;->e(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 323
    .line 324
    .line 325
    :try_start_9
    sget-object v6, Ly/f;->a:Lb3/g;

    .line 326
    .line 327
    invoke-virtual {v6, v5, v0, v3}, Lb3/g;->i(Landroid/content/Context;[Lc0/k;I)Landroid/graphics/Typeface;

    .line 328
    .line 329
    .line 330
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 331
    :try_start_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 332
    .line 333
    .line 334
    iget-object v3, v2, Landroidx/emoji2/text/v;->g:Landroid/content/Context;

    .line 335
    .line 336
    iget-object v4, v4, Lc0/k;->a:Landroid/net/Uri;

    .line 337
    .line 338
    invoke-static {v3, v4}, Ly4/b;->A(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 339
    .line 340
    .line 341
    move-result-object v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 342
    if-eqz v3, :cond_f

    .line 343
    .line 344
    if-eqz v0, :cond_f

    .line 345
    .line 346
    :try_start_b
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 347
    .line 348
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    new-instance v4, Lr1/h;

    .line 352
    .line 353
    invoke-static {v3}, Lb3/g;->w(Ljava/nio/MappedByteBuffer;)Lm0/b;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-direct {v4, v0, v3}, Lr1/h;-><init>(Landroid/graphics/Typeface;Lm0/b;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 358
    .line 359
    .line 360
    :try_start_c
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 361
    .line 362
    .line 363
    :try_start_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 364
    .line 365
    .line 366
    iget-object v3, v2, Landroidx/emoji2/text/v;->j:Ljava/lang/Object;

    .line 367
    .line 368
    monitor-enter v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 369
    :try_start_e
    iget-object v0, v2, Landroidx/emoji2/text/v;->n:Lz2/b;

    .line 370
    .line 371
    if-eqz v0, :cond_e

    .line 372
    .line 373
    invoke-virtual {v0, v4}, Lz2/b;->t(Lr1/h;)V

    .line 374
    .line 375
    .line 376
    goto :goto_6

    .line 377
    :catchall_6
    move-exception v0

    .line 378
    goto :goto_7

    .line 379
    :cond_e
    :goto_6
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 380
    :try_start_f
    invoke-virtual {v2}, Landroidx/emoji2/text/v;->a()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 381
    .line 382
    .line 383
    goto :goto_b

    .line 384
    :goto_7
    :try_start_10
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 385
    :try_start_11
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 386
    :catchall_7
    move-exception v0

    .line 387
    :try_start_12
    sget v3, Lb0/i;->a:I

    .line 388
    .line 389
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 394
    .line 395
    const-string v3, "Unable to open file."

    .line 396
    .line 397
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :catchall_8
    move-exception v0

    .line 402
    goto :goto_8

    .line 403
    :catchall_9
    move-exception v0

    .line 404
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 405
    .line 406
    .line 407
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 408
    :goto_8
    :try_start_13
    sget v3, Lb0/i;->a:I

    .line 409
    .line 410
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 411
    .line 412
    .line 413
    throw v0

    .line 414
    :cond_10
    new-instance v3, Ljava/lang/RuntimeException;

    .line 415
    .line 416
    new-instance v4, Ljava/lang/StringBuilder;

    .line 417
    .line 418
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v0, ")"

    .line 425
    .line 426
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    throw v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 437
    :goto_9
    iget-object v3, v2, Landroidx/emoji2/text/v;->j:Ljava/lang/Object;

    .line 438
    .line 439
    monitor-enter v3

    .line 440
    :try_start_14
    iget-object v4, v2, Landroidx/emoji2/text/v;->n:Lz2/b;

    .line 441
    .line 442
    if-eqz v4, :cond_11

    .line 443
    .line 444
    invoke-virtual {v4, v0}, Lz2/b;->s(Ljava/lang/Throwable;)V

    .line 445
    .line 446
    .line 447
    goto :goto_a

    .line 448
    :catchall_a
    move-exception v0

    .line 449
    goto :goto_c

    .line 450
    :cond_11
    :goto_a
    monitor-exit v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .line 451
    invoke-virtual {v2}, Landroidx/emoji2/text/v;->a()V

    .line 452
    .line 453
    .line 454
    :goto_b
    return-void

    .line 455
    :goto_c
    :try_start_15
    monitor-exit v3
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 456
    throw v0

    .line 457
    :goto_d
    :try_start_16
    monitor-exit v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 458
    throw v0

    .line 459
    :pswitch_6
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Landroidx/activity/u;

    .line 462
    .line 463
    invoke-static {v0}, Landroidx/activity/u;->a(Landroidx/activity/u;)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :pswitch_7
    iget-object v0, v1, Landroidx/activity/o;->h:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, Landroidx/activity/p;

    .line 470
    .line 471
    iget-object v2, v0, Landroidx/activity/p;->h:Ljava/lang/Runnable;

    .line 472
    .line 473
    if-eqz v2, :cond_12

    .line 474
    .line 475
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 476
    .line 477
    .line 478
    const/4 v2, 0x0

    .line 479
    iput-object v2, v0, Landroidx/activity/p;->h:Ljava/lang/Runnable;

    .line 480
    .line 481
    :cond_12
    return-void

    .line 482
    nop

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
