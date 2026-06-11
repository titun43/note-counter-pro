.class final Lcom/google/android/gms/internal/ads/zzsk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zzA:Z

.field private zzB:J

.field private final zza:Lcom/google/android/gms/internal/ads/zzsj;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdn;

.field private final zzc:[J

.field private final zzd:Landroid/media/AudioTrack;

.field private final zze:I

.field private final zzf:J

.field private final zzg:Z

.field private final zzh:Lcom/google/android/gms/internal/ads/zzrl;

.field private zzi:F

.field private zzj:J

.field private zzk:J

.field private zzl:J

.field private zzm:Ljava/lang/reflect/Method;

.field private zzn:J

.field private zzo:J

.field private zzp:J

.field private zzq:J

.field private zzr:J

.field private zzs:I

.field private zzt:I

.field private zzu:J

.field private zzv:J

.field private zzw:J

.field private zzx:J

.field private zzy:J

.field private zzz:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzsj;Lcom/google/android/gms/internal/ads/zzdn;Landroid/media/AudioTrack;III)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zza:Lcom/google/android/gms/internal/ads/zzsj;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzd:Landroid/media/AudioTrack;

    .line 9
    .line 10
    :try_start_0
    const-class p2, Landroid/media/AudioTrack;

    .line 11
    .line 12
    const-string v0, "getLatency"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzm:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    :catch_0
    const/16 p2, 0xa

    .line 22
    .line 23
    new-array p2, p2, [J

    .line 24
    .line 25
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzc:[J

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzz:J

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzy:J

    .line 35
    .line 36
    new-instance p2, Lcom/google/android/gms/internal/ads/zzrl;

    .line 37
    .line 38
    invoke-direct {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzrl;-><init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzsj;)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzh:Lcom/google/android/gms/internal/ads/zzrl;

    .line 42
    .line 43
    invoke-virtual {p3}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zze:I

    .line 48
    .line 49
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzfj;->zzA(I)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzg:Z

    .line 54
    .line 55
    if-eqz p2, :cond_0

    .line 56
    .line 57
    div-int/2addr p6, p5

    .line 58
    int-to-long p2, p6

    .line 59
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-wide p1, v0

    .line 65
    :goto_0
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzf:J

    .line 66
    .line 67
    const-wide/16 p1, 0x0

    .line 68
    .line 69
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzq:J

    .line 70
    .line 71
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzr:J

    .line 72
    .line 73
    const/4 p3, 0x0

    .line 74
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzA:Z

    .line 75
    .line 76
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzB:J

    .line 77
    .line 78
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 79
    .line 80
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 81
    .line 82
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzo:J

    .line 83
    .line 84
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzn:J

    .line 85
    .line 86
    const/high16 p1, 0x3f800000    # 1.0f

    .line 87
    .line 88
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 89
    .line 90
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzj:J

    .line 91
    .line 92
    return-void
.end method

.method private final zzg(J)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzj:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_1

    .line 11
    .line 12
    cmp-long v4, p1, v0

    .line 13
    .line 14
    if-gez v4, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 18
    .line 19
    sub-long/2addr p1, v0

    .line 20
    invoke-static {p1, p2, v4}, Lcom/google/android/gms/internal/ads/zzfj;->zzw(JF)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzfj;->zzp(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdn;->zza()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    sub-long/2addr v0, p1

    .line 35
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzj:J

    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zza:Lcom/google/android/gms/internal/ads/zzsj;

    .line 38
    .line 39
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzsj;->zzb(J)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method private final zzh(J)J
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzt:I

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 11
    .line 12
    cmp-long p1, p1, v1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzl()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zze:I

    .line 21
    .line 22
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzj()J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzk:J

    .line 33
    .line 34
    add-long/2addr p1, v3

    .line 35
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 36
    .line 37
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzv(JF)J

    .line 38
    .line 39
    .line 40
    move-result-wide p1

    .line 41
    :goto_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzn:J

    .line 42
    .line 43
    sub-long/2addr p1, v3

    .line 44
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 51
    .line 52
    cmp-long v0, v3, v1

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzx:J

    .line 57
    .line 58
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zze:I

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    :cond_2
    return-wide p1
.end method

.method private final zzi()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzk:J

    const/4 v2, 0x0

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzt:I

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzs:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzl:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzy:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzz:J

    return-void
.end method

.method private final zzj()J
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzk()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zze:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzr(JI)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method private final zzk()J
    .locals 12

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzl()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzx:J

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzp:J

    .line 30
    .line 31
    sub-long v4, v0, v4

    .line 32
    .line 33
    const-wide/16 v6, 0x5

    .line 34
    .line 35
    cmp-long v4, v4, v6

    .line 36
    .line 37
    if-ltz v4, :cond_6

    .line 38
    .line 39
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzd:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v6, 0x1

    .line 49
    if-ne v5, v6, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    int-to-long v6, v4

    .line 57
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const-wide v8, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v6, v8

    .line 65
    const/16 v8, 0x1d

    .line 66
    .line 67
    if-gt v4, v8, :cond_3

    .line 68
    .line 69
    const-wide/16 v8, 0x0

    .line 70
    .line 71
    cmp-long v4, v6, v8

    .line 72
    .line 73
    if-nez v4, :cond_2

    .line 74
    .line 75
    iget-wide v10, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzq:J

    .line 76
    .line 77
    cmp-long v4, v10, v8

    .line 78
    .line 79
    if-lez v4, :cond_2

    .line 80
    .line 81
    const/4 v4, 0x3

    .line 82
    if-ne v5, v4, :cond_2

    .line 83
    .line 84
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 85
    .line 86
    cmp-long v2, v4, v2

    .line 87
    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 94
    .line 95
    :cond_3
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzq:J

    .line 96
    .line 97
    cmp-long v2, v2, v6

    .line 98
    .line 99
    if-lez v2, :cond_4

    .line 100
    .line 101
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzr:J

    .line 102
    .line 103
    const-wide/16 v4, 0x1

    .line 104
    .line 105
    add-long/2addr v2, v4

    .line 106
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzr:J

    .line 107
    .line 108
    :cond_4
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzq:J

    .line 109
    .line 110
    :cond_5
    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzp:J

    .line 111
    .line 112
    :cond_6
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzq:J

    .line 113
    .line 114
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzB:J

    .line 115
    .line 116
    add-long/2addr v0, v2

    .line 117
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzr:J

    .line 118
    .line 119
    const/16 v4, 0x20

    .line 120
    .line 121
    shl-long/2addr v2, v4

    .line 122
    add-long/2addr v0, v2

    .line 123
    return-wide v0
.end method

.method private final zzl()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzw:J

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 27
    .line 28
    sub-long/2addr v0, v2

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzv(JF)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zze:I

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzs(JI)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzw:J

    .line 42
    .line 43
    add-long/2addr v2, v0

    .line 44
    return-wide v2
.end method


# virtual methods
.method public final zza()J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzd:Landroid/media/AudioTrack;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const-wide/16 v3, 0x3e8

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    if-ne v2, v8, :cond_5

    .line 19
    .line 20
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 21
    .line 22
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzdn;->zzc()J

    .line 23
    .line 24
    .line 25
    move-result-wide v9

    .line 26
    div-long v12, v9, v3

    .line 27
    .line 28
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzl:J

    .line 29
    .line 30
    sub-long v9, v12, v9

    .line 31
    .line 32
    const-wide/16 v14, 0x7530

    .line 33
    .line 34
    cmp-long v2, v9, v14

    .line 35
    .line 36
    if-ltz v2, :cond_2

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzsk;->zzj()J

    .line 39
    .line 40
    .line 41
    move-result-wide v9

    .line 42
    cmp-long v2, v9, v6

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzc:[J

    .line 49
    .line 50
    iget v11, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzs:I

    .line 51
    .line 52
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 53
    .line 54
    invoke-static {v9, v10, v14}, Lcom/google/android/gms/internal/ads/zzfj;->zzw(JF)J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    sub-long/2addr v9, v12

    .line 59
    aput-wide v9, v2, v11

    .line 60
    .line 61
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzs:I

    .line 62
    .line 63
    add-int/2addr v9, v5

    .line 64
    const/16 v10, 0xa

    .line 65
    .line 66
    rem-int/2addr v9, v10

    .line 67
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzs:I

    .line 68
    .line 69
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzt:I

    .line 70
    .line 71
    if-ge v9, v10, :cond_1

    .line 72
    .line 73
    add-int/2addr v9, v5

    .line 74
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzt:I

    .line 75
    .line 76
    :cond_1
    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzl:J

    .line 77
    .line 78
    iput-wide v6, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzk:J

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    :goto_0
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzt:I

    .line 82
    .line 83
    if-ge v9, v10, :cond_2

    .line 84
    .line 85
    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzk:J

    .line 86
    .line 87
    aget-wide v16, v2, v9

    .line 88
    .line 89
    int-to-long v10, v10

    .line 90
    div-long v16, v16, v10

    .line 91
    .line 92
    add-long v10, v16, v14

    .line 93
    .line 94
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzk:J

    .line 95
    .line 96
    add-int/lit8 v9, v9, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzg:Z

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzm:Ljava/lang/reflect/Method;

    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzo:J

    .line 108
    .line 109
    sub-long v9, v12, v9

    .line 110
    .line 111
    const-wide/32 v14, 0x7a120

    .line 112
    .line 113
    .line 114
    cmp-long v9, v9, v14

    .line 115
    .line 116
    if-ltz v9, :cond_4

    .line 117
    .line 118
    const/4 v9, 0x0

    .line 119
    :try_start_0
    invoke-virtual {v2, v1, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/lang/Integer;

    .line 124
    .line 125
    sget-object v10, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    int-to-long v10, v2

    .line 132
    mul-long/2addr v10, v3

    .line 133
    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzf:J

    .line 134
    .line 135
    sub-long/2addr v10, v14

    .line 136
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzn:J

    .line 137
    .line 138
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v10

    .line 142
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzn:J

    .line 143
    .line 144
    const-wide/32 v14, 0x4c4b40

    .line 145
    .line 146
    .line 147
    cmp-long v2, v10, v14

    .line 148
    .line 149
    if-lez v2, :cond_3

    .line 150
    .line 151
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zza:Lcom/google/android/gms/internal/ads/zzsj;

    .line 152
    .line 153
    invoke-interface {v2, v10, v11}, Lcom/google/android/gms/internal/ads/zzsj;->zza(J)V

    .line 154
    .line 155
    .line 156
    iput-wide v6, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzn:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :catch_0
    iput-object v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzm:Ljava/lang/reflect/Method;

    .line 160
    .line 161
    :cond_3
    :goto_1
    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzo:J

    .line 162
    .line 163
    :cond_4
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzh:Lcom/google/android/gms/internal/ads/zzrl;

    .line 164
    .line 165
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 166
    .line 167
    invoke-direct {v0, v12, v13}, Lcom/google/android/gms/internal/ads/zzsk;->zzh(J)J

    .line 168
    .line 169
    .line 170
    move-result-wide v15

    .line 171
    invoke-virtual/range {v11 .. v16}, Lcom/google/android/gms/internal/ads/zzrl;->zza(JFJ)V

    .line 172
    .line 173
    .line 174
    :cond_5
    :goto_2
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 175
    .line 176
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzdn;->zzc()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    div-long/2addr v9, v3

    .line 181
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzh:Lcom/google/android/gms/internal/ads/zzrl;

    .line 182
    .line 183
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzrl;->zzb()Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_6

    .line 188
    .line 189
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 190
    .line 191
    invoke-virtual {v2, v9, v10, v4}, Lcom/google/android/gms/internal/ads/zzrl;->zze(JF)J

    .line 192
    .line 193
    .line 194
    move-result-wide v11

    .line 195
    goto :goto_3

    .line 196
    :cond_6
    invoke-direct {v0, v9, v10}, Lcom/google/android/gms/internal/ads/zzsk;->zzh(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v11

    .line 200
    :goto_3
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-ne v1, v8, :cond_a

    .line 205
    .line 206
    if-nez v3, :cond_7

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzrl;->zzc()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-nez v1, :cond_8

    .line 213
    .line 214
    :cond_7
    invoke-direct {v0, v11, v12}, Lcom/google/android/gms/internal/ads/zzsk;->zzg(J)V

    .line 215
    .line 216
    .line 217
    :cond_8
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzz:J

    .line 218
    .line 219
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    cmp-long v3, v1, v3

    .line 225
    .line 226
    if-eqz v3, :cond_9

    .line 227
    .line 228
    sub-long v1, v9, v1

    .line 229
    .line 230
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzy:J

    .line 231
    .line 232
    sub-long v3, v11, v3

    .line 233
    .line 234
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzi:F

    .line 235
    .line 236
    invoke-static {v1, v2, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzv(JF)J

    .line 237
    .line 238
    .line 239
    move-result-wide v1

    .line 240
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzy:J

    .line 241
    .line 242
    add-long/2addr v13, v1

    .line 243
    sub-long v15, v13, v11

    .line 244
    .line 245
    cmp-long v3, v3, v6

    .line 246
    .line 247
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v4

    .line 251
    if-eqz v3, :cond_9

    .line 252
    .line 253
    const-wide/32 v6, 0xf4240

    .line 254
    .line 255
    .line 256
    cmp-long v3, v4, v6

    .line 257
    .line 258
    if-gez v3, :cond_9

    .line 259
    .line 260
    const-wide/16 v3, 0xa

    .line 261
    .line 262
    mul-long/2addr v1, v3

    .line 263
    const-wide/16 v3, 0x64

    .line 264
    .line 265
    div-long/2addr v1, v3

    .line 266
    sub-long v3, v13, v1

    .line 267
    .line 268
    add-long/2addr v13, v1

    .line 269
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 270
    .line 271
    .line 272
    move-result-wide v1

    .line 273
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 274
    .line 275
    .line 276
    move-result-wide v11

    .line 277
    :cond_9
    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzz:J

    .line 278
    .line 279
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzsk;->zzy:J

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_a
    if-eq v1, v5, :cond_b

    .line 283
    .line 284
    :goto_4
    return-wide v11

    .line 285
    :cond_b
    invoke-direct {v0, v11, v12}, Lcom/google/android/gms/internal/ads/zzsk;->zzg(J)V

    .line 286
    .line 287
    .line 288
    return-wide v11
.end method

.method public final zzb()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 23
    .line 24
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzj()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzj:J

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzh:Lcom/google/android/gms/internal/ads/zzrl;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrl;->zzd()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final zzc()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x3

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final zzd(J)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    cmp-long p1, p1, v0

    .line 15
    .line 16
    if-lez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzv:J

    .line 25
    .line 26
    sub-long/2addr p1, v0

    .line 27
    const-wide/16 v0, 0xc8

    .line 28
    .line 29
    cmp-long p1, p1, v0

    .line 30
    .line 31
    if-ltz p1, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final zze(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzk()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzw:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzb:Lcom/google/android/gms/internal/ads/zzdn;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdn;->zzb()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzx:J

    .line 20
    .line 21
    return-void
.end method

.method public final zzf()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzi()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzu:J

    .line 5
    .line 6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzh:Lcom/google/android/gms/internal/ads/zzrl;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrl;->zzd()V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsk;->zzk()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsk;->zzw:J

    .line 25
    .line 26
    return-void
.end method
