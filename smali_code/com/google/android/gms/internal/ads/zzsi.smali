.class public final Lcom/google/android/gms/internal/ads/zzsi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzqm;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzsh;

.field private zzc:Lcom/google/android/gms/internal/ads/zzed;

.field private zzd:Lcom/google/android/gms/internal/ads/zzdn;

.field private zze:Lcom/google/android/gms/internal/ads/zzps;

.field private zzf:Lcom/google/android/gms/internal/ads/zzpx;

.field private zzg:Landroid/os/Looper;

.field private zzh:Landroid/content/Context;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzsm;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzsg;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzsg;->zzd()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzsg;->zzg()Lcom/google/android/gms/internal/ads/zzsm;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:Lcom/google/android/gms/internal/ads/zzsm;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzsg;->zze()Lcom/google/android/gms/internal/ads/zzps;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzsg;->zzd()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p2, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzsh;

    .line 34
    .line 35
    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzsh;-><init>(Lcom/google/android/gms/internal/ads/zzsi;[B)V

    .line 36
    .line 37
    .line 38
    move-object p2, p1

    .line 39
    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzb:Lcom/google/android/gms/internal/ads/zzsh;

    .line 40
    .line 41
    sget-object p1, Lcom/google/android/gms/internal/ads/zzdn;->zza:Lcom/google/android/gms/internal/ads/zzdn;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:Lcom/google/android/gms/internal/ads/zzdn;

    .line 44
    .line 45
    return-void
.end method

.method private final zzj(Lcom/google/android/gms/internal/ads/zzqf;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsi;->zzk()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:Lcom/google/android/gms/internal/ads/zzpx;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Landroid/content/Context;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzpx;

    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzsf;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzsf;-><init>(Lcom/google/android/gms/internal/ads/zzsi;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzc:Landroid/media/AudioDeviceInfo;

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzpx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpw;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:Lcom/google/android/gms/internal/ads/zzpx;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpx;->zzd()Lcom/google/android/gms/internal/ads/zzps;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzc:Landroid/media/AudioDeviceInfo;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzpx;->zzc(Landroid/media/AudioDeviceInfo;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:Lcom/google/android/gms/internal/ads/zzpx;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzpx;->zzb(Lcom/google/android/gms/internal/ads/zzd;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final zzk()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzg:Landroid/os/Looper;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    if-ne v1, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 v2, 0x0

    .line 19
    :cond_2
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzsi;->zzl(Landroid/os/Looper;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsi;->zzl(Landroid/os/Looper;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzg:Landroid/os/Looper;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s"

    .line 39
    .line 40
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzgrt;->zzd(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method private static zzl(Landroid/os/Looper;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzqf;)Lcom/google/android/gms/internal/ads/zzqh;
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzsi;->zzj(Lcom/google/android/gms/internal/ads/zzqf;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:Lcom/google/android/gms/internal/ads/zzsm;

    .line 5
    .line 6
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzsm;->zza(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Lcom/google/android/gms/internal/ads/zzpz;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzqg;

    .line 15
    .line 16
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzqg;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "audio/raw"

    .line 22
    .line 23
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x2

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget p1, v1, Lcom/google/android/gms/internal/ads/zzv;->zzI:I

    .line 32
    .line 33
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzA(I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x16

    .line 50
    .line 51
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 52
    .line 53
    .line 54
    const-string v1, "Invalid PCM encoding: "

    .line 55
    .line 56
    const-string v5, "ATAudioOutputProvider"

    .line 57
    .line 58
    invoke-static {v3, v1, p1, v5}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    if-eq p1, v5, :cond_1

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    :goto_0
    move v4, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 69
    .line 70
    invoke-virtual {v3, v1, p1}, Lcom/google/android/gms/internal/ads/zzps;->zzd(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    :goto_1
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzqg;->zzd(I)Lcom/google/android/gms/internal/ads/zzqg;

    .line 78
    .line 79
    .line 80
    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zzpz;->zzb:Z

    .line 81
    .line 82
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzqg;->zza(Z)Lcom/google/android/gms/internal/ads/zzqg;

    .line 83
    .line 84
    .line 85
    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zzpz;->zzc:Z

    .line 86
    .line 87
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzqg;->zzb(Z)Lcom/google/android/gms/internal/ads/zzqg;

    .line 88
    .line 89
    .line 90
    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zzpz;->zzd:Z

    .line 91
    .line 92
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzqg;->zzc(Z)Lcom/google/android/gms/internal/ads/zzqg;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzqg;->zze()Lcom/google/android/gms/internal/ads/zzqh;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzqf;)Lcom/google/android/gms/internal/ads/zzql;
    .locals 14

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzsi;->zzj(Lcom/google/android/gms/internal/ads/zzqf;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzqf;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "audio/raw"

    .line 9
    .line 10
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, -0x1

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzv;->zzI:I

    .line 19
    .line 20
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzA(I)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 25
    .line 26
    .line 27
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 28
    .line 29
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 30
    .line 31
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzfj;->zzB(I)I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfj;->zzD(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    mul-int/2addr v8, v6

    .line 40
    move v9, v2

    .line 41
    move v10, v3

    .line 42
    :goto_0
    move v12, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 45
    .line 46
    sget-object v2, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 49
    .line 50
    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    .line 51
    .line 52
    invoke-virtual {v2, v0, v6}, Lcom/google/android/gms/internal/ads/zzps;->zzd(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Landroid/util/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    iget-object v6, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    const/4 v2, 0x2

    .line 75
    move v10, v2

    .line 76
    move v8, v4

    .line 77
    move v9, v6

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzj:I

    .line 80
    .line 81
    const-string v2, "audio/vnd.dts.hd;profile=lbr"

    .line 82
    .line 83
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    if-ne v0, v4, :cond_1

    .line 90
    .line 91
    const v0, 0xbb800

    .line 92
    .line 93
    .line 94
    :cond_1
    move v13, v0

    .line 95
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzf:I

    .line 96
    .line 97
    if-eq v0, v4, :cond_2

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_2
    move v0, v8

    .line 101
    invoke-static {v12, v7, v9}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    const/4 v1, -0x2

    .line 106
    const/4 v2, 0x1

    .line 107
    if-eq v8, v1, :cond_3

    .line 108
    .line 109
    move v1, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move v1, v3

    .line 112
    :goto_2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 113
    .line 114
    .line 115
    if-ne v0, v4, :cond_4

    .line 116
    .line 117
    move v11, v2

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move v11, v0

    .line 120
    :goto_3
    invoke-static/range {v8 .. v13}, Lcom/google/android/gms/internal/ads/zzsy;->zzb(IIIIII)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    move v2, v11

    .line 125
    int-to-double v0, v0

    .line 126
    double-to-int v0, v0

    .line 127
    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    add-int/2addr v0, v2

    .line 132
    add-int/2addr v0, v4

    .line 133
    div-int/2addr v0, v2

    .line 134
    mul-int/2addr v0, v2

    .line 135
    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/ads/zzqk;

    .line 136
    .line 137
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzqk;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/zzqk;->zzb(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzqk;->zzc(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzqk;->zza(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzqk;->zze(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 150
    .line 151
    .line 152
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzd:I

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzqk;->zzg(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 155
    .line 156
    .line 157
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzqf;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzqk;->zzf(Lcom/google/android/gms/internal/ads/zzd;)Lcom/google/android/gms/internal/ads/zzqk;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzqk;->zzd(Z)Lcom/google/android/gms/internal/ads/zzqk;

    .line 163
    .line 164
    .line 165
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzqf;->zze:I

    .line 166
    .line 167
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzh(I)Lcom/google/android/gms/internal/ads/zzqk;

    .line 168
    .line 169
    .line 170
    new-instance p1, Lcom/google/android/gms/internal/ads/zzql;

    .line 171
    .line 172
    const/4 v0, 0x0

    .line 173
    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzql;-><init>(Lcom/google/android/gms/internal/ads/zzqk;[B)V

    .line 174
    .line 175
    .line 176
    return-object p1

    .line 177
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzqd;

    .line 178
    .line 179
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-string v1, "Unable to configure passthrough for: "

    .line 184
    .line 185
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzqd;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzqj;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsi;->zzk()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzed;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/ads/zzed;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzed;-><init>(Ljava/lang/Thread;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzed;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzed;->zzg(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzed;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzed;->zzb(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzdn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:Lcom/google/android/gms/internal/ads/zzdn;

    return-void
.end method

.method public final zze()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzed;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzed;->zzf()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:Lcom/google/android/gms/internal/ads/zzpx;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpx;->zze()V

    .line 13
    .line 14
    .line 15
    :cond_1
    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzql;)Lcom/google/android/gms/internal/ads/zzsd;
    .locals 6

    .line 1
    :try_start_0
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzql;->zzg:I

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzql;->zzh:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/16 v3, 0x22

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-eq v1, v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Landroid/content/Context;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    if-lt v5, v3, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:Landroid/content/Context;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/a;->b(Landroid/content/Context;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :catch_1
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/a;->n(Landroid/content/Context;I)Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:Landroid/content/Context;

    .line 39
    .line 40
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:Landroid/content/Context;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :cond_2
    new-instance v1, Landroid/media/AudioFormat$Builder;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 46
    .line 47
    .line 48
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzql;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v5, Landroid/media/AudioTrack$Builder;

    .line 77
    .line 78
    invoke-direct {v5}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2, v1}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v2, 0x1

    .line 90
    invoke-virtual {v1, v2}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget v5, p1, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 95
    .line 96
    invoke-virtual {v1, v5}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 105
    .line 106
    const/16 v5, 0x1d

    .line 107
    .line 108
    if-lt v1, v5, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, Landroidx/lifecycle/g0;->n(Landroid/media/AudioTrack$Builder;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    if-lt v1, v3, :cond_4

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/ads/a;->w(Landroid/media/AudioTrack$Builder;Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-virtual {v0}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-ne v1, v2, :cond_5

    .line 129
    .line 130
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzb:Lcom/google/android/gms/internal/ads/zzsh;

    .line 131
    .line 132
    new-instance v2, Lcom/google/android/gms/internal/ads/zzsd;

    .line 133
    .line 134
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:Lcom/google/android/gms/internal/ads/zzdn;

    .line 135
    .line 136
    invoke-direct {v2, v0, p1, v1, v3}, Lcom/google/android/gms/internal/ads/zzsd;-><init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzql;Lcom/google/android/gms/internal/ads/zzsh;Lcom/google/android/gms/internal/ads/zzdn;)V

    .line 137
    .line 138
    .line 139
    return-object v2

    .line 140
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 141
    .line 142
    .line 143
    :catch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzqi;

    .line 144
    .line 145
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzqi;-><init>()V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzqi;

    .line 150
    .line 151
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzqi;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw v0
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzps;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzsi;->zzk()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzps;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzed;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    sget-object v1, Lcom/google/android/gms/internal/ads/zzse;->zza:Lcom/google/android/gms/internal/ads/zzse;

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzed;->zzd(ILcom/google/android/gms/internal/ads/zzdy;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzed;->zze()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final synthetic zzh(Lcom/google/android/gms/internal/ads/zzps;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:Lcom/google/android/gms/internal/ads/zzps;

    return-void
.end method

.method public final synthetic zzi()Lcom/google/android/gms/internal/ads/zzpx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:Lcom/google/android/gms/internal/ads/zzpx;

    return-object v0
.end method
