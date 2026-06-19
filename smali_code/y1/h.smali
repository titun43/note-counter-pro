.class public final Ly1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lorg/json/JSONObject;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Ly1/h;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v2, v0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 16
    .line 17
    const-string v1, "productId"

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iput-object v3, v0, Ly1/h;->c:Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "type"

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iput-object v4, v0, Ly1/h;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_e

    .line 38
    .line 39
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_d

    .line 44
    .line 45
    const-string v3, "title"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iput-object v5, v0, Ly1/h;->e:Ljava/lang/String;

    .line 52
    .line 53
    const-string v5, "name"

    .line 54
    .line 55
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    const-string v6, "description"

    .line 59
    .line 60
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    iput-object v7, v0, Ly1/h;->f:Ljava/lang/String;

    .line 65
    .line 66
    const-string v7, "packageDisplayName"

    .line 67
    .line 68
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    const-string v7, "iconUrl"

    .line 72
    .line 73
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    const-string v7, "skuDetailsToken"

    .line 77
    .line 78
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    iput-object v7, v0, Ly1/h;->g:Ljava/lang/String;

    .line 83
    .line 84
    const-string v7, "serializedDocid"

    .line 85
    .line 86
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    iput-object v7, v0, Ly1/h;->h:Ljava/lang/String;

    .line 91
    .line 92
    const-string v7, "subscriptionOfferDetails"

    .line 93
    .line 94
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-ge v9, v10, :cond_6

    .line 111
    .line 112
    new-instance v10, Ly0/c;

    .line 113
    .line 114
    invoke-virtual {v2, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v12, "basePlanId"

    .line 122
    .line 123
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    const-string v13, "offerId"

    .line 127
    .line 128
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string v13, "offerIdToken"

    .line 136
    .line 137
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    const-string v13, "pricingPhases"

    .line 141
    .line 142
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 143
    .line 144
    .line 145
    move-result-object v13

    .line 146
    new-instance v14, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    if-eqz v13, :cond_1

    .line 152
    .line 153
    const/4 v15, 0x0

    .line 154
    :goto_1
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-ge v15, v8, :cond_1

    .line 159
    .line 160
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    if-eqz v8, :cond_0

    .line 165
    .line 166
    new-instance v7, Ly0/c;

    .line 167
    .line 168
    invoke-direct {v7, v8}, Ly0/c;-><init>(Lorg/json/JSONObject;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    :cond_0
    add-int/lit8 v15, v15, 0x1

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_1
    const-string v7, "installmentPlanDetails"

    .line 178
    .line 179
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    if-nez v7, :cond_2

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_2
    const-string v8, "commitmentPaymentsCount"

    .line 187
    .line 188
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    const-string v8, "subsequentCommitmentPaymentsCount"

    .line 192
    .line 193
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    :goto_2
    const-string v7, "transitionPlanDetails"

    .line 197
    .line 198
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    if-nez v7, :cond_3

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_3
    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    const-string v8, "pricingPhase"

    .line 221
    .line 222
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    if-eqz v7, :cond_4

    .line 227
    .line 228
    const-string v8, "billingPeriod"

    .line 229
    .line 230
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    const-string v8, "priceCurrencyCode"

    .line 234
    .line 235
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    const-string v8, "formattedPrice"

    .line 239
    .line 240
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    const-string v8, "priceAmountMicros"

    .line 244
    .line 245
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 246
    .line 247
    .line 248
    const-string v8, "recurrenceMode"

    .line 249
    .line 250
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    const-string v8, "billingCycleCount"

    .line 254
    .line 255
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    :cond_4
    :goto_3
    new-instance v7, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    const-string v8, "offerTags"

    .line 264
    .line 265
    invoke-virtual {v11, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    if-eqz v8, :cond_5

    .line 270
    .line 271
    const/4 v11, 0x0

    .line 272
    :goto_4
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    if-ge v11, v12, :cond_5

    .line 277
    .line 278
    invoke-virtual {v8, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    add-int/lit8 v11, v11, 0x1

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_5
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    add-int/lit8 v9, v9, 0x1

    .line 292
    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_6
    iput-object v4, v0, Ly1/h;->i:Ljava/util/ArrayList;

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_7
    const-string v1, "subs"

    .line 299
    .line 300
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-nez v1, :cond_9

    .line 305
    .line 306
    const-string v1, "play_pass_subs"

    .line 307
    .line 308
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_8

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_8
    const/4 v1, 0x0

    .line 316
    goto :goto_6

    .line 317
    :cond_9
    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 320
    .line 321
    .line 322
    :goto_6
    iput-object v1, v0, Ly1/h;->i:Ljava/util/ArrayList;

    .line 323
    .line 324
    :goto_7
    iget-object v1, v0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 325
    .line 326
    const-string v2, "oneTimePurchaseOfferDetails"

    .line 327
    .line 328
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    iget-object v2, v0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 333
    .line 334
    const-string v3, "oneTimePurchaseOfferDetailsList"

    .line 335
    .line 336
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    new-instance v3, Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 343
    .line 344
    .line 345
    if-eqz v2, :cond_b

    .line 346
    .line 347
    const/4 v8, 0x0

    .line 348
    :goto_8
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-ge v8, v1, :cond_a

    .line 353
    .line 354
    new-instance v1, Ly1/g;

    .line 355
    .line 356
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-direct {v1, v4}, Ly1/g;-><init>(Lorg/json/JSONObject;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    add-int/lit8 v8, v8, 0x1

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_a
    iput-object v3, v0, Ly1/h;->j:Ljava/util/ArrayList;

    .line 370
    .line 371
    return-void

    .line 372
    :cond_b
    if-eqz v1, :cond_c

    .line 373
    .line 374
    new-instance v2, Ly1/g;

    .line 375
    .line 376
    invoke-direct {v2, v1}, Ly1/g;-><init>(Lorg/json/JSONObject;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    iput-object v3, v0, Ly1/h;->j:Ljava/util/ArrayList;

    .line 383
    .line 384
    return-void

    .line 385
    :cond_c
    const/4 v1, 0x0

    .line 386
    iput-object v1, v0, Ly1/h;->j:Ljava/util/ArrayList;

    .line 387
    .line 388
    return-void

    .line 389
    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 390
    .line 391
    const-string v2, "Product type cannot be empty."

    .line 392
    .line 393
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v1

    .line 397
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 398
    .line 399
    const-string v2, "Product id cannot be empty."

    .line 400
    .line 401
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v1
.end method


# virtual methods
.method public final a()Ly1/g;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/h;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ly1/g;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Ly1/h;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Ly1/h;

    .line 12
    .line 13
    iget-object v0, p0, Ly1/h;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, Ly1/h;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Ly1/h;->b:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ly1/h;->i:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "ProductDetails{jsonString=\'"

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "\', parsedJson="

    .line 21
    .line 22
    const-string v4, ", productId=\'"

    .line 23
    .line 24
    iget-object v5, p0, Ly1/h;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v5, v3, v0, v4}, Ls/c;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Ly1/h;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "\', productType=\'"

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Ly1/h;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "\', title=\'"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Ly1/h;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, "\', productDetailsToken=\'"

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v0, "\', subscriptionOfferDetails="

    .line 60
    .line 61
    const-string v3, "}"

    .line 62
    .line 63
    iget-object v4, p0, Ly1/h;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2, v4, v0, v1, v3}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
