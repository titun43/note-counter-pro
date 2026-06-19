.class public final Lcom/google/android/gms/internal/ads/zzfor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final zza:Ljava/lang/Object;

.field public static zzb:Ljava/lang/Boolean;

.field private static final zzc:Ljava/lang/Object;

.field private static final zzd:Ljava/lang/Object;


# instance fields
.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfov;

.field private zzh:Ljava/lang/String;

.field private zzi:I

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdvm;

.field private final zzk:Ljava/util/List;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzclx;

.field private zzm:Z

.field private final zzn:Lcom/google/android/gms/internal/ads/zzcac;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfor;->zza:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfor;->zzc:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzfor;->zzd:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzdvm;Lcom/google/android/gms/internal/ads/zzehb;Lcom/google/android/gms/internal/ads/zzcac;Lcom/google/android/gms/internal/ads/zzclx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfoy;->zzb()Lcom/google/android/gms/internal/ads/zzfov;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzg:Lcom/google/android/gms/internal/ads/zzfov;

    .line 9
    .line 10
    const-string p4, ""

    .line 11
    .line 12
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzh:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p4, 0x0

    .line 15
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzm:Z

    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfor;->zze:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzj:Lcom/google/android/gms/internal/ads/zzdvm;

    .line 22
    .line 23
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzn:Lcom/google/android/gms/internal/ads/zzcac;

    .line 24
    .line 25
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzl:Lcom/google/android/gms/internal/ads/zzclx;

    .line 26
    .line 27
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkg:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 28
    .line 29
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzk()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzk:Ljava/util/List;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzk:Ljava/util/List;

    .line 57
    .line 58
    return-void
.end method

