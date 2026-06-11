.class public final Lcom/google/android/gms/internal/ads/zzcvx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdeg;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzdgl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdeg;Lcom/google/android/gms/internal/ads/zzdgl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcvx;->zza:Lcom/google/android/gms/internal/ads/zzdeg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcvx;->zzb:Lcom/google/android/gms/internal/ads/zzdgl;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzdeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcvx;->zza:Lcom/google/android/gms/internal/ads/zzdeg;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzdje;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcvx;->zzb:Lcom/google/android/gms/internal/ads/zzdgl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdje;

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 8
    .line 9
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzdje;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 10
    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdje;

    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcvw;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzcvw;-><init>(Lcom/google/android/gms/internal/ads/zzcvx;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdje;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzdgl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcvx;->zzb:Lcom/google/android/gms/internal/ads/zzdgl;

    return-object v0
.end method
