.class final Lcom/google/android/gms/internal/ads/zzfla;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfkz;


# instance fields
.field private final zza:Ljava/util/concurrent/ConcurrentHashMap;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzflc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzflg;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzd:I

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zza:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzflc;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzflc;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 21
    .line 22
    return-void
.end method

.method private final zzf()V
    .locals 8

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzflg;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzhl:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    .line 27
    .line 28
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzb:Lcom/google/android/gms/internal/ads/zzfld;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " PoolCollection"

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzflc;->zzg()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfla;->zza:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/4 v3, 0x0

    .line 58
    move v4, v3

    .line 59
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Ljava/util/Map$Entry;

    .line 70
    .line 71
    add-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v6, ". "

    .line 77
    .line 78
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v6, "#"

    .line 89
    .line 90
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lcom/google/android/gms/internal/ads/zzflj;

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v6, "    "

    .line 107
    .line 108
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move v6, v3

    .line 112
    :goto_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    check-cast v7, Lcom/google/android/gms/internal/ads/zzfky;

    .line 117
    .line 118
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfky;->zzc()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-ge v6, v7, :cond_0

    .line 123
    .line 124
    const-string v7, "[O]"

    .line 125
    .line 126
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    add-int/lit8 v6, v6, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_0
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lcom/google/android/gms/internal/ads/zzfky;

    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfky;->zzc()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    :goto_2
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzd:I

    .line 143
    .line 144
    if-ge v6, v7, :cond_1

    .line 145
    .line 146
    const-string v7, "[ ]"

    .line 147
    .line 148
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    add-int/lit8 v6, v6, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_1
    const-string v6, "\n"

    .line 155
    .line 156
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    check-cast v5, Lcom/google/android/gms/internal/ads/zzfky;

    .line 164
    .line 165
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzfky;->zzg()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_2
    :goto_3
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzc:I

    .line 177
    .line 178
    if-ge v4, v2, :cond_3

    .line 179
    .line 180
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v2, ".\n"

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 196
    .line 197
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_4
    return-void
.end method


