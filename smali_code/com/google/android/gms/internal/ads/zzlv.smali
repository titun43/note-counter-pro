.class final synthetic Lcom/google/android/gms/internal/ads/zzlv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzlx;

.field private final synthetic zzb:Landroid/util/Pair;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzwg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzlx;Landroid/util/Pair;Lcom/google/android/gms/internal/ads/zzwg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlv;->zza:Lcom/google/android/gms/internal/ads/zzlx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzlv;->zzb:Landroid/util/Pair;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzlv;->zzc:Lcom/google/android/gms/internal/ads/zzwg;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlv;->zzb:Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/android/gms/internal/ads/zzwk;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzlv;->zza:Lcom/google/android/gms/internal/ads/zzlx;

    .line 16
    .line 17
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzlx;->zza:Lcom/google/android/gms/internal/ads/zzmc;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzmc;->zzj()Lcom/google/android/gms/internal/ads/zzmx;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzlv;->zzc:Lcom/google/android/gms/internal/ads/zzwg;

    .line 24
    .line 25
    invoke-interface {v2, v1, v0, v3}, Lcom/google/android/gms/internal/ads/zzwv;->zzam(ILcom/google/android/gms/internal/ads/zzwk;Lcom/google/android/gms/internal/ads/zzwg;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
