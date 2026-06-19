.class public final Lcom/google/android/gms/internal/ads/zzpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzna;
.implements Lcom/google/android/gms/internal/ads/zzpn;


# instance fields
.field private zzA:Z

.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzpo;

.field private final zzd:Landroid/media/metrics/PlaybackSession;

.field private final zze:J

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbe;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbd;

.field private final zzh:Ljava/util/HashMap;

.field private final zzi:Ljava/util/HashMap;

.field private zzj:Ljava/lang/String;

.field private zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:Lcom/google/android/gms/internal/ads/zzau;

.field private zzp:Lcom/google/android/gms/internal/ads/zzpl;

.field private zzq:Lcom/google/android/gms/internal/ads/zzpl;

.field private zzr:Lcom/google/android/gms/internal/ads/zzpl;

.field private zzs:Lcom/google/android/gms/internal/ads/zzv;

.field private zzt:Lcom/google/android/gms/internal/ads/zzv;

.field private zzu:Lcom/google/android/gms/internal/ads/zzv;

.field private zzv:Z

.field private zzw:Z

.field private zzx:I

.field private zzy:I

.field private zzz:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zza:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdh;->zza()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbe;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbe;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzf:Lcom/google/android/gms/internal/ads/zzbe;

    .line 24
    .line 25
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbd;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbd;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzg:Lcom/google/android/gms/internal/ads/zzbd;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzi:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzh:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zze:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 54
    .line 55
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzn:I

    .line 56
    .line 57
    new-instance p1, Lcom/google/android/gms/internal/ads/zzpf;

    .line 58
    .line 59
    sget-object p2, Lcom/google/android/gms/internal/ads/zzpf;->zza:Lcom/google/android/gms/internal/ads/zzgru;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzpf;-><init>(Lcom/google/android/gms/internal/ads/zzgru;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 65
    .line 66
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/zzpo;->zza(Lcom/google/android/gms/internal/ads/zzpn;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private final zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/f;->s(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zze:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/c;->f(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_b

    .line 14
    .line 15
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g;->D(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    if-eq p5, p2, :cond_0

    .line 20
    .line 21
    move p5, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p5, p3

    .line 24
    :goto_0
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/g;->t(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 25
    .line 26
    .line 27
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzn:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p5, :cond_1

    .line 30
    .line 31
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/g;->u(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->q(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->y(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzj:I

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    if-eq p5, v0, :cond_4

    .line 52
    .line 53
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->p(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzv:I

    .line 57
    .line 58
    if-eq p5, v0, :cond_5

    .line 59
    .line 60
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->x(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 61
    .line 62
    .line 63
    :cond_5
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 64
    .line 65
    if-eq p5, v0, :cond_6

    .line 66
    .line 67
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->A(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 71
    .line 72
    if-eq p5, v0, :cond_7

    .line 73
    .line 74
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->C(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_7
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 78
    .line 79
    if-eq p5, v0, :cond_8

    .line 80
    .line 81
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/c;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 82
    .line 83
    .line 84
    :cond_8
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzd:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz p5, :cond_a

    .line 87
    .line 88
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 89
    .line 90
    const-string v1, "-"

    .line 91
    .line 92
    invoke-virtual {p5, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p5

    .line 96
    const/4 v0, 0x0

    .line 97
    aget-object v0, p5, v0

    .line 98
    .line 99
    array-length v1, p5

    .line 100
    if-lt v1, p3, :cond_9

    .line 101
    .line 102
    aget-object p3, p5, p2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_9
    const/4 p3, 0x0

    .line 106
    :goto_1
    invoke-static {v0, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p5, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, p5}, Lcom/google/android/gms/internal/ads/f;->y(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 118
    .line 119
    if-eqz p3, :cond_a

    .line 120
    .line 121
    check-cast p3, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/f;->C(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_a
    iget p3, p4, Lcom/google/android/gms/internal/ads/zzv;->zzz:F

    .line 127
    .line 128
    const/high16 p4, -0x40800000    # -1.0f

    .line 129
    .line 130
    cmpl-float p4, p3, p4

    .line 131
    .line 132
    if-eqz p4, :cond_c

    .line 133
    .line 134
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/f;->x(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_b
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g;->s(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 139
    .line 140
    .line 141
    :cond_c
    :goto_2
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 142
    .line 143
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/g;->j(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 148
    .line 149
    new-instance p3, Lcom/google/android/gms/internal/ads/zzpi;

    .line 150
    .line 151
    invoke-direct {p3, p0, p1}, Lcom/google/android/gms/internal/ads/zzpi;-><init>(Lcom/google/android/gms/internal/ads/zzpm;Landroid/media/metrics/TrackChangeEvent;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private final zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzbf;->zze(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-eq p2, v1, :cond_7

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzg:Lcom/google/android/gms/internal/ads/zzbd;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzbf;->zzd(ILcom/google/android/gms/internal/ads/zzbd;Z)Lcom/google/android/gms/internal/ads/zzbd;

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzf:Lcom/google/android/gms/internal/ads/zzbe;

    .line 22
    .line 23
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzbd;->zzc:I

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    invoke-virtual {p1, v1, p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzbf;->zzb(ILcom/google/android/gms/internal/ads/zzbe;J)Lcom/google/android/gms/internal/ads/zzbe;

    .line 28
    .line 29
    .line 30
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzd:Lcom/google/android/gms/internal/ads/zzak;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzag;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzag;->zza:Landroid/net/Uri;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzF(Landroid/net/Uri;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    if-eq p1, v3, :cond_3

    .line 48
    .line 49
    if-eq p1, v1, :cond_2

    .line 50
    .line 51
    move v2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x4

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v2, 0x5

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const/4 v2, 0x3

    .line 58
    :goto_0
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/f;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 59
    .line 60
    .line 61
    iget-wide v4, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzm:J

    .line 62
    .line 63
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long p1, v4, v6

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    iget-boolean p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzk:Z

    .line 73
    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    iget-boolean p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzi:Z

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbe;->zzb()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzp(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-static {v0, v4, v5}, Lcom/google/android/gms/internal/ads/f;->u(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbe;->zzb()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eq v3, p1, :cond_6

    .line 98
    .line 99
    move v1, v3

    .line 100
    :cond_6
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/f;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 101
    .line 102
    .line 103
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 104
    .line 105
    :cond_7
    :goto_1
    return-void
.end method

.method private final zzC()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzz:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/c;->k(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzx:I

    .line 18
    .line 19
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/c;->v(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzy:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/c;->z(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzh:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzj:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/c;->l(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzi:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzj:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, Lcom/google/android/gms/internal/ads/c;->w(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/c;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 96
    .line 97
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/c;->e(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    new-instance v3, Lcom/google/android/gms/internal/ads/zzpj;

    .line 104
    .line 105
    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/zzpj;-><init>(Lcom/google/android/gms/internal/ads/zzpm;Landroid/media/metrics/PlaybackMetrics;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 113
    .line 114
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzj:Ljava/lang/String;

    .line 115
    .line 116
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzz:I

    .line 117
    .line 118
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzx:I

    .line 119
    .line 120
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzy:I

    .line 121
    .line 122
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 123
    .line 124
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 125
    .line 126
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 127
    .line 128
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 129
    .line 130
    return-void
.end method

.method private static zzD(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfj;->zzE(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x1b

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    const/16 p0, 0x1a

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_1
    const/16 p0, 0x19

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_2
    const/16 p0, 0x1c

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_3
    const/16 p0, 0x18

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzpm;
    .locals 2

    .line 1
    const-string v0, "media_metrics"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f;->b(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzpm;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f;->n(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzpm;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method private final zzw(Lcom/google/android/gms/internal/ads/zzpl;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpl;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzpo;->zzf()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method private final zzx(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final zzy(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final zzz(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final zzb()Landroid/media/metrics/LogSessionId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/f;->a(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzmy;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzd:Lcom/google/android/gms/internal/ads/zzwk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzwk;->zzb()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpm;->zzC()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzj:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/ads/f;->l()Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/f;->m(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/f;->A(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 32
    .line 33
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzpm;->zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzmy;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzd:Lcom/google/android/gms/internal/ads/zzwk;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzwk;->zzb()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzj:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpm;->zzC()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzh:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzi:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final zzde(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzba;Lcom/google/android/gms/internal/ads/zzba;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzv:Z

    move p4, p1

    :cond_0
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzl:I

    return-void
.end method

.method public final zzdf(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzwg;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzd:Lcom/google/android/gms/internal/ads/zzwk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzwg;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/ads/zzpl;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-interface {v3, p1, v0}, Lcom/google/android/gms/internal/ads/zzpo;->zzb(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v2, v1, v4, p1}, Lcom/google/android/gms/internal/ads/zzpl;-><init>(Lcom/google/android/gms/internal/ads/zzv;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget p1, p2, Lcom/google/android/gms/internal/ads/zzwg;->zza:I

    .line 26
    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eq p1, p2, :cond_2

    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    if-eq p1, p2, :cond_3

    .line 34
    .line 35
    const/4 p2, 0x3

    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 46
    .line 47
    return-void
.end method

.method public final zzdg(Lcom/google/android/gms/internal/ads/zzmy;IJJ)V
    .locals 6

    .line 1
    iget-object p5, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzd:Lcom/google/android/gms/internal/ads/zzwk;

    .line 2
    .line 3
    if-eqz p5, :cond_2

    .line 4
    .line 5
    iget-object p6, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzmy;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 8
    .line 9
    invoke-interface {p6, p1, p5}, Lcom/google/android/gms/internal/ads/zzpo;->zzb(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzi:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p6

    .line 19
    check-cast p6, Ljava/lang/Long;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzh:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Long;

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    if-nez p6, :cond_0

    .line 32
    .line 33
    move-wide v4, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    :goto_0
    add-long/2addr v4, p3

    .line 40
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p5, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    :goto_1
    int-to-long p2, p2

    .line 55
    add-long/2addr v2, p2

    .line 56
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method

.method public final zzdh(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzin;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzx:I

    .line 2
    .line 3
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzin;->zzg:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzx:I

    .line 7
    .line 8
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzy:I

    .line 9
    .line 10
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzin;->zze:I

    .line 11
    .line 12
    add-int/2addr p1, p2

    .line 13
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzy:I

    .line 14
    .line 15
    return-void
.end method

.method public final zzdi(Lcom/google/android/gms/internal/ads/zzbb;Lcom/google/android/gms/internal/ads/zzmz;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzmz;->zzc()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_11

    .line 12
    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzmz;->zzc()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/16 v5, 0xb

    .line 20
    .line 21
    if-ge v3, v4, :cond_3

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzmz;->zzd(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzmz;->zza(I)Lcom/google/android/gms/internal/ads/zzmy;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 34
    .line 35
    invoke-interface {v4, v6}, Lcom/google/android/gms/internal/ads/zzpo;->zzd(Lcom/google/android/gms/internal/ads/zzmy;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    if-ne v4, v5, :cond_2

    .line 40
    .line 41
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 42
    .line 43
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzl:I

    .line 44
    .line 45
    invoke-interface {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzpo;->zze(Lcom/google/android/gms/internal/ads/zzmy;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 50
    .line 51
    invoke-interface {v4, v6}, Lcom/google/android/gms/internal/ads/zzpo;->zzc(Lcom/google/android/gms/internal/ads/zzmy;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzmz;->zza(I)Lcom/google/android/gms/internal/ads/zzmy;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 72
    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    iget-object v7, v6, Lcom/google/android/gms/internal/ads/zzmy;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 76
    .line 77
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzmy;->zzd:Lcom/google/android/gms/internal/ads/zzwk;

    .line 78
    .line 79
    invoke-direct {v0, v7, v6}, Lcom/google/android/gms/internal/ads/zzpm;->zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    const/4 v6, 0x2

    .line 83
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    const/4 v9, 0x3

    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v11, 0x1

    .line 90
    if-eqz v7, :cond_c

    .line 91
    .line 92
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 93
    .line 94
    if-eqz v7, :cond_c

    .line 95
    .line 96
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzp()Lcom/google/android/gms/internal/ads/zzbn;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzbn;->zza()Lcom/google/android/gms/internal/ads/zzguf;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    move v13, v2

    .line 109
    :goto_2
    if-ge v13, v12, :cond_7

    .line 110
    .line 111
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v14

    .line 115
    check-cast v14, Lcom/google/android/gms/internal/ads/zzbm;

    .line 116
    .line 117
    move v15, v2

    .line 118
    :goto_3
    iget v5, v14, Lcom/google/android/gms/internal/ads/zzbm;->zza:I

    .line 119
    .line 120
    add-int/lit8 v16, v13, 0x1

    .line 121
    .line 122
    if-ge v15, v5, :cond_6

    .line 123
    .line 124
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzbm;->zzc(I)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_5

    .line 129
    .line 130
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzbm;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzv;->zzs:Lcom/google/android/gms/internal/ads/zzq;

    .line 135
    .line 136
    if-eqz v5, :cond_5

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    move/from16 v13, v16

    .line 143
    .line 144
    const/16 v5, 0xb

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_7
    move-object v5, v10

    .line 148
    :goto_4
    if-eqz v5, :cond_c

    .line 149
    .line 150
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 151
    .line 152
    sget-object v12, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/c;->d(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    move v12, v2

    .line 159
    :goto_5
    iget v13, v5, Lcom/google/android/gms/internal/ads/zzq;->zzb:I

    .line 160
    .line 161
    if-ge v12, v13, :cond_b

    .line 162
    .line 163
    invoke-virtual {v5, v12}, Lcom/google/android/gms/internal/ads/zzq;->zza(I)Lcom/google/android/gms/internal/ads/zzp;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzp;->zza:Ljava/util/UUID;

    .line 168
    .line 169
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zzd:Ljava/util/UUID;

    .line 170
    .line 171
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    if-eqz v14, :cond_8

    .line 176
    .line 177
    move v5, v9

    .line 178
    goto :goto_6

    .line 179
    :cond_8
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zze:Ljava/util/UUID;

    .line 180
    .line 181
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v14

    .line 185
    if-eqz v14, :cond_9

    .line 186
    .line 187
    move v5, v6

    .line 188
    goto :goto_6

    .line 189
    :cond_9
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zzc:Ljava/util/UUID;

    .line 190
    .line 191
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-eqz v13, :cond_a

    .line 196
    .line 197
    const/4 v5, 0x6

    .line 198
    goto :goto_6

    .line 199
    :cond_a
    add-int/lit8 v12, v12, 0x1

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_b
    move v5, v11

    .line 203
    :goto_6
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/ads/f;->t(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 204
    .line 205
    .line 206
    :cond_c
    const/16 v5, 0x3f3

    .line 207
    .line 208
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_d

    .line 213
    .line 214
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzz:I

    .line 215
    .line 216
    add-int/2addr v5, v11

    .line 217
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzz:I

    .line 218
    .line 219
    :cond_d
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    .line 220
    .line 221
    const/16 v16, 0x9

    .line 222
    .line 223
    if-nez v5, :cond_e

    .line 224
    .line 225
    goto/16 :goto_d

    .line 226
    .line 227
    :cond_e
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zza:Landroid/content/Context;

    .line 228
    .line 229
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzau;->zza:I

    .line 230
    .line 231
    const/16 v12, 0x3e9

    .line 232
    .line 233
    if-ne v8, v12, :cond_10

    .line 234
    .line 235
    const/16 v7, 0x14

    .line 236
    .line 237
    :cond_f
    :goto_7
    move v8, v2

    .line 238
    goto/16 :goto_c

    .line 239
    .line 240
    :cond_10
    move-object v12, v5

    .line 241
    check-cast v12, Lcom/google/android/gms/internal/ads/zziw;

    .line 242
    .line 243
    iget v13, v12, Lcom/google/android/gms/internal/ads/zziw;->zzc:I

    .line 244
    .line 245
    if-ne v13, v11, :cond_11

    .line 246
    .line 247
    move v13, v11

    .line 248
    goto :goto_8

    .line 249
    :cond_11
    move v13, v2

    .line 250
    :goto_8
    iget v12, v12, Lcom/google/android/gms/internal/ads/zziw;->zzg:I

    .line 251
    .line 252
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    instance-of v15, v14, Ljava/io/IOException;

    .line 260
    .line 261
    const/16 v17, 0x17

    .line 262
    .line 263
    if-eqz v15, :cond_25

    .line 264
    .line 265
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzhs;

    .line 266
    .line 267
    if-eqz v12, :cond_12

    .line 268
    .line 269
    check-cast v14, Lcom/google/android/gms/internal/ads/zzhs;

    .line 270
    .line 271
    iget v7, v14, Lcom/google/android/gms/internal/ads/zzhs;->zzc:I

    .line 272
    .line 273
    move v8, v7

    .line 274
    const/4 v7, 0x5

    .line 275
    goto/16 :goto_c

    .line 276
    .line 277
    :cond_12
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzhr;

    .line 278
    .line 279
    if-nez v12, :cond_13

    .line 280
    .line 281
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzat;

    .line 282
    .line 283
    if-eqz v12, :cond_14

    .line 284
    .line 285
    :cond_13
    move v8, v2

    .line 286
    const/16 v7, 0xb

    .line 287
    .line 288
    goto/16 :goto_c

    .line 289
    .line 290
    :cond_14
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzhq;

    .line 291
    .line 292
    if-nez v12, :cond_20

    .line 293
    .line 294
    instance-of v13, v14, Lcom/google/android/gms/internal/ads/zzia;

    .line 295
    .line 296
    if-eqz v13, :cond_15

    .line 297
    .line 298
    goto/16 :goto_b

    .line 299
    .line 300
    :cond_15
    const/16 v7, 0x3ea

    .line 301
    .line 302
    if-ne v8, v7, :cond_16

    .line 303
    .line 304
    const/16 v7, 0x15

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_16
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zztg;

    .line 308
    .line 309
    if-eqz v7, :cond_1d

    .line 310
    .line 311
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    instance-of v8, v7, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 319
    .line 320
    if-eqz v8, :cond_17

    .line 321
    .line 322
    check-cast v7, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 323
    .line 324
    invoke-virtual {v7}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzfj;->zzQ(Ljava/lang/String;)I

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzpm;->zzD(I)I

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    :goto_9
    move/from16 v18, v8

    .line 337
    .line 338
    move v8, v7

    .line 339
    move/from16 v7, v18

    .line 340
    .line 341
    goto/16 :goto_c

    .line 342
    .line 343
    :cond_17
    instance-of v8, v7, Landroid/media/MediaDrmResetException;

    .line 344
    .line 345
    if-eqz v8, :cond_18

    .line 346
    .line 347
    const/16 v7, 0x1b

    .line 348
    .line 349
    goto :goto_7

    .line 350
    :cond_18
    instance-of v8, v7, Landroid/media/NotProvisionedException;

    .line 351
    .line 352
    if-eqz v8, :cond_19

    .line 353
    .line 354
    const/16 v7, 0x18

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_19
    instance-of v8, v7, Landroid/media/DeniedByServerException;

    .line 358
    .line 359
    if-eqz v8, :cond_1a

    .line 360
    .line 361
    const/16 v7, 0x1d

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_1a
    instance-of v8, v7, Lcom/google/android/gms/internal/ads/zztq;

    .line 365
    .line 366
    if-eqz v8, :cond_1b

    .line 367
    .line 368
    :goto_a
    move v8, v2

    .line 369
    move/from16 v7, v17

    .line 370
    .line 371
    goto/16 :goto_c

    .line 372
    .line 373
    :cond_1b
    instance-of v7, v7, Lcom/google/android/gms/internal/ads/zztf;

    .line 374
    .line 375
    if-eqz v7, :cond_1c

    .line 376
    .line 377
    const/16 v7, 0x1c

    .line 378
    .line 379
    goto/16 :goto_7

    .line 380
    .line 381
    :cond_1c
    const/16 v7, 0x1e

    .line 382
    .line 383
    goto/16 :goto_7

    .line 384
    .line 385
    :cond_1d
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zzhn;

    .line 386
    .line 387
    if-eqz v7, :cond_1f

    .line 388
    .line 389
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    instance-of v7, v7, Ljava/io/FileNotFoundException;

    .line 394
    .line 395
    if-eqz v7, :cond_1f

    .line 396
    .line 397
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    instance-of v8, v7, Landroid/system/ErrnoException;

    .line 409
    .line 410
    const/16 v12, 0x1f

    .line 411
    .line 412
    if-eqz v8, :cond_1e

    .line 413
    .line 414
    check-cast v7, Landroid/system/ErrnoException;

    .line 415
    .line 416
    iget v7, v7, Landroid/system/ErrnoException;->errno:I

    .line 417
    .line 418
    sget v8, Landroid/system/OsConstants;->EACCES:I

    .line 419
    .line 420
    if-ne v7, v8, :cond_1e

    .line 421
    .line 422
    const/16 v7, 0x20

    .line 423
    .line 424
    goto/16 :goto_7

    .line 425
    .line 426
    :cond_1e
    move v8, v2

    .line 427
    move v7, v12

    .line 428
    goto/16 :goto_c

    .line 429
    .line 430
    :cond_1f
    move v8, v2

    .line 431
    move/from16 v7, v16

    .line 432
    .line 433
    goto/16 :goto_c

    .line 434
    .line 435
    :cond_20
    :goto_b
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzep;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzep;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzep;->zzc()I

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    if-ne v7, v11, :cond_21

    .line 444
    .line 445
    move v8, v2

    .line 446
    move v7, v9

    .line 447
    goto/16 :goto_c

    .line 448
    .line 449
    :cond_21
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    instance-of v8, v7, Ljava/net/UnknownHostException;

    .line 454
    .line 455
    if-eqz v8, :cond_22

    .line 456
    .line 457
    move v8, v2

    .line 458
    const/4 v7, 0x6

    .line 459
    goto/16 :goto_c

    .line 460
    .line 461
    :cond_22
    instance-of v7, v7, Ljava/net/SocketTimeoutException;

    .line 462
    .line 463
    if-eqz v7, :cond_23

    .line 464
    .line 465
    move v8, v2

    .line 466
    const/4 v7, 0x7

    .line 467
    goto/16 :goto_c

    .line 468
    .line 469
    :cond_23
    if-eqz v12, :cond_24

    .line 470
    .line 471
    check-cast v14, Lcom/google/android/gms/internal/ads/zzhq;

    .line 472
    .line 473
    iget v7, v14, Lcom/google/android/gms/internal/ads/zzhq;->zzb:I

    .line 474
    .line 475
    if-ne v7, v11, :cond_24

    .line 476
    .line 477
    move v8, v2

    .line 478
    const/4 v7, 0x4

    .line 479
    goto/16 :goto_c

    .line 480
    .line 481
    :cond_24
    move v8, v2

    .line 482
    const/16 v7, 0x8

    .line 483
    .line 484
    goto/16 :goto_c

    .line 485
    .line 486
    :cond_25
    if-eqz v13, :cond_26

    .line 487
    .line 488
    const/16 v7, 0x23

    .line 489
    .line 490
    if-eqz v12, :cond_f

    .line 491
    .line 492
    if-ne v12, v11, :cond_26

    .line 493
    .line 494
    goto/16 :goto_7

    .line 495
    .line 496
    :cond_26
    if-eqz v13, :cond_27

    .line 497
    .line 498
    if-ne v12, v9, :cond_27

    .line 499
    .line 500
    const/16 v7, 0xf

    .line 501
    .line 502
    goto/16 :goto_7

    .line 503
    .line 504
    :cond_27
    if-eqz v13, :cond_28

    .line 505
    .line 506
    if-ne v12, v6, :cond_28

    .line 507
    .line 508
    goto/16 :goto_a

    .line 509
    .line 510
    :cond_28
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zzuq;

    .line 511
    .line 512
    if-eqz v7, :cond_29

    .line 513
    .line 514
    check-cast v14, Lcom/google/android/gms/internal/ads/zzuq;

    .line 515
    .line 516
    iget-object v7, v14, Lcom/google/android/gms/internal/ads/zzuq;->zzd:Ljava/lang/String;

    .line 517
    .line 518
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzfj;->zzQ(Ljava/lang/String;)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    move v8, v7

    .line 523
    const/16 v7, 0xd

    .line 524
    .line 525
    goto :goto_c

    .line 526
    :cond_29
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zzum;

    .line 527
    .line 528
    const/16 v8, 0xe

    .line 529
    .line 530
    if-eqz v7, :cond_2a

    .line 531
    .line 532
    check-cast v14, Lcom/google/android/gms/internal/ads/zzum;

    .line 533
    .line 534
    iget v7, v14, Lcom/google/android/gms/internal/ads/zzum;->zza:I

    .line 535
    .line 536
    goto/16 :goto_9

    .line 537
    .line 538
    :cond_2a
    instance-of v7, v14, Ljava/lang/OutOfMemoryError;

    .line 539
    .line 540
    if-eqz v7, :cond_2b

    .line 541
    .line 542
    move v7, v8

    .line 543
    goto/16 :goto_7

    .line 544
    .line 545
    :cond_2b
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zzrf;

    .line 546
    .line 547
    if-eqz v7, :cond_2c

    .line 548
    .line 549
    const/16 v7, 0x11

    .line 550
    .line 551
    goto/16 :goto_7

    .line 552
    .line 553
    :cond_2c
    instance-of v7, v14, Lcom/google/android/gms/internal/ads/zzri;

    .line 554
    .line 555
    if-eqz v7, :cond_2d

    .line 556
    .line 557
    check-cast v14, Lcom/google/android/gms/internal/ads/zzri;

    .line 558
    .line 559
    iget v7, v14, Lcom/google/android/gms/internal/ads/zzri;->zza:I

    .line 560
    .line 561
    const/16 v8, 0x12

    .line 562
    .line 563
    goto/16 :goto_9

    .line 564
    .line 565
    :cond_2d
    instance-of v7, v14, Landroid/media/MediaCodec$CryptoException;

    .line 566
    .line 567
    if-eqz v7, :cond_2e

    .line 568
    .line 569
    check-cast v14, Landroid/media/MediaCodec$CryptoException;

    .line 570
    .line 571
    invoke-virtual {v14}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 572
    .line 573
    .line 574
    move-result v7

    .line 575
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzpm;->zzD(I)I

    .line 576
    .line 577
    .line 578
    move-result v8

    .line 579
    goto/16 :goto_9

    .line 580
    .line 581
    :cond_2e
    const/16 v7, 0x16

    .line 582
    .line 583
    goto/16 :goto_7

    .line 584
    .line 585
    :goto_c
    invoke-static {}, Lcom/google/android/gms/internal/ads/f;->g()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 586
    .line 587
    .line 588
    move-result-object v12

    .line 589
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzpm;->zze:J

    .line 590
    .line 591
    sub-long v13, v3, v13

    .line 592
    .line 593
    invoke-static {v12, v13, v14}, Lcom/google/android/gms/internal/ads/f;->i(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 594
    .line 595
    .line 596
    move-result-object v12

    .line 597
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/f;->z(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 598
    .line 599
    .line 600
    move-result-object v7

    .line 601
    invoke-static {v7, v8}, Lcom/google/android/gms/internal/ads/f;->h(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 602
    .line 603
    .line 604
    move-result-object v7

    .line 605
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/ads/f;->j(Landroid/media/metrics/PlaybackErrorEvent$Builder;Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/f;->k(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 610
    .line 611
    .line 612
    move-result-object v5

    .line 613
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 614
    .line 615
    new-instance v8, Lcom/google/android/gms/internal/ads/zzpk;

    .line 616
    .line 617
    invoke-direct {v8, v0, v5}, Lcom/google/android/gms/internal/ads/zzpk;-><init>(Lcom/google/android/gms/internal/ads/zzpm;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 618
    .line 619
    .line 620
    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 621
    .line 622
    .line 623
    iput-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 624
    .line 625
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    .line 626
    .line 627
    :goto_d
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 628
    .line 629
    .line 630
    move-result v5

    .line 631
    if-eqz v5, :cond_32

    .line 632
    .line 633
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzp()Lcom/google/android/gms/internal/ads/zzbn;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 642
    .line 643
    .line 644
    move-result v8

    .line 645
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 646
    .line 647
    .line 648
    move-result v5

    .line 649
    if-nez v7, :cond_2f

    .line 650
    .line 651
    if-nez v8, :cond_2f

    .line 652
    .line 653
    if-eqz v5, :cond_32

    .line 654
    .line 655
    move v5, v11

    .line 656
    :cond_2f
    if-nez v7, :cond_30

    .line 657
    .line 658
    invoke-direct {v0, v3, v4, v10, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzx(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 659
    .line 660
    .line 661
    :cond_30
    if-nez v8, :cond_31

    .line 662
    .line 663
    invoke-direct {v0, v3, v4, v10, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzy(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 664
    .line 665
    .line 666
    :cond_31
    if-nez v5, :cond_32

    .line 667
    .line 668
    invoke-direct {v0, v3, v4, v10, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzz(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 669
    .line 670
    .line 671
    :cond_32
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 672
    .line 673
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzw(Lcom/google/android/gms/internal/ads/zzpl;)Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-eqz v5, :cond_33

    .line 678
    .line 679
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 680
    .line 681
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 682
    .line 683
    iget v7, v5, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 684
    .line 685
    const/4 v8, -0x1

    .line 686
    if-eq v7, v8, :cond_33

    .line 687
    .line 688
    invoke-direct {v0, v3, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzx(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 689
    .line 690
    .line 691
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 692
    .line 693
    :cond_33
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    .line 694
    .line 695
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzw(Lcom/google/android/gms/internal/ads/zzpl;)Z

    .line 696
    .line 697
    .line 698
    move-result v5

    .line 699
    if-eqz v5, :cond_34

    .line 700
    .line 701
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    .line 702
    .line 703
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 704
    .line 705
    invoke-direct {v0, v3, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzy(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 706
    .line 707
    .line 708
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzq:Lcom/google/android/gms/internal/ads/zzpl;

    .line 709
    .line 710
    :cond_34
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 711
    .line 712
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzpm;->zzw(Lcom/google/android/gms/internal/ads/zzpl;)Z

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eqz v5, :cond_35

    .line 717
    .line 718
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 719
    .line 720
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 721
    .line 722
    invoke-direct {v0, v3, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzpm;->zzz(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 723
    .line 724
    .line 725
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzr:Lcom/google/android/gms/internal/ads/zzpl;

    .line 726
    .line 727
    :cond_35
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zza:Landroid/content/Context;

    .line 728
    .line 729
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzep;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzep;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzep;->zzc()I

    .line 734
    .line 735
    .line 736
    move-result v5

    .line 737
    packed-switch v5, :pswitch_data_0

    .line 738
    .line 739
    .line 740
    :pswitch_0
    move v12, v11

    .line 741
    goto :goto_e

    .line 742
    :pswitch_1
    const/4 v12, 0x7

    .line 743
    goto :goto_e

    .line 744
    :pswitch_2
    const/16 v12, 0x8

    .line 745
    .line 746
    goto :goto_e

    .line 747
    :pswitch_3
    move v12, v9

    .line 748
    goto :goto_e

    .line 749
    :pswitch_4
    const/4 v12, 0x6

    .line 750
    goto :goto_e

    .line 751
    :pswitch_5
    const/4 v12, 0x5

    .line 752
    goto :goto_e

    .line 753
    :pswitch_6
    const/4 v12, 0x4

    .line 754
    goto :goto_e

    .line 755
    :pswitch_7
    move v12, v6

    .line 756
    goto :goto_e

    .line 757
    :pswitch_8
    move/from16 v12, v16

    .line 758
    .line 759
    goto :goto_e

    .line 760
    :pswitch_9
    move v12, v2

    .line 761
    :goto_e
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzn:I

    .line 762
    .line 763
    if-eq v12, v5, :cond_36

    .line 764
    .line 765
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzn:I

    .line 766
    .line 767
    invoke-static {}, Lcom/google/android/gms/internal/ads/f;->c()Landroid/media/metrics/NetworkEvent$Builder;

    .line 768
    .line 769
    .line 770
    move-result-object v5

    .line 771
    invoke-static {v5, v12}, Lcom/google/android/gms/internal/ads/f;->d(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 772
    .line 773
    .line 774
    move-result-object v5

    .line 775
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zze:J

    .line 776
    .line 777
    sub-long v7, v3, v7

    .line 778
    .line 779
    invoke-static {v5, v7, v8}, Lcom/google/android/gms/internal/ads/f;->e(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/f;->f(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 788
    .line 789
    new-instance v8, Lcom/google/android/gms/internal/ads/zzpg;

    .line 790
    .line 791
    invoke-direct {v8, v0, v5}, Lcom/google/android/gms/internal/ads/zzpg;-><init>(Lcom/google/android/gms/internal/ads/zzpm;Landroid/media/metrics/NetworkEvent;)V

    .line 792
    .line 793
    .line 794
    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 795
    .line 796
    .line 797
    :cond_36
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzh()I

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    if-eq v5, v6, :cond_37

    .line 802
    .line 803
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzv:Z

    .line 804
    .line 805
    :cond_37
    move-object/from16 v5, p1

    .line 806
    .line 807
    check-cast v5, Lcom/google/android/gms/internal/ads/zzmv;

    .line 808
    .line 809
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzmv;->zzI()Lcom/google/android/gms/internal/ads/zziw;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    const/16 v7, 0xa

    .line 814
    .line 815
    if-nez v5, :cond_38

    .line 816
    .line 817
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzw:Z

    .line 818
    .line 819
    goto :goto_f

    .line 820
    :cond_38
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    if-eqz v2, :cond_39

    .line 825
    .line 826
    iput-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzw:Z

    .line 827
    .line 828
    :cond_39
    :goto_f
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzh()I

    .line 829
    .line 830
    .line 831
    move-result v2

    .line 832
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzv:Z

    .line 833
    .line 834
    if-eqz v5, :cond_3a

    .line 835
    .line 836
    const/4 v5, 0x5

    .line 837
    goto :goto_10

    .line 838
    :cond_3a
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzw:Z

    .line 839
    .line 840
    if-eqz v5, :cond_3b

    .line 841
    .line 842
    const/16 v5, 0xd

    .line 843
    .line 844
    goto :goto_10

    .line 845
    :cond_3b
    const/4 v5, 0x4

    .line 846
    if-ne v2, v5, :cond_3c

    .line 847
    .line 848
    const/16 v5, 0xb

    .line 849
    .line 850
    goto :goto_10

    .line 851
    :cond_3c
    const/16 v8, 0xc

    .line 852
    .line 853
    if-ne v2, v6, :cond_41

    .line 854
    .line 855
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 856
    .line 857
    if-eqz v2, :cond_3d

    .line 858
    .line 859
    if-eq v2, v6, :cond_3d

    .line 860
    .line 861
    if-ne v2, v8, :cond_3e

    .line 862
    .line 863
    :cond_3d
    move v5, v6

    .line 864
    goto :goto_10

    .line 865
    :cond_3e
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzk()Z

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    if-nez v2, :cond_3f

    .line 870
    .line 871
    const/4 v5, 0x7

    .line 872
    goto :goto_10

    .line 873
    :cond_3f
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzi()I

    .line 874
    .line 875
    .line 876
    move-result v2

    .line 877
    if-eqz v2, :cond_40

    .line 878
    .line 879
    move v5, v7

    .line 880
    goto :goto_10

    .line 881
    :cond_40
    const/4 v5, 0x6

    .line 882
    goto :goto_10

    .line 883
    :cond_41
    if-ne v2, v9, :cond_44

    .line 884
    .line 885
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzk()Z

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    if-nez v2, :cond_42

    .line 890
    .line 891
    goto :goto_10

    .line 892
    :cond_42
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzi()I

    .line 893
    .line 894
    .line 895
    move-result v2

    .line 896
    if-eqz v2, :cond_43

    .line 897
    .line 898
    move/from16 v5, v16

    .line 899
    .line 900
    goto :goto_10

    .line 901
    :cond_43
    move v5, v9

    .line 902
    goto :goto_10

    .line 903
    :cond_44
    if-ne v2, v11, :cond_45

    .line 904
    .line 905
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 906
    .line 907
    if-eqz v2, :cond_45

    .line 908
    .line 909
    move v5, v8

    .line 910
    goto :goto_10

    .line 911
    :cond_45
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 912
    .line 913
    :goto_10
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 914
    .line 915
    if-eq v2, v5, :cond_46

    .line 916
    .line 917
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 918
    .line 919
    iput-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzA:Z

    .line 920
    .line 921
    invoke-static {}, Lcom/google/android/gms/internal/ads/f;->o()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzm:I

    .line 926
    .line 927
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/f;->p(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzpm;->zze:J

    .line 932
    .line 933
    sub-long/2addr v3, v5

    .line 934
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/f;->q(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/f;->r(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzb:Ljava/util/concurrent/Executor;

    .line 943
    .line 944
    new-instance v4, Lcom/google/android/gms/internal/ads/zzph;

    .line 945
    .line 946
    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/ads/zzph;-><init>(Lcom/google/android/gms/internal/ads/zzpm;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 947
    .line 948
    .line 949
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 950
    .line 951
    .line 952
    :cond_46
    const/16 v2, 0x404

    .line 953
    .line 954
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzmz;->zzb(I)Z

    .line 955
    .line 956
    .line 957
    move-result v3

    .line 958
    if-eqz v3, :cond_47

    .line 959
    .line 960
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzpm;->zzc:Lcom/google/android/gms/internal/ads/zzpo;

    .line 961
    .line 962
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzmz;->zza(I)Lcom/google/android/gms/internal/ads/zzmy;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/zzpo;->zzg(Lcom/google/android/gms/internal/ads/zzmy;)V

    .line 967
    .line 968
    .line 969
    :cond_47
    :goto_11
    return-void

    .line 970
    nop

    .line 971
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzau;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzwb;Lcom/google/android/gms/internal/ads/zzwg;Ljava/io/IOException;Z)V
    .locals 0

    return-void
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzmy;Lcom/google/android/gms/internal/ads/zzbv;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzpl;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 6
    .line 7
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzbv;->zzb:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzt(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 19
    .line 20
    .line 21
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzbv;->zzc:I

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzt;->zzu(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpl;->zzc:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpl;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzpl;-><init>(Lcom/google/android/gms/internal/ads/zzv;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzp:Lcom/google/android/gms/internal/ads/zzpl;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final synthetic zzr(Landroid/media/metrics/PlaybackErrorEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/c;->m(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzs(Landroid/media/metrics/NetworkEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/f;->v(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzt(Landroid/media/metrics/PlaybackStateEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/c;->n(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzu(Landroid/media/metrics/TrackChangeEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/c;->o(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzv(Landroid/media/metrics/PlaybackMetrics;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpm;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/f;->w(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
