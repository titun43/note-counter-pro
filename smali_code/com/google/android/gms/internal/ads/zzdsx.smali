.class public final Lcom/google/android/gms/internal/ads/zzdsx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzboh;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzblw;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdtk;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzika;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdor;Lcom/google/android/gms/internal/ads/zzdoh;Lcom/google/android/gms/internal/ads/zzdtk;Lcom/google/android/gms/internal/ads/zzika;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdoh;->zzS()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzdor;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzblw;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zza:Lcom/google/android/gms/internal/ads/zzblw;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zzb:Lcom/google/android/gms/internal/ads/zzdtk;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zzc:Lcom/google/android/gms/internal/ads/zzika;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    .line 1
    const-string p1, "asset"

    .line 2
    .line 3
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zza:Lcom/google/android/gms/internal/ads/zzblw;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zzc:Lcom/google/android/gms/internal/ads/zzika;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzika;->zzb()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/google/android/gms/internal/ads/zzblm;

    .line 18
    .line 19
    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzblw;->zze(Lcom/google/android/gms/internal/ads/zzblm;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p2

    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x28

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v0, "Failed to call onCustomClick for asset "

    .line 40
    .line 41
    const-string v2, "."

    .line 42
    .line 43
    invoke-static {v1, v0, p1, v2}, Landroidx/fragment/app/h1;->b(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 48
    .line 49
    invoke-static {p1, p2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzj(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zza:Lcom/google/android/gms/internal/ads/zzblw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdsx;->zzb:Lcom/google/android/gms/internal/ads/zzdtk;

    .line 7
    .line 8
    const-string v1, "/nativeAdCustomClick"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzdtk;->zzd(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzboh;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
