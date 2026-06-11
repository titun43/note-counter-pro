.class final Lcom/google/android/gms/internal/ads/zzcwp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgzl;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzgzl;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcwu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzcwu;Lcom/google/android/gms/internal/ads/zzgzl;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zza:Lcom/google/android/gms/internal/ads/zzgzl;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zzb:Lcom/google/android/gms/internal/ads/zzcwu;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zzb:Lcom/google/android/gms/internal/ads/zzcwu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcwu;->zzf()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zza:Lcom/google/android/gms/internal/ads/zzgzl;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzl;->zza(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zzb:Lcom/google/android/gms/internal/ads/zzcwu;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcwf;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcwu;->zzf()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcwp;->zza:Lcom/google/android/gms/internal/ads/zzgzl;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzl;->zzb(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
