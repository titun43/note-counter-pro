.class public final Ll2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg2/d;Lm2/d;Landroidx/emoji2/text/t;Ljava/util/concurrent/Executor;Ln2/c;Lt2/i;Lt2/i;Lm2/c;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 30
    iput-object p2, p0, Ll2/j;->b:Ljava/lang/Object;

    .line 31
    iput-object p3, p0, Ll2/j;->c:Ljava/lang/Object;

    .line 32
    iput-object p4, p0, Ll2/j;->d:Ljava/lang/Object;

    .line 33
    iput-object p5, p0, Ll2/j;->e:Ljava/lang/Object;

    .line 34
    iput-object p6, p0, Ll2/j;->f:Ljava/lang/Object;

    .line 35
    iput-object p7, p0, Ll2/j;->g:Ljava/lang/Object;

    .line 36
    iput-object p8, p0, Ll2/j;->h:Ljava/lang/Object;

    .line 37
    iput-object p9, p0, Ll2/j;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Lt1/b;

    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p1, v1}, Lt1/b;-><init>(Lz0/i;I)V

    .line 5
    iput-object v0, p0, Ll2/j;->b:Ljava/lang/Object;

    .line 6
    new-instance v0, Lt1/e;

    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 8
    iput-object v0, p0, Ll2/j;->c:Ljava/lang/Object;

    .line 9
    new-instance v0, Lt1/e;

    const/4 v1, 0x4

    .line 10
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 11
    iput-object v0, p0, Ll2/j;->d:Ljava/lang/Object;

    .line 12
    new-instance v0, Lt1/e;

    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 14
    iput-object v0, p0, Ll2/j;->e:Ljava/lang/Object;

    .line 15
    new-instance v0, Lt1/e;

    const/4 v1, 0x6

    .line 16
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 17
    iput-object v0, p0, Ll2/j;->f:Ljava/lang/Object;

    .line 18
    new-instance v0, Lt1/e;

    const/4 v1, 0x7

    .line 19
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 20
    iput-object v0, p0, Ll2/j;->g:Ljava/lang/Object;

    .line 21
    new-instance v0, Lt1/e;

    const/16 v1, 0x8

    .line 22
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 23
    iput-object v0, p0, Ll2/j;->h:Ljava/lang/Object;

    .line 24
    new-instance v0, Lt1/e;

    const/16 v1, 0x9

    .line 25
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 26
    iput-object v0, p0, Ll2/j;->i:Ljava/lang/Object;

    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0xc8

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    invoke-virtual {v1, v0, v2, v3}, Lz0/j;->e(IJ)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p0

    .line 15
    .line 16
    iget-object v3, v2, Ll2/j;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 19
    .line 20
    invoke-virtual {v3}, Lz0/i;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v1}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :try_start_0
    const-string v4, "required_network_type"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "requires_charging"

    .line 34
    .line 35
    invoke-static {v3, v5}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "requires_device_idle"

    .line 40
    .line 41
    invoke-static {v3, v6}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const-string v7, "requires_battery_not_low"

    .line 46
    .line 47
    invoke-static {v3, v7}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "requires_storage_not_low"

    .line 52
    .line 53
    invoke-static {v3, v8}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "trigger_content_update_delay"

    .line 58
    .line 59
    invoke-static {v3, v9}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "trigger_max_content_delay"

    .line 64
    .line 65
    invoke-static {v3, v10}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "content_uri_triggers"

    .line 70
    .line 71
    invoke-static {v3, v11}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "id"

    .line 76
    .line 77
    invoke-static {v3, v12}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "state"

    .line 82
    .line 83
    invoke-static {v3, v13}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "worker_class_name"

    .line 88
    .line 89
    invoke-static {v3, v14}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "input_merger_class_name"

    .line 94
    .line 95
    invoke-static {v3, v15}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v0, "input"

    .line 100
    .line 101
    invoke-static {v3, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v1

    .line 106
    .line 107
    :try_start_1
    const-string v1, "output"

    .line 108
    .line 109
    invoke-static {v3, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const-string v2, "initial_delay"

    .line 114
    .line 115
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    move/from16 v17, v2

    .line 120
    .line 121
    const-string v2, "interval_duration"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move/from16 v18, v2

    .line 128
    .line 129
    const-string v2, "flex_duration"

    .line 130
    .line 131
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move/from16 v19, v2

    .line 136
    .line 137
    const-string v2, "run_attempt_count"

    .line 138
    .line 139
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move/from16 v20, v2

    .line 144
    .line 145
    const-string v2, "backoff_policy"

    .line 146
    .line 147
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move/from16 v21, v2

    .line 152
    .line 153
    const-string v2, "backoff_delay_duration"

    .line 154
    .line 155
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move/from16 v22, v2

    .line 160
    .line 161
    const-string v2, "period_start_time"

    .line 162
    .line 163
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    move/from16 v23, v2

    .line 168
    .line 169
    const-string v2, "minimum_retention_duration"

    .line 170
    .line 171
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    move/from16 v24, v2

    .line 176
    .line 177
    const-string v2, "schedule_requested_at"

    .line 178
    .line 179
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move/from16 v25, v2

    .line 184
    .line 185
    const-string v2, "run_in_foreground"

    .line 186
    .line 187
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move/from16 v26, v2

    .line 192
    .line 193
    const-string v2, "out_of_quota_policy"

    .line 194
    .line 195
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    move/from16 v27, v2

    .line 200
    .line 201
    new-instance v2, Ljava/util/ArrayList;

    .line 202
    .line 203
    move/from16 v28, v1

    .line 204
    .line 205
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_5

    .line 217
    .line 218
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move/from16 v29, v12

    .line 223
    .line 224
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move/from16 v30, v14

    .line 229
    .line 230
    new-instance v14, Landroidx/work/c;

    .line 231
    .line 232
    invoke-direct {v14}, Landroidx/work/c;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v31

    .line 239
    move/from16 v32, v4

    .line 240
    .line 241
    invoke-static/range {v31 .. v31}, Lz2/b;->n(I)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    iput v4, v14, Landroidx/work/c;->a:I

    .line 246
    .line 247
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    const/16 v31, 0x0

    .line 252
    .line 253
    if-eqz v4, :cond_0

    .line 254
    .line 255
    const/4 v4, 0x1

    .line 256
    goto :goto_1

    .line 257
    :cond_0
    move/from16 v4, v31

    .line 258
    .line 259
    :goto_1
    iput-boolean v4, v14, Landroidx/work/c;->b:Z

    .line 260
    .line 261
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_1

    .line 266
    .line 267
    const/4 v4, 0x1

    .line 268
    goto :goto_2

    .line 269
    :cond_1
    move/from16 v4, v31

    .line 270
    .line 271
    :goto_2
    iput-boolean v4, v14, Landroidx/work/c;->c:Z

    .line 272
    .line 273
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_2

    .line 278
    .line 279
    const/4 v4, 0x1

    .line 280
    goto :goto_3

    .line 281
    :cond_2
    move/from16 v4, v31

    .line 282
    .line 283
    :goto_3
    iput-boolean v4, v14, Landroidx/work/c;->d:Z

    .line 284
    .line 285
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_3

    .line 290
    .line 291
    const/4 v4, 0x1

    .line 292
    goto :goto_4

    .line 293
    :cond_3
    move/from16 v4, v31

    .line 294
    .line 295
    :goto_4
    iput-boolean v4, v14, Landroidx/work/c;->e:Z

    .line 296
    .line 297
    move/from16 v33, v5

    .line 298
    .line 299
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    iput-wide v4, v14, Landroidx/work/c;->f:J

    .line 304
    .line 305
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    iput-wide v4, v14, Landroidx/work/c;->g:J

    .line 310
    .line 311
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-static {v4}, Lz2/b;->a([B)Landroidx/work/e;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iput-object v4, v14, Landroidx/work/c;->h:Landroidx/work/e;

    .line 320
    .line 321
    new-instance v4, Lt1/i;

    .line 322
    .line 323
    invoke-direct {v4, v1, v12}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-static {v1}, Lz2/b;->p(I)I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    iput v1, v4, Lt1/i;->b:I

    .line 335
    .line 336
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v4, Lt1/i;->d:Ljava/lang/String;

    .line 341
    .line 342
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v1}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v4, Lt1/i;->e:Landroidx/work/g;

    .line 351
    .line 352
    move/from16 v1, v28

    .line 353
    .line 354
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-static {v5}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    iput-object v5, v4, Lt1/i;->f:Landroidx/work/g;

    .line 363
    .line 364
    move v12, v0

    .line 365
    move/from16 v28, v1

    .line 366
    .line 367
    move/from16 v5, v17

    .line 368
    .line 369
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 370
    .line 371
    .line 372
    move-result-wide v0

    .line 373
    iput-wide v0, v4, Lt1/i;->g:J

    .line 374
    .line 375
    move/from16 v17, v5

    .line 376
    .line 377
    move v1, v6

    .line 378
    move/from16 v0, v18

    .line 379
    .line 380
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v5

    .line 384
    iput-wide v5, v4, Lt1/i;->h:J

    .line 385
    .line 386
    move/from16 v18, v0

    .line 387
    .line 388
    move v6, v1

    .line 389
    move/from16 v5, v19

    .line 390
    .line 391
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v0

    .line 395
    iput-wide v0, v4, Lt1/i;->i:J

    .line 396
    .line 397
    move/from16 v0, v20

    .line 398
    .line 399
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    iput v1, v4, Lt1/i;->k:I

    .line 404
    .line 405
    move/from16 v1, v21

    .line 406
    .line 407
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 408
    .line 409
    .line 410
    move-result v19

    .line 411
    move/from16 v20, v0

    .line 412
    .line 413
    invoke-static/range {v19 .. v19}, Lz2/b;->m(I)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    iput v0, v4, Lt1/i;->l:I

    .line 418
    .line 419
    move/from16 v19, v5

    .line 420
    .line 421
    move/from16 v21, v6

    .line 422
    .line 423
    move/from16 v0, v22

    .line 424
    .line 425
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 426
    .line 427
    .line 428
    move-result-wide v5

    .line 429
    iput-wide v5, v4, Lt1/i;->m:J

    .line 430
    .line 431
    move/from16 v22, v0

    .line 432
    .line 433
    move v6, v1

    .line 434
    move/from16 v5, v23

    .line 435
    .line 436
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 437
    .line 438
    .line 439
    move-result-wide v0

    .line 440
    iput-wide v0, v4, Lt1/i;->n:J

    .line 441
    .line 442
    move/from16 v23, v5

    .line 443
    .line 444
    move v1, v6

    .line 445
    move/from16 v0, v24

    .line 446
    .line 447
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    iput-wide v5, v4, Lt1/i;->o:J

    .line 452
    .line 453
    move/from16 v24, v0

    .line 454
    .line 455
    move v6, v1

    .line 456
    move/from16 v5, v25

    .line 457
    .line 458
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 459
    .line 460
    .line 461
    move-result-wide v0

    .line 462
    iput-wide v0, v4, Lt1/i;->p:J

    .line 463
    .line 464
    move/from16 v0, v26

    .line 465
    .line 466
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-eqz v1, :cond_4

    .line 471
    .line 472
    const/4 v1, 0x1

    .line 473
    goto :goto_5

    .line 474
    :cond_4
    move/from16 v1, v31

    .line 475
    .line 476
    :goto_5
    iput-boolean v1, v4, Lt1/i;->q:Z

    .line 477
    .line 478
    move/from16 v1, v27

    .line 479
    .line 480
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 481
    .line 482
    .line 483
    move-result v25

    .line 484
    move/from16 v26, v0

    .line 485
    .line 486
    invoke-static/range {v25 .. v25}, Lz2/b;->o(I)I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    iput v0, v4, Lt1/i;->r:I

    .line 491
    .line 492
    iput-object v14, v4, Lt1/i;->j:Landroidx/work/c;

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 495
    .line 496
    .line 497
    move/from16 v0, v21

    .line 498
    .line 499
    move/from16 v21, v6

    .line 500
    .line 501
    move v6, v0

    .line 502
    move/from16 v27, v1

    .line 503
    .line 504
    move/from16 v25, v5

    .line 505
    .line 506
    move v0, v12

    .line 507
    move/from16 v12, v29

    .line 508
    .line 509
    move/from16 v14, v30

    .line 510
    .line 511
    move/from16 v4, v32

    .line 512
    .line 513
    move/from16 v5, v33

    .line 514
    .line 515
    goto/16 :goto_0

    .line 516
    .line 517
    :catchall_0
    move-exception v0

    .line 518
    goto :goto_6

    .line 519
    :cond_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 523
    .line 524
    .line 525
    return-object v2

    .line 526
    :catchall_1
    move-exception v0

    .line 527
    move-object/from16 v16, v1

    .line 528
    .line 529
    :goto_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 533
    .line 534
    .line 535
    throw v0
.end method

.method public b(I)Ljava/util/ArrayList;
    .locals 33

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move/from16 v2, p1

    .line 9
    .line 10
    int-to-long v2, v2

    .line 11
    invoke-virtual {v1, v0, v2, v3}, Lz0/j;->e(IJ)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p0

    .line 15
    .line 16
    iget-object v3, v2, Ll2/j;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 19
    .line 20
    invoke-virtual {v3}, Lz0/i;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v1}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    :try_start_0
    const-string v4, "required_network_type"

    .line 28
    .line 29
    invoke-static {v3, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, "requires_charging"

    .line 34
    .line 35
    invoke-static {v3, v5}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const-string v6, "requires_device_idle"

    .line 40
    .line 41
    invoke-static {v3, v6}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    const-string v7, "requires_battery_not_low"

    .line 46
    .line 47
    invoke-static {v3, v7}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "requires_storage_not_low"

    .line 52
    .line 53
    invoke-static {v3, v8}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "trigger_content_update_delay"

    .line 58
    .line 59
    invoke-static {v3, v9}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "trigger_max_content_delay"

    .line 64
    .line 65
    invoke-static {v3, v10}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "content_uri_triggers"

    .line 70
    .line 71
    invoke-static {v3, v11}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "id"

    .line 76
    .line 77
    invoke-static {v3, v12}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "state"

    .line 82
    .line 83
    invoke-static {v3, v13}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "worker_class_name"

    .line 88
    .line 89
    invoke-static {v3, v14}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "input_merger_class_name"

    .line 94
    .line 95
    invoke-static {v3, v15}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v0, "input"

    .line 100
    .line 101
    invoke-static {v3, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 105
    move-object/from16 v16, v1

    .line 106
    .line 107
    :try_start_1
    const-string v1, "output"

    .line 108
    .line 109
    invoke-static {v3, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const-string v2, "initial_delay"

    .line 114
    .line 115
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    move/from16 p1, v2

    .line 120
    .line 121
    const-string v2, "interval_duration"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move/from16 v17, v2

    .line 128
    .line 129
    const-string v2, "flex_duration"

    .line 130
    .line 131
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    move/from16 v18, v2

    .line 136
    .line 137
    const-string v2, "run_attempt_count"

    .line 138
    .line 139
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    move/from16 v19, v2

    .line 144
    .line 145
    const-string v2, "backoff_policy"

    .line 146
    .line 147
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    move/from16 v20, v2

    .line 152
    .line 153
    const-string v2, "backoff_delay_duration"

    .line 154
    .line 155
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move/from16 v21, v2

    .line 160
    .line 161
    const-string v2, "period_start_time"

    .line 162
    .line 163
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    move/from16 v22, v2

    .line 168
    .line 169
    const-string v2, "minimum_retention_duration"

    .line 170
    .line 171
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    move/from16 v23, v2

    .line 176
    .line 177
    const-string v2, "schedule_requested_at"

    .line 178
    .line 179
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move/from16 v24, v2

    .line 184
    .line 185
    const-string v2, "run_in_foreground"

    .line 186
    .line 187
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move/from16 v25, v2

    .line 192
    .line 193
    const-string v2, "out_of_quota_policy"

    .line 194
    .line 195
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    move/from16 v26, v2

    .line 200
    .line 201
    new-instance v2, Ljava/util/ArrayList;

    .line 202
    .line 203
    move/from16 v27, v1

    .line 204
    .line 205
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_5

    .line 217
    .line 218
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move/from16 v28, v12

    .line 223
    .line 224
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    move/from16 v29, v14

    .line 229
    .line 230
    new-instance v14, Landroidx/work/c;

    .line 231
    .line 232
    invoke-direct {v14}, Landroidx/work/c;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v30

    .line 239
    move/from16 v31, v4

    .line 240
    .line 241
    invoke-static/range {v30 .. v30}, Lz2/b;->n(I)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    iput v4, v14, Landroidx/work/c;->a:I

    .line 246
    .line 247
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    const/16 v30, 0x0

    .line 252
    .line 253
    if-eqz v4, :cond_0

    .line 254
    .line 255
    const/4 v4, 0x1

    .line 256
    goto :goto_1

    .line 257
    :cond_0
    move/from16 v4, v30

    .line 258
    .line 259
    :goto_1
    iput-boolean v4, v14, Landroidx/work/c;->b:Z

    .line 260
    .line 261
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    if-eqz v4, :cond_1

    .line 266
    .line 267
    const/4 v4, 0x1

    .line 268
    goto :goto_2

    .line 269
    :cond_1
    move/from16 v4, v30

    .line 270
    .line 271
    :goto_2
    iput-boolean v4, v14, Landroidx/work/c;->c:Z

    .line 272
    .line 273
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_2

    .line 278
    .line 279
    const/4 v4, 0x1

    .line 280
    goto :goto_3

    .line 281
    :cond_2
    move/from16 v4, v30

    .line 282
    .line 283
    :goto_3
    iput-boolean v4, v14, Landroidx/work/c;->d:Z

    .line 284
    .line 285
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_3

    .line 290
    .line 291
    const/4 v4, 0x1

    .line 292
    goto :goto_4

    .line 293
    :cond_3
    move/from16 v4, v30

    .line 294
    .line 295
    :goto_4
    iput-boolean v4, v14, Landroidx/work/c;->e:Z

    .line 296
    .line 297
    move/from16 v32, v5

    .line 298
    .line 299
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    iput-wide v4, v14, Landroidx/work/c;->f:J

    .line 304
    .line 305
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v4

    .line 309
    iput-wide v4, v14, Landroidx/work/c;->g:J

    .line 310
    .line 311
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-static {v4}, Lz2/b;->a([B)Landroidx/work/e;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    iput-object v4, v14, Landroidx/work/c;->h:Landroidx/work/e;

    .line 320
    .line 321
    new-instance v4, Lt1/i;

    .line 322
    .line 323
    invoke-direct {v4, v1, v12}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-static {v1}, Lz2/b;->p(I)I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    iput v1, v4, Lt1/i;->b:I

    .line 335
    .line 336
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    iput-object v1, v4, Lt1/i;->d:Ljava/lang/String;

    .line 341
    .line 342
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-static {v1}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v4, Lt1/i;->e:Landroidx/work/g;

    .line 351
    .line 352
    move/from16 v1, v27

    .line 353
    .line 354
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-static {v5}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    iput-object v5, v4, Lt1/i;->f:Landroidx/work/g;

    .line 363
    .line 364
    move/from16 v5, p1

    .line 365
    .line 366
    move/from16 p1, v0

    .line 367
    .line 368
    move/from16 v27, v1

    .line 369
    .line 370
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v0

    .line 374
    iput-wide v0, v4, Lt1/i;->g:J

    .line 375
    .line 376
    move v12, v5

    .line 377
    move v1, v6

    .line 378
    move/from16 v0, v17

    .line 379
    .line 380
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v5

    .line 384
    iput-wide v5, v4, Lt1/i;->h:J

    .line 385
    .line 386
    move/from16 v17, v0

    .line 387
    .line 388
    move v6, v1

    .line 389
    move/from16 v5, v18

    .line 390
    .line 391
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v0

    .line 395
    iput-wide v0, v4, Lt1/i;->i:J

    .line 396
    .line 397
    move/from16 v0, v19

    .line 398
    .line 399
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    iput v1, v4, Lt1/i;->k:I

    .line 404
    .line 405
    move/from16 v1, v20

    .line 406
    .line 407
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 408
    .line 409
    .line 410
    move-result v18

    .line 411
    move/from16 v19, v0

    .line 412
    .line 413
    invoke-static/range {v18 .. v18}, Lz2/b;->m(I)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    iput v0, v4, Lt1/i;->l:I

    .line 418
    .line 419
    move/from16 v18, v5

    .line 420
    .line 421
    move/from16 v20, v6

    .line 422
    .line 423
    move/from16 v0, v21

    .line 424
    .line 425
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 426
    .line 427
    .line 428
    move-result-wide v5

    .line 429
    iput-wide v5, v4, Lt1/i;->m:J

    .line 430
    .line 431
    move/from16 v21, v0

    .line 432
    .line 433
    move v6, v1

    .line 434
    move/from16 v5, v22

    .line 435
    .line 436
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 437
    .line 438
    .line 439
    move-result-wide v0

    .line 440
    iput-wide v0, v4, Lt1/i;->n:J

    .line 441
    .line 442
    move/from16 v22, v5

    .line 443
    .line 444
    move v1, v6

    .line 445
    move/from16 v0, v23

    .line 446
    .line 447
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    iput-wide v5, v4, Lt1/i;->o:J

    .line 452
    .line 453
    move/from16 v23, v0

    .line 454
    .line 455
    move v6, v1

    .line 456
    move/from16 v5, v24

    .line 457
    .line 458
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 459
    .line 460
    .line 461
    move-result-wide v0

    .line 462
    iput-wide v0, v4, Lt1/i;->p:J

    .line 463
    .line 464
    move/from16 v0, v25

    .line 465
    .line 466
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-eqz v1, :cond_4

    .line 471
    .line 472
    const/4 v1, 0x1

    .line 473
    goto :goto_5

    .line 474
    :cond_4
    move/from16 v1, v30

    .line 475
    .line 476
    :goto_5
    iput-boolean v1, v4, Lt1/i;->q:Z

    .line 477
    .line 478
    move/from16 v1, v26

    .line 479
    .line 480
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 481
    .line 482
    .line 483
    move-result v24

    .line 484
    move/from16 v25, v0

    .line 485
    .line 486
    invoke-static/range {v24 .. v24}, Lz2/b;->o(I)I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    iput v0, v4, Lt1/i;->r:I

    .line 491
    .line 492
    iput-object v14, v4, Lt1/i;->j:Landroidx/work/c;

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 495
    .line 496
    .line 497
    move/from16 v0, v20

    .line 498
    .line 499
    move/from16 v20, v6

    .line 500
    .line 501
    move v6, v0

    .line 502
    move/from16 v0, p1

    .line 503
    .line 504
    move/from16 v26, v1

    .line 505
    .line 506
    move/from16 v24, v5

    .line 507
    .line 508
    move/from16 p1, v12

    .line 509
    .line 510
    move/from16 v12, v28

    .line 511
    .line 512
    move/from16 v14, v29

    .line 513
    .line 514
    move/from16 v4, v31

    .line 515
    .line 516
    move/from16 v5, v32

    .line 517
    .line 518
    goto/16 :goto_0

    .line 519
    .line 520
    :catchall_0
    move-exception v0

    .line 521
    goto :goto_6

    .line 522
    :cond_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 526
    .line 527
    .line 528
    return-object v2

    .line 529
    :catchall_1
    move-exception v0

    .line 530
    move-object/from16 v16, v1

    .line 531
    .line 532
    :goto_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 536
    .line 537
    .line 538
    throw v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    iget-object v3, v2, Ll2/j;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 13
    .line 14
    invoke-virtual {v3}, Lz0/i;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    const-string v4, "required_network_type"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const-string v5, "requires_charging"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "requires_device_idle"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "requires_battery_not_low"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "requires_storage_not_low"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "trigger_content_update_delay"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "trigger_max_content_delay"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "content_uri_triggers"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "id"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "state"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "worker_class_name"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "input_merger_class_name"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "input"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 99
    move-object/from16 v16, v1

    .line 100
    .line 101
    :try_start_1
    const-string v1, "output"

    .line 102
    .line 103
    invoke-static {v3, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const-string v2, "initial_delay"

    .line 108
    .line 109
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    const-string v2, "interval_duration"

    .line 116
    .line 117
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 v18, v2

    .line 122
    .line 123
    const-string v2, "flex_duration"

    .line 124
    .line 125
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 v19, v2

    .line 130
    .line 131
    const-string v2, "run_attempt_count"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v2

    .line 138
    .line 139
    const-string v2, "backoff_policy"

    .line 140
    .line 141
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move/from16 v21, v2

    .line 146
    .line 147
    const-string v2, "backoff_delay_duration"

    .line 148
    .line 149
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    const-string v2, "period_start_time"

    .line 156
    .line 157
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move/from16 v23, v2

    .line 162
    .line 163
    const-string v2, "minimum_retention_duration"

    .line 164
    .line 165
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    move/from16 v24, v2

    .line 170
    .line 171
    const-string v2, "schedule_requested_at"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v25, v2

    .line 178
    .line 179
    const-string v2, "run_in_foreground"

    .line 180
    .line 181
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    const-string v2, "out_of_quota_policy"

    .line 188
    .line 189
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    move/from16 v27, v2

    .line 194
    .line 195
    new-instance v2, Ljava/util/ArrayList;

    .line 196
    .line 197
    move/from16 v28, v1

    .line 198
    .line 199
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move/from16 v29, v12

    .line 217
    .line 218
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    move/from16 v30, v14

    .line 223
    .line 224
    new-instance v14, Landroidx/work/c;

    .line 225
    .line 226
    invoke-direct {v14}, Landroidx/work/c;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 230
    .line 231
    .line 232
    move-result v31

    .line 233
    move/from16 v32, v4

    .line 234
    .line 235
    invoke-static/range {v31 .. v31}, Lz2/b;->n(I)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    iput v4, v14, Landroidx/work/c;->a:I

    .line 240
    .line 241
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    const/16 v31, 0x1

    .line 246
    .line 247
    if-eqz v4, :cond_0

    .line 248
    .line 249
    move/from16 v4, v31

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_0
    const/4 v4, 0x0

    .line 253
    :goto_1
    iput-boolean v4, v14, Landroidx/work/c;->b:Z

    .line 254
    .line 255
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_1

    .line 260
    .line 261
    move/from16 v4, v31

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_1
    const/4 v4, 0x0

    .line 265
    :goto_2
    iput-boolean v4, v14, Landroidx/work/c;->c:Z

    .line 266
    .line 267
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_2

    .line 272
    .line 273
    move/from16 v4, v31

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_2
    const/4 v4, 0x0

    .line 277
    :goto_3
    iput-boolean v4, v14, Landroidx/work/c;->d:Z

    .line 278
    .line 279
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-eqz v4, :cond_3

    .line 284
    .line 285
    move/from16 v4, v31

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_3
    const/4 v4, 0x0

    .line 289
    :goto_4
    iput-boolean v4, v14, Landroidx/work/c;->e:Z

    .line 290
    .line 291
    move/from16 v33, v5

    .line 292
    .line 293
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    iput-wide v4, v14, Landroidx/work/c;->f:J

    .line 298
    .line 299
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    iput-wide v4, v14, Landroidx/work/c;->g:J

    .line 304
    .line 305
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {v4}, Lz2/b;->a([B)Landroidx/work/e;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iput-object v4, v14, Landroidx/work/c;->h:Landroidx/work/e;

    .line 314
    .line 315
    new-instance v4, Lt1/i;

    .line 316
    .line 317
    invoke-direct {v4, v1, v12}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Lz2/b;->p(I)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    iput v1, v4, Lt1/i;->b:I

    .line 329
    .line 330
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iput-object v1, v4, Lt1/i;->d:Ljava/lang/String;

    .line 335
    .line 336
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-static {v1}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iput-object v1, v4, Lt1/i;->e:Landroidx/work/g;

    .line 345
    .line 346
    move/from16 v1, v28

    .line 347
    .line 348
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-static {v5}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    iput-object v5, v4, Lt1/i;->f:Landroidx/work/g;

    .line 357
    .line 358
    move v12, v0

    .line 359
    move/from16 v28, v1

    .line 360
    .line 361
    move/from16 v5, v17

    .line 362
    .line 363
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 364
    .line 365
    .line 366
    move-result-wide v0

    .line 367
    iput-wide v0, v4, Lt1/i;->g:J

    .line 368
    .line 369
    move/from16 v17, v5

    .line 370
    .line 371
    move v1, v6

    .line 372
    move/from16 v0, v18

    .line 373
    .line 374
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v5

    .line 378
    iput-wide v5, v4, Lt1/i;->h:J

    .line 379
    .line 380
    move/from16 v18, v0

    .line 381
    .line 382
    move v6, v1

    .line 383
    move/from16 v5, v19

    .line 384
    .line 385
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    iput-wide v0, v4, Lt1/i;->i:J

    .line 390
    .line 391
    move/from16 v0, v20

    .line 392
    .line 393
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    iput v1, v4, Lt1/i;->k:I

    .line 398
    .line 399
    move/from16 v1, v21

    .line 400
    .line 401
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 402
    .line 403
    .line 404
    move-result v19

    .line 405
    move/from16 v20, v0

    .line 406
    .line 407
    invoke-static/range {v19 .. v19}, Lz2/b;->m(I)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iput v0, v4, Lt1/i;->l:I

    .line 412
    .line 413
    move/from16 v19, v5

    .line 414
    .line 415
    move/from16 v21, v6

    .line 416
    .line 417
    move/from16 v0, v22

    .line 418
    .line 419
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 420
    .line 421
    .line 422
    move-result-wide v5

    .line 423
    iput-wide v5, v4, Lt1/i;->m:J

    .line 424
    .line 425
    move/from16 v22, v0

    .line 426
    .line 427
    move v6, v1

    .line 428
    move/from16 v5, v23

    .line 429
    .line 430
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v0

    .line 434
    iput-wide v0, v4, Lt1/i;->n:J

    .line 435
    .line 436
    move/from16 v23, v5

    .line 437
    .line 438
    move v1, v6

    .line 439
    move/from16 v0, v24

    .line 440
    .line 441
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 442
    .line 443
    .line 444
    move-result-wide v5

    .line 445
    iput-wide v5, v4, Lt1/i;->o:J

    .line 446
    .line 447
    move/from16 v24, v0

    .line 448
    .line 449
    move v6, v1

    .line 450
    move/from16 v5, v25

    .line 451
    .line 452
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 453
    .line 454
    .line 455
    move-result-wide v0

    .line 456
    iput-wide v0, v4, Lt1/i;->p:J

    .line 457
    .line 458
    move/from16 v0, v26

    .line 459
    .line 460
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-eqz v1, :cond_4

    .line 465
    .line 466
    move/from16 v1, v31

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_4
    const/4 v1, 0x0

    .line 470
    :goto_5
    iput-boolean v1, v4, Lt1/i;->q:Z

    .line 471
    .line 472
    move/from16 v1, v27

    .line 473
    .line 474
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 475
    .line 476
    .line 477
    move-result v25

    .line 478
    move/from16 v26, v0

    .line 479
    .line 480
    invoke-static/range {v25 .. v25}, Lz2/b;->o(I)I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    iput v0, v4, Lt1/i;->r:I

    .line 485
    .line 486
    iput-object v14, v4, Lt1/i;->j:Landroidx/work/c;

    .line 487
    .line 488
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    .line 490
    .line 491
    move/from16 v0, v21

    .line 492
    .line 493
    move/from16 v21, v6

    .line 494
    .line 495
    move v6, v0

    .line 496
    move/from16 v27, v1

    .line 497
    .line 498
    move/from16 v25, v5

    .line 499
    .line 500
    move v0, v12

    .line 501
    move/from16 v12, v29

    .line 502
    .line 503
    move/from16 v14, v30

    .line 504
    .line 505
    move/from16 v4, v32

    .line 506
    .line 507
    move/from16 v5, v33

    .line 508
    .line 509
    goto/16 :goto_0

    .line 510
    .line 511
    :catchall_0
    move-exception v0

    .line 512
    goto :goto_6

    .line 513
    :cond_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 517
    .line 518
    .line 519
    return-object v2

    .line 520
    :catchall_1
    move-exception v0

    .line 521
    move-object/from16 v16, v1

    .line 522
    .line 523
    :goto_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 527
    .line 528
    .line 529
    throw v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 34

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    iget-object v3, v2, Ll2/j;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 13
    .line 14
    invoke-virtual {v3}, Lz0/i;->b()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    const-string v4, "required_network_type"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const-string v5, "requires_charging"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const-string v6, "requires_device_idle"

    .line 34
    .line 35
    invoke-static {v3, v6}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const-string v7, "requires_battery_not_low"

    .line 40
    .line 41
    invoke-static {v3, v7}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const-string v8, "requires_storage_not_low"

    .line 46
    .line 47
    invoke-static {v3, v8}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const-string v9, "trigger_content_update_delay"

    .line 52
    .line 53
    invoke-static {v3, v9}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const-string v10, "trigger_max_content_delay"

    .line 58
    .line 59
    invoke-static {v3, v10}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    const-string v11, "content_uri_triggers"

    .line 64
    .line 65
    invoke-static {v3, v11}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const-string v12, "id"

    .line 70
    .line 71
    invoke-static {v3, v12}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    const-string v13, "state"

    .line 76
    .line 77
    invoke-static {v3, v13}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    const-string v14, "worker_class_name"

    .line 82
    .line 83
    invoke-static {v3, v14}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const-string v15, "input_merger_class_name"

    .line 88
    .line 89
    invoke-static {v3, v15}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    const-string v0, "input"

    .line 94
    .line 95
    invoke-static {v3, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 99
    move-object/from16 v16, v1

    .line 100
    .line 101
    :try_start_1
    const-string v1, "output"

    .line 102
    .line 103
    invoke-static {v3, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const-string v2, "initial_delay"

    .line 108
    .line 109
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    move/from16 v17, v2

    .line 114
    .line 115
    const-string v2, "interval_duration"

    .line 116
    .line 117
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move/from16 v18, v2

    .line 122
    .line 123
    const-string v2, "flex_duration"

    .line 124
    .line 125
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    move/from16 v19, v2

    .line 130
    .line 131
    const-string v2, "run_attempt_count"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    move/from16 v20, v2

    .line 138
    .line 139
    const-string v2, "backoff_policy"

    .line 140
    .line 141
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    move/from16 v21, v2

    .line 146
    .line 147
    const-string v2, "backoff_delay_duration"

    .line 148
    .line 149
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    move/from16 v22, v2

    .line 154
    .line 155
    const-string v2, "period_start_time"

    .line 156
    .line 157
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move/from16 v23, v2

    .line 162
    .line 163
    const-string v2, "minimum_retention_duration"

    .line 164
    .line 165
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    move/from16 v24, v2

    .line 170
    .line 171
    const-string v2, "schedule_requested_at"

    .line 172
    .line 173
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move/from16 v25, v2

    .line 178
    .line 179
    const-string v2, "run_in_foreground"

    .line 180
    .line 181
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    move/from16 v26, v2

    .line 186
    .line 187
    const-string v2, "out_of_quota_policy"

    .line 188
    .line 189
    invoke-static {v3, v2}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    move/from16 v27, v2

    .line 194
    .line 195
    new-instance v2, Ljava/util/ArrayList;

    .line 196
    .line 197
    move/from16 v28, v1

    .line 198
    .line 199
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move/from16 v29, v12

    .line 217
    .line 218
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    move/from16 v30, v14

    .line 223
    .line 224
    new-instance v14, Landroidx/work/c;

    .line 225
    .line 226
    invoke-direct {v14}, Landroidx/work/c;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 230
    .line 231
    .line 232
    move-result v31

    .line 233
    move/from16 v32, v4

    .line 234
    .line 235
    invoke-static/range {v31 .. v31}, Lz2/b;->n(I)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    iput v4, v14, Landroidx/work/c;->a:I

    .line 240
    .line 241
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    const/16 v31, 0x1

    .line 246
    .line 247
    if-eqz v4, :cond_0

    .line 248
    .line 249
    move/from16 v4, v31

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_0
    const/4 v4, 0x0

    .line 253
    :goto_1
    iput-boolean v4, v14, Landroidx/work/c;->b:Z

    .line 254
    .line 255
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_1

    .line 260
    .line 261
    move/from16 v4, v31

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_1
    const/4 v4, 0x0

    .line 265
    :goto_2
    iput-boolean v4, v14, Landroidx/work/c;->c:Z

    .line 266
    .line 267
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_2

    .line 272
    .line 273
    move/from16 v4, v31

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_2
    const/4 v4, 0x0

    .line 277
    :goto_3
    iput-boolean v4, v14, Landroidx/work/c;->d:Z

    .line 278
    .line 279
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-eqz v4, :cond_3

    .line 284
    .line 285
    move/from16 v4, v31

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_3
    const/4 v4, 0x0

    .line 289
    :goto_4
    iput-boolean v4, v14, Landroidx/work/c;->e:Z

    .line 290
    .line 291
    move/from16 v33, v5

    .line 292
    .line 293
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    iput-wide v4, v14, Landroidx/work/c;->f:J

    .line 298
    .line 299
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    iput-wide v4, v14, Landroidx/work/c;->g:J

    .line 304
    .line 305
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {v4}, Lz2/b;->a([B)Landroidx/work/e;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iput-object v4, v14, Landroidx/work/c;->h:Landroidx/work/e;

    .line 314
    .line 315
    new-instance v4, Lt1/i;

    .line 316
    .line 317
    invoke-direct {v4, v1, v12}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-static {v1}, Lz2/b;->p(I)I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    iput v1, v4, Lt1/i;->b:I

    .line 329
    .line 330
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    iput-object v1, v4, Lt1/i;->d:Ljava/lang/String;

    .line 335
    .line 336
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-static {v1}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iput-object v1, v4, Lt1/i;->e:Landroidx/work/g;

    .line 345
    .line 346
    move/from16 v1, v28

    .line 347
    .line 348
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-static {v5}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    iput-object v5, v4, Lt1/i;->f:Landroidx/work/g;

    .line 357
    .line 358
    move v12, v0

    .line 359
    move/from16 v28, v1

    .line 360
    .line 361
    move/from16 v5, v17

    .line 362
    .line 363
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 364
    .line 365
    .line 366
    move-result-wide v0

    .line 367
    iput-wide v0, v4, Lt1/i;->g:J

    .line 368
    .line 369
    move/from16 v17, v5

    .line 370
    .line 371
    move v1, v6

    .line 372
    move/from16 v0, v18

    .line 373
    .line 374
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v5

    .line 378
    iput-wide v5, v4, Lt1/i;->h:J

    .line 379
    .line 380
    move/from16 v18, v0

    .line 381
    .line 382
    move v6, v1

    .line 383
    move/from16 v5, v19

    .line 384
    .line 385
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    iput-wide v0, v4, Lt1/i;->i:J

    .line 390
    .line 391
    move/from16 v0, v20

    .line 392
    .line 393
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    iput v1, v4, Lt1/i;->k:I

    .line 398
    .line 399
    move/from16 v1, v21

    .line 400
    .line 401
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 402
    .line 403
    .line 404
    move-result v19

    .line 405
    move/from16 v20, v0

    .line 406
    .line 407
    invoke-static/range {v19 .. v19}, Lz2/b;->m(I)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    iput v0, v4, Lt1/i;->l:I

    .line 412
    .line 413
    move/from16 v19, v5

    .line 414
    .line 415
    move/from16 v21, v6

    .line 416
    .line 417
    move/from16 v0, v22

    .line 418
    .line 419
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 420
    .line 421
    .line 422
    move-result-wide v5

    .line 423
    iput-wide v5, v4, Lt1/i;->m:J

    .line 424
    .line 425
    move/from16 v22, v0

    .line 426
    .line 427
    move v6, v1

    .line 428
    move/from16 v5, v23

    .line 429
    .line 430
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 431
    .line 432
    .line 433
    move-result-wide v0

    .line 434
    iput-wide v0, v4, Lt1/i;->n:J

    .line 435
    .line 436
    move/from16 v23, v5

    .line 437
    .line 438
    move v1, v6

    .line 439
    move/from16 v0, v24

    .line 440
    .line 441
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 442
    .line 443
    .line 444
    move-result-wide v5

    .line 445
    iput-wide v5, v4, Lt1/i;->o:J

    .line 446
    .line 447
    move/from16 v24, v0

    .line 448
    .line 449
    move v6, v1

    .line 450
    move/from16 v5, v25

    .line 451
    .line 452
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 453
    .line 454
    .line 455
    move-result-wide v0

    .line 456
    iput-wide v0, v4, Lt1/i;->p:J

    .line 457
    .line 458
    move/from16 v0, v26

    .line 459
    .line 460
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    if-eqz v1, :cond_4

    .line 465
    .line 466
    move/from16 v1, v31

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_4
    const/4 v1, 0x0

    .line 470
    :goto_5
    iput-boolean v1, v4, Lt1/i;->q:Z

    .line 471
    .line 472
    move/from16 v1, v27

    .line 473
    .line 474
    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 475
    .line 476
    .line 477
    move-result v25

    .line 478
    move/from16 v26, v0

    .line 479
    .line 480
    invoke-static/range {v25 .. v25}, Lz2/b;->o(I)I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    iput v0, v4, Lt1/i;->r:I

    .line 485
    .line 486
    iput-object v14, v4, Lt1/i;->j:Landroidx/work/c;

    .line 487
    .line 488
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 489
    .line 490
    .line 491
    move/from16 v0, v21

    .line 492
    .line 493
    move/from16 v21, v6

    .line 494
    .line 495
    move v6, v0

    .line 496
    move/from16 v27, v1

    .line 497
    .line 498
    move/from16 v25, v5

    .line 499
    .line 500
    move v0, v12

    .line 501
    move/from16 v12, v29

    .line 502
    .line 503
    move/from16 v14, v30

    .line 504
    .line 505
    move/from16 v4, v32

    .line 506
    .line 507
    move/from16 v5, v33

    .line 508
    .line 509
    goto/16 :goto_0

    .line 510
    .line 511
    :catchall_0
    move-exception v0

    .line 512
    goto :goto_6

    .line 513
    :cond_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 517
    .line 518
    .line 519
    return-object v2

    .line 520
    :catchall_1
    move-exception v0

    .line 521
    move-object/from16 v16, v1

    .line 522
    .line 523
    :goto_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 527
    .line 528
    .line 529
    throw v0
.end method

.method public e(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "SELECT state FROM workspec WHERE id=?"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lz0/j;->f(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2, v1, p1}, Lz0/j;->g(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Lz2/b;->p(I)I

    .line 40
    .line 41
    .line 42
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 50
    .line 51
    .line 52
    return v1

    .line 53
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public f()Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, v1}, Lz0/j;->f(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method public g()Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "offline_ping_sender_work"

    .line 13
    .line 14
    invoke-virtual {v2, v1, v3}, Lz0/j;->g(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 61
    .line 62
    .line 63
    throw v1
.end method

.method public h(Ljava/lang/String;)Lt1/i;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ll2/j;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const-string v4, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?"

    .line 11
    .line 12
    invoke-static {v3, v4}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v4, v3}, Lz0/j;->f(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v4, v3, v0}, Lz0/j;->g(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v2}, Lz0/i;->b()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v4}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :try_start_0
    const-string v0, "required_network_type"

    .line 33
    .line 34
    invoke-static {v2, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-string v5, "requires_charging"

    .line 39
    .line 40
    invoke-static {v2, v5}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "requires_device_idle"

    .line 45
    .line 46
    invoke-static {v2, v6}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "requires_battery_not_low"

    .line 51
    .line 52
    invoke-static {v2, v7}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "requires_storage_not_low"

    .line 57
    .line 58
    invoke-static {v2, v8}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "trigger_content_update_delay"

    .line 63
    .line 64
    invoke-static {v2, v9}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "trigger_max_content_delay"

    .line 69
    .line 70
    invoke-static {v2, v10}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "content_uri_triggers"

    .line 75
    .line 76
    invoke-static {v2, v11}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "id"

    .line 81
    .line 82
    invoke-static {v2, v12}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "state"

    .line 87
    .line 88
    invoke-static {v2, v13}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "worker_class_name"

    .line 93
    .line 94
    invoke-static {v2, v14}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "input_merger_class_name"

    .line 99
    .line 100
    invoke-static {v2, v15}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v3, "input"

    .line 105
    .line 106
    invoke-static {v2, v3}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    const-string v1, "output"

    .line 111
    .line 112
    invoke-static {v2, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 116
    move-object/from16 v16, v4

    .line 117
    .line 118
    :try_start_1
    const-string v4, "initial_delay"

    .line 119
    .line 120
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    move/from16 p1, v4

    .line 125
    .line 126
    const-string v4, "interval_duration"

    .line 127
    .line 128
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    move/from16 v17, v4

    .line 133
    .line 134
    const-string v4, "flex_duration"

    .line 135
    .line 136
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    move/from16 v18, v4

    .line 141
    .line 142
    const-string v4, "run_attempt_count"

    .line 143
    .line 144
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    move/from16 v19, v4

    .line 149
    .line 150
    const-string v4, "backoff_policy"

    .line 151
    .line 152
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    move/from16 v20, v4

    .line 157
    .line 158
    const-string v4, "backoff_delay_duration"

    .line 159
    .line 160
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    move/from16 v21, v4

    .line 165
    .line 166
    const-string v4, "period_start_time"

    .line 167
    .line 168
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    move/from16 v22, v4

    .line 173
    .line 174
    const-string v4, "minimum_retention_duration"

    .line 175
    .line 176
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    move/from16 v23, v4

    .line 181
    .line 182
    const-string v4, "schedule_requested_at"

    .line 183
    .line 184
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    move/from16 v24, v4

    .line 189
    .line 190
    const-string v4, "run_in_foreground"

    .line 191
    .line 192
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    move/from16 v25, v4

    .line 197
    .line 198
    const-string v4, "out_of_quota_policy"

    .line 199
    .line 200
    invoke-static {v2, v4}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 205
    .line 206
    .line 207
    move-result v26

    .line 208
    if-eqz v26, :cond_6

    .line 209
    .line 210
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v12

    .line 214
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v14

    .line 218
    move/from16 v26, v4

    .line 219
    .line 220
    new-instance v4, Landroidx/work/c;

    .line 221
    .line 222
    invoke-direct {v4}, Landroidx/work/c;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-static {v0}, Lz2/b;->n(I)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    iput v0, v4, Landroidx/work/c;->a:I

    .line 234
    .line 235
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    const/4 v5, 0x0

    .line 240
    if-eqz v0, :cond_1

    .line 241
    .line 242
    const/4 v0, 0x1

    .line 243
    goto :goto_1

    .line 244
    :cond_1
    move v0, v5

    .line 245
    :goto_1
    iput-boolean v0, v4, Landroidx/work/c;->b:Z

    .line 246
    .line 247
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_2

    .line 252
    .line 253
    const/4 v0, 0x1

    .line 254
    goto :goto_2

    .line 255
    :cond_2
    move v0, v5

    .line 256
    :goto_2
    iput-boolean v0, v4, Landroidx/work/c;->c:Z

    .line 257
    .line 258
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_3

    .line 263
    .line 264
    const/4 v0, 0x1

    .line 265
    goto :goto_3

    .line 266
    :cond_3
    move v0, v5

    .line 267
    :goto_3
    iput-boolean v0, v4, Landroidx/work/c;->d:Z

    .line 268
    .line 269
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_4

    .line 274
    .line 275
    const/4 v0, 0x1

    .line 276
    goto :goto_4

    .line 277
    :cond_4
    move v0, v5

    .line 278
    :goto_4
    iput-boolean v0, v4, Landroidx/work/c;->e:Z

    .line 279
    .line 280
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    iput-wide v6, v4, Landroidx/work/c;->f:J

    .line 285
    .line 286
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    iput-wide v6, v4, Landroidx/work/c;->g:J

    .line 291
    .line 292
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, Lz2/b;->a([B)Landroidx/work/e;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    iput-object v0, v4, Landroidx/work/c;->h:Landroidx/work/e;

    .line 301
    .line 302
    new-instance v0, Lt1/i;

    .line 303
    .line 304
    invoke-direct {v0, v12, v14}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-static {v6}, Lz2/b;->p(I)I

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    iput v6, v0, Lt1/i;->b:I

    .line 316
    .line 317
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    iput-object v6, v0, Lt1/i;->d:Ljava/lang/String;

    .line 322
    .line 323
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-static {v3}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iput-object v3, v0, Lt1/i;->e:Landroidx/work/g;

    .line 332
    .line 333
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-static {v1}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    iput-object v1, v0, Lt1/i;->f:Landroidx/work/g;

    .line 342
    .line 343
    move/from16 v1, p1

    .line 344
    .line 345
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v6

    .line 349
    iput-wide v6, v0, Lt1/i;->g:J

    .line 350
    .line 351
    move/from16 v1, v17

    .line 352
    .line 353
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    iput-wide v6, v0, Lt1/i;->h:J

    .line 358
    .line 359
    move/from16 v1, v18

    .line 360
    .line 361
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    iput-wide v6, v0, Lt1/i;->i:J

    .line 366
    .line 367
    move/from16 v1, v19

    .line 368
    .line 369
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    iput v1, v0, Lt1/i;->k:I

    .line 374
    .line 375
    move/from16 v1, v20

    .line 376
    .line 377
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    invoke-static {v1}, Lz2/b;->m(I)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iput v1, v0, Lt1/i;->l:I

    .line 386
    .line 387
    move/from16 v1, v21

    .line 388
    .line 389
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    iput-wide v6, v0, Lt1/i;->m:J

    .line 394
    .line 395
    move/from16 v1, v22

    .line 396
    .line 397
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    iput-wide v6, v0, Lt1/i;->n:J

    .line 402
    .line 403
    move/from16 v1, v23

    .line 404
    .line 405
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    iput-wide v6, v0, Lt1/i;->o:J

    .line 410
    .line 411
    move/from16 v1, v24

    .line 412
    .line 413
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v6

    .line 417
    iput-wide v6, v0, Lt1/i;->p:J

    .line 418
    .line 419
    move/from16 v1, v25

    .line 420
    .line 421
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_5

    .line 426
    .line 427
    const/4 v3, 0x1

    .line 428
    goto :goto_5

    .line 429
    :cond_5
    move v3, v5

    .line 430
    :goto_5
    iput-boolean v3, v0, Lt1/i;->q:Z

    .line 431
    .line 432
    move/from16 v1, v26

    .line 433
    .line 434
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    invoke-static {v1}, Lz2/b;->o(I)I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    iput v1, v0, Lt1/i;->r:I

    .line 443
    .line 444
    iput-object v4, v0, Lt1/i;->j:Landroidx/work/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :catchall_0
    move-exception v0

    .line 448
    goto :goto_7

    .line 449
    :cond_6
    const/4 v0, 0x0

    .line 450
    :goto_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 454
    .line 455
    .line 456
    return-object v0

    .line 457
    :catchall_1
    move-exception v0

    .line 458
    move-object/from16 v16, v4

    .line 459
    .line 460
    :goto_7
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v16 .. v16}, Lz0/j;->h()V

    .line 464
    .line 465
    .line 466
    throw v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/j;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Le1/b;->e(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, v3, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object p1, v2, Le1/f;->j:Landroid/database/sqlite/SQLiteStatement;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public j(Lf2/j;I)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    iget-object v2, v3, Lf2/j;->b:[B

    .line 6
    .line 7
    iget-object v0, v1, Ll2/j;->f:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v4, v0

    .line 10
    check-cast v4, Ln2/c;

    .line 11
    .line 12
    iget-object v0, v1, Ll2/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lg2/d;

    .line 15
    .line 16
    iget-object v5, v3, Lf2/j;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v5}, Lg2/d;->a(Ljava/lang/String;)Lg2/e;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    move-object v8, v4

    .line 23
    move-object v9, v5

    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    :goto_0
    new-instance v0, Ll2/g;

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    invoke-direct {v0, v1, v3, v10}, Ll2/g;-><init>(Ll2/j;Lf2/j;I)V

    .line 30
    .line 31
    .line 32
    move-object v11, v8

    .line 33
    check-cast v11, Lm2/h;

    .line 34
    .line 35
    invoke-virtual {v11, v0}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_21

    .line 46
    .line 47
    new-instance v0, Ll2/g;

    .line 48
    .line 49
    const/4 v12, 0x1

    .line 50
    invoke-direct {v0, v1, v3, v12}, Ll2/g;-><init>(Ll2/j;Lf2/j;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v11, v0}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v13, v0

    .line 58
    check-cast v13, Ljava/lang/Iterable;

    .line 59
    .line 60
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_0

    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    const/4 v15, 0x3

    .line 72
    const-wide/16 v6, -0x1

    .line 73
    .line 74
    if-nez v9, :cond_1

    .line 75
    .line 76
    const-string v0, "Uploader"

    .line 77
    .line 78
    const-string v10, "Unknown backend for %s, deleting event batch for it..."

    .line 79
    .line 80
    invoke-static {v0, v10, v3}, Lb3/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lg2/a;

    .line 84
    .line 85
    invoke-direct {v0, v15, v6, v7}, Lg2/a;-><init>(IJ)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v30, v2

    .line 89
    .line 90
    move-wide/from16 v31, v4

    .line 91
    .line 92
    :goto_1
    const/4 v3, 0x2

    .line 93
    goto/16 :goto_12

    .line 94
    .line 95
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v17

    .line 108
    if-eqz v17, :cond_2

    .line 109
    .line 110
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v17

    .line 114
    move-object/from16 v14, v17

    .line 115
    .line 116
    check-cast v14, Lm2/b;

    .line 117
    .line 118
    iget-object v14, v14, Lm2/b;->c:Lf2/i;

    .line 119
    .line 120
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    const/4 v14, 0x5

    .line 125
    const-string v12, "proto"

    .line 126
    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    iget-object v6, v1, Ll2/j;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v6, Lm2/c;

    .line 132
    .line 133
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    new-instance v7, Lcom/getcapacitor/plugin/c;

    .line 137
    .line 138
    invoke-direct {v7, v6, v14}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v7}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    check-cast v6, Li2/a;

    .line 146
    .line 147
    new-instance v7, Lf2/h;

    .line 148
    .line 149
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v15, Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v15, v7, Lf2/h;->f:Ljava/lang/Object;

    .line 158
    .line 159
    iget-object v15, v1, Ll2/j;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v15, Lt2/i;

    .line 162
    .line 163
    invoke-virtual {v15}, Lt2/i;->s()J

    .line 164
    .line 165
    .line 166
    move-result-wide v18

    .line 167
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    iput-object v15, v7, Lf2/h;->d:Ljava/io/Serializable;

    .line 172
    .line 173
    iget-object v15, v1, Ll2/j;->h:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v15, Lt2/i;

    .line 176
    .line 177
    invoke-virtual {v15}, Lt2/i;->s()J

    .line 178
    .line 179
    .line 180
    move-result-wide v18

    .line 181
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    iput-object v15, v7, Lf2/h;->e:Ljava/io/Serializable;

    .line 186
    .line 187
    const-string v15, "GDT_CLIENT_METRICS"

    .line 188
    .line 189
    iput-object v15, v7, Lf2/h;->a:Ljava/io/Serializable;

    .line 190
    .line 191
    new-instance v15, Lf2/n;

    .line 192
    .line 193
    new-instance v14, Lc2/b;

    .line 194
    .line 195
    invoke-direct {v14, v12}, Lc2/b;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object v10, Lf2/p;->a:Landroidx/emoji2/text/t;

    .line 202
    .line 203
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    .line 207
    .line 208
    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 209
    .line 210
    .line 211
    :try_start_0
    invoke-virtual {v10, v6, v1}, Landroidx/emoji2/text/t;->h(Li2/a;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    .line 213
    .line 214
    :catch_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-direct {v15, v14, v1}, Lf2/n;-><init>(Lc2/b;[B)V

    .line 219
    .line 220
    .line 221
    iput-object v15, v7, Lf2/h;->c:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-virtual {v7}, Lf2/h;->c()Lf2/i;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    move-object v6, v9

    .line 228
    check-cast v6, Ld2/c;

    .line 229
    .line 230
    invoke-virtual {v6, v1}, Ld2/c;->a(Lf2/i;)Lf2/i;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    :cond_3
    move-object v1, v9

    .line 238
    check-cast v1, Ld2/c;

    .line 239
    .line 240
    new-instance v6, Ljava/util/HashMap;

    .line 241
    .line 242
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    const/4 v10, 0x0

    .line 250
    :goto_3
    if-ge v10, v7, :cond_5

    .line 251
    .line 252
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    add-int/lit8 v10, v10, 0x1

    .line 257
    .line 258
    check-cast v14, Lf2/i;

    .line 259
    .line 260
    iget-object v15, v14, Lf2/i;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v6, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v20

    .line 266
    if-nez v20, :cond_4

    .line 267
    .line 268
    move-object/from16 v20, v0

    .line 269
    .line 270
    new-instance v0, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    invoke-virtual {v6, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_4
    move-object/from16 v20, v0

    .line 283
    .line 284
    invoke-virtual {v6, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    :goto_4
    move-object/from16 v0, v20

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    const-string v14, "CctTransportBackend"

    .line 314
    .line 315
    if-eqz v7, :cond_10

    .line 316
    .line 317
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    check-cast v7, Ljava/util/Map$Entry;

    .line 322
    .line 323
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    check-cast v15, Ljava/util/List;

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    invoke-interface {v15, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v15

    .line 334
    check-cast v15, Lf2/i;

    .line 335
    .line 336
    sget-object v19, Le2/w;->g:Le2/w;

    .line 337
    .line 338
    iget-object v10, v1, Ld2/c;->f:Lt2/i;

    .line 339
    .line 340
    invoke-virtual {v10}, Lt2/i;->s()J

    .line 341
    .line 342
    .line 343
    move-result-wide v22

    .line 344
    iget-object v10, v1, Ld2/c;->e:Lt2/i;

    .line 345
    .line 346
    invoke-virtual {v10}, Lt2/i;->s()J

    .line 347
    .line 348
    .line 349
    move-result-wide v24

    .line 350
    const-string v10, "sdk-version"

    .line 351
    .line 352
    invoke-virtual {v15, v10}, Lf2/i;->b(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v27

    .line 360
    const-string v10, "model"

    .line 361
    .line 362
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v28

    .line 366
    const-string v10, "hardware"

    .line 367
    .line 368
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v29

    .line 372
    const-string v10, "device"

    .line 373
    .line 374
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v30

    .line 378
    const-string v10, "product"

    .line 379
    .line 380
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v31

    .line 384
    const-string v10, "os-uild"

    .line 385
    .line 386
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v32

    .line 390
    const-string v10, "manufacturer"

    .line 391
    .line 392
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v33

    .line 396
    const-string v10, "fingerprint"

    .line 397
    .line 398
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v34

    .line 402
    const-string v10, "country"

    .line 403
    .line 404
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v36

    .line 408
    const-string v10, "locale"

    .line 409
    .line 410
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v35

    .line 414
    const-string v10, "mcc_mnc"

    .line 415
    .line 416
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v37

    .line 420
    const-string v10, "application_build"

    .line 421
    .line 422
    invoke-virtual {v15, v10}, Lf2/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v38

    .line 426
    new-instance v26, Le2/h;

    .line 427
    .line 428
    invoke-direct/range {v26 .. v38}, Le2/h;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    move-object/from16 v10, v26

    .line 432
    .line 433
    new-instance v15, Le2/j;

    .line 434
    .line 435
    invoke-direct {v15, v10}, Le2/j;-><init>(Le2/h;)V

    .line 436
    .line 437
    .line 438
    :try_start_1
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    check-cast v10, Ljava/lang/String;

    .line 443
    .line 444
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v10
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 452
    move-object/from16 v27, v10

    .line 453
    .line 454
    const/16 v28, 0x0

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :catch_1
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v10

    .line 461
    check-cast v10, Ljava/lang/String;

    .line 462
    .line 463
    move-object/from16 v28, v10

    .line 464
    .line 465
    const/16 v27, 0x0

    .line 466
    .line 467
    :goto_6
    new-instance v10, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v7

    .line 476
    check-cast v7, Ljava/util/List;

    .line 477
    .line 478
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v20

    .line 486
    if-eqz v20, :cond_f

    .line 487
    .line 488
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v20

    .line 492
    move-object/from16 v30, v2

    .line 493
    .line 494
    move-object/from16 v2, v20

    .line 495
    .line 496
    check-cast v2, Lf2/i;

    .line 497
    .line 498
    iget-object v3, v2, Lf2/i;->c:Lf2/n;

    .line 499
    .line 500
    move-wide/from16 v31, v4

    .line 501
    .line 502
    iget-object v4, v3, Lf2/n;->a:Lc2/b;

    .line 503
    .line 504
    iget-object v3, v3, Lf2/n;->b:[B

    .line 505
    .line 506
    new-instance v5, Lc2/b;

    .line 507
    .line 508
    invoke-direct {v5, v12}, Lc2/b;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v4, v5}, Lc2/b;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-eqz v5, :cond_6

    .line 516
    .line 517
    new-instance v4, Lk/h3;

    .line 518
    .line 519
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 520
    .line 521
    .line 522
    iput-object v3, v4, Lk/h3;->j:Ljava/lang/Object;

    .line 523
    .line 524
    move-object/from16 v33, v6

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_6
    new-instance v5, Lc2/b;

    .line 528
    .line 529
    move-object/from16 v33, v6

    .line 530
    .line 531
    const-string v6, "json"

    .line 532
    .line 533
    invoke-direct {v5, v6}, Lc2/b;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v4, v5}, Lc2/b;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    if-eqz v5, :cond_e

    .line 541
    .line 542
    new-instance v4, Ljava/lang/String;

    .line 543
    .line 544
    const-string v5, "UTF-8"

    .line 545
    .line 546
    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 547
    .line 548
    .line 549
    move-result-object v5

    .line 550
    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 551
    .line 552
    .line 553
    new-instance v3, Lk/h3;

    .line 554
    .line 555
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 556
    .line 557
    .line 558
    iput-object v4, v3, Lk/h3;->k:Ljava/lang/Object;

    .line 559
    .line 560
    move-object v4, v3

    .line 561
    :goto_8
    iget-wide v5, v2, Lf2/i;->d:J

    .line 562
    .line 563
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    iput-object v3, v4, Lk/h3;->g:Ljava/lang/Object;

    .line 568
    .line 569
    iget-wide v5, v2, Lf2/i;->e:J

    .line 570
    .line 571
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    iput-object v3, v4, Lk/h3;->i:Ljava/lang/Object;

    .line 576
    .line 577
    const-string v3, "tz-offset"

    .line 578
    .line 579
    iget-object v5, v2, Lf2/i;->f:Ljava/util/Map;

    .line 580
    .line 581
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, Ljava/lang/String;

    .line 586
    .line 587
    if-nez v3, :cond_7

    .line 588
    .line 589
    const-wide/16 v5, 0x0

    .line 590
    .line 591
    goto :goto_9

    .line 592
    :cond_7
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 597
    .line 598
    .line 599
    move-result-wide v5

    .line 600
    :goto_9
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    iput-object v3, v4, Lk/h3;->l:Ljava/lang/Object;

    .line 605
    .line 606
    const-string v3, "net-type"

    .line 607
    .line 608
    invoke-virtual {v2, v3}, Lf2/i;->b(Ljava/lang/String;)I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    sget-object v5, Le2/u;->g:Landroid/util/SparseArray;

    .line 613
    .line 614
    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    check-cast v3, Le2/u;

    .line 619
    .line 620
    const-string v5, "mobile-subtype"

    .line 621
    .line 622
    invoke-virtual {v2, v5}, Lf2/i;->b(Ljava/lang/String;)I

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    sget-object v6, Le2/t;->g:Landroid/util/SparseArray;

    .line 627
    .line 628
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    check-cast v5, Le2/t;

    .line 633
    .line 634
    new-instance v6, Le2/n;

    .line 635
    .line 636
    invoke-direct {v6, v3, v5}, Le2/n;-><init>(Le2/u;Le2/t;)V

    .line 637
    .line 638
    .line 639
    iput-object v6, v4, Lk/h3;->m:Ljava/lang/Object;

    .line 640
    .line 641
    iget-object v2, v2, Lf2/i;->b:Ljava/lang/Integer;

    .line 642
    .line 643
    if-eqz v2, :cond_8

    .line 644
    .line 645
    iput-object v2, v4, Lk/h3;->h:Ljava/lang/Object;

    .line 646
    .line 647
    :cond_8
    iget-object v2, v4, Lk/h3;->g:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v2, Ljava/lang/Long;

    .line 650
    .line 651
    if-nez v2, :cond_9

    .line 652
    .line 653
    const-string v2, " eventTimeMs"

    .line 654
    .line 655
    goto :goto_a

    .line 656
    :cond_9
    const-string v2, ""

    .line 657
    .line 658
    :goto_a
    iget-object v3, v4, Lk/h3;->i:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v3, Ljava/lang/Long;

    .line 661
    .line 662
    if-nez v3, :cond_a

    .line 663
    .line 664
    const-string v3, " eventUptimeMs"

    .line 665
    .line 666
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    :cond_a
    iget-object v3, v4, Lk/h3;->l:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v3, Ljava/lang/Long;

    .line 673
    .line 674
    if-nez v3, :cond_b

    .line 675
    .line 676
    const-string v3, " timezoneOffsetSeconds"

    .line 677
    .line 678
    invoke-static {v2, v3}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    if-eqz v3, :cond_d

    .line 687
    .line 688
    new-instance v34, Le2/k;

    .line 689
    .line 690
    iget-object v2, v4, Lk/h3;->g:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v2, Ljava/lang/Long;

    .line 693
    .line 694
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 695
    .line 696
    .line 697
    move-result-wide v35

    .line 698
    iget-object v2, v4, Lk/h3;->h:Ljava/lang/Object;

    .line 699
    .line 700
    move-object/from16 v37, v2

    .line 701
    .line 702
    check-cast v37, Ljava/lang/Integer;

    .line 703
    .line 704
    iget-object v2, v4, Lk/h3;->i:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v2, Ljava/lang/Long;

    .line 707
    .line 708
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 709
    .line 710
    .line 711
    move-result-wide v38

    .line 712
    iget-object v2, v4, Lk/h3;->j:Ljava/lang/Object;

    .line 713
    .line 714
    move-object/from16 v40, v2

    .line 715
    .line 716
    check-cast v40, [B

    .line 717
    .line 718
    iget-object v2, v4, Lk/h3;->k:Ljava/lang/Object;

    .line 719
    .line 720
    move-object/from16 v41, v2

    .line 721
    .line 722
    check-cast v41, Ljava/lang/String;

    .line 723
    .line 724
    iget-object v2, v4, Lk/h3;->l:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v2, Ljava/lang/Long;

    .line 727
    .line 728
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 729
    .line 730
    .line 731
    move-result-wide v42

    .line 732
    iget-object v2, v4, Lk/h3;->m:Ljava/lang/Object;

    .line 733
    .line 734
    move-object/from16 v44, v2

    .line 735
    .line 736
    check-cast v44, Le2/n;

    .line 737
    .line 738
    invoke-direct/range {v34 .. v44}, Le2/k;-><init>(JLjava/lang/Integer;J[BLjava/lang/String;JLe2/v;)V

    .line 739
    .line 740
    .line 741
    move-object/from16 v2, v34

    .line 742
    .line 743
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    :cond_c
    :goto_b
    move-object/from16 v3, p1

    .line 747
    .line 748
    move-object/from16 v2, v30

    .line 749
    .line 750
    move-wide/from16 v4, v31

    .line 751
    .line 752
    move-object/from16 v6, v33

    .line 753
    .line 754
    goto/16 :goto_7

    .line 755
    .line 756
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 757
    .line 758
    const-string v1, "Missing required properties:"

    .line 759
    .line 760
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    throw v0

    .line 768
    :cond_e
    invoke-static {v14}, Lb3/g;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/4 v3, 0x5

    .line 773
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 774
    .line 775
    .line 776
    move-result v5

    .line 777
    if-eqz v5, :cond_c

    .line 778
    .line 779
    new-instance v3, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    const-string v5, "Received event of unsupported encoding "

    .line 782
    .line 783
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const-string v4, ". Skipping..."

    .line 790
    .line 791
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    goto :goto_b

    .line 802
    :cond_f
    move-object/from16 v30, v2

    .line 803
    .line 804
    move-wide/from16 v31, v4

    .line 805
    .line 806
    move-object/from16 v33, v6

    .line 807
    .line 808
    new-instance v21, Le2/l;

    .line 809
    .line 810
    move-object/from16 v29, v10

    .line 811
    .line 812
    move-object/from16 v26, v15

    .line 813
    .line 814
    invoke-direct/range {v21 .. v29}, Le2/l;-><init>(JJLe2/j;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 815
    .line 816
    .line 817
    move-object/from16 v2, v21

    .line 818
    .line 819
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-object/from16 v3, p1

    .line 823
    .line 824
    move-object/from16 v2, v30

    .line 825
    .line 826
    goto/16 :goto_5

    .line 827
    .line 828
    :cond_10
    move-object/from16 v30, v2

    .line 829
    .line 830
    move-wide/from16 v31, v4

    .line 831
    .line 832
    new-instance v2, Le2/i;

    .line 833
    .line 834
    invoke-direct {v2, v0}, Le2/i;-><init>(Ljava/util/ArrayList;)V

    .line 835
    .line 836
    .line 837
    iget-object v0, v1, Ld2/c;->d:Ljava/net/URL;

    .line 838
    .line 839
    if-eqz v30, :cond_13

    .line 840
    .line 841
    :try_start_2
    invoke-static/range {v30 .. v30}, Ld2/a;->a([B)Ld2/a;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    iget-object v4, v3, Ld2/a;->b:Ljava/lang/String;

    .line 846
    .line 847
    if-eqz v4, :cond_11

    .line 848
    .line 849
    goto :goto_c

    .line 850
    :cond_11
    const/4 v4, 0x0

    .line 851
    :goto_c
    iget-object v3, v3, Ld2/a;->a:Ljava/lang/String;

    .line 852
    .line 853
    if-eqz v3, :cond_12

    .line 854
    .line 855
    invoke-static {v3}, Ld2/c;->b(Ljava/lang/String;)Ljava/net/URL;

    .line 856
    .line 857
    .line 858
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 859
    :cond_12
    :goto_d
    const/4 v3, 0x3

    .line 860
    goto :goto_e

    .line 861
    :catch_2
    new-instance v0, Lg2/a;

    .line 862
    .line 863
    const-wide/16 v1, -0x1

    .line 864
    .line 865
    const/4 v3, 0x3

    .line 866
    invoke-direct {v0, v3, v1, v2}, Lg2/a;-><init>(IJ)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_1

    .line 870
    .line 871
    :cond_13
    const/4 v4, 0x0

    .line 872
    goto :goto_d

    .line 873
    :goto_e
    :try_start_3
    new-instance v5, Landroidx/emoji2/text/t;

    .line 874
    .line 875
    const/4 v6, 0x5

    .line 876
    invoke-direct {v5, v0, v2, v4, v6}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 877
    .line 878
    .line 879
    new-instance v0, Lcom/getcapacitor/plugin/c;

    .line 880
    .line 881
    invoke-direct {v0, v1, v3}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 882
    .line 883
    .line 884
    const/4 v3, 0x5

    .line 885
    :cond_14
    invoke-virtual {v0, v5}, Lcom/getcapacitor/plugin/c;->b(Landroidx/emoji2/text/t;)Ld2/b;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    iget-object v2, v1, Ld2/b;->b:Ljava/net/URL;

    .line 890
    .line 891
    if-eqz v2, :cond_15

    .line 892
    .line 893
    const-string v4, "Following redirect to: %s"

    .line 894
    .line 895
    invoke-static {v14, v4, v2}, Lb3/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    new-instance v4, Landroidx/emoji2/text/t;

    .line 899
    .line 900
    iget-object v6, v5, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v6, Le2/i;

    .line 903
    .line 904
    iget-object v5, v5, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v5, Ljava/lang/String;

    .line 907
    .line 908
    const/4 v7, 0x5

    .line 909
    invoke-direct {v4, v2, v6, v5, v7}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 910
    .line 911
    .line 912
    move-object v5, v4

    .line 913
    goto :goto_f

    .line 914
    :cond_15
    const/4 v7, 0x5

    .line 915
    const/4 v5, 0x0

    .line 916
    :goto_f
    if-eqz v5, :cond_16

    .line 917
    .line 918
    add-int/lit8 v3, v3, -0x1

    .line 919
    .line 920
    const/4 v2, 0x1

    .line 921
    if-ge v3, v2, :cond_14

    .line 922
    .line 923
    :cond_16
    iget v0, v1, Ld2/b;->a:I

    .line 924
    .line 925
    const/16 v2, 0xc8

    .line 926
    .line 927
    if-ne v0, v2, :cond_17

    .line 928
    .line 929
    iget-wide v0, v1, Ld2/b;->c:J

    .line 930
    .line 931
    new-instance v2, Lg2/a;

    .line 932
    .line 933
    const/4 v3, 0x1

    .line 934
    invoke-direct {v2, v3, v0, v1}, Lg2/a;-><init>(IJ)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 935
    .line 936
    .line 937
    move-object v0, v2

    .line 938
    goto/16 :goto_1

    .line 939
    .line 940
    :catch_3
    move-exception v0

    .line 941
    goto :goto_11

    .line 942
    :cond_17
    const/16 v1, 0x1f4

    .line 943
    .line 944
    if-ge v0, v1, :cond_18

    .line 945
    .line 946
    const/16 v1, 0x194

    .line 947
    .line 948
    if-ne v0, v1, :cond_19

    .line 949
    .line 950
    :cond_18
    const-wide/16 v1, -0x1

    .line 951
    .line 952
    goto :goto_10

    .line 953
    :cond_19
    const/16 v1, 0x190

    .line 954
    .line 955
    if-ne v0, v1, :cond_1a

    .line 956
    .line 957
    :try_start_4
    new-instance v0, Lg2/a;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 958
    .line 959
    const-wide/16 v1, -0x1

    .line 960
    .line 961
    const/4 v3, 0x4

    .line 962
    :try_start_5
    invoke-direct {v0, v3, v1, v2}, Lg2/a;-><init>(IJ)V

    .line 963
    .line 964
    .line 965
    goto/16 :goto_1

    .line 966
    .line 967
    :catch_4
    move-exception v0

    .line 968
    const-wide/16 v1, -0x1

    .line 969
    .line 970
    goto :goto_11

    .line 971
    :cond_1a
    const-wide/16 v1, -0x1

    .line 972
    .line 973
    new-instance v0, Lg2/a;

    .line 974
    .line 975
    const/4 v3, 0x3

    .line 976
    invoke-direct {v0, v3, v1, v2}, Lg2/a;-><init>(IJ)V

    .line 977
    .line 978
    .line 979
    goto/16 :goto_1

    .line 980
    .line 981
    :goto_10
    new-instance v0, Lg2/a;

    .line 982
    .line 983
    const/4 v3, 0x2

    .line 984
    invoke-direct {v0, v3, v1, v2}, Lg2/a;-><init>(IJ)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 985
    .line 986
    .line 987
    goto/16 :goto_1

    .line 988
    .line 989
    :goto_11
    const-string v1, "Could not make request to the backend"

    .line 990
    .line 991
    invoke-static {v14, v1, v0}, Lb3/g;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 992
    .line 993
    .line 994
    new-instance v0, Lg2/a;

    .line 995
    .line 996
    const-wide/16 v1, -0x1

    .line 997
    .line 998
    const/4 v3, 0x2

    .line 999
    invoke-direct {v0, v3, v1, v2}, Lg2/a;-><init>(IJ)V

    .line 1000
    .line 1001
    .line 1002
    :goto_12
    iget v1, v0, Lg2/a;->a:I

    .line 1003
    .line 1004
    if-ne v1, v3, :cond_1b

    .line 1005
    .line 1006
    new-instance v0, Ll2/h;

    .line 1007
    .line 1008
    move-object/from16 v1, p0

    .line 1009
    .line 1010
    move-object/from16 v3, p1

    .line 1011
    .line 1012
    move-object v2, v13

    .line 1013
    move-wide/from16 v4, v31

    .line 1014
    .line 1015
    invoke-direct/range {v0 .. v5}, Ll2/h;-><init>(Ll2/j;Ljava/lang/Iterable;Lf2/j;J)V

    .line 1016
    .line 1017
    .line 1018
    move-object v2, v1

    .line 1019
    invoke-virtual {v11, v0}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    iget-object v0, v2, Ll2/j;->d:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v0, Landroidx/emoji2/text/t;

    .line 1025
    .line 1026
    const/4 v4, 0x1

    .line 1027
    add-int/lit8 v1, p2, 0x1

    .line 1028
    .line 1029
    invoke-virtual {v0, v3, v1, v4}, Landroidx/emoji2/text/t;->w(Lf2/j;IZ)V

    .line 1030
    .line 1031
    .line 1032
    return-void

    .line 1033
    :cond_1b
    move-object/from16 v2, p0

    .line 1034
    .line 1035
    move-object/from16 v3, p1

    .line 1036
    .line 1037
    move-object v5, v13

    .line 1038
    move-wide/from16 v6, v31

    .line 1039
    .line 1040
    const/4 v4, 0x1

    .line 1041
    new-instance v10, La2/c;

    .line 1042
    .line 1043
    const/4 v12, 0x3

    .line 1044
    invoke-direct {v10, v12, v2, v5}, La2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v11, v10}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    if-ne v1, v4, :cond_1c

    .line 1051
    .line 1052
    iget-wide v0, v0, Lg2/a;->b:J

    .line 1053
    .line 1054
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 1055
    .line 1056
    .line 1057
    move-result-wide v4

    .line 1058
    if-eqz v30, :cond_20

    .line 1059
    .line 1060
    new-instance v0, Lcom/getcapacitor/plugin/c;

    .line 1061
    .line 1062
    const/4 v1, 0x7

    .line 1063
    invoke-direct {v0, v2, v1}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v11, v0}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    goto :goto_14

    .line 1070
    :cond_1c
    const/4 v4, 0x4

    .line 1071
    if-ne v1, v4, :cond_1f

    .line 1072
    .line 1073
    new-instance v0, Ljava/util/HashMap;

    .line 1074
    .line 1075
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v4

    .line 1086
    if-eqz v4, :cond_1e

    .line 1087
    .line 1088
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v4

    .line 1092
    check-cast v4, Lm2/b;

    .line 1093
    .line 1094
    iget-object v4, v4, Lm2/b;->c:Lf2/i;

    .line 1095
    .line 1096
    iget-object v4, v4, Lf2/i;->a:Ljava/lang/String;

    .line 1097
    .line 1098
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v5

    .line 1102
    if-nez v5, :cond_1d

    .line 1103
    .line 1104
    const/16 v16, 0x1

    .line 1105
    .line 1106
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    goto :goto_13

    .line 1114
    :cond_1d
    const/16 v16, 0x1

    .line 1115
    .line 1116
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v5

    .line 1120
    check-cast v5, Ljava/lang/Integer;

    .line 1121
    .line 1122
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1123
    .line 1124
    .line 1125
    move-result v5

    .line 1126
    add-int/lit8 v5, v5, 0x1

    .line 1127
    .line 1128
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v5

    .line 1132
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    goto :goto_13

    .line 1136
    :cond_1e
    new-instance v1, La2/c;

    .line 1137
    .line 1138
    const/4 v4, 0x4

    .line 1139
    invoke-direct {v1, v4, v2, v0}, La2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v11, v1}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    :cond_1f
    move-wide v4, v6

    .line 1146
    :cond_20
    :goto_14
    move-object v1, v2

    .line 1147
    move-object/from16 v2, v30

    .line 1148
    .line 1149
    goto/16 :goto_0

    .line 1150
    .line 1151
    :cond_21
    move-object v2, v1

    .line 1152
    move-wide v6, v4

    .line 1153
    new-instance v0, Ll2/i;

    .line 1154
    .line 1155
    invoke-direct {v0, v2, v3, v6, v7}, Ll2/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v11, v0}, Lm2/h;->g(Ln2/b;)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    return-void
.end method

.method public k(Ljava/lang/String;J)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/j;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v2, v3, p2, p3}, Le1/b;->d(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Le1/b;->e(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, p2, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object p1, v2, Le1/f;->j:Landroid/database/sqlite/SQLiteStatement;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method

.method public l(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/j;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Le1/b;->e(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, v3, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object p1, v2, Le1/f;->j:Landroid/database/sqlite/SQLiteStatement;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public m(Ljava/lang/String;Landroidx/work/g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/j;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {p2}, Landroidx/work/g;->c(Landroidx/work/g;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Le1/b;->e(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, v3, p2}, Le1/b;->b(I[B)V

    .line 28
    .line 29
    .line 30
    :goto_0
    const/4 p2, 0x2

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, p2}, Le1/b;->e(I)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v2, p2, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 41
    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v2}, Le1/f;->l()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public n(Ljava/lang/String;J)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ll2/j;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v2, v3, p2, p3}, Le1/b;->d(IJ)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x2

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, p2}, Le1/b;->e(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v2, p2, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-virtual {v2}, Le1/f;->l()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method

.method public varargs o(I[Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ll2/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "UPDATE workspec SET state=? WHERE id IN ("

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    array-length v2, p2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v2, :cond_1

    .line 19
    .line 20
    const-string v5, "?"

    .line 21
    .line 22
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v5, v2, -0x1

    .line 26
    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    const-string v5, ","

    .line 30
    .line 31
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v2, ")"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lz0/i;->a()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 50
    .line 51
    .line 52
    iget-object v2, v0, Lz0/i;->c:Ld1/c;

    .line 53
    .line 54
    invoke-interface {v2}, Ld1/c;->c()Le1/b;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v2, v2, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 59
    .line 60
    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {p1}, Lz2/b;->A(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    int-to-long v4, p1

    .line 71
    const/4 p1, 0x1

    .line 72
    invoke-virtual {v1, p1, v4, v5}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 73
    .line 74
    .line 75
    array-length p1, p2

    .line 76
    const/4 v2, 0x2

    .line 77
    :goto_1
    if-ge v3, p1, :cond_3

    .line 78
    .line 79
    aget-object v4, p2, v3

    .line 80
    .line 81
    if-nez v4, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    invoke-virtual {v1, v2, v4}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 96
    .line 97
    .line 98
    :try_start_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 110
    .line 111
    .line 112
    throw p1
.end method
