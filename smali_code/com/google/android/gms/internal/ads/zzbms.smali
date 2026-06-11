.class public final Lcom/google/android/gms/internal/ads/zzbms;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/formats/zze;

.field private final zzb:Lcom/google/android/gms/ads/formats/zzd;

.field private zzc:Lcom/google/android/gms/internal/ads/zzbln;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/formats/zze;Lcom/google/android/gms/ads/formats/zzd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbms;->zza:Lcom/google/android/gms/ads/formats/zze;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbms;->zzb:Lcom/google/android/gms/ads/formats/zzd;

    return-void
.end method

.method private final declared-synchronized zzf(Lcom/google/android/gms/internal/ads/zzblm;)Lcom/google/android/gms/internal/ads/zzbln;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbms;->zzc:Lcom/google/android/gms/internal/ads/zzbln;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbln;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzbln;-><init>(Lcom/google/android/gms/internal/ads/zzblm;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbms;->zzc:Lcom/google/android/gms/internal/ads/zzbln;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    throw p1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzblz;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzbmr;-><init>(Lcom/google/android/gms/internal/ads/zzbms;[B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzblw;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbms;->zzb:Lcom/google/android/gms/ads/formats/zzd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbmq;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzbmq;-><init>(Lcom/google/android/gms/internal/ads/zzbms;[B)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final synthetic zzc()Lcom/google/android/gms/ads/formats/zze;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbms;->zza:Lcom/google/android/gms/ads/formats/zze;

    return-object v0
.end method

.method public final synthetic zzd()Lcom/google/android/gms/ads/formats/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbms;->zzb:Lcom/google/android/gms/ads/formats/zzd;

    return-object v0
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zzblm;)Lcom/google/android/gms/internal/ads/zzbln;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbms;->zzf(Lcom/google/android/gms/internal/ads/zzblm;)Lcom/google/android/gms/internal/ads/zzbln;

    move-result-object p1

    return-object p1
.end method
