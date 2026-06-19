.class public final Lcom/google/android/gms/internal/ads/zzeti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfax;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcdu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzevl;Lcom/google/android/gms/internal/ads/zzfjk;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcdu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeti;->zza:Lcom/google/android/gms/internal/ads/zzfax;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeti;->zzb:Lcom/google/android/gms/internal/ads/zzfjk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeti;->zzd:Lcom/google/android/gms/internal/ads/zzcdu;

    return-void
.end method

.method private static final zzd(Landroid/view/WindowInsets;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/c;->g(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/c;->b(Landroid/view/RoundedCorner;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private static final zze(IF)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    int-to-float p0, p0

    .line 9
    div-float/2addr p0, p1

    .line 10
    float-to-double p0, p0

    .line 11
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    double-to-int p0, p0

    .line 16
    return p0
.end method

.method private static final zzf(Ly/c;F)Ly/c;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Ly/c;->e:Ly/c;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget v0, p0, Ly/c;->a:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    div-float/2addr v0, p1

    .line 13
    float-to-double v0, v0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    double-to-int v0, v0

    .line 19
    iget v1, p0, Ly/c;->b:I

    .line 20
    .line 21
    int-to-float v1, v1

    .line 22
    div-float/2addr v1, p1

    .line 23
    float-to-double v1, v1

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    double-to-int v1, v1

    .line 29
    iget v2, p0, Ly/c;->c:I

    .line 30
    .line 31
    int-to-float v2, v2

    .line 32
    div-float/2addr v2, p1

    .line 33
    float-to-double v2, v2

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    double-to-int v2, v2

    .line 39
    iget p0, p0, Ly/c;->d:I

    .line 40
    .line 41
    int-to-float p0, p0

    .line 42
    div-float/2addr p0, p1

    .line 43
    float-to-double p0, p0

    .line 44
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    double-to-int p0, p0

    .line 49
    invoke-static {v0, v1, v2, p0}, Ly/c;->b(IIII)Ly/c;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeti;->zza:Lcom/google/android/gms/internal/ads/zzfax;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzfax;->zza()Lj3/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzeth;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzeth;-><init>(Lcom/google/android/gms/internal/ads/zzeti;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzfbg;)Lcom/google/android/gms/internal/ads/zzetj;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzb:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 4
    .line 5
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzf:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 6
    .line 7
    iget-object v0, v3, Lcom/google/android/gms/ads/internal/client/zzr;->zzg:[Lcom/google/android/gms/ads/internal/client/zzr;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v3, Lcom/google/android/gms/ads/internal/client/zzr;->zza:Ljava/lang/String;

    .line 13
    .line 14
    iget-boolean v6, v3, Lcom/google/android/gms/ads/internal/client/zzr;->zzi:Z

    .line 15
    .line 16
    move v7, v6

    .line 17
    move-object v6, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v7, v5

    .line 20
    move v8, v7

    .line 21
    move v9, v8

    .line 22
    move v10, v9

    .line 23
    const/4 v6, 0x0

    .line 24
    :goto_0
    array-length v11, v0

    .line 25
    if-ge v8, v11, :cond_5

    .line 26
    .line 27
    aget-object v11, v0, v8

    .line 28
    .line 29
    iget-boolean v12, v11, Lcom/google/android/gms/ads/internal/client/zzr;->zzi:Z

    .line 30
    .line 31
    if-nez v12, :cond_1

    .line 32
    .line 33
    if-nez v9, :cond_1

    .line 34
    .line 35
    iget-object v6, v11, Lcom/google/android/gms/ads/internal/client/zzr;->zza:Ljava/lang/String;

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    :cond_1
    if-eqz v12, :cond_3

    .line 39
    .line 40
    if-nez v10, :cond_2

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    :cond_2
    const/4 v10, 0x1

    .line 44
    :cond_3
    if-eqz v9, :cond_4

    .line 45
    .line 46
    if-nez v10, :cond_5

    .line 47
    .line 48
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    :goto_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzg()Lcom/google/android/gms/internal/ads/zzbdz;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbdz;->zzd()Landroid/app/Activity;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    if-eqz v9, :cond_6

    .line 66
    .line 67
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbhe;->zzoV:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 68
    .line 69
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    check-cast v11, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-eqz v11, :cond_6

    .line 84
    .line 85
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v9}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-virtual {v0, v9, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget v0, v0, Landroid/content/pm/ActivityInfo;->screenOrientation:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    move v11, v0

    .line 100
    goto :goto_2

    .line 101
    :catch_0
    move-exception v0

    .line 102
    const-string v9, "AdSizeParcelSignal.Source.readOrientationFromManifest"

    .line 103
    .line 104
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-virtual {v11, v0, v9}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_6
    const/4 v11, -0x1

    .line 112
    :goto_2
    if-eqz v8, :cond_7

    .line 113
    .line 114
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    if-eqz v8, :cond_7

    .line 119
    .line 120
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzd:Lcom/google/android/gms/internal/ads/zzcdu;

    .line 121
    .line 122
    iget v12, v8, Landroid/util/DisplayMetrics;->density:F

    .line 123
    .line 124
    iget v13, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 125
    .line 126
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 127
    .line 128
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzcdu;->zzo()Lcom/google/android/gms/ads/internal/util/zzg;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    invoke-interface {v9}, Lcom/google/android/gms/ads/internal/util/zzg;->zzu()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_3

    .line 137
    :cond_7
    move v8, v5

    .line 138
    move v13, v8

    .line 139
    const/4 v9, 0x0

    .line 140
    const/4 v12, 0x0

    .line 141
    :goto_3
    sget-object v14, Lcom/google/android/gms/internal/ads/zzbhe;->zzoS:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 142
    .line 143
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    check-cast v15, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    const/16 p1, 0x0

    .line 158
    .line 159
    const/16 v0, 0x1c

    .line 160
    .line 161
    const/16 v4, 0x22

    .line 162
    .line 163
    const/16 v2, 0x1e

    .line 164
    .line 165
    const-string v5, "window"

    .line 166
    .line 167
    if-eqz v15, :cond_9

    .line 168
    .line 169
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    if-gt v15, v4, :cond_9

    .line 172
    .line 173
    if-lt v15, v0, :cond_9

    .line 174
    .line 175
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 176
    .line 177
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Landroid/view/WindowManager;

    .line 182
    .line 183
    if-eqz v0, :cond_9

    .line 184
    .line 185
    if-lt v15, v2, :cond_8

    .line 186
    .line 187
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    goto :goto_4

    .line 208
    :cond_8
    new-instance v8, Landroid/graphics/Point;

    .line 209
    .line 210
    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0, v8}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 218
    .line 219
    .line 220
    iget v13, v8, Landroid/graphics/Point;->x:I

    .line 221
    .line 222
    iget v8, v8, Landroid/graphics/Point;->y:I

    .line 223
    .line 224
    :cond_9
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    iget-object v15, v3, Lcom/google/android/gms/ads/internal/client/zzr;->zzg:[Lcom/google/android/gms/ads/internal/client/zzr;

    .line 230
    .line 231
    if-eqz v15, :cond_12

    .line 232
    .line 233
    const/4 v4, 0x0

    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    :goto_5
    array-length v2, v15

    .line 237
    const-string v10, "|"

    .line 238
    .line 239
    if-ge v4, v2, :cond_10

    .line 240
    .line 241
    aget-object v2, v15, v4

    .line 242
    .line 243
    move-object/from16 v19, v3

    .line 244
    .line 245
    iget-boolean v3, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zzi:Z

    .line 246
    .line 247
    if-eqz v3, :cond_a

    .line 248
    .line 249
    const/16 v17, 0x1

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_b

    .line 257
    .line 258
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    :cond_b
    iget v3, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zze:I

    .line 262
    .line 263
    const/4 v10, -0x1

    .line 264
    if-ne v3, v10, :cond_d

    .line 265
    .line 266
    cmpl-float v3, v12, p1

    .line 267
    .line 268
    if-eqz v3, :cond_c

    .line 269
    .line 270
    iget v3, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zzf:I

    .line 271
    .line 272
    int-to-float v3, v3

    .line 273
    div-float/2addr v3, v12

    .line 274
    float-to-int v3, v3

    .line 275
    goto :goto_6

    .line 276
    :cond_c
    move v3, v10

    .line 277
    :cond_d
    :goto_6
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v3, "x"

    .line 281
    .line 282
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    iget v3, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zzb:I

    .line 286
    .line 287
    const/4 v10, -0x2

    .line 288
    if-ne v3, v10, :cond_f

    .line 289
    .line 290
    cmpl-float v3, v12, p1

    .line 291
    .line 292
    if-eqz v3, :cond_e

    .line 293
    .line 294
    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zzr;->zzc:I

    .line 295
    .line 296
    int-to-float v2, v2

    .line 297
    div-float/2addr v2, v12

    .line 298
    float-to-int v3, v2

    .line 299
    goto :goto_7

    .line 300
    :cond_e
    move v3, v10

    .line 301
    :cond_f
    :goto_7
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 305
    .line 306
    move-object/from16 v3, v19

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_10
    move-object/from16 v19, v3

    .line 310
    .line 311
    if-eqz v17, :cond_13

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-eqz v2, :cond_11

    .line 318
    .line 319
    const/4 v2, 0x0

    .line 320
    invoke-virtual {v0, v2, v10}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_11
    const/4 v2, 0x0

    .line 325
    :goto_9
    const-string v3, "320x50"

    .line 326
    .line 327
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_12
    move-object/from16 v19, v3

    .line 332
    .line 333
    :cond_13
    :goto_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzb:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 338
    .line 339
    new-instance v3, Lcom/google/android/gms/internal/ads/zzetj;

    .line 340
    .line 341
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 342
    .line 343
    const/16 v10, 0x23

    .line 344
    .line 345
    sget-object v18, Ly/c;->e:Ly/c;

    .line 346
    .line 347
    if-lt v4, v10, :cond_20

    .line 348
    .line 349
    sget-object v10, Lcom/google/android/gms/internal/ads/zzbhe;->zzoM:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 350
    .line 351
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 352
    .line 353
    .line 354
    move-result-object v14

    .line 355
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v14

    .line 359
    check-cast v14, Ljava/lang/Boolean;

    .line 360
    .line 361
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    if-nez v14, :cond_16

    .line 366
    .line 367
    sget-object v14, Lcom/google/android/gms/internal/ads/zzbhe;->zzoN:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 368
    .line 369
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 370
    .line 371
    .line 372
    move-result-object v15

    .line 373
    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    check-cast v14, Ljava/lang/Boolean;

    .line 378
    .line 379
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 380
    .line 381
    .line 382
    move-result v14

    .line 383
    if-nez v14, :cond_16

    .line 384
    .line 385
    move-object/from16 v20, v0

    .line 386
    .line 387
    move-object/from16 v21, v3

    .line 388
    .line 389
    :cond_14
    :goto_b
    move-object/from16 v22, v6

    .line 390
    .line 391
    move/from16 v23, v7

    .line 392
    .line 393
    move-object/from16 v24, v9

    .line 394
    .line 395
    move/from16 v25, v11

    .line 396
    .line 397
    :cond_15
    :goto_c
    const/4 v0, 0x0

    .line 398
    goto/16 :goto_12

    .line 399
    .line 400
    :cond_16
    sget-object v14, Lcom/google/android/gms/internal/ads/zzbhe;->zzoQ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 401
    .line 402
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 403
    .line 404
    .line 405
    move-result-object v15

    .line 406
    invoke-virtual {v15, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v14

    .line 410
    check-cast v14, Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v14

    .line 416
    if-eqz v14, :cond_17

    .line 417
    .line 418
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 419
    .line 420
    invoke-virtual {v14, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v15

    .line 424
    check-cast v15, Landroid/view/WindowManager;

    .line 425
    .line 426
    if-nez v15, :cond_19

    .line 427
    .line 428
    :cond_17
    move-object/from16 v20, v0

    .line 429
    .line 430
    :cond_18
    move-object/from16 v21, v3

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_19
    move-object/from16 v20, v0

    .line 434
    .line 435
    const/16 v0, 0x1e

    .line 436
    .line 437
    if-lt v4, v0, :cond_18

    .line 438
    .line 439
    invoke-static {v15}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 444
    .line 445
    .line 446
    move-result-object v15

    .line 447
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    .line 448
    .line 449
    .line 450
    move-result v15

    .line 451
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->e(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 460
    .line 461
    .line 462
    move-result-object v14

    .line 463
    if-eqz v14, :cond_18

    .line 464
    .line 465
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 466
    .line 467
    .line 468
    move-result-object v14

    .line 469
    if-eqz v14, :cond_18

    .line 470
    .line 471
    move-object/from16 v21, v3

    .line 472
    .line 473
    iget v3, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 474
    .line 475
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 476
    .line 477
    if-gt v15, v3, :cond_14

    .line 478
    .line 479
    if-le v0, v14, :cond_1a

    .line 480
    .line 481
    goto :goto_b

    .line 482
    :cond_1a
    :goto_d
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 483
    .line 484
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    check-cast v3, Landroid/view/WindowManager;

    .line 489
    .line 490
    if-eqz v3, :cond_1b

    .line 491
    .line 492
    invoke-static {v3}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-static {v3}, Lcom/google/android/gms/common/api/k;->h(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 501
    .line 502
    .line 503
    move-result-object v14

    .line 504
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    check-cast v10, Ljava/lang/Boolean;

    .line 509
    .line 510
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 511
    .line 512
    .line 513
    move-result v10

    .line 514
    if-eqz v10, :cond_1c

    .line 515
    .line 516
    invoke-static {}, Lcom/google/android/gms/common/api/k;->A()I

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    invoke-static {}, Lf0/n1;->k()I

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    or-int/2addr v0, v10

    .line 525
    invoke-static {}, Lcom/google/android/gms/common/api/k;->B()I

    .line 526
    .line 527
    .line 528
    move-result v10

    .line 529
    or-int/2addr v0, v10

    .line 530
    invoke-static {}, Lcom/google/android/gms/common/api/k;->C()I

    .line 531
    .line 532
    .line 533
    move-result v10

    .line 534
    or-int/2addr v0, v10

    .line 535
    invoke-static {v3, v0}, Lcom/google/android/gms/common/api/k;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v0}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 540
    .line 541
    .line 542
    move-result-object v18

    .line 543
    :cond_1b
    move-object/from16 v22, v6

    .line 544
    .line 545
    move/from16 v23, v7

    .line 546
    .line 547
    move-object/from16 v24, v9

    .line 548
    .line 549
    move/from16 v25, v11

    .line 550
    .line 551
    :goto_e
    move-object/from16 v0, v18

    .line 552
    .line 553
    goto/16 :goto_f

    .line 554
    .line 555
    :cond_1c
    sget-object v10, Lcom/google/android/gms/internal/ads/zzbhe;->zzoN:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 556
    .line 557
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 558
    .line 559
    .line 560
    move-result-object v14

    .line 561
    invoke-virtual {v14, v10}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v10

    .line 565
    check-cast v10, Ljava/lang/Boolean;

    .line 566
    .line 567
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 568
    .line 569
    .line 570
    move-result v10

    .line 571
    if-eqz v10, :cond_1b

    .line 572
    .line 573
    invoke-static {}, Lf0/n1;->k()I

    .line 574
    .line 575
    .line 576
    move-result v10

    .line 577
    invoke-static {v3, v10}, Lcom/google/android/gms/common/api/k;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-static {v3}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    iget v10, v3, Ly/c;->d:I

    .line 586
    .line 587
    iget v14, v3, Ly/c;->c:I

    .line 588
    .line 589
    iget v15, v3, Ly/c;->b:I

    .line 590
    .line 591
    move-object/from16 v22, v6

    .line 592
    .line 593
    iget v6, v3, Ly/c;->a:I

    .line 594
    .line 595
    move-object/from16 v16, v3

    .line 596
    .line 597
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzoO:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 598
    .line 599
    move/from16 v23, v7

    .line 600
    .line 601
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 602
    .line 603
    .line 604
    move-result-object v7

    .line 605
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    check-cast v3, Ljava/lang/Boolean;

    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    if-eqz v3, :cond_1e

    .line 616
    .line 617
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    check-cast v0, Landroid/view/WindowManager;

    .line 622
    .line 623
    if-eqz v0, :cond_1e

    .line 624
    .line 625
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->h(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    const/4 v3, 0x0

    .line 634
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 635
    .line 636
    .line 637
    move-result v7

    .line 638
    move-object/from16 v24, v9

    .line 639
    .line 640
    const/4 v3, 0x1

    .line 641
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 642
    .line 643
    .line 644
    move-result v9

    .line 645
    move/from16 v25, v11

    .line 646
    .line 647
    const/4 v3, 0x3

    .line 648
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 649
    .line 650
    .line 651
    move-result v11

    .line 652
    const/4 v3, 0x2

    .line 653
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    if-lt v8, v13, :cond_1d

    .line 658
    .line 659
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    invoke-static {v10, v0}, Ljava/lang/Math;->max(II)I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    invoke-static {v6, v3, v14, v0}, Ly/c;->b(IIII)Ly/c;

    .line 676
    .line 677
    .line 678
    move-result-object v18

    .line 679
    goto/16 :goto_e

    .line 680
    .line 681
    :cond_1d
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 690
    .line 691
    .line 692
    move-result v3

    .line 693
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    invoke-static {v3, v15, v0, v10}, Ly/c;->b(IIII)Ly/c;

    .line 698
    .line 699
    .line 700
    move-result-object v18

    .line 701
    goto/16 :goto_e

    .line 702
    .line 703
    :cond_1e
    move-object/from16 v24, v9

    .line 704
    .line 705
    move/from16 v25, v11

    .line 706
    .line 707
    move-object/from16 v0, v16

    .line 708
    .line 709
    :goto_f
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzoP:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 710
    .line 711
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    check-cast v3, Ljava/lang/Boolean;

    .line 720
    .line 721
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    if-eqz v3, :cond_1f

    .line 726
    .line 727
    if-ge v8, v13, :cond_1f

    .line 728
    .line 729
    iget v3, v0, Ly/c;->a:I

    .line 730
    .line 731
    iget v6, v0, Ly/c;->c:I

    .line 732
    .line 733
    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    iget v6, v0, Ly/c;->b:I

    .line 738
    .line 739
    iget v0, v0, Ly/c;->d:I

    .line 740
    .line 741
    invoke-static {v3, v6, v3, v0}, Ly/c;->b(IIII)Ly/c;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    :cond_1f
    invoke-static {v0, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zzf(Ly/c;F)Ly/c;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    goto/16 :goto_12

    .line 750
    .line 751
    :cond_20
    move-object/from16 v20, v0

    .line 752
    .line 753
    move-object/from16 v21, v3

    .line 754
    .line 755
    move-object/from16 v22, v6

    .line 756
    .line 757
    move/from16 v23, v7

    .line 758
    .line 759
    move-object/from16 v24, v9

    .line 760
    .line 761
    move/from16 v25, v11

    .line 762
    .line 763
    const/16 v0, 0x22

    .line 764
    .line 765
    if-gt v4, v0, :cond_15

    .line 766
    .line 767
    const/16 v0, 0x1c

    .line 768
    .line 769
    if-lt v4, v0, :cond_15

    .line 770
    .line 771
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0, v14}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    check-cast v0, Ljava/lang/Boolean;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-nez v0, :cond_21

    .line 786
    .line 787
    goto/16 :goto_c

    .line 788
    .line 789
    :cond_21
    const/16 v0, 0x1e

    .line 790
    .line 791
    if-lt v4, v0, :cond_23

    .line 792
    .line 793
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 794
    .line 795
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    check-cast v0, Landroid/view/WindowManager;

    .line 800
    .line 801
    if-eqz v0, :cond_22

    .line 802
    .line 803
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-static {v0}, Lcom/google/android/gms/common/api/k;->h(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-static {}, Lcom/google/android/gms/common/api/k;->A()I

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    invoke-static {}, Lf0/n1;->k()I

    .line 816
    .line 817
    .line 818
    move-result v6

    .line 819
    or-int/2addr v3, v6

    .line 820
    invoke-static {}, Lcom/google/android/gms/common/api/k;->B()I

    .line 821
    .line 822
    .line 823
    move-result v6

    .line 824
    or-int/2addr v3, v6

    .line 825
    invoke-static {}, Lcom/google/android/gms/common/api/k;->C()I

    .line 826
    .line 827
    .line 828
    move-result v6

    .line 829
    or-int/2addr v3, v6

    .line 830
    invoke-static {v0, v3}, Lcom/google/android/gms/common/api/k;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    invoke-static {v0}, Ly/c;->c(Landroid/graphics/Insets;)Ly/c;

    .line 835
    .line 836
    .line 837
    move-result-object v18

    .line 838
    :cond_22
    :goto_10
    move-object/from16 v0, v18

    .line 839
    .line 840
    goto :goto_11

    .line 841
    :cond_23
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzg()Lcom/google/android/gms/internal/ads/zzbdz;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdz;->zzd()Landroid/app/Activity;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    if-eqz v0, :cond_22

    .line 850
    .line 851
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    if-eqz v0, :cond_22

    .line 856
    .line 857
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    if-eqz v0, :cond_22

    .line 862
    .line 863
    sget-object v3, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 864
    .line 865
    invoke-static {v0}, Lf0/l0;->a(Landroid/view/View;)Lf0/q1;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    if-eqz v0, :cond_22

    .line 870
    .line 871
    const/16 v3, 0x287

    .line 872
    .line 873
    iget-object v0, v0, Lf0/q1;->a:Lf0/m1;

    .line 874
    .line 875
    invoke-virtual {v0, v3}, Lf0/m1;->f(I)Ly/c;

    .line 876
    .line 877
    .line 878
    move-result-object v18

    .line 879
    goto :goto_10

    .line 880
    :goto_11
    invoke-static {v0, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zzf(Ly/c;F)Ly/c;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    :goto_12
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzoR:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 885
    .line 886
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    check-cast v3, Ljava/lang/Boolean;

    .line 895
    .line 896
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-eqz v3, :cond_24

    .line 901
    .line 902
    const/16 v3, 0x1f

    .line 903
    .line 904
    if-ge v4, v3, :cond_25

    .line 905
    .line 906
    :cond_24
    :goto_13
    const/4 v14, 0x0

    .line 907
    goto :goto_14

    .line 908
    :cond_25
    cmpl-float v3, v12, p1

    .line 909
    .line 910
    if-nez v3, :cond_26

    .line 911
    .line 912
    goto :goto_13

    .line 913
    :cond_26
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzeti;->zzc:Landroid/content/Context;

    .line 914
    .line 915
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    check-cast v3, Landroid/view/WindowManager;

    .line 920
    .line 921
    if-eqz v3, :cond_24

    .line 922
    .line 923
    invoke-static {v3}, Lcom/google/android/gms/common/api/k;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    invoke-static {v3}, Lcom/google/android/gms/common/api/k;->h(Landroid/view/WindowMetrics;)Landroid/view/WindowInsets;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    const/4 v4, 0x0

    .line 932
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 933
    .line 934
    .line 935
    move-result v4

    .line 936
    const/4 v5, 0x1

    .line 937
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 938
    .line 939
    .line 940
    move-result v5

    .line 941
    const/4 v6, 0x3

    .line 942
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 943
    .line 944
    .line 945
    move-result v6

    .line 946
    const/4 v7, 0x2

    .line 947
    invoke-static {v3, v7}, Lcom/google/android/gms/internal/ads/zzeti;->zzd(Landroid/view/WindowInsets;I)I

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    new-instance v7, Lcom/google/android/gms/internal/ads/zzetg;

    .line 952
    .line 953
    invoke-static {v4, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zze(IF)I

    .line 954
    .line 955
    .line 956
    move-result v4

    .line 957
    invoke-static {v5, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zze(IF)I

    .line 958
    .line 959
    .line 960
    move-result v5

    .line 961
    invoke-static {v6, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zze(IF)I

    .line 962
    .line 963
    .line 964
    move-result v6

    .line 965
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/ads/zzeti;->zze(IF)I

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    invoke-direct {v7, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzetg;-><init>(IIII)V

    .line 970
    .line 971
    .line 972
    move-object v14, v7

    .line 973
    :goto_14
    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzfjk;->zzr:Z

    .line 974
    .line 975
    move v9, v8

    .line 976
    move v7, v12

    .line 977
    move v8, v13

    .line 978
    move-object/from16 v3, v19

    .line 979
    .line 980
    move-object/from16 v6, v20

    .line 981
    .line 982
    move-object/from16 v4, v22

    .line 983
    .line 984
    move/from16 v5, v23

    .line 985
    .line 986
    move-object/from16 v10, v24

    .line 987
    .line 988
    move/from16 v11, v25

    .line 989
    .line 990
    move-object v13, v0

    .line 991
    move v12, v2

    .line 992
    move-object/from16 v2, v21

    .line 993
    .line 994
    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/zzetj;-><init>(Lcom/google/android/gms/ads/internal/client/zzr;Ljava/lang/String;ZLjava/lang/String;FIILjava/lang/String;IZLy/c;Lcom/google/android/gms/internal/ads/zzetg;)V

    .line 995
    .line 996
    .line 997
    return-object v2
.end method
