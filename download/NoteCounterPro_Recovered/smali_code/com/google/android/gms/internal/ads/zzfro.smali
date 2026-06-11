.class public final Lcom/google/android/gms/internal/ads/zzfro;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/Object;

.field private final zzb:J

.field private final zzc:Lx2/b;

.field private final zzd:J

.field private final zze:D

.field private final zzf:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx2/b;DI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfro;->zza:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzc:Lx2/b;

    .line 7
    .line 8
    check-cast p2, Lx2/c;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzb:J

    .line 18
    .line 19
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzW:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 20
    .line 21
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    const-wide/16 v0, 0x3e8

    .line 36
    .line 37
    mul-long/2addr p1, v0

    .line 38
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzd:J

    .line 39
    .line 40
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzfro;->zze:D

    .line 41
    .line 42
    iput p5, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzf:I

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zza:Ljava/lang/Object;

    return-object v0
.end method

.method public final zzb()Z
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzb:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzd:J

    .line 4
    .line 5
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzc:Lx2/b;

    .line 6
    .line 7
    check-cast v4, Lx2/c;

    .line 8
    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v4

    .line 16
    add-long/2addr v0, v2

    .line 17
    cmp-long v0, v4, v0

    .line 18
    .line 19
    if-ltz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final zzc()J
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzF:Lcom/google/android/gms/internal/ads/zzbgv;

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
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/32 v2, -0xdbba0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide/16 v2, 0x2710

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzd:J

    .line 31
    .line 32
    add-long/2addr v2, v0

    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzc:Lx2/b;

    .line 34
    .line 35
    check-cast v0, Lx2/c;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzb:J

    .line 45
    .line 46
    sub-long/2addr v0, v4

    .line 47
    sub-long/2addr v2, v0

    .line 48
    return-wide v2
.end method

.method public final zzd()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzb:J

    return-wide v0
.end method

.method public final zze()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zze:D

    return-wide v0
.end method

.method public final zzf()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfro;->zzf:I

    return v0
.end method
