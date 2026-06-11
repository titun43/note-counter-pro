.class final Lcom/google/android/gms/ads/internal/client/zzaw;
.super Lcom/google/android/gms/ads/internal/client/zzba;
.source "SourceFile"


# instance fields
.field final synthetic zza:Landroid/widget/FrameLayout;

.field final synthetic zzb:Landroid/widget/FrameLayout;

.field final synthetic zzc:Landroid/content/Context;

.field final synthetic zzd:Lcom/google/android/gms/ads/internal/client/zzaz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaz;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zza:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzb:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzc:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzd:Lcom/google/android/gms/ads/internal/client/zzaz;

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzba;-><init>()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzc:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "native_ad_view_delegate"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaz;->zzm(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzfn;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzfn;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final zzb()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzc:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbhe;->zza(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzmf:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    :try_start_0
    new-instance v1, La3/b;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zza:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    new-instance v3, La3/b;

    .line 32
    .line 33
    invoke-direct {v3, v2}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzb:Landroid/widget/FrameLayout;

    .line 37
    .line 38
    new-instance v4, La3/b;

    .line 39
    .line 40
    invoke-direct {v4, v2}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const-string v2, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"

    .line 44
    .line 45
    sget-object v5, Lcom/google/android/gms/ads/internal/client/zzav;->zza:Lcom/google/android/gms/ads/internal/client/zzav;

    .line 46
    .line 47
    invoke-static {v0, v2, v5}, Lcom/google/android/gms/ads/internal/util/client/zzs;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/zzq;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbkz;

    .line 52
    .line 53
    const v2, 0xf2ea478

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzbkz;->zze(La3/a;La3/a;La3/a;I)Landroid/os/IBinder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbkv;->zzdF(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbkw;

    .line 61
    .line 62
    .line 63
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/ads/internal/util/client/zzr; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-object v0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto :goto_0

    .line 67
    :catch_1
    move-exception v0

    .line 68
    goto :goto_0

    .line 69
    :catch_2
    move-exception v0

    .line 70
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzd:Lcom/google/android/gms/ads/internal/client/zzaz;

    .line 71
    .line 72
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzc:Landroid/content/Context;

    .line 73
    .line 74
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbyp;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbyr;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/client/zzaz;->zzu(Lcom/google/android/gms/internal/ads/zzbyr;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/client/zzaz;->zzt()Lcom/google/android/gms/internal/ads/zzbyr;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "ClientApiBroker.createNativeAdViewDelegate"

    .line 86
    .line 87
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzbyr;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    return-object v0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzd:Lcom/google/android/gms/ads/internal/client/zzaz;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzc:Landroid/content/Context;

    .line 95
    .line 96
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zza:Landroid/widget/FrameLayout;

    .line 97
    .line 98
    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzb:Landroid/widget/FrameLayout;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/zzaz;->zzq()Lcom/google/android/gms/internal/ads/zzbmo;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbmo;->zza(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/ads/zzbkw;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/client/zzcr;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zzb:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/zzaw;->zza:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    new-instance v2, La3/b;

    .line 6
    .line 7
    invoke-direct {v2, v1}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La3/b;

    .line 11
    .line 12
    invoke-direct {v1, v0}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v2, v1}, Lcom/google/android/gms/ads/internal/client/zzcr;->zze(La3/a;La3/a;)Lcom/google/android/gms/internal/ads/zzbkw;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
