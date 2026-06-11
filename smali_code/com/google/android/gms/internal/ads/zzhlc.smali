.class public final Lcom/google/android/gms/internal/ads/zzhlc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhlg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhye;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhqf;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzhqf;Lcom/google/android/gms/internal/ads/zzhye;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlc;->zzb:Lcom/google/android/gms/internal/ads/zzhqf;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhlc;->zza:Lcom/google/android/gms/internal/ads/zzhye;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzhqf;)Lcom/google/android/gms/internal/ads/zzhlc;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhlc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhqf;->zza()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhln;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhye;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzhlc;-><init>(Lcom/google/android/gms/internal/ads/zzhqf;Lcom/google/android/gms/internal/ads/zzhye;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzhqf;)Lcom/google/android/gms/internal/ads/zzhlc;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhlc;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhqf;->zza()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhln;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhye;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzhlc;-><init>(Lcom/google/android/gms/internal/ads/zzhqf;Lcom/google/android/gms/internal/ads/zzhye;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/ads/zzhqf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlc;->zzb:Lcom/google/android/gms/internal/ads/zzhqf;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzhye;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlc;->zza:Lcom/google/android/gms/internal/ads/zzhye;

    return-object v0
.end method
