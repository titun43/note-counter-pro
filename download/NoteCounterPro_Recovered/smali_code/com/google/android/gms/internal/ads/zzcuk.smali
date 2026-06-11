.class public final Lcom/google/android/gms/internal/ads/zzcuk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcue;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzcue;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcuk;->zza:Lcom/google/android/gms/internal/ads/zzcue;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcuk;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzcue;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzcuk;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcuk;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzcuk;-><init>(Lcom/google/android/gms/internal/ads/zzcue;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method

.method public static zzd(Lcom/google/android/gms/internal/ads/zzcue;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzctx;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcua;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzctx;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcuk;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcub;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcub;->zza()Lcom/google/android/gms/internal/ads/zzcua;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcuk;->zza()Lcom/google/android/gms/internal/ads/zzctx;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
