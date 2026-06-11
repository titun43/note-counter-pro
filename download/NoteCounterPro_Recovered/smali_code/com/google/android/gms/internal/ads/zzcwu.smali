.class public final Lcom/google/android/gms/internal/ads/zzcwu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/concurrent/Executor;

.field private final zzb:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzc:Lj3/a;

.field private volatile zzd:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lj3/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzd:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zza:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzc:Lj3/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgzl;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcwo;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzcwo;-><init>(Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzgzl;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zza:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzc:Lj3/a;

    .line 9
    .line 10
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final zzb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzd:Z

    return v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzgzl;Lj3/a;Lcom/google/android/gms/internal/ads/zzcwf;)Lj3/a;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzgzl;->zzb(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbjs;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    invoke-static {p2, v0, v1, p3, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzi(Lj3/a;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lj3/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final synthetic zzd()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zzd:Z

    return-void
.end method

.method public final synthetic zze(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzgzl;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lj3/a;

    .line 30
    .line 31
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcwq;

    .line 32
    .line 33
    invoke-direct {v2, p2}, Lcom/google/android/gms/internal/ads/zzcwq;-><init>(Lcom/google/android/gms/internal/ads/zzgzl;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zza:Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    const-class v4, Ljava/lang/Throwable;

    .line 39
    .line 40
    invoke-static {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zzh(Lj3/a;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcwr;

    .line 45
    .line 46
    invoke-direct {v2, p0, p2, v1}, Lcom/google/android/gms/internal/ads/zzcwr;-><init>(Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzgzl;Lj3/a;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzcwp;

    .line 55
    .line 56
    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzcwp;-><init>(Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzgzl;)V

    .line 57
    .line 58
    .line 59
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zza:Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcwu;->zza:Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcwt;

    .line 68
    .line 69
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzcwt;-><init>(Lcom/google/android/gms/internal/ads/zzgzl;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final synthetic zzf()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zzf:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcws;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzcws;-><init>(Lcom/google/android/gms/internal/ads/zzcwu;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
