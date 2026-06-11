.class final synthetic Lcom/google/android/gms/internal/ads/zzws;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzdr;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzwv;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdr;Lcom/google/android/gms/internal/ads/zzwv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzws;->zza:Lcom/google/android/gms/internal/ads/zzdr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzws;->zzb:Lcom/google/android/gms/internal/ads/zzwv;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzws;->zza:Lcom/google/android/gms/internal/ads/zzdr;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzws;->zzb:Lcom/google/android/gms/internal/ads/zzwv;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzdr;->zza(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
