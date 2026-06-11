.class public final Lcom/google/android/gms/internal/ads/zzddv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzddv;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzddv;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzddv;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzddv;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzddv;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzddv;-><init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzddv;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zziks;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziks;->zzc()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzddv;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    .line 10
    .line 11
    check-cast v1, Lcom/google/android/gms/internal/ads/zzcww;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcww;->zza()Lcom/google/android/gms/internal/ads/zzfir;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzddv;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    .line 18
    .line 19
    check-cast v2, Lcom/google/android/gms/internal/ads/zzcwz;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcwz;->zza()Lcom/google/android/gms/internal/ads/zzfjc;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lcom/google/android/gms/internal/ads/zzddu;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzddu;-><init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfjc;)V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method
