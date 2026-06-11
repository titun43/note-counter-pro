.class public final Lcom/google/android/gms/internal/ads/zzeeg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/util/regex/Pattern;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzcma;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfjk;

.field private final zzf:Ljava/util/concurrent/Executor;

.field private final zzg:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzh:Ljava/lang/String;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfoo;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdxt;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzfqk;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzdej;

.field private final zzm:Ljava/lang/Object;

.field private zzn:Ljava/lang/String;

.field private zzo:Ljava/util/List;

.field private zzp:Landroid/os/Bundle;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzcac;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzeeg;->zza:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcma;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzfjk;Ljava/util/concurrent/Executor;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfoo;Lcom/google/android/gms/internal/ads/zzdxt;Lcom/google/android/gms/internal/ads/zzcac;Lcom/google/android/gms/internal/ads/zzehb;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/zzfqk;Lcom/google/android/gms/internal/ads/zzdej;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p10, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p10}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzm:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzb:Lcom/google/android/gms/internal/ads/zzcma;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzc:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zze:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 18
    .line 19
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzf:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzh:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzi:Lcom/google/android/gms/internal/ads/zzfoo;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcma;->zzB()Lcom/google/android/gms/internal/ads/zzfka;

    .line 26
    .line 27
    .line 28
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 29
    .line 30
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzq:Lcom/google/android/gms/internal/ads/zzcac;

    .line 31
    .line 32
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzg:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzk:Lcom/google/android/gms/internal/ads/zzfqk;

    .line 35
    .line 36
    iput-object p13, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzl:Lcom/google/android/gms/internal/ads/zzdej;

    .line 37
    .line 38
    return-void
.end method

