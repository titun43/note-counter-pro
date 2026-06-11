.class public final Lcom/google/android/gms/internal/ads/zzdau;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdao;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzdao;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdau;->zza:Lcom/google/android/gms/internal/ads/zzdao;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzdao;)Lcom/google/android/gms/internal/ads/zzdau;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdau;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdau;-><init>(Lcom/google/android/gms/internal/ads/zzdao;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdau;->zza:Lcom/google/android/gms/internal/ads/zzdao;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdao;->zzh()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
