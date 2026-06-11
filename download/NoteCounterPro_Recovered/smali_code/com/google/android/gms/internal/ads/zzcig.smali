.class public final Lcom/google/android/gms/internal/ads/zzcig;
.super Lcom/google/android/gms/internal/ads/zzgt;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhb;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcie;

.field private final zzd:Ljava/lang/String;

.field private final zze:I

.field private final zzf:Z

.field private zzg:Ljava/io/InputStream;

.field private zzh:Z

.field private zzi:Landroid/net/Uri;

.field private volatile zzj:Lcom/google/android/gms/internal/ads/zzbfp;

.field private zzk:Z

.field private zzl:Z

.field private zzm:Z

.field private zzn:Z

.field private zzo:J

.field private zzp:Lj3/a;

.field private final zzq:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhb;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzhz;Lcom/google/android/gms/internal/ads/zzcie;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzgt;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zza:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzb:Lcom/google/android/gms/internal/ads/zzhb;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzd:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzcig;->zze:I

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzk:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzm:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzn:Z

    .line 22
    .line 23
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzo:J

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    const-wide/16 p2, -0x1

    .line 30
    .line 31
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzp:Lj3/a;

    .line 38
    .line 39
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzcw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 40
    .line 41
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 56
    .line 57
    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ads/zzgt;->zze(Lcom/google/android/gms/internal/ads/zzhz;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final zzr()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzfm:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzm:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v2

    .line 32
    :cond_2
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzfn:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzn:Z

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    return v1
.end method


# virtual methods
.method public final zza([BII)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzb:Lcom/google/android/gms/internal/ads/zzhb;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzj;->zza([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return p1

    .line 30
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzh(I)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 35
    .line 36
    const-string p2, "Attempt to read closed GcacheDataSource."

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhf;)J
    .locals 14

    .line 1
    const-string v0, "ms"

    .line 2
    .line 3
    const-string v1, "Cache connection took "

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzh:Z

    .line 6
    .line 7
    if-nez v2, :cond_9

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzh:Z

    .line 11
    .line 12
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzhf;->zza:Landroid/net/Uri;

    .line 13
    .line 14
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzi:Landroid/net/Uri;

    .line 15
    .line 16
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzg(Lcom/google/android/gms/internal/ads/zzhf;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzbfp;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzbfp;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 28
    .line 29
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzfj:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 30
    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-wide/16 v5, -0x1

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 51
    .line 52
    if-eqz v3, :cond_7

    .line 53
    .line 54
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 55
    .line 56
    iget-wide v8, p1, Lcom/google/android/gms/internal/ads/zzhf;->zze:J

    .line 57
    .line 58
    iput-wide v8, v3, Lcom/google/android/gms/internal/ads/zzbfp;->zzh:J

    .line 59
    .line 60
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 61
    .line 62
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzd:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzgrt;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    iput-object v8, v3, Lcom/google/android/gms/internal/ads/zzbfp;->zzi:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 71
    .line 72
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzcig;->zze:I

    .line 73
    .line 74
    iput v8, v3, Lcom/google/android/gms/internal/ads/zzbfp;->zzj:I

    .line 75
    .line 76
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 77
    .line 78
    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzbfp;->zzg:Z

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzfl:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 83
    .line 84
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/Long;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzfk:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 96
    .line 97
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/Long;

    .line 106
    .line 107
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Lx2/c;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzz()Lcom/google/android/gms/internal/ads/zzbga;

    .line 125
    .line 126
    .line 127
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zza:Landroid/content/Context;

    .line 128
    .line 129
    iget-object v12, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 130
    .line 131
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbfp;)Ljava/util/concurrent/Future;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :try_start_0
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 136
    .line 137
    invoke-interface {v3, v8, v9, v12}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    check-cast v8, Lcom/google/android/gms/internal/ads/zzbgb;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 142
    .line 143
    :try_start_1
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbgb;->zzc()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzk:Z

    .line 148
    .line 149
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbgb;->zzd()Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzm:Z

    .line 154
    .line 155
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbgb;->zzf()Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzn:Z

    .line 160
    .line 161
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbgb;->zze()J

    .line 162
    .line 163
    .line 164
    move-result-wide v12

    .line 165
    iput-wide v12, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzo:J

    .line 166
    .line 167
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcig;->zzr()Z

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    if-nez v9, :cond_3

    .line 172
    .line 173
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbgb;->zzb()Ljava/io/InputStream;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    iput-object v8, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 178
    .line 179
    if-eqz v4, :cond_2

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzg(Lcom/google/android/gms/internal/ads/zzhf;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :catchall_0
    move-exception p1

    .line 186
    goto/16 :goto_7

    .line 187
    .line 188
    :cond_2
    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lx2/c;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 198
    .line 199
    .line 200
    move-result-wide v3

    .line 201
    sub-long/2addr v3, v10

    .line 202
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 203
    .line 204
    invoke-interface {p1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcie;->zza(ZJ)V

    .line 205
    .line 206
    .line 207
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 208
    .line 209
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    add-int/lit8 p1, p1, 0x18

    .line 218
    .line 219
    new-instance v2, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-wide v5

    .line 241
    :cond_3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Lx2/c;

    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    sub-long/2addr v3, v10

    .line 255
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 256
    .line 257
    invoke-interface {v5, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcie;->zza(ZJ)V

    .line 258
    .line 259
    .line 260
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 261
    .line 262
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    add-int/lit8 v2, v2, 0x18

    .line 271
    .line 272
    new-instance v5, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    :goto_2
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_9

    .line 294
    .line 295
    :catch_0
    move v4, v2

    .line 296
    goto :goto_3

    .line 297
    :catch_1
    move v4, v2

    .line 298
    goto :goto_6

    .line 299
    :catchall_1
    move-exception p1

    .line 300
    move v2, v7

    .line 301
    goto :goto_7

    .line 302
    :catch_2
    move v4, v7

    .line 303
    :goto_3
    :try_start_2
    invoke-interface {v3, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 304
    .line 305
    .line 306
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 311
    .line 312
    .line 313
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, Lx2/c;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 323
    .line 324
    .line 325
    move-result-wide v2

    .line 326
    sub-long/2addr v2, v10

    .line 327
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 328
    .line 329
    invoke-interface {v5, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzcie;->zza(ZJ)V

    .line 330
    .line 331
    .line 332
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 333
    .line 334
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    add-int/lit8 v4, v4, 0x18

    .line 343
    .line 344
    new-instance v5, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 347
    .line 348
    .line 349
    :goto_4
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    goto :goto_2

    .line 356
    :goto_5
    move v2, v4

    .line 357
    goto :goto_7

    .line 358
    :catch_3
    move v4, v7

    .line 359
    :goto_6
    :try_start_3
    invoke-interface {v3, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 360
    .line 361
    .line 362
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    check-cast v2, Lx2/c;

    .line 367
    .line 368
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 372
    .line 373
    .line 374
    move-result-wide v2

    .line 375
    sub-long/2addr v2, v10

    .line 376
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 377
    .line 378
    invoke-interface {v5, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzcie;->zza(ZJ)V

    .line 379
    .line 380
    .line 381
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 382
    .line 383
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    add-int/lit8 v4, v4, 0x18

    .line 392
    .line 393
    new-instance v5, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 396
    .line 397
    .line 398
    goto :goto_4

    .line 399
    :catchall_2
    move-exception p1

    .line 400
    goto :goto_5

    .line 401
    :goto_7
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    check-cast v3, Lx2/c;

    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 411
    .line 412
    .line 413
    move-result-wide v3

    .line 414
    sub-long/2addr v3, v10

    .line 415
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzc:Lcom/google/android/gms/internal/ads/zzcie;

    .line 416
    .line 417
    invoke-interface {v5, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzcie;->zza(ZJ)V

    .line 418
    .line 419
    .line 420
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 421
    .line 422
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    add-int/lit8 v2, v2, 0x18

    .line 431
    .line 432
    new-instance v5, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    throw p1

    .line 454
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 455
    .line 456
    if-eqz v0, :cond_5

    .line 457
    .line 458
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 459
    .line 460
    iget-wide v3, p1, Lcom/google/android/gms/internal/ads/zzhf;->zze:J

    .line 461
    .line 462
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzbfp;->zzh:J

    .line 463
    .line 464
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 465
    .line 466
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzd:Ljava/lang/String;

    .line 467
    .line 468
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrt;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzbfp;->zzi:Ljava/lang/String;

    .line 473
    .line 474
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 475
    .line 476
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zze:I

    .line 477
    .line 478
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzbfp;->zzj:I

    .line 479
    .line 480
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzj()Lcom/google/android/gms/internal/ads/zzbfl;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbfl;->zzc(Lcom/google/android/gms/internal/ads/zzbfp;)Lcom/google/android/gms/internal/ads/zzbfm;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    goto :goto_8

    .line 491
    :cond_5
    const/4 v0, 0x0

    .line 492
    :goto_8
    if-eqz v0, :cond_7

    .line 493
    .line 494
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zza()Z

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-eqz v1, :cond_7

    .line 499
    .line 500
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zzd()Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzk:Z

    .line 505
    .line 506
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zzg()Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzm:Z

    .line 511
    .line 512
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zze()Z

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzn:Z

    .line 517
    .line 518
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zzf()J

    .line 519
    .line 520
    .line 521
    move-result-wide v3

    .line 522
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzo:J

    .line 523
    .line 524
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 525
    .line 526
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcig;->zzr()Z

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    if-nez v1, :cond_7

    .line 531
    .line 532
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfm;->zzb()Ljava/io/InputStream;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 537
    .line 538
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 539
    .line 540
    if-eqz v0, :cond_6

    .line 541
    .line 542
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzg(Lcom/google/android/gms/internal/ads/zzhf;)V

    .line 543
    .line 544
    .line 545
    :cond_6
    return-wide v5

    .line 546
    :cond_7
    :goto_9
    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    .line 547
    .line 548
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 549
    .line 550
    if-eqz v0, :cond_8

    .line 551
    .line 552
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhf;->zzb()Lcom/google/android/gms/internal/ads/zzhe;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 557
    .line 558
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzbfp;->zza:Ljava/lang/String;

    .line 559
    .line 560
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzhe;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzhe;

    .line 565
    .line 566
    .line 567
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhe;->zze()Lcom/google/android/gms/internal/ads/zzhf;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzb:Lcom/google/android/gms/internal/ads/zzhb;

    .line 572
    .line 573
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhb;->zzb(Lcom/google/android/gms/internal/ads/zzhf;)J

    .line 574
    .line 575
    .line 576
    move-result-wide v0

    .line 577
    return-wide v0

    .line 578
    :cond_9
    new-instance p1, Ljava/io/IOException;

    .line 579
    .line 580
    const-string v0, "Attempt to open an already open GcacheDataSource."

    .line 581
    .line 582
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw p1
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzi:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzd()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzh:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzi:Landroid/net/Uri;

    .line 10
    .line 11
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzf:Z

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move v0, v3

    .line 21
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-static {v2}, Lx2/d;->c(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzg:Ljava/io/InputStream;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzb:Lcom/google/android/gms/internal/ads/zzhb;

    .line 32
    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzhb;->zzd()V

    .line 34
    .line 35
    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgt;->zzi()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void

    .line 42
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v1, "Attempt to close an already closed GcacheDataSource."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public final zzk()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzk:Z

    return v0
.end method

.method public final zzl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzl:Z

    return v0
.end method

.method public final zzm()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzm:Z

    return v0
.end method

.method public final zzn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzn:Z

    return v0
.end method

.method public final zzo()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzo:J

    return-wide v0
.end method

.method public final zzp()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    cmp-long v3, v3, v1

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_1
    monitor-enter p0

    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzp:Lj3/a;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 29
    .line 30
    new-instance v3, Lcom/google/android/gms/internal/ads/zzcif;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/zzcif;-><init>(Lcom/google/android/gms/internal/ads/zzcig;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzp:Lj3/a;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzp:Lj3/a;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzp:Lj3/a;

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    return-wide v0

    .line 77
    :catch_0
    :cond_3
    :goto_1
    return-wide v1

    .line 78
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    throw v0
.end method

.method public final synthetic zzq()Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzj()Lcom/google/android/gms/internal/ads/zzbfl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcig;->zzj:Lcom/google/android/gms/internal/ads/zzbfp;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbfl;->zzd(Lcom/google/android/gms/internal/ads/zzbfp;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
