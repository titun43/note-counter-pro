.class public final Lcom/google/android/gms/common/internal/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/common/internal/k0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/k;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lz2/b;->O(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->g:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x4

    .line 11
    invoke-static {p1, v2, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->h:I

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {p1, v2, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/google/android/gms/common/internal/k;->i:I

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-static {p1, v2, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/gms/common/internal/k;->j:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p1, v3, v1}, Lz2/b;->I(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->k:Landroid/os/IBinder;

    .line 42
    .line 43
    invoke-static {p1, v1, v2}, Lz2/b;->G(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->l:[Lcom/google/android/gms/common/api/Scope;

    .line 48
    .line 49
    invoke-static {p1, v1, v2, p2}, Lz2/b;->L(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->m:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, Lz2/b;->E(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->n:Landroid/accounts/Account;

    .line 61
    .line 62
    invoke-static {p1, v1, v2, p2}, Lz2/b;->H(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->o:[Lt2/d;

    .line 68
    .line 69
    invoke-static {p1, v1, v2, p2}, Lz2/b;->L(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    iget-object v2, p0, Lcom/google/android/gms/common/internal/k;->p:[Lt2/d;

    .line 75
    .line 76
    invoke-static {p1, v1, v2, p2}, Lz2/b;->L(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 77
    .line 78
    .line 79
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/k;->q:Z

    .line 80
    .line 81
    const/16 v1, 0xc

    .line 82
    .line 83
    invoke-static {p1, v1, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    iget p2, p0, Lcom/google/android/gms/common/internal/k;->r:I

    .line 90
    .line 91
    const/16 v1, 0xd

    .line 92
    .line 93
    invoke-static {p1, v1, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p2, p0, Lcom/google/android/gms/common/internal/k;->s:Z

    .line 100
    .line 101
    const/16 v1, 0xe

    .line 102
    .line 103
    invoke-static {p1, v1, v3}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    .line 108
    .line 109
    const/16 p2, 0xf

    .line 110
    .line 111
    iget-object p0, p0, Lcom/google/android/gms/common/internal/k;->t:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p1, p2, p0}, Lz2/b;->I(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/gms/common/internal/k0;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    move v9, v3

    .line 19
    move v12, v9

    .line 20
    move-wide v10, v4

    .line 21
    move-object v8, v6

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-ge v3, v2, :cond_4

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    int-to-char v4, v3

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eq v4, v5, :cond_3

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    if-eq v4, v5, :cond_2

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    if-eq v4, v5, :cond_1

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    if-eq v4, v5, :cond_0

    .line 44
    .line 45
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    move v12, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v1, v3}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    move-wide v10, v3

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    move v9, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move-object v8, v3

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 74
    .line 75
    .line 76
    new-instance v7, Lt2/d;

    .line 77
    .line 78
    invoke-direct/range {v7 .. v12}, Lt2/d;-><init>(Ljava/lang/String;IJZ)V

    .line 79
    .line 80
    .line 81
    return-object v7

    .line 82
    :pswitch_0
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v3, 0x0

    .line 87
    const/4 v4, 0x0

    .line 88
    move-object v8, v3

    .line 89
    move-object v9, v8

    .line 90
    move-object v10, v9

    .line 91
    move v6, v4

    .line 92
    move v7, v6

    .line 93
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-ge v4, v2, :cond_c

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    int-to-char v5, v4

    .line 104
    const/4 v11, 0x1

    .line 105
    if-eq v5, v11, :cond_b

    .line 106
    .line 107
    const/4 v12, 0x2

    .line 108
    if-eq v5, v12, :cond_a

    .line 109
    .line 110
    const/4 v12, 0x3

    .line 111
    if-eq v5, v12, :cond_9

    .line 112
    .line 113
    const/4 v12, 0x4

    .line 114
    if-eq v5, v12, :cond_8

    .line 115
    .line 116
    const/4 v13, 0x5

    .line 117
    if-eq v5, v13, :cond_5

    .line 118
    .line 119
    invoke-static {v1, v4}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    invoke-static {v1, v4}, Ly4/b;->N(Landroid/os/Parcel;I)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_6

    .line 128
    .line 129
    move-object v10, v3

    .line 130
    goto :goto_1

    .line 131
    :cond_6
    if-ne v4, v12, :cond_7

    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    move-object v10, v4

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    new-instance v2, Landroidx/fragment/app/x;

    .line 144
    .line 145
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    add-int/lit8 v5, v5, 0x13

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    add-int/2addr v5, v6

    .line 172
    add-int/2addr v5, v12

    .line 173
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    add-int/2addr v6, v5

    .line 178
    new-instance v5, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    add-int/2addr v6, v11

    .line 181
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 182
    .line 183
    .line 184
    const-string v6, "Expected size 4 got "

    .line 185
    .line 186
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v4, " (0x"

    .line 193
    .line 194
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const-string v3, ")"

    .line 201
    .line 202
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-direct {v2, v3, v1}, Landroidx/fragment/app/x;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 210
    .line 211
    .line 212
    throw v2

    .line 213
    :cond_8
    invoke-static {v1, v4}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    goto :goto_1

    .line 218
    :cond_9
    sget-object v5, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 219
    .line 220
    invoke-static {v1, v4, v5}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    move-object v8, v4

    .line 225
    check-cast v8, Landroid/app/PendingIntent;

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_a
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_b
    invoke-static {v1, v4}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :cond_c
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 242
    .line 243
    .line 244
    new-instance v5, Lt2/b;

    .line 245
    .line 246
    invoke-direct/range {v5 .. v10}, Lt2/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 247
    .line 248
    .line 249
    return-object v5

    .line 250
    :pswitch_1
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    const/4 v3, 0x0

    .line 255
    const-wide/16 v4, 0x0

    .line 256
    .line 257
    const/4 v6, 0x0

    .line 258
    move-object v9, v3

    .line 259
    move-object v10, v9

    .line 260
    move-object v11, v10

    .line 261
    move-object v12, v11

    .line 262
    move-object v13, v12

    .line 263
    move-object v14, v13

    .line 264
    move-object/from16 v17, v14

    .line 265
    .line 266
    move-object/from16 v18, v17

    .line 267
    .line 268
    move-object/from16 v19, v18

    .line 269
    .line 270
    move-object/from16 v20, v19

    .line 271
    .line 272
    move-wide v15, v4

    .line 273
    move v8, v6

    .line 274
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-ge v3, v2, :cond_d

    .line 279
    .line 280
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    int-to-char v4, v3

    .line 285
    packed-switch v4, :pswitch_data_1

    .line 286
    .line 287
    .line 288
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_2

    .line 292
    :pswitch_2
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    move-object/from16 v20, v3

    .line 297
    .line 298
    goto :goto_2

    .line 299
    :pswitch_3
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    move-object/from16 v19, v3

    .line 304
    .line 305
    goto :goto_2

    .line 306
    :pswitch_4
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 307
    .line 308
    invoke-static {v1, v3, v4}, Ly4/b;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    move-object/from16 v18, v3

    .line 313
    .line 314
    goto :goto_2

    .line 315
    :pswitch_5
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    move-object/from16 v17, v3

    .line 320
    .line 321
    goto :goto_2

    .line 322
    :pswitch_6
    invoke-static {v1, v3}, Ly4/b;->M(Landroid/os/Parcel;I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v3

    .line 326
    move-wide v15, v3

    .line 327
    goto :goto_2

    .line 328
    :pswitch_7
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    move-object v14, v3

    .line 333
    goto :goto_2

    .line 334
    :pswitch_8
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 335
    .line 336
    invoke-static {v1, v3, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Landroid/net/Uri;

    .line 341
    .line 342
    move-object v13, v3

    .line 343
    goto :goto_2

    .line 344
    :pswitch_9
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    move-object v12, v3

    .line 349
    goto :goto_2

    .line 350
    :pswitch_a
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    move-object v11, v3

    .line 355
    goto :goto_2

    .line 356
    :pswitch_b
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    move-object v10, v3

    .line 361
    goto :goto_2

    .line 362
    :pswitch_c
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    move-object v9, v3

    .line 367
    goto :goto_2

    .line 368
    :pswitch_d
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    move v8, v3

    .line 373
    goto :goto_2

    .line 374
    :cond_d
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 375
    .line 376
    .line 377
    new-instance v7, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 378
    .line 379
    invoke-direct/range {v7 .. v20}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-object v7

    .line 383
    :pswitch_e
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    const/4 v3, 0x0

    .line 388
    const/4 v4, 0x0

    .line 389
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-ge v5, v2, :cond_10

    .line 394
    .line 395
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    int-to-char v6, v5

    .line 400
    const/4 v7, 0x1

    .line 401
    if-eq v6, v7, :cond_f

    .line 402
    .line 403
    const/4 v7, 0x2

    .line 404
    if-eq v6, v7, :cond_e

    .line 405
    .line 406
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 407
    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_e
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    goto :goto_3

    .line 415
    :cond_f
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    goto :goto_3

    .line 420
    :cond_10
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 421
    .line 422
    .line 423
    new-instance v1, Lq2/d;

    .line 424
    .line 425
    invoke-direct {v1, v3, v4}, Lq2/d;-><init>(Ljava/lang/String;I)V

    .line 426
    .line 427
    .line 428
    return-object v1

    .line 429
    :pswitch_f
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    const/4 v3, 0x0

    .line 434
    move-object v4, v3

    .line 435
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-ge v5, v2, :cond_13

    .line 440
    .line 441
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    int-to-char v6, v5

    .line 446
    const/4 v7, 0x1

    .line 447
    if-eq v6, v7, :cond_12

    .line 448
    .line 449
    const/4 v7, 0x2

    .line 450
    if-eq v6, v7, :cond_11

    .line 451
    .line 452
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 453
    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_11
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    goto :goto_4

    .line 461
    :cond_12
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    goto :goto_4

    .line 466
    :cond_13
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 467
    .line 468
    .line 469
    new-instance v1, Lq2/c;

    .line 470
    .line 471
    invoke-direct {v1, v3, v4}, Lq2/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-object v1

    .line 475
    :pswitch_10
    new-instance v2, Lk/q0;

    .line 476
    .line 477
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1}, Landroid/os/Parcel;->readByte()B

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-eqz v1, :cond_14

    .line 485
    .line 486
    const/4 v1, 0x1

    .line 487
    goto :goto_5

    .line 488
    :cond_14
    const/4 v1, 0x0

    .line 489
    :goto_5
    iput-boolean v1, v2, Lk/q0;->g:Z

    .line 490
    .line 491
    return-object v2

    .line 492
    :pswitch_11
    new-instance v2, Landroidx/versionedparcelable/ParcelImpl;

    .line 493
    .line 494
    invoke-direct {v2, v1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 495
    .line 496
    .line 497
    return-object v2

    .line 498
    :pswitch_12
    new-instance v2, Li0/h;

    .line 499
    .line 500
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    iput v1, v2, Li0/h;->g:I

    .line 508
    .line 509
    return-object v2

    .line 510
    :pswitch_13
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    const/4 v3, 0x0

    .line 515
    const/4 v4, 0x0

    .line 516
    move v5, v4

    .line 517
    move-object v4, v3

    .line 518
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    if-ge v6, v2, :cond_18

    .line 523
    .line 524
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    int-to-char v7, v6

    .line 529
    const/4 v8, 0x1

    .line 530
    if-eq v7, v8, :cond_17

    .line 531
    .line 532
    const/4 v8, 0x2

    .line 533
    if-eq v7, v8, :cond_16

    .line 534
    .line 535
    const/4 v8, 0x3

    .line 536
    if-eq v7, v8, :cond_15

    .line 537
    .line 538
    invoke-static {v1, v6}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 539
    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_15
    sget-object v4, Lcom/google/android/gms/common/internal/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 543
    .line 544
    invoke-static {v1, v6, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    check-cast v4, Lcom/google/android/gms/common/internal/y;

    .line 549
    .line 550
    goto :goto_6

    .line 551
    :cond_16
    sget-object v3, Lt2/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 552
    .line 553
    invoke-static {v1, v6, v3}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    check-cast v3, Lt2/b;

    .line 558
    .line 559
    goto :goto_6

    .line 560
    :cond_17
    invoke-static {v1, v6}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    goto :goto_6

    .line 565
    :cond_18
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 566
    .line 567
    .line 568
    new-instance v1, Lg3/g;

    .line 569
    .line 570
    invoke-direct {v1, v5, v3, v4}, Lg3/g;-><init>(ILt2/b;Lcom/google/android/gms/common/internal/y;)V

    .line 571
    .line 572
    .line 573
    return-object v1

    .line 574
    :pswitch_14
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    const/4 v3, 0x0

    .line 579
    const/4 v4, 0x0

    .line 580
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 581
    .line 582
    .line 583
    move-result v5

    .line 584
    if-ge v5, v2, :cond_1b

    .line 585
    .line 586
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 587
    .line 588
    .line 589
    move-result v5

    .line 590
    int-to-char v6, v5

    .line 591
    const/4 v7, 0x1

    .line 592
    if-eq v6, v7, :cond_1a

    .line 593
    .line 594
    const/4 v7, 0x2

    .line 595
    if-eq v6, v7, :cond_19

    .line 596
    .line 597
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 598
    .line 599
    .line 600
    goto :goto_7

    .line 601
    :cond_19
    sget-object v3, Lcom/google/android/gms/common/internal/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 602
    .line 603
    invoke-static {v1, v5, v3}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    check-cast v3, Lcom/google/android/gms/common/internal/x;

    .line 608
    .line 609
    goto :goto_7

    .line 610
    :cond_1a
    invoke-static {v1, v5}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    goto :goto_7

    .line 615
    :cond_1b
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 616
    .line 617
    .line 618
    new-instance v1, Lg3/f;

    .line 619
    .line 620
    invoke-direct {v1, v4, v3}, Lg3/f;-><init>(ILcom/google/android/gms/common/internal/x;)V

    .line 621
    .line 622
    .line 623
    return-object v1

    .line 624
    :pswitch_15
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 625
    .line 626
    .line 627
    move-result v2

    .line 628
    const/4 v3, 0x0

    .line 629
    move-object v4, v3

    .line 630
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    if-ge v5, v2, :cond_1e

    .line 635
    .line 636
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    int-to-char v6, v5

    .line 641
    const/4 v7, 0x1

    .line 642
    if-eq v6, v7, :cond_1d

    .line 643
    .line 644
    const/4 v7, 0x2

    .line 645
    if-eq v6, v7, :cond_1c

    .line 646
    .line 647
    invoke-static {v1, v5}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 648
    .line 649
    .line 650
    goto :goto_8

    .line 651
    :cond_1c
    invoke-static {v1, v5}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    goto :goto_8

    .line 656
    :cond_1d
    invoke-static {v1, v5}, Ly4/b;->q(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    goto :goto_8

    .line 661
    :cond_1e
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 662
    .line 663
    .line 664
    new-instance v1, Lg3/e;

    .line 665
    .line 666
    invoke-direct {v1, v3, v4}, Lg3/e;-><init>(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    return-object v1

    .line 670
    :pswitch_16
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    const/4 v3, 0x0

    .line 675
    const/4 v4, 0x0

    .line 676
    move v5, v4

    .line 677
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 678
    .line 679
    .line 680
    move-result v6

    .line 681
    if-ge v6, v2, :cond_22

    .line 682
    .line 683
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 684
    .line 685
    .line 686
    move-result v6

    .line 687
    int-to-char v7, v6

    .line 688
    const/4 v8, 0x1

    .line 689
    if-eq v7, v8, :cond_21

    .line 690
    .line 691
    const/4 v8, 0x2

    .line 692
    if-eq v7, v8, :cond_20

    .line 693
    .line 694
    const/4 v8, 0x3

    .line 695
    if-eq v7, v8, :cond_1f

    .line 696
    .line 697
    invoke-static {v1, v6}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 698
    .line 699
    .line 700
    goto :goto_9

    .line 701
    :cond_1f
    sget-object v3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 702
    .line 703
    invoke-static {v1, v6, v3}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    check-cast v3, Landroid/content/Intent;

    .line 708
    .line 709
    goto :goto_9

    .line 710
    :cond_20
    invoke-static {v1, v6}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    goto :goto_9

    .line 715
    :cond_21
    invoke-static {v1, v6}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 716
    .line 717
    .line 718
    move-result v4

    .line 719
    goto :goto_9

    .line 720
    :cond_22
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 721
    .line 722
    .line 723
    new-instance v1, Lg3/b;

    .line 724
    .line 725
    invoke-direct {v1, v4, v5, v3}, Lg3/b;-><init>(IILandroid/content/Intent;)V

    .line 726
    .line 727
    .line 728
    return-object v1

    .line 729
    :pswitch_17
    const-string v2, "inParcel"

    .line 730
    .line 731
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    new-instance v2, Ld/i;

    .line 735
    .line 736
    const-class v3, Landroid/content/IntentSender;

    .line 737
    .line 738
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-static {v3}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    check-cast v3, Landroid/content/IntentSender;

    .line 750
    .line 751
    const-class v4, Landroid/content/Intent;

    .line 752
    .line 753
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    check-cast v4, Landroid/content/Intent;

    .line 762
    .line 763
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 764
    .line 765
    .line 766
    move-result v5

    .line 767
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 768
    .line 769
    .line 770
    move-result v1

    .line 771
    invoke-direct {v2, v3, v4, v5, v1}, Ld/i;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 772
    .line 773
    .line 774
    return-object v2

    .line 775
    :pswitch_18
    const-string v2, "parcel"

    .line 776
    .line 777
    invoke-static {v1, v2}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    new-instance v2, Ld/a;

    .line 781
    .line 782
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    if-nez v4, :cond_23

    .line 791
    .line 792
    const/4 v1, 0x0

    .line 793
    goto :goto_a

    .line 794
    :cond_23
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 795
    .line 796
    invoke-interface {v4, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    check-cast v1, Landroid/content/Intent;

    .line 801
    .line 802
    :goto_a
    invoke-direct {v2, v1, v3}, Ld/a;-><init>(Landroid/content/Intent;I)V

    .line 803
    .line 804
    .line 805
    return-object v2

    .line 806
    :pswitch_19
    invoke-static {v1}, Ly4/b;->Q(Landroid/os/Parcel;)I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    new-instance v3, Landroid/os/Bundle;

    .line 811
    .line 812
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 813
    .line 814
    .line 815
    sget-object v4, Lcom/google/android/gms/common/internal/k;->u:[Lcom/google/android/gms/common/api/Scope;

    .line 816
    .line 817
    const/4 v5, 0x0

    .line 818
    const/4 v6, 0x0

    .line 819
    sget-object v7, Lcom/google/android/gms/common/internal/k;->v:[Lt2/d;

    .line 820
    .line 821
    move-object v15, v3

    .line 822
    move-object v14, v4

    .line 823
    move-object v12, v5

    .line 824
    move-object v13, v12

    .line 825
    move-object/from16 v16, v13

    .line 826
    .line 827
    move-object/from16 v22, v16

    .line 828
    .line 829
    move v9, v6

    .line 830
    move v10, v9

    .line 831
    move v11, v10

    .line 832
    move/from16 v19, v11

    .line 833
    .line 834
    move/from16 v20, v19

    .line 835
    .line 836
    move/from16 v21, v20

    .line 837
    .line 838
    move-object/from16 v17, v7

    .line 839
    .line 840
    move-object/from16 v18, v17

    .line 841
    .line 842
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    if-ge v3, v2, :cond_24

    .line 847
    .line 848
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    int-to-char v4, v3

    .line 853
    packed-switch v4, :pswitch_data_2

    .line 854
    .line 855
    .line 856
    :pswitch_1a
    invoke-static {v1, v3}, Ly4/b;->P(Landroid/os/Parcel;I)V

    .line 857
    .line 858
    .line 859
    goto :goto_b

    .line 860
    :pswitch_1b
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v22

    .line 864
    goto :goto_b

    .line 865
    :pswitch_1c
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 866
    .line 867
    .line 868
    move-result v21

    .line 869
    goto :goto_b

    .line 870
    :pswitch_1d
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 871
    .line 872
    .line 873
    move-result v20

    .line 874
    goto :goto_b

    .line 875
    :pswitch_1e
    invoke-static {v1, v3}, Ly4/b;->G(Landroid/os/Parcel;I)Z

    .line 876
    .line 877
    .line 878
    move-result v19

    .line 879
    goto :goto_b

    .line 880
    :pswitch_1f
    sget-object v4, Lt2/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 881
    .line 882
    invoke-static {v1, v3, v4}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v3

    .line 886
    move-object/from16 v18, v3

    .line 887
    .line 888
    check-cast v18, [Lt2/d;

    .line 889
    .line 890
    goto :goto_b

    .line 891
    :pswitch_20
    sget-object v4, Lt2/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 892
    .line 893
    invoke-static {v1, v3, v4}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    move-object/from16 v17, v3

    .line 898
    .line 899
    check-cast v17, [Lt2/d;

    .line 900
    .line 901
    goto :goto_b

    .line 902
    :pswitch_21
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 903
    .line 904
    invoke-static {v1, v3, v4}, Ly4/b;->n(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    move-object/from16 v16, v3

    .line 909
    .line 910
    check-cast v16, Landroid/accounts/Account;

    .line 911
    .line 912
    goto :goto_b

    .line 913
    :pswitch_22
    invoke-static {v1, v3}, Ly4/b;->l(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 914
    .line 915
    .line 916
    move-result-object v15

    .line 917
    goto :goto_b

    .line 918
    :pswitch_23
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 919
    .line 920
    invoke-static {v1, v3, v4}, Ly4/b;->r(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v3

    .line 924
    move-object v14, v3

    .line 925
    check-cast v14, [Lcom/google/android/gms/common/api/Scope;

    .line 926
    .line 927
    goto :goto_b

    .line 928
    :pswitch_24
    invoke-static {v1, v3}, Ly4/b;->K(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 929
    .line 930
    .line 931
    move-result-object v13

    .line 932
    goto :goto_b

    .line 933
    :pswitch_25
    invoke-static {v1, v3}, Ly4/b;->o(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v12

    .line 937
    goto :goto_b

    .line 938
    :pswitch_26
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 939
    .line 940
    .line 941
    move-result v11

    .line 942
    goto :goto_b

    .line 943
    :pswitch_27
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 944
    .line 945
    .line 946
    move-result v10

    .line 947
    goto :goto_b

    .line 948
    :pswitch_28
    invoke-static {v1, v3}, Ly4/b;->L(Landroid/os/Parcel;I)I

    .line 949
    .line 950
    .line 951
    move-result v9

    .line 952
    goto :goto_b

    .line 953
    :cond_24
    invoke-static {v1, v2}, Ly4/b;->t(Landroid/os/Parcel;I)V

    .line 954
    .line 955
    .line 956
    new-instance v8, Lcom/google/android/gms/common/internal/k;

    .line 957
    .line 958
    invoke-direct/range {v8 .. v22}, Lcom/google/android/gms/common/internal/k;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lt2/d;[Lt2/d;ZIZLjava/lang/String;)V

    .line 959
    .line 960
    .line 961
    return-object v8

    .line 962
    nop

    .line 963
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
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    :pswitch_data_1
    .packed-switch 0x1
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
    .end packed-switch

    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_1a
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/internal/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lt2/d;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lt2/b;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lq2/d;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lq2/c;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lk/q0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Li0/h;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lg3/g;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lg3/f;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lg3/e;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lg3/b;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Ld/i;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Ld/a;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/common/internal/k;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
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
