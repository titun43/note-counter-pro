.class public abstract Lcom/google/android/gms/internal/ads/zzccr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static zzi:Lcom/google/android/gms/internal/ads/zzccr;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzccr;
    .locals 4

    .line 1
    const-class v0, Lcom/google/android/gms/internal/ads/zzccr;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzccr;->zzi:Lcom/google/android/gms/internal/ads/zzccr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbhe;->zza(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzo()Lcom/google/android/gms/ads/internal/util/zzg;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1, p0}, Lcom/google/android/gms/ads/internal/util/zzg;->zza(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lcom/google/android/gms/internal/ads/zzccl;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzccl;-><init>([B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/zzccl;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzccl;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/zzccl;->zzb(Lx2/b;)Lcom/google/android/gms/internal/ads/zzccl;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzccl;->zzc(Lcom/google/android/gms/ads/internal/util/zzg;)Lcom/google/android/gms/internal/ads/zzccl;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzD()Lcom/google/android/gms/internal/ads/zzccq;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/zzccl;->zzd(Lcom/google/android/gms/internal/ads/zzccq;)Lcom/google/android/gms/internal/ads/zzccl;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzccl;->zze()Lcom/google/android/gms/internal/ads/zzccr;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sput-object p0, Lcom/google/android/gms/internal/ads/zzccr;->zzi:Lcom/google/android/gms/internal/ads/zzccr;

    .line 59
    .line 60
    check-cast p0, Lcom/google/android/gms/internal/ads/zzccm;

    .line 61
    .line 62
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzccm;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    .line 63
    .line 64
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Lcom/google/android/gms/internal/ads/zzccf;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzccf;->zza()V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lcom/google/android/gms/internal/ads/zzccr;->zzi:Lcom/google/android/gms/internal/ads/zzccr;

    .line 74
    .line 75
    check-cast p0, Lcom/google/android/gms/internal/ads/zzccm;

    .line 76
    .line 77
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzccm;->zzh:Lcom/google/android/gms/internal/ads/zzikp;

    .line 78
    .line 79
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lcom/google/android/gms/internal/ads/zzccw;

    .line 84
    .line 85
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzbb:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 86
    .line 87
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 105
    .line 106
    .line 107
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzbc:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 108
    .line 109
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzz(Ljava/lang/String;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_2

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzccw;->zzb(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :catchall_0
    move-exception p0

    .line 148
    goto :goto_2

    .line 149
    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzccv;

    .line 150
    .line 151
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzccv;-><init>(Lcom/google/android/gms/internal/ads/zzccw;Ljava/util/Map;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzccw;->zza(Lcom/google/android/gms/internal/ads/zzccu;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzccr;->zzi:Lcom/google/android/gms/internal/ads/zzccr;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    .line 159
    monitor-exit v0

    .line 160
    return-object p0

    .line 161
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 162
    throw p0
.end method


# virtual methods
.method public abstract zza()Lcom/google/android/gms/internal/ads/zzccj;
.end method
