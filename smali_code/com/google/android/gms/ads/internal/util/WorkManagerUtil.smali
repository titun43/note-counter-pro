.class public Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;
.super Lcom/google/android/gms/ads/internal/util/zzbn;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/util/zzbn;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static zzb(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lt2/i;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, Lt2/i;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroidx/work/b;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Landroidx/work/b;-><init>(Lt2/i;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1}, Ll1/k;->R(Landroid/content/Context;Landroidx/work/b;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :catch_0
    return-void
.end method


# virtual methods
.method public final zze(La3/a;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/internal/offline/buffering/zza;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, v1}, Lcom/google/android/gms/ads/internal/offline/buffering/zza;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzg(La3/a;Lcom/google/android/gms/ads/internal/offline/buffering/zza;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final zzf(La3/a;)V
    .locals 6

    .line 1
    invoke-static {p1}, La3/b;->b(La3/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzb(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, Ll1/k;->Q(Landroid/content/Context;)Ll1/k;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    new-instance v0, Lu1/b;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p1, v1}, Lu1/b;-><init>(Ll1/k;I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/t;->i(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroidx/work/e;

    .line 26
    .line 27
    invoke-direct {v0}, Landroidx/work/e;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroidx/work/c;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    iput v2, v1, Landroidx/work/c;->a:I

    .line 37
    .line 38
    const-wide/16 v2, -0x1

    .line 39
    .line 40
    iput-wide v2, v1, Landroidx/work/c;->f:J

    .line 41
    .line 42
    iput-wide v2, v1, Landroidx/work/c;->g:J

    .line 43
    .line 44
    new-instance v4, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    iput-boolean v4, v1, Landroidx/work/c;->b:Z

    .line 51
    .line 52
    iput-boolean v4, v1, Landroidx/work/c;->c:Z

    .line 53
    .line 54
    const/4 v5, 0x2

    .line 55
    iput v5, v1, Landroidx/work/c;->a:I

    .line 56
    .line 57
    iput-boolean v4, v1, Landroidx/work/c;->d:Z

    .line 58
    .line 59
    iput-boolean v4, v1, Landroidx/work/c;->e:Z

    .line 60
    .line 61
    iput-object v0, v1, Landroidx/work/c;->h:Landroidx/work/e;

    .line 62
    .line 63
    iput-wide v2, v1, Landroidx/work/c;->f:J

    .line 64
    .line 65
    iput-wide v2, v1, Landroidx/work/c;->g:J

    .line 66
    .line 67
    new-instance v0, Landroidx/emoji2/text/t;

    .line 68
    .line 69
    const-class v2, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;

    .line 70
    .line 71
    invoke-direct {v0, v2}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, v0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lt1/i;

    .line 77
    .line 78
    iput-object v1, v2, Lt1/i;->j:Landroidx/work/c;

    .line 79
    .line 80
    iget-object v1, v0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ljava/util/HashSet;

    .line 83
    .line 84
    const-string v2, "offline_ping_sender_work"

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/emoji2/text/t;->e()Landroidx/work/o;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p1, v0}, Lz2/b;->f(Landroidx/work/o;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catch_0
    move-exception p1

    .line 98
    const-string v0, "Failed to instantiate WorkManager."

    .line 99
    .line 100
    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final zzg(La3/a;Lcom/google/android/gms/ads/internal/offline/buffering/zza;)Z
    .locals 7

    .line 1
    invoke-static {p1}, La3/b;->b(La3/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzb(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroidx/work/e;

    .line 11
    .line 12
    invoke-direct {v0}, Landroidx/work/e;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroidx/work/c;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    iput v2, v1, Landroidx/work/c;->a:I

    .line 22
    .line 23
    const-wide/16 v3, -0x1

    .line 24
    .line 25
    iput-wide v3, v1, Landroidx/work/c;->f:J

    .line 26
    .line 27
    iput-wide v3, v1, Landroidx/work/c;->g:J

    .line 28
    .line 29
    new-instance v5, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    iput-boolean v5, v1, Landroidx/work/c;->b:Z

    .line 36
    .line 37
    iput-boolean v5, v1, Landroidx/work/c;->c:Z

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    iput v6, v1, Landroidx/work/c;->a:I

    .line 41
    .line 42
    iput-boolean v5, v1, Landroidx/work/c;->d:Z

    .line 43
    .line 44
    iput-boolean v5, v1, Landroidx/work/c;->e:Z

    .line 45
    .line 46
    iput-object v0, v1, Landroidx/work/c;->h:Landroidx/work/e;

    .line 47
    .line 48
    iput-wide v3, v1, Landroidx/work/c;->f:J

    .line 49
    .line 50
    iput-wide v3, v1, Landroidx/work/c;->g:J

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "uri"

    .line 58
    .line 59
    iget-object v4, p2, Lcom/google/android/gms/ads/internal/offline/buffering/zza;->zza:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    const-string v3, "gws_query_id"

    .line 65
    .line 66
    iget-object v4, p2, Lcom/google/android/gms/ads/internal/offline/buffering/zza;->zzb:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    const-string v3, "image_url"

    .line 72
    .line 73
    iget-object p2, p2, Lcom/google/android/gms/ads/internal/offline/buffering/zza;->zzc:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    new-instance p2, Landroidx/work/g;

    .line 79
    .line 80
    invoke-direct {p2, v0}, Landroidx/work/g;-><init>(Ljava/util/HashMap;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p2}, Landroidx/work/g;->c(Landroidx/work/g;)[B

    .line 84
    .line 85
    .line 86
    new-instance v0, Landroidx/emoji2/text/t;

    .line 87
    .line 88
    const-class v3, Lcom/google/android/gms/ads/internal/offline/buffering/OfflineNotificationPoster;

    .line 89
    .line 90
    invoke-direct {v0, v3}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Class;)V

    .line 91
    .line 92
    .line 93
    iget-object v3, v0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Lt1/i;

    .line 96
    .line 97
    iput-object v1, v3, Lt1/i;->j:Landroidx/work/c;

    .line 98
    .line 99
    iput-object p2, v3, Lt1/i;->e:Landroidx/work/g;

    .line 100
    .line 101
    iget-object p2, v0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p2, Ljava/util/HashSet;

    .line 104
    .line 105
    const-string v1, "offline_notification_work"

    .line 106
    .line 107
    invoke-virtual {p2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroidx/emoji2/text/t;->e()Landroidx/work/o;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    :try_start_0
    invoke-static {p1}, Ll1/k;->Q(Landroid/content/Context;)Ll1/k;

    .line 115
    .line 116
    .line 117
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    invoke-virtual {p1, p2}, Lz2/b;->f(Landroidx/work/o;)V

    .line 119
    .line 120
    .line 121
    return v2

    .line 122
    :catch_0
    move-exception p1

    .line 123
    const-string p2, "Failed to instantiate WorkManager."

    .line 124
    .line 125
    invoke-static {p2, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    return v5
.end method
