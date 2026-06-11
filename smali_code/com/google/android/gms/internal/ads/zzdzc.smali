.class public final Lcom/google/android/gms/internal/ads/zzdzc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final declared-synchronized zza(JIJ)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zziP:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne p3, v1, :cond_2

    .line 25
    .line 26
    new-instance p3, Lcom/google/android/gms/internal/ads/zzdza;

    .line 27
    .line 28
    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzdza;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzdza;->zza(J)Lcom/google/android/gms/internal/ads/zzdze;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/ads/zzdza;->zzb(I)Lcom/google/android/gms/internal/ads/zzdze;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzdza;->zzc()Lcom/google/android/gms/internal/ads/zzdzf;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Ljava/util/Map;

    .line 42
    .line 43
    invoke-interface {v2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v2, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_1
    move p3, v1

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :cond_2
    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdza;

    .line 75
    .line 76
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzdza;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzdza;->zza(J)Lcom/google/android/gms/internal/ads/zzdze;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/zzdza;->zzb(I)Lcom/google/android/gms/internal/ads/zzdze;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdza;->zzc()Lcom/google/android/gms/internal/ads/zzdzf;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdzf;->zzb()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    const/4 p3, 0x0

    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    if-eq p2, v0, :cond_6

    .line 97
    .line 98
    if-eq p2, v1, :cond_5

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    if-eq p2, v0, :cond_4

    .line 102
    .line 103
    :cond_3
    move p2, p3

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zziX:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 106
    .line 107
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    check-cast p2, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    goto :goto_1

    .line 122
    :cond_5
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zziW:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 123
    .line 124
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    check-cast p2, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    goto :goto_1

    .line 139
    :cond_6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zziV:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 140
    .line 141
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    :goto_1
    if-lez p2, :cond_e

    .line 156
    .line 157
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Ljava/util/Map;

    .line 158
    .line 159
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/util/ArrayDeque;

    .line 164
    .line 165
    if-nez v1, :cond_7

    .line 166
    .line 167
    new-instance v1, Ljava/util/ArrayDeque;

    .line 168
    .line 169
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_7
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-le p1, p2, :cond_8

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdzc;->zzc()V

    .line 193
    .line 194
    .line 195
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zziY:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 196
    .line 197
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-lez p1, :cond_d

    .line 212
    .line 213
    :cond_9
    :goto_3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    move p4, p3

    .line 222
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result p5

    .line 226
    if-eqz p5, :cond_a

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p5

    .line 232
    check-cast p5, Ljava/util/ArrayDeque;

    .line 233
    .line 234
    invoke-virtual {p5}, Ljava/util/ArrayDeque;->size()I

    .line 235
    .line 236
    .line 237
    move-result p5

    .line 238
    add-int/2addr p4, p5

    .line 239
    goto :goto_4

    .line 240
    :cond_a
    if-le p4, p1, :cond_e

    .line 241
    .line 242
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    if-nez p2, :cond_9

    .line 247
    .line 248
    const-wide p4, 0x7fffffffffffffffL

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object p4

    .line 261
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object p4

    .line 265
    const/4 p5, 0x0

    .line 266
    :cond_b
    :goto_5
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_c

    .line 271
    .line 272
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Ljava/util/Map$Entry;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    check-cast v2, Ljava/util/ArrayDeque;

    .line 283
    .line 284
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-nez v3, :cond_b

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    check-cast v2, Ljava/lang/Long;

    .line 295
    .line 296
    if-eqz v2, :cond_b

    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 299
    .line 300
    .line 301
    move-result-wide v3

    .line 302
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 303
    .line 304
    .line 305
    move-result-wide v5

    .line 306
    cmp-long v3, v3, v5

    .line 307
    .line 308
    if-gez v3, :cond_b

    .line 309
    .line 310
    move-object p5, v1

    .line 311
    move-object p2, v2

    .line 312
    goto :goto_5

    .line 313
    :cond_c
    if-eqz p5, :cond_9

    .line 314
    .line 315
    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    check-cast p2, Ljava/util/ArrayDeque;

    .line 320
    .line 321
    if-eqz p2, :cond_9

    .line 322
    .line 323
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result p4

    .line 327
    if-nez p4, :cond_9

    .line 328
    .line 329
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    if-eqz p2, :cond_9

    .line 337
    .line 338
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_d
    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 348
    .line 349
    .line 350
    monitor-exit p0

    .line 351
    return-void

    .line 352
    :cond_e
    :goto_6
    monitor-exit p0

    .line 353
    return-void

    .line 354
    :goto_7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 355
    throw p1
.end method

.method public final declared-synchronized zzb()Ljava/util/Map;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziP:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdzc;->zzc()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lcom/google/android/gms/internal/ads/zzdzf;

    .line 56
    .line 57
    new-instance v4, Ljava/util/ArrayDeque;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/util/Collection;

    .line 64
    .line 65
    invoke-direct {v4, v2}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    :goto_1
    monitor-exit p0

    .line 75
    return-object v0

    .line 76
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw v0
.end method

.method public final zzc()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lx2/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdzc;->zza:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_7

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lcom/google/android/gms/internal/ads/zzdzf;

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/util/ArrayDeque;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdzf;->zzb()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const-wide/16 v5, 0x0

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    const/4 v7, 0x1

    .line 57
    if-eq v4, v7, :cond_4

    .line 58
    .line 59
    const/4 v7, 0x2

    .line 60
    if-eq v4, v7, :cond_3

    .line 61
    .line 62
    const/4 v7, 0x3

    .line 63
    if-eq v4, v7, :cond_2

    .line 64
    .line 65
    :cond_1
    move-wide v7, v5

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zziU:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 68
    .line 69
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zziT:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 85
    .line 86
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zziS:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 102
    .line 103
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Ljava/lang/Long;

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    :goto_1
    cmp-long v4, v7, v5

    .line 118
    .line 119
    if-nez v4, :cond_5

    .line 120
    .line 121
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 122
    .line 123
    .line 124
    move-wide v7, v5

    .line 125
    :cond_5
    cmp-long v4, v7, v5

    .line 126
    .line 127
    if-lez v4, :cond_0

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_6

    .line 138
    .line 139
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/Long;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    sub-long v5, v0, v5

    .line 150
    .line 151
    cmp-long v5, v5, v7

    .line 152
    .line 153
    if-lez v5, :cond_6

    .line 154
    .line 155
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_0

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_7
    return-void
.end method
