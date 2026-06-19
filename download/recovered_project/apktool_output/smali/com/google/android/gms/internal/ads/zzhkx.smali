.class final synthetic Lcom/google/android/gms/internal/ads/zzhkx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhkz;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzhky;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzhla;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhky;Lcom/google/android/gms/internal/ads/zzhla;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhkx;->zza:Lcom/google/android/gms/internal/ads/zzhky;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhkx;->zzb:Lcom/google/android/gms/internal/ads/zzhla;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzhbi;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhkx;->zza:Lcom/google/android/gms/internal/ads/zzhky;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhbi;->zza()Lcom/google/android/gms/internal/ads/zzhaz;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhkx;->zzb:Lcom/google/android/gms/internal/ads/zzhla;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzhla;->zzb()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzhky;->zzb(Lcom/google/android/gms/internal/ads/zzhaz;Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
