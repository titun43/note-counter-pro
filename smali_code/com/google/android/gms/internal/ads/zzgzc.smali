.class final Lcom/google/android/gms/internal/ads/zzgzc;
.super Lcom/google/android/gms/internal/ads/zzgyq;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzgzb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgub;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzgyq;-><init>(Lcom/google/android/gms/internal/ads/zzgub;ZZ)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgza;

    .line 6
    .line 7
    invoke-direct {p1, p0, p4, p3}, Lcom/google/android/gms/internal/ads/zzgza;-><init>(Lcom/google/android/gms/internal/ads/zzgzc;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgzc;->zza:Lcom/google/android/gms/internal/ads/zzgzb;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgyq;->zze()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final zzA(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzgyq;->zzA(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgzc;->zza:Lcom/google/android/gms/internal/ads/zzgzb;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final synthetic zzD(Lcom/google/android/gms/internal/ads/zzgzb;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgzc;->zza:Lcom/google/android/gms/internal/ads/zzgzb;

    return-void
.end method

.method public final zzi()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgzc;->zza:Lcom/google/android/gms/internal/ads/zzgzb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgzv;->zzh()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final zzw(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final zzx()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgzc;->zza:Lcom/google/android/gms/internal/ads/zzgzb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgzb;->zze()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
