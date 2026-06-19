.class public final Lcom/google/android/gms/internal/ads/zzchu;
.super Lcom/google/android/gms/internal/ads/zzchr;
.source "SourceFile"


# static fields
.field public static final synthetic zzd:I

.field private static final zze:Ljava/util/Set;

.field private static final zzf:Ljava/text/DecimalFormat;


# instance fields
.field private zzg:Ljava/io/File;

.field private zzh:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/ads/zzchu;->zze:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v0, Ljava/text/DecimalFormat;

    .line 13
    .line 14
    const-string v1, "#,###"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/internal/ads/zzchu;->zzf:Ljava/text/DecimalFormat;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcge;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzchr;-><init>(Lcom/google/android/gms/internal/ads/zzcge;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchr;->zza:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 13
    .line 14
    const-string p1, "Context.getCacheDir() returned null"

    .line 15
    .line 16
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxm;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "admobVideoStreams"

    .line 27
    .line 28
    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzfxm;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 v0, 0x0

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 64
    .line 65
    const-string v1, "Could not create preload cache directory at "

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 88
    .line 89
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    return-void

    .line 97
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 108
    .line 109
    const-string v1, "Could not set cache file permissions at "

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 119
    .line 120
    return-void
.end method

.method private final zza(Ljava/io/File;)Ljava/io/File;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxm;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v3, ".done"

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfxm;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)Z
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v7, " sec"

    .line 6
    .line 7
    const-string v8, "Timeout exceeded. Limit: "

    .line 8
    .line 9
    const-string v0, " at "

    .line 10
    .line 11
    const-string v3, "HTTP status code "

    .line 12
    .line 13
    const-string v4, "HTTP request failed. Code: "

    .line 14
    .line 15
    const-string v9, "Preloaded "

    .line 16
    .line 17
    const-string v5, " exceeds limit at "

    .line 18
    .line 19
    const-string v6, "Content length "

    .line 20
    .line 21
    const-string v10, "Stream cache aborted, missing content-length header at "

    .line 22
    .line 23
    const-string v11, "Stream cache already in progress at "

    .line 24
    .line 25
    const-string v12, " bytes from "

    .line 26
    .line 27
    const-string v13, "Caching "

    .line 28
    .line 29
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 30
    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    if-eqz v14, :cond_1c

    .line 34
    .line 35
    :goto_0
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 36
    .line 37
    if-nez v14, :cond_0

    .line 38
    .line 39
    move/from16 v14, v16

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-virtual {v14}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v14

    .line 46
    array-length v15, v14

    .line 47
    move-object/from16 v17, v14

    .line 48
    .line 49
    move/from16 v14, v16

    .line 50
    .line 51
    move/from16 v18, v14

    .line 52
    .line 53
    :goto_1
    if-ge v14, v15, :cond_2

    .line 54
    .line 55
    aget-object v19, v17, v14

    .line 56
    .line 57
    move/from16 v20, v14

    .line 58
    .line 59
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    move/from16 v19, v15

    .line 64
    .line 65
    const-string v15, ".done"

    .line 66
    .line 67
    invoke-virtual {v14, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    if-nez v14, :cond_1

    .line 72
    .line 73
    add-int/lit8 v18, v18, 0x1

    .line 74
    .line 75
    :cond_1
    add-int/lit8 v14, v20, 0x1

    .line 76
    .line 77
    move/from16 v15, v19

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move/from16 v14, v18

    .line 81
    .line 82
    :goto_2
    sget-object v15, Lcom/google/android/gms/internal/ads/zzbhe;->zzu:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 83
    .line 84
    move-object/from16 v17, v9

    .line 85
    .line 86
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {v9, v15}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    check-cast v9, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-le v14, v9, :cond_9

    .line 101
    .line 102
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 103
    .line 104
    if-nez v9, :cond_3

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_3
    invoke-virtual {v9}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    array-length v14, v9

    .line 112
    const-wide v18, 0x7fffffffffffffffL

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    move/from16 v15, v16

    .line 118
    .line 119
    move-wide/from16 v19, v18

    .line 120
    .line 121
    move-object/from16 v18, v9

    .line 122
    .line 123
    const/4 v9, 0x0

    .line 124
    :goto_3
    if-ge v15, v14, :cond_5

    .line 125
    .line 126
    aget-object v21, v18, v15

    .line 127
    .line 128
    move/from16 v22, v14

    .line 129
    .line 130
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    move/from16 v23, v15

    .line 135
    .line 136
    const-string v15, ".done"

    .line 137
    .line 138
    invoke-virtual {v14, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    if-nez v14, :cond_4

    .line 143
    .line 144
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->lastModified()J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    cmp-long v24, v14, v19

    .line 149
    .line 150
    if-gez v24, :cond_4

    .line 151
    .line 152
    move-wide/from16 v19, v14

    .line 153
    .line 154
    move-object/from16 v9, v21

    .line 155
    .line 156
    :cond_4
    add-int/lit8 v15, v23, 0x1

    .line 157
    .line 158
    move/from16 v14, v22

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    if-eqz v9, :cond_6

    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    invoke-direct {v1, v9}, Lcom/google/android/gms/internal/ads/zzchu;->zza(Ljava/io/File;)Ljava/io/File;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 172
    .line 173
    .line 174
    move-result v15

    .line 175
    if-eqz v15, :cond_7

    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    and-int/2addr v9, v14

    .line 182
    move v14, v9

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    move/from16 v14, v16

    .line 185
    .line 186
    :cond_7
    :goto_4
    if-nez v14, :cond_8

    .line 187
    .line 188
    :goto_5
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 189
    .line 190
    const-string v0, "Unable to expire stream cache"

    .line 191
    .line 192
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v0, "expireFailed"

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    invoke-virtual {v1, v2, v3, v0, v3}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return v16

    .line 202
    :cond_8
    move-object/from16 v9, v17

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_9
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzf(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    new-instance v14, Ljava/io/File;

    .line 211
    .line 212
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxl;->zza()Lcom/google/android/gms/internal/ads/zzfxm;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    move-object/from16 v18, v7

    .line 217
    .line 218
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 219
    .line 220
    invoke-interface {v15, v7, v9}, Lcom/google/android/gms/internal/ads/zzfxm;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-direct {v14, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v1, v14}, Lcom/google/android/gms/internal/ads/zzchu;->zza(Ljava/io/File;)Ljava/io/File;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    const/4 v15, 0x1

    .line 236
    if-eqz v9, :cond_b

    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    if-nez v9, :cond_a

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_a
    invoke-virtual {v14}, Ljava/io/File;->length()J

    .line 246
    .line 247
    .line 248
    move-result-wide v3

    .line 249
    long-to-int v0, v3

    .line 250
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    sget v4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 255
    .line 256
    const-string v4, "Stream cache hit at "

    .line 257
    .line 258
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzchr;->zzo(Ljava/lang/String;Ljava/lang/String;I)V

    .line 270
    .line 271
    .line 272
    return v15

    .line 273
    :cond_b
    :goto_6
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzg:Ljava/io/File;

    .line 274
    .line 275
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v15

    .line 287
    move-object/from16 v20, v7

    .line 288
    .line 289
    sget-object v7, Lcom/google/android/gms/internal/ads/zzchu;->zze:Ljava/util/Set;

    .line 290
    .line 291
    invoke-virtual {v9, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    monitor-enter v7

    .line 296
    :try_start_0
    invoke-interface {v7, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v15

    .line 300
    if-eqz v15, :cond_c

    .line 301
    .line 302
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    add-int/lit8 v0, v0, 0x24

    .line 311
    .line 312
    new-instance v3, Ljava/lang/StringBuilder;

    .line 313
    .line 314
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 328
    .line 329
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v3, "inProgress"

    .line 337
    .line 338
    const/4 v4, 0x0

    .line 339
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    monitor-exit v7

    .line 343
    return v16

    .line 344
    :catchall_0
    move-exception v0

    .line 345
    goto/16 :goto_19

    .line 346
    .line 347
    :cond_c
    invoke-interface {v7, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 351
    const-string v11, "error"

    .line 352
    .line 353
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxx;->zza()Lcom/google/android/gms/internal/ads/zzfyj;

    .line 354
    .line 355
    .line 356
    move-result-object v15
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_11

    .line 357
    move-object/from16 v21, v11

    .line 358
    .line 359
    :try_start_2
    new-instance v11, Lcom/google/android/gms/internal/ads/zzcht;

    .line 360
    .line 361
    invoke-direct {v11, v2}, Lcom/google/android/gms/internal/ads/zzcht;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_f

    .line 362
    .line 363
    .line 364
    move-object/from16 v22, v8

    .line 365
    .line 366
    const/16 v8, 0x109

    .line 367
    .line 368
    move-object/from16 v23, v14

    .line 369
    .line 370
    const/4 v14, -0x1

    .line 371
    :try_start_3
    invoke-virtual {v15, v11, v8, v14}, Lcom/google/android/gms/internal/ads/zzfyj;->zzh(Lcom/google/android/gms/internal/ads/zzfxz;II)Ljava/net/HttpURLConnection;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    if-eqz v8, :cond_e

    .line 376
    .line 377
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    const/16 v14, 0x190

    .line 382
    .line 383
    if-ge v11, v14, :cond_d

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_d
    const-string v5, "badUrl"
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 387
    .line 388
    :try_start_4
    invoke-static {v11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 397
    .line 398
    .line 399
    move-result v7

    .line 400
    add-int/lit8 v7, v7, 0x1b

    .line 401
    .line 402
    new-instance v8, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 417
    :try_start_5
    new-instance v6, Ljava/io/IOException;

    .line 418
    .line 419
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    add-int/lit8 v7, v7, 0x15

    .line 428
    .line 429
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 434
    .line 435
    .line 436
    move-result v8

    .line 437
    add-int/2addr v7, v8

    .line 438
    new-instance v8, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v6
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 463
    :catch_0
    move-exception v0

    .line 464
    goto :goto_7

    .line 465
    :catch_1
    move-exception v0

    .line 466
    :goto_7
    move-object v11, v5

    .line 467
    move-object/from16 v13, v23

    .line 468
    .line 469
    :goto_8
    const/4 v15, 0x0

    .line 470
    goto/16 :goto_17

    .line 471
    .line 472
    :catch_2
    move-exception v0

    .line 473
    goto :goto_9

    .line 474
    :catch_3
    move-exception v0

    .line 475
    :goto_9
    move-object v11, v5

    .line 476
    move-object/from16 v13, v23

    .line 477
    .line 478
    :goto_a
    const/4 v4, 0x0

    .line 479
    goto :goto_8

    .line 480
    :catch_4
    move-exception v0

    .line 481
    :goto_b
    move-object/from16 v13, v23

    .line 482
    .line 483
    goto/16 :goto_16

    .line 484
    .line 485
    :catch_5
    move-exception v0

    .line 486
    goto :goto_b

    .line 487
    :cond_e
    :goto_c
    :try_start_6
    invoke-virtual {v8}, Ljava/net/URLConnection;->getContentLength()I

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-gez v0, :cond_f

    .line 492
    .line 493
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    add-int/lit8 v0, v0, 0x37

    .line 502
    .line 503
    new-instance v3, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 519
    .line 520
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v3, "contentLengthMissing"

    .line 528
    .line 529
    const/4 v4, 0x0

    .line 530
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v7, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    return v16

    .line 537
    :cond_f
    sget-object v10, Lcom/google/android/gms/internal/ads/zzchu;->zzf:Ljava/text/DecimalFormat;

    .line 538
    .line 539
    int-to-long v3, v0

    .line 540
    invoke-virtual {v10, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzv:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 545
    .line 546
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 547
    .line 548
    .line 549
    move-result-object v11

    .line 550
    invoke-virtual {v11, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    check-cast v4, Ljava/lang/Integer;

    .line 555
    .line 556
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 557
    .line 558
    .line 559
    move-result v11
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4

    .line 560
    const-string v14, "File too big for full file cache. Size: "

    .line 561
    .line 562
    if-le v0, v11, :cond_10

    .line 563
    .line 564
    :try_start_7
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    add-int/lit8 v0, v0, 0x21

    .line 573
    .line 574
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 579
    .line 580
    .line 581
    move-result v4

    .line 582
    add-int/2addr v0, v4

    .line 583
    new-instance v4, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    sget v4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 605
    .line 606
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    add-int/lit8 v0, v0, 0x28

    .line 618
    .line 619
    new-instance v4, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v3

    .line 638
    const-string v4, "sizeExceeded"

    .line 639
    .line 640
    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v7, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    return v16

    .line 647
    :cond_10
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    add-int/lit8 v4, v4, 0x14

    .line 656
    .line 657
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 662
    .line 663
    .line 664
    move-result v5

    .line 665
    add-int/2addr v4, v5

    .line 666
    new-instance v5, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    sget v4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 688
    .line 689
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v8}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    .line 697
    .line 698
    .line 699
    move-result-object v7

    .line 700
    new-instance v8, Ljava/io/FileOutputStream;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4

    .line 701
    .line 702
    move-object/from16 v13, v23

    .line 703
    .line 704
    :try_start_8
    invoke-direct {v8, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_d

    .line 705
    .line 706
    .line 707
    :try_start_9
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 708
    .line 709
    .line 710
    move-result-object v15

    .line 711
    const/high16 v3, 0x100000

    .line 712
    .line 713
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 718
    .line 719
    .line 720
    move-result-object v4

    .line 721
    check-cast v4, Lx2/c;

    .line 722
    .line 723
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 727
    .line 728
    .line 729
    move-result-wide v23

    .line 730
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzai:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 731
    .line 732
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 733
    .line 734
    .line 735
    move-result-object v5

    .line 736
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    check-cast v4, Ljava/lang/Long;

    .line 741
    .line 742
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 743
    .line 744
    .line 745
    move-result-wide v4

    .line 746
    new-instance v6, Lcom/google/android/gms/ads/internal/util/zzbu;

    .line 747
    .line 748
    invoke-direct {v6, v4, v5}, Lcom/google/android/gms/ads/internal/util/zzbu;-><init>(J)V

    .line 749
    .line 750
    .line 751
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzah:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 752
    .line 753
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    check-cast v4, Ljava/lang/Long;

    .line 762
    .line 763
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 764
    .line 765
    .line 766
    move-result-wide v25

    .line 767
    move/from16 v4, v16

    .line 768
    .line 769
    :goto_d
    invoke-interface {v7, v3}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 770
    .line 771
    .line 772
    move-result v5

    .line 773
    if-ltz v5, :cond_16

    .line 774
    .line 775
    add-int/2addr v4, v5

    .line 776
    if-gt v4, v11, :cond_15

    .line 777
    .line 778
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 779
    .line 780
    .line 781
    :cond_11
    invoke-virtual {v15, v3}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 782
    .line 783
    .line 784
    move-result v5

    .line 785
    if-gtz v5, :cond_11

    .line 786
    .line 787
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 788
    .line 789
    .line 790
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 791
    .line 792
    .line 793
    move-result-wide v27

    .line 794
    sub-long v27, v27, v23

    .line 795
    .line 796
    const-wide/16 v29, 0x3e8

    .line 797
    .line 798
    mul-long v29, v29, v25

    .line 799
    .line 800
    cmp-long v5, v27, v29

    .line 801
    .line 802
    if-gtz v5, :cond_14

    .line 803
    .line 804
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzh:Z

    .line 805
    .line 806
    if-nez v5, :cond_13

    .line 807
    .line 808
    invoke-virtual {v6}, Lcom/google/android/gms/ads/internal/util/zzbu;->zza()Z

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    if-eqz v5, :cond_12

    .line 813
    .line 814
    move-object v5, v3

    .line 815
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    move-object/from16 v27, v6

    .line 820
    .line 821
    sget-object v6, Lcom/google/android/gms/ads/internal/util/client/zzf;->zza:Landroid/os/Handler;

    .line 822
    .line 823
    move-object/from16 v28, v5

    .line 824
    .line 825
    move v5, v0

    .line 826
    new-instance v0, Lcom/google/android/gms/internal/ads/zzchl;

    .line 827
    .line 828
    move-object/from16 v29, v6

    .line 829
    .line 830
    const/4 v6, 0x0

    .line 831
    move-object/from16 v31, v29

    .line 832
    .line 833
    move-object/from16 v29, v7

    .line 834
    .line 835
    move-object/from16 v7, v31

    .line 836
    .line 837
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzchl;-><init>(Lcom/google/android/gms/internal/ads/zzchr;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 841
    .line 842
    .line 843
    goto :goto_e

    .line 844
    :catch_6
    move-exception v0

    .line 845
    goto/16 :goto_13

    .line 846
    .line 847
    :catch_7
    move-exception v0

    .line 848
    goto/16 :goto_13

    .line 849
    .line 850
    :cond_12
    move v5, v0

    .line 851
    move-object/from16 v28, v3

    .line 852
    .line 853
    move-object/from16 v27, v6

    .line 854
    .line 855
    move-object/from16 v29, v7

    .line 856
    .line 857
    :goto_e
    move v0, v5

    .line 858
    move-object/from16 v6, v27

    .line 859
    .line 860
    move-object/from16 v3, v28

    .line 861
    .line 862
    move-object/from16 v7, v29

    .line 863
    .line 864
    goto :goto_d

    .line 865
    :cond_13
    const-string v11, "externalAbort"
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_6

    .line 866
    .line 867
    :try_start_a
    new-instance v0, Ljava/io/IOException;

    .line 868
    .line 869
    const-string v3, "abort requested"

    .line 870
    .line 871
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_8

    .line 875
    :catch_8
    move-exception v0

    .line 876
    goto :goto_f

    .line 877
    :catch_9
    move-exception v0

    .line 878
    :goto_f
    move-object v15, v8

    .line 879
    :goto_10
    const/4 v4, 0x0

    .line 880
    goto/16 :goto_17

    .line 881
    .line 882
    :cond_14
    :try_start_b
    const-string v11, "downloadTimeout"
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_6

    .line 883
    .line 884
    :try_start_c
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    add-int/lit8 v3, v3, 0x1d

    .line 897
    .line 898
    new-instance v4, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 901
    .line 902
    .line 903
    move-object/from16 v3, v22

    .line 904
    .line 905
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    move-object/from16 v0, v18

    .line 912
    .line 913
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v15
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_8

    .line 920
    :try_start_d
    new-instance v0, Ljava/io/IOException;

    .line 921
    .line 922
    const-string v3, "stream cache time limit exceeded"

    .line 923
    .line 924
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_a

    .line 928
    :catch_a
    move-exception v0

    .line 929
    goto :goto_11

    .line 930
    :catch_b
    move-exception v0

    .line 931
    :goto_11
    move-object v4, v15

    .line 932
    move-object v15, v8

    .line 933
    goto/16 :goto_17

    .line 934
    .line 935
    :cond_15
    :try_start_e
    const-string v11, "sizeExceeded"
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_6

    .line 936
    .line 937
    :try_start_f
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    add-int/lit8 v3, v3, 0x28

    .line 950
    .line 951
    new-instance v4, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 960
    .line 961
    .line 962
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v15
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_8

    .line 966
    :try_start_10
    new-instance v0, Ljava/io/IOException;

    .line 967
    .line 968
    const-string v3, "stream cache file size limit exceeded"

    .line 969
    .line 970
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    throw v0
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_a

    .line 974
    :cond_16
    :try_start_11
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V

    .line 975
    .line 976
    .line 977
    const/4 v0, 0x3

    .line 978
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzm(I)Z

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    if-eqz v0, :cond_17

    .line 983
    .line 984
    int-to-long v5, v4

    .line 985
    invoke-virtual {v10, v5, v6}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v3

    .line 993
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    add-int/lit8 v3, v3, 0x16

    .line 998
    .line 999
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1004
    .line 1005
    .line 1006
    move-result v5

    .line 1007
    add-int/2addr v3, v5

    .line 1008
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1011
    .line 1012
    .line 1013
    move-object/from16 v3, v17

    .line 1014
    .line 1015
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    :cond_17
    move/from16 v3, v16

    .line 1035
    .line 1036
    const/4 v0, 0x1

    .line 1037
    invoke-virtual {v13, v0, v3}, Ljava/io/File;->setReadable(ZZ)Z

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->isFile()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_18

    .line 1045
    .line 1046
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v5

    .line 1050
    move-object/from16 v0, v20

    .line 1051
    .line 1052
    invoke-virtual {v0, v5, v6}, Ljava/io/File;->setLastModified(J)Z
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_6

    .line 1053
    .line 1054
    .line 1055
    goto :goto_12

    .line 1056
    :cond_18
    move-object/from16 v0, v20

    .line 1057
    .line 1058
    :try_start_12
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_6

    .line 1059
    .line 1060
    .line 1061
    :catch_c
    :goto_12
    :try_start_13
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    invoke-virtual {v1, v2, v0, v4}, Lcom/google/android/gms/internal/ads/zzchr;->zzo(Ljava/lang/String;Ljava/lang/String;I)V

    .line 1066
    .line 1067
    .line 1068
    sget-object v0, Lcom/google/android/gms/internal/ads/zzchu;->zze:Ljava/util/Set;

    .line 1069
    .line 1070
    invoke-interface {v0, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_6

    .line 1071
    .line 1072
    .line 1073
    const/16 v19, 0x1

    .line 1074
    .line 1075
    return v19

    .line 1076
    :goto_13
    move-object v15, v8

    .line 1077
    move-object/from16 v11, v21

    .line 1078
    .line 1079
    goto/16 :goto_10

    .line 1080
    .line 1081
    :catch_d
    move-exception v0

    .line 1082
    goto :goto_16

    .line 1083
    :catch_e
    move-exception v0

    .line 1084
    goto :goto_16

    .line 1085
    :catch_f
    move-exception v0

    .line 1086
    :goto_14
    move-object v13, v14

    .line 1087
    goto :goto_16

    .line 1088
    :catch_10
    move-exception v0

    .line 1089
    goto :goto_14

    .line 1090
    :catch_11
    move-exception v0

    .line 1091
    :goto_15
    move-object/from16 v21, v11

    .line 1092
    .line 1093
    goto :goto_14

    .line 1094
    :catch_12
    move-exception v0

    .line 1095
    goto :goto_15

    .line 1096
    :goto_16
    move-object/from16 v11, v21

    .line 1097
    .line 1098
    goto/16 :goto_a

    .line 1099
    .line 1100
    :goto_17
    instance-of v3, v0, Ljava/lang/RuntimeException;

    .line 1101
    .line 1102
    if-eqz v3, :cond_19

    .line 1103
    .line 1104
    const-string v3, "VideoStreamFullFileCache.preload"

    .line 1105
    .line 1106
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    invoke-virtual {v5, v0, v3}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    :cond_19
    :try_start_14
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_13
    .catch Ljava/lang/NullPointerException; {:try_start_14 .. :try_end_14} :catch_13

    .line 1114
    .line 1115
    .line 1116
    :catch_13
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzchu;->zzh:Z

    .line 1117
    .line 1118
    const-string v5, "\""

    .line 1119
    .line 1120
    if-eqz v3, :cond_1a

    .line 1121
    .line 1122
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    add-int/lit8 v0, v0, 0x1a

    .line 1133
    .line 1134
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1135
    .line 1136
    .line 1137
    const-string v0, "Preload aborted for URL \""

    .line 1138
    .line 1139
    invoke-static {v3, v0, v2, v5}, Landroidx/fragment/app/h1;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 1144
    .line 1145
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzh(Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    goto :goto_18

    .line 1149
    :cond_1a
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1154
    .line 1155
    .line 1156
    move-result v3

    .line 1157
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1158
    .line 1159
    add-int/lit8 v3, v3, 0x19

    .line 1160
    .line 1161
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1162
    .line 1163
    .line 1164
    const-string v3, "Preload failed for URL \""

    .line 1165
    .line 1166
    invoke-static {v6, v3, v2, v5}, Landroidx/fragment/app/h1;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    sget v5, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 1171
    .line 1172
    invoke-static {v3, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1173
    .line 1174
    .line 1175
    :goto_18
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v0

    .line 1179
    if-eqz v0, :cond_1b

    .line 1180
    .line 1181
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 1182
    .line 1183
    .line 1184
    move-result v0

    .line 1185
    if-nez v0, :cond_1b

    .line 1186
    .line 1187
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    const-string v3, "Could not delete partial cache file at "

    .line 1196
    .line 1197
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 1202
    .line 1203
    .line 1204
    :cond_1b
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    invoke-virtual {v1, v2, v0, v11, v4}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1209
    .line 1210
    .line 1211
    sget-object v0, Lcom/google/android/gms/internal/ads/zzchu;->zze:Ljava/util/Set;

    .line 1212
    .line 1213
    invoke-interface {v0, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    const/16 v16, 0x0

    .line 1217
    .line 1218
    return v16

    .line 1219
    :goto_19
    :try_start_15
    monitor-exit v7
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 1220
    throw v0

    .line 1221
    :cond_1c
    const-string v0, "noCacheDir"

    .line 1222
    .line 1223
    const/4 v4, 0x0

    .line 1224
    invoke-virtual {v1, v2, v4, v0, v4}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    const/16 v16, 0x0

    .line 1228
    .line 1229
    return v16
.end method

.method public final zzl()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzchu;->zzh:Z

    return-void
.end method
