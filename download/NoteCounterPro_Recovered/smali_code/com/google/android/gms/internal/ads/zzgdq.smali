.class public final Lcom/google/android/gms/internal/ads/zzgdq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdh;
.implements Lcom/google/android/gms/internal/ads/zzgdd;
.implements Lcom/google/android/gms/internal/ads/zzgdw;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzifd;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgcl;

.field private final zzd:Ljava/util/concurrent/ExecutorService;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgce;

.field private final zzf:Z

.field private final zzg:Ljava/lang/String;

.field private final zzh:J

.field private final zzi:J

.field private final zzj:D

.field private final zzk:Ljava/lang/String;

.field private final zzl:J

.field private final zzm:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzn:Ljava/lang/Object;

.field private final zzo:Ljava/lang/Object;

.field private final zzp:Ljava/lang/Object;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzavj;

.field private final zzr:Ljava/util/List;

.field private zzs:Z

.field private final zzt:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzifd;->zzc()Lcom/google/android/gms/internal/ads/zzifc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzifc;->zza(I)Lcom/google/android/gms/internal/ads/zzifc;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/android/gms/internal/ads/zzifd;

    .line 15
    .line 16
    sput-object v0, Lcom/google/android/gms/internal/ads/zzgdq;->zza:Lcom/google/android/gms/internal/ads/zzifd;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzgcl;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/internal/ads/zzgce;Ljava/util/Random;Ljava/lang/String;JJDLjava/lang/String;J)V
    .locals 4

    .line 1
    move-wide v0, p11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzn:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzo:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v2, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzp:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavk;->zza()Lcom/google/android/gms/internal/ads/zzavj;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzq:Lcom/google/android/gms/internal/ads/zzavj;

    .line 39
    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzr:Ljava/util/List;

    .line 46
    .line 47
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzs:Z

    .line 48
    .line 49
    new-instance v2, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzt:Ljava/util/HashMap;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzb:Landroid/content/Context;

    .line 57
    .line 58
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzc:Lcom/google/android/gms/internal/ads/zzgcl;

    .line 59
    .line 60
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzd:Ljava/util/concurrent/ExecutorService;

    .line 61
    .line 62
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zze:Lcom/google/android/gms/internal/ads/zzgce;

    .line 63
    .line 64
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzg:Ljava/lang/String;

    .line 65
    .line 66
    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzh:J

    .line 67
    .line 68
    iput-wide p9, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzi:J

    .line 69
    .line 70
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzj:D

    .line 71
    .line 72
    move-object/from16 p1, p13

    .line 73
    .line 74
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzk:Ljava/lang/String;

    .line 75
    .line 76
    move-wide/from16 p1, p14

    .line 77
    .line 78
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzl:J

    .line 79
    .line 80
    invoke-virtual {p5}, Ljava/util/Random;->nextDouble()D

    .line 81
    .line 82
    .line 83
    move-result-wide p1

    .line 84
    cmpg-double p1, p1, v0

    .line 85
    .line 86
    if-gez p1, :cond_0

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    :cond_0
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzf:Z

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgdo;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgdo;-><init>(Lcom/google/android/gms/internal/ads/zzgdq;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzd:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zze(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb(IJLjava/lang/Throwable;Ljava/lang/String;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzf:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzo:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzr:Ljava/util/List;

    .line 10
    .line 11
    new-instance v2, Lcom/google/android/gms/internal/ads/zzgdn;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzp:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    :try_start_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzt:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    check-cast v6, Ljava/lang/Long;

    .line 27
    .line 28
    if-nez v6, :cond_1

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    const-wide/16 v8, 0x1

    .line 45
    .line 46
    add-long/2addr v8, v6

    .line 47
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    move v3, p1

    .line 56
    move-wide v4, p2

    .line 57
    move-object v6, p4

    .line 58
    move-object v7, p5

    .line 59
    :try_start_2
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzgdn;-><init>(IJLjava/lang/Throwable;Ljava/lang/String;J)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzs:Z

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzs:Z

    .line 71
    .line 72
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzc:Lcom/google/android/gms/internal/ads/zzgcl;

    .line 73
    .line 74
    new-instance p2, Lcom/google/android/gms/internal/ads/zzgdp;

    .line 75
    .line 76
    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzgdp;-><init>(Lcom/google/android/gms/internal/ads/zzgdq;)V

    .line 77
    .line 78
    .line 79
    iget-wide p3, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzi:J

    .line 80
    .line 81
    invoke-interface {p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzgcl;->zza(Ljava/lang/Runnable;J)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    move-object p1, v0

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    return-void

    .line 90
    :goto_2
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    :try_start_4
    throw p1

    .line 92
    :goto_3
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 93
    throw p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzgdv;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzn:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzq:Lcom/google/android/gms/internal/ads/zzavj;

    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzgdv;->zza()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzavj;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
.end method

.method public final zzd()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzn:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzq:Lcom/google/android/gms/internal/ads/zzavj;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbk()Lcom/google/android/gms/internal/ads/zzibl;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcom/google/android/gms/internal/ads/zzavj;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzo:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v2

    .line 16
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzr:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzguf;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzs:Z

    .line 27
    .line 28
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 29
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    move v4, v0

    .line 34
    move v5, v4

    .line 35
    :goto_0
    if-ge v4, v2, :cond_4

    .line 36
    .line 37
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    check-cast v6, Lcom/google/android/gms/internal/ads/zzgdn;

    .line 42
    .line 43
    int-to-long v7, v5

    .line 44
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzh:J

    .line 45
    .line 46
    cmp-long v7, v7, v9

    .line 47
    .line 48
    if-ltz v7, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lcom/google/android/gms/internal/ads/zzavk;

    .line 55
    .line 56
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzgdq;->zze(Lcom/google/android/gms/internal/ads/zzavk;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzavj;->zzb()Lcom/google/android/gms/internal/ads/zzavj;

    .line 60
    .line 61
    .line 62
    move v5, v0

    .line 63
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawc;->zza()Lcom/google/android/gms/internal/ads/zzawb;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    iget v8, v6, Lcom/google/android/gms/internal/ads/zzgdn;->zza:I

    .line 68
    .line 69
    int-to-long v8, v8

    .line 70
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzawb;->zza(J)Lcom/google/android/gms/internal/ads/zzawb;

    .line 71
    .line 72
    .line 73
    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/zzgdn;->zzb:J

    .line 74
    .line 75
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzawb;->zzb(J)Lcom/google/android/gms/internal/ads/zzawb;

    .line 76
    .line 77
    .line 78
    iget-wide v8, v6, Lcom/google/android/gms/internal/ads/zzgdn;->zze:J

    .line 79
    .line 80
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzawb;->zze(J)Lcom/google/android/gms/internal/ads/zzawb;

    .line 81
    .line 82
    .line 83
    iget-object v8, v6, Lcom/google/android/gms/internal/ads/zzgdn;->zzd:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v8, :cond_1

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzawb;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzawb;

    .line 88
    .line 89
    .line 90
    :cond_1
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzgdn;->zzc:Ljava/lang/Throwable;

    .line 91
    .line 92
    if-nez v6, :cond_2

    .line 93
    .line 94
    const/4 v8, 0x2

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const/4 v8, 0x3

    .line 97
    :goto_1
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzawb;->zzg(I)Lcom/google/android/gms/internal/ads/zzawb;

    .line 98
    .line 99
    .line 100
    if-eqz v6, :cond_3

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzawb;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzawb;

    .line 111
    .line 112
    .line 113
    :try_start_2
    new-instance v8, Ljava/io/StringWriter;

    .line 114
    .line 115
    invoke-direct {v8}, Ljava/io/StringWriter;-><init>()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    .line 117
    .line 118
    :try_start_3
    new-instance v9, Ljava/io/PrintWriter;

    .line 119
    .line 120
    invoke-direct {v9, v8}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    .line 122
    .line 123
    :try_start_4
    invoke-virtual {v6, v9}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 130
    :try_start_5
    invoke-virtual {v9}, Ljava/io/PrintWriter;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 131
    .line 132
    .line 133
    :try_start_6
    invoke-virtual {v8}, Ljava/io/StringWriter;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :catchall_0
    move-exception v6

    .line 138
    goto :goto_3

    .line 139
    :catchall_1
    move-exception v6

    .line 140
    :try_start_7
    invoke-virtual {v9}, Ljava/io/PrintWriter;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_2
    move-exception v9

    .line 145
    :try_start_8
    invoke-virtual {v6, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 149
    :goto_3
    :try_start_9
    invoke-virtual {v8}, Ljava/io/StringWriter;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :catchall_3
    move-exception v8

    .line 154
    :try_start_a
    invoke-virtual {v6, v8}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    :goto_4
    throw v6
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 158
    :catch_0
    const-string v6, ""

    .line 159
    .line 160
    :goto_5
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzawb;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzawb;

    .line 161
    .line 162
    .line 163
    :cond_3
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Lcom/google/android/gms/internal/ads/zzawc;

    .line 168
    .line 169
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzavj;->zza(Lcom/google/android/gms/internal/ads/zzawc;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 170
    .line 171
    .line 172
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    add-int/lit8 v5, v5, 0x1

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_4
    if-lez v5, :cond_5

    .line 179
    .line 180
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Lcom/google/android/gms/internal/ads/zzavk;

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgdq;->zze(Lcom/google/android/gms/internal/ads/zzavk;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzavj;->zzb()Lcom/google/android/gms/internal/ads/zzavj;

    .line 190
    .line 191
    .line 192
    :cond_5
    return-void

    .line 193
    :catchall_4
    move-exception v0

    .line 194
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 195
    throw v0

    .line 196
    :catchall_5
    move-exception v1

    .line 197
    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 198
    throw v1
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzavk;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgdm;->zza()Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgdq;->zza:Lcom/google/android/gms/internal/ads/zzifd;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzb(Lcom/google/android/gms/internal/ads/zzifd;)Lcom/google/android/gms/internal/ads/zzgdl;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgdk;->zza()Lcom/google/android/gms/internal/ads/zzgdj;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzgdj;->zza(Lcom/google/android/gms/internal/ads/zzavk;)Lcom/google/android/gms/internal/ads/zzgdj;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgdk;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zza(Lcom/google/android/gms/internal/ads/zzgdk;)Lcom/google/android/gms/internal/ads/zzgdl;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgdm;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zze:Lcom/google/android/gms/internal/ads/zzgce;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzg:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhzw;->zzaN()[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v2, "application/x-protobuf"

    .line 41
    .line 42
    invoke-interface {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzgce;->zzb(Ljava/lang/String;[BLjava/lang/String;)Lj3/a;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    :catch_0
    return-void
.end method

.method public final synthetic zzf()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzf:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzb:Landroid/content/Context;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzk:Ljava/lang/String;

    .line 19
    .line 20
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzj:D

    .line 21
    .line 22
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzl:J

    .line 23
    .line 24
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzavk;->zza()Lcom/google/android/gms/internal/ads/zzavj;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    int-to-long v8, v8

    .line 35
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzavj;->zzc(J)Lcom/google/android/gms/internal/ads/zzavj;

    .line 36
    .line 37
    .line 38
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzavj;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzavj;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzavj;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/zzavj;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/zzavj;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzavj;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v4, v5}, Lcom/google/android/gms/internal/ads/zzavj;->zzl(J)Lcom/google/android/gms/internal/ads/zzavj;

    .line 68
    .line 69
    .line 70
    const-wide/16 v4, 0x0

    .line 71
    .line 72
    cmpl-double v1, v2, v4

    .line 73
    .line 74
    if-lez v1, :cond_1

    .line 75
    .line 76
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 77
    .line 78
    div-double/2addr v4, v2

    .line 79
    double-to-int v1, v4

    .line 80
    int-to-long v1, v1

    .line 81
    invoke-virtual {v7, v1, v2}, Lcom/google/android/gms/internal/ads/zzavj;->zzk(J)Lcom/google/android/gms/internal/ads/zzavj;

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 98
    .line 99
    int-to-long v2, v2

    .line 100
    invoke-virtual {v7, v2, v3}, Lcom/google/android/gms/internal/ads/zzavj;->zzh(J)Lcom/google/android/gms/internal/ads/zzavj;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    :catch_0
    :try_start_1
    const-string v2, "android.hardware.type.automotive"

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_2

    .line 110
    .line 111
    const/4 v0, 0x5

    .line 112
    goto :goto_0

    .line 113
    :cond_2
    const-string v2, "android.hardware.type.watch"

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/4 v3, 0x4

    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    move v0, v3

    .line 123
    goto :goto_0

    .line 124
    :cond_3
    const-string v2, "android.hardware.type.pc"

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    const/4 v0, 0x7

    .line 133
    goto :goto_0

    .line 134
    :cond_4
    const-string v1, "uimode"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Landroid/app/UiModeManager;

    .line 141
    .line 142
    const/4 v1, 0x2

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    invoke-virtual {v0}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-ne v0, v3, :cond_5

    .line 150
    .line 151
    const/4 v0, 0x6

    .line 152
    goto :goto_0

    .line 153
    :cond_5
    move v0, v1

    .line 154
    :goto_0
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzavj;->zzm(I)Lcom/google/android/gms/internal/ads/zzavj;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    .line 157
    :catch_1
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Lcom/google/android/gms/internal/ads/zzavk;

    .line 162
    .line 163
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzn:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v1

    .line 166
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgdq;->zzq:Lcom/google/android/gms/internal/ads/zzavj;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbo(Lcom/google/android/gms/internal/ads/zzibr;)Lcom/google/android/gms/internal/ads/zzibl;

    .line 169
    .line 170
    .line 171
    monitor-exit v1

    .line 172
    goto :goto_1

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    throw v0

    .line 176
    :cond_6
    :goto_1
    return-void
.end method
