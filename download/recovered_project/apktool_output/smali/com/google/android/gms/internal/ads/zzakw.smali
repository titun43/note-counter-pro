.class public final Lcom/google/android/gms/internal/ads/zzakw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# static fields
.field public static final synthetic zza:I


# instance fields
.field private zzA:I

.field private zzB:Lcom/google/android/gms/internal/ads/zzahv;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzamd;

.field private final zzc:I

.field private final zzd:Lcom/google/android/gms/internal/ads/zzer;

.field private final zze:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzh:Ljava/util/ArrayDeque;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzala;

.field private final zzj:Ljava/util/List;

.field private zzk:Lcom/google/android/gms/internal/ads/zzguf;

.field private zzl:I

.field private zzm:I

.field private zzn:J

.field private zzo:I

.field private zzp:Lcom/google/android/gms/internal/ads/zzer;

.field private zzq:I

.field private zzr:I

.field private zzs:I

.field private zzt:I

.field private zzu:Z

.field private zzv:Z

.field private zzw:J

.field private zzx:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzy:[Lcom/google/android/gms/internal/ads/zzakv;

.field private zzz:[[J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzakw;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzamd;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzb:Lcom/google/android/gms/internal/ads/zzamd;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzc:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzk:Lcom/google/android/gms/internal/ads/zzguf;

    and-int/lit8 p1, p2, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzala;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzala;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzi:Lcom/google/android/gms/internal/ads/zzala;

    new-instance p1, Ljava/util/ArrayList;

    .line 4
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzj:Ljava/util/List;

    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 6
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 7
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgm;->zza:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzd:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/4 v0, 0x6

    .line 8
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zze:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 9
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzq:I

    sget-object p1, Lcom/google/android/gms/internal/ads/zzaex;->zza:Lcom/google/android/gms/internal/ads/zzaex;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    new-array p1, p2, [Lcom/google/android/gms/internal/ads/zzakv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    return-void
.end method

.method public static synthetic zzh(Lcom/google/android/gms/internal/ads/zzalf;JJ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzakw;->zzl(Lcom/google/android/gms/internal/ads/zzalf;J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, -0x1

    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    return-wide p3

    .line 9
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzc:[J

    .line 10
    .line 11
    aget-wide p1, p0, p1

    .line 12
    .line 13
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0
.end method

.method public static synthetic zzi(Lcom/google/android/gms/internal/ads/zzalf;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzakw;->zzl(Lcom/google/android/gms/internal/ads/zzalf;J)I

    move-result p0

    return p0
.end method

.method private final zzj()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    return-void
.end method

.method private final zzk(J)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_1f

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/google/android/gms/internal/ads/zzfu;

    .line 16
    .line 17
    iget-wide v4, v2, Lcom/google/android/gms/internal/ads/zzfu;->zza:J

    .line 18
    .line 19
    cmp-long v2, v4, p1

    .line 20
    .line 21
    if-nez v2, :cond_1f

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v4, v2

    .line 28
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfu;

    .line 29
    .line 30
    iget v2, v4, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 31
    .line 32
    const v5, 0x6d6f6f76

    .line 33
    .line 34
    .line 35
    if-ne v2, v5, :cond_1e

    .line 36
    .line 37
    const v2, 0x6d657461

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzd(I)Lcom/google/android/gms/internal/ads/zzfu;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v5, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzakh;->zze(Lcom/google/android/gms/internal/ads/zzfu;)Lcom/google/android/gms/internal/ads/zzap;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v2, 0x0

    .line 57
    :goto_1
    new-instance v14, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzA:I

    .line 63
    .line 64
    const/4 v15, 0x0

    .line 65
    const/4 v6, 0x1

    .line 66
    if-ne v5, v6, :cond_2

    .line 67
    .line 68
    move v10, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v10, v15

    .line 71
    :goto_2
    new-instance v5, Lcom/google/android/gms/internal/ads/zzafn;

    .line 72
    .line 73
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzafn;-><init>()V

    .line 74
    .line 75
    .line 76
    const v7, 0x75647461

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    if-eqz v7, :cond_3

    .line 84
    .line 85
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzakh;->zzc(Lcom/google/android/gms/internal/ads/zzfv;)Lcom/google/android/gms/internal/ads/zzap;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/ads/zzafn;->zza(Lcom/google/android/gms/internal/ads/zzap;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    const/4 v7, 0x0

    .line 94
    :goto_3
    new-instance v8, Lcom/google/android/gms/internal/ads/zzap;

    .line 95
    .line 96
    const v9, 0x6d766864

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 107
    .line 108
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzakh;->zzd(Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzfy;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    new-array v11, v6, [Lcom/google/android/gms/internal/ads/zzao;

    .line 113
    .line 114
    aput-object v9, v11, v15

    .line 115
    .line 116
    move-object/from16 v17, v14

    .line 117
    .line 118
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    invoke-direct {v8, v13, v14, v11}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 124
    .line 125
    .line 126
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzc:I

    .line 127
    .line 128
    and-int/lit8 v11, v9, 0x1

    .line 129
    .line 130
    if-eq v6, v11, :cond_4

    .line 131
    .line 132
    move v11, v9

    .line 133
    move v9, v15

    .line 134
    goto :goto_4

    .line 135
    :cond_4
    move v11, v9

    .line 136
    move v9, v6

    .line 137
    :goto_4
    sget-object v12, Lcom/google/android/gms/internal/ads/zzakt;->zza:Lcom/google/android/gms/internal/ads/zzakt;

    .line 138
    .line 139
    move/from16 v18, v11

    .line 140
    .line 141
    move-object v11, v12

    .line 142
    const/4 v12, 0x0

    .line 143
    move/from16 v20, v6

    .line 144
    .line 145
    move-object/from16 v19, v7

    .line 146
    .line 147
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    move-object/from16 v21, v8

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    move/from16 v22, v15

    .line 156
    .line 157
    move-object/from16 v23, v19

    .line 158
    .line 159
    move/from16 v15, v20

    .line 160
    .line 161
    move-object/from16 v24, v21

    .line 162
    .line 163
    invoke-static/range {v4 .. v12}, Lcom/google/android/gms/internal/ads/zzakh;->zzb(Lcom/google/android/gms/internal/ads/zzfu;Lcom/google/android/gms/internal/ads/zzafn;JLcom/google/android/gms/internal/ads/zzq;ZZLcom/google/android/gms/internal/ads/zzgqt;Z)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzakr;->zza(Ljava/util/List;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    move-wide v10, v13

    .line 172
    move-wide/from16 v19, v10

    .line 173
    .line 174
    move/from16 v8, v22

    .line 175
    .line 176
    move v9, v8

    .line 177
    const/4 v12, -0x1

    .line 178
    :goto_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    const-wide/16 v25, 0x0

    .line 183
    .line 184
    if-ge v8, v13, :cond_18

    .line 185
    .line 186
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    check-cast v13, Lcom/google/android/gms/internal/ads/zzalf;

    .line 191
    .line 192
    iget v14, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzb:I

    .line 193
    .line 194
    if-nez v14, :cond_5

    .line 195
    .line 196
    move-object/from16 v28, v1

    .line 197
    .line 198
    move-object/from16 v30, v4

    .line 199
    .line 200
    move/from16 v29, v8

    .line 201
    .line 202
    move-object/from16 v3, v17

    .line 203
    .line 204
    move-wide/from16 v13, v19

    .line 205
    .line 206
    move-object/from16 v8, v23

    .line 207
    .line 208
    move-object/from16 v15, v24

    .line 209
    .line 210
    const/4 v1, -0x1

    .line 211
    goto/16 :goto_15

    .line 212
    .line 213
    :cond_5
    iget-object v15, v13, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 214
    .line 215
    new-instance v7, Lcom/google/android/gms/internal/ads/zzakv;

    .line 216
    .line 217
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 218
    .line 219
    add-int/lit8 v27, v9, 0x1

    .line 220
    .line 221
    move-object/from16 v28, v1

    .line 222
    .line 223
    iget v1, v15, Lcom/google/android/gms/internal/ads/zzalc;->zzb:I

    .line 224
    .line 225
    invoke-interface {v3, v9, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-direct {v7, v15, v13, v3}, Lcom/google/android/gms/internal/ads/zzakv;-><init>(Lcom/google/android/gms/internal/ads/zzalc;Lcom/google/android/gms/internal/ads/zzalf;Lcom/google/android/gms/internal/ads/zzagh;)V

    .line 230
    .line 231
    .line 232
    move-object v9, v4

    .line 233
    iget-wide v3, v15, Lcom/google/android/gms/internal/ads/zzalc;->zze:J

    .line 234
    .line 235
    cmp-long v29, v3, v19

    .line 236
    .line 237
    if-nez v29, :cond_6

    .line 238
    .line 239
    iget-wide v3, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzi:J

    .line 240
    .line 241
    :cond_6
    move/from16 v29, v8

    .line 242
    .line 243
    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zzakv;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 244
    .line 245
    invoke-interface {v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzN(J)V

    .line 246
    .line 247
    .line 248
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v10

    .line 252
    iget-object v15, v15, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 253
    .line 254
    move-object/from16 v30, v9

    .line 255
    .line 256
    iget-object v9, v15, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 257
    .line 258
    move-wide/from16 v31, v10

    .line 259
    .line 260
    const-string v10, "audio/true-hd"

    .line 261
    .line 262
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-eqz v10, :cond_7

    .line 267
    .line 268
    iget v10, v13, Lcom/google/android/gms/internal/ads/zzalf;->zze:I

    .line 269
    .line 270
    mul-int/lit8 v10, v10, 0x10

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_7
    iget v10, v13, Lcom/google/android/gms/internal/ads/zzalf;->zze:I

    .line 274
    .line 275
    add-int/lit8 v10, v10, 0x1e

    .line 276
    .line 277
    :goto_6
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/ads/zzt;->zzn(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 282
    .line 283
    .line 284
    const/4 v10, 0x2

    .line 285
    if-ne v1, v10, :cond_a

    .line 286
    .line 287
    iget v1, v15, Lcom/google/android/gms/internal/ads/zzv;->zzf:I

    .line 288
    .line 289
    and-int/lit8 v10, v18, 0x8

    .line 290
    .line 291
    if-eqz v10, :cond_9

    .line 292
    .line 293
    const/4 v10, -0x1

    .line 294
    if-ne v12, v10, :cond_8

    .line 295
    .line 296
    const/4 v10, 0x1

    .line 297
    goto :goto_7

    .line 298
    :cond_8
    const/4 v10, 0x2

    .line 299
    :goto_7
    or-int/2addr v1, v10

    .line 300
    :cond_9
    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzg(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 301
    .line 302
    .line 303
    const/4 v1, 0x2

    .line 304
    :cond_a
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzas;->zzb(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    if-nez v10, :cond_b

    .line 309
    .line 310
    move-object v14, v7

    .line 311
    move-object/from16 v33, v8

    .line 312
    .line 313
    :goto_8
    move-wide/from16 v7, v19

    .line 314
    .line 315
    goto :goto_d

    .line 316
    :cond_b
    iget-boolean v10, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzj:Z

    .line 317
    .line 318
    if-nez v10, :cond_c

    .line 319
    .line 320
    iget-object v14, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzh:[I

    .line 321
    .line 322
    array-length v14, v14

    .line 323
    :cond_c
    cmp-long v33, v3, v19

    .line 324
    .line 325
    move/from16 v34, v10

    .line 326
    .line 327
    const/16 v10, 0x14

    .line 328
    .line 329
    invoke-static {v14, v10}, Ljava/lang/Math;->min(II)I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v33, :cond_d

    .line 334
    .line 335
    const/4 v14, 0x1

    .line 336
    goto :goto_9

    .line 337
    :cond_d
    move/from16 v14, v22

    .line 338
    .line 339
    :goto_9
    invoke-static {v14}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 340
    .line 341
    .line 342
    move-object v14, v7

    .line 343
    move-object/from16 v33, v8

    .line 344
    .line 345
    const-wide/32 v7, 0x989680

    .line 346
    .line 347
    .line 348
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 349
    .line 350
    .line 351
    move-result-wide v3

    .line 352
    move-wide/from16 v35, v3

    .line 353
    .line 354
    move/from16 v3, v22

    .line 355
    .line 356
    move v8, v3

    .line 357
    const/4 v7, -0x1

    .line 358
    :goto_a
    if-ge v8, v10, :cond_f

    .line 359
    .line 360
    if-eqz v34, :cond_e

    .line 361
    .line 362
    move/from16 v37, v8

    .line 363
    .line 364
    goto :goto_b

    .line 365
    :cond_e
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzh:[I

    .line 366
    .line 367
    aget v4, v4, v8

    .line 368
    .line 369
    move/from16 v37, v4

    .line 370
    .line 371
    :goto_b
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzf:[J

    .line 372
    .line 373
    aget-wide v38, v4, v37

    .line 374
    .line 375
    cmp-long v4, v38, v35

    .line 376
    .line 377
    if-lez v4, :cond_10

    .line 378
    .line 379
    :cond_f
    const/4 v10, -0x1

    .line 380
    goto :goto_c

    .line 381
    :cond_10
    cmp-long v4, v38, v25

    .line 382
    .line 383
    if-ltz v4, :cond_11

    .line 384
    .line 385
    iget-object v4, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzd:[I

    .line 386
    .line 387
    aget v4, v4, v37

    .line 388
    .line 389
    if-le v4, v3, :cond_11

    .line 390
    .line 391
    move v3, v4

    .line 392
    move/from16 v7, v37

    .line 393
    .line 394
    :cond_11
    add-int/lit8 v8, v8, 0x1

    .line 395
    .line 396
    goto :goto_a

    .line 397
    :goto_c
    if-ne v7, v10, :cond_12

    .line 398
    .line 399
    goto :goto_8

    .line 400
    :cond_12
    iget-object v3, v13, Lcom/google/android/gms/internal/ads/zzalf;->zzf:[J

    .line 401
    .line 402
    aget-wide v7, v3, v7

    .line 403
    .line 404
    :goto_d
    cmp-long v3, v7, v19

    .line 405
    .line 406
    if-eqz v3, :cond_13

    .line 407
    .line 408
    new-instance v3, Lcom/google/android/gms/internal/ads/zzap;

    .line 409
    .line 410
    new-instance v4, Lcom/google/android/gms/internal/ads/zzahx;

    .line 411
    .line 412
    invoke-direct {v4, v7, v8}, Lcom/google/android/gms/internal/ads/zzahx;-><init>(J)V

    .line 413
    .line 414
    .line 415
    const/4 v7, 0x1

    .line 416
    new-array v8, v7, [Lcom/google/android/gms/internal/ads/zzao;

    .line 417
    .line 418
    aput-object v4, v8, v22

    .line 419
    .line 420
    move-object v4, v14

    .line 421
    move-wide/from16 v13, v19

    .line 422
    .line 423
    invoke-direct {v3, v13, v14, v8}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 424
    .line 425
    .line 426
    goto :goto_e

    .line 427
    :cond_13
    move-object v4, v14

    .line 428
    move-wide/from16 v13, v19

    .line 429
    .line 430
    const/4 v3, 0x0

    .line 431
    :goto_e
    invoke-static {v1, v5, v11}, Lcom/google/android/gms/internal/ads/zzakq;->zzb(ILcom/google/android/gms/internal/ads/zzafn;Lcom/google/android/gms/internal/ads/zzt;)V

    .line 432
    .line 433
    .line 434
    iget-object v7, v15, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 435
    .line 436
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzj:Ljava/util/List;

    .line 437
    .line 438
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    if-eqz v10, :cond_14

    .line 443
    .line 444
    const/4 v10, 0x0

    .line 445
    :goto_f
    move-object/from16 v8, v23

    .line 446
    .line 447
    move-object/from16 v15, v24

    .line 448
    .line 449
    goto :goto_10

    .line 450
    :cond_14
    new-instance v10, Lcom/google/android/gms/internal/ads/zzap;

    .line 451
    .line 452
    invoke-direct {v10, v8}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 453
    .line 454
    .line 455
    goto :goto_f

    .line 456
    :goto_10
    filled-new-array {v10, v8, v15, v3}, [Lcom/google/android/gms/internal/ads/zzap;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v1, v2, v11, v7, v3}, Lcom/google/android/gms/internal/ads/zzakq;->zza(ILcom/google/android/gms/internal/ads/zzap;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzap;[Lcom/google/android/gms/internal/ads/zzap;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v11, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 464
    .line 465
    .line 466
    const-string v3, "audio/mpeg"

    .line 467
    .line 468
    invoke-static {v9, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-eqz v3, :cond_15

    .line 473
    .line 474
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    iput-object v3, v4, Lcom/google/android/gms/internal/ads/zzakv;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 479
    .line 480
    :goto_11
    const/4 v10, 0x2

    .line 481
    goto :goto_12

    .line 482
    :cond_15
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    move-object/from16 v7, v33

    .line 487
    .line 488
    invoke-interface {v7, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 489
    .line 490
    .line 491
    goto :goto_11

    .line 492
    :goto_12
    if-ne v1, v10, :cond_17

    .line 493
    .line 494
    const/4 v1, -0x1

    .line 495
    if-ne v12, v1, :cond_16

    .line 496
    .line 497
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 498
    .line 499
    .line 500
    move-result v12

    .line 501
    :cond_16
    :goto_13
    move-object/from16 v3, v17

    .line 502
    .line 503
    goto :goto_14

    .line 504
    :cond_17
    const/4 v1, -0x1

    .line 505
    goto :goto_13

    .line 506
    :goto_14
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move/from16 v9, v27

    .line 510
    .line 511
    move-wide/from16 v10, v31

    .line 512
    .line 513
    :goto_15
    add-int/lit8 v4, v29, 0x1

    .line 514
    .line 515
    move-object/from16 v17, v3

    .line 516
    .line 517
    move-object/from16 v23, v8

    .line 518
    .line 519
    move-wide/from16 v19, v13

    .line 520
    .line 521
    move-object/from16 v24, v15

    .line 522
    .line 523
    move-object/from16 v1, v28

    .line 524
    .line 525
    const/4 v15, 0x1

    .line 526
    move v8, v4

    .line 527
    move-object/from16 v4, v30

    .line 528
    .line 529
    goto/16 :goto_5

    .line 530
    .line 531
    :cond_18
    move-object/from16 v28, v1

    .line 532
    .line 533
    move-object/from16 v3, v17

    .line 534
    .line 535
    move/from16 v4, v22

    .line 536
    .line 537
    const/4 v1, -0x1

    .line 538
    new-array v2, v4, [Lcom/google/android/gms/internal/ads/zzakv;

    .line 539
    .line 540
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    check-cast v2, [Lcom/google/android/gms/internal/ads/zzakv;

    .line 545
    .line 546
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    .line 547
    .line 548
    array-length v3, v2

    .line 549
    new-array v4, v3, [[J

    .line 550
    .line 551
    new-array v5, v3, [I

    .line 552
    .line 553
    new-array v6, v3, [J

    .line 554
    .line 555
    new-array v3, v3, [Z

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    :goto_16
    array-length v8, v2

    .line 559
    if-ge v7, v8, :cond_19

    .line 560
    .line 561
    aget-object v8, v2, v7

    .line 562
    .line 563
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 564
    .line 565
    iget v8, v8, Lcom/google/android/gms/internal/ads/zzalf;->zzb:I

    .line 566
    .line 567
    new-array v8, v8, [J

    .line 568
    .line 569
    aput-object v8, v4, v7

    .line 570
    .line 571
    aget-object v8, v2, v7

    .line 572
    .line 573
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 574
    .line 575
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzalf;->zzf:[J

    .line 576
    .line 577
    const/16 v22, 0x0

    .line 578
    .line 579
    aget-wide v13, v8, v22

    .line 580
    .line 581
    aput-wide v13, v6, v7

    .line 582
    .line 583
    add-int/lit8 v7, v7, 0x1

    .line 584
    .line 585
    goto :goto_16

    .line 586
    :cond_19
    const/16 v22, 0x0

    .line 587
    .line 588
    move/from16 v7, v22

    .line 589
    .line 590
    :goto_17
    array-length v8, v2

    .line 591
    if-ge v7, v8, :cond_1d

    .line 592
    .line 593
    const-wide v8, 0x7fffffffffffffffL

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    move-wide v13, v8

    .line 599
    move/from16 v8, v22

    .line 600
    .line 601
    move v9, v1

    .line 602
    :goto_18
    array-length v15, v2

    .line 603
    if-ge v8, v15, :cond_1b

    .line 604
    .line 605
    aget-boolean v15, v3, v8

    .line 606
    .line 607
    if-nez v15, :cond_1a

    .line 608
    .line 609
    aget-wide v15, v6, v8

    .line 610
    .line 611
    cmp-long v17, v15, v13

    .line 612
    .line 613
    if-gtz v17, :cond_1a

    .line 614
    .line 615
    move v9, v8

    .line 616
    move-wide v13, v15

    .line 617
    :cond_1a
    add-int/lit8 v8, v8, 0x1

    .line 618
    .line 619
    goto :goto_18

    .line 620
    :cond_1b
    aget v8, v5, v9

    .line 621
    .line 622
    aget-object v13, v4, v9

    .line 623
    .line 624
    aput-wide v25, v13, v8

    .line 625
    .line 626
    aget-object v14, v2, v9

    .line 627
    .line 628
    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 629
    .line 630
    iget-object v15, v14, Lcom/google/android/gms/internal/ads/zzalf;->zzd:[I

    .line 631
    .line 632
    aget v15, v15, v8

    .line 633
    .line 634
    move-object/from16 v16, v2

    .line 635
    .line 636
    int-to-long v1, v15

    .line 637
    add-long v25, v25, v1

    .line 638
    .line 639
    const/16 v21, 0x1

    .line 640
    .line 641
    add-int/lit8 v8, v8, 0x1

    .line 642
    .line 643
    aput v8, v5, v9

    .line 644
    .line 645
    array-length v1, v13

    .line 646
    if-ge v8, v1, :cond_1c

    .line 647
    .line 648
    iget-object v1, v14, Lcom/google/android/gms/internal/ads/zzalf;->zzf:[J

    .line 649
    .line 650
    aget-wide v13, v1, v8

    .line 651
    .line 652
    aput-wide v13, v6, v9

    .line 653
    .line 654
    :goto_19
    move-object/from16 v2, v16

    .line 655
    .line 656
    const/4 v1, -0x1

    .line 657
    goto :goto_17

    .line 658
    :cond_1c
    aput-boolean v21, v3, v9

    .line 659
    .line 660
    add-int/lit8 v7, v7, 0x1

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :cond_1d
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzz:[[J

    .line 664
    .line 665
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 666
    .line 667
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 668
    .line 669
    .line 670
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 671
    .line 672
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaku;

    .line 673
    .line 674
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    .line 675
    .line 676
    invoke-direct {v2, v10, v11, v3, v12}, Lcom/google/android/gms/internal/ads/zzaku;-><init>(J[Lcom/google/android/gms/internal/ads/zzakv;I)V

    .line 677
    .line 678
    .line 679
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayDeque;->clear()V

    .line 683
    .line 684
    .line 685
    const/4 v10, 0x2

    .line 686
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 687
    .line 688
    goto/16 :goto_0

    .line 689
    .line 690
    :cond_1e
    move-object/from16 v28, v1

    .line 691
    .line 692
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    if-nez v1, :cond_0

    .line 697
    .line 698
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v1

    .line 702
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfu;

    .line 703
    .line 704
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzfu;->zzb(Lcom/google/android/gms/internal/ads/zzfu;)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_0

    .line 708
    .line 709
    :cond_1f
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 710
    .line 711
    const/4 v10, 0x2

    .line 712
    if-eq v1, v10, :cond_20

    .line 713
    .line 714
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakw;->zzj()V

    .line 715
    .line 716
    .line 717
    :cond_20
    return-void
.end method

.method private static zzl(Lcom/google/android/gms/internal/ads/zzalf;J)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzalf;->zza(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzalf;->zzb(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    return v0
.end method

.method private static zzm(I)I
    .locals 1

    const v0, 0x68656963

    if-eq p0, v0, :cond_1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzc:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzalb;->zzb(Lcom/google/android/gms/internal/ads/zzaev;Z)Lcom/google/android/gms/internal/ads/zzagc;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzk:Lcom/google/android/gms/internal/ads/zzguf;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    return v1
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzk:Lcom/google/android/gms/internal/ads/zzguf;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzc:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzb:Lcom/google/android/gms/internal/ads/zzamd;

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/internal/ads/zzamg;

    .line 10
    .line 11
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzamg;-><init>(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzamd;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 16
    .line 17
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 8
    .line 9
    const v4, 0x66747970

    .line 10
    .line 11
    .line 12
    const-wide/16 v6, 0x0

    .line 13
    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, -0x1

    .line 16
    const/16 v11, 0x8

    .line 17
    .line 18
    const/4 v12, 0x1

    .line 19
    if-eqz v3, :cond_2a

    .line 20
    .line 21
    if-eq v3, v12, :cond_21

    .line 22
    .line 23
    if-eq v3, v8, :cond_2

    .line 24
    .line 25
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzi:Lcom/google/android/gms/internal/ads/zzala;

    .line 26
    .line 27
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzj:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {v3, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzala;->zzb(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;Ljava/util/List;)I

    .line 30
    .line 31
    .line 32
    iget-wide v1, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 33
    .line 34
    cmp-long v1, v1, v6

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakw;->zzj()V

    .line 39
    .line 40
    .line 41
    :cond_1
    return v12

    .line 42
    :cond_2
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    iget v11, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzq:I

    .line 47
    .line 48
    if-ne v11, v9, :cond_c

    .line 49
    .line 50
    const-wide v16, 0x7fffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    move/from16 v25, v9

    .line 56
    .line 57
    move/from16 v26, v25

    .line 58
    .line 59
    move/from16 v20, v12

    .line 60
    .line 61
    move/from16 v27, v20

    .line 62
    .line 63
    move-wide/from16 v18, v16

    .line 64
    .line 65
    move-wide/from16 v21, v18

    .line 66
    .line 67
    move-wide/from16 v23, v21

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    const-wide/32 v28, 0x40000

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    .line 74
    .line 75
    array-length v15, v14

    .line 76
    if-ge v11, v15, :cond_a

    .line 77
    .line 78
    aget-object v14, v14, v11

    .line 79
    .line 80
    iget v15, v14, Lcom/google/android/gms/internal/ads/zzakv;->zze:I

    .line 81
    .line 82
    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 83
    .line 84
    move-wide/from16 v30, v6

    .line 85
    .line 86
    iget v6, v14, Lcom/google/android/gms/internal/ads/zzalf;->zzb:I

    .line 87
    .line 88
    if-ne v15, v6, :cond_3

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_3
    iget-object v6, v14, Lcom/google/android/gms/internal/ads/zzalf;->zzc:[J

    .line 92
    .line 93
    aget-wide v32, v6, v15

    .line 94
    .line 95
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzz:[[J

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    aget-object v6, v6, v11

    .line 101
    .line 102
    aget-wide v14, v6, v15

    .line 103
    .line 104
    sub-long v32, v32, v3

    .line 105
    .line 106
    cmp-long v6, v32, v30

    .line 107
    .line 108
    if-ltz v6, :cond_4

    .line 109
    .line 110
    cmp-long v6, v32, v28

    .line 111
    .line 112
    if-ltz v6, :cond_5

    .line 113
    .line 114
    :cond_4
    move v6, v12

    .line 115
    goto :goto_2

    .line 116
    :cond_5
    const/4 v6, 0x0

    .line 117
    :goto_2
    if-nez v6, :cond_6

    .line 118
    .line 119
    if-nez v27, :cond_7

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    move/from16 v7, v27

    .line 124
    .line 125
    :goto_3
    if-ne v6, v7, :cond_8

    .line 126
    .line 127
    cmp-long v27, v32, v23

    .line 128
    .line 129
    if-gez v27, :cond_8

    .line 130
    .line 131
    :cond_7
    move/from16 v27, v6

    .line 132
    .line 133
    move/from16 v26, v11

    .line 134
    .line 135
    move-wide/from16 v21, v14

    .line 136
    .line 137
    move-wide/from16 v23, v32

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_8
    move/from16 v27, v7

    .line 141
    .line 142
    :goto_4
    cmp-long v7, v14, v18

    .line 143
    .line 144
    if-gez v7, :cond_9

    .line 145
    .line 146
    move/from16 v20, v6

    .line 147
    .line 148
    move/from16 v25, v11

    .line 149
    .line 150
    move-wide/from16 v18, v14

    .line 151
    .line 152
    :cond_9
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 153
    .line 154
    move-wide/from16 v6, v30

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_a
    move-wide/from16 v30, v6

    .line 158
    .line 159
    cmp-long v6, v18, v16

    .line 160
    .line 161
    if-eqz v6, :cond_b

    .line 162
    .line 163
    if-eqz v20, :cond_b

    .line 164
    .line 165
    const-wide/32 v6, 0xa00000

    .line 166
    .line 167
    .line 168
    add-long v18, v18, v6

    .line 169
    .line 170
    cmp-long v6, v21, v18

    .line 171
    .line 172
    if-ltz v6, :cond_b

    .line 173
    .line 174
    move/from16 v11, v25

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_b
    move/from16 v11, v26

    .line 178
    .line 179
    :goto_6
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzq:I

    .line 180
    .line 181
    if-ne v11, v9, :cond_d

    .line 182
    .line 183
    return v9

    .line 184
    :cond_c
    move-wide/from16 v30, v6

    .line 185
    .line 186
    const-wide/32 v28, 0x40000

    .line 187
    .line 188
    .line 189
    :cond_d
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    .line 190
    .line 191
    aget-object v6, v6, v11

    .line 192
    .line 193
    iget-object v14, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 194
    .line 195
    iget v7, v6, Lcom/google/android/gms/internal/ads/zzakv;->zze:I

    .line 196
    .line 197
    iget-object v11, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 198
    .line 199
    iget-object v15, v11, Lcom/google/android/gms/internal/ads/zzalf;->zzc:[J

    .line 200
    .line 201
    aget-wide v16, v15, v7

    .line 202
    .line 203
    move v15, v8

    .line 204
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzw:J

    .line 205
    .line 206
    add-long v8, v16, v8

    .line 207
    .line 208
    move/from16 v16, v15

    .line 209
    .line 210
    iget-object v15, v11, Lcom/google/android/gms/internal/ads/zzalf;->zzd:[I

    .line 211
    .line 212
    aget v17, v15, v7

    .line 213
    .line 214
    iget-object v5, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzd:Lcom/google/android/gms/internal/ads/zzagi;

    .line 215
    .line 216
    sub-long v3, v8, v3

    .line 217
    .line 218
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 219
    .line 220
    move-object/from16 v19, v14

    .line 221
    .line 222
    const/16 v24, 0x0

    .line 223
    .line 224
    int-to-long v13, v10

    .line 225
    add-long/2addr v3, v13

    .line 226
    cmp-long v10, v3, v30

    .line 227
    .line 228
    if-ltz v10, :cond_e

    .line 229
    .line 230
    cmp-long v10, v3, v28

    .line 231
    .line 232
    if-ltz v10, :cond_f

    .line 233
    .line 234
    :cond_e
    move/from16 v25, v12

    .line 235
    .line 236
    goto/16 :goto_e

    .line 237
    .line 238
    :cond_f
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzakv;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 239
    .line 240
    iget v8, v2, Lcom/google/android/gms/internal/ads/zzalc;->zzh:I

    .line 241
    .line 242
    if-ne v8, v12, :cond_10

    .line 243
    .line 244
    const-wide/16 v8, 0x8

    .line 245
    .line 246
    add-long/2addr v3, v8

    .line 247
    add-int/lit8 v17, v17, -0x8

    .line 248
    .line 249
    :cond_10
    move/from16 v8, v17

    .line 250
    .line 251
    long-to-int v3, v3

    .line 252
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 253
    .line 254
    .line 255
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 256
    .line 257
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 258
    .line 259
    const-string v9, "video/avc"

    .line 260
    .line 261
    invoke-static {v4, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_11

    .line 266
    .line 267
    const-string v9, "video/hevc"

    .line 268
    .line 269
    invoke-static {v4, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :cond_11
    iput-boolean v12, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 273
    .line 274
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzalc;->zzk:I

    .line 275
    .line 276
    if-eqz v2, :cond_18

    .line 277
    .line 278
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zze:Lcom/google/android/gms/internal/ads/zzer;

    .line 279
    .line 280
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    aput-byte v24, v9, v24

    .line 285
    .line 286
    aput-byte v24, v9, v12

    .line 287
    .line 288
    aput-byte v24, v9, v16

    .line 289
    .line 290
    rsub-int/lit8 v10, v2, 0x4

    .line 291
    .line 292
    add-int/2addr v8, v10

    .line 293
    :goto_7
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 294
    .line 295
    if-ge v13, v8, :cond_16

    .line 296
    .line 297
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 298
    .line 299
    if-nez v13, :cond_15

    .line 300
    .line 301
    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 302
    .line 303
    if-nez v13, :cond_12

    .line 304
    .line 305
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgm;->zzc(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    add-int/2addr v13, v2

    .line 310
    aget v14, v15, v7

    .line 311
    .line 312
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 313
    .line 314
    sub-int/2addr v14, v12

    .line 315
    if-gt v13, v14, :cond_12

    .line 316
    .line 317
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgm;->zzc(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    add-int v13, v2, v12

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_12
    move v13, v2

    .line 325
    move/from16 v12, v24

    .line 326
    .line 327
    :goto_8
    invoke-interface {v1, v9, v10, v13}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 328
    .line 329
    .line 330
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 331
    .line 332
    add-int/2addr v14, v13

    .line 333
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 334
    .line 335
    move/from16 v13, v24

    .line 336
    .line 337
    invoke-virtual {v4, v13}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    if-ltz v14, :cond_14

    .line 345
    .line 346
    sub-int/2addr v14, v12

    .line 347
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 348
    .line 349
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzd:Lcom/google/android/gms/internal/ads/zzer;

    .line 350
    .line 351
    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 352
    .line 353
    .line 354
    move/from16 v17, v2

    .line 355
    .line 356
    move-object/from16 v13, v19

    .line 357
    .line 358
    const/4 v2, 0x4

    .line 359
    invoke-interface {v13, v14, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 360
    .line 361
    .line 362
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 363
    .line 364
    add-int/2addr v14, v2

    .line 365
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 366
    .line 367
    if-lez v12, :cond_13

    .line 368
    .line 369
    invoke-interface {v13, v4, v12}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 370
    .line 371
    .line 372
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 373
    .line 374
    add-int/2addr v14, v12

    .line 375
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 376
    .line 377
    invoke-static {v9, v2, v12, v3}, Lcom/google/android/gms/internal/ads/zzgm;->zzd([BIILcom/google/android/gms/internal/ads/zzv;)Z

    .line 378
    .line 379
    .line 380
    move-result v12

    .line 381
    if-eqz v12, :cond_13

    .line 382
    .line 383
    const/4 v2, 0x1

    .line 384
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 385
    .line 386
    move v12, v2

    .line 387
    move-object/from16 v19, v13

    .line 388
    .line 389
    move/from16 v2, v17

    .line 390
    .line 391
    :goto_9
    const/16 v24, 0x0

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_13
    move-object/from16 v19, v13

    .line 395
    .line 396
    :goto_a
    move/from16 v2, v17

    .line 397
    .line 398
    const/4 v12, 0x1

    .line 399
    goto :goto_9

    .line 400
    :cond_14
    const-string v1, "Invalid NAL length"

    .line 401
    .line 402
    const/4 v2, 0x0

    .line 403
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    throw v1

    .line 408
    :cond_15
    move/from16 v17, v2

    .line 409
    .line 410
    move-object/from16 v14, v19

    .line 411
    .line 412
    move/from16 v2, v24

    .line 413
    .line 414
    invoke-interface {v14, v1, v13, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 415
    .line 416
    .line 417
    move-result v12

    .line 418
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 419
    .line 420
    add-int/2addr v2, v12

    .line 421
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 422
    .line 423
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 424
    .line 425
    add-int/2addr v2, v12

    .line 426
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 427
    .line 428
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 429
    .line 430
    sub-int/2addr v2, v12

    .line 431
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 432
    .line 433
    goto :goto_a

    .line 434
    :cond_16
    move-object/from16 v14, v19

    .line 435
    .line 436
    :cond_17
    move/from16 v18, v8

    .line 437
    .line 438
    goto/16 :goto_c

    .line 439
    .line 440
    :cond_18
    move-object/from16 v14, v19

    .line 441
    .line 442
    const-string v2, "audio/ac4"

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-eqz v2, :cond_1a

    .line 449
    .line 450
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 451
    .line 452
    if-nez v2, :cond_19

    .line 453
    .line 454
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    .line 455
    .line 456
    invoke-static {v8, v2}, Lcom/google/android/gms/internal/ads/zzady;->zzc(ILcom/google/android/gms/internal/ads/zzer;)V

    .line 457
    .line 458
    .line 459
    const/4 v3, 0x7

    .line 460
    invoke-interface {v14, v2, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 461
    .line 462
    .line 463
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 464
    .line 465
    add-int/2addr v2, v3

    .line 466
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 467
    .line 468
    :cond_19
    add-int/lit8 v8, v8, 0x7

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_1a
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 472
    .line 473
    if-eqz v2, :cond_1c

    .line 474
    .line 475
    const-string v2, "audio/mpeg"

    .line 476
    .line 477
    invoke-static {v4, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_1c

    .line 482
    .line 483
    iget-object v2, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 484
    .line 485
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    .line 486
    .line 487
    const/4 v4, 0x4

    .line 488
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    const/4 v13, 0x0

    .line 496
    invoke-interface {v1, v9, v13, v4}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 497
    .line 498
    .line 499
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 500
    .line 501
    .line 502
    new-instance v4, Lcom/google/android/gms/internal/ads/zzafr;

    .line 503
    .line 504
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzafr;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzafr;->zza(I)Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    if-eqz v3, :cond_1b

    .line 516
    .line 517
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 518
    .line 519
    iget-object v9, v4, Lcom/google/android/gms/internal/ads/zzafr;->zzb:Ljava/lang/String;

    .line 520
    .line 521
    invoke-static {v3, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-nez v3, :cond_1b

    .line 526
    .line 527
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    iget-object v3, v4, Lcom/google/android/gms/internal/ads/zzafr;->zzb:Ljava/lang/String;

    .line 532
    .line 533
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    :cond_1b
    invoke-interface {v14, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 544
    .line 545
    .line 546
    const/4 v2, 0x0

    .line 547
    iput-object v2, v6, Lcom/google/android/gms/internal/ads/zzakv;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 548
    .line 549
    goto :goto_b

    .line 550
    :cond_1c
    if-eqz v5, :cond_1d

    .line 551
    .line 552
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzagi;->zzb(Lcom/google/android/gms/internal/ads/zzaev;)V

    .line 553
    .line 554
    .line 555
    :cond_1d
    :goto_b
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 556
    .line 557
    if-ge v2, v8, :cond_17

    .line 558
    .line 559
    sub-int v2, v8, v2

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    invoke-interface {v14, v1, v2, v13}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 567
    .line 568
    add-int/2addr v3, v2

    .line 569
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 570
    .line 571
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 572
    .line 573
    add-int/2addr v3, v2

    .line 574
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 575
    .line 576
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 577
    .line 578
    sub-int/2addr v3, v2

    .line 579
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 580
    .line 581
    goto :goto_b

    .line 582
    :goto_c
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/zzalf;->zzf:[J

    .line 583
    .line 584
    aget-wide v15, v1, v7

    .line 585
    .line 586
    iget-object v1, v11, Lcom/google/android/gms/internal/ads/zzalf;->zzg:[I

    .line 587
    .line 588
    aget v1, v1, v7

    .line 589
    .line 590
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 591
    .line 592
    if-nez v2, :cond_1e

    .line 593
    .line 594
    const/high16 v2, 0x4000000

    .line 595
    .line 596
    or-int/2addr v1, v2

    .line 597
    :cond_1e
    move/from16 v17, v1

    .line 598
    .line 599
    if-eqz v5, :cond_1f

    .line 600
    .line 601
    const/16 v20, 0x0

    .line 602
    .line 603
    const/16 v21, 0x0

    .line 604
    .line 605
    move/from16 v19, v18

    .line 606
    .line 607
    move/from16 v18, v17

    .line 608
    .line 609
    move-wide/from16 v16, v15

    .line 610
    .line 611
    move-object v15, v14

    .line 612
    move-object v14, v5

    .line 613
    invoke-virtual/range {v14 .. v21}, Lcom/google/android/gms/internal/ads/zzagi;->zzc(Lcom/google/android/gms/internal/ads/zzagh;JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 614
    .line 615
    .line 616
    move-object v1, v14

    .line 617
    move-object v14, v15

    .line 618
    const/16 v25, 0x1

    .line 619
    .line 620
    add-int/lit8 v7, v7, 0x1

    .line 621
    .line 622
    iget v2, v11, Lcom/google/android/gms/internal/ads/zzalf;->zzb:I

    .line 623
    .line 624
    if-ne v7, v2, :cond_20

    .line 625
    .line 626
    const/4 v2, 0x0

    .line 627
    invoke-virtual {v1, v14, v2}, Lcom/google/android/gms/internal/ads/zzagi;->zzd(Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzagg;)V

    .line 628
    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_1f
    const/16 v25, 0x1

    .line 632
    .line 633
    const/16 v19, 0x0

    .line 634
    .line 635
    const/16 v20, 0x0

    .line 636
    .line 637
    invoke-interface/range {v14 .. v20}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 638
    .line 639
    .line 640
    :cond_20
    :goto_d
    iget v1, v6, Lcom/google/android/gms/internal/ads/zzakv;->zze:I

    .line 641
    .line 642
    add-int/lit8 v1, v1, 0x1

    .line 643
    .line 644
    iput v1, v6, Lcom/google/android/gms/internal/ads/zzakv;->zze:I

    .line 645
    .line 646
    const/4 v1, -0x1

    .line 647
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzq:I

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 651
    .line 652
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 653
    .line 654
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 655
    .line 656
    iput-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 657
    .line 658
    return v13

    .line 659
    :goto_e
    iput-wide v8, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 660
    .line 661
    return v25

    .line 662
    :cond_21
    move/from16 v16, v8

    .line 663
    .line 664
    const-wide/32 v28, 0x40000

    .line 665
    .line 666
    .line 667
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 668
    .line 669
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 670
    .line 671
    int-to-long v7, v3

    .line 672
    sub-long/2addr v5, v7

    .line 673
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 674
    .line 675
    .line 676
    move-result-wide v7

    .line 677
    add-long/2addr v7, v5

    .line 678
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzp:Lcom/google/android/gms/internal/ads/zzer;

    .line 679
    .line 680
    if-eqz v3, :cond_27

    .line 681
    .line 682
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 683
    .line 684
    .line 685
    move-result-object v9

    .line 686
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 687
    .line 688
    long-to-int v5, v5

    .line 689
    invoke-interface {v1, v9, v10, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 690
    .line 691
    .line 692
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 693
    .line 694
    if-ne v5, v4, :cond_26

    .line 695
    .line 696
    const/4 v4, 0x1

    .line 697
    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzv:Z

    .line 698
    .line 699
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 703
    .line 704
    .line 705
    move-result v4

    .line 706
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzakw;->zzm(I)I

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    if-eqz v4, :cond_22

    .line 711
    .line 712
    goto :goto_f

    .line 713
    :cond_22
    const/4 v4, 0x4

    .line 714
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 715
    .line 716
    .line 717
    :cond_23
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 718
    .line 719
    .line 720
    move-result v4

    .line 721
    if-lez v4, :cond_24

    .line 722
    .line 723
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzakw;->zzm(I)I

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    if-eqz v4, :cond_23

    .line 732
    .line 733
    goto :goto_f

    .line 734
    :cond_24
    const/4 v4, 0x0

    .line 735
    :goto_f
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzA:I

    .line 736
    .line 737
    :cond_25
    :goto_10
    const/4 v13, 0x0

    .line 738
    goto :goto_11

    .line 739
    :cond_26
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    .line 740
    .line 741
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 742
    .line 743
    .line 744
    move-result v5

    .line 745
    if-nez v5, :cond_25

    .line 746
    .line 747
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfu;

    .line 752
    .line 753
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfv;

    .line 754
    .line 755
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 756
    .line 757
    invoke-direct {v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzfv;-><init>(ILcom/google/android/gms/internal/ads/zzer;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zza(Lcom/google/android/gms/internal/ads/zzfv;)V

    .line 761
    .line 762
    .line 763
    goto :goto_10

    .line 764
    :cond_27
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzv:Z

    .line 765
    .line 766
    if-nez v3, :cond_28

    .line 767
    .line 768
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 769
    .line 770
    const v4, 0x6d646174

    .line 771
    .line 772
    .line 773
    if-ne v3, v4, :cond_28

    .line 774
    .line 775
    const/4 v4, 0x1

    .line 776
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzA:I

    .line 777
    .line 778
    :cond_28
    cmp-long v3, v5, v28

    .line 779
    .line 780
    if-gez v3, :cond_29

    .line 781
    .line 782
    long-to-int v3, v5

    .line 783
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 784
    .line 785
    .line 786
    goto :goto_10

    .line 787
    :cond_29
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 788
    .line 789
    .line 790
    move-result-wide v3

    .line 791
    add-long/2addr v3, v5

    .line 792
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 793
    .line 794
    const/4 v13, 0x1

    .line 795
    :goto_11
    invoke-direct {v0, v7, v8}, Lcom/google/android/gms/internal/ads/zzakw;->zzk(J)V

    .line 796
    .line 797
    .line 798
    if-eqz v13, :cond_0

    .line 799
    .line 800
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 801
    .line 802
    move/from16 v15, v16

    .line 803
    .line 804
    if-eq v3, v15, :cond_0

    .line 805
    .line 806
    const/4 v3, 0x1

    .line 807
    return v3

    .line 808
    :cond_2a
    move-wide/from16 v30, v6

    .line 809
    .line 810
    move v15, v8

    .line 811
    move v3, v12

    .line 812
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 813
    .line 814
    if-nez v5, :cond_2e

    .line 815
    .line 816
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    .line 817
    .line 818
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    const/4 v13, 0x0

    .line 823
    invoke-interface {v1, v6, v13, v11, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzb([BIIZ)Z

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    if-nez v6, :cond_2d

    .line 828
    .line 829
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzA:I

    .line 830
    .line 831
    if-ne v1, v15, :cond_2c

    .line 832
    .line 833
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzc:I

    .line 834
    .line 835
    and-int/2addr v1, v15

    .line 836
    if-eqz v1, :cond_2c

    .line 837
    .line 838
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 839
    .line 840
    const/4 v4, 0x4

    .line 841
    invoke-interface {v1, v13, v4}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzB:Lcom/google/android/gms/internal/ads/zzahv;

    .line 846
    .line 847
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    if-nez v2, :cond_2b

    .line 853
    .line 854
    const/4 v5, 0x0

    .line 855
    goto :goto_12

    .line 856
    :cond_2b
    new-instance v5, Lcom/google/android/gms/internal/ads/zzap;

    .line 857
    .line 858
    const/4 v6, 0x1

    .line 859
    new-array v6, v6, [Lcom/google/android/gms/internal/ads/zzao;

    .line 860
    .line 861
    aput-object v2, v6, v13

    .line 862
    .line 863
    invoke-direct {v5, v3, v4, v6}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 864
    .line 865
    .line 866
    :goto_12
    new-instance v2, Lcom/google/android/gms/internal/ads/zzt;

    .line 867
    .line 868
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 879
    .line 880
    .line 881
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 882
    .line 883
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 884
    .line 885
    .line 886
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzx:Lcom/google/android/gms/internal/ads/zzaex;

    .line 887
    .line 888
    new-instance v2, Lcom/google/android/gms/internal/ads/zzafx;

    .line 889
    .line 890
    move-wide/from16 v5, v30

    .line 891
    .line 892
    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 893
    .line 894
    .line 895
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 896
    .line 897
    .line 898
    :cond_2c
    const/16 v22, -0x1

    .line 899
    .line 900
    return v22

    .line 901
    :cond_2d
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 902
    .line 903
    const/4 v13, 0x0

    .line 904
    invoke-virtual {v5, v13}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 908
    .line 909
    .line 910
    move-result-wide v6

    .line 911
    iput-wide v6, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 912
    .line 913
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 918
    .line 919
    :cond_2e
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 920
    .line 921
    const-wide/16 v7, 0x1

    .line 922
    .line 923
    cmp-long v3, v5, v7

    .line 924
    .line 925
    if-nez v3, :cond_2f

    .line 926
    .line 927
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    .line 928
    .line 929
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 930
    .line 931
    .line 932
    move-result-object v5

    .line 933
    invoke-interface {v1, v5, v11, v11}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 934
    .line 935
    .line 936
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 937
    .line 938
    add-int/2addr v5, v11

    .line 939
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 940
    .line 941
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 942
    .line 943
    .line 944
    move-result-wide v5

    .line 945
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 946
    .line 947
    goto :goto_14

    .line 948
    :cond_2f
    const-wide/16 v30, 0x0

    .line 949
    .line 950
    cmp-long v3, v5, v30

    .line 951
    .line 952
    if-nez v3, :cond_32

    .line 953
    .line 954
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 955
    .line 956
    .line 957
    move-result-wide v5

    .line 958
    const-wide/16 v7, -0x1

    .line 959
    .line 960
    cmp-long v3, v5, v7

    .line 961
    .line 962
    if-nez v3, :cond_31

    .line 963
    .line 964
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    .line 965
    .line 966
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfu;

    .line 971
    .line 972
    if-eqz v3, :cond_30

    .line 973
    .line 974
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzfu;->zza:J

    .line 975
    .line 976
    goto :goto_13

    .line 977
    :cond_30
    move-wide v5, v7

    .line 978
    :cond_31
    :goto_13
    cmp-long v3, v5, v7

    .line 979
    .line 980
    if-eqz v3, :cond_32

    .line 981
    .line 982
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 983
    .line 984
    .line 985
    move-result-wide v7

    .line 986
    sub-long/2addr v5, v7

    .line 987
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 988
    .line 989
    int-to-long v7, v3

    .line 990
    add-long/2addr v5, v7

    .line 991
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 992
    .line 993
    :cond_32
    :goto_14
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 994
    .line 995
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 996
    .line 997
    int-to-long v7, v3

    .line 998
    cmp-long v5, v5, v7

    .line 999
    .line 1000
    if-gez v5, :cond_34

    .line 1001
    .line 1002
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 1003
    .line 1004
    const v6, 0x66726565

    .line 1005
    .line 1006
    .line 1007
    if-ne v5, v6, :cond_33

    .line 1008
    .line 1009
    if-ne v3, v11, :cond_33

    .line 1010
    .line 1011
    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1012
    .line 1013
    move v3, v11

    .line 1014
    goto :goto_15

    .line 1015
    :cond_33
    const-string v1, "Atom size less than header length (unsupported)."

    .line 1016
    .line 1017
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    throw v1

    .line 1022
    :cond_34
    :goto_15
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 1023
    .line 1024
    const v6, 0x6d6f6f76

    .line 1025
    .line 1026
    .line 1027
    const v7, 0x6d657461

    .line 1028
    .line 1029
    .line 1030
    if-eq v5, v6, :cond_3b

    .line 1031
    .line 1032
    const v6, 0x7472616b

    .line 1033
    .line 1034
    .line 1035
    if-eq v5, v6, :cond_3b

    .line 1036
    .line 1037
    const v6, 0x6d646961

    .line 1038
    .line 1039
    .line 1040
    if-eq v5, v6, :cond_3b

    .line 1041
    .line 1042
    const v6, 0x6d696e66

    .line 1043
    .line 1044
    .line 1045
    if-eq v5, v6, :cond_3b

    .line 1046
    .line 1047
    const v6, 0x7374626c

    .line 1048
    .line 1049
    .line 1050
    if-eq v5, v6, :cond_3b

    .line 1051
    .line 1052
    const v6, 0x65647473

    .line 1053
    .line 1054
    .line 1055
    if-eq v5, v6, :cond_3b

    .line 1056
    .line 1057
    if-eq v5, v7, :cond_3b

    .line 1058
    .line 1059
    const v6, 0x61787465

    .line 1060
    .line 1061
    .line 1062
    if-ne v5, v6, :cond_35

    .line 1063
    .line 1064
    goto/16 :goto_19

    .line 1065
    .line 1066
    :cond_35
    const v6, 0x6d646864

    .line 1067
    .line 1068
    .line 1069
    if-eq v5, v6, :cond_38

    .line 1070
    .line 1071
    const v6, 0x6d766864

    .line 1072
    .line 1073
    .line 1074
    if-eq v5, v6, :cond_38

    .line 1075
    .line 1076
    const v6, 0x68646c72    # 4.3148E24f

    .line 1077
    .line 1078
    .line 1079
    if-eq v5, v6, :cond_38

    .line 1080
    .line 1081
    const v6, 0x73747364

    .line 1082
    .line 1083
    .line 1084
    if-eq v5, v6, :cond_38

    .line 1085
    .line 1086
    const v6, 0x73747473

    .line 1087
    .line 1088
    .line 1089
    if-eq v5, v6, :cond_38

    .line 1090
    .line 1091
    const v6, 0x73747373

    .line 1092
    .line 1093
    .line 1094
    if-eq v5, v6, :cond_38

    .line 1095
    .line 1096
    const v6, 0x63747473

    .line 1097
    .line 1098
    .line 1099
    if-eq v5, v6, :cond_38

    .line 1100
    .line 1101
    const v6, 0x656c7374

    .line 1102
    .line 1103
    .line 1104
    if-eq v5, v6, :cond_38

    .line 1105
    .line 1106
    const v6, 0x73747363

    .line 1107
    .line 1108
    .line 1109
    if-eq v5, v6, :cond_38

    .line 1110
    .line 1111
    const v6, 0x7374737a

    .line 1112
    .line 1113
    .line 1114
    if-eq v5, v6, :cond_38

    .line 1115
    .line 1116
    const v6, 0x73747a32

    .line 1117
    .line 1118
    .line 1119
    if-eq v5, v6, :cond_38

    .line 1120
    .line 1121
    const v6, 0x7374636f

    .line 1122
    .line 1123
    .line 1124
    if-eq v5, v6, :cond_38

    .line 1125
    .line 1126
    const v6, 0x636f3634

    .line 1127
    .line 1128
    .line 1129
    if-eq v5, v6, :cond_38

    .line 1130
    .line 1131
    const v6, 0x746b6864

    .line 1132
    .line 1133
    .line 1134
    if-eq v5, v6, :cond_38

    .line 1135
    .line 1136
    if-eq v5, v4, :cond_38

    .line 1137
    .line 1138
    const v4, 0x75647461

    .line 1139
    .line 1140
    .line 1141
    if-eq v5, v4, :cond_38

    .line 1142
    .line 1143
    const v4, 0x6b657973

    .line 1144
    .line 1145
    .line 1146
    if-eq v5, v4, :cond_38

    .line 1147
    .line 1148
    const v4, 0x696c7374

    .line 1149
    .line 1150
    .line 1151
    if-ne v5, v4, :cond_36

    .line 1152
    .line 1153
    goto :goto_16

    .line 1154
    :cond_36
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 1155
    .line 1156
    .line 1157
    move-result-wide v3

    .line 1158
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 1159
    .line 1160
    int-to-long v5, v5

    .line 1161
    sub-long v10, v3, v5

    .line 1162
    .line 1163
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 1164
    .line 1165
    const v4, 0x6d707664

    .line 1166
    .line 1167
    .line 1168
    if-ne v3, v4, :cond_37

    .line 1169
    .line 1170
    add-long v14, v10, v5

    .line 1171
    .line 1172
    new-instance v7, Lcom/google/android/gms/internal/ads/zzahv;

    .line 1173
    .line 1174
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1175
    .line 1176
    sub-long v16, v3, v5

    .line 1177
    .line 1178
    const-wide/16 v8, 0x0

    .line 1179
    .line 1180
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    invoke-direct/range {v7 .. v17}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(JJJJJ)V

    .line 1186
    .line 1187
    .line 1188
    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzB:Lcom/google/android/gms/internal/ads/zzahv;

    .line 1189
    .line 1190
    :cond_37
    const/4 v3, 0x0

    .line 1191
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzp:Lcom/google/android/gms/internal/ads/zzer;

    .line 1192
    .line 1193
    const/4 v4, 0x1

    .line 1194
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 1195
    .line 1196
    goto/16 :goto_0

    .line 1197
    .line 1198
    :cond_38
    :goto_16
    if-ne v3, v11, :cond_39

    .line 1199
    .line 1200
    const/4 v3, 0x1

    .line 1201
    goto :goto_17

    .line 1202
    :cond_39
    const/4 v3, 0x0

    .line 1203
    :goto_17
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 1204
    .line 1205
    .line 1206
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1207
    .line 1208
    const-wide/32 v5, 0x7fffffff

    .line 1209
    .line 1210
    .line 1211
    cmp-long v3, v3, v5

    .line 1212
    .line 1213
    if-gtz v3, :cond_3a

    .line 1214
    .line 1215
    const/4 v3, 0x1

    .line 1216
    goto :goto_18

    .line 1217
    :cond_3a
    const/4 v3, 0x0

    .line 1218
    :goto_18
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 1219
    .line 1220
    .line 1221
    new-instance v3, Lcom/google/android/gms/internal/ads/zzer;

    .line 1222
    .line 1223
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1224
    .line 1225
    long-to-int v4, v4

    .line 1226
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 1227
    .line 1228
    .line 1229
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    .line 1230
    .line 1231
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 1232
    .line 1233
    .line 1234
    move-result-object v4

    .line 1235
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 1236
    .line 1237
    .line 1238
    move-result-object v5

    .line 1239
    const/4 v13, 0x0

    .line 1240
    invoke-static {v4, v13, v5, v13, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1241
    .line 1242
    .line 1243
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzp:Lcom/google/android/gms/internal/ads/zzer;

    .line 1244
    .line 1245
    const/4 v4, 0x1

    .line 1246
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 1247
    .line 1248
    goto/16 :goto_0

    .line 1249
    .line 1250
    :cond_3b
    :goto_19
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 1251
    .line 1252
    .line 1253
    move-result-wide v3

    .line 1254
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1255
    .line 1256
    add-long/2addr v3, v5

    .line 1257
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 1258
    .line 1259
    int-to-long v8, v8

    .line 1260
    cmp-long v5, v5, v8

    .line 1261
    .line 1262
    if-eqz v5, :cond_3c

    .line 1263
    .line 1264
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 1265
    .line 1266
    if-ne v5, v7, :cond_3c

    .line 1267
    .line 1268
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzf:Lcom/google/android/gms/internal/ads/zzer;

    .line 1269
    .line 1270
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 1274
    .line 1275
    .line 1276
    move-result-object v6

    .line 1277
    const/4 v13, 0x0

    .line 1278
    invoke-interface {v1, v6, v13, v11}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzakh;->zzf(Lcom/google/android/gms/internal/ads/zzer;)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 1285
    .line 1286
    .line 1287
    move-result v5

    .line 1288
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 1289
    .line 1290
    .line 1291
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 1292
    .line 1293
    .line 1294
    :cond_3c
    sub-long/2addr v3, v8

    .line 1295
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    .line 1296
    .line 1297
    new-instance v6, Lcom/google/android/gms/internal/ads/zzfu;

    .line 1298
    .line 1299
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzm:I

    .line 1300
    .line 1301
    invoke-direct {v6, v7, v3, v4}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(IJ)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1305
    .line 1306
    .line 1307
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzn:J

    .line 1308
    .line 1309
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 1310
    .line 1311
    int-to-long v7, v7

    .line 1312
    cmp-long v5, v5, v7

    .line 1313
    .line 1314
    if-nez v5, :cond_3d

    .line 1315
    .line 1316
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzakw;->zzk(J)V

    .line 1317
    .line 1318
    .line 1319
    goto/16 :goto_0

    .line 1320
    .line 1321
    :cond_3d
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakw;->zzj()V

    .line 1322
    .line 1323
    .line 1324
    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzh:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzo:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzq:I

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzr:I

    .line 13
    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzs:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzt:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzu:Z

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmp-long p1, p1, v2

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzl:I

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzakw;->zzj()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzi:Lcom/google/android/gms/internal/ads/zzala;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzala;->zza()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzj:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzakw;->zzy:[Lcom/google/android/gms/internal/ads/zzakv;

    .line 47
    .line 48
    array-length p2, p1

    .line 49
    :goto_0
    if-ge v0, p2, :cond_4

    .line 50
    .line 51
    aget-object v2, p1, v0

    .line 52
    .line 53
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakv;->zzb:Lcom/google/android/gms/internal/ads/zzalf;

    .line 54
    .line 55
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzalf;->zza(J)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-ne v4, v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzalf;->zzb(J)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :cond_2
    iput v4, v2, Lcom/google/android/gms/internal/ads/zzakv;->zze:I

    .line 66
    .line 67
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzakv;->zzd:Lcom/google/android/gms/internal/ads/zzagi;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzagi;->zza()V

    .line 72
    .line 73
    .line 74
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method
