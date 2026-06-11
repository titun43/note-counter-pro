.class final synthetic Lcom/google/android/gms/internal/ads/zzeds;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgyw;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzedt;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbzu;

.field private final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzedt;Lcom/google/android/gms/internal/ads/zzbzu;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeds;->zza:Lcom/google/android/gms/internal/ads/zzedt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeds;->zzb:Lcom/google/android/gms/internal/ads/zzbzu;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzeds;->zzc:I

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)Lj3/a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeds;->zza:Lcom/google/android/gms/internal/ads/zzedt;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeds;->zzb:Lcom/google/android/gms/internal/ads/zzbzu;

    .line 4
    .line 5
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzeds;->zzc:I

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzedt;->zzb(Lcom/google/android/gms/internal/ads/zzbzu;ILjava/lang/Throwable;)Lj3/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
