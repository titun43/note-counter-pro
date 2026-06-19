.class public final Lcom/google/android/gms/internal/ads/zzeii;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbgd;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzehn;

.field private final zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzbgd;Lcom/google/android/gms/internal/ads/zzehn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeii;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeii;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeii;->zza:Lcom/google/android/gms/internal/ads/zzbgd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeii;->zzc:Lcom/google/android/gms/internal/ads/zzehn;

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeii;->zzc:Lcom/google/android/gms/internal/ads/zzehn;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzeih;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzeih;-><init>(Lcom/google/android/gms/internal/ads/zzeii;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzehn;->zza(Lcom/google/android/gms/internal/ads/zzfmu;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 22
    .line 23
    const-string v0, "Error in offline signals database startup: "

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final zzb(ZLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v10, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeii;->zzb:Landroid/content/Context;

    .line 7
    .line 8
    const-string v2, "OfflineUpload.db"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v12, "serialized_proto_data"

    .line 21
    .line 22
    filled-new-array {v12}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const-string v3, "offline_signal_contents"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;->zzk([B)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzicg; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    sget v4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 63
    .line 64
    const-string v4, "Unable to deserialize proto from offline signals database:"

    .line 65
    .line 66
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 78
    .line 79
    .line 80
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeii;->zzb:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf;->zzB()Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzB(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 91
    .line 92
    .line 93
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzH(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzeic;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzo(I)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzj(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 107
    .line 108
    .line 109
    const/4 v4, 0x1

    .line 110
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzeic;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzs(I)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 115
    .line 116
    .line 117
    const/4 v5, 0x3

    .line 118
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzeic;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzQ(I)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Lx2/c;

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 135
    .line 136
    .line 137
    move-result-wide v5

    .line 138
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzw(J)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 139
    .line 140
    .line 141
    const/4 v5, 0x2

    .line 142
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzeic;->zzd(Landroid/database/sqlite/SQLiteDatabase;I)J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;->zzM(J)Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zzc;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Lcom/google/android/gms/internal/ads/zzbgj$zzaf;

    .line 154
    .line 155
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    const-wide/16 v7, 0x0

    .line 160
    .line 161
    move v9, v0

    .line 162
    move-wide v12, v7

    .line 163
    :goto_1
    if-ge v9, v6, :cond_3

    .line 164
    .line 165
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    check-cast v14, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;

    .line 170
    .line 171
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;->zzf()Lcom/google/android/gms/internal/ads/zzbgj$zzq;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgj$zzq;->zzb:Lcom/google/android/gms/internal/ads/zzbgj$zzq;

    .line 176
    .line 177
    if-ne v15, v0, :cond_2

    .line 178
    .line 179
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;->zzb()J

    .line 180
    .line 181
    .line 182
    move-result-wide v15

    .line 183
    cmp-long v0, v15, v12

    .line 184
    .line 185
    if-lez v0, :cond_2

    .line 186
    .line 187
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzbgj$zzaf$zza;->zzb()J

    .line 188
    .line 189
    .line 190
    move-result-wide v12

    .line 191
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    goto :goto_1

    .line 195
    :cond_3
    cmp-long v0, v12, v7

    .line 196
    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    new-instance v0, Landroid/content/ContentValues;

    .line 200
    .line 201
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 202
    .line 203
    .line 204
    const-string v6, "value"

    .line 205
    .line 206
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {v0, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 211
    .line 212
    .line 213
    const-string v6, "statistic_name = \'last_successful_request_time\'"

    .line 214
    .line 215
    const-string v7, "offline_signal_statistics"

    .line 216
    .line 217
    invoke-virtual {v2, v7, v0, v6, v10}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeii;->zza:Lcom/google/android/gms/internal/ads/zzbgd;

    .line 221
    .line 222
    new-instance v6, Lcom/google/android/gms/internal/ads/zzeif;

    .line 223
    .line 224
    invoke-direct {v6, v3}, Lcom/google/android/gms/internal/ads/zzeif;-><init>(Lcom/google/android/gms/internal/ads/zzbgj$zzaf;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzbgd;->zzb(Lcom/google/android/gms/internal/ads/zzbgc;)V

    .line 228
    .line 229
    .line 230
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzeii;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 231
    .line 232
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzar;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    iget v7, v3, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->buddyApkVersion:I

    .line 237
    .line 238
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;

    .line 239
    .line 240
    .line 241
    iget v7, v3, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->clientJarVersion:I

    .line 242
    .line 243
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;->zzg(I)Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;

    .line 244
    .line 245
    .line 246
    iget-boolean v3, v3, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->isClientJar:Z

    .line 247
    .line 248
    if-eq v4, v3, :cond_5

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_5
    const/4 v5, 0x0

    .line 252
    :goto_2
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;->zzk(I)Lcom/google/android/gms/internal/ads/zzbgj$zzar$zza;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Lcom/google/android/gms/internal/ads/zzbgj$zzar;

    .line 260
    .line 261
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeig;

    .line 262
    .line 263
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/zzeig;-><init>(Lcom/google/android/gms/internal/ads/zzbgj$zzar;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzbgd;->zzb(Lcom/google/android/gms/internal/ads/zzbgc;)V

    .line 267
    .line 268
    .line 269
    const/16 v3, 0x2714

    .line 270
    .line 271
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzbgd;->zzc(I)V

    .line 272
    .line 273
    .line 274
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzeic;->zzb(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 275
    .line 276
    .line 277
    :goto_3
    return-object v10
.end method
