.class public final Lk0/j;
.super Lg4/j;
.source "SourceFile"

# interfaces
.implements Lf4/l;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lk0/j;->h:I

    iput-object p2, p0, Lk0/j;->i:Ljava/lang/Object;

    iput-object p3, p0, Lk0/j;->j:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg4/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk0/j;->h:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Throwable;

    .line 11
    .line 12
    iget-object v2, v0, Lk0/j;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lq/i;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v2, Lq/i;->d:Z

    .line 24
    .line 25
    iget-object v3, v2, Lq/i;->b:Lq/l;

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    iget-object v3, v3, Lq/l;->h:Lq/k;

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Lq/h;->cancel(Z)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput-object v1, v2, Lq/i;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, v2, Lq/i;->b:Lq/l;

    .line 41
    .line 42
    iput-object v1, v2, Lq/i;->c:Lq/m;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v2, v1}, Lq/i;->b(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, v0, Lk0/j;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lo4/z;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v3, Lo4/z0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    instance-of v3, v1, Lo4/o0;

    .line 63
    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    instance-of v3, v1, Lo4/n;

    .line 67
    .line 68
    if-nez v3, :cond_3

    .line 69
    .line 70
    invoke-static {v1}, Lo4/w;->n(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v2, v1}, Lq/i;->a(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    check-cast v1, Lo4/n;

    .line 81
    .line 82
    iget-object v1, v1, Lo4/n;->a:Ljava/lang/Throwable;

    .line 83
    .line 84
    throw v1

    .line 85
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v2, "This job has not completed yet"

    .line 88
    .line 89
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :pswitch_0
    move-object/from16 v1, p1

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Throwable;

    .line 96
    .line 97
    iget-object v2, v0, Lk0/j;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lk0/o;

    .line 100
    .line 101
    invoke-virtual {v2, v1}, Lk0/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v2, v0, Lk0/j;->j:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Lr1/h;

    .line 107
    .line 108
    iget-object v2, v2, Lr1/h;->i:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v3, v2

    .line 111
    check-cast v3, Lq4/c;

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    invoke-virtual {v3, v2, v1}, Lq4/c;->g(ZLjava/lang/Throwable;)Z

    .line 115
    .line 116
    .line 117
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v9, Lq4/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 121
    .line 122
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    sget-object v10, Lq4/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 127
    .line 128
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    const/4 v11, 0x1

    .line 133
    invoke-virtual {v3, v6, v7, v11}, Lq4/c;->s(JZ)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_6

    .line 138
    .line 139
    invoke-virtual {v3}, Lq4/c;->n()Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, Lq4/h;

    .line 144
    .line 145
    invoke-direct {v5, v4}, Lq4/h;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_6
    const-wide v12, 0xfffffffffffffffL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    and-long/2addr v6, v12

    .line 156
    cmp-long v4, v4, v6

    .line 157
    .line 158
    sget-object v12, Lq4/j;->a:Lq4/i;

    .line 159
    .line 160
    if-ltz v4, :cond_7

    .line 161
    .line 162
    move-object v5, v12

    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :cond_7
    sget-object v8, Lq4/e;->k:Landroidx/emoji2/text/r;

    .line 166
    .line 167
    sget-object v4, Lq4/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 168
    .line 169
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    check-cast v4, Lq4/k;

    .line 174
    .line 175
    :goto_1
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    invoke-virtual {v3, v5, v6, v11}, Lq4/c;->s(JZ)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_8

    .line 184
    .line 185
    invoke-virtual {v3}, Lq4/c;->n()Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    new-instance v5, Lq4/h;

    .line 190
    .line 191
    invoke-direct {v5, v4}, Lq4/h;-><init>(Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_8
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    sget v5, Lq4/e;->b:I

    .line 200
    .line 201
    int-to-long v13, v5

    .line 202
    move-object v15, v12

    .line 203
    div-long v11, v6, v13

    .line 204
    .line 205
    rem-long v13, v6, v13

    .line 206
    .line 207
    long-to-int v5, v13

    .line 208
    iget-wide v13, v4, Lt4/s;->c:J

    .line 209
    .line 210
    cmp-long v13, v13, v11

    .line 211
    .line 212
    if-eqz v13, :cond_b

    .line 213
    .line 214
    invoke-virtual {v3, v11, v12, v4}, Lq4/c;->l(JLq4/k;)Lq4/k;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    if-nez v11, :cond_a

    .line 219
    .line 220
    :cond_9
    :goto_2
    move-object v12, v15

    .line 221
    const/4 v11, 0x1

    .line 222
    goto :goto_1

    .line 223
    :cond_a
    move-object v4, v11

    .line 224
    :cond_b
    invoke-virtual/range {v3 .. v8}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    sget-object v12, Lq4/e;->m:Landroidx/emoji2/text/r;

    .line 229
    .line 230
    if-ne v11, v12, :cond_e

    .line 231
    .line 232
    instance-of v9, v8, Lo4/k1;

    .line 233
    .line 234
    if-eqz v9, :cond_c

    .line 235
    .line 236
    check-cast v8, Lo4/k1;

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_c
    const/4 v8, 0x0

    .line 240
    :goto_3
    if-eqz v8, :cond_d

    .line 241
    .line 242
    invoke-interface {v8, v4, v5}, Lo4/k1;->a(Lt4/s;I)V

    .line 243
    .line 244
    .line 245
    :cond_d
    invoke-virtual {v3, v6, v7}, Lq4/c;->C(J)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4}, Lt4/s;->h()V

    .line 249
    .line 250
    .line 251
    move-object v5, v15

    .line 252
    goto :goto_4

    .line 253
    :cond_e
    sget-object v5, Lq4/e;->o:Landroidx/emoji2/text/r;

    .line 254
    .line 255
    if-ne v11, v5, :cond_f

    .line 256
    .line 257
    invoke-virtual {v3}, Lq4/c;->q()J

    .line 258
    .line 259
    .line 260
    move-result-wide v11

    .line 261
    cmp-long v5, v6, v11

    .line 262
    .line 263
    if-gez v5, :cond_9

    .line 264
    .line 265
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_f
    sget-object v5, Lq4/e;->n:Landroidx/emoji2/text/r;

    .line 270
    .line 271
    if-eq v11, v5, :cond_14

    .line 272
    .line 273
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 274
    .line 275
    .line 276
    move-object v5, v11

    .line 277
    :goto_4
    instance-of v4, v5, Lq4/i;

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    if-nez v4, :cond_10

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_10
    move-object v5, v6

    .line 284
    :goto_5
    sget-object v4, Lt3/h;->a:Lt3/h;

    .line 285
    .line 286
    if-nez v5, :cond_11

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_11
    check-cast v5, Lk0/m;

    .line 290
    .line 291
    instance-of v6, v5, Lk0/l;

    .line 292
    .line 293
    if-eqz v6, :cond_13

    .line 294
    .line 295
    check-cast v5, Lk0/l;

    .line 296
    .line 297
    iget-object v5, v5, Lk0/l;->b:Lo4/l;

    .line 298
    .line 299
    if-nez v1, :cond_12

    .line 300
    .line 301
    new-instance v6, Ljava/util/concurrent/CancellationException;

    .line 302
    .line 303
    const-string v7, "DataStore scope was cancelled before updateData could complete"

    .line 304
    .line 305
    invoke-direct {v6, v7}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_12
    move-object v6, v1

    .line 310
    :goto_6
    new-instance v7, Lo4/n;

    .line 311
    .line 312
    invoke-direct {v7, v2, v6}, Lo4/n;-><init>(ZLjava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v5, v7}, Lo4/z0;->G(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_13
    move-object v6, v4

    .line 319
    :goto_7
    if-nez v6, :cond_5

    .line 320
    .line 321
    return-object v4

    .line 322
    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    const-string v2, "unexpected"

    .line 325
    .line 326
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v1

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
