.class public final Lu/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroidx/core/graphics/drawable/IconCompat;

.field public i:I

.field public final j:Z

.field public k:Lu/q;

.field public l:Z

.field public m:Landroid/os/Bundle;

.field public n:Ljava/lang/String;

.field public final o:Z

.field public final p:Landroid/app/Notification;

.field public final q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu/p;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lu/p;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lu/p;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lu/p;->j:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, Lu/p;->l:Z

    .line 30
    .line 31
    new-instance v2, Landroid/app/Notification;

    .line 32
    .line 33
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lu/p;->p:Landroid/app/Notification;

    .line 37
    .line 38
    iput-object p1, p0, Lu/p;->a:Landroid/content/Context;

    .line 39
    .line 40
    iput-object p2, p0, Lu/p;->n:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 50
    .line 51
    iput v1, p0, Lu/p;->i:I

    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lu/p;->q:Ljava/util/ArrayList;

    .line 59
    .line 60
    iput-boolean v0, p0, Lu/p;->o:Z

    .line 61
    .line 62
    return-void
.end method

.method public static b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lr1/h;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, Lr1/h;->j:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, v1, Lr1/h;->i:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, v0, Lu/p;->a:Landroid/content/Context;

    .line 23
    .line 24
    iput-object v2, v1, Lr1/h;->g:Ljava/lang/Object;

    .line 25
    .line 26
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v4, 0x1a

    .line 29
    .line 30
    if-lt v3, v4, :cond_0

    .line 31
    .line 32
    iget-object v3, v0, Lu/p;->n:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2, v3}, Lu/r;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v3, Landroid/app/Notification$Builder;

    .line 42
    .line 43
    invoke-direct {v3, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iput-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 47
    .line 48
    :goto_0
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Landroid/app/Notification$Builder;

    .line 51
    .line 52
    iget-object v5, v0, Lu/p;->p:Landroid/app/Notification;

    .line 53
    .line 54
    iget-wide v6, v5, Landroid/app/Notification;->when:J

    .line 55
    .line 56
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget v6, v5, Landroid/app/Notification;->icon:I

    .line 61
    .line 62
    iget v7, v5, Landroid/app/Notification;->iconLevel:I

    .line 63
    .line 64
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v6, v5, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 69
    .line 70
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v6, v5, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-virtual {v3, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iget-object v6, v5, Landroid/app/Notification;->vibrate:[J

    .line 82
    .line 83
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget v6, v5, Landroid/app/Notification;->ledARGB:I

    .line 88
    .line 89
    iget v8, v5, Landroid/app/Notification;->ledOnMS:I

    .line 90
    .line 91
    iget v9, v5, Landroid/app/Notification;->ledOffMS:I

    .line 92
    .line 93
    invoke-virtual {v3, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 98
    .line 99
    and-int/lit8 v6, v6, 0x2

    .line 100
    .line 101
    const/4 v8, 0x1

    .line 102
    const/4 v9, 0x0

    .line 103
    if-eqz v6, :cond_1

    .line 104
    .line 105
    move v6, v8

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    move v6, v9

    .line 108
    :goto_1
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 113
    .line 114
    and-int/lit8 v6, v6, 0x8

    .line 115
    .line 116
    if-eqz v6, :cond_2

    .line 117
    .line 118
    move v6, v8

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    move v6, v9

    .line 121
    :goto_2
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 126
    .line 127
    and-int/lit8 v6, v6, 0x10

    .line 128
    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    move v6, v8

    .line 132
    goto :goto_3

    .line 133
    :cond_3
    move v6, v9

    .line 134
    :goto_3
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iget v6, v5, Landroid/app/Notification;->defaults:I

    .line 139
    .line 140
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iget-object v6, v0, Lu/p;->e:Ljava/lang/CharSequence;

    .line 145
    .line 146
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v6, v0, Lu/p;->f:Ljava/lang/CharSequence;

    .line 151
    .line 152
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v3, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iget-object v6, v0, Lu/p;->g:Landroid/app/PendingIntent;

    .line 161
    .line 162
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v6, v5, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 167
    .line 168
    invoke-virtual {v3, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget v6, v5, Landroid/app/Notification;->flags:I

    .line 173
    .line 174
    and-int/lit16 v6, v6, 0x80

    .line 175
    .line 176
    if-eqz v6, :cond_4

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    move v8, v9

    .line 180
    :goto_4
    invoke-virtual {v3, v7, v8}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v3, v9}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3, v9, v9, v9}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 189
    .line 190
    .line 191
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Landroid/app/Notification$Builder;

    .line 194
    .line 195
    iget-object v6, v0, Lu/p;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 196
    .line 197
    if-nez v6, :cond_5

    .line 198
    .line 199
    move-object v2, v7

    .line 200
    goto :goto_5

    .line 201
    :cond_5
    invoke-virtual {v6, v2}, Landroidx/core/graphics/drawable/IconCompat;->f(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    :goto_5
    invoke-virtual {v3, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 206
    .line 207
    .line 208
    iget-object v2, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v2, Landroid/app/Notification$Builder;

    .line 211
    .line 212
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2, v9}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    iget v3, v0, Lu/p;->i:I

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 223
    .line 224
    .line 225
    iget-object v2, v0, Lu/p;->b:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    move v6, v9

    .line 232
    :goto_6
    const-string v10, "android.support.allowGeneratedReplies"

    .line 233
    .line 234
    if-ge v6, v3, :cond_c

    .line 235
    .line 236
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    add-int/lit8 v6, v6, 0x1

    .line 241
    .line 242
    check-cast v12, Lu/k;

    .line 243
    .line 244
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 245
    .line 246
    iget-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 247
    .line 248
    if-nez v14, :cond_6

    .line 249
    .line 250
    iget v14, v12, Lu/k;->e:I

    .line 251
    .line 252
    if-eqz v14, :cond_6

    .line 253
    .line 254
    invoke-static {v14}, Landroidx/core/graphics/drawable/IconCompat;->b(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    iput-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 259
    .line 260
    :cond_6
    iget-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 261
    .line 262
    iget-boolean v15, v12, Lu/k;->c:Z

    .line 263
    .line 264
    iget-object v4, v12, Lu/k;->a:Landroid/os/Bundle;

    .line 265
    .line 266
    if-eqz v14, :cond_7

    .line 267
    .line 268
    invoke-virtual {v14, v7}, Landroidx/core/graphics/drawable/IconCompat;->f(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    goto :goto_7

    .line 273
    :cond_7
    move-object v14, v7

    .line 274
    :goto_7
    iget-object v7, v12, Lu/k;->f:Ljava/lang/CharSequence;

    .line 275
    .line 276
    iget-object v8, v12, Lu/k;->g:Landroid/app/PendingIntent;

    .line 277
    .line 278
    new-instance v11, Landroid/app/Notification$Action$Builder;

    .line 279
    .line 280
    invoke-direct {v11, v14, v7, v8}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 281
    .line 282
    .line 283
    if-eqz v4, :cond_8

    .line 284
    .line 285
    new-instance v7, Landroid/os/Bundle;

    .line 286
    .line 287
    invoke-direct {v7, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_8
    new-instance v7, Landroid/os/Bundle;

    .line 292
    .line 293
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 294
    .line 295
    .line 296
    :goto_8
    invoke-virtual {v7, v10, v15}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v11, v15}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 300
    .line 301
    .line 302
    const-string v4, "android.support.action.semanticAction"

    .line 303
    .line 304
    invoke-virtual {v7, v4, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    const/16 v4, 0x1c

    .line 308
    .line 309
    if-lt v13, v4, :cond_9

    .line 310
    .line 311
    invoke-static {v11}, Lu/s;->a(Landroid/app/Notification$Action$Builder;)V

    .line 312
    .line 313
    .line 314
    :cond_9
    const/16 v4, 0x1d

    .line 315
    .line 316
    if-lt v13, v4, :cond_a

    .line 317
    .line 318
    invoke-static {v11}, Lu/f;->d(Landroid/app/Notification$Action$Builder;)V

    .line 319
    .line 320
    .line 321
    :cond_a
    const/16 v4, 0x1f

    .line 322
    .line 323
    if-lt v13, v4, :cond_b

    .line 324
    .line 325
    invoke-static {v11}, Lu/t;->a(Landroid/app/Notification$Action$Builder;)V

    .line 326
    .line 327
    .line 328
    :cond_b
    const-string v4, "android.support.action.showsUserInterface"

    .line 329
    .line 330
    iget-boolean v8, v12, Lu/k;->d:Z

    .line 331
    .line 332
    invoke-virtual {v7, v4, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v11, v7}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 336
    .line 337
    .line 338
    iget-object v4, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v4, Landroid/app/Notification$Builder;

    .line 341
    .line 342
    invoke-virtual {v11}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-virtual {v4, v7}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 347
    .line 348
    .line 349
    const/16 v4, 0x1a

    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    goto :goto_6

    .line 353
    :cond_c
    iget-object v2, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 354
    .line 355
    if-eqz v2, :cond_d

    .line 356
    .line 357
    iget-object v3, v1, Lr1/h;->j:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, Landroid/os/Bundle;

    .line 360
    .line 361
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    :cond_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 365
    .line 366
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v3, Landroid/app/Notification$Builder;

    .line 369
    .line 370
    iget-boolean v4, v0, Lu/p;->j:Z

    .line 371
    .line 372
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 373
    .line 374
    .line 375
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v3, Landroid/app/Notification$Builder;

    .line 378
    .line 379
    iget-boolean v4, v0, Lu/p;->l:Z

    .line 380
    .line 381
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 382
    .line 383
    .line 384
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v3, Landroid/app/Notification$Builder;

    .line 387
    .line 388
    const/4 v4, 0x0

    .line 389
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 390
    .line 391
    .line 392
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v3, Landroid/app/Notification$Builder;

    .line 395
    .line 396
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 397
    .line 398
    .line 399
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v3, Landroid/app/Notification$Builder;

    .line 402
    .line 403
    invoke-virtual {v3, v9}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 404
    .line 405
    .line 406
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v3, Landroid/app/Notification$Builder;

    .line 409
    .line 410
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 411
    .line 412
    .line 413
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v3, Landroid/app/Notification$Builder;

    .line 416
    .line 417
    invoke-virtual {v3, v9}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 418
    .line 419
    .line 420
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v3, Landroid/app/Notification$Builder;

    .line 423
    .line 424
    invoke-virtual {v3, v9}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 425
    .line 426
    .line 427
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v3, Landroid/app/Notification$Builder;

    .line 430
    .line 431
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 432
    .line 433
    .line 434
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v3, Landroid/app/Notification$Builder;

    .line 437
    .line 438
    iget-object v4, v5, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 439
    .line 440
    iget-object v5, v5, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 441
    .line 442
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 443
    .line 444
    .line 445
    iget-object v3, v0, Lu/p;->q:Ljava/util/ArrayList;

    .line 446
    .line 447
    iget-object v4, v0, Lu/p;->c:Ljava/util/ArrayList;

    .line 448
    .line 449
    const/16 v5, 0x1c

    .line 450
    .line 451
    if-ge v2, v5, :cond_12

    .line 452
    .line 453
    if-nez v4, :cond_e

    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    goto :goto_9

    .line 457
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 458
    .line 459
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v6

    .line 474
    if-nez v6, :cond_11

    .line 475
    .line 476
    :goto_9
    if-nez v2, :cond_f

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_f
    if-nez v3, :cond_10

    .line 480
    .line 481
    move-object v3, v2

    .line 482
    goto :goto_a

    .line 483
    :cond_10
    new-instance v5, Lo/g;

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    add-int/2addr v7, v6

    .line 494
    invoke-direct {v5, v7}, Lo/g;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5, v2}, Lo/g;->addAll(Ljava/util/Collection;)Z

    .line 498
    .line 499
    .line 500
    invoke-virtual {v5, v3}, Lo/g;->addAll(Ljava/util/Collection;)Z

    .line 501
    .line 502
    .line 503
    new-instance v3, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 506
    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_11
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    new-instance v1, Ljava/lang/ClassCastException;

    .line 517
    .line 518
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 519
    .line 520
    .line 521
    throw v1

    .line 522
    :cond_12
    :goto_a
    if-eqz v3, :cond_13

    .line 523
    .line 524
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    if-nez v2, :cond_13

    .line 529
    .line 530
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    move v5, v9

    .line 535
    :goto_b
    if-ge v5, v2, :cond_13

    .line 536
    .line 537
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    add-int/lit8 v5, v5, 0x1

    .line 542
    .line 543
    check-cast v6, Ljava/lang/String;

    .line 544
    .line 545
    iget-object v7, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v7, Landroid/app/Notification$Builder;

    .line 548
    .line 549
    invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 550
    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_13
    iget-object v2, v0, Lu/p;->d:Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-lez v3, :cond_1b

    .line 560
    .line 561
    iget-object v3, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 562
    .line 563
    if-nez v3, :cond_14

    .line 564
    .line 565
    new-instance v3, Landroid/os/Bundle;

    .line 566
    .line 567
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 568
    .line 569
    .line 570
    iput-object v3, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 571
    .line 572
    :cond_14
    iget-object v3, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 573
    .line 574
    const-string v5, "android.car.EXTENSIONS"

    .line 575
    .line 576
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    if-nez v3, :cond_15

    .line 581
    .line 582
    new-instance v3, Landroid/os/Bundle;

    .line 583
    .line 584
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 585
    .line 586
    .line 587
    :cond_15
    new-instance v6, Landroid/os/Bundle;

    .line 588
    .line 589
    invoke-direct {v6, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 590
    .line 591
    .line 592
    new-instance v7, Landroid/os/Bundle;

    .line 593
    .line 594
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 595
    .line 596
    .line 597
    move v8, v9

    .line 598
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 599
    .line 600
    .line 601
    move-result v11

    .line 602
    if-ge v8, v11, :cond_19

    .line 603
    .line 604
    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v11

    .line 608
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v12

    .line 612
    check-cast v12, Lu/k;

    .line 613
    .line 614
    new-instance v13, Landroid/os/Bundle;

    .line 615
    .line 616
    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 617
    .line 618
    .line 619
    iget-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 620
    .line 621
    if-nez v14, :cond_16

    .line 622
    .line 623
    iget v14, v12, Lu/k;->e:I

    .line 624
    .line 625
    if-eqz v14, :cond_16

    .line 626
    .line 627
    invoke-static {v14}, Landroidx/core/graphics/drawable/IconCompat;->b(I)Landroidx/core/graphics/drawable/IconCompat;

    .line 628
    .line 629
    .line 630
    move-result-object v14

    .line 631
    iput-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 632
    .line 633
    :cond_16
    iget-object v14, v12, Lu/k;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 634
    .line 635
    iget-object v15, v12, Lu/k;->a:Landroid/os/Bundle;

    .line 636
    .line 637
    if-eqz v14, :cond_17

    .line 638
    .line 639
    invoke-virtual {v14}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    .line 640
    .line 641
    .line 642
    move-result v14

    .line 643
    goto :goto_d

    .line 644
    :cond_17
    move v14, v9

    .line 645
    :goto_d
    const-string v9, "icon"

    .line 646
    .line 647
    invoke-virtual {v13, v9, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 648
    .line 649
    .line 650
    const-string v9, "title"

    .line 651
    .line 652
    iget-object v14, v12, Lu/k;->f:Ljava/lang/CharSequence;

    .line 653
    .line 654
    invoke-virtual {v13, v9, v14}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 655
    .line 656
    .line 657
    const-string v9, "actionIntent"

    .line 658
    .line 659
    iget-object v14, v12, Lu/k;->g:Landroid/app/PendingIntent;

    .line 660
    .line 661
    invoke-virtual {v13, v9, v14}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 662
    .line 663
    .line 664
    if-eqz v15, :cond_18

    .line 665
    .line 666
    new-instance v9, Landroid/os/Bundle;

    .line 667
    .line 668
    invoke-direct {v9, v15}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 669
    .line 670
    .line 671
    goto :goto_e

    .line 672
    :cond_18
    new-instance v9, Landroid/os/Bundle;

    .line 673
    .line 674
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 675
    .line 676
    .line 677
    :goto_e
    iget-boolean v14, v12, Lu/k;->c:Z

    .line 678
    .line 679
    invoke-virtual {v9, v10, v14}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 680
    .line 681
    .line 682
    const-string v14, "extras"

    .line 683
    .line 684
    invoke-virtual {v13, v14, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 685
    .line 686
    .line 687
    const-string v9, "remoteInputs"

    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    invoke-virtual {v13, v9, v14}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 691
    .line 692
    .line 693
    const-string v9, "showsUserInterface"

    .line 694
    .line 695
    iget-boolean v12, v12, Lu/k;->d:Z

    .line 696
    .line 697
    invoke-virtual {v13, v9, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 698
    .line 699
    .line 700
    const-string v9, "semanticAction"

    .line 701
    .line 702
    const/4 v12, 0x0

    .line 703
    invoke-virtual {v13, v9, v12}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v7, v11, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 707
    .line 708
    .line 709
    add-int/lit8 v8, v8, 0x1

    .line 710
    .line 711
    const/4 v9, 0x0

    .line 712
    goto :goto_c

    .line 713
    :cond_19
    const-string v2, "invisible_actions"

    .line 714
    .line 715
    invoke-virtual {v3, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v6, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 719
    .line 720
    .line 721
    iget-object v2, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 722
    .line 723
    if-nez v2, :cond_1a

    .line 724
    .line 725
    new-instance v2, Landroid/os/Bundle;

    .line 726
    .line 727
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 728
    .line 729
    .line 730
    iput-object v2, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 731
    .line 732
    :cond_1a
    iget-object v2, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 733
    .line 734
    invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 735
    .line 736
    .line 737
    iget-object v2, v1, Lr1/h;->j:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v2, Landroid/os/Bundle;

    .line 740
    .line 741
    invoke-virtual {v2, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 742
    .line 743
    .line 744
    :cond_1b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 745
    .line 746
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast v3, Landroid/app/Notification$Builder;

    .line 749
    .line 750
    iget-object v5, v0, Lu/p;->m:Landroid/os/Bundle;

    .line 751
    .line 752
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 753
    .line 754
    .line 755
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v3, Landroid/app/Notification$Builder;

    .line 758
    .line 759
    const/4 v14, 0x0

    .line 760
    invoke-virtual {v3, v14}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 761
    .line 762
    .line 763
    const/16 v3, 0x1a

    .line 764
    .line 765
    if-lt v2, v3, :cond_1c

    .line 766
    .line 767
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v3, Landroid/app/Notification$Builder;

    .line 770
    .line 771
    invoke-static {v3}, Lu/r;->b(Landroid/app/Notification$Builder;)V

    .line 772
    .line 773
    .line 774
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v3, Landroid/app/Notification$Builder;

    .line 777
    .line 778
    invoke-static {v3}, Lu/r;->d(Landroid/app/Notification$Builder;)V

    .line 779
    .line 780
    .line 781
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v3, Landroid/app/Notification$Builder;

    .line 784
    .line 785
    invoke-static {v3}, Lu/r;->e(Landroid/app/Notification$Builder;)V

    .line 786
    .line 787
    .line 788
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v3, Landroid/app/Notification$Builder;

    .line 791
    .line 792
    invoke-static {v3}, Lu/r;->f(Landroid/app/Notification$Builder;)V

    .line 793
    .line 794
    .line 795
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v3, Landroid/app/Notification$Builder;

    .line 798
    .line 799
    invoke-static {v3}, Lu/r;->c(Landroid/app/Notification$Builder;)V

    .line 800
    .line 801
    .line 802
    iget-object v3, v0, Lu/p;->n:Ljava/lang/String;

    .line 803
    .line 804
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    if-nez v3, :cond_1c

    .line 809
    .line 810
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v3, Landroid/app/Notification$Builder;

    .line 813
    .line 814
    const/4 v14, 0x0

    .line 815
    invoke-virtual {v3, v14}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    const/4 v12, 0x0

    .line 820
    invoke-virtual {v3, v12}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    invoke-virtual {v3, v12, v12, v12}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 825
    .line 826
    .line 827
    move-result-object v3

    .line 828
    invoke-virtual {v3, v14}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 829
    .line 830
    .line 831
    :cond_1c
    const/16 v5, 0x1c

    .line 832
    .line 833
    if-lt v2, v5, :cond_1d

    .line 834
    .line 835
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    if-nez v4, :cond_1e

    .line 844
    .line 845
    :cond_1d
    const/16 v4, 0x1d

    .line 846
    .line 847
    goto :goto_f

    .line 848
    :cond_1e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    new-instance v1, Ljava/lang/ClassCastException;

    .line 856
    .line 857
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 858
    .line 859
    .line 860
    throw v1

    .line 861
    :goto_f
    if-lt v2, v4, :cond_1f

    .line 862
    .line 863
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v3, Landroid/app/Notification$Builder;

    .line 866
    .line 867
    iget-boolean v4, v0, Lu/p;->o:Z

    .line 868
    .line 869
    invoke-static {v3, v4}, Lu/f;->b(Landroid/app/Notification$Builder;Z)V

    .line 870
    .line 871
    .line 872
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v3, Landroid/app/Notification$Builder;

    .line 875
    .line 876
    invoke-static {v3}, Lu/f;->c(Landroid/app/Notification$Builder;)V

    .line 877
    .line 878
    .line 879
    :cond_1f
    const/16 v3, 0x24

    .line 880
    .line 881
    if-lt v2, v3, :cond_20

    .line 882
    .line 883
    iget-object v2, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 884
    .line 885
    check-cast v2, Landroid/app/Notification$Builder;

    .line 886
    .line 887
    invoke-static {v2}, Lu/u;->a(Landroid/app/Notification$Builder;)V

    .line 888
    .line 889
    .line 890
    :cond_20
    iget-object v2, v1, Lr1/h;->i:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v2, Lu/p;

    .line 893
    .line 894
    iget-object v3, v2, Lu/p;->k:Lu/q;

    .line 895
    .line 896
    if-eqz v3, :cond_21

    .line 897
    .line 898
    invoke-virtual {v3, v1}, Lu/q;->a(Lr1/h;)V

    .line 899
    .line 900
    .line 901
    :cond_21
    iget-object v1, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v1, Landroid/app/Notification$Builder;

    .line 904
    .line 905
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 906
    .line 907
    const/16 v5, 0x1a

    .line 908
    .line 909
    if-lt v4, v5, :cond_22

    .line 910
    .line 911
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    goto :goto_10

    .line 916
    :cond_22
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    :goto_10
    if-eqz v3, :cond_23

    .line 921
    .line 922
    iget-object v2, v2, Lu/p;->k:Lu/q;

    .line 923
    .line 924
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    :cond_23
    if-eqz v3, :cond_24

    .line 928
    .line 929
    iget-object v2, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 930
    .line 931
    if-eqz v2, :cond_24

    .line 932
    .line 933
    invoke-virtual {v3}, Lu/q;->b()Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    const-string v4, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 938
    .line 939
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    :cond_24
    return-object v1
.end method

.method public final c(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lu/p;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f060059

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const v3, 0x7f060058

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gt v3, v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-gt v3, v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    int-to-double v3, v1

    .line 43
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-double v5, v1

    .line 52
    div-double/2addr v3, v5

    .line 53
    int-to-double v0, v0

    .line 54
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    int-to-double v5, v5

    .line 63
    div-double/2addr v0, v5

    .line 64
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-double v3, v3

    .line 73
    mul-double/2addr v3, v0

    .line 74
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    double-to-int v3, v3

    .line 79
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    int-to-double v4, v4

    .line 84
    mul-double/2addr v4, v0

    .line 85
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    double-to-int v0, v0

    .line 90
    invoke-static {p1, v3, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_0
    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 100
    .line 101
    invoke-direct {v0, v2}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, p0, Lu/p;->h:Landroidx/core/graphics/drawable/IconCompat;

    .line 107
    .line 108
    return-void
.end method

.method public final d(Lu/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu/p;->k:Lu/q;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lu/p;->k:Lu/q;

    .line 6
    .line 7
    iget-object v0, p1, Lu/q;->a:Lu/p;

    .line 8
    .line 9
    if-eq v0, p0, :cond_0

    .line 10
    .line 11
    iput-object p0, p1, Lu/q;->a:Lu/p;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lu/p;->d(Lu/q;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
