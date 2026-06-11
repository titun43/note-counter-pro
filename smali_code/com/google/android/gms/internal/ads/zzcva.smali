.class public final Lcom/google/android/gms/internal/ads/zzcva;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcva;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcva;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcva;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzcva;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcva;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzcva;-><init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcuz;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcva;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcuv;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcuv;->zza()Lcom/google/android/gms/internal/ads/zzcjl;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcva;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    .line 10
    .line 11
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/google/android/gms/internal/ads/zzdxz;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcva;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    .line 18
    .line 19
    check-cast v2, Lcom/google/android/gms/internal/ads/zzcww;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcww;->zza()Lcom/google/android/gms/internal/ads/zzfir;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lcom/google/android/gms/internal/ads/zzcuz;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcuz;-><init>(Lcom/google/android/gms/internal/ads/zzcjl;Lcom/google/android/gms/internal/ads/zzdxz;Lcom/google/android/gms/internal/ads/zzfir;)V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcva;->zza()Lcom/google/android/gms/internal/ads/zzcuz;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
