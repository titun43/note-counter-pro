.class public final Ly1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:La2/d;

.field public final synthetic b:Ly1/b;


# direct methods
.method public constructor <init>(Ly1/b;La2/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ly1/n;->a:La2/d;

    .line 5
    .line 6
    iput-object p1, p0, Ly1/n;->b:Ly1/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Ly1/n;->b:Ly1/b;

    .line 4
    .line 5
    const-string v6, "inapp"

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "Querying owned items, item type: "

    .line 11
    .line 12
    const-string v3, "BillingClient"

    .line 13
    .line 14
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-boolean v7, v2, Ly1/b;->m:Z

    .line 27
    .line 28
    iget-boolean v8, v2, Ly1/b;->r:Z

    .line 29
    .line 30
    iget-object v3, v2, Ly1/b;->u:Ly0/c;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v3, v2, Ly1/b;->u:Ly0/c;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, v2, Ly1/b;->y:Ljava/lang/Long;

    .line 41
    .line 42
    iget-object v11, v2, Ly1/b;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v12

    .line 48
    const/4 v9, 0x1

    .line 49
    const/4 v10, 0x0

    .line 50
    invoke-static/range {v7 .. v13}, Lcom/google/android/gms/internal/play_billing/zze;->zzd(ZZZZLjava/lang/String;J)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    const/4 v9, 0x0

    .line 55
    move-object v7, v9

    .line 56
    :goto_0
    const/16 v10, 0x34

    .line 57
    .line 58
    :try_start_0
    iget-object v3, v2, Ly1/b;->a:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v3
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    move-object v4, v3

    .line 62
    :try_start_1
    iget-object v3, v2, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 63
    .line 64
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    :try_start_2
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 68
    .line 69
    const-string v3, "Service has been reset to null"

    .line 70
    .line 71
    const/16 v4, 0x77

    .line 72
    .line 73
    invoke-virtual {v2, v0, v4, v3, v9}, Ly1/b;->p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    move-object/from16 v16, v9

    .line 78
    .line 79
    goto/16 :goto_a

    .line 80
    .line 81
    :catch_0
    move-exception v0

    .line 82
    move-object/from16 v16, v9

    .line 83
    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :catch_1
    move-exception v0

    .line 87
    move-object/from16 v16, v9

    .line 88
    .line 89
    goto/16 :goto_9

    .line 90
    .line 91
    :cond_0
    iget-boolean v4, v2, Ly1/b;->m:Z

    .line 92
    .line 93
    const/4 v12, 0x1

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    iget-boolean v4, v2, Ly1/b;->r:Z

    .line 97
    .line 98
    if-eq v12, v4, :cond_1

    .line 99
    .line 100
    const/16 v4, 0x9

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    const/16 v4, 0x13

    .line 104
    .line 105
    :goto_2
    iget-object v5, v2, Ly1/b;->f:Landroid/content/Context;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/zzan;->zzj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    goto :goto_3

    .line 116
    :cond_2
    iget-object v4, v2, Ly1/b;->f:Landroid/content/Context;

    .line 117
    .line 118
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const/4 v5, 0x3

    .line 123
    invoke-interface {v3, v5, v4, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzan;->zzi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 124
    .line 125
    .line 126
    move-result-object v3
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 127
    :goto_3
    const-string v4, "INAPP_DATA_SIGNATURE_LIST"

    .line 128
    .line 129
    const-string v5, "INAPP_PURCHASE_DATA_LIST"

    .line 130
    .line 131
    const-string v7, "INAPP_PURCHASE_ITEM_LIST"

    .line 132
    .line 133
    sget-object v10, Ly1/b0;->g:Ly1/e;

    .line 134
    .line 135
    const-string v13, "BillingClient"

    .line 136
    .line 137
    if-nez v3, :cond_3

    .line 138
    .line 139
    const-string v4, "getPurchase() got null owned items list"

    .line 140
    .line 141
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance v4, Lc0/j;

    .line 145
    .line 146
    const/16 v5, 0x36

    .line 147
    .line 148
    invoke-direct {v4, v10, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_5

    .line 152
    .line 153
    :cond_3
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    invoke-static {v3, v13}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    invoke-static {}, Ly1/e;->a()Lc0/j;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    iput v14, v11, Lc0/j;->a:I

    .line 166
    .line 167
    iput-object v15, v11, Lc0/j;->b:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {v11}, Lc0/j;->b()Ly1/e;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    if-eqz v14, :cond_4

    .line 174
    .line 175
    new-instance v4, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v5, "getPurchase() failed. Response code: "

    .line 178
    .line 179
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    new-instance v4, Lc0/j;

    .line 193
    .line 194
    const/16 v5, 0x17

    .line 195
    .line 196
    invoke-direct {v4, v11, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_4
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    if-eqz v11, :cond_9

    .line 205
    .line 206
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    if-eqz v11, :cond_9

    .line 211
    .line 212
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-nez v11, :cond_5

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_5
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    if-nez v7, :cond_6

    .line 232
    .line 233
    const-string v4, "Bundle returned from getPurchase() contains null SKUs list."

    .line 234
    .line 235
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v4, Lc0/j;

    .line 239
    .line 240
    const/16 v5, 0x38

    .line 241
    .line 242
    invoke-direct {v4, v10, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_6
    if-nez v5, :cond_7

    .line 247
    .line 248
    const-string v4, "Bundle returned from getPurchase() contains null purchases list."

    .line 249
    .line 250
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    new-instance v4, Lc0/j;

    .line 254
    .line 255
    const/16 v5, 0x39

    .line 256
    .line 257
    invoke-direct {v4, v10, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_7
    if-nez v4, :cond_8

    .line 262
    .line 263
    const-string v4, "Bundle returned from getPurchase() contains null signatures list."

    .line 264
    .line 265
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    new-instance v4, Lc0/j;

    .line 269
    .line 270
    const/16 v5, 0x3a

    .line 271
    .line 272
    invoke-direct {v4, v10, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_8
    new-instance v4, Lc0/j;

    .line 277
    .line 278
    sget-object v5, Ly1/b0;->h:Ly1/e;

    .line 279
    .line 280
    invoke-direct {v4, v5, v12}, Lc0/j;-><init>(Ly1/e;I)V

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_9
    :goto_4
    const-string v4, "Bundle returned from getPurchase() doesn\'t contain required fields."

    .line 285
    .line 286
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    new-instance v4, Lc0/j;

    .line 290
    .line 291
    const/16 v5, 0x37

    .line 292
    .line 293
    invoke-direct {v4, v10, v5}, Lc0/j;-><init>(Ly1/e;I)V

    .line 294
    .line 295
    .line 296
    :goto_5
    iget-object v5, v4, Lc0/j;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v5, Ly1/e;

    .line 299
    .line 300
    sget-object v7, Ly1/b0;->h:Ly1/e;

    .line 301
    .line 302
    if-eq v5, v7, :cond_a

    .line 303
    .line 304
    iget v0, v4, Lc0/j;->a:I

    .line 305
    .line 306
    const-string v3, "Purchase bundle invalid"

    .line 307
    .line 308
    invoke-virtual {v2, v5, v0, v3, v9}, Ly1/b;->p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    goto/16 :goto_1

    .line 313
    .line 314
    :cond_a
    const-string v4, "INAPP_PURCHASE_ITEM_LIST"

    .line 315
    .line 316
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    const-string v5, "INAPP_PURCHASE_DATA_LIST"

    .line 321
    .line 322
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    .line 327
    .line 328
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    const/4 v10, 0x0

    .line 333
    move v11, v10

    .line 334
    :goto_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    if-ge v10, v13, :cond_c

    .line 339
    .line 340
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    check-cast v13, Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v14

    .line 350
    check-cast v14, Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    check-cast v15, Ljava/lang/String;

    .line 357
    .line 358
    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    move-object/from16 v16, v9

    .line 363
    .line 364
    const-string v9, "Sku is owned: "

    .line 365
    .line 366
    const-string v12, "BillingClient"

    .line 367
    .line 368
    invoke-virtual {v9, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v9

    .line 372
    invoke-static {v12, v9}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    :try_start_3
    new-instance v9, Lcom/android/billingclient/api/Purchase;

    .line 376
    .line 377
    invoke-direct {v9, v13, v14}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 378
    .line 379
    .line 380
    iget-object v12, v9, Lcom/android/billingclient/api/Purchase;->c:Lorg/json/JSONObject;

    .line 381
    .line 382
    const-string v13, "purchaseToken"

    .line 383
    .line 384
    const-string v14, "token"

    .line 385
    .line 386
    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    invoke-virtual {v12, v14, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v12

    .line 394
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result v12

    .line 398
    if-eqz v12, :cond_b

    .line 399
    .line 400
    const-string v11, "BillingClient"

    .line 401
    .line 402
    const-string v12, "BUG: empty/null token!"

    .line 403
    .line 404
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    const/4 v11, 0x1

    .line 408
    :cond_b
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    add-int/lit8 v10, v10, 0x1

    .line 412
    .line 413
    move-object/from16 v9, v16

    .line 414
    .line 415
    const/4 v12, 0x1

    .line 416
    goto :goto_6

    .line 417
    :catch_2
    move-exception v0

    .line 418
    const-string v3, "Got an exception trying to decode the purchase!"

    .line 419
    .line 420
    sget-object v4, Ly1/b0;->g:Ly1/e;

    .line 421
    .line 422
    const/16 v5, 0x33

    .line 423
    .line 424
    invoke-virtual {v2, v4, v5, v3, v0}, Ly1/b;->p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    goto :goto_a

    .line 429
    :cond_c
    move-object/from16 v16, v9

    .line 430
    .line 431
    if-eqz v11, :cond_d

    .line 432
    .line 433
    const/16 v4, 0x1a

    .line 434
    .line 435
    sget-object v5, Ly1/b0;->g:Ly1/e;

    .line 436
    .line 437
    const/16 v7, 0x9

    .line 438
    .line 439
    invoke-virtual {v2, v4, v7, v5}, Ly1/b;->t(IILy1/e;)V

    .line 440
    .line 441
    .line 442
    :cond_d
    const-string v4, "INAPP_CONTINUATION_TOKEN"

    .line 443
    .line 444
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    const-string v4, "Continuation token: "

    .line 453
    .line 454
    const-string v5, "BillingClient"

    .line 455
    .line 456
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-eqz v3, :cond_e

    .line 468
    .line 469
    new-instance v2, Landroidx/emoji2/text/p;

    .line 470
    .line 471
    sget-object v3, Ly1/b0;->h:Ly1/e;

    .line 472
    .line 473
    const/16 v4, 0x19

    .line 474
    .line 475
    const/4 v5, 0x0

    .line 476
    invoke-direct {v2, v3, v0, v4, v5}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 477
    .line 478
    .line 479
    move-object v0, v2

    .line 480
    goto :goto_a

    .line 481
    :cond_e
    move-object/from16 v9, v16

    .line 482
    .line 483
    goto/16 :goto_0

    .line 484
    .line 485
    :catchall_0
    move-exception v0

    .line 486
    move-object/from16 v16, v9

    .line 487
    .line 488
    :goto_7
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 489
    :try_start_5
    throw v0
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 490
    :catch_3
    move-exception v0

    .line 491
    goto :goto_8

    .line 492
    :catch_4
    move-exception v0

    .line 493
    goto :goto_9

    .line 494
    :catchall_1
    move-exception v0

    .line 495
    goto :goto_7

    .line 496
    :goto_8
    const-string v3, "Got exception trying to get purchases try to reconnect"

    .line 497
    .line 498
    sget-object v4, Ly1/b0;->g:Ly1/e;

    .line 499
    .line 500
    invoke-virtual {v2, v4, v10, v3, v0}, Ly1/b;->p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    goto :goto_a

    .line 505
    :goto_9
    const-string v3, "Got exception trying to get purchases try to reconnect"

    .line 506
    .line 507
    sget-object v4, Ly1/b0;->i:Ly1/e;

    .line 508
    .line 509
    invoke-virtual {v2, v4, v10, v3, v0}, Ly1/b;->p(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Landroidx/emoji2/text/p;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    :goto_a
    iget-object v2, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v2, Ljava/util/List;

    .line 516
    .line 517
    if-eqz v2, :cond_f

    .line 518
    .line 519
    iget-object v3, v1, Ly1/n;->a:La2/d;

    .line 520
    .line 521
    iget-object v0, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, Ly1/e;

    .line 524
    .line 525
    invoke-virtual {v3, v0, v2}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 526
    .line 527
    .line 528
    goto :goto_b

    .line 529
    :cond_f
    iget-object v2, v1, Ly1/n;->a:La2/d;

    .line 530
    .line 531
    iget-object v0, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v0, Ly1/e;

    .line 534
    .line 535
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v2, v0, v3}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 540
    .line 541
    .line 542
    :goto_b
    return-object v16
.end method
