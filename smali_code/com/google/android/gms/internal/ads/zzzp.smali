.class final Lcom/google/android/gms/internal/ads/zzzp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/media/Spatializer;

.field private final zzb:Z

.field private final zzc:Landroid/os/Handler;

.field private final zzd:Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaaa;Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    const/4 v1, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_3

    .line 23
    .line 24
    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/d;->b(Landroid/media/AudioManager;)Landroid/media/Spatializer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/d;->a(Landroid/media/Spatializer;)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    :cond_2
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzb:Z

    .line 38
    .line 39
    new-instance p3, Lcom/google/android/gms/internal/ads/zzzn;

    .line 40
    .line 41
    invoke-direct {p3, p0, p2}, Lcom/google/android/gms/internal/ads/zzzn;-><init>(Lcom/google/android/gms/internal/ads/zzzp;Lcom/google/android/gms/internal/ads/zzaaa;)V

    .line 42
    .line 43
    .line 44
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzd:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 45
    .line 46
    new-instance p2, Landroid/os/Handler;

    .line 47
    .line 48
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzc:Landroid/os/Handler;

    .line 59
    .line 60
    new-instance v0, Lcom/google/android/gms/internal/ads/zzzo;

    .line 61
    .line 62
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzzo;-><init>(Landroid/os/Handler;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0, p3}, Lcom/google/android/gms/internal/ads/d;->g(Landroid/media/Spatializer;Ljava/util/concurrent/Executor;Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 70
    .line 71
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzb:Z

    .line 72
    .line 73
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzc:Landroid/os/Handler;

    .line 74
    .line 75
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzd:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzb:Z

    return v0
.end method

.method public final zzb()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d;->h(Landroid/media/Spatializer;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final zzc()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/d;->l(Landroid/media/Spatializer;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzd;Lcom/google/android/gms/internal/ads/zzv;)Z
    .locals 4

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    if-ne v0, v1, :cond_4

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v1, "audio/iamf"

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 30
    .line 31
    if-ne v0, v2, :cond_4

    .line 32
    .line 33
    const/4 v0, 0x6

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v1, "audio/ac4"

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 44
    .line 45
    const/16 v1, 0x12

    .line 46
    .line 47
    const/16 v3, 0x18

    .line 48
    .line 49
    if-eq v0, v1, :cond_2

    .line 50
    .line 51
    const/16 v1, 0x15

    .line 52
    .line 53
    if-ne v0, v1, :cond_4

    .line 54
    .line 55
    :cond_2
    move v0, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 58
    .line 59
    :cond_4
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfj;->zzB(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    return p1

    .line 67
    :cond_5
    new-instance v1, Landroid/media/AudioFormat$Builder;

    .line 68
    .line 69
    invoke-direct {v1}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    invoke-virtual {v1, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, v0}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 82
    .line 83
    if-eq p2, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, p2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 86
    .line 87
    .line 88
    :cond_6
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/d;->c(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {p2, p1, v0}, Lcom/google/android/gms/internal/ads/d;->i(Landroid/media/Spatializer;Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1
.end method

.method public final zze()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzzp;->zza:Landroid/media/Spatializer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzd:Landroid/media/Spatializer$OnSpatializerStateChangedListener;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzzp;->zzc:Landroid/os/Handler;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/d;->f(Landroid/media/Spatializer;Landroid/media/Spatializer$OnSpatializerStateChangedListener;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method
