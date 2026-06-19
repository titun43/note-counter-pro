.class public final Lc0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/a;->g:I

    iput-object p2, p0, Lc0/a;->h:Ljava/lang/Object;

    iput-object p3, p0, Lc0/a;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lc0/a;->g:I

    iput-object p1, p0, Lc0/a;->i:Ljava/lang/Object;

    iput-object p2, p0, Lc0/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 11
    .line 12
    iget-boolean v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 19
    .line 20
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 21
    .line 22
    new-instance v2, Landroidx/work/k;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lv1/j;

    .line 36
    .line 37
    iget-object v2, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lj3/a;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lv1/j;->j(Lj3/a;)Z

    .line 42
    .line 43
    .line 44
    :goto_0
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lc0/a;->g:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ly1/b;

    .line 14
    .line 15
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ly1/e;

    .line 18
    .line 19
    iget-object v3, v0, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 20
    .line 21
    iget-object v3, v3, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ly1/i;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Ly1/b;->e:Lcom/google/android/gms/common/api/internal/c0;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ly1/i;

    .line 32
    .line 33
    invoke-interface {v0, v1, v2}, Ly1/i;->onPurchasesUpdated(Ly1/e;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v0, "BillingClient"

    .line 38
    .line 39
    const-string v1, "No valid listener is set in BroadcastManager"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :pswitch_0
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ly1/b;

    .line 48
    .line 49
    iget-object v2, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lcom/getcapacitor/plugin/c;

    .line 52
    .line 53
    sget-object v3, Ly1/b0;->j:Ly1/e;

    .line 54
    .line 55
    const/4 v4, 0x7

    .line 56
    invoke-virtual {v0, v1, v4, v3}, Ly1/b;->t(IILy1/e;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3, v0}, Lcom/getcapacitor/plugin/c;->f(Ly1/e;Ljava/util/ArrayList;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/concurrent/Future;

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Runnable;

    .line 87
    .line 88
    invoke-interface {v0, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 89
    .line 90
    .line 91
    const-string v0, "BillingClient"

    .line 92
    .line 93
    const-string v2, "Async task is taking too long, cancel it!"

    .line 94
    .line 95
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 101
    .line 102
    .line 103
    :cond_1
    return-void

    .line 104
    :pswitch_2
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ly1/b;

    .line 107
    .line 108
    iget-object v2, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, La2/d;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v3, Ly1/b0;->j:Ly1/e;

    .line 116
    .line 117
    const/16 v4, 0x9

    .line 118
    .line 119
    invoke-virtual {v0, v1, v4, v3}, Ly1/b;->t(IILy1/e;)V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzco;->zzl()Lcom/google/android/gms/internal/play_billing/zzco;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v2, v3, v0}, La2/d;->a(Ly1/e;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_3
    invoke-direct {p0}, Lc0/a;->a()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_4
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lu1/i;

    .line 137
    .line 138
    :try_start_0
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Ljava/lang/Runnable;

    .line 141
    .line 142
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Lu1/i;->a()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :catchall_0
    move-exception v1

    .line 150
    invoke-virtual {v0}, Lu1/i;->a()V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :pswitch_5
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 155
    .line 156
    iget-object v1, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 157
    .line 158
    :try_start_1
    sget-object v2, Lu/d;->d:Ljava/lang/reflect/Method;

    .line 159
    .line 160
    if-eqz v2, :cond_2

    .line 161
    .line 162
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 163
    .line 164
    const-string v4, "AppCompat recreation"

    .line 165
    .line 166
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    goto :goto_1

    .line 176
    :catch_0
    move-exception v0

    .line 177
    goto :goto_2

    .line 178
    :cond_2
    sget-object v2, Lu/d;->e:Ljava/lang/reflect/Method;

    .line 179
    .line 180
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :goto_1
    const-string v1, "ActivityRecreator"

    .line 191
    .line 192
    const-string v2, "Exception while invoking performStopActivity"

    .line 193
    .line 194
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    const-class v2, Ljava/lang/RuntimeException;

    .line 203
    .line 204
    if-ne v1, v2, :cond_4

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-eqz v1, :cond_4

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    const-string v2, "Unable to stop"

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_3

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_3
    throw v0

    .line 226
    :cond_4
    :goto_3
    return-void

    .line 227
    :pswitch_6
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Landroid/app/Application;

    .line 230
    .line 231
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v1, Lu/c;

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :pswitch_7
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Lu/c;

    .line 242
    .line 243
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 244
    .line 245
    iput-object v1, v0, Lu/c;->g:Ljava/lang/Object;

    .line 246
    .line 247
    return-void

    .line 248
    :cond_5
    :pswitch_8
    :try_start_2
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Ljava/lang/Runnable;

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :catchall_2
    move-exception v0

    .line 257
    :try_start_3
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 258
    .line 259
    invoke-static {v0, v1}, Lo4/w;->g(Ljava/lang/Throwable;Lw3/h;)V

    .line 260
    .line 261
    .line 262
    :goto_4
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Lt4/h;

    .line 265
    .line 266
    invoke-virtual {v0}, Lt4/h;->o()Ljava/lang/Runnable;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-nez v0, :cond_6

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_6
    iput-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 274
    .line 275
    add-int/2addr v4, v3

    .line 276
    const/16 v0, 0x10

    .line 277
    .line 278
    if-lt v4, v0, :cond_5

    .line 279
    .line 280
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, Lt4/h;

    .line 283
    .line 284
    iget-object v1, v0, Lt4/h;->i:Lo4/r;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 285
    .line 286
    :try_start_4
    invoke-virtual {v1, v0}, Lo4/r;->k(Lw3/h;)Z

    .line 287
    .line 288
    .line 289
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 290
    if-eqz v0, :cond_5

    .line 291
    .line 292
    :try_start_5
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Lt4/h;

    .line 295
    .line 296
    iget-object v1, v0, Lt4/h;->i:Lo4/r;

    .line 297
    .line 298
    invoke-static {v1, v0, p0}, Lt4/b;->i(Lo4/r;Lw3/h;Ljava/lang/Runnable;)V

    .line 299
    .line 300
    .line 301
    :goto_5
    return-void

    .line 302
    :catchall_3
    move-exception v0

    .line 303
    goto :goto_6

    .line 304
    :catchall_4
    move-exception v2

    .line 305
    new-instance v3, Lo4/b0;

    .line 306
    .line 307
    invoke-direct {v3, v2, v1, v0}, Lo4/b0;-><init>(Ljava/lang/Throwable;Lo4/r;Lw3/h;)V

    .line 308
    .line 309
    .line 310
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 311
    :goto_6
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v1, Lt4/h;

    .line 314
    .line 315
    iget-object v2, v1, Lt4/h;->l:Ljava/lang/Object;

    .line 316
    .line 317
    monitor-enter v2

    .line 318
    :try_start_6
    sget-object v3, Lt4/h;->m:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 319
    .line 320
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 321
    .line 322
    .line 323
    monitor-exit v2

    .line 324
    throw v0

    .line 325
    :catchall_5
    move-exception v0

    .line 326
    monitor-exit v2

    .line 327
    throw v0

    .line 328
    :pswitch_9
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    :goto_7
    if-ge v4, v1, :cond_7

    .line 337
    .line 338
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    add-int/lit8 v4, v4, 0x1

    .line 343
    .line 344
    check-cast v2, Lq1/c;

    .line 345
    .line 346
    iget-object v3, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v3, Lr1/d;

    .line 349
    .line 350
    iget-object v3, v3, Lr1/d;->e:Ljava/lang/Object;

    .line 351
    .line 352
    iput-object v3, v2, Lq1/c;->b:Ljava/lang/Object;

    .line 353
    .line 354
    iget-object v5, v2, Lq1/c;->d:Lq1/b;

    .line 355
    .line 356
    invoke-virtual {v2, v5, v3}, Lq1/c;->d(Lq1/b;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    goto :goto_7

    .line 360
    :cond_7
    return-void

    .line 361
    :pswitch_a
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lorg/apache/cordova/h0;

    .line 364
    .line 365
    iget-object v0, v0, Lorg/apache/cordova/h0;->b:Ljava/util/LinkedList;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-nez v0, :cond_8

    .line 372
    .line 373
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    .line 376
    .line 377
    iput-boolean v4, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->c:Z

    .line 378
    .line 379
    iget-object v1, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->a:Lorg/apache/cordova/g0;

    .line 380
    .line 381
    iget-boolean v0, v0, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;->b:Z

    .line 382
    .line 383
    check-cast v1, Lk1/j;

    .line 384
    .line 385
    iget-object v1, v1, Lk1/j;->h:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v1, Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 388
    .line 389
    iget-object v1, v1, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 390
    .line 391
    if-eqz v1, :cond_8

    .line 392
    .line 393
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setNetworkAvailable(Z)V

    .line 394
    .line 395
    .line 396
    :cond_8
    return-void

    .line 397
    :pswitch_b
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lorg/apache/cordova/h0;

    .line 400
    .line 401
    invoke-virtual {v0}, Lorg/apache/cordova/h0;->e()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    if-eqz v0, :cond_9

    .line 406
    .line 407
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;

    .line 410
    .line 411
    iget-object v1, v1, Lorg/apache/cordova/NativeToJsMessageQueue$LoadUrlBridgeMode;->a:Lorg/apache/cordova/w;

    .line 412
    .line 413
    const-string v2, "javascript:"

    .line 414
    .line 415
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-interface {v1, v0, v4}, Lorg/apache/cordova/w;->loadUrl(Ljava/lang/String;Z)V

    .line 420
    .line 421
    .line 422
    :cond_9
    return-void

    .line 423
    :pswitch_c
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, Lorg/apache/cordova/h0;

    .line 426
    .line 427
    invoke-virtual {v0}, Lorg/apache/cordova/h0;->e()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    if-eqz v0, :cond_a

    .line 432
    .line 433
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v1, Lorg/apache/cordova/NativeToJsMessageQueue$EvalBridgeMode;

    .line 436
    .line 437
    iget-object v1, v1, Lorg/apache/cordova/NativeToJsMessageQueue$EvalBridgeMode;->a:Lorg/apache/cordova/w;

    .line 438
    .line 439
    invoke-interface {v1, v0, v2}, Lorg/apache/cordova/w;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 440
    .line 441
    .line 442
    :cond_a
    return-void

    .line 443
    :pswitch_d
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, Lorg/apache/cordova/CordovaWebViewImpl;

    .line 446
    .line 447
    invoke-virtual {v0}, Lorg/apache/cordova/CordovaWebViewImpl;->stopLoading()V

    .line 448
    .line 449
    .line 450
    const-string v1, "CordovaWebViewImpl"

    .line 451
    .line 452
    const-string v2, "CordovaWebView: TIMEOUT ERROR!"

    .line 453
    .line 454
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 455
    .line 456
    .line 457
    new-instance v1, Lorg/json/JSONObject;

    .line 458
    .line 459
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 460
    .line 461
    .line 462
    :try_start_7
    const-string v2, "errorCode"

    .line 463
    .line 464
    const/4 v3, -0x6

    .line 465
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 466
    .line 467
    .line 468
    const-string v2, "description"

    .line 469
    .line 470
    const-string v3, "The connection to the server was unsuccessful."

    .line 471
    .line 472
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 473
    .line 474
    .line 475
    const-string v2, "url"

    .line 476
    .line 477
    iget-object v3, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v3, Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_1

    .line 482
    .line 483
    .line 484
    :catch_1
    iget-object v0, v0, Lorg/apache/cordova/CordovaWebViewImpl;->a:Lorg/apache/cordova/k0;

    .line 485
    .line 486
    const-string v2, "onReceivedError"

    .line 487
    .line 488
    invoke-virtual {v0, v2, v1}, Lorg/apache/cordova/k0;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_e
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sget-object v1, Lm1/a;->d:Ljava/lang/String;

    .line 497
    .line 498
    iget-object v2, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v2, Lt1/i;

    .line 501
    .line 502
    iget-object v3, v2, Lt1/i;->a:Ljava/lang/String;

    .line 503
    .line 504
    const-string v5, "Scheduling work "

    .line 505
    .line 506
    invoke-static {v5, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 511
    .line 512
    invoke-virtual {v0, v1, v3, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, Lm1/a;

    .line 518
    .line 519
    iget-object v0, v0, Lm1/a;->a:Lm1/b;

    .line 520
    .line 521
    filled-new-array {v2}, [Lt1/i;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    invoke-virtual {v0, v1}, Lm1/b;->a([Lt1/i;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_f
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, Lh3/n;

    .line 532
    .line 533
    :try_start_8
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 536
    .line 537
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-virtual {v0, v1}, Lh3/n;->e(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :catchall_6
    move-exception v1

    .line 546
    goto :goto_8

    .line 547
    :catch_2
    move-exception v1

    .line 548
    goto :goto_9

    .line 549
    :goto_8
    new-instance v2, Ljava/lang/RuntimeException;

    .line 550
    .line 551
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v2}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 555
    .line 556
    .line 557
    goto :goto_a

    .line 558
    :goto_9
    invoke-virtual {v0, v1}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 559
    .line 560
    .line 561
    :goto_a
    return-void

    .line 562
    :pswitch_10
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, Lh3/k;

    .line 565
    .line 566
    iget-object v0, v0, Lh3/k;->c:Ljava/lang/Object;

    .line 567
    .line 568
    monitor-enter v0

    .line 569
    :try_start_9
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v1, Lh3/k;

    .line 572
    .line 573
    iget-object v1, v1, Lh3/k;->d:Lh3/j;

    .line 574
    .line 575
    if-eqz v1, :cond_b

    .line 576
    .line 577
    iget-object v2, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v2, Lh3/g;

    .line 580
    .line 581
    invoke-virtual {v2}, Lh3/g;->b()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Lh3/n;

    .line 588
    .line 589
    invoke-virtual {v1, v2}, Lh3/n;->e(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    goto :goto_b

    .line 593
    :catchall_7
    move-exception v1

    .line 594
    goto :goto_c

    .line 595
    :cond_b
    :goto_b
    monitor-exit v0

    .line 596
    return-void

    .line 597
    :goto_c
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 598
    throw v1

    .line 599
    :pswitch_11
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, Lh3/j;

    .line 602
    .line 603
    iget-object v0, v0, Lh3/j;->d:Ljava/lang/Object;

    .line 604
    .line 605
    monitor-enter v0

    .line 606
    :try_start_a
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v1, Lh3/j;

    .line 609
    .line 610
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v1, Lh3/e;

    .line 613
    .line 614
    iget-object v2, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v2, Lh3/g;

    .line 617
    .line 618
    invoke-virtual {v2}, Lh3/g;->a()Ljava/lang/Exception;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-static {v2}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    invoke-interface {v1, v2}, Lh3/e;->onFailure(Ljava/lang/Exception;)V

    .line 626
    .line 627
    .line 628
    monitor-exit v0

    .line 629
    return-void

    .line 630
    :catchall_8
    move-exception v1

    .line 631
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 632
    throw v1

    .line 633
    :pswitch_12
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v0, Lh3/j;

    .line 636
    .line 637
    iget-object v0, v0, Lh3/j;->d:Ljava/lang/Object;

    .line 638
    .line 639
    monitor-enter v0

    .line 640
    :try_start_b
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v1, Lh3/j;

    .line 643
    .line 644
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v1, Lh3/d;

    .line 647
    .line 648
    iget-object v2, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 649
    .line 650
    check-cast v2, Lh3/g;

    .line 651
    .line 652
    invoke-interface {v1, v2}, Lh3/d;->onComplete(Lh3/g;)V

    .line 653
    .line 654
    .line 655
    monitor-exit v0

    .line 656
    return-void

    .line 657
    :catchall_9
    move-exception v1

    .line 658
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 659
    throw v1

    .line 660
    :pswitch_13
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast v0, Lh3/j;

    .line 663
    .line 664
    iget-object v1, v0, Lh3/j;->c:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v1, Lh3/n;

    .line 667
    .line 668
    :try_start_c
    iget-object v2, v0, Lh3/j;->d:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v2, Lcom/google/android/gms/internal/appset/zzq;

    .line 671
    .line 672
    iget-object v5, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v5, Lh3/g;

    .line 675
    .line 676
    invoke-interface {v2, v5}, Lh3/b;->then(Lh3/g;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    check-cast v2, Lh3/g;
    :try_end_c
    .catch Lh3/f; {:try_start_c .. :try_end_c} :catch_4
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    .line 681
    .line 682
    if-nez v2, :cond_c

    .line 683
    .line 684
    new-instance v1, Ljava/lang/NullPointerException;

    .line 685
    .line 686
    const-string v2, "Continuation returned null"

    .line 687
    .line 688
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v1}, Lh3/j;->onFailure(Ljava/lang/Exception;)V

    .line 692
    .line 693
    .line 694
    goto :goto_f

    .line 695
    :cond_c
    sget-object v1, Lh3/i;->b:Lg/q;

    .line 696
    .line 697
    check-cast v2, Lh3/n;

    .line 698
    .line 699
    iget-object v5, v2, Lh3/n;->b:Lh3/m;

    .line 700
    .line 701
    new-instance v6, Lh3/k;

    .line 702
    .line 703
    invoke-direct {v6, v1, v0, v3}, Lh3/k;-><init>(Ljava/util/concurrent/Executor;Lh3/j;I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v5, v6}, Lh3/m;->a(Lh3/l;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v2}, Lh3/n;->h()V

    .line 710
    .line 711
    .line 712
    new-instance v3, Lh3/j;

    .line 713
    .line 714
    invoke-direct {v3, v1, v0}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/e;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v5, v3}, Lh3/m;->a(Lh3/l;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v2}, Lh3/n;->h()V

    .line 721
    .line 722
    .line 723
    new-instance v3, Lh3/k;

    .line 724
    .line 725
    invoke-direct {v3, v1, v0, v4}, Lh3/k;-><init>(Ljava/util/concurrent/Executor;Lh3/j;I)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v5, v3}, Lh3/m;->a(Lh3/l;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2}, Lh3/n;->h()V

    .line 732
    .line 733
    .line 734
    goto :goto_f

    .line 735
    :catch_3
    move-exception v0

    .line 736
    goto :goto_d

    .line 737
    :catch_4
    move-exception v0

    .line 738
    goto :goto_e

    .line 739
    :goto_d
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 740
    .line 741
    .line 742
    goto :goto_f

    .line 743
    :goto_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    instance-of v2, v2, Ljava/lang/Exception;

    .line 748
    .line 749
    if-eqz v2, :cond_d

    .line 750
    .line 751
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    check-cast v0, Ljava/lang/Exception;

    .line 756
    .line 757
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 758
    .line 759
    .line 760
    goto :goto_f

    .line 761
    :cond_d
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 762
    .line 763
    .line 764
    :goto_f
    return-void

    .line 765
    :pswitch_14
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Lh3/g;

    .line 768
    .line 769
    check-cast v0, Lh3/n;

    .line 770
    .line 771
    iget-boolean v0, v0, Lh3/n;->d:Z

    .line 772
    .line 773
    if-eqz v0, :cond_e

    .line 774
    .line 775
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v0, Lh3/j;

    .line 778
    .line 779
    iget-object v0, v0, Lh3/j;->c:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v0, Lh3/n;

    .line 782
    .line 783
    invoke-virtual {v0}, Lh3/n;->f()V

    .line 784
    .line 785
    .line 786
    goto :goto_12

    .line 787
    :cond_e
    :try_start_d
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v0, Lh3/j;

    .line 790
    .line 791
    iget-object v0, v0, Lh3/j;->d:Ljava/lang/Object;

    .line 792
    .line 793
    check-cast v0, Lh3/b;

    .line 794
    .line 795
    iget-object v1, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, Lh3/g;

    .line 798
    .line 799
    invoke-interface {v0, v1}, Lh3/b;->then(Lh3/g;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v0
    :try_end_d
    .catch Lh3/f; {:try_start_d .. :try_end_d} :catch_6
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 803
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v1, Lh3/j;

    .line 806
    .line 807
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v1, Lh3/n;

    .line 810
    .line 811
    invoke-virtual {v1, v0}, Lh3/n;->e(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    goto :goto_12

    .line 815
    :catch_5
    move-exception v0

    .line 816
    goto :goto_10

    .line 817
    :catch_6
    move-exception v0

    .line 818
    goto :goto_11

    .line 819
    :goto_10
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v1, Lh3/j;

    .line 822
    .line 823
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v1, Lh3/n;

    .line 826
    .line 827
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 828
    .line 829
    .line 830
    goto :goto_12

    .line 831
    :goto_11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    instance-of v1, v1, Ljava/lang/Exception;

    .line 836
    .line 837
    if-eqz v1, :cond_f

    .line 838
    .line 839
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v1, Lh3/j;

    .line 842
    .line 843
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v1, Lh3/n;

    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    check-cast v0, Ljava/lang/Exception;

    .line 852
    .line 853
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 854
    .line 855
    .line 856
    goto :goto_12

    .line 857
    :cond_f
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v1, Lh3/j;

    .line 860
    .line 861
    iget-object v1, v1, Lh3/j;->c:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v1, Lh3/n;

    .line 864
    .line 865
    invoke-virtual {v1, v0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 866
    .line 867
    .line 868
    :goto_12
    return-void

    .line 869
    :pswitch_15
    iget-object v0, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 870
    .line 871
    check-cast v0, Lcom/google/android/gms/common/api/internal/j0;

    .line 872
    .line 873
    iget-object v1, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v1, Lg3/g;

    .line 876
    .line 877
    iget-object v3, v1, Lg3/g;->h:Lt2/b;

    .line 878
    .line 879
    iget v4, v3, Lt2/b;->h:I

    .line 880
    .line 881
    if-nez v4, :cond_15

    .line 882
    .line 883
    iget-object v1, v1, Lg3/g;->i:Lcom/google/android/gms/common/internal/y;

    .line 884
    .line 885
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    iget-object v3, v1, Lcom/google/android/gms/common/internal/y;->i:Lt2/b;

    .line 889
    .line 890
    iget v4, v3, Lt2/b;->h:I

    .line 891
    .line 892
    if-nez v4, :cond_14

    .line 893
    .line 894
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 895
    .line 896
    iget-object v1, v1, Lcom/google/android/gms/common/internal/y;->h:Landroid/os/IBinder;

    .line 897
    .line 898
    if-nez v1, :cond_10

    .line 899
    .line 900
    move-object v5, v2

    .line 901
    goto :goto_13

    .line 902
    :cond_10
    sget v4, Lcom/google/android/gms/common/internal/a;->g:I

    .line 903
    .line 904
    const-string v4, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 905
    .line 906
    invoke-interface {v1, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 907
    .line 908
    .line 909
    move-result-object v5

    .line 910
    instance-of v6, v5, Lcom/google/android/gms/common/internal/n;

    .line 911
    .line 912
    if-eqz v6, :cond_11

    .line 913
    .line 914
    check-cast v5, Lcom/google/android/gms/common/internal/n;

    .line 915
    .line 916
    goto :goto_13

    .line 917
    :cond_11
    new-instance v5, Lcom/google/android/gms/common/internal/q0;

    .line 918
    .line 919
    invoke-direct {v5, v1, v4}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    :goto_13
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/j0;->j:Ljava/util/Set;

    .line 923
    .line 924
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    if-eqz v5, :cond_13

    .line 928
    .line 929
    if-nez v1, :cond_12

    .line 930
    .line 931
    goto :goto_14

    .line 932
    :cond_12
    iput-object v5, v3, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    .line 933
    .line 934
    iput-object v1, v3, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    .line 935
    .line 936
    iget-boolean v2, v3, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    .line 937
    .line 938
    if-eqz v2, :cond_16

    .line 939
    .line 940
    iget-object v2, v3, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v2, Lcom/google/android/gms/common/api/g;

    .line 943
    .line 944
    invoke-interface {v2, v5, v1}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/n;Ljava/util/Set;)V

    .line 945
    .line 946
    .line 947
    goto :goto_15

    .line 948
    :cond_13
    :goto_14
    new-instance v1, Ljava/lang/Exception;

    .line 949
    .line 950
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 951
    .line 952
    .line 953
    const-string v4, "GoogleApiManager"

    .line 954
    .line 955
    const-string v5, "Received null response from onSignInSuccess"

    .line 956
    .line 957
    invoke-static {v4, v5, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 958
    .line 959
    .line 960
    new-instance v1, Lt2/b;

    .line 961
    .line 962
    const/4 v4, 0x4

    .line 963
    invoke-direct {v1, v4, v2, v2}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3, v1}, Lcom/google/android/gms/common/api/internal/c0;->b(Lt2/b;)V

    .line 967
    .line 968
    .line 969
    goto :goto_15

    .line 970
    :cond_14
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    new-instance v2, Ljava/lang/Exception;

    .line 975
    .line 976
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 977
    .line 978
    .line 979
    const-string v4, "Sign-in succeeded with resolve account failure: "

    .line 980
    .line 981
    const-string v5, "SignInCoordinator"

    .line 982
    .line 983
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    invoke-static {v5, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 988
    .line 989
    .line 990
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 991
    .line 992
    invoke-virtual {v1, v3}, Lcom/google/android/gms/common/api/internal/c0;->b(Lt2/b;)V

    .line 993
    .line 994
    .line 995
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 996
    .line 997
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 998
    .line 999
    .line 1000
    goto :goto_16

    .line 1001
    :cond_15
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 1002
    .line 1003
    invoke-virtual {v1, v3}, Lcom/google/android/gms/common/api/internal/c0;->b(Lt2/b;)V

    .line 1004
    .line 1005
    .line 1006
    :cond_16
    :goto_15
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 1007
    .line 1008
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 1009
    .line 1010
    .line 1011
    :goto_16
    return-void

    .line 1012
    :pswitch_16
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v0, Lcom/google/android/gms/common/api/internal/l;

    .line 1015
    .line 1016
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 1017
    .line 1018
    check-cast v1, Lcom/google/android/gms/common/api/internal/k;

    .line 1019
    .line 1020
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/l;->b:Ljava/lang/Object;

    .line 1021
    .line 1022
    if-nez v0, :cond_17

    .line 1023
    .line 1024
    invoke-interface {v1}, Lcom/google/android/gms/common/api/internal/k;->onNotifyListenerFailed()V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_17

    .line 1028
    :cond_17
    :try_start_e
    invoke-interface {v1, v0}, Lcom/google/android/gms/common/api/internal/k;->notifyListener(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_7

    .line 1029
    .line 1030
    .line 1031
    :goto_17
    return-void

    .line 1032
    :catch_7
    move-exception v0

    .line 1033
    invoke-interface {v1}, Lcom/google/android/gms/common/api/internal/k;->onNotifyListenerFailed()V

    .line 1034
    .line 1035
    .line 1036
    throw v0

    .line 1037
    :pswitch_17
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v0, Lt2/b;

    .line 1040
    .line 1041
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v1, Lcom/google/android/gms/common/api/internal/c0;

    .line 1044
    .line 1045
    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v4, Lcom/google/android/gms/common/api/g;

    .line 1048
    .line 1049
    iget-object v5, v1, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v5, Lcom/google/android/gms/common/api/internal/g;

    .line 1052
    .line 1053
    iget-object v5, v5, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1054
    .line 1055
    iget-object v6, v1, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v6, Lcom/google/android/gms/common/api/internal/a;

    .line 1058
    .line 1059
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v5

    .line 1063
    check-cast v5, Lcom/google/android/gms/common/api/internal/a0;

    .line 1064
    .line 1065
    if-nez v5, :cond_18

    .line 1066
    .line 1067
    goto :goto_18

    .line 1068
    :cond_18
    iget v6, v0, Lt2/b;->h:I

    .line 1069
    .line 1070
    if-nez v6, :cond_1a

    .line 1071
    .line 1072
    iput-boolean v3, v1, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    .line 1073
    .line 1074
    invoke-interface {v4}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    if-eqz v0, :cond_19

    .line 1079
    .line 1080
    iget-boolean v0, v1, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    .line 1081
    .line 1082
    if-eqz v0, :cond_1b

    .line 1083
    .line 1084
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast v0, Lcom/google/android/gms/common/internal/n;

    .line 1087
    .line 1088
    if-eqz v0, :cond_1b

    .line 1089
    .line 1090
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v1, Ljava/util/Set;

    .line 1093
    .line 1094
    invoke-interface {v4, v0, v1}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/n;Ljava/util/Set;)V

    .line 1095
    .line 1096
    .line 1097
    goto :goto_18

    .line 1098
    :cond_19
    :try_start_f
    invoke-interface {v4}, Lcom/google/android/gms/common/api/g;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    invoke-interface {v4, v2, v0}, Lcom/google/android/gms/common/api/g;->getRemoteService(Lcom/google/android/gms/common/internal/n;Ljava/util/Set;)V
    :try_end_f
    .catch Ljava/lang/SecurityException; {:try_start_f .. :try_end_f} :catch_8

    .line 1103
    .line 1104
    .line 1105
    goto :goto_18

    .line 1106
    :catch_8
    move-exception v0

    .line 1107
    const-string v1, "GoogleApiManager"

    .line 1108
    .line 1109
    const-string v3, "Failed to get service from broker. "

    .line 1110
    .line 1111
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1112
    .line 1113
    .line 1114
    const-string v0, "Failed to get service from broker."

    .line 1115
    .line 1116
    invoke-interface {v4, v0}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    new-instance v0, Lt2/b;

    .line 1120
    .line 1121
    const/16 v1, 0xa

    .line 1122
    .line 1123
    invoke-direct {v0, v1, v2, v2}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v5, v0, v2}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 1127
    .line 1128
    .line 1129
    goto :goto_18

    .line 1130
    :cond_1a
    invoke-virtual {v5, v0, v2}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 1131
    .line 1132
    .line 1133
    :cond_1b
    :goto_18
    return-void

    .line 1134
    :pswitch_18
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v0, Lc0/g;

    .line 1137
    .line 1138
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 1139
    .line 1140
    invoke-virtual {v0, v1}, Lc0/g;->accept(Ljava/lang/Object;)V

    .line 1141
    .line 1142
    .line 1143
    return-void

    .line 1144
    :pswitch_19
    iget-object v0, p0, Lc0/a;->h:Ljava/lang/Object;

    .line 1145
    .line 1146
    check-cast v0, Lu1/f;

    .line 1147
    .line 1148
    iget-object v1, p0, Lc0/a;->i:Ljava/lang/Object;

    .line 1149
    .line 1150
    check-cast v1, Landroid/graphics/Typeface;

    .line 1151
    .line 1152
    iget-object v0, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 1153
    .line 1154
    check-cast v0, Lk/u0;

    .line 1155
    .line 1156
    if-eqz v0, :cond_1c

    .line 1157
    .line 1158
    invoke-virtual {v0, v1}, Lk/u0;->b(Landroid/graphics/Typeface;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_1c
    return-void

    .line 1162
    nop

    .line 1163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
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