# virtual methods
.method public final declared-synchronized zza(Lcom/google/android/gms/internal/ads/zzflj;)Lcom/google/android/gms/internal/ads/zzfli;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zza:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfky;

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfky;->zzb()Lcom/google/android/gms/internal/ads/zzfli;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzflc;->zzb()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfky;->zzh()Lcom/google/android/gms/internal/ads/zzflw;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;->zzb:Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;->zzc(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze;->zzq()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-boolean v4, p1, Lcom/google/android/gms/internal/ads/zzflw;->zza:Z

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;->zzc(Z)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;

    .line 52
    .line 53
    .line 54
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzflw;->zzb:I

    .line 55
    .line 56
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;->zzg(I)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;->zzh(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zze$zza;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;->zzh(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbgj$zzb;

    .line 70
    .line 71
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfli;->zza:Lcom/google/android/gms/internal/ads/zzdam;

    .line 72
    .line 73
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzdam;->zza()Lcom/google/android/gms/internal/ads/zzcxj;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcxj;->zzd()Lcom/google/android/gms/internal/ads/zzdgu;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzdgu;->zzj(Lcom/google/android/gms/internal/ads/zzbgj$zzb;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfla;->zzf()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzflc;->zza()V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfla;->zzf()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    :goto_1
    monitor-exit p0

    .line 98
    return-object v0

    .line 99
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    throw p1
.end method

.method public final declared-synchronized zzb(Lcom/google/android/gms/internal/ads/zzflj;Lcom/google/android/gms/internal/ads/zzfli;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zza:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfky;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lx2/c;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    iput-wide v2, p2, Lcom/google/android/gms/internal/ads/zzfli;->zzd:J

    .line 24
    .line 25
    if-nez v1, :cond_c

    .line 26
    .line 27
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    .line 28
    .line 29
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfky;

    .line 30
    .line 31
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzd:I

    .line 32
    .line 33
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzflg;->zze:I

    .line 34
    .line 35
    mul-int/lit16 v4, v4, 0x3e8

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfky;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzc:I

    .line 45
    .line 46
    if-ne v3, v4, :cond_b

    .line 47
    .line 48
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzg:I

    .line 49
    .line 50
    add-int/lit8 v3, v1, -0x1

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    if-eqz v1, :cond_a

    .line 54
    .line 55
    const-wide v5, 0x7fffffffffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    if-eqz v3, :cond_6

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    if-eq v3, v1, :cond_3

    .line 64
    .line 65
    const/4 v1, 0x2

    .line 66
    if-eq v3, v1, :cond_0

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const v3, 0x7fffffff

    .line 79
    .line 80
    .line 81
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/util/Map$Entry;

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lcom/google/android/gms/internal/ads/zzfky;

    .line 98
    .line 99
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzfky;->zzf()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-ge v6, v3, :cond_1

    .line 104
    .line 105
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfky;

    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfky;->zzf()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Lcom/google/android/gms/internal/ads/zzflj;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_2
    if-eqz v4, :cond_9

    .line 126
    .line 127
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :cond_3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Ljava/util/Map$Entry;

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    check-cast v7, Lcom/google/android/gms/internal/ads/zzfky;

    .line 157
    .line 158
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfky;->zze()J

    .line 159
    .line 160
    .line 161
    move-result-wide v7

    .line 162
    cmp-long v7, v7, v5

    .line 163
    .line 164
    if-gez v7, :cond_4

    .line 165
    .line 166
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfky;

    .line 171
    .line 172
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfky;->zze()J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    check-cast v3, Lcom/google/android/gms/internal/ads/zzflj;

    .line 181
    .line 182
    move-wide v5, v4

    .line 183
    move-object v4, v3

    .line 184
    goto :goto_1

    .line 185
    :cond_5
    if-eqz v4, :cond_9

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_8

    .line 204
    .line 205
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Ljava/util/Map$Entry;

    .line 210
    .line 211
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Lcom/google/android/gms/internal/ads/zzfky;

    .line 216
    .line 217
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzfky;->zzd()J

    .line 218
    .line 219
    .line 220
    move-result-wide v7

    .line 221
    cmp-long v7, v7, v5

    .line 222
    .line 223
    if-gez v7, :cond_7

    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfky;

    .line 230
    .line 231
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzfky;->zzd()J

    .line 232
    .line 233
    .line 234
    move-result-wide v4

    .line 235
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Lcom/google/android/gms/internal/ads/zzflj;

    .line 240
    .line 241
    move-wide v5, v4

    .line 242
    move-object v4, v3

    .line 243
    goto :goto_2

    .line 244
    :cond_8
    if-eqz v4, :cond_9

    .line 245
    .line 246
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    :cond_9
    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 250
    .line 251
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzflc;->zzd()V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_a
    throw v4

    .line 256
    :cond_b
    :goto_4
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzflc;->zzc()V

    .line 262
    .line 263
    .line 264
    move-object v1, v2

    .line 265
    :cond_c
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzfky;->zza(Lcom/google/android/gms/internal/ads/zzfli;)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzc:Lcom/google/android/gms/internal/ads/zzflc;

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzflc;->zze()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzflc;->zzf()Lcom/google/android/gms/internal/ads/zzflb;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfky;->zzh()Lcom/google/android/gms/internal/ads/zzflw;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;->zzb:Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;

    .line 291
    .line 292
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;->zzc(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzd;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 293
    .line 294
    .line 295
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg;->zzs()Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzflb;->zza:Z

    .line 300
    .line 301
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;->zzc(Z)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;

    .line 302
    .line 303
    .line 304
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzflb;->zzb:Z

    .line 305
    .line 306
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;->zzg(Z)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;

    .line 307
    .line 308
    .line 309
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzflw;->zzb:I

    .line 310
    .line 311
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;->zzk(I)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;->zzn(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzg$zza;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;->zzh(Lcom/google/android/gms/internal/ads/zzbgj$zzb$zza$zza;)Lcom/google/android/gms/internal/ads/zzbgj$zzb$zzc;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbgj$zzb;

    .line 325
    .line 326
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzfli;->zza:Lcom/google/android/gms/internal/ads/zzdam;

    .line 327
    .line 328
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzdam;->zza()Lcom/google/android/gms/internal/ads/zzcxj;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcxj;->zzd()Lcom/google/android/gms/internal/ads/zzdgu;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzdgu;->zzk(Lcom/google/android/gms/internal/ads/zzbgj$zzb;)V

    .line 337
    .line 338
    .line 339
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfla;->zzf()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    .line 341
    .line 342
    monitor-exit p0

    .line 343
    return p1

    .line 344
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 345
    throw p1
.end method

.method public final declared-synchronized zzc(Lcom/google/android/gms/internal/ads/zzflj;)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zza:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfky;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfky;->zzc()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzd:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    if-ge p1, v1, :cond_0

    .line 23
    .line 24
    return v0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    monitor-exit p0

    .line 30
    return v0

    .line 31
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final zzd(Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/zzx;)Lcom/google/android/gms/internal/ads/zzflj;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbzx;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzflg;->zza:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzbzx;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbzx;->zza()Lcom/google/android/gms/internal/ads/zzbzy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzbzy;->zzj:I

    .line 15
    .line 16
    new-instance v2, Lcom/google/android/gms/internal/ads/zzflk;

    .line 17
    .line 18
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzflg;->zzf:Ljava/lang/String;

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p2

    .line 22
    move-object v7, p3

    .line 23
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzflk;-><init>(Lcom/google/android/gms/ads/internal/client/zzm;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zzx;)V

    .line 24
    .line 25
    .line 26
    return-object v2
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzflg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfla;->zzb:Lcom/google/android/gms/internal/ads/zzflg;

    return-object v0
.end method
