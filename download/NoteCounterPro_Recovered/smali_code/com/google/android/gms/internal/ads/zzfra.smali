.class public final Lcom/google/android/gms/internal/ads/zzfra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:J

.field private final zzb:J

.field private zzc:J

.field private zzd:J

.field private zze:J

.field private final zzf:Lx2/b;

.field private zzg:J

.field private final zzh:Ljava/util/Random;


# direct methods
.method public constructor <init>(JDJDLx2/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 p3, 0x5

    .line 5
    .line 6
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:J

    .line 7
    .line 8
    const-wide/16 p3, 0x0

    .line 9
    .line 10
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:J

    .line 11
    .line 12
    new-instance p7, Ljava/util/Random;

    .line 13
    .line 14
    invoke-direct {p7}, Ljava/util/Random;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzh:Ljava/util/Random;

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:J

    .line 20
    .line 21
    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:J

    .line 22
    .line 23
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:J

    .line 24
    .line 25
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:Lx2/b;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zza()V

    .line 28
    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zza:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:J

    return-void
.end method

.method public final zzb()J
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:J

    .line 2
    .line 3
    long-to-double v0, v0

    .line 4
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    mul-double/2addr v2, v0

    .line 10
    add-double v4, v0, v2

    .line 11
    .line 12
    double-to-long v4, v4

    .line 13
    sub-double/2addr v0, v2

    .line 14
    double-to-long v0, v0

    .line 15
    sub-long/2addr v4, v0

    .line 16
    const-wide/16 v2, 0x1

    .line 17
    .line 18
    add-long/2addr v4, v2

    .line 19
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzh:Ljava/util/Random;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/Random;->nextDouble()D

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-double v4, v4

    .line 26
    mul-double/2addr v2, v4

    .line 27
    double-to-long v2, v2

    .line 28
    add-long/2addr v0, v2

    .line 29
    return-wide v0
.end method

.method public final zzc()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:Lx2/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfra;->zzb()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    check-cast v0, Lx2/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    add-long/2addr v3, v1

    .line 17
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:J

    .line 18
    .line 19
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:J

    .line 20
    .line 21
    long-to-double v0, v0

    .line 22
    add-double/2addr v0, v0

    .line 23
    double-to-long v0, v0

    .line 24
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:J

    .line 31
    .line 32
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:J

    .line 33
    .line 34
    const-wide/16 v2, 0x1

    .line 35
    .line 36
    add-long/2addr v0, v2

    .line 37
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:J

    .line 38
    .line 39
    return-void
.end method

.method public final zzd()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzf:Lx2/b;

    .line 2
    .line 3
    check-cast v0, Lx2/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzfra;->zze:J

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-gez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public final zze()Z
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzJ:Lcom/google/android/gms/internal/ads/zzbgv;

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
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-gez v1, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzc:J

    .line 22
    .line 23
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:J

    .line 24
    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    cmp-long v0, v3, v0

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzg:J

    .line 49
    .line 50
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzb:J

    .line 51
    .line 52
    cmp-long v0, v0, v3

    .line 53
    .line 54
    if-ltz v0, :cond_1

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    return v0

    .line 58
    :cond_1
    return v2
.end method

.method public final declared-synchronized zzf(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->b(Z)V

    .line 8
    .line 9
    .line 10
    int-to-long v0, p1

    .line 11
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfra;->zzd:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method
