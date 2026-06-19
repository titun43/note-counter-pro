.class public abstract Lcom/google/android/gms/internal/ads/zzeng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzekg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zzd(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;)Z
    .locals 1

    .line 1
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzv:Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string p2, "pubid"

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfjc;Lcom/google/android/gms/internal/ads/zzfir;)Lj3/a;
    .locals 39

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzv:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v3, "pubid"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfjc;->zza:Lcom/google/android/gms/internal/ads/zzfiz;

    .line 16
    .line 17
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfiz;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 18
    .line 19
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfjj;

    .line 20
    .line 21
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzfjj;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzfjj;->zzz(Lcom/google/android/gms/internal/ads/zzfjk;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzfjj;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzfjj;->zzy(Z)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 32
    .line 33
    .line 34
    iget-object v6, v4, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 35
    .line 36
    iget-object v7, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzm:Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzeng;->zzd(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const-string v8, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 43
    .line 44
    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzeng;->zzd(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    const-string v9, "gw"

    .line 53
    .line 54
    invoke-virtual {v12, v9, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    const-string v9, "mad_hac"

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    invoke-virtual {v12, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    const-string v9, "adJson"

    .line 70
    .line 71
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    const-string v9, "_ad"

    .line 78
    .line 79
    invoke-virtual {v12, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    const-string v2, "_noRefresh"

    .line 83
    .line 84
    invoke-virtual {v12, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzD:Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_3

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    check-cast v9, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    if-eqz v9, :cond_2

    .line 110
    .line 111
    invoke-virtual {v12, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    invoke-virtual {v7, v8, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    iget v9, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zza:I

    .line 119
    .line 120
    iget-wide v10, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzb:J

    .line 121
    .line 122
    iget v13, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzd:I

    .line 123
    .line 124
    iget-object v14, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zze:Ljava/util/List;

    .line 125
    .line 126
    iget-boolean v15, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzf:Z

    .line 127
    .line 128
    iget v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzg:I

    .line 129
    .line 130
    iget-boolean v3, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzh:Z

    .line 131
    .line 132
    iget-object v8, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzi:Ljava/lang/String;

    .line 133
    .line 134
    move/from16 v16, v2

    .line 135
    .line 136
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzj:Lcom/google/android/gms/ads/internal/client/zzfx;

    .line 137
    .line 138
    move-object/from16 v19, v2

    .line 139
    .line 140
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzk:Landroid/location/Location;

    .line 141
    .line 142
    move-object/from16 v20, v2

    .line 143
    .line 144
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzl:Ljava/lang/String;

    .line 145
    .line 146
    move-object/from16 v21, v2

    .line 147
    .line 148
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzn:Landroid/os/Bundle;

    .line 149
    .line 150
    move-object/from16 v23, v2

    .line 151
    .line 152
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzo:Ljava/util/List;

    .line 153
    .line 154
    move-object/from16 v24, v2

    .line 155
    .line 156
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzp:Ljava/lang/String;

    .line 157
    .line 158
    move-object/from16 v25, v2

    .line 159
    .line 160
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzq:Ljava/lang/String;

    .line 161
    .line 162
    move-object/from16 v26, v2

    .line 163
    .line 164
    iget-boolean v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzr:Z

    .line 165
    .line 166
    move/from16 v27, v2

    .line 167
    .line 168
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    .line 169
    .line 170
    move-object/from16 v28, v2

    .line 171
    .line 172
    iget v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzt:I

    .line 173
    .line 174
    move/from16 v29, v2

    .line 175
    .line 176
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzu:Ljava/lang/String;

    .line 177
    .line 178
    move-object/from16 v30, v2

    .line 179
    .line 180
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzv:Ljava/util/List;

    .line 181
    .line 182
    move-object/from16 v31, v2

    .line 183
    .line 184
    iget v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzw:I

    .line 185
    .line 186
    move/from16 v32, v2

    .line 187
    .line 188
    iget-object v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzx:Ljava/lang/String;

    .line 189
    .line 190
    move-object/from16 v33, v2

    .line 191
    .line 192
    iget v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzy:I

    .line 193
    .line 194
    move/from16 v34, v2

    .line 195
    .line 196
    move/from16 v17, v3

    .line 197
    .line 198
    iget-wide v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzz:J

    .line 199
    .line 200
    move-wide/from16 v35, v2

    .line 201
    .line 202
    iget-wide v2, v6, Lcom/google/android/gms/ads/internal/client/zzm;->zzA:J

    .line 203
    .line 204
    move-object/from16 v18, v8

    .line 205
    .line 206
    new-instance v8, Lcom/google/android/gms/ads/internal/client/zzm;

    .line 207
    .line 208
    move-wide/from16 v37, v2

    .line 209
    .line 210
    move-object/from16 v22, v7

    .line 211
    .line 212
    invoke-direct/range {v8 .. v38}, Lcom/google/android/gms/ads/internal/client/zzm;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/zzfx;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/ads/internal/client/zzc;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJ)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/ads/zzfjj;->zza(Lcom/google/android/gms/ads/internal/client/zzm;)Lcom/google/android/gms/internal/ads/zzfjj;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfjj;->zzA()Lcom/google/android/gms/internal/ads/zzfjk;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-instance v3, Landroid/os/Bundle;

    .line 223
    .line 224
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 225
    .line 226
    .line 227
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfjc;->zzb:Lcom/google/android/gms/internal/ads/zzfjb;

    .line 228
    .line 229
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfjb;->zzb:Lcom/google/android/gms/internal/ads/zzfiu;

    .line 230
    .line 231
    new-instance v6, Landroid/os/Bundle;

    .line 232
    .line 233
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 234
    .line 235
    .line 236
    new-instance v7, Ljava/util/ArrayList;

    .line 237
    .line 238
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzfiu;->zza:Ljava/util/List;

    .line 239
    .line 240
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 241
    .line 242
    .line 243
    const-string v8, "nofill_urls"

    .line 244
    .line 245
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 246
    .line 247
    .line 248
    const-string v7, "refresh_interval"

    .line 249
    .line 250
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzfiu;->zzc:I

    .line 251
    .line 252
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 253
    .line 254
    .line 255
    const-string v7, "gws_query_id"

    .line 256
    .line 257
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfiu;->zzb:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v5, "parent_common_config"

    .line 263
    .line 264
    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 265
    .line 266
    .line 267
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 268
    .line 269
    new-instance v5, Landroid/os/Bundle;

    .line 270
    .line 271
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 272
    .line 273
    .line 274
    const-string v6, "initial_ad_unit_id"

    .line 275
    .line 276
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzw:Ljava/lang/String;

    .line 280
    .line 281
    const-string v6, "allocation_id"

    .line 282
    .line 283
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzF:Ljava/lang/String;

    .line 287
    .line 288
    const-string v6, "ad_source_name"

    .line 289
    .line 290
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    new-instance v4, Ljava/util/ArrayList;

    .line 294
    .line 295
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzc:Ljava/util/List;

    .line 296
    .line 297
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 298
    .line 299
    .line 300
    const-string v6, "click_urls"

    .line 301
    .line 302
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 303
    .line 304
    .line 305
    new-instance v4, Ljava/util/ArrayList;

    .line 306
    .line 307
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzd:Ljava/util/List;

    .line 308
    .line 309
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 310
    .line 311
    .line 312
    const-string v6, "imp_urls"

    .line 313
    .line 314
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 315
    .line 316
    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzp:Ljava/util/List;

    .line 320
    .line 321
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 322
    .line 323
    .line 324
    const-string v6, "manual_tracking_urls"

    .line 325
    .line 326
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 327
    .line 328
    .line 329
    new-instance v4, Ljava/util/ArrayList;

    .line 330
    .line 331
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzm:Ljava/util/List;

    .line 332
    .line 333
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 334
    .line 335
    .line 336
    const-string v6, "fill_urls"

    .line 337
    .line 338
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 339
    .line 340
    .line 341
    new-instance v4, Ljava/util/ArrayList;

    .line 342
    .line 343
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzg:Ljava/util/List;

    .line 344
    .line 345
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 346
    .line 347
    .line 348
    const-string v6, "video_start_urls"

    .line 349
    .line 350
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 351
    .line 352
    .line 353
    new-instance v4, Ljava/util/ArrayList;

    .line 354
    .line 355
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzh:Ljava/util/List;

    .line 356
    .line 357
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 358
    .line 359
    .line 360
    const-string v6, "video_reward_urls"

    .line 361
    .line 362
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 363
    .line 364
    .line 365
    new-instance v4, Ljava/util/ArrayList;

    .line 366
    .line 367
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzi:Ljava/util/List;

    .line 368
    .line 369
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 370
    .line 371
    .line 372
    const-string v6, "video_complete_urls"

    .line 373
    .line 374
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 375
    .line 376
    .line 377
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzj:Ljava/lang/String;

    .line 378
    .line 379
    const-string v6, "transaction_id"

    .line 380
    .line 381
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzk:Ljava/lang/String;

    .line 385
    .line 386
    const-string v6, "valid_from_timestamp"

    .line 387
    .line 388
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzP:Z

    .line 392
    .line 393
    const-string v6, "is_closable_area_disabled"

    .line 394
    .line 395
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 396
    .line 397
    .line 398
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzao:Ljava/lang/String;

    .line 399
    .line 400
    const-string v6, "recursive_server_response_data"

    .line 401
    .line 402
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzW:Z

    .line 406
    .line 407
    const-string v6, "is_analytics_logging_enabled"

    .line 408
    .line 409
    invoke-virtual {v5, v6, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 410
    .line 411
    .line 412
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfir;->zzl:Lcom/google/android/gms/internal/ads/zzcas;

    .line 413
    .line 414
    if-eqz v4, :cond_4

    .line 415
    .line 416
    new-instance v6, Landroid/os/Bundle;

    .line 417
    .line 418
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 419
    .line 420
    .line 421
    const-string v7, "rb_amount"

    .line 422
    .line 423
    iget v8, v4, Lcom/google/android/gms/internal/ads/zzcas;->zzb:I

    .line 424
    .line 425
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 426
    .line 427
    .line 428
    const-string v7, "rb_type"

    .line 429
    .line 430
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzcas;->zza:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v6, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    filled-new-array {v6}, [Landroid/os/Bundle;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    const-string v6, "rewards"

    .line 440
    .line 441
    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 442
    .line 443
    .line 444
    :cond_4
    const-string v4, "parent_ad_config"

    .line 445
    .line 446
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 447
    .line 448
    .line 449
    move-object/from16 v4, p0

    .line 450
    .line 451
    invoke-virtual {v4, v2, v3, v1, v0}, Lcom/google/android/gms/internal/ads/zzeng;->zzc(Lcom/google/android/gms/internal/ads/zzfjk;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfjc;)Lj3/a;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    return-object v0
.end method

.method public abstract zzc(Lcom/google/android/gms/internal/ads/zzfjk;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfjc;)Lj3/a;
.end method
