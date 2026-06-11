.class public final Lcom/google/android/gms/internal/ads/zzfjb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Ljava/util/List;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzfiu;

.field public final zzc:Ljava/util/List;

.field public final zzd:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/util/JsonReader;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfjb;->zzd:Landroid/os/Bundle;

    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcK:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdxh;->zzt:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lx2/c;

    .line 37
    .line 38
    invoke-static {v1, p2, v0}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginObject()V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    move-object v3, v2

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_d

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v5, "responses"

    .line 64
    .line 65
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_7

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginArray()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginObject()V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "ad_configs"

    .line 88
    .line 89
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    new-instance v0, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginArray()V

    .line 101
    .line 102
    .line 103
    :goto_2
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_3

    .line 108
    .line 109
    new-instance v4, Lcom/google/android/gms/internal/ads/zzfir;

    .line 110
    .line 111
    invoke-direct {v4, p1}, Lcom/google/android/gms/internal/ads/zzfir;-><init>(Landroid/util/JsonReader;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    invoke-virtual {p1}, Landroid/util/JsonReader;->endArray()V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    const-string v5, "common"

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-eqz v4, :cond_5

    .line 129
    .line 130
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfiu;

    .line 131
    .line 132
    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/ads/zzfiu;-><init>(Landroid/util/JsonReader;)V

    .line 133
    .line 134
    .line 135
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzcL:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 136
    .line 137
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    check-cast v4, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_2

    .line 152
    .line 153
    if-eqz p2, :cond_2

    .line 154
    .line 155
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzq:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 156
    .line 157
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzfiu;->zzs:J

    .line 162
    .line 163
    invoke-virtual {p2, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 164
    .line 165
    .line 166
    sget-object v4, Lcom/google/android/gms/internal/ads/zzdxh;->zzr:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzfiu;->zzt:J

    .line 173
    .line 174
    invoke-virtual {p2, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_5
    invoke-virtual {p1}, Landroid/util/JsonReader;->skipValue()V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_6
    invoke-virtual {p1}, Landroid/util/JsonReader;->endObject()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/util/JsonReader;->endArray()V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_7
    const-string v5, "actions"

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_1

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginArray()V

    .line 199
    .line 200
    .line 201
    :goto_3
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_c

    .line 206
    .line 207
    invoke-virtual {p1}, Landroid/util/JsonReader;->beginObject()V

    .line 208
    .line 209
    .line 210
    move-object v4, v2

    .line 211
    move-object v5, v4

    .line 212
    :goto_4
    invoke-virtual {p1}, Landroid/util/JsonReader;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_a

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    const-string v7, "name"

    .line 223
    .line 224
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-eqz v7, :cond_8

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    goto :goto_4

    .line 235
    :cond_8
    const-string v7, "info"

    .line 236
    .line 237
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v6

    .line 241
    if-eqz v6, :cond_9

    .line 242
    .line 243
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzbp;->zzd(Landroid/util/JsonReader;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    goto :goto_4

    .line 248
    :cond_9
    invoke-virtual {p1}, Landroid/util/JsonReader;->skipValue()V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_a
    if-eqz v4, :cond_b

    .line 253
    .line 254
    new-instance v6, Lcom/google/android/gms/internal/ads/zzfja;

    .line 255
    .line 256
    invoke-direct {v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzfja;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_b
    invoke-virtual {p1}, Landroid/util/JsonReader;->endObject()V

    .line 263
    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_c
    invoke-virtual {p1}, Landroid/util/JsonReader;->endArray()V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_d
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfjb;->zzc:Ljava/util/List;

    .line 272
    .line 273
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfjb;->zza:Ljava/util/List;

    .line 274
    .line 275
    if-nez v3, :cond_e

    .line 276
    .line 277
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfiu;

    .line 278
    .line 279
    new-instance p1, Landroid/util/JsonReader;

    .line 280
    .line 281
    new-instance p2, Ljava/io/StringReader;

    .line 282
    .line 283
    const-string v0, "{}"

    .line 284
    .line 285
    invoke-direct {p2, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-direct {p1, p2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 289
    .line 290
    .line 291
    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/ads/zzfiu;-><init>(Landroid/util/JsonReader;)V

    .line 292
    .line 293
    .line 294
    :cond_e
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzfjb;->zzb:Lcom/google/android/gms/internal/ads/zzfiu;

    .line 295
    .line 296
    return-void
.end method

.method public static zza(Ljava/io/Reader;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfjb;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfjb;

    .line 2
    .line 3
    new-instance v1, Landroid/util/JsonReader;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfjb;-><init>(Landroid/util/JsonReader;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :catch_2
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :catch_3
    move-exception p1

    .line 24
    goto :goto_0

    .line 25
    :catch_4
    move-exception p1

    .line 26
    :goto_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfiv;

    .line 27
    .line 28
    const-string v1, "unable to parse ServerResponse"

    .line 29
    .line 30
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfiv;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_1
    invoke-static {p0}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
