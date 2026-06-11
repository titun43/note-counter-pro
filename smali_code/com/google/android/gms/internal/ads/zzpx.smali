.class public final Lcom/google/android/gms/internal/ads/zzpx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzpw;

.field private final zzc:Landroid/os/Handler;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzpt;

.field private final zze:Landroid/content/BroadcastReceiver;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzpu;

.field private zzg:Lcom/google/android/gms/internal/ads/zzps;

.field private zzh:Landroid/media/AudioDeviceInfo;

.field private zzi:Lcom/google/android/gms/internal/ads/zzd;

.field private zzj:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpw;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)V
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
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzb:Lcom/google/android/gms/internal/ads/zzpw;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfj;->zze()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    new-instance p3, Landroid/os/Handler;

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 24
    .line 25
    .line 26
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzc:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance p2, Lcom/google/android/gms/internal/ads/zzpt;

    .line 29
    .line 30
    invoke-direct {p2, p0, p4}, Lcom/google/android/gms/internal/ads/zzpt;-><init>(Lcom/google/android/gms/internal/ads/zzpx;[B)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzd:Lcom/google/android/gms/internal/ads/zzpt;

    .line 34
    .line 35
    new-instance p2, Lcom/google/android/gms/internal/ads/zzpv;

    .line 36
    .line 37
    invoke-direct {p2, p0, p4}, Lcom/google/android/gms/internal/ads/zzpv;-><init>(Lcom/google/android/gms/internal/ads/zzpx;[B)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpx;->zze:Landroid/content/BroadcastReceiver;

    .line 41
    .line 42
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzps;->zzc()Landroid/net/Uri;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    new-instance p4, Lcom/google/android/gms/internal/ads/zzpu;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-direct {p4, p0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzpu;-><init>(Lcom/google/android/gms/internal/ads/zzpx;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzf:Lcom/google/android/gms/internal/ads/zzpu;

    .line 58
    .line 59
    return-void
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzps;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzj:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzg:Lcom/google/android/gms/internal/ads/zzps;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzps;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzg:Lcom/google/android/gms/internal/ads/zzps;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzb:Lcom/google/android/gms/internal/ads/zzpw;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzpw;->zza(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzps;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpx;->zzk(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    .line 15
    .line 16
    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzps;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpx;->zzk(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzc(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzps;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpx;->zzk(Lcom/google/android/gms/internal/ads/zzps;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzps;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzj:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzg:Lcom/google/android/gms/internal/ads/zzps;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzj:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzf:Lcom/google/android/gms/internal/ads/zzpu;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpu;->zza()V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzd:Lcom/google/android/gms/internal/ads/zzpt;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzc:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v1, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zze:Landroid/content/BroadcastReceiver;

    .line 35
    .line 36
    new-instance v3, Landroid/content/IntentFilter;

    .line 37
    .line 38
    const-string v4, "android.media.action.HDMI_AUDIO_PLUG"

    .line 39
    .line 40
    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzps;->zzb(Landroid/content/Context;Landroid/content/Intent;Lcom/google/android/gms/internal/ads/zzd;Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzps;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzg:Lcom/google/android/gms/internal/ads/zzps;

    .line 57
    .line 58
    return-object v0
.end method

.method public final zze()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzj:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzg:Lcom/google/android/gms/internal/ads/zzps;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzd:Lcom/google/android/gms/internal/ads/zzpt;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zze:Landroid/content/BroadcastReceiver;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzf:Lcom/google/android/gms/internal/ads/zzpu;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzpu;->zzb()V

    .line 30
    .line 31
    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzj:Z

    .line 34
    .line 35
    return-void
.end method

.method public final synthetic zzf(Lcom/google/android/gms/internal/ads/zzps;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzpx;->zzk(Lcom/google/android/gms/internal/ads/zzps;)V

    return-void
.end method

.method public final synthetic zzg()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zza:Landroid/content/Context;

    return-object v0
.end method

.method public final synthetic zzh()Landroid/media/AudioDeviceInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    return-object v0
.end method

.method public final synthetic zzi(Landroid/media/AudioDeviceInfo;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzh:Landroid/media/AudioDeviceInfo;

    return-void
.end method

.method public final synthetic zzj()Lcom/google/android/gms/internal/ads/zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpx;->zzi:Lcom/google/android/gms/internal/ads/zzd;

    return-object v0
.end method
