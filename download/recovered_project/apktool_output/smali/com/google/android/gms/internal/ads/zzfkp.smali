.class public final Lcom/google/android/gms/internal/ads/zzfkp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static zza:Lh3/g;

.field public static zzb:Lq2/a;

.field private static final zzc:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfkp;->zzc:Ljava/lang/Object;

    return-void
.end method

.method public static zza(Landroid/content/Context;Z)V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfkp;->zzc:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "Failed to get app set ID info: "

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfkp;->zzb:Lq2/a;

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Lcom/google/android/gms/internal/appset/zzr;

    .line 11
    .line 12
    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/appset/zzr;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sput-object v2, Lcom/google/android/gms/internal/ads/zzfkp;->zzb:Lq2/a;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_3

    .line 20
    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    check-cast p0, Lh3/n;

    .line 25
    .line 26
    iget-object v2, p0, Lh3/n;->a:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :try_start_1
    iget-boolean p0, p0, Lh3/n;->c:Z

    .line 30
    .line 31
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    :try_start_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;

    .line 35
    .line 36
    invoke-virtual {p0}, Lh3/g;->c()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    :cond_1
    if-eqz p1, :cond_3

    .line 43
    .line 44
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;

    .line 45
    .line 46
    check-cast p0, Lh3/n;

    .line 47
    .line 48
    iget-object p1, p0, Lh3/n;->a:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    :try_start_3
    iget-boolean p0, p0, Lh3/n;->c:Z

    .line 52
    .line 53
    monitor-exit p1

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-exception p0

    .line 58
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 60
    :catchall_2
    move-exception p0

    .line 61
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 62
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 63
    :cond_2
    :goto_1
    :try_start_7
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zzb:Lq2/a;

    .line 64
    .line 65
    const-string p1, "the appSetIdClient shouldn\'t be null"

    .line 66
    .line 67
    invoke-static {p0, p1}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0}, Lq2/a;->getAppSetIdInfo()Lh3/g;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sput-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :catch_0
    move-exception p0

    .line 78
    :try_start_8
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    add-int/lit8 v2, v2, 0x1f

    .line 91
    .line 92
    new-instance v3, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lh3/n;

    .line 111
    .line 112
    invoke-direct {p1}, Lh3/n;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p0}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 116
    .line 117
    .line 118
    sput-object p1, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;

    .line 119
    .line 120
    :cond_3
    :goto_2
    monitor-exit v0

    .line 121
    return-void

    .line 122
    :goto_3
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 123
    throw p0
.end method

.method public static zzb(Landroid/content/Context;)Lh3/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzfkp;->zza(Landroid/content/Context;Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfkp;->zzc:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfkp;->zza:Lh3/g;

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v0
.end method
