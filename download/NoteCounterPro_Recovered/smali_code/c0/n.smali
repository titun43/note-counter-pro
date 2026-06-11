.class public final Lc0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/n;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lc0/n;->g:I

    iput-object p1, p0, Lc0/n;->j:Ljava/lang/Object;

    iput-object p2, p0, Lc0/n;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc0/n;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 3
    iput p4, p0, Lc0/n;->g:I

    iput-object p1, p0, Lc0/n;->h:Ljava/lang/Object;

    iput-object p2, p0, Lc0/n;->i:Ljava/lang/Object;

    iput-object p3, p0, Lc0/n;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lc0/n;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ly1/w;

    .line 11
    .line 12
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/emoji2/text/r;

    .line 15
    .line 16
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La2/c;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Ly1/w;->w(La2/c;Landroidx/emoji2/text/r;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ly1/w;

    .line 27
    .line 28
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lu1/f;

    .line 31
    .line 32
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lcom/getcapacitor/plugin/c;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Ly1/w;->x(Lu1/f;Lcom/getcapacitor/plugin/c;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ly1/b;

    .line 43
    .line 44
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, La2/c;

    .line 47
    .line 48
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Landroidx/emoji2/text/r;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v3, Ly1/b0;->j:Ly1/e;

    .line 56
    .line 57
    const/16 v4, 0x18

    .line 58
    .line 59
    const/4 v5, 0x4

    .line 60
    invoke-virtual {v0, v4, v5, v3}, Ly1/b;->t(IILy1/e;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v2, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1, v3, v0}, La2/c;->b(Ly1/e;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ll1/k;

    .line 72
    .line 73
    iget-object v0, v0, Ll1/k;->h:Ll1/b;

    .line 74
    .line 75
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Landroidx/emoji2/text/t;

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Ll1/b;->g(Ljava/lang/String;Landroidx/emoji2/text/t;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_3
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ll2/j;->h(Ljava/lang/String;)Lt1/i;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    invoke-virtual {v0}, Lt1/i;->b()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_0

    .line 110
    .line 111
    iget-object v1, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Ls1/b;

    .line 114
    .line 115
    iget-object v1, v1, Ls1/b;->i:Ljava/lang/Object;

    .line 116
    .line 117
    monitor-enter v1

    .line 118
    :try_start_0
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ls1/b;

    .line 121
    .line 122
    iget-object v2, v2, Ls1/b;->l:Ljava/util/HashMap;

    .line 123
    .line 124
    iget-object v3, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v3, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    iget-object v2, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, Ls1/b;

    .line 134
    .line 135
    iget-object v2, v2, Ls1/b;->m:Ljava/util/HashSet;

    .line 136
    .line 137
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ls1/b;

    .line 143
    .line 144
    iget-object v2, v0, Ls1/b;->n:Lp1/c;

    .line 145
    .line 146
    iget-object v0, v0, Ls1/b;->m:Ljava/util/HashSet;

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Lp1/c;->b(Ljava/util/Collection;)V

    .line 149
    .line 150
    .line 151
    monitor-exit v1

    .line 152
    goto :goto_0

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    throw v0

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 157
    :pswitch_4
    iget-object v0, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 160
    .line 161
    iget-object v1, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v1, Landroid/content/Context;

    .line 164
    .line 165
    iget-object v3, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v3, Landroid/content/Intent;

    .line 168
    .line 169
    const-string v4, "Updating proxies: BatteryNotLowProxy enabled ("

    .line 170
    .line 171
    :try_start_1
    const-string v5, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 172
    .line 173
    invoke-virtual {v3, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    const-string v6, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 178
    .line 179
    invoke-virtual {v3, v6, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    const-string v7, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 184
    .line 185
    invoke-virtual {v3, v7, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    const-string v8, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 190
    .line 191
    invoke-virtual {v3, v8, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    sget-object v9, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 200
    .line 201
    new-instance v10, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v4, "), BatteryChargingProxy enabled ("

    .line 210
    .line 211
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v4, "), StorageNotLowProxy ("

    .line 218
    .line 219
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v4, "), NetworkStateProxy enabled ("

    .line 226
    .line 227
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v4, ")"

    .line 234
    .line 235
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 243
    .line 244
    invoke-virtual {v8, v9, v4, v2}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy;

    .line 248
    .line 249
    invoke-static {v1, v2, v5}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 250
    .line 251
    .line 252
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy;

    .line 253
    .line 254
    invoke-static {v1, v2, v6}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 255
    .line 256
    .line 257
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy;

    .line 258
    .line 259
    invoke-static {v1, v2, v7}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 260
    .line 261
    .line 262
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy;

    .line 263
    .line 264
    invoke-static {v1, v2, v3}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :catchall_1
    move-exception v1

    .line 272
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :pswitch_5
    iget-object v0, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Ljava/lang/String;

    .line 279
    .line 280
    iget-object v3, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, Ll1/l;

    .line 283
    .line 284
    :try_start_2
    iget-object v4, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v4, Lv1/j;

    .line 287
    .line 288
    invoke-virtual {v4}, Lv1/h;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Landroidx/work/m;

    .line 293
    .line 294
    if-nez v4, :cond_1

    .line 295
    .line 296
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    sget-object v5, Ll1/l;->z:Ljava/lang/String;

    .line 301
    .line 302
    iget-object v6, v3, Ll1/l;->k:Lt1/i;

    .line 303
    .line 304
    iget-object v6, v6, Lt1/i;->c:Ljava/lang/String;

    .line 305
    .line 306
    new-instance v7, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    const-string v6, " returned a null result. Treating it as a failure."

    .line 315
    .line 316
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    new-array v7, v2, [Ljava/lang/Throwable;

    .line 324
    .line 325
    invoke-virtual {v4, v5, v6, v7}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    goto :goto_1

    .line 329
    :catchall_2
    move-exception v0

    .line 330
    goto :goto_5

    .line 331
    :catch_0
    move-exception v4

    .line 332
    goto :goto_2

    .line 333
    :catch_1
    move-exception v4

    .line 334
    goto :goto_2

    .line 335
    :catch_2
    move-exception v4

    .line 336
    goto :goto_3

    .line 337
    :cond_1
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    sget-object v6, Ll1/l;->z:Ljava/lang/String;

    .line 342
    .line 343
    const-string v7, "%s returned a %s result."

    .line 344
    .line 345
    iget-object v8, v3, Ll1/l;->k:Lt1/i;

    .line 346
    .line 347
    iget-object v8, v8, Lt1/i;->c:Ljava/lang/String;

    .line 348
    .line 349
    filled-new-array {v8, v4}, [Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    new-array v8, v2, [Ljava/lang/Throwable;

    .line 358
    .line 359
    invoke-virtual {v5, v6, v7, v8}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    iput-object v4, v3, Ll1/l;->n:Landroidx/work/m;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 363
    .line 364
    :goto_1
    invoke-virtual {v3}, Ll1/l;->b()V

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :goto_2
    :try_start_3
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    sget-object v6, Ll1/l;->z:Ljava/lang/String;

    .line 373
    .line 374
    new-instance v7, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v0, " failed because it threw an exception/error"

    .line 383
    .line 384
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 392
    .line 393
    aput-object v4, v1, v2

    .line 394
    .line 395
    invoke-virtual {v5, v6, v0, v1}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    goto :goto_1

    .line 399
    :goto_3
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    sget-object v6, Ll1/l;->z:Ljava/lang/String;

    .line 404
    .line 405
    new-instance v7, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    const-string v0, " was cancelled"

    .line 414
    .line 415
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 423
    .line 424
    aput-object v4, v1, v2

    .line 425
    .line 426
    invoke-virtual {v5, v6, v0, v1}, Landroidx/work/n;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 427
    .line 428
    .line 429
    goto :goto_1

    .line 430
    :goto_4
    return-void

    .line 431
    :goto_5
    invoke-virtual {v3}, Ll1/l;->b()V

    .line 432
    .line 433
    .line 434
    throw v0

    .line 435
    :pswitch_6
    iget-object v0, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, Lv1/j;

    .line 438
    .line 439
    iget-object v1, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v1, Ll1/l;

    .line 442
    .line 443
    const-string v3, "Starting work for "

    .line 444
    .line 445
    :try_start_4
    iget-object v4, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v4, Lj3/a;

    .line 448
    .line 449
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    sget-object v5, Ll1/l;->z:Ljava/lang/String;

    .line 457
    .line 458
    iget-object v6, v1, Ll1/l;->k:Lt1/i;

    .line 459
    .line 460
    iget-object v6, v6, Lt1/i;->c:Ljava/lang/String;

    .line 461
    .line 462
    new-instance v7, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 475
    .line 476
    invoke-virtual {v4, v5, v3, v2}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    iget-object v2, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 480
    .line 481
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->startWork()Lj3/a;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    iput-object v2, v1, Ll1/l;->x:Lj3/a;

    .line 486
    .line 487
    iget-object v1, v1, Ll1/l;->x:Lj3/a;

    .line 488
    .line 489
    invoke-virtual {v0, v1}, Lv1/j;->j(Lj3/a;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 490
    .line 491
    .line 492
    goto :goto_6

    .line 493
    :catchall_3
    move-exception v1

    .line 494
    invoke-virtual {v0, v1}, Lv1/j;->i(Ljava/lang/Throwable;)Z

    .line 495
    .line 496
    .line 497
    :goto_6
    return-void

    .line 498
    :pswitch_7
    :try_start_5
    iget-object v0, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Lv1/j;

    .line 501
    .line 502
    invoke-virtual {v0}, Lv1/h;->get()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    check-cast v0, Ljava/lang/Boolean;

    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 509
    .line 510
    .line 511
    move-result v1
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_3

    .line 512
    :catch_3
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v0, Ll1/b;

    .line 515
    .line 516
    iget-object v2, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v2, Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v0, v2, v1}, Ll1/b;->c(Ljava/lang/String;Z)V

    .line 521
    .line 522
    .line 523
    return-void

    .line 524
    :pswitch_8
    :try_start_6
    iget-object v0, p0, Lc0/n;->h:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v0, Lc0/f;

    .line 527
    .line 528
    invoke-virtual {v0}, Lc0/f;->call()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 532
    goto :goto_7

    .line 533
    :catch_4
    const/4 v0, 0x0

    .line 534
    :goto_7
    iget-object v2, p0, Lc0/n;->i:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v2, Lc0/g;

    .line 537
    .line 538
    iget-object v3, p0, Lc0/n;->j:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v3, Landroid/os/Handler;

    .line 541
    .line 542
    new-instance v4, Lc0/a;

    .line 543
    .line 544
    invoke-direct {v4, v1, v2, v0}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
