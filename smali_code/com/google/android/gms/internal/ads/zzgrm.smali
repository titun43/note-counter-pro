.class final synthetic Lcom/google/android/gms/internal/ads/zzgrm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgrq;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgqs;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgqs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zza:Lcom/google/android/gms/internal/ads/zzgqs;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzgrr;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgrm;->zza:Lcom/google/android/gms/internal/ads/zzgqs;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzgqs;->zza(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/zzgqr;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgrj;

    .line 8
    .line 9
    invoke-direct {v1, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzgrj;-><init>(Lcom/google/android/gms/internal/ads/zzgrr;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/ads/zzgqr;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method
