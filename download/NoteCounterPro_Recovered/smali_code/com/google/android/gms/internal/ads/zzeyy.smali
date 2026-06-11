.class public final Lcom/google/android/gms/internal/ads/zzeyy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfav;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zzb:Landroid/content/pm/PackageInfo;

.field private final zzc:Lcom/google/android/gms/ads/internal/util/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfjk;Landroid/content/pm/PackageInfo;Lcom/google/android/gms/ads/internal/util/zzg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zzb:Landroid/content/pm/PackageInfo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zzc:Lcom/google/android/gms/ads/internal/util/zzg;

    return-void
.end method

.method private final zzc(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzj:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzbkh;->zzi:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzbkh;->zzj:Z

    .line 12
    .line 13
    const-string v2, "sccg_tap"

    .line 14
    .line 15
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const-string v0, "sccg_dir"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    const-string v4, "native_version"

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zza:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zza:Landroid/os/Bundle;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-virtual {p1, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v4, "native_templates"

    .line 33
    .line 34
    invoke-virtual {p1, v4, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzi:Ljava/util/ArrayList;

    .line 38
    .line 39
    const-string v4, "native_custom_templates"

    .line 40
    .line 41
    invoke-virtual {p1, v4, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzj:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x1

    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zza:I

    .line 51
    .line 52
    const-string v7, "any"

    .line 53
    .line 54
    const-string v8, "landscape"

    .line 55
    .line 56
    const-string v9, "portrait"

    .line 57
    .line 58
    const-string v10, "unknown"

    .line 59
    .line 60
    if-le v6, v2, :cond_6

    .line 61
    .line 62
    const-string v6, "enable_native_media_orientation"

    .line 63
    .line 64
    invoke-virtual {p1, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzh:I

    .line 68
    .line 69
    if-eq v6, v5, :cond_5

    .line 70
    .line 71
    if-eq v6, v4, :cond_4

    .line 72
    .line 73
    if-eq v6, v2, :cond_3

    .line 74
    .line 75
    const/4 v11, 0x4

    .line 76
    if-eq v6, v11, :cond_2

    .line 77
    .line 78
    move-object v6, v10

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    const-string v6, "square"

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move-object v6, v9

    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move-object v6, v8

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    move-object v6, v7

    .line 88
    :goto_0
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-nez v11, :cond_6

    .line 93
    .line 94
    const-string v11, "native_media_orientation"

    .line 95
    .line 96
    invoke-virtual {p1, v11, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzc:I

    .line 100
    .line 101
    if-eqz v6, :cond_9

    .line 102
    .line 103
    if-eq v6, v5, :cond_8

    .line 104
    .line 105
    if-eq v6, v4, :cond_7

    .line 106
    .line 107
    move-object v7, v10

    .line 108
    goto :goto_1

    .line 109
    :cond_7
    move-object v7, v8

    .line 110
    goto :goto_1

    .line 111
    :cond_8
    move-object v7, v9

    .line 112
    :cond_9
    :goto_1
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_a

    .line 117
    .line 118
    const-string v6, "native_image_orientation"

    .line 119
    .line 120
    invoke-virtual {p1, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_a
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzd:Z

    .line 124
    .line 125
    const-string v7, "native_multiple_images"

    .line 126
    .line 127
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzg:Z

    .line 131
    .line 132
    const-string v7, "use_custom_mute"

    .line 133
    .line 134
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzeyy;->zzc(Landroid/os/Bundle;)V

    .line 138
    .line 139
    .line 140
    :cond_b
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zzb:Landroid/content/pm/PackageInfo;

    .line 141
    .line 142
    if-nez v6, :cond_c

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_c
    iget v3, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 146
    .line 147
    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zzc:Lcom/google/android/gms/ads/internal/util/zzg;

    .line 148
    .line 149
    invoke-interface {v6}, Lcom/google/android/gms/ads/internal/util/zzg;->zzg()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    if-le v3, v7, :cond_d

    .line 154
    .line 155
    invoke-interface {v6}, Lcom/google/android/gms/ads/internal/util/zzg;->zzt()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v6, v3}, Lcom/google/android/gms/ads/internal/util/zzg;->zzf(I)V

    .line 159
    .line 160
    .line 161
    :cond_d
    invoke-interface {v6}, Lcom/google/android/gms/ads/internal/util/zzg;->zzs()Lorg/json/JSONObject;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    const/4 v6, 0x0

    .line 166
    if-eqz v3, :cond_e

    .line 167
    .line 168
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzg:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-eqz v3, :cond_e

    .line 175
    .line 176
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    :cond_e
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_f

    .line 185
    .line 186
    const-string v3, "native_advanced_settings"

    .line 187
    .line 188
    invoke-virtual {p1, v3, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_f
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzl:I

    .line 192
    .line 193
    if-le v3, v5, :cond_10

    .line 194
    .line 195
    const-string v6, "max_num_ads"

    .line 196
    .line 197
    invoke-virtual {p1, v6, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    :cond_10
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzb:Lcom/google/android/gms/internal/ads/zzbqs;

    .line 201
    .line 202
    if-eqz v0, :cond_15

    .line 203
    .line 204
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzbqs;->zzc:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-eqz v6, :cond_14

    .line 211
    .line 212
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzbqs;->zza:I

    .line 213
    .line 214
    const-string v6, "p"

    .line 215
    .line 216
    const-string v7, "l"

    .line 217
    .line 218
    if-lt v3, v4, :cond_12

    .line 219
    .line 220
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbqs;->zzd:I

    .line 221
    .line 222
    if-eq v0, v4, :cond_11

    .line 223
    .line 224
    if-eq v0, v2, :cond_13

    .line 225
    .line 226
    :cond_11
    :goto_3
    move-object v6, v7

    .line 227
    goto :goto_4

    .line 228
    :cond_12
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbqs;->zzb:I

    .line 229
    .line 230
    if-eq v0, v5, :cond_11

    .line 231
    .line 232
    if-eq v0, v4, :cond_13

    .line 233
    .line 234
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    new-instance v3, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    add-int/lit8 v2, v2, 0x29

    .line 245
    .line 246
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 247
    .line 248
    .line 249
    const-string v2, "Instream ad video aspect ratio "

    .line 250
    .line 251
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string v0, " is wrong."

    .line 258
    .line 259
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_13
    :goto_4
    const-string v0, "ia_var"

    .line 271
    .line 272
    invoke-virtual {p1, v0, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_14
    const-string v0, "ad_tag"

    .line 277
    .line 278
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :goto_5
    const-string v0, "instr"

    .line 282
    .line 283
    invoke-virtual {p1, v0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 284
    .line 285
    .line 286
    :cond_15
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzno:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 287
    .line 288
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_17

    .line 303
    .line 304
    if-eqz v1, :cond_17

    .line 305
    .line 306
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzf:Lcom/google/android/gms/ads/internal/client/zzga;

    .line 307
    .line 308
    if-eqz v0, :cond_16

    .line 309
    .line 310
    new-instance v2, Landroid/os/Bundle;

    .line 311
    .line 312
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 313
    .line 314
    .line 315
    const-string v3, "startMuted"

    .line 316
    .line 317
    iget-boolean v4, v0, Lcom/google/android/gms/ads/internal/client/zzga;->zza:Z

    .line 318
    .line 319
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 320
    .line 321
    .line 322
    const-string v3, "clickToExpandRequested"

    .line 323
    .line 324
    iget-boolean v4, v0, Lcom/google/android/gms/ads/internal/client/zzga;->zzc:Z

    .line 325
    .line 326
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 327
    .line 328
    .line 329
    const-string v3, "customControlsRequested"

    .line 330
    .line 331
    iget-boolean v0, v0, Lcom/google/android/gms/ads/internal/client/zzga;->zzb:Z

    .line 332
    .line 333
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    const-string v0, "video"

    .line 337
    .line 338
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 339
    .line 340
    .line 341
    :cond_16
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zzb:Z

    .line 342
    .line 343
    const-string v2, "disable_image_loading"

    .line 344
    .line 345
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 346
    .line 347
    .line 348
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbkh;->zze:I

    .line 349
    .line 350
    const-string v1, "preferred_ad_choices_position"

    .line 351
    .line 352
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 353
    .line 354
    .line 355
    :cond_17
    :goto_6
    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeyy;->zza:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzh:Ljava/util/ArrayList;

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zzb:Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzeyy;->zzc(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method
