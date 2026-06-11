.class public final Lcom/google/android/gms/internal/ads/zzfck;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzgzy;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbfs;Lcom/google/android/gms/internal/ads/zzgzy;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfck;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    return-void
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfcj;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfcj;-><init>(Lcom/google/android/gms/internal/ads/zzfck;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfck;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x2d

    return v0
.end method
