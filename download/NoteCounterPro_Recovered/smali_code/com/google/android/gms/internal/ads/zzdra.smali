.class public final Lcom/google/android/gms/internal/ads/zzdra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgzy;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdrp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzdru;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzdxt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgzy;Lcom/google/android/gms/internal/ads/zzdrp;Lcom/google/android/gms/internal/ads/zzdru;Lcom/google/android/gms/internal/ads/zzdxt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdra;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzc:Lcom/google/android/gms/internal/ads/zzdru;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzd:Lcom/google/android/gms/internal/ads/zzdxt;

    return-void
.end method

.method private final zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcR:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdqx;

    .line 20
    .line 21
    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ads/zzdqx;-><init>(Lcom/google/android/gms/internal/ads/zzdra;Lcom/google/android/gms/internal/ads/zzdxh;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 25
    .line 26
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object p1
.end method

.method private static final zzf(Lorg/json/JSONObject;)Z
    .locals 1

    .line 1
    const-string v0, "template_id"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)Lj3/a;
    .locals 14

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzcM:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzd:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzz:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lx2/c;

    .line 38
    .line 39
    invoke-static {v4, v2, v3}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 43
    .line 44
    new-instance v3, Lcom/google/android/gms/internal/ads/zzdqz;

    .line 45
    .line 46
    move-object/from16 v4, p2

    .line 47
    .line 48
    invoke-direct {v3, p0, p1, v4, v1}, Lcom/google/android/gms/internal/ads/zzdqz;-><init>(Lcom/google/android/gms/internal/ads/zzdra;Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lorg/json/JSONObject;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzT:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 56
    .line 57
    invoke-direct {p0, v7, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    .line 61
    .line 62
    const-string v3, "images"

    .line 63
    .line 64
    sget-object v5, Lcom/google/android/gms/internal/ads/zzdxh;->zzU:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 65
    .line 66
    invoke-virtual {v2, v1, v3, v5}, Lcom/google/android/gms/internal/ads/zzdrp;->zzb(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzV:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 71
    .line 72
    invoke-direct {p0, v8, v3}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzfjc;->zzb:Lcom/google/android/gms/internal/ads/zzfjb;

    .line 76
    .line 77
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfjb;->zzb:Lcom/google/android/gms/internal/ads/zzfiu;

    .line 78
    .line 79
    move-object v0, v2

    .line 80
    const-string v2, "images"

    .line 81
    .line 82
    move-object v5, v4

    .line 83
    move-object v4, v3

    .line 84
    move-object v3, v5

    .line 85
    move-object/from16 v5, p4

    .line 86
    .line 87
    move-object/from16 v6, p5

    .line 88
    .line 89
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzdrp;->zzc(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)Lj3/a;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    move-object v3, v4

    .line 94
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzX:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 95
    .line 96
    invoke-direct {p0, v10, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 97
    .line 98
    .line 99
    const-string v2, "secondary_image"

    .line 100
    .line 101
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzY:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzdrp;->zza(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzZ:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 108
    .line 109
    invoke-direct {p0, v6, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 110
    .line 111
    .line 112
    const-string v2, "app_icon"

    .line 113
    .line 114
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzaa:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzdrp;->zza(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzab:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 121
    .line 122
    invoke-direct {p0, v9, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 123
    .line 124
    .line 125
    const-string v2, "attribution"

    .line 126
    .line 127
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzac:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 128
    .line 129
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzdrp;->zzd(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzad:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 134
    .line 135
    invoke-direct {p0, v11, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 136
    .line 137
    .line 138
    move-object/from16 v2, p2

    .line 139
    .line 140
    move-object/from16 v4, p4

    .line 141
    .line 142
    move-object/from16 v5, p5

    .line 143
    .line 144
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzdrp;->zzg(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)Lj3/a;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdxh;->zzaf:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 149
    .line 150
    invoke-direct {p0, v0, v2}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 151
    .line 152
    .line 153
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzow:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 154
    .line 155
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_3

    .line 170
    .line 171
    const-string v2, "video"

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_3

    .line 178
    .line 179
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const-string v3, "flags"

    .line 184
    .line 185
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_3

    .line 190
    .line 191
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-nez v2, :cond_1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_1
    const/4 v3, 0x0

    .line 199
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-ge v3, v4, :cond_3

    .line 204
    .line 205
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-eqz v4, :cond_2

    .line 210
    .line 211
    const-string v5, "key"

    .line 212
    .line 213
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    const-string v12, "afma_video_player_type"

    .line 218
    .line 219
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_2

    .line 224
    .line 225
    :try_start_0
    const-string v2, "value"

    .line 226
    .line 227
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    const/4 v3, 0x3

    .line 236
    if-ne v2, v3, :cond_3

    .line 237
    .line 238
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    .line 239
    .line 240
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzdrp;->zzf(Lj3/a;)Lj3/a;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzai:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 245
    .line 246
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    goto :goto_0

    .line 253
    :catch_0
    :cond_3
    :goto_1
    new-instance v2, Landroid/os/Bundle;

    .line 254
    .line 255
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    :goto_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzc:Lcom/google/android/gms/internal/ads/zzdru;

    .line 263
    .line 264
    const-string v4, "custom_assets"

    .line 265
    .line 266
    invoke-virtual {v3, v1, v4}, Lcom/google/android/gms/internal/ads/zzdru;->zza(Lorg/json/JSONObject;Ljava/lang/String;)Lj3/a;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    sget-object v3, Lcom/google/android/gms/internal/ads/zzdxh;->zzak:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 271
    .line 272
    invoke-direct {p0, v12, v3}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 273
    .line 274
    .line 275
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzb:Lcom/google/android/gms/internal/ads/zzdrp;

    .line 276
    .line 277
    move-object/from16 v4, p4

    .line 278
    .line 279
    move-object/from16 v5, p5

    .line 280
    .line 281
    invoke-virtual {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzdrp;->zze(Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/zzb;Lcom/google/android/gms/internal/ads/zzcce;)Lj3/a;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzam:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 286
    .line 287
    invoke-direct {p0, v3, v4}, Lcom/google/android/gms/internal/ads/zzdra;->zze(Lj3/a;Lcom/google/android/gms/internal/ads/zzdxh;)Lj3/a;

    .line 288
    .line 289
    .line 290
    new-instance v4, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzgq:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 323
    .line 324
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 325
    .line 326
    .line 327
    move-result-object v13

    .line 328
    invoke-virtual {v13, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    check-cast v5, Ljava/lang/Boolean;

    .line 333
    .line 334
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-eqz v5, :cond_4

    .line 339
    .line 340
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdra;->zzf(Lorg/json/JSONObject;)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_5

    .line 345
    .line 346
    :cond_4
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    :cond_5
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgzo;->zzn(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgzn;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    move-object v5, v6

    .line 354
    move-object v6, v11

    .line 355
    move-object v11, v3

    .line 356
    move-object v3, v8

    .line 357
    move-object v8, v0

    .line 358
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdqy;

    .line 359
    .line 360
    move-object v4, v9

    .line 361
    move-object v9, v2

    .line 362
    move-object v2, v7

    .line 363
    move-object v7, v1

    .line 364
    move-object v1, p0

    .line 365
    invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/ads/zzdqy;-><init>(Lcom/google/android/gms/internal/ads/zzdra;Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lorg/json/JSONObject;Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lj3/a;)V

    .line 366
    .line 367
    .line 368
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdra;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 369
    .line 370
    invoke-virtual {v13, v0, v2}, Lcom/google/android/gms/internal/ads/zzgzn;->zza(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzdoh;
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcR:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzd:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdxh;->zzS:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lx2/c;

    .line 36
    .line 37
    invoke-static {v2, v0, v1}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdoh;

    .line 41
    .line 42
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzdoh;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v1, "template_id"

    .line 46
    .line 47
    const/4 v2, -0x1

    .line 48
    invoke-virtual {p3, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zza(I)V

    .line 53
    .line 54
    .line 55
    const-string v1, "custom_template_id"

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzl(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v1, "omid_settings"

    .line 65
    .line 66
    invoke-virtual {p3, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v2, 0x0

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    const-string v3, "omid_partner_name"

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object v1, v2

    .line 81
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzv(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdoh;->zzx()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    const/4 v3, 0x1

    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdoh;->zzx()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    const/4 v4, 0x3

    .line 110
    if-ne v1, v4, :cond_4

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdoh;->zzS()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfjk;->zzi:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdoh;->zzS()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_2

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 132
    .line 133
    const-string p2, "Unexpected custom template id in the response."

    .line 134
    .line 135
    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 140
    .line 141
    const-string p2, "No custom template id for custom template ad response."

    .line 142
    .line 143
    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_4
    :goto_1
    const-string p1, "rating"

    .line 148
    .line 149
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 150
    .line 151
    invoke-virtual {p3, p1, v5, v6}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v5

    .line 155
    invoke-virtual {v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzdoh;->zzi(D)V

    .line 156
    .line 157
    .line 158
    const-string p1, "headline"

    .line 159
    .line 160
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzM:Z

    .line 165
    .line 166
    if-eqz p2, :cond_5

    .line 167
    .line 168
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzD()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    add-int/2addr v3, v4

    .line 184
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    new-instance v5, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    add-int/2addr v3, v4

    .line 195
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 196
    .line 197
    .line 198
    const-string v3, " : "

    .line 199
    .line 200
    invoke-static {v5, p2, v3, v1}, Landroidx/fragment/app/h1;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    :cond_5
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string p1, "body"

    .line 208
    .line 209
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string p1, "call_to_action"

    .line 217
    .line 218
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const-string p1, "store"

    .line 226
    .line 227
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const-string p1, "price"

    .line 235
    .line 236
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    const-string p1, "advertiser"

    .line 244
    .line 245
    invoke-virtual {p3, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-object v0

    .line 253
    :cond_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 254
    .line 255
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdoh;->zzx()I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p3

    .line 263
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    new-instance v0, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    add-int/lit8 p3, p3, 0x15

    .line 270
    .line 271
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 272
    .line 273
    .line 274
    const-string p3, "Invalid template ID: "

    .line 275
    .line 276
    invoke-static {v0, p3, p2}, Landroidx/emoji2/text/u;->l(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1
.end method

.method public final zzc(Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lorg/json/JSONObject;Lj3/a;Lj3/a;Lj3/a;Lj3/a;Lj3/a;)Lcom/google/android/gms/internal/ads/zzdoh;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcM:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzd:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdxh;->zzA:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lx2/c;

    .line 36
    .line 37
    invoke-static {v2, v0, v1}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdoh;

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzd(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lcom/google/android/gms/internal/ads/zzbks;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzj(Lcom/google/android/gms/internal/ads/zzbks;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lcom/google/android/gms/internal/ads/zzbks;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzk(Lcom/google/android/gms/internal/ads/zzbks;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lcom/google/android/gms/internal/ads/zzbkl;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzc(Lcom/google/android/gms/internal/ads/zzbkl;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p6}, Lcom/google/android/gms/internal/ads/zzdrp;->zzl(Lorg/json/JSONObject;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zze(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p6}, Lcom/google/android/gms/internal/ads/zzdrp;->zzk(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/client/zzez;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzf(Lcom/google/android/gms/ads/internal/client/zzez;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Lcom/google/android/gms/internal/ads/zzcjl;

    .line 101
    .line 102
    if-eqz p2, :cond_1

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzm(Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcjl;->zzE()Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzdoh;->zzg(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcjl;->zzh()Lcom/google/android/gms/internal/ads/zzckr;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzb(Lcom/google/android/gms/ads/internal/client/zzed;)V

    .line 119
    .line 120
    .line 121
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdoh;->zzH()Landroid/os/Bundle;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-interface {p8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    check-cast p3, Landroid/os/Bundle;

    .line 130
    .line 131
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {p9}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    check-cast p2, Lcom/google/android/gms/internal/ads/zzcjl;

    .line 139
    .line 140
    if-eqz p2, :cond_2

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzn(Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcjl;->zzE()Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzh(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zzgq:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 153
    .line 154
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    check-cast p2, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_3

    .line 169
    .line 170
    invoke-static {p6}, Lcom/google/android/gms/internal/ads/zzdra;->zzf(Lorg/json/JSONObject;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p2, :cond_3

    .line 175
    .line 176
    invoke-virtual {p1, p10}, Lcom/google/android/gms/internal/ads/zzdoh;->zzp(Lj3/a;)V

    .line 177
    .line 178
    .line 179
    new-instance p2, Lcom/google/android/gms/internal/ads/zzcen;

    .line 180
    .line 181
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzcen;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzr(Lcom/google/android/gms/internal/ads/zzcen;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_3
    invoke-interface {p10}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    check-cast p2, Lcom/google/android/gms/internal/ads/zzcjl;

    .line 193
    .line 194
    if-eqz p2, :cond_4

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzo(Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 197
    .line 198
    .line 199
    :cond_4
    :goto_0
    invoke-interface {p11}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    check-cast p2, Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    if-eqz p3, :cond_6

    .line 214
    .line 215
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    check-cast p3, Lcom/google/android/gms/internal/ads/zzdrr;

    .line 220
    .line 221
    iget p4, p3, Lcom/google/android/gms/internal/ads/zzdrr;->zza:I

    .line 222
    .line 223
    const/4 p5, 0x1

    .line 224
    if-eq p4, p5, :cond_5

    .line 225
    .line 226
    iget-object p4, p3, Lcom/google/android/gms/internal/ads/zzdrr;->zzb:Ljava/lang/String;

    .line 227
    .line 228
    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzdrr;->zzd:Lcom/google/android/gms/internal/ads/zzbkd;

    .line 229
    .line 230
    invoke-virtual {p1, p4, p3}, Lcom/google/android/gms/internal/ads/zzdoh;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbkd;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_5
    iget-object p4, p3, Lcom/google/android/gms/internal/ads/zzdrr;->zzb:Ljava/lang/String;

    .line 235
    .line 236
    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzdrr;->zzc:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {p1, p4, p3}, Lcom/google/android/gms/internal/ads/zzdoh;->zzs(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_6
    return-object p1
.end method

.method public final synthetic zzd()Lcom/google/android/gms/internal/ads/zzdxt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdra;->zzd:Lcom/google/android/gms/internal/ads/zzdxt;

    return-object v0
.end method
