.class final synthetic Lcom/google/android/gms/internal/ads/zzeaj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzeak;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbqn;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeak;Lcom/google/android/gms/internal/ads/zzbqn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeaj;->zza:Lcom/google/android/gms/internal/ads/zzeak;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeaj;->zzb:Lcom/google/android/gms/internal/ads/zzbqn;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeaj;->zzb:Lcom/google/android/gms/internal/ads/zzbqn;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeaj;->zza:Lcom/google/android/gms/internal/ads/zzeak;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeak;->zzd()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbqn;->zzb(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
