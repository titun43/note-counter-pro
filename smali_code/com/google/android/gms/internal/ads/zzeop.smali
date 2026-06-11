.class final Lcom/google/android/gms/internal/ads/zzeop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdmc;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzduv;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfir;

.field private final zzf:Lj3/a;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzcjl;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzbok;

.field private final zzi:Z

.field private final zzj:Lcom/google/android/gms/internal/ads/zzejf;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzdxt;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzdxz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzduv;Lcom/google/android/gms/internal/ads/zzfjk;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzfir;Lj3/a;Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzbok;ZLcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzdxt;Lcom/google/android/gms/internal/ads/zzdxz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeop;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzb:Lcom/google/android/gms/internal/ads/zzduv;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzc:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeop;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzf:Lj3/a;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzg:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzh:Lcom/google/android/gms/internal/ads/zzbok;

    .line 19
    .line 20
    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzi:Z

    .line 21
    .line 22
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzj:Lcom/google/android/gms/internal/ads/zzejf;

    .line 23
    .line 24
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzk:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 25
    .line 26
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzeop;->zzl:Lcom/google/android/gms/internal/ads/zzdxz;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdbs;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzf:Lj3/a;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzt(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/android/gms/internal/ads/zzdua;

    .line 10
    .line 11
    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzeop;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    .line 12
    .line 13
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzg:Lcom/google/android/gms/internal/ads/zzcjl;

    .line 14
    .line 15
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjl;->zzaB()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzbt:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzb:Lcom/google/android/gms/internal/ads/zzduv;

    .line 43
    .line 44
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzc:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 45
    .line 46
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfjk;->zzf:Lcom/google/android/gms/ads/internal/client/zzr;

    .line 47
    .line 48
    invoke-virtual {v3, v4, v6, v6}, Lcom/google/android/gms/internal/ads/zzduv;->zza(Lcom/google/android/gms/ads/internal/client/zzr;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;)Lcom/google/android/gms/internal/ads/zzcjl;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzk()Lcom/google/android/gms/internal/ads/zzdjv;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzbpa;->zzb(Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzboz;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Lcom/google/android/gms/internal/ads/zzduz;

    .line 60
    .line 61
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzduz;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzl()Lcom/google/android/gms/internal/ads/zzduu;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzi:Z

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzh:Lcom/google/android/gms/internal/ads/zzbok;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception v0

    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_1
    move-object v8, v6

    .line 79
    :goto_0
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzk:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 80
    .line 81
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v7, v3, v5, v8, v9}, Lcom/google/android/gms/internal/ads/zzduu;->zzi(Lcom/google/android/gms/internal/ads/zzcjl;ZLcom/google/android/gms/internal/ads/zzbok;Landroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjl;->zzP()Lcom/google/android/gms/internal/ads/zzclj;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    new-instance v8, Lcom/google/android/gms/internal/ads/zzeoo;

    .line 93
    .line 94
    invoke-direct {v8, v4, v3}, Lcom/google/android/gms/internal/ads/zzeoo;-><init>(Lcom/google/android/gms/internal/ads/zzduz;Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v7, v8}, Lcom/google/android/gms/internal/ads/zzclj;->zzG(Lcom/google/android/gms/internal/ads/zzclh;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzcjl;->zzP()Lcom/google/android/gms/internal/ads/zzclj;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    new-instance v7, Lcom/google/android/gms/internal/ads/zzeon;

    .line 105
    .line 106
    invoke-direct {v7, v3}, Lcom/google/android/gms/internal/ads/zzeon;-><init>(Lcom/google/android/gms/internal/ads/zzcjl;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v4, v7}, Lcom/google/android/gms/internal/ads/zzclj;->zzH(Lcom/google/android/gms/internal/ads/zzcli;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    .line 113
    .line 114
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzfiw;->zzb:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfiw;->zza:Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v3, v4, v2, v6}, Lcom/google/android/gms/internal/ads/zzcjl;->zzau(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzcka; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    :cond_2
    :goto_1
    move-object v10, v3

    .line 122
    invoke-interface {v10, v5}, Lcom/google/android/gms/internal/ads/zzcjl;->zzag(Z)V

    .line 123
    .line 124
    .line 125
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzi:Z

    .line 126
    .line 127
    new-instance v14, Lcom/google/android/gms/ads/internal/zzl;

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzh:Lcom/google/android/gms/internal/ads/zzbok;

    .line 133
    .line 134
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbok;->zzc(Z)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    move v12, v4

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    move v12, v3

    .line 141
    :goto_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 142
    .line 143
    .line 144
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzeop;->zza:Landroid/content/Context;

    .line 145
    .line 146
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zzs;->zzN(Landroid/content/Context;)Z

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    if-eqz v2, :cond_4

    .line 151
    .line 152
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzh:Lcom/google/android/gms/internal/ads/zzbok;

    .line 153
    .line 154
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzbok;->zzd()Z

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_4

    .line 159
    .line 160
    move v3, v5

    .line 161
    :cond_4
    if-eqz v2, :cond_5

    .line 162
    .line 163
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzh:Lcom/google/android/gms/internal/ads/zzbok;

    .line 164
    .line 165
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbok;->zze()F

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    :goto_3
    move v15, v2

    .line 170
    goto :goto_4

    .line 171
    :cond_5
    const/4 v2, 0x0

    .line 172
    goto :goto_3

    .line 173
    :goto_4
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzeop;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    .line 174
    .line 175
    iget-boolean v4, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzO:Z

    .line 176
    .line 177
    iget-boolean v7, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzP:Z

    .line 178
    .line 179
    const/16 v16, -0x1

    .line 180
    .line 181
    move/from16 v17, p1

    .line 182
    .line 183
    move/from16 v18, v4

    .line 184
    .line 185
    move/from16 v19, v7

    .line 186
    .line 187
    move-object v11, v14

    .line 188
    move v14, v3

    .line 189
    invoke-direct/range {v11 .. v19}, Lcom/google/android/gms/ads/internal/zzl;-><init>(ZZZFIZZZ)V

    .line 190
    .line 191
    .line 192
    move-object v14, v11

    .line 193
    if-eqz p3, :cond_6

    .line 194
    .line 195
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/zzdbs;->zzb()V

    .line 196
    .line 197
    .line 198
    :cond_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzb()Lcom/google/android/gms/ads/internal/overlay/zzn;

    .line 199
    .line 200
    .line 201
    move-object v3, v6

    .line 202
    new-instance v6, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdua;->zzj()Lcom/google/android/gms/internal/ads/zzdlr;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    iget v11, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzQ:I

    .line 209
    .line 210
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 211
    .line 212
    iget-object v13, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzB:Ljava/lang/String;

    .line 213
    .line 214
    iget-object v0, v2, Lcom/google/android/gms/internal/ads/zzfir;->zzs:Lcom/google/android/gms/internal/ads/zzfiw;

    .line 215
    .line 216
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzfiw;->zzb:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfiw;->zza:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzc:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 221
    .line 222
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfir;->zzb()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_7

    .line 227
    .line 228
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzj:Lcom/google/android/gms/internal/ads/zzejf;

    .line 229
    .line 230
    move-object/from16 v19, v2

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_7
    move-object/from16 v19, v3

    .line 234
    .line 235
    :goto_5
    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 236
    .line 237
    invoke-interface {v10}, Lcom/google/android/gms/internal/ads/zzcge;->zzn()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v20

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v9, 0x0

    .line 243
    move-object/from16 v18, p3

    .line 244
    .line 245
    move-object/from16 v16, v0

    .line 246
    .line 247
    move-object/from16 v17, v2

    .line 248
    .line 249
    invoke-direct/range {v6 .. v20}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/ads/internal/client/zza;Lcom/google/android/gms/ads/internal/overlay/zzr;Lcom/google/android/gms/ads/internal/overlay/zzad;Lcom/google/android/gms/internal/ads/zzcjl;ILcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/ads/internal/zzl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdbs;Lcom/google/android/gms/internal/ads/zzbxl;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeop;->zzl:Lcom/google/android/gms/internal/ads/zzdxz;

    .line 253
    .line 254
    move-object/from16 v2, p2

    .line 255
    .line 256
    invoke-static {v2, v6, v5, v0}, Lcom/google/android/gms/ads/internal/overlay/zzn;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLcom/google/android/gms/internal/ads/zzdxz;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :goto_6
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 261
    .line 262
    const-string v2, ""

    .line 263
    .line 264
    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfir;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeop;->zze:Lcom/google/android/gms/internal/ads/zzfir;

    return-object v0
.end method
