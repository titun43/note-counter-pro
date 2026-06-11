.class public final Lcom/google/android/gms/internal/ads/zzaeq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzafa;


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[I

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzaep;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzaep;


# instance fields
.field private zze:Lcom/google/android/gms/internal/ads/zzguf;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzamd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/internal/ads/zzaeq;->zzb:[I

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaep;

    .line 11
    .line 12
    sget-object v1, Lcom/google/android/gms/internal/ads/zzaen;->zza:Lcom/google/android/gms/internal/ads/zzaen;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaep;-><init>(Lcom/google/android/gms/internal/ads/zzaeo;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/internal/ads/zzaeq;->zzc:Lcom/google/android/gms/internal/ads/zzaep;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaep;

    .line 20
    .line 21
    sget-object v1, Lcom/google/android/gms/internal/ads/zzaem;->zza:Lcom/google/android/gms/internal/ads/zzaem;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzaep;-><init>(Lcom/google/android/gms/internal/ads/zzaeo;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/internal/ads/zzaeq;->zzd:Lcom/google/android/gms/internal/ads/zzaep;

    .line 27
    .line 28
    return-void

    .line 29
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaly;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaly;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zzf:Lcom/google/android/gms/internal/ads/zzamd;

    return-void
.end method

.method private final zzc(ILjava/util/List;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p1, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    :pswitch_0
    goto :goto_0

    .line 6
    :pswitch_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaha;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaha;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahp;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzahp;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahb;

    .line 25
    .line 26
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahb;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqp;

    .line 34
    .line 35
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaqp;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzalw;

    .line 43
    .line 44
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzalw;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zzf:Lcom/google/android/gms/internal/ads/zzamd;

    .line 52
    .line 53
    new-instance v1, Lcom/google/android/gms/internal/ads/zzagt;

    .line 54
    .line 55
    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzagt;-><init>(ILcom/google/android/gms/internal/ads/zzamd;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaeq;->zzd:Lcom/google/android/gms/internal/ads/zzaep;

    .line 63
    .line 64
    new-array v0, v0, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaep;->zza([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzaeu;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_0
    :goto_0
    return-void

    .line 76
    :pswitch_8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahq;

    .line 77
    .line 78
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzahq;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_9
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqk;

    .line 86
    .line 87
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaqk;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_a
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zze:Lcom/google/android/gms/internal/ads/zzguf;

    .line 95
    .line 96
    if-nez p1, :cond_1

    .line 97
    .line 98
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zze:Lcom/google/android/gms/internal/ads/zzguf;

    .line 103
    .line 104
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zzf:Lcom/google/android/gms/internal/ads/zzamd;

    .line 105
    .line 106
    new-instance v1, Lcom/google/android/gms/internal/ads/zzapx;

    .line 107
    .line 108
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfg;

    .line 109
    .line 110
    const-wide/16 v2, 0x0

    .line 111
    .line 112
    invoke-direct {v5, v2, v3}, Lcom/google/android/gms/internal/ads/zzfg;-><init>(J)V

    .line 113
    .line 114
    .line 115
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaok;

    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zze:Lcom/google/android/gms/internal/ads/zzguf;

    .line 118
    .line 119
    invoke-direct {v6, v0, p1}, Lcom/google/android/gms/internal/ads/zzaok;-><init>(ILjava/util/List;)V

    .line 120
    .line 121
    .line 122
    const v7, 0x1b8a0

    .line 123
    .line 124
    .line 125
    const/4 v2, 0x1

    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzapx;-><init>(IILcom/google/android/gms/internal/ads/zzamd;Lcom/google/android/gms/internal/ads/zzfg;Lcom/google/android/gms/internal/ads/zzaqa;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_b
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapm;

    .line 135
    .line 136
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzapm;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_c
    new-instance p1, Lcom/google/android/gms/internal/ads/zzalm;

    .line 144
    .line 145
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzalm;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_d
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zzf:Lcom/google/android/gms/internal/ads/zzamd;

    .line 153
    .line 154
    new-instance v1, Lcom/google/android/gms/internal/ads/zzako;

    .line 155
    .line 156
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    const/4 v7, 0x0

    .line 161
    const/4 v3, 0x0

    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v5, 0x0

    .line 164
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzako;-><init>(Lcom/google/android/gms/internal/ads/zzamd;ILcom/google/android/gms/internal/ads/zzfg;Lcom/google/android/gms/internal/ads/zzalc;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzagh;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    new-instance p1, Lcom/google/android/gms/internal/ads/zzakw;

    .line 171
    .line 172
    invoke-direct {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzakw;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_e
    new-instance p1, Lcom/google/android/gms/internal/ads/zzajp;

    .line 180
    .line 181
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzajp;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_f
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaeq;->zzf:Lcom/google/android/gms/internal/ads/zzamd;

    .line 189
    .line 190
    new-instance v1, Lcom/google/android/gms/internal/ads/zzajh;

    .line 191
    .line 192
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzajh;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_10
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahj;

    .line 200
    .line 201
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahj;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaeq;->zzc:Lcom/google/android/gms/internal/ads/zzaep;

    .line 209
    .line 210
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzaep;->zza([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzaeu;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-eqz p1, :cond_2

    .line 223
    .line 224
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahg;

    .line 229
    .line 230
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzahg;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_12
    new-instance p1, Lcom/google/android/gms/internal/ads/zzagp;

    .line 238
    .line 239
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzagp;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_13
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoi;

    .line 247
    .line 248
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzaoi;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_14
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaof;

    .line 256
    .line 257
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaof;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :pswitch_15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoc;

    .line 265
    .line 266
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaoc;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final declared-synchronized zza()[Lcom/google/android/gms/internal/ads/zzaeu;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzaeq;->zzb(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzaeu;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final declared-synchronized zzb(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzaeu;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/util/List;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v4, v3

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_a

    .line 42
    .line 43
    :cond_1
    :goto_0
    const/4 v8, 0x4

    .line 44
    const/4 v9, 0x7

    .line 45
    const/4 v10, 0x6

    .line 46
    const/16 v11, 0x14

    .line 47
    .line 48
    const/16 v12, 0xb

    .line 49
    .line 50
    const/16 v13, 0xe

    .line 51
    .line 52
    const/16 v14, 0xd

    .line 53
    .line 54
    const/16 v15, 0x13

    .line 55
    .line 56
    const/16 v16, 0x1

    .line 57
    .line 58
    const/16 v17, 0x9

    .line 59
    .line 60
    const/16 v18, 0xc

    .line 61
    .line 62
    const/16 v19, 0xf

    .line 63
    .line 64
    const/16 v20, 0x8

    .line 65
    .line 66
    const/16 v21, 0xa

    .line 67
    .line 68
    const/4 v3, -0x1

    .line 69
    if-nez v4, :cond_3

    .line 70
    .line 71
    :cond_2
    :goto_1
    move v4, v3

    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :cond_3
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzas;->zzh(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v22

    .line 82
    sparse-switch v22, :sswitch_data_0

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :sswitch_0
    const-string v6, "video/x-matroska"

    .line 87
    .line 88
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :sswitch_1
    const-string v6, "audio/webm"

    .line 97
    .line 98
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :sswitch_2
    const-string v6, "audio/mpeg"

    .line 107
    .line 108
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_2

    .line 113
    .line 114
    move v4, v9

    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :sswitch_3
    const-string v6, "audio/midi"

    .line 118
    .line 119
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_2

    .line 124
    .line 125
    move/from16 v4, v19

    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :sswitch_4
    const-string v6, "audio/flac"

    .line 130
    .line 131
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_2

    .line 136
    .line 137
    move v4, v8

    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :sswitch_5
    const-string v6, "audio/eac3"

    .line 141
    .line 142
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_2

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :sswitch_6
    const-string v6, "audio/3gpp"

    .line 151
    .line 152
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_2

    .line 157
    .line 158
    goto/16 :goto_4

    .line 159
    .line 160
    :sswitch_7
    const-string v6, "video/mp4"

    .line 161
    .line 162
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_2

    .line 167
    .line 168
    goto/16 :goto_2

    .line 169
    .line 170
    :sswitch_8
    const-string v6, "audio/wav"

    .line 171
    .line 172
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_2

    .line 177
    .line 178
    move/from16 v4, v18

    .line 179
    .line 180
    goto/16 :goto_7

    .line 181
    .line 182
    :sswitch_9
    const-string v6, "audio/ogg"

    .line 183
    .line 184
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_2

    .line 189
    .line 190
    move/from16 v4, v17

    .line 191
    .line 192
    goto/16 :goto_7

    .line 193
    .line 194
    :sswitch_a
    const-string v6, "audio/mp4"

    .line 195
    .line 196
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_2

    .line 201
    .line 202
    goto/16 :goto_2

    .line 203
    .line 204
    :sswitch_b
    const-string v6, "audio/amr"

    .line 205
    .line 206
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_2

    .line 211
    .line 212
    goto/16 :goto_4

    .line 213
    .line 214
    :sswitch_c
    const-string v6, "audio/ac4"

    .line 215
    .line 216
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_2

    .line 221
    .line 222
    move/from16 v4, v16

    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :sswitch_d
    const-string v6, "audio/ac3"

    .line 227
    .line 228
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_2

    .line 233
    .line 234
    goto/16 :goto_6

    .line 235
    .line 236
    :sswitch_e
    const-string v6, "video/x-flv"

    .line 237
    .line 238
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    if-eqz v4, :cond_2

    .line 243
    .line 244
    const/4 v4, 0x5

    .line 245
    goto/16 :goto_7

    .line 246
    .line 247
    :sswitch_f
    const-string v6, "application/webm"

    .line 248
    .line 249
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_2

    .line 254
    .line 255
    goto/16 :goto_5

    .line 256
    .line 257
    :sswitch_10
    const-string v6, "audio/x-matroska"

    .line 258
    .line 259
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-eqz v4, :cond_2

    .line 264
    .line 265
    goto/16 :goto_5

    .line 266
    .line 267
    :sswitch_11
    const-string v6, "image/png"

    .line 268
    .line 269
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_2

    .line 274
    .line 275
    const/16 v4, 0x11

    .line 276
    .line 277
    goto/16 :goto_7

    .line 278
    .line 279
    :sswitch_12
    const-string v6, "image/bmp"

    .line 280
    .line 281
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-eqz v4, :cond_2

    .line 286
    .line 287
    move v4, v15

    .line 288
    goto/16 :goto_7

    .line 289
    .line 290
    :sswitch_13
    const-string v6, "text/vtt"

    .line 291
    .line 292
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-eqz v4, :cond_2

    .line 297
    .line 298
    move v4, v14

    .line 299
    goto/16 :goto_7

    .line 300
    .line 301
    :sswitch_14
    const-string v6, "video/x-msvideo"

    .line 302
    .line 303
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_2

    .line 308
    .line 309
    const/16 v4, 0x10

    .line 310
    .line 311
    goto/16 :goto_7

    .line 312
    .line 313
    :sswitch_15
    const-string v6, "application/mp4"

    .line 314
    .line 315
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-eqz v4, :cond_2

    .line 320
    .line 321
    :goto_2
    move/from16 v4, v20

    .line 322
    .line 323
    goto/16 :goto_7

    .line 324
    .line 325
    :sswitch_16
    const-string v6, "image/webp"

    .line 326
    .line 327
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_2

    .line 332
    .line 333
    const/16 v4, 0x12

    .line 334
    .line 335
    goto/16 :goto_7

    .line 336
    .line 337
    :sswitch_17
    const-string v6, "image/jpeg"

    .line 338
    .line 339
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    if-eqz v4, :cond_2

    .line 344
    .line 345
    move v4, v13

    .line 346
    goto :goto_7

    .line 347
    :sswitch_18
    const-string v6, "image/heif"

    .line 348
    .line 349
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_2

    .line 354
    .line 355
    goto :goto_3

    .line 356
    :sswitch_19
    const-string v6, "image/heic"

    .line 357
    .line 358
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_2

    .line 363
    .line 364
    :goto_3
    move v4, v11

    .line 365
    goto :goto_7

    .line 366
    :sswitch_1a
    const-string v6, "image/avif"

    .line 367
    .line 368
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    if-eqz v4, :cond_2

    .line 373
    .line 374
    move v4, v2

    .line 375
    goto :goto_7

    .line 376
    :sswitch_1b
    const-string v6, "audio/amr-wb"

    .line 377
    .line 378
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    if-eqz v4, :cond_2

    .line 383
    .line 384
    :goto_4
    const/4 v4, 0x3

    .line 385
    goto :goto_7

    .line 386
    :sswitch_1c
    const-string v6, "video/webm"

    .line 387
    .line 388
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    if-eqz v4, :cond_2

    .line 393
    .line 394
    :goto_5
    move v4, v10

    .line 395
    goto :goto_7

    .line 396
    :sswitch_1d
    const-string v6, "video/mp2t"

    .line 397
    .line 398
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-eqz v4, :cond_2

    .line 403
    .line 404
    move v4, v12

    .line 405
    goto :goto_7

    .line 406
    :sswitch_1e
    const-string v6, "video/mp2p"

    .line 407
    .line 408
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_2

    .line 413
    .line 414
    move/from16 v4, v21

    .line 415
    .line 416
    goto :goto_7

    .line 417
    :sswitch_1f
    const-string v6, "audio/eac3-joc"

    .line 418
    .line 419
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    if-eqz v4, :cond_2

    .line 424
    .line 425
    :goto_6
    move v4, v5

    .line 426
    :goto_7
    if-eq v4, v3, :cond_4

    .line 427
    .line 428
    invoke-direct {v1, v4, v0}, Lcom/google/android/gms/internal/ads/zzaeq;->zzc(ILjava/util/List;)V

    .line 429
    .line 430
    .line 431
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    if-nez v6, :cond_6

    .line 436
    .line 437
    :cond_5
    move v6, v3

    .line 438
    goto/16 :goto_8

    .line 439
    .line 440
    :cond_6
    const-string v7, ".ac3"

    .line 441
    .line 442
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    if-nez v7, :cond_7

    .line 447
    .line 448
    const-string v7, ".ec3"

    .line 449
    .line 450
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    if-eqz v7, :cond_8

    .line 455
    .line 456
    :cond_7
    move v6, v5

    .line 457
    goto/16 :goto_8

    .line 458
    .line 459
    :cond_8
    const-string v7, ".ac4"

    .line 460
    .line 461
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    if-eqz v7, :cond_9

    .line 466
    .line 467
    move/from16 v6, v16

    .line 468
    .line 469
    goto/16 :goto_8

    .line 470
    .line 471
    :cond_9
    const-string v7, ".adts"

    .line 472
    .line 473
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v7

    .line 477
    if-nez v7, :cond_a

    .line 478
    .line 479
    const-string v7, ".aac"

    .line 480
    .line 481
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v7

    .line 485
    if-eqz v7, :cond_b

    .line 486
    .line 487
    :cond_a
    const/4 v6, 0x2

    .line 488
    goto/16 :goto_8

    .line 489
    .line 490
    :cond_b
    const-string v7, ".amr"

    .line 491
    .line 492
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 493
    .line 494
    .line 495
    move-result v7

    .line 496
    if-eqz v7, :cond_c

    .line 497
    .line 498
    const/4 v6, 0x3

    .line 499
    goto/16 :goto_8

    .line 500
    .line 501
    :cond_c
    const-string v7, ".flac"

    .line 502
    .line 503
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 504
    .line 505
    .line 506
    move-result v7

    .line 507
    if-eqz v7, :cond_d

    .line 508
    .line 509
    move v6, v8

    .line 510
    goto/16 :goto_8

    .line 511
    .line 512
    :cond_d
    const-string v7, ".flv"

    .line 513
    .line 514
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    if-eqz v7, :cond_e

    .line 519
    .line 520
    const/4 v6, 0x5

    .line 521
    goto/16 :goto_8

    .line 522
    .line 523
    :cond_e
    const-string v7, ".mid"

    .line 524
    .line 525
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 526
    .line 527
    .line 528
    move-result v7

    .line 529
    if-nez v7, :cond_f

    .line 530
    .line 531
    const-string v7, ".midi"

    .line 532
    .line 533
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-nez v7, :cond_f

    .line 538
    .line 539
    const-string v7, ".smf"

    .line 540
    .line 541
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    if-eqz v7, :cond_10

    .line 546
    .line 547
    :cond_f
    move/from16 v6, v19

    .line 548
    .line 549
    goto/16 :goto_8

    .line 550
    .line 551
    :cond_10
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    const-string v8, ".mk"

    .line 556
    .line 557
    add-int/lit8 v7, v7, -0x4

    .line 558
    .line 559
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 560
    .line 561
    .line 562
    move-result v7

    .line 563
    if-nez v7, :cond_11

    .line 564
    .line 565
    const-string v7, ".webm"

    .line 566
    .line 567
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    if-eqz v7, :cond_12

    .line 572
    .line 573
    :cond_11
    move v6, v10

    .line 574
    goto/16 :goto_8

    .line 575
    .line 576
    :cond_12
    const-string v7, ".mp3"

    .line 577
    .line 578
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    if-eqz v7, :cond_13

    .line 583
    .line 584
    move v6, v9

    .line 585
    goto/16 :goto_8

    .line 586
    .line 587
    :cond_13
    const-string v7, ".mp4"

    .line 588
    .line 589
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 590
    .line 591
    .line 592
    move-result v7

    .line 593
    if-nez v7, :cond_14

    .line 594
    .line 595
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 596
    .line 597
    .line 598
    move-result v7

    .line 599
    add-int/lit8 v7, v7, -0x4

    .line 600
    .line 601
    const-string v8, ".m4"

    .line 602
    .line 603
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 604
    .line 605
    .line 606
    move-result v7

    .line 607
    if-nez v7, :cond_14

    .line 608
    .line 609
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    const-string v8, ".mp4"

    .line 614
    .line 615
    add-int/lit8 v7, v7, -0x5

    .line 616
    .line 617
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    if-nez v7, :cond_14

    .line 622
    .line 623
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 624
    .line 625
    .line 626
    move-result v7

    .line 627
    add-int/lit8 v7, v7, -0x5

    .line 628
    .line 629
    const-string v8, ".cmf"

    .line 630
    .line 631
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 632
    .line 633
    .line 634
    move-result v7

    .line 635
    if-eqz v7, :cond_15

    .line 636
    .line 637
    :cond_14
    move/from16 v6, v20

    .line 638
    .line 639
    goto/16 :goto_8

    .line 640
    .line 641
    :cond_15
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 642
    .line 643
    .line 644
    move-result v7

    .line 645
    add-int/lit8 v7, v7, -0x4

    .line 646
    .line 647
    const-string v8, ".og"

    .line 648
    .line 649
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 650
    .line 651
    .line 652
    move-result v7

    .line 653
    if-nez v7, :cond_16

    .line 654
    .line 655
    const-string v7, ".opus"

    .line 656
    .line 657
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 658
    .line 659
    .line 660
    move-result v7

    .line 661
    if-eqz v7, :cond_17

    .line 662
    .line 663
    :cond_16
    move/from16 v6, v17

    .line 664
    .line 665
    goto/16 :goto_8

    .line 666
    .line 667
    :cond_17
    const-string v7, ".ps"

    .line 668
    .line 669
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    if-nez v7, :cond_18

    .line 674
    .line 675
    const-string v7, ".mpeg"

    .line 676
    .line 677
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 678
    .line 679
    .line 680
    move-result v7

    .line 681
    if-nez v7, :cond_18

    .line 682
    .line 683
    const-string v7, ".mpg"

    .line 684
    .line 685
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 686
    .line 687
    .line 688
    move-result v7

    .line 689
    if-nez v7, :cond_18

    .line 690
    .line 691
    const-string v7, ".m2p"

    .line 692
    .line 693
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 694
    .line 695
    .line 696
    move-result v7

    .line 697
    if-eqz v7, :cond_19

    .line 698
    .line 699
    :cond_18
    move/from16 v6, v21

    .line 700
    .line 701
    goto/16 :goto_8

    .line 702
    .line 703
    :cond_19
    const-string v7, ".ts"

    .line 704
    .line 705
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v7

    .line 709
    if-nez v7, :cond_1a

    .line 710
    .line 711
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    add-int/lit8 v7, v7, -0x4

    .line 716
    .line 717
    const-string v8, ".ts"

    .line 718
    .line 719
    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 720
    .line 721
    .line 722
    move-result v7

    .line 723
    if-eqz v7, :cond_1b

    .line 724
    .line 725
    :cond_1a
    move v6, v12

    .line 726
    goto/16 :goto_8

    .line 727
    .line 728
    :cond_1b
    const-string v7, ".wav"

    .line 729
    .line 730
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 731
    .line 732
    .line 733
    move-result v7

    .line 734
    if-nez v7, :cond_1c

    .line 735
    .line 736
    const-string v7, ".wave"

    .line 737
    .line 738
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 739
    .line 740
    .line 741
    move-result v7

    .line 742
    if-eqz v7, :cond_1d

    .line 743
    .line 744
    :cond_1c
    move/from16 v6, v18

    .line 745
    .line 746
    goto/16 :goto_8

    .line 747
    .line 748
    :cond_1d
    const-string v7, ".vtt"

    .line 749
    .line 750
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    if-nez v7, :cond_1e

    .line 755
    .line 756
    const-string v7, ".webvtt"

    .line 757
    .line 758
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    if-eqz v7, :cond_1f

    .line 763
    .line 764
    :cond_1e
    move v6, v14

    .line 765
    goto/16 :goto_8

    .line 766
    .line 767
    :cond_1f
    const-string v7, ".jpg"

    .line 768
    .line 769
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 770
    .line 771
    .line 772
    move-result v7

    .line 773
    if-nez v7, :cond_20

    .line 774
    .line 775
    const-string v7, ".jpeg"

    .line 776
    .line 777
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 778
    .line 779
    .line 780
    move-result v7

    .line 781
    if-eqz v7, :cond_21

    .line 782
    .line 783
    :cond_20
    move v6, v13

    .line 784
    goto :goto_8

    .line 785
    :cond_21
    const-string v7, ".avi"

    .line 786
    .line 787
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 788
    .line 789
    .line 790
    move-result v7

    .line 791
    if-eqz v7, :cond_22

    .line 792
    .line 793
    const/16 v6, 0x10

    .line 794
    .line 795
    goto :goto_8

    .line 796
    :cond_22
    const-string v7, ".png"

    .line 797
    .line 798
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 799
    .line 800
    .line 801
    move-result v7

    .line 802
    if-eqz v7, :cond_23

    .line 803
    .line 804
    const/16 v6, 0x11

    .line 805
    .line 806
    goto :goto_8

    .line 807
    :cond_23
    const-string v7, ".webp"

    .line 808
    .line 809
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 810
    .line 811
    .line 812
    move-result v7

    .line 813
    if-eqz v7, :cond_24

    .line 814
    .line 815
    const/16 v6, 0x12

    .line 816
    .line 817
    goto :goto_8

    .line 818
    :cond_24
    const-string v7, ".bmp"

    .line 819
    .line 820
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 821
    .line 822
    .line 823
    move-result v7

    .line 824
    if-nez v7, :cond_25

    .line 825
    .line 826
    const-string v7, ".dib"

    .line 827
    .line 828
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 829
    .line 830
    .line 831
    move-result v7

    .line 832
    if-eqz v7, :cond_26

    .line 833
    .line 834
    :cond_25
    move v6, v15

    .line 835
    goto :goto_8

    .line 836
    :cond_26
    const-string v7, ".heic"

    .line 837
    .line 838
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 839
    .line 840
    .line 841
    move-result v7

    .line 842
    if-nez v7, :cond_27

    .line 843
    .line 844
    const-string v7, ".heif"

    .line 845
    .line 846
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    if-eqz v7, :cond_28

    .line 851
    .line 852
    :cond_27
    move v6, v11

    .line 853
    goto :goto_8

    .line 854
    :cond_28
    const-string v7, ".avif"

    .line 855
    .line 856
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 857
    .line 858
    .line 859
    move-result v6

    .line 860
    if-eqz v6, :cond_5

    .line 861
    .line 862
    move v6, v2

    .line 863
    :goto_8
    if-eq v6, v3, :cond_29

    .line 864
    .line 865
    if-eq v6, v4, :cond_29

    .line 866
    .line 867
    invoke-direct {v1, v6, v0}, Lcom/google/android/gms/internal/ads/zzaeq;->zzc(ILjava/util/List;)V

    .line 868
    .line 869
    .line 870
    :cond_29
    sget-object v3, Lcom/google/android/gms/internal/ads/zzaeq;->zzb:[I

    .line 871
    .line 872
    move v7, v5

    .line 873
    :goto_9
    if-ge v7, v2, :cond_2b

    .line 874
    .line 875
    aget v8, v3, v7

    .line 876
    .line 877
    if-eq v8, v4, :cond_2a

    .line 878
    .line 879
    if-eq v8, v6, :cond_2a

    .line 880
    .line 881
    invoke-direct {v1, v8, v0}, Lcom/google/android/gms/internal/ads/zzaeq;->zzc(ILjava/util/List;)V

    .line 882
    .line 883
    .line 884
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 885
    .line 886
    goto :goto_9

    .line 887
    :cond_2b
    new-array v2, v5, [Lcom/google/android/gms/internal/ads/zzaeu;

    .line 888
    .line 889
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    check-cast v0, [Lcom/google/android/gms/internal/ads/zzaeu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 894
    .line 895
    monitor-exit p0

    .line 896
    return-object v0

    .line 897
    :goto_a
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 898
    throw v0

    .line 899
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_1f
        -0x6315f78b -> :sswitch_1e
        -0x6315f787 -> :sswitch_1d
        -0x63118f53 -> :sswitch_1c
        -0x5fc6f775 -> :sswitch_1b
        -0x58abd7ba -> :sswitch_1a
        -0x58a8e8f5 -> :sswitch_19
        -0x58a8e8f2 -> :sswitch_18
        -0x58a7d764 -> :sswitch_17
        -0x58a21830 -> :sswitch_16
        -0x4a681e4e -> :sswitch_15
        -0x405dba54 -> :sswitch_14
        -0x3be2f26c -> :sswitch_13
        -0x3468a12f -> :sswitch_12
        -0x34686c8b -> :sswitch_11
        -0x17118226 -> :sswitch_10
        -0x2974308 -> :sswitch_f
        0xd45707 -> :sswitch_e
        0xb269698 -> :sswitch_d
        0xb269699 -> :sswitch_c
        0xb26980d -> :sswitch_b
        0xb26c538 -> :sswitch_a
        0xb26cbd6 -> :sswitch_9
        0xb26e933 -> :sswitch_8
        0x4f62635d -> :sswitch_7
        0x59976a2d -> :sswitch_6
        0x59ae0c65 -> :sswitch_5
        0x59aeaa01 -> :sswitch_4
        0x59b1cdba -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x59b64a32 -> :sswitch_1
        0x79909c15 -> :sswitch_0
    .end sparse-switch
.end method
