.class public final Ln/g;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lb/a;


# instance fields
.field public final g:Landroid/os/Handler;

.field public final synthetic h:Ln/a;


# direct methods
.method public constructor <init>(Ln/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ln/g;->h:Ln/a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lb/a;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ln/g;->g:Landroid/os/Handler;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 11

    .line 1
    sget-object v4, Lb/a;->c:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v8, 0x1

    .line 4
    if-lt p1, v8, :cond_0

    .line 5
    .line 6
    const v5, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v5, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v5, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v5, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v8

    .line 23
    :cond_1
    const/4 v4, 0x0

    .line 24
    iget-object v9, p0, Ln/g;->g:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v5, p0, Ln/g;->h:Ln/a;

    .line 27
    .line 28
    packed-switch p1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-super/range {p0 .. p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    return v0

    .line 36
    :pswitch_0
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 37
    .line 38
    invoke-static {p2, v0}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/os/Bundle;

    .line 43
    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_2
    new-instance v2, Ln/b;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v2, p0, v0, v3}, Ln/b;-><init>(Ln/g;Landroid/os/Bundle;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    return v8

    .line 58
    :pswitch_1
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    .line 60
    invoke-static {p2, v0}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroid/os/Bundle;

    .line 65
    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_3
    new-instance v2, Ln/b;

    .line 71
    .line 72
    const/4 v3, 0x3

    .line 73
    invoke-direct {v2, p0, v0, v3}, Ln/b;-><init>(Ln/g;Landroid/os/Bundle;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    .line 78
    .line 79
    return v8

    .line 80
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    move-object v6, v5

    .line 93
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    move-object v7, v6

    .line 98
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    sget-object v10, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 103
    .line 104
    invoke-static {p2, v10}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Landroid/os/Bundle;

    .line 109
    .line 110
    if-nez v7, :cond_4

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_4
    move-object v7, v2

    .line 115
    move v2, v0

    .line 116
    new-instance v0, Ln/f;

    .line 117
    .line 118
    move-object v1, p0

    .line 119
    invoke-direct/range {v0 .. v7}, Ln/f;-><init>(Ln/g;IIIIILandroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    return v8

    .line 126
    :pswitch_3
    move-object v7, v5

    .line 127
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 128
    .line 129
    invoke-static {p2, v0}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Landroid/os/Bundle;

    .line 134
    .line 135
    if-nez v7, :cond_5

    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_5
    new-instance v2, Ln/b;

    .line 140
    .line 141
    const/4 v3, 0x2

    .line 142
    invoke-direct {v2, p0, v0, v3}, Ln/b;-><init>(Ln/g;Landroid/os/Bundle;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 146
    .line 147
    .line 148
    return v8

    .line 149
    :pswitch_4
    move-object v7, v5

    .line 150
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 159
    .line 160
    invoke-static {p2, v4}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move-object v4, v2

    .line 165
    check-cast v4, Landroid/os/Bundle;

    .line 166
    .line 167
    if-nez v7, :cond_6

    .line 168
    .line 169
    goto/16 :goto_3

    .line 170
    .line 171
    :cond_6
    move v2, v0

    .line 172
    new-instance v0, Ln/e;

    .line 173
    .line 174
    const/4 v5, 0x0

    .line 175
    move-object v1, p0

    .line 176
    invoke-direct/range {v0 .. v5}, Ln/e;-><init>(Ljava/lang/Object;IILjava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 180
    .line 181
    .line 182
    return v8

    .line 183
    :pswitch_5
    move-object v7, v5

    .line 184
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 189
    .line 190
    invoke-static {p2, v1}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Landroid/os/Bundle;

    .line 195
    .line 196
    if-nez v7, :cond_7

    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    goto :goto_0

    .line 200
    :cond_7
    invoke-virtual {v7, v0, v1}, Ln/a;->extraCallbackWithResult(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 205
    .line 206
    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p3, v8}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 213
    .line 214
    .line 215
    return v8

    .line 216
    :cond_8
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    .line 218
    .line 219
    return v8

    .line 220
    :pswitch_6
    move-object v7, v5

    .line 221
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    sget-object v1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 226
    .line 227
    invoke-static {p2, v1}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object v3, v1

    .line 232
    check-cast v3, Landroid/net/Uri;

    .line 233
    .line 234
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    move v4, v8

    .line 241
    :cond_9
    sget-object v1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 242
    .line 243
    invoke-static {p2, v1}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    move-object v5, v1

    .line 248
    check-cast v5, Landroid/os/Bundle;

    .line 249
    .line 250
    if-nez v7, :cond_a

    .line 251
    .line 252
    goto/16 :goto_3

    .line 253
    .line 254
    :cond_a
    move v2, v0

    .line 255
    new-instance v0, Ln/d;

    .line 256
    .line 257
    move-object v1, p0

    .line 258
    invoke-direct/range {v0 .. v5}, Ln/d;-><init>(Ln/g;ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 262
    .line 263
    .line 264
    return v8

    .line 265
    :pswitch_7
    move-object v7, v5

    .line 266
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    sget-object v4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 271
    .line 272
    invoke-static {p2, v4}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    check-cast v2, Landroid/os/Bundle;

    .line 277
    .line 278
    if-nez v7, :cond_b

    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_b
    new-instance v4, Ln/c;

    .line 282
    .line 283
    const/4 v5, 0x1

    .line 284
    invoke-direct {v4, p0, v0, v2, v5}, Ln/c;-><init>(Ln/g;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 288
    .line 289
    .line 290
    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 291
    .line 292
    .line 293
    return v8

    .line 294
    :pswitch_8
    move-object v7, v5

    .line 295
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 296
    .line 297
    invoke-static {p2, v0}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    check-cast v0, Landroid/os/Bundle;

    .line 302
    .line 303
    if-nez v7, :cond_c

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_c
    new-instance v2, Ln/b;

    .line 307
    .line 308
    const/4 v4, 0x1

    .line 309
    invoke-direct {v2, p0, v0, v4}, Ln/b;-><init>(Ln/g;Landroid/os/Bundle;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v9, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 313
    .line 314
    .line 315
    :goto_2
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 316
    .line 317
    .line 318
    return v8

    .line 319
    :pswitch_9
    move-object v7, v5

    .line 320
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 325
    .line 326
    invoke-static {p2, v3}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, Landroid/os/Bundle;

    .line 331
    .line 332
    if-nez v7, :cond_d

    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_d
    new-instance v3, Ln/c;

    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    invoke-direct {v3, p0, v0, v2, v4}, Ln/c;-><init>(Ln/g;Ljava/lang/String;Landroid/os/Bundle;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v9, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 342
    .line 343
    .line 344
    return v8

    .line 345
    :pswitch_a
    move-object v7, v5

    .line 346
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 351
    .line 352
    invoke-static {p2, v3}, La/a;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    check-cast v2, Landroid/os/Bundle;

    .line 357
    .line 358
    if-nez v7, :cond_e

    .line 359
    .line 360
    :goto_3
    return v8

    .line 361
    :cond_e
    new-instance v3, Lk/v0;

    .line 362
    .line 363
    const/4 v4, 0x1

    .line 364
    invoke-direct {v3, p0, v0, v2, v4}, Lk/v0;-><init>(Ljava/lang/Object;ILandroid/os/Parcelable;I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v9, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 368
    .line 369
    .line 370
    return v8

    .line 371
    :pswitch_data_0
    .packed-switch 0x2
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
