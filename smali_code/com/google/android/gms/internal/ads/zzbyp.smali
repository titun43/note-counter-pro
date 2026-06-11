.class public final Lcom/google/android/gms/internal/ads/zzbyp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbyr;


# static fields
.field public static zza:Lcom/google/android/gms/internal/ads/zzbyr;

.field static zzb:Lcom/google/android/gms/internal/ads/zzbyr;

.field static zzc:Lcom/google/android/gms/internal/ads/zzbyr;

.field static zzd:Ljava/lang/Boolean;

.field private static final zze:Ljava/lang/Object;


# instance fields
.field private final zzf:Ljava/lang/Object;

.field private final zzg:Landroid/content/Context;

.field private final zzh:Ljava/util/WeakHashMap;

.field private final zzi:Ljava/util/concurrent/ExecutorService;

.field private final zzj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzk:Landroid/content/pm/PackageInfo;

.field private final zzl:Ljava/lang/String;

.field private final zzm:Ljava/lang/String;

.field private final zzn:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private zzo:Z

.field private zzp:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzf:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzh:Ljava/util/WeakHashMap;

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfym;->zza()Lcom/google/android/gms/internal/ads/zzfyk;

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzi:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzn:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zziZ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    move-result-object p2

    .line 8
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 9
    sget-object p2, Lcom/google/android/gms/ads/internal/util/client/zzf;->zza:Landroid/os/Handler;

    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    if-nez p2, :cond_2

    :catch_0
    :cond_1
    move-object p1, v0

    goto :goto_0

    .line 11
    :cond_2
    :try_start_0
    invoke-static {p1}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    move-result-object p2

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p2, v1, p1}, Lf2/k;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzk:Landroid/content/pm/PackageInfo;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zziN:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 14
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    move-result-object p2

    .line 15
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v1, "unknown"

    if-eqz p2, :cond_3

    sget-object p2, Lcom/google/android/gms/ads/internal/util/client/zzf;->zza:Landroid/os/Handler;

    .line 16
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v1

    :goto_1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzl:Ljava/lang/String;

    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 19
    sget-object p2, Lcom/google/android/gms/ads/internal/util/client/zzf;->zza:Landroid/os/Handler;

    if-nez p1, :cond_4

    goto :goto_2

    .line 20
    :cond_4
    :try_start_1
    invoke-static {p1}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    move-result-object p1

    const-string p2, "com.android.vending"

    const/16 v1, 0x80

    .line 21
    invoke-virtual {p1, v1, p2}, Lf2/k;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_2

    .line 22
    :cond_5
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :cond_6
    move-object v0, v1

    .line 23
    :catch_1
    :goto_2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzm:Ljava/lang/String;

    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zziJ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 24
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    move-result-object p1

    .line 25
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_7

    new-instance p1, Ljava/util/HashSet;

    .line 26
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzp:Ljava/util/Set;

    :cond_7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Z)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzo:Z

    return-void
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbyr;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbyp;->zzj(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->forPackage()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbyq;

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbyq;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 34
    .line 35
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zza:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 37
    .line 38
    return-object p0

    .line 39
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p0
.end method

.method public static zzb(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ads/zzbyr;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzc:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 5
    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbiw;->zzc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbiw;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    :cond_0
    move v2, v3

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbyp;->zzj(Landroid/content/Context;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 67
    .line 68
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzl()V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzk()V

    .line 75
    .line 76
    .line 77
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzc:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    if-eqz v2, :cond_3

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 85
    .line 86
    invoke-direct {v1, p0, p1, v3}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Z)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzl()V

    .line 90
    .line 91
    .line 92
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzk()V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzc:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbyq;

    .line 99
    .line 100
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbyq;-><init>()V

    .line 101
    .line 102
    .line 103
    sput-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzc:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 104
    .line 105
    :cond_4
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzc:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 107
    .line 108
    return-object p0

    .line 109
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw p0
.end method

.method public static zzc(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbyr;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziI:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 47
    .line 48
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->forPackage()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    .line 53
    .line 54
    .line 55
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbyq;

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbyq;-><init>()V

    .line 63
    .line 64
    .line 65
    sput-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 66
    .line 67
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 69
    .line 70
    return-object p0

    .line 71
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p0
.end method

.method public static zzd(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/ads/zzbyr;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziI:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 45
    .line 46
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzbyp;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbyq;

    .line 55
    .line 56
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbyq;-><init>()V

    .line 57
    .line 58
    .line 59
    sput-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 60
    .line 61
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzb:Lcom/google/android/gms/internal/ads/zzbyr;

    .line 63
    .line 64
    return-object p0

    .line 65
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p0
.end method

.method public static zze(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/PrintWriter;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static zzf(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbyp;->zze(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzg(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgrt;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static zzj(Landroid/content/Context;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zze:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzd:Ljava/lang/Boolean;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zzh()Ljava/util/Random;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v3, 0x64

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/util/Random;->nextInt(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zzoh:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 23
    .line 24
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-ge v1, v3, :cond_0

    .line 39
    .line 40
    move v1, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v1, v0

    .line 43
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sput-object v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzd:Ljava/lang/Boolean;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzd:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbhe;->zziH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 62
    .line 63
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_2

    .line 78
    .line 79
    return v2

    .line 80
    :cond_2
    return v0

    .line 81
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw v0

    .line 83
    :cond_3
    return v0
.end method

.method private final zzk()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbym;

    .line 6
    .line 7
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzbym;-><init>(Lcom/google/android/gms/internal/ads/zzbyp;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final zzl()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzf:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzh:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbyn;

    .line 28
    .line 29
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzbyn;-><init>(Lcom/google/android/gms/internal/ads/zzbyp;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method


# virtual methods
.method public final zzg(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    move v1, p1

    .line 5
    move v2, v1

    .line 6
    move-object v0, p2

    .line 7
    :goto_0
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    array-length v4, v3

    .line 14
    move v5, p1

    .line 15
    :goto_1
    if-ge v5, v4, :cond_0

    .line 16
    .line 17
    aget-object v6, v3, v5

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-static {v7}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzo(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    or-int/2addr v1, v7

    .line 28
    const-class v7, Lcom/google/android/gms/internal/ads/zzbyp;

    .line 29
    .line 30
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    or-int/2addr v2, v6

    .line 43
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zziJ:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 52
    .line 53
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-lez p1, :cond_3

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzp:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-lt v0, p1, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzbyp;->zzf(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzp:Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzp:Ljava/util/Set;

    .line 91
    .line 92
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz v1, :cond_5

    .line 96
    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzo:Z

    .line 100
    .line 101
    if-nez p1, :cond_4

    .line 102
    .line 103
    const-string p1, ""

    .line 104
    .line 105
    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzn:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 109
    .line 110
    const/4 p2, 0x1

    .line 111
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_5

    .line 116
    .line 117
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbiw;->zzc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 132
    .line 133
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbgp;->zzb(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_2
    return-void
.end method

.method public final zzh(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbyp;->zzo:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzbyp;->zzi(Ljava/lang/Throwable;Ljava/lang/String;F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzi(Ljava/lang/Throwable;Ljava/lang/String;F)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzo:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_12

    .line 10
    .line 11
    :cond_0
    sget-object v2, Lcom/google/android/gms/ads/internal/util/client/zzf;->zza:Landroid/os/Handler;

    .line 12
    .line 13
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbjn;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    move-object/from16 v6, p1

    .line 30
    .line 31
    goto/16 :goto_9

    .line 32
    .line 33
    :cond_1
    new-instance v2, Ljava/util/LinkedList;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 36
    .line 37
    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    :goto_0
    if-eqz v6, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v6}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v6, 0x0

    .line 51
    :cond_3
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_b

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Ljava/lang/Throwable;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbhe;->zzcW:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 68
    .line 69
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-virtual {v10, v9}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-eqz v9, :cond_4

    .line 84
    .line 85
    if-eqz v8, :cond_4

    .line 86
    .line 87
    array-length v9, v8

    .line 88
    if-nez v9, :cond_4

    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-static {v9}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzo(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_4

    .line 103
    .line 104
    move v9, v5

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move v9, v4

    .line 107
    :goto_2
    new-instance v10, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v11, Ljava/lang/StackTraceElement;

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v12

    .line 118
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    const-string v13, "<filtered>"

    .line 123
    .line 124
    invoke-direct {v11, v12, v13, v13, v5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    array-length v11, v8

    .line 131
    move v12, v4

    .line 132
    :goto_3
    if-ge v12, v11, :cond_9

    .line 133
    .line 134
    aget-object v14, v8, v12

    .line 135
    .line 136
    invoke-virtual {v14}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    invoke-static {v15}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzo(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    if-eqz v15, :cond_5

    .line 145
    .line 146
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move v9, v5

    .line 150
    goto :goto_6

    .line 151
    :cond_5
    invoke-virtual {v14}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v16

    .line 159
    if-eqz v16, :cond_6

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    const-string v3, "android."

    .line 163
    .line 164
    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_8

    .line 169
    .line 170
    const-string v3, "java."

    .line 171
    .line 172
    invoke-virtual {v15, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_7

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_7
    :goto_4
    new-instance v3, Ljava/lang/StackTraceElement;

    .line 180
    .line 181
    invoke-direct {v3, v13, v13, v13, v5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_8
    :goto_5
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_9
    if-eqz v9, :cond_3

    .line 195
    .line 196
    if-nez v6, :cond_a

    .line 197
    .line 198
    new-instance v3, Ljava/lang/Throwable;

    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-direct {v3, v6}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :goto_7
    move-object v6, v3

    .line 208
    goto :goto_8

    .line 209
    :cond_a
    new-instance v3, Ljava/lang/Throwable;

    .line 210
    .line 211
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-direct {v3, v7, v6}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :goto_8
    new-array v3, v4, [Ljava/lang/StackTraceElement;

    .line 220
    .line 221
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, [Ljava/lang/StackTraceElement;

    .line 226
    .line 227
    invoke-virtual {v6, v3}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :cond_b
    :goto_9
    if-eqz v6, :cond_19

    .line 233
    .line 234
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbyp;->zze(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbhe;->zzkf:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 247
    .line 248
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    check-cast v6, Ljava/lang/Boolean;

    .line 257
    .line 258
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_c

    .line 263
    .line 264
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbyp;->zzf(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    goto :goto_a

    .line 269
    :cond_c
    const-string v6, ""

    .line 270
    .line 271
    :goto_a
    float-to-double v7, v0

    .line 272
    const/4 v9, 0x0

    .line 273
    cmpl-float v9, v0, v9

    .line 274
    .line 275
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 276
    .line 277
    .line 278
    move-result-wide v10

    .line 279
    if-lez v9, :cond_d

    .line 280
    .line 281
    const/high16 v9, 0x3f800000    # 1.0f

    .line 282
    .line 283
    div-float/2addr v9, v0

    .line 284
    float-to-int v0, v9

    .line 285
    move v9, v0

    .line 286
    goto :goto_b

    .line 287
    :cond_d
    move v9, v5

    .line 288
    :goto_b
    cmpg-double v0, v10, v7

    .line 289
    .line 290
    if-gez v0, :cond_19

    .line 291
    .line 292
    new-instance v7, Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 295
    .line 296
    .line 297
    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 298
    .line 299
    invoke-static {v0}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v0}, Lf2/k;->d()Z

    .line 304
    .line 305
    .line 306
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    goto :goto_c

    .line 308
    :catchall_0
    move-exception v0

    .line 309
    const-string v8, "Error fetching instant app info"

    .line 310
    .line 311
    invoke-static {v8, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move v0, v4

    .line 315
    :goto_c
    :try_start_1
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 316
    .line 317
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 321
    goto :goto_d

    .line 322
    :catchall_1
    const-string v8, "Cannot obtain package name, proceeding."

    .line 323
    .line 324
    invoke-static {v8}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v8, "unknown"

    .line 328
    .line 329
    :goto_d
    new-instance v10, Landroid/net/Uri$Builder;

    .line 330
    .line 331
    invoke-direct {v10}, Landroid/net/Uri$Builder;-><init>()V

    .line 332
    .line 333
    .line 334
    const-string v11, "https"

    .line 335
    .line 336
    invoke-virtual {v10, v11}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    const-string v11, "//pagead2.googlesyndication.com/pagead/gen_204"

    .line 341
    .line 342
    invoke-virtual {v10, v11}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 343
    .line 344
    .line 345
    move-result-object v10

    .line 346
    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    const-string v11, "is_aia"

    .line 351
    .line 352
    invoke-virtual {v10, v11, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const-string v10, "id"

    .line 357
    .line 358
    const-string v11, "gmob-apps-report-exception"

    .line 359
    .line 360
    invoke-virtual {v0, v10, v11}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v10, "os"

    .line 365
    .line 366
    sget-object v11, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v0, v10, v11}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 373
    .line 374
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v11

    .line 378
    const-string v12, "api"

    .line 379
    .line 380
    invoke-virtual {v0, v12, v11}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 385
    .line 386
    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    if-eqz v13, :cond_e

    .line 393
    .line 394
    goto :goto_e

    .line 395
    :cond_e
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    add-int/2addr v13, v5

    .line 404
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 405
    .line 406
    .line 407
    move-result v14

    .line 408
    new-instance v15, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    add-int/2addr v13, v14

    .line 411
    invoke-direct {v15, v13}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 412
    .line 413
    .line 414
    const-string v13, " "

    .line 415
    .line 416
    invoke-static {v15, v11, v13, v12}, Landroidx/fragment/app/h1;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    :goto_e
    const-string v11, "device"

    .line 421
    .line 422
    invoke-virtual {v0, v11, v12}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzj:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 427
    .line 428
    const-string v12, "js"

    .line 429
    .line 430
    iget-object v13, v11, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v0, v12, v13}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const-string v12, "appid"

    .line 437
    .line 438
    invoke-virtual {v0, v12, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    const-string v8, "exceptiontype"

    .line 443
    .line 444
    invoke-virtual {v0, v8, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    const-string v2, "stacktrace"

    .line 449
    .line 450
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzb()Lcom/google/android/gms/internal/ads/zzbgw;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbgw;->zze()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const-string v3, ","

    .line 463
    .line 464
    invoke-static {v3, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const-string v3, "eids"

    .line 469
    .line 470
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    const-string v2, "exceptionkey"

    .line 475
    .line 476
    move-object/from16 v3, p2

    .line 477
    .line 478
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    const-string v2, "cl"

    .line 483
    .line 484
    const-string v3, "839961582"

    .line 485
    .line 486
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    const-string v2, "rc"

    .line 491
    .line 492
    const-string v3, "dev"

    .line 493
    .line 494
    invoke-virtual {v0, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const-string v3, "sampling_rate"

    .line 503
    .line 504
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbjn;->zzc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 509
    .line 510
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    const-string v3, "pb_tm"

    .line 519
    .line 520
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 525
    .line 526
    sget-object v3, Lt2/f;->b:Lt2/f;

    .line 527
    .line 528
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-static {v2}, Lt2/f;->a(Landroid/content/Context;)I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    const-string v8, "gmscv"

    .line 540
    .line 541
    invoke-virtual {v0, v8, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iget-boolean v3, v11, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->isLiteSdk:Z

    .line 546
    .line 547
    const-string v8, "1"

    .line 548
    .line 549
    const-string v9, "0"

    .line 550
    .line 551
    if-eq v5, v3, :cond_f

    .line 552
    .line 553
    move-object v3, v9

    .line 554
    goto :goto_f

    .line 555
    :cond_f
    move-object v3, v8

    .line 556
    :goto_f
    const-string v11, "lite"

    .line 557
    .line 558
    invoke-virtual {v0, v11, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    if-nez v3, :cond_10

    .line 567
    .line 568
    const-string v3, "hash"

    .line 569
    .line 570
    invoke-virtual {v0, v3, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 571
    .line 572
    .line 573
    :cond_10
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zziO:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 574
    .line 575
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    check-cast v3, Ljava/lang/Boolean;

    .line 584
    .line 585
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-eqz v3, :cond_12

    .line 590
    .line 591
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zze(Landroid/content/Context;)Landroid/app/ActivityManager$MemoryInfo;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    if-eqz v3, :cond_12

    .line 596
    .line 597
    iget-wide v11, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 598
    .line 599
    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    const-string v11, "available_memory"

    .line 604
    .line 605
    invoke-virtual {v0, v11, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 606
    .line 607
    .line 608
    iget-wide v11, v3, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 609
    .line 610
    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v6

    .line 614
    const-string v11, "total_memory"

    .line 615
    .line 616
    invoke-virtual {v0, v11, v6}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 617
    .line 618
    .line 619
    iget-boolean v3, v3, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    .line 620
    .line 621
    if-eq v5, v3, :cond_11

    .line 622
    .line 623
    move-object v8, v9

    .line 624
    :cond_11
    const-string v3, "is_low_memory"

    .line 625
    .line 626
    invoke-virtual {v0, v3, v8}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 627
    .line 628
    .line 629
    :cond_12
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbhe;->zziN:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 630
    .line 631
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    check-cast v3, Ljava/lang/Boolean;

    .line 640
    .line 641
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    if-eqz v3, :cond_17

    .line 646
    .line 647
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzl:Ljava/lang/String;

    .line 648
    .line 649
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 650
    .line 651
    .line 652
    move-result v5

    .line 653
    if-nez v5, :cond_13

    .line 654
    .line 655
    const-string v5, "countrycode"

    .line 656
    .line 657
    invoke-virtual {v0, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 658
    .line 659
    .line 660
    :cond_13
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzm:Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 663
    .line 664
    .line 665
    move-result v5

    .line 666
    if-nez v5, :cond_14

    .line 667
    .line 668
    const-string v5, "psv"

    .line 669
    .line 670
    invoke-virtual {v0, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 671
    .line 672
    .line 673
    :cond_14
    const/16 v3, 0x1a

    .line 674
    .line 675
    if-lt v10, v3, :cond_15

    .line 676
    .line 677
    invoke-static {}, Lg0/b;->d()Landroid/content/pm/PackageInfo;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    goto :goto_10

    .line 682
    :cond_15
    if-nez v2, :cond_16

    .line 683
    .line 684
    :catch_0
    const/4 v2, 0x0

    .line 685
    goto :goto_10

    .line 686
    :cond_16
    :try_start_2
    invoke-static {v2}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    const-string v3, "com.android.webview"

    .line 691
    .line 692
    const/16 v5, 0x80

    .line 693
    .line 694
    invoke-virtual {v2, v5, v3}, Lf2/k;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 695
    .line 696
    .line 697
    move-result-object v2
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 698
    :goto_10
    if-eqz v2, :cond_17

    .line 699
    .line 700
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 701
    .line 702
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    const-string v5, "wvvc"

    .line 707
    .line 708
    invoke-virtual {v0, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 709
    .line 710
    .line 711
    const-string v3, "wvvn"

    .line 712
    .line 713
    iget-object v5, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 714
    .line 715
    invoke-virtual {v0, v3, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 716
    .line 717
    .line 718
    const-string v3, "wvpn"

    .line 719
    .line 720
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 721
    .line 722
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 723
    .line 724
    .line 725
    :cond_17
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzk:Landroid/content/pm/PackageInfo;

    .line 726
    .line 727
    if-eqz v2, :cond_18

    .line 728
    .line 729
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 730
    .line 731
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    const-string v5, "appvc"

    .line 736
    .line 737
    invoke-virtual {v0, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 738
    .line 739
    .line 740
    const-string v3, "appvn"

    .line 741
    .line 742
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 743
    .line 744
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 745
    .line 746
    .line 747
    :cond_18
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    :goto_11
    if-ge v4, v0, :cond_19

    .line 759
    .line 760
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    add-int/lit8 v4, v4, 0x1

    .line 765
    .line 766
    check-cast v2, Ljava/lang/String;

    .line 767
    .line 768
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzg:Landroid/content/Context;

    .line 769
    .line 770
    new-instance v5, Lcom/google/android/gms/ads/internal/util/client/zzu;

    .line 771
    .line 772
    const/4 v6, 0x0

    .line 773
    invoke-direct {v5, v3, v6}, Lcom/google/android/gms/ads/internal/util/client/zzu;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbyp;->zzi:Ljava/util/concurrent/ExecutorService;

    .line 777
    .line 778
    new-instance v8, Lcom/google/android/gms/internal/ads/zzbyo;

    .line 779
    .line 780
    invoke-direct {v8, v5, v2}, Lcom/google/android/gms/internal/ads/zzbyo;-><init>(Lcom/google/android/gms/ads/internal/util/client/zzu;Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-interface {v3, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 784
    .line 785
    .line 786
    goto :goto_11

    .line 787
    :cond_19
    :goto_12
    return-void
.end method
