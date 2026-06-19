.class public final Lcom/google/android/gms/internal/ads/zzaim;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzaij;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaik;->zza:Lcom/google/android/gms/internal/ads/zzaik;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaim;->zza:Lcom/google/android/gms/internal/ads/zzaij;

    return-void
.end method

.method public static final zza([BILcom/google/android/gms/internal/ads/zzaij;Lcom/google/android/gms/internal/ads/zzahw;)Lcom/google/android/gms/internal/ads/zzap;
    .locals 11

    .line 1
    new-instance p3, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>([BI)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/4 p1, 0x2

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x4

    .line 19
    const-string v4, "Id3Decoder"

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/16 v6, 0xa

    .line 23
    .line 24
    if-ge p0, v6, :cond_0

    .line 25
    .line 26
    const-string p0, "Data too short to be an ID3 tag"

    .line 27
    .line 28
    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    move-object v9, v5

    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const v7, 0x494433

    .line 39
    .line 40
    .line 41
    if-eq p0, v7, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v7, "%06X"

    .line 52
    .line 53
    invoke-static {v7, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v7, "Unexpected first three bytes of ID3 tag header: 0x"

    .line 58
    .line 59
    invoke-virtual {v7, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzG()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-ne p0, p1, :cond_2

    .line 83
    .line 84
    and-int/lit8 v9, v7, 0x40

    .line 85
    .line 86
    if-eqz v9, :cond_5

    .line 87
    .line 88
    const-string p0, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    .line 89
    .line 90
    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const/4 v9, 0x3

    .line 95
    if-ne p0, v9, :cond_3

    .line 96
    .line 97
    and-int/lit8 v9, v7, 0x40

    .line 98
    .line 99
    if-eqz v9, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 106
    .line 107
    .line 108
    add-int/2addr v9, v3

    .line 109
    sub-int/2addr v8, v9

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    if-ne p0, v3, :cond_7

    .line 112
    .line 113
    and-int/lit8 v9, v7, 0x40

    .line 114
    .line 115
    if-eqz v9, :cond_4

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzG()I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    add-int/lit8 v10, v9, -0x4

    .line 122
    .line 123
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 124
    .line 125
    .line 126
    sub-int/2addr v8, v9

    .line 127
    :cond_4
    and-int/lit8 v9, v7, 0x10

    .line 128
    .line 129
    if-eqz v9, :cond_5

    .line 130
    .line 131
    add-int/lit8 v8, v8, -0xa

    .line 132
    .line 133
    :cond_5
    :goto_1
    if-ge p0, v3, :cond_6

    .line 134
    .line 135
    and-int/lit16 v7, v7, 0x80

    .line 136
    .line 137
    if-eqz v7, :cond_6

    .line 138
    .line 139
    move v7, v2

    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move v7, v1

    .line 142
    :goto_2
    new-instance v9, Lcom/google/android/gms/internal/ads/zzail;

    .line 143
    .line 144
    invoke-direct {v9, p0, v7, v8}, Lcom/google/android/gms/internal/ads/zzail;-><init>(IZI)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_7
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    new-instance v8, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    add-int/lit8 v7, v7, 0x2e

    .line 159
    .line 160
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 161
    .line 162
    .line 163
    const-string v7, "Skipped ID3 tag with unsupported majorVersion="

    .line 164
    .line 165
    invoke-static {v8, v7, p0, v4}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :goto_3
    if-nez v9, :cond_8

    .line 171
    .line 172
    return-object v5

    .line 173
    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zza()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-ne v7, p1, :cond_9

    .line 182
    .line 183
    const/4 v6, 0x6

    .line 184
    :cond_9
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zzb()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zzc()I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zzc()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzaim;->zze(Lcom/google/android/gms/internal/ads/zzer;I)I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    :cond_a
    add-int/2addr p0, v7

    .line 203
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zza()I

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    invoke-static {v0, p0, v6, v1}, Lcom/google/android/gms/internal/ads/zzaim;->zzb(Lcom/google/android/gms/internal/ads/zzer;IIZ)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_c

    .line 215
    .line 216
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zza()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-ne p0, v3, :cond_b

    .line 221
    .line 222
    invoke-static {v0, v3, v6, v2}, Lcom/google/android/gms/internal/ads/zzaim;->zzb(Lcom/google/android/gms/internal/ads/zzer;IIZ)Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_b

    .line 227
    .line 228
    move v1, v2

    .line 229
    goto :goto_4

    .line 230
    :cond_b
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zza()I

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    new-instance p2, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    add-int/lit8 p1, p1, 0x2d

    .line 245
    .line 246
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 247
    .line 248
    .line 249
    const-string p1, "Failed to validate ID3 tag with majorVersion="

    .line 250
    .line 251
    invoke-static {p2, p1, p0, v4}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object v5

    .line 255
    :cond_c
    :goto_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-lt p0, v6, :cond_d

    .line 260
    .line 261
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzail;->zza()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    invoke-static {p0, v0, v1, v6, p2}, Lcom/google/android/gms/internal/ads/zzaim;->zzc(ILcom/google/android/gms/internal/ads/zzer;ZILcom/google/android/gms/internal/ads/zzaij;)Lcom/google/android/gms/internal/ads/zzain;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    if-eqz p0, :cond_c

    .line 270
    .line 271
    invoke-virtual {p3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_d
    new-instance p0, Lcom/google/android/gms/internal/ads/zzap;

    .line 276
    .line 277
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 278
    .line 279
    .line 280
    return-object p0
.end method

.method private static zzb(Lcom/google/android/gms/internal/ads/zzer;IIZ)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x1

    .line 14
    move/from16 v5, p2

    .line 15
    .line 16
    if-lt v3, v5, :cond_c

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    const/4 v6, 0x0

    .line 20
    if-lt v0, v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 31
    .line 32
    .line 33
    move-result v10

    .line 34
    goto :goto_1

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    int-to-long v8, v8

    .line 47
    move v10, v6

    .line 48
    :goto_1
    const-wide/16 v11, 0x0

    .line 49
    .line 50
    if-nez v7, :cond_1

    .line 51
    .line 52
    cmp-long v7, v8, v11

    .line 53
    .line 54
    if-nez v7, :cond_1

    .line 55
    .line 56
    if-nez v10, :cond_1

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_1
    const/4 v7, 0x4

    .line 61
    if-ne v0, v7, :cond_3

    .line 62
    .line 63
    if-nez p3, :cond_3

    .line 64
    .line 65
    const-wide/32 v13, 0x808080

    .line 66
    .line 67
    .line 68
    and-long/2addr v13, v8

    .line 69
    cmp-long v11, v13, v11

    .line 70
    .line 71
    if-eqz v11, :cond_2

    .line 72
    .line 73
    :goto_2
    move v4, v6

    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_2
    const-wide/16 v11, 0xff

    .line 77
    .line 78
    and-long v13, v8, v11

    .line 79
    .line 80
    const/16 v15, 0x8

    .line 81
    .line 82
    shr-long v15, v8, v15

    .line 83
    .line 84
    const/16 v17, 0x10

    .line 85
    .line 86
    shr-long v17, v8, v17

    .line 87
    .line 88
    const/16 v19, 0x18

    .line 89
    .line 90
    shr-long v8, v8, v19

    .line 91
    .line 92
    and-long/2addr v15, v11

    .line 93
    and-long v11, v17, v11

    .line 94
    .line 95
    const/16 v17, 0x7

    .line 96
    .line 97
    shl-long v15, v15, v17

    .line 98
    .line 99
    or-long/2addr v13, v15

    .line 100
    const/16 v15, 0xe

    .line 101
    .line 102
    shl-long/2addr v11, v15

    .line 103
    or-long/2addr v11, v13

    .line 104
    const/16 v13, 0x15

    .line 105
    .line 106
    shl-long/2addr v8, v13

    .line 107
    or-long/2addr v8, v11

    .line 108
    :cond_3
    if-ne v0, v7, :cond_5

    .line 109
    .line 110
    and-int/lit8 v3, v10, 0x40

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move v4, v6

    .line 116
    :goto_3
    and-int/lit8 v3, v10, 0x1

    .line 117
    .line 118
    move/from16 v20, v4

    .line 119
    .line 120
    move v4, v3

    .line 121
    move/from16 v3, v20

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_5
    if-ne v0, v3, :cond_8

    .line 125
    .line 126
    and-int/lit8 v3, v10, 0x20

    .line 127
    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    move v3, v4

    .line 131
    goto :goto_4

    .line 132
    :cond_6
    move v3, v6

    .line 133
    :goto_4
    and-int/lit16 v7, v10, 0x80

    .line 134
    .line 135
    if-eqz v7, :cond_7

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    move v4, v6

    .line 139
    goto :goto_5

    .line 140
    :cond_8
    move v3, v6

    .line 141
    move v4, v3

    .line 142
    :goto_5
    if-eqz v4, :cond_9

    .line 143
    .line 144
    add-int/lit8 v3, v3, 0x4

    .line 145
    .line 146
    :cond_9
    int-to-long v3, v3

    .line 147
    cmp-long v3, v8, v3

    .line 148
    .line 149
    if-gez v3, :cond_a

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_a
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    int-to-long v3, v3

    .line 157
    cmp-long v3, v3, v8

    .line 158
    .line 159
    if-gez v3, :cond_b

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    long-to-int v3, v8

    .line 163
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    .line 165
    .line 166
    goto/16 :goto_0

    .line 167
    .line 168
    :cond_c
    :goto_6
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 169
    .line 170
    .line 171
    return v4

    .line 172
    :goto_7
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 173
    .line 174
    .line 175
    throw v0
.end method

.method private static zzc(ILcom/google/android/gms/internal/ads/zzer;ZILcom/google/android/gms/internal/ads/zzaij;)Lcom/google/android/gms/internal/ads/zzain;
    .locals 33

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p2

    move/from16 v3, p3

    .line 1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v4

    .line 2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v5

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x3

    if-lt v1, v8, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v9

    goto :goto_0

    :cond_0
    move v9, v7

    :goto_0
    const/4 v10, 0x4

    if-ne v1, v10, :cond_1

    .line 5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    move-result v11

    if-nez v0, :cond_3

    and-int/lit16 v12, v11, 0xff

    shr-int/lit8 v13, v11, 0x8

    and-int/lit16 v13, v13, 0xff

    shr-int/lit8 v14, v11, 0x10

    and-int/lit16 v14, v14, 0xff

    shr-int/lit8 v11, v11, 0x18

    shl-int/lit8 v13, v13, 0x7

    or-int/2addr v12, v13

    shl-int/lit8 v13, v14, 0xe

    or-int/2addr v12, v13

    shl-int/lit8 v11, v11, 0x15

    or-int/2addr v11, v12

    goto :goto_1

    :cond_1
    if-ne v1, v8, :cond_2

    .line 6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    move-result v11

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    move-result v11

    :cond_3
    :goto_1
    if-lt v1, v8, :cond_4

    .line 8
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    move-result v12

    goto :goto_2

    :cond_4
    move v12, v7

    :goto_2
    const/4 v13, 0x0

    if-nez v4, :cond_6

    if-nez v5, :cond_6

    if-nez v6, :cond_6

    if-nez v9, :cond_6

    if-nez v11, :cond_6

    if-eqz v12, :cond_5

    goto :goto_3

    .line 9
    :cond_5
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    move-result v0

    .line 10
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    return-object v13

    .line 11
    :cond_6
    :goto_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v14

    add-int/2addr v14, v11

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    move-result v15

    move-object/from16 v16, v13

    const-string v13, "Id3Decoder"

    if-le v14, v15, :cond_7

    const-string v0, "Frame size exceeds remaining tag data"

    .line 12
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    move-result v0

    .line 13
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    return-object v16

    :cond_7
    if-nez p4, :cond_3c

    const/4 v15, 0x1

    if-ne v1, v8, :cond_b

    and-int/lit8 v17, v12, 0x40

    and-int/lit16 v8, v12, 0x80

    if-eqz v8, :cond_8

    move v8, v15

    goto :goto_4

    :cond_8
    move v8, v7

    :goto_4
    if-eqz v17, :cond_9

    move/from16 v17, v15

    goto :goto_5

    :cond_9
    move/from16 v17, v7

    :goto_5
    and-int/lit8 v12, v12, 0x20

    if-eqz v12, :cond_a

    move v12, v15

    goto :goto_6

    :cond_a
    move v12, v7

    :goto_6
    move/from16 v20, v7

    move/from16 v19, v17

    move/from16 v17, v12

    move v12, v8

    goto :goto_b

    :cond_b
    if-ne v1, v10, :cond_10

    and-int/lit8 v8, v12, 0x40

    if-eqz v8, :cond_c

    move v8, v15

    goto :goto_7

    :cond_c
    move v8, v7

    :goto_7
    and-int/lit8 v17, v12, 0x8

    if-eqz v17, :cond_d

    move/from16 v17, v15

    goto :goto_8

    :cond_d
    move/from16 v17, v7

    :goto_8
    and-int/lit8 v19, v12, 0x4

    if-eqz v19, :cond_e

    move/from16 v19, v15

    goto :goto_9

    :cond_e
    move/from16 v19, v7

    :goto_9
    and-int/lit8 v20, v12, 0x2

    if-eqz v20, :cond_f

    move/from16 v20, v15

    goto :goto_a

    :cond_f
    move/from16 v20, v7

    :goto_a
    and-int/2addr v12, v15

    move/from16 v32, v17

    move/from16 v17, v8

    move/from16 v8, v32

    goto :goto_b

    :cond_10
    move v8, v7

    move v12, v8

    move/from16 v17, v12

    move/from16 v19, v17

    move/from16 v20, v19

    :goto_b
    if-nez v8, :cond_11

    if-eqz v19, :cond_12

    :cond_11
    move-object v3, v13

    goto/16 :goto_26

    :cond_12
    if-eqz v17, :cond_13

    .line 14
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    add-int/lit8 v11, v11, -0x1

    :cond_13
    if-eqz v12, :cond_14

    .line 15
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    add-int/lit8 v11, v11, -0x4

    :cond_14
    if-eqz v20, :cond_15

    .line 16
    invoke-static {v2, v11}, Lcom/google/android/gms/internal/ads/zzaim;->zze(Lcom/google/android/gms/internal/ads/zzer;I)I

    move-result v11

    :cond_15
    const/16 v8, 0x54

    const/16 v12, 0x58

    move/from16 p4, v15

    const/4 v15, 0x2

    if-ne v4, v8, :cond_18

    if-ne v5, v12, :cond_18

    if-ne v6, v12, :cond_18

    if-eq v1, v15, :cond_16

    if-ne v9, v12, :cond_18

    :cond_16
    if-gtz v11, :cond_17

    :goto_c
    move/from16 v20, v4

    move-object/from16 v22, v13

    move-object/from16 v3, v16

    goto/16 :goto_22

    .line 17
    :cond_17
    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v0

    add-int/lit8 v3, v11, -0x1

    new-array v8, v3, [B

    .line 18
    invoke-virtual {v2, v8, v7, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 19
    invoke-static {v8, v7, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v3

    new-instance v10, Ljava/lang/String;

    .line 20
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    move-result-object v12

    invoke-direct {v10, v8, v7, v3, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v7

    add-int/2addr v3, v7

    .line 21
    invoke-static {v8, v0, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzd([BII)Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzais;

    const-string v7, "TXXX"

    .line 22
    invoke-direct {v3, v7, v10, v0}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    :goto_d
    move/from16 v20, v4

    :goto_e
    move-object/from16 v22, v13

    goto/16 :goto_22

    :catchall_0
    move-exception v0

    goto/16 :goto_23

    :catch_0
    move-exception v0

    :goto_f
    move/from16 v20, v4

    move-object/from16 v22, v13

    goto/16 :goto_24

    :catch_1
    move-exception v0

    goto :goto_f

    :cond_18
    if-ne v4, v8, :cond_1a

    .line 23
    invoke-static {v1, v8, v5, v6, v9}, Lcom/google/android/gms/internal/ads/zzaim;->zzg(IIIII)Ljava/lang/String;

    move-result-object v0

    if-gtz v11, :cond_19

    goto :goto_c

    .line 24
    :cond_19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v3

    add-int/lit8 v8, v11, -0x1

    new-array v10, v8, [B

    .line 25
    invoke-virtual {v2, v10, v7, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 26
    invoke-static {v10, v3, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzd([BII)Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v3

    new-instance v7, Lcom/google/android/gms/internal/ads/zzais;

    move-object/from16 v8, v16

    .line 27
    invoke-direct {v7, v0, v8, v3}, Lcom/google/android/gms/internal/ads/zzais;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move/from16 v20, v4

    move-object v3, v7

    goto :goto_e

    :cond_1a
    const/16 v8, 0x57

    if-ne v4, v8, :cond_1e

    if-ne v5, v12, :cond_1b

    if-ne v6, v12, :cond_1b

    if-eq v1, v15, :cond_1c

    if-ne v9, v12, :cond_1b

    goto :goto_10

    :cond_1b
    move v12, v8

    goto :goto_12

    :cond_1c
    :goto_10
    if-gtz v11, :cond_1d

    move/from16 v20, v4

    move-object/from16 v22, v13

    :goto_11
    const/4 v3, 0x0

    goto/16 :goto_22

    .line 28
    :cond_1d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v0

    add-int/lit8 v3, v11, -0x1

    new-array v8, v3, [B

    .line 29
    invoke-virtual {v2, v8, v7, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 30
    invoke-static {v8, v7, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v3

    new-instance v10, Ljava/lang/String;

    .line 31
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    move-result-object v12

    invoke-direct {v10, v8, v7, v3, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v0

    add-int/2addr v3, v0

    .line 32
    invoke-static {v8, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v0

    .line 33
    sget-object v7, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-static {v8, v3, v0, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzl([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzait;

    const-string v7, "WXXX"

    invoke-direct {v3, v7, v10, v0}, Lcom/google/android/gms/internal/ads/zzait;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :cond_1e
    move v12, v4

    :goto_12
    if-ne v12, v8, :cond_1f

    .line 34
    invoke-static {v1, v8, v5, v6, v9}, Lcom/google/android/gms/internal/ads/zzaim;->zzg(IIIII)Ljava/lang/String;

    move-result-object v0

    .line 35
    new-array v3, v11, [B

    .line 36
    invoke-virtual {v2, v3, v7, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 37
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v8

    new-instance v10, Ljava/lang/String;

    .line 38
    sget-object v12, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v10, v3, v7, v8, v12}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/zzait;

    const/4 v8, 0x0

    invoke-direct {v3, v0, v8, v10}, Lcom/google/android/gms/internal/ads/zzait;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_d

    :cond_1f
    const/16 v8, 0x49

    const/16 v10, 0x50

    if-ne v12, v10, :cond_21

    const/16 v12, 0x52

    if-ne v5, v12, :cond_20

    if-ne v6, v8, :cond_20

    const/16 v12, 0x56

    if-ne v9, v12, :cond_20

    .line 39
    new-array v0, v11, [B

    .line 40
    invoke-virtual {v2, v0, v7, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 41
    invoke-static {v0, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v3

    new-instance v8, Ljava/lang/String;

    .line 42
    sget-object v10, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v8, v0, v7, v3, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v3, v3, 0x1

    .line 43
    invoke-static {v0, v3, v11}, Lcom/google/android/gms/internal/ads/zzaim;->zzk([BII)[B

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzair;

    invoke-direct {v3, v8, v0}, Lcom/google/android/gms/internal/ads/zzair;-><init>(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_d

    :cond_20
    move v12, v10

    :cond_21
    const/16 v8, 0x4f

    const/16 v10, 0x47

    if-ne v12, v10, :cond_23

    const/16 v12, 0x45

    if-ne v5, v12, :cond_25

    if-ne v6, v8, :cond_25

    const/16 v12, 0x42

    if-eq v9, v12, :cond_24

    if-ne v1, v15, :cond_22

    goto :goto_13

    :cond_22
    move v12, v10

    :cond_23
    move-object/from16 v22, v13

    goto :goto_16

    .line 44
    :cond_24
    :goto_13
    :try_start_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v0

    .line 45
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    move-result-object v3

    add-int/lit8 v8, v11, -0x1

    .line 46
    new-array v10, v8, [B

    .line 47
    invoke-virtual {v2, v10, v7, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 48
    invoke-static {v10, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v12

    new-instance v15, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v22, v13

    .line 49
    :try_start_2
    sget-object v13, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v15, v10, v7, v12, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 50
    invoke-static {v15}, Lcom/google/android/gms/internal/ads/zzas;->zzh(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v12, v12, 0x1

    .line 51
    invoke-static {v10, v12, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v13

    invoke-static {v10, v12, v13, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzl([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v15

    add-int/2addr v13, v15

    .line 52
    invoke-static {v10, v13, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v15

    invoke-static {v10, v13, v15, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzl([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v0

    add-int/2addr v15, v0

    .line 53
    invoke-static {v10, v15, v8}, Lcom/google/android/gms/internal/ads/zzaim;->zzk([BII)[B

    move-result-object v0

    new-instance v8, Lcom/google/android/gms/internal/ads/zzaii;

    invoke-direct {v8, v7, v12, v3, v0}, Lcom/google/android/gms/internal/ads/zzaii;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    move/from16 v20, v4

    move-object v3, v8

    goto/16 :goto_22

    :catch_2
    move-exception v0

    :goto_14
    move/from16 v20, v4

    goto/16 :goto_24

    :catch_3
    move-exception v0

    goto :goto_14

    :catch_4
    move-exception v0

    :goto_15
    move-object/from16 v22, v13

    goto :goto_14

    :catch_5
    move-exception v0

    goto :goto_15

    :cond_25
    move-object/from16 v22, v13

    move v12, v10

    :goto_16
    const/16 v10, 0x41

    const/16 v13, 0x43

    if-ne v1, v15, :cond_27

    const/16 v8, 0x50

    if-ne v12, v8, :cond_26

    const/16 v15, 0x49

    if-ne v5, v15, :cond_26

    if-ne v6, v13, :cond_26

    goto :goto_17

    :cond_26
    move/from16 v20, v4

    goto/16 :goto_1a

    :cond_27
    const/16 v8, 0x50

    const/16 v15, 0x49

    if-ne v12, v10, :cond_26

    if-ne v5, v8, :cond_26

    if-ne v6, v15, :cond_26

    if-ne v9, v13, :cond_26

    :goto_17
    const-string v0, "image/"

    .line 54
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v3

    .line 55
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    move-result-object v8

    add-int/lit8 v10, v11, -0x1

    .line 56
    new-array v12, v10, [B

    .line 57
    invoke-virtual {v2, v12, v7, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    const/4 v13, 0x2

    if-ne v1, v13, :cond_29

    new-instance v13, Ljava/lang/String;

    .line 58
    sget-object v15, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v20, v4

    const/4 v4, 0x3

    :try_start_3
    invoke-direct {v13, v12, v7, v4, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzgql;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "image/jpg"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    const-string v0, "image/jpeg"

    :cond_28
    const/4 v4, 0x2

    goto :goto_18

    :catch_6
    move-exception v0

    goto/16 :goto_24

    :catch_7
    move-exception v0

    goto/16 :goto_24

    :cond_29
    move/from16 v20, v4

    .line 59
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v4

    new-instance v13, Ljava/lang/String;

    .line 60
    sget-object v15, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v13, v12, v7, v4, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 61
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzgql;->zza(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v13, 0x2f

    .line 62
    invoke-virtual {v7, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    const/4 v15, -0x1

    if-ne v13, v15, :cond_2a

    .line 63
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_18

    :cond_2a
    move-object v0, v7

    :goto_18
    add-int/lit8 v7, v4, 0x1

    .line 64
    aget-byte v7, v12, v7

    and-int/lit16 v7, v7, 0xff

    const/16 v24, 0x2

    add-int/lit8 v4, v4, 0x2

    .line 65
    invoke-static {v12, v4, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v13

    new-instance v15, Ljava/lang/String;

    move/from16 p2, v3

    sub-int v3, v13, v4

    invoke-direct {v15, v12, v4, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v3

    add-int/2addr v13, v3

    .line 66
    invoke-static {v12, v13, v10}, Lcom/google/android/gms/internal/ads/zzaim;->zzk([BII)[B

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzaid;

    invoke-direct {v4, v0, v15, v7, v3}, Lcom/google/android/gms/internal/ads/zzaid;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    :goto_19
    move-object v3, v4

    goto/16 :goto_22

    :goto_1a
    const/16 v4, 0x4d

    if-ne v12, v13, :cond_2d

    const/16 v8, 0x4f

    if-ne v5, v8, :cond_2d

    if-ne v6, v4, :cond_2d

    if-eq v9, v4, :cond_2b

    const/4 v8, 0x2

    if-ne v1, v8, :cond_2d

    :cond_2b
    const/4 v0, 0x4

    if-ge v11, v0, :cond_2c

    goto/16 :goto_11

    .line 67
    :cond_2c
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v0

    .line 68
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    move-result-object v3

    const/4 v4, 0x3

    new-array v8, v4, [B

    .line 69
    invoke-virtual {v2, v8, v7, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    new-instance v10, Ljava/lang/String;

    invoke-direct {v10, v8, v7, v4}, Ljava/lang/String;-><init>([BII)V

    add-int/lit8 v4, v11, -0x4

    new-array v8, v4, [B

    .line 70
    invoke-virtual {v2, v8, v7, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 71
    invoke-static {v8, v7, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v4

    new-instance v12, Ljava/lang/String;

    invoke-direct {v12, v8, v7, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    move-result v7

    add-int/2addr v4, v7

    .line 72
    invoke-static {v8, v4, v0}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    move-result v0

    invoke-static {v8, v4, v0, v3}, Lcom/google/android/gms/internal/ads/zzaim;->zzl([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzaih;

    invoke-direct {v3, v10, v12, v0}, Lcom/google/android/gms/internal/ads/zzaih;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_22

    :cond_2d
    if-ne v12, v13, :cond_32

    const/16 v8, 0x48

    if-ne v5, v8, :cond_32

    if-ne v6, v10, :cond_32

    const/16 v8, 0x50

    if-ne v9, v8, :cond_32

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v8

    .line 73
    invoke-static {v8, v4}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v8

    new-instance v10, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v12

    sub-int v13, v8, v4

    .line 74
    sget-object v15, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v10, v12, v4, v13, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v8, v8, 0x1

    .line 75
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 76
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    move-result v25

    .line 77
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    move-result v26

    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v12

    const-wide v17, 0xffffffffL

    cmp-long v8, v12, v17

    if-nez v8, :cond_2e

    const-wide/16 v12, -0x1

    :cond_2e
    move-wide/from16 v27, v12

    .line 79
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v12

    const-wide v17, 0xffffffffL

    cmp-long v8, v12, v17

    if-nez v8, :cond_2f

    const-wide/16 v12, -0x1

    :cond_2f
    move-wide/from16 v29, v12

    new-instance v8, Ljava/util/ArrayList;

    .line 80
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    add-int/2addr v4, v11

    :cond_30
    :goto_1b
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v12

    if-ge v12, v4, :cond_31

    const/4 v12, 0x0

    .line 81
    invoke-static {v1, v2, v0, v3, v12}, Lcom/google/android/gms/internal/ads/zzaim;->zzc(ILcom/google/android/gms/internal/ads/zzer;ZILcom/google/android/gms/internal/ads/zzaij;)Lcom/google/android/gms/internal/ads/zzain;

    move-result-object v13

    if-eqz v13, :cond_30

    .line 82
    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :cond_31
    new-array v0, v7, [Lcom/google/android/gms/internal/ads/zzain;

    .line 83
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v31, v0

    check-cast v31, [Lcom/google/android/gms/internal/ads/zzain;

    new-instance v23, Lcom/google/android/gms/internal/ads/zzaif;

    move-object/from16 v24, v10

    invoke-direct/range {v23 .. v31}, Lcom/google/android/gms/internal/ads/zzaif;-><init>(Ljava/lang/String;IIJJ[Lcom/google/android/gms/internal/ads/zzain;)V

    :goto_1c
    move-object/from16 v3, v23

    goto/16 :goto_22

    :cond_32
    if-ne v12, v13, :cond_38

    const/16 v8, 0x54

    if-ne v5, v8, :cond_38

    const/16 v8, 0x4f

    if-ne v6, v8, :cond_38

    if-ne v9, v13, :cond_38

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v8

    .line 84
    invoke-static {v8, v4}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v8

    new-instance v10, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v12

    sub-int v13, v8, v4

    .line 85
    sget-object v15, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v10, v12, v4, v13, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v8, v8, 0x1

    .line 86
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 87
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v8

    and-int/lit8 v12, v8, 0x2

    if-eqz v12, :cond_33

    move/from16 v25, p4

    goto :goto_1d

    :cond_33
    move/from16 v25, v7

    :goto_1d
    and-int/lit8 v8, v8, 0x1

    .line 88
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v12

    new-array v13, v12, [Ljava/lang/String;

    move v15, v7

    :goto_1e
    if-ge v15, v12, :cond_34

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v7

    move/from16 v17, v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    .line 89
    invoke-static {v4, v7}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    move-result v4

    move/from16 v19, v4

    new-instance v4, Ljava/lang/String;

    move-object/from16 v24, v10

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v10

    move/from16 v21, v12

    sub-int v12, v19, v7

    move-object/from16 v27, v13

    sget-object v13, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v4, v10, v7, v12, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 90
    aput-object v4, v27, v15

    add-int/lit8 v4, v19, 0x1

    .line 91
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v17

    move/from16 v12, v21

    move-object/from16 v10, v24

    move-object/from16 v13, v27

    const/4 v7, 0x0

    goto :goto_1e

    :cond_34
    move/from16 v17, v4

    move-object/from16 v24, v10

    move-object/from16 v27, v13

    new-instance v4, Ljava/util/ArrayList;

    .line 92
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    add-int v7, v17, v11

    :cond_35
    :goto_1f
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v10

    if-ge v10, v7, :cond_36

    const/4 v12, 0x0

    .line 93
    invoke-static {v1, v2, v0, v3, v12}, Lcom/google/android/gms/internal/ads/zzaim;->zzc(ILcom/google/android/gms/internal/ads/zzer;ZILcom/google/android/gms/internal/ads/zzaij;)Lcom/google/android/gms/internal/ads/zzain;

    move-result-object v10

    if-eqz v10, :cond_35

    .line 94
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_36
    const/4 v0, 0x0

    new-array v3, v0, [Lcom/google/android/gms/internal/ads/zzain;

    .line 95
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, [Lcom/google/android/gms/internal/ads/zzain;

    new-instance v23, Lcom/google/android/gms/internal/ads/zzaig;

    move/from16 v0, p4

    if-eq v0, v8, :cond_37

    const/16 v26, 0x0

    goto :goto_20

    :cond_37
    move/from16 v26, v0

    :goto_20
    invoke-direct/range {v23 .. v28}, Lcom/google/android/gms/internal/ads/zzaig;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lcom/google/android/gms/internal/ads/zzain;)V

    goto/16 :goto_1c

    :cond_38
    if-ne v12, v4, :cond_3a

    const/16 v0, 0x4c

    if-ne v5, v0, :cond_3a

    const/16 v0, 0x4c

    if-ne v6, v0, :cond_3a

    const/16 v8, 0x54

    if-ne v9, v8, :cond_3a

    .line 96
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    move-result v24

    .line 97
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    move-result v25

    .line 98
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzx()I

    move-result v26

    .line 99
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v0

    .line 100
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    move-result v3

    new-instance v4, Lcom/google/android/gms/internal/ads/zzeq;

    .line 101
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzeq;-><init>()V

    .line 102
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzeq;->zza(Lcom/google/android/gms/internal/ads/zzer;)V

    add-int/lit8 v7, v11, -0xa

    mul-int/lit8 v7, v7, 0x8

    add-int v8, v0, v3

    .line 103
    div-int/2addr v7, v8

    .line 104
    new-array v8, v7, [I

    .line 105
    new-array v10, v7, [I

    const/4 v12, 0x0

    :goto_21
    if-ge v12, v7, :cond_39

    .line 106
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    move-result v13

    .line 107
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzeq;->zzj(I)I

    move-result v15

    .line 108
    aput v13, v8, v12

    .line 109
    aput v15, v10, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_21

    :cond_39
    new-instance v23, Lcom/google/android/gms/internal/ads/zzaiq;

    move-object/from16 v27, v8

    move-object/from16 v28, v10

    invoke-direct/range {v23 .. v28}, Lcom/google/android/gms/internal/ads/zzaiq;-><init>(III[I[I)V

    goto/16 :goto_1c

    .line 110
    :cond_3a
    invoke-static {v1, v12, v5, v6, v9}, Lcom/google/android/gms/internal/ads/zzaim;->zzg(IIIII)Ljava/lang/String;

    move-result-object v0

    .line 111
    new-array v3, v11, [B

    const/4 v4, 0x0

    .line 112
    invoke-virtual {v2, v3, v4, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzaie;

    invoke-direct {v4, v0, v3}, Lcom/google/android/gms/internal/ads/zzaie;-><init>(Ljava/lang/String;[B)V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_19

    .line 113
    :goto_22
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    move-object v13, v3

    const/4 v0, 0x0

    goto :goto_25

    :goto_23
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 114
    throw v0

    .line 115
    :goto_24
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    const/4 v13, 0x0

    :goto_25
    if-nez v13, :cond_3b

    move/from16 v2, v20

    .line 116
    invoke-static {v1, v2, v5, v6, v9}, Lcom/google/android/gms/internal/ads/zzaim;->zzg(IIIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x27

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Failed to decode frame: id="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frameSize="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v22

    .line 117
    invoke-static {v3, v1, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3b
    return-object v13

    .line 118
    :goto_26
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    .line 119
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    const/16 v16, 0x0

    return-object v16

    .line 121
    :cond_3c
    invoke-virtual {v2, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    return-object v16
.end method

.method private static zzd([BII)Lcom/google/android/gms/internal/ads/zzguf;
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget v0, Lcom/google/android/gms/internal/ads/zzguf;->zzd:I

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/ads/zzguc;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzguc;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p2, p1}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_0
    if-ge p2, v2, :cond_1

    .line 23
    .line 24
    new-instance v3, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzaim;->zzf(I)Ljava/nio/charset/Charset;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    sub-int v5, v2, p2

    .line 31
    .line 32
    invoke-direct {v3, p0, p2, v5, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzguc;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzaim;->zzj(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    add-int/2addr p2, v2

    .line 43
    invoke-static {p0, p2, p1}, Lcom/google/android/gms/internal/ads/zzaim;->zzh([BII)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzguc;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :cond_2
    return-object p0
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzer;I)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    move v1, p0

    .line 10
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 11
    .line 12
    add-int v3, p0, p1

    .line 13
    .line 14
    if-ge v2, v3, :cond_1

    .line 15
    .line 16
    aget-byte v3, v0, v1

    .line 17
    .line 18
    const/16 v4, 0xff

    .line 19
    .line 20
    and-int/2addr v3, v4

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    aget-byte v3, v0, v2

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    sub-int v3, v1, p0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    sub-int v3, p1, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, -0x2

    .line 34
    .line 35
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 p1, p1, -0x1

    .line 39
    .line 40
    :cond_0
    move v1, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return p1
.end method

.method private static zzf(I)Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 20
    .line 21
    return-object p0
.end method

.method private static zzg(IIIII)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "%c%c%c"

    .line 23
    .line 24
    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "%c%c%c%c"

    .line 52
    .line 53
    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method private static zzh([BII)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p2, v1, :cond_3

    .line 9
    .line 10
    :goto_0
    array-length p2, p0

    .line 11
    add-int/lit8 v1, p2, -0x1

    .line 12
    .line 13
    if-ge v0, v1, :cond_2

    .line 14
    .line 15
    add-int/lit8 p2, v0, 0x1

    .line 16
    .line 17
    sub-int v1, v0, p1

    .line 18
    .line 19
    rem-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    aget-byte v1, p0, p2

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    return v0

    .line 29
    :cond_1
    :goto_1
    invoke-static {p0, p2}, Lcom/google/android/gms/internal/ads/zzaim;->zzi([BI)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return p2

    .line 35
    :cond_3
    return v0
.end method

.method private static zzi([BI)I
    .locals 1

    .line 1
    :goto_0
    array-length v0, p0

    .line 2
    if-ge p1, v0, :cond_1

    .line 3
    .line 4
    aget-byte v0, p0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    return v0
.end method

.method private static zzj(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static zzk([BII)[B
    .locals 0

    .line 1
    if-gt p2, p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfj;->zzb:[B

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static zzl([BIILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    if-le p2, p1, :cond_1

    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, p1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method
