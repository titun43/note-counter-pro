.class public final Lcom/google/android/gms/internal/ads/zzapm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfg;

.field private final zzb:Landroid/util/SparseArray;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzapj;

.field private zze:Z

.field private zzf:Z

.field private zzg:Z

.field private zzh:J

.field private zzi:Lcom/google/android/gms/internal/ads/zzapi;

.field private zzj:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzk:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfg;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfg;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zza:Lcom/google/android/gms/internal/ads/zzfg;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzc:Lcom/google/android/gms/internal/ads/zzer;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzb:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapj;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzapj;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzd:Lcom/google/android/gms/internal/ads/zzapj;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzael;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0, v2}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 9
    .line 10
    .line 11
    aget-byte v0, v1, v2

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0xff

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    aget-byte v6, v1, v5

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    const/4 v7, 0x3

    .line 26
    aget-byte v8, v1, v7

    .line 27
    .line 28
    and-int/lit16 v8, v8, 0xff

    .line 29
    .line 30
    shl-int/lit8 v0, v0, 0x18

    .line 31
    .line 32
    shl-int/lit8 v4, v4, 0x10

    .line 33
    .line 34
    or-int/2addr v0, v4

    .line 35
    const/16 v4, 0x8

    .line 36
    .line 37
    shl-int/2addr v6, v4

    .line 38
    or-int/2addr v0, v6

    .line 39
    or-int/2addr v0, v8

    .line 40
    const/16 v6, 0x1ba

    .line 41
    .line 42
    if-eq v0, v6, :cond_0

    .line 43
    .line 44
    return v2

    .line 45
    :cond_0
    const/4 v0, 0x4

    .line 46
    aget-byte v6, v1, v0

    .line 47
    .line 48
    and-int/lit16 v6, v6, 0xc4

    .line 49
    .line 50
    const/16 v8, 0x44

    .line 51
    .line 52
    if-eq v6, v8, :cond_1

    .line 53
    .line 54
    return v2

    .line 55
    :cond_1
    const/4 v6, 0x6

    .line 56
    aget-byte v6, v1, v6

    .line 57
    .line 58
    and-int/2addr v6, v0

    .line 59
    if-eq v6, v0, :cond_2

    .line 60
    .line 61
    return v2

    .line 62
    :cond_2
    aget-byte v6, v1, v4

    .line 63
    .line 64
    and-int/2addr v6, v0

    .line 65
    if-eq v6, v0, :cond_3

    .line 66
    .line 67
    return v2

    .line 68
    :cond_3
    const/16 v0, 0x9

    .line 69
    .line 70
    aget-byte v0, v1, v0

    .line 71
    .line 72
    and-int/2addr v0, v3

    .line 73
    if-eq v0, v3, :cond_4

    .line 74
    .line 75
    return v2

    .line 76
    :cond_4
    const/16 v0, 0xc

    .line 77
    .line 78
    aget-byte v0, v1, v0

    .line 79
    .line 80
    and-int/2addr v0, v7

    .line 81
    if-eq v0, v7, :cond_5

    .line 82
    .line 83
    return v2

    .line 84
    :cond_5
    const/16 v0, 0xd

    .line 85
    .line 86
    aget-byte v0, v1, v0

    .line 87
    .line 88
    and-int/lit8 v0, v0, 0x7

    .line 89
    .line 90
    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/ads/zzael;->zzj(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, v7, v2}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte p1, v1, v2

    .line 97
    .line 98
    and-int/lit16 p1, p1, 0xff

    .line 99
    .line 100
    shl-int/lit8 p1, p1, 0x10

    .line 101
    .line 102
    aget-byte v0, v1, v3

    .line 103
    .line 104
    and-int/lit16 v0, v0, 0xff

    .line 105
    .line 106
    shl-int/2addr v0, v4

    .line 107
    aget-byte v1, v1, v5

    .line 108
    .line 109
    and-int/lit16 v1, v1, 0xff

    .line 110
    .line 111
    or-int/2addr p1, v0

    .line 112
    or-int/2addr p1, v1

    .line 113
    if-ne p1, v3, :cond_6

    .line 114
    .line 115
    return v3

    .line 116
    :cond_6
    return v2
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzj:Lcom/google/android/gms/internal/ads/zzaex;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzj:Lcom/google/android/gms/internal/ads/zzaex;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 7
    .line 8
    .line 9
    move-result-wide v5

    .line 10
    const-wide/16 v7, -0x1

    .line 11
    .line 12
    cmp-long v9, v5, v7

    .line 13
    .line 14
    if-eqz v9, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzd:Lcom/google/android/gms/internal/ads/zzapj;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzapj;->zza()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzapj;->zzc(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzk:Z

    .line 31
    .line 32
    const/4 v10, 0x1

    .line 33
    if-nez v1, :cond_3

    .line 34
    .line 35
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzk:Z

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzd:Lcom/google/android/gms/internal/ads/zzapj;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzapj;->zzd()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmp-long v2, v2, v11

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    move-object v2, v1

    .line 53
    new-instance v1, Lcom/google/android/gms/internal/ads/zzapi;

    .line 54
    .line 55
    move-object v3, v2

    .line 56
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzapj;->zzb()Lcom/google/android/gms/internal/ads/zzfg;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzapj;->zzd()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzapi;-><init>(Lcom/google/android/gms/internal/ads/zzfg;JJ)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzi:Lcom/google/android/gms/internal/ads/zzapi;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzj:Lcom/google/android/gms/internal/ads/zzaex;

    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaeg;->zza()Lcom/google/android/gms/internal/ads/zzafy;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-object v3, v1

    .line 80
    new-instance v1, Lcom/google/android/gms/internal/ads/zzafx;

    .line 81
    .line 82
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzapj;->zzd()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    const-wide/16 v11, 0x0

    .line 87
    .line 88
    invoke-direct {v1, v2, v3, v11, v12}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzi:Lcom/google/android/gms/internal/ads/zzapi;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaeg;->zzc()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzaeg;->zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1

    .line 110
    :cond_5
    :goto_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 111
    .line 112
    .line 113
    if-eqz v9, :cond_6

    .line 114
    .line 115
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    sub-long/2addr v5, v0

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move-wide v5, v7

    .line 122
    :goto_3
    cmp-long p2, v5, v7

    .line 123
    .line 124
    const/4 v0, -0x1

    .line 125
    if-eqz p2, :cond_8

    .line 126
    .line 127
    const-wide/16 v1, 0x4

    .line 128
    .line 129
    cmp-long p2, v5, v1

    .line 130
    .line 131
    if-ltz p2, :cond_7

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    return v0

    .line 135
    :cond_8
    :goto_4
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzc:Lcom/google/android/gms/internal/ads/zzer;

    .line 136
    .line 137
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const/4 v2, 0x4

    .line 142
    const/4 v3, 0x0

    .line 143
    invoke-interface {p1, v1, v3, v2, v10}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_9

    .line 148
    .line 149
    return v0

    .line 150
    :cond_9
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    const/16 v2, 0x1b9

    .line 158
    .line 159
    if-ne v1, v2, :cond_a

    .line 160
    .line 161
    return v0

    .line 162
    :cond_a
    const/16 v0, 0x1ba

    .line 163
    .line 164
    if-ne v1, v0, :cond_b

    .line 165
    .line 166
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    const/16 v1, 0xa

    .line 171
    .line 172
    invoke-interface {p1, v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 173
    .line 174
    .line 175
    const/16 v0, 0x9

    .line 176
    .line 177
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    and-int/lit8 p2, p2, 0x7

    .line 185
    .line 186
    add-int/lit8 p2, p2, 0xe

    .line 187
    .line 188
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 189
    .line 190
    .line 191
    return v3

    .line 192
    :cond_b
    const/16 v0, 0x1bb

    .line 193
    .line 194
    const/4 v2, 0x2

    .line 195
    const/4 v4, 0x6

    .line 196
    if-ne v1, v0, :cond_c

    .line 197
    .line 198
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {p1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    add-int/2addr p2, v4

    .line 213
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 214
    .line 215
    .line 216
    return v3

    .line 217
    :cond_c
    shr-int/lit8 v0, v1, 0x8

    .line 218
    .line 219
    if-eq v0, v10, :cond_d

    .line 220
    .line 221
    invoke-interface {p1, v10}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 222
    .line 223
    .line 224
    return v3

    .line 225
    :cond_d
    and-int/lit16 v0, v1, 0xff

    .line 226
    .line 227
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzb:Landroid/util/SparseArray;

    .line 228
    .line 229
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, Lcom/google/android/gms/internal/ads/zzapk;

    .line 234
    .line 235
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzapm;->zze:Z

    .line 236
    .line 237
    if-nez v7, :cond_13

    .line 238
    .line 239
    if-nez v6, :cond_11

    .line 240
    .line 241
    const/16 v7, 0xbd

    .line 242
    .line 243
    const-string v8, "video/mp2p"

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    if-ne v0, v7, :cond_e

    .line 247
    .line 248
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaod;

    .line 249
    .line 250
    invoke-direct {v1, v9, v3, v8}, Lcom/google/android/gms/internal/ads/zzaod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzf:Z

    .line 254
    .line 255
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 256
    .line 257
    .line 258
    move-result-wide v7

    .line 259
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzh:J

    .line 260
    .line 261
    :goto_5
    move-object v9, v1

    .line 262
    goto :goto_6

    .line 263
    :cond_e
    and-int/lit16 v7, v1, 0xe0

    .line 264
    .line 265
    const/16 v11, 0xc0

    .line 266
    .line 267
    if-ne v7, v11, :cond_f

    .line 268
    .line 269
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaoz;

    .line 270
    .line 271
    invoke-direct {v1, v9, v3, v8}, Lcom/google/android/gms/internal/ads/zzaoz;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzf:Z

    .line 275
    .line 276
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 277
    .line 278
    .line 279
    move-result-wide v7

    .line 280
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzh:J

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_f
    and-int/lit16 v1, v1, 0xf0

    .line 284
    .line 285
    const/16 v7, 0xe0

    .line 286
    .line 287
    if-ne v1, v7, :cond_10

    .line 288
    .line 289
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaop;

    .line 290
    .line 291
    invoke-direct {v1, v9, v8}, Lcom/google/android/gms/internal/ads/zzaop;-><init>(Lcom/google/android/gms/internal/ads/zzaqf;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzg:Z

    .line 295
    .line 296
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 297
    .line 298
    .line 299
    move-result-wide v7

    .line 300
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzh:J

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_10
    :goto_6
    if-eqz v9, :cond_11

    .line 304
    .line 305
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqb;

    .line 306
    .line 307
    const/high16 v6, -0x80000000

    .line 308
    .line 309
    const/16 v7, 0x100

    .line 310
    .line 311
    invoke-direct {v1, v6, v0, v7}, Lcom/google/android/gms/internal/ads/zzaqb;-><init>(III)V

    .line 312
    .line 313
    .line 314
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzj:Lcom/google/android/gms/internal/ads/zzaex;

    .line 315
    .line 316
    invoke-interface {v9, v6, v1}, Lcom/google/android/gms/internal/ads/zzaon;->zzb(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzaqb;)V

    .line 317
    .line 318
    .line 319
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zza:Lcom/google/android/gms/internal/ads/zzfg;

    .line 320
    .line 321
    new-instance v6, Lcom/google/android/gms/internal/ads/zzapk;

    .line 322
    .line 323
    invoke-direct {v6, v9, v1}, Lcom/google/android/gms/internal/ads/zzapk;-><init>(Lcom/google/android/gms/internal/ads/zzaon;Lcom/google/android/gms/internal/ads/zzfg;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v5, v0, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_11
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzf:Z

    .line 330
    .line 331
    const-wide/32 v7, 0x100000

    .line 332
    .line 333
    .line 334
    if-eqz v0, :cond_12

    .line 335
    .line 336
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzg:Z

    .line 337
    .line 338
    if-eqz v0, :cond_12

    .line 339
    .line 340
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzh:J

    .line 341
    .line 342
    const-wide/16 v7, 0x2000

    .line 343
    .line 344
    add-long/2addr v7, v0

    .line 345
    :cond_12
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 346
    .line 347
    .line 348
    move-result-wide v0

    .line 349
    cmp-long v0, v0, v7

    .line 350
    .line 351
    if-lez v0, :cond_13

    .line 352
    .line 353
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzapm;->zze:Z

    .line 354
    .line 355
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzj:Lcom/google/android/gms/internal/ads/zzaex;

    .line 356
    .line 357
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 358
    .line 359
    .line 360
    :cond_13
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-interface {p1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    add-int/2addr v0, v4

    .line 375
    if-nez v6, :cond_14

    .line 376
    .line 377
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 378
    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_14
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-interface {p1, v1, v3, v0}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzapk;->zzb(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzer;->zzj()I

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 402
    .line 403
    .line 404
    :goto_7
    return v3
.end method

.method public final zze(JJ)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zza:Lcom/google/android/gms/internal/ads/zzfg;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfg;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfg;->zza()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    cmp-long p2, v0, v2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long p2, v0, v2

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    cmp-long p2, v0, p3

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzfg;->zzd(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzi:Lcom/google/android/gms/internal/ads/zzapi;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzaeg;->zzb(J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapm;->zzb:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-ge p2, p3, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/google/android/gms/internal/ads/zzapk;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzapk;->zza()V

    .line 60
    .line 61
    .line 62
    add-int/lit8 p2, p2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method
