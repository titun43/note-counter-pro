.class public final Lcom/google/android/gms/internal/ads/zzsd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzqc;


# static fields
.field private static final zza:Ljava/lang/Object;

.field private static zzb:Ljava/util/concurrent/ScheduledExecutorService;

.field private static zzc:I


# instance fields
.field private final zzd:Landroid/media/AudioTrack;

.field private final zze:Lcom/google/android/gms/internal/ads/zzql;

.field private zzf:Lcom/google/android/gms/internal/ads/zzru;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzsk;

.field private final zzh:Z

.field private final zzi:I

.field private final zzj:Lcom/google/android/gms/internal/ads/zzsc;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzed;

.field private zzl:Z

.field private zzm:J

.field private zzn:J

.field private zzo:I

.field private zzp:I

.field private zzq:Z

.field private final zzr:Lcom/google/android/gms/internal/ads/zzsh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzsd;->zza:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzql;Lcom/google/android/gms/internal/ads/zzsh;Lcom/google/android/gms/internal/ads/zzdn;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zze:Lcom/google/android/gms/internal/ads/zzql;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzr:Lcom/google/android/gms/internal/ads/zzsh;

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/ads/zzed;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzed;-><init>(Ljava/lang/Thread;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzk:Lcom/google/android/gms/internal/ads/zzed;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzed;->zzg(Z)V

    .line 23
    .line 24
    .line 25
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 26
    .line 27
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzA(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzh:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 42
    .line 43
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzD(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    mul-int/2addr v1, v0

    .line 48
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzi:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 v0, -0x1

    .line 52
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzi:I

    .line 53
    .line 54
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsk;

    .line 55
    .line 56
    new-instance v2, Lcom/google/android/gms/internal/ads/zzrw;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzrw;-><init>(Lcom/google/android/gms/internal/ads/zzsd;[B)V

    .line 60
    .line 61
    .line 62
    iget v5, p2, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 63
    .line 64
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzi:I

    .line 65
    .line 66
    iget v7, p2, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 67
    .line 68
    move-object v4, p1

    .line 69
    move-object v3, p4

    .line 70
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzsk;-><init>(Lcom/google/android/gms/internal/ads/zzsj;Lcom/google/android/gms/internal/ads/zzdn;Landroid/media/AudioTrack;III)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 74
    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    new-instance p1, Lcom/google/android/gms/internal/ads/zzru;

    .line 78
    .line 79
    invoke-direct {p1, v4, p3, v0}, Lcom/google/android/gms/internal/ads/zzru;-><init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzsh;[B)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzf:Lcom/google/android/gms/internal/ads/zzru;

    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzg()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsc;

    .line 91
    .line 92
    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/ads/zzsc;-><init>(Lcom/google/android/gms/internal/ads/zzsd;[B)V

    .line 93
    .line 94
    .line 95
    move-object v0, p1

    .line 96
    :cond_2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzj:Lcom/google/android/gms/internal/ads/zzsc;

    .line 97
    .line 98
    return-void
.end method

.method public static synthetic zzp(Landroid/media/AudioTrack;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzed;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    new-instance p0, Lcom/google/android/gms/internal/ads/zzro;

    .line 23
    .line 24
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzro;-><init>(Lcom/google/android/gms/internal/ads/zzed;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzsd;->zza:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter p0

    .line 33
    :try_start_1
    sget p1, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    sput p1, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    sget-object p1, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    throw v0

    .line 54
    :cond_2
    :goto_0
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    new-instance v1, Lcom/google/android/gms/internal/ads/zzrp;

    .line 74
    .line 75
    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/zzrp;-><init>(Lcom/google/android/gms/internal/ads/zzed;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzsd;->zza:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter p1

    .line 84
    :try_start_2
    sget p2, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 85
    .line 86
    add-int/lit8 p2, p2, -0x1

    .line 87
    .line 88
    sput p2, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 89
    .line 90
    if-nez p2, :cond_5

    .line 91
    .line 92
    sget-object p2, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 97
    .line 98
    .line 99
    sput-object v0, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_2
    move-exception p0

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    throw v0

    .line 105
    :cond_5
    :goto_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    throw p0

    .line 107
    :goto_3
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    throw p0
.end method

.method private final zzt()J
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzm:J

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzi:I

    .line 8
    .line 9
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 10
    .line 11
    int-to-long v2, v2

    .line 12
    add-long/2addr v0, v2

    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    add-long/2addr v0, v4

    .line 16
    div-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzn:J

    .line 19
    .line 20
    return-wide v0
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsk;->zzb()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzl:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsk;->zzf()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzl:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzc(Ljava/nio/ByteBuffer;IJ)Z
    .locals 3

    .line 1
    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzh:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzo:I

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zze:Lcom/google/android/gms/internal/ads/zzql;

    .line 10
    .line 11
    iget p4, p4, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 12
    .line 13
    invoke-static {p4, p1}, Lcom/google/android/gms/internal/ads/zzsw;->zzD(ILjava/nio/ByteBuffer;)I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzo:I

    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzt()J

    .line 20
    .line 21
    .line 22
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 23
    .line 24
    invoke-virtual {p4}, Landroid/media/AudioTrack;->getUnderrunCount()I

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzp:I

    .line 29
    .line 30
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzp:I

    .line 31
    .line 32
    if-le p4, v0, :cond_1

    .line 33
    .line 34
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzk:Lcom/google/android/gms/internal/ads/zzed;

    .line 35
    .line 36
    const/4 v0, -0x1

    .line 37
    sget-object v1, Lcom/google/android/gms/internal/ads/zzrn;->zza:Lcom/google/android/gms/internal/ads/zzrn;

    .line 38
    .line 39
    invoke-virtual {p4, v0, v1}, Lcom/google/android/gms/internal/ads/zzed;->zzd(ILcom/google/android/gms/internal/ads/zzdy;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzed;->zze()V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 46
    .line 47
    .line 48
    move-result p4

    .line 49
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-virtual {v0, p1, v1, v2}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v0, 0x0

    .line 61
    if-gez p1, :cond_5

    .line 62
    .line 63
    const/4 p2, -0x6

    .line 64
    if-eq p1, p2, :cond_3

    .line 65
    .line 66
    const/16 p2, -0x20

    .line 67
    .line 68
    if-ne p1, p2, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v2, v0

    .line 72
    :cond_3
    :goto_0
    if-eqz v2, :cond_4

    .line 73
    .line 74
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzr:Lcom/google/android/gms/internal/ads/zzsh;

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzsh;->zza:Lcom/google/android/gms/internal/ads/zzsi;

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzsi;->zzi()Lcom/google/android/gms/internal/ads/zzpx;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    if-eqz p3, :cond_4

    .line 85
    .line 86
    sget-object p3, Lcom/google/android/gms/internal/ads/zzps;->zza:Lcom/google/android/gms/internal/ads/zzps;

    .line 87
    .line 88
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzsi;->zzh(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzsi;->zzi()Lcom/google/android/gms/internal/ads/zzpx;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzpx;->zza(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    new-instance p2, Lcom/google/android/gms/internal/ads/zzqb;

    .line 99
    .line 100
    invoke-direct {p2, p1, v2}, Lcom/google/android/gms/internal/ads/zzqb;-><init>(IZ)V

    .line 101
    .line 102
    .line 103
    throw p2

    .line 104
    :cond_5
    if-ne p1, p4, :cond_6

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    move v2, v0

    .line 108
    :goto_1
    if-eqz p3, :cond_7

    .line 109
    .line 110
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzm:J

    .line 111
    .line 112
    int-to-long v0, p1

    .line 113
    add-long/2addr p2, v0

    .line 114
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzm:J

    .line 115
    .line 116
    return v2

    .line 117
    :cond_7
    if-eqz v2, :cond_8

    .line 118
    .line 119
    iget-wide p3, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzn:J

    .line 120
    .line 121
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzo:I

    .line 122
    .line 123
    int-to-long v0, p1

    .line 124
    int-to-long p1, p2

    .line 125
    mul-long/2addr v0, p1

    .line 126
    add-long/2addr v0, p3

    .line 127
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzn:J

    .line 128
    .line 129
    :cond_8
    return v2
.end method

.method public final zzd()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzl:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzl:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzt()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzsk;->zze(J)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zze()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsk;->zzc()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v1, 0x1d

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzg()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzj:Lcom/google/android/gms/internal/ads/zzsc;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsc;->zza()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzf:Lcom/google/android/gms/internal/ads/zzru;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzru;->zzd()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzf:Lcom/google/android/gms/internal/ads/zzru;

    .line 43
    .line 44
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 45
    .line 46
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzk:Lcom/google/android/gms/internal/ads/zzed;

    .line 47
    .line 48
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzc(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget-object v3, Lcom/google/android/gms/internal/ads/zzsd;->zza:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v3

    .line 55
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    const-string v4, "ExoPlayer:AudioTrackReleaseThread"

    .line 60
    .line 61
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzfj;->zzg(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    sput-object v4, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    :goto_0
    sget v4, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    sput v4, Lcom/google/android/gms/internal/ads/zzsd;->zzc:I

    .line 75
    .line 76
    sget-object v4, Lcom/google/android/gms/internal/ads/zzsd;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 77
    .line 78
    new-instance v5, Lcom/google/android/gms/internal/ads/zzrq;

    .line 79
    .line 80
    invoke-direct {v5, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzrq;-><init>(Landroid/media/AudioTrack;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzed;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 84
    .line 85
    const-wide/16 v1, 0x14

    .line 86
    .line 87
    invoke-interface {v4, v5, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 88
    .line 89
    .line 90
    monitor-exit v3

    .line 91
    return-void

    .line 92
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    throw v0
.end method

.method public final zzf(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzg()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-static {v0}, Landroidx/lifecycle/g0;->s(Landroid/media/AudioTrack;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final zzh()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzi()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzj()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public final zzk()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsk;->zza()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzl()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzg:Lcom/google/android/gms/internal/ads/zzsk;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzt()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzsk;->zzd(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzqa;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzk:Lcom/google/android/gms/internal/ads/zzed;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzed;->zzb(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzn(Lcom/google/android/gms/internal/ads/zzpq;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzpq;->zza()Landroid/media/metrics/LogSessionId;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/ads/g;->i()Landroid/media/metrics/LogSessionId;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g;->y(Landroid/media/metrics/LogSessionId;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/g;->q(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public final zzo(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzq()J
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsd;->zzt()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic zzr()Landroid/media/AudioTrack;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzd:Landroid/media/AudioTrack;

    return-object v0
.end method

.method public final synthetic zzs()Lcom/google/android/gms/internal/ads/zzed;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsd;->zzk:Lcom/google/android/gms/internal/ads/zzed;

    return-object v0
.end method
