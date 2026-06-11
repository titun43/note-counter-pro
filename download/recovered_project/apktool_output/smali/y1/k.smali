.class public final synthetic Ly1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly1/b;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ly1/b;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ly1/k;->a:I

    iput-object p1, p0, Ly1/k;->b:Ly1/b;

    iput-object p2, p0, Ly1/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Ly1/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ly1/k;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ly1/k;->b:Ly1/b;

    .line 9
    .line 10
    iget-object v2, v1, Ly1/k;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v6, v2

    .line 13
    check-cast v6, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, v1, Ly1/k;->d:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v7, v2

    .line 18
    check-cast v7, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x5

    .line 21
    :try_start_0
    iget-object v3, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v3
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    move-object v4, v3

    .line 25
    :try_start_1
    iget-object v3, v0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 26
    .line 27
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    :try_start_2
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 31
    .line 32
    const/16 v3, 0x77

    .line 33
    .line 34
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzn(Ly1/e;I)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_2

    .line 39
    :catch_0
    move-exception v0

    .line 40
    goto :goto_0

    .line 41
    :catch_1
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v0, v0, Ly1/b;->f:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v4, 0x3

    .line 51
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/zzan;->zzf(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 55
    goto :goto_2

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :try_start_4
    throw v0
    :try_end_4
    .catch Landroid/os/DeadObjectException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 59
    :goto_0
    sget-object v3, Ly1/b0;->g:Ly1/e;

    .line 60
    .line 61
    invoke-static {v0}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v3, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzo(Ly1/e;ILjava/lang/String;)Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    sget-object v3, Ly1/b0;->i:Ly1/e;

    .line 71
    .line 72
    invoke-static {v0}, Ly1/z;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v3, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzo(Ly1/e;ILjava/lang/String;)Landroid/os/Bundle;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_2
    return-object v0

    .line 81
    :pswitch_0
    iget-object v2, v1, Ly1/k;->b:Ly1/b;

    .line 82
    .line 83
    iget-object v0, v1, Ly1/k;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lu1/f;

    .line 86
    .line 87
    new-instance v3, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iget-object v4, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Ly1/j;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-string v8, "inapp"

    .line 107
    .line 108
    iget-object v0, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzco;

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    const/4 v5, 0x0

    .line 117
    :goto_3
    const/4 v12, 0x0

    .line 118
    if-ge v5, v4, :cond_e

    .line 119
    .line 120
    add-int/lit8 v13, v5, 0x14

    .line 121
    .line 122
    if-le v13, v4, :cond_1

    .line 123
    .line 124
    move v6, v4

    .line 125
    goto :goto_4

    .line 126
    :cond_1
    move v6, v13

    .line 127
    :goto_4
    new-instance v7, Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-interface {v0, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 134
    .line 135
    .line 136
    new-instance v5, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    const/4 v9, 0x0

    .line 146
    :goto_5
    if-ge v9, v6, :cond_2

    .line 147
    .line 148
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, Ly1/j;

    .line 153
    .line 154
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const-string v10, "note_counter_pro_premium"

    .line 158
    .line 159
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    add-int/lit8 v9, v9, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_2
    new-instance v9, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v6, "ITEM_ID_LIST"

    .line 171
    .line 172
    invoke-virtual {v9, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 173
    .line 174
    .line 175
    iget-object v5, v2, Ly1/b;->c:Ljava/lang/String;

    .line 176
    .line 177
    const-string v6, "playBillingLibraryVersion"

    .line 178
    .line 179
    invoke-virtual {v9, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :try_start_5
    iget-object v5, v2, Ly1/b;->a:Ljava/lang/Object;

    .line 183
    .line 184
    monitor-enter v5
    :try_end_5
    .catch Landroid/os/DeadObjectException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 185
    move-object v6, v5

    .line 186
    :try_start_6
    iget-object v5, v2, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 187
    .line 188
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 189
    if-nez v5, :cond_3

    .line 190
    .line 191
    :try_start_7
    sget-object v0, Ly1/b0;->i:Ly1/e;

    .line 192
    .line 193
    const-string v3, "Service has been reset to null."

    .line 194
    .line 195
    const/16 v4, 0x77

    .line 196
    .line 197
    invoke-virtual {v2, v0, v4, v3, v12}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    goto/16 :goto_b

    .line 202
    .line 203
    :catch_2
    move-exception v0

    .line 204
    goto/16 :goto_9

    .line 205
    .line 206
    :catch_3
    move-exception v0

    .line 207
    const/16 v5, 0x2b

    .line 208
    .line 209
    goto/16 :goto_a

    .line 210
    .line 211
    :cond_3
    iget-boolean v6, v2, Ly1/b;->s:Z

    .line 212
    .line 213
    const/4 v10, 0x1

    .line 214
    if-eq v10, v6, :cond_4

    .line 215
    .line 216
    const/16 v6, 0x11

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_4
    const/16 v6, 0x14

    .line 220
    .line 221
    :goto_6
    iget-object v15, v2, Ly1/b;->f:Landroid/content/Context;

    .line 222
    .line 223
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    iget-boolean v11, v2, Ly1/b;->r:Z

    .line 228
    .line 229
    if-eqz v11, :cond_5

    .line 230
    .line 231
    iget-object v11, v2, Ly1/b;->u:Ly0/c;

    .line 232
    .line 233
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    :cond_5
    iget-object v11, v2, Ly1/b;->c:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v2}, Ly1/b;->h()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Ly1/b;->h()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ly1/b;->h()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ly1/b;->h()V

    .line 248
    .line 249
    .line 250
    iget-object v14, v2, Ly1/b;->y:Ljava/lang/Long;

    .line 251
    .line 252
    move/from16 v17, v13

    .line 253
    .line 254
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v12

    .line 258
    new-instance v14, Landroid/os/Bundle;

    .line 259
    .line 260
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-static {v14, v11, v12, v13}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 264
    .line 265
    .line 266
    const-string v11, "enablePendingPurchases"

    .line 267
    .line 268
    invoke-virtual {v14, v11, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 269
    .line 270
    .line 271
    const-string v11, "SKU_DETAILS_RESPONSE_FORMAT"

    .line 272
    .line 273
    const-string v12, "PRODUCT_DETAILS"

    .line 274
    .line 275
    invoke-virtual {v14, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    new-instance v11, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    new-instance v12, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    move/from16 v18, v10

    .line 293
    .line 294
    const/4 v10, 0x0

    .line 295
    const/16 v19, 0x0

    .line 296
    .line 297
    :goto_7
    if-ge v10, v13, :cond_6

    .line 298
    .line 299
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v20

    .line 303
    check-cast v20, Ly1/j;

    .line 304
    .line 305
    move/from16 v21, v4

    .line 306
    .line 307
    const/4 v4, 0x0

    .line 308
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result v22

    .line 315
    xor-int/lit8 v4, v22, 0x1

    .line 316
    .line 317
    or-int v19, v19, v4

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    add-int/lit8 v10, v10, 0x1

    .line 323
    .line 324
    move/from16 v4, v21

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_6
    move/from16 v21, v4

    .line 328
    .line 329
    if-eqz v19, :cond_7

    .line 330
    .line 331
    const-string v4, "SKU_OFFER_ID_TOKEN_LIST"

    .line 332
    .line 333
    invoke-virtual {v14, v4, v11}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 334
    .line 335
    .line 336
    :cond_7
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-nez v4, :cond_8

    .line 341
    .line 342
    const-string v4, "SKU_SERIALIZED_DOCID_LIST"

    .line 343
    .line 344
    invoke-virtual {v14, v4, v12}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 345
    .line 346
    .line 347
    :cond_8
    move-object v10, v14

    .line 348
    move-object v7, v15

    .line 349
    invoke-interface/range {v5 .. v10}, Lcom/google/android/gms/internal/play_billing/zzan;->zzl(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 350
    .line 351
    .line 352
    move-result-object v4
    :try_end_7
    .catch Landroid/os/DeadObjectException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 353
    if-nez v4, :cond_9

    .line 354
    .line 355
    const-string v0, "queryProductDetailsAsync got empty product details response."

    .line 356
    .line 357
    sget-object v3, Ly1/b0;->o:Ly1/e;

    .line 358
    .line 359
    const/16 v4, 0x2c

    .line 360
    .line 361
    const/4 v5, 0x0

    .line 362
    invoke-virtual {v2, v3, v4, v0, v5}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    goto/16 :goto_b

    .line 367
    .line 368
    :cond_9
    const-string v5, "DETAILS_LIST"

    .line 369
    .line 370
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    const/4 v6, 0x6

    .line 375
    if-nez v5, :cond_b

    .line 376
    .line 377
    const-string v0, "BillingClient"

    .line 378
    .line 379
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    const-string v3, "BillingClient"

    .line 384
    .line 385
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    if-eqz v0, :cond_a

    .line 390
    .line 391
    invoke-static {v0, v3}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    const-string v4, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    .line 396
    .line 397
    invoke-static {v0, v4}, Landroidx/emoji2/text/u;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const/16 v4, 0x17

    .line 402
    .line 403
    const/4 v5, 0x0

    .line 404
    invoke-virtual {v2, v3, v4, v0, v5}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    goto/16 :goto_b

    .line 409
    .line 410
    :cond_a
    const/4 v5, 0x0

    .line 411
    invoke-static {v6, v3}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    const/16 v3, 0x2d

    .line 416
    .line 417
    const-string v4, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 418
    .line 419
    invoke-virtual {v2, v0, v3, v4, v5}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    goto/16 :goto_b

    .line 424
    .line 425
    :cond_b
    const-string v5, "DETAILS_LIST"

    .line 426
    .line 427
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    if-eqz v4, :cond_d

    .line 432
    .line 433
    const/4 v5, 0x0

    .line 434
    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    if-ge v5, v7, :cond_c

    .line 439
    .line 440
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    check-cast v7, Ljava/lang/String;

    .line 445
    .line 446
    :try_start_8
    new-instance v9, Ly1/h;

    .line 447
    .line 448
    invoke-direct {v9, v7}, Ly1/h;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_4

    .line 449
    .line 450
    .line 451
    invoke-virtual {v9}, Ly1/h;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    const-string v10, "Got product details: "

    .line 456
    .line 457
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    const-string v10, "BillingClient"

    .line 462
    .line 463
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    add-int/lit8 v5, v5, 0x1

    .line 470
    .line 471
    goto :goto_8

    .line 472
    :catch_4
    move-exception v0

    .line 473
    const-string v3, "Error trying to decode SkuDetails."

    .line 474
    .line 475
    invoke-static {v6, v3}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    const/16 v4, 0x2f

    .line 480
    .line 481
    const-string v5, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 482
    .line 483
    invoke-virtual {v2, v3, v4, v5, v0}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    goto :goto_b

    .line 488
    :cond_c
    move/from16 v5, v17

    .line 489
    .line 490
    move/from16 v4, v21

    .line 491
    .line 492
    goto/16 :goto_3

    .line 493
    .line 494
    :cond_d
    const-string v0, "queryProductDetailsAsync got null response list"

    .line 495
    .line 496
    sget-object v3, Ly1/b0;->o:Ly1/e;

    .line 497
    .line 498
    const/16 v4, 0x2e

    .line 499
    .line 500
    const/4 v5, 0x0

    .line 501
    invoke-virtual {v2, v3, v4, v0, v5}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    goto :goto_b

    .line 506
    :catchall_1
    move-exception v0

    .line 507
    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 508
    :try_start_a
    throw v0
    :try_end_a
    .catch Landroid/os/DeadObjectException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 509
    :goto_9
    const-string v3, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 510
    .line 511
    sget-object v4, Ly1/b0;->g:Ly1/e;

    .line 512
    .line 513
    const/16 v5, 0x2b

    .line 514
    .line 515
    invoke-virtual {v2, v4, v5, v3, v0}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    goto :goto_b

    .line 520
    :goto_a
    const-string v3, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 521
    .line 522
    sget-object v4, Ly1/b0;->i:Ly1/e;

    .line 523
    .line 524
    invoke-virtual {v2, v4, v5, v3, v0}, Ly1/b;->o(Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)Li3/a;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    goto :goto_b

    .line 529
    :cond_e
    const-string v0, ""

    .line 530
    .line 531
    new-instance v2, Li3/a;

    .line 532
    .line 533
    const/4 v4, 0x0

    .line 534
    invoke-direct {v2, v4, v0, v3}, Li3/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 535
    .line 536
    .line 537
    move-object v0, v2

    .line 538
    :goto_b
    iget v2, v0, Li3/a;->a:I

    .line 539
    .line 540
    iget-object v3, v0, Li3/a;->c:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v3, Ljava/lang/String;

    .line 543
    .line 544
    invoke-static {v2, v3}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    iget-object v0, v0, Li3/a;->b:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Ljava/util/ArrayList;

    .line 551
    .line 552
    iget-object v3, v1, Ly1/k;->d:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v3, Lcom/getcapacitor/plugin/c;

    .line 555
    .line 556
    invoke-virtual {v3, v2, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 557
    .line 558
    .line 559
    const/16 v16, 0x0

    .line 560
    .line 561
    return-object v16

    .line 562
    :pswitch_1
    iget-object v2, v1, Ly1/k;->b:Ly1/b;

    .line 563
    .line 564
    iget-object v0, v1, Ly1/k;->c:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Landroidx/emoji2/text/r;

    .line 567
    .line 568
    iget-object v3, v1, Ly1/k;->d:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v3, La2/c;

    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    const-string v4, "Error consuming purchase with token. Response code: "

    .line 576
    .line 577
    const-string v5, "Consuming purchase with token: "

    .line 578
    .line 579
    iget-object v6, v0, Landroidx/emoji2/text/r;->h:Ljava/lang/String;

    .line 580
    .line 581
    :try_start_b
    const-string v0, "BillingClient"

    .line 582
    .line 583
    new-instance v7, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    iget-object v5, v2, Ly1/b;->a:Ljava/lang/Object;

    .line 599
    .line 600
    monitor-enter v5
    :try_end_b
    .catch Landroid/os/DeadObjectException; {:try_start_b .. :try_end_b} :catch_10
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_f

    .line 601
    :try_start_c
    iget-object v0, v2, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 602
    .line 603
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 604
    if-nez v0, :cond_f

    .line 605
    .line 606
    :try_start_d
    sget-object v5, Ly1/b0;->i:Ly1/e;

    .line 607
    .line 608
    const-string v7, "Service has been reset to null."
    :try_end_d
    .catch Landroid/os/DeadObjectException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    .line 609
    .line 610
    const/4 v8, 0x0

    .line 611
    move-object v4, v6

    .line 612
    const/16 v6, 0x77

    .line 613
    .line 614
    :try_start_e
    invoke-virtual/range {v2 .. v8}, Ly1/b;->q(La2/c;Ljava/lang/String;Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)V
    :try_end_e
    .catch Landroid/os/DeadObjectException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    .line 615
    .line 616
    .line 617
    goto/16 :goto_15

    .line 618
    .line 619
    :catch_5
    move-exception v0

    .line 620
    move-object v5, v4

    .line 621
    :goto_c
    move-object v8, v0

    .line 622
    goto/16 :goto_13

    .line 623
    .line 624
    :catch_6
    move-exception v0

    .line 625
    move-object v5, v4

    .line 626
    :goto_d
    move-object v8, v0

    .line 627
    goto/16 :goto_14

    .line 628
    .line 629
    :catch_7
    move-exception v0

    .line 630
    move-object v5, v6

    .line 631
    :goto_e
    move-object v8, v0

    .line 632
    move-object v4, v5

    .line 633
    goto/16 :goto_13

    .line 634
    .line 635
    :catch_8
    move-exception v0

    .line 636
    move-object v5, v6

    .line 637
    :goto_f
    move-object v8, v0

    .line 638
    move-object v4, v5

    .line 639
    goto/16 :goto_14

    .line 640
    .line 641
    :cond_f
    move-object v5, v6

    .line 642
    :try_start_f
    iget-boolean v6, v2, Ly1/b;->m:Z
    :try_end_f
    .catch Landroid/os/DeadObjectException; {:try_start_f .. :try_end_f} :catch_e
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d

    .line 643
    .line 644
    if-eqz v6, :cond_11

    .line 645
    .line 646
    :try_start_10
    iget-object v6, v2, Ly1/b;->f:Landroid/content/Context;

    .line 647
    .line 648
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    iget-boolean v7, v2, Ly1/b;->m:Z

    .line 653
    .line 654
    iget-object v8, v2, Ly1/b;->c:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v9, v2, Ly1/b;->y:Ljava/lang/Long;

    .line 657
    .line 658
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 659
    .line 660
    .line 661
    move-result-wide v9

    .line 662
    new-instance v11, Landroid/os/Bundle;

    .line 663
    .line 664
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 665
    .line 666
    .line 667
    if-eqz v7, :cond_10

    .line 668
    .line 669
    invoke-static {v11, v8, v9, v10}, Lcom/google/android/gms/internal/play_billing/zze;->zzc(Landroid/os/Bundle;Ljava/lang/String;J)Landroid/os/Bundle;

    .line 670
    .line 671
    .line 672
    goto :goto_10

    .line 673
    :catch_9
    move-exception v0

    .line 674
    goto :goto_e

    .line 675
    :catch_a
    move-exception v0

    .line 676
    goto :goto_f

    .line 677
    :cond_10
    :goto_10
    const/16 v7, 0x9

    .line 678
    .line 679
    invoke-interface {v0, v7, v6, v5, v11}, Lcom/google/android/gms/internal/play_billing/zzan;->zze(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    const-string v6, "RESPONSE_CODE"

    .line 684
    .line 685
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 686
    .line 687
    .line 688
    move-result v6

    .line 689
    const-string v7, "BillingClient"

    .line 690
    .line 691
    invoke-static {v0, v7}, Lcom/google/android/gms/internal/play_billing/zze;->zzh(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v0
    :try_end_10
    .catch Landroid/os/DeadObjectException; {:try_start_10 .. :try_end_10} :catch_a
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_9

    .line 695
    goto :goto_11

    .line 696
    :cond_11
    :try_start_11
    iget-object v6, v2, Ly1/b;->f:Landroid/content/Context;

    .line 697
    .line 698
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v6

    .line 702
    const/4 v7, 0x3

    .line 703
    invoke-interface {v0, v7, v6, v5}, Lcom/google/android/gms/internal/play_billing/zzan;->zza(ILjava/lang/String;Ljava/lang/String;)I

    .line 704
    .line 705
    .line 706
    move-result v6

    .line 707
    const-string v0, ""

    .line 708
    .line 709
    :goto_11
    invoke-static {v6, v0}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 710
    .line 711
    .line 712
    move-result-object v0
    :try_end_11
    .catch Landroid/os/DeadObjectException; {:try_start_11 .. :try_end_11} :catch_e
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_d

    .line 713
    if-nez v6, :cond_12

    .line 714
    .line 715
    :try_start_12
    const-string v4, "BillingClient"

    .line 716
    .line 717
    const-string v6, "Successfully consumed purchase."

    .line 718
    .line 719
    invoke-static {v4, v6}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v3, v0, v5}, La2/c;->b(Ly1/e;Ljava/lang/String;)V
    :try_end_12
    .catch Landroid/os/DeadObjectException; {:try_start_12 .. :try_end_12} :catch_a
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_9

    .line 723
    .line 724
    .line 725
    goto :goto_15

    .line 726
    :cond_12
    :try_start_13
    new-instance v7, Ljava/lang/StringBuilder;

    .line 727
    .line 728
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v7
    :try_end_13
    .catch Landroid/os/DeadObjectException; {:try_start_13 .. :try_end_13} :catch_e
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_d

    .line 738
    const/4 v8, 0x0

    .line 739
    const/16 v6, 0x17

    .line 740
    .line 741
    move-object v4, v5

    .line 742
    move-object v5, v0

    .line 743
    :try_start_14
    invoke-virtual/range {v2 .. v8}, Ly1/b;->q(La2/c;Ljava/lang/String;Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)V
    :try_end_14
    .catch Landroid/os/DeadObjectException; {:try_start_14 .. :try_end_14} :catch_c
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_b

    .line 744
    .line 745
    .line 746
    goto :goto_15

    .line 747
    :catch_b
    move-exception v0

    .line 748
    goto :goto_c

    .line 749
    :catch_c
    move-exception v0

    .line 750
    goto :goto_d

    .line 751
    :catch_d
    move-exception v0

    .line 752
    move-object v4, v5

    .line 753
    goto/16 :goto_c

    .line 754
    .line 755
    :catch_e
    move-exception v0

    .line 756
    move-object v4, v5

    .line 757
    goto/16 :goto_d

    .line 758
    .line 759
    :catchall_2
    move-exception v0

    .line 760
    move-object v4, v6

    .line 761
    :goto_12
    :try_start_15
    monitor-exit v5
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 762
    :try_start_16
    throw v0
    :try_end_16
    .catch Landroid/os/DeadObjectException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_b

    .line 763
    :catchall_3
    move-exception v0

    .line 764
    goto :goto_12

    .line 765
    :catch_f
    move-exception v0

    .line 766
    move-object v4, v6

    .line 767
    goto/16 :goto_c

    .line 768
    .line 769
    :catch_10
    move-exception v0

    .line 770
    move-object v4, v6

    .line 771
    goto/16 :goto_d

    .line 772
    .line 773
    :goto_13
    const-string v7, "Error consuming purchase!"

    .line 774
    .line 775
    sget-object v5, Ly1/b0;->g:Ly1/e;

    .line 776
    .line 777
    const/16 v6, 0x1d

    .line 778
    .line 779
    invoke-virtual/range {v2 .. v8}, Ly1/b;->q(La2/c;Ljava/lang/String;Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)V

    .line 780
    .line 781
    .line 782
    goto :goto_15

    .line 783
    :goto_14
    const-string v7, "Error consuming purchase!"

    .line 784
    .line 785
    sget-object v5, Ly1/b0;->i:Ly1/e;

    .line 786
    .line 787
    const/16 v6, 0x1d

    .line 788
    .line 789
    invoke-virtual/range {v2 .. v8}, Ly1/b;->q(La2/c;Ljava/lang/String;Ly1/e;ILjava/lang/String;Ljava/lang/Exception;)V

    .line 790
    .line 791
    .line 792
    :goto_15
    const/4 v0, 0x0

    .line 793
    return-object v0

    .line 794
    nop

    .line 795
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
