.class public final Lcom/google/android/gms/internal/ads/zzfbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfav;


# instance fields
.field public final zza:Z

.field public final zzb:Z

.field public final zzc:Ljava/lang/String;

.field public final zzd:Z

.field public final zze:Z

.field public final zzf:Z

.field public final zzg:Ljava/lang/String;

.field public final zzh:Ljava/lang/String;

.field public final zzi:Ljava/lang/String;

.field public final zzj:Ljava/util/ArrayList;

.field public final zzk:Ljava/lang/String;

.field public final zzl:Ljava/lang/String;

.field public final zzm:Ljava/lang/String;

.field public final zzn:Z

.field public final zzo:Ljava/lang/String;

.field public final zzp:J

.field public final zzq:Z

.field public final zzr:Ljava/lang/String;

.field public final zzs:I

.field public final zzt:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZLjava/lang/String;ZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zza:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzb:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzc:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzd:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zze:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzf:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzg:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzh:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzj:Ljava/util/ArrayList;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzk:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzl:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzm:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzn:Z

    iput-object p13, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzo:Ljava/lang/String;

    iput-wide p14, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzp:J

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzq:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzr:Ljava/lang/String;

    move/from16 p1, p18

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzs:I

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzt:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzi:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zza:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "cog"

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zza:Z

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const-string v0, "coh"

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzb:Z

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    const-string v0, "gl"

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzc:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "simulator"

    .line 27
    .line 28
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzd:Z

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "is_latchsky"

    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zze:Z

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    const-string v0, "build_api_level"

    .line 41
    .line 42
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzs:I

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmy:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 48
    .line 49
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzf:Z

    .line 66
    .line 67
    const-string v1, "is_sidewinder"

    .line 68
    .line 69
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzg:Ljava/lang/String;

    .line 73
    .line 74
    const-string v1, "hl"

    .line 75
    .line 76
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzoT:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 80
    .line 81
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_1

    .line 96
    .line 97
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzoU:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 98
    .line 99
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzh:Ljava/lang/String;

    .line 116
    .line 117
    const-string v1, "dlc"

    .line 118
    .line 119
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzj:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_3

    .line 129
    .line 130
    const-string v1, "hl_list"

    .line 131
    .line 132
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzi:Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    const-string v1, "dgl"

    .line 140
    .line 141
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzk:Ljava/lang/String;

    .line 145
    .line 146
    const-string v1, "mv"

    .line 147
    .line 148
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzo:Ljava/lang/String;

    .line 152
    .line 153
    const-string v1, "submodel"

    .line 154
    .line 155
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v0, "device"

    .line 159
    .line 160
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzfjz;->zza(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzm:Ljava/lang/String;

    .line 168
    .line 169
    const-string v2, "build"

    .line 170
    .line 171
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzp:J

    .line 175
    .line 176
    const-string v0, "remaining_data_partition_space"

    .line 177
    .line 178
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 179
    .line 180
    .line 181
    const-string v0, "browser"

    .line 182
    .line 183
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzfjz;->zza(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzn:Z

    .line 191
    .line 192
    const-string v3, "is_browser_custom_tabs_capable"

    .line 193
    .line 194
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzl:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-nez v2, :cond_5

    .line 204
    .line 205
    const-string v2, "play_store"

    .line 206
    .line 207
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzfjz;->zza(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 212
    .line 213
    .line 214
    const-string v1, "package_version"

    .line 215
    .line 216
    invoke-virtual {v3, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmO:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 220
    .line 221
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_6

    .line 236
    .line 237
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzq:Z

    .line 238
    .line 239
    const-string v1, "is_bstar"

    .line 240
    .line 241
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzr:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-nez v1, :cond_7

    .line 251
    .line 252
    const-string v1, "v_unity"

    .line 253
    .line 254
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_7
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmI:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 258
    .line 259
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_8

    .line 274
    .line 275
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmF:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 276
    .line 277
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const-string v1, "gotmt_l"

    .line 292
    .line 293
    const/4 v2, 0x1

    .line 294
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfjz;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 295
    .line 296
    .line 297
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzmE:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 298
    .line 299
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, Ljava/lang/Boolean;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    const-string v1, "gotmt_i"

    .line 314
    .line 315
    invoke-static {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfjz;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 316
    .line 317
    .line 318
    :cond_8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzpJ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 319
    .line 320
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, Ljava/lang/Boolean;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_9

    .line 335
    .line 336
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzt:Ljava/lang/String;

    .line 337
    .line 338
    if-eqz v0, :cond_9

    .line 339
    .line 340
    const-string v1, "sdk_i_s"

    .line 341
    .line 342
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :cond_9
    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzdah;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzdah;->zzb:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "simulator"

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzd:Z

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const-string v0, "build_api_level"

    .line 13
    .line 14
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzs:I

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzj:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string v1, "hl_list"

    .line 28
    .line 29
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbg;->zzo:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "submodel"

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
