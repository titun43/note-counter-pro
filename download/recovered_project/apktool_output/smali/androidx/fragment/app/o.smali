.class public final Landroidx/fragment/app/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/x;Lc0/j;)V
    .locals 0

    const/16 p1, 0x8

    iput p1, p0, Landroidx/fragment/app/o;->g:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Landroidx/fragment/app/o;->g:I

    iput-object p1, p0, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu1/f;I)V
    .locals 0

    const/4 p2, 0x4

    iput p2, p0, Landroidx/fragment/app/o;->g:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/HashSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lz0/e;

    .line 9
    .line 10
    iget-object v1, v1, Lz0/e;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 11
    .line 12
    new-instance v2, Landroidx/emoji2/text/r;

    .line 13
    .line 14
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-direct {v2, v3, v4}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lz0/e;

    .line 57
    .line 58
    iget-object v1, v1, Lz0/e;->f:Le1/f;

    .line 59
    .line 60
    invoke-virtual {v1}, Le1/f;->l()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-object v0

    .line 64
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/fragment/app/o;->g:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lz0/e;

    .line 14
    .line 15
    iget-object v0, v0, Lz0/e;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 16
    .line 17
    iget-object v0, v0, Lz0/i;->h:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    :try_start_0
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lz0/e;

    .line 29
    .line 30
    invoke-virtual {v0}, Lz0/e;->a()Z

    .line 31
    .line 32
    .line 33
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    :goto_0
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_0
    :try_start_1
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lz0/e;

    .line 44
    .line 45
    iget-object v0, v0, Lz0/e;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lz0/e;

    .line 57
    .line 58
    iget-object v0, v0, Lz0/e;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    iget-object v0, v0, Lz0/i;->c:Ld1/c;

    .line 61
    .line 62
    invoke-interface {v0}, Ld1/c;->c()Le1/b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, Le1/b;->h:Landroid/database/sqlite/SQLiteClosable;

    .line 67
    .line 68
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lz0/e;

    .line 80
    .line 81
    iget-object v0, v0, Lz0/e;->c:Landroidx/work/impl/WorkDatabase_Impl;

    .line 82
    .line 83
    iget-boolean v2, v0, Lz0/i;->f:Z

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    iget-object v0, v0, Lz0/i;->c:Ld1/c;

    .line 88
    .line 89
    invoke-interface {v0}, Ld1/c;->c()Le1/b;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Le1/b;->a()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :try_start_2
    invoke-virtual {v1}, Landroidx/fragment/app/o;->a()Ljava/util/HashSet;

    .line 97
    .line 98
    .line 99
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 100
    :try_start_3
    invoke-virtual {v2}, Le1/b;->k()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 101
    .line 102
    .line 103
    :try_start_4
    invoke-virtual {v2}, Le1/b;->g()V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    goto :goto_8

    .line 109
    :catch_0
    move-exception v0

    .line 110
    goto :goto_4

    .line 111
    :catch_1
    move-exception v0

    .line 112
    goto :goto_4

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto :goto_1

    .line 115
    :catchall_2
    move-exception v0

    .line 116
    move-object v4, v3

    .line 117
    :goto_1
    invoke-virtual {v2}, Le1/b;->g()V

    .line 118
    .line 119
    .line 120
    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 121
    :catch_2
    move-exception v0

    .line 122
    :goto_2
    move-object v4, v3

    .line 123
    goto :goto_4

    .line 124
    :catch_3
    move-exception v0

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    :try_start_5
    invoke-virtual {v1}, Landroidx/fragment/app/o;->a()Ljava/util/HashSet;

    .line 127
    .line 128
    .line 129
    move-result-object v4
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 130
    :goto_3
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :goto_4
    :try_start_6
    const-string v2, "ROOM"

    .line 135
    .line 136
    const-string v6, "Cannot run invalidation tracker. Is the db closed?"

    .line 137
    .line 138
    invoke-static {v2, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :goto_5
    if-eqz v4, :cond_5

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_5

    .line 149
    .line 150
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Lz0/e;

    .line 153
    .line 154
    iget-object v2, v0, Lz0/e;->h:Lm/f;

    .line 155
    .line 156
    monitor-enter v2

    .line 157
    :try_start_7
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Lz0/e;

    .line 160
    .line 161
    iget-object v0, v0, Lz0/e;->h:Lm/f;

    .line 162
    .line 163
    invoke-virtual {v0}, Lm/f;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Lm/b;

    .line 168
    .line 169
    invoke-virtual {v0}, Lm/b;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_4

    .line 174
    .line 175
    monitor-exit v2

    .line 176
    goto :goto_7

    .line 177
    :catchall_3
    move-exception v0

    .line 178
    goto :goto_6

    .line 179
    :cond_4
    invoke-virtual {v0}, Lm/b;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Ljava/util/Map$Entry;

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Lz0/d;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    throw v3

    .line 195
    :goto_6
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 196
    throw v0

    .line 197
    :cond_5
    :goto_7
    return-void

    .line 198
    :goto_8
    invoke-interface {v5}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :pswitch_0
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Ly1/p;

    .line 205
    .line 206
    iget-object v2, v0, Ly1/p;->b:Ly1/b;

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Ly1/b;->m(I)V

    .line 209
    .line 210
    .line 211
    sget-object v3, Ly1/b0;->j:Ly1/e;

    .line 212
    .line 213
    const/16 v4, 0x18

    .line 214
    .line 215
    const/4 v5, 0x6

    .line 216
    invoke-virtual {v2, v4, v5, v3}, Ly1/b;->t(IILy1/e;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v3}, Ly1/p;->a(Ly1/e;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_1
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v2, v0

    .line 226
    check-cast v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/g;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    const-string v3, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 233
    .line 234
    invoke-virtual {v0, v3}, Landroidx/work/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_6

    .line 243
    .line 244
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/String;

    .line 249
    .line 250
    const-string v5, "No worker to delegate to."

    .line 251
    .line 252
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 253
    .line 254
    invoke-virtual {v0, v3, v5, v4}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 258
    .line 259
    new-instance v2, Landroidx/work/j;

    .line 260
    .line 261
    invoke-direct {v2}, Landroidx/work/j;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_6
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getWorkerFactory()Landroidx/work/v;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    iget-object v6, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 278
    .line 279
    invoke-virtual {v0, v5, v3, v6}, Landroidx/work/v;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iput-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Landroidx/work/ListenableWorker;

    .line 284
    .line 285
    if-nez v0, :cond_7

    .line 286
    .line 287
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    sget-object v3, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/String;

    .line 292
    .line 293
    const-string v5, "No worker to delegate to."

    .line 294
    .line 295
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 296
    .line 297
    invoke-virtual {v0, v3, v5, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 301
    .line 302
    new-instance v2, Landroidx/work/j;

    .line 303
    .line 304
    invoke-direct {v2}, Landroidx/work/j;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    goto/16 :goto_b

    .line 311
    .line 312
    :cond_7
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, Ll1/k;->Q(Landroid/content/Context;)Ll1/k;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v0, v0, Ll1/k;->e:Landroidx/work/impl/WorkDatabase;

    .line 321
    .line 322
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v0, v5}, Ll2/j;->h(Ljava/lang/String;)Lt1/i;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    if-nez v0, :cond_8

    .line 339
    .line 340
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 341
    .line 342
    new-instance v2, Landroidx/work/j;

    .line 343
    .line 344
    invoke-direct {v2}, Landroidx/work/j;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto/16 :goto_b

    .line 351
    .line 352
    :cond_8
    new-instance v5, Lp1/c;

    .line 353
    .line 354
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v2}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->getTaskExecutor()Lw1/a;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-direct {v5, v6, v7, v2}, Lp1/c;-><init>(Landroid/content/Context;Lw1/a;Lp1/b;)V

    .line 363
    .line 364
    .line 365
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v5, v0}, Lp1/c;->b(Ljava/util/Collection;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v5, v0}, Lp1/c;->a(Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_a

    .line 385
    .line 386
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    sget-object v5, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/String;

    .line 391
    .line 392
    const-string v6, "Constraints met for delegate "

    .line 393
    .line 394
    invoke-static {v6, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    new-array v7, v4, [Ljava/lang/Throwable;

    .line 399
    .line 400
    invoke-virtual {v0, v5, v6, v7}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 401
    .line 402
    .line 403
    :try_start_8
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->k:Landroidx/work/ListenableWorker;

    .line 404
    .line 405
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->startWork()Lj3/a;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    new-instance v5, Lc0/a;

    .line 410
    .line 411
    const/16 v6, 0x16

    .line 412
    .line 413
    invoke-direct {v5, v2, v0, v6, v4}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->getBackgroundExecutor()Ljava/util/concurrent/Executor;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    invoke-interface {v0, v5, v6}, Lj3/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 421
    .line 422
    .line 423
    goto :goto_b

    .line 424
    :catchall_4
    move-exception v0

    .line 425
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    sget-object v6, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/String;

    .line 430
    .line 431
    const-string v7, "Delegated worker "

    .line 432
    .line 433
    const-string v8, " threw exception in startWork."

    .line 434
    .line 435
    invoke-static {v7, v3, v8}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    filled-new-array {v0}, [Ljava/lang/Throwable;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v5, v6, v3, v0}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    iget-object v5, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Ljava/lang/Object;

    .line 447
    .line 448
    monitor-enter v5

    .line 449
    :try_start_9
    iget-boolean v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Z

    .line 450
    .line 451
    if-eqz v0, :cond_9

    .line 452
    .line 453
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    const-string v3, "Constraints were unmet, Retrying."

    .line 458
    .line 459
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 460
    .line 461
    invoke-virtual {v0, v6, v3, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 462
    .line 463
    .line 464
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 465
    .line 466
    new-instance v2, Landroidx/work/k;

    .line 467
    .line 468
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    goto :goto_9

    .line 475
    :catchall_5
    move-exception v0

    .line 476
    goto :goto_a

    .line 477
    :cond_9
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 478
    .line 479
    new-instance v2, Landroidx/work/j;

    .line 480
    .line 481
    invoke-direct {v2}, Landroidx/work/j;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    :goto_9
    monitor-exit v5

    .line 488
    goto :goto_b

    .line 489
    :goto_a
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 490
    throw v0

    .line 491
    :cond_a
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sget-object v5, Landroidx/work/impl/workers/ConstraintTrackingWorker;->l:Ljava/lang/String;

    .line 496
    .line 497
    const-string v6, "Constraints not met for delegate "

    .line 498
    .line 499
    const-string v7, ". Requesting retry."

    .line 500
    .line 501
    invoke-static {v6, v3, v7}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 506
    .line 507
    invoke-virtual {v0, v5, v3, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 508
    .line 509
    .line 510
    iget-object v0, v2, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 511
    .line 512
    new-instance v2, Landroidx/work/k;

    .line 513
    .line 514
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    :goto_b
    return-void

    .line 521
    :pswitch_2
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    .line 524
    .line 525
    iput-boolean v4, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->b:Z

    .line 526
    .line 527
    iput-boolean v2, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->c:Z

    .line 528
    .line 529
    iget-object v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->a:Lorg/apache/cordova/g0;

    .line 530
    .line 531
    check-cast v0, Lk1/j;

    .line 532
    .line 533
    iget-object v0, v0, Lk1/j;->h:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 536
    .line 537
    iget-object v0, v0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 538
    .line 539
    if-eqz v0, :cond_b

    .line 540
    .line 541
    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V

    .line 542
    .line 543
    .line 544
    :cond_b
    return-void

    .line 545
    :pswitch_3
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 548
    .line 549
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :pswitch_4
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 556
    .line 557
    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->l:Z

    .line 558
    .line 559
    if-eqz v2, :cond_c

    .line 560
    .line 561
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const-string v3, "input_method"

    .line 566
    .line 567
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 572
    .line 573
    invoke-virtual {v2, v0, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 574
    .line 575
    .line 576
    iput-boolean v4, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->l:Z

    .line 577
    .line 578
    :cond_c
    return-void

    .line 579
    :pswitch_5
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v0, Lk/t1;

    .line 582
    .line 583
    iput-object v3, v0, Lk/t1;->r:Landroidx/fragment/app/o;

    .line 584
    .line 585
    invoke-virtual {v0}, Lk/t1;->drawableStateChanged()V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_6
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Li0/d;

    .line 592
    .line 593
    iget-object v2, v0, Li0/d;->i:Lk/t1;

    .line 594
    .line 595
    iget-object v3, v0, Li0/d;->g:Li0/a;

    .line 596
    .line 597
    iget-boolean v5, v0, Li0/d;->u:Z

    .line 598
    .line 599
    if-nez v5, :cond_d

    .line 600
    .line 601
    goto/16 :goto_d

    .line 602
    .line 603
    :cond_d
    iget-boolean v5, v0, Li0/d;->s:Z

    .line 604
    .line 605
    if-eqz v5, :cond_e

    .line 606
    .line 607
    iput-boolean v4, v0, Li0/d;->s:Z

    .line 608
    .line 609
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 610
    .line 611
    .line 612
    move-result-wide v5

    .line 613
    iput-wide v5, v3, Li0/a;->e:J

    .line 614
    .line 615
    const-wide/16 v7, -0x1

    .line 616
    .line 617
    iput-wide v7, v3, Li0/a;->g:J

    .line 618
    .line 619
    iput-wide v5, v3, Li0/a;->f:J

    .line 620
    .line 621
    const/high16 v5, 0x3f000000    # 0.5f

    .line 622
    .line 623
    iput v5, v3, Li0/a;->h:F

    .line 624
    .line 625
    :cond_e
    iget-wide v5, v3, Li0/a;->g:J

    .line 626
    .line 627
    const-wide/16 v7, 0x0

    .line 628
    .line 629
    cmp-long v5, v5, v7

    .line 630
    .line 631
    if-lez v5, :cond_f

    .line 632
    .line 633
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 634
    .line 635
    .line 636
    move-result-wide v5

    .line 637
    iget-wide v9, v3, Li0/a;->g:J

    .line 638
    .line 639
    iget v11, v3, Li0/a;->i:I

    .line 640
    .line 641
    int-to-long v11, v11

    .line 642
    add-long/2addr v9, v11

    .line 643
    cmp-long v5, v5, v9

    .line 644
    .line 645
    if-lez v5, :cond_f

    .line 646
    .line 647
    goto :goto_c

    .line 648
    :cond_f
    invoke-virtual {v0}, Li0/d;->e()Z

    .line 649
    .line 650
    .line 651
    move-result v5

    .line 652
    if-nez v5, :cond_10

    .line 653
    .line 654
    :goto_c
    iput-boolean v4, v0, Li0/d;->u:Z

    .line 655
    .line 656
    goto :goto_d

    .line 657
    :cond_10
    iget-boolean v5, v0, Li0/d;->t:Z

    .line 658
    .line 659
    if-eqz v5, :cond_11

    .line 660
    .line 661
    iput-boolean v4, v0, Li0/d;->t:Z

    .line 662
    .line 663
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 664
    .line 665
    .line 666
    move-result-wide v9

    .line 667
    const/4 v15, 0x0

    .line 668
    const/16 v16, 0x0

    .line 669
    .line 670
    const/4 v13, 0x3

    .line 671
    const/4 v14, 0x0

    .line 672
    move-wide v11, v9

    .line 673
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 674
    .line 675
    .line 676
    move-result-object v4

    .line 677
    invoke-virtual {v2, v4}, Lk/t1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 678
    .line 679
    .line 680
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 681
    .line 682
    .line 683
    :cond_11
    iget-wide v4, v3, Li0/a;->f:J

    .line 684
    .line 685
    cmp-long v4, v4, v7

    .line 686
    .line 687
    if-eqz v4, :cond_12

    .line 688
    .line 689
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 690
    .line 691
    .line 692
    move-result-wide v4

    .line 693
    invoke-virtual {v3, v4, v5}, Li0/a;->a(J)F

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    const/high16 v7, -0x3f800000    # -4.0f

    .line 698
    .line 699
    mul-float/2addr v7, v6

    .line 700
    mul-float/2addr v7, v6

    .line 701
    const/high16 v8, 0x40800000    # 4.0f

    .line 702
    .line 703
    mul-float/2addr v6, v8

    .line 704
    add-float/2addr v6, v7

    .line 705
    iget-wide v7, v3, Li0/a;->f:J

    .line 706
    .line 707
    sub-long v7, v4, v7

    .line 708
    .line 709
    iput-wide v4, v3, Li0/a;->f:J

    .line 710
    .line 711
    long-to-float v4, v7

    .line 712
    mul-float/2addr v4, v6

    .line 713
    iget v3, v3, Li0/a;->d:F

    .line 714
    .line 715
    mul-float/2addr v4, v3

    .line 716
    float-to-int v3, v4

    .line 717
    iget-object v0, v0, Li0/d;->w:Lk/t1;

    .line 718
    .line 719
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 720
    .line 721
    .line 722
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 723
    .line 724
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 725
    .line 726
    .line 727
    :goto_d
    return-void

    .line 728
    :cond_12
    new-instance v0, Ljava/lang/RuntimeException;

    .line 729
    .line 730
    const-string v2, "Cannot compute scroll delta before calling start()"

    .line 731
    .line 732
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    throw v0

    .line 736
    :pswitch_7
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, Lh3/k;

    .line 739
    .line 740
    iget-object v2, v0, Lh3/k;->c:Ljava/lang/Object;

    .line 741
    .line 742
    monitor-enter v2

    .line 743
    :try_start_a
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Lh3/k;

    .line 746
    .line 747
    iget-object v0, v0, Lh3/k;->d:Lh3/j;

    .line 748
    .line 749
    iget-object v0, v0, Lh3/j;->c:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v0, Lh3/n;

    .line 752
    .line 753
    invoke-virtual {v0}, Lh3/n;->f()V

    .line 754
    .line 755
    .line 756
    monitor-exit v2

    .line 757
    return-void

    .line 758
    :catchall_6
    move-exception v0

    .line 759
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 760
    throw v0

    .line 761
    :pswitch_8
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Lg/n0;

    .line 764
    .line 765
    iget-object v2, v0, Lg/n0;->b:Landroid/view/Window$Callback;

    .line 766
    .line 767
    invoke-virtual {v0}, Lg/n0;->p()Landroid/view/Menu;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    instance-of v5, v0, Lj/n;

    .line 772
    .line 773
    if-eqz v5, :cond_13

    .line 774
    .line 775
    move-object v5, v0

    .line 776
    check-cast v5, Lj/n;

    .line 777
    .line 778
    goto :goto_e

    .line 779
    :cond_13
    move-object v5, v3

    .line 780
    :goto_e
    if-eqz v5, :cond_14

    .line 781
    .line 782
    invoke-virtual {v5}, Lj/n;->w()V

    .line 783
    .line 784
    .line 785
    :cond_14
    :try_start_b
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 786
    .line 787
    .line 788
    invoke-interface {v2, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 789
    .line 790
    .line 791
    move-result v6

    .line 792
    if-eqz v6, :cond_15

    .line 793
    .line 794
    invoke-interface {v2, v4, v3, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-nez v2, :cond_16

    .line 799
    .line 800
    goto :goto_f

    .line 801
    :catchall_7
    move-exception v0

    .line 802
    goto :goto_10

    .line 803
    :cond_15
    :goto_f
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 804
    .line 805
    .line 806
    :cond_16
    if-eqz v5, :cond_17

    .line 807
    .line 808
    invoke-virtual {v5}, Lj/n;->v()V

    .line 809
    .line 810
    .line 811
    :cond_17
    return-void

    .line 812
    :goto_10
    if-eqz v5, :cond_18

    .line 813
    .line 814
    invoke-virtual {v5}, Lj/n;->v()V

    .line 815
    .line 816
    .line 817
    :cond_18
    throw v0

    .line 818
    :pswitch_9
    :try_start_c
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v0, Ljava/lang/Runnable;

    .line 821
    .line 822
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    .line 823
    .line 824
    .line 825
    goto :goto_11

    .line 826
    :catch_4
    move-exception v0

    .line 827
    const-string v2, "Executor"

    .line 828
    .line 829
    const-string v3, "Background execution failure."

    .line 830
    .line 831
    invoke-static {v2, v3, v0}, Lb3/g;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 832
    .line 833
    .line 834
    :goto_11
    return-void

    .line 835
    :pswitch_a
    throw v3

    .line 836
    :pswitch_b
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v0, Lcom/google/android/gms/common/api/internal/j0;

    .line 839
    .line 840
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 841
    .line 842
    new-instance v2, Lt2/b;

    .line 843
    .line 844
    const/4 v4, 0x4

    .line 845
    invoke-direct {v2, v4, v3, v3}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/c0;->b(Lt2/b;)V

    .line 849
    .line 850
    .line 851
    return-void

    .line 852
    :pswitch_c
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v0, Lk1/j;

    .line 855
    .line 856
    iget-object v0, v0, Lk1/j;->h:Ljava/lang/Object;

    .line 857
    .line 858
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 859
    .line 860
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 861
    .line 862
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const-string v3, " disconnecting because it was signed out."

    .line 871
    .line 872
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    :pswitch_d
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 883
    .line 884
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a0;->f()V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    :pswitch_e
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, Lu1/f;

    .line 891
    .line 892
    iget-object v0, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 893
    .line 894
    return-void

    .line 895
    :pswitch_f
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 896
    .line 897
    check-cast v0, Landroidx/lifecycle/a0;

    .line 898
    .line 899
    iget-object v3, v0, Landroidx/lifecycle/a0;->a:Ljava/lang/Object;

    .line 900
    .line 901
    monitor-enter v3

    .line 902
    :try_start_d
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v0, Landroidx/lifecycle/a0;

    .line 905
    .line 906
    iget-object v0, v0, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    .line 907
    .line 908
    iget-object v2, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v2, Landroidx/lifecycle/a0;

    .line 911
    .line 912
    sget-object v4, Landroidx/lifecycle/a0;->k:Ljava/lang/Object;

    .line 913
    .line 914
    iput-object v4, v2, Landroidx/lifecycle/a0;->f:Ljava/lang/Object;

    .line 915
    .line 916
    monitor-exit v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 917
    iget-object v2, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v2, Landroidx/lifecycle/a0;

    .line 920
    .line 921
    invoke-virtual {v2, v0}, Landroidx/lifecycle/a0;->e(Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    return-void

    .line 925
    :catchall_8
    move-exception v0

    .line 926
    :try_start_e
    monitor-exit v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 927
    throw v0

    .line 928
    :pswitch_10
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v0, Landroidx/fragment/app/u0;

    .line 931
    .line 932
    invoke-virtual {v0, v2}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :pswitch_11
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v0, Landroidx/fragment/app/z;

    .line 939
    .line 940
    iget-object v2, v0, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 941
    .line 942
    if-eqz v2, :cond_19

    .line 943
    .line 944
    invoke-virtual {v0}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    :cond_19
    return-void

    .line 952
    :pswitch_12
    iget-object v0, v1, Landroidx/fragment/app/o;->h:Ljava/lang/Object;

    .line 953
    .line 954
    check-cast v0, Landroidx/fragment/app/s;

    .line 955
    .line 956
    iget-object v2, v0, Landroidx/fragment/app/s;->b0:Landroidx/fragment/app/q;

    .line 957
    .line 958
    iget-object v0, v0, Landroidx/fragment/app/s;->j0:Landroid/app/Dialog;

    .line 959
    .line 960
    invoke-virtual {v2, v0}, Landroidx/fragment/app/q;->onDismiss(Landroid/content/DialogInterface;)V

    .line 961
    .line 962
    .line 963
    return-void

    .line 964
    nop

    .line 965
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
