.class public final Landroidx/lifecycle/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/Class;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Lc1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    const-class v28, Landroid/util/Size;

    .line 2
    .line 3
    const-class v29, Landroid/util/SizeF;

    .line 4
    .line 5
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const-class v2, [Z

    .line 8
    .line 9
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const-class v4, [D

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v6, [I

    .line 16
    .line 17
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    const-class v8, [J

    .line 20
    .line 21
    const-class v9, Ljava/lang/String;

    .line 22
    .line 23
    const-class v10, [Ljava/lang/String;

    .line 24
    .line 25
    const-class v11, Landroid/os/Binder;

    .line 26
    .line 27
    const-class v12, Landroid/os/Bundle;

    .line 28
    .line 29
    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v14, [B

    .line 32
    .line 33
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v16, [C

    .line 36
    .line 37
    const-class v17, Ljava/lang/CharSequence;

    .line 38
    .line 39
    const-class v18, [Ljava/lang/CharSequence;

    .line 40
    .line 41
    const-class v19, Ljava/util/ArrayList;

    .line 42
    .line 43
    sget-object v20, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-class v21, [F

    .line 46
    .line 47
    const-class v22, Landroid/os/Parcelable;

    .line 48
    .line 49
    const-class v23, [Landroid/os/Parcelable;

    .line 50
    .line 51
    const-class v24, Ljava/io/Serializable;

    .line 52
    .line 53
    sget-object v25, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    const-class v26, [S

    .line 56
    .line 57
    const-class v27, Landroid/util/SparseArray;

    .line 58
    .line 59
    filled-new-array/range {v1 .. v29}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Landroidx/lifecycle/j0;->f:[Ljava/lang/Class;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->b:Ljava/util/LinkedHashMap;

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->c:Ljava/util/LinkedHashMap;

    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->d:Ljava/util/LinkedHashMap;

    .line 13
    new-instance v0, Landroidx/activity/i;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Landroidx/activity/i;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/lifecycle/j0;->e:Lc1/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/j0;->b:Ljava/util/LinkedHashMap;

    .line 4
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/j0;->c:Ljava/util/LinkedHashMap;

    .line 5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/j0;->d:Ljava/util/LinkedHashMap;

    .line 6
    new-instance v1, Landroidx/activity/i;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Landroidx/activity/i;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Landroidx/lifecycle/j0;->e:Lc1/c;

    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static a(Landroidx/lifecycle/j0;)Landroid/os/Bundle;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/j0;->b:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v2, "<this>"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v1, "with(...)"

    .line 57
    .line 58
    invoke-static {v2, v1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v2, Lu3/p;->g:Lu3/p;

    .line 63
    .line 64
    :goto_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    if-eqz v2, :cond_8

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ljava/util/Map$Entry;

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lc1/c;

    .line 97
    .line 98
    invoke-interface {v2}, Lc1/c;->a()Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v6, "key"

    .line 103
    .line 104
    invoke-static {v5, v6}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    if-nez v2, :cond_2

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_2
    :goto_2
    const/16 v6, 0x1d

    .line 111
    .line 112
    if-ge v4, v6, :cond_7

    .line 113
    .line 114
    sget-object v6, Landroidx/lifecycle/j0;->f:[Ljava/lang/Class;

    .line 115
    .line 116
    aget-object v6, v6, v4

    .line 117
    .line 118
    invoke-static {v6}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_6

    .line 126
    .line 127
    :goto_3
    iget-object v4, p0, Landroidx/lifecycle/j0;->c:Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    instance-of v6, v4, Landroidx/lifecycle/a0;

    .line 134
    .line 135
    if-eqz v6, :cond_3

    .line 136
    .line 137
    move-object v3, v4

    .line 138
    check-cast v3, Landroidx/lifecycle/a0;

    .line 139
    .line 140
    :cond_3
    if-eqz v3, :cond_4

    .line 141
    .line 142
    invoke-virtual {v3, v2}, Landroidx/lifecycle/a0;->e(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    invoke-interface {v0, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :goto_4
    iget-object v3, p0, Landroidx/lifecycle/j0;->d:Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Lr4/q;

    .line 156
    .line 157
    if-nez v3, :cond_5

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_5
    check-cast v3, Lr4/s;

    .line 161
    .line 162
    invoke-virtual {v3, v2}, Lr4/s;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    const-string v1, "Can\'t put value with type "

    .line 174
    .line 175
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v1, " into saved state"

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0

    .line 198
    :cond_8
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    new-instance v1, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    new-instance v2, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    if-eqz v5, :cond_9

    .line 229
    .line 230
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    check-cast v5, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_9
    new-instance p0, Lt3/c;

    .line 248
    .line 249
    const-string v0, "keys"

    .line 250
    .line 251
    invoke-direct {p0, v0, v1}, Lt3/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    new-instance v0, Lt3/c;

    .line 255
    .line 256
    const-string v1, "values"

    .line 257
    .line 258
    invoke-direct {v0, v1, v2}, Lt3/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    filled-new-array {p0, v0}, [Lt3/c;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    new-instance v0, Landroid/os/Bundle;

    .line 266
    .line 267
    const/4 v1, 0x2

    .line 268
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 269
    .line 270
    .line 271
    :goto_6
    if-ge v4, v1, :cond_27

    .line 272
    .line 273
    aget-object v2, p0, v4

    .line 274
    .line 275
    iget-object v5, v2, Lt3/c;->g:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v5, Ljava/lang/String;

    .line 278
    .line 279
    iget-object v2, v2, Lt3/c;->h:Ljava/lang/Object;

    .line 280
    .line 281
    if-nez v2, :cond_a

    .line 282
    .line 283
    invoke-virtual {v0, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_7

    .line 287
    .line 288
    :cond_a
    instance-of v6, v2, Ljava/lang/Boolean;

    .line 289
    .line 290
    if-eqz v6, :cond_b

    .line 291
    .line 292
    check-cast v2, Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_7

    .line 302
    .line 303
    :cond_b
    instance-of v6, v2, Ljava/lang/Byte;

    .line 304
    .line 305
    if-eqz v6, :cond_c

    .line 306
    .line 307
    check-cast v2, Ljava/lang/Number;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_c
    instance-of v6, v2, Ljava/lang/Character;

    .line 319
    .line 320
    if-eqz v6, :cond_d

    .line 321
    .line 322
    check-cast v2, Ljava/lang/Character;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_7

    .line 332
    .line 333
    :cond_d
    instance-of v6, v2, Ljava/lang/Double;

    .line 334
    .line 335
    if-eqz v6, :cond_e

    .line 336
    .line 337
    check-cast v2, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 340
    .line 341
    .line 342
    move-result-wide v6

    .line 343
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 344
    .line 345
    .line 346
    goto/16 :goto_7

    .line 347
    .line 348
    :cond_e
    instance-of v6, v2, Ljava/lang/Float;

    .line 349
    .line 350
    if-eqz v6, :cond_f

    .line 351
    .line 352
    check-cast v2, Ljava/lang/Number;

    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_7

    .line 362
    .line 363
    :cond_f
    instance-of v6, v2, Ljava/lang/Integer;

    .line 364
    .line 365
    if-eqz v6, :cond_10

    .line 366
    .line 367
    check-cast v2, Ljava/lang/Number;

    .line 368
    .line 369
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 374
    .line 375
    .line 376
    goto/16 :goto_7

    .line 377
    .line 378
    :cond_10
    instance-of v6, v2, Ljava/lang/Long;

    .line 379
    .line 380
    if-eqz v6, :cond_11

    .line 381
    .line 382
    check-cast v2, Ljava/lang/Number;

    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 385
    .line 386
    .line 387
    move-result-wide v6

    .line 388
    invoke-virtual {v0, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 389
    .line 390
    .line 391
    goto/16 :goto_7

    .line 392
    .line 393
    :cond_11
    instance-of v6, v2, Ljava/lang/Short;

    .line 394
    .line 395
    if-eqz v6, :cond_12

    .line 396
    .line 397
    check-cast v2, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_7

    .line 407
    .line 408
    :cond_12
    instance-of v6, v2, Landroid/os/Bundle;

    .line 409
    .line 410
    if-eqz v6, :cond_13

    .line 411
    .line 412
    check-cast v2, Landroid/os/Bundle;

    .line 413
    .line 414
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_7

    .line 418
    .line 419
    :cond_13
    instance-of v6, v2, Ljava/lang/CharSequence;

    .line 420
    .line 421
    if-eqz v6, :cond_14

    .line 422
    .line 423
    check-cast v2, Ljava/lang/CharSequence;

    .line 424
    .line 425
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_7

    .line 429
    .line 430
    :cond_14
    instance-of v6, v2, Landroid/os/Parcelable;

    .line 431
    .line 432
    if-eqz v6, :cond_15

    .line 433
    .line 434
    check-cast v2, Landroid/os/Parcelable;

    .line 435
    .line 436
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_7

    .line 440
    .line 441
    :cond_15
    instance-of v6, v2, [Z

    .line 442
    .line 443
    if-eqz v6, :cond_16

    .line 444
    .line 445
    check-cast v2, [Z

    .line 446
    .line 447
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_7

    .line 451
    .line 452
    :cond_16
    instance-of v6, v2, [B

    .line 453
    .line 454
    if-eqz v6, :cond_17

    .line 455
    .line 456
    check-cast v2, [B

    .line 457
    .line 458
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 459
    .line 460
    .line 461
    goto/16 :goto_7

    .line 462
    .line 463
    :cond_17
    instance-of v6, v2, [C

    .line 464
    .line 465
    if-eqz v6, :cond_18

    .line 466
    .line 467
    check-cast v2, [C

    .line 468
    .line 469
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 470
    .line 471
    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_18
    instance-of v6, v2, [D

    .line 475
    .line 476
    if-eqz v6, :cond_19

    .line 477
    .line 478
    check-cast v2, [D

    .line 479
    .line 480
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_7

    .line 484
    .line 485
    :cond_19
    instance-of v6, v2, [F

    .line 486
    .line 487
    if-eqz v6, :cond_1a

    .line 488
    .line 489
    check-cast v2, [F

    .line 490
    .line 491
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_7

    .line 495
    .line 496
    :cond_1a
    instance-of v6, v2, [I

    .line 497
    .line 498
    if-eqz v6, :cond_1b

    .line 499
    .line 500
    check-cast v2, [I

    .line 501
    .line 502
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_7

    .line 506
    .line 507
    :cond_1b
    instance-of v6, v2, [J

    .line 508
    .line 509
    if-eqz v6, :cond_1c

    .line 510
    .line 511
    check-cast v2, [J

    .line 512
    .line 513
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 514
    .line 515
    .line 516
    goto/16 :goto_7

    .line 517
    .line 518
    :cond_1c
    instance-of v6, v2, [S

    .line 519
    .line 520
    if-eqz v6, :cond_1d

    .line 521
    .line 522
    check-cast v2, [S

    .line 523
    .line 524
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    .line 525
    .line 526
    .line 527
    goto/16 :goto_7

    .line 528
    .line 529
    :cond_1d
    instance-of v6, v2, [Ljava/lang/Object;

    .line 530
    .line 531
    const/16 v7, 0x22

    .line 532
    .line 533
    const-string v8, " for key \""

    .line 534
    .line 535
    if-eqz v6, :cond_22

    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    invoke-static {v6}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    const-class v9, Landroid/os/Parcelable;

    .line 549
    .line 550
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 551
    .line 552
    .line 553
    move-result v9

    .line 554
    if-eqz v9, :cond_1e

    .line 555
    .line 556
    check-cast v2, [Landroid/os/Parcelable;

    .line 557
    .line 558
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 559
    .line 560
    .line 561
    goto/16 :goto_7

    .line 562
    .line 563
    :cond_1e
    const-class v9, Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    if-eqz v9, :cond_1f

    .line 570
    .line 571
    check-cast v2, [Ljava/lang/String;

    .line 572
    .line 573
    invoke-virtual {v0, v5, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    goto :goto_7

    .line 577
    :cond_1f
    const-class v9, Ljava/lang/CharSequence;

    .line 578
    .line 579
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 580
    .line 581
    .line 582
    move-result v9

    .line 583
    if-eqz v9, :cond_20

    .line 584
    .line 585
    check-cast v2, [Ljava/lang/CharSequence;

    .line 586
    .line 587
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 588
    .line 589
    .line 590
    goto :goto_7

    .line 591
    :cond_20
    const-class v9, Ljava/io/Serializable;

    .line 592
    .line 593
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 594
    .line 595
    .line 596
    move-result v9

    .line 597
    if-eqz v9, :cond_21

    .line 598
    .line 599
    check-cast v2, Ljava/io/Serializable;

    .line 600
    .line 601
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 602
    .line 603
    .line 604
    goto :goto_7

    .line 605
    :cond_21
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 610
    .line 611
    new-instance v1, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    const-string v2, "Illegal value array type "

    .line 614
    .line 615
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw v0

    .line 638
    :cond_22
    instance-of v6, v2, Ljava/io/Serializable;

    .line 639
    .line 640
    if-eqz v6, :cond_23

    .line 641
    .line 642
    check-cast v2, Ljava/io/Serializable;

    .line 643
    .line 644
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 645
    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_23
    instance-of v6, v2, Landroid/os/IBinder;

    .line 649
    .line 650
    if-eqz v6, :cond_24

    .line 651
    .line 652
    check-cast v2, Landroid/os/IBinder;

    .line 653
    .line 654
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 655
    .line 656
    .line 657
    goto :goto_7

    .line 658
    :cond_24
    instance-of v6, v2, Landroid/util/Size;

    .line 659
    .line 660
    if-eqz v6, :cond_25

    .line 661
    .line 662
    check-cast v2, Landroid/util/Size;

    .line 663
    .line 664
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSize(Ljava/lang/String;Landroid/util/Size;)V

    .line 665
    .line 666
    .line 667
    goto :goto_7

    .line 668
    :cond_25
    instance-of v6, v2, Landroid/util/SizeF;

    .line 669
    .line 670
    if-eqz v6, :cond_26

    .line 671
    .line 672
    check-cast v2, Landroid/util/SizeF;

    .line 673
    .line 674
    invoke-virtual {v0, v5, v2}, Landroid/os/Bundle;->putSizeF(Ljava/lang/String;Landroid/util/SizeF;)V

    .line 675
    .line 676
    .line 677
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 678
    .line 679
    goto/16 :goto_6

    .line 680
    .line 681
    :cond_26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    move-result-object p0

    .line 685
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 690
    .line 691
    new-instance v1, Ljava/lang/StringBuilder;

    .line 692
    .line 693
    const-string v2, "Illegal value type "

    .line 694
    .line 695
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object p0

    .line 714
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v0

    .line 718
    :cond_27
    return-object v0
.end method