.method public static zza()Z
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfor;->zza:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfor;->zzb:Ljava/lang/Boolean;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzb:Lcom/google/android/gms/internal/ads/zzbio;

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
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    sput-object v1, Lcom/google/android/gms/internal/ads/zzfor;->zzb:Ljava/lang/Boolean;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Double;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    cmpg-double v1, v3, v1

    .line 46
    .line 47
    if-gez v1, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sput-object v1, Lcom/google/android/gms/internal/ads/zzfor;->zzb:Ljava/lang/Boolean;

    .line 57
    .line 58
    :cond_2
    :goto_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfor;->zzb:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    monitor-exit v0

    .line 65
    return v1

    .line 66
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfor;->zza()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfor;->zzc:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzg:Lcom/google/android/gms/internal/ads/zzfov;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfov;->zza()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_3

    .line 23
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    :try_start_1
    monitor-enter v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzg:Lcom/google/android/gms/internal/ads/zzfov;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/google/android/gms/internal/ads/zzfoy;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhzw;->zzaN()[B

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfov;->zzc()Lcom/google/android/gms/internal/ads/zzfov;

    .line 38
    .line 39
    .line 40
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    :try_start_3
    new-instance v3, Lcom/google/android/gms/internal/ads/zzegy;

    .line 42
    .line 43
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzka:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 44
    .line 45
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v4, v0

    .line 54
    check-cast v4, Ljava/lang/String;

    .line 55
    .line 56
    new-instance v6, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v8, "application/x-protobuf"

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    const v5, 0xea60

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzegy;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfor;->zze:Landroid/content/Context;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 73
    .line 74
    iget-object v6, v0, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzn:Lcom/google/android/gms/internal/ads/zzcac;

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeha;

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzeha;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcac;ILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzeha;->zzb(Lcom/google/android/gms/internal/ads/zzegy;)Lcom/google/android/gms/internal/ads/zzegz;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catch_0
    move-exception v0

    .line 93
    goto :goto_0

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 96
    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 97
    :goto_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzecr;

    .line 98
    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    move-object v1, v0

    .line 102
    check-cast v1, Lcom/google/android/gms/internal/ads/zzecr;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzecr;->zza()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const/4 v2, 0x3

    .line 109
    if-eq v1, v2, :cond_2

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    :goto_1
    return-void

    .line 113
    :cond_3
    :goto_2
    const-string v1, "CuiMonitor.sendCuiPing"

    .line 114
    .line 115
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_3
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 124
    throw v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfoh;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcei;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfoq;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzfoq;-><init>(Lcom/google/android/gms/internal/ads/zzfor;Lcom/google/android/gms/internal/ads/zzfoh;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzgzy;->zza(Ljava/lang/Runnable;)Lj3/a;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzfoh;)V
    .locals 8

    .line 1
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfor;->zzd:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v7

    .line 4
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzm:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit v7

    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :catchall_0
    move-exception v0

    .line 12
    goto/16 :goto_6

    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzm:Z

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfor;->zza()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zze:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zzs;->zzt(Landroid/content/Context;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzh:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_1
    move-exception v0

    .line 41
    :goto_0
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "CuiMonitor.gettingAppIdFromManifest"

    .line 46
    .line 47
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    sget-object v0, Lt2/f;->b:Lt2/f;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfor;->zze:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lt2/f;->a(Landroid/content/Context;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzi:I

    .line 62
    .line 63
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkb:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 64
    .line 65
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zznp:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 80
    .line 81
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 98
    .line 99
    move-object v4, v2

    .line 100
    int-to-long v2, v0

    .line 101
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    move-object v0, v4

    .line 104
    move-wide v4, v2

    .line 105
    move-object v1, p0

    .line 106
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    int-to-long v2, v0

    .line 113
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 114
    .line 115
    move-wide v4, v2

    .line 116
    move-object v0, v1

    .line 117
    move-object v1, p0

    .line 118
    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 119
    .line 120
    .line 121
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkh:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 122
    .line 123
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzl:Lcom/google/android/gms/internal/ads/zzclx;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzclx;->zza()V

    .line 142
    .line 143
    .line 144
    :cond_3
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfor;->zza()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    goto/16 :goto_5

    .line 152
    .line 153
    :cond_4
    if-eqz p1, :cond_9

    .line 154
    .line 155
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfor;->zzc:Ljava/lang/Object;

    .line 156
    .line 157
    monitor-enter v2

    .line 158
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzg:Lcom/google/android/gms/internal/ads/zzfov;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfov;->zza()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzkc:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 165
    .line 166
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-lt v3, v4, :cond_5

    .line 181
    .line 182
    monitor-exit v2

    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :catchall_1
    move-exception v0

    .line 186
    goto/16 :goto_4

    .line 187
    .line 188
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfou;->zza()Lcom/google/android/gms/internal/ads/zzfos;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzm()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzv(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzb()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zza(Z)Lcom/google/android/gms/internal/ads/zzfos;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zza()J

    .line 207
    .line 208
    .line 209
    move-result-wide v4

    .line 210
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzfos;->zzb(J)Lcom/google/android/gms/internal/ads/zzfos;

    .line 211
    .line 212
    .line 213
    const/4 v4, 0x3

    .line 214
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzw(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 215
    .line 216
    .line 217
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzf:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 218
    .line 219
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 222
    .line 223
    .line 224
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzh:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 227
    .line 228
    .line 229
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 230
    .line 231
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzf(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 232
    .line 233
    .line 234
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 235
    .line 236
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzg(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzo()I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzx(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzc()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzi(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 251
    .line 252
    .line 253
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzi:I

    .line 254
    .line 255
    int-to-long v4, v4

    .line 256
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzfos;->zzj(J)Lcom/google/android/gms/internal/ads/zzfos;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzn()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzy(I)Lcom/google/android/gms/internal/ads/zzfos;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzd()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zze()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzf()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 285
    .line 286
    .line 287
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzj:Lcom/google/android/gms/internal/ads/zzdvm;

    .line 288
    .line 289
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzf()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzdvm;->zzd(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzg()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzh()Lcom/google/android/gms/internal/ads/zzfot;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzs(Lcom/google/android/gms/internal/ads/zzfot;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzk()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzi()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzp(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzj()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzq(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfoh;->zzl()J

    .line 336
    .line 337
    .line 338
    move-result-wide v4

    .line 339
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzfos;->zzc(J)Lcom/google/android/gms/internal/ads/zzfos;

    .line 340
    .line 341
    .line 342
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzkg:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 343
    .line 344
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    check-cast v4, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_6

    .line 359
    .line 360
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzk:Ljava/util/List;

    .line 361
    .line 362
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 363
    .line 364
    .line 365
    :cond_6
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzkh:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 366
    .line 367
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    check-cast v4, Ljava/lang/Boolean;

    .line 376
    .line 377
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_8

    .line 382
    .line 383
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfor;->zzl:Lcom/google/android/gms/internal/ads/zzclx;

    .line 384
    .line 385
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzclx;->zzd()Lcom/google/android/gms/internal/ads/zziff;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzclx;->zzc()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    if-eqz v5, :cond_7

    .line 394
    .line 395
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzfos;->zzt(Lcom/google/android/gms/internal/ads/zziff;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 396
    .line 397
    .line 398
    :cond_7
    if-eqz v4, :cond_8

    .line 399
    .line 400
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfos;->zzu(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfos;

    .line 401
    .line 402
    .line 403
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfox;->zza()Lcom/google/android/gms/internal/ads/zzfow;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzfow;->zza(Lcom/google/android/gms/internal/ads/zzfos;)Lcom/google/android/gms/internal/ads/zzfow;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzfov;->zzb(Lcom/google/android/gms/internal/ads/zzfow;)Lcom/google/android/gms/internal/ads/zzfov;

    .line 411
    .line 412
    .line 413
    monitor-exit v2

    .line 414
    goto :goto_5

    .line 415
    :goto_4
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 416
    throw v0

    .line 417
    :cond_9
    :goto_5
    return-void

    .line 418
    :goto_6
    :try_start_4
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 419
    throw v0
.end method
