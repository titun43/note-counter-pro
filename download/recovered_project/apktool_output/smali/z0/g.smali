.class public final Lz0/g;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# instance fields
.field public final synthetic g:Landroidx/room/MultiInstanceInvalidationService;


# direct methods
.method public constructor <init>(Landroidx/room/MultiInstanceInvalidationService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p1, "androidx.room.IMultiInstanceInvalidationService"

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 1
    const-string v0, "androidx.room.IMultiInstanceInvalidationService"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq p1, v2, :cond_9

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    if-eq p1, v3, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    const v1, 0x5f4e5446

    .line 14
    .line 15
    .line 16
    if-eq p1, v1, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    iget-object p3, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 39
    .line 40
    iget-object p4, p3, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 41
    .line 42
    monitor-enter p4

    .line 43
    :try_start_0
    iget-object p3, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 44
    .line 45
    iget-object p3, p3, Landroidx/room/MultiInstanceInvalidationService;->h:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    check-cast p3, Ljava/lang/String;

    .line 56
    .line 57
    if-nez p3, :cond_2

    .line 58
    .line 59
    const-string p1, "ROOM"

    .line 60
    .line 61
    const-string p2, "Remote invalidation client ID not registered"

    .line 62
    .line 63
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    monitor-exit p4

    .line 67
    goto :goto_3

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_4

    .line 70
    :cond_2
    iget-object v0, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 71
    .line 72
    iget-object v0, v0, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 75
    .line 76
    .line 77
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    const/4 v1, 0x0

    .line 79
    :goto_0
    if-ge v1, v0, :cond_5

    .line 80
    .line 81
    :try_start_1
    iget-object v3, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 82
    .line 83
    iget-object v3, v3, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 84
    .line 85
    invoke-virtual {v3, v1}, Landroid/os/RemoteCallbackList;->getBroadcastCookie(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    iget-object v5, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 96
    .line 97
    iget-object v5, v5, Landroidx/room/MultiInstanceInvalidationService;->h:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    if-eq p1, v4, :cond_4

    .line 106
    .line 107
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    if-nez v3, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    :try_start_2
    iget-object v3, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 115
    .line 116
    iget-object v3, v3, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 117
    .line 118
    invoke-virtual {v3, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, Lz0/b;

    .line 123
    .line 124
    invoke-virtual {v3, p2}, Lz0/b;->a([Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catchall_1
    move-exception p1

    .line 129
    goto :goto_2

    .line 130
    :catch_0
    move-exception v3

    .line 131
    :try_start_3
    const-string v4, "ROOM"

    .line 132
    .line 133
    const-string v5, "Error invoking a remote callback"

    .line 134
    .line 135
    invoke-static {v4, v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    .line 137
    .line 138
    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :goto_2
    :try_start_4
    iget-object p2, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 142
    .line 143
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 144
    .line 145
    invoke-virtual {p2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :cond_5
    iget-object p1, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 150
    .line 151
    iget-object p1, p1, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 154
    .line 155
    .line 156
    monitor-exit p4

    .line 157
    :goto_3
    return v2

    .line 158
    :goto_4
    monitor-exit p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    throw p1

    .line 160
    :cond_6
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-nez p1, :cond_7

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_7
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 171
    .line 172
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    if-eqz p4, :cond_8

    .line 177
    .line 178
    instance-of v0, p4, Lz0/b;

    .line 179
    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    move-object v1, p4

    .line 183
    check-cast v1, Lz0/b;

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    new-instance v1, Lz0/b;

    .line 187
    .line 188
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object p1, v1, Lz0/b;->g:Landroid/os/IBinder;

    .line 192
    .line 193
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    iget-object p2, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 198
    .line 199
    iget-object p4, p2, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 200
    .line 201
    monitor-enter p4

    .line 202
    :try_start_5
    iget-object p2, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 203
    .line 204
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 205
    .line 206
    invoke-virtual {p2, v1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 207
    .line 208
    .line 209
    iget-object p2, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 210
    .line 211
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    monitor-exit p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 221
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 222
    .line 223
    .line 224
    return v2

    .line 225
    :catchall_2
    move-exception p1

    .line 226
    :try_start_6
    monitor-exit p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 227
    throw p1

    .line 228
    :cond_9
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-nez p1, :cond_a

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_a
    const-string p4, "androidx.room.IMultiInstanceInvalidationCallback"

    .line 239
    .line 240
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 241
    .line 242
    .line 243
    move-result-object p4

    .line 244
    if-eqz p4, :cond_b

    .line 245
    .line 246
    instance-of v0, p4, Lz0/b;

    .line 247
    .line 248
    if-eqz v0, :cond_b

    .line 249
    .line 250
    move-object v1, p4

    .line 251
    check-cast v1, Lz0/b;

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_b
    new-instance v1, Lz0/b;

    .line 255
    .line 256
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    iput-object p1, v1, Lz0/b;->g:Landroid/os/IBinder;

    .line 260
    .line 261
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    const/4 p2, 0x0

    .line 266
    if-nez p1, :cond_c

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_c
    iget-object p4, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 270
    .line 271
    iget-object p4, p4, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 272
    .line 273
    monitor-enter p4

    .line 274
    :try_start_7
    iget-object v0, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 275
    .line 276
    iget v3, v0, Landroidx/room/MultiInstanceInvalidationService;->g:I

    .line 277
    .line 278
    add-int/lit8 v3, v3, 0x1

    .line 279
    .line 280
    iput v3, v0, Landroidx/room/MultiInstanceInvalidationService;->g:I

    .line 281
    .line 282
    iget-object v0, v0, Landroidx/room/MultiInstanceInvalidationService;->i:Lz0/f;

    .line 283
    .line 284
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-virtual {v0, v1, v4}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_d

    .line 293
    .line 294
    iget-object p2, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 295
    .line 296
    iget-object p2, p2, Landroidx/room/MultiInstanceInvalidationService;->h:Ljava/util/HashMap;

    .line 297
    .line 298
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    monitor-exit p4

    .line 306
    move p2, v3

    .line 307
    goto :goto_7

    .line 308
    :catchall_3
    move-exception p1

    .line 309
    goto :goto_8

    .line 310
    :cond_d
    iget-object p1, p0, Lz0/g;->g:Landroidx/room/MultiInstanceInvalidationService;

    .line 311
    .line 312
    iget v0, p1, Landroidx/room/MultiInstanceInvalidationService;->g:I

    .line 313
    .line 314
    add-int/lit8 v0, v0, -0x1

    .line 315
    .line 316
    iput v0, p1, Landroidx/room/MultiInstanceInvalidationService;->g:I

    .line 317
    .line 318
    monitor-exit p4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 319
    :goto_7
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 323
    .line 324
    .line 325
    return v2

    .line 326
    :goto_8
    :try_start_8
    monitor-exit p4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 327
    throw p1
.end method
