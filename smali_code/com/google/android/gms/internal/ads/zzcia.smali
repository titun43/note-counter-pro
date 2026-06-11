.class public final Lcom/google/android/gms/internal/ads/zzcia;
.super Lcom/google/android/gms/internal/ads/zzchr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcfu;


# static fields
.field public static final synthetic zzd:I


# instance fields
.field private zze:Lcom/google/android/gms/internal/ads/zzcfv;

.field private zzf:Ljava/lang/String;

.field private zzg:Z

.field private zzh:Z

.field private zzi:Lcom/google/android/gms/internal/ads/zzchj;

.field private zzj:J

.field private zzk:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcge;Lcom/google/android/gms/internal/ads/zzcgd;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzchr;-><init>(Lcom/google/android/gms/internal/ads/zzcge;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcge;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcit;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchr;->zzc:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/google/android/gms/internal/ads/zzcge;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzcit;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcgd;Lcom/google/android/gms/internal/ads/zzcge;Ljava/lang/Integer;)V

    .line 20
    .line 21
    .line 22
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 23
    .line 24
    const-string p1, "ExoPlayerAdapter initialized."

    .line 25
    .line 26
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzh(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzs(Lcom/google/android/gms/internal/ads/zzcfu;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final zzc(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzf(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "cache:"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private final zzd(J)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/google/android/gms/internal/ads/zzfyn;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzchy;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzchy;-><init>(Lcom/google/android/gms/internal/ads/zzcia;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    add-int/2addr v3, v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    add-int/2addr v3, v2

    .line 41
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v1, "/"

    .line 45
    .line 46
    const-string v2, ":"

    .line 47
    .line 48
    invoke-static {v4, p0, v1, v0, v2}, Ls/c;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public final release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzs(Lcom/google/android/gms/internal/ads/zzcfu;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzt()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final zzD()V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 2
    .line 3
    const-string v0, "Precache onRenderedFirstFrame"

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zza()Lcom/google/android/gms/internal/ads/zzcfv;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzh:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 6
    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzs(Lcom/google/android/gms/internal/ads/zzcfu;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 18
    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method public final zzb()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcia;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v17, "error"

    .line 10
    .line 11
    const-string v0, " ms"

    .line 12
    .line 13
    const-string v2, "Timeout reached. Limit: "

    .line 14
    .line 15
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzah:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    const-wide/16 v6, 0x3e8

    .line 32
    .line 33
    mul-long/2addr v4, v6

    .line 34
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbhe;->zzw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 35
    .line 36
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    int-to-long v6, v6

    .line 51
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbhe;->zzcw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 52
    .line 53
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    check-cast v9, Lx2/c;

    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzj:J

    .line 82
    .line 83
    sub-long/2addr v9, v11

    .line 84
    cmp-long v9, v9, v4

    .line 85
    .line 86
    if-gtz v9, :cond_a

    .line 87
    .line 88
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzg:Z

    .line 89
    .line 90
    if-nez v0, :cond_9

    .line 91
    .line 92
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzh:Z

    .line 93
    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    monitor-exit p0

    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzB()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_8

    .line 106
    .line 107
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzH()J

    .line 110
    .line 111
    .line 112
    move-result-wide v4

    .line 113
    const-wide/16 v18, 0x0

    .line 114
    .line 115
    cmp-long v0, v4, v18

    .line 116
    .line 117
    if-lez v0, :cond_7

    .line 118
    .line 119
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzN()J

    .line 122
    .line 123
    .line 124
    move-result-wide v9

    .line 125
    iget-wide v11, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzk:J

    .line 126
    .line 127
    cmp-long v0, v9, v11

    .line 128
    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    cmp-long v0, v9, v18

    .line 132
    .line 133
    if-lez v0, :cond_1

    .line 134
    .line 135
    const/4 v0, 0x1

    .line 136
    goto :goto_0

    .line 137
    :cond_1
    const/4 v0, 0x0

    .line 138
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 139
    .line 140
    const-wide/16 v11, -0x1

    .line 141
    .line 142
    if-eqz v8, :cond_2

    .line 143
    .line 144
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 145
    .line 146
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzcfv;->zzI()J

    .line 147
    .line 148
    .line 149
    move-result-wide v13

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    move-wide v13, v11

    .line 152
    :goto_1
    if-eqz v8, :cond_3

    .line 153
    .line 154
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 155
    .line 156
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzcfv;->zzJ()J

    .line 157
    .line 158
    .line 159
    move-result-wide v15

    .line 160
    goto :goto_2

    .line 161
    :cond_3
    move-wide v15, v11

    .line 162
    :goto_2
    if-eqz v8, :cond_4

    .line 163
    .line 164
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 165
    .line 166
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzcfv;->zzK()J

    .line 167
    .line 168
    .line 169
    move-result-wide v11

    .line 170
    :cond_4
    move-wide/from16 v20, v15

    .line 171
    .line 172
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcfv;->zzP()I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcfv;->zzQ()I

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    move-wide/from16 v22, v6

    .line 181
    .line 182
    move-wide v6, v4

    .line 183
    move-wide v4, v9

    .line 184
    move-wide v9, v13

    .line 185
    move-wide v13, v11

    .line 186
    move-wide/from16 v11, v20

    .line 187
    .line 188
    move-wide/from16 v20, v22

    .line 189
    .line 190
    move v8, v0

    .line 191
    invoke-virtual/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/zzchr;->zzm(Ljava/lang/String;Ljava/lang/String;JJZJJJII)V

    .line 192
    .line 193
    .line 194
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzk:J

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_5
    move-wide/from16 v20, v6

    .line 198
    .line 199
    move-wide v6, v4

    .line 200
    move-wide v4, v9

    .line 201
    :goto_3
    cmp-long v0, v4, v6

    .line 202
    .line 203
    if-ltz v0, :cond_6

    .line 204
    .line 205
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v1, v0, v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzchr;->zzp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 208
    .line 209
    .line 210
    monitor-exit p0

    .line 211
    goto/16 :goto_6

    .line 212
    .line 213
    :cond_6
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzO()J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    cmp-long v0, v6, v20

    .line 220
    .line 221
    if-ltz v0, :cond_7

    .line 222
    .line 223
    cmp-long v0, v4, v18

    .line 224
    .line 225
    if-lez v0, :cond_7

    .line 226
    .line 227
    monitor-exit p0

    .line 228
    goto/16 :goto_6

    .line 229
    .line 230
    :cond_7
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzai:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 232
    .line 233
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, Ljava/lang/Long;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcia;->zzd(J)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_8
    :try_start_2
    const-string v17, "exoPlayerReleased"

    .line 252
    .line 253
    new-instance v0, Ljava/io/IOException;

    .line 254
    .line 255
    const-string v2, "ExoPlayer was released during preloading."

    .line 256
    .line 257
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :cond_9
    const-string v17, "externalAbort"

    .line 262
    .line 263
    new-instance v0, Ljava/io/IOException;

    .line 264
    .line 265
    const-string v2, "Abort requested before buffering finished. "

    .line 266
    .line 267
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_a
    const-string v17, "downloadTimeout"

    .line 272
    .line 273
    new-instance v6, Ljava/io/IOException;

    .line 274
    .line 275
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    add-int/lit8 v7, v7, 0x1b

    .line 284
    .line 285
    new-instance v8, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v6

    .line 307
    :goto_4
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 309
    :catch_0
    move-exception v0

    .line 310
    move-object/from16 v2, v17

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :catchall_0
    move-exception v0

    .line 314
    goto :goto_4

    .line 315
    :goto_5
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    add-int/lit8 v6, v6, 0x22

    .line 334
    .line 335
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    new-instance v8, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    add-int/2addr v6, v7

    .line 342
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 343
    .line 344
    .line 345
    const-string v6, "Failed to preload url "

    .line 346
    .line 347
    const-string v7, " Exception: "

    .line 348
    .line 349
    invoke-static {v8, v6, v4, v7, v5}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    sget v5, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 354
    .line 355
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v4, "VideoStreamExoPlayerCache.preload"

    .line 359
    .line 360
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-virtual {v5, v0, v4}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcia;->release()V

    .line 368
    .line 369
    .line 370
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcia;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {v1, v4, v3, v2, v0}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :goto_6
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/google/android/gms/internal/ads/zzchk;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzi:Lcom/google/android/gms/internal/ads/zzchj;

    .line 384
    .line 385
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzchk;->zzd(Lcom/google/android/gms/internal/ads/zzchj;)V

    .line 386
    .line 387
    .line 388
    return-void
.end method

.method public final zze(Ljava/lang/String;)Z
    .locals 1

    .line 1
    filled-new-array {p1}, [Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzcia;->zzf(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final zzf(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 8
    .line 9
    const-string v17, "error"

    .line 10
    .line 11
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcia;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, " ms"

    .line 16
    .line 17
    const-string v5, "Timeout reached. Limit: "

    .line 18
    .line 19
    const/16 v18, 0x0

    .line 20
    .line 21
    :try_start_0
    array-length v6, v0

    .line 22
    new-array v6, v6, [Landroid/net/Uri;

    .line 23
    .line 24
    move/from16 v7, v18

    .line 25
    .line 26
    :goto_0
    array-length v8, v0

    .line 27
    if-ge v7, v8, :cond_0

    .line 28
    .line 29
    aget-object v8, v0, v7

    .line 30
    .line 31
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    aput-object v8, v6, v7

    .line 36
    .line 37
    add-int/lit8 v7, v7, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 41
    .line 42
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzchr;->zzb:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/ads/zzcfv;->zzq([Landroid/net/Uri;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzchr;->zzc:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcge;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-interface {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzcge;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzchr;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lx2/c;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v19

    .line 73
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzai:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 74
    .line 75
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v6

    .line 89
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzah:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 90
    .line 91
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/Long;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    const-wide/16 v10, 0x3e8

    .line 106
    .line 107
    mul-long/2addr v8, v10

    .line 108
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 109
    .line 110
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v10, v0

    .line 125
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzcw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 126
    .line 127
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    invoke-virtual {v12, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const-wide/16 v21, -0x1

    .line 142
    .line 143
    move-wide/from16 v12, v21

    .line 144
    .line 145
    :goto_1
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 146
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v14

    .line 150
    sub-long v14, v14, v19

    .line 151
    .line 152
    cmp-long v14, v14, v8

    .line 153
    .line 154
    if-gtz v14, :cond_d

    .line 155
    .line 156
    iget-boolean v14, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzg:Z

    .line 157
    .line 158
    if-nez v14, :cond_c

    .line 159
    .line 160
    iget-boolean v14, v1, Lcom/google/android/gms/internal/ads/zzcia;->zzh:Z

    .line 161
    .line 162
    const/16 v23, 0x1

    .line 163
    .line 164
    if-eqz v14, :cond_2

    .line 165
    .line 166
    monitor-exit p0

    .line 167
    goto/16 :goto_8

    .line 168
    .line 169
    :cond_2
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 170
    .line 171
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzcfv;->zzB()Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    if-eqz v14, :cond_b

    .line 176
    .line 177
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 178
    .line 179
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzcfv;->zzH()J

    .line 180
    .line 181
    .line 182
    move-result-wide v14

    .line 183
    const-wide/16 v24, 0x0

    .line 184
    .line 185
    cmp-long v16, v14, v24

    .line 186
    .line 187
    if-lez v16, :cond_a

    .line 188
    .line 189
    move/from16 p2, v0

    .line 190
    .line 191
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzN()J

    .line 194
    .line 195
    .line 196
    move-result-wide v26

    .line 197
    cmp-long v0, v26, v12

    .line 198
    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    cmp-long v0, v26, v24

    .line 202
    .line 203
    if-lez v0, :cond_3

    .line 204
    .line 205
    move-wide v12, v8

    .line 206
    move/from16 v8, v23

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_3
    move-wide v12, v8

    .line 210
    move/from16 v8, v18

    .line 211
    .line 212
    :goto_2
    if-eqz p2, :cond_4

    .line 213
    .line 214
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzI()J

    .line 217
    .line 218
    .line 219
    move-result-wide v28

    .line 220
    goto :goto_3

    .line 221
    :cond_4
    move-wide/from16 v28, v21

    .line 222
    .line 223
    :goto_3
    if-eqz p2, :cond_5

    .line 224
    .line 225
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzJ()J

    .line 228
    .line 229
    .line 230
    move-result-wide v30

    .line 231
    goto :goto_4

    .line 232
    :cond_5
    move-wide/from16 v30, v21

    .line 233
    .line 234
    :goto_4
    if-eqz p2, :cond_6

    .line 235
    .line 236
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 237
    .line 238
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfv;->zzK()J

    .line 239
    .line 240
    .line 241
    move-result-wide v32

    .line 242
    :goto_5
    move-wide/from16 v34, v6

    .line 243
    .line 244
    move-wide v6, v14

    .line 245
    goto :goto_6

    .line 246
    :cond_6
    move-wide/from16 v32, v21

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcfv;->zzP()I

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzcfv;->zzQ()I

    .line 254
    .line 255
    .line 256
    move-result v16

    .line 257
    move-object v0, v5

    .line 258
    move-wide/from16 v36, v34

    .line 259
    .line 260
    move-wide/from16 v38, v26

    .line 261
    .line 262
    move-object/from16 v26, v4

    .line 263
    .line 264
    move-wide/from16 v4, v38

    .line 265
    .line 266
    move-wide/from16 v38, v28

    .line 267
    .line 268
    move-wide/from16 v40, v30

    .line 269
    .line 270
    move-wide/from16 v29, v10

    .line 271
    .line 272
    move-wide/from16 v27, v12

    .line 273
    .line 274
    move-wide/from16 v9, v38

    .line 275
    .line 276
    move-wide/from16 v11, v40

    .line 277
    .line 278
    move-wide/from16 v13, v32

    .line 279
    .line 280
    invoke-virtual/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/zzchr;->zzm(Ljava/lang/String;Ljava/lang/String;JJZJJJII)V

    .line 281
    .line 282
    .line 283
    move-wide v12, v4

    .line 284
    goto :goto_7

    .line 285
    :cond_7
    move-object v0, v5

    .line 286
    move-wide/from16 v36, v6

    .line 287
    .line 288
    move-wide/from16 v29, v10

    .line 289
    .line 290
    move-wide v6, v14

    .line 291
    move-wide/from16 v38, v26

    .line 292
    .line 293
    move-object/from16 v26, v4

    .line 294
    .line 295
    move-wide/from16 v27, v8

    .line 296
    .line 297
    move-wide/from16 v4, v38

    .line 298
    .line 299
    :goto_7
    cmp-long v8, v4, v6

    .line 300
    .line 301
    if-ltz v8, :cond_8

    .line 302
    .line 303
    invoke-virtual {v1, v2, v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzchr;->zzp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 304
    .line 305
    .line 306
    monitor-exit p0

    .line 307
    goto :goto_8

    .line 308
    :cond_8
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 309
    .line 310
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfv;->zzO()J

    .line 311
    .line 312
    .line 313
    move-result-wide v6

    .line 314
    cmp-long v6, v6, v29

    .line 315
    .line 316
    if-ltz v6, :cond_9

    .line 317
    .line 318
    cmp-long v4, v4, v24

    .line 319
    .line 320
    if-lez v4, :cond_9

    .line 321
    .line 322
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 323
    :goto_8
    return v23

    .line 324
    :cond_9
    move-wide/from16 v4, v36

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_a
    move/from16 p2, v0

    .line 328
    .line 329
    move-object/from16 v26, v4

    .line 330
    .line 331
    move-object v0, v5

    .line 332
    move-wide/from16 v27, v8

    .line 333
    .line 334
    move-wide/from16 v29, v10

    .line 335
    .line 336
    move-wide v4, v6

    .line 337
    :goto_9
    :try_start_2
    invoke-virtual {v1, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 338
    .line 339
    .line 340
    :try_start_3
    monitor-exit p0

    .line 341
    move-wide v6, v4

    .line 342
    move-object/from16 v4, v26

    .line 343
    .line 344
    move-wide/from16 v8, v27

    .line 345
    .line 346
    move-wide/from16 v10, v29

    .line 347
    .line 348
    move-object v5, v0

    .line 349
    move/from16 v0, p2

    .line 350
    .line 351
    goto/16 :goto_1

    .line 352
    .line 353
    :catch_0
    const-string v17, "interrupted"

    .line 354
    .line 355
    new-instance v0, Ljava/io/IOException;

    .line 356
    .line 357
    const-string v4, "Wait interrupted."

    .line 358
    .line 359
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v0

    .line 363
    :cond_b
    const-string v17, "exoPlayerReleased"

    .line 364
    .line 365
    new-instance v0, Ljava/io/IOException;

    .line 366
    .line 367
    const-string v4, "ExoPlayer was released during preloading."

    .line 368
    .line 369
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :cond_c
    const-string v17, "externalAbort"

    .line 374
    .line 375
    new-instance v0, Ljava/io/IOException;

    .line 376
    .line 377
    const-string v4, "Abort requested before buffering finished. "

    .line 378
    .line 379
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_d
    move-object/from16 v26, v4

    .line 384
    .line 385
    move-object v0, v5

    .line 386
    move-wide/from16 v27, v8

    .line 387
    .line 388
    const-string v17, "downloadTimeout"

    .line 389
    .line 390
    new-instance v4, Ljava/io/IOException;

    .line 391
    .line 392
    invoke-static/range {v27 .. v28}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 397
    .line 398
    .line 399
    move-result v5

    .line 400
    add-int/lit8 v5, v5, 0x1b

    .line 401
    .line 402
    new-instance v6, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    move-wide/from16 v12, v27

    .line 411
    .line 412
    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    move-object/from16 v0, v26

    .line 416
    .line 417
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    throw v4

    .line 428
    :goto_a
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 429
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 430
    :catch_1
    move-exception v0

    .line 431
    move-object/from16 v4, v17

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :catchall_0
    move-exception v0

    .line 435
    goto :goto_a

    .line 436
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    add-int/lit8 v6, v6, 0x22

    .line 453
    .line 454
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    new-instance v8, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    add-int/2addr v6, v7

    .line 461
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 462
    .line 463
    .line 464
    const-string v6, "Failed to preload url "

    .line 465
    .line 466
    const-string v7, " Exception: "

    .line 467
    .line 468
    invoke-static {v8, v6, v2, v7, v5}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    sget v6, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 473
    .line 474
    invoke-static {v5}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v5, "VideoStreamExoPlayerCache.preload"

    .line 478
    .line 479
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-virtual {v6, v0, v5}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcia;->release()V

    .line 487
    .line 488
    .line 489
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzcia;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    return v18
.end method

.method public final zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzchj;)Z
    .locals 5

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzi:Lcom/google/android/gms/internal/ads/zzchj;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcia;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    array-length v1, p2

    .line 11
    new-array v1, v1, [Landroid/net/Uri;

    .line 12
    .line 13
    move v2, v0

    .line 14
    :goto_0
    array-length v3, p2

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    aget-object v3, p2, v2

    .line 18
    .line 19
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aput-object v3, v1, v2

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzchr;->zzb:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzcfv;->zzq([Landroid/net/Uri;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzchr;->zzc:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lcom/google/android/gms/internal/ads/zzcge;

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-interface {p2, p3, p0}, Lcom/google/android/gms/internal/ads/zzcge;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzchr;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Lx2/c;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzj:J

    .line 64
    .line 65
    const-wide/16 v1, -0x1

    .line 66
    .line 67
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzk:J

    .line 68
    .line 69
    const-wide/16 v1, 0x0

    .line 70
    .line 71
    invoke-direct {p0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcia;->zzd(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    return p1

    .line 76
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    add-int/lit8 v2, v2, 0x22

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    new-instance v4, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    add-int/2addr v2, v3

    .line 101
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const-string v2, "Failed to preload url "

    .line 105
    .line 106
    const-string v3, " Exception: "

    .line 107
    .line 108
    invoke-static {v4, v2, p1, v3, v1}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 113
    .line 114
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string v1, "VideoStreamExoPlayerCache.preload"

    .line 118
    .line 119
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2, p2, v1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcia;->release()V

    .line 127
    .line 128
    .line 129
    const-string v1, "error"

    .line 130
    .line 131
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/ads/zzcia;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p0, p1, p3, v1, p2}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return v0
.end method

.method public final zzh(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzG(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzi(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzF(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzj(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzy(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzk(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zze:Lcom/google/android/gms/internal/ads/zzcfv;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcfv;->zzz(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzl()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzg:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcia;->release()V

    .line 9
    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcia;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcia;->zzf:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "externalAbort"

    .line 23
    .line 24
    const-string v3, "Programmatic precache abort."

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzchr;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method public final zzr(ZJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchr;->zzc:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcge;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zzf:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/internal/ads/zzchz;

    .line 14
    .line 15
    invoke-direct {v2, v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzchz;-><init>(Lcom/google/android/gms/internal/ads/zzcge;ZJ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final zzs(I)V
    .locals 0

    return-void
.end method

.method public final zzt(II)V
    .locals 0

    return-void
.end method

.method public final zzu(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 2
    .line 3
    const-string p1, "Precache error"

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "VideoStreamExoPlayerCache.onError"

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final zzv(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 2
    .line 3
    const-string p1, "Precache exception"

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "VideoStreamExoPlayerCache.onException"

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
