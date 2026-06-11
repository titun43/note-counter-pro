.class public abstract Ly/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb3/g;

.field public static final b:Lo/k;

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, La/a;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Ly/l;

    .line 13
    .line 14
    invoke-direct {v0}, Lb3/g;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x1d

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Ly/k;

    .line 25
    .line 26
    invoke-direct {v0}, Lb3/g;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/16 v1, 0x1c

    .line 33
    .line 34
    if-lt v0, v1, :cond_2

    .line 35
    .line 36
    new-instance v0, Ly/j;

    .line 37
    .line 38
    invoke-direct {v0}, Ly/i;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/16 v1, 0x1a

    .line 45
    .line 46
    if-lt v0, v1, :cond_3

    .line 47
    .line 48
    new-instance v0, Ly/i;

    .line 49
    .line 50
    invoke-direct {v0}, Ly/i;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object v0, Ly/h;->e:Ljava/lang/reflect/Method;

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    const-string v1, "TypefaceCompatApi24Impl"

    .line 61
    .line 62
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 63
    .line 64
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    :cond_4
    if-eqz v0, :cond_5

    .line 68
    .line 69
    new-instance v0, Ly/h;

    .line 70
    .line 71
    invoke-direct {v0}, Lb3/g;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    new-instance v0, Ly/g;

    .line 78
    .line 79
    invoke-direct {v0}, Lb3/g;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, Ly/f;->a:Lb3/g;

    .line 83
    .line 84
    :goto_0
    new-instance v0, Lo/k;

    .line 85
    .line 86
    const/16 v1, 0x10

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lo/k;-><init>(I)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Ly/f;->b:Lo/k;

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    sput-object v0, Ly/f;->c:Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public static a(Landroid/content/Context;Lx/d;Landroid/content/res/Resources;ILjava/lang/String;IILk/u0;)Landroid/graphics/Typeface;
    .locals 14

    .line 1
    move/from16 v4, p6

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, p1, Lx/g;

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    if-eqz v2, :cond_13

    .line 10
    .line 11
    move-object v0, p1

    .line 12
    check-cast v0, Lx/g;

    .line 13
    .line 14
    const-string v2, "TypefaceCompat"

    .line 15
    .line 16
    iget-object v5, v0, Lx/g;->d:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    invoke-static {v5}, Ly/f;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    iget-object v5, v0, Lx/g;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-ne v6, v8, :cond_1

    .line 42
    .line 43
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lc0/e;

    .line 48
    .line 49
    iget-object v2, v2, Lc0/e;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v2}, Ly/f;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v10, 0x1f

    .line 60
    .line 61
    if-ge v6, v10, :cond_2

    .line 62
    .line 63
    :goto_0
    move-object v5, v7

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_2
    move v6, v9

    .line 67
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-ge v6, v10, :cond_4

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    check-cast v10, Lc0/e;

    .line 78
    .line 79
    iget-object v10, v10, Lc0/e;->e:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v10}, Ly/f;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    if-nez v10, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object v10, v7

    .line 92
    move v6, v9

    .line 93
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-ge v6, v11, :cond_9

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Lc0/e;

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    sub-int/2addr v12, v8

    .line 110
    if-ne v6, v12, :cond_5

    .line 111
    .line 112
    iget-object v12, v11, Lc0/e;->f:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_5

    .line 119
    .line 120
    iget-object v2, v11, Lc0/e;->e:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v10, v2}, Lf0/h1;->o(Landroid/graphics/Typeface$CustomFallbackBuilder;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_5
    iget-object v12, v11, Lc0/e;->e:Ljava/lang/String;

    .line 127
    .line 128
    iget-object v13, v11, Lc0/e;->f:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v12}, Ly/f;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    invoke-static {v12}, Ly/f;->d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    if-nez v12, :cond_6

    .line 139
    .line 140
    new-instance v5, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v6, "Unable identify the primary font for "

    .line 143
    .line 144
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v6, v11, Lc0/e;->e:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v6, ". Falling back to provider font."

    .line 153
    .line 154
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_6
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-eqz v11, :cond_7

    .line 170
    .line 171
    :try_start_0
    invoke-static {}, Lf0/h1;->m()V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Lf0/h1;->v()V

    .line 175
    .line 176
    .line 177
    invoke-static {v12}, Ly/e;->a(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    invoke-static {v11, v13}, Lf0/h1;->e(Landroid/graphics/fonts/Font$Builder;Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-static {v11}, Lf0/h1;->f(Landroid/graphics/fonts/Font$Builder;)Landroid/graphics/fonts/Font;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-static {v11}, Lf0/h1;->g(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-static {v11}, Lf0/h1;->h(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    .line 194
    .line 195
    .line 196
    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_3

    .line 198
    :catch_0
    const-string v5, "Failed to clone Font instance. Fall back to provider font."

    .line 199
    .line 200
    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_7
    invoke-static {v12}, Lf0/h1;->g(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-static {v11}, Lf0/h1;->h(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    :goto_3
    if-nez v10, :cond_8

    .line 214
    .line 215
    invoke-static {v11}, Lf0/h1;->c(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    goto :goto_4

    .line 220
    :cond_8
    invoke-static {v10, v11}, Lf0/h1;->n(Landroid/graphics/Typeface$CustomFallbackBuilder;Landroid/graphics/fonts/FontFamily;)V

    .line 221
    .line 222
    .line 223
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_9
    :goto_5
    invoke-static {v10}, Lf0/h1;->d(Landroid/graphics/Typeface$CustomFallbackBuilder;)Landroid/graphics/Typeface;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    :goto_6
    if-eqz v5, :cond_a

    .line 232
    .line 233
    new-instance p0, Landroid/os/Handler;

    .line 234
    .line 235
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 240
    .line 241
    .line 242
    new-instance v0, La2/b;

    .line 243
    .line 244
    invoke-direct {v0, v3, v1, v5}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 248
    .line 249
    .line 250
    sget-object p0, Ly/f;->b:Lo/k;

    .line 251
    .line 252
    invoke-static/range {p2 .. p6}, Ly/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p0, v0, v5}, Lo/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    return-object v5

    .line 260
    :cond_a
    iget v2, v0, Lx/g;->c:I

    .line 261
    .line 262
    if-nez v2, :cond_b

    .line 263
    .line 264
    move v2, v8

    .line 265
    goto :goto_7

    .line 266
    :cond_b
    move v2, v9

    .line 267
    :goto_7
    iget v6, v0, Lx/g;->b:I

    .line 268
    .line 269
    new-instance v3, Landroid/os/Handler;

    .line 270
    .line 271
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 276
    .line 277
    .line 278
    new-instance v5, Lu1/f;

    .line 279
    .line 280
    invoke-direct {v5}, Lu1/f;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v1, v5, Lu1/f;->h:Ljava/lang/Object;

    .line 284
    .line 285
    iget-object v0, v0, Lx/g;->a:Ljava/util/ArrayList;

    .line 286
    .line 287
    new-instance v10, Landroidx/emoji2/text/p;

    .line 288
    .line 289
    new-instance v1, Lb0/d;

    .line 290
    .line 291
    invoke-direct {v1, v3, v8}, Lb0/d;-><init>(Landroid/os/Handler;I)V

    .line 292
    .line 293
    .line 294
    const/4 v3, 0x3

    .line 295
    invoke-direct {v10, v3, v5, v1}, Landroidx/emoji2/text/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    if-eqz v2, :cond_f

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-gt v2, v8, :cond_e

    .line 305
    .line 306
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object v3, v0

    .line 311
    check-cast v3, Lc0/e;

    .line 312
    .line 313
    sget-object v0, Lc0/i;->a:Lo/k;

    .line 314
    .line 315
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v2, Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    .line 323
    .line 324
    aget-object v0, v0, v9

    .line 325
    .line 326
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v4, v0}, Lc0/i;->a(ILjava/util/List;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    sget-object v2, Lc0/i;->a:Lo/k;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Lo/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    check-cast v2, Landroid/graphics/Typeface;

    .line 347
    .line 348
    if-eqz v2, :cond_c

    .line 349
    .line 350
    new-instance p0, Lc0/a;

    .line 351
    .line 352
    invoke-direct {p0, v9, v5, v2}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1, p0}, Lb0/d;->execute(Ljava/lang/Runnable;)V

    .line 356
    .line 357
    .line 358
    move-object v7, v2

    .line 359
    goto/16 :goto_b

    .line 360
    .line 361
    :cond_c
    const/4 v1, -0x1

    .line 362
    if-ne v6, v1, :cond_d

    .line 363
    .line 364
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    new-instance v2, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 371
    .line 372
    .line 373
    aget-object v1, v1, v9

    .line 374
    .line 375
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-static {v0, p0, v1, v4}, Lc0/i;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lc0/h;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    invoke-virtual {v10, p0}, Landroidx/emoji2/text/p;->C(Lc0/h;)V

    .line 390
    .line 391
    .line 392
    iget-object v7, p0, Lc0/h;->a:Landroid/graphics/Typeface;

    .line 393
    .line 394
    goto/16 :goto_b

    .line 395
    .line 396
    :cond_d
    move-object v1, v0

    .line 397
    new-instance v0, Lc0/f;

    .line 398
    .line 399
    const/4 v5, 0x0

    .line 400
    move-object v2, p0

    .line 401
    invoke-direct/range {v0 .. v5}, Lc0/f;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 402
    .line 403
    .line 404
    :try_start_1
    sget-object p0, Lc0/i;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 405
    .line 406
    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 407
    .line 408
    .line 409
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    .line 410
    int-to-long v0, v6

    .line 411
    :try_start_2
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 412
    .line 413
    invoke-interface {p0, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 417
    :try_start_3
    check-cast p0, Lc0/h;

    .line 418
    .line 419
    invoke-virtual {v10, p0}, Landroidx/emoji2/text/p;->C(Lc0/h;)V

    .line 420
    .line 421
    .line 422
    iget-object v7, p0, Lc0/h;->a:Landroid/graphics/Typeface;

    .line 423
    .line 424
    goto/16 :goto_b

    .line 425
    .line 426
    :catch_1
    move-exception v0

    .line 427
    move-object p0, v0

    .line 428
    goto :goto_8

    .line 429
    :catch_2
    move-exception v0

    .line 430
    move-object p0, v0

    .line 431
    goto :goto_9

    .line 432
    :catch_3
    new-instance p0, Ljava/lang/InterruptedException;

    .line 433
    .line 434
    const-string v0, "timeout"

    .line 435
    .line 436
    invoke-direct {p0, v0}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw p0

    .line 440
    :goto_8
    throw p0

    .line 441
    :goto_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 442
    .line 443
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 447
    :catch_4
    iget-object p0, v10, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast p0, Lb0/d;

    .line 450
    .line 451
    iget-object v0, v10, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Lu1/f;

    .line 454
    .line 455
    new-instance v1, Landroidx/fragment/app/o;

    .line 456
    .line 457
    const/4 v2, -0x3

    .line 458
    invoke-direct {v1, v0, v2}, Landroidx/fragment/app/o;-><init>(Lu1/f;I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {p0, v1}, Lb0/d;->execute(Ljava/lang/Runnable;)V

    .line 462
    .line 463
    .line 464
    goto/16 :goto_b

    .line 465
    .line 466
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 467
    .line 468
    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 469
    .line 470
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw p0

    .line 474
    :cond_f
    invoke-static {v4, v0}, Lc0/i;->a(ILjava/util/List;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    sget-object v3, Lc0/i;->a:Lo/k;

    .line 479
    .line 480
    invoke-virtual {v3, v2}, Lo/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    check-cast v3, Landroid/graphics/Typeface;

    .line 485
    .line 486
    if-eqz v3, :cond_10

    .line 487
    .line 488
    new-instance p0, Lc0/a;

    .line 489
    .line 490
    invoke-direct {p0, v9, v5, v3}, Lc0/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, p0}, Lb0/d;->execute(Ljava/lang/Runnable;)V

    .line 494
    .line 495
    .line 496
    move-object v7, v3

    .line 497
    goto :goto_b

    .line 498
    :cond_10
    new-instance v1, Lc0/g;

    .line 499
    .line 500
    invoke-direct {v1, v10, v9}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 501
    .line 502
    .line 503
    sget-object v5, Lc0/i;->c:Ljava/lang/Object;

    .line 504
    .line 505
    monitor-enter v5

    .line 506
    :try_start_4
    sget-object v3, Lc0/i;->d:Lo/l;

    .line 507
    .line 508
    invoke-virtual {v3, v2}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v6

    .line 512
    check-cast v6, Ljava/util/ArrayList;

    .line 513
    .line 514
    if-eqz v6, :cond_11

    .line 515
    .line 516
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    monitor-exit v5

    .line 520
    goto :goto_b

    .line 521
    :catchall_0
    move-exception v0

    .line 522
    move-object p0, v0

    .line 523
    goto :goto_c

    .line 524
    :cond_11
    new-instance v6, Ljava/util/ArrayList;

    .line 525
    .line 526
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v2, v6}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 536
    move-object v3, v0

    .line 537
    new-instance v0, Lc0/f;

    .line 538
    .line 539
    const/4 v5, 0x1

    .line 540
    move-object v1, v2

    .line 541
    move-object v2, p0

    .line 542
    invoke-direct/range {v0 .. v5}, Lc0/f;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 543
    .line 544
    .line 545
    sget-object p0, Lc0/i;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 546
    .line 547
    new-instance v2, Lc0/g;

    .line 548
    .line 549
    invoke-direct {v2, v1, v8}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 550
    .line 551
    .line 552
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-nez v1, :cond_12

    .line 557
    .line 558
    new-instance v1, Landroid/os/Handler;

    .line 559
    .line 560
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 565
    .line 566
    .line 567
    goto :goto_a

    .line 568
    :cond_12
    new-instance v1, Landroid/os/Handler;

    .line 569
    .line 570
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 571
    .line 572
    .line 573
    :goto_a
    new-instance v3, Lc0/n;

    .line 574
    .line 575
    invoke-direct {v3, v9}, Lc0/n;-><init>(I)V

    .line 576
    .line 577
    .line 578
    iput-object v0, v3, Lc0/n;->h:Ljava/lang/Object;

    .line 579
    .line 580
    iput-object v2, v3, Lc0/n;->i:Ljava/lang/Object;

    .line 581
    .line 582
    iput-object v1, v3, Lc0/n;->j:Ljava/lang/Object;

    .line 583
    .line 584
    invoke-virtual {p0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 585
    .line 586
    .line 587
    :goto_b
    move-object/from16 v6, p2

    .line 588
    .line 589
    goto :goto_d

    .line 590
    :goto_c
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 591
    throw p0

    .line 592
    :cond_13
    sget-object v5, Ly/f;->a:Lb3/g;

    .line 593
    .line 594
    move-object v0, p1

    .line 595
    check-cast v0, Lx/e;

    .line 596
    .line 597
    move-object/from16 v6, p2

    .line 598
    .line 599
    invoke-virtual {v5, p0, v0, v6, v4}, Lb3/g;->h(Landroid/content/Context;Lx/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 600
    .line 601
    .line 602
    move-result-object v7

    .line 603
    if-eqz v7, :cond_14

    .line 604
    .line 605
    new-instance p0, Landroid/os/Handler;

    .line 606
    .line 607
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 612
    .line 613
    .line 614
    new-instance v0, La2/b;

    .line 615
    .line 616
    invoke-direct {v0, v3, v1, v7}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 620
    .line 621
    .line 622
    goto :goto_d

    .line 623
    :cond_14
    invoke-virtual {v1}, Lk/u0;->a()V

    .line 624
    .line 625
    .line 626
    :goto_d
    if-eqz v7, :cond_15

    .line 627
    .line 628
    sget-object p0, Ly/f;->b:Lo/k;

    .line 629
    .line 630
    invoke-static/range {p2 .. p6}, Ly/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual {p0, v0, v7}, Lo/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    :cond_15
    return-object v7
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Ly/f;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ly/f;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Ly/f;->c:Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v1, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Ly/f;->c:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    sget-object p0, Ly/f;->c:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/g;->g(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/g;->a(Landroid/graphics/text/PositionedGlyphs;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {p0}, Ly/e;->b(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
