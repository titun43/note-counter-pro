.class public final Lcom/google/android/gms/internal/ads/zzfqg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzenr;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfjd;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfje;

.field private final zzh:Lx2/b;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzazh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzenr;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfjd;Lcom/google/android/gms/internal/ads/zzfje;Lx2/b;Lcom/google/android/gms/internal/ads/zzazh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zza:Lcom/google/android/gms/internal/ads/zzenr;

    .line 5
    .line 6
    iget-object p1, p2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzc:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzd:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zze:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzf:Lcom/google/android/gms/internal/ads/zzfjd;

    .line 17
    .line 18
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzg:Lcom/google/android/gms/internal/ads/zzfje;

    .line 19
    .line 20
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzh:Lx2/b;

    .line 21
    .line 22
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzi:Lcom/google/android/gms/internal/ads/zzazh;

    .line 23
    .line 24
    return-void
.end method

.method public static zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const-string p2, ""

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic zze(Lcom/google/android/gms/internal/ads/zzfjd;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfjd;->zza:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfqg;->zzg(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/ads/zzfjd;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfjd;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfqg;->zzg(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static zzg(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zzj()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p0, "fakeForAdDebugLog"

    .line 17
    .line 18
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    const/4 v7, 0x0

    .line 2
    const/4 v8, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    const-string v4, ""

    .line 5
    .line 6
    const-string v5, ""

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v6, p3

    .line 12
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzfqg;->zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzczz;Lcom/google/android/gms/internal/ads/zzcdv;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzczz;Lcom/google/android/gms/internal/ads/zzcdv;)Ljava/util/List;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_e

    .line 21
    .line 22
    const-string v5, "1"

    .line 23
    .line 24
    const-string v6, "0"

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    move/from16 v8, p3

    .line 28
    .line 29
    if-eq v7, v8, :cond_0

    .line 30
    .line 31
    move-object v9, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-object v9, v5

    .line 34
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    check-cast v10, Ljava/lang/String;

    .line 39
    .line 40
    move-object/from16 v11, p1

    .line 41
    .line 42
    iget-object v12, v11, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 43
    .line 44
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 45
    .line 46
    const-string v13, "@gw_adlocid@"

    .line 47
    .line 48
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v10, v13, v12}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    const-string v12, "@gw_adnetrefresh@"

    .line 55
    .line 56
    invoke-static {v10, v12, v9}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zzb:Ljava/lang/String;

    .line 61
    .line 62
    const-string v12, "@gw_sdkver@"

    .line 63
    .line 64
    invoke-static {v9, v12, v10}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    const-string v10, ""

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    const-string v12, "@gw_qdata@"

    .line 73
    .line 74
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzy:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const-string v12, "@gw_adnetid@"

    .line 81
    .line 82
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzx:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    const-string v12, "@gw_allocid@"

    .line 89
    .line 90
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzw:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zze:Landroid/content/Context;

    .line 97
    .line 98
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzaw:Ljava/util/Map;

    .line 99
    .line 100
    iget-boolean v14, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzW:Z

    .line 101
    .line 102
    invoke-static {v9, v12, v14, v13}, Lcom/google/android/gms/internal/ads/zzccs;->zza(Ljava/lang/String;Landroid/content/Context;ZLjava/util/Map;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    sget-object v13, Lcom/google/android/gms/internal/ads/zzbhe;->zzoY:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 107
    .line 108
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    check-cast v13, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_2

    .line 123
    .line 124
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzfir;->zze:I

    .line 125
    .line 126
    const/4 v14, 0x4

    .line 127
    if-ne v13, v14, :cond_2

    .line 128
    .line 129
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 130
    .line 131
    .line 132
    invoke-static {v12}, Lcom/google/android/gms/ads/internal/util/zzs;->zzL(Landroid/content/Context;)Z

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    if-eq v7, v12, :cond_1

    .line 137
    .line 138
    move-object v5, v6

    .line 139
    :cond_1
    const-string v6, "@gw_aps@"

    .line 140
    .line 141
    invoke-static {v9, v6, v5}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    move-object v9, v5

    .line 146
    :cond_2
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzpj:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 147
    .line 148
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_6

    .line 163
    .line 164
    if-eqz v2, :cond_6

    .line 165
    .line 166
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzcdv;->zza:I

    .line 167
    .line 168
    if-ltz v5, :cond_3

    .line 169
    .line 170
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    goto :goto_2

    .line 175
    :cond_3
    move-object v5, v10

    .line 176
    :goto_2
    const-string v6, "@gw_is@"

    .line 177
    .line 178
    invoke-static {v9, v6, v5}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzcdv;->zzb:I

    .line 183
    .line 184
    if-ltz v6, :cond_4

    .line 185
    .line 186
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    goto :goto_3

    .line 191
    :cond_4
    move-object v6, v10

    .line 192
    :goto_3
    const-string v9, "@gw_fis@"

    .line 193
    .line 194
    invoke-static {v5, v9, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzcdv;->zzc:I

    .line 199
    .line 200
    if-ltz v6, :cond_5

    .line 201
    .line 202
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    goto :goto_4

    .line 207
    :cond_5
    move-object v6, v10

    .line 208
    :goto_4
    const-string v9, "@gw_sfis@"

    .line 209
    .line 210
    invoke-static {v5, v9, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    :cond_6
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zza:Lcom/google/android/gms/internal/ads/zzenr;

    .line 215
    .line 216
    const-string v6, "@gw_adnetstatus@"

    .line 217
    .line 218
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzenr;->zzg()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-static {v9, v6, v12}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzenr;->zzh()J

    .line 227
    .line 228
    .line 229
    move-result-wide v12

    .line 230
    const/16 v5, 0xa

    .line 231
    .line 232
    invoke-static {v12, v13, v5}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    const-string v12, "@gw_ttr@"

    .line 237
    .line 238
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zzc:Ljava/lang/String;

    .line 243
    .line 244
    const-string v12, "@gw_seqnum@"

    .line 245
    .line 246
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zzd:Ljava/lang/String;

    .line 251
    .line 252
    const-string v12, "@gw_sessid@"

    .line 253
    .line 254
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzph:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 259
    .line 260
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    check-cast v9, Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    if-eqz v9, :cond_8

    .line 275
    .line 276
    const-string v9, "@gw_placement_id@"

    .line 277
    .line 278
    if-eqz p7, :cond_7

    .line 279
    .line 280
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/gms/internal/ads/zzczz;->zza()J

    .line 281
    .line 282
    .line 283
    move-result-wide v12

    .line 284
    const-wide/16 v14, 0x0

    .line 285
    .line 286
    cmp-long v12, v12, v14

    .line 287
    .line 288
    if-lez v12, :cond_7

    .line 289
    .line 290
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/gms/internal/ads/zzczz;->zza()J

    .line 291
    .line 292
    .line 293
    move-result-wide v12

    .line 294
    invoke-static {v12, v13, v5}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-static {v6, v9, v5}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    goto :goto_5

    .line 303
    :cond_7
    invoke-static {v6, v9, v10}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    :cond_8
    :goto_5
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzes:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 308
    .line 309
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    check-cast v5, Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    const/4 v9, 0x0

    .line 324
    if-eqz v5, :cond_9

    .line 325
    .line 326
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-nez v5, :cond_9

    .line 331
    .line 332
    move v9, v7

    .line 333
    :cond_9
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    xor-int/lit8 v10, v5, 0x1

    .line 338
    .line 339
    if-nez v9, :cond_b

    .line 340
    .line 341
    if-nez v5, :cond_a

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_a
    move-object/from16 v9, p4

    .line 345
    .line 346
    move-object/from16 v7, p5

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_b
    move v7, v10

    .line 350
    :goto_6
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzfqg;->zzi:Lcom/google/android/gms/internal/ads/zzazh;

    .line 355
    .line 356
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzazh;->zza(Landroid/net/Uri;)Z

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-eqz v5, :cond_a

    .line 361
    .line 362
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    if-eqz v9, :cond_c

    .line 371
    .line 372
    const-string v6, "ms"

    .line 373
    .line 374
    move-object/from16 v9, p4

    .line 375
    .line 376
    invoke-virtual {v5, v6, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    goto :goto_7

    .line 381
    :cond_c
    move-object/from16 v9, p4

    .line 382
    .line 383
    :goto_7
    if-eqz v7, :cond_d

    .line 384
    .line 385
    const-string v6, "attok"

    .line 386
    .line 387
    move-object/from16 v7, p5

    .line 388
    .line 389
    invoke-virtual {v5, v6, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    goto :goto_8

    .line 394
    :cond_d
    move-object/from16 v7, p5

    .line 395
    .line 396
    :goto_8
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    :goto_9
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_e
    return-object v3
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzfir;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzcag;)Ljava/util/List;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzh:Lx2/b;

    .line 7
    .line 8
    check-cast v1, Lx2/c;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    :try_start_0
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcag;->zzb()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcag;->zzc()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzet:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 30
    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzg:Lcom/google/android/gms/internal/ads/zzfje;

    .line 48
    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgra;->zzc()Lcom/google/android/gms/internal/ads/zzgra;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfje;->zza:Lcom/google/android/gms/internal/ads/zzfjd;

    .line 57
    .line 58
    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgra;->zzd(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgra;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzf:Lcom/google/android/gms/internal/ads/zzfjd;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfqf;->zza:Lcom/google/android/gms/internal/ads/zzfqf;

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzgra;->zzb(Lcom/google/android/gms/internal/ads/zzgqt;)Lcom/google/android/gms/internal/ads/zzgra;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v6, ""

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgra;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfqe;->zza:Lcom/google/android/gms/internal/ads/zzfqe;

    .line 81
    .line 82
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzgra;->zzb(Lcom/google/android/gms/internal/ads/zzgqt;)Lcom/google/android/gms/internal/ads/zzgra;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzgra;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v5}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    const-string v8, "@gw_rwd_userid@"

    .line 113
    .line 114
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const-string v8, "@gw_rwd_custom_data@"

    .line 123
    .line 124
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const-string v8, "@gw_tmstmp@"

    .line 133
    .line 134
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    const-string v8, "@gw_rwd_itm@"

    .line 143
    .line 144
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const-string v7, "@gw_rwd_amt@"

    .line 149
    .line 150
    invoke-static {v6, v7, p3}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zzb:Ljava/lang/String;

    .line 155
    .line 156
    const-string v8, "@gw_sdkver@"

    .line 157
    .line 158
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzfqg;->zze:Landroid/content/Context;

    .line 163
    .line 164
    iget-boolean v8, p1, Lcom/google/android/gms/internal/ads/zzfir;->zzW:Z

    .line 165
    .line 166
    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzfir;->zzaw:Ljava/util/Map;

    .line 167
    .line 168
    invoke-static {v6, v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzccs;->zza(Ljava/lang/String;Landroid/content/Context;ZLjava/util/Map;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    return-object v0

    .line 177
    :catch_0
    move-exception p1

    .line 178
    sget p2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 179
    .line 180
    const-string p2, "Unable to determine award type and amount."

    .line 181
    .line 182
    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    return-object v0
.end method
