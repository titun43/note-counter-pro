.class public final Lq4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/k1;


# instance fields
.field public g:Ljava/lang/Object;

.field public h:Lo4/f;

.field public final synthetic i:Lq4/c;


# direct methods
.method public constructor <init>(Lq4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq4/b;->i:Lq4/c;

    .line 5
    .line 6
    sget-object p1, Lq4/e;->p:Landroidx/emoji2/text/r;

    .line 7
    .line 8
    iput-object p1, p0, Lq4/b;->g:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lt4/s;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq4/b;->h:Lo4/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lo4/f;->a(Lt4/s;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Lr4/d;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lq4/b;->g:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lq4/e;->p:Landroidx/emoji2/text/r;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lq4/e;->l:Landroidx/emoji2/text/r;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    :goto_0
    move-object v8, p0

    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lq4/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    iget-object v3, p0, Lq4/b;->i:Lq4/c;

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lq4/k;

    .line 24
    .line 25
    :goto_1
    sget-object v1, Lq4/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-virtual {v3, v4, v5, v2}, Lq4/c;->s(JZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    sget-object p1, Lq4/e;->l:Landroidx/emoji2/text/r;

    .line 38
    .line 39
    iput-object p1, p0, Lq4/b;->g:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v3}, Lq4/c;->n()Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget v0, Lt4/t;->a:I

    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    sget-object v1, Lq4/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    sget v1, Lq4/e;->b:I

    .line 59
    .line 60
    int-to-long v4, v1

    .line 61
    div-long v8, v6, v4

    .line 62
    .line 63
    rem-long v4, v6, v4

    .line 64
    .line 65
    long-to-int v5, v4

    .line 66
    iget-wide v10, v0, Lt4/s;->c:J

    .line 67
    .line 68
    cmp-long v1, v10, v8

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {v3, v8, v9, v0}, Lq4/c;->l(JLq4/k;)Lq4/k;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v4, v1

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v4, v0

    .line 82
    :goto_2
    const/4 v8, 0x0

    .line 83
    invoke-virtual/range {v3 .. v8}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v1, Lq4/e;->m:Landroidx/emoji2/text/r;

    .line 88
    .line 89
    if-eq v0, v1, :cond_13

    .line 90
    .line 91
    sget-object v9, Lq4/e;->o:Landroidx/emoji2/text/r;

    .line 92
    .line 93
    if-ne v0, v9, :cond_6

    .line 94
    .line 95
    invoke-virtual {v3}, Lq4/c;->q()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    cmp-long v0, v6, v0

    .line 100
    .line 101
    if-gez v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 104
    .line 105
    .line 106
    :cond_5
    move-object v0, v4

    .line 107
    goto :goto_1

    .line 108
    :cond_6
    sget-object v8, Lq4/e;->n:Landroidx/emoji2/text/r;

    .line 109
    .line 110
    if-ne v0, v8, :cond_12

    .line 111
    .line 112
    invoke-static {p1}, La/a;->o(Lw3/c;)Lw3/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lo4/w;->f(Lw3/c;)Lo4/f;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :try_start_0
    iput-object p1, p0, Lq4/b;->h:Lo4/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    .line 122
    move-object v8, p0

    .line 123
    :try_start_1
    invoke-virtual/range {v3 .. v8}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-ne v0, v1, :cond_7

    .line 128
    .line 129
    invoke-virtual {p0, v4, v5}, Lq4/b;->a(Lt4/s;I)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto/16 :goto_7

    .line 136
    .line 137
    :cond_7
    const/4 v1, 0x0

    .line 138
    if-ne v0, v9, :cond_11

    .line 139
    .line 140
    invoke-virtual {v3}, Lq4/c;->q()J

    .line 141
    .line 142
    .line 143
    move-result-wide v9

    .line 144
    cmp-long v0, v6, v9

    .line 145
    .line 146
    if-gez v0, :cond_8

    .line 147
    .line 148
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 149
    .line 150
    .line 151
    :cond_8
    sget-object v0, Lq4/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 152
    .line 153
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Lq4/k;

    .line 158
    .line 159
    :goto_3
    sget-object v4, Lq4/c;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 160
    .line 161
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v4

    .line 165
    invoke-virtual {v3, v4, v5, v2}, Lq4/c;->s(JZ)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_a

    .line 170
    .line 171
    iget-object v0, v8, Lq4/b;->h:Lo4/f;

    .line 172
    .line 173
    invoke-static {v0}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iput-object v1, v8, Lq4/b;->h:Lo4/f;

    .line 177
    .line 178
    sget-object v1, Lq4/e;->l:Landroidx/emoji2/text/r;

    .line 179
    .line 180
    iput-object v1, v8, Lq4/b;->g:Ljava/lang/Object;

    .line 181
    .line 182
    invoke-virtual {v3}, Lq4/c;->n()Ljava/lang/Throwable;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v1, :cond_9

    .line 187
    .line 188
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    invoke-static {v1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Lo4/f;->resumeWith(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_a
    sget-object v4, Lq4/c;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 203
    .line 204
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    sget v4, Lq4/e;->b:I

    .line 209
    .line 210
    int-to-long v4, v4

    .line 211
    div-long v9, v6, v4

    .line 212
    .line 213
    rem-long v4, v6, v4

    .line 214
    .line 215
    long-to-int v5, v4

    .line 216
    iget-wide v11, v0, Lt4/s;->c:J

    .line 217
    .line 218
    cmp-long v4, v11, v9

    .line 219
    .line 220
    if-eqz v4, :cond_b

    .line 221
    .line 222
    invoke-virtual {v3, v9, v10, v0}, Lq4/c;->l(JLq4/k;)Lq4/k;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    if-nez v4, :cond_c

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_b
    move-object v4, v0

    .line 230
    :cond_c
    invoke-virtual/range {v3 .. v8}, Lq4/c;->A(Lq4/k;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sget-object v9, Lq4/e;->m:Landroidx/emoji2/text/r;

    .line 235
    .line 236
    if-ne v0, v9, :cond_d

    .line 237
    .line 238
    invoke-virtual {p0, v4, v5}, Lq4/b;->a(Lt4/s;I)V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    sget-object v5, Lq4/e;->o:Landroidx/emoji2/text/r;

    .line 243
    .line 244
    if-ne v0, v5, :cond_f

    .line 245
    .line 246
    invoke-virtual {v3}, Lq4/c;->q()J

    .line 247
    .line 248
    .line 249
    move-result-wide v9

    .line 250
    cmp-long v0, v6, v9

    .line 251
    .line 252
    if-gez v0, :cond_e

    .line 253
    .line 254
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 255
    .line 256
    .line 257
    :cond_e
    move-object v0, v4

    .line 258
    goto :goto_3

    .line 259
    :cond_f
    sget-object v2, Lq4/e;->n:Landroidx/emoji2/text/r;

    .line 260
    .line 261
    if-eq v0, v2, :cond_10

    .line 262
    .line 263
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 264
    .line 265
    .line 266
    iput-object v0, v8, Lq4/b;->g:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v1, v8, Lq4/b;->h:Lo4/f;

    .line 269
    .line 270
    :goto_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    const-string v1, "unexpected"

    .line 276
    .line 277
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw v0

    .line 281
    :cond_11
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 282
    .line 283
    .line 284
    iput-object v0, v8, Lq4/b;->g:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v1, v8, Lq4/b;->h:Lo4/f;

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :goto_5
    invoke-virtual {p1, v0, v1}, Lo4/f;->y(Ljava/lang/Object;Lf4/q;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 290
    .line 291
    .line 292
    :goto_6
    invoke-virtual {p1}, Lo4/f;->q()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 297
    .line 298
    return-object p1

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    move-object v8, p0

    .line 301
    :goto_7
    invoke-virtual {p1}, Lo4/f;->x()V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :cond_12
    move-object v8, p0

    .line 306
    invoke-virtual {v4}, Lt4/c;->a()V

    .line 307
    .line 308
    .line 309
    iput-object v0, v8, Lq4/b;->g:Ljava/lang/Object;

    .line 310
    .line 311
    :goto_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    return-object p1

    .line 316
    :cond_13
    move-object v8, p0

    .line 317
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 318
    .line 319
    const-string v0, "unreachable"

    .line 320
    .line 321
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw p1
.end method
