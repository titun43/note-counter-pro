.class final synthetic Lcom/google/android/gms/internal/ads/zzeui;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqt;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzeuk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeuk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeui;->zza:Lcom/google/android/gms/internal/ads/zzeuk;

    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeui;->zza:Lcom/google/android/gms/internal/ads/zzeuk;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzeuk;->zza:Lcom/google/android/gms/internal/ads/zzcdu;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Exception;

    .line 6
    .line 7
    const-string v1, "AppSetIdInfoSignal"

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeul;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzeul;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method
