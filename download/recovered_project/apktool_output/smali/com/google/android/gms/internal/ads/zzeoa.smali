.class public final Lcom/google/android/gms/internal/ads/zzeoa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzenr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzenr;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeoa;->zza:Lcom/google/android/gms/internal/ads/zzenr;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzenr;)Lcom/google/android/gms/internal/ads/zzeoa;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeoa;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzeoa;-><init>(Lcom/google/android/gms/internal/ads/zzenr;)V

    return-object v0
.end method


# virtual methods
.method public final zzb(Lx2/b;Lcom/google/android/gms/internal/ads/zzent;Lcom/google/android/gms/internal/ads/zzekl;Lcom/google/android/gms/internal/ads/zzfqk;)Lcom/google/android/gms/internal/ads/zzenr;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeoa;->zza:Lcom/google/android/gms/internal/ads/zzenr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzenr;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzenr;-><init>(Lx2/b;Lcom/google/android/gms/internal/ads/zzent;Lcom/google/android/gms/internal/ads/zzekl;Lcom/google/android/gms/internal/ads/zzfqk;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
