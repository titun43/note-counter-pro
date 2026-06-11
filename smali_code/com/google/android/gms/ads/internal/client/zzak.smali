.class final Lcom/google/android/gms/ads/internal/client/zzak;
.super Lcom/google/android/gms/ads/internal/client/zzba;
.source "SourceFile"


# instance fields
.field final synthetic zza:Landroid/content/Context;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbtt;

.field final synthetic zzc:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaz;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbtt;Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zza:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzbtt;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzc:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzba;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbpr;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbpr;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final zzb()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zza:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, La3/b;

    .line 4
    .line 5
    invoke-direct {v1, v0}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v2, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl"

    .line 9
    .line 10
    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzaj;->zza:Lcom/google/android/gms/ads/internal/client/zzaj;

    .line 11
    .line 12
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/ads/internal/util/client/zzs;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/client/zzq;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbpn;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzbtt;

    .line 19
    .line 20
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbpe;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzc:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    .line 23
    .line 24
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzbpe;-><init>(Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V

    .line 25
    .line 26
    .line 27
    const v4, 0xf2ea478

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzbpn;->zze(La3/a;Lcom/google/android/gms/internal/ads/zzbtt;ILcom/google/android/gms/internal/ads/zzbph;)Lcom/google/android/gms/internal/ads/zzbpk;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/ads/internal/util/client/zzr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object v0

    .line 35
    :catch_0
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/client/zzcr;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zza:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, La3/b;

    .line 4
    .line 5
    invoke-direct {v1, v0}, La3/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbpe;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzc:Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzbpe;-><init>(Lcom/google/android/gms/ads/h5/OnH5AdsEventListener;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzbtt;

    .line 16
    .line 17
    const v3, 0xf2ea478

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v1, v2, v3, v0}, Lcom/google/android/gms/ads/internal/client/zzcr;->zzp(La3/a;Lcom/google/android/gms/internal/ads/zzbtt;ILcom/google/android/gms/internal/ads/zzbph;)Lcom/google/android/gms/internal/ads/zzbpk;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method