.method private final zzg(Ljava/lang/String;Ljava/lang/String;)Lj3/a;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    const-string v3, "Invalid ad string."

    .line 16
    .line 17
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    return-object v1

    .line 25
    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzc:Landroid/content/Context;

    .line 26
    .line 27
    const/16 v3, 0xb

    .line 28
    .line 29
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfoe;->zzn(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzfoe;->zza()Lcom/google/android/gms/internal/ads/zzfoe;

    .line 34
    .line 35
    .line 36
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 37
    .line 38
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzb:Lcom/google/android/gms/internal/ads/zzcma;

    .line 39
    .line 40
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzr()Lcom/google/android/gms/internal/ads/zzbsq;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcma;->zzx()Lcom/google/android/gms/internal/ads/zzfor;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v6, v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzbsq;->zzb(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzfor;)Lcom/google/android/gms/internal/ads/zzbsz;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "google.afma.response.normalize"

    .line 53
    .line 54
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbsw;->zza:Lcom/google/android/gms/internal/ads/zzbst;

    .line 55
    .line 56
    invoke-virtual {v2, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzbsz;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbss;Lcom/google/android/gms/internal/ads/zzbsr;)Lcom/google/android/gms/internal/ads/zzbsp;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzia:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 61
    .line 62
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const-string v5, "1"

    .line 77
    .line 78
    const-string v6, "sst"

    .line 79
    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    move-object/from16 v8, p1

    .line 86
    .line 87
    :try_start_1
    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v9, "fetch_url"

    .line 91
    .line 92
    invoke-virtual {v7, v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iput-object v9, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzn:Ljava/lang/String;

    .line 97
    .line 98
    new-instance v9, Lorg/json/JSONObject;

    .line 99
    .line 100
    const-string v10, "settings"

    .line 101
    .line 102
    invoke-virtual {v7, v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-direct {v9, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v7, "nofill_urls"

    .line 110
    .line 111
    invoke-virtual {v9, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-static {v7, v4}, Lcom/google/android/gms/ads/internal/util/zzbp;->zza(Lorg/json/JSONArray;Ljava/util/List;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzo:Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catch_0
    move-object/from16 v8, p1

    .line 123
    .line 124
    :catch_1
    sget v7, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 125
    .line 126
    const-string v7, "Invalid ad response."

    .line 127
    .line 128
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_0
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzn:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzo:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-nez v10, :cond_3

    .line 140
    .line 141
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 142
    .line 143
    const-string v8, "2"

    .line 144
    .line 145
    invoke-virtual {v5, v6, v8}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzic:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 149
    .line 150
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    move-object v15, v5

    .line 159
    check-cast v15, Ljava/lang/String;

    .line 160
    .line 161
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzib:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 162
    .line 163
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_2

    .line 178
    .line 179
    sget-object v1, Lcom/google/android/gms/internal/ads/zzeeg;->zza:Ljava/util/regex/Pattern;

    .line 180
    .line 181
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrr;->zzb(Ljava/util/regex/Pattern;)Lcom/google/android/gms/internal/ads/zzgrr;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzgrr;->zze(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    const/4 v6, 0x2

    .line 194
    const/4 v8, 0x1

    .line 195
    if-ge v5, v6, :cond_1

    .line 196
    .line 197
    new-instance v1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 198
    .line 199
    const-string v4, "Invalid fetch URL."

    .line 200
    .line 201
    invoke-direct {v1, v8, v4}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_1
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 217
    .line 218
    .line 219
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-virtual {v5, v4}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    :cond_2
    move-object v11, v7

    .line 240
    new-instance v10, Lcom/google/android/gms/internal/ads/zzegy;

    .line 241
    .line 242
    new-instance v13, Ljava/util/HashMap;

    .line 243
    .line 244
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 245
    .line 246
    .line 247
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 248
    .line 249
    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 250
    .line 251
    .line 252
    move-result-object v14

    .line 253
    const/16 v16, 0x0

    .line 254
    .line 255
    const v12, 0xea60

    .line 256
    .line 257
    .line 258
    invoke-direct/range {v10 .. v16}, Lcom/google/android/gms/internal/ads/zzegy;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    .line 259
    .line 260
    .line 261
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 262
    .line 263
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeed;

    .line 264
    .line 265
    invoke-direct {v4, v0, v10}, Lcom/google/android/gms/internal/ads/zzeed;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;Lcom/google/android/gms/internal/ads/zzegy;)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v1, v4}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgzg;->zzw(Lj3/a;)Lcom/google/android/gms/internal/ads/zzgzg;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzid:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 277
    .line 278
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    int-to-long v4, v4

    .line 293
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzg:Ljava/util/concurrent/ScheduledExecutorService;

    .line 294
    .line 295
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 296
    .line 297
    invoke-static {v1, v4, v5, v7, v6}, Lcom/google/android/gms/internal/ads/zzgzo;->zzi(Lj3/a;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lj3/a;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 302
    .line 303
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeee;

    .line 304
    .line 305
    invoke-direct {v4, v0, v9}, Lcom/google/android/gms/internal/ads/zzeee;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;Ljava/util/List;)V

    .line 306
    .line 307
    .line 308
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzf:Ljava/util/concurrent/Executor;

    .line 309
    .line 310
    const-class v6, Ljava/lang/Exception;

    .line 311
    .line 312
    invoke-static {v1, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzgzo;->zzh(Lj3/a;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 317
    .line 318
    goto :goto_1

    .line 319
    :cond_3
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 324
    .line 325
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    goto :goto_1

    .line 329
    :cond_4
    move-object/from16 v8, p1

    .line 330
    .line 331
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 336
    .line 337
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :goto_1
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeef;

    .line 341
    .line 342
    move-object/from16 v5, p2

    .line 343
    .line 344
    invoke-direct {v4, v0, v5}, Lcom/google/android/gms/internal/ads/zzeef;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzf:Ljava/util/concurrent/Executor;

    .line 348
    .line 349
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeeb;

    .line 354
    .line 355
    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/ads/zzeeb;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;Lcom/google/android/gms/internal/ads/zzbsp;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeec;

    .line 363
    .line 364
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzeec;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v1, v2, v5}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeeg;->zzi:Lcom/google/android/gms/internal/ads/zzfoo;

    .line 372
    .line 373
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfon;->zzd(Lj3/a;Lcom/google/android/gms/internal/ads/zzfoo;Lcom/google/android/gms/internal/ads/zzfoe;)V

    .line 374
    .line 375
    .line 376
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeea;

    .line 377
    .line 378
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzeea;-><init>(Lcom/google/android/gms/internal/ads/zzeeg;)V

    .line 379
    .line 380
    .line 381
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 382
    .line 383
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 384
    .line 385
    .line 386
    return-object v1
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzdxh;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzif:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lx2/c;

    .line 34
    .line 35
    invoke-static {v1, v0, p1}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method private final zzi(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ad_types"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string v3, "unknown"

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    new-instance v2, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzh:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-object p1

    .line 49
    :goto_1
    const-string v1, "Failed to update the ad types for rendering. "

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 60
    .line 61
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object p1
.end method

.method private static final zzj(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    const-string p0, "request_id"

    .line 9
    .line 10
    invoke-virtual {v1, p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :catch_0
    return-object v0
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 14

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zze:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzt:Landroid/os/Bundle;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzp:Landroid/os/Bundle;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdxh;->zzo:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdxh;->zza()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lx2/c;

    .line 42
    .line 43
    invoke-static {v2, v0, v1}, Landroidx/emoji2/text/u;->u(Lx2/c;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zze:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzx:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_12

    .line 57
    .line 58
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzeeg;->zzj(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzhW:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v4, -0x1

    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    const-string v1, "&request_id="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eq v1, v4, :cond_1

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0xc

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    const-string v1, ""

    .line 103
    .line 104
    :cond_2
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_3

    .line 109
    .line 110
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenv;

    .line 111
    .line 112
    const/16 v1, 0xf

    .line 113
    .line 114
    const-string v2, "Invalid ad string."

    .line 115
    .line 116
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzm:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-enter v3

    .line 127
    :try_start_0
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzb:Lcom/google/android/gms/internal/ads/zzcma;

    .line 128
    .line 129
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcma;->zzt()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 134
    .line 135
    invoke-virtual {v5, v1, v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzdxt;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x0

    .line 155
    if-eqz v2, :cond_9

    .line 156
    .line 157
    const-string v2, "Failed to decode the adResponse. "

    .line 158
    .line 159
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    if-nez v10, :cond_9

    .line 164
    .line 165
    :try_start_1
    new-instance v10, Lorg/json/JSONObject;

    .line 166
    .line 167
    invoke-direct {v10, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v11, "extras"

    .line 171
    .line 172
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    if-eqz v10, :cond_9

    .line 177
    .line 178
    const-string v11, "query_info_type"

    .line 179
    .line 180
    const-string v12, ""

    .line 181
    .line 182
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbhe;->zzhY:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 187
    .line 188
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    check-cast v11, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_4

    .line 203
    .line 204
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbhe;->zzhZ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 205
    .line 206
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    check-cast v11, Ljava/lang/String;

    .line 215
    .line 216
    const-string v12, ","

    .line 217
    .line 218
    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    goto :goto_1

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :cond_4
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbhe;->zzhX:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 231
    .line 232
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    check-cast v11, Ljava/lang/String;

    .line 241
    .line 242
    const-string v12, ","

    .line 243
    .line 244
    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    :goto_1
    invoke-static {v10}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaa;->zzb(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-interface {v11, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v10
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 260
    if-nez v10, :cond_5

    .line 261
    .line 262
    goto/16 :goto_6

    .line 263
    .line 264
    :cond_5
    :try_start_2
    const-string v10, "&"

    .line 265
    .line 266
    invoke-virtual {v0, v10}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eq v10, v4, :cond_6

    .line 271
    .line 272
    invoke-virtual {v0, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    goto :goto_2

    .line 277
    :cond_6
    move-object v4, v8

    .line 278
    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 282
    if-eqz v10, :cond_7

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_7
    const/16 v10, 0xb

    .line 286
    .line 287
    :try_start_3
    invoke-static {v4, v10}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 292
    .line 293
    invoke-virtual {v1, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    const-string v11, "Failed to get key from QueryJSONMap"

    .line 298
    .line 299
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result v12
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 303
    if-eqz v12, :cond_8

    .line 304
    .line 305
    :goto_3
    move-object v11, v8

    .line 306
    goto :goto_4

    .line 307
    :cond_8
    :try_start_4
    new-instance v12, Lorg/json/JSONObject;

    .line 308
    .line 309
    invoke-direct {v12, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    const-string v13, "arek"

    .line 313
    .line 314
    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v11
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 318
    goto :goto_4

    .line 319
    :catch_0
    move-exception v4

    .line 320
    goto :goto_5

    .line 321
    :catch_1
    move-exception v12

    .line 322
    :try_start_5
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v13

    .line 326
    invoke-virtual {v11, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v11

    .line 330
    invoke-static {v11}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    const-string v13, "CryptoUtils.getKeyFromQueryJsonMap"

    .line 338
    .line 339
    invoke-virtual {v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto :goto_3

    .line 343
    :goto_4
    invoke-static {v4, v10, v11, v6}, Lcom/google/android/gms/internal/ads/zzfka;->zzb([B[BLjava/lang/String;Lcom/google/android/gms/internal/ads/zzdxt;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 347
    goto :goto_6

    .line 348
    :goto_5
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const-string v6, "PreloadedLoader.decryptAdResponseIfNecessary"

    .line 364
    .line 365
    invoke-virtual {v2, v4, v6}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    :catch_2
    :cond_9
    :goto_6
    const-string v2, "Ad grouping: Has render_id, but not base64 encoded: "

    .line 369
    .line 370
    const-string v4, "Ad grouping: Has render_id, but invalid format: "

    .line 371
    .line 372
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    if-eqz v6, :cond_a

    .line 377
    .line 378
    const-string v6, ""
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 379
    .line 380
    goto :goto_7

    .line 381
    :cond_a
    :try_start_7
    new-instance v6, Lorg/json/JSONObject;

    .line 382
    .line 383
    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 384
    .line 385
    .line 386
    :try_start_8
    const-string v10, "render_id"

    .line 387
    .line 388
    const-string v11, ""

    .line 389
    .line 390
    invoke-virtual {v6, v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    goto :goto_7

    .line 395
    :catch_3
    const-string v6, ""

    .line 396
    .line 397
    :goto_7
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-nez v10, :cond_c

    .line 402
    .line 403
    const-string v10, ""
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 404
    .line 405
    :try_start_9
    new-instance v11, Ljava/lang/String;

    .line 406
    .line 407
    invoke-static {v6, v9}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 412
    .line 413
    invoke-direct {v11, v12, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_9
    .catch Ljava/lang/IllegalArgumentException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 414
    .line 415
    .line 416
    move-object v10, v11

    .line 417
    goto :goto_8

    .line 418
    :catch_4
    move-exception v11

    .line 419
    :try_start_a
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    invoke-virtual {v2, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const-string v12, "PreloadedLoader.decodeRenderId"

    .line 435
    .line 436
    invoke-virtual {v2, v11, v12}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    :goto_8
    const/16 v2, 0x3a

    .line 440
    .line 441
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgqq;->zzc(C)Lcom/google/android/gms/internal/ads/zzgqq;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgrr;->zza(Lcom/google/android/gms/internal/ads/zzgqq;)Lcom/google/android/gms/internal/ads/zzgrr;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzgrr;->zze(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    const/4 v11, 0x2

    .line 458
    if-ne v10, v11, :cond_b

    .line 459
    .line 460
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    move-object v8, v4

    .line 465
    check-cast v8, Ljava/lang/String;

    .line 466
    .line 467
    const/4 v4, 0x1

    .line 468
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    check-cast v2, Ljava/lang/String;

    .line 473
    .line 474
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    goto :goto_9

    .line 479
    :cond_b
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    :cond_c
    move v2, v9

    .line 491
    :goto_9
    if-eqz v8, :cond_d

    .line 492
    .line 493
    new-instance v4, Landroid/util/Pair;

    .line 494
    .line 495
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    invoke-direct {v4, v8, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    goto :goto_a

    .line 503
    :cond_d
    new-instance v4, Landroid/util/Pair;

    .line 504
    .line 505
    const-string v2, ""

    .line 506
    .line 507
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    invoke-direct {v4, v2, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    :goto_a
    iget-object v2, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v2, Ljava/lang/String;

    .line 517
    .line 518
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 519
    .line 520
    check-cast v4, Ljava/lang/Integer;

    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    if-nez v6, :cond_f

    .line 531
    .line 532
    if-lez v4, :cond_f

    .line 533
    .line 534
    invoke-virtual {v5, v1, v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;->zzd(Ljava/lang/String;Ljava/lang/String;)Z

    .line 535
    .line 536
    .line 537
    move-result v6

    .line 538
    if-eqz v6, :cond_e

    .line 539
    .line 540
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenv;

    .line 541
    .line 542
    const-string v1, "The ad has already been shown."

    .line 543
    .line 544
    const/16 v2, 0xa

    .line 545
    .line 546
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    monitor-exit v3

    .line 554
    return-object v0

    .line 555
    :cond_e
    invoke-virtual {v5, v1, v2, v4}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;->zze(Ljava/lang/String;Ljava/lang/String;I)Z

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    if-nez v2, :cond_10

    .line 560
    .line 561
    :cond_f
    invoke-virtual {v5, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;->zzc(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    :cond_10
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 565
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-eqz v1, :cond_11

    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_11
    invoke-direct {p0, v7}, Lcom/google/android/gms/internal/ads/zzeeg;->zzi(Ljava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzeeg;->zzg(Ljava/lang/String;Ljava/lang/String;)Lj3/a;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    return-object v0

    .line 581
    :goto_b
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 582
    throw v0

    .line 583
    :cond_12
    :goto_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zze:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 584
    .line 585
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfjk;->zzd:Lcom/google/android/gms/ads/internal/client/zzm;

    .line 586
    .line 587
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzm;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    .line 588
    .line 589
    if-eqz v0, :cond_15

    .line 590
    .line 591
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzhO:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 592
    .line 593
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    check-cast v1, Ljava/lang/Boolean;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    if-nez v1, :cond_13

    .line 608
    .line 609
    goto :goto_d

    .line 610
    :cond_13
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zza:Ljava/lang/String;

    .line 611
    .line 612
    iget-object v2, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zzb:Ljava/lang/String;

    .line 613
    .line 614
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzeeg;->zzj(Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzeeg;->zzj(Ljava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 623
    .line 624
    .line 625
    move-result v3

    .line 626
    if-nez v3, :cond_14

    .line 627
    .line 628
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    if-eqz v2, :cond_14

    .line 633
    .line 634
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzb:Lcom/google/android/gms/internal/ads/zzcma;

    .line 635
    .line 636
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcma;->zzt()Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzv;->zzc(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 644
    .line 645
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzdxt;->zzc()Ljava/util/Map;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    const-string v3, "request_id"

    .line 650
    .line 651
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    :goto_d
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zza:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/client/zzc;->zzb:Ljava/lang/String;

    .line 657
    .line 658
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzeeg;->zzi(Ljava/lang/String;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/zzeeg;->zzg(Ljava/lang/String;Ljava/lang/String;)Lj3/a;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    return-object v0

    .line 667
    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 668
    .line 669
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zzc()Ljava/util/Map;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    const-string v1, "ridmm"

    .line 674
    .line 675
    const-string v2, "true"

    .line 676
    .line 677
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    :cond_15
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenv;

    .line 681
    .line 682
    const/16 v1, 0xe

    .line 683
    .line 684
    const-string v2, "Mismatch request IDs."

    .line 685
    .line 686
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbsp;Lorg/json/JSONObject;)Lj3/a;
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdxt;->zze()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdxh;->zzp:Lcom/google/android/gms/internal/ads/zzdxh;

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
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzbsp;->zzb(Ljava/lang/Object;)Lj3/a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public final synthetic zzc(Lorg/json/JSONObject;)Lj3/a;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfjc;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfiz;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zze:Lcom/google/android/gms/internal/ads/zzfjk;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzfiz;-><init>(Lcom/google/android/gms/internal/ads/zzfjk;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzp:Landroid/os/Bundle;

    .line 15
    .line 16
    new-instance v3, Ljava/io/StringReader;

    .line 17
    .line 18
    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzfjb;->zza(Ljava/io/Reader;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzfjb;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfjc;-><init>(Lcom/google/android/gms/internal/ads/zzfiz;Lcom/google/android/gms/internal/ads/zzfjb;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzegy;)Ljava/lang/String;
    .locals 11

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdxh;->zzI:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzeeg;->zzh(Lcom/google/android/gms/internal/ads/zzdxh;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Received HTTP error code from ad server:"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    :goto_0
    const/4 v3, 0x1

    .line 11
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzie:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-ge v1, v4, :cond_2

    .line 28
    .line 29
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzc:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 32
    .line 33
    iget-object v7, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzq:Lcom/google/android/gms/internal/ads/zzcac;

    .line 36
    .line 37
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    new-instance v5, Lcom/google/android/gms/internal/ads/zzeha;

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzeha;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcac;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, p1}, Lcom/google/android/gms/internal/ads/zzeha;->zzb(Lcom/google/android/gms/internal/ads/zzegy;)Lcom/google/android/gms/internal/ads/zzegz;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget v4, v2, Lcom/google/android/gms/internal/ads/zzegz;->zza:I

    .line 52
    .line 53
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzif:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 54
    .line 55
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_0

    .line 70
    .line 71
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzj:Lcom/google/android/gms/internal/ads/zzdxt;

    .line 72
    .line 73
    const-string v6, "fr"

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzdxt;->zzd(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catch_0
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    goto :goto_2

    .line 86
    :cond_0
    :goto_1
    const/16 v5, 0xc8

    .line 87
    .line 88
    if-ne v4, v5, :cond_1

    .line 89
    .line 90
    sget-object p1, Lcom/google/android/gms/internal/ads/zzdxh;->zzJ:Lcom/google/android/gms/internal/ads/zzdxh;

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzeeg;->zzh(Lcom/google/android/gms/internal/ads/zzdxh;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v2, Lcom/google/android/gms/internal/ads/zzegz;->zzc:Ljava/lang/String;

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    move v2, v4

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzenv;

    .line 103
    .line 104
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    add-int/lit8 v1, v1, 0x28

    .line 113
    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {p1, v3, v0}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenv;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    if-nez v1, :cond_3

    .line 140
    .line 141
    const-string v1, "Fetch failed."

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :goto_3
    invoke-direct {v0, v3, v1, p1}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    throw v0
.end method

.method public final synthetic zze(Ljava/util/List;Ljava/lang/Exception;)Lj3/a;
    .locals 6

    .line 1
    const-string v0, "PreloadedLoader.getTypeTwoAdResponseString"

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p2, Ljava/util/concurrent/TimeoutException;

    .line 11
    .line 12
    const-string v1, "Timed out waiting for ad response."

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p2, Lcom/google/android/gms/internal/ads/zzenv;

    .line 18
    .line 19
    invoke-direct {p2, v2, v1}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    instance-of v0, p2, Lcom/google/android/gms/internal/ads/zzenv;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    check-cast p2, Lcom/google/android/gms/internal/ads/zzenv;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenv;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    const-string p2, "Fetch failed."

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    invoke-direct {v0, v2, p2}, Lcom/google/android/gms/internal/ads/zzenv;-><init>(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object p2, v0

    .line 49
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    const-string v0, ""

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_2
    if-eqz p1, :cond_8

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const-string v4, "0.6.0.0"

    .line 76
    .line 77
    if-nez v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    const-string v0, "timeout"

    .line 86
    .line 87
    const-string v4, "0.2.0.0"

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    const-string v1, "Received HTTP error code from ad server:"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    const/16 v1, 0x3a

    .line 99
    .line 100
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgqq;->zzc(C)Lcom/google/android/gms/internal/ads/zzgqq;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrr;->zza(Lcom/google/android/gms/internal/ads/zzgqq;)Lcom/google/android/gms/internal/ads/zzgrr;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzgrr;->zze(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    const/4 v5, 0x2

    .line 117
    if-ne v3, v5, :cond_6

    .line 118
    .line 119
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Ljava/lang/String;

    .line 124
    .line 125
    :cond_6
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_7

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/lang/String;

    .line 145
    .line 146
    const-string v3, "@gw_adnetstatus@"

    .line 147
    .line 148
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const-string v3, "@error_code@"

    .line 153
    .line 154
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzk:Lcom/google/android/gms/internal/ads/zzfqk;

    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzfqk;->zza(Ljava/util/List;Lcom/google/android/gms/ads/internal/util/client/zzv;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    :goto_5
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    return-object p1
.end method

.method public final synthetic zzf()Lcom/google/android/gms/internal/ads/zzdej;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeg;->zzl:Lcom/google/android/gms/internal/ads/zzdej;

    return-object v0
.end method
