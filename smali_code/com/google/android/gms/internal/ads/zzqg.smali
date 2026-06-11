.class public final Lcom/google/android/gms/internal/ads/zzqg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Z

.field private zzb:Z

.field private zzc:Z

.field private zzd:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzd:I

    return-void
.end method


# virtual methods
.method public final zza(Z)Lcom/google/android/gms/internal/ads/zzqg;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzqg;->zza:Z

    return-object p0
.end method

.method public final zzb(Z)Lcom/google/android/gms/internal/ads/zzqg;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzb:Z

    return-object p0
.end method

.method public final zzc(Z)Lcom/google/android/gms/internal/ads/zzqg;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzc:Z

    return-object p0
.end method

.method public final zzd(I)Lcom/google/android/gms/internal/ads/zzqg;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzd:I

    return-object p0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzqh;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zza:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzb:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzc:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzqh;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzqh;-><init>(Lcom/google/android/gms/internal/ads/zzqg;[B)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final synthetic zzf()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zza:Z

    return v0
.end method

.method public final synthetic zzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzb:Z

    return v0
.end method

.method public final synthetic zzh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzc:Z

    return v0
.end method

.method public final synthetic zzi()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzqg;->zzd:I

    return v0
.end method
