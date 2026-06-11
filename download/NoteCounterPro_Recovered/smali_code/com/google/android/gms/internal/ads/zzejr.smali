.class final synthetic Lcom/google/android/gms/internal/ads/zzejr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfsv;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfsu;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfsv;Lcom/google/android/gms/internal/ads/zzfsu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzejr;->zza:Lcom/google/android/gms/internal/ads/zzfsv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzejr;->zzb:Lcom/google/android/gms/internal/ads/zzfsu;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejr;->zza:Lcom/google/android/gms/internal/ads/zzfsv;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzejr;->zzb:Lcom/google/android/gms/internal/ads/zzfsu;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfsv;->zzb(Lcom/google/android/gms/internal/ads/zzfsu;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
